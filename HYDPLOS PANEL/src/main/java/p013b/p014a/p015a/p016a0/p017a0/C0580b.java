package p013b.p014a.p015a.p016a0.p017a0;

/* renamed from: b.a.a.a0.a0.b */
public class C0580b {

    /* renamed from: a */
    private final int f1051a;

    /* renamed from: b */
    private final int f1052b;

    public C0580b(int i, int i2) {
        this.f1051a = i;
        this.f1052b = i2;
    }

    /* renamed from: a */
    public final int mo8421a() {
        return this.f1052b;
    }

    /* renamed from: b */
    public final int mo8422b() {
        return this.f1051a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0580b)) {
            return false;
        }
        C0580b bVar = (C0580b) obj;
        return this.f1051a == bVar.f1051a && this.f1052b == bVar.f1052b;
    }

    public final int hashCode() {
        return this.f1051a ^ this.f1052b;
    }

    public final String toString() {
        return this.f1051a + "(" + this.f1052b + ')';
    }
}
