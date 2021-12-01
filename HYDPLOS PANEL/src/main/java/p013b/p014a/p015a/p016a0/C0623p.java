package p013b.p014a.p015a.p016a0;

import java.util.Collection;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0715o;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.p */
public final class C0623p extends AbstractC0624q {

    /* renamed from: a */
    private final AbstractC0631x[] f1139a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0623p(java.util.Map<p013b.p014a.p015a.EnumC0704e, ?> r3) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p016a0.C0623p.<init>(java.util.Map):void");
    }

    @Override // p013b.p014a.p015a.AbstractC0714n, p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: b */
    public void mo8434b() {
        for (AbstractC0631x xVar : this.f1139a) {
            xVar.mo8434b();
        }
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        int[] p = AbstractC0631x.m945p(aVar);
        boolean z = false;
        for (AbstractC0631x xVar : this.f1139a) {
            try {
                C0716p m = xVar.mo8491m(i, aVar, p, map);
                boolean z2 = m.mo8692b() == EnumC0577a.EAN_13 && m.mo8696f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(EnumC0704e.POSSIBLE_FORMATS);
                if (collection == null || collection.contains(EnumC0577a.UPC_A)) {
                    z = true;
                }
                if (!z2 || !z) {
                    return m;
                }
                C0716p pVar = new C0716p(m.mo8696f().substring(1), m.mo8693c(), m.mo8695e(), EnumC0577a.UPC_A);
                pVar.mo8697g(m.mo8694d());
                return pVar;
            } catch (AbstractC0715o unused) {
            }
        }
        throw C0712l.m1333a();
    }
}
