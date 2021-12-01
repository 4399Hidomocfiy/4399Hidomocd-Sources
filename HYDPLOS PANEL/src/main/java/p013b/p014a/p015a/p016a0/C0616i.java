package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.a0.i */
public final class C0616i extends AbstractC0632y {
    @Override // p013b.p014a.p015a.AbstractC0720t, p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (aVar == EnumC0577a.EAN_13) {
            return super.mo8483a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got " + aVar);
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: c */
    public boolean[] mo8482c(String str) {
        if (str.length() == 13) {
            try {
                if (AbstractC0631x.m941i(str)) {
                    int i = C0615h.f1126i[Integer.parseInt(str.substring(0, 1))];
                    boolean[] zArr = new boolean[95];
                    int b = AbstractC0625r.m918b(zArr, 0, AbstractC0631x.f1150d, true) + 0;
                    int i2 = 1;
                    while (i2 <= 6) {
                        int i3 = i2 + 1;
                        int parseInt = Integer.parseInt(str.substring(i2, i3));
                        if (((i >> (6 - i2)) & 1) == 1) {
                            parseInt += 10;
                        }
                        b += AbstractC0625r.m918b(zArr, b, AbstractC0631x.f1153g[parseInt], false);
                        i2 = i3;
                    }
                    int b2 = b + AbstractC0625r.m918b(zArr, b, AbstractC0631x.f1151e, false);
                    int i4 = 7;
                    while (i4 <= 12) {
                        int i5 = i4 + 1;
                        b2 += AbstractC0625r.m918b(zArr, b2, AbstractC0631x.f1152f[Integer.parseInt(str.substring(i4, i5))], true);
                        i4 = i5;
                    }
                    AbstractC0625r.m918b(zArr, b2, AbstractC0631x.f1150d, true);
                    return zArr;
                }
                throw new IllegalArgumentException("Contents do not pass checksum");
            } catch (C0707h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 13 digits long, but got " + str.length());
        }
    }
}
