package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.a0 */
public final class C0739a0 extends AbstractC0769u {
    /* renamed from: n */
    public C0774z mo8741h(C0716p pVar) {
        String str;
        String b = AbstractC0769u.m1518b(pVar);
        if (!b.startsWith("tel:") && !b.startsWith("TEL:")) {
            return null;
        }
        if (b.startsWith("TEL:")) {
            str = "tel:" + b.substring(4);
        } else {
            str = b;
        }
        int indexOf = b.indexOf(63, 4);
        return new C0774z(indexOf < 0 ? b.substring(4) : b.substring(4, indexOf), str, null);
    }
}
