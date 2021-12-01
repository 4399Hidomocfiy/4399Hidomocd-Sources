package p013b.p014a.p015a.p035x.p037n;

/* renamed from: b.a.a.x.n.a */
public final class C0789a {

    /* renamed from: h */
    public static final C0789a f1612h = new C0789a(4201, 4096, 1);

    /* renamed from: i */
    public static final C0789a f1613i = new C0789a(1033, 1024, 1);

    /* renamed from: j */
    public static final C0789a f1614j;

    /* renamed from: k */
    public static final C0789a f1615k = new C0789a(19, 16, 1);

    /* renamed from: l */
    public static final C0789a f1616l = new C0789a(285, 256, 0);

    /* renamed from: m */
    public static final C0789a f1617m;

    /* renamed from: n */
    public static final C0789a f1618n;

    /* renamed from: o */
    public static final C0789a f1619o;

    /* renamed from: a */
    private final int[] f1620a;

    /* renamed from: b */
    private final int[] f1621b;

    /* renamed from: c */
    private final C0790b f1622c;

    /* renamed from: d */
    private final C0790b f1623d;

    /* renamed from: e */
    private final int f1624e;

    /* renamed from: f */
    private final int f1625f;

    /* renamed from: g */
    private final int f1626g;

    static {
        C0789a aVar = new C0789a(67, 64, 1);
        f1614j = aVar;
        C0789a aVar2 = new C0789a(301, 256, 1);
        f1617m = aVar2;
        f1618n = aVar2;
        f1619o = aVar;
    }

    public C0789a(int i, int i2, int i3) {
        this.f1625f = i;
        this.f1624e = i2;
        this.f1626g = i3;
        this.f1620a = new int[i2];
        this.f1621b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f1620a[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f1621b[this.f1620a[i6]] = i6;
        }
        this.f1622c = new C0790b(this, new int[]{0});
        this.f1623d = new C0790b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m1621a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0790b mo8829b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f1622c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C0790b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8830c(int i) {
        return this.f1620a[i];
    }

    /* renamed from: d */
    public int mo8831d() {
        return this.f1626g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0790b mo8832e() {
        return this.f1623d;
    }

    /* renamed from: f */
    public int mo8833f() {
        return this.f1624e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0790b mo8834g() {
        return this.f1622c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8835h(int i) {
        if (i != 0) {
            return this.f1620a[(this.f1624e - this.f1621b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo8836i(int i) {
        if (i != 0) {
            return this.f1621b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo8837j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f1620a;
        int[] iArr2 = this.f1621b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f1624e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f1625f) + ',' + this.f1624e + ')';
    }
}
