package p013b.p014a.p015a.p025c0.p027d;

import p013b.p014a.p015a.C0718r;

/* renamed from: b.a.a.c0.d.d */
public final class C0690d extends C0718r {

    /* renamed from: c */
    private final float f1309c;

    /* renamed from: d */
    private final int f1310d;

    C0690d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C0690d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f1309c = f3;
        this.f1310d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo8643f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo8701d()) > f || Math.abs(f3 - mo8700c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f1309c);
        return abs <= 1.0f || abs <= this.f1309c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0690d mo8644g(float f, float f2, float f3) {
        int i = this.f1310d;
        int i2 = i + 1;
        float c = (((float) i) * mo8700c()) + f2;
        float f4 = (float) i2;
        return new C0690d(c / f4, ((((float) this.f1310d) * mo8701d()) + f) / f4, ((((float) this.f1310d) * this.f1309c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8645h() {
        return this.f1310d;
    }

    /* renamed from: i */
    public float mo8646i() {
        return this.f1309c;
    }
}
