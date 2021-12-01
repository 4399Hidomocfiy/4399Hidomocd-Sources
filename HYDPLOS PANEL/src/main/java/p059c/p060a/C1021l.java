package p059c.p060a;

/* renamed from: c.a.l */
public class C1021l extends AbstractC0988d {

    /* renamed from: a */
    private C1020k f2198a;

    public C1021l(C1020k kVar) {
        this.f2198a = kVar;
    }

    @Override // p059c.p060a.AbstractC0988d
    /* renamed from: a */
    public double mo9936a() {
        return this.f2198a.mo9966b();
    }

    @Override // p059c.p060a.AbstractC0988d
    /* renamed from: b */
    public boolean mo9945b() {
        return this.f2198a.mo9967c();
    }

    @Override // p059c.p060a.AbstractC0988d
    /* renamed from: c */
    public AbstractC0988d mo9937c() {
        return mo9945b() ? new C0987c(mo9936a()) : this;
    }

    public String toString() {
        return this.f2198a.mo9965a();
    }
}
