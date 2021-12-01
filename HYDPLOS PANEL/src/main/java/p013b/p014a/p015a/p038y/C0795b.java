package p013b.p014a.p015a.p038y;

import java.util.Map;
import p013b.p014a.p015a.AbstractC0720t;
import p013b.p014a.p015a.C0705f;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p025c0.p028e.C0697b;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p038y.p041e.C0814e;
import p013b.p014a.p015a.p038y.p041e.C0818i;
import p013b.p014a.p015a.p038y.p041e.C0819j;
import p013b.p014a.p015a.p038y.p041e.C0820k;
import p013b.p014a.p015a.p038y.p041e.EnumC0821l;

/* renamed from: b.a.a.y.b */
public final class C0795b implements AbstractC0720t {
    /* renamed from: b */
    private static C0776b m1651b(C0697b bVar) {
        int e = bVar.mo8662e();
        int d = bVar.mo8661d();
        C0776b bVar2 = new C0776b(e, d);
        bVar2.mo8787a();
        for (int i = 0; i < e; i++) {
            for (int i2 = 0; i2 < d; i2++) {
                if (bVar.mo8659b(i, i2) == 1) {
                    bVar2.mo8801l(i, i2);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: c */
    private static C0776b m1652c(C0814e eVar, C0820k kVar) {
        int h = kVar.mo8919h();
        int g = kVar.mo8918g();
        C0697b bVar = new C0697b(kVar.mo8921j(), kVar.mo8920i());
        int i = 0;
        for (int i2 = 0; i2 < g; i2++) {
            if (i2 % kVar.f1693e == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < kVar.mo8921j(); i4++) {
                    bVar.mo8664g(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < h; i6++) {
                if (i6 % kVar.f1692d == 0) {
                    bVar.mo8664g(i5, i, true);
                    i5++;
                }
                bVar.mo8664g(i5, i, eVar.mo8891e(i6, i2));
                i5++;
                int i7 = kVar.f1692d;
                if (i6 % i7 == i7 - 1) {
                    bVar.mo8664g(i5, i, i2 % 2 == 0);
                    i5++;
                }
            }
            i++;
            int i8 = kVar.f1693e;
            if (i2 % i8 == i8 - 1) {
                int i9 = 0;
                for (int i10 = 0; i10 < kVar.mo8921j(); i10++) {
                    bVar.mo8664g(i9, i, true);
                    i9++;
                }
                i++;
            }
        }
        return m1651b(bVar);
    }

    @Override // p013b.p014a.p015a.AbstractC0720t
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        C0705f fVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != EnumC0577a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + aVar);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            EnumC0821l lVar = EnumC0821l.FORCE_NONE;
            C0705f fVar2 = null;
            if (map != null) {
                EnumC0821l lVar2 = (EnumC0821l) map.get(EnumC0706g.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                C0705f fVar3 = (C0705f) map.get(EnumC0706g.MIN_SIZE);
                if (fVar3 == null) {
                    fVar3 = null;
                }
                fVar = (C0705f) map.get(EnumC0706g.MAX_SIZE);
                if (fVar == null) {
                    fVar = null;
                }
                fVar2 = fVar3;
            } else {
                fVar = null;
            }
            String b = C0819j.m1757b(str, lVar, fVar2, fVar);
            C0820k l = C0820k.m1771l(b.length(), lVar, fVar2, fVar, true);
            C0814e eVar = new C0814e(C0818i.m1755c(b, l), l.mo8919h(), l.mo8918g());
            eVar.mo8893h();
            return m1652c(eVar, l);
        }
    }
}
