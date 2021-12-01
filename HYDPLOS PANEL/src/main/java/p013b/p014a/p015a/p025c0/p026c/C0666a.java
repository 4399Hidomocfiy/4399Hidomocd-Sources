package p013b.p014a.p015a.p025c0.p026c;

import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.p035x.C0776b;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.c.a */
public final class C0666a {

    /* renamed from: a */
    private final C0776b f1253a;

    /* renamed from: b */
    private C0684j f1254b;

    /* renamed from: c */
    private C0681g f1255c;

    /* renamed from: d */
    private boolean f1256d;

    C0666a(C0776b bVar) {
        int g = bVar.mo8795g();
        if (g < 21 || (g & 3) != 1) {
            throw C0707h.m1320a();
        }
        this.f1253a = bVar;
    }

    /* renamed from: a */
    private int m1159a(int i, int i2, int i3) {
        return this.f1256d ? this.f1253a.mo8791d(i2, i) : this.f1253a.mo8791d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8604b() {
        int i = 0;
        while (i < this.f1253a.mo8799j()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f1253a.mo8795g(); i3++) {
                if (this.f1253a.mo8791d(i, i3) != this.f1253a.mo8791d(i3, i)) {
                    this.f1253a.mo8789c(i3, i);
                    this.f1253a.mo8789c(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo8605c() {
        C0681g d = mo8606d();
        C0684j e = mo8607e();
        AbstractC0668c a = AbstractC0668c.m1169a(d.mo8616c());
        int g = this.f1253a.mo8795g();
        a.mo8613c(this.f1253a, g);
        C0776b a2 = e.mo8623a();
        byte[] bArr = new byte[e.mo8627h()];
        int i = g - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < g; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a2.mo8791d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f1253a.mo8791d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.mo8627h()) {
            return bArr;
        }
        throw C0707h.m1320a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0681g mo8606d() {
        C0681g gVar = this.f1255c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m1159a(i3, 8, i2);
        }
        int a = m1159a(8, 7, m1159a(8, 8, m1159a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m1159a(8, i4, a);
        }
        int g = this.f1253a.mo8795g();
        int i5 = g - 7;
        for (int i6 = g - 1; i6 >= i5; i6--) {
            i = m1159a(8, i6, i);
        }
        for (int i7 = g - 8; i7 < g; i7++) {
            i = m1159a(i7, 8, i);
        }
        C0681g a2 = C0681g.m1193a(a, i);
        this.f1255c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C0707h.m1320a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0684j mo8607e() {
        C0684j jVar = this.f1254b;
        if (jVar != null) {
            return jVar;
        }
        int g = this.f1253a.mo8795g();
        int i = (g - 17) / 4;
        if (i <= 6) {
            return C0684j.m1205i(i);
        }
        int i2 = g - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = g - 9; i6 >= i2; i6--) {
                i4 = m1159a(i6, i5, i4);
            }
        }
        C0684j c = C0684j.m1203c(i4);
        if (c == null || c.mo8625e() != g) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = g - 9; i8 >= i2; i8--) {
                    i3 = m1159a(i7, i8, i3);
                }
            }
            C0684j c2 = C0684j.m1203c(i3);
            if (c2 == null || c2.mo8625e() != g) {
                throw C0707h.m1320a();
            }
            this.f1254b = c2;
            return c2;
        }
        this.f1254b = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8608f() {
        C0681g gVar = this.f1255c;
        if (gVar != null) {
            AbstractC0668c.m1169a(gVar.mo8616c()).mo8613c(this.f1253a, this.f1253a.mo8795g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8609g(boolean z) {
        this.f1254b = null;
        this.f1255c = null;
        this.f1256d = z;
    }
}
