package p013b.p014a.p015a.p038y.p039c;

import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.p035x.C0776b;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.c.a */
public final class C0796a {

    /* renamed from: a */
    private final C0776b f1634a;

    /* renamed from: b */
    private final C0776b f1635b;

    /* renamed from: c */
    private final C0802e f1636c;

    C0796a(C0776b bVar) {
        int g = bVar.mo8795g();
        if (g < 8 || g > 144 || (g & 1) != 0) {
            throw C0707h.m1320a();
        }
        this.f1636c = m1654j(bVar);
        C0776b a = mo8852a(bVar);
        this.f1634a = a;
        this.f1635b = new C0776b(a.mo8799j(), a.mo8795g());
    }

    /* renamed from: j */
    private static C0802e m1654j(C0776b bVar) {
        return C0802e.m1679h(bVar.mo8795g(), bVar.mo8799j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0776b mo8852a(C0776b bVar) {
        int f = this.f1636c.mo8868f();
        int e = this.f1636c.mo8867e();
        if (bVar.mo8795g() == f) {
            int c = this.f1636c.mo8865c();
            int b = this.f1636c.mo8864b();
            int i = f / c;
            int i2 = e / b;
            C0776b bVar2 = new C0776b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo8791d(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo8801l(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0802e mo8853b() {
        return this.f1636c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo8854c() {
        byte[] bArr = new byte[this.f1636c.mo8869g()];
        int g = this.f1634a.mo8795g();
        int j = this.f1634a.mo8799j();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == g && i == 0 && !z) {
                bArr[i2] = (byte) mo8855d(g, j);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = g - 2;
                if (i3 == i4 && i == 0 && (j & 3) != 0 && !z2) {
                    bArr[i2] = (byte) mo8856e(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == g + 4 && i == 2 && (j & 7) == 0 && !z3) {
                    bArr[i2] = (byte) mo8857f(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (j & 7) == 4 && !z4) {
                    bArr[i2] = (byte) mo8858g(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < g && i >= 0 && !this.f1635b.mo8791d(i, i3)) {
                            bArr[i2] = (byte) mo8860i(i3, i, g, j);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < j);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < j && !this.f1635b.mo8791d(i6, i5)) {
                            bArr[i2] = (byte) mo8860i(i5, i6, g, j);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= g) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= g && i >= j) {
                break;
            }
        }
        if (i2 == this.f1636c.mo8869g()) {
            return bArr;
        }
        throw C0707h.m1320a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8855d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo8859h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (mo8859h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo8859h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo8859h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (mo8859h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (mo8859h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (mo8859h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return mo8859h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8856e(int i, int i2) {
        int i3 = (mo8859h(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (mo8859h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo8859h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo8859h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo8859h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (mo8859h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (mo8859h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return mo8859h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8857f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo8859h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (mo8859h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (mo8859h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (mo8859h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (mo8859h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (mo8859h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo8859h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return mo8859h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8858g(int i, int i2) {
        int i3 = (mo8859h(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (mo8859h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo8859h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo8859h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (mo8859h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (mo8859h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (mo8859h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return mo8859h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo8859h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f1635b.mo8801l(i2, i);
        return this.f1634a.mo8791d(i2, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo8860i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (mo8859h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (mo8859h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (mo8859h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (mo8859h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo8859h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (mo8859h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (mo8859h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return mo8859h(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
