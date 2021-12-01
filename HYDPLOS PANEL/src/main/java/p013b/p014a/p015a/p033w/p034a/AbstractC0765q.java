package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.q */
public abstract class AbstractC0765q {
    protected AbstractC0765q(EnumC0766r rVar) {
    }

    /* renamed from: b */
    public static void m1511b(String str, StringBuilder sb) {
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(str);
        }
    }

    /* renamed from: c */
    public static void m1512c(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                m1511b(str, sb);
            }
        }
    }

    /* renamed from: a */
    public abstract String mo8744a();

    public final String toString() {
        return mo8744a();
    }
}
