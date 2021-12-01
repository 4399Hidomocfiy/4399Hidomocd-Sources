package p013b.p014a.p015a.p035x;

import java.lang.reflect.Array;
import p013b.p014a.p015a.AbstractC0708i;

/* renamed from: b.a.a.x.j */
public final class C0784j extends C0782h {

    /* renamed from: e */
    private C0776b f1593e;

    public C0784j(AbstractC0708i iVar) {
        super(iVar);
    }

    /* renamed from: h */
    private static int[][] m1602h(byte[] bArr, int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 << 3;
            int i7 = i4 - 8;
            if (i6 > i7) {
                i6 = i7;
            }
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 << 3;
                int i10 = i3 - 8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = (i6 * i3) + i9;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 255;
                while (i12 < 8) {
                    for (int i16 = 0; i16 < 8; i16++) {
                        int i17 = bArr[i11 + i16] & 255;
                        i13 += i17;
                        if (i17 < i15) {
                            i15 = i17;
                        }
                        if (i17 > i14) {
                            i14 = i17;
                        }
                    }
                    if (i14 - i15 <= 24) {
                        i12++;
                        i11 += i3;
                    }
                    while (true) {
                        i12++;
                        i11 += i3;
                        if (i12 >= 8) {
                            break;
                        }
                        for (int i18 = 0; i18 < 8; i18++) {
                            i13 += bArr[i11 + i18] & 255;
                        }
                    }
                    i12++;
                    i11 += i3;
                }
                int i19 = i13 >> 6;
                if (i14 - i15 <= 24) {
                    i19 = i15 / 2;
                    if (i5 > 0 && i8 > 0) {
                        int i20 = i5 - 1;
                        int i21 = i8 - 1;
                        int i22 = ((iArr2[i20][i8] + (iArr2[i5][i21] * 2)) + iArr2[i20][i21]) / 4;
                        if (i15 < i22) {
                            i19 = i22;
                        }
                        iArr2[i5][i8] = i19;
                    }
                }
                iArr2[i5][i8] = i19;
            }
        }
        return iArr2;
    }

    /* renamed from: i */
    private static void m1603i(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C0776b bVar) {
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 << 3;
            int i7 = i4 - 8;
            if (i6 > i7) {
                i6 = i7;
            }
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 << 3;
                int i10 = i3 - 8;
                if (i9 <= i10) {
                    i10 = i9;
                }
                int j = m1604j(i8, 2, i - 3);
                int j2 = m1604j(i5, 2, i2 - 3);
                int i11 = 0;
                for (int i12 = -2; i12 <= 2; i12++) {
                    int[] iArr2 = iArr[j2 + i12];
                    i11 += iArr2[j - 2] + iArr2[j - 1] + iArr2[j] + iArr2[j + 1] + iArr2[j + 2];
                }
                m1605k(bArr, i10, i6, i11 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: j */
    private static int m1604j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: k */
    private static void m1605k(byte[] bArr, int i, int i2, int i3, int i4, C0776b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo8801l(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // p013b.p014a.p015a.AbstractC0634b, p013b.p014a.p015a.p035x.C0782h
    /* renamed from: a */
    public C0776b mo8499a() {
        C0776b bVar;
        C0776b bVar2 = this.f1593e;
        if (bVar2 != null) {
            return bVar2;
        }
        AbstractC0708i d = mo8502d();
        int d2 = d.mo8681d();
        int a = d.mo8678a();
        if (d2 < 40 || a < 40) {
            bVar = super.mo8499a();
        } else {
            byte[] b = d.mo8679b();
            int i = d2 >> 3;
            if ((d2 & 7) != 0) {
                i++;
            }
            int i2 = a >> 3;
            if ((a & 7) != 0) {
                i2++;
            }
            int[][] h = m1602h(b, i, i2, d2, a);
            bVar = new C0776b(d2, a);
            m1603i(b, i, i2, d2, a, h, bVar);
        }
        this.f1593e = bVar;
        return this.f1593e;
    }
}
