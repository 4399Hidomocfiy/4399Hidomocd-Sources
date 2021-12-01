package p013b.p014a.p015a.p020b0;

import android.support.p012v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0714n;
import p013b.p014a.p015a.C0663c;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.EnumC0717q;
import p013b.p014a.p015a.p020b0.p021e.C0650j;
import p013b.p014a.p015a.p020b0.p023f.C0654a;
import p013b.p014a.p015a.p020b0.p023f.C0655b;
import p013b.p014a.p015a.p035x.C0779e;

/* renamed from: b.a.a.b0.b */
public final class C0636b implements AbstractC0714n {
    /* renamed from: c */
    private static C0716p[] m967c(C0663c cVar, Map<EnumC0704e, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C0655b b = C0654a.m1101b(cVar, map, z);
        for (C0718r[] rVarArr : b.mo8580b()) {
            C0779e i = C0650j.m1061i(b.mo8579a(), rVarArr[4], rVarArr[5], rVarArr[6], rVarArr[7], m970f(rVarArr), m968d(rVarArr));
            C0716p pVar = new C0716p(i.mo8816g(), i.mo8813d(), rVarArr, EnumC0577a.PDF_417);
            pVar.mo8698h(EnumC0717q.ERROR_CORRECTION_LEVEL, i.mo8811b());
            C0637c cVar2 = (C0637c) i.mo8812c();
            if (cVar2 != null) {
                pVar.mo8698h(EnumC0717q.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(pVar);
        }
        return (C0716p[]) arrayList.toArray(new C0716p[arrayList.size()]);
    }

    /* renamed from: d */
    private static int m968d(C0718r[] rVarArr) {
        return Math.max(Math.max(m969e(rVarArr[0], rVarArr[4]), (m969e(rVarArr[6], rVarArr[2]) * 17) / 18), Math.max(m969e(rVarArr[1], rVarArr[5]), (m969e(rVarArr[7], rVarArr[3]) * 17) / 18));
    }

    /* renamed from: e */
    private static int m969e(C0718r rVar, C0718r rVar2) {
        if (rVar == null || rVar2 == null) {
            return 0;
        }
        return (int) Math.abs(rVar.mo8700c() - rVar2.mo8700c());
    }

    /* renamed from: f */
    private static int m970f(C0718r[] rVarArr) {
        return Math.min(Math.min(m971g(rVarArr[0], rVarArr[4]), (m971g(rVarArr[6], rVarArr[2]) * 17) / 18), Math.min(m971g(rVarArr[1], rVarArr[5]), (m971g(rVarArr[7], rVarArr[3]) * 17) / 18));
    }

    /* renamed from: g */
    private static int m971g(C0718r rVar, C0718r rVar2) {
        return (rVar == null || rVar2 == null) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) Math.abs(rVar.mo8700c() - rVar2.mo8700c());
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: a */
    public C0716p mo8489a(C0663c cVar, Map<EnumC0704e, ?> map) {
        C0716p[] c = m967c(cVar, map, false);
        if (c != null && c.length != 0 && c[0] != null) {
            return c[0];
        }
        throw C0712l.m1333a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: b */
    public void mo8434b() {
    }
}
