package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0072R;
import android.support.design.widget.CoordinatorLayout;
import android.support.p009v4.math.MathUtils;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    int mActivePointerId;
    private BottomSheetCallback mCallback;
    private final ViewDragHelper.Callback mDragCallback = new ViewDragHelper.Callback() {
        /* class android.support.design.widget.BottomSheetBehavior.C01012 */

        @Override // android.support.p009v4.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // android.support.p009v4.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.clamp(i, bottomSheetBehavior.mMinOffset, bottomSheetBehavior.mHideable ? bottomSheetBehavior.mParentHeight : bottomSheetBehavior.mMaxOffset);
        }

        @Override // android.support.p009v4.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return (bottomSheetBehavior.mHideable ? bottomSheetBehavior.mParentHeight : bottomSheetBehavior.mMaxOffset) - bottomSheetBehavior.mMinOffset;
        }

        @Override // android.support.p009v4.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.setStateInternal(1);
            }
        }

        @Override // android.support.p009v4.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.dispatchOnSlide(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
            if (java.lang.Math.abs(r7 - r4.this$0.mMinOffset) < java.lang.Math.abs(r7 - r4.this$0.mMaxOffset)) goto L_0x0007;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
        @Override // android.support.p009v4.widget.ViewDragHelper.Callback
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r5, float r6, float r7) {
            /*
            // Method dump skipped, instructions count: 104
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.C01012.onViewReleased(android.view.View, float, float):void");
        }

        @Override // android.support.p009v4.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            WeakReference<V> weakReference;
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.mState;
            if (i2 != 1 && !bottomSheetBehavior.mTouchingScrollingChild) {
                return (i2 != 3 || bottomSheetBehavior.mActivePointerId != i || (view2 = bottomSheetBehavior.mNestedScrollingChildRef.get()) == null || !view2.canScrollVertically(-1)) && (weakReference = BottomSheetBehavior.this.mViewRef) != null && weakReference.get() == view;
            }
            return false;
        }
    };
    boolean mHideable;
    private boolean mIgnoreEvents;
    private int mInitialY;
    private int mLastNestedScrollDy;
    int mMaxOffset;
    private float mMaximumVelocity;
    int mMinOffset;
    private boolean mNestedScrolled;
    WeakReference<View> mNestedScrollingChildRef;
    int mParentHeight;
    private int mPeekHeight;
    private boolean mPeekHeightAuto;
    private int mPeekHeightMin;
    private boolean mSkipCollapsed;
    int mState = 4;
    boolean mTouchingScrollingChild;
    private VelocityTracker mVelocityTracker;
    ViewDragHelper mViewDragHelper;
    WeakReference<V> mViewRef;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    /* access modifiers changed from: protected */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class android.support.design.widget.BottomSheetBehavior.SavedState.C01021 */

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // android.support.p009v4.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    /* access modifiers changed from: private */
    public class SettleRunnable implements Runnable {
        private final int mTargetState;
        private final View mView;

        SettleRunnable(View view, int i) {
            this.mView = view;
            this.mTargetState = i;
        }

        public void run() {
            ViewDragHelper viewDragHelper = BottomSheetBehavior.this.mViewDragHelper;
            if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
                BottomSheetBehavior.this.setStateInternal(this.mTargetState);
            } else {
                ViewCompat.postOnAnimation(this.mView, this);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0072R.styleable.BottomSheetBehavior_Layout);
        int i2 = C0072R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i2);
        if (peekValue == null || (i = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i2, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(obtainStyledAttributes.getBoolean(C0072R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(C0072R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.mMaximumVelocity = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private float getYVelocity() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
        return this.mVelocityTracker.getYVelocity(this.mActivePointerId);
    }

    private void reset() {
        this.mActivePointerId = -1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnSlide(int i) {
        BottomSheetCallback bottomSheetCallback;
        float f;
        float f2;
        V v = this.mViewRef.get();
        if (v != null && (bottomSheetCallback = this.mCallback) != null) {
            int i2 = this.mMaxOffset;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.mParentHeight - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - this.mMinOffset);
            }
            bottomSheetCallback.onSlide(v, f / f2);
        }
    }

    /* access modifiers changed from: package-private */
    public View findScrollingChild(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public final int getPeekHeight() {
        if (this.mPeekHeightAuto) {
            return -1;
        }
        return this.mPeekHeight;
    }

    /* access modifiers changed from: package-private */
    public int getPeekHeightMin() {
        return this.mPeekHeightMin;
    }

    public boolean getSkipCollapsed() {
        return this.mSkipCollapsed;
    }

    public final int getState() {
        return this.mState;
    }

    public boolean isHideable() {
        return this.mHideable;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.mIgnoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.mInitialY = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.mNestedScrollingChildRef;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.mInitialY)) {
                this.mActivePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.mTouchingScrollingChild = true;
            }
            this.mIgnoreEvents = this.mActivePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.mInitialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.mTouchingScrollingChild = false;
            this.mActivePointerId = -1;
            if (this.mIgnoreEvents) {
                this.mIgnoreEvents = false;
                return false;
            }
        }
        if (!this.mIgnoreEvents && this.mViewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        View view2 = this.mNestedScrollingChildRef.get();
        return actionMasked == 2 && view2 != null && !this.mIgnoreEvents && this.mState != 1 && !coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.mInitialY) - motionEvent.getY()) > ((float) this.mViewDragHelper.getTouchSlop());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLayoutChild(android.support.design.widget.CoordinatorLayout r6, V r7, int r8) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.onLayoutChild(android.support.design.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.mNestedScrollingChildRef.get() && (this.mState != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        int i3;
        if (view == this.mNestedScrollingChildRef.get()) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                int i5 = this.mMinOffset;
                if (i4 < i5) {
                    iArr[1] = top - i5;
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    i3 = 3;
                } else {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    setStateInternal(1);
                    dispatchOnSlide(v.getTop());
                    this.mLastNestedScrollDy = i2;
                    this.mNestedScrolled = true;
                }
            } else {
                if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.mMaxOffset;
                    if (i4 <= i6 || this.mHideable) {
                        iArr[1] = i2;
                        ViewCompat.offsetTopAndBottom(v, -i2);
                        setStateInternal(1);
                    } else {
                        iArr[1] = top - i6;
                        ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                        i3 = 4;
                    }
                }
                dispatchOnSlide(v.getTop());
                this.mLastNestedScrollDy = i2;
                this.mNestedScrolled = true;
            }
            setStateInternal(i3);
            dispatchOnSlide(v.getTop());
            this.mLastNestedScrollDy = i2;
            this.mNestedScrolled = true;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.mState = i;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.mState);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.mLastNestedScrollDy = 0;
        this.mNestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (java.lang.Math.abs(r4 - r3.mMinOffset) < java.lang.Math.abs(r4 - r3.mMaxOffset)) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopNestedScroll(android.support.design.widget.CoordinatorLayout r4, V r5, android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.onStopNestedScroll(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):void");
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.mState == 1 && actionMasked == 0) {
            return true;
        }
        this.mViewDragHelper.processTouchEvent(motionEvent);
        if (actionMasked == 0) {
            reset();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (actionMasked == 2 && !this.mIgnoreEvents && Math.abs(((float) this.mInitialY) - motionEvent.getY()) > ((float) this.mViewDragHelper.getTouchSlop())) {
            this.mViewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.mIgnoreEvents;
    }

    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.mCallback = bottomSheetCallback;
    }

    public void setHideable(boolean z) {
        this.mHideable = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPeekHeight(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.mPeekHeightAuto
            if (r4 != 0) goto L_0x0015
            r3.mPeekHeightAuto = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.mPeekHeightAuto
            if (r2 != 0) goto L_0x0017
            int r2 = r3.mPeekHeight
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.mPeekHeightAuto = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.mPeekHeight = r1
            int r1 = r3.mParentHeight
            int r1 = r1 - r4
            r3.mMaxOffset = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.mState
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.mViewRef
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.setPeekHeight(int):void");
    }

    public void setSkipCollapsed(boolean z) {
        this.mSkipCollapsed = z;
    }

    public final void setState(final int i) {
        if (i != this.mState) {
            WeakReference<V> weakReference = this.mViewRef;
            if (weakReference != null) {
                final V v = weakReference.get();
                if (v != null) {
                    ViewParent parent = v.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(v)) {
                        startSettlingAnimation(v, i);
                    } else {
                        v.post(new Runnable() {
                            /* class android.support.design.widget.BottomSheetBehavior.RunnableC01001 */

                            public void run() {
                                BottomSheetBehavior.this.startSettlingAnimation(v, i);
                            }
                        });
                    }
                }
            } else if (i == 4 || i == 3 || (this.mHideable && i == 5)) {
                this.mState = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setStateInternal(int i) {
        BottomSheetCallback bottomSheetCallback;
        if (this.mState != i) {
            this.mState = i;
            V v = this.mViewRef.get();
            if (v != null && (bottomSheetCallback = this.mCallback) != null) {
                bottomSheetCallback.onStateChanged(v, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldHide(View view, float f) {
        if (this.mSkipCollapsed) {
            return true;
        }
        return view.getTop() >= this.mMaxOffset && Math.abs((((float) view.getTop()) + (f * HIDE_FRICTION)) - ((float) this.mMaxOffset)) / ((float) this.mPeekHeight) > HIDE_THRESHOLD;
    }

    /* access modifiers changed from: package-private */
    public void startSettlingAnimation(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.mMaxOffset;
        } else if (i == 3) {
            i2 = this.mMinOffset;
        } else if (!this.mHideable || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.mParentHeight;
        }
        if (this.mViewDragHelper.smoothSlideViewTo(view, view.getLeft(), i2)) {
            setStateInternal(2);
            ViewCompat.postOnAnimation(view, new SettleRunnable(view, i));
            return;
        }
        setStateInternal(i);
    }
}
