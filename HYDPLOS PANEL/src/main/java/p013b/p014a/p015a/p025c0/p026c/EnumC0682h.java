package p013b.p014a.p015a.p025c0.p026c;

/* renamed from: b.a.a.c0.c.h */
public enum EnumC0682h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: a */
    private final int[] f1284a;

    /* renamed from: b */
    private final int f1285b;

    private EnumC0682h(int[] iArr, int i) {
        this.f1284a = iArr;
        this.f1285b = i;
    }

    /* renamed from: a */
    public static EnumC0682h m1198a(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo8620b() {
        return this.f1285b;
    }

    /* renamed from: c */
    public int mo8621c(C0684j jVar) {
        int j = jVar.mo8628j();
        return this.f1284a[j <= 9 ? 0 : j <= 26 ? (char) 1 : 2];
    }
}
