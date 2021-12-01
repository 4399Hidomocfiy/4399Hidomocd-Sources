package p013b.p014a.p015a;

import p013b.p014a.p015a.p035x.p036m.C0787a;

/* renamed from: b.a.a.r */
public class C0718r {

    /* renamed from: a */
    private final float f1392a;

    /* renamed from: b */
    private final float f1393b;

    public C0718r(float f, float f2) {
        this.f1392a = f;
        this.f1393b = f2;
    }

    /* renamed from: a */
    private static float m1350a(C0718r rVar, C0718r rVar2, C0718r rVar3) {
        float f = rVar2.f1392a;
        float f2 = rVar2.f1393b;
        return ((rVar3.f1392a - f) * (rVar.f1393b - f2)) - ((rVar3.f1393b - f2) * (rVar.f1392a - f));
    }

    /* renamed from: b */
    public static float m1351b(C0718r rVar, C0718r rVar2) {
        return C0787a.m1614a(rVar.f1392a, rVar.f1393b, rVar2.f1392a, rVar2.f1393b);
    }

    /* renamed from: e */
    public static void m1352e(C0718r[] rVarArr) {
        C0718r rVar;
        C0718r rVar2;
        C0718r rVar3;
        float b = m1351b(rVarArr[0], rVarArr[1]);
        float b2 = m1351b(rVarArr[1], rVarArr[2]);
        float b3 = m1351b(rVarArr[0], rVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            rVar3 = rVarArr[0];
            rVar2 = rVarArr[1];
            rVar = rVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            rVar3 = rVarArr[2];
            rVar2 = rVarArr[0];
            rVar = rVarArr[1];
        } else {
            rVar3 = rVarArr[1];
            rVar2 = rVarArr[0];
            rVar = rVarArr[2];
        }
        if (m1350a(rVar2, rVar3, rVar) < 0.0f) {
            rVar = rVar2;
            rVar2 = rVar;
        }
        rVarArr[0] = rVar2;
        rVarArr[1] = rVar3;
        rVarArr[2] = rVar;
    }

    /* renamed from: c */
    public final float mo8700c() {
        return this.f1392a;
    }

    /* renamed from: d */
    public final float mo8701d() {
        return this.f1393b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0718r)) {
            return false;
        }
        C0718r rVar = (C0718r) obj;
        return this.f1392a == rVar.f1392a && this.f1393b == rVar.f1393b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f1392a) * 31) + Float.floatToIntBits(this.f1393b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.f1392a);
        sb.append(',');
        sb.append(this.f1393b);
        sb.append(')');
        return sb.toString();
    }
}
