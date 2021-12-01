package bsh;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class JavaCharStream {
    public static final boolean staticFlag = false;
    int available;
    protected int[] bufcolumn;
    protected char[] buffer;
    protected int[] bufline;
    public int bufpos;
    int bufsize;
    protected int column;
    protected int inBuf;
    protected Reader inputStream;
    protected int line;
    protected int maxNextCharInd;
    protected char[] nextCharBuf;
    protected int nextCharInd;
    protected boolean prevCharIsCR;
    protected boolean prevCharIsLF;
    int tokenBegin;

    public JavaCharStream(InputStream inputStream2) {
        this(inputStream2, 1, 1, 4096);
    }

    public JavaCharStream(InputStream inputStream2, int i, int i2) {
        this(inputStream2, i, i2, 4096);
    }

    public JavaCharStream(InputStream inputStream2, int i, int i2, int i3) {
        this(new InputStreamReader(inputStream2), i, i2, 4096);
    }

    public JavaCharStream(Reader reader) {
        this(reader, 1, 1, 4096);
    }

    public JavaCharStream(Reader reader, int i, int i2) {
        this(reader, i, i2, 4096);
    }

    public JavaCharStream(Reader reader, int i, int i2, int i3) {
        this.bufpos = -1;
        this.column = 0;
        this.line = 1;
        this.prevCharIsCR = false;
        this.prevCharIsLF = false;
        this.maxNextCharInd = 0;
        this.nextCharInd = -1;
        this.inBuf = 0;
        this.inputStream = reader;
        this.line = i;
        this.column = i2 - 1;
        this.bufsize = i3;
        this.available = i3;
        this.buffer = new char[i3];
        this.bufline = new int[i3];
        this.bufcolumn = new int[i3];
        this.nextCharBuf = new char[4096];
    }

    static final int hexval(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                throw new IOException();
                        }
                }
        }
    }

    /* access modifiers changed from: protected */
    public void AdjustBuffSize() {
        int i = this.available;
        int i2 = this.bufsize;
        if (i == i2) {
            int i3 = this.tokenBegin;
            if (i3 > 2048) {
                this.bufpos = 0;
                this.available = i3;
                return;
            }
            ExpandBuff(false);
            return;
        }
        int i4 = this.tokenBegin;
        if (i > i4) {
            this.available = i2;
        } else if (i4 - i < 2048) {
            ExpandBuff(true);
        } else {
            this.available = i4;
        }
    }

    public char BeginToken() {
        int i = this.inBuf;
        if (i > 0) {
            this.inBuf = i - 1;
            int i2 = this.bufpos + 1;
            this.bufpos = i2;
            if (i2 == this.bufsize) {
                this.bufpos = 0;
            }
            int i3 = this.bufpos;
            this.tokenBegin = i3;
            return this.buffer[i3];
        }
        this.tokenBegin = 0;
        this.bufpos = -1;
        return readChar();
    }

    public void Done() {
        this.nextCharBuf = null;
        this.buffer = null;
        this.bufline = null;
        this.bufcolumn = null;
    }

    /* access modifiers changed from: protected */
    public void ExpandBuff(boolean z) {
        int i = this.bufsize;
        char[] cArr = new char[(i + 2048)];
        int[] iArr = new int[(i + 2048)];
        int[] iArr2 = new int[(i + 2048)];
        if (z) {
            try {
                char[] cArr2 = this.buffer;
                int i2 = this.tokenBegin;
                System.arraycopy(cArr2, i2, cArr, 0, i - i2);
                System.arraycopy(this.buffer, 0, cArr, this.bufsize - this.tokenBegin, this.bufpos);
                this.buffer = cArr;
                int[] iArr3 = this.bufline;
                int i3 = this.tokenBegin;
                System.arraycopy(iArr3, i3, iArr, 0, this.bufsize - i3);
                System.arraycopy(this.bufline, 0, iArr, this.bufsize - this.tokenBegin, this.bufpos);
                this.bufline = iArr;
                int[] iArr4 = this.bufcolumn;
                int i4 = this.tokenBegin;
                System.arraycopy(iArr4, i4, iArr2, 0, this.bufsize - i4);
                System.arraycopy(this.bufcolumn, 0, iArr2, this.bufsize - this.tokenBegin, this.bufpos);
                this.bufcolumn = iArr2;
                this.bufpos += this.bufsize - this.tokenBegin;
            } catch (Throwable th) {
                throw new Error(th.getMessage());
            }
        } else {
            char[] cArr3 = this.buffer;
            int i5 = this.tokenBegin;
            System.arraycopy(cArr3, i5, cArr, 0, i - i5);
            this.buffer = cArr;
            int[] iArr5 = this.bufline;
            int i6 = this.tokenBegin;
            System.arraycopy(iArr5, i6, iArr, 0, this.bufsize - i6);
            this.bufline = iArr;
            int[] iArr6 = this.bufcolumn;
            int i7 = this.tokenBegin;
            System.arraycopy(iArr6, i7, iArr2, 0, this.bufsize - i7);
            this.bufcolumn = iArr2;
            this.bufpos -= this.tokenBegin;
        }
        int i8 = this.bufsize + 2048;
        this.bufsize = i8;
        this.available = i8;
        this.tokenBegin = 0;
    }

    /* access modifiers changed from: protected */
    public void FillBuff() {
        if (this.maxNextCharInd == 4096) {
            this.nextCharInd = 0;
            this.maxNextCharInd = 0;
        }
        try {
            Reader reader = this.inputStream;
            char[] cArr = this.nextCharBuf;
            int i = this.maxNextCharInd;
            int read = reader.read(cArr, i, 4096 - i);
            if (read != -1) {
                this.maxNextCharInd += read;
            } else {
                this.inputStream.close();
                throw new IOException();
            }
        } catch (IOException e) {
            int i2 = this.bufpos;
            if (i2 != 0) {
                this.bufpos = i2 - 1;
                backup(0);
            } else {
                this.bufline[i2] = this.line;
                this.bufcolumn[i2] = this.column;
            }
            throw e;
        }
    }

    public String GetImage() {
        if (this.bufpos >= this.tokenBegin) {
            char[] cArr = this.buffer;
            int i = this.tokenBegin;
            return new String(cArr, i, (this.bufpos - i) + 1);
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArr2 = this.buffer;
        int i2 = this.tokenBegin;
        stringBuffer.append(new String(cArr2, i2, this.bufsize - i2));
        stringBuffer.append(new String(this.buffer, 0, this.bufpos + 1));
        return stringBuffer.toString();
    }

    public char[] GetSuffix(int i) {
        char[] cArr = new char[i];
        int i2 = this.bufpos;
        if (i2 + 1 >= i) {
            System.arraycopy(this.buffer, (i2 - i) + 1, cArr, 0, i);
        } else {
            System.arraycopy(this.buffer, this.bufsize - ((i - i2) - 1), cArr, 0, (i - i2) - 1);
            char[] cArr2 = this.buffer;
            int i3 = this.bufpos;
            System.arraycopy(cArr2, 0, cArr, (i - i3) - 1, i3 + 1);
        }
        return cArr;
    }

    public void ReInit(InputStream inputStream2) {
        ReInit(inputStream2, 1, 1, 4096);
    }

    public void ReInit(InputStream inputStream2, int i, int i2) {
        ReInit(inputStream2, i, i2, 4096);
    }

    public void ReInit(InputStream inputStream2, int i, int i2, int i3) {
        ReInit(new InputStreamReader(inputStream2), i, i2, 4096);
    }

    public void ReInit(Reader reader) {
        ReInit(reader, 1, 1, 4096);
    }

    public void ReInit(Reader reader, int i, int i2) {
        ReInit(reader, i, i2, 4096);
    }

    public void ReInit(Reader reader, int i, int i2, int i3) {
        this.inputStream = reader;
        this.line = i;
        this.column = i2 - 1;
        char[] cArr = this.buffer;
        if (cArr == null || i3 != cArr.length) {
            this.bufsize = i3;
            this.available = i3;
            this.buffer = new char[i3];
            this.bufline = new int[i3];
            this.bufcolumn = new int[i3];
            this.nextCharBuf = new char[4096];
        }
        this.prevCharIsCR = false;
        this.prevCharIsLF = false;
        this.maxNextCharInd = 0;
        this.inBuf = 0;
        this.tokenBegin = 0;
        this.bufpos = -1;
        this.nextCharInd = -1;
    }

    /* access modifiers changed from: protected */
    public char ReadByte() {
        int i = this.nextCharInd + 1;
        this.nextCharInd = i;
        if (i >= this.maxNextCharInd) {
            FillBuff();
        }
        return this.nextCharBuf[this.nextCharInd];
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void UpdateLineColumn(char r5) {
        /*
            r4 = this;
            int r0 = r4.column
            r1 = 1
            int r0 = r0 + r1
            r4.column = r0
            boolean r0 = r4.prevCharIsLF
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L_0x0017
            r4.prevCharIsLF = r3
        L_0x000f:
            int r0 = r4.line
            r4.column = r1
            int r0 = r0 + r1
            r4.line = r0
            goto L_0x0021
        L_0x0017:
            boolean r0 = r4.prevCharIsCR
            if (r0 == 0) goto L_0x0021
            r4.prevCharIsCR = r3
            if (r5 != r2) goto L_0x000f
            r4.prevCharIsLF = r1
        L_0x0021:
            r0 = 9
            if (r5 == r0) goto L_0x0032
            if (r5 == r2) goto L_0x002f
            r0 = 13
            if (r5 == r0) goto L_0x002c
            goto L_0x003e
        L_0x002c:
            r4.prevCharIsCR = r1
            goto L_0x003e
        L_0x002f:
            r4.prevCharIsLF = r1
            goto L_0x003e
        L_0x0032:
            int r5 = r4.column
            int r5 = r5 - r1
            r4.column = r5
            r0 = r5 & 7
            int r0 = 8 - r0
            int r5 = r5 + r0
            r4.column = r5
        L_0x003e:
            int[] r5 = r4.bufline
            int r0 = r4.bufpos
            int r1 = r4.line
            r5[r0] = r1
            int[] r5 = r4.bufcolumn
            int r1 = r4.column
            r5[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.JavaCharStream.UpdateLineColumn(char):void");
    }

    public void adjustBeginLineColumn(int i, int i2) {
        int i3;
        int i4 = this.tokenBegin;
        int i5 = this.bufpos;
        if (i5 >= i4) {
            i3 = (i5 - i4) + this.inBuf + 1;
        } else {
            i3 = this.inBuf + (this.bufsize - i4) + i5 + 1;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 >= i3) {
                break;
            }
            int[] iArr = this.bufline;
            int i9 = this.bufsize;
            int i10 = i4 % i9;
            i4++;
            int i11 = i4 % i9;
            if (iArr[i10] != iArr[i11]) {
                i8 = i10;
                break;
            }
            iArr[i10] = i;
            int[] iArr2 = this.bufcolumn;
            iArr2[i10] = i7 + i2;
            i6++;
            i7 = (iArr2[i11] + i7) - iArr2[i10];
            i8 = i10;
        }
        if (i6 < i3) {
            int i12 = i + 1;
            this.bufline[i8] = i;
            this.bufcolumn[i8] = i2 + i7;
            while (true) {
                int i13 = i6 + 1;
                if (i6 >= i3) {
                    break;
                }
                int[] iArr3 = this.bufline;
                int i14 = this.bufsize;
                i8 = i4 % i14;
                i4++;
                if (iArr3[i8] != iArr3[i4 % i14]) {
                    iArr3[i8] = i12;
                    i12++;
                } else {
                    iArr3[i8] = i12;
                }
                i6 = i13;
            }
        }
        this.line = this.bufline[i8];
        this.column = this.bufcolumn[i8];
    }

    public void backup(int i) {
        this.inBuf += i;
        int i2 = this.bufpos - i;
        this.bufpos = i2;
        if (i2 < 0) {
            this.bufpos = i2 + this.bufsize;
        }
    }

    public int getBeginColumn() {
        return this.bufcolumn[this.tokenBegin];
    }

    public int getBeginLine() {
        return this.bufline[this.tokenBegin];
    }

    public int getColumn() {
        return this.bufcolumn[this.bufpos];
    }

    public int getEndColumn() {
        return this.bufcolumn[this.bufpos];
    }

    public int getEndLine() {
        return this.bufline[this.bufpos];
    }

    public int getLine() {
        return this.bufline[this.bufpos];
    }

    public char readChar() {
        char ReadByte;
        char ReadByte2;
        int i = this.inBuf;
        if (i > 0) {
            this.inBuf = i - 1;
            int i2 = this.bufpos + 1;
            this.bufpos = i2;
            if (i2 == this.bufsize) {
                this.bufpos = 0;
            }
            return this.buffer[this.bufpos];
        }
        int i3 = this.bufpos + 1;
        this.bufpos = i3;
        if (i3 == this.available) {
            AdjustBuffSize();
        }
        char[] cArr = this.buffer;
        int i4 = this.bufpos;
        char ReadByte3 = ReadByte();
        cArr[i4] = ReadByte3;
        UpdateLineColumn(ReadByte3);
        if (ReadByte3 != '\\') {
            return ReadByte3;
        }
        int i5 = 1;
        while (true) {
            int i6 = this.bufpos + 1;
            this.bufpos = i6;
            if (i6 == this.available) {
                AdjustBuffSize();
            }
            try {
                char[] cArr2 = this.buffer;
                int i7 = this.bufpos;
                ReadByte = ReadByte();
                cArr2[i7] = ReadByte;
                if (ReadByte != '\\') {
                    break;
                }
                UpdateLineColumn(ReadByte);
                i5++;
            } catch (IOException unused) {
                if (i5 > 1) {
                    backup(i5);
                }
                return '\\';
            }
        }
        UpdateLineColumn(ReadByte);
        if (ReadByte == 'u' && (i5 & 1) == 1) {
            int i8 = this.bufpos - 1;
            this.bufpos = i8;
            if (i8 < 0) {
                this.bufpos = this.bufsize - 1;
            }
            while (true) {
                try {
                    ReadByte2 = ReadByte();
                    if (ReadByte2 != 'u') {
                        break;
                    }
                    this.column++;
                } catch (IOException unused2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Invalid escape character at line ");
                    stringBuffer.append(this.line);
                    stringBuffer.append(" column ");
                    stringBuffer.append(this.column);
                    stringBuffer.append(".");
                    throw new Error(stringBuffer.toString());
                }
            }
            char[] cArr3 = this.buffer;
            int i9 = this.bufpos;
            char hexval = (char) ((hexval(ReadByte2) << 12) | (hexval(ReadByte()) << 8) | (hexval(ReadByte()) << 4) | hexval(ReadByte()));
            cArr3[i9] = hexval;
            this.column += 4;
            if (i5 == 1) {
                return hexval;
            }
            backup(i5 - 1);
            return '\\';
        }
        backup(i5);
        return '\\';
    }
}
