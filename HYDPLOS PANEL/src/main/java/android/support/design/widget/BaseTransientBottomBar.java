package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0072R;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SnackbarManager;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.p009v4.view.OnApplyWindowInsetsListener;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final int ANIMATION_DURATION = 250;
    static final int ANIMATION_FADE_DURATION = 180;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW = 0;
    private static final boolean USE_OFFSET_API;
    static final Handler sHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class android.support.design.widget.BaseTransientBottomBar.C00851 */

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).showView();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).hideView(message.arg1);
                return true;
            }
        }
    });
    private final AccessibilityManager mAccessibilityManager;
    private List<BaseCallback<B>> mCallbacks;
    private final ContentViewCallback mContentViewCallback;
    private final Context mContext;
    private int mDuration;
    final SnackbarManager.Callback mManagerCallback = new SnackbarManager.Callback() {
        /* class android.support.design.widget.BaseTransientBottomBar.C00903 */

        @Override // android.support.design.widget.SnackbarManager.Callback
        public void dismiss(int i) {
            Handler handler = BaseTransientBottomBar.sHandler;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // android.support.design.widget.SnackbarManager.Callback
        public void show() {
            Handler handler = BaseTransientBottomBar.sHandler;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    };
    private final ViewGroup mTargetParent;
    final SnackbarBaseLayout mView;

    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        public void onDismissed(B b, int i) {
        }

        public void onShown(B b) {
        }
    }

    /* access modifiers changed from: package-private */
    public final class Behavior extends SwipeDismissBehavior<SnackbarBaseLayout> {
        Behavior() {
        }

        @Override // android.support.design.widget.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, SnackbarBaseLayout snackbarBaseLayout, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    SnackbarManager.getInstance().restoreTimeoutIfPaused(BaseTransientBottomBar.this.mManagerCallback);
                }
            } else if (coordinatorLayout.isPointInChildBounds(snackbarBaseLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                SnackbarManager.getInstance().pauseTimeout(BaseTransientBottomBar.this.mManagerCallback);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, (View) snackbarBaseLayout, motionEvent);
        }
    }

    public interface ContentViewCallback {
        void animateContentIn(int i, int i2);

        void animateContentOut(int i, int i2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    /* access modifiers changed from: package-private */
    public interface OnAttachStateChangeListener {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* access modifiers changed from: package-private */
    public interface OnLayoutChangeListener {
        void onLayoutChange(View view, int i, int i2, int i3, int i4);
    }

    /* access modifiers changed from: package-private */
    public static class SnackbarBaseLayout extends FrameLayout {
        private OnAttachStateChangeListener mOnAttachStateChangeListener;
        private OnLayoutChangeListener mOnLayoutChangeListener;

        SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0072R.styleable.SnackbarLayout);
            int i = C0072R.styleable.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                ViewCompat.setElevation(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.mOnAttachStateChangeListener;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewAttachedToWindow(this);
            }
            ViewCompat.requestApplyInsets(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.mOnAttachStateChangeListener;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            OnLayoutChangeListener onLayoutChangeListener = this.mOnLayoutChangeListener;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.onLayoutChange(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(OnAttachStateChangeListener onAttachStateChangeListener) {
            this.mOnAttachStateChangeListener = onAttachStateChangeListener;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
            this.mOnLayoutChangeListener = onLayoutChangeListener;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        USE_OFFSET_API = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (contentViewCallback != null) {
            this.mTargetParent = viewGroup;
            this.mContentViewCallback = contentViewCallback;
            Context context = viewGroup.getContext();
            this.mContext = context;
            ThemeUtils.checkAppCompatTheme(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(C0072R.layout.design_layout_snackbar, viewGroup, false);
            this.mView = snackbarBaseLayout;
            snackbarBaseLayout.addView(view);
            ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
            ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
            ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
            ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new OnApplyWindowInsetsListener() {
                /* class android.support.design.widget.BaseTransientBottomBar.C00892 */

                @Override // android.support.p009v4.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    return windowInsetsCompat;
                }
            });
            this.mAccessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    private void animateViewOut(final int i) {
        if (Build.VERSION.SDK_INT >= 12) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(0, this.mView.getHeight());
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                /* class android.support.design.widget.BaseTransientBottomBar.C008610 */

                public void onAnimationEnd(Animator animator) {
                    BaseTransientBottomBar.this.onViewHidden(i);
                }

                public void onAnimationStart(Animator animator) {
                    BaseTransientBottomBar.this.mContentViewCallback.animateContentOut(0, 180);
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class android.support.design.widget.BaseTransientBottomBar.C008711 */
                private int mPreviousAnimatedIntValue = 0;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (BaseTransientBottomBar.USE_OFFSET_API) {
                        ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.mView, intValue - this.mPreviousAnimatedIntValue);
                    } else {
                        BaseTransientBottomBar.this.mView.setTranslationY((float) intValue);
                    }
                    this.mPreviousAnimatedIntValue = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.mView.getContext(), C0072R.anim.design_snackbar_out);
        loadAnimation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class android.support.design.widget.BaseTransientBottomBar.animationAnimation$AnimationListenerC008812 */

            public void onAnimationEnd(Animation animation) {
                BaseTransientBottomBar.this.onViewHidden(i);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.mView.startAnimation(loadAnimation);
    }

    public B addCallback(BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.mCallbacks == null) {
            this.mCallbacks = new ArrayList();
        }
        this.mCallbacks.add(baseCallback);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void animateViewIn() {
        if (Build.VERSION.SDK_INT >= 12) {
            int height = this.mView.getHeight();
            if (USE_OFFSET_API) {
                ViewCompat.offsetTopAndBottom(this.mView, height);
            } else {
                this.mView.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(height, 0);
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                /* class android.support.design.widget.BaseTransientBottomBar.C00957 */

                public void onAnimationEnd(Animator animator) {
                    BaseTransientBottomBar.this.onViewShown();
                }

                public void onAnimationStart(Animator animator) {
                    BaseTransientBottomBar.this.mContentViewCallback.animateContentIn(70, 180);
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(height) {
                /* class android.support.design.widget.BaseTransientBottomBar.C00968 */
                private int mPreviousAnimatedIntValue;
                final /* synthetic */ int val$viewHeight;

                {
                    this.val$viewHeight = r2;
                    this.mPreviousAnimatedIntValue = r2;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (BaseTransientBottomBar.USE_OFFSET_API) {
                        ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.mView, intValue - this.mPreviousAnimatedIntValue);
                    } else {
                        BaseTransientBottomBar.this.mView.setTranslationY((float) intValue);
                    }
                    this.mPreviousAnimatedIntValue = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.mView.getContext(), C0072R.anim.design_snackbar_in);
        loadAnimation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class android.support.design.widget.BaseTransientBottomBar.animationAnimation$AnimationListenerC00979 */

            public void onAnimationEnd(Animation animation) {
                BaseTransientBottomBar.this.onViewShown();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.mView.startAnimation(loadAnimation);
    }

    public void dismiss() {
        dispatchDismiss(3);
    }

    /* access modifiers changed from: package-private */
    public void dispatchDismiss(int i) {
        SnackbarManager.getInstance().dismiss(this.mManagerCallback, i);
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public View getView() {
        return this.mView;
    }

    /* access modifiers changed from: package-private */
    public final void hideView(int i) {
        if (!shouldAnimate() || this.mView.getVisibility() != 0) {
            onViewHidden(i);
        } else {
            animateViewOut(i);
        }
    }

    public boolean isShown() {
        return SnackbarManager.getInstance().isCurrent(this.mManagerCallback);
    }

    public boolean isShownOrQueued() {
        return SnackbarManager.getInstance().isCurrentOrNext(this.mManagerCallback);
    }

    /* access modifiers changed from: package-private */
    public void onViewHidden(int i) {
        SnackbarManager.getInstance().onDismissed(this.mManagerCallback);
        List<BaseCallback<B>> list = this.mCallbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mCallbacks.get(size).onDismissed(this, i);
            }
        }
        if (Build.VERSION.SDK_INT < 11) {
            this.mView.setVisibility(8);
        }
        ViewParent parent = this.mView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.mView);
        }
    }

    /* access modifiers changed from: package-private */
    public void onViewShown() {
        SnackbarManager.getInstance().onShown(this.mManagerCallback);
        List<BaseCallback<B>> list = this.mCallbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mCallbacks.get(size).onShown(this);
            }
        }
    }

    public B removeCallback(BaseCallback<B> baseCallback) {
        List<BaseCallback<B>> list;
        if (baseCallback == null || (list = this.mCallbacks) == null) {
            return this;
        }
        list.remove(baseCallback);
        return this;
    }

    public B setDuration(int i) {
        this.mDuration = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldAnimate() {
        return !this.mAccessibilityManager.isEnabled();
    }

    public void show() {
        SnackbarManager.getInstance().show(this.mDuration, this.mManagerCallback);
    }

    /* access modifiers changed from: package-private */
    public final void showView() {
        if (this.mView.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                Behavior behavior = new Behavior();
                behavior.setStartAlphaSwipeDistance(0.1f);
                behavior.setEndAlphaSwipeDistance(0.6f);
                behavior.setSwipeDirection(0);
                behavior.setListener(new SwipeDismissBehavior.OnDismissListener() {
                    /* class android.support.design.widget.BaseTransientBottomBar.C00914 */

                    @Override // android.support.design.widget.SwipeDismissBehavior.OnDismissListener
                    public void onDismiss(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar.this.dispatchDismiss(0);
                    }

                    @Override // android.support.design.widget.SwipeDismissBehavior.OnDismissListener
                    public void onDragStateChanged(int i) {
                        if (i == 0) {
                            SnackbarManager.getInstance().restoreTimeoutIfPaused(BaseTransientBottomBar.this.mManagerCallback);
                        } else if (i == 1 || i == 2) {
                            SnackbarManager.getInstance().pauseTimeout(BaseTransientBottomBar.this.mManagerCallback);
                        }
                    }
                });
                layoutParams2.setBehavior(behavior);
                layoutParams2.insetEdge = 80;
            }
            this.mTargetParent.addView(this.mView);
        }
        this.mView.setOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            /* class android.support.design.widget.BaseTransientBottomBar.C00925 */

            @Override // android.support.design.widget.BaseTransientBottomBar.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.support.design.widget.BaseTransientBottomBar.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (BaseTransientBottomBar.this.isShownOrQueued()) {
                    BaseTransientBottomBar.sHandler.post(new Runnable() {
                        /* class android.support.design.widget.BaseTransientBottomBar.C00925.RunnableC00931 */

                        public void run() {
                            BaseTransientBottomBar.this.onViewHidden(3);
                        }
                    });
                }
            }
        });
        if (!ViewCompat.isLaidOut(this.mView)) {
            this.mView.setOnLayoutChangeListener(new OnLayoutChangeListener() {
                /* class android.support.design.widget.BaseTransientBottomBar.C00946 */

                @Override // android.support.design.widget.BaseTransientBottomBar.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.mView.setOnLayoutChangeListener(null);
                    if (BaseTransientBottomBar.this.shouldAnimate()) {
                        BaseTransientBottomBar.this.animateViewIn();
                    } else {
                        BaseTransientBottomBar.this.onViewShown();
                    }
                }
            });
        } else if (shouldAnimate()) {
            animateViewIn();
        } else {
            onViewShown();
        }
    }
}
