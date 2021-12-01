package p013b.p014a.p015a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p013b.p014a.p015a.p016a0.C0622o;
import p013b.p014a.p015a.p020b0.C0636b;
import p013b.p014a.p015a.p025c0.C0664a;
import p013b.p014a.p015a.p029v.C0723b;
import p013b.p014a.p015a.p038y.C0794a;
import p013b.p014a.p015a.p042z.C0824a;

/* renamed from: b.a.a.j */
public final class C0709j implements AbstractC0714n {

    /* renamed from: a */
    private Map<EnumC0704e, ?> f1366a;

    /* renamed from: b */
    private AbstractC0714n[] f1367b;

    /* renamed from: c */
    private C0716p m1327c(C0663c cVar) {
        AbstractC0714n[] nVarArr = this.f1367b;
        if (nVarArr != null) {
            for (AbstractC0714n nVar : nVarArr) {
                try {
                    return nVar.mo8489a(cVar, this.f1366a);
                } catch (AbstractC0715o unused) {
                }
            }
        }
        throw C0712l.m1333a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: a */
    public C0716p mo8489a(C0663c cVar, Map<EnumC0704e, ?> map) {
        mo8686e(map);
        return m1327c(cVar);
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: b */
    public void mo8434b() {
        AbstractC0714n[] nVarArr = this.f1367b;
        if (nVarArr != null) {
            for (AbstractC0714n nVar : nVarArr) {
                nVar.mo8434b();
            }
        }
    }

    /* renamed from: d */
    public C0716p mo8685d(C0663c cVar) {
        if (this.f1367b == null) {
            mo8686e(null);
        }
        return m1327c(cVar);
    }

    /* renamed from: e */
    public void mo8686e(Map<EnumC0704e, ?> map) {
        this.f1366a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(EnumC0704e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(EnumC0704e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC0577a.UPC_A) && !collection.contains(EnumC0577a.UPC_E) && !collection.contains(EnumC0577a.EAN_13) && !collection.contains(EnumC0577a.EAN_8) && !collection.contains(EnumC0577a.CODABAR) && !collection.contains(EnumC0577a.CODE_39) && !collection.contains(EnumC0577a.CODE_93) && !collection.contains(EnumC0577a.CODE_128) && !collection.contains(EnumC0577a.ITF) && !collection.contains(EnumC0577a.RSS_14) && !collection.contains(EnumC0577a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C0622o(map));
            }
            if (collection.contains(EnumC0577a.QR_CODE)) {
                arrayList.add(new C0664a());
            }
            if (collection.contains(EnumC0577a.DATA_MATRIX)) {
                arrayList.add(new C0794a());
            }
            if (collection.contains(EnumC0577a.AZTEC)) {
                arrayList.add(new C0723b());
            }
            if (collection.contains(EnumC0577a.PDF_417)) {
                arrayList.add(new C0636b());
            }
            if (collection.contains(EnumC0577a.MAXICODE)) {
                arrayList.add(new C0824a());
            }
            if (z && z2) {
                arrayList.add(new C0622o(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C0622o(map));
            }
            arrayList.add(new C0664a());
            arrayList.add(new C0794a());
            arrayList.add(new C0723b());
            arrayList.add(new C0636b());
            arrayList.add(new C0824a());
            if (z2) {
                arrayList.add(new C0622o(map));
            }
        }
        this.f1367b = (AbstractC0714n[]) arrayList.toArray(new AbstractC0714n[arrayList.size()]);
    }
}
