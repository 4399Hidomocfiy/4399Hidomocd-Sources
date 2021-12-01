package p059c.p061b;

/* renamed from: c.b.g */
public class C1029g implements AbstractC1028f {

    /* renamed from: a */
    private EnumC1030a f2216a;

    /* renamed from: b */
    private String f2217b = "";

    /* renamed from: c */
    private String f2218c = null;

    /* renamed from: d */
    private String f2219d = "";

    /* renamed from: e */
    private String f2220e = "";

    /* renamed from: f */
    private int f2221f;

    /* renamed from: g */
    protected int f2222g;

    /* renamed from: c.b.g$a */
    public enum EnumC1030a {
        ID,
        SPECIAL_ID,
        STRING,
        DECIMAL,
        INTEGER,
        SYMBOL,
        KEYWORD,
        EOI
    }

    private C1029g() {
    }

    /* renamed from: g */
    public static C1029g m2853g(EnumC1030a aVar, AbstractC1028f fVar) {
        C1029g gVar = new C1029g();
        gVar.f2216a = aVar;
        gVar.f2221f = fVar.mo9972a();
        gVar.f2222g = fVar.mo9973b();
        return gVar;
    }

    /* renamed from: h */
    public static C1029g m2854h(EnumC1030a aVar, C1022a aVar2) {
        C1029g gVar = new C1029g();
        gVar.f2216a = aVar;
        gVar.f2221f = aVar2.mo9972a();
        gVar.f2222g = aVar2.mo9973b();
        gVar.f2219d = aVar2.mo9974c();
        gVar.f2217b = aVar2.mo9974c();
        gVar.f2220e = aVar2.toString();
        return gVar;
    }

    @Override // p059c.p061b.AbstractC1028f
    /* renamed from: a */
    public int mo9972a() {
        return this.f2221f;
    }

    @Override // p059c.p061b.AbstractC1028f
    /* renamed from: b */
    public int mo9973b() {
        return this.f2222g;
    }

    /* renamed from: c */
    public C1029g mo9997c(char c) {
        this.f2219d += c;
        this.f2220e += c;
        return this;
    }

    /* renamed from: d */
    public C1029g mo9998d(C1022a aVar) {
        mo9997c(aVar.mo9975d());
        return this;
    }

    /* renamed from: e */
    public C1029g mo9999e(C1022a aVar) {
        this.f2220e += aVar.mo9975d();
        return this;
    }

    /* renamed from: f */
    public C1029g mo10000f(C1022a aVar) {
        this.f2217b += aVar.mo9975d();
        this.f2218c = null;
        this.f2220e += aVar.mo9975d();
        return this;
    }

    /* renamed from: i */
    public String mo10001i() {
        return this.f2219d;
    }

    /* renamed from: j */
    public String mo10002j() {
        return this.f2220e;
    }

    /* renamed from: k */
    public String mo10003k() {
        if (this.f2218c == null) {
            this.f2218c = this.f2217b.intern();
        }
        return this.f2218c;
    }

    /* renamed from: l */
    public EnumC1030a mo10004l() {
        return this.f2216a;
    }

    /* renamed from: m */
    public boolean mo10005m(EnumC1030a aVar) {
        return this.f2216a == aVar;
    }

    /* renamed from: n */
    public boolean mo10006n() {
        return mo10005m(EnumC1030a.DECIMAL);
    }

    /* renamed from: o */
    public boolean mo10007o(String... strArr) {
        if (strArr.length == 0) {
            return mo10005m(EnumC1030a.ID);
        }
        for (String str : strArr) {
            if (mo10012t(EnumC1030a.ID, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo10008p() {
        return mo10005m(EnumC1030a.INTEGER);
    }

    /* renamed from: q */
    public boolean mo10009q() {
        return this.f2216a != EnumC1030a.EOI;
    }

    /* renamed from: r */
    public boolean mo10010r() {
        return mo10008p() || mo10006n();
    }

    /* renamed from: s */
    public boolean mo10011s(String... strArr) {
        if (strArr.length == 0) {
            return mo10005m(EnumC1030a.SYMBOL);
        }
        for (String str : strArr) {
            if (mo10012t(EnumC1030a.SYMBOL, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo10012t(EnumC1030a aVar, String str) {
        if (!mo10005m(aVar)) {
            return false;
        }
        if (str != null) {
            return mo10003k() == str.intern();
        }
        throw new IllegalArgumentException("trigger must not be null");
    }

    public String toString() {
        return mo10004l().toString() + ":" + mo10002j() + " (" + this.f2221f + ":" + this.f2222g + ")";
    }

    /* renamed from: u */
    public void mo10014u(String str) {
        this.f2219d = str;
    }

    /* renamed from: v */
    public void mo10015v(String str) {
        this.f2220e = str;
    }

    /* renamed from: w */
    public void mo10016w(String str) {
        this.f2217b = str;
        this.f2218c = null;
    }

    /* renamed from: x */
    public C1029g mo10017x(char c) {
        this.f2219d += c;
        return this;
    }
}
