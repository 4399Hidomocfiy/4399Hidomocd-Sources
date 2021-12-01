package p013b.p014a.p015a.p016a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0715o;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p016a0.p017a0.C0583e;
import p013b.p014a.p015a.p016a0.p017a0.p018g.C0588d;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.o */
public final class C0622o extends AbstractC0624q {

    /* renamed from: a */
    private final AbstractC0624q[] f1138a;

    public C0622o(Map<EnumC0704e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC0704e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(EnumC0704e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC0577a.EAN_13) || collection.contains(EnumC0577a.UPC_A) || collection.contains(EnumC0577a.EAN_8) || collection.contains(EnumC0577a.UPC_E)) {
                arrayList.add(new C0623p(map));
            }
            if (collection.contains(EnumC0577a.CODE_39)) {
                arrayList.add(new C0612e(z));
            }
            if (collection.contains(EnumC0577a.CODE_93)) {
                arrayList.add(new C0614g());
            }
            if (collection.contains(EnumC0577a.CODE_128)) {
                arrayList.add(new C0610c());
            }
            if (collection.contains(EnumC0577a.ITF)) {
                arrayList.add(new C0620m());
            }
            if (collection.contains(EnumC0577a.CODABAR)) {
                arrayList.add(new C0578a());
            }
            if (collection.contains(EnumC0577a.RSS_14)) {
                arrayList.add(new C0583e());
            }
            if (collection.contains(EnumC0577a.RSS_EXPANDED)) {
                arrayList.add(new C0588d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C0623p(map));
            arrayList.add(new C0612e());
            arrayList.add(new C0578a());
            arrayList.add(new C0614g());
            arrayList.add(new C0610c());
            arrayList.add(new C0620m());
            arrayList.add(new C0583e());
            arrayList.add(new C0588d());
        }
        this.f1138a = (AbstractC0624q[]) arrayList.toArray(new AbstractC0624q[arrayList.size()]);
    }

    @Override // p013b.p014a.p015a.AbstractC0714n, p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: b */
    public void mo8434b() {
        for (AbstractC0624q qVar : this.f1138a) {
            qVar.mo8434b();
        }
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        AbstractC0624q[] qVarArr;
        for (AbstractC0624q qVar : this.f1138a) {
            try {
                return qVar.mo8413c(i, aVar, map);
            } catch (AbstractC0715o unused) {
            }
        }
        throw C0712l.m1333a();
    }
}
