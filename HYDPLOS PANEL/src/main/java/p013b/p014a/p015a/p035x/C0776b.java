package p013b.p014a.p015a.p035x;

import java.util.Arrays;

/* renamed from: b.a.a.x.b */
public final class C0776b implements Cloneable {

    /* renamed from: a */
    private final int f1541a;

    /* renamed from: b */
    private final int f1542b;

    /* renamed from: c */
    private final int f1543c;

    /* renamed from: d */
    private final int[] f1544d;

    public C0776b(int i) {
        this(i, i);
    }

    public C0776b(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f1541a = i;
        this.f1542b = i2;
        int i3 = (i + 31) / 32;
        this.f1543c = i3;
        this.f1544d = new int[(i3 * i2)];
    }

    private C0776b(int i, int i2, int i3, int[] iArr) {
        this.f1541a = i;
        this.f1542b = i2;
        this.f1543c = i3;
        this.f1544d = iArr;
    }

    /* renamed from: a */
    public void mo8787a() {
        int length = this.f1544d.length;
        for (int i = 0; i < length; i++) {
            this.f1544d[i] = 0;
        }
    }

    /* renamed from: b */
    public C0776b clone() {
        return new C0776b(this.f1541a, this.f1542b, this.f1543c, (int[]) this.f1544d.clone());
    }

    /* renamed from: c */
    public void mo8789c(int i, int i2) {
        int i3 = (i2 * this.f1543c) + (i / 32);
        int[] iArr = this.f1544d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: d */
    public boolean mo8791d(int i, int i2) {
        return ((this.f1544d[(i2 * this.f1543c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: e */
    public int[] mo8792e() {
        int length = this.f1544d.length - 1;
        while (length >= 0 && this.f1544d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f1543c;
        int i2 = length / i;
        int i3 = (length % i) * 32;
        int i4 = 31;
        while ((this.f1544d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0776b)) {
            return false;
        }
        C0776b bVar = (C0776b) obj;
        return this.f1541a == bVar.f1541a && this.f1542b == bVar.f1542b && this.f1543c == bVar.f1543c && Arrays.equals(this.f1544d, bVar.f1544d);
    }

    /* renamed from: f */
    public int[] mo8794f() {
        int i = this.f1541a;
        int i2 = this.f1542b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f1542b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f1543c;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f1544d[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 * 32;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        int i14 = i3 - i;
        int i15 = i4 - i2;
        if (i14 < 0 || i15 < 0) {
            return null;
        }
        return new int[]{i, i2, i14, i15};
    }

    /* renamed from: g */
    public int mo8795g() {
        return this.f1542b;
    }

    /* renamed from: h */
    public C0775a mo8796h(int i, C0775a aVar) {
        if (aVar == null || aVar.mo8778k() < this.f1541a) {
            aVar = new C0775a(this.f1541a);
        } else {
            aVar.mo8770d();
        }
        int i2 = i * this.f1543c;
        for (int i3 = 0; i3 < this.f1543c; i3++) {
            aVar.mo8783q(i3 * 32, this.f1544d[i2 + i3]);
        }
        return aVar;
    }

    public int hashCode() {
        int i = this.f1541a;
        return (((((((i * 31) + i) * 31) + this.f1542b) * 31) + this.f1543c) * 31) + Arrays.hashCode(this.f1544d);
    }

    /* renamed from: i */
    public int[] mo8798i() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f1544d;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f1543c;
        int i3 = i / i2;
        int i4 = (i % i2) * 32;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: j */
    public int mo8799j() {
        return this.f1541a;
    }

    /* renamed from: k */
    public void mo8800k() {
        int j = mo8799j();
        int g = mo8795g();
        C0775a aVar = new C0775a(j);
        C0775a aVar2 = new C0775a(j);
        for (int i = 0; i < (g + 1) / 2; i++) {
            aVar = mo8796h(i, aVar);
            int i2 = (g - 1) - i;
            aVar2 = mo8796h(i2, aVar2);
            aVar.mo8781o();
            aVar2.mo8781o();
            mo8803n(i, aVar2);
            mo8803n(i2, aVar);
        }
    }

    /* renamed from: l */
    public void mo8801l(int i, int i2) {
        int i3 = (i2 * this.f1543c) + (i / 32);
        int[] iArr = this.f1544d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: m */
    public void mo8802m(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f1542b || i5 > this.f1541a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f1543c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f1544d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: n */
    public void mo8803n(int i, C0775a aVar) {
        int[] h = aVar.mo8774h();
        int[] iArr = this.f1544d;
        int i2 = this.f1543c;
        System.arraycopy(h, 0, iArr, i * i2, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f1542b * (this.f1541a + 1));
        for (int i = 0; i < this.f1542b; i++) {
            for (int i2 = 0; i2 < this.f1541a; i2++) {
                sb.append(mo8791d(i2, i) ? "X " : "  ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
