package p013b.p014a.p015a.p020b0.p023f;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p013b.p014a.p015a.C0663c;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.b0.f.a */
public final class C0654a {

    /* renamed from: a */
    private static final int[] f1213a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f1214b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f1215c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f1216d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m1100a(C0718r[] rVarArr, C0718r[] rVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            rVarArr[iArr[i]] = rVarArr2[i];
        }
    }

    /* renamed from: b */
    public static C0655b m1101b(C0663c cVar, Map<EnumC0704e, ?> map, boolean z) {
        C0776b a = cVar.mo8597a();
        List<C0718r[]> c = m1102c(z, a);
        if (c.isEmpty()) {
            a = a.clone();
            a.mo8800k();
            c = m1102c(z, a);
        }
        return new C0655b(a, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r4.hasNext() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r5 = (p013b.p014a.p015a.C0718r[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r5[1] == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo8701d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r5[3] == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo8701d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<p013b.p014a.p015a.C0718r[]> m1102c(boolean r8, p013b.p014a.p015a.p035x.C0776b r9) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p020b0.p023f.C0654a.m1102c(boolean, b.a.a.x.b):java.util.List");
    }

    /* renamed from: d */
    private static int[] m1103d(C0776b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int length = iArr.length;
        int i4 = 0;
        while (bVar.mo8791d(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.mo8791d(i, i2) ^ z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                int i8 = length - 1;
                if (i6 != i8) {
                    i6++;
                } else if (m1106g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m1106g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    private static C0718r[] m1104e(C0776b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        C0718r[] rVarArr = new C0718r[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i) {
                z = false;
                break;
            }
            int[] d = m1103d(bVar, i4, i9, i2, false, iArr, iArr2);
            if (d != null) {
                int[] iArr3 = d;
                int i10 = i9;
                while (true) {
                    if (i10 <= 0) {
                        i8 = i10;
                        break;
                    }
                    int i11 = i10 - 1;
                    int[] d2 = m1103d(bVar, i4, i11, i2, false, iArr, iArr2);
                    if (d2 == null) {
                        i8 = i11 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i10 = i11;
                }
                float f = (float) i8;
                rVarArr[0] = new C0718r((float) iArr3[0], f);
                rVarArr[1] = new C0718r((float) iArr3[1], f);
                i9 = i8;
                z = true;
            } else {
                i9 += 5;
            }
        }
        int i12 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) rVarArr[0].mo8700c(), (int) rVarArr[1].mo8700c()};
            int i13 = i12;
            int i14 = 0;
            while (true) {
                if (i13 >= i) {
                    i6 = i14;
                    i7 = i13;
                    break;
                }
                i6 = i14;
                i7 = i13;
                int[] d3 = m1103d(bVar, iArr4[0], i13, i2, false, iArr, iArr2);
                if (d3 != null && Math.abs(iArr4[0] - d3[0]) < 5 && Math.abs(iArr4[1] - d3[1]) < 5) {
                    iArr4 = d3;
                    i14 = 0;
                } else if (i6 > 25) {
                    break;
                } else {
                    i14 = i6 + 1;
                }
                i13 = i7 + 1;
            }
            i12 = i7 - (i6 + 1);
            float f2 = (float) i12;
            rVarArr[2] = new C0718r((float) iArr4[0], f2);
            rVarArr[3] = new C0718r((float) iArr4[1], f2);
        }
        if (i12 - i9 < 10) {
            for (i5 = 0; i5 < 4; i5++) {
                rVarArr[i5] = null;
            }
        }
        return rVarArr;
    }

    /* renamed from: f */
    private static C0718r[] m1105f(C0776b bVar, int i, int i2) {
        int g = bVar.mo8795g();
        int j = bVar.mo8799j();
        C0718r[] rVarArr = new C0718r[8];
        m1100a(rVarArr, m1104e(bVar, g, j, i, i2, f1215c), f1213a);
        if (rVarArr[4] != null) {
            i2 = (int) rVarArr[4].mo8700c();
            i = (int) rVarArr[4].mo8701d();
        }
        m1100a(rVarArr, m1104e(bVar, g, j, i, i2, f1216d), f1214b);
        return rVarArr;
    }

    /* renamed from: g */
    private static float m1106g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
