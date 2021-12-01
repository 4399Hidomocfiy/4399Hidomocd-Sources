package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.a0.k */
public final class C0618k extends AbstractC0632y {
    @Override // p013b.p014a.p015a.AbstractC0720t, p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (aVar == EnumC0577a.EAN_8) {
            return super.mo8483a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got " + aVar);
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0625r
    /* renamed from: c */
    public boolean[] mo8482c(String str) {
        if (str.length() == 8) {
            boolean[] zArr = new boolean[67];
            int b = AbstractC0625r.m918b(zArr, 0, AbstractC0631x.f1150d, true) + 0;
            int i = 0;
            while (i <= 3) {
                int i2 = i + 1;
                b += AbstractC0625r.m918b(zArr, b, AbstractC0631x.f1152f[Integer.parseInt(str.substring(i, i2))], false);
                i = i2;
            }
            int b2 = b + AbstractC0625r.m918b(zArr, b, AbstractC0631x.f1151e, false);
            int i3 = 4;
            while (i3 <= 7) {
                int i4 = i3 + 1;
                b2 += AbstractC0625r.m918b(zArr, b2, AbstractC0631x.f1152f[Integer.parseInt(str.substring(i3, i4))], true);
                i3 = i4;
            }
            AbstractC0625r.m918b(zArr, b2, AbstractC0631x.f1150d, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got " + str.length());
    }
}
