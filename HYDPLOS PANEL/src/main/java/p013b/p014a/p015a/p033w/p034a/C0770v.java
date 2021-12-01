package p013b.p014a.p015a.p033w.p034a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.v */
public final class C0770v extends AbstractC0769u {
    /* renamed from: n */
    private static void m1530n(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
        } else {
            collection.add(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            if (substring.startsWith("via=")) {
                str2 = substring.substring(4);
            }
        }
        collection2.add(str2);
    }

    /* renamed from: o */
    public C0771w mo8741h(C0716p pVar) {
        String str;
        String b = AbstractC0769u.m1518b(pVar);
        String str2 = null;
        if (!b.startsWith("sms:") && !b.startsWith("SMS:") && !b.startsWith("mms:") && !b.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> j = AbstractC0769u.m1525j(b);
        boolean z = false;
        if (j == null || j.isEmpty()) {
            str = null;
        } else {
            str2 = j.get("subject");
            str = j.get("body");
            z = true;
        }
        int indexOf = b.indexOf(63, 4);
        String substring = (indexOf < 0 || !z) ? b.substring(4) : b.substring(4, indexOf);
        int i = -1;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 > i) {
                m1530n(arrayList, arrayList2, substring.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                m1530n(arrayList, arrayList2, substring.substring(i2));
                return new C0771w((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
        }
    }
}
