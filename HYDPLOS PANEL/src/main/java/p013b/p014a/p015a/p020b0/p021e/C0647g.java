package p013b.p014a.p015a.p020b0.p021e;

import java.util.Formatter;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.g */
public class C0647g {

    /* renamed from: a */
    private final C0641c f1199a;

    /* renamed from: b */
    private final C0642d[] f1200b;

    C0647g(C0641c cVar) {
        this.f1199a = new C0641c(cVar);
        this.f1200b = new C0642d[((cVar.mo8519f() - cVar.mo8521h()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0641c mo8544a() {
        return this.f1199a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0642d mo8545b(int i) {
        return this.f1200b[mo8548e(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0642d mo8546c(int i) {
        C0642d dVar;
        C0642d dVar2;
        C0642d b = mo8545b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo8548e(i) - i2;
            if (e >= 0 && (dVar2 = this.f1200b[e]) != null) {
                return dVar2;
            }
            int e2 = mo8548e(i) + i2;
            C0642d[] dVarArr = this.f1200b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0642d[] mo8547d() {
        return this.f1200b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo8548e(int i) {
        return i - this.f1199a.mo8521h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo8549f(int i, C0642d dVar) {
        this.f1200b[mo8548e(i)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        C0642d[] dVarArr = this.f1200b;
        int i = 0;
        for (C0642d dVar : dVarArr) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", Integer.valueOf(i));
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(dVar.mo8526c()), Integer.valueOf(dVar.mo8528e()));
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
