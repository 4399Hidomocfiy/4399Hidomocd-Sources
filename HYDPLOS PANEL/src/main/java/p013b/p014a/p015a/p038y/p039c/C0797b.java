package p013b.p014a.p015a.p038y.p039c;

import p013b.p014a.p015a.p038y.p039c.C0802e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.c.b */
public final class C0797b {

    /* renamed from: a */
    private final int f1637a;

    /* renamed from: b */
    private final byte[] f1638b;

    private C0797b(int i, byte[] bArr) {
        this.f1637a = i;
        this.f1638b = bArr;
    }

    /* renamed from: b */
    static C0797b[] m1664b(byte[] bArr, C0802e eVar) {
        C0802e.C0805c d = eVar.mo8866d();
        C0802e.C0804b[] a = d.mo8874a();
        int i = 0;
        for (C0802e.C0804b bVar : a) {
            i += bVar.mo8872a();
        }
        C0797b[] bVarArr = new C0797b[i];
        int i2 = 0;
        for (C0802e.C0804b bVar2 : a) {
            int i3 = 0;
            while (i3 < bVar2.mo8872a()) {
                int b = bVar2.mo8873b();
                bVarArr[i2] = new C0797b(b, new byte[(d.mo8875b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f1638b.length - d.mo8875b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f1638b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = eVar.mo8870i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f1638b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f1638b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                bVarArr[i10].f1638b[(!z || i10 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo8861a() {
        return this.f1638b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8862c() {
        return this.f1637a;
    }
}
