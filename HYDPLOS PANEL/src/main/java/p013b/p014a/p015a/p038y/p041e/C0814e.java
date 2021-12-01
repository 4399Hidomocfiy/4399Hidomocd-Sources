package p013b.p014a.p015a.p038y.p041e;

import java.util.Arrays;

/* renamed from: b.a.a.y.e.e */
public class C0814e {

    /* renamed from: a */
    private final CharSequence f1670a;

    /* renamed from: b */
    private final int f1671b;

    /* renamed from: c */
    private final int f1672c;

    /* renamed from: d */
    private final byte[] f1673d;

    public C0814e(CharSequence charSequence, int i, int i2) {
        this.f1670a = charSequence;
        this.f1672c = i;
        this.f1671b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f1673d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    private void m1718a(int i) {
        m1722g(this.f1671b - 1, 0, i, 1);
        m1722g(this.f1671b - 1, 1, i, 2);
        m1722g(this.f1671b - 1, 2, i, 3);
        m1722g(0, this.f1672c - 2, i, 4);
        m1722g(0, this.f1672c - 1, i, 5);
        m1722g(1, this.f1672c - 1, i, 6);
        m1722g(2, this.f1672c - 1, i, 7);
        m1722g(3, this.f1672c - 1, i, 8);
    }

    /* renamed from: b */
    private void m1719b(int i) {
        m1722g(this.f1671b - 3, 0, i, 1);
        m1722g(this.f1671b - 2, 0, i, 2);
        m1722g(this.f1671b - 1, 0, i, 3);
        m1722g(0, this.f1672c - 4, i, 4);
        m1722g(0, this.f1672c - 3, i, 5);
        m1722g(0, this.f1672c - 2, i, 6);
        m1722g(0, this.f1672c - 1, i, 7);
        m1722g(1, this.f1672c - 1, i, 8);
    }

    /* renamed from: c */
    private void m1720c(int i) {
        m1722g(this.f1671b - 3, 0, i, 1);
        m1722g(this.f1671b - 2, 0, i, 2);
        m1722g(this.f1671b - 1, 0, i, 3);
        m1722g(0, this.f1672c - 2, i, 4);
        m1722g(0, this.f1672c - 1, i, 5);
        m1722g(1, this.f1672c - 1, i, 6);
        m1722g(2, this.f1672c - 1, i, 7);
        m1722g(3, this.f1672c - 1, i, 8);
    }

    /* renamed from: d */
    private void m1721d(int i) {
        m1722g(this.f1671b - 1, 0, i, 1);
        m1722g(this.f1671b - 1, this.f1672c - 1, i, 2);
        m1722g(0, this.f1672c - 3, i, 3);
        m1722g(0, this.f1672c - 2, i, 4);
        m1722g(0, this.f1672c - 1, i, 5);
        m1722g(1, this.f1672c - 3, i, 6);
        m1722g(1, this.f1672c - 2, i, 7);
        m1722g(1, this.f1672c - 1, i, 8);
    }

    /* renamed from: g */
    private void m1722g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f1671b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f1672c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f1670a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        mo8894i(i2, i, z);
    }

    /* renamed from: j */
    private void m1723j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m1722g(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m1722g(i4, i6, i3, 2);
        int i7 = i - 1;
        m1722g(i7, i5, i3, 3);
        m1722g(i7, i6, i3, 4);
        m1722g(i7, i2, i3, 5);
        m1722g(i, i5, i3, 6);
        m1722g(i, i6, i3, 7);
        m1722g(i, i2, i3, 8);
    }

    /* renamed from: e */
    public final boolean mo8891e(int i, int i2) {
        return this.f1673d[(i2 * this.f1672c) + i] == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo8892f(int i, int i2) {
        return this.f1673d[(i2 * this.f1672c) + i] >= 0;
    }

    /* renamed from: h */
    public final void mo8893h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f1671b && i3 == 0) {
                m1718a(i4);
                i4++;
            }
            if (i5 == this.f1671b - 2 && i3 == 0 && this.f1672c % 4 != 0) {
                m1719b(i4);
                i4++;
            }
            if (i5 == this.f1671b - 2 && i3 == 0 && this.f1672c % 8 == 4) {
                m1720c(i4);
                i4++;
            }
            if (i5 == this.f1671b + 4 && i3 == 2 && this.f1672c % 8 == 0) {
                m1721d(i4);
                i4++;
            }
            do {
                if (i5 < this.f1671b && i3 >= 0 && !mo8892f(i3, i5)) {
                    m1723j(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f1672c);
            int i6 = i5 + 1;
            int i7 = i3 + 3;
            do {
                if (i6 >= 0 && i7 < this.f1672c && !mo8892f(i7, i6)) {
                    m1723j(i6, i7, i4);
                    i4++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.f1671b;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i3 = i7 + 1;
            if (i5 >= i && i3 >= (i2 = this.f1672c)) {
                break;
            }
        }
        if (!mo8892f(i2 - 1, i - 1)) {
            mo8894i(this.f1672c - 1, this.f1671b - 1, true);
            mo8894i(this.f1672c - 2, this.f1671b - 2, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo8894i(int i, int i2, boolean z) {
        this.f1673d[(i2 * this.f1672c) + i] = z ? (byte) 1 : 0;
    }
}
