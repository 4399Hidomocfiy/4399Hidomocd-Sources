package p013b.p014a.p015a.p033w.p034a;

import java.util.regex.Pattern;

/* renamed from: b.a.a.w.a.c0 */
public final class C0743c0 extends AbstractC0765q {

    /* renamed from: a */
    private final String f1440a;

    /* renamed from: b */
    private final String f1441b;

    static {
        Pattern.compile(":/*([^/@]+)@[^/]+");
    }

    public C0743c0(String str, String str2) {
        super(EnumC0766r.URI);
        this.f1440a = m1443e(str);
        this.f1441b = str2;
    }

    /* renamed from: d */
    private static boolean m1442d(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return AbstractC0769u.m1520d(str, i2, indexOf - i2);
    }

    /* renamed from: e */
    private static String m1443e(String str) {
        StringBuilder sb;
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf < 0) {
            sb = new StringBuilder();
        } else if (!m1442d(trim, indexOf)) {
            return trim;
        } else {
            sb = new StringBuilder();
        }
        sb.append("http://");
        sb.append(trim);
        return sb.toString();
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(30);
        AbstractC0765q.m1511b(this.f1441b, sb);
        AbstractC0765q.m1511b(this.f1440a, sb);
        return sb.toString();
    }
}
