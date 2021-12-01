package p013b.p014a.p015a.p016a0.p017a0;

import p013b.p014a.p015a.C0718r;

/* renamed from: b.a.a.a0.a0.c */
public final class C0581c {

    /* renamed from: a */
    private final int f1053a;

    /* renamed from: b */
    private final int[] f1054b;

    /* renamed from: c */
    private final C0718r[] f1055c;

    public C0581c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f1053a = i;
        this.f1054b = iArr;
        float f = (float) i4;
        this.f1055c = new C0718r[]{new C0718r((float) i2, f), new C0718r((float) i3, f)};
    }

    /* renamed from: a */
    public C0718r[] mo8426a() {
        return this.f1055c;
    }

    /* renamed from: b */
    public int[] mo8427b() {
        return this.f1054b;
    }

    /* renamed from: c */
    public int mo8428c() {
        return this.f1053a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0581c) && this.f1053a == ((C0581c) obj).f1053a;
    }

    public int hashCode() {
        return this.f1053a;
    }
}
