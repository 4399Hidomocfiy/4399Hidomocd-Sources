package p013b.p014a.p015a.p020b0.p021e;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p013b.p014a.p015a.C0703d;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.p020b0.C0635a;
import p013b.p014a.p015a.p020b0.p021e.p022k.C0651a;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;

/* renamed from: b.a.a.b0.e.j */
public final class C0650j {

    /* renamed from: a */
    private static final C0651a f1203a = new C0651a();

    /* renamed from: a */
    private static C0641c m1053a(C0648h hVar) {
        int[] j;
        if (hVar == null || (j = hVar.mo8554j()) == null) {
            return null;
        }
        int p = m1068p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C0642d[] d = hVar.mo8547d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return hVar.mo8544a().mo8515a(i2, i, hVar.mo8555k());
    }

    /* renamed from: b */
    private static void m1054b(C0646f fVar, C0640b[][] bVarArr) {
        C0640b bVar;
        int[] a = bVarArr[0][1].mo8513a();
        int j = (fVar.mo8535j() * fVar.mo8537l()) - m1070r(fVar.mo8536k());
        if (a.length == 0) {
            if (j < 1 || j > 928) {
                throw C0712l.m1333a();
            }
            bVar = bVarArr[0][1];
        } else if (a[0] != j) {
            bVar = bVarArr[0][1];
        } else {
            return;
        }
        bVar.mo8514b(j);
    }

    /* renamed from: c */
    private static int m1055c(C0776b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (((!z || i6 < i) && (z || i6 >= i2)) || z != bVar.mo8791d(i6, i4)) {
                    i5 = -i5;
                    z = !z;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    private static boolean m1056d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m1057e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f1203a.mo8557a(iArr, i, iArr2);
        }
        throw C0703d.m1317a();
    }

    /* renamed from: f */
    private static C0640b[][] m1058f(C0646f fVar) {
        int c;
        int l = fVar.mo8537l();
        int[] iArr = new int[2];
        iArr[1] = fVar.mo8535j() + 2;
        iArr[0] = l;
        C0640b[][] bVarArr = (C0640b[][]) Array.newInstance(C0640b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C0640b();
            }
        }
        C0647g[] o = fVar.mo8540o();
        int i3 = 0;
        for (C0647g gVar : o) {
            if (gVar != null) {
                C0642d[] d = gVar.mo8547d();
                for (C0642d dVar : d) {
                    if (dVar != null && (c = dVar.mo8526c()) >= 0) {
                        if (c < bVarArr.length) {
                            bVarArr[c][i3].mo8514b(dVar.mo8528e());
                        } else {
                            throw C0707h.m1320a();
                        }
                    }
                }
                continue;
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C0779e m1059g(C0646f fVar) {
        C0640b[][] f = m1058f(fVar);
        m1054b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo8537l() * fVar.mo8535j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo8537l(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo8535j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo8513a();
                int j = (fVar.mo8535j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m1060h(fVar.mo8536k(), iArr, C0635a.m966c(arrayList), C0635a.m966c(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C0779e m1060h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m1062j(iArr, i, iArr2);
                } catch (C0703d unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw C0703d.m1317a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C0703d.m1317a();
                    }
                }
            } else {
                throw C0703d.m1317a();
            }
        }
    }

    /* renamed from: i */
    public static C0779e m1061i(C0776b bVar, C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C0648h hVar = null;
        C0648h hVar2 = null;
        C0646f fVar = null;
        C0641c cVar = new C0641c(bVar, rVar, rVar2, rVar3, rVar4);
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            if (rVar != null) {
                hVar = m1071s(bVar, cVar, rVar, true, i, i2);
            }
            if (rVar3 != null) {
                hVar2 = m1071s(bVar, cVar, rVar3, false, i, i2);
            }
            fVar = m1074v(hVar, hVar2);
            if (fVar == null) {
                throw C0712l.m1333a();
            } else if (i6 != 0 || fVar.mo8538m() == null || (fVar.mo8538m().mo8521h() >= cVar.mo8521h() && fVar.mo8538m().mo8519f() <= cVar.mo8519f())) {
                fVar.mo8541p(cVar);
            } else {
                cVar = fVar.mo8538m();
                i6++;
            }
        }
        fVar.mo8541p(cVar);
        int j = fVar.mo8535j() + 1;
        fVar.mo8542q(0, hVar);
        fVar.mo8542q(j, hVar2);
        boolean z = hVar != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= j; i9++) {
            int i10 = z ? i9 : j - i9;
            if (fVar.mo8539n(i10) == null) {
                C0647g hVar3 = (i10 == 0 || i10 == j) ? new C0648h(cVar, i10 == 0) : new C0647g(cVar);
                fVar.mo8542q(i10, hVar3);
                int i11 = -1;
                int h = cVar.mo8521h();
                int i12 = -1;
                while (h <= cVar.mo8519f()) {
                    int t = m1072t(fVar, i10, h, z);
                    if (t >= 0 && t <= cVar.mo8518e()) {
                        i5 = t;
                    } else if (i12 == i11) {
                        i4 = i12;
                        i3 = h;
                        i12 = i4;
                        h = i3 + 1;
                        i11 = -1;
                    } else {
                        i5 = i12;
                    }
                    i4 = i12;
                    C0642d k = m1063k(bVar, cVar.mo8520g(), cVar.mo8518e(), z, i5, h, i7, i8);
                    i3 = h;
                    if (k != null) {
                        hVar3.mo8549f(i3, k);
                        i7 = Math.min(i7, k.mo8529f());
                        i8 = Math.max(i8, k.mo8529f());
                        i12 = i5;
                        h = i3 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    h = i3 + 1;
                    i11 = -1;
                }
            }
        }
        return m1059g(fVar);
    }

    /* renamed from: j */
    private static C0779e m1062j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m1057e(iArr, iArr2, i2);
            m1075w(iArr, i2);
            C0779e b = C0643e.m1012b(iArr, String.valueOf(i));
            b.mo8819j(Integer.valueOf(e));
            b.mo8818i(Integer.valueOf(iArr2.length));
            return b;
        }
        throw C0707h.m1320a();
    }

    /* renamed from: k */
    private static C0642d m1063k(C0776b bVar, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int d;
        int b;
        int c = m1055c(bVar, i, i2, z, i3, i4);
        int[] q = m1069q(bVar, i, i2, z, c, i4);
        if (q == null) {
            return null;
        }
        int a = C0635a.m964a(q);
        if (z) {
            i7 = c + a;
        } else {
            for (int i8 = 0; i8 < q.length / 2; i8++) {
                int i9 = q[i8];
                q[i8] = q[(q.length - 1) - i8];
                q[(q.length - 1) - i8] = i9;
            }
            c -= a;
            i7 = c;
        }
        if (m1056d(a, i5, i6) && (b = C0635a.m965b((d = C0649i.m1051d(q)))) != -1) {
            return new C0642d(c, i7, m1066n(d), b);
        }
        return null;
    }

    /* renamed from: l */
    private static C0639a m1064l(C0648h hVar, C0648h hVar2) {
        C0639a i;
        C0639a i2;
        if (hVar == null || (i = hVar.mo8553i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.mo8553i();
        } else if (hVar2 == null || (i2 = hVar2.mo8553i()) == null || i.mo8508a() == i2.mo8508a() || i.mo8509b() == i2.mo8509b() || i.mo8510c() == i2.mo8510c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m1065m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m1066n(int i) {
        return m1067o(m1065m(i));
    }

    /* renamed from: o */
    private static int m1067o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m1068p(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* renamed from: q */
    private static int[] m1069q(C0776b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (((!z || i3 >= i2) && (z || i3 < i)) || i6 >= 8) {
                if (i6 != 8 || (((z && i3 == i2) || (!z && i3 == i)) && i6 == 7)) {
                    return iArr;
                }
                return null;
            } else if (bVar.mo8791d(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
        }
        return iArr;
    }

    /* renamed from: r */
    private static int m1070r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C0648h m1071s(C0776b bVar, C0641c cVar, C0718r rVar, boolean z, int i, int i2) {
        C0648h hVar = new C0648h(cVar, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int c = (int) rVar.mo8700c();
            int d = (int) rVar.mo8701d();
            while (d <= cVar.mo8519f() && d >= cVar.mo8521h()) {
                C0642d k = m1063k(bVar, 0, bVar.mo8799j(), z, c, d, i, i2);
                if (k != null) {
                    hVar.mo8549f(d, k);
                    c = z ? k.mo8527d() : k.mo8525b();
                }
                d += i4;
            }
            i3++;
        }
        return hVar;
    }

    /* renamed from: t */
    private static int m1072t(C0646f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C0642d dVar = null;
        int i4 = i - i3;
        if (m1073u(fVar, i4)) {
            dVar = fVar.mo8539n(i4).mo8545b(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo8525b() : dVar.mo8527d();
        }
        C0642d c = fVar.mo8539n(i).mo8546c(i2);
        if (c != null) {
            return z ? c.mo8527d() : c.mo8525b();
        }
        if (m1073u(fVar, i4)) {
            c = fVar.mo8539n(i4).mo8546c(i2);
        }
        if (c != null) {
            return z ? c.mo8525b() : c.mo8527d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m1073u(fVar, i)) {
                C0642d[] d = fVar.mo8539n(i).mo8547d();
                for (C0642d dVar2 : d) {
                    if (dVar2 != null) {
                        return (z ? dVar2.mo8525b() : dVar2.mo8527d()) + (i3 * i5 * (dVar2.mo8525b() - dVar2.mo8527d()));
                    }
                }
                i5++;
            } else {
                C0641c m = fVar.mo8538m();
                return z ? m.mo8520g() : m.mo8518e();
            }
        }
    }

    /* renamed from: u */
    private static boolean m1073u(C0646f fVar, int i) {
        return i >= 0 && i <= fVar.mo8535j() + 1;
    }

    /* renamed from: v */
    private static C0646f m1074v(C0648h hVar, C0648h hVar2) {
        C0639a l;
        if ((hVar == null && hVar2 == null) || (l = m1064l(hVar, hVar2)) == null) {
            return null;
        }
        return new C0646f(l, C0641c.m991l(m1053a(hVar), m1053a(hVar2)));
    }

    /* renamed from: w */
    private static void m1075w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C0707h.m1320a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C0707h.m1320a();
            }
        } else {
            throw C0707h.m1320a();
        }
    }
}
