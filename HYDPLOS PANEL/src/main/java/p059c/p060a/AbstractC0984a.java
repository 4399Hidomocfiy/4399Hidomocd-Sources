package p059c.p060a;

import java.util.List;

/* renamed from: c.a.a */
public abstract class AbstractC0984a implements AbstractC0989e {
    @Override // p059c.p060a.AbstractC0989e
    /* renamed from: a */
    public double mo9932a(List<AbstractC0988d> list) {
        double a = list.get(0).mo9936a();
        if (Double.isNaN(a)) {
            return a;
        }
        double a2 = list.get(1).mo9936a();
        return Double.isNaN(a2) ? a2 : mo9935d(a, a2);
    }

    @Override // p059c.p060a.AbstractC0989e
    /* renamed from: b */
    public boolean mo9933b() {
        return true;
    }

    @Override // p059c.p060a.AbstractC0989e
    /* renamed from: c */
    public int mo9934c() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract double mo9935d(double d, double d2);
}
