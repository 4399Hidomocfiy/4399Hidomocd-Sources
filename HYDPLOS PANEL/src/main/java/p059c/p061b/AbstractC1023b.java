package p059c.p061b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.b.b */
public abstract class AbstractC1023b<T> {

    /* renamed from: a */
    protected List<T> f2202a = new ArrayList();

    /* renamed from: b */
    protected boolean f2203b = false;

    /* renamed from: c */
    protected List<C1025d> f2204c = new ArrayList();

    /* renamed from: d */
    protected T f2205d;

    /* renamed from: a */
    public T mo9983a() {
        T c = mo9985c();
        mo9984b(1);
        return c;
    }

    /* renamed from: b */
    public void mo9984b(int i) {
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                if (i > 0) {
                    if (!this.f2202a.isEmpty()) {
                        this.f2202a.remove(0);
                    } else if (!this.f2203b) {
                        if (mo9987e() == null) {
                            this.f2203b = true;
                        }
                    } else {
                        return;
                    }
                    i = i2;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("numberOfItems < 0");
        }
    }

    /* renamed from: c */
    public T mo9985c() {
        return mo9989g(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo9986d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract T mo9987e();

    /* renamed from: f */
    public T mo9988f() {
        return mo9989g(1);
    }

    /* renamed from: g */
    public T mo9989g(int i) {
        if (i >= 0) {
            while (this.f2202a.size() <= i && !this.f2203b) {
                T e = mo9987e();
                if (e != null) {
                    this.f2202a.add(e);
                } else {
                    this.f2203b = true;
                }
            }
            if (i < this.f2202a.size()) {
                return this.f2202a.get(i);
            }
            if (this.f2205d == null) {
                this.f2205d = mo9986d();
            }
            return this.f2205d;
        }
        throw new IllegalArgumentException("offset < 0");
    }

    /* renamed from: h */
    public void mo9990h(List<C1025d> list) {
        this.f2204c = list;
    }
}
