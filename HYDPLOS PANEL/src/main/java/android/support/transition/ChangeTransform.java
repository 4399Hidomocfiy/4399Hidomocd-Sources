package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {

    /* renamed from: d */
    private static final String[] f799d = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: e */
    private static final Property<C0168e, float[]> f800e = new C0164a(float[].class, "nonTranslations");

    /* renamed from: f */
    private static final Property<C0168e, PointF> f801f = new C0165b(PointF.class, "translations");

    /* renamed from: g */
    private static final boolean f802g;

    /* renamed from: a */
    private boolean f803a = true;

    /* renamed from: b */
    private boolean f804b = true;

    /* renamed from: c */
    private Matrix f805c = new Matrix();

    /* renamed from: android.support.transition.ChangeTransform$a */
    static class C0164a extends Property<C0168e, float[]> {
        C0164a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C0168e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C0168e eVar, float[] fArr) {
            eVar.mo1410d(fArr);
        }
    }

    /* renamed from: android.support.transition.ChangeTransform$b */
    static class C0165b extends Property<C0168e, PointF> {
        C0165b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0168e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C0168e eVar, PointF pointF) {
            eVar.mo1409c(pointF);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.transition.ChangeTransform$c */
    public class C0166c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f806a;

        /* renamed from: b */
        private Matrix f807b = new Matrix();

        /* renamed from: c */
        final /* synthetic */ boolean f808c;

        /* renamed from: d */
        final /* synthetic */ Matrix f809d;

        /* renamed from: e */
        final /* synthetic */ View f810e;

        /* renamed from: f */
        final /* synthetic */ C0169f f811f;

        /* renamed from: g */
        final /* synthetic */ C0168e f812g;

        C0166c(boolean z, Matrix matrix, View view, C0169f fVar, C0168e eVar) {
            this.f808c = z;
            this.f809d = matrix;
            this.f810e = view;
            this.f811f = fVar;
            this.f812g = eVar;
        }

        /* renamed from: a */
        private void m466a(Matrix matrix) {
            this.f807b.set(matrix);
            this.f810e.setTag(C0263y.f985i, this.f807b);
            this.f811f.mo1411a(this.f810e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f806a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f806a) {
                if (!this.f808c || !ChangeTransform.this.f803a) {
                    this.f810e.setTag(C0263y.f985i, null);
                    this.f810e.setTag(C0263y.f978b, null);
                } else {
                    m466a(this.f809d);
                }
            }
            C0254u0.m687g(this.f810e, null);
            this.f811f.mo1411a(this.f810e);
        }

        public void onAnimationPause(Animator animator) {
            m466a(this.f812g.mo1408a());
        }

        public void onAnimationResume(Animator animator) {
            ChangeTransform.m459g(this.f810e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.ChangeTransform$d */
    public static class C0167d extends C0204d0 {

        /* renamed from: a */
        private View f814a;

        /* renamed from: b */
        private AbstractC0222i f815b;

        C0167d(View view, AbstractC0222i iVar) {
            this.f814a = view;
            this.f815b = iVar;
        }

        @Override // android.support.transition.Transition.AbstractC0187g, android.support.transition.C0204d0
        /* renamed from: a */
        public void mo1383a(Transition transition) {
            this.f815b.setVisibility(4);
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: b */
        public void mo1384b(Transition transition) {
            transition.removeListener(this);
            C0225j.m625b(this.f814a);
            this.f814a.setTag(C0263y.f985i, null);
            this.f814a.setTag(C0263y.f978b, null);
        }

        @Override // android.support.transition.Transition.AbstractC0187g, android.support.transition.C0204d0
        /* renamed from: e */
        public void mo1386e(Transition transition) {
            this.f815b.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.ChangeTransform$e */
    public static class C0168e {

        /* renamed from: a */
        private final Matrix f816a = new Matrix();

        /* renamed from: b */
        private final View f817b;

        /* renamed from: c */
        private final float[] f818c;

        /* renamed from: d */
        private float f819d;

        /* renamed from: e */
        private float f820e;

        C0168e(View view, float[] fArr) {
            this.f817b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f818c = fArr2;
            this.f819d = fArr2[2];
            this.f820e = fArr2[5];
            m470b();
        }

        /* renamed from: b */
        private void m470b() {
            float[] fArr = this.f818c;
            fArr[2] = this.f819d;
            fArr[5] = this.f820e;
            this.f816a.setValues(fArr);
            C0254u0.m687g(this.f817b, this.f816a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Matrix mo1408a() {
            return this.f816a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1409c(PointF pointF) {
            this.f819d = pointF.x;
            this.f820e = pointF.y;
            m470b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1410d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f818c, 0, fArr.length);
            m470b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.ChangeTransform$f */
    public static class C0169f {

        /* renamed from: a */
        final float f821a;

        /* renamed from: b */
        final float f822b;

        /* renamed from: c */
        final float f823c;

        /* renamed from: d */
        final float f824d;

        /* renamed from: e */
        final float f825e;

        /* renamed from: f */
        final float f826f;

        /* renamed from: g */
        final float f827g;

        /* renamed from: h */
        final float f828h;

        C0169f(View view) {
            this.f821a = view.getTranslationX();
            this.f822b = view.getTranslationY();
            this.f823c = ViewCompat.getTranslationZ(view);
            this.f824d = view.getScaleX();
            this.f825e = view.getScaleY();
            this.f826f = view.getRotationX();
            this.f827g = view.getRotationY();
            this.f828h = view.getRotation();
        }

        /* renamed from: a */
        public void mo1411a(View view) {
            ChangeTransform.m461i(view, this.f821a, this.f822b, this.f823c, this.f824d, this.f825e, this.f826f, this.f827g, this.f828h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0169f)) {
                return false;
            }
            C0169f fVar = (C0169f) obj;
            return fVar.f821a == this.f821a && fVar.f822b == this.f822b && fVar.f823c == this.f823c && fVar.f824d == this.f824d && fVar.f825e == this.f825e && fVar.f826f == this.f826f && fVar.f827g == this.f827g && fVar.f828h == this.f828h;
        }

        public int hashCode() {
            float f = this.f821a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f822b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f823c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f824d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f825e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f826f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f827g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f828h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        f802g = z;
    }

    public ChangeTransform() {
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f886e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f803a = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f804b = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    private void captureValues(C0221h0 h0Var) {
        View view = h0Var.f923b;
        if (view.getVisibility() != 8) {
            h0Var.f922a.put("android:changeTransform:parent", view.getParent());
            h0Var.f922a.put("android:changeTransform:transforms", new C0169f(view));
            Matrix matrix = view.getMatrix();
            h0Var.f922a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.f804b) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C0254u0.m691k(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                h0Var.f922a.put("android:changeTransform:parentMatrix", matrix2);
                h0Var.f922a.put("android:changeTransform:intermediateMatrix", view.getTag(C0263y.f985i));
                h0Var.f922a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C0263y.f978b));
            }
        }
    }

    /* renamed from: d */
    private void m456d(ViewGroup viewGroup, C0221h0 h0Var, C0221h0 h0Var2) {
        View view = h0Var2.f923b;
        Matrix matrix = new Matrix((Matrix) h0Var2.f922a.get("android:changeTransform:parentMatrix"));
        C0254u0.m692l(viewGroup, matrix);
        AbstractC0222i a = C0225j.m624a(view, viewGroup, matrix);
        if (a != null) {
            a.mo1542a((ViewGroup) h0Var.f922a.get("android:changeTransform:parent"), h0Var.f923b);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.mParent;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.addListener(new C0167d(view, a));
            if (f802g) {
                View view2 = h0Var.f923b;
                if (view2 != h0Var2.f923b) {
                    C0254u0.m689i(view2, 0.0f);
                }
                C0254u0.m689i(view, 1.0f);
            }
        }
    }

    /* renamed from: e */
    private ObjectAnimator m457e(C0221h0 h0Var, C0221h0 h0Var2, boolean z) {
        Matrix matrix = (Matrix) h0Var.f922a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) h0Var2.f922a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C0238o.f945a;
        }
        if (matrix2 == null) {
            matrix2 = C0238o.f945a;
        }
        if (matrix.equals(matrix2)) {
            return null;
        }
        C0169f fVar = (C0169f) h0Var2.f922a.get("android:changeTransform:transforms");
        View view = h0Var2.f923b;
        m459g(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        C0168e eVar = new C0168e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(f800e, new C0211f(new float[9]), fArr, fArr2), C0253u.m680a(f801f, getPathMotion().mo1350a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C0166c cVar = new C0166c(z, matrix2, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C0193a.m549a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f923b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m458f(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            android.support.transition.h0 r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f923b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ChangeTransform.m458f(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m459g(View view) {
        m461i(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: h */
    private void m460h(C0221h0 h0Var, C0221h0 h0Var2) {
        Matrix matrix = (Matrix) h0Var2.f922a.get("android:changeTransform:parentMatrix");
        h0Var2.f923b.setTag(C0263y.f978b, matrix);
        Matrix matrix2 = this.f805c;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) h0Var.f922a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            h0Var.f922a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) h0Var.f922a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m461i(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ViewCompat.setTranslationZ(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(C0221h0 h0Var) {
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(C0221h0 h0Var) {
        captureValues(h0Var);
        if (!f802g) {
            ((ViewGroup) h0Var.f923b.getParent()).startViewTransition(h0Var.f923b);
        }
    }

    @Override // android.support.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0221h0 h0Var, C0221h0 h0Var2) {
        if (h0Var == null || h0Var2 == null || !h0Var.f922a.containsKey("android:changeTransform:parent") || !h0Var2.f922a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) h0Var.f922a.get("android:changeTransform:parent");
        boolean z = this.f804b && !m458f(viewGroup2, (ViewGroup) h0Var2.f922a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) h0Var.f922a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            h0Var.f922a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) h0Var.f922a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            h0Var.f922a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            m460h(h0Var, h0Var2);
        }
        ObjectAnimator e = m457e(h0Var, h0Var2, z);
        if (z && e != null && this.f803a) {
            m456d(viewGroup, h0Var, h0Var2);
        } else if (!f802g) {
            viewGroup2.endViewTransition(h0Var.f923b);
        }
        return e;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f799d;
    }
}
