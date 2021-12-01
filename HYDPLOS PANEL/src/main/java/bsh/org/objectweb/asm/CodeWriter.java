package bsh.org.objectweb.asm;

import android.support.p012v7.widget.helper.ItemTouchHelper;

public class CodeWriter implements CodeVisitor {
    static final boolean CHECK = false;
    private static final int[] SIZE;
    private static Edge pool;
    private int access;
    private Label blockStack;
    private int catchCount;
    private ByteVector catchTable;
    private ByteVector code = new ByteVector();
    private final boolean computeMaxs;
    private Label currentBlock;

    /* renamed from: cw */
    private ClassWriter f2131cw;
    private Item desc;
    private int exceptionCount;
    private int[] exceptions;
    private Edge head;
    private ByteVector lineNumber;
    private int lineNumberCount;
    private ByteVector localVar;
    private int localVarCount;
    private int maxLocals;
    private int maxStack;
    private int maxStackSize;
    private Item name;
    CodeWriter next;
    private boolean resize;
    private int stackSize;
    private Edge tail;

    static {
        int[] iArr = new int[202];
        for (int i = 0; i < 202; i++) {
            iArr[i] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i) - 'E';
        }
        SIZE = iArr;
    }

    protected CodeWriter(ClassWriter classWriter, boolean z) {
        if (classWriter.firstMethod == null) {
            classWriter.firstMethod = this;
        } else {
            classWriter.lastMethod.next = this;
        }
        classWriter.lastMethod = this;
        this.f2131cw = classWriter;
        this.computeMaxs = z;
        if (z) {
            Label label = new Label();
            this.currentBlock = label;
            label.pushed = true;
            this.blockStack = label;
        }
    }

    private void addSuccessor(int i, Label label) {
        Edge edge;
        synchronized (SIZE) {
            edge = pool;
            if (edge == null) {
                edge = new Edge();
            } else {
                pool = edge.poolNext;
            }
        }
        if (this.tail == null) {
            this.tail = edge;
        }
        edge.poolNext = this.head;
        this.head = edge;
        edge.stackSize = i;
        edge.successor = label;
        Label label2 = this.currentBlock;
        edge.next = label2.successors;
        label2.successors = edge;
    }

    private static int getArgumentsAndReturnSizes(String str) {
        int i;
        char charAt;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            i = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 == ')') {
                break;
            } else if (charAt2 == 'L') {
                while (true) {
                    i3 = i + 1;
                    if (str.charAt(i) == ';') {
                        break;
                    }
                    i = i3;
                }
                i4++;
            } else if (charAt2 == '[') {
                i3 = i;
                while (true) {
                    charAt = str.charAt(i3);
                    if (charAt != '[') {
                        break;
                    }
                    i3++;
                }
                if (charAt == 'D' || charAt == 'J') {
                    i4--;
                }
            } else {
                i4 = (charAt2 == 'D' || charAt2 == 'J') ? i4 + 2 : i4 + 1;
                i3 = i;
            }
        }
        char charAt3 = str.charAt(i);
        int i5 = i4 << 2;
        if (charAt3 == 'V') {
            i2 = 0;
        } else if (charAt3 == 'D' || charAt3 == 'J') {
            i2 = 2;
        }
        return i5 | i2;
    }

    static int getNewOffset(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = i2 - i;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i < iArr[i4] && iArr[i4] <= i2) {
                i3 += iArr2[i4];
            } else if (i2 < iArr[i4] && iArr[i4] <= i) {
                i3 -= iArr2[i4];
            }
        }
        return i3;
    }

    static int readInt(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    static short readShort(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    static int readUnsignedShort(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    static void writeShort(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    /* access modifiers changed from: protected */
    public byte[] getCode() {
        return this.code.data;
    }

    /* access modifiers changed from: protected */
    public int getCodeSize() {
        return this.code.length;
    }

    /* access modifiers changed from: package-private */
    public final int getSize() {
        int i;
        if (this.resize) {
            resizeInstructions(new int[0], new int[0], 0);
        }
        if (this.code.length > 0) {
            this.f2131cw.newUTF8("Code");
            i = this.code.length + 18 + (this.catchCount * 8) + 8;
            ByteVector byteVector = this.localVar;
            if (byteVector != null) {
                i += byteVector.length + 8;
            }
            ByteVector byteVector2 = this.lineNumber;
            if (byteVector2 != null) {
                i += byteVector2.length + 8;
            }
        } else {
            i = 8;
        }
        if (this.exceptionCount > 0) {
            this.f2131cw.newUTF8("Exceptions");
            i += (this.exceptionCount * 2) + 8;
        }
        if ((this.access & 65536) != 0) {
            this.f2131cw.newUTF8("Synthetic");
            i += 6;
        }
        if ((this.access & 131072) == 0) {
            return i;
        }
        this.f2131cw.newUTF8("Deprecated");
        return i + 6;
    }

    /* access modifiers changed from: protected */
    public void init(int i, String str, String str2, String[] strArr) {
        this.access = i;
        this.name = this.f2131cw.newUTF8(str);
        this.desc = this.f2131cw.newUTF8(str2);
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.exceptionCount = length;
            this.exceptions = new int[length];
            for (int i2 = 0; i2 < this.exceptionCount; i2++) {
                this.exceptions[i2] = this.f2131cw.newClass(strArr[i2]).index;
            }
        }
        if (this.computeMaxs) {
            int argumentsAndReturnSizes = getArgumentsAndReturnSizes(str2) >> 2;
            if ((i & 8) != 0) {
                argumentsAndReturnSizes--;
            }
            if (argumentsAndReturnSizes > this.maxLocals) {
                this.maxLocals = argumentsAndReturnSizes;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void put(ByteVector byteVector) {
        byteVector.put2(this.access).put2(this.name.index).put2(this.desc.index);
        int i = 1;
        int i2 = this.code.length > 0 ? 1 : 0;
        if (this.exceptionCount > 0) {
            i2++;
        }
        int i3 = this.access;
        if ((i3 & 65536) != 0) {
            i2++;
        }
        if ((i3 & 131072) != 0) {
            i2++;
        }
        byteVector.put2(i2);
        int i4 = this.code.length;
        if (i4 > 0) {
            int i5 = i4 + 12 + (this.catchCount * 8);
            ByteVector byteVector2 = this.localVar;
            if (byteVector2 != null) {
                i5 += byteVector2.length + 8;
            }
            ByteVector byteVector3 = this.lineNumber;
            if (byteVector3 != null) {
                i5 += byteVector3.length + 8;
            }
            byteVector.put2(this.f2131cw.newUTF8("Code").index).put4(i5);
            byteVector.put2(this.maxStack).put2(this.maxLocals);
            ByteVector put4 = byteVector.put4(this.code.length);
            ByteVector byteVector4 = this.code;
            put4.putByteArray(byteVector4.data, 0, byteVector4.length);
            byteVector.put2(this.catchCount);
            if (this.catchCount > 0) {
                ByteVector byteVector5 = this.catchTable;
                byteVector.putByteArray(byteVector5.data, 0, byteVector5.length);
            }
            if (this.localVar == null) {
                i = 0;
            }
            if (this.lineNumber != null) {
                i++;
            }
            byteVector.put2(i);
            if (this.localVar != null) {
                byteVector.put2(this.f2131cw.newUTF8("LocalVariableTable").index);
                byteVector.put4(this.localVar.length + 2).put2(this.localVarCount);
                ByteVector byteVector6 = this.localVar;
                byteVector.putByteArray(byteVector6.data, 0, byteVector6.length);
            }
            if (this.lineNumber != null) {
                byteVector.put2(this.f2131cw.newUTF8("LineNumberTable").index);
                byteVector.put4(this.lineNumber.length + 2).put2(this.lineNumberCount);
                ByteVector byteVector7 = this.lineNumber;
                byteVector.putByteArray(byteVector7.data, 0, byteVector7.length);
            }
        }
        if (this.exceptionCount > 0) {
            byteVector.put2(this.f2131cw.newUTF8("Exceptions").index).put4((this.exceptionCount * 2) + 2);
            byteVector.put2(this.exceptionCount);
            for (int i6 = 0; i6 < this.exceptionCount; i6++) {
                byteVector.put2(this.exceptions[i6]);
            }
        }
        if ((this.access & 65536) != 0) {
            byteVector.put2(this.f2131cw.newUTF8("Synthetic").index).put4(0);
        }
        if ((this.access & 131072) != 0) {
            byteVector.put2(this.f2131cw.newUTF8("Deprecated").index).put4(0);
        }
    }

    /* access modifiers changed from: protected */
    public int[] resizeInstructions(int[] iArr, int[] iArr2, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr = this.code.data;
        int[] iArr3 = new int[i];
        int[] iArr4 = new int[i];
        int i6 = 0;
        System.arraycopy(iArr, 0, iArr3, 0, i);
        System.arraycopy(iArr2, 0, iArr4, 0, i);
        boolean[] zArr = new boolean[this.code.length];
        int i7 = 3;
        do {
            if (i7 == 3) {
                i7 = 2;
            }
            int i8 = 0;
            while (true) {
                c = 132;
                if (i8 < bArr.length) {
                    int i9 = bArr[i8] & 255;
                    switch (ClassWriter.TYPE[i9]) {
                        case 0:
                        case 4:
                            i8++;
                            i3 = 0;
                            break;
                        case 1:
                        case 3:
                        case 10:
                            i8 += 2;
                            i3 = 0;
                            break;
                        case 2:
                        case 5:
                        case 6:
                        case 11:
                        case 12:
                            i8 += 3;
                            i3 = 0;
                            break;
                        case 7:
                        case 9:
                            i8 += 5;
                            i3 = 0;
                            break;
                        case 8:
                            if (i9 > 201) {
                                i9 = i9 < 218 ? i9 - 49 : i9 - 20;
                                i4 = readUnsignedShort(bArr, i8 + 1);
                            } else {
                                i4 = readShort(bArr, i8 + 1);
                            }
                            int newOffset = getNewOffset(iArr3, iArr4, i8, i4 + i8);
                            if ((newOffset < -32768 || newOffset > 32767) && !zArr[i8]) {
                                int i10 = (i9 == 167 || i9 == 168) ? 2 : 5;
                                zArr[i8] = true;
                                i3 = i10;
                            } else {
                                i3 = 0;
                            }
                            i8 += 3;
                            break;
                        case 13:
                            if (i7 == 1) {
                                i3 = -(getNewOffset(iArr3, iArr4, 0, i8) & 3);
                            } else if (!zArr[i8]) {
                                i3 = i8 & 3;
                                zArr[i8] = true;
                            } else {
                                i3 = 0;
                            }
                            int i11 = (i8 + 4) - (i8 & 3);
                            i8 = i11 + (((readInt(bArr, i11 + 8) - readInt(bArr, i11 + 4)) + 1) * 4) + 12;
                            break;
                        case 14:
                            if (i7 == 1) {
                                i5 = -(getNewOffset(iArr3, iArr4, 0, i8) & 3);
                            } else if (!zArr[i8]) {
                                i5 = i8 & 3;
                                zArr[i8] = true;
                            } else {
                                i5 = 0;
                            }
                            int i12 = (i8 + 4) - (i8 & 3);
                            i8 = i12 + (readInt(bArr, i12 + 4) * 8) + 8;
                            i3 = i5;
                            break;
                        case 16:
                            if ((bArr[i8 + 1] & 255) == 132) {
                                i8 += 6;
                                i3 = 0;
                                break;
                            }
                        case 15:
                        default:
                            i8 += 4;
                            i3 = 0;
                            break;
                    }
                    if (i3 != 0) {
                        int[] iArr5 = new int[(iArr3.length + 1)];
                        int[] iArr6 = new int[(iArr4.length + 1)];
                        System.arraycopy(iArr3, 0, iArr5, 0, iArr3.length);
                        System.arraycopy(iArr4, 0, iArr6, 0, iArr4.length);
                        iArr5[iArr3.length] = i8;
                        iArr6[iArr4.length] = i3;
                        iArr3 = iArr5;
                        iArr4 = iArr6;
                        i6 = 0;
                        if (i3 > 0) {
                            i7 = 3;
                        }
                    } else {
                        i6 = 0;
                    }
                } else if (i7 < 3) {
                    i7--;
                    continue;
                }
            }
        } while (i7 != 0);
        ByteVector byteVector = new ByteVector(this.code.length);
        int i13 = 0;
        while (i13 < this.code.length) {
            int length = iArr3.length - 1;
            while (length >= 0) {
                if (iArr3[length] == i13 && length < i) {
                    if (iArr2[length] > 0) {
                        byteVector.putByteArray(null, 0, iArr2[length]);
                    } else {
                        byteVector.length += iArr2[length];
                    }
                    iArr[length] = byteVector.length;
                }
                length--;
                i6 = 0;
                c = 132;
            }
            int i14 = bArr[i13] & 255;
            switch (ClassWriter.TYPE[i14]) {
                case 0:
                case 4:
                    byteVector.put1(i14);
                    i13++;
                    i6 = 0;
                    break;
                case 1:
                case 3:
                case 10:
                    byteVector.putByteArray(bArr, i13, 2);
                    i13 += 2;
                    i6 = 0;
                    break;
                case 2:
                case 5:
                case 6:
                case 11:
                case 12:
                    byteVector.putByteArray(bArr, i13, 3);
                    i13 += 3;
                    i6 = 0;
                    break;
                case 7:
                    byteVector.putByteArray(bArr, i13, 5);
                    i13 += 5;
                    i6 = 0;
                    break;
                case 8:
                    if (i14 > 201) {
                        i14 = i14 < 218 ? i14 - 49 : i14 - 20;
                        i2 = readUnsignedShort(bArr, i13 + 1);
                    } else {
                        i2 = readShort(bArr, i13 + 1);
                    }
                    int newOffset2 = getNewOffset(iArr3, iArr4, i13, i2 + i13);
                    if (newOffset2 < -32768 || newOffset2 > 32767) {
                        if (i14 == 167) {
                            byteVector.put1(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
                        } else if (i14 == 168) {
                            byteVector.put1(201);
                        } else {
                            byteVector.put1(i14 <= 166 ? ((i14 + 1) ^ 1) - 1 : i14 ^ 1);
                            byteVector.put2(8);
                            byteVector.put1(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
                            newOffset2 -= 3;
                        }
                        byteVector.put4(newOffset2);
                        i13 += 3;
                        i6 = 0;
                        break;
                    } else {
                        byteVector.put1(i14);
                        byteVector.put2(newOffset2);
                        i13 += 3;
                        i6 = 0;
                    }
                    break;
                case 9:
                    int newOffset3 = getNewOffset(iArr3, iArr4, i13, readInt(bArr, i13 + 1) + i13);
                    byteVector.put1(i14);
                    byteVector.put4(newOffset3);
                    i13 += 5;
                    break;
                case 13:
                    int i15 = (i13 + 4) - (i13 & 3);
                    byteVector.put1(Constants.TABLESWITCH);
                    while (byteVector.length % 4 != 0) {
                        byteVector.put1(i6);
                    }
                    int i16 = i15 + 4;
                    byteVector.put4(getNewOffset(iArr3, iArr4, i13, readInt(bArr, i15) + i13));
                    int readInt = readInt(bArr, i16);
                    int i17 = i16 + 4;
                    byteVector.put4(readInt);
                    int i18 = i17 + 4;
                    byteVector.put4(readInt(bArr, i18 - 4));
                    for (int readInt2 = (readInt(bArr, i17) - readInt) + 1; readInt2 > 0; readInt2--) {
                        i18 += 4;
                        byteVector.put4(getNewOffset(iArr3, iArr4, i13, readInt(bArr, i18) + i13));
                    }
                    i13 = i18;
                    break;
                case 14:
                    int i19 = (i13 + 4) - (i13 & 3);
                    byteVector.put1(Constants.LOOKUPSWITCH);
                    while (byteVector.length % 4 != 0) {
                        byteVector.put1(i6);
                        c = 132;
                    }
                    int i20 = i19 + 4;
                    byteVector.put4(getNewOffset(iArr3, iArr4, i13, readInt(bArr, i19) + i13));
                    int readInt3 = readInt(bArr, i20);
                    int i21 = i20 + 4;
                    byteVector.put4(readInt3);
                    while (readInt3 > 0) {
                        byteVector.put4(readInt(bArr, i21));
                        int i22 = i21 + 4;
                        i21 = i22 + 4;
                        byteVector.put4(getNewOffset(iArr3, iArr4, i13, readInt(bArr, i22) + i13));
                        readInt3--;
                        c = 132;
                    }
                    i13 = i21;
                    continue;
                case 15:
                default:
                    byteVector.putByteArray(bArr, i13, 4);
                    i13 += 4;
                    i6 = 0;
                    break;
                case 16:
                    if ((bArr[i13 + 1] & 255) == c) {
                        byteVector.putByteArray(bArr, i13, 6);
                        i13 += 6;
                        continue;
                    } else {
                        byteVector.putByteArray(bArr, i13, 4);
                        i13 += 4;
                    }
            }
            c = 132;
        }
        ByteVector byteVector2 = this.catchTable;
        if (byteVector2 != null) {
            byte[] bArr2 = byteVector2.data;
            for (int i23 = 0; i23 < this.catchTable.length; i23 += 8) {
                writeShort(bArr2, i23, getNewOffset(iArr3, iArr4, i6, readUnsignedShort(bArr2, i23)));
                int i24 = i23 + 2;
                writeShort(bArr2, i24, getNewOffset(iArr3, iArr4, i6, readUnsignedShort(bArr2, i24)));
                int i25 = i23 + 4;
                writeShort(bArr2, i25, getNewOffset(iArr3, iArr4, i6, readUnsignedShort(bArr2, i25)));
            }
        }
        ByteVector byteVector3 = this.localVar;
        if (byteVector3 != null) {
            byte[] bArr3 = byteVector3.data;
            for (int i26 = 0; i26 < this.localVar.length; i26 += 10) {
                int readUnsignedShort = readUnsignedShort(bArr3, i26);
                int newOffset4 = getNewOffset(iArr3, iArr4, i6, readUnsignedShort);
                writeShort(bArr3, i26, newOffset4);
                writeShort(bArr3, i26, getNewOffset(iArr3, iArr4, i6, readUnsignedShort + readUnsignedShort(bArr3, i26 + 2)) - newOffset4);
            }
        }
        ByteVector byteVector4 = this.lineNumber;
        if (byteVector4 != null) {
            byte[] bArr4 = byteVector4.data;
            for (int i27 = 0; i27 < this.lineNumber.length; i27 += 4) {
                writeShort(bArr4, i27, getNewOffset(iArr3, iArr4, i6, readUnsignedShort(bArr4, i27)));
            }
        }
        this.code = byteVector;
        return iArr;
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        if (this.computeMaxs) {
            int i4 = 0;
            char charAt = str3.charAt(0);
            int i5 = 1;
            int i6 = -2;
            switch (i) {
                case Constants.GETSTATIC /*{ENCODED_INT: 178}*/:
                    int i7 = this.stackSize;
                    if (charAt == 'D' || charAt == 'J') {
                        i5 = 2;
                    }
                    i2 = i7 + i5;
                    break;
                case Constants.PUTSTATIC /*{ENCODED_INT: 179}*/:
                    i3 = this.stackSize;
                    if (!(charAt == 'D' || charAt == 'J')) {
                        i6 = -1;
                    }
                    i2 = i6 + i3;
                    break;
                case Constants.GETFIELD /*{ENCODED_INT: 180}*/:
                    int i8 = this.stackSize;
                    if (charAt == 'D' || charAt == 'J') {
                        i4 = 1;
                    }
                    i2 = i8 + i4;
                    break;
                default:
                    i3 = this.stackSize;
                    if (charAt == 'D' || charAt == 'J') {
                        i6 = -3;
                    }
                    i2 = i6 + i3;
                    break;
            }
            if (i2 > this.maxStackSize) {
                this.maxStackSize = i2;
            }
            this.stackSize = i2;
        }
        this.code.put12(i, this.f2131cw.newField(str, str2, str3).index);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitIincInsn(int i, int i2) {
        int i3;
        if (this.computeMaxs && (i3 = i + 1) > this.maxLocals) {
            this.maxLocals = i3;
        }
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.code.put1(196).put12(132, i).put2(i2);
        } else {
            this.code.put1(132).put11(i, i2);
        }
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitInsn(int i) {
        Label label;
        if (this.computeMaxs) {
            int i2 = this.stackSize + SIZE[i];
            if (i2 > this.maxStackSize) {
                this.maxStackSize = i2;
            }
            this.stackSize = i2;
            if (((i >= 172 && i <= 177) || i == 191) && (label = this.currentBlock) != null) {
                label.maxStackSize = this.maxStackSize;
                this.currentBlock = null;
            }
        }
        this.code.put1(i);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitIntInsn(int i, int i2) {
        if (this.computeMaxs && i != 188) {
            int i3 = this.stackSize + 1;
            if (i3 > this.maxStackSize) {
                this.maxStackSize = i3;
            }
            this.stackSize = i3;
        }
        if (i == 17) {
            this.code.put12(i, i2);
        } else {
            this.code.put11(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r6.currentBlock != null) goto L_0x0033;
     */
    @Override // bsh.org.objectweb.asm.CodeVisitor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void visitJumpInsn(int r7, bsh.org.objectweb.asm.Label r8) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.org.objectweb.asm.CodeWriter.visitJumpInsn(int, bsh.org.objectweb.asm.Label):void");
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitLabel(Label label) {
        if (this.computeMaxs) {
            Label label2 = this.currentBlock;
            if (label2 != null) {
                label2.maxStackSize = this.maxStackSize;
                addSuccessor(this.stackSize, label);
            }
            this.currentBlock = label;
            this.stackSize = 0;
            this.maxStackSize = 0;
        }
        boolean z = this.resize;
        ByteVector byteVector = this.code;
        this.resize = label.resolve(this, byteVector.length, byteVector.data) | z;
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitLdcInsn(Object obj) {
        ByteVector byteVector;
        int i;
        Item newCst = this.f2131cw.newCst(obj);
        if (this.computeMaxs) {
            int i2 = newCst.type;
            int i3 = (i2 == 5 || i2 == 6) ? this.stackSize + 2 : this.stackSize + 1;
            if (i3 > this.maxStackSize) {
                this.maxStackSize = i3;
            }
            this.stackSize = i3;
        }
        short s = newCst.index;
        int i4 = newCst.type;
        if (i4 == 5 || i4 == 6) {
            byteVector = this.code;
            i = 20;
        } else if (s >= 256) {
            byteVector = this.code;
            i = 19;
        } else {
            this.code.put11(18, s);
            return;
        }
        byteVector.put12(i, s);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitLineNumber(int i, Label label) {
        if (this.lineNumber == null) {
            this.f2131cw.newUTF8("LineNumberTable");
            this.lineNumber = new ByteVector();
        }
        this.lineNumberCount++;
        this.lineNumber.put2(label.position);
        this.lineNumber.put2(i);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitLocalVariable(String str, String str2, Label label, Label label2, int i) {
        if (this.localVar == null) {
            this.f2131cw.newUTF8("LocalVariableTable");
            this.localVar = new ByteVector();
        }
        this.localVarCount++;
        this.localVar.put2(label.position);
        this.localVar.put2(label2.position - label.position);
        this.localVar.put2(this.f2131cw.newUTF8(str).index);
        this.localVar.put2(this.f2131cw.newUTF8(str2).index);
        this.localVar.put2(i);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        ByteVector byteVector;
        if (this.computeMaxs) {
            int i = this.stackSize - 1;
            this.stackSize = i;
            Label label2 = this.currentBlock;
            if (label2 != null) {
                label2.maxStackSize = this.maxStackSize;
                addSuccessor(i, label);
                for (Label label3 : labelArr) {
                    addSuccessor(this.stackSize, label3);
                }
                this.currentBlock = null;
            }
        }
        ByteVector byteVector2 = this.code;
        int i2 = byteVector2.length;
        byteVector2.put1(Constants.LOOKUPSWITCH);
        while (true) {
            byteVector = this.code;
            if (byteVector.length % 4 == 0) {
                break;
            }
            byteVector.put1(0);
        }
        label.put(this, byteVector, i2, true);
        this.code.put4(labelArr.length);
        for (int i3 = 0; i3 < labelArr.length; i3++) {
            this.code.put4(iArr[i3]);
            labelArr[i3].put(this, this.code, i2, true);
        }
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitMaxs(int i, int i2) {
        if (this.computeMaxs) {
            int i3 = 0;
            Label label = this.blockStack;
            while (label != null) {
                Label label2 = label.next;
                int i4 = label.beginStackSize;
                int i5 = label.maxStackSize + i4;
                if (i5 <= i3) {
                    i5 = i3;
                }
                label = label2;
                for (Edge edge = label.successors; edge != null; edge = edge.next) {
                    Label label3 = edge.successor;
                    if (!label3.pushed) {
                        label3.beginStackSize = edge.stackSize + i4;
                        label3.pushed = true;
                        label3.next = label;
                        label = label3;
                    }
                }
                i3 = i5;
            }
            this.maxStack = i3;
            synchronized (SIZE) {
                Edge edge2 = this.tail;
                if (edge2 != null) {
                    edge2.poolNext = pool;
                    pool = this.head;
                }
            }
            return;
        }
        this.maxStack = i;
        this.maxLocals = i2;
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        ClassWriter classWriter = this.f2131cw;
        Item newItfMethod = i == 185 ? classWriter.newItfMethod(str, str2, str3) : classWriter.newMethod(str, str2, str3);
        int i2 = newItfMethod.intVal;
        if (this.computeMaxs) {
            if (i2 == 0) {
                i2 = getArgumentsAndReturnSizes(str3);
                newItfMethod.intVal = i2;
            }
            int i3 = i == 184 ? (this.stackSize - (i2 >> 2)) + (i2 & 3) + 1 : (this.stackSize - (i2 >> 2)) + (i2 & 3);
            if (i3 > this.maxStackSize) {
                this.maxStackSize = i3;
            }
            this.stackSize = i3;
        }
        if (i == 185) {
            if (!this.computeMaxs && i2 == 0) {
                i2 = getArgumentsAndReturnSizes(str3);
                newItfMethod.intVal = i2;
            }
            this.code.put12(Constants.INVOKEINTERFACE, newItfMethod.index).put11(i2 >> 2, 0);
            return;
        }
        this.code.put12(i, newItfMethod.index);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        if (this.computeMaxs) {
            this.stackSize += 1 - i;
        }
        this.code.put12(Constants.MULTIANEWARRAY, this.f2131cw.newClass(str).index).put1(i);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label[] labelArr) {
        ByteVector byteVector;
        if (this.computeMaxs) {
            int i3 = this.stackSize - 1;
            this.stackSize = i3;
            Label label2 = this.currentBlock;
            if (label2 != null) {
                label2.maxStackSize = this.maxStackSize;
                addSuccessor(i3, label);
                for (Label label3 : labelArr) {
                    addSuccessor(this.stackSize, label3);
                }
                this.currentBlock = null;
            }
        }
        ByteVector byteVector2 = this.code;
        int i4 = byteVector2.length;
        byteVector2.put1(Constants.TABLESWITCH);
        while (true) {
            byteVector = this.code;
            if (byteVector.length % 4 == 0) {
                break;
            }
            byteVector.put1(0);
        }
        label.put(this, byteVector, i4, true);
        this.code.put4(i).put4(i2);
        for (Label label4 : labelArr) {
            label4.put(this, this.code, i4, true);
        }
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        if (this.computeMaxs && !label3.pushed) {
            label3.beginStackSize = 1;
            label3.pushed = true;
            label3.next = this.blockStack;
            this.blockStack = label3;
        }
        this.catchCount++;
        if (this.catchTable == null) {
            this.catchTable = new ByteVector();
        }
        this.catchTable.put2(label.position);
        this.catchTable.put2(label2.position);
        this.catchTable.put2(label3.position);
        this.catchTable.put2(str != null ? this.f2131cw.newClass(str).index : 0);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitTypeInsn(int i, String str) {
        if (this.computeMaxs && i == 187) {
            int i2 = this.stackSize + 1;
            if (i2 > this.maxStackSize) {
                this.maxStackSize = i2;
            }
            this.stackSize = i2;
        }
        this.code.put12(i, this.f2131cw.newClass(str).index);
    }

    @Override // bsh.org.objectweb.asm.CodeVisitor
    public void visitVarInsn(int i, int i2) {
        if (this.computeMaxs) {
            if (i == 169) {
                Label label = this.currentBlock;
                if (label != null) {
                    label.maxStackSize = this.maxStackSize;
                    this.currentBlock = null;
                }
            } else {
                int i3 = this.stackSize + SIZE[i];
                if (i3 > this.maxStackSize) {
                    this.maxStackSize = i3;
                }
                this.stackSize = i3;
            }
            int i4 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i4 > this.maxLocals) {
                this.maxLocals = i4;
            }
        }
        if (i2 < 4 && i != 169) {
            this.code.put1((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            this.code.put1(196).put12(i, i2);
        } else {
            this.code.put11(i, i2);
        }
    }
}
