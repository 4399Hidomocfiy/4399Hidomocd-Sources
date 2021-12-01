package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.p008j.C0053d;
import java.util.ArrayList;

/* renamed from: android.support.constraint.d.j.m */
public class C0069m {

    /* renamed from: a */
    private int f648a;

    /* renamed from: b */
    private int f649b;

    /* renamed from: c */
    private int f650c;

    /* renamed from: d */
    private int f651d;

    /* renamed from: e */
    private ArrayList<C0070a> f652e = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.d.j.m$a */
    public static class C0070a {

        /* renamed from: a */
        private C0053d f653a;

        /* renamed from: b */
        private C0053d f654b;

        /* renamed from: c */
        private int f655c;

        /* renamed from: d */
        private C0053d.EnumC0056c f656d;

        /* renamed from: e */
        private int f657e;

        public C0070a(C0053d dVar) {
            this.f653a = dVar;
            this.f654b = dVar.mo194i();
            this.f655c = dVar.mo189d();
            this.f656d = dVar.mo193h();
            this.f657e = dVar.mo188c();
        }

        /* renamed from: a */
        public void mo318a(C0058e eVar) {
            eVar.mo234h(this.f653a.mo195j()).mo187b(this.f654b, this.f655c, this.f656d, this.f657e);
        }

        /* renamed from: b */
        public void mo319b(C0058e eVar) {
            int i;
            C0053d h = eVar.mo234h(this.f653a.mo195j());
            this.f653a = h;
            if (h != null) {
                this.f654b = h.mo194i();
                this.f655c = this.f653a.mo189d();
                this.f656d = this.f653a.mo193h();
                i = this.f653a.mo188c();
            } else {
                this.f654b = null;
                i = 0;
                this.f655c = 0;
                this.f656d = C0053d.EnumC0056c.STRONG;
            }
            this.f657e = i;
        }
    }

    public C0069m(C0058e eVar) {
        this.f648a = eVar.mo204D();
        this.f649b = eVar.mo205E();
        this.f650c = eVar.mo201A();
        this.f651d = eVar.mo250p();
        ArrayList<C0053d> i = eVar.mo236i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f652e.add(new C0070a(i.get(i2)));
        }
    }

    /* renamed from: a */
    public void mo316a(C0058e eVar) {
        eVar.mo259t0(this.f648a);
        eVar.mo262u0(this.f649b);
        eVar.mo251p0(this.f650c);
        eVar.mo218T(this.f651d);
        int size = this.f652e.size();
        for (int i = 0; i < size; i++) {
            this.f652e.get(i).mo318a(eVar);
        }
    }

    /* renamed from: b */
    public void mo317b(C0058e eVar) {
        this.f648a = eVar.mo204D();
        this.f649b = eVar.mo205E();
        this.f650c = eVar.mo201A();
        this.f651d = eVar.mo250p();
        int size = this.f652e.size();
        for (int i = 0; i < size; i++) {
            this.f652e.get(i).mo319b(eVar);
        }
    }
}
