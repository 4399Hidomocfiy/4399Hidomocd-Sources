package p059c.p060a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.f */
public class C0990f extends AbstractC0988d {

    /* renamed from: a */
    private List<AbstractC0988d> f2161a = new ArrayList();

    /* renamed from: b */
    private AbstractC0989e f2162b;

    @Override // p059c.p060a.AbstractC0988d
    /* renamed from: a */
    public double mo9936a() {
        return this.f2162b.mo9932a(this.f2161a);
    }

    @Override // p059c.p060a.AbstractC0988d
    /* renamed from: c */
    public AbstractC0988d mo9937c() {
        if (!this.f2162b.mo9933b()) {
            return this;
        }
        for (AbstractC0988d dVar : this.f2161a) {
            if (!dVar.mo9945b()) {
                return this;
            }
        }
        return new C0987c(mo9936a());
    }

    /* renamed from: d */
    public void mo9947d(AbstractC0988d dVar) {
        this.f2161a.add(dVar);
    }

    /* renamed from: e */
    public List<AbstractC0988d> mo9948e() {
        return this.f2161a;
    }

    /* renamed from: f */
    public void mo9949f(AbstractC0989e eVar) {
        this.f2162b = eVar;
    }
}
