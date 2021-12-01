package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.a0.f */
public final class C0613f extends AbstractC0625r {
    /* renamed from: f */
    private static void m875f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p013b.p014a.p015a.AbstractC0720t, p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (aVar == EnumC0577a.CODE_39) {
            return super.mo8483a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got " + aVar);
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: c */
    public boolean[] mo8482c(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i = length + 25;
            for (int i2 = 0; i2 < length; i2++) {
                int indexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i2));
                if (indexOf >= 0) {
                    m875f(C0612e.f1115f[indexOf], iArr);
                    for (int i3 = 0; i3 < 9; i3++) {
                        i += iArr[i3];
                    }
                } else {
                    throw new IllegalArgumentException("Bad contents: " + str);
                }
            }
            boolean[] zArr = new boolean[i];
            m875f(C0612e.f1115f[39], iArr);
            int b = AbstractC0625r.m918b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b2 = b + AbstractC0625r.m918b(zArr, b, iArr2, false);
            for (int i4 = 0; i4 < length; i4++) {
                m875f(C0612e.f1115f["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i4))], iArr);
                int b3 = b2 + AbstractC0625r.m918b(zArr, b2, iArr, true);
                b2 = b3 + AbstractC0625r.m918b(zArr, b3, iArr2, false);
            }
            m875f(C0612e.f1115f[39], iArr);
            AbstractC0625r.m918b(zArr, b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }
}
