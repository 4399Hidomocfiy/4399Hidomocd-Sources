package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.k0 */
public final class C0759k0 extends AbstractC0769u {
    /* renamed from: n */
    public C0757j0 mo8741h(C0716p pVar) {
        String f;
        String b = AbstractC0769u.m1518b(pVar);
        if (!b.startsWith("WIFI:") || (f = AbstractC0769u.m1522f("S:", b, ';', false)) == null || f.isEmpty()) {
            return null;
        }
        String f2 = AbstractC0769u.m1522f("P:", b, ';', false);
        String f3 = AbstractC0769u.m1522f("T:", b, ';', false);
        if (f3 == null) {
            f3 = "nopass";
        }
        return new C0757j0(f3, f, f2, Boolean.parseBoolean(AbstractC0769u.m1522f("H:", b, ';', false)));
    }
}
