package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0577a;

/* renamed from: b.a.a.w.a.p */
public final class C0764p extends AbstractC0769u {
    /* renamed from: n */
    public C0763o mo8741h(C0716p pVar) {
        if (pVar.mo8692b() != EnumC0577a.EAN_13) {
            return null;
        }
        String b = AbstractC0769u.m1518b(pVar);
        if (b.length() != 13) {
            return null;
        }
        if (b.startsWith("978") || b.startsWith("979")) {
            return new C0763o(b);
        }
        return null;
    }
}
