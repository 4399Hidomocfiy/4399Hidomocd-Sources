package p013b.p014a.p015a.p035x;

import p013b.p014a.p015a.AbstractC0634b;
import p013b.p014a.p015a.AbstractC0708i;
import p013b.p014a.p015a.C0712l;

/* renamed from: b.a.a.x.h */
public class C0782h extends AbstractC0634b {

    /* renamed from: d */
    private static final byte[] f1589d = new byte[0];

    /* renamed from: b */
    private byte[] f1590b = f1589d;

    /* renamed from: c */
    private final int[] f1591c = new int[32];

    public C0782h(AbstractC0708i iVar) {
        super(iVar);
    }

    /* renamed from: f */
    private static int m1594f(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            i3 = i5;
            i5 = i3;
        }
        if (i3 - i5 > length / 16) {
            int i10 = i3 - 1;
            int i11 = i10;
            int i12 = -1;
            while (i10 > i5) {
                int i13 = i10 - i5;
                int i14 = i13 * i13 * (i3 - i10) * (i2 - iArr[i10]);
                if (i14 > i12) {
                    i11 = i10;
                    i12 = i14;
                }
                i10--;
            }
            return i11 << 3;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: g */
    private void m1595g(int i) {
        if (this.f1590b.length < i) {
            this.f1590b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f1591c[i2] = 0;
        }
    }

    @Override // p013b.p014a.p015a.AbstractC0634b
    /* renamed from: a */
    public C0776b mo8499a() {
        AbstractC0708i d = mo8502d();
        int d2 = d.mo8681d();
        int a = d.mo8678a();
        C0776b bVar = new C0776b(d2, a);
        m1595g(d2);
        int[] iArr = this.f1591c;
        for (int i = 1; i < 5; i++) {
            byte[] c = d.mo8680c((a * i) / 5, this.f1590b);
            int i2 = (d2 * 4) / 5;
            for (int i3 = d2 / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int f = m1594f(iArr);
        byte[] b = d.mo8679b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d2;
            for (int i7 = 0; i7 < d2; i7++) {
                if ((b[i6 + i7] & 255) < f) {
                    bVar.mo8801l(i7, i5);
                }
            }
        }
        return bVar;
    }

    @Override // p013b.p014a.p015a.AbstractC0634b
    /* renamed from: b */
    public C0775a mo8500b(int i, C0775a aVar) {
        AbstractC0708i d = mo8502d();
        int d2 = d.mo8681d();
        if (aVar == null || aVar.mo8778k() < d2) {
            aVar = new C0775a(d2);
        } else {
            aVar.mo8770d();
        }
        m1595g(d2);
        byte[] c = d.mo8680c(i, this.f1590b);
        int[] iArr = this.f1591c;
        for (int i2 = 0; i2 < d2; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int f = m1594f(iArr);
        int i4 = c[1] & 255;
        int i5 = 1;
        int i6 = c[0] & 255;
        int i7 = i4;
        while (i5 < d2 - 1) {
            int i8 = i5 + 1;
            int i9 = c[i8] & 255;
            if ((((i7 * 4) - i6) - i9) / 2 < f) {
                aVar.mo8782p(i5);
            }
            i6 = i7;
            i5 = i8;
            i7 = i9;
        }
        return aVar;
    }
}
