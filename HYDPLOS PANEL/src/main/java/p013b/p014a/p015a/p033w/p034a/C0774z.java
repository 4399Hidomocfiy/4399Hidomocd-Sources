package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.z */
public final class C0774z extends AbstractC0765q {

    /* renamed from: a */
    private final String f1537a;

    /* renamed from: b */
    private final String f1538b;

    public C0774z(String str, String str2, String str3) {
        super(EnumC0766r.TEL);
        this.f1537a = str;
        this.f1538b = str3;
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(20);
        AbstractC0765q.m1511b(this.f1537a, sb);
        AbstractC0765q.m1511b(this.f1538b, sb);
        return sb.toString();
    }
}
