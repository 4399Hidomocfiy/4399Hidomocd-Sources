package p013b.p014a.p015a.p042z.p043b;

import bsh.org.objectweb.asm.Constants;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import p013b.p014a.p015a.p035x.C0779e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.z.b.b */
public final class C0826b {

    /* renamed from: a */
    private static final NumberFormat f1705a = new DecimalFormat("000000000");

    /* renamed from: b */
    private static final NumberFormat f1706b = new DecimalFormat("000");

    /* renamed from: c */
    private static final String[] f1707c = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    static C0779e m1793a(byte[] bArr, int i) {
        String str;
        StringBuilder sb;
        int i2;
        StringBuilder sb2 = new StringBuilder((int) Constants.D2F);
        if (i == 2 || i == 3) {
            int i3 = 0;
            if (i == 2) {
                str = new DecimalFormat("0000000000".substring(0, m1799g(bArr))).format((long) m1798f(bArr));
            } else {
                str = m1800h(bArr);
            }
            NumberFormat numberFormat = f1706b;
            String format = numberFormat.format((long) m1795c(bArr));
            String format2 = numberFormat.format((long) m1801i(bArr));
            sb2.append(m1797e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                i3 = 9;
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
            }
            sb.append(str);
            sb.append((char) 29);
            sb.append(format);
            sb.append((char) 29);
            sb.append(format2);
            sb.append((char) 29);
            sb2.insert(i3, sb.toString());
        } else {
            if (i == 4) {
                i2 = 93;
            } else if (i == 5) {
                i2 = 77;
            }
            sb2.append(m1797e(bArr, 1, i2));
        }
        return new C0779e(bArr, sb2.toString(), null, String.valueOf(i));
    }

    /* renamed from: b */
    private static int m1794b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    private static int m1795c(byte[] bArr) {
        return m1796d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: d */
    private static int m1796d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m1794b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static String m1797e(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i3 < i + i2) {
            char charAt = f1707c[i4].charAt(bArr[i3]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i6 = i4;
                    i4 = charAt - 65520;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65527:
                    i4 = 0;
                    i5 = -1;
                    break;
                case 65528:
                    i4 = 1;
                    i5 = -1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    int i7 = i3 + 1;
                    int i8 = i7 + 1;
                    int i9 = i8 + 1;
                    int i10 = i9 + 1;
                    i3 = i10 + 1;
                    sb.append(f1705a.format((long) ((bArr[i7] << 24) + (bArr[i8] << 18) + (bArr[i9] << 12) + (bArr[i10] << 6) + bArr[i3])));
                    break;
            }
            int i11 = i5 - 1;
            if (i5 == 0) {
                i4 = i6;
            }
            i3++;
            i5 = i11;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: f */
    private static int m1798f(byte[] bArr) {
        return m1796d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    private static int m1799g(byte[] bArr) {
        return m1796d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: h */
    private static String m1800h(byte[] bArr) {
        String[] strArr = f1707c;
        return String.valueOf(new char[]{strArr[0].charAt(m1796d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(m1796d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(m1796d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(m1796d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(m1796d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(m1796d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    private static int m1801i(byte[] bArr) {
        return m1796d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
