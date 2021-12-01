package p013b.p014a.p015a.p020b0.p021e.p022k;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.k.c */
public final class C0653c {

    /* renamed from: a */
    private final C0652b f1211a;

    /* renamed from: b */
    private final int[] f1212b;

    C0653c(C0652b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f1211a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f1212b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f1212b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f1212b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0653c mo8568a(C0653c cVar) {
        if (!this.f1211a.equals(cVar.f1211a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo8572e()) {
            return cVar;
        } else {
            if (cVar.mo8572e()) {
                return this;
            }
            int[] iArr = this.f1212b;
            int[] iArr2 = cVar.f1212b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f1211a.mo8558a(iArr2[i - length], iArr[i]);
            }
            return new C0653c(this.f1211a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8569b(int i) {
        if (i == 0) {
            return mo8570c(0);
        }
        int[] iArr = this.f1212b;
        int length = iArr.length;
        if (i == 1) {
            int i2 = 0;
            for (int i3 : iArr) {
                i2 = this.f1211a.mo8558a(i2, i3);
            }
            return i2;
        }
        int i4 = iArr[0];
        for (int i5 = 1; i5 < length; i5++) {
            C0652b bVar = this.f1211a;
            i4 = bVar.mo8558a(bVar.mo8566i(i, i4), this.f1212b[i5]);
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8570c(int i) {
        int[] iArr = this.f1212b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8571d() {
        return this.f1212b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8572e() {
        return this.f1212b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0653c mo8573f(int i) {
        if (i == 0) {
            return this.f1211a.mo8563f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f1212b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f1211a.mo8566i(this.f1212b[i2], i);
        }
        return new C0653c(this.f1211a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0653c mo8574g(C0653c cVar) {
        if (!this.f1211a.equals(cVar.f1211a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo8572e() || cVar.mo8572e()) {
            return this.f1211a.mo8563f();
        } else {
            int[] iArr = this.f1212b;
            int length = iArr.length;
            int[] iArr2 = cVar.f1212b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C0652b bVar = this.f1211a;
                    iArr3[i4] = bVar.mo8558a(iArr3[i4], bVar.mo8566i(i2, iArr2[i3]));
                }
            }
            return new C0653c(this.f1211a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0653c mo8575h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f1211a.mo8563f();
        } else {
            int length = this.f1212b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f1211a.mo8566i(this.f1212b[i3], i2);
            }
            return new C0653c(this.f1211a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0653c mo8576i() {
        int length = this.f1212b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f1211a.mo8567j(0, this.f1212b[i]);
        }
        return new C0653c(this.f1211a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0653c mo8577j(C0653c cVar) {
        if (this.f1211a.equals(cVar.f1211a)) {
            return cVar.mo8572e() ? this : mo8568a(cVar.mo8576i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo8571d() * 8);
        for (int d = mo8571d(); d >= 0; d--) {
            int c = mo8570c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
