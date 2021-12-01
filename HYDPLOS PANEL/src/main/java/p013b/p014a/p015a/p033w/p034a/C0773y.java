package p013b.p014a.p015a.p033w.p034a;

import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.y */
public final class C0773y extends AbstractC0769u {
    /* renamed from: n */
    public C0752h mo8741h(C0716p pVar) {
        String str;
        String b = AbstractC0769u.m1518b(pVar);
        String str2 = null;
        if (!b.startsWith("smtp:") && !b.startsWith("SMTP:")) {
            return null;
        }
        String substring = b.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str2 = substring2.substring(0, indexOf2);
                str = substring3;
            } else {
                str = null;
                str2 = substring2;
            }
        } else {
            str = null;
        }
        return new C0752h(substring, str2, str, "mailto:" + substring);
    }
}
