package p013b.p014a.p015a.p042z;

import java.util.Map;
import p013b.p014a.p015a.AbstractC0714n;
import p013b.p014a.p015a.C0663c;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.EnumC0717q;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;
import p013b.p014a.p015a.p042z.p043b.C0827c;

/* renamed from: b.a.a.z.a */
public final class C0824a implements AbstractC0714n {

    /* renamed from: b */
    private static final C0718r[] f1701b = new C0718r[0];

    /* renamed from: a */
    private final C0827c f1702a = new C0827c();

    /* renamed from: c */
    private static C0776b m1789c(C0776b bVar) {
        int[] f = bVar.mo8794f();
        if (f != null) {
            int i = f[0];
            int i2 = f[1];
            int i3 = f[2];
            int i4 = f[3];
            C0776b bVar2 = new C0776b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo8791d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo8801l(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw C0712l.m1333a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: a */
    public C0716p mo8489a(C0663c cVar, Map<EnumC0704e, ?> map) {
        if (map == null || !map.containsKey(EnumC0704e.PURE_BARCODE)) {
            throw C0712l.m1333a();
        }
        C0779e b = this.f1702a.mo8925b(m1789c(cVar.mo8597a()), map);
        C0716p pVar = new C0716p(b.mo8816g(), b.mo8813d(), f1701b, EnumC0577a.MAXICODE);
        String b2 = b.mo8811b();
        if (b2 != null) {
            pVar.mo8698h(EnumC0717q.ERROR_CORRECTION_LEVEL, b2);
        }
        return pVar;
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: b */
    public void mo8434b() {
    }
}
