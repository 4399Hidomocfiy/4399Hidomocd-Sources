package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.f */
public final class C0748f extends AbstractC0738a {
    /* renamed from: p */
    public C0743c0 mo8741h(C0716p pVar) {
        String f = pVar.mo8696f();
        if (!f.startsWith("MEBKM:")) {
            return null;
        }
        String o = AbstractC0738a.m1432o("TITLE:", f, true);
        String[] n = AbstractC0738a.m1431n("URL:", f, true);
        if (n == null) {
            return null;
        }
        String str = n[0];
        if (C0745d0.m1446n(str)) {
            return new C0743c0(str, o);
        }
        return null;
    }
}
