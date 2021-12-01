package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: android.support.transition.e */
public class C0206e extends AbstractC0199b1 {

    /* renamed from: b */
    private float f893b = 3.0f;

    /* renamed from: h */
    private static float m588h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    @Override // android.support.transition.AbstractC0212f0
    /* renamed from: c */
    public long mo1526c(ViewGroup viewGroup, Transition transition, C0221h0 h0Var, C0221h0 h0Var2) {
        int i;
        int i2;
        int i3;
        if (h0Var == null && h0Var2 == null) {
            return 0;
        }
        if (h0Var2 == null || mo1530e(h0Var) == 0) {
            i = -1;
        } else {
            h0Var = h0Var2;
            i = 1;
        }
        int f = mo1531f(h0Var);
        int g = mo1532g(h0Var);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            i3 = epicenter.centerX();
            i2 = epicenter.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = m588h((float) f, (float) g, (float) i3, (float) i2) / m588h(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return (long) Math.round((((float) (duration * ((long) i))) / this.f893b) * h);
    }
}
