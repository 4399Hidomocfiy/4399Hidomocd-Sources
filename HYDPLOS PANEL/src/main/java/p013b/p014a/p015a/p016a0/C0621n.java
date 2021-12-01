package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.a0.n */
public final class C0621n extends AbstractC0625r {

    /* renamed from: a */
    private static final int[] f1136a = {1, 1, 1, 1};

    /* renamed from: b */
    private static final int[] f1137b = {3, 1, 1};

    @Override // p013b.p014a.p015a.AbstractC0720t, p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (aVar == EnumC0577a.ITF) {
            return super.mo8483a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got " + aVar);
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: c */
    public boolean[] mo8482c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The lenght of the input should be even");
        } else if (length <= 80) {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b = AbstractC0625r.m918b(zArr, 0, f1136a, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[18];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = C0620m.f1134e;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                b += AbstractC0625r.m918b(zArr, b, iArr, true);
            }
            AbstractC0625r.m918b(zArr, b, f1137b, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
    }
}
