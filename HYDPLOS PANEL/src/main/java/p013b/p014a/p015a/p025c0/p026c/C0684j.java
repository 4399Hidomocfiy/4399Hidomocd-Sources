package p013b.p014a.p015a.p025c0.p026c;

import android.support.p012v7.widget.ActivityChooserView;
import bsh.org.objectweb.asm.Constants;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.c0.c.j */
public final class C0684j {

    /* renamed from: e */
    private static final int[] f1287e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C0684j[] f1288f = m1202b();

    /* renamed from: a */
    private final int f1289a;

    /* renamed from: b */
    private final int[] f1290b;

    /* renamed from: c */
    private final C0686b[] f1291c;

    /* renamed from: d */
    private final int f1292d;

    /* renamed from: b.a.a.c0.c.j$a */
    public static final class C0685a {

        /* renamed from: a */
        private final int f1293a;

        /* renamed from: b */
        private final int f1294b;

        C0685a(int i, int i2) {
            this.f1293a = i;
            this.f1294b = i2;
        }

        /* renamed from: a */
        public int mo8630a() {
            return this.f1293a;
        }

        /* renamed from: b */
        public int mo8631b() {
            return this.f1294b;
        }
    }

    /* renamed from: b.a.a.c0.c.j$b */
    public static final class C0686b {

        /* renamed from: a */
        private final int f1295a;

        /* renamed from: b */
        private final C0685a[] f1296b;

        C0686b(int i, C0685a... aVarArr) {
            this.f1295a = i;
            this.f1296b = aVarArr;
        }

        /* renamed from: a */
        public C0685a[] mo8632a() {
            return this.f1296b;
        }

        /* renamed from: b */
        public int mo8633b() {
            return this.f1295a;
        }

        /* renamed from: c */
        public int mo8634c() {
            int i = 0;
            for (C0685a aVar : this.f1296b) {
                i += aVar.mo8630a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo8635d() {
            return this.f1295a * mo8634c();
        }
    }

    private C0684j(int i, int[] iArr, C0686b... bVarArr) {
        this.f1289a = i;
        this.f1290b = iArr;
        this.f1291c = bVarArr;
        int b = bVarArr[0].mo8633b();
        C0685a[] a = bVarArr[0].mo8632a();
        int i2 = 0;
        for (C0685a aVar : a) {
            i2 += aVar.mo8630a() * (aVar.mo8631b() + b);
        }
        this.f1292d = i2;
    }

    /* renamed from: b */
    private static C0684j[] m1202b() {
        return new C0684j[]{new C0684j(1, new int[0], new C0686b(7, new C0685a(1, 19)), new C0686b(10, new C0685a(1, 16)), new C0686b(13, new C0685a(1, 13)), new C0686b(17, new C0685a(1, 9))), new C0684j(2, new int[]{6, 18}, new C0686b(10, new C0685a(1, 34)), new C0686b(16, new C0685a(1, 28)), new C0686b(22, new C0685a(1, 22)), new C0686b(28, new C0685a(1, 16))), new C0684j(3, new int[]{6, 22}, new C0686b(15, new C0685a(1, 55)), new C0686b(26, new C0685a(1, 44)), new C0686b(18, new C0685a(2, 17)), new C0686b(22, new C0685a(2, 13))), new C0684j(4, new int[]{6, 26}, new C0686b(20, new C0685a(1, 80)), new C0686b(18, new C0685a(2, 32)), new C0686b(26, new C0685a(2, 24)), new C0686b(16, new C0685a(4, 9))), new C0684j(5, new int[]{6, 30}, new C0686b(26, new C0685a(1, 108)), new C0686b(24, new C0685a(2, 43)), new C0686b(18, new C0685a(2, 15), new C0685a(2, 16)), new C0686b(22, new C0685a(2, 11), new C0685a(2, 12))), new C0684j(6, new int[]{6, 34}, new C0686b(18, new C0685a(2, 68)), new C0686b(16, new C0685a(4, 27)), new C0686b(24, new C0685a(4, 19)), new C0686b(28, new C0685a(4, 15))), new C0684j(7, new int[]{6, 22, 38}, new C0686b(20, new C0685a(2, 78)), new C0686b(18, new C0685a(4, 31)), new C0686b(18, new C0685a(2, 14), new C0685a(4, 15)), new C0686b(26, new C0685a(4, 13), new C0685a(1, 14))), new C0684j(8, new int[]{6, 24, 42}, new C0686b(24, new C0685a(2, 97)), new C0686b(22, new C0685a(2, 38), new C0685a(2, 39)), new C0686b(22, new C0685a(4, 18), new C0685a(2, 19)), new C0686b(26, new C0685a(4, 14), new C0685a(2, 15))), new C0684j(9, new int[]{6, 26, 46}, new C0686b(30, new C0685a(2, 116)), new C0686b(22, new C0685a(3, 36), new C0685a(2, 37)), new C0686b(20, new C0685a(4, 16), new C0685a(4, 17)), new C0686b(24, new C0685a(4, 12), new C0685a(4, 13))), new C0684j(10, new int[]{6, 28, 50}, new C0686b(18, new C0685a(2, 68), new C0685a(2, 69)), new C0686b(26, new C0685a(4, 43), new C0685a(1, 44)), new C0686b(24, new C0685a(6, 19), new C0685a(2, 20)), new C0686b(28, new C0685a(6, 15), new C0685a(2, 16))), new C0684j(11, new int[]{6, 30, 54}, new C0686b(20, new C0685a(4, 81)), new C0686b(30, new C0685a(1, 50), new C0685a(4, 51)), new C0686b(28, new C0685a(4, 22), new C0685a(4, 23)), new C0686b(24, new C0685a(3, 12), new C0685a(8, 13))), new C0684j(12, new int[]{6, 32, 58}, new C0686b(24, new C0685a(2, 92), new C0685a(2, 93)), new C0686b(22, new C0685a(6, 36), new C0685a(2, 37)), new C0686b(26, new C0685a(4, 20), new C0685a(6, 21)), new C0686b(28, new C0685a(7, 14), new C0685a(4, 15))), new C0684j(13, new int[]{6, 34, 62}, new C0686b(26, new C0685a(4, 107)), new C0686b(22, new C0685a(8, 37), new C0685a(1, 38)), new C0686b(24, new C0685a(8, 20), new C0685a(4, 21)), new C0686b(22, new C0685a(12, 11), new C0685a(4, 12))), new C0684j(14, new int[]{6, 26, 46, 66}, new C0686b(30, new C0685a(3, 115), new C0685a(1, 116)), new C0686b(24, new C0685a(4, 40), new C0685a(5, 41)), new C0686b(20, new C0685a(11, 16), new C0685a(5, 17)), new C0686b(24, new C0685a(11, 12), new C0685a(5, 13))), new C0684j(15, new int[]{6, 26, 48, 70}, new C0686b(22, new C0685a(5, 87), new C0685a(1, 88)), new C0686b(24, new C0685a(5, 41), new C0685a(5, 42)), new C0686b(30, new C0685a(5, 24), new C0685a(7, 25)), new C0686b(24, new C0685a(11, 12), new C0685a(7, 13))), new C0684j(16, new int[]{6, 26, 50, 74}, new C0686b(24, new C0685a(5, 98), new C0685a(1, 99)), new C0686b(28, new C0685a(7, 45), new C0685a(3, 46)), new C0686b(24, new C0685a(15, 19), new C0685a(2, 20)), new C0686b(30, new C0685a(3, 15), new C0685a(13, 16))), new C0684j(17, new int[]{6, 30, 54, 78}, new C0686b(28, new C0685a(1, 107), new C0685a(5, 108)), new C0686b(28, new C0685a(10, 46), new C0685a(1, 47)), new C0686b(28, new C0685a(1, 22), new C0685a(15, 23)), new C0686b(28, new C0685a(2, 14), new C0685a(17, 15))), new C0684j(18, new int[]{6, 30, 56, 82}, new C0686b(30, new C0685a(5, 120), new C0685a(1, 121)), new C0686b(26, new C0685a(9, 43), new C0685a(4, 44)), new C0686b(28, new C0685a(17, 22), new C0685a(1, 23)), new C0686b(28, new C0685a(2, 14), new C0685a(19, 15))), new C0684j(19, new int[]{6, 30, 58, 86}, new C0686b(28, new C0685a(3, 113), new C0685a(4, 114)), new C0686b(26, new C0685a(3, 44), new C0685a(11, 45)), new C0686b(26, new C0685a(17, 21), new C0685a(4, 22)), new C0686b(26, new C0685a(9, 13), new C0685a(16, 14))), new C0684j(20, new int[]{6, 34, 62, 90}, new C0686b(28, new C0685a(3, 107), new C0685a(5, 108)), new C0686b(26, new C0685a(3, 41), new C0685a(13, 42)), new C0686b(30, new C0685a(15, 24), new C0685a(5, 25)), new C0686b(28, new C0685a(15, 15), new C0685a(10, 16))), new C0684j(21, new int[]{6, 28, 50, 72, 94}, new C0686b(28, new C0685a(4, 116), new C0685a(4, 117)), new C0686b(26, new C0685a(17, 42)), new C0686b(28, new C0685a(17, 22), new C0685a(6, 23)), new C0686b(30, new C0685a(19, 16), new C0685a(6, 17))), new C0684j(22, new int[]{6, 26, 50, 74, 98}, new C0686b(28, new C0685a(2, 111), new C0685a(7, 112)), new C0686b(28, new C0685a(17, 46)), new C0686b(30, new C0685a(7, 24), new C0685a(16, 25)), new C0686b(24, new C0685a(34, 13))), new C0684j(23, new int[]{6, 30, 54, 78, 102}, new C0686b(30, new C0685a(4, 121), new C0685a(5, 122)), new C0686b(28, new C0685a(4, 47), new C0685a(14, 48)), new C0686b(30, new C0685a(11, 24), new C0685a(14, 25)), new C0686b(30, new C0685a(16, 15), new C0685a(14, 16))), new C0684j(24, new int[]{6, 28, 54, 80, 106}, new C0686b(30, new C0685a(6, 117), new C0685a(4, 118)), new C0686b(28, new C0685a(6, 45), new C0685a(14, 46)), new C0686b(30, new C0685a(11, 24), new C0685a(16, 25)), new C0686b(30, new C0685a(30, 16), new C0685a(2, 17))), new C0684j(25, new int[]{6, 32, 58, 84, 110}, new C0686b(26, new C0685a(8, 106), new C0685a(4, 107)), new C0686b(28, new C0685a(8, 47), new C0685a(13, 48)), new C0686b(30, new C0685a(7, 24), new C0685a(22, 25)), new C0686b(30, new C0685a(22, 15), new C0685a(13, 16))), new C0684j(26, new int[]{6, 30, 58, 86, 114}, new C0686b(28, new C0685a(10, 114), new C0685a(2, 115)), new C0686b(28, new C0685a(19, 46), new C0685a(4, 47)), new C0686b(28, new C0685a(28, 22), new C0685a(6, 23)), new C0686b(30, new C0685a(33, 16), new C0685a(4, 17))), new C0684j(27, new int[]{6, 34, 62, 90, 118}, new C0686b(30, new C0685a(8, 122), new C0685a(4, 123)), new C0686b(28, new C0685a(22, 45), new C0685a(3, 46)), new C0686b(30, new C0685a(8, 23), new C0685a(26, 24)), new C0686b(30, new C0685a(12, 15), new C0685a(28, 16))), new C0684j(28, new int[]{6, 26, 50, 74, 98, 122}, new C0686b(30, new C0685a(3, 117), new C0685a(10, 118)), new C0686b(28, new C0685a(3, 45), new C0685a(23, 46)), new C0686b(30, new C0685a(4, 24), new C0685a(31, 25)), new C0686b(30, new C0685a(11, 15), new C0685a(31, 16))), new C0684j(29, new int[]{6, 30, 54, 78, 102, 126}, new C0686b(30, new C0685a(7, 116), new C0685a(7, 117)), new C0686b(28, new C0685a(21, 45), new C0685a(7, 46)), new C0686b(30, new C0685a(1, 23), new C0685a(37, 24)), new C0686b(30, new C0685a(19, 15), new C0685a(26, 16))), new C0684j(30, new int[]{6, 26, 52, 78, 104, 130}, new C0686b(30, new C0685a(5, 115), new C0685a(10, 116)), new C0686b(28, new C0685a(19, 47), new C0685a(10, 48)), new C0686b(30, new C0685a(15, 24), new C0685a(25, 25)), new C0686b(30, new C0685a(23, 15), new C0685a(25, 16))), new C0684j(31, new int[]{6, 30, 56, 82, 108, Constants.I2F}, new C0686b(30, new C0685a(13, 115), new C0685a(3, 116)), new C0686b(28, new C0685a(2, 46), new C0685a(29, 47)), new C0686b(30, new C0685a(42, 24), new C0685a(1, 25)), new C0686b(30, new C0685a(23, 15), new C0685a(28, 16))), new C0684j(32, new int[]{6, 34, 60, 86, 112, Constants.L2D}, new C0686b(30, new C0685a(17, 115)), new C0686b(28, new C0685a(10, 46), new C0685a(23, 47)), new C0686b(30, new C0685a(10, 24), new C0685a(35, 25)), new C0686b(30, new C0685a(19, 15), new C0685a(35, 16))), new C0684j(33, new int[]{6, 30, 58, 86, 114, Constants.D2I}, new C0686b(30, new C0685a(17, 115), new C0685a(1, 116)), new C0686b(28, new C0685a(14, 46), new C0685a(21, 47)), new C0686b(30, new C0685a(29, 24), new C0685a(19, 25)), new C0686b(30, new C0685a(11, 15), new C0685a(46, 16))), new C0684j(34, new int[]{6, 34, 62, 90, 118, Constants.I2C}, new C0686b(30, new C0685a(13, 115), new C0685a(6, 116)), new C0686b(28, new C0685a(14, 46), new C0685a(23, 47)), new C0686b(30, new C0685a(44, 24), new C0685a(7, 25)), new C0686b(30, new C0685a(59, 16), new C0685a(1, 17))), new C0684j(35, new int[]{6, 30, 54, 78, 102, 126, Constants.FCMPG}, new C0686b(30, new C0685a(12, 121), new C0685a(7, 122)), new C0686b(28, new C0685a(12, 47), new C0685a(26, 48)), new C0686b(30, new C0685a(39, 24), new C0685a(14, 25)), new C0686b(30, new C0685a(22, 15), new C0685a(41, 16))), new C0684j(36, new int[]{6, 24, 50, 76, 102, 128, Constants.IFNE}, new C0686b(30, new C0685a(6, 121), new C0685a(14, 122)), new C0686b(28, new C0685a(6, 47), new C0685a(34, 48)), new C0686b(30, new C0685a(46, 24), new C0685a(10, 25)), new C0686b(30, new C0685a(2, 15), new C0685a(64, 16))), new C0684j(37, new int[]{6, 28, 54, 80, 106, 132, Constants.IFLE}, new C0686b(30, new C0685a(17, 122), new C0685a(4, 123)), new C0686b(28, new C0685a(29, 46), new C0685a(14, 47)), new C0686b(30, new C0685a(49, 24), new C0685a(10, 25)), new C0686b(30, new C0685a(24, 15), new C0685a(46, 16))), new C0684j(38, new int[]{6, 32, 58, 84, 110, Constants.L2I, Constants.IF_ICMPGE}, new C0686b(30, new C0685a(4, 122), new C0685a(18, 123)), new C0686b(28, new C0685a(13, 46), new C0685a(32, 47)), new C0686b(30, new C0685a(48, 24), new C0685a(14, 25)), new C0686b(30, new C0685a(42, 15), new C0685a(32, 16))), new C0684j(39, new int[]{6, 26, 54, 82, 110, Constants.L2D, Constants.IF_ACMPNE}, new C0686b(30, new C0685a(20, 117), new C0685a(4, 118)), new C0686b(28, new C0685a(40, 47), new C0685a(7, 48)), new C0686b(30, new C0685a(43, 24), new C0685a(22, 25)), new C0686b(30, new C0685a(10, 15), new C0685a(67, 16))), new C0684j(40, new int[]{6, 30, 58, 86, 114, Constants.D2I, Constants.TABLESWITCH}, new C0686b(30, new C0685a(19, 118), new C0685a(6, 119)), new C0686b(28, new C0685a(18, 47), new C0685a(31, 48)), new C0686b(30, new C0685a(34, 24), new C0685a(34, 25)), new C0686b(30, new C0685a(20, 15), new C0685a(61, 16)))};
    }

    /* renamed from: c */
    static C0684j m1203c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        while (true) {
            int[] iArr = f1287e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m1205i(i2 + 7);
                }
                int e = C0681g.m1195e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m1205i(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C0684j m1204g(int i) {
        if (i % 4 == 1) {
            try {
                return m1205i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C0707h.m1320a();
            }
        } else {
            throw C0707h.m1320a();
        }
    }

    /* renamed from: i */
    public static C0684j m1205i(int i) {
        if (i >= 1 && i <= 40) {
            return f1288f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0776b mo8623a() {
        int e = mo8625e();
        C0776b bVar = new C0776b(e);
        bVar.mo8802m(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo8802m(i, 0, 8, 9);
        bVar.mo8802m(0, i, 9, 8);
        int length = this.f1290b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f1290b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo8802m(this.f1290b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo8802m(6, 9, 1, i5);
        bVar.mo8802m(9, 6, i5, 1);
        if (this.f1289a > 6) {
            int i6 = e - 11;
            bVar.mo8802m(i6, 0, 3, 6);
            bVar.mo8802m(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo8624d() {
        return this.f1290b;
    }

    /* renamed from: e */
    public int mo8625e() {
        return (this.f1289a * 4) + 17;
    }

    /* renamed from: f */
    public C0686b mo8626f(EnumC0680f fVar) {
        return this.f1291c[fVar.ordinal()];
    }

    /* renamed from: h */
    public int mo8627h() {
        return this.f1292d;
    }

    /* renamed from: j */
    public int mo8628j() {
        return this.f1289a;
    }

    public String toString() {
        return String.valueOf(this.f1289a);
    }
}
