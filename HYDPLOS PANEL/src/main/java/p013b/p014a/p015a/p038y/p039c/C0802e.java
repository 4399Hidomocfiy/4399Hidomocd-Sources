package p013b.p014a.p015a.p038y.p039c;

import bsh.org.objectweb.asm.Constants;
import p013b.p014a.p015a.C0707h;

/* renamed from: b.a.a.y.c.e */
public final class C0802e {

    /* renamed from: h */
    private static final C0802e[] f1653h = m1678a();

    /* renamed from: a */
    private final int f1654a;

    /* renamed from: b */
    private final int f1655b;

    /* renamed from: c */
    private final int f1656c;

    /* renamed from: d */
    private final int f1657d;

    /* renamed from: e */
    private final int f1658e;

    /* renamed from: f */
    private final C0805c f1659f;

    /* renamed from: g */
    private final int f1660g;

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.y.c.e$b */
    public static final class C0804b {

        /* renamed from: a */
        private final int f1661a;

        /* renamed from: b */
        private final int f1662b;

        private C0804b(int i, int i2) {
            this.f1661a = i;
            this.f1662b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo8872a() {
            return this.f1661a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo8873b() {
            return this.f1662b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.y.c.e$c */
    public static final class C0805c {

        /* renamed from: a */
        private final int f1663a;

        /* renamed from: b */
        private final C0804b[] f1664b;

        private C0805c(int i, C0804b bVar) {
            this.f1663a = i;
            this.f1664b = new C0804b[]{bVar};
        }

        private C0805c(int i, C0804b bVar, C0804b bVar2) {
            this.f1663a = i;
            this.f1664b = new C0804b[]{bVar, bVar2};
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0804b[] mo8874a() {
            return this.f1664b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo8875b() {
            return this.f1663a;
        }
    }

    private C0802e(int i, int i2, int i3, int i4, int i5, C0805c cVar) {
        this.f1654a = i;
        this.f1655b = i2;
        this.f1656c = i3;
        this.f1657d = i4;
        this.f1658e = i5;
        this.f1659f = cVar;
        int b = cVar.mo8875b();
        C0804b[] a = cVar.mo8874a();
        int i6 = 0;
        for (C0804b bVar : a) {
            i6 += bVar.mo8872a() * (bVar.mo8873b() + b);
        }
        this.f1660g = i6;
    }

    /* renamed from: a */
    private static C0802e[] m1678a() {
        return new C0802e[]{new C0802e(1, 10, 10, 8, 8, new C0805c(5, new C0804b(1, 3))), new C0802e(2, 12, 12, 10, 10, new C0805c(7, new C0804b(1, 5))), new C0802e(3, 14, 14, 12, 12, new C0805c(10, new C0804b(1, 8))), new C0802e(4, 16, 16, 14, 14, new C0805c(12, new C0804b(1, 12))), new C0802e(5, 18, 18, 16, 16, new C0805c(14, new C0804b(1, 18))), new C0802e(6, 20, 20, 18, 18, new C0805c(18, new C0804b(1, 22))), new C0802e(7, 22, 22, 20, 20, new C0805c(20, new C0804b(1, 30))), new C0802e(8, 24, 24, 22, 22, new C0805c(24, new C0804b(1, 36))), new C0802e(9, 26, 26, 24, 24, new C0805c(28, new C0804b(1, 44))), new C0802e(10, 32, 32, 14, 14, new C0805c(36, new C0804b(1, 62))), new C0802e(11, 36, 36, 16, 16, new C0805c(42, new C0804b(1, 86))), new C0802e(12, 40, 40, 18, 18, new C0805c(48, new C0804b(1, 114))), new C0802e(13, 44, 44, 20, 20, new C0805c(56, new C0804b(1, Constants.D2F))), new C0802e(14, 48, 48, 22, 22, new C0805c(68, new C0804b(1, Constants.FRETURN))), new C0802e(15, 52, 52, 24, 24, new C0805c(42, new C0804b(2, 102))), new C0802e(16, 64, 64, 14, 14, new C0805c(56, new C0804b(2, Constants.F2L))), new C0802e(17, 72, 72, 16, 16, new C0805c(36, new C0804b(4, 92))), new C0802e(18, 80, 80, 18, 18, new C0805c(48, new C0804b(4, 114))), new C0802e(19, 88, 88, 20, 20, new C0805c(56, new C0804b(4, Constants.D2F))), new C0802e(20, 96, 96, 22, 22, new C0805c(68, new C0804b(4, Constants.FRETURN))), new C0802e(21, 104, 104, 24, 24, new C0805c(56, new C0804b(6, Constants.L2I))), new C0802e(22, 120, 120, 18, 18, new C0805c(68, new C0804b(6, Constants.DRETURN))), new C0802e(23, 132, 132, 20, 20, new C0805c(62, new C0804b(8, Constants.IF_ICMPGT))), new C0802e(24, Constants.D2F, Constants.D2F, 22, 22, new C0805c(62, new C0804b(8, Constants.IFGE), new C0804b(2, Constants.IFLT))), new C0802e(25, 8, 18, 6, 16, new C0805c(7, new C0804b(1, 5))), new C0802e(26, 8, 32, 6, 14, new C0805c(11, new C0804b(1, 10))), new C0802e(27, 12, 26, 10, 24, new C0805c(14, new C0804b(1, 16))), new C0802e(28, 12, 36, 10, 16, new C0805c(18, new C0804b(1, 22))), new C0802e(29, 16, 36, 14, 16, new C0805c(24, new C0804b(1, 32))), new C0802e(30, 16, 48, 14, 22, new C0805c(28, new C0804b(1, 49)))};
    }

    /* renamed from: h */
    public static C0802e m1679h(int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            C0802e[] eVarArr = f1653h;
            for (C0802e eVar : eVarArr) {
                if (eVar.f1655b == i && eVar.f1656c == i2) {
                    return eVar;
                }
            }
            throw C0707h.m1320a();
        }
        throw C0707h.m1320a();
    }

    /* renamed from: b */
    public int mo8864b() {
        return this.f1658e;
    }

    /* renamed from: c */
    public int mo8865c() {
        return this.f1657d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0805c mo8866d() {
        return this.f1659f;
    }

    /* renamed from: e */
    public int mo8867e() {
        return this.f1656c;
    }

    /* renamed from: f */
    public int mo8868f() {
        return this.f1655b;
    }

    /* renamed from: g */
    public int mo8869g() {
        return this.f1660g;
    }

    /* renamed from: i */
    public int mo8870i() {
        return this.f1654a;
    }

    public String toString() {
        return String.valueOf(this.f1654a);
    }
}
