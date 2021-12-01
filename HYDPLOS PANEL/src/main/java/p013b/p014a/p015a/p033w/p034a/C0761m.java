package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.m */
public final class C0761m extends AbstractC0765q {

    /* renamed from: a */
    private final double f1510a;

    /* renamed from: b */
    private final double f1511b;

    /* renamed from: c */
    private final double f1512c;

    /* renamed from: d */
    private final String f1513d;

    C0761m(double d, double d2, double d3, String str) {
        super(EnumC0766r.GEO);
        this.f1510a = d;
        this.f1511b = d2;
        this.f1512c = d3;
        this.f1513d = str;
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f1510a);
        sb.append(", ");
        sb.append(this.f1511b);
        if (this.f1512c > 0.0d) {
            sb.append(", ");
            sb.append(this.f1512c);
            sb.append('m');
        }
        if (this.f1513d != null) {
            sb.append(" (");
            sb.append(this.f1513d);
            sb.append(')');
        }
        return sb.toString();
    }
}
