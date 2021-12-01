package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.h0 */
public final class C0753h0 extends AbstractC0765q {

    /* renamed from: a */
    private final String f1482a;

    /* renamed from: b */
    private final String f1483b;

    /* renamed from: c */
    private final String f1484c;

    /* renamed from: d */
    private final String f1485d;

    /* renamed from: e */
    private final int f1486e;

    /* renamed from: f */
    private final char f1487f;

    /* renamed from: g */
    private final String f1488g;

    public C0753h0(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(EnumC0766r.VIN);
        this.f1482a = str2;
        this.f1483b = str3;
        this.f1484c = str4;
        this.f1485d = str5;
        this.f1486e = i;
        this.f1487f = c;
        this.f1488g = str7;
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f1482a);
        sb.append(' ');
        sb.append(this.f1483b);
        sb.append(' ');
        sb.append(this.f1484c);
        sb.append('\n');
        String str = this.f1485d;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f1486e);
        sb.append(' ');
        sb.append(this.f1487f);
        sb.append(' ');
        sb.append(this.f1488g);
        sb.append('\n');
        return sb.toString();
    }
}
