package p059c.p060a;

/* renamed from: c.a.k */
public class C1020k {

    /* renamed from: a */
    private double f2195a = 0.0d;

    /* renamed from: b */
    private String f2196b;

    /* renamed from: c */
    private boolean f2197c = false;

    protected C1020k(String str) {
        this.f2196b = str;
    }

    /* renamed from: a */
    public String mo9965a() {
        return this.f2196b;
    }

    /* renamed from: b */
    public double mo9966b() {
        return this.f2195a;
    }

    /* renamed from: c */
    public boolean mo9967c() {
        return this.f2197c;
    }

    /* renamed from: d */
    public void mo9968d(double d) {
        mo9969e(d);
        this.f2197c = true;
    }

    /* renamed from: e */
    public void mo9969e(double d) {
        if (!this.f2197c) {
            this.f2195a = d;
        } else {
            throw new IllegalStateException(String.format("%s is constant!", this.f2196b));
        }
    }

    public String toString() {
        return this.f2196b + ": " + String.valueOf(this.f2195a);
    }
}
