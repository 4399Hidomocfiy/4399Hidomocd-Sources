package bsh.org.objectweb.asm;

/* access modifiers changed from: package-private */
public final class ByteVector {
    byte[] data;
    int length;

    public ByteVector() {
        this.data = new byte[64];
    }

    public ByteVector(int i) {
        this.data = new byte[i];
    }

    private void enlarge(int i) {
        byte[] bArr = new byte[Math.max(this.data.length * 2, this.length + i)];
        System.arraycopy(this.data, 0, bArr, 0, this.length);
        this.data = bArr;
    }

    public ByteVector put1(int i) {
        int i2 = this.length;
        int i3 = i2 + 1;
        if (i3 > this.data.length) {
            enlarge(1);
        }
        this.data[i2] = (byte) i;
        this.length = i3;
        return this;
    }

    public ByteVector put11(int i, int i2) {
        int i3 = this.length;
        if (i3 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        bArr[i4] = (byte) i2;
        this.length = i4 + 1;
        return this;
    }

    public ByteVector put12(int i, int i2) {
        int i3 = this.length;
        if (i3 + 3 > this.data.length) {
            enlarge(3);
        }
        byte[] bArr = this.data;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i5] = (byte) i2;
        this.length = i5 + 1;
        return this;
    }

    public ByteVector put2(int i) {
        int i2 = this.length;
        if (i2 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        this.length = i3 + 1;
        return this;
    }

    public ByteVector put4(int i) {
        int i2 = this.length;
        if (i2 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        this.length = i5 + 1;
        return this;
    }

    public ByteVector put8(long j) {
        int i = this.length;
        if (i + 8 > this.data.length) {
            enlarge(8);
        }
        byte[] bArr = this.data;
        int i2 = (int) (j >>> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = (int) j;
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >>> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >>> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i7 >>> 8);
        bArr[i10] = (byte) i7;
        this.length = i10 + 1;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int i, int i2) {
        if (this.length + i2 > this.data.length) {
            enlarge(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.data, this.length, i2);
        }
        this.length += i2;
        return this;
    }

    public ByteVector putUTF(String str) {
        int i;
        int length2 = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt = str.charAt(i3);
            i2 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i2 + 3 : i2 + 2 : i2 + 1;
        }
        if (i2 <= 65535) {
            int i4 = this.length;
            if (i4 + 2 + i2 > this.data.length) {
                enlarge(i2 + 2);
            }
            byte[] bArr = this.data;
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i2 >>> 8);
            int i6 = i5 + 1;
            bArr[i5] = (byte) i2;
            for (int i7 = 0; i7 < length2; i7++) {
                char charAt2 = str.charAt(i7);
                if (charAt2 < 1 || charAt2 > 127) {
                    int i8 = i6 + 1;
                    if (charAt2 > 2047) {
                        bArr[i6] = (byte) (((charAt2 >> '\f') & 15) | 224);
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) (((charAt2 >> 6) & 63) | 128);
                        i = i9 + 1;
                        bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    } else {
                        bArr[i6] = (byte) (((charAt2 >> 6) & 31) | Constants.CHECKCAST);
                        i6 = i8 + 1;
                        bArr[i8] = (byte) ((charAt2 & '?') | 128);
                    }
                } else {
                    i = i6 + 1;
                    bArr[i6] = (byte) charAt2;
                }
                i6 = i;
            }
            this.length = i6;
            return this;
        }
        throw new IllegalArgumentException();
    }
}
