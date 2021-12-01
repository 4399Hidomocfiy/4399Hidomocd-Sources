package p013b.p014a.p015a.p016a0;

import java.util.Arrays;

/* renamed from: b.a.a.a0.b */
public final class C0609b extends AbstractC0625r {

    /* renamed from: a */
    private static final char[] f1110a = {'A', 'B', 'C', 'D'};

    /* renamed from: b */
    private static final char[] f1111b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    private static final char[] f1112c = {'/', ':', '+', '.'};

    @Override // p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: c */
    public boolean[] mo8482c(String str) {
        int i;
        if (str.length() >= 2) {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f1110a;
            boolean z = C0578a.m733h(cArr, upperCase) && C0578a.m733h(cArr, upperCase2);
            char[] cArr2 = f1111b;
            boolean z2 = C0578a.m733h(cArr2, upperCase) && C0578a.m733h(cArr2, upperCase2);
            if (z || z2) {
                int i2 = 20;
                for (int i3 = 1; i3 < str.length() - 1; i3++) {
                    if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                        i2 += 9;
                    } else if (C0578a.m733h(f1112c, str.charAt(i3))) {
                        i2 += 10;
                    } else {
                        throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                    }
                }
                boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
                int i4 = 0;
                for (int i5 = 0; i5 < str.length(); i5++) {
                    char upperCase3 = Character.toUpperCase(str.charAt(i5));
                    if (i5 == 0 || i5 == str.length() - 1) {
                        if (upperCase3 == '*') {
                            upperCase3 = 'C';
                        } else if (upperCase3 == 'E') {
                            upperCase3 = 'D';
                        } else if (upperCase3 == 'N') {
                            upperCase3 = 'B';
                        } else if (upperCase3 == 'T') {
                            upperCase3 = 'A';
                        }
                    }
                    int i6 = 0;
                    while (true) {
                        char[] cArr3 = C0578a.f1039d;
                        if (i6 >= cArr3.length) {
                            i = 0;
                            break;
                        } else if (upperCase3 == cArr3[i6]) {
                            i = C0578a.f1040e[i6];
                            break;
                        } else {
                            i6++;
                        }
                    }
                    int i7 = 0;
                    boolean z3 = true;
                    while (true) {
                        int i8 = 0;
                        while (i7 < 7) {
                            zArr[i4] = z3;
                            i4++;
                            if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                                z3 = !z3;
                                i7++;
                            } else {
                                i8++;
                            }
                        }
                        break;
                    }
                    if (i5 < str.length() - 1) {
                        zArr[i4] = false;
                        i4++;
                    }
                }
                return zArr;
            }
            throw new IllegalArgumentException("Codabar should start/end with " + Arrays.toString(cArr) + ", or start/end with " + Arrays.toString(cArr2));
        }
        throw new IllegalArgumentException("Codabar should start/end with start/stop symbols");
    }
}
