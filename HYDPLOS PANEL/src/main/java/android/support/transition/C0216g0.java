package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: android.support.transition.g0 */
class C0216g0 {

    /* renamed from: android.support.transition.g0$a */
    static class C0217a implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        final float[] f912a = new float[9];

        /* renamed from: b */
        final float[] f913b = new float[9];

        /* renamed from: c */
        final Matrix f914c = new Matrix();

        C0217a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f912a);
            matrix2.getValues(this.f913b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f913b;
                float f2 = fArr[i];
                float[] fArr2 = this.f912a;
                fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
            }
            this.f914c.setValues(this.f913b);
            return this.f914c;
        }
    }

    /* renamed from: a */
    static View m607a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C0254u0.m691k(view, matrix);
        C0254u0.m692l(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b = m608b(view, matrix, rectF);
        if (b != null) {
            imageView.setImageBitmap(b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* renamed from: b */
    private static Bitmap m608b(View view, Matrix matrix, RectF rectF) {
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        matrix.postTranslate(-rectF.left, -rectF.top);
        matrix.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap((int) (((float) round) * min), (int) (((float) round2) * min), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(matrix);
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: c */
    static Animator m609c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
