package p059c.p060a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c.a.i */
public class C1018i {

    /* renamed from: c */
    private static C1018i f2192c;

    /* renamed from: a */
    private C1018i f2193a;

    /* renamed from: b */
    private Map<String, C1020k> f2194b = new ConcurrentHashMap();

    private C1018i() {
    }

    /* renamed from: a */
    public static C1018i m2809a() {
        C1018i iVar = new C1018i();
        iVar.f2193a = m2810d();
        return iVar;
    }

    /* renamed from: d */
    private static C1018i m2810d() {
        if (f2192c == null) {
            synchronized (C1018i.class) {
                C1018i iVar = new C1018i();
                f2192c = iVar;
                iVar.mo9964e("pi").mo9968d(3.141592653589793d);
                f2192c.mo9964e("euler").mo9968d(2.718281828459045d);
            }
        }
        return f2192c;
    }

    /* renamed from: b */
    public C1020k mo9962b(String str) {
        if (this.f2194b.containsKey(str)) {
            return this.f2194b.get(str);
        }
        C1020k kVar = new C1020k(str);
        this.f2194b.put(str, kVar);
        return kVar;
    }

    /* renamed from: c */
    public C1020k mo9963c(String str) {
        if (this.f2194b.containsKey(str)) {
            return this.f2194b.get(str);
        }
        C1018i iVar = this.f2193a;
        if (iVar != null) {
            return iVar.mo9963c(str);
        }
        return null;
    }

    /* renamed from: e */
    public C1020k mo9964e(String str) {
        C1020k c = mo9963c(str);
        return c != null ? c : mo9962b(str);
    }
}
