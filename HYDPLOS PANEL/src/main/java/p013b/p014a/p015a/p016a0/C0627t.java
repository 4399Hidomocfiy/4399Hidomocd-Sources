package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.AbstractC0720t;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.a0.t */
public final class C0627t implements AbstractC0720t {

    /* renamed from: a */
    private final C0616i f1141a = new C0616i();

    /* renamed from: b */
    private static String m929b(String str) {
        int length = str.length();
        if (length == 11) {
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                i += (str.charAt(i2) - '0') * (i2 % 2 == 0 ? 3 : 1);
            }
            str = str + ((1000 - i) % 10);
        } else if (length != 12) {
            throw new IllegalArgumentException("Requested contents should be 11 or 12 digits long, but got " + str.length());
        }
        return '0' + str;
    }

    @Override // p013b.p014a.p015a.AbstractC0720t
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (aVar == EnumC0577a.UPC_A) {
            return this.f1141a.mo8483a(m929b(str), EnumC0577a.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
    }
}
