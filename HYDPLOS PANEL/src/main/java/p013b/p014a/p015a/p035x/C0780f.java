package p013b.p014a.p015a.p035x;

import p013b.p014a.p015a.C0712l;

/* renamed from: b.a.a.x.f */
public final class C0780f extends AbstractC0783i {
    @Override // p013b.p014a.p015a.p035x.AbstractC0783i
    /* renamed from: c */
    public C0776b mo8821c(C0776b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return mo8822d(bVar, i, i2, C0785k.m1607b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p013b.p014a.p015a.p035x.AbstractC0783i
    /* renamed from: d */
    public C0776b mo8822d(C0776b bVar, int i, int i2, C0785k kVar) {
        if (i <= 0 || i2 <= 0) {
            throw C0712l.m1333a();
        }
        C0776b bVar2 = new C0776b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            kVar.mo8827f(fArr);
            AbstractC0783i.m1598a(bVar, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (bVar.mo8791d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo8801l(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C0712l.m1333a();
                }
            }
        }
        return bVar2;
    }
}
