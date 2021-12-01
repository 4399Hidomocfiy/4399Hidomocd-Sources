package p013b.p014a.p015a.p029v;

import java.nio.charset.Charset;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0720t;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p029v.p032f.C0730a;
import p013b.p014a.p015a.p029v.p032f.C0732c;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.v.c */
public final class C0724c implements AbstractC0720t {

    /* renamed from: a */
    private static final Charset f1397a = Charset.forName("ISO-8859-1");

    /* renamed from: b */
    private static C0776b m1362b(String str, EnumC0577a aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == EnumC0577a.AZTEC) {
            return m1363c(C0732c.m1404d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + aVar);
    }

    /* renamed from: c */
    private static C0776b m1363c(C0730a aVar, int i, int i2) {
        C0776b a = aVar.mo8716a();
        if (a != null) {
            int j = a.mo8799j();
            int g = a.mo8795g();
            int max = Math.max(i, j);
            int max2 = Math.max(i2, g);
            int min = Math.min(max / j, max2 / g);
            int i3 = (max - (j * min)) / 2;
            int i4 = (max2 - (g * min)) / 2;
            C0776b bVar = new C0776b(max, max2);
            int i5 = 0;
            while (i5 < g) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < j) {
                    if (a.mo8791d(i7, i5)) {
                        bVar.mo8802m(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // p013b.p014a.p015a.AbstractC0720t
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        Number number = null;
        String str2 = map == null ? null : (String) map.get(EnumC0706g.CHARACTER_SET);
        Number number2 = map == null ? null : (Number) map.get(EnumC0706g.ERROR_CORRECTION);
        if (map != null) {
            number = (Number) map.get(EnumC0706g.AZTEC_LAYERS);
        }
        return m1362b(str, aVar, i, i2, str2 == null ? f1397a : Charset.forName(str2), number2 == null ? 33 : number2.intValue(), number == null ? 0 : number.intValue());
    }
}
