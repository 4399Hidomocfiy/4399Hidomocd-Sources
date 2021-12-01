package p013b.p014a.p015a.p020b0.p021e;

import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.C0718r;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.h */
public final class C0648h extends C0647g {

    /* renamed from: c */
    private final boolean f1201c;

    C0648h(C0641c cVar, boolean z) {
        super(cVar);
        this.f1201c = z;
    }

    /* renamed from: l */
    private void m1041l(C0642d[] dVarArr, C0639a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C0642d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo8528e() % 30;
                int c = dVar.mo8526c();
                if (c > aVar.mo8510c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f1201c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo8508a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo8509b() || e % 3 != aVar.mo8511d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo8512e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8551g(C0639a aVar) {
        C0642d[] d = mo8547d();
        mo8556m();
        m1041l(d, aVar);
        C0641c a = mo8544a();
        C0718r i = this.f1201c ? a.mo8522i() : a.mo8523j();
        C0718r c = this.f1201c ? a.mo8516c() : a.mo8517d();
        int e = mo8548e((int) i.mo8701d());
        int e2 = mo8548e((int) c.mo8701d());
        float c2 = ((float) (e2 - e)) / ((float) aVar.mo8510c());
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C0642d dVar = d[e];
                int c3 = dVar.mo8526c() - i2;
                if (c3 == 0) {
                    i3++;
                } else {
                    if (c3 == 1) {
                        i4 = Math.max(i4, i3);
                    } else if (c3 < 0 || dVar.mo8526c() >= aVar.mo8510c() || c3 > e) {
                        d[e] = null;
                    } else {
                        if (i4 > 2) {
                            c3 *= i4 - 2;
                        }
                        boolean z = c3 >= e;
                        for (int i5 = 1; i5 <= c3 && !z; i5++) {
                            z = d[e - i5] != null;
                        }
                        if (z) {
                            d[e] = null;
                        }
                    }
                    i2 = dVar.mo8526c();
                    i3 = 1;
                }
            }
            e++;
        }
        double d2 = (double) c2;
        Double.isNaN(d2);
        return (int) (d2 + 0.5d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8552h(C0639a aVar) {
        C0641c a = mo8544a();
        C0718r i = this.f1201c ? a.mo8522i() : a.mo8523j();
        C0718r c = this.f1201c ? a.mo8516c() : a.mo8517d();
        int e = mo8548e((int) i.mo8701d());
        int e2 = mo8548e((int) c.mo8701d());
        float c2 = ((float) (e2 - e)) / ((float) aVar.mo8510c());
        C0642d[] d = mo8547d();
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C0642d dVar = d[e];
                dVar.mo8533j();
                int c3 = dVar.mo8526c() - i2;
                if (c3 == 0) {
                    i3++;
                } else {
                    if (c3 == 1) {
                        i4 = Math.max(i4, i3);
                    } else if (dVar.mo8526c() >= aVar.mo8510c()) {
                        d[e] = null;
                    }
                    i2 = dVar.mo8526c();
                    i3 = 1;
                }
            }
            e++;
        }
        double d2 = (double) c2;
        Double.isNaN(d2);
        return (int) (d2 + 0.5d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0639a mo8553i() {
        C0642d[] d = mo8547d();
        C0640b bVar = new C0640b();
        C0640b bVar2 = new C0640b();
        C0640b bVar3 = new C0640b();
        C0640b bVar4 = new C0640b();
        for (C0642d dVar : d) {
            if (dVar != null) {
                dVar.mo8533j();
                int e = dVar.mo8528e() % 30;
                int c = dVar.mo8526c();
                if (!this.f1201c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo8514b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo8514b(e / 3);
                    bVar3.mo8514b(e % 3);
                } else if (i == 2) {
                    bVar.mo8514b(e + 1);
                }
            }
        }
        if (bVar.mo8513a().length == 0 || bVar2.mo8513a().length == 0 || bVar3.mo8513a().length == 0 || bVar4.mo8513a().length == 0 || bVar.mo8513a()[0] < 1 || bVar2.mo8513a()[0] + bVar3.mo8513a()[0] < 3 || bVar2.mo8513a()[0] + bVar3.mo8513a()[0] > 90) {
            return null;
        }
        C0639a aVar = new C0639a(bVar.mo8513a()[0], bVar2.mo8513a()[0], bVar3.mo8513a()[0], bVar4.mo8513a()[0]);
        m1041l(d, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo8554j() {
        C0639a i = mo8553i();
        if (i == null) {
            return null;
        }
        mo8552h(i);
        int c = i.mo8510c();
        int[] iArr = new int[c];
        C0642d[] d = mo8547d();
        for (C0642d dVar : d) {
            if (dVar != null) {
                int c2 = dVar.mo8526c();
                if (c2 < c) {
                    iArr[c2] = iArr[c2] + 1;
                } else {
                    throw C0707h.m1320a();
                }
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo8555k() {
        return this.f1201c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8556m() {
        C0642d[] d = mo8547d();
        for (C0642d dVar : d) {
            if (dVar != null) {
                dVar.mo8533j();
            }
        }
    }

    @Override // p013b.p014a.p015a.p020b0.p021e.C0647g
    public String toString() {
        return "IsLeft: " + this.f1201c + '\n' + super.toString();
    }
}
