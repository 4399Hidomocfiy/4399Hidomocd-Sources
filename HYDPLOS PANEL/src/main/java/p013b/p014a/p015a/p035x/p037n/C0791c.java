package p013b.p014a.p015a.p035x.p037n;

/* renamed from: b.a.a.x.n.c */
public final class C0791c {

    /* renamed from: a */
    private final C0789a f1629a;

    public C0791c(C0789a aVar) {
        this.f1629a = aVar;
    }

    /* renamed from: b */
    private int[] m1641b(C0790b bVar) {
        int f = bVar.mo8844f();
        int i = 0;
        if (f == 1) {
            return new int[]{bVar.mo8842d(1)};
        }
        int[] iArr = new int[f];
        for (int i2 = 1; i2 < this.f1629a.mo8833f() && i < f; i2++) {
            if (bVar.mo8841c(i2) == 0) {
                iArr[i] = this.f1629a.mo8835h(i2);
                i++;
            }
        }
        if (i == f) {
            return iArr;
        }
        throw new C0793e("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m1642c(C0790b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f1629a.mo8835h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f1629a.mo8837j(iArr[i3], h);
                    i2 = this.f1629a.mo8837j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f1629a.mo8837j(bVar.mo8841c(h), this.f1629a.mo8835h(i2));
            if (this.f1629a.mo8831d() != 0) {
                iArr2[i] = this.f1629a.mo8837j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C0790b[] m1643d(C0790b bVar, C0790b bVar2, int i) {
        if (bVar.mo8844f() < bVar2.mo8844f()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        C0790b g = this.f1629a.mo8834g();
        C0790b e = this.f1629a.mo8832e();
        do {
            bVar2 = bVar;
            bVar = bVar2;
            g = e;
            if (bVar.mo8844f() < i / 2) {
                int d = g.mo8842d(0);
                if (d != 0) {
                    int h = this.f1629a.mo8835h(d);
                    return new C0790b[]{g.mo8846h(h), bVar.mo8846h(h)};
                }
                throw new C0793e("sigmaTilde(0) was zero");
            } else if (!bVar.mo8845g()) {
                C0790b g2 = this.f1629a.mo8834g();
                int h2 = this.f1629a.mo8835h(bVar.mo8842d(bVar.mo8844f()));
                while (bVar2.mo8844f() >= bVar.mo8844f() && !bVar2.mo8845g()) {
                    int f = bVar2.mo8844f() - bVar.mo8844f();
                    int j = this.f1629a.mo8837j(bVar2.mo8842d(bVar2.mo8844f()), h2);
                    g2 = g2.mo8839a(this.f1629a.mo8829b(f, j));
                    bVar2 = bVar2.mo8839a(bVar.mo8848j(f, j));
                }
                e = g2.mo8847i(g).mo8839a(g);
            } else {
                throw new C0793e("r_{i-1} was zero");
            }
        } while (bVar2.mo8844f() < bVar.mo8844f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo8850a(int[] iArr, int i) {
        C0790b bVar = new C0790b(this.f1629a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C0789a aVar = this.f1629a;
            int c = bVar.mo8841c(aVar.mo8830c(aVar.mo8831d() + i2));
            iArr2[(i - 1) - i2] = c;
            if (c != 0) {
                z = false;
            }
        }
        if (!z) {
            C0790b[] d = m1643d(this.f1629a.mo8829b(i, 1), new C0790b(this.f1629a, iArr2), i);
            C0790b bVar2 = d[0];
            C0790b bVar3 = d[1];
            int[] b = m1641b(bVar2);
            int[] c2 = m1642c(bVar3, b);
            for (int i3 = 0; i3 < b.length; i3++) {
                int length = (iArr.length - 1) - this.f1629a.mo8836i(b[i3]);
                if (length >= 0) {
                    iArr[length] = C0789a.m1621a(iArr[length], c2[i3]);
                } else {
                    throw new C0793e("Bad error location");
                }
            }
        }
    }
}
