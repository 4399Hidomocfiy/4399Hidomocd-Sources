package p013b.p014a.p015a.p038y.p041e;

import bsh.org.objectweb.asm.Constants;
import p013b.p014a.p015a.C0705f;

/* renamed from: b.a.a.y.e.k */
public class C0820k {

    /* renamed from: i */
    static final C0820k[] f1687i;

    /* renamed from: j */
    private static C0820k[] f1688j;

    /* renamed from: a */
    private final boolean f1689a;

    /* renamed from: b */
    private final int f1690b;

    /* renamed from: c */
    private final int f1691c;

    /* renamed from: d */
    public final int f1692d;

    /* renamed from: e */
    public final int f1693e;

    /* renamed from: f */
    private final int f1694f;

    /* renamed from: g */
    private final int f1695g;

    /* renamed from: h */
    private final int f1696h;

    static {
        C0820k[] kVarArr = {new C0820k(false, 3, 5, 8, 8, 1), new C0820k(false, 5, 7, 10, 10, 1), new C0820k(true, 5, 7, 16, 6, 1), new C0820k(false, 8, 10, 12, 12, 1), new C0820k(true, 10, 11, 14, 6, 2), new C0820k(false, 12, 12, 14, 14, 1), new C0820k(true, 16, 14, 24, 10, 1), new C0820k(false, 18, 14, 16, 16, 1), new C0820k(false, 22, 18, 18, 18, 1), new C0820k(true, 22, 18, 16, 10, 2), new C0820k(false, 30, 20, 20, 20, 1), new C0820k(true, 32, 24, 16, 14, 2), new C0820k(false, 36, 24, 22, 22, 1), new C0820k(false, 44, 28, 24, 24, 1), new C0820k(true, 49, 28, 22, 14, 2), new C0820k(false, 62, 36, 14, 14, 4), new C0820k(false, 86, 42, 16, 16, 4), new C0820k(false, 114, 48, 18, 18, 4), new C0820k(false, Constants.D2F, 56, 20, 20, 4), new C0820k(false, Constants.FRETURN, 68, 22, 22, 4), new C0820k(false, 204, 84, 24, 24, 4, 102, 42), new C0820k(false, 280, 112, 14, 14, 16, Constants.F2L, 56), new C0820k(false, 368, Constants.D2F, 16, 16, 16, 92, 36), new C0820k(false, 456, Constants.CHECKCAST, 18, 18, 16, 114, 48), new C0820k(false, 576, 224, 20, 20, 16, Constants.D2F, 56), new C0820k(false, 696, 272, 22, 22, 16, Constants.FRETURN, 68), new C0820k(false, 816, 336, 24, 24, 16, Constants.L2I, 56), new C0820k(false, 1050, 408, 18, 18, 36, Constants.DRETURN, 68), new C0820k(false, 1304, 496, 20, 20, 36, Constants.IF_ICMPGT, 62), new C0813d()};
        f1687i = kVarArr;
        f1688j = kVarArr;
    }

    public C0820k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    C0820k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f1689a = z;
        this.f1690b = i;
        this.f1691c = i2;
        this.f1692d = i3;
        this.f1693e = i4;
        this.f1694f = i5;
        this.f1695g = i6;
        this.f1696h = i7;
    }

    /* renamed from: l */
    public static C0820k m1771l(int i, EnumC0821l lVar, C0705f fVar, C0705f fVar2, boolean z) {
        C0820k[] kVarArr = f1688j;
        for (C0820k kVar : kVarArr) {
            if ((lVar != EnumC0821l.FORCE_SQUARE || !kVar.f1689a) && ((lVar != EnumC0821l.FORCE_RECTANGLE || kVar.f1689a) && ((fVar == null || (kVar.mo8921j() >= fVar.mo8674b() && kVar.mo8920i() >= fVar.mo8673a())) && ((fVar2 == null || (kVar.mo8921j() <= fVar2.mo8674b() && kVar.mo8920i() <= fVar2.mo8673a())) && i <= kVar.f1690b)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i);
    }

    /* renamed from: a */
    public final int mo8914a() {
        return this.f1690b;
    }

    /* renamed from: b */
    public int mo8889b(int i) {
        return this.f1695g;
    }

    /* renamed from: c */
    public final int mo8915c() {
        return this.f1691c;
    }

    /* renamed from: d */
    public final int mo8916d(int i) {
        return this.f1696h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo8917e() {
        int i = this.f1694f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: f */
    public int mo8890f() {
        return this.f1690b / this.f1695g;
    }

    /* renamed from: g */
    public final int mo8918g() {
        return mo8922k() * this.f1693e;
    }

    /* renamed from: h */
    public final int mo8919h() {
        return mo8917e() * this.f1692d;
    }

    /* renamed from: i */
    public final int mo8920i() {
        return mo8918g() + (mo8922k() * 2);
    }

    /* renamed from: j */
    public final int mo8921j() {
        return mo8919h() + (mo8917e() * 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo8922k() {
        int i = this.f1694f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1689a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f1692d);
        sb.append('x');
        sb.append(this.f1693e);
        sb.append(", symbol size ");
        sb.append(mo8921j());
        sb.append('x');
        sb.append(mo8920i());
        sb.append(", symbol data size ");
        sb.append(mo8919h());
        sb.append('x');
        sb.append(mo8918g());
        sb.append(", codewords ");
        sb.append(this.f1690b);
        sb.append('+');
        sb.append(this.f1691c);
        return sb.toString();
    }
}
