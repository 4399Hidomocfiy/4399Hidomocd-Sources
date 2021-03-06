package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.design.C0072R;
import android.support.p009v4.content.ContextCompat;
import android.support.p009v4.graphics.drawable.DrawableCompat;
import android.support.p009v4.view.ViewCompat;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;

class FloatingActionButtonImpl {
    static final Interpolator ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final int[] EMPTY_STATE_SET = new int[0];
    static final int[] ENABLED_STATE_SET = {16842910};
    static final int[] FOCUSED_ENABLED_STATE_SET = {16842908, 16842910};
    static final long PRESSED_ANIM_DELAY = 100;
    static final long PRESSED_ANIM_DURATION = 100;
    static final int[] PRESSED_ENABLED_STATE_SET = {16842919, 16842910};
    static final int SHOW_HIDE_ANIM_DURATION = 200;
    int mAnimState = 0;
    CircularBorderDrawable mBorderDrawable;
    Drawable mContentBackground;
    float mElevation;
    private ViewTreeObserver.OnPreDrawListener mPreDrawListener;
    float mPressedTranslationZ;
    Drawable mRippleDrawable;
    private float mRotation;
    ShadowDrawableWrapper mShadowDrawable;
    final ShadowViewDelegate mShadowViewDelegate;
    Drawable mShapeDrawable;
    private final StateListAnimator mStateListAnimator;
    private final Rect mTmpRect = new Rect();
    final VisibilityAwareImageButton mView;

    private class DisabledElevationAnimation extends ShadowAnimatorImpl {
        DisabledElevationAnimation() {
            super();
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
            return 0.0f;
        }
    }

    private class ElevateToTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToTranslationZAnimation() {
            super();
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.mElevation + floatingActionButtonImpl.mPressedTranslationZ;
        }
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    private class ResetElevationAnimation extends ShadowAnimatorImpl {
        ResetElevationAnimation() {
            super();
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.mElevation;
        }
    }

    private abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private float mShadowSizeEnd;
        private float mShadowSizeStart;
        private boolean mValidValues;

        private ShadowAnimatorImpl() {
        }

        /* access modifiers changed from: protected */
        public abstract float getTargetShadowSize();

        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.mShadowDrawable.setShadowSize(this.mShadowSizeEnd);
            this.mValidValues = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.mValidValues) {
                this.mShadowSizeStart = FloatingActionButtonImpl.this.mShadowDrawable.getShadowSize();
                this.mShadowSizeEnd = getTargetShadowSize();
                this.mValidValues = true;
            }
            ShadowDrawableWrapper shadowDrawableWrapper = FloatingActionButtonImpl.this.mShadowDrawable;
            float f = this.mShadowSizeStart;
            shadowDrawableWrapper.setShadowSize(f + ((this.mShadowSizeEnd - f) * valueAnimator.getAnimatedFraction()));
        }
    }

    FloatingActionButtonImpl(VisibilityAwareImageButton visibilityAwareImageButton, ShadowViewDelegate shadowViewDelegate) {
        this.mView = visibilityAwareImageButton;
        this.mShadowViewDelegate = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.mStateListAnimator = stateListAnimator;
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createAnimator(new ElevateToTranslationZAnimation()));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createAnimator(new ElevateToTranslationZAnimation()));
        stateListAnimator.addState(ENABLED_STATE_SET, createAnimator(new ResetElevationAnimation()));
        stateListAnimator.addState(EMPTY_STATE_SET, createAnimator(new DisabledElevationAnimation()));
        this.mRotation = visibilityAwareImageButton.getRotation();
    }

    private ValueAnimator createAnimator(ShadowAnimatorImpl shadowAnimatorImpl) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(ANIM_INTERPOLATOR);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private static ColorStateList createColorStateList(int i) {
        return new ColorStateList(new int[][]{FOCUSED_ENABLED_STATE_SET, PRESSED_ENABLED_STATE_SET, new int[0]}, new int[]{i, i, 0});
    }

    private void ensurePreDrawListener() {
        if (this.mPreDrawListener == null) {
            this.mPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                /* class android.support.design.widget.FloatingActionButtonImpl.ViewTreeObserver$OnPreDrawListenerC01153 */

                public boolean onPreDraw() {
                    FloatingActionButtonImpl.this.onPreDraw();
                    return true;
                }
            };
        }
    }

    private boolean shouldAnimateVisibilityChange() {
        return ViewCompat.isLaidOut(this.mView) && !this.mView.isInEditMode();
    }

    private void updateFromViewRotation() {
        int i;
        VisibilityAwareImageButton visibilityAwareImageButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.mRotation % 90.0f != 0.0f) {
                i = 1;
                if (this.mView.getLayerType() != 1) {
                    visibilityAwareImageButton = this.mView;
                }
            } else if (this.mView.getLayerType() != 0) {
                visibilityAwareImageButton = this.mView;
                i = 0;
            }
            visibilityAwareImageButton.setLayerType(i, null);
        }
        ShadowDrawableWrapper shadowDrawableWrapper = this.mShadowDrawable;
        if (shadowDrawableWrapper != null) {
            shadowDrawableWrapper.setRotation(-this.mRotation);
        }
        CircularBorderDrawable circularBorderDrawable = this.mBorderDrawable;
        if (circularBorderDrawable != null) {
            circularBorderDrawable.setRotation(-this.mRotation);
        }
    }

    /* access modifiers changed from: package-private */
    public CircularBorderDrawable createBorderDrawable(int i, ColorStateList colorStateList) {
        Context context = this.mView.getContext();
        CircularBorderDrawable newCircularDrawable = newCircularDrawable();
        newCircularDrawable.setGradientColors(ContextCompat.getColor(context, C0072R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, C0072R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, C0072R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, C0072R.color.design_fab_stroke_end_outer_color));
        newCircularDrawable.setBorderWidth((float) i);
        newCircularDrawable.setBorderTint(colorStateList);
        return newCircularDrawable;
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable createShapeDrawable() {
        GradientDrawable newGradientDrawableForShape = newGradientDrawableForShape();
        newGradientDrawableForShape.setShape(1);
        newGradientDrawableForShape.setColor(-1);
        return newGradientDrawableForShape;
    }

    /* access modifiers changed from: package-private */
    public final Drawable getContentBackground() {
        return this.mContentBackground;
    }

    /* access modifiers changed from: package-private */
    public float getElevation() {
        return this.mElevation;
    }

    /* access modifiers changed from: package-private */
    public void getPadding(Rect rect) {
        this.mShadowDrawable.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void hide(final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        if (!isOrWillBeHidden()) {
            this.mView.animate().cancel();
            if (shouldAnimateVisibilityChange()) {
                this.mAnimState = 1;
                this.mView.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {
                    /* class android.support.design.widget.FloatingActionButtonImpl.C01131 */
                    private boolean mCancelled;

                    public void onAnimationCancel(Animator animator) {
                        this.mCancelled = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                        floatingActionButtonImpl.mAnimState = 0;
                        if (!this.mCancelled) {
                            VisibilityAwareImageButton visibilityAwareImageButton = floatingActionButtonImpl.mView;
                            boolean z = z;
                            visibilityAwareImageButton.internalSetVisibility(z ? 8 : 4, z);
                            InternalVisibilityChangedListener internalVisibilityChangedListener = internalVisibilityChangedListener;
                            if (internalVisibilityChangedListener != null) {
                                internalVisibilityChangedListener.onHidden();
                            }
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        FloatingActionButtonImpl.this.mView.internalSetVisibility(0, z);
                        this.mCancelled = false;
                    }
                });
                return;
            }
            this.mView.internalSetVisibility(z ? 8 : 4, z);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onHidden();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isOrWillBeHidden() {
        return this.mView.getVisibility() == 0 ? this.mAnimState == 1 : this.mAnimState != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean isOrWillBeShown() {
        return this.mView.getVisibility() != 0 ? this.mAnimState == 2 : this.mAnimState != 1;
    }

    /* access modifiers changed from: package-private */
    public void jumpDrawableToCurrentState() {
        this.mStateListAnimator.jumpToCurrentState();
    }

    /* access modifiers changed from: package-private */
    public CircularBorderDrawable newCircularDrawable() {
        return new CircularBorderDrawable();
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable newGradientDrawableForShape() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: package-private */
    public void onAttachedToWindow() {
        if (requirePreDrawListener()) {
            ensurePreDrawListener();
            this.mView.getViewTreeObserver().addOnPreDrawListener(this.mPreDrawListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void onCompatShadowChanged() {
    }

    /* access modifiers changed from: package-private */
    public void onDetachedFromWindow() {
        if (this.mPreDrawListener != null) {
            this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mPreDrawListener);
            this.mPreDrawListener = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void onDrawableStateChanged(int[] iArr) {
        this.mStateListAnimator.setState(iArr);
    }

    /* access modifiers changed from: package-private */
    public void onElevationsChanged(float f, float f2) {
        ShadowDrawableWrapper shadowDrawableWrapper = this.mShadowDrawable;
        if (shadowDrawableWrapper != null) {
            shadowDrawableWrapper.setShadowSize(f, this.mPressedTranslationZ + f);
            updatePadding();
        }
    }

    /* access modifiers changed from: package-private */
    public void onPaddingUpdated(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    public void onPreDraw() {
        float rotation = this.mView.getRotation();
        if (this.mRotation != rotation) {
            this.mRotation = rotation;
            updateFromViewRotation();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean requirePreDrawListener() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundDrawable(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        Drawable wrap = DrawableCompat.wrap(createShapeDrawable());
        this.mShapeDrawable = wrap;
        DrawableCompat.setTintList(wrap, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.mShapeDrawable, mode);
        }
        Drawable wrap2 = DrawableCompat.wrap(createShapeDrawable());
        this.mRippleDrawable = wrap2;
        DrawableCompat.setTintList(wrap2, createColorStateList(i));
        if (i2 > 0) {
            CircularBorderDrawable createBorderDrawable = createBorderDrawable(i2, colorStateList);
            this.mBorderDrawable = createBorderDrawable;
            drawableArr = new Drawable[]{createBorderDrawable, this.mShapeDrawable, this.mRippleDrawable};
        } else {
            this.mBorderDrawable = null;
            drawableArr = new Drawable[]{this.mShapeDrawable, this.mRippleDrawable};
        }
        this.mContentBackground = new LayerDrawable(drawableArr);
        Context context = this.mView.getContext();
        Drawable drawable = this.mContentBackground;
        float radius = this.mShadowViewDelegate.getRadius();
        float f = this.mElevation;
        ShadowDrawableWrapper shadowDrawableWrapper = new ShadowDrawableWrapper(context, drawable, radius, f, f + this.mPressedTranslationZ);
        this.mShadowDrawable = shadowDrawableWrapper;
        shadowDrawableWrapper.setAddPaddingForCorners(false);
        this.mShadowViewDelegate.setBackgroundDrawable(this.mShadowDrawable);
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Drawable drawable = this.mShapeDrawable;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
        CircularBorderDrawable circularBorderDrawable = this.mBorderDrawable;
        if (circularBorderDrawable != null) {
            circularBorderDrawable.setBorderTint(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.mShapeDrawable;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setElevation(float f) {
        if (this.mElevation != f) {
            this.mElevation = f;
            onElevationsChanged(f, this.mPressedTranslationZ);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setPressedTranslationZ(float f) {
        if (this.mPressedTranslationZ != f) {
            this.mPressedTranslationZ = f;
            onElevationsChanged(this.mElevation, f);
        }
    }

    /* access modifiers changed from: package-private */
    public void setRippleColor(int i) {
        Drawable drawable = this.mRippleDrawable;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, createColorStateList(i));
        }
    }

    /* access modifiers changed from: package-private */
    public void show(final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        if (!isOrWillBeShown()) {
            this.mView.animate().cancel();
            if (shouldAnimateVisibilityChange()) {
                this.mAnimState = 2;
                if (this.mView.getVisibility() != 0) {
                    this.mView.setAlpha(0.0f);
                    this.mView.setScaleY(0.0f);
                    this.mView.setScaleX(0.0f);
                }
                this.mView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {
                    /* class android.support.design.widget.FloatingActionButtonImpl.C01142 */

                    public void onAnimationEnd(Animator animator) {
                        FloatingActionButtonImpl.this.mAnimState = 0;
                        InternalVisibilityChangedListener internalVisibilityChangedListener = internalVisibilityChangedListener;
                        if (internalVisibilityChangedListener != null) {
                            internalVisibilityChangedListener.onShown();
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        FloatingActionButtonImpl.this.mView.internalSetVisibility(0, z);
                    }
                });
                return;
            }
            this.mView.internalSetVisibility(0, z);
            this.mView.setAlpha(1.0f);
            this.mView.setScaleY(1.0f);
            this.mView.setScaleX(1.0f);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onShown();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void updatePadding() {
        Rect rect = this.mTmpRect;
        getPadding(rect);
        onPaddingUpdated(rect);
        this.mShadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
