package p013b.p014a.p015a.p025c0.p026c;

/* renamed from: b.a.a.c0.c.f */
public enum EnumC0680f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: f */
    private static final EnumC0680f[] f1266f;

    /* renamed from: a */
    private final int f1268a;

    static {
        EnumC0680f fVar;
        EnumC0680f fVar2;
        EnumC0680f fVar3;
        EnumC0680f fVar4;
        f1266f = new EnumC0680f[]{fVar2, fVar, fVar4, fVar3};
    }

    private EnumC0680f(int i) {
        this.f1268a = i;
    }

    /* renamed from: a */
    public static EnumC0680f m1191a(int i) {
        if (i >= 0) {
            EnumC0680f[] fVarArr = f1266f;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo8615b() {
        return this.f1268a;
    }
}
