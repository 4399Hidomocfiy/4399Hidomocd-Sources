package p013b.p014a.p015a.p016a0;

import java.util.ArrayList;
import java.util.Map;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.a0.d */
public final class C0611d extends AbstractC0625r {
    /* renamed from: f */
    private static boolean m867f(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        int length = charSequence.length();
        while (i < i3 && i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 241) {
                    return false;
                }
                i3++;
            }
            i++;
        }
        return i3 <= length;
    }

    @Override // p013b.p014a.p015a.AbstractC0720t, p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (aVar == EnumC0577a.CODE_128) {
            return super.mo8483a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + aVar);
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: c */
    public boolean[] mo8482c(String str) {
        int length = str.length();
        if (length < 1 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    default:
                        throw new IllegalArgumentException("Bad character in input: " + charAt);
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i3 < length) {
            int i7 = 99;
            int i8 = 100;
            if (!m867f(str, i3, i5 == 99 ? 2 : 4)) {
                i7 = 100;
            }
            if (i7 == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        i8 = 102;
                        break;
                    case 242:
                        i8 = 97;
                        break;
                    case 243:
                        i8 = 96;
                        break;
                    case 244:
                        break;
                    default:
                        if (i5 == 100) {
                            i8 = str.charAt(i3) - ' ';
                            break;
                        } else {
                            i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                            i3++;
                            break;
                        }
                }
                i3++;
            } else {
                i8 = i5 == 0 ? i7 == 100 ? 104 : 105 : i7;
                i5 = i7;
            }
            arrayList.add(C0610c.f1113a[i8]);
            i4 += i8 * i6;
            if (i3 != 0) {
                i6++;
            }
        }
        int[][] iArr = C0610c.f1113a;
        arrayList.add(iArr[i4 % 103]);
        arrayList.add(iArr[106]);
        int i9 = 0;
        for (int[] iArr2 : arrayList) {
            for (int i10 : iArr2) {
                i9 += i10;
            }
        }
        boolean[] zArr = new boolean[i9];
        for (int[] iArr3 : arrayList) {
            i += AbstractC0625r.m918b(zArr, i, iArr3, true);
        }
        return zArr;
    }
}
