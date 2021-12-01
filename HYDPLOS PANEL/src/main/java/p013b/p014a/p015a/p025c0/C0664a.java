package p013b.p014a.p015a.p025c0;

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
import p013b.p014a.p015a.p025c0.p026c.C0679e;
import p013b.p014a.p015a.p025c0.p026c.C0683i;
import p013b.p014a.p015a.p025c0.p027d.C0689c;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;
import p013b.p014a.p015a.p035x.C0781g;

/* renamed from: b.a.a.c0.a */
public class C0664a implements AbstractC0714n {

    /* renamed from: b */
    private static final C0718r[] f1251b = new C0718r[0];

    /* renamed from: a */
    private final C0679e f1252a = new C0679e();

    /* renamed from: c */
    private static C0776b m1153c(C0776b bVar) {
        int[] i = bVar.mo8798i();
        int[] e = bVar.mo8792e();
        if (i == null || e == null) {
            throw C0712l.m1333a();
        }
        float d = m1154d(i, bVar);
        int i2 = i[1];
        int i3 = e[1];
        int i4 = i[0];
        int i5 = e[0];
        if (i4 >= i5 || i2 >= i3) {
            throw C0712l.m1333a();
        }
        int i6 = i3 - i2;
        if (i6 != i5 - i4) {
            i5 = i4 + i6;
        }
        int round = Math.round(((float) ((i5 - i4) + 1)) / d);
        int round2 = Math.round(((float) (i6 + 1)) / d);
        if (round <= 0 || round2 <= 0) {
            throw C0712l.m1333a();
        } else if (round2 == round) {
            int i7 = (int) (d / 2.0f);
            int i8 = i2 + i7;
            int i9 = i4 + i7;
            int i10 = (((int) (((float) (round - 1)) * d)) + i9) - (i5 - 1);
            if (i10 > 0) {
                if (i10 <= i7) {
                    i9 -= i10;
                } else {
                    throw C0712l.m1333a();
                }
            }
            int i11 = (((int) (((float) (round2 - 1)) * d)) + i8) - (i3 - 1);
            if (i11 > 0) {
                if (i11 <= i7) {
                    i8 -= i11;
                } else {
                    throw C0712l.m1333a();
                }
            }
            C0776b bVar2 = new C0776b(round, round2);
            for (int i12 = 0; i12 < round2; i12++) {
                int i13 = ((int) (((float) i12) * d)) + i8;
                for (int i14 = 0; i14 < round; i14++) {
                    if (bVar.mo8791d(((int) (((float) i14) * d)) + i9, i13)) {
                        bVar2.mo8801l(i14, i12);
                    }
                }
            }
            return bVar2;
        } else {
            throw C0712l.m1333a();
        }
    }

    /* renamed from: d */
    private static float m1154d(int[] iArr, C0776b bVar) {
        int g = bVar.mo8795g();
        int j = bVar.mo8799j();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < j && i2 < g) {
            if (z != bVar.mo8791d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != j && i2 != g) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw C0712l.m1333a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: a */
    public final C0716p mo8489a(C0663c cVar, Map<EnumC0704e, ?> map) {
        C0718r[] rVarArr;
        C0779e eVar;
        if (map == null || !map.containsKey(EnumC0704e.PURE_BARCODE)) {
            C0781g e = new C0689c(cVar.mo8597a()).mo8640e(map);
            C0779e b = this.f1252a.mo8614b(e.mo8823a(), map);
            rVarArr = e.mo8824b();
            eVar = b;
        } else {
            eVar = this.f1252a.mo8614b(m1153c(cVar.mo8597a()), map);
            rVarArr = f1251b;
        }
        if (eVar.mo8812c() instanceof C0683i) {
            ((C0683i) eVar.mo8812c()).mo8622a(rVarArr);
        }
        C0716p pVar = new C0716p(eVar.mo8816g(), eVar.mo8813d(), rVarArr, EnumC0577a.QR_CODE);
        List<byte[]> a = eVar.mo8810a();
        if (a != null) {
            pVar.mo8698h(EnumC0717q.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo8811b();
        if (b2 != null) {
            pVar.mo8698h(EnumC0717q.ERROR_CORRECTION_LEVEL, b2);
        }
        if (eVar.mo8817h()) {
            pVar.mo8698h(EnumC0717q.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo8815f()));
            pVar.mo8698h(EnumC0717q.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo8814e()));
        }
        return pVar;
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: b */
    public void mo8434b() {
    }
}
