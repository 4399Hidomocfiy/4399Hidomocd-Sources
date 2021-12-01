package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0022a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000a.p001a.p002a.p003a.C0000a;
import p000a.p001a.p002a.p003a.C0001b;

/* renamed from: android.arch.lifecycle.c */
public class C0026c extends AbstractC0022a {

    /* renamed from: a */
    private C0000a<Object, C0028b> f88a = new C0000a<>();

    /* renamed from: b */
    private AbstractC0022a.EnumC0024b f89b;

    /* renamed from: c */
    private final AbstractC0025b f90c;

    /* renamed from: d */
    private int f91d = 0;

    /* renamed from: e */
    private boolean f92e = false;

    /* renamed from: f */
    private boolean f93f = false;

    /* renamed from: g */
    private ArrayList<AbstractC0022a.EnumC0024b> f94g = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.c$a */
    public static /* synthetic */ class C0027a {

        /* renamed from: a */
        static final /* synthetic */ int[] f95a;

        /* renamed from: b */
        static final /* synthetic */ int[] f96b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.C0026c.C0027a.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.c$b */
    public static class C0028b {

        /* renamed from: a */
        AbstractC0022a.EnumC0024b f97a;

        /* renamed from: b */
        GenericLifecycleObserver f98b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo23a(AbstractC0025b bVar, AbstractC0022a.EnumC0023a aVar) {
            AbstractC0022a.EnumC0024b d = C0026c.m22d(aVar);
            this.f97a = C0026c.m24h(this.f97a, d);
            this.f98b.mo17a(bVar, aVar);
            this.f97a = d;
        }
    }

    public C0026c(AbstractC0025b bVar) {
        this.f90c = bVar;
        this.f89b = AbstractC0022a.EnumC0024b.INITIALIZED;
    }

    /* renamed from: a */
    private void m19a() {
        Iterator<Map.Entry<Object, C0028b>> b = this.f88a.mo2b();
        while (b.hasNext() && !this.f93f) {
            Map.Entry<Object, C0028b> next = b.next();
            C0028b value = next.getValue();
            while (value.f97a.compareTo((Enum) this.f89b) > 0 && !this.f93f && this.f88a.contains(next.getKey())) {
                AbstractC0022a.EnumC0023a b2 = m20b(value.f97a);
                m26j(m22d(b2));
                value.mo23a(this.f90c, b2);
                m25i();
            }
        }
    }

    /* renamed from: b */
    private static AbstractC0022a.EnumC0023a m20b(AbstractC0022a.EnumC0024b bVar) {
        int i = C0027a.f96b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return AbstractC0022a.EnumC0023a.ON_DESTROY;
        } else {
            if (i == 3) {
                return AbstractC0022a.EnumC0023a.ON_STOP;
            }
            if (i == 4) {
                return AbstractC0022a.EnumC0023a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    private void m21c() {
        C0001b<K, V>.C0006e d = this.f88a.mo4d();
        while (d.hasNext() && !this.f93f) {
            Map.Entry entry = (Map.Entry) d.next();
            C0028b bVar = (C0028b) entry.getValue();
            while (bVar.f97a.compareTo((Enum) this.f89b) < 0 && !this.f93f && this.f88a.contains(entry.getKey())) {
                m26j(bVar.f97a);
                bVar.mo23a(this.f90c, m28l(bVar.f97a));
                m25i();
            }
        }
    }

    /* renamed from: d */
    static AbstractC0022a.EnumC0024b m22d(AbstractC0022a.EnumC0023a aVar) {
        switch (C0027a.f95a[aVar.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0022a.EnumC0024b.CREATED;
            case 3:
            case 4:
                return AbstractC0022a.EnumC0024b.STARTED;
            case 5:
                return AbstractC0022a.EnumC0024b.RESUMED;
            case 6:
                return AbstractC0022a.EnumC0024b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: f */
    private boolean m23f() {
        if (this.f88a.size() == 0) {
            return true;
        }
        AbstractC0022a.EnumC0024b bVar = this.f88a.mo3c().getValue().f97a;
        AbstractC0022a.EnumC0024b bVar2 = this.f88a.mo5e().getValue().f97a;
        return bVar == bVar2 && this.f89b == bVar2;
    }

    /* renamed from: h */
    static AbstractC0022a.EnumC0024b m24h(AbstractC0022a.EnumC0024b bVar, AbstractC0022a.EnumC0024b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: i */
    private void m25i() {
        ArrayList<AbstractC0022a.EnumC0024b> arrayList = this.f94g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: j */
    private void m26j(AbstractC0022a.EnumC0024b bVar) {
        this.f94g.add(bVar);
    }

    /* renamed from: k */
    private void m27k() {
        while (true) {
            boolean f = m23f();
            this.f93f = false;
            if (!f) {
                if (this.f89b.compareTo((Enum) this.f88a.mo3c().getValue().f97a) < 0) {
                    m19a();
                }
                Map.Entry<Object, C0028b> e = this.f88a.mo5e();
                if (!this.f93f && e != null && this.f89b.compareTo((Enum) e.getValue().f97a) > 0) {
                    m21c();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private static AbstractC0022a.EnumC0023a m28l(AbstractC0022a.EnumC0024b bVar) {
        int i = C0027a.f96b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC0022a.EnumC0023a.ON_START;
            }
            if (i == 3) {
                return AbstractC0022a.EnumC0023a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return AbstractC0022a.EnumC0023a.ON_CREATE;
    }

    /* renamed from: e */
    public void mo21e(AbstractC0022a.EnumC0023a aVar) {
        this.f89b = m22d(aVar);
        if (this.f92e || this.f91d != 0) {
            this.f93f = true;
            return;
        }
        this.f92e = true;
        m27k();
        this.f92e = false;
    }

    /* renamed from: g */
    public void mo22g(AbstractC0022a.EnumC0024b bVar) {
        this.f89b = bVar;
    }
}
