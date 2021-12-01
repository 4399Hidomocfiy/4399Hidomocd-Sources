package p013b.p014a.p015a.p025c0.p028e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.e.d */
public final class C0700d {
    /* renamed from: a */
    static int m1283a(C0697b bVar) {
        return m1284b(bVar, true) + m1284b(bVar, false);
    }

    /* renamed from: b */
    private static int m1284b(C0697b bVar, boolean z) {
        int d = z ? bVar.mo8661d() : bVar.mo8662e();
        int e = z ? bVar.mo8662e() : bVar.mo8661d();
        byte[][] c = bVar.mo8660c();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < e; i4++) {
                byte b2 = z ? c[i2][i4] : c[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b = b2;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m1285c(C0697b bVar) {
        byte[][] c = bVar.mo8660c();
        int e = bVar.mo8662e();
        int d = bVar.mo8661d();
        int i = 0;
        for (int i2 = 0; i2 < d - 1; i2++) {
            int i3 = 0;
            while (i3 < e - 1) {
                byte b = c[i2][i3];
                int i4 = i3 + 1;
                if (b == c[i2][i4]) {
                    int i5 = i2 + 1;
                    if (b == c[i5][i3] && b == c[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* renamed from: d */
    static int m1286d(C0697b bVar) {
        byte[][] c = bVar.mo8660c();
        int e = bVar.mo8662e();
        int d = bVar.mo8661d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            for (int i3 = 0; i3 < e; i3++) {
                byte[] bArr = c[i2];
                int i4 = i3 + 6;
                if (i4 < e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m1289g(bArr, i3 - 4, i3) || m1289g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < d && c[i2][i3] == 1 && c[i2 + 1][i3] == 0 && c[i2 + 2][i3] == 1 && c[i2 + 3][i3] == 1 && c[i2 + 4][i3] == 1 && c[i2 + 5][i3] == 0 && c[i5][i3] == 1 && (m1290h(c, i3, i2 - 4, i2) || m1290h(c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: e */
    static int m1287e(C0697b bVar) {
        byte[][] c = bVar.mo8660c();
        int e = bVar.mo8662e();
        int d = bVar.mo8661d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            byte[] bArr = c[i2];
            for (int i3 = 0; i3 < e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int d2 = bVar.mo8661d() * bVar.mo8662e();
        return ((Math.abs((i * 2) - d2) * 10) / d2) * 10;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    static boolean m1288f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: " + i);
        }
        return i4 == 0;
    }

    /* renamed from: g */
    private static boolean m1289g(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (i >= 0 && i < bArr.length && bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m1290h(byte[][] bArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (i2 >= 0 && i2 < bArr.length && bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }
}
