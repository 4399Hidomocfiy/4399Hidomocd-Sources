package p013b.p014a.p015a.p016a0.p017a0.p018g;

import p013b.p014a.p015a.p016a0.p017a0.C0580b;
import p013b.p014a.p015a.p016a0.p017a0.C0581c;

/* renamed from: b.a.a.a0.a0.g.b */
final class C0586b {

    /* renamed from: a */
    private final C0580b f1067a;

    /* renamed from: b */
    private final C0580b f1068b;

    /* renamed from: c */
    private final C0581c f1069c;

    C0586b(C0580b bVar, C0580b bVar2, C0581c cVar, boolean z) {
        this.f1067a = bVar;
        this.f1068b = bVar2;
        this.f1069c = cVar;
    }

    /* renamed from: a */
    private static boolean m772a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m773e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0581c mo8435b() {
        return this.f1069c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0580b mo8436c() {
        return this.f1067a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0580b mo8437d() {
        return this.f1068b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0586b)) {
            return false;
        }
        C0586b bVar = (C0586b) obj;
        return m772a(this.f1067a, bVar.f1067a) && m772a(this.f1068b, bVar.f1068b) && m772a(this.f1069c, bVar.f1069c);
    }

    /* renamed from: f */
    public boolean mo8439f() {
        return this.f1068b == null;
    }

    public int hashCode() {
        return (m773e(this.f1067a) ^ m773e(this.f1068b)) ^ m773e(this.f1069c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(this.f1067a);
        sb.append(" , ");
        sb.append(this.f1068b);
        sb.append(" : ");
        C0581c cVar = this.f1069c;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.mo8428c()));
        sb.append(" ]");
        return sb.toString();
    }
}
