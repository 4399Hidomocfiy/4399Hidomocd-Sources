package p013b.p014a.p015a.p029v.p030d;

import java.util.Arrays;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.p029v.C0722a;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;
import p013b.p014a.p015a.p035x.p037n.C0789a;
import p013b.p014a.p015a.p035x.p037n.C0791c;
import p013b.p014a.p015a.p035x.p037n.C0793e;

/* renamed from: b.a.a.v.d.a */
public final class C0725a {

    /* renamed from: b */
    private static final String[] f1398b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f1399c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f1400d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f1401e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f1402f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C0722a f1403a;

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.v.d.a$a */
    public static /* synthetic */ class C0726a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1404a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                b.a.a.v.d.a$b[] r0 = p013b.p014a.p015a.p029v.p030d.C0725a.EnumC0727b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p013b.p014a.p015a.p029v.p030d.C0725a.C0726a.f1404a = r0
                b.a.a.v.d.a$b r1 = p013b.p014a.p015a.p029v.p030d.C0725a.EnumC0727b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p013b.p014a.p015a.p029v.p030d.C0725a.C0726a.f1404a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.a.a.v.d.a$b r1 = p013b.p014a.p015a.p029v.p030d.C0725a.EnumC0727b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p013b.p014a.p015a.p029v.p030d.C0725a.C0726a.f1404a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.a.a.v.d.a$b r1 = p013b.p014a.p015a.p029v.p030d.C0725a.EnumC0727b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p013b.p014a.p015a.p029v.p030d.C0725a.C0726a.f1404a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.a.a.v.d.a$b r1 = p013b.p014a.p015a.p029v.p030d.C0725a.EnumC0727b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = p013b.p014a.p015a.p029v.p030d.C0725a.C0726a.f1404a     // Catch:{ NoSuchFieldError -> 0x003e }
                b.a.a.v.d.a$b r1 = p013b.p014a.p015a.p029v.p030d.C0725a.EnumC0727b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p029v.p030d.C0725a.C0726a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.v.d.a$b */
    public enum EnumC0727b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    private boolean[] m1365a(boolean[] zArr) {
        C0789a aVar;
        int i = 8;
        if (this.f1403a.mo8707d() <= 2) {
            i = 6;
            aVar = C0789a.f1614j;
        } else if (this.f1403a.mo8707d() <= 8) {
            aVar = C0789a.f1618n;
        } else if (this.f1403a.mo8707d() <= 22) {
            i = 10;
            aVar = C0789a.f1613i;
        } else {
            i = 12;
            aVar = C0789a.f1612h;
        }
        int c = this.f1403a.mo8706c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int i2 = length - c;
            int[] iArr = new int[length];
            int i3 = 0;
            while (i3 < length) {
                iArr[i3] = m1369g(zArr, length2, i);
                i3++;
                length2 += i;
            }
            try {
                new C0791c(aVar).mo8850a(iArr, i2);
                int i4 = (1 << i) - 1;
                int i5 = 0;
                for (int i6 = 0; i6 < c; i6++) {
                    int i7 = iArr[i6];
                    if (i7 == 0 || i7 == i4) {
                        throw C0707h.m1320a();
                    }
                    if (i7 == 1 || i7 == i4 - 1) {
                        i5++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i5)];
                int i8 = 0;
                for (int i9 = 0; i9 < c; i9++) {
                    int i10 = iArr[i9];
                    if (i10 == 1 || i10 == i4 - 1) {
                        Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                        i8 += i - 1;
                    } else {
                        int i11 = i - 1;
                        while (i11 >= 0) {
                            int i12 = i8 + 1;
                            zArr2[i8] = ((1 << i11) & i10) != 0;
                            i11--;
                            i8 = i12;
                        }
                    }
                }
                return zArr2;
            } catch (C0793e unused) {
                throw C0707h.m1320a();
            }
        } else {
            throw C0707h.m1320a();
        }
    }

    /* renamed from: d */
    private static String m1366d(EnumC0727b bVar, int i) {
        int i2 = C0726a.f1404a[bVar.ordinal()];
        if (i2 == 1) {
            return f1398b[i];
        }
        if (i2 == 2) {
            return f1399c[i];
        }
        if (i2 == 3) {
            return f1400d[i];
        }
        if (i2 == 4) {
            return f1401e[i];
        }
        if (i2 == 5) {
            return f1402f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: e */
    private static String m1367e(boolean[] zArr) {
        int length = zArr.length;
        EnumC0727b bVar = EnumC0727b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        EnumC0727b bVar2 = bVar;
        int i = 0;
        while (i < length) {
            if (bVar != EnumC0727b.BINARY) {
                int i2 = bVar == EnumC0727b.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int g = m1369g(zArr, i, i2);
                i += i2;
                String d = m1366d(bVar, g);
                if (d.startsWith("CTRL_")) {
                    EnumC0727b f = m1368f(d.charAt(5));
                    if (d.charAt(6) == 'L') {
                        bVar = f;
                        bVar2 = bVar;
                    } else {
                        bVar = f;
                    }
                } else {
                    sb.append(d);
                }
            } else if (length - i < 5) {
                break;
            } else {
                int g2 = m1369g(zArr, i, 5);
                i += 5;
                if (g2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    g2 = m1369g(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= g2) {
                        break;
                    } else if (length - i < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) m1369g(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
            }
            bVar = bVar2;
        }
        return sb.toString();
    }

    /* renamed from: f */
    private static EnumC0727b m1368f(char c) {
        return c != 'B' ? c != 'D' ? c != 'P' ? c != 'L' ? c != 'M' ? EnumC0727b.UPPER : EnumC0727b.MIXED : EnumC0727b.LOWER : EnumC0727b.PUNCT : EnumC0727b.DIGIT : EnumC0727b.BINARY;
    }

    /* renamed from: g */
    private static int m1369g(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: h */
    private static int m1370h(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    /* renamed from: b */
    public C0779e mo8709b(C0722a aVar) {
        this.f1403a = aVar;
        return new C0779e(null, m1367e(m1365a(mo8710c(aVar.mo8823a()))), null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean[] mo8710c(C0776b bVar) {
        boolean e = this.f1403a.mo8708e();
        int d = this.f1403a.mo8707d();
        int i = e ? (d * 4) + 11 : (d * 4) + 14;
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m1370h(d, e)];
        int i2 = 2;
        if (e) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d) {
            int i10 = (d - i8) * 4;
            int i11 = e ? i10 + 9 : i10 + 12;
            int i12 = i8 * 2;
            int i13 = (i - 1) - i12;
            int i14 = 0;
            while (i14 < i11) {
                int i15 = i14 * 2;
                int i16 = 0;
                while (i16 < i2) {
                    int i17 = i12 + i16;
                    int i18 = i12 + i14;
                    zArr[i9 + i15 + i16] = bVar.mo8791d(iArr[i17], iArr[i18]);
                    int i19 = i13 - i16;
                    zArr[(i11 * 2) + i9 + i15 + i16] = bVar.mo8791d(iArr[i18], iArr[i19]);
                    int i20 = i13 - i14;
                    zArr[(i11 * 4) + i9 + i15 + i16] = bVar.mo8791d(iArr[i19], iArr[i20]);
                    zArr[(i11 * 6) + i9 + i15 + i16] = bVar.mo8791d(iArr[i20], iArr[i17]);
                    i16++;
                    d = d;
                    e = e;
                    i2 = 2;
                }
                i14++;
                i2 = 2;
            }
            i9 += i11 * 8;
            i8++;
            i2 = 2;
        }
        return zArr;
    }
}
