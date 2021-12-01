package p013b.p014a.p015a.p016a0.p017a0.p018g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: b.a.a.a0.a0.g.c */
final class C0587c {

    /* renamed from: a */
    private final List<C0586b> f1070a;

    /* renamed from: b */
    private final int f1071b;

    /* renamed from: c */
    private final boolean f1072c;

    C0587c(List<C0586b> list, int i, boolean z) {
        this.f1070a = new ArrayList(list);
        this.f1071b = i;
        this.f1072c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0586b> mo8442a() {
        return this.f1070a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8443b() {
        return this.f1071b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8444c(List<C0586b> list) {
        return this.f1070a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0587c)) {
            return false;
        }
        C0587c cVar = (C0587c) obj;
        return this.f1070a.equals(cVar.mo8442a()) && this.f1072c == cVar.f1072c;
    }

    public int hashCode() {
        return this.f1070a.hashCode() ^ Boolean.valueOf(this.f1072c).hashCode();
    }

    public String toString() {
        return "{ " + this.f1070a + " }";
    }
}
