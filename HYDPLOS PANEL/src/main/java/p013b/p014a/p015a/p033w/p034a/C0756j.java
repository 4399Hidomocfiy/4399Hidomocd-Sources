package p013b.p014a.p015a.p033w.p034a;

import java.util.regex.Pattern;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.j */
public final class C0756j extends AbstractC0738a {

    /* renamed from: e */
    private static final Pattern f1491e = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* renamed from: p */
    static boolean m1492p(String str) {
        return str != null && f1491e.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    /* renamed from: q */
    public C0752h mo8741h(C0716p pVar) {
        String[] n;
        String b = AbstractC0769u.m1518b(pVar);
        if (!b.startsWith("MATMSG:") || (n = AbstractC0738a.m1431n("TO:", b, true)) == null) {
            return null;
        }
        String str = n[0];
        if (!m1492p(str)) {
            return null;
        }
        String o = AbstractC0738a.m1432o("SUB:", b, false);
        String o2 = AbstractC0738a.m1432o("BODY:", b, false);
        return new C0752h(str, o, o2, "mailto:" + str);
    }
}
