package p013b.p014a.p015a.p016a0;

import java.util.EnumMap;
import java.util.Map;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0717q;
import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.u */
public final class C0628u {

    /* renamed from: a */
    private final int[] f1142a = new int[4];

    /* renamed from: b */
    private final StringBuilder f1143b = new StringBuilder();

    C0628u() {
    }

    /* renamed from: c */
    private static Map<EnumC0717q, Object> m931c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC0717q.class);
        enumMap.put((Object) EnumC0717q.ISSUE_NUMBER, (Object) Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8492a(C0775a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f1142a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k = aVar.mo8778k();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < k; i3++) {
            int j = AbstractC0631x.m942j(aVar, iArr2, i, AbstractC0631x.f1153g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo8777j(aVar.mo8776i(i));
            }
        }
        if (sb.length() != 2) {
            throw C0712l.m1333a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw C0712l.m1333a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0716p mo8493b(int i, C0775a aVar, int[] iArr) {
        StringBuilder sb = this.f1143b;
        sb.setLength(0);
        int a = mo8492a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<EnumC0717q, Object> c = m931c(sb2);
        float f = (float) i;
        C0716p pVar = new C0716p(sb2, null, new C0718r[]{new C0718r(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C0718r((float) a, f)}, EnumC0577a.UPC_EAN_EXTENSION);
        if (c != null) {
            pVar.mo8697g(c);
        }
        return pVar;
    }
}
