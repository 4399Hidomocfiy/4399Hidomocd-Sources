package p013b.p014a.p015a.p033w.p034a;

import java.util.Map;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.i */
public final class C0754i extends AbstractC0769u {
    /* renamed from: n */
    public C0752h mo8741h(C0716p pVar) {
        String str;
        String b = AbstractC0769u.m1518b(pVar);
        String str2 = null;
        if (b.startsWith("mailto:") || b.startsWith("MAILTO:")) {
            String substring = b.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            String m = AbstractC0769u.m1528m(substring);
            Map<String, String> j = AbstractC0769u.m1525j(b);
            if (j != null) {
                if (m.isEmpty()) {
                    m = j.get("to");
                }
                str2 = j.get("subject");
                str = j.get("body");
            } else {
                str = null;
            }
            return new C0752h(m, str2, str, b);
        } else if (!C0756j.m1492p(b)) {
            return null;
        } else {
            return new C0752h(b, null, null, "mailto:" + b);
        }
    }
}
