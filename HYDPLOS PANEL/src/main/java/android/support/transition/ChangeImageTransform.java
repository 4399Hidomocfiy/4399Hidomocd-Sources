package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.transition.C0216g0;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

public class ChangeImageTransform extends Transition {

    /* renamed from: a */
    private static final String[] f794a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: b */
    private static final TypeEvaluator<Matrix> f795b = new C0161a();

    /* renamed from: c */
    private static final Property<ImageView, Matrix> f796c = new C0162b(Matrix.class, "animatedTransform");

    /* renamed from: android.support.transition.ChangeImageTransform$a */
    static class C0161a implements TypeEvaluator<Matrix> {
        C0161a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: android.support.transition.ChangeImageTransform$b */
    static class C0162b extends Property<ImageView, Matrix> {
        C0162b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            C0229k.m627a(imageView, matrix);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.transition.ChangeImageTransform$c */
    public static /* synthetic */ class C0163c {

        /* renamed from: a */
        static final /* synthetic */ int[] f797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.support.transition.ChangeImageTransform.C0163c.f797a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = android.support.transition.ChangeImageTransform.C0163c.f797a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ChangeImageTransform.C0163c.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private static Matrix m445a(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    /* renamed from: b */
    private static Matrix m446b(ImageView imageView) {
        int i = C0163c.f797a[imageView.getScaleType().ordinal()];
        return i != 1 ? i != 2 ? new Matrix(imageView.getImageMatrix()) : m445a(imageView) : m449e(imageView);
    }

    /* renamed from: c */
    private ObjectAnimator m447c(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f796c, new C0216g0.C0217a(), matrix, matrix2);
    }

    private void captureValues(C0221h0 h0Var) {
        View view = h0Var.f923b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = h0Var.f922a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", m446b(imageView));
            }
        }
    }

    /* renamed from: d */
    private ObjectAnimator m448d(ImageView imageView) {
        return ObjectAnimator.ofObject(imageView, f796c, f795b, null, null);
    }

    /* renamed from: e */
    private static Matrix m449e(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(C0221h0 h0Var) {
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(C0221h0 h0Var) {
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0221h0 h0Var, C0221h0 h0Var2) {
        ObjectAnimator objectAnimator;
        if (!(h0Var == null || h0Var2 == null)) {
            Rect rect = (Rect) h0Var.f922a.get("android:changeImageTransform:bounds");
            Rect rect2 = (Rect) h0Var2.f922a.get("android:changeImageTransform:bounds");
            if (!(rect == null || rect2 == null)) {
                Matrix matrix = (Matrix) h0Var.f922a.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) h0Var2.f922a.get("android:changeImageTransform:matrix");
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) h0Var2.f923b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                C0229k.m629c(imageView);
                if (intrinsicWidth == 0 || intrinsicHeight == 0) {
                    objectAnimator = m448d(imageView);
                } else {
                    if (matrix == null) {
                        matrix = C0238o.f945a;
                    }
                    if (matrix2 == null) {
                        matrix2 = C0238o.f945a;
                    }
                    f796c.set(imageView, matrix);
                    objectAnimator = m447c(imageView, matrix, matrix2);
                }
                C0229k.m628b(imageView, objectAnimator);
                return objectAnimator;
            }
        }
        return null;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f794a;
    }
}
