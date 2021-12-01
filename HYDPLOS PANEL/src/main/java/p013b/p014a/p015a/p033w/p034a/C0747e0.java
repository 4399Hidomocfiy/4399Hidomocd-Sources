package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.e0 */
public final class C0747e0 extends AbstractC0769u {
    /* renamed from: n */
    public C0743c0 mo8741h(C0716p pVar) {
        int indexOf;
        String b = AbstractC0769u.m1518b(pVar);
        String str = null;
        if ((!b.startsWith("urlto:") && !b.startsWith("URLTO:")) || (indexOf = b.indexOf(58, 6)) < 0) {
            return null;
        }
        if (indexOf > 6) {
            str = b.substring(6, indexOf);
        }
        return new C0743c0(b.substring(indexOf + 1), str);
    }
}
