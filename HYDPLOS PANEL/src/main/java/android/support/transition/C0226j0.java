package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;

/* renamed from: android.support.transition.j0 */
class C0226j0 {

    /* renamed from: android.support.transition.j0$b */
    private static class C0228b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f930a;

        /* renamed from: b */
        private final View f931b;

        /* renamed from: c */
        private final int f932c;

        /* renamed from: d */
        private final int f933d;

        /* renamed from: e */
        private int[] f934e;

        /* renamed from: f */
        private float f935f;

        /* renamed from: g */
        private float f936g;

        /* renamed from: h */
        private final float f937h;

        /* renamed from: i */
        private final float f938i;

        private C0228b(View view, View view2, int i, int i2, float f, float f2) {
            this.f931b = view;
            this.f930a = view2;
            this.f932c = i - Math.round(view.getTranslationX());
            this.f933d = i2 - Math.round(view.getTranslationY());
            this.f937h = f;
            this.f938i = f2;
            int i3 = C0263y.f984h;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f934e = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f934e == null) {
                this.f934e = new int[2];
            }
            this.f934e[0] = Math.round(((float) this.f932c) + this.f931b.getTranslationX());
            this.f934e[1] = Math.round(((float) this.f933d) + this.f931b.getTranslationY());
            this.f930a.setTag(C0263y.f984h, this.f934e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f931b.setTranslationX(this.f937h);
            this.f931b.setTranslationY(this.f938i);
        }

        public void onAnimationPause(Animator animator) {
            this.f935f = this.f931b.getTranslationX();
            this.f936g = this.f931b.getTranslationY();
            this.f931b.setTranslationX(this.f937h);
            this.f931b.setTranslationY(this.f938i);
        }

        public void onAnimationResume(Animator animator) {
            this.f931b.setTranslationX(this.f935f);
            this.f931b.setTranslationY(this.f936g);
        }
    }

    /* renamed from: a */
    static Animator m626a(View view, C0221h0 h0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) h0Var.f923b.getTag(C0263y.f984h);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        C0228b bVar = new C0228b(view, h0Var.f923b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(bVar);
        C0193a.m549a(ofPropertyValuesHolder, bVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
