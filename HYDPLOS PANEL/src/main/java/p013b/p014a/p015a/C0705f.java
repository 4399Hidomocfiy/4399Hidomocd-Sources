package p013b.p014a.p015a;

/* renamed from: b.a.a.f */
public final class C0705f {

    /* renamed from: a */
    private final int f1350a;

    /* renamed from: b */
    private final int f1351b;

    /* renamed from: a */
    public int mo8673a() {
        return this.f1351b;
    }

    /* renamed from: b */
    public int mo8674b() {
        return this.f1350a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0705f)) {
            return false;
        }
        C0705f fVar = (C0705f) obj;
        return this.f1350a == fVar.f1350a && this.f1351b == fVar.f1351b;
    }

    public int hashCode() {
        return (this.f1350a * 32713) + this.f1351b;
    }

    public String toString() {
        return this.f1350a + "x" + this.f1351b;
    }
}
