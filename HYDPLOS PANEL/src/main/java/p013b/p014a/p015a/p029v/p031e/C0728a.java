package p013b.p014a.p015a.p029v.p031e;

import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.p029v.C0722a;
import p013b.p014a.p015a.p035x.AbstractC0783i;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.p036m.C0787a;
import p013b.p014a.p015a.p035x.p036m.C0788b;
import p013b.p014a.p015a.p035x.p037n.C0789a;
import p013b.p014a.p015a.p035x.p037n.C0791c;
import p013b.p014a.p015a.p035x.p037n.C0793e;

/* renamed from: b.a.a.v.e.a */
public final class C0728a {

    /* renamed from: g */
    private static final int[] f1412g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C0776b f1413a;

    /* renamed from: b */
    private boolean f1414b;

    /* renamed from: c */
    private int f1415c;

    /* renamed from: d */
    private int f1416d;

    /* renamed from: e */
    private int f1417e;

    /* renamed from: f */
    private int f1418f;

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.v.e.a$a */
    public static final class C0729a {

        /* renamed from: a */
        private final int f1419a;

        /* renamed from: b */
        private final int f1420b;

        C0729a(int i, int i2) {
            this.f1419a = i;
            this.f1420b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo8712a() {
            return this.f1419a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo8713b() {
            return this.f1420b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0718r mo8714c() {
            return new C0718r((float) mo8712a(), (float) mo8713b());
        }

        public String toString() {
            return "<" + this.f1419a + ' ' + this.f1420b + '>';
        }
    }

    public C0728a(C0776b bVar) {
        this.f1413a = bVar;
    }

    /* renamed from: b */
    private static float m1373b(C0718r rVar, C0718r rVar2) {
        return C0787a.m1614a(rVar.mo8700c(), rVar.mo8701d(), rVar2.mo8700c(), rVar2.mo8701d());
    }

    /* renamed from: c */
    private static float m1374c(C0729a aVar, C0729a aVar2) {
        return C0787a.m1615b(aVar.mo8712a(), aVar.mo8713b(), aVar2.mo8712a(), aVar2.mo8713b());
    }

    /* renamed from: d */
    private static C0718r[] m1375d(C0718r[] rVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float c = rVarArr[0].mo8700c() - rVarArr[2].mo8700c();
        float d = rVarArr[0].mo8701d() - rVarArr[2].mo8701d();
        float c2 = (rVarArr[0].mo8700c() + rVarArr[2].mo8700c()) / 2.0f;
        float d2 = (rVarArr[0].mo8701d() + rVarArr[2].mo8701d()) / 2.0f;
        float f4 = c * f3;
        float f5 = d * f3;
        C0718r rVar = new C0718r(c2 + f4, d2 + f5);
        C0718r rVar2 = new C0718r(c2 - f4, d2 - f5);
        float c3 = rVarArr[1].mo8700c() - rVarArr[3].mo8700c();
        float d3 = rVarArr[1].mo8701d() - rVarArr[3].mo8701d();
        float c4 = (rVarArr[1].mo8700c() + rVarArr[3].mo8700c()) / 2.0f;
        float d4 = (rVarArr[1].mo8701d() + rVarArr[3].mo8701d()) / 2.0f;
        float f6 = c3 * f3;
        float f7 = f3 * d3;
        return new C0718r[]{rVar, new C0718r(c4 + f6, d4 + f7), rVar2, new C0718r(c4 - f6, d4 - f7)};
    }

    /* renamed from: e */
    private void m1376e(C0718r[] rVarArr) {
        int i;
        long j;
        long j2;
        if (!m1386o(rVarArr[0]) || !m1386o(rVarArr[1]) || !m1386o(rVarArr[2]) || !m1386o(rVarArr[3])) {
            throw C0712l.m1333a();
        }
        int i2 = this.f1417e * 2;
        int[] iArr = {m1389r(rVarArr[0], rVarArr[1], i2), m1389r(rVarArr[1], rVarArr[2], i2), m1389r(rVarArr[2], rVarArr[3], i2), m1389r(rVarArr[3], rVarArr[0], i2)};
        this.f1418f = m1384m(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f1418f + i3) % 4];
            if (this.f1414b) {
                j2 = j3 << 7;
                j = (long) ((i4 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i4 >> 2) & 992) + ((i4 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m1379h(j3, this.f1414b);
        if (this.f1414b) {
            this.f1415c = (h >> 6) + 1;
            i = h & 63;
        } else {
            this.f1415c = (h >> 11) + 1;
            i = h & 2047;
        }
        this.f1416d = i + 1;
    }

    /* renamed from: f */
    private C0718r[] m1377f(C0729a aVar) {
        this.f1417e = 1;
        C0729a aVar2 = aVar;
        C0729a aVar3 = aVar2;
        C0729a aVar4 = aVar3;
        C0729a aVar5 = aVar4;
        boolean z = true;
        while (this.f1417e < 9) {
            C0729a j = m1381j(aVar2, z, 1, -1);
            C0729a j2 = m1381j(aVar3, z, 1, 1);
            C0729a j3 = m1381j(aVar4, z, -1, 1);
            C0729a j4 = m1381j(aVar5, z, -1, -1);
            if (this.f1417e > 2) {
                double c = (double) ((m1374c(j4, j) * ((float) this.f1417e)) / (m1374c(aVar5, aVar2) * ((float) (this.f1417e + 2))));
                if (c < 0.75d || c > 1.25d || !m1387p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f1417e++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.f1417e;
        if (i == 5 || i == 7) {
            this.f1414b = i == 5;
            C0718r[] rVarArr = {new C0718r(((float) aVar2.mo8712a()) + 0.5f, ((float) aVar2.mo8713b()) - 0.5f), new C0718r(((float) aVar3.mo8712a()) + 0.5f, ((float) aVar3.mo8713b()) + 0.5f), new C0718r(((float) aVar4.mo8712a()) - 0.5f, ((float) aVar4.mo8713b()) + 0.5f), new C0718r(((float) aVar5.mo8712a()) - 0.5f, ((float) aVar5.mo8713b()) - 0.5f)};
            int i2 = this.f1417e;
            return m1375d(rVarArr, (float) ((i2 * 2) - 3), (float) (i2 * 2));
        }
        throw C0712l.m1333a();
    }

    /* renamed from: g */
    private int m1378g(C0729a aVar, C0729a aVar2) {
        float c = m1374c(aVar, aVar2);
        float a = ((float) (aVar2.mo8712a() - aVar.mo8712a())) / c;
        float b = ((float) (aVar2.mo8713b() - aVar.mo8713b())) / c;
        float a2 = (float) aVar.mo8712a();
        float b2 = (float) aVar.mo8713b();
        boolean d = this.f1413a.mo8791d(aVar.mo8712a(), aVar.mo8713b());
        boolean z = false;
        int i = 0;
        for (int i2 = 0; ((float) i2) < c; i2++) {
            a2 += a;
            b2 += b;
            if (this.f1413a.mo8791d(C0787a.m1616c(a2), C0787a.m1616c(b2)) != d) {
                i++;
            }
        }
        float f = ((float) i) / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == d ? 1 : -1;
    }

    /* renamed from: h */
    private static int m1379h(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C0791c(C0789a.f1615k).mo8850a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C0793e unused) {
            throw C0712l.m1333a();
        }
    }

    /* renamed from: i */
    private int m1380i() {
        if (this.f1414b) {
            return (this.f1415c * 4) + 11;
        }
        int i = this.f1415c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C0729a m1381j(C0729a aVar, boolean z, int i, int i2) {
        int a = aVar.mo8712a() + i;
        int b = aVar.mo8713b();
        while (true) {
            b += i2;
            if (!m1385n(a, b) || this.f1413a.mo8791d(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m1385n(i32, i42) && this.f1413a.mo8791d(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m1385n(i5, i42) && this.f1413a.mo8791d(i5, i42) == z) {
            i42 += i2;
        }
        return new C0729a(i5, i42 - i2);
    }

    /* renamed from: k */
    private C0729a m1382k() {
        C0718r rVar;
        C0718r rVar2;
        C0718r rVar3;
        C0718r rVar4;
        C0718r rVar5;
        C0718r rVar6;
        C0718r rVar7;
        C0718r rVar8;
        try {
            C0718r[] c = new C0788b(this.f1413a).mo8828c();
            rVar3 = c[0];
            rVar2 = c[1];
            rVar = c[2];
            rVar4 = c[3];
        } catch (C0712l unused) {
            int j = this.f1413a.mo8799j() / 2;
            int g = this.f1413a.mo8795g() / 2;
            int i = j + 7;
            int i2 = g - 7;
            C0718r c2 = m1381j(new C0729a(i, i2), false, 1, -1).mo8714c();
            int i3 = g + 7;
            C0718r c3 = m1381j(new C0729a(i, i3), false, 1, 1).mo8714c();
            int i4 = j - 7;
            C0718r c4 = m1381j(new C0729a(i4, i3), false, -1, 1).mo8714c();
            rVar4 = m1381j(new C0729a(i4, i2), false, -1, -1).mo8714c();
            rVar = c4;
            rVar3 = c2;
            rVar2 = c3;
        }
        int c5 = C0787a.m1616c((((rVar3.mo8700c() + rVar4.mo8700c()) + rVar2.mo8700c()) + rVar.mo8700c()) / 4.0f);
        int c6 = C0787a.m1616c((((rVar3.mo8701d() + rVar4.mo8701d()) + rVar2.mo8701d()) + rVar.mo8701d()) / 4.0f);
        try {
            C0718r[] c7 = new C0788b(this.f1413a, 15, c5, c6).mo8828c();
            rVar6 = c7[0];
            rVar5 = c7[1];
            rVar7 = c7[2];
            rVar8 = c7[3];
        } catch (C0712l unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            rVar6 = m1381j(new C0729a(i5, i6), false, 1, -1).mo8714c();
            int i7 = c6 + 7;
            rVar5 = m1381j(new C0729a(i5, i7), false, 1, 1).mo8714c();
            int i8 = c5 - 7;
            rVar7 = m1381j(new C0729a(i8, i7), false, -1, 1).mo8714c();
            rVar8 = m1381j(new C0729a(i8, i6), false, -1, -1).mo8714c();
        }
        return new C0729a(C0787a.m1616c((((rVar6.mo8700c() + rVar8.mo8700c()) + rVar5.mo8700c()) + rVar7.mo8700c()) / 4.0f), C0787a.m1616c((((rVar6.mo8701d() + rVar8.mo8701d()) + rVar5.mo8701d()) + rVar7.mo8701d()) / 4.0f));
    }

    /* renamed from: l */
    private C0718r[] m1383l(C0718r[] rVarArr) {
        return m1375d(rVarArr, (float) (this.f1417e * 2), (float) m1380i());
    }

    /* renamed from: m */
    private static int m1384m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f1412g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C0712l.m1333a();
    }

    /* renamed from: n */
    private boolean m1385n(int i, int i2) {
        return i >= 0 && i < this.f1413a.mo8799j() && i2 > 0 && i2 < this.f1413a.mo8795g();
    }

    /* renamed from: o */
    private boolean m1386o(C0718r rVar) {
        return m1385n(C0787a.m1616c(rVar.mo8700c()), C0787a.m1616c(rVar.mo8701d()));
    }

    /* renamed from: p */
    private boolean m1387p(C0729a aVar, C0729a aVar2, C0729a aVar3, C0729a aVar4) {
        C0729a aVar5 = new C0729a(aVar.mo8712a() - 3, aVar.mo8713b() + 3);
        C0729a aVar6 = new C0729a(aVar2.mo8712a() - 3, aVar2.mo8713b() - 3);
        C0729a aVar7 = new C0729a(aVar3.mo8712a() + 3, aVar3.mo8713b() - 3);
        C0729a aVar8 = new C0729a(aVar4.mo8712a() + 3, aVar4.mo8713b() + 3);
        int g = m1378g(aVar8, aVar5);
        return g != 0 && m1378g(aVar5, aVar6) == g && m1378g(aVar6, aVar7) == g && m1378g(aVar7, aVar8) == g;
    }

    /* renamed from: q */
    private C0776b m1388q(C0776b bVar, C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4) {
        AbstractC0783i b = AbstractC0783i.m1599b();
        int i = m1380i();
        float f = ((float) i) / 2.0f;
        int i2 = this.f1417e;
        float f2 = f - ((float) i2);
        float f3 = f + ((float) i2);
        return b.mo8821c(bVar, i, i, f2, f2, f3, f2, f3, f3, f2, f3, rVar.mo8700c(), rVar.mo8701d(), rVar2.mo8700c(), rVar2.mo8701d(), rVar3.mo8700c(), rVar3.mo8701d(), rVar4.mo8700c(), rVar4.mo8701d());
    }

    /* renamed from: r */
    private int m1389r(C0718r rVar, C0718r rVar2, int i) {
        float b = m1373b(rVar, rVar2);
        float f = b / ((float) i);
        float c = rVar.mo8700c();
        float d = rVar.mo8701d();
        float c2 = ((rVar2.mo8700c() - rVar.mo8700c()) * f) / b;
        float d2 = (f * (rVar2.mo8701d() - rVar.mo8701d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f1413a.mo8791d(C0787a.m1616c((f2 * c2) + c), C0787a.m1616c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C0722a mo8711a(boolean z) {
        C0718r[] f = m1377f(m1382k());
        if (z) {
            C0718r rVar = f[0];
            f[0] = f[2];
            f[2] = rVar;
        }
        m1376e(f);
        C0776b bVar = this.f1413a;
        int i = this.f1418f;
        return new C0722a(m1388q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m1383l(f), this.f1414b, this.f1416d, this.f1415c);
    }
}
