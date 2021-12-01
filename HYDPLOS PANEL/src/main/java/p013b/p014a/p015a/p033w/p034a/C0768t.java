package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.p016a0.C0633z;

/* renamed from: b.a.a.w.a.t */
public final class C0768t extends AbstractC0769u {
    /* renamed from: n */
    public C0767s mo8741h(C0716p pVar) {
        EnumC0577a b = pVar.mo8692b();
        if (b != EnumC0577a.UPC_A && b != EnumC0577a.UPC_E && b != EnumC0577a.EAN_8 && b != EnumC0577a.EAN_13) {
            return null;
        }
        String b2 = AbstractC0769u.m1518b(pVar);
        if (!AbstractC0769u.m1519c(b2, b2.length())) {
            return null;
        }
        return new C0767s(b2, (b == EnumC0577a.UPC_E && b2.length() == 8) ? C0633z.m953r(b2) : b2);
    }
}
