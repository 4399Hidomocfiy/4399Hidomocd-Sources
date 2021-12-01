package p013b.p014a.p015a.p033w.p034a;

import java.util.ArrayList;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.e */
public final class C0746e extends AbstractC0738a {
    /* renamed from: p */
    private static String m1449p(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    /* renamed from: q */
    private static String[] m1450q(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    /* renamed from: r */
    public C0744d mo8741h(C0716p pVar) {
        String b = AbstractC0769u.m1518b(pVar);
        if (!b.startsWith("BIZCARD:")) {
            return null;
        }
        String p = m1449p(AbstractC0738a.m1432o("N:", b, true), AbstractC0738a.m1432o("X:", b, true));
        String o = AbstractC0738a.m1432o("T:", b, true);
        String o2 = AbstractC0738a.m1432o("C:", b, true);
        return new C0744d(AbstractC0769u.m1523g(p), null, null, m1450q(AbstractC0738a.m1432o("B:", b, true), AbstractC0738a.m1432o("M:", b, true), AbstractC0738a.m1432o("F:", b, true)), null, AbstractC0769u.m1523g(AbstractC0738a.m1432o("E:", b, true)), null, null, null, AbstractC0738a.m1431n("A:", b, true), null, o2, null, o, null, null);
    }
}
