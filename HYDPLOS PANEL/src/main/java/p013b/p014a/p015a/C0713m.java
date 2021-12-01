package p013b.p014a.p015a;

import android.support.p009v4.view.ViewCompat;

/* renamed from: b.a.a.m */
public final class C0713m extends AbstractC0708i {

    /* renamed from: c */
    private final byte[] f1370c;

    /* renamed from: d */
    private final int f1371d;

    /* renamed from: e */
    private final int f1372e;

    /* renamed from: f */
    private final int f1373f;

    /* renamed from: g */
    private final int f1374g;

    public C0713m(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f1370c = bArr;
        this.f1371d = i;
        this.f1372e = i2;
        this.f1373f = i3;
        this.f1374g = i4;
        if (z) {
            m1334j(i5, i6);
        }
    }

    /* renamed from: j */
    private void m1334j(int i, int i2) {
        byte[] bArr = this.f1370c;
        int i3 = (this.f1374g * this.f1371d) + this.f1373f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f1371d;
        }
    }

    @Override // p013b.p014a.p015a.AbstractC0708i
    /* renamed from: b */
    public byte[] mo8679b() {
        int d = mo8681d();
        int a = mo8678a();
        int i = this.f1371d;
        if (d == i && a == this.f1372e) {
            return this.f1370c;
        }
        int i2 = d * a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f1374g * i) + this.f1373f;
        if (d == i) {
            System.arraycopy(this.f1370c, i3, bArr, 0, i2);
            return bArr;
        }
        byte[] bArr2 = this.f1370c;
        for (int i4 = 0; i4 < a; i4++) {
            System.arraycopy(bArr2, i3, bArr, i4 * d, d);
            i3 += this.f1371d;
        }
        return bArr;
    }

    @Override // p013b.p014a.p015a.AbstractC0708i
    /* renamed from: c */
    public byte[] mo8680c(int i, byte[] bArr) {
        if (i < 0 || i >= mo8678a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int d = mo8681d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f1370c, ((i + this.f1374g) * this.f1371d) + this.f1373f, bArr, 0, d);
        return bArr;
    }

    /* renamed from: g */
    public int mo8687g() {
        return mo8678a() / 2;
    }

    /* renamed from: h */
    public int mo8688h() {
        return mo8681d() / 2;
    }

    /* renamed from: i */
    public int[] mo8689i() {
        int d = mo8681d() / 2;
        int a = mo8678a() / 2;
        int[] iArr = new int[(d * a)];
        byte[] bArr = this.f1370c;
        int i = (this.f1374g * this.f1371d) + this.f1373f;
        for (int i2 = 0; i2 < a; i2++) {
            int i3 = i2 * d;
            for (int i4 = 0; i4 < d; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 * 2) + i] & 255) * 65793) | ViewCompat.MEASURED_STATE_MASK;
            }
            i += this.f1371d * 2;
        }
        return iArr;
    }
}
