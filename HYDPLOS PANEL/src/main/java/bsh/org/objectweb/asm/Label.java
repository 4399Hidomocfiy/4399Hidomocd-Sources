package bsh.org.objectweb.asm;

public class Label {
    int beginStackSize;
    int maxStackSize;
    Label next;
    CodeWriter owner;
    int position;
    boolean pushed;
    private int referenceCount;
    boolean resolved;
    private int[] srcAndRefPositions;
    Edge successors;

    private void addReference(int i, int i2) {
        if (this.srcAndRefPositions == null) {
            this.srcAndRefPositions = new int[6];
        }
        int i3 = this.referenceCount;
        int[] iArr = this.srcAndRefPositions;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(iArr.length + 6)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.srcAndRefPositions = iArr2;
        }
        int[] iArr3 = this.srcAndRefPositions;
        int i4 = this.referenceCount;
        int i5 = i4 + 1;
        this.referenceCount = i5;
        iArr3[i4] = i;
        this.referenceCount = i5 + 1;
        iArr3[i5] = i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4 != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void put(bsh.org.objectweb.asm.CodeWriter r1, bsh.org.objectweb.asm.ByteVector r2, int r3, boolean r4) {
        /*
            r0 = this;
            boolean r1 = r0.resolved
            if (r1 == 0) goto L_0x000a
            int r1 = r0.position
            int r1 = r1 - r3
            if (r4 == 0) goto L_0x001d
            goto L_0x0014
        L_0x000a:
            r1 = -1
            if (r4 == 0) goto L_0x0018
            int r3 = -1 - r3
            int r4 = r2.length
            r0.addReference(r3, r4)
        L_0x0014:
            r2.put4(r1)
            goto L_0x0020
        L_0x0018:
            int r4 = r2.length
            r0.addReference(r3, r4)
        L_0x001d:
            r2.put2(r1)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.org.objectweb.asm.Label.put(bsh.org.objectweb.asm.CodeWriter, bsh.org.objectweb.asm.ByteVector, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public boolean resolve(CodeWriter codeWriter, int i, byte[] bArr) {
        this.resolved = true;
        this.position = i;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.referenceCount) {
            int[] iArr = this.srcAndRefPositions;
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            int i5 = i3 + 1;
            int i6 = iArr[i3];
            if (i4 >= 0) {
                int i7 = i - i4;
                if (i7 < -32768 || i7 > 32767) {
                    int i8 = i6 - 1;
                    int i9 = bArr[i8] & 255;
                    if (i9 <= 168) {
                        bArr[i8] = (byte) (i9 + 49);
                    } else {
                        bArr[i8] = (byte) (i9 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i7 >>> 8);
                bArr[i6 + 1] = (byte) i7;
            } else {
                int i10 = i4 + i + 1;
                int i11 = i6 + 1;
                bArr[i6] = (byte) (i10 >>> 24);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 >>> 16);
                bArr[i12] = (byte) (i10 >>> 8);
                bArr[i12 + 1] = (byte) i10;
            }
            i2 = i5;
        }
        return z;
    }
}
