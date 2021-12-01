package p013b.p014a.p015a.p025c0.p027d;

import p013b.p014a.p015a.C0718r;

/* renamed from: b.a.a.c0.d.a */
public final class C0687a extends C0718r {

    /* renamed from: c */
    private final float f1297c;

    C0687a(float f, float f2, float f3) {
        super(f, f2);
        this.f1297c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo8636f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo8701d()) > f || Math.abs(f3 - mo8700c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f1297c);
        return abs <= 1.0f || abs <= this.f1297c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0687a mo8637g(float f, float f2, float f3) {
        return new C0687a((mo8700c() + f2) / 2.0f, (mo8701d() + f) / 2.0f, (this.f1297c + f3) / 2.0f);
    }
}
