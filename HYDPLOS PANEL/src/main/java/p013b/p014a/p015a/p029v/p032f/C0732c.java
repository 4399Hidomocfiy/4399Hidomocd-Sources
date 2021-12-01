package p013b.p014a.p015a.p029v.p032f;

import p013b.p014a.p015a.p035x.C0775a;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.p037n.C0789a;
import p013b.p014a.p015a.p035x.p037n.C0792d;

/* renamed from: b.a.a.v.f.c */
public final class C0732c {

    /* renamed from: a */
    private static final int[] f1424a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m1401a(C0775a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int k = aVar.mo8778k() / i;
        for (int i3 = 0; i3 < k; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.mo8773g((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m1402b(C0776b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo8801l(i5, i4);
                bVar.mo8801l(i5, i6);
                bVar.mo8801l(i4, i5);
                bVar.mo8801l(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo8801l(i7, i7);
        int i8 = i7 + 1;
        bVar.mo8801l(i8, i7);
        bVar.mo8801l(i7, i8);
        int i9 = i + i2;
        bVar.mo8801l(i9, i7);
        bVar.mo8801l(i9, i8);
        bVar.mo8801l(i9, i9 - 1);
    }

    /* renamed from: c */
    private static void m1403c(C0776b bVar, boolean z, int i, C0775a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.mo8773g(i3)) {
                    bVar.mo8801l(i4, i2 - 5);
                }
                if (aVar.mo8773g(i3 + 7)) {
                    bVar.mo8801l(i2 + 5, i4);
                }
                if (aVar.mo8773g(20 - i3)) {
                    bVar.mo8801l(i4, i2 + 5);
                }
                if (aVar.mo8773g(27 - i3)) {
                    bVar.mo8801l(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.mo8773g(i3)) {
                bVar.mo8801l(i5, i2 - 7);
            }
            if (aVar.mo8773g(i3 + 10)) {
                bVar.mo8801l(i2 + 7, i5);
            }
            if (aVar.mo8773g(29 - i3)) {
                bVar.mo8801l(i5, i2 + 7);
            }
            if (aVar.mo8773g(39 - i3)) {
                bVar.mo8801l(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: d */
    public static C0730a m1404d(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        C0775a aVar;
        int i6;
        C0775a a = new C0733d(bArr).mo8724a();
        int k = ((a.mo8778k() * i) / 100) + 11;
        int k2 = a.mo8778k() + k;
        int i7 = 32;
        int i8 = 0;
        int i9 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (z) {
                i7 = 4;
            }
            if (i4 <= i7) {
                i5 = m1409i(i4, z);
                i3 = f1424a[i4];
                int i10 = i5 - (i5 % i3);
                aVar = m1408h(a, i3);
                if (aVar.mo8778k() + k > i10) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.mo8778k() > i3 * 64) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
        } else {
            C0775a aVar2 = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 <= 32) {
                boolean z2 = i11 <= 3;
                int i13 = z2 ? i11 + 1 : i11;
                int i14 = m1409i(i13, z2);
                if (k2 <= i14) {
                    int[] iArr = f1424a;
                    if (i12 != iArr[i13]) {
                        int i15 = iArr[i13];
                        i12 = i15;
                        aVar2 = m1408h(a, i15);
                    }
                    int i16 = i14 - (i14 % i12);
                    if ((!z2 || aVar2.mo8778k() <= i12 * 64) && aVar2.mo8778k() + k <= i16) {
                        aVar = aVar2;
                        i3 = i12;
                        z = z2;
                        i4 = i13;
                        i5 = i14;
                    }
                }
                i11++;
                i8 = 0;
                i9 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C0775a e = m1405e(aVar, i5, i3);
        int k3 = aVar.mo8778k() / i3;
        C0775a f = m1406f(z, i4, k3);
        int i17 = z ? (i4 * 4) + 11 : (i4 * 4) + 14;
        int[] iArr2 = new int[i17];
        int i18 = 2;
        if (z) {
            for (int i19 = 0; i19 < i17; i19++) {
                iArr2[i19] = i19;
            }
            i6 = i17;
        } else {
            int i20 = i17 / 2;
            i6 = i17 + 1 + (((i20 - 1) / 15) * 2);
            int i21 = i6 / 2;
            for (int i22 = 0; i22 < i20; i22++) {
                int i23 = (i22 / 15) + i22;
                iArr2[(i20 - i22) - 1] = (i21 - i23) - 1;
                iArr2[i20 + i22] = i23 + i21 + i9;
            }
        }
        C0776b bVar = new C0776b(i6);
        int i24 = 0;
        int i25 = 0;
        while (i24 < i4) {
            int i26 = (i4 - i24) * 4;
            int i27 = z ? i26 + 9 : i26 + 12;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i28 * 2;
                while (i8 < i18) {
                    if (e.mo8773g(i25 + i29 + i8)) {
                        int i30 = i24 * 2;
                        bVar.mo8801l(iArr2[i30 + i8], iArr2[i30 + i28]);
                    }
                    if (e.mo8773g((i27 * 2) + i25 + i29 + i8)) {
                        int i31 = i24 * 2;
                        bVar.mo8801l(iArr2[i31 + i28], iArr2[((i17 - 1) - i31) - i8]);
                    }
                    if (e.mo8773g((i27 * 4) + i25 + i29 + i8)) {
                        int i32 = (i17 - 1) - (i24 * 2);
                        bVar.mo8801l(iArr2[i32 - i8], iArr2[i32 - i28]);
                    }
                    if (e.mo8773g((i27 * 6) + i25 + i29 + i8)) {
                        int i33 = i24 * 2;
                        bVar.mo8801l(iArr2[((i17 - 1) - i33) - i28], iArr2[i33 + i8]);
                    }
                    i8++;
                    i18 = 2;
                }
                i28++;
                i8 = 0;
                i18 = 2;
            }
            i25 += i27 * 8;
            i24++;
            i8 = 0;
            i18 = 2;
        }
        m1403c(bVar, z, i6, f);
        int i34 = i6 / 2;
        if (z) {
            m1402b(bVar, i34, 5);
        } else {
            m1402b(bVar, i34, 7);
            int i35 = 0;
            int i36 = 0;
            while (i36 < (i17 / 2) - 1) {
                for (int i37 = i34 & 1; i37 < i6; i37 += 2) {
                    int i38 = i34 - i35;
                    bVar.mo8801l(i38, i37);
                    int i39 = i34 + i35;
                    bVar.mo8801l(i39, i37);
                    bVar.mo8801l(i37, i38);
                    bVar.mo8801l(i37, i39);
                }
                i36 += 15;
                i35 += 16;
            }
        }
        C0730a aVar3 = new C0730a();
        aVar3.mo8718c(z);
        aVar3.mo8721f(i6);
        aVar3.mo8719d(i4);
        aVar3.mo8717b(k3);
        aVar3.mo8720e(bVar);
        return aVar3;
    }

    /* renamed from: e */
    private static C0775a m1405e(C0775a aVar, int i, int i2) {
        C0792d dVar = new C0792d(m1407g(i2));
        int i3 = i / i2;
        int[] a = m1401a(aVar, i2, i3);
        dVar.mo8851b(a, i3 - (aVar.mo8778k() / i2));
        C0775a aVar2 = new C0775a();
        aVar2.mo8768c(0, i % i2);
        for (int i4 : a) {
            aVar2.mo8768c(i4, i2);
        }
        return aVar2;
    }

    /* renamed from: f */
    static C0775a m1406f(boolean z, int i, int i2) {
        int i3;
        C0775a aVar = new C0775a();
        int i4 = i - 1;
        if (z) {
            aVar.mo8768c(i4, 2);
            aVar.mo8768c(i2 - 1, 6);
            i3 = 28;
        } else {
            aVar.mo8768c(i4, 5);
            aVar.mo8768c(i2 - 1, 11);
            i3 = 40;
        }
        return m1405e(aVar, i3, 4);
    }

    /* renamed from: g */
    private static C0789a m1407g(int i) {
        if (i == 4) {
            return C0789a.f1615k;
        }
        if (i == 6) {
            return C0789a.f1614j;
        }
        if (i == 8) {
            return C0789a.f1618n;
        }
        if (i == 10) {
            return C0789a.f1613i;
        }
        if (i != 12) {
            return null;
        }
        return C0789a.f1612h;
    }

    /* renamed from: h */
    static C0775a m1408h(C0775a aVar, int i) {
        C0775a aVar2 = new C0775a();
        int k = aVar.mo8778k();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < k) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= k || aVar.mo8773g(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 != i2) {
                if (i7 == 0) {
                    i7 = i4 | 1;
                } else {
                    aVar2.mo8768c(i4, i);
                    i3 += i;
                }
            }
            aVar2.mo8768c(i7, i);
            i3--;
            i3 += i;
        }
        return aVar2;
    }

    /* renamed from: i */
    private static int m1409i(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }
}
