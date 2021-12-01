package p000a.p001a.p002a.p003a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.a.a.a.b */
public class C0001b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    private C0005d<K, V> f1a;

    /* renamed from: b */
    private C0005d<K, V> f2b;

    /* renamed from: c */
    private WeakHashMap<Object<K, V>, Boolean> f3c = new WeakHashMap<>();

    /* renamed from: d */
    private int f4d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.a.b$b */
    public static class C0003b<K, V> extends AbstractC0007f<K, V> {
        C0003b(C0005d<K, V> dVar, C0005d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // p000a.p001a.p002a.p003a.C0001b.AbstractC0007f
        /* renamed from: a */
        public C0005d<K, V> mo10a(C0005d<K, V> dVar) {
            return dVar.f5a;
        }
    }

    /* renamed from: a.a.a.a.b$c */
    private static class C0004c<K, V> extends AbstractC0007f<K, V> {
        C0004c(C0005d<K, V> dVar, C0005d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // p000a.p001a.p002a.p003a.C0001b.AbstractC0007f
        /* renamed from: a */
        public C0005d<K, V> mo10a(C0005d<K, V> dVar) {
            return dVar.f6b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.a.b$d */
    public static class C0005d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C0005d<K, V> f5a;

        /* renamed from: b */
        C0005d<K, V> f6b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a.a.a.a.b$e */
    public class C0006e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private C0005d<K, V> f7a;

        /* renamed from: b */
        private boolean f8b;

        private C0006e() {
            this.f8b = true;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (this.f8b) {
                this.f8b = false;
                C0005d unused = C0001b.this.f1a;
            } else {
                C0005d<K, V> dVar = this.f7a;
                if (dVar != null) {
                    C0005d<K, V> dVar2 = dVar.f5a;
                }
            }
            return this.f7a;
        }

        public boolean hasNext() {
            if (this.f8b) {
                return C0001b.this.f1a != null;
            }
            C0005d<K, V> dVar = this.f7a;
            return (dVar == null || dVar.f5a == null) ? false : true;
        }
    }

    /* renamed from: a.a.a.a.b$f */
    private static abstract class AbstractC0007f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        C0005d<K, V> f10a;

        /* renamed from: b */
        C0005d<K, V> f11b;

        AbstractC0007f(C0005d<K, V> dVar, C0005d<K, V> dVar2) {
        }

        /* renamed from: c */
        private C0005d<K, V> m8c() {
            C0005d<K, V> dVar = this.f11b;
            C0005d<K, V> dVar2 = this.f10a;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return mo10a(dVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0005d<K, V> mo10a(C0005d<K, V> dVar);

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C0005d<K, V> dVar = this.f11b;
            m8c();
            return dVar;
        }

        public boolean hasNext() {
            return this.f11b != null;
        }
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> mo2b() {
        C0004c cVar = new C0004c(this.f2b, this.f1a);
        this.f3c.put(cVar, Boolean.FALSE);
        return cVar;
    }

    /* renamed from: c */
    public Map.Entry<K, V> mo3c() {
        return this.f1a;
    }

    /* renamed from: d */
    public C0001b<K, V>.C0006e mo4d() {
        C0001b<K, V>.C0006e eVar = new C0006e();
        this.f3c.put(eVar, Boolean.FALSE);
        return eVar;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo5e() {
        return this.f2b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0001b)) {
            return false;
        }
        C0001b bVar = (C0001b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0003b bVar = new C0003b(this.f1a, this.f2b);
        this.f3c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public int size() {
        return this.f4d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
