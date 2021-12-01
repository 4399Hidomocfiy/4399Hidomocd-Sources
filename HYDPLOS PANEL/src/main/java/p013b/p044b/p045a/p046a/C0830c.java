package p013b.p044b.p045a.p046a;

/* renamed from: b.b.a.a.c */
public class C0830c {

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.c$a */
    public static class C0831a {

        /* renamed from: a */
        private int[] f1709a;

        /* renamed from: b */
        private int f1710b;

        /* renamed from: c */
        private byte[] f1711c;

        C0831a() {
        }

        /* renamed from: a */
        public void mo8926a(byte[] bArr) {
            this.f1711c = bArr;
            int length = bArr.length;
            this.f1709a = new int[length];
            int i = 0;
            for (int i2 = 1; i2 < length; i2++) {
                while (i > 0) {
                    byte[] bArr2 = this.f1711c;
                    if (bArr2[i] == bArr2[i2]) {
                        break;
                    }
                    i = this.f1709a[i - 1];
                }
                byte[] bArr3 = this.f1711c;
                if (bArr3[i] == bArr3[i2]) {
                    i++;
                }
                this.f1709a[i2] = i;
            }
        }

        /* renamed from: b */
        public int mo8927b(byte[] bArr, int i) {
            if (bArr.length != 0 && i <= bArr.length) {
                int i2 = 0;
                while (i < bArr.length) {
                    while (i2 > 0 && this.f1711c[i2] != bArr[i]) {
                        i2 = this.f1709a[i2 - 1];
                    }
                    byte[] bArr2 = this.f1711c;
                    if (bArr2[i2] == bArr[i]) {
                        i2++;
                    }
                    if (i2 == bArr2.length) {
                        int length = (i - bArr2.length) + 1;
                        this.f1710b = length;
                        return length;
                    }
                    i++;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static byte[] m1810a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 1) {
            return null;
        }
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (i < i2) {
            bArr2[i4] = bArr[i];
            i4++;
            i++;
        }
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m1811b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int length;
        int d;
        int i2;
        int d2 = m1813d(bArr, bArr2, i);
        if (d2 == -1 || (d = m1813d(bArr, bArr3, (length = d2 + bArr2.length))) == -1 || (i2 = d - length) < 1) {
            return null;
        }
        byte[] bArr4 = new byte[i2];
        int i3 = 0;
        while (length < d) {
            bArr4[i3] = bArr[length];
            i3++;
            length++;
        }
        return bArr4;
    }

    /* renamed from: c */
    public static byte[] m1812c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: d */
    public static int m1813d(byte[] bArr, byte[] bArr2, int i) {
        C0831a aVar = new C0831a();
        aVar.mo8926a(bArr2);
        return aVar.mo8927b(bArr, i);
    }
}
