package android.support.constraint.p007d.p008j;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.d.j.l */
public class C0068l {

    /* renamed from: a */
    HashSet<C0068l> f646a = new HashSet<>(2);

    /* renamed from: b */
    int f647b = 0;

    /* renamed from: a */
    public void mo312a(C0068l lVar) {
        this.f646a.add(lVar);
    }

    /* renamed from: b */
    public void mo313b() {
        this.f647b = 1;
        Iterator<C0068l> it = this.f646a.iterator();
        while (it.hasNext()) {
            it.next().mo297f();
        }
    }

    /* renamed from: c */
    public void mo314c() {
        this.f647b = 0;
        Iterator<C0068l> it = this.f646a.iterator();
        while (it.hasNext()) {
            it.next().mo314c();
        }
    }

    /* renamed from: d */
    public boolean mo315d() {
        return this.f647b == 1;
    }

    /* renamed from: e */
    public void mo296e() {
        this.f647b = 0;
        this.f646a.clear();
    }

    /* renamed from: f */
    public void mo297f() {
    }
}
