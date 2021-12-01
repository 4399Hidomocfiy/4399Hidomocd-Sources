package p013b.p014a.p015a.p033w.p034a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.d0 */
public final class C0745d0 extends AbstractC0769u {

    /* renamed from: e */
    private static final Pattern f1455e = Pattern.compile("[a-zA-Z0-9]{2,}:");

    /* renamed from: f */
    private static final Pattern f1456f = Pattern.compile("([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* renamed from: n */
    static boolean m1446n(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f1455e.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f1456f.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    /* renamed from: o */
    public C0743c0 mo8741h(C0716p pVar) {
        String b = AbstractC0769u.m1518b(pVar);
        if (b.startsWith("URL:") || b.startsWith("URI:")) {
            return new C0743c0(b.substring(4).trim(), null);
        }
        String trim = b.trim();
        if (m1446n(trim)) {
            return new C0743c0(trim, null);
        }
        return null;
    }
}
