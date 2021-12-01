package p013b.p014a.p015a.p020b0.p021e;

import java.util.Formatter;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.f */
public final class C0646f {

    /* renamed from: a */
    private final C0639a f1195a;

    /* renamed from: b */
    private final C0647g[] f1196b;

    /* renamed from: c */
    private C0641c f1197c;

    /* renamed from: d */
    private final int f1198d;

    C0646f(C0639a aVar, C0641c cVar) {
        this.f1195a = aVar;
        int a = aVar.mo8508a();
        this.f1198d = a;
        this.f1197c = cVar;
        this.f1196b = new C0647g[(a + 2)];
    }

    /* renamed from: a */
    private void m1018a(C0647g gVar) {
        if (gVar != null) {
            ((C0648h) gVar).mo8551g(this.f1195a);
        }
    }

    /* renamed from: b */
    private static boolean m1019b(C0642d dVar, C0642d dVar2) {
        if (dVar2 == null || !dVar2.mo8530g() || dVar2.mo8524a() != dVar.mo8524a()) {
            return false;
        }
        dVar.mo8532i(dVar2.mo8526c());
        return true;
    }

    /* renamed from: c */
    private static int m1020c(int i, int i2, C0642d dVar) {
        if (dVar == null || dVar.mo8530g()) {
            return i2;
        }
        if (!dVar.mo8531h(i)) {
            return i2 + 1;
        }
        dVar.mo8532i(i);
        return 0;
    }

    /* renamed from: d */
    private int m1021d() {
        int f = m1023f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f1198d + 1; i++) {
            C0642d[] d = this.f1196b[i].mo8547d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo8530g()) {
                    m1022e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m1022e(int i, int i2, C0642d[] dVarArr) {
        C0642d dVar = dVarArr[i2];
        C0642d[] d = this.f1196b[i - 1].mo8547d();
        C0647g[] gVarArr = this.f1196b;
        int i3 = i + 1;
        C0642d[] d2 = gVarArr[i3] != null ? gVarArr[i3].mo8547d() : d;
        C0642d[] dVarArr2 = new C0642d[14];
        dVarArr2[2] = d[i2];
        dVarArr2[3] = d2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = d[i5];
            dVarArr2[5] = d2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = d[i6];
            dVarArr2[11] = d2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = d[i7];
            dVarArr2[7] = d2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = d[i8];
            dVarArr2[13] = d2[i8];
        }
        while (i4 < 14 && !m1019b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    private int m1023f() {
        m1024g();
        return m1025h() + m1026i();
    }

    /* renamed from: g */
    private void m1024g() {
        C0647g[] gVarArr = this.f1196b;
        if (!(gVarArr[0] == null || gVarArr[this.f1198d + 1] == null)) {
            C0642d[] d = gVarArr[0].mo8547d();
            C0642d[] d2 = this.f1196b[this.f1198d + 1].mo8547d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo8526c() != d2[i].mo8526c())) {
                    for (int i2 = 1; i2 <= this.f1198d; i2++) {
                        C0642d dVar = this.f1196b[i2].mo8547d()[i];
                        if (dVar != null) {
                            dVar.mo8532i(d[i].mo8526c());
                            if (!dVar.mo8530g()) {
                                this.f1196b[i2].mo8547d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m1025h() {
        C0647g[] gVarArr = this.f1196b;
        if (gVarArr[0] == null) {
            return 0;
        }
        C0642d[] d = gVarArr[0].mo8547d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo8526c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f1198d + 1 && i3 < 2; i4++) {
                    C0642d dVar = this.f1196b[i4].mo8547d()[i2];
                    if (dVar != null) {
                        i3 = m1020c(c, i3, dVar);
                        if (!dVar.mo8530g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m1026i() {
        C0647g[] gVarArr = this.f1196b;
        int i = this.f1198d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C0642d[] d = gVarArr[i + 1].mo8547d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo8526c();
                int i4 = 0;
                for (int i5 = this.f1198d + 1; i5 > 0 && i4 < 2; i5--) {
                    C0642d dVar = this.f1196b[i5].mo8547d()[i3];
                    if (dVar != null) {
                        i4 = m1020c(c, i4, dVar);
                        if (!dVar.mo8530g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo8535j() {
        return this.f1198d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo8536k() {
        return this.f1195a.mo8509b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo8537l() {
        return this.f1195a.mo8510c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0641c mo8538m() {
        return this.f1197c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0647g mo8539n(int i) {
        return this.f1196b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0647g[] mo8540o() {
        m1018a(this.f1196b[0]);
        m1018a(this.f1196b[this.f1198d + 1]);
        int i = 928;
        while (true) {
            int d = m1021d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f1196b;
    }

    /* renamed from: p */
    public void mo8541p(C0641c cVar) {
        this.f1197c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo8542q(int i, C0647g gVar) {
        this.f1196b[i] = gVar;
    }

    public String toString() {
        C0647g[] gVarArr = this.f1196b;
        C0647g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f1198d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < gVar.mo8547d().length; i++) {
            formatter.format("CW %3d:", Integer.valueOf(i));
            for (int i2 = 0; i2 < this.f1198d + 2; i2++) {
                C0647g[] gVarArr2 = this.f1196b;
                if (gVarArr2[i2] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    C0642d dVar = gVarArr2[i2].mo8547d()[i];
                    if (dVar == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", Integer.valueOf(dVar.mo8526c()), Integer.valueOf(dVar.mo8528e()));
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
