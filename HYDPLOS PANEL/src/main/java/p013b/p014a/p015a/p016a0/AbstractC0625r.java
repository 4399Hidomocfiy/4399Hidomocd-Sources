package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.AbstractC0720t;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.a0.r */
public abstract class AbstractC0625r implements AbstractC0720t {
    /* renamed from: b */
    protected static int m918b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: e */
    private static C0776b m919e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C0776b bVar = new C0776b(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.mo8802m(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    @Override // p013b.p014a.p015a.AbstractC0720t
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        Integer num;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            int d = mo8490d();
            if (!(map == null || (num = (Integer) map.get(EnumC0706g.MARGIN)) == null)) {
                d = num.intValue();
            }
            return m919e(mo8482c(str), i, i2, d);
        }
    }

    /* renamed from: c */
    public abstract boolean[] mo8482c(String str);

    /* renamed from: d */
    public int mo8490d() {
        return 10;
    }
}
