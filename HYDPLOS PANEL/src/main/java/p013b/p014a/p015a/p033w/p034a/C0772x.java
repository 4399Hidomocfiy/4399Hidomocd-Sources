package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.x */
public final class C0772x extends AbstractC0769u {
    /* renamed from: n */
    public C0771w mo8741h(C0716p pVar) {
        String str;
        String b = AbstractC0769u.m1518b(pVar);
        if (!b.startsWith("smsto:") && !b.startsWith("SMSTO:") && !b.startsWith("mmsto:") && !b.startsWith("MMSTO:")) {
            return null;
        }
        String substring = b.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new C0771w(substring, (String) null, (String) null, str);
    }
}
