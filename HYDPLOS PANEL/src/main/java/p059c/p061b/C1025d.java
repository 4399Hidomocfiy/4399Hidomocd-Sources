package p059c.p061b;

/* renamed from: c.b.d */
public class C1025d {

    /* renamed from: a */
    private AbstractC1028f f2209a;

    /* renamed from: b */
    private String f2210b;

    /* renamed from: c */
    private final EnumC1026a f2211c;

    /* renamed from: c.b.d$a */
    public enum EnumC1026a {
        WARNING,
        ERROR
    }

    protected C1025d(AbstractC1028f fVar, String str, EnumC1026a aVar) {
        this.f2209a = fVar;
        this.f2210b = str;
        this.f2211c = aVar;
    }

    /* renamed from: a */
    public static C1025d m2848a(AbstractC1028f fVar, String str) {
        if (fVar.mo9972a() > 0) {
            str = String.format("%3d:%2d: %s", Integer.valueOf(fVar.mo9972a()), Integer.valueOf(fVar.mo9973b()), str);
        }
        return new C1025d(fVar, str, EnumC1026a.ERROR);
    }

    /* renamed from: b */
    public String mo9994b() {
        return this.f2210b;
    }

    public String toString() {
        return String.format("%s %s", this.f2211c, this.f2210b);
    }
}
