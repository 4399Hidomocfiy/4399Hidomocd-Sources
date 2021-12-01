package p013b.p014a.p015a.p035x;

import java.util.Arrays;

/* renamed from: b.a.a.x.a */
public final class C0775a implements Cloneable {

    /* renamed from: a */
    private int[] f1539a;

    /* renamed from: b */
    private int f1540b;

    public C0775a() {
        this.f1540b = 0;
        this.f1539a = new int[1];
    }

    public C0775a(int i) {
        this.f1540b = i;
        this.f1539a = m1540n(i);
    }

    C0775a(int[] iArr, int i) {
        this.f1539a = iArr;
        this.f1540b = i;
    }

    /* renamed from: f */
    private void m1539f(int i) {
        if (i > this.f1539a.length * 32) {
            int[] n = m1540n(i);
            int[] iArr = this.f1539a;
            System.arraycopy(iArr, 0, n, 0, iArr.length);
            this.f1539a = n;
        }
    }

    /* renamed from: n */
    private static int[] m1540n(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo8766a(boolean z) {
        m1539f(this.f1540b + 1);
        if (z) {
            int[] iArr = this.f1539a;
            int i = this.f1540b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f1540b++;
    }

    /* renamed from: b */
    public void mo8767b(C0775a aVar) {
        int i = aVar.f1540b;
        m1539f(this.f1540b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo8766a(aVar.mo8773g(i2));
        }
    }

    /* renamed from: c */
    public void mo8768c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m1539f(this.f1540b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo8766a(z);
            i2--;
        }
    }

    /* renamed from: d */
    public void mo8770d() {
        int length = this.f1539a.length;
        for (int i = 0; i < length; i++) {
            this.f1539a[i] = 0;
        }
    }

    /* renamed from: e */
    public C0775a clone() {
        return new C0775a((int[]) this.f1539a.clone(), this.f1540b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0775a)) {
            return false;
        }
        C0775a aVar = (C0775a) obj;
        return this.f1540b == aVar.f1540b && Arrays.equals(this.f1539a, aVar.f1539a);
    }

    /* renamed from: g */
    public boolean mo8773g(int i) {
        return ((1 << (i & 31)) & this.f1539a[i / 32]) != 0;
    }

    /* renamed from: h */
    public int[] mo8774h() {
        return this.f1539a;
    }

    public int hashCode() {
        return (this.f1540b * 31) + Arrays.hashCode(this.f1539a);
    }

    /* renamed from: i */
    public int mo8776i(int i) {
        int i2 = this.f1540b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & this.f1539a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f1539a;
            if (i3 == iArr.length) {
                return this.f1540b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f1540b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: j */
    public int mo8777j(int i) {
        int i2 = this.f1540b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & (this.f1539a[i3] ^ -1);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f1539a;
            if (i3 == iArr.length) {
                return this.f1540b;
            }
            i4 = iArr[i3] ^ -1;
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f1540b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: k */
    public int mo8778k() {
        return this.f1540b;
    }

    /* renamed from: l */
    public int mo8779l() {
        return (this.f1540b + 7) / 8;
    }

    /* renamed from: m */
    public boolean mo8780m(int i, int i2, boolean z) {
        int i3;
        if (i2 < i) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            int i7 = i5;
            while (i7 <= i6) {
                int i8 = i7 > i5 ? 0 : i & 31;
                int i9 = i7 < i6 ? 31 : i4 & 31;
                if (i8 == 0 && i9 == 31) {
                    i3 = -1;
                } else {
                    i3 = 0;
                    while (i8 <= i9) {
                        i3 |= 1 << i8;
                        i8++;
                    }
                }
                int i10 = this.f1539a[i7] & i3;
                if (!z) {
                    i3 = 0;
                }
                if (i10 != i3) {
                    return false;
                }
                i7++;
            }
            return true;
        }
    }

    /* renamed from: o */
    public void mo8781o() {
        int[] iArr = new int[this.f1539a.length];
        int i = (this.f1540b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f1539a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f1540b;
        int i5 = i2 * 32;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = 1;
            for (int i8 = 0; i8 < 31 - i6; i8++) {
                i7 = (i7 << 1) | 1;
            }
            int i9 = (iArr[0] >> i6) & i7;
            for (int i10 = 1; i10 < i2; i10++) {
                int i11 = iArr[i10];
                iArr[i10 - 1] = i9 | (i11 << (32 - i6));
                i9 = (i11 >> i6) & i7;
            }
            iArr[i2 - 1] = i9;
        }
        this.f1539a = iArr;
    }

    /* renamed from: p */
    public void mo8782p(int i) {
        int[] iArr = this.f1539a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: q */
    public void mo8783q(int i, int i2) {
        this.f1539a[i / 32] = i2;
    }

    /* renamed from: r */
    public void mo8784r(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo8773g(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    /* renamed from: s */
    public void mo8785s(C0775a aVar) {
        if (this.f1539a.length == aVar.f1539a.length) {
            int i = 0;
            while (true) {
                int[] iArr = this.f1539a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f1539a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f1540b);
        for (int i = 0; i < this.f1540b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo8773g(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}
