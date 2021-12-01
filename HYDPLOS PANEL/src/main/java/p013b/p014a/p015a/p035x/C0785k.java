package p013b.p014a.p015a.p035x;

/* renamed from: b.a.a.x.k */
public final class C0785k {

    /* renamed from: a */
    private final float f1594a;

    /* renamed from: b */
    private final float f1595b;

    /* renamed from: c */
    private final float f1596c;

    /* renamed from: d */
    private final float f1597d;

    /* renamed from: e */
    private final float f1598e;

    /* renamed from: f */
    private final float f1599f;

    /* renamed from: g */
    private final float f1600g;

    /* renamed from: h */
    private final float f1601h;

    /* renamed from: i */
    private final float f1602i;

    private C0785k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f1594a = f;
        this.f1595b = f4;
        this.f1596c = f7;
        this.f1597d = f2;
        this.f1598e = f5;
        this.f1599f = f8;
        this.f1600g = f3;
        this.f1601h = f6;
        this.f1602i = f9;
    }

    /* renamed from: b */
    public static C0785k m1607b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m1609d(f9, f10, f11, f12, f13, f14, f15, f16).mo8826e(m1608c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C0785k m1608c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m1609d(f, f2, f3, f4, f5, f6, f7, f8).mo8825a();
    }

    /* renamed from: d */
    public static C0785k m1609d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C0785k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C0785k((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0785k mo8825a() {
        float f = this.f1598e;
        float f2 = this.f1602i;
        float f3 = this.f1599f;
        float f4 = this.f1601h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f1600g;
        float f7 = this.f1597d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f1596c;
        float f11 = this.f1595b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f1594a;
        return new C0785k(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0785k mo8826e(C0785k kVar) {
        float f = this.f1594a;
        float f2 = kVar.f1594a;
        float f3 = this.f1597d;
        float f4 = kVar.f1595b;
        float f5 = this.f1600g;
        float f6 = kVar.f1596c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = kVar.f1597d;
        float f9 = kVar.f1598e;
        float f10 = kVar.f1599f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = kVar.f1600g;
        float f13 = kVar.f1601h;
        float f14 = kVar.f1602i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f1595b;
        float f17 = this.f1598e;
        float f18 = this.f1601h;
        float f19 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f20 = this.f1596c;
        float f21 = this.f1599f;
        float f22 = (f2 * f20) + (f4 * f21);
        float f23 = this.f1602i;
        return new C0785k(f7, f11, f15, (f16 * f2) + (f17 * f4) + (f18 * f6), (f16 * f8) + (f17 * f9) + (f18 * f10), f19, (f6 * f23) + f22, (f8 * f20) + (f9 * f21) + (f10 * f23), (f20 * f12) + (f21 * f13) + (f23 * f14));
    }

    /* renamed from: f */
    public void mo8827f(float[] fArr) {
        int length = fArr.length;
        float f = this.f1594a;
        float f2 = this.f1595b;
        float f3 = this.f1596c;
        float f4 = this.f1597d;
        float f5 = this.f1598e;
        float f6 = this.f1599f;
        float f7 = this.f1600g;
        float f8 = this.f1601h;
        float f9 = this.f1602i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
