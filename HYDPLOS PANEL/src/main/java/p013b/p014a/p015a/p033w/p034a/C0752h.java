package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.h */
public final class C0752h extends AbstractC0765q {

    /* renamed from: a */
    private final String f1479a;

    /* renamed from: b */
    private final String f1480b;

    /* renamed from: c */
    private final String f1481c;

    C0752h(String str, String str2, String str3, String str4) {
        super(EnumC0766r.EMAIL_ADDRESS);
        this.f1479a = str;
        this.f1480b = str2;
        this.f1481c = str3;
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(30);
        AbstractC0765q.m1511b(this.f1479a, sb);
        AbstractC0765q.m1511b(this.f1480b, sb);
        AbstractC0765q.m1511b(this.f1481c, sb);
        return sb.toString();
    }
}
