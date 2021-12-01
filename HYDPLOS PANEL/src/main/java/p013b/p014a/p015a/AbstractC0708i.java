package p013b.p014a.p015a;

/* renamed from: b.a.a.i */
public abstract class AbstractC0708i {

    /* renamed from: a */
    private final int f1364a;

    /* renamed from: b */
    private final int f1365b;

    protected AbstractC0708i(int i, int i2) {
        this.f1364a = i;
        this.f1365b = i2;
    }

    /* renamed from: a */
    public final int mo8678a() {
        return this.f1365b;
    }

    /* renamed from: b */
    public abstract byte[] mo8679b();

    /* renamed from: c */
    public abstract byte[] mo8680c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo8681d() {
        return this.f1364a;
    }

    /* renamed from: e */
    public boolean mo8682e() {
        return false;
    }

    /* renamed from: f */
    public AbstractC0708i mo8683f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f1364a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f1365b * (i + 1));
        for (int i2 = 0; i2 < this.f1365b; i2++) {
            bArr = mo8680c(i2, bArr);
            for (int i3 = 0; i3 < this.f1364a; i3++) {
                int i4 = bArr[i3] & 255;
                sb.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
