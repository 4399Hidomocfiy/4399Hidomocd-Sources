package p059c.p060a;

/* renamed from: c.a.b */
public class C0985b extends AbstractC0988d {

    /* renamed from: a */
    private final EnumC0986a f2139a;

    /* renamed from: b */
    private AbstractC0988d f2140b;

    /* renamed from: c */
    private AbstractC0988d f2141c;

    /* renamed from: d */
    private boolean f2142d = false;

    /* renamed from: c.a.b$a */
    public enum EnumC0986a {
        ADD(3),
        SUBTRACT(3),
        MULTIPLY(4),
        DIVIDE(4),
        MODULO(4),
        POWER(5),
        LT(2),
        LT_EQ(2),
        EQ(2),
        GT_EQ(2),
        GT(2),
        NEQ(2),
        AND(1),
        OR(1);
        

        /* renamed from: a */
        private final int f2158a;

        private EnumC0986a(int i) {
            this.f2158a = i;
        }

        /* renamed from: a */
        public int mo9944a() {
            return this.f2158a;
        }
    }

    public C0985b(EnumC0986a aVar, AbstractC0988d dVar, AbstractC0988d dVar2) {
        this.f2139a = aVar;
        this.f2140b = dVar;
        this.f2141c = dVar2;
    }

    @Override // p059c.p060a.AbstractC0988d
    /* renamed from: a */
    public double mo9936a() {
        double a = this.f2140b.mo9936a();
        double a2 = this.f2141c.mo9936a();
        EnumC0986a aVar = this.f2139a;
        if (aVar == EnumC0986a.ADD) {
            return a + a2;
        }
        if (aVar == EnumC0986a.SUBTRACT) {
            return a - a2;
        }
        if (aVar == EnumC0986a.MULTIPLY) {
            return a * a2;
        }
        if (aVar == EnumC0986a.DIVIDE) {
            return a / a2;
        }
        if (aVar == EnumC0986a.POWER) {
            return Math.pow(a, a2);
        }
        if (aVar == EnumC0986a.MODULO) {
            return a % a2;
        }
        if (aVar == EnumC0986a.LT) {
            return a < a2 ? 1.0d : 0.0d;
        }
        if (aVar == EnumC0986a.LT_EQ) {
            return (a < a2 || Math.abs(a - a2) < 1.0E-10d) ? 1.0d : 0.0d;
        }
        if (aVar == EnumC0986a.GT) {
            return a > a2 ? 1.0d : 0.0d;
        }
        if (aVar == EnumC0986a.GT_EQ) {
            return (a > a2 || Math.abs(a - a2) < 1.0E-10d) ? 1.0d : 0.0d;
        }
        if (aVar == EnumC0986a.EQ) {
            return Math.abs(a - a2) < 1.0E-10d ? 1.0d : 0.0d;
        }
        if (aVar == EnumC0986a.NEQ) {
            return Math.abs(a - a2) > 1.0E-10d ? 1.0d : 0.0d;
        }
        if (aVar == EnumC0986a.AND) {
            return (a == 1.0d && a2 == 1.0d) ? 1.0d : 0.0d;
        }
        if (aVar == EnumC0986a.OR) {
            return (a == 1.0d || a2 == 1.0d) ? 1.0d : 0.0d;
        }
        throw new UnsupportedOperationException(String.valueOf(this.f2139a));
    }

    @Override // p059c.p060a.AbstractC0988d
    /* renamed from: c */
    public AbstractC0988d mo9937c() {
        this.f2140b = this.f2140b.mo9937c();
        this.f2141c = this.f2141c.mo9937c();
        if (this.f2140b.mo9945b() && this.f2141c.mo9945b()) {
            return new C0987c(mo9936a());
        }
        EnumC0986a aVar = this.f2139a;
        EnumC0986a aVar2 = EnumC0986a.ADD;
        if (aVar == aVar2 || aVar == EnumC0986a.MULTIPLY) {
            if (this.f2141c.mo9945b()) {
                AbstractC0988d dVar = this.f2141c;
                this.f2141c = this.f2140b;
                this.f2140b = dVar;
            }
            AbstractC0988d dVar2 = this.f2141c;
            if (dVar2 instanceof C0985b) {
                C0985b bVar = (C0985b) dVar2;
                if (this.f2139a == bVar.f2139a) {
                    if (this.f2140b.mo9945b()) {
                        if (bVar.f2140b.mo9945b()) {
                            EnumC0986a aVar3 = this.f2139a;
                            if (aVar3 == aVar2) {
                                return new C0985b(aVar3, new C0987c(this.f2140b.mo9936a() + bVar.f2140b.mo9936a()), bVar.f2141c);
                            }
                            if (aVar3 == EnumC0986a.MULTIPLY) {
                                return new C0985b(aVar3, new C0987c(this.f2140b.mo9936a() * bVar.f2140b.mo9936a()), bVar.f2141c);
                            }
                        }
                    } else if (bVar.f2140b.mo9945b()) {
                        EnumC0986a aVar4 = this.f2139a;
                        return new C0985b(aVar4, bVar.f2140b, new C0985b(aVar4, this.f2140b, bVar.f2141c));
                    }
                }
            }
        }
        super.mo9937c();
        return this;
    }

    /* renamed from: d */
    public AbstractC0988d mo9938d() {
        return this.f2140b;
    }

    /* renamed from: e */
    public EnumC0986a mo9939e() {
        return this.f2139a;
    }

    /* renamed from: f */
    public boolean mo9940f() {
        return this.f2142d;
    }

    /* renamed from: g */
    public void mo9941g() {
        this.f2142d = true;
    }

    /* renamed from: h */
    public void mo9942h(AbstractC0988d dVar) {
        this.f2140b = dVar;
    }

    public String toString() {
        return "(" + this.f2140b.toString() + " " + this.f2139a + " " + this.f2141c + ")";
    }
}
