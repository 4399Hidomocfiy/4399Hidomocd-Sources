package p059c.p060a;

import java.util.List;

/* renamed from: c.a.j */
public abstract class AbstractC1019j implements AbstractC0989e {
    @Override // p059c.p060a.AbstractC0989e
    /* renamed from: a */
    public double mo9932a(List<AbstractC0988d> list) {
        double a = list.get(0).mo9936a();
        return Double.isNaN(a) ? a : mo9950d(a);
    }

    @Override // p059c.p060a.AbstractC0989e
    /* renamed from: b */
    public boolean mo9933b() {
        return true;
    }

    @Override // p059c.p060a.AbstractC0989e
    /* renamed from: c */
    public int mo9934c() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract double mo9950d(double d);
}
