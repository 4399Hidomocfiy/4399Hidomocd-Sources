package p013b.p050d.p051a;

import android.view.animation.Interpolator;

/* renamed from: b.d.a.g */
public abstract class AbstractC0931g implements Cloneable {

    /* renamed from: a */
    float f2010a;

    /* renamed from: b */
    private Interpolator f2011b = null;

    /* renamed from: c */
    boolean f2012c = false;

    /* renamed from: b.d.a.g$a */
    static class C0932a extends AbstractC0931g {

        /* renamed from: d */
        float f2013d;

        C0932a(float f) {
            this.f2010a = f;
            Class cls = Float.TYPE;
        }

        C0932a(float f, float f2) {
            this.f2010a = f;
            this.f2013d = f2;
            Class cls = Float.TYPE;
            this.f2012c = true;
        }

        @Override // p013b.p050d.p051a.AbstractC0931g
        /* renamed from: d */
        public Object mo9148d() {
            return Float.valueOf(this.f2013d);
        }

        @Override // p013b.p050d.p051a.AbstractC0931g
        /* renamed from: i */
        public void mo9151i(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.f2013d = ((Float) obj).floatValue();
                this.f2012c = true;
            }
        }

        /* renamed from: j */
        public C0932a clone() {
            C0932a aVar = new C0932a(mo9145b(), this.f2013d);
            aVar.mo9150h(mo9146c());
            return aVar;
        }

        /* renamed from: k */
        public float mo9153k() {
            return this.f2013d;
        }
    }

    /* renamed from: f */
    public static AbstractC0931g m2532f(float f) {
        return new C0932a(f);
    }

    /* renamed from: g */
    public static AbstractC0931g m2533g(float f, float f2) {
        return new C0932a(f, f2);
    }

    /* renamed from: a */
    public abstract AbstractC0931g clone();

    /* renamed from: b */
    public float mo9145b() {
        return this.f2010a;
    }

    /* renamed from: c */
    public Interpolator mo9146c() {
        return this.f2011b;
    }

    /* renamed from: d */
    public abstract Object mo9148d();

    /* renamed from: e */
    public boolean mo9149e() {
        return this.f2012c;
    }

    /* renamed from: h */
    public void mo9150h(Interpolator interpolator) {
        this.f2011b = interpolator;
    }

    /* renamed from: i */
    public abstract void mo9151i(Object obj);
}
