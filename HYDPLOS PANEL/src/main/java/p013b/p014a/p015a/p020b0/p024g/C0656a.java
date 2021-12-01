package p013b.p014a.p015a.p020b0.p024g;

import java.lang.reflect.Array;

/* renamed from: b.a.a.b0.g.a */
public final class C0656a {

    /* renamed from: a */
    private final C0657b[] f1219a;

    /* renamed from: b */
    private int f1220b;

    /* renamed from: c */
    private final int f1221c;

    /* renamed from: d */
    private final int f1222d;

    C0656a(int i, int i2) {
        C0657b[] bVarArr = new C0657b[i];
        this.f1219a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f1219a[i3] = new C0657b(((i2 + 4) * 17) + 1);
        }
        this.f1222d = i2 * 17;
        this.f1221c = i;
        this.f1220b = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0657b mo8581a() {
        return this.f1219a[this.f1220b];
    }

    /* renamed from: b */
    public byte[][] mo8582b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f1222d * i;
        iArr[0] = this.f1221c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.f1221c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f1219a[i4 / i2].mo8585b(i);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8583c() {
        this.f1220b++;
    }
}
