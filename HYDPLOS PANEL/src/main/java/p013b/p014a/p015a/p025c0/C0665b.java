package p013b.p014a.p015a.p025c0;

import java.util.Map;
import p013b.p014a.p015a.AbstractC0720t;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p025c0.p026c.EnumC0680f;
import p013b.p014a.p015a.p025c0.p028e.C0697b;
import p013b.p014a.p015a.p025c0.p028e.C0698c;
import p013b.p014a.p015a.p025c0.p028e.C0702f;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.c0.b */
public final class C0665b implements AbstractC0720t {
    /* renamed from: b */
    private static C0776b m1157b(C0702f fVar, int i, int i2, int i3) {
        C0697b a = fVar.mo8666a();
        if (a != null) {
            int e = a.mo8662e();
            int d = a.mo8661d();
            int i4 = i3 * 2;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            C0776b bVar = new C0776b(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < e) {
                    if (a.mo8659b(i11, i9) == 1) {
                        bVar.mo8802m(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // p013b.p014a.p015a.AbstractC0720t
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != EnumC0577a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            EnumC0680f fVar = EnumC0680f.L;
            int i3 = 4;
            if (map != null) {
                EnumC0680f fVar2 = (EnumC0680f) map.get(EnumC0706g.ERROR_CORRECTION);
                if (fVar2 != null) {
                    fVar = fVar2;
                }
                Integer num = (Integer) map.get(EnumC0706g.MARGIN);
                if (num != null) {
                    i3 = num.intValue();
                }
            }
            return m1157b(C0698c.m1276m(str, fVar, map), i, i2, i3);
        }
    }
}
