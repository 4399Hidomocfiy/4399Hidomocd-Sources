package p013b.p050d.p053c.p054a;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: b.d.c.a.a */
public final class C0965a extends Animation {

    /* renamed from: q */
    public static final boolean f2083q = (Integer.valueOf(Build.VERSION.SDK).intValue() < 11);

    /* renamed from: r */
    private static final WeakHashMap<View, C0965a> f2084r = new WeakHashMap<>();

    /* renamed from: a */
    private final WeakReference<View> f2085a;

    /* renamed from: b */
    private final Camera f2086b = new Camera();

    /* renamed from: c */
    private boolean f2087c;

    /* renamed from: d */
    private float f2088d = 1.0f;

    /* renamed from: e */
    private float f2089e;

    /* renamed from: f */
    private float f2090f;

    /* renamed from: g */
    private float f2091g;

    /* renamed from: h */
    private float f2092h;

    /* renamed from: i */
    private float f2093i;

    /* renamed from: j */
    private float f2094j = 1.0f;

    /* renamed from: k */
    private float f2095k = 1.0f;

    /* renamed from: l */
    private float f2096l;

    /* renamed from: m */
    private float f2097m;

    /* renamed from: n */
    private final RectF f2098n = new RectF();

    /* renamed from: o */
    private final RectF f2099o = new RectF();

    /* renamed from: p */
    private final Matrix f2100p = new Matrix();

    private C0965a(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f2085a = new WeakReference<>(view);
    }

    /* renamed from: D */
    private void m2685D(Matrix matrix, View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        boolean z = this.f2087c;
        float f = z ? this.f2089e : width / 2.0f;
        float f2 = z ? this.f2090f : height / 2.0f;
        float f3 = this.f2091g;
        float f4 = this.f2092h;
        float f5 = this.f2093i;
        if (!(f3 == 0.0f && f4 == 0.0f && f5 == 0.0f)) {
            Camera camera = this.f2086b;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f2094j;
        float f7 = this.f2095k;
        if (!(f6 == 1.0f && f7 == 1.0f)) {
            matrix.postScale(f6, f7);
            matrix.postTranslate((-(f / width)) * ((f6 * width) - width), (-(f2 / height)) * ((f7 * height) - height));
        }
        matrix.postTranslate(this.f2096l, this.f2097m);
    }

    /* renamed from: E */
    public static C0965a m2686E(View view) {
        WeakHashMap<View, C0965a> weakHashMap = f2084r;
        C0965a aVar = weakHashMap.get(view);
        if (aVar != null && aVar == view.getAnimation()) {
            return aVar;
        }
        C0965a aVar2 = new C0965a(view);
        weakHashMap.put(view, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private void m2687a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = this.f2100p;
        matrix.reset();
        m2685D(matrix, view);
        this.f2100p.mapRect(rectF);
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    /* renamed from: p */
    private void m2688p() {
        View view = this.f2085a.get();
        if (view != null && view.getParent() != null) {
            RectF rectF = this.f2099o;
            m2687a(rectF, view);
            rectF.union(this.f2098n);
            ((View) view.getParent()).invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
    }

    /* renamed from: q */
    private void m2689q() {
        View view = this.f2085a.get();
        if (view != null) {
            m2687a(this.f2098n, view);
        }
    }

    /* renamed from: A */
    public void mo9228A(float f) {
        if (this.f2097m != f) {
            m2689q();
            this.f2097m = f;
            m2688p();
        }
    }

    /* renamed from: B */
    public void mo9229B(float f) {
        View view = this.f2085a.get();
        if (view != null) {
            mo9254z(f - ((float) view.getLeft()));
        }
    }

    /* renamed from: C */
    public void mo9230C(float f) {
        View view = this.f2085a.get();
        if (view != null) {
            mo9228A(f - ((float) view.getTop()));
        }
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        View view = this.f2085a.get();
        if (view != null) {
            transformation.setAlpha(this.f2088d);
            m2685D(transformation.getMatrix(), view);
        }
    }

    /* renamed from: b */
    public float mo9232b() {
        return this.f2088d;
    }

    /* renamed from: c */
    public float mo9233c() {
        return this.f2089e;
    }

    /* renamed from: d */
    public float mo9234d() {
        return this.f2090f;
    }

    /* renamed from: e */
    public float mo9235e() {
        return this.f2093i;
    }

    /* renamed from: f */
    public float mo9236f() {
        return this.f2091g;
    }

    /* renamed from: g */
    public float mo9237g() {
        return this.f2092h;
    }

    /* renamed from: h */
    public float mo9238h() {
        return this.f2094j;
    }

    /* renamed from: i */
    public float mo9239i() {
        return this.f2095k;
    }

    /* renamed from: j */
    public int mo9240j() {
        View view = this.f2085a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* renamed from: k */
    public int mo9241k() {
        View view = this.f2085a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* renamed from: l */
    public float mo9242l() {
        return this.f2096l;
    }

    /* renamed from: m */
    public float mo9243m() {
        return this.f2097m;
    }

    /* renamed from: n */
    public float mo9244n() {
        View view = this.f2085a.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getLeft()) + this.f2096l;
    }

    /* renamed from: o */
    public float mo9245o() {
        View view = this.f2085a.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getTop()) + this.f2097m;
    }

    /* renamed from: r */
    public void mo9246r(float f) {
        if (this.f2088d != f) {
            this.f2088d = f;
            View view = this.f2085a.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: s */
    public void mo9247s(float f) {
        if (!this.f2087c || this.f2089e != f) {
            m2689q();
            this.f2087c = true;
            this.f2089e = f;
            m2688p();
        }
    }

    /* renamed from: t */
    public void mo9248t(float f) {
        if (!this.f2087c || this.f2090f != f) {
            m2689q();
            this.f2087c = true;
            this.f2090f = f;
            m2688p();
        }
    }

    /* renamed from: u */
    public void mo9249u(float f) {
        if (this.f2093i != f) {
            m2689q();
            this.f2093i = f;
            m2688p();
        }
    }

    /* renamed from: v */
    public void mo9250v(float f) {
        if (this.f2091g != f) {
            m2689q();
            this.f2091g = f;
            m2688p();
        }
    }

    /* renamed from: w */
    public void mo9251w(float f) {
        if (this.f2092h != f) {
            m2689q();
            this.f2092h = f;
            m2688p();
        }
    }

    /* renamed from: x */
    public void mo9252x(float f) {
        if (this.f2094j != f) {
            m2689q();
            this.f2094j = f;
            m2688p();
        }
    }

    /* renamed from: y */
    public void mo9253y(float f) {
        if (this.f2095k != f) {
            m2689q();
            this.f2095k = f;
            m2688p();
        }
    }

    /* renamed from: z */
    public void mo9254z(float f) {
        if (this.f2096l != f) {
            m2689q();
            this.f2096l = f;
            m2688p();
        }
    }
}
