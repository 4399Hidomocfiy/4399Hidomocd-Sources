package p013b.p014a.p015a.p038y.p041e;

import android.support.p012v7.widget.ActivityChooserView;
import bsh.org.objectweb.asm.Constants;
import java.util.Arrays;

/* renamed from: b.a.a.y.e.j */
public final class C0819j {
    /* renamed from: a */
    public static int m1756a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m1761f(charAt) || i >= length) {
                        break loop0;
                    }
                    i2++;
                    i++;
                    if (i < length) {
                    }
                }
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6 A[LOOP:1: B:24:0x00b0->B:26:0x00b6, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1757b(java.lang.String r6, p013b.p014a.p015a.p038y.p041e.EnumC0821l r7, p013b.p014a.p015a.C0705f r8, p013b.p014a.p015a.C0705f r9) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p038y.p041e.C0819j.m1757b(java.lang.String, b.a.a.y.e.l, b.a.a.f, b.a.a.f):java.lang.String");
    }

    /* renamed from: c */
    private static int m1758c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: d */
    private static int m1759d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: e */
    static void m1760e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: f */
    static boolean m1761f(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: g */
    static boolean m1762g(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: h */
    private static boolean m1763h(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: i */
    private static boolean m1764i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: j */
    private static boolean m1765j(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: k */
    private static boolean m1766k(char c) {
        return m1768m(c) || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: l */
    private static boolean m1767l(char c) {
        return false;
    }

    /* renamed from: m */
    private static boolean m1768m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* renamed from: n */
    static int m1769n(CharSequence charSequence, int i, int i2) {
        char c;
        if (i >= charSequence.length()) {
            return i2;
        }
        float[] fArr = new float[6];
        if (i2 == 0) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.25f;
        } else {
            // fill-array-data instruction
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int c2 = m1758c(fArr, iArr, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, bArr);
                int d = m1759d(bArr);
                if (iArr[0] == c2) {
                    return 0;
                }
                if (d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d != 1 || bArr[2] <= 0) {
                    return (d != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i4);
            i3++;
            if (m1761f(charAt)) {
                double d2 = (double) fArr[0];
                Double.isNaN(d2);
                fArr[0] = (float) (d2 + 0.5d);
            } else if (m1762g(charAt)) {
                fArr[0] = (float) ((int) Math.ceil((double) fArr[0]));
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) ((int) Math.ceil((double) fArr[0]));
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m1763h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m1762g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m1765j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m1762g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m1766k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m1762g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m1764i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m1762g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m1767l(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m1758c(fArr, iArr2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, bArr2);
                int d3 = m1759d(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (d3 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (d3 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (d3 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i5 = i + i3 + 1; i5 < charSequence.length(); i5++) {
                            char charAt2 = charSequence.charAt(i5);
                            if (m1768m(charAt2)) {
                                return 3;
                            }
                            if (!m1766k(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    private static char m1770o(char c, int i) {
        int i2 = c + ((i * Constants.FCMPL) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
