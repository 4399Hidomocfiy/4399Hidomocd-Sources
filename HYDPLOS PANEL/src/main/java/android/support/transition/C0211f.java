package android.support.transition;

import android.animation.TypeEvaluator;

/* renamed from: android.support.transition.f */
class C0211f implements TypeEvaluator<float[]> {

    /* renamed from: a */
    private float[] f901a;

    C0211f(float[] fArr) {
        this.f901a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f901a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
