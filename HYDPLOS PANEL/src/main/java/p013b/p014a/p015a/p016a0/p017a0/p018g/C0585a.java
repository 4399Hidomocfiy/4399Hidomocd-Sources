package p013b.p014a.p015a.p016a0.p017a0.p018g;

import java.util.List;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.a0.g.a */
final class C0585a {
    /* renamed from: a */
    static C0775a m771a(List<C0586b> list) {
        int size = (list.size() * 2) - 1;
        if (list.get(list.size() - 1).mo8437d() == null) {
            size--;
        }
        C0775a aVar = new C0775a(size * 12);
        int i = 0;
        int b = list.get(0).mo8437d().mo8422b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo8782p(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C0586b bVar = list.get(i3);
            int b2 = bVar.mo8436c().mo8422b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo8782p(i);
                }
                i++;
            }
            if (bVar.mo8437d() != null) {
                int b3 = bVar.mo8437d().mo8422b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo8782p(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
