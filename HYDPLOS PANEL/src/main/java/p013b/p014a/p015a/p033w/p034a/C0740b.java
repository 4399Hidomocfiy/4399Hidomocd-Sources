package p013b.p014a.p015a.p033w.p034a;

import java.util.ArrayList;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.b */
public final class C0740b extends AbstractC0769u {
    /* renamed from: n */
    private static String[] m1435n(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String f = AbstractC0769u.m1522f(str + i2 + ':', str2, '\r', z);
            if (f == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(f);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: o */
    public C0744d mo8741h(C0716p pVar) {
        String b = AbstractC0769u.m1518b(pVar);
        String[] strArr = null;
        if (!b.contains("MEMORY") || !b.contains("\r\n")) {
            return null;
        }
        String f = AbstractC0769u.m1522f("NAME1:", b, '\r', true);
        String f2 = AbstractC0769u.m1522f("NAME2:", b, '\r', true);
        String[] n = m1435n("TEL", 3, b, true);
        String[] n2 = m1435n("MAIL", 3, b, true);
        String f3 = AbstractC0769u.m1522f("MEMORY:", b, '\r', false);
        String f4 = AbstractC0769u.m1522f("ADD:", b, '\r', true);
        if (f4 != null) {
            strArr = new String[]{f4};
        }
        return new C0744d(AbstractC0769u.m1523g(f), null, f2, n, null, n2, null, null, f3, strArr, null, null, null, null, null, null);
    }
}
