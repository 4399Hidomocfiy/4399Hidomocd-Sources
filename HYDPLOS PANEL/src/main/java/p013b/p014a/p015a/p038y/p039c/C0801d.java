package p013b.p014a.p015a.p038y.p039c;

import p013b.p014a.p015a.C0703d;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;
import p013b.p014a.p015a.p035x.p037n.C0789a;
import p013b.p014a.p015a.p035x.p037n.C0791c;
import p013b.p014a.p015a.p035x.p037n.C0793e;

/* renamed from: b.a.a.y.c.d */
public final class C0801d {

    /* renamed from: a */
    private final C0791c f1652a = new C0791c(C0789a.f1617m);

    /* renamed from: a */
    private void m1676a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f1652a.mo8850a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C0793e unused) {
            throw C0703d.m1317a();
        }
    }

    /* renamed from: b */
    public C0779e mo8863b(C0776b bVar) {
        C0796a aVar = new C0796a(bVar);
        C0797b[] b = C0797b.m1664b(aVar.mo8854c(), aVar.mo8853b());
        int length = b.length;
        int i = 0;
        for (C0797b bVar2 : b) {
            i += bVar2.mo8862c();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2++) {
            C0797b bVar3 = b[i2];
            byte[] a = bVar3.mo8861a();
            int c = bVar3.mo8862c();
            m1676a(a, c);
            for (int i3 = 0; i3 < c; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C0798c.m1667a(bArr);
    }
}
