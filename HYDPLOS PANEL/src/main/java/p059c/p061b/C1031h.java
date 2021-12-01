package p059c.p061b;

import java.io.Reader;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p059c.p061b.C1029g;

/* renamed from: c.b.h */
public class C1031h extends AbstractC1023b<C1029g> {

    /* renamed from: e */
    protected C1024c f2232e;

    /* renamed from: f */
    private char f2233f = '.';

    /* renamed from: g */
    private char f2234g = '.';

    /* renamed from: h */
    private char f2235h = '_';

    /* renamed from: i */
    private String f2236i = "//";

    /* renamed from: j */
    private String f2237j = "/*";

    /* renamed from: k */
    private String f2238k = "*/";

    /* renamed from: l */
    private char[] f2239l = {'(', '[', '{', '}', ']', ')'};

    /* renamed from: m */
    private boolean f2240m = true;

    /* renamed from: n */
    private Set<Character> f2241n = new HashSet();

    /* renamed from: o */
    private Set<Character> f2242o = new HashSet();

    /* renamed from: p */
    private Map<String, String> f2243p = new IdentityHashMap();

    /* renamed from: q */
    private boolean f2244q = false;

    /* renamed from: r */
    private Map<Character, Character> f2245r = new IdentityHashMap();

    public C1031h(Reader reader) {
        C1024c cVar = new C1024c(reader);
        this.f2232e = cVar;
        cVar.mo9990h(this.f2204c);
        mo10022i('\"', '\\');
        mo10022i('\'', 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo10018A(C1022a aVar) {
        if (!aVar.mo9977f() && !aVar.mo9979h()) {
            return aVar.mo9976e(new char[]{'_'});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo10019B(C1022a aVar) {
        return !aVar.mo9978g() && !aVar.mo9977f() && !aVar.mo9979h() && !aVar.mo9981j() && !Character.isISOControl(aVar.mo9975d()) && !mo10033t(true) && !mo10036v() && !mo10038x() && !mo10039y() && !mo10037w() && !this.f2245r.containsKey(Character.valueOf(aVar.mo9975d()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo10020C() {
        while (!((C1022a) this.f2232e.mo9985c()).mo9978g()) {
            if (!mo10035u()) {
                this.f2232e.mo9983a();
            } else {
                return;
            }
        }
        this.f2204c.add(C1025d.m2848a((AbstractC1028f) this.f2232e.mo9985c(), "Premature end of block comment"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo10021D() {
        while (!((C1022a) this.f2232e.mo9985c()).mo9978g() && !((C1022a) this.f2232e.mo9985c()).mo9980i()) {
            this.f2232e.mo9983a();
        }
    }

    @Override // p059c.p061b.AbstractC1023b
    /* renamed from: h */
    public void mo9990h(List<C1025d> list) {
        super.mo9990h(list);
        this.f2232e.mo9990h(list);
    }

    /* renamed from: i */
    public void mo10022i(char c, char c2) {
        this.f2245r.put(Character.valueOf(c), Character.valueOf(c2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo10023j(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!((C1022a) this.f2232e.mo9989g(i)).mo9976e(str.charAt(i))) {
                return false;
            }
        }
        this.f2232e.mo9984b(str.length());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C1029g mo9986d() {
        return C1029g.m2854h(C1029g.EnumC1030a.EOI, (C1022a) this.f2232e.mo9985c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C1029g mo9987e() {
        while (((C1022a) this.f2232e.mo9985c()).mo9981j()) {
            this.f2232e.mo9983a();
        }
        if (((C1022a) this.f2232e.mo9985c()).mo9978g()) {
            return null;
        }
        if (mo10038x()) {
            mo10021D();
            return mo9987e();
        } else if (mo10036v()) {
            mo10020C();
            return mo9987e();
        } else if (mo10039y()) {
            return mo10027n();
        } else {
            if (mo10037w()) {
                return mo10026m();
            }
            if (this.f2245r.containsKey(Character.valueOf(((C1022a) this.f2232e.mo9985c()).mo9975d()))) {
                return mo10029p();
            }
            if (mo10033t(false)) {
                return C1029g.m2854h(C1029g.EnumC1030a.SYMBOL, (C1022a) this.f2232e.mo9983a());
            }
            if (mo10040z()) {
                return mo10028o();
            }
            if (mo10019B((C1022a) this.f2232e.mo9985c())) {
                return mo10030q();
            }
            this.f2204c.add(C1025d.m2848a((AbstractC1028f) this.f2232e.mo9985c(), String.format("Invalid character in input: '%s'", ((C1022a) this.f2232e.mo9985c()).mo9974c())));
            this.f2232e.mo9983a();
            return mo9987e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C1029g mo10026m() {
        C1029g g = C1029g.m2853g(C1029g.EnumC1030a.ID, (AbstractC1028f) this.f2232e.mo9985c());
        do {
            g.mo9998d((C1022a) this.f2232e.mo9983a());
        } while (mo10018A((C1022a) this.f2232e.mo9985c()));
        if (((C1022a) this.f2232e.mo9985c()).mo9978g() || !this.f2242o.contains(Character.valueOf(((C1022a) this.f2232e.mo9985c()).mo9975d()))) {
            return mo10031r(g);
        }
        C1029g g2 = C1029g.m2853g(C1029g.EnumC1030a.SPECIAL_ID, g);
        g2.mo10016w(((C1022a) this.f2232e.mo9985c()).mo9974c());
        g2.mo10014u(g.mo10001i());
        g2.mo10015v(g.mo10001i());
        g2.mo9999e((C1022a) this.f2232e.mo9985c());
        this.f2232e.mo9983a();
        return mo10031r(g2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C1029g mo10027n() {
        C1029g g = C1029g.m2853g(C1029g.EnumC1030a.INTEGER, (AbstractC1028f) this.f2232e.mo9985c());
        loop0:
        while (true) {
            g.mo9998d((C1022a) this.f2232e.mo9983a());
            while (true) {
                if (!((C1022a) this.f2232e.mo9985c()).mo9977f()) {
                    if (!((C1022a) this.f2232e.mo9985c()).mo9976e(this.f2233f, this.f2235h) || !((C1022a) this.f2232e.mo9988f()).mo9977f()) {
                        return g;
                    }
                }
                if (!((C1022a) this.f2232e.mo9985c()).mo9976e(this.f2235h)) {
                    if (((C1022a) this.f2232e.mo9985c()).mo9976e(this.f2233f)) {
                        C1029g.EnumC1030a aVar = C1029g.EnumC1030a.DECIMAL;
                        if (g.mo10005m(aVar)) {
                            this.f2204c.add(C1025d.m2848a((AbstractC1028f) this.f2232e.mo9985c(), "Unexpected decimal separators"));
                        } else {
                            C1029g g2 = C1029g.m2853g(aVar, g);
                            g2.mo10014u(g.mo10001i() + this.f2234g);
                            g2.mo10015v(g.mo10002j());
                            g = g2;
                        }
                    }
                }
                g.mo9999e((C1022a) this.f2232e.mo9983a());
            }
        }
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C1029g mo10028o() {
        C1029g g = C1029g.m2853g(C1029g.EnumC1030a.SPECIAL_ID, (AbstractC1028f) this.f2232e.mo9985c());
        g.mo10000f((C1022a) this.f2232e.mo9983a());
        while (mo10018A((C1022a) this.f2232e.mo9985c())) {
            g.mo9998d((C1022a) this.f2232e.mo9983a());
        }
        return mo10031r(g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C1029g mo10029p() {
        char d = ((C1022a) this.f2232e.mo9985c()).mo9975d();
        char charValue = this.f2245r.get(Character.valueOf(((C1022a) this.f2232e.mo9985c()).mo9975d())).charValue();
        C1029g g = C1029g.m2853g(C1029g.EnumC1030a.STRING, (AbstractC1028f) this.f2232e.mo9985c());
        g.mo10000f((C1022a) this.f2232e.mo9983a());
        while (!((C1022a) this.f2232e.mo9985c()).mo9980i()) {
            if (((C1022a) this.f2232e.mo9985c()).mo9976e(d) || ((C1022a) this.f2232e.mo9985c()).mo9978g()) {
                break;
            }
            if (charValue != 0) {
                if (((C1022a) this.f2232e.mo9985c()).mo9976e(charValue)) {
                    g.mo9999e((C1022a) this.f2232e.mo9983a());
                    if (!mo10032s(d, charValue, g)) {
                        this.f2204c.add(C1025d.m2848a((AbstractC1028f) this.f2232e.mo9988f(), String.format("Cannot use '%s' as escaped character", ((C1022a) this.f2232e.mo9988f()).mo9974c())));
                    }
                }
            }
            g.mo9998d((C1022a) this.f2232e.mo9983a());
        }
        if (((C1022a) this.f2232e.mo9985c()).mo9976e(d)) {
            g.mo9999e((C1022a) this.f2232e.mo9983a());
        } else {
            this.f2204c.add(C1025d.m2848a((AbstractC1028f) this.f2232e.mo9985c(), "Premature end of string constant"));
        }
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C1029g mo10030q() {
        C1029g g = C1029g.m2853g(C1029g.EnumC1030a.SYMBOL, (AbstractC1028f) this.f2232e.mo9985c());
        do {
            g.mo10000f((C1022a) this.f2232e.mo9983a());
        } while (mo10019B((C1022a) this.f2232e.mo9985c()));
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C1029g mo10031r(C1029g gVar) {
        String str;
        Map<String, String> map;
        if (this.f2244q) {
            map = this.f2243p;
            str = gVar.mo10001i();
        } else {
            map = this.f2243p;
            str = gVar.mo10001i().toLowerCase();
        }
        String str2 = map.get(str.intern());
        if (str2 == null) {
            return gVar;
        }
        C1029g g = C1029g.m2853g(C1029g.EnumC1030a.KEYWORD, gVar);
        g.mo10016w(str2);
        g.mo10014u(gVar.mo10001i());
        g.mo10015v(gVar.mo10002j());
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo10032s(char c, char c2, C1029g gVar) {
        char c3;
        if (((C1022a) this.f2232e.mo9985c()).mo9976e(c)) {
            gVar.mo9997c(c);
        } else {
            if (((C1022a) this.f2232e.mo9985c()).mo9976e(c2)) {
                gVar.mo10017x(c2);
            } else {
                if (((C1022a) this.f2232e.mo9985c()).mo9976e('n')) {
                    c3 = '\n';
                } else {
                    if (!((C1022a) this.f2232e.mo9985c()).mo9976e('r')) {
                        return false;
                    }
                    c3 = '\r';
                }
                gVar.mo10017x(c3);
            }
        }
        gVar.mo9999e((C1022a) this.f2232e.mo9983a());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo10033t(boolean z) {
        if (((C1022a) this.f2232e.mo9985c()).mo9976e(this.f2239l)) {
            return true;
        }
        if (!z && this.f2240m) {
            if (((C1022a) this.f2232e.mo9985c()).mo9976e('|')) {
                if (!((C1022a) this.f2232e.mo9988f()).mo9976e('|')) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f2202a.size() == 0) {
            return "No Token fetched...";
        }
        if (this.f2202a.size() < 2) {
            sb = new StringBuilder();
            sb.append("Current: ");
            sb.append(mo9985c());
        } else {
            sb = new StringBuilder();
            sb.append("Current: ");
            sb.append(((C1029g) mo9985c()).toString());
            sb.append(", Next: ");
            sb.append(((C1029g) mo9988f()).toString());
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo10035u() {
        return mo10023j(this.f2238k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo10036v() {
        return mo10023j(this.f2237j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo10037w() {
        return ((C1022a) this.f2232e.mo9985c()).mo9979h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo10038x() {
        String str = this.f2236i;
        if (str != null) {
            return mo10023j(str);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo10039y() {
        if (!((C1022a) this.f2232e.mo9985c()).mo9977f()) {
            if (!((C1022a) this.f2232e.mo9985c()).mo9976e('-') || !((C1022a) this.f2232e.mo9988f()).mo9977f()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo10040z() {
        return this.f2241n.contains(Character.valueOf(((C1022a) this.f2232e.mo9985c()).mo9975d()));
    }
}
