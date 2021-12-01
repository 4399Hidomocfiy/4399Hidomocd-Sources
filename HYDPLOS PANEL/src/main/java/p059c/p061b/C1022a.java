package p059c.p061b;

/* renamed from: c.b.a */
public class C1022a implements AbstractC1028f {

    /* renamed from: a */
    private char f2199a;

    /* renamed from: b */
    private int f2200b;

    /* renamed from: c */
    private int f2201c;

    C1022a(char c, int i, int i2) {
        this.f2199a = c;
        this.f2200b = i;
        this.f2201c = i2;
    }

    @Override // p059c.p061b.AbstractC1028f
    /* renamed from: a */
    public int mo9972a() {
        return this.f2200b;
    }

    @Override // p059c.p061b.AbstractC1028f
    /* renamed from: b */
    public int mo9973b() {
        return this.f2201c;
    }

    /* renamed from: c */
    public String mo9974c() {
        return mo9978g() ? "" : String.valueOf(this.f2199a);
    }

    /* renamed from: d */
    public char mo9975d() {
        return this.f2199a;
    }

    /* renamed from: e */
    public boolean mo9976e(char... cArr) {
        for (char c : cArr) {
            if (c == this.f2199a && c != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo9977f() {
        return Character.isDigit(this.f2199a);
    }

    /* renamed from: g */
    public boolean mo9978g() {
        return this.f2199a == 0;
    }

    /* renamed from: h */
    public boolean mo9979h() {
        return Character.isLetter(this.f2199a);
    }

    /* renamed from: i */
    public boolean mo9980i() {
        return this.f2199a == '\n';
    }

    /* renamed from: j */
    public boolean mo9981j() {
        return Character.isWhitespace(this.f2199a) && !mo9978g();
    }

    public String toString() {
        return mo9978g() ? "<End Of Input>" : String.valueOf(this.f2199a);
    }
}
