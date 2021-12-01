package p013b.p014a.p015a.p020b0.p021e;

import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.p035x.C0776b;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.c */
public final class C0641c {

    /* renamed from: a */
    private C0776b f1170a;

    /* renamed from: b */
    private C0718r f1171b;

    /* renamed from: c */
    private C0718r f1172c;

    /* renamed from: d */
    private C0718r f1173d;

    /* renamed from: e */
    private C0718r f1174e;

    /* renamed from: f */
    private int f1175f;

    /* renamed from: g */
    private int f1176g;

    /* renamed from: h */
    private int f1177h;

    /* renamed from: i */
    private int f1178i;

    C0641c(C0641c cVar) {
        m990k(cVar.f1170a, cVar.f1171b, cVar.f1172c, cVar.f1173d, cVar.f1174e);
    }

    C0641c(C0776b bVar, C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4) {
        if (!(rVar == null && rVar3 == null) && (!(rVar2 == null && rVar4 == null) && ((rVar == null || rVar2 != null) && (rVar3 == null || rVar4 != null)))) {
            m990k(bVar, rVar, rVar2, rVar3, rVar4);
            return;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: b */
    private void m989b() {
        if (this.f1171b == null) {
            this.f1171b = new C0718r(0.0f, this.f1173d.mo8701d());
            this.f1172c = new C0718r(0.0f, this.f1174e.mo8701d());
        } else if (this.f1173d == null) {
            this.f1173d = new C0718r((float) (this.f1170a.mo8799j() - 1), this.f1171b.mo8701d());
            this.f1174e = new C0718r((float) (this.f1170a.mo8799j() - 1), this.f1172c.mo8701d());
        }
        this.f1175f = (int) Math.min(this.f1171b.mo8700c(), this.f1172c.mo8700c());
        this.f1176g = (int) Math.max(this.f1173d.mo8700c(), this.f1174e.mo8700c());
        this.f1177h = (int) Math.min(this.f1171b.mo8701d(), this.f1173d.mo8701d());
        this.f1178i = (int) Math.max(this.f1172c.mo8701d(), this.f1174e.mo8701d());
    }

    /* renamed from: k */
    private void m990k(C0776b bVar, C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4) {
        this.f1170a = bVar;
        this.f1171b = rVar;
        this.f1172c = rVar2;
        this.f1173d = rVar3;
        this.f1174e = rVar4;
        m989b();
    }

    /* renamed from: l */
    static C0641c m991l(C0641c cVar, C0641c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C0641c(cVar.f1170a, cVar.f1171b, cVar.f1172c, cVar2.f1173d, cVar2.f1174e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p013b.p014a.p015a.p020b0.p021e.C0641c mo8515a(int r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p020b0.p021e.C0641c.mo8515a(int, int, boolean):b.a.a.b0.e.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0718r mo8516c() {
        return this.f1172c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0718r mo8517d() {
        return this.f1174e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8518e() {
        return this.f1176g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8519f() {
        return this.f1178i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8520g() {
        return this.f1175f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8521h() {
        return this.f1177h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0718r mo8522i() {
        return this.f1171b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0718r mo8523j() {
        return this.f1173d;
    }
}
