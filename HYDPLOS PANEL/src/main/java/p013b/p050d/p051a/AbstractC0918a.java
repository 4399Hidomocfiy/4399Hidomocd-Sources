package p013b.p050d.p051a;

import java.util.ArrayList;

/* renamed from: b.d.a.a */
public abstract class AbstractC0918a implements Cloneable {

    /* renamed from: a */
    ArrayList<AbstractC0919a> f1977a = null;

    /* renamed from: b.d.a.a$a */
    public interface AbstractC0919a {
        /* renamed from: a */
        void mo9121a(AbstractC0918a aVar);

        /* renamed from: b */
        void mo9122b(AbstractC0918a aVar);

        /* renamed from: c */
        void mo9123c(AbstractC0918a aVar);

        /* renamed from: d */
        void mo9124d(AbstractC0918a aVar);
    }

    /* renamed from: a */
    public void mo9110a(AbstractC0919a aVar) {
        if (this.f1977a == null) {
            this.f1977a = new ArrayList<>();
        }
        this.f1977a.add(aVar);
    }

    /* renamed from: b */
    public void mo9111b() {
    }

    /* renamed from: c */
    public AbstractC0918a clone() {
        try {
            AbstractC0918a aVar = (AbstractC0918a) super.clone();
            ArrayList<AbstractC0919a> arrayList = this.f1977a;
            if (arrayList != null) {
                aVar.f1977a = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aVar.f1977a.add(arrayList.get(i));
                }
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    public ArrayList<AbstractC0919a> mo9114d() {
        return this.f1977a;
    }

    /* renamed from: e */
    public abstract boolean mo9115e();

    /* renamed from: f */
    public void mo9116f(AbstractC0919a aVar) {
        ArrayList<AbstractC0919a> arrayList = this.f1977a;
        if (arrayList != null) {
            arrayList.remove(aVar);
            if (this.f1977a.size() == 0) {
                this.f1977a = null;
            }
        }
    }

    /* renamed from: g */
    public abstract AbstractC0918a mo9117g(long j);

    /* renamed from: h */
    public abstract void mo9118h(long j);

    /* renamed from: i */
    public void mo9119i(Object obj) {
    }

    /* renamed from: j */
    public void mo9120j() {
    }
}
