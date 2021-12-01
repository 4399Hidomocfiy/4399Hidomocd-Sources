package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.j0 */
public final class C0757j0 extends AbstractC0765q {

    /* renamed from: a */
    private final String f1492a;

    /* renamed from: b */
    private final String f1493b;

    /* renamed from: c */
    private final String f1494c;

    /* renamed from: d */
    private final boolean f1495d;

    public C0757j0(String str, String str2, String str3, boolean z) {
        super(EnumC0766r.WIFI);
        this.f1492a = str2;
        this.f1493b = str;
        this.f1494c = str3;
        this.f1495d = z;
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(80);
        AbstractC0765q.m1511b(this.f1492a, sb);
        AbstractC0765q.m1511b(this.f1493b, sb);
        AbstractC0765q.m1511b(this.f1494c, sb);
        AbstractC0765q.m1511b(Boolean.toString(this.f1495d), sb);
        return sb.toString();
    }
}
