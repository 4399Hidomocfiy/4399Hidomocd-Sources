package p059c.p060a;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p059c.p060a.C0985b;
import p059c.p061b.AbstractC1028f;
import p059c.p061b.C1025d;
import p059c.p061b.C1027e;
import p059c.p061b.C1029g;
import p059c.p061b.C1031h;

/* renamed from: c.a.h */
public class C1017h {

    /* renamed from: d */
    private static Map<String, AbstractC0989e> f2188d = new TreeMap();

    /* renamed from: a */
    private final C1018i f2189a;

    /* renamed from: b */
    private List<C1025d> f2190b = new ArrayList();

    /* renamed from: c */
    private C1031h f2191c;

    static {
        m2797j("sin", C0991g.f2163a);
        m2797j("cos", C0991g.f2165c);
        m2797j("tan", C0991g.f2167e);
        m2797j("sinh", C0991g.f2164b);
        m2797j("cosh", C0991g.f2166d);
        m2797j("tanh", C0991g.f2168f);
        m2797j("asin", C0991g.f2170h);
        m2797j("acos", C0991g.f2171i);
        m2797j("atan", C0991g.f2172j);
        m2797j("atan2", C0991g.f2173k);
        m2797j("deg", C0991g.f2185w);
        m2797j("rad", C0991g.f2186x);
        m2797j("abs", C0991g.f2169g);
        m2797j("round", C0991g.f2174l);
        m2797j("ceil", C0991g.f2176n);
        m2797j("floor", C0991g.f2175m);
        m2797j("exp", C0991g.f2178p);
        m2797j("ln", C0991g.f2179q);
        m2797j("log", C0991g.f2180r);
        m2797j("sqrt", C0991g.f2177o);
        m2797j("min", C0991g.f2181s);
        m2797j("max", C0991g.f2182t);
        m2797j("rnd", C0991g.f2183u);
        m2797j("sign", C0991g.f2184v);
        m2797j("if", C0991g.f2187y);
    }

    protected C1017h(Reader reader, C1018i iVar) {
        this.f2189a = iVar;
        C1031h hVar = new C1031h(reader);
        this.f2191c = hVar;
        hVar.mo9990h(this.f2190b);
    }

    /* renamed from: f */
    public static AbstractC0988d m2796f(String str) {
        return new C1017h(new StringReader(str), C1018i.m2809a()).mo9955e();
    }

    /* renamed from: j */
    public static void m2797j(String str, AbstractC0989e eVar) {
        f2188d.put(str, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC0988d mo9951a() {
        if (((C1029g) this.f2191c.mo9985c()).mo10011s("-")) {
            this.f2191c.mo9983a();
            C0985b bVar = new C0985b(C0985b.EnumC0986a.SUBTRACT, new C0987c(0.0d), mo9951a());
            bVar.mo9941g();
            return bVar;
        }
        if (((C1029g) this.f2191c.mo9985c()).mo10011s("(")) {
            this.f2191c.mo9983a();
            AbstractC0988d c = mo9953c();
            if (c instanceof C0985b) {
                ((C0985b) c).mo9941g();
            }
            mo9952b(C1029g.EnumC1030a.SYMBOL, ")");
            return c;
        }
        if (((C1029g) this.f2191c.mo9985c()).mo10011s("|")) {
            this.f2191c.mo9983a();
            C0990f fVar = new C0990f();
            fVar.mo9947d(mo9953c());
            fVar.mo9949f(C0991g.f2169g);
            mo9952b(C1029g.EnumC1030a.SYMBOL, "|");
            return fVar;
        } else if (((C1029g) this.f2191c.mo9985c()).mo10007o(new String[0])) {
            return ((C1029g) this.f2191c.mo9988f()).mo10011s(new String[]{"("}) ? mo9954d() : new C1021l(this.f2189a.mo9964e(((C1029g) this.f2191c.mo9983a()).mo10001i()));
        } else if (((C1029g) this.f2191c.mo9985c()).mo10010r()) {
            double parseDouble = Double.parseDouble(((C1029g) this.f2191c.mo9983a()).mo10001i());
            if (((C1029g) this.f2191c.mo9985c()).mo10005m(C1029g.EnumC1030a.ID)) {
                String intern = ((C1029g) this.f2191c.mo9985c()).mo10001i().intern();
                if ("n" == intern) {
                    parseDouble /= 1.0E9d;
                } else if ("u" == intern) {
                    parseDouble /= 1000000.0d;
                } else if ("m" == intern) {
                    parseDouble /= 1000.0d;
                } else if ("K" == intern || "k" == intern) {
                    parseDouble *= 1000.0d;
                } else if ("M" == intern) {
                    parseDouble *= 1000000.0d;
                } else if ("G" == intern) {
                    parseDouble *= 1.0E9d;
                } else {
                    C1029g gVar = (C1029g) this.f2191c.mo9983a();
                    this.f2190b.add(C1025d.m2848a(gVar, String.format("Unexpected token: '%s'. Expected a valid quantifier.", gVar.mo10002j())));
                }
                this.f2191c.mo9983a();
            }
            return new C0987c(parseDouble);
        } else {
            C1029g gVar2 = (C1029g) this.f2191c.mo9983a();
            this.f2190b.add(C1025d.m2848a(gVar2, String.format("Unexpected token: '%s'. Expected an expression.", gVar2.mo10002j())));
            return C0987c.f2159b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9952b(C1029g.EnumC1030a aVar, String str) {
        if (((C1029g) this.f2191c.mo9985c()).mo10012t(aVar, str)) {
            this.f2191c.mo9983a();
            return;
        }
        this.f2190b.add(C1025d.m2848a((AbstractC1028f) this.f2191c.mo9985c(), String.format("Unexpected token '%s'. Expected: '%s'", ((C1029g) this.f2191c.mo9985c()).mo10002j(), str)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AbstractC0988d mo9953c() {
        AbstractC0988d c;
        C0985b.EnumC0986a aVar;
        AbstractC0988d k = mo9959k();
        if (((C1029g) this.f2191c.mo9985c()).mo10011s("&&")) {
            this.f2191c.mo9983a();
            c = mo9953c();
            aVar = C0985b.EnumC0986a.AND;
        } else {
            if (!((C1029g) this.f2191c.mo9985c()).mo10011s("||")) {
                return k;
            }
            this.f2191c.mo9983a();
            c = mo9953c();
            aVar = C0985b.EnumC0986a.OR;
        }
        return mo9958i(k, c, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AbstractC0988d mo9954d() {
        C0990f fVar = new C0990f();
        C1029g gVar = (C1029g) this.f2191c.mo9983a();
        AbstractC0989e eVar = f2188d.get(gVar.mo10001i());
        if (eVar == null) {
            this.f2190b.add(C1025d.m2848a(gVar, String.format("Unknown function: '%s'", gVar.mo10001i())));
        }
        fVar.mo9949f(eVar);
        this.f2191c.mo9983a();
        while (true) {
            if (((C1029g) this.f2191c.mo9985c()).mo10011s(")") || !((C1029g) this.f2191c.mo9985c()).mo10009q()) {
                mo9952b(C1029g.EnumC1030a.SYMBOL, ")");
            } else {
                if (!fVar.mo9948e().isEmpty()) {
                    mo9952b(C1029g.EnumC1030a.SYMBOL, ",");
                }
                fVar.mo9947d(mo9953c());
            }
        }
        mo9952b(C1029g.EnumC1030a.SYMBOL, ")");
        if (eVar == null) {
            return C0987c.f2159b;
        }
        if (fVar.mo9948e().size() == eVar.mo9934c() || eVar.mo9934c() < 0) {
            return fVar;
        }
        this.f2190b.add(C1025d.m2848a(gVar, String.format("Number of arguments for function '%s' do not match. Expected: %d, Found: %d", gVar.mo10001i(), Integer.valueOf(eVar.mo9934c()), Integer.valueOf(fVar.mo9948e().size()))));
        return C0987c.f2159b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AbstractC0988d mo9955e() {
        AbstractC0988d c = mo9953c().mo9937c();
        if (((C1029g) this.f2191c.mo9985c()).mo10009q()) {
            C1029g gVar = (C1029g) this.f2191c.mo9983a();
            this.f2190b.add(C1025d.m2848a(gVar, String.format("Unexpected token: '%s'. Expected an expression.", gVar.mo10002j())));
        }
        if (this.f2190b.size() <= 0) {
            return c;
        }
        throw C1027e.m2850a(this.f2190b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AbstractC0988d mo9956g() {
        AbstractC0988d a = mo9951a();
        if (!((C1029g) this.f2191c.mo9985c()).mo10011s("^")) {
            if (!((C1029g) this.f2191c.mo9985c()).mo10011s("**")) {
                return a;
            }
        }
        this.f2191c.mo9983a();
        return mo9958i(a, mo9956g(), C0985b.EnumC0986a.POWER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AbstractC0988d mo9957h() {
        AbstractC0988d h;
        C0985b.EnumC0986a aVar;
        AbstractC0988d g = mo9956g();
        if (((C1029g) this.f2191c.mo9985c()).mo10011s("*")) {
            this.f2191c.mo9983a();
            h = mo9957h();
            aVar = C0985b.EnumC0986a.MULTIPLY;
        } else {
            if (((C1029g) this.f2191c.mo9985c()).mo10011s("/")) {
                this.f2191c.mo9983a();
                h = mo9957h();
                aVar = C0985b.EnumC0986a.DIVIDE;
            } else {
                if (!((C1029g) this.f2191c.mo9985c()).mo10011s("%")) {
                    return g;
                }
                this.f2191c.mo9983a();
                h = mo9957h();
                aVar = C0985b.EnumC0986a.MODULO;
            }
        }
        return mo9958i(g, h, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC0988d mo9958i(AbstractC0988d dVar, AbstractC0988d dVar2, C0985b.EnumC0986a aVar) {
        if (dVar2 instanceof C0985b) {
            C0985b bVar = (C0985b) dVar2;
            if (!bVar.mo9940f() && bVar.mo9939e().mo9944a() == aVar.mo9944a()) {
                mo9960l(bVar, dVar, aVar);
                return dVar2;
            }
        }
        return new C0985b(aVar, dVar, dVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AbstractC0988d mo9959k() {
        AbstractC0988d k;
        C0985b.EnumC0986a aVar;
        AbstractC0988d m = mo9961m();
        if (((C1029g) this.f2191c.mo9985c()).mo10011s("<")) {
            this.f2191c.mo9983a();
            k = mo9959k();
            aVar = C0985b.EnumC0986a.LT;
        } else {
            if (((C1029g) this.f2191c.mo9985c()).mo10011s("<=")) {
                this.f2191c.mo9983a();
                k = mo9959k();
                aVar = C0985b.EnumC0986a.LT_EQ;
            } else {
                if (((C1029g) this.f2191c.mo9985c()).mo10011s("=")) {
                    this.f2191c.mo9983a();
                    k = mo9959k();
                    aVar = C0985b.EnumC0986a.EQ;
                } else {
                    if (((C1029g) this.f2191c.mo9985c()).mo10011s(">=")) {
                        this.f2191c.mo9983a();
                        k = mo9959k();
                        aVar = C0985b.EnumC0986a.GT_EQ;
                    } else {
                        if (((C1029g) this.f2191c.mo9985c()).mo10011s(">")) {
                            this.f2191c.mo9983a();
                            k = mo9959k();
                            aVar = C0985b.EnumC0986a.GT;
                        } else {
                            if (!((C1029g) this.f2191c.mo9985c()).mo10011s("!=")) {
                                return m;
                            }
                            this.f2191c.mo9983a();
                            k = mo9959k();
                            aVar = C0985b.EnumC0986a.NEQ;
                        }
                    }
                }
            }
        }
        return mo9958i(m, k, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo9960l(C0985b bVar, AbstractC0988d dVar, C0985b.EnumC0986a aVar) {
        if (bVar.mo9938d() instanceof C0985b) {
            C0985b bVar2 = (C0985b) bVar.mo9938d();
            if (!bVar2.mo9940f() && bVar2.mo9939e().mo9944a() == aVar.mo9944a()) {
                mo9960l(bVar2, dVar, aVar);
                return;
            }
        }
        bVar.mo9942h(new C0985b(aVar, dVar, bVar.mo9938d()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AbstractC0988d mo9961m() {
        AbstractC0988d m;
        C0985b.EnumC0986a aVar;
        AbstractC0988d h = mo9957h();
        if (((C1029g) this.f2191c.mo9985c()).mo10011s("+")) {
            this.f2191c.mo9983a();
        } else {
            if (((C1029g) this.f2191c.mo9985c()).mo10011s("-")) {
                this.f2191c.mo9983a();
                m = mo9961m();
                aVar = C0985b.EnumC0986a.SUBTRACT;
                return mo9958i(h, m, aVar);
            } else if (!((C1029g) this.f2191c.mo9985c()).mo10010r() || !((C1029g) this.f2191c.mo9985c()).mo10001i().startsWith("-")) {
                return h;
            }
        }
        m = mo9961m();
        aVar = C0985b.EnumC0986a.ADD;
        return mo9958i(h, m, aVar);
    }
}
