package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.w */
public final class C0771w extends AbstractC0765q {

    /* renamed from: a */
    private final String[] f1534a;

    /* renamed from: b */
    private final String f1535b;

    /* renamed from: c */
    private final String f1536c;

    public C0771w(String str, String str2, String str3, String str4) {
        super(EnumC0766r.SMS);
        this.f1534a = new String[]{str};
        this.f1535b = str3;
        this.f1536c = str4;
    }

    public C0771w(String[] strArr, String[] strArr2, String str, String str2) {
        super(EnumC0766r.SMS);
        this.f1534a = strArr;
        this.f1535b = str;
        this.f1536c = str2;
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(100);
        AbstractC0765q.m1512c(this.f1534a, sb);
        AbstractC0765q.m1511b(this.f1535b, sb);
        AbstractC0765q.m1511b(this.f1536c, sb);
        return sb.toString();
    }
}
