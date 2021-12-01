package p013b.p014a.p015a.p020b0.p021e.p022k;

import p013b.p014a.p015a.C0703d;

/* renamed from: b.a.a.b0.e.k.a */
public final class C0651a {

    /* renamed from: a */
    private final C0652b f1204a = C0652b.f1205f;

    /* renamed from: b */
    private int[] m1076b(C0653c cVar) {
        int d = cVar.mo8571d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f1204a.mo8562e() && i < d; i2++) {
            if (cVar.mo8569b(i2) == 0) {
                iArr[i] = this.f1204a.mo8564g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw C0703d.m1317a();
    }

    /* renamed from: c */
    private int[] m1077c(C0653c cVar, C0653c cVar2, int[] iArr) {
        int d = cVar2.mo8571d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f1204a.mo8566i(i, cVar2.mo8570c(i));
        }
        C0653c cVar3 = new C0653c(this.f1204a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f1204a.mo8564g(iArr[i2]);
            iArr3[i2] = this.f1204a.mo8566i(this.f1204a.mo8567j(0, cVar.mo8569b(g)), this.f1204a.mo8564g(cVar3.mo8569b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C0653c[] m1078d(C0653c cVar, C0653c cVar2, int i) {
        if (cVar.mo8571d() < cVar2.mo8571d()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        C0653c f = this.f1204a.mo8563f();
        C0653c d = this.f1204a.mo8561d();
        while (true) {
            cVar2 = cVar;
            cVar = cVar2;
            f = d;
            if (cVar.mo8571d() < i / 2) {
                int c = f.mo8570c(0);
                if (c != 0) {
                    int g = this.f1204a.mo8564g(c);
                    return new C0653c[]{f.mo8573f(g), cVar.mo8573f(g)};
                }
                throw C0703d.m1317a();
            } else if (!cVar.mo8572e()) {
                C0653c f2 = this.f1204a.mo8563f();
                int g2 = this.f1204a.mo8564g(cVar.mo8570c(cVar.mo8571d()));
                while (cVar2.mo8571d() >= cVar.mo8571d() && !cVar2.mo8572e()) {
                    int d2 = cVar2.mo8571d() - cVar.mo8571d();
                    int i2 = this.f1204a.mo8566i(cVar2.mo8570c(cVar2.mo8571d()), g2);
                    f2 = f2.mo8568a(this.f1204a.mo8559b(d2, i2));
                    cVar2 = cVar2.mo8577j(cVar.mo8575h(d2, i2));
                }
                d = f2.mo8574g(f).mo8577j(f).mo8576i();
            } else {
                throw C0703d.m1317a();
            }
        }
    }

    /* renamed from: a */
    public int mo8557a(int[] iArr, int i, int[] iArr2) {
        C0653c cVar = new C0653c(this.f1204a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int b = cVar.mo8569b(this.f1204a.mo8560c(i2));
            iArr3[i - i2] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C0653c d = this.f1204a.mo8561d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int c = this.f1204a.mo8560c((iArr.length - 1) - i3);
                C0652b bVar = this.f1204a;
                d = d.mo8574g(new C0653c(bVar, new int[]{bVar.mo8567j(0, c), 1}));
            }
        }
        C0653c[] d2 = m1078d(this.f1204a.mo8559b(i, 1), new C0653c(this.f1204a, iArr3), i);
        C0653c cVar2 = d2[0];
        C0653c cVar3 = d2[1];
        int[] b2 = m1076b(cVar2);
        int[] c2 = m1077c(cVar3, cVar2, b2);
        for (int i4 = 0; i4 < b2.length; i4++) {
            int length = (iArr.length - 1) - this.f1204a.mo8565h(b2[i4]);
            if (length >= 0) {
                iArr[length] = this.f1204a.mo8567j(iArr[length], c2[i4]);
            } else {
                throw C0703d.m1317a();
            }
        }
        return b2.length;
    }
}
