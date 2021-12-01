package p013b.p014a.p015a.p033w.p034a;

import java.util.Map;

/* renamed from: b.a.a.w.a.k */
public final class C0758k extends AbstractC0765q {

    /* renamed from: a */
    private final String f1496a;

    /* renamed from: b */
    private final String f1497b;

    /* renamed from: c */
    private final String f1498c;

    /* renamed from: d */
    private final String f1499d;

    /* renamed from: e */
    private final String f1500e;

    /* renamed from: f */
    private final String f1501f;

    /* renamed from: g */
    private final String f1502g;

    /* renamed from: h */
    private final String f1503h;

    /* renamed from: i */
    private final String f1504i;

    /* renamed from: j */
    private final String f1505j;

    /* renamed from: k */
    private final String f1506k;

    /* renamed from: l */
    private final String f1507l;

    /* renamed from: m */
    private final String f1508m;

    /* renamed from: n */
    private final Map<String, String> f1509n;

    public C0758k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(EnumC0766r.PRODUCT);
        this.f1496a = str;
        this.f1497b = str2;
        this.f1498c = str3;
        this.f1499d = str4;
        this.f1500e = str5;
        this.f1501f = str7;
        this.f1502g = str8;
        this.f1503h = str9;
        this.f1504i = str10;
        this.f1505j = str11;
        this.f1506k = str12;
        this.f1507l = str13;
        this.f1508m = str14;
        this.f1509n = map;
    }

    /* renamed from: d */
    private static boolean m1496d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m1497e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        return String.valueOf(this.f1496a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0758k)) {
            return false;
        }
        C0758k kVar = (C0758k) obj;
        return m1496d(this.f1497b, kVar.f1497b) && m1496d(this.f1498c, kVar.f1498c) && m1496d(this.f1499d, kVar.f1499d) && m1496d(this.f1500e, kVar.f1500e) && m1496d(this.f1501f, kVar.f1501f) && m1496d(this.f1502g, kVar.f1502g) && m1496d(this.f1503h, kVar.f1503h) && m1496d(this.f1504i, kVar.f1504i) && m1496d(this.f1505j, kVar.f1505j) && m1496d(this.f1506k, kVar.f1506k) && m1496d(this.f1507l, kVar.f1507l) && m1496d(this.f1508m, kVar.f1508m) && m1496d(this.f1509n, kVar.f1509n);
    }

    public int hashCode() {
        return ((((((((((((m1497e(this.f1497b) ^ 0) ^ m1497e(this.f1498c)) ^ m1497e(this.f1499d)) ^ m1497e(this.f1500e)) ^ m1497e(this.f1501f)) ^ m1497e(this.f1502g)) ^ m1497e(this.f1503h)) ^ m1497e(this.f1504i)) ^ m1497e(this.f1505j)) ^ m1497e(this.f1506k)) ^ m1497e(this.f1507l)) ^ m1497e(this.f1508m)) ^ m1497e(this.f1509n);
    }
}
