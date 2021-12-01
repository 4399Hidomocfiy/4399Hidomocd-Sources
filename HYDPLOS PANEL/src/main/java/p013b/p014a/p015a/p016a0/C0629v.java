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
/* renamed from: b.a.a.a0.v */
public final class C0629v {

    /* renamed from: c */
    private static final int[] f1144c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f1145a = new int[4];

    /* renamed from: b */
    private final StringBuilder f1146b = new StringBuilder();

    C0629v() {
    }

    /* renamed from: c */
    private static int m934c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f1144c[i2]) {
                return i2;
            }
        }
        throw C0712l.m1333a();
    }

    /* renamed from: d */
    private static int m935d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* renamed from: e */
    private static String m936e(String str) {
        String str2;
        char charAt = str.charAt(0);
        String str3 = "";
        if (charAt == '0') {
            str3 = "£";
        } else if (charAt == '5') {
            str3 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            str2 = "0" + i;
        } else {
            str2 = String.valueOf(i);
        }
        return str3 + valueOf + '.' + str2;
    }

    /* renamed from: f */
    private static Map<EnumC0717q, Object> m937f(String str) {
        String e;
        if (str.length() != 5 || (e = m936e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC0717q.class);
        enumMap.put((Object) EnumC0717q.SUGGESTED_PRICE, (Object) e);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8494a(C0775a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f1145a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k = aVar.mo8778k();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < k; i3++) {
            int j = AbstractC0631x.m942j(aVar, iArr2, i, AbstractC0631x.f1153g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.mo8777j(aVar.mo8776i(i));
            }
        }
        if (sb.length() == 5) {
            if (m935d(sb.toString()) == m934c(i2)) {
                return i;
            }
            throw C0712l.m1333a();
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0716p mo8495b(int i, C0775a aVar, int[] iArr) {
        StringBuilder sb = this.f1146b;
        sb.setLength(0);
        int a = mo8494a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<EnumC0717q, Object> f = m937f(sb2);
        float f2 = (float) i;
        C0716p pVar = new C0716p(sb2, null, new C0718r[]{new C0718r(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C0718r((float) a, f2)}, EnumC0577a.UPC_EAN_EXTENSION);
        if (f != null) {
            pVar.mo8697g(f);
        }
        return pVar;
    }
}
