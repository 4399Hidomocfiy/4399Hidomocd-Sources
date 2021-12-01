package p013b.p014a.p015a.p016a0;

import java.util.Arrays;
import java.util.Map;
import p013b.p014a.p015a.C0703d;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.g */
public final class C0614g extends AbstractC0624q {

    /* renamed from: c */
    private static final char[] f1121c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    private static final int[] f1122d;

    /* renamed from: e */
    private static final int f1123e;

    /* renamed from: a */
    private final StringBuilder f1124a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f1125b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f1122d = iArr;
        f1123e = iArr[47];
    }

    /* renamed from: h */
    private static void m878h(CharSequence charSequence) {
        int length = charSequence.length();
        m879i(charSequence, length - 2, 20);
        m879i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    private static void m879i(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f1121c[i3 % 47]) {
            throw C0703d.m1317a();
        }
    }

    /* renamed from: j */
    private static String m880j(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 < length - 1) {
                    i2++;
                    char charAt2 = charSequence.charAt(i2);
                    switch (charAt) {
                        case 'a':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 - '@';
                                charAt = (char) i;
                                break;
                            } else {
                                throw C0707h.m1320a();
                            }
                            break;
                        case 'b':
                            if (charAt2 < 'A' || charAt2 > 'E') {
                                if (charAt2 >= 'F' && charAt2 <= 'W') {
                                    i = charAt2 - 11;
                                    charAt = (char) i;
                                    break;
                                } else {
                                    throw C0707h.m1320a();
                                }
                            } else {
                                i = charAt2 - '&';
                                charAt = (char) i;
                            }
                            break;
                        case 'c':
                            if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                                charAt = (char) i;
                                break;
                            } else if (charAt2 == 'Z') {
                                charAt = ':';
                                break;
                            } else {
                                throw C0707h.m1320a();
                            }
                        case 'd':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 + ' ';
                                charAt = (char) i;
                                break;
                            } else {
                                throw C0707h.m1320a();
                            }
                        default:
                            charAt = 0;
                            break;
                    }
                } else {
                    throw C0707h.m1320a();
                }
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: k */
    private int[] m881k(C0775a aVar) {
        int k = aVar.mo8778k();
        int i = aVar.mo8776i(0);
        Arrays.fill(this.f1125b, 0);
        int[] iArr = this.f1125b;
        int length = iArr.length;
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < k) {
            if (aVar.mo8773g(i) ^ z) {
                iArr[i3] = iArr[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (m883m(iArr) == f1123e) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i4] = 0;
                    i3--;
                }
                iArr[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: l */
    private static char m882l(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f1122d;
            if (i2 >= iArr.length) {
                throw C0712l.m1333a();
            } else if (iArr[i2] == i) {
                return f1121c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: m */
    private static int m883m(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        int[] k = m881k(aVar);
        int i2 = aVar.mo8776i(k[1]);
        int k2 = aVar.mo8778k();
        int[] iArr = this.f1125b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f1124a;
        sb.setLength(0);
        while (true) {
            AbstractC0624q.m913f(aVar, i2, iArr);
            int m = m883m(iArr);
            if (m >= 0) {
                char l = m882l(m);
                sb.append(l);
                int i3 = i2;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int i5 = aVar.mo8776i(i3);
                if (l == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i6 = 0;
                    for (int i7 : iArr) {
                        i6 += i7;
                    }
                    if (i5 == k2 || !aVar.mo8773g(i5)) {
                        throw C0712l.m1333a();
                    } else if (sb.length() >= 2) {
                        m878h(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C0716p(m880j(sb), null, new C0718r[]{new C0718r(((float) (k[1] + k[0])) / 2.0f, f), new C0718r(((float) i2) + (((float) i6) / 2.0f), f)}, EnumC0577a.CODE_93);
                    } else {
                        throw C0712l.m1333a();
                    }
                } else {
                    i2 = i5;
                }
            } else {
                throw C0712l.m1333a();
            }
        }
    }
}
