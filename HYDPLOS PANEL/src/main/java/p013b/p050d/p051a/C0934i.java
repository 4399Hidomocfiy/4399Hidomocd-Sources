package p013b.p050d.p051a;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p013b.p050d.p052b.AbstractC0964c;
import p013b.p050d.p053c.p054a.C0965a;

/* renamed from: b.d.a.i */
public final class C0934i extends C0954m {

    /* renamed from: D */
    private static final Map<String, AbstractC0964c> f2019D;

    /* renamed from: A */
    private Object f2020A;

    /* renamed from: B */
    private String f2021B;

    /* renamed from: C */
    private AbstractC0964c f2022C;

    static {
        HashMap hashMap = new HashMap();
        f2019D = hashMap;
        hashMap.put("alpha", C0935j.f2023a);
        hashMap.put("pivotX", C0935j.f2024b);
        hashMap.put("pivotY", C0935j.f2025c);
        hashMap.put("translationX", C0935j.f2026d);
        hashMap.put("translationY", C0935j.f2027e);
        hashMap.put("rotation", C0935j.f2028f);
        hashMap.put("rotationX", C0935j.f2029g);
        hashMap.put("rotationY", C0935j.f2030h);
        hashMap.put("scaleX", C0935j.f2031i);
        hashMap.put("scaleY", C0935j.f2032j);
        hashMap.put("scrollX", C0935j.f2033k);
        hashMap.put("scrollY", C0935j.f2034l);
        hashMap.put("x", C0935j.f2035m);
        hashMap.put("y", C0935j.f2036n);
    }

    public C0934i() {
    }

    private C0934i(Object obj, String str) {
        this.f2020A = obj;
        mo9162N(str);
    }

    /* renamed from: K */
    public static C0934i m2550K(Object obj, String str, float... fArr) {
        C0934i iVar = new C0934i(obj, str);
        iVar.mo9158F(fArr);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p050d.p051a.C0954m
    /* renamed from: B */
    public void mo9156B() {
        if (!this.f2073j) {
            if (this.f2022C == null && C0965a.f2083q && (this.f2020A instanceof View)) {
                Map<String, AbstractC0964c> map = f2019D;
                if (map.containsKey(this.f2021B)) {
                    mo9161M(map.get(this.f2021B));
                }
            }
            int length = this.f2080q.length;
            for (int i = 0; i < length; i++) {
                this.f2080q[i].mo9205p(this.f2020A);
            }
            super.mo9156B();
        }
    }

    @Override // p013b.p050d.p051a.C0954m
    /* renamed from: E */
    public /* bridge */ /* synthetic */ C0954m mo9157E(long j) {
        mo9160L(j);
        return this;
    }

    @Override // p013b.p050d.p051a.C0954m
    /* renamed from: F */
    public void mo9158F(float... fArr) {
        C0950k[] kVarArr = this.f2080q;
        if (kVarArr == null || kVarArr.length == 0) {
            AbstractC0964c cVar = this.f2022C;
            if (cVar != null) {
                mo9210G(C0950k.m2618h(cVar, fArr));
                return;
            }
            mo9210G(C0950k.m2619i(this.f2021B, fArr));
            return;
        }
        super.mo9158F(fArr);
    }

    /* renamed from: J */
    public C0934i mo9165x() {
        return (C0934i) super.clone();
    }

    /* renamed from: L */
    public C0934i mo9160L(long j) {
        super.mo9117g(j);
        return this;
    }

    /* renamed from: M */
    public void mo9161M(AbstractC0964c cVar) {
        C0950k[] kVarArr = this.f2080q;
        if (kVarArr != null) {
            C0950k kVar = kVarArr[0];
            String f = kVar.mo9198f();
            kVar.mo9202l(cVar);
            this.f2081r.remove(f);
            this.f2081r.put(this.f2021B, kVar);
        }
        if (this.f2022C != null) {
            this.f2021B = cVar.mo9227b();
        }
        this.f2022C = cVar;
        this.f2073j = false;
    }

    /* renamed from: N */
    public void mo9162N(String str) {
        C0950k[] kVarArr = this.f2080q;
        if (kVarArr != null) {
            C0950k kVar = kVarArr[0];
            String f = kVar.mo9198f();
            kVar.mo9203m(str);
            this.f2081r.remove(f);
            this.f2081r.put(str, kVar);
        }
        this.f2021B = str;
        this.f2073j = false;
    }

    @Override // p013b.p050d.p051a.C0954m, p013b.p050d.p051a.AbstractC0918a
    /* renamed from: g */
    public /* bridge */ /* synthetic */ AbstractC0918a mo9117g(long j) {
        mo9160L(j);
        return this;
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: i */
    public void mo9119i(Object obj) {
        Object obj2 = this.f2020A;
        if (obj2 != obj) {
            this.f2020A = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.f2073j = false;
            }
        }
    }

    @Override // p013b.p050d.p051a.C0954m, p013b.p050d.p051a.AbstractC0918a
    /* renamed from: j */
    public void mo9120j() {
        super.mo9120j();
    }

    @Override // p013b.p050d.p051a.C0954m
    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f2020A;
        if (this.f2080q != null) {
            for (int i = 0; i < this.f2080q.length; i++) {
                str = str + "\n    " + this.f2080q[i].toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p050d.p051a.C0954m
    /* renamed from: v */
    public void mo9164v(float f) {
        super.mo9164v(f);
        int length = this.f2080q.length;
        for (int i = 0; i < length; i++) {
            this.f2080q[i].mo9200j(this.f2020A);
        }
    }
}
