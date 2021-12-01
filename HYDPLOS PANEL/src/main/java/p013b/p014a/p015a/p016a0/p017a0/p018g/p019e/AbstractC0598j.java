package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.a0.g.e.j */
public abstract class AbstractC0598j {

    /* renamed from: a */
    private final C0775a f1085a;

    /* renamed from: b */
    private final C0608s f1086b;

    AbstractC0598j(C0775a aVar) {
        this.f1085a = aVar;
        this.f1086b = new C0608s(aVar);
    }

    /* renamed from: a */
    public static AbstractC0598j m818a(C0775a aVar) {
        if (aVar.mo8773g(1)) {
            return new C0595g(aVar);
        }
        if (!aVar.mo8773g(2)) {
            return new C0599k(aVar);
        }
        int g = C0608s.m849g(aVar, 1, 4);
        if (g == 4) {
            return new C0589a(aVar);
        }
        if (g == 5) {
            return new C0590b(aVar);
        }
        int g2 = C0608s.m849g(aVar, 1, 5);
        if (g2 == 12) {
            return new C0591c(aVar);
        }
        if (g2 == 13) {
            return new C0592d(aVar);
        }
        switch (C0608s.m849g(aVar, 1, 7)) {
            case 56:
                return new C0593e(aVar, "310", "11");
            case 57:
                return new C0593e(aVar, "320", "11");
            case 58:
                return new C0593e(aVar, "310", "13");
            case 59:
                return new C0593e(aVar, "320", "13");
            case 60:
                return new C0593e(aVar, "310", "15");
            case 61:
                return new C0593e(aVar, "320", "15");
            case 62:
                return new C0593e(aVar, "310", "17");
            case 63:
                return new C0593e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0608s mo8457b() {
        return this.f1086b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C0775a mo8458c() {
        return this.f1085a;
    }

    /* renamed from: d */
    public abstract String mo8453d();
}
