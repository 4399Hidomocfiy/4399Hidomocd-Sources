package p013b.p014a.p015a.p025c0.p026c;

import p013b.p014a.p015a.p025c0.p026c.C0684j;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.c.b */
public final class C0667b {

    /* renamed from: a */
    private final int f1257a;

    /* renamed from: b */
    private final byte[] f1258b;

    private C0667b(int i, byte[] bArr) {
        this.f1257a = i;
        this.f1258b = bArr;
    }

    /* renamed from: b */
    static C0667b[] m1166b(byte[] bArr, C0684j jVar, EnumC0680f fVar) {
        if (bArr.length == jVar.mo8627h()) {
            C0684j.C0686b f = jVar.mo8626f(fVar);
            C0684j.C0685a[] a = f.mo8632a();
            int i = 0;
            for (C0684j.C0685a aVar : a) {
                i += aVar.mo8630a();
            }
            C0667b[] bVarArr = new C0667b[i];
            int i2 = 0;
            for (C0684j.C0685a aVar2 : a) {
                int i3 = 0;
                while (i3 < aVar2.mo8630a()) {
                    int b = aVar2.mo8631b();
                    bVarArr[i2] = new C0667b(b, new byte[(f.mo8633b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f1258b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f1258b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo8633b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f1258b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f1258b[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f1258b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f1258b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo8610a() {
        return this.f1258b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8611c() {
        return this.f1257a;
    }
}
