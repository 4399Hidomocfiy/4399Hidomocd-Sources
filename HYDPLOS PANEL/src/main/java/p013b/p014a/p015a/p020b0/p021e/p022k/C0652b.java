package p013b.p014a.p015a.p020b0.p021e.p022k;

/* renamed from: b.a.a.b0.e.k.b */
public final class C0652b {

    /* renamed from: f */
    public static final C0652b f1205f = new C0652b(929, 3);

    /* renamed from: a */
    private final int[] f1206a;

    /* renamed from: b */
    private final int[] f1207b;

    /* renamed from: c */
    private final C0653c f1208c;

    /* renamed from: d */
    private final C0653c f1209d;

    /* renamed from: e */
    private final int f1210e;

    private C0652b(int i, int i2) {
        this.f1210e = i;
        this.f1206a = new int[i];
        this.f1207b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f1206a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f1207b[this.f1206a[i5]] = i5;
        }
        this.f1208c = new C0653c(this, new int[]{0});
        this.f1209d = new C0653c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8558a(int i, int i2) {
        return (i + i2) % this.f1210e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0653c mo8559b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f1208c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C0653c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8560c(int i) {
        return this.f1206a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0653c mo8561d() {
        return this.f1209d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8562e() {
        return this.f1210e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0653c mo8563f() {
        return this.f1208c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8564g(int i) {
        if (i != 0) {
            return this.f1206a[(this.f1210e - this.f1207b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8565h(int i) {
        if (i != 0) {
            return this.f1207b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo8566i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f1206a;
        int[] iArr2 = this.f1207b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f1210e - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo8567j(int i, int i2) {
        int i3 = this.f1210e;
        return ((i + i3) - i2) % i3;
    }
}
