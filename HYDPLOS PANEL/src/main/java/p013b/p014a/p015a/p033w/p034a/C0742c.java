package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.c */
public final class C0742c extends AbstractC0738a {
    /* renamed from: q */
    private static String m1439q(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
    }

    /* renamed from: p */
    public C0744d mo8741h(C0716p pVar) {
        String[] n;
        String b = AbstractC0769u.m1518b(pVar);
        if (!b.startsWith("MECARD:") || (n = AbstractC0738a.m1431n("N:", b, true)) == null) {
            return null;
        }
        String q = m1439q(n[0]);
        String o = AbstractC0738a.m1432o("SOUND:", b, true);
        String[] n2 = AbstractC0738a.m1431n("TEL:", b, true);
        String[] n3 = AbstractC0738a.m1431n("EMAIL:", b, true);
        String o2 = AbstractC0738a.m1432o("NOTE:", b, false);
        String[] n4 = AbstractC0738a.m1431n("ADR:", b, true);
        String o3 = AbstractC0738a.m1432o("BDAY:", b, true);
        return new C0744d(AbstractC0769u.m1523g(q), null, o, n2, null, n3, null, null, o2, n4, null, AbstractC0738a.m1432o("ORG:", b, true), !AbstractC0769u.m1519c(o3, 8) ? null : o3, null, AbstractC0738a.m1431n("URL:", b, true), null);
    }
}
