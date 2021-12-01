package p013b.p014a.p015a.p038y;

import java.util.List;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0714n;
import p013b.p014a.p015a.C0663c;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.EnumC0717q;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;
import p013b.p014a.p015a.p035x.C0781g;
import p013b.p014a.p015a.p038y.p039c.C0801d;
import p013b.p014a.p015a.p038y.p040d.C0806a;

/* renamed from: b.a.a.y.a */
public final class C0794a implements AbstractC0714n {

    /* renamed from: b */
    private static final C0718r[] f1632b = new C0718r[0];

    /* renamed from: a */
    private final C0801d f1633a = new C0801d();

    /* renamed from: c */
    private static C0776b m1647c(C0776b bVar) {
        int[] i = bVar.mo8798i();
        int[] e = bVar.mo8792e();
        if (i == null || e == null) {
            throw C0712l.m1333a();
        }
        int d = m1648d(i, bVar);
        int i2 = i[1];
        int i3 = e[1];
        int i4 = i[0];
        int i5 = ((e[0] - i4) + 1) / d;
        int i6 = ((i3 - i2) + 1) / d;
        if (i5 <= 0 || i6 <= 0) {
            throw C0712l.m1333a();
        }
        int i7 = d / 2;
        int i8 = i2 + i7;
        int i9 = i4 + i7;
        C0776b bVar2 = new C0776b(i5, i6);
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = (i10 * d) + i8;
            for (int i12 = 0; i12 < i5; i12++) {
                if (bVar.mo8791d((i12 * d) + i9, i11)) {
                    bVar2.mo8801l(i12, i10);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: d */
    private static int m1648d(int[] iArr, C0776b bVar) {
        int j = bVar.mo8799j();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < j && bVar.mo8791d(i, i2)) {
            i++;
        }
        if (i != j) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C0712l.m1333a();
        }
        throw C0712l.m1333a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: a */
    public C0716p mo8489a(C0663c cVar, Map<EnumC0704e, ?> map) {
        C0718r[] rVarArr;
        C0779e eVar;
        if (map == null || !map.containsKey(EnumC0704e.PURE_BARCODE)) {
            C0781g c = new C0806a(cVar.mo8597a()).mo8876c();
            C0779e b = this.f1633a.mo8863b(c.mo8823a());
            rVarArr = c.mo8824b();
            eVar = b;
        } else {
            eVar = this.f1633a.mo8863b(m1647c(cVar.mo8597a()));
            rVarArr = f1632b;
        }
        C0716p pVar = new C0716p(eVar.mo8816g(), eVar.mo8813d(), rVarArr, EnumC0577a.DATA_MATRIX);
        List<byte[]> a = eVar.mo8810a();
        if (a != null) {
            pVar.mo8698h(EnumC0717q.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo8811b();
        if (b2 != null) {
            pVar.mo8698h(EnumC0717q.ERROR_CORRECTION_LEVEL, b2);
        }
        return pVar;
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: b */
    public void mo8434b() {
    }
}
