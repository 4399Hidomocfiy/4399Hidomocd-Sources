package p013b.p014a.p015a.p016a0;

import android.support.p012v7.widget.ActivityChooserView;
import bsh.org.objectweb.asm.Constants;
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

/* renamed from: b.a.a.a0.e */
public final class C0612e extends AbstractC0624q {

    /* renamed from: e */
    private static final char[] f1114e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();

    /* renamed from: f */
    static final int[] f1115f;

    /* renamed from: g */
    private static final int f1116g;

    /* renamed from: a */
    private final boolean f1117a;

    /* renamed from: b */
    private final boolean f1118b;

    /* renamed from: c */
    private final StringBuilder f1119c;

    /* renamed from: d */
    private final int[] f1120d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, Constants.INSTANCEOF, 448, Constants.I2B, 400, 208, 133, 388, 196, Constants.LCMP, Constants.JSR, Constants.IF_ICMPGE, Constants.L2D, 42};
        f1115f = iArr;
        f1116g = iArr[39];
    }

    public C0612e() {
        this(false);
    }

    public C0612e(boolean z) {
        this(z, false);
    }

    public C0612e(boolean z, boolean z2) {
        this.f1117a = z;
        this.f1118b = z2;
        this.f1119c = new StringBuilder(20);
        this.f1120d = new int[9];
    }

    /* renamed from: h */
    private static String m870h(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                charAt = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                            } else if (charAt2 == 'Z') {
                                charAt = ':';
                            } else {
                                throw C0707h.m1320a();
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw C0707h.m1320a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw C0707h.m1320a();
                    } else {
                        i = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw C0707h.m1320a();
                } else {
                    i = charAt2 - '@';
                }
                charAt = (char) i;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: i */
    private static int[] m871i(C0775a aVar, int[] iArr) {
        int k = aVar.mo8778k();
        int i = aVar.mo8776i(0);
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
                } else if (m873k(iArr) != f1116g || !aVar.mo8780m(Math.max(0, i2 - ((i - i2) / 2)), i2, false)) {
                    i2 += iArr[0] + iArr[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i4] = 0;
                    i3--;
                } else {
                    return new int[]{i2, i};
                }
                iArr[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: j */
    private static char m872j(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f1115f;
            if (i2 >= iArr.length) {
                throw C0712l.m1333a();
            } else if (iArr[i2] == i) {
                return f1114e[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: k */
    private static int m873k(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        int[] iArr = this.f1120d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f1119c;
        sb.setLength(0);
        int[] i2 = m871i(aVar, iArr);
        int i3 = aVar.mo8776i(i2[1]);
        int k = aVar.mo8778k();
        while (true) {
            AbstractC0624q.m913f(aVar, i3, iArr);
            int k2 = m873k(iArr);
            if (k2 >= 0) {
                char j = m872j(k2);
                sb.append(j);
                int i4 = i3;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = aVar.mo8776i(i4);
                if (j == '*') {
                    sb.setLength(sb.length() - 1);
                    int i7 = 0;
                    for (int i8 : iArr) {
                        i7 += i8;
                    }
                    int i9 = (i6 - i3) - i7;
                    if (i6 == k || i9 * 2 >= i7) {
                        if (this.f1117a) {
                            int length = sb.length() - 1;
                            int i10 = 0;
                            for (int i11 = 0; i11 < length; i11++) {
                                i10 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(this.f1119c.charAt(i11));
                            }
                            if (sb.charAt(length) == f1114e[i10 % 43]) {
                                sb.setLength(length);
                            } else {
                                throw C0703d.m1317a();
                            }
                        }
                        if (sb.length() != 0) {
                            float f = (float) i;
                            return new C0716p(this.f1118b ? m870h(sb) : sb.toString(), null, new C0718r[]{new C0718r(((float) (i2[1] + i2[0])) / 2.0f, f), new C0718r(((float) i3) + (((float) i7) / 2.0f), f)}, EnumC0577a.CODE_39);
                        }
                        throw C0712l.m1333a();
                    }
                    throw C0712l.m1333a();
                }
                i3 = i6;
            } else {
                throw C0712l.m1333a();
            }
        }
    }
}
