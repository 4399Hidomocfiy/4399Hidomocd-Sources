package p013b.p014a.p015a.p020b0.p024g;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;
import p013b.p014a.p015a.C0721u;
import p013b.p014a.p015a.p035x.EnumC0778d;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.g.g */
public final class C0662g {

    /* renamed from: a */
    private static final byte[] f1244a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f1245b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    private static final byte[] f1246c;

    /* renamed from: d */
    private static final byte[] f1247d = new byte[128];

    /* renamed from: e */
    private static final List<String> f1248e = Arrays.asList("Cp437", "IBM437");

    static {
        byte[] bArr = new byte[128];
        f1246c = bArr;
        byte b = 0;
        Arrays.fill(bArr, (byte) -1);
        byte b2 = 0;
        while (true) {
            byte[] bArr2 = f1244a;
            if (b2 >= bArr2.length) {
                break;
            }
            byte b3 = bArr2[b2];
            if (b3 > 0) {
                f1246c[b3] = b2;
            }
            b2 = (byte) (b2 + 1);
        }
        Arrays.fill(f1247d, (byte) -1);
        while (true) {
            byte[] bArr3 = f1245b;
            if (b < bArr3.length) {
                byte b4 = bArr3[b];
                if (b4 > 0) {
                    f1247d[b4] = b;
                }
                b = (byte) (b + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m1132a(CharSequence charSequence, byte[] bArr, int i) {
        int i2;
        int i3;
        int length = charSequence.length();
        int i4 = i;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            int i5 = 0;
            int i6 = 0;
            while (i6 < 13 && m1142k(charAt) && (i3 = i4 + (i6 = i6 + 1)) < length) {
                charAt = charSequence.charAt(i3);
            }
            if (i6 >= 13) {
                return i4 - i;
            }
            while (i5 < 5 && m1145n(charAt) && (i2 = i4 + (i5 = i5 + 1)) < length) {
                charAt = charSequence.charAt(i2);
            }
            if (i5 >= 5) {
                return i4 - i;
            }
            char charAt2 = charSequence.charAt(i4);
            if (bArr[i4] != 63 || charAt2 == '?') {
                i4++;
            } else {
                throw new C0721u("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + ')');
            }
        }
        return i4 - i;
    }

    /* renamed from: b */
    private static int m1133b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m1142k(charAt) || i >= length) {
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

    /* renamed from: c */
    private static int m1134c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m1142k(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 >= 13) {
                return (i2 - i) - i3;
            }
            if (i3 <= 0) {
                if (!m1145n(charSequence.charAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        return i2 - i;
    }

    /* renamed from: d */
    private static void m1135d(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        char c;
        int i4;
        boolean z = true;
        if (i2 == 1 && i3 == 0) {
            c = 913;
        } else {
            if (i2 % 6 != 0) {
                z = false;
            }
            c = z ? (char) 924 : 901;
        }
        sb.append(c);
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: e */
    static String m1136e(String str, EnumC0658c cVar, Charset charset) {
        EnumC0778d a;
        StringBuilder sb = new StringBuilder(str.length());
        if (!(charset == null || f1248e.contains(charset.name()) || (a = EnumC0778d.m1576a(charset.name())) == null)) {
            m1139h(a.mo8809c(), sb);
        }
        int length = str.length();
        byte[] bArr = null;
        if (cVar == EnumC0658c.TEXT) {
            m1138g(str, 0, length, sb, 0);
        } else if (cVar == EnumC0658c.BYTE) {
            byte[] o = m1146o(str, charset);
            m1135d(o, 0, o.length, 1, sb);
        } else if (cVar == EnumC0658c.NUMERIC) {
            sb.append((char) 902);
            m1137f(str, 0, length, sb);
        } else {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int b = m1133b(str, i);
                if (b >= 13) {
                    sb.append((char) 902);
                    m1137f(str, i, b, sb);
                    i += b;
                    i2 = 0;
                    i3 = 2;
                } else {
                    int c = m1134c(str, i);
                    if (c >= 5 || b == length) {
                        if (i3 != 0) {
                            sb.append((char) 900);
                            i2 = 0;
                            i3 = 0;
                        }
                        i2 = m1138g(str, i, c, sb, i2);
                        i += c;
                    } else {
                        if (bArr == null) {
                            bArr = m1146o(str, charset);
                        }
                        int a2 = m1132a(str, bArr, i);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (a2 == 1 && i3 == 0) {
                            m1135d(bArr, i, 1, 0, sb);
                        } else {
                            m1135d(bArr, i, a2, i3, sb);
                            i2 = 0;
                            i3 = 1;
                        }
                        i += a2;
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    private static void m1137f(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2 - 1) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append('1');
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r10 == ' ') goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf A[EDGE_INSN: B:66:0x00cf->B:51:0x00cf ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0011 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m1138g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p020b0.p024g.C0662g.m1138g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: h */
    private static void m1139h(int i, StringBuilder sb) {
        char c;
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            i %= 900;
        } else if (i < 811800) {
            sb.append((char) 925);
            c = (char) (810900 - i);
            sb.append(c);
        } else {
            throw new C0721u("ECI number not in valid range from 0..811799, but was " + i);
        }
        c = (char) i;
        sb.append(c);
    }

    /* renamed from: i */
    private static boolean m1140i(char c) {
        return c == ' ' || (c >= 'a' && c <= 'z');
    }

    /* renamed from: j */
    private static boolean m1141j(char c) {
        return c == ' ' || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: k */
    private static boolean m1142k(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: l */
    private static boolean m1143l(char c) {
        return f1246c[c] != -1;
    }

    /* renamed from: m */
    private static boolean m1144m(char c) {
        return f1247d[c] != -1;
    }

    /* renamed from: n */
    private static boolean m1145n(char c) {
        return c == '\t' || c == '\n' || c == '\r' || (c >= ' ' && c <= '~');
    }

    /* renamed from: o */
    private static byte[] m1146o(String str, Charset charset) {
        if (charset == null) {
            for (String str2 : f1248e) {
                try {
                    charset = Charset.forName(str2);
                } catch (UnsupportedCharsetException unused) {
                }
            }
            if (charset == null) {
                throw new C0721u("No support for any encoding: " + f1248e);
            }
        }
        return str.getBytes(charset);
    }
}
