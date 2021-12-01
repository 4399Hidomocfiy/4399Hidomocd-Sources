package p013b.p014a.p015a.p035x.p037n;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.x.n.b */
public final class C0790b {

    /* renamed from: a */
    private final C0789a f1627a;

    /* renamed from: b */
    private final int[] f1628b;

    C0790b(C0789a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f1627a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f1628b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f1628b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f1628b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0790b mo8839a(C0790b bVar) {
        if (!this.f1627a.equals(bVar.f1627a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo8845g()) {
            return bVar;
        } else {
            if (bVar.mo8845g()) {
                return this;
            }
            int[] iArr = this.f1628b;
            int[] iArr2 = bVar.f1628b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = C0789a.m1621a(iArr2[i - length], iArr[i]);
            }
            return new C0790b(this.f1627a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0790b[] mo8840b(C0790b bVar) {
        if (!this.f1627a.equals(bVar.f1627a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo8845g()) {
            C0790b g = this.f1627a.mo8834g();
            int h = this.f1627a.mo8835h(bVar.mo8842d(bVar.mo8844f()));
            C0790b bVar2 = this;
            while (bVar2.mo8844f() >= bVar.mo8844f() && !bVar2.mo8845g()) {
                int f = bVar2.mo8844f() - bVar.mo8844f();
                int j = this.f1627a.mo8837j(bVar2.mo8842d(bVar2.mo8844f()), h);
                C0790b j2 = bVar.mo8848j(f, j);
                g = g.mo8839a(this.f1627a.mo8829b(f, j));
                bVar2 = bVar2.mo8839a(j2);
            }
            return new C0790b[]{g, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8841c(int i) {
        if (i == 0) {
            return mo8842d(0);
        }
        int[] iArr = this.f1628b;
        int length = iArr.length;
        if (i == 1) {
            int i2 = 0;
            for (int i3 : iArr) {
                i2 = C0789a.m1621a(i2, i3);
            }
            return i2;
        }
        int i4 = iArr[0];
        for (int i5 = 1; i5 < length; i5++) {
            i4 = C0789a.m1621a(this.f1627a.mo8837j(i, i4), this.f1628b[i5]);
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8842d(int i) {
        int[] iArr = this.f1628b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo8843e() {
        return this.f1628b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8844f() {
        return this.f1628b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo8845g() {
        return this.f1628b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0790b mo8846h(int i) {
        if (i == 0) {
            return this.f1627a.mo8834g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f1628b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f1627a.mo8837j(this.f1628b[i2], i);
        }
        return new C0790b(this.f1627a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0790b mo8847i(C0790b bVar) {
        if (!this.f1627a.equals(bVar.f1627a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo8845g() || bVar.mo8845g()) {
            return this.f1627a.mo8834g();
        } else {
            int[] iArr = this.f1628b;
            int length = iArr.length;
            int[] iArr2 = bVar.f1628b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C0789a.m1621a(iArr3[i4], this.f1627a.mo8837j(i2, iArr2[i3]));
                }
            }
            return new C0790b(this.f1627a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0790b mo8848j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f1627a.mo8834g();
        } else {
            int length = this.f1628b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f1627a.mo8837j(this.f1628b[i3], i2);
            }
            return new C0790b(this.f1627a, iArr);
        }
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(mo8844f() * 8);
        for (int f = mo8844f(); f >= 0; f--) {
            int d = mo8842d(f);
            if (d != 0) {
                if (d < 0) {
                    sb.append(" - ");
                    d = -d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f == 0 || d != 1) {
                    int i = this.f1627a.mo8836i(d);
                    if (i == 0) {
                        c = '1';
                    } else if (i == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                    sb.append(c);
                }
                if (f != 0) {
                    if (f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
