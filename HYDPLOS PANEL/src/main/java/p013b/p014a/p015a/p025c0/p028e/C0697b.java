package p013b.p014a.p015a.p025c0.p028e;

import java.lang.reflect.Array;

/* renamed from: b.a.a.c0.e.b */
public final class C0697b {

    /* renamed from: a */
    private final byte[][] f1323a;

    /* renamed from: b */
    private final int f1324b;

    /* renamed from: c */
    private final int f1325c;

    public C0697b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f1323a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f1324b = i;
        this.f1325c = i2;
    }

    /* renamed from: a */
    public void mo8658a(byte b) {
        for (int i = 0; i < this.f1325c; i++) {
            for (int i2 = 0; i2 < this.f1324b; i2++) {
                this.f1323a[i][i2] = b;
            }
        }
    }

    /* renamed from: b */
    public byte mo8659b(int i, int i2) {
        return this.f1323a[i2][i];
    }

    /* renamed from: c */
    public byte[][] mo8660c() {
        return this.f1323a;
    }

    /* renamed from: d */
    public int mo8661d() {
        return this.f1325c;
    }

    /* renamed from: e */
    public int mo8662e() {
        return this.f1324b;
    }

    /* renamed from: f */
    public void mo8663f(int i, int i2, int i3) {
        this.f1323a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void mo8664g(int i, int i2, boolean z) {
        this.f1323a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f1324b * 2 * this.f1325c) + 2);
        for (int i = 0; i < this.f1325c; i++) {
            for (int i2 = 0; i2 < this.f1324b; i2++) {
                byte b = this.f1323a[i][i2];
                sb.append(b != 0 ? b != 1 ? "  " : " 1" : " 0");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
