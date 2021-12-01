package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p009v4.graphics.drawable.DrawableCompat;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

class FloatingActionButtonLollipop extends FloatingActionButtonImpl {
    private InsetDrawable mInsetDrawable;

    static class AlwaysStatefulGradientDrawable extends GradientDrawable {
        AlwaysStatefulGradientDrawable() {
        }

        public boolean isStateful() {
            return true;
        }
    }

    FloatingActionButtonLollipop(VisibilityAwareImageButton visibilityAwareImageButton, ShadowViewDelegate shadowViewDelegate) {
        super(visibilityAwareImageButton, shadowViewDelegate);
    }

    @Override // android.support.design.widget.FloatingActionButtonImpl
    public float getElevation() {
        return this.mView.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void getPadding(Rect rect) {
        if (this.mShadowViewDelegate.isCompatPaddingEnabled()) {
            float radius = this.mShadowViewDelegate.getRadius();
            float elevation = getElevation() + this.mPressedTranslationZ;
            int ceil = (int) Math.ceil((double) ShadowDrawableWrapper.calculateHorizontalPadding(elevation, radius, false));
            int ceil2 = (int) Math.ceil((double) ShadowDrawableWrapper.calculateVerticalPadding(elevation, radius, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void jumpDrawableToCurrentState() {
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public CircularBorderDrawable newCircularDrawable() {
        return new CircularBorderDrawableLollipop();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public GradientDrawable newGradientDrawableForShape() {
        return new AlwaysStatefulGradientDrawable();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void onCompatShadowChanged() {
        updatePadding();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void onDrawableStateChanged(int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void onElevationsChanged(float f, float f2) {
        long j;
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            if (this.mView.isEnabled()) {
                this.mView.setElevation(f);
                if (this.mView.isFocused() || this.mView.isPressed()) {
                    this.mView.setTranslationZ(f2);
                }
            } else {
                this.mView.setElevation(0.0f);
            }
            this.mView.setTranslationZ(0.0f);
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder play = animatorSet.play(ObjectAnimator.ofFloat(this.mView, "elevation", f).setDuration(0L));
            VisibilityAwareImageButton visibilityAwareImageButton = this.mView;
            Property property = View.TRANSLATION_Z;
            play.with(ObjectAnimator.ofFloat(visibilityAwareImageButton, property, f2).setDuration(100L));
            Interpolator interpolator = FloatingActionButtonImpl.ANIM_INTERPOLATOR;
            animatorSet.setInterpolator(interpolator);
            stateListAnimator.addState(FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET, animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.mView, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.mView, property, f2).setDuration(100L));
            animatorSet2.setInterpolator(interpolator);
            stateListAnimator.addState(FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET, animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.mView, "elevation", f).setDuration(0L));
            if (i < 22 || i > 24) {
                j = 100;
            } else {
                VisibilityAwareImageButton visibilityAwareImageButton2 = this.mView;
                j = 100;
                arrayList.add(ObjectAnimator.ofFloat(visibilityAwareImageButton2, property, visibilityAwareImageButton2.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.mView, property, 0.0f).setDuration(j));
            animatorSet3.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet3.setInterpolator(interpolator);
            stateListAnimator.addState(FloatingActionButtonImpl.ENABLED_STATE_SET, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.play(ObjectAnimator.ofFloat(this.mView, "elevation", 0.0f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.mView, property, 0.0f).setDuration(0L));
            animatorSet4.setInterpolator(interpolator);
            stateListAnimator.addState(FloatingActionButtonImpl.EMPTY_STATE_SET, animatorSet4);
            this.mView.setStateListAnimator(stateListAnimator);
        }
        if (this.mShadowViewDelegate.isCompatPaddingEnabled()) {
            updatePadding();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void onPaddingUpdated(Rect rect) {
        ShadowViewDelegate shadowViewDelegate;
        InsetDrawable insetDrawable;
        if (this.mShadowViewDelegate.isCompatPaddingEnabled()) {
            InsetDrawable insetDrawable2 = new InsetDrawable(this.mRippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
            this.mInsetDrawable = insetDrawable2;
            insetDrawable = insetDrawable2;
            shadowViewDelegate = this.mShadowViewDelegate;
        } else {
            ShadowViewDelegate shadowViewDelegate2 = this.mShadowViewDelegate;
            insetDrawable = this.mRippleDrawable;
            shadowViewDelegate = shadowViewDelegate2;
        }
        shadowViewDelegate.setBackgroundDrawable(insetDrawable);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public boolean requirePreDrawListener() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void setBackgroundDrawable(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable drawable;
        Drawable wrap = DrawableCompat.wrap(createShapeDrawable());
        this.mShapeDrawable = wrap;
        DrawableCompat.setTintList(wrap, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.mShapeDrawable, mode);
        }
        if (i2 > 0) {
            this.mBorderDrawable = createBorderDrawable(i2, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.mBorderDrawable, this.mShapeDrawable});
        } else {
            this.mBorderDrawable = null;
            drawable = this.mShapeDrawable;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), drawable, null);
        this.mRippleDrawable = rippleDrawable;
        this.mContentBackground = rippleDrawable;
        this.mShadowViewDelegate.setBackgroundDrawable(rippleDrawable);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.FloatingActionButtonImpl
    public void setRippleColor(int i) {
        Drawable drawable = this.mRippleDrawable;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i));
        } else {
            super.setRippleColor(i);
        }
    }
}
