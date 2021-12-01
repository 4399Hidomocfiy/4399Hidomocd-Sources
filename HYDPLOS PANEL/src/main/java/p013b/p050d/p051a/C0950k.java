package p013b.p050d.p051a;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p013b.p050d.p052b.AbstractC0962a;
import p013b.p050d.p052b.AbstractC0964c;

/* renamed from: b.d.a.k */
public class C0950k implements Cloneable {

    /* renamed from: k */
    private static final AbstractC0953l f2037k = new C0930f();

    /* renamed from: l */
    private static final AbstractC0953l f2038l = new C0928d();

    /* renamed from: m */
    private static Class[] f2039m;

    /* renamed from: n */
    private static Class[] f2040n;

    /* renamed from: o */
    private static Class[] f2041o;

    /* renamed from: p */
    private static final HashMap<Class, HashMap<String, Method>> f2042p = new HashMap<>();

    /* renamed from: q */
    private static final HashMap<Class, HashMap<String, Method>> f2043q = new HashMap<>();

    /* renamed from: a */
    String f2044a;

    /* renamed from: b */
    protected AbstractC0964c f2045b;

    /* renamed from: c */
    Method f2046c;

    /* renamed from: d */
    private Method f2047d;

    /* renamed from: e */
    Class f2048e;

    /* renamed from: f */
    C0933h f2049f;

    /* renamed from: g */
    final ReentrantReadWriteLock f2050g;

    /* renamed from: h */
    final Object[] f2051h;

    /* renamed from: i */
    private AbstractC0953l f2052i;

    /* renamed from: j */
    private Object f2053j;

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.k$b */
    public static class C0952b extends C0950k {

        /* renamed from: r */
        private AbstractC0962a f2054r;

        /* renamed from: s */
        C0929e f2055s;

        /* renamed from: t */
        float f2056t;

        public C0952b(AbstractC0964c cVar, float... fArr) {
            super(cVar);
            mo9201k(fArr);
            if (cVar instanceof AbstractC0962a) {
                this.f2054r = (AbstractC0962a) this.f2045b;
            }
        }

        public C0952b(String str, float... fArr) {
            super(str);
            mo9201k(fArr);
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p050d.p051a.C0950k
        /* renamed from: a */
        public void mo9194a(float f) {
            this.f2056t = this.f2055s.mo9142f(f);
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p050d.p051a.C0950k
        /* renamed from: c */
        public Object mo9196c() {
            return Float.valueOf(this.f2056t);
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p050d.p051a.C0950k
        /* renamed from: j */
        public void mo9200j(Object obj) {
            String str;
            AbstractC0962a aVar = this.f2054r;
            if (aVar != null) {
                aVar.mo9167e(obj, this.f2056t);
                return;
            }
            AbstractC0964c cVar = this.f2045b;
            if (cVar != null) {
                cVar.mo9224c(obj, Float.valueOf(this.f2056t));
                return;
            } else if (this.f2046c != null) {
                try {
                    this.f2051h[0] = Float.valueOf(this.f2056t);
                    this.f2046c.invoke(obj, this.f2051h);
                    return;
                } catch (InvocationTargetException e) {
                    str = e.toString();
                } catch (IllegalAccessException e2) {
                    str = e2.toString();
                }
            } else {
                return;
            }
            Log.e("PropertyValuesHolder", str);
        }

        @Override // p013b.p050d.p051a.C0950k
        /* renamed from: k */
        public void mo9201k(float... fArr) {
            C0950k.super.mo9201k(fArr);
            this.f2055s = (C0929e) this.f2049f;
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p050d.p051a.C0950k
        /* renamed from: o */
        public void mo9204o(Class cls) {
            if (this.f2045b == null) {
                C0950k.super.mo9204o(cls);
            }
        }

        /* renamed from: r */
        public C0952b clone() {
            C0952b bVar = (C0952b) C0950k.super.clone();
            bVar.f2055s = (C0929e) bVar.f2049f;
            return bVar;
        }
    }

    static {
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        f2039m = new Class[]{cls, Float.class, Double.TYPE, cls2, Double.class, Integer.class};
        Class cls3 = Double.TYPE;
        f2040n = new Class[]{cls2, Integer.class, cls, cls3, Float.class, Double.class};
        f2041o = new Class[]{cls3, Double.class, cls, cls2, Float.class, Integer.class};
    }

    private C0950k(AbstractC0964c cVar) {
        this.f2046c = null;
        this.f2047d = null;
        this.f2049f = null;
        this.f2050g = new ReentrantReadWriteLock();
        this.f2051h = new Object[1];
        this.f2045b = cVar;
        if (cVar != null) {
            this.f2044a = cVar.mo9227b();
        }
    }

    private C0950k(String str) {
        this.f2046c = null;
        this.f2047d = null;
        this.f2049f = null;
        this.f2050g = new ReentrantReadWriteLock();
        this.f2051h = new Object[1];
        this.f2044a = str;
    }

    /* renamed from: d */
    static String m2616d(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char upperCase = Character.toUpperCase(str2.charAt(0));
        String substring = str2.substring(1);
        return str + upperCase + substring;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:21|22|23|25|26|34|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0073 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.reflect.Method m2617e(java.lang.Class r9, java.lang.String r10, java.lang.Class r11) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p050d.p051a.C0950k.m2617e(java.lang.Class, java.lang.String, java.lang.Class):java.lang.reflect.Method");
    }

    /* renamed from: h */
    public static C0950k m2618h(AbstractC0964c<?, Float> cVar, float... fArr) {
        return new C0952b(cVar, fArr);
    }

    /* renamed from: i */
    public static C0950k m2619i(String str, float... fArr) {
        return new C0952b(str, fArr);
    }

    /* renamed from: n */
    private void m2620n(Class cls) {
        this.f2047d = m2621q(cls, f2043q, "get", null);
    }

    /* renamed from: q */
    private Method m2621q(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.f2050g.writeLock().lock();
            HashMap<String, Method> hashMap2 = hashMap.get(cls);
            Method method = hashMap2 != null ? hashMap2.get(this.f2044a) : null;
            if (method == null) {
                method = m2617e(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f2044a, method);
            }
            return method;
        } finally {
            this.f2050g.writeLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9194a(float f) {
        this.f2053j = this.f2049f.mo9139b(f);
    }

    /* renamed from: b */
    public C0950k clone() {
        try {
            C0950k kVar = (C0950k) super.clone();
            kVar.f2044a = this.f2044a;
            kVar.f2045b = this.f2045b;
            kVar.f2049f = this.f2049f.mo9138a();
            kVar.f2052i = this.f2052i;
            return kVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Object mo9196c() {
        return this.f2053j;
    }

    /* renamed from: f */
    public String mo9198f() {
        return this.f2044a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9199g() {
        if (this.f2052i == null) {
            Class cls = this.f2048e;
            this.f2052i = cls == Integer.class ? f2037k : cls == Float.class ? f2038l : null;
        }
        AbstractC0953l lVar = this.f2052i;
        if (lVar != null) {
            this.f2049f.mo9154d(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9200j(Object obj) {
        String str;
        AbstractC0964c cVar = this.f2045b;
        if (cVar != null) {
            cVar.mo9224c(obj, mo9196c());
        }
        if (this.f2046c != null) {
            try {
                this.f2051h[0] = mo9196c();
                this.f2046c.invoke(obj, this.f2051h);
                return;
            } catch (InvocationTargetException e) {
                str = e.toString();
            } catch (IllegalAccessException e2) {
                str = e2.toString();
            }
        } else {
            return;
        }
        Log.e("PropertyValuesHolder", str);
    }

    /* renamed from: k */
    public void mo9201k(float... fArr) {
        this.f2048e = Float.TYPE;
        this.f2049f = C0933h.m2546c(fArr);
    }

    /* renamed from: l */
    public void mo9202l(AbstractC0964c cVar) {
        this.f2045b = cVar;
    }

    /* renamed from: m */
    public void mo9203m(String str) {
        this.f2044a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo9204o(Class cls) {
        this.f2046c = m2621q(cls, f2042p, "set", this.f2048e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo9205p(Object obj) {
        String str;
        AbstractC0964c cVar = this.f2045b;
        if (cVar != null) {
            try {
                cVar.mo9166a(obj);
                Iterator<AbstractC0931g> it = this.f2049f.f2017d.iterator();
                while (it.hasNext()) {
                    AbstractC0931g next = it.next();
                    if (!next.mo9149e()) {
                        next.mo9151i(this.f2045b.mo9166a(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f2045b.mo9227b() + ") on target object " + obj + ". Trying reflection instead");
                this.f2045b = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f2046c == null) {
            mo9204o(cls);
        }
        Iterator<AbstractC0931g> it2 = this.f2049f.f2017d.iterator();
        while (it2.hasNext()) {
            AbstractC0931g next2 = it2.next();
            if (!next2.mo9149e()) {
                if (this.f2047d == null) {
                    m2620n(cls);
                }
                try {
                    next2.mo9151i(this.f2047d.invoke(obj, new Object[0]));
                } catch (InvocationTargetException e) {
                    str = e.toString();
                } catch (IllegalAccessException e2) {
                    str = e2.toString();
                }
            }
        }
        return;
        Log.e("PropertyValuesHolder", str);
    }

    public String toString() {
        return this.f2044a + ": " + this.f2049f.toString();
    }
}
