package p013b.p014a.p015a.p020b0.p021e;

import java.lang.reflect.Array;
import p013b.p014a.p015a.p020b0.C0635a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.i */
public final class C0649i {

    /* renamed from: a */
    private static final float[][] f1202a;

    static {
        int i;
        int length = C0635a.f1162b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f1202a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C0635a.f1162b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f1202a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m1048a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m1049b(int[] iArr) {
        int a = C0635a.m964a(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = ((float) iArr[i]) / ((float) a);
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f1202a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C0635a.f1162b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m1050c(int[] iArr) {
        int a = m1048a(iArr);
        if (C0635a.m965b(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    static int m1051d(int[] iArr) {
        int c = m1050c(m1052e(iArr));
        return c != -1 ? c : m1049b(iArr);
    }

    /* renamed from: e */
    private static int[] m1052e(int[] iArr) {
        float a = (float) C0635a.m964a(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (a / 34.0f) + ((((float) i3) * a) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
