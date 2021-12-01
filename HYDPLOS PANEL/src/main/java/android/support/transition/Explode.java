package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class Explode extends Visibility {

    /* renamed from: d */
    private static final TimeInterpolator f829d = new DecelerateInterpolator();

    /* renamed from: e */
    private static final TimeInterpolator f830e = new AccelerateInterpolator();

    /* renamed from: c */
    private int[] f831c;

    public Explode() {
        this.f831c = new int[2];
        setPropagation(new C0206e());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f831c = new int[2];
        setPropagation(new C0206e());
    }

    private void captureValues(C0221h0 h0Var) {
        View view = h0Var.f923b;
        view.getLocationOnScreen(this.f831c);
        int[] iArr = this.f831c;
        int i = iArr[0];
        int i2 = iArr[1];
        h0Var.f922a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: h */
    private static float m475h(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: i */
    private static float m476i(View view, int i, int i2) {
        return m475h((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: j */
    private void m477j(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        view.getLocationOnScreen(this.f831c);
        int[] iArr2 = this.f831c;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = epicenter.centerX();
            i = epicenter.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float h = m475h(centerX2, centerY);
        float i5 = m476i(view, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / h) * i5);
        iArr[1] = Math.round(i5 * (centerY / h));
    }

    @Override // android.support.transition.Transition, android.support.transition.Visibility
    public void captureEndValues(C0221h0 h0Var) {
        super.captureEndValues(h0Var);
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition, android.support.transition.Visibility
    public void captureStartValues(C0221h0 h0Var) {
        super.captureStartValues(h0Var);
        captureValues(h0Var);
    }

    @Override // android.support.transition.Visibility
    /* renamed from: d */
    public Animator mo1414d(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        if (h0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) h0Var2.f922a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m477j(viewGroup, rect, this.f831c);
        int[] iArr = this.f831c;
        return C0226j0.m626a(view, h0Var2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f829d);
    }

    @Override // android.support.transition.Visibility
    /* renamed from: f */
    public Animator mo1415f(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        float f;
        float f2;
        if (h0Var == null) {
            return null;
        }
        Rect rect = (Rect) h0Var.f922a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) h0Var.f923b.getTag(C0263y.f984h);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        m477j(viewGroup, rect, this.f831c);
        int[] iArr2 = this.f831c;
        return C0226j0.m626a(view, h0Var, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f830e);
    }
}
