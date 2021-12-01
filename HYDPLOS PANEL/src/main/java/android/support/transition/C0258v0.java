package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.transition.v0 */
class C0258v0 implements AbstractC0195a1 {

    /* renamed from: a */
    private float[] f972a;

    C0258v0() {
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: a */
    public void mo1513a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1513a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: b */
    public AbstractC0210e1 mo1514b(View view) {
        return new C0202c1(view.getWindowToken());
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: c */
    public void mo1515c(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f972a;
        if (fArr == null) {
            fArr = new float[9];
            this.f972a = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) Math.sqrt((double) (1.0f - (f * f)))) * ((float) (fArr[0] < 0.0f ? -1 : 1));
        float degrees = (float) Math.toDegrees(Math.atan2((double) f, (double) sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: d */
    public void mo1516d(View view) {
        int i = C0263y.f980d;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: e */
    public void mo1517e(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0263y.f980d, null);
        }
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: f */
    public float mo1518f(View view) {
        Float f = (Float) view.getTag(C0263y.f980d);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: g */
    public void mo1519g(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1519g(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: h */
    public void mo1520h(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: i */
    public void mo1521i(View view, float f) {
        Float f2 = (Float) view.getTag(C0263y.f980d);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    @Override // android.support.transition.AbstractC0195a1
    /* renamed from: j */
    public AbstractC0252t0 mo1522j(View view) {
        return C0247r0.m663e(view);
    }
}
