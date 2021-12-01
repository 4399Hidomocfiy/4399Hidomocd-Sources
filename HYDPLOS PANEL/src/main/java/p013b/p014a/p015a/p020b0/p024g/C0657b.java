package p013b.p014a.p015a.p020b0.p024g;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.g.b */
public final class C0657b {

    /* renamed from: a */
    private final byte[] f1223a;

    /* renamed from: b */
    private int f1224b = 0;

    C0657b(int i) {
        this.f1223a = new byte[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8584a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f1224b;
            this.f1224b = i3 + 1;
            mo8586c(i3, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] mo8585b(int i) {
        int length = this.f1223a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f1223a[i2 / i];
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8586c(int i, boolean z) {
        this.f1223a[i] = z ? (byte) 1 : 0;
    }
}
