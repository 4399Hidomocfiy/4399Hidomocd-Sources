package p013b.p014a.p015a.p035x;

/* renamed from: b.a.a.x.c */
public final class C0777c {

    /* renamed from: a */
    private final byte[] f1545a;

    /* renamed from: b */
    private int f1546b;

    /* renamed from: c */
    private int f1547c;

    public C0777c(byte[] bArr) {
        this.f1545a = bArr;
    }

    /* renamed from: a */
    public int mo8805a() {
        return ((this.f1545a.length - this.f1546b) * 8) - this.f1547c;
    }

    /* renamed from: b */
    public int mo8806b() {
        return this.f1547c;
    }

    /* renamed from: c */
    public int mo8807c() {
        return this.f1546b;
    }

    /* renamed from: d */
    public int mo8808d(int i) {
        if (i < 1 || i > 32 || i > mo8805a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f1547c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int i5 = i < i4 ? i : i4;
            int i6 = i4 - i5;
            byte[] bArr = this.f1545a;
            int i7 = this.f1546b;
            int i8 = (((255 >> (8 - i5)) << i6) & bArr[i7]) >> i6;
            i -= i5;
            int i9 = i2 + i5;
            this.f1547c = i9;
            if (i9 == 8) {
                this.f1547c = 0;
                this.f1546b = i7 + 1;
            }
            i3 = i8;
        }
        if (i <= 0) {
            return i3;
        }
        while (i >= 8) {
            int i10 = i3 << 8;
            byte[] bArr2 = this.f1545a;
            int i11 = this.f1546b;
            i3 = (bArr2[i11] & 255) | i10;
            this.f1546b = i11 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i3;
        }
        int i12 = 8 - i;
        int i13 = (i3 << i) | ((((255 >> i12) << i12) & this.f1545a[this.f1546b]) >> i12);
        this.f1547c += i;
        return i13;
    }
}
