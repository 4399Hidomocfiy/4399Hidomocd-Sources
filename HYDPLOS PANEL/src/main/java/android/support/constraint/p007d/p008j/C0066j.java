package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.C0043e;
import android.support.constraint.p007d.C0048i;
import android.support.constraint.p007d.p008j.C0053d;

/* renamed from: android.support.constraint.d.j.j */
public class C0066j extends C0068l {

    /* renamed from: c */
    C0053d f634c;

    /* renamed from: d */
    C0066j f635d;

    /* renamed from: e */
    float f636e;

    /* renamed from: f */
    C0066j f637f;

    /* renamed from: g */
    float f638g;

    /* renamed from: h */
    int f639h = 0;

    /* renamed from: i */
    private C0066j f640i;

    /* renamed from: j */
    private C0067k f641j = null;

    /* renamed from: k */
    private int f642k = 1;

    /* renamed from: l */
    private C0067k f643l = null;

    /* renamed from: m */
    private int f644m = 1;

    public C0066j(C0053d dVar) {
        this.f634c = dVar;
    }

    @Override // android.support.constraint.p007d.p008j.C0068l
    /* renamed from: e */
    public void mo296e() {
        super.mo296e();
        this.f635d = null;
        this.f636e = 0.0f;
        this.f641j = null;
        this.f642k = 1;
        this.f643l = null;
        this.f644m = 1;
        this.f637f = null;
        this.f638g = 0.0f;
        this.f640i = null;
        this.f639h = 0;
    }

    @Override // android.support.constraint.p007d.p008j.C0068l
    /* renamed from: f */
    public void mo297f() {
        int i;
        C0066j jVar;
        C0066j jVar2;
        C0066j jVar3;
        C0066j jVar4;
        C0066j jVar5;
        C0066j jVar6;
        float f;
        float f2;
        C0066j jVar7;
        float f3;
        boolean z = true;
        if (this.f647b != 1 && (i = this.f639h) != 4) {
            C0067k kVar = this.f641j;
            if (kVar != null) {
                if (kVar.f647b == 1) {
                    this.f636e = ((float) this.f642k) * kVar.f645c;
                } else {
                    return;
                }
            }
            C0067k kVar2 = this.f643l;
            if (kVar2 != null) {
                if (kVar2.f647b == 1) {
                    float f4 = kVar2.f645c;
                } else {
                    return;
                }
            }
            if (i == 1 && ((jVar7 = this.f635d) == null || jVar7.f647b == 1)) {
                if (jVar7 == null) {
                    this.f637f = this;
                    f3 = this.f636e;
                } else {
                    this.f637f = jVar7.f637f;
                    f3 = jVar7.f638g + this.f636e;
                }
                this.f638g = f3;
                mo313b();
                return;
            }
            if (i == 2 && (jVar4 = this.f635d) != null && jVar4.f647b == 1 && (jVar5 = this.f640i) != null && (jVar6 = jVar5.f635d) != null && jVar6.f647b == 1) {
                if (C0043e.m133x() != null) {
                    C0043e.m133x().f476v++;
                }
                C0066j jVar8 = this.f635d;
                this.f637f = jVar8.f637f;
                C0066j jVar9 = this.f640i;
                C0066j jVar10 = jVar9.f635d;
                jVar9.f637f = jVar10.f637f;
                C0053d dVar = this.f634c;
                C0053d.EnumC0057d dVar2 = dVar.f522c;
                C0053d.EnumC0057d dVar3 = C0053d.EnumC0057d.RIGHT;
                int i2 = 0;
                if (!(dVar2 == dVar3 || dVar2 == C0053d.EnumC0057d.BOTTOM)) {
                    z = false;
                }
                float f5 = z ? jVar8.f638g - jVar10.f638g : jVar10.f638g - jVar8.f638g;
                if (dVar2 == C0053d.EnumC0057d.LEFT || dVar2 == dVar3) {
                    f2 = f5 - ((float) dVar.f521b.mo201A());
                    f = this.f634c.f521b.f566S;
                } else {
                    f2 = f5 - ((float) dVar.f521b.mo250p());
                    f = this.f634c.f521b.f567T;
                }
                int d = this.f634c.mo189d();
                int d2 = this.f640i.f634c.mo189d();
                if (this.f634c.mo194i() == this.f640i.f634c.mo194i()) {
                    f = 0.5f;
                    d2 = 0;
                } else {
                    i2 = d;
                }
                float f6 = (float) i2;
                float f7 = (float) d2;
                float f8 = (f2 - f6) - f7;
                if (z) {
                    C0066j jVar11 = this.f640i;
                    jVar11.f638g = jVar11.f635d.f638g + f7 + (f8 * f);
                    this.f638g = (this.f635d.f638g - f6) - (f8 * (1.0f - f));
                } else {
                    this.f638g = this.f635d.f638g + f6 + (f8 * f);
                    C0066j jVar12 = this.f640i;
                    jVar12.f638g = (jVar12.f635d.f638g - f7) - (f8 * (1.0f - f));
                }
            } else if (i == 3 && (jVar = this.f635d) != null && jVar.f647b == 1 && (jVar2 = this.f640i) != null && (jVar3 = jVar2.f635d) != null && jVar3.f647b == 1) {
                if (C0043e.m133x() != null) {
                    C0043e.m133x().f477w++;
                }
                C0066j jVar13 = this.f635d;
                this.f637f = jVar13.f637f;
                C0066j jVar14 = this.f640i;
                C0066j jVar15 = jVar14.f635d;
                jVar14.f637f = jVar15.f637f;
                this.f638g = jVar13.f638g + this.f636e;
                jVar14.f638g = jVar15.f638g + jVar14.f636e;
            } else if (i == 5) {
                this.f634c.f521b.mo181N();
                return;
            } else {
                return;
            }
            mo313b();
            this.f640i.mo313b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo298g(C0043e eVar) {
        C0048i g = this.f634c.mo192g();
        C0066j jVar = this.f637f;
        if (jVar == null) {
            eVar.mo155f(g, (int) this.f638g);
        } else {
            eVar.mo154e(g, eVar.mo164r(jVar.f634c), (int) this.f638g, 6);
        }
    }

    /* renamed from: h */
    public void mo299h(int i, C0066j jVar, int i2) {
        this.f639h = i;
        this.f635d = jVar;
        this.f636e = (float) i2;
        jVar.mo312a(this);
    }

    /* renamed from: i */
    public void mo300i(C0066j jVar, int i) {
        this.f635d = jVar;
        this.f636e = (float) i;
        jVar.mo312a(this);
    }

    /* renamed from: j */
    public void mo301j(C0066j jVar, int i, C0067k kVar) {
        this.f635d = jVar;
        jVar.mo312a(this);
        this.f641j = kVar;
        this.f642k = i;
        kVar.mo312a(this);
    }

    /* renamed from: k */
    public float mo302k() {
        return this.f638g;
    }

    /* renamed from: l */
    public void mo303l(C0066j jVar, float f) {
        int i = this.f647b;
        if (i == 0 || !(this.f637f == jVar || this.f638g == f)) {
            this.f637f = jVar;
            this.f638g = f;
            if (i == 1) {
                mo314c();
            }
            mo313b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo304m(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: n */
    public void mo305n(C0066j jVar, float f) {
        this.f640i = jVar;
    }

    /* renamed from: o */
    public void mo306o(C0066j jVar, int i, C0067k kVar) {
        this.f640i = jVar;
        this.f643l = kVar;
        this.f644m = i;
    }

    /* renamed from: p */
    public void mo307p(int i) {
        this.f639h = i;
    }

    /* renamed from: q */
    public void mo308q() {
        C0053d i = this.f634c.mo194i();
        if (i != null) {
            if (i.mo194i() == this.f634c) {
                this.f639h = 4;
                i.mo191f().f639h = 4;
            }
            int d = this.f634c.mo189d();
            C0053d.EnumC0057d dVar = this.f634c.f522c;
            if (dVar == C0053d.EnumC0057d.RIGHT || dVar == C0053d.EnumC0057d.BOTTOM) {
                d = -d;
            }
            mo300i(i.mo191f(), d);
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f647b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f634c);
            str = " UNRESOLVED} type: ";
        } else if (this.f637f == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f634c);
            sb.append(", RESOLVED: ");
            sb.append(this.f638g);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f634c);
            sb.append(", RESOLVED: ");
            sb.append(this.f637f);
            sb.append(":");
            sb.append(this.f638g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(mo304m(this.f639h));
        return sb.toString();
    }
}
