package p013b.p014a.p015a.p025c0.p028e;

import bsh.org.objectweb.asm.Constants;
import p013b.p014a.p015a.C0721u;
import p013b.p014a.p015a.p025c0.p026c.C0684j;
import p013b.p014a.p015a.p025c0.p026c.EnumC0680f;
import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.e.e */
public final class C0701e {

    /* renamed from: a */
    private static final int[][] f1328a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f1329b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f1330c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, Constants.I2F, -1}, new int[]{6, 34, 60, 86, 112, Constants.L2D, -1}, new int[]{6, 30, 58, 86, 114, Constants.D2I, -1}, new int[]{6, 34, 62, 90, 118, Constants.I2C, -1}, new int[]{6, 30, 54, 78, 102, 126, Constants.FCMPG}, new int[]{6, 24, 50, 76, 102, 128, Constants.IFNE}, new int[]{6, 28, 54, 80, 106, 132, Constants.IFLE}, new int[]{6, 32, 58, 84, 110, Constants.L2I, Constants.IF_ICMPGE}, new int[]{6, 26, 54, 82, 110, Constants.L2D, Constants.IF_ACMPNE}, new int[]{6, 30, 58, 86, 114, Constants.D2I, Constants.TABLESWITCH}};

    /* renamed from: d */
    private static final int[][] f1331d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static void m1291a(C0775a aVar, EnumC0680f fVar, C0684j jVar, int i, C0697b bVar) {
        m1293c(bVar);
        m1294d(jVar, bVar);
        m1302l(fVar, i, bVar);
        m1309s(jVar, bVar);
        m1296f(aVar, i, bVar);
    }

    /* renamed from: b */
    static int m1292b(int i, int i2) {
        if (i2 != 0) {
            int n = m1304n(i2);
            int i3 = i << (n - 1);
            while (m1304n(i3) >= n) {
                i3 ^= i2 << (m1304n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    static void m1293c(C0697b bVar) {
        bVar.mo8658a((byte) -1);
    }

    /* renamed from: d */
    static void m1294d(C0684j jVar, C0697b bVar) {
        m1300j(bVar);
        m1295e(bVar);
        m1308r(jVar, bVar);
        m1301k(bVar);
    }

    /* renamed from: e */
    private static void m1295e(C0697b bVar) {
        if (bVar.mo8659b(8, bVar.mo8661d() - 8) != 0) {
            bVar.mo8663f(8, bVar.mo8661d() - 8, 1);
            return;
        }
        throw new C0721u();
    }

    /* renamed from: f */
    static void m1296f(C0775a aVar, int i, C0697b bVar) {
        boolean z;
        int e = bVar.mo8662e() - 1;
        int d = bVar.mo8661d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d >= 0 && d < bVar.mo8661d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (m1305o(bVar.mo8659b(i5, d))) {
                        if (i2 < aVar.mo8778k()) {
                            z = aVar.mo8773g(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C0700d.m1288f(i, i5, d)) {
                            z = !z;
                        }
                        bVar.mo8664g(i5, d, z);
                    }
                }
                d += i3;
            }
            i3 = -i3;
            d += i3;
            e -= 2;
        }
        if (i2 != aVar.mo8778k()) {
            throw new C0721u("Not all bits consumed: " + i2 + '/' + aVar.mo8778k());
        }
    }

    /* renamed from: g */
    private static void m1297g(int i, int i2, C0697b bVar) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (m1305o(bVar.mo8659b(i4, i2))) {
                bVar.mo8663f(i4, i2, 0);
            } else {
                throw new C0721u();
            }
        }
    }

    /* renamed from: h */
    private static void m1298h(int i, int i2, C0697b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo8663f(i + i4, i2 + i3, f1329b[i3][i4]);
            }
        }
    }

    /* renamed from: i */
    private static void m1299i(int i, int i2, C0697b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo8663f(i + i4, i2 + i3, f1328a[i3][i4]);
            }
        }
    }

    /* renamed from: j */
    private static void m1300j(C0697b bVar) {
        int length = f1328a[0].length;
        m1299i(0, 0, bVar);
        m1299i(bVar.mo8662e() - length, 0, bVar);
        m1299i(0, bVar.mo8662e() - length, bVar);
        m1297g(0, 7, bVar);
        m1297g(bVar.mo8662e() - 8, 7, bVar);
        m1297g(0, bVar.mo8662e() - 8, bVar);
        m1303m(7, 0, bVar);
        m1303m((bVar.mo8661d() - 7) - 1, 0, bVar);
        m1303m(7, bVar.mo8661d() - 7, bVar);
    }

    /* renamed from: k */
    private static void m1301k(C0697b bVar) {
        int i = 8;
        while (i < bVar.mo8662e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m1305o(bVar.mo8659b(i, 6))) {
                bVar.mo8663f(i, 6, i3);
            }
            if (m1305o(bVar.mo8659b(6, i))) {
                bVar.mo8663f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    static void m1302l(EnumC0680f fVar, int i, C0697b bVar) {
        C0775a aVar = new C0775a();
        m1306p(fVar, i, aVar);
        for (int i2 = 0; i2 < aVar.mo8778k(); i2++) {
            boolean g = aVar.mo8773g((aVar.mo8778k() - 1) - i2);
            int[][] iArr = f1331d;
            bVar.mo8664g(iArr[i2][0], iArr[i2][1], g);
            if (i2 < 8) {
                bVar.mo8664g((bVar.mo8662e() - i2) - 1, 8, g);
            } else {
                bVar.mo8664g(8, (bVar.mo8661d() - 7) + (i2 - 8), g);
            }
        }
    }

    /* renamed from: m */
    private static void m1303m(int i, int i2, C0697b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (m1305o(bVar.mo8659b(i, i4))) {
                bVar.mo8663f(i, i4, 0);
            } else {
                throw new C0721u();
            }
        }
    }

    /* renamed from: n */
    static int m1304n(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    /* renamed from: o */
    private static boolean m1305o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    static void m1306p(EnumC0680f fVar, int i, C0775a aVar) {
        if (C0702f.m1310b(i)) {
            int b = (fVar.mo8615b() << 3) | i;
            aVar.mo8768c(b, 5);
            aVar.mo8768c(m1292b(b, 1335), 10);
            C0775a aVar2 = new C0775a();
            aVar2.mo8768c(21522, 15);
            aVar.mo8785s(aVar2);
            if (aVar.mo8778k() != 15) {
                throw new C0721u("should not happen but we got: " + aVar.mo8778k());
            }
            return;
        }
        throw new C0721u("Invalid mask pattern");
    }

    /* renamed from: q */
    static void m1307q(C0684j jVar, C0775a aVar) {
        aVar.mo8768c(jVar.mo8628j(), 6);
        aVar.mo8768c(m1292b(jVar.mo8628j(), 7973), 12);
        if (aVar.mo8778k() != 18) {
            throw new C0721u("should not happen but we got: " + aVar.mo8778k());
        }
    }

    /* renamed from: r */
    private static void m1308r(C0684j jVar, C0697b bVar) {
        if (jVar.mo8628j() >= 2) {
            int j = jVar.mo8628j() - 1;
            int[][] iArr = f1330c;
            int[] iArr2 = iArr[j];
            int length = iArr[j].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr2[i];
                    int i4 = iArr2[i2];
                    if (!(i4 == -1 || i3 == -1 || !m1305o(bVar.mo8659b(i4, i3)))) {
                        m1298h(i4 - 2, i3 - 2, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m1309s(C0684j jVar, C0697b bVar) {
        if (jVar.mo8628j() >= 7) {
            C0775a aVar = new C0775a();
            m1307q(jVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean g = aVar.mo8773g(i);
                    i--;
                    bVar.mo8664g(i2, (bVar.mo8661d() - 11) + i3, g);
                    bVar.mo8664g((bVar.mo8661d() - 11) + i3, i2, g);
                }
            }
        }
    }
}
