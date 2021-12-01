package bsh;

public class ParseException extends EvalError {
    public Token currentToken;
    protected String eol;
    public int[][] expectedTokenSequences;
    String sourceFile;
    protected boolean specialConstructor;
    public String[] tokenImage;

    public ParseException() {
        this("");
        this.specialConstructor = false;
    }

    public ParseException(Token token, int[][] iArr, String[] strArr) {
        this();
        this.specialConstructor = true;
        this.currentToken = token;
        this.expectedTokenSequences = iArr;
        this.tokenImage = strArr;
    }

    public ParseException(String str) {
        super(str, null, null);
        this.sourceFile = "<unknown>";
        this.eol = System.getProperty("line.separator", "\n");
        this.specialConstructor = false;
    }

    /* access modifiers changed from: protected */
    public String add_escapes(String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt == '\"') {
                    str2 = "\\\"";
                } else if (charAt == '\'') {
                    str2 = "\\'";
                } else if (charAt == '\\') {
                    str2 = "\\\\";
                } else if (charAt == '\f') {
                    str2 = "\\f";
                } else if (charAt != '\r') {
                    switch (charAt) {
                        case '\b':
                            str2 = "\\b";
                            break;
                        case '\t':
                            str2 = "\\t";
                            break;
                        case '\n':
                            str2 = "\\n";
                            break;
                        default:
                            char charAt2 = str.charAt(i);
                            if (charAt2 < ' ' || charAt2 > '~') {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("0000");
                                stringBuffer2.append(Integer.toString(charAt2, 16));
                                String stringBuffer3 = stringBuffer2.toString();
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("\\u");
                                stringBuffer4.append(stringBuffer3.substring(stringBuffer3.length() - 4, stringBuffer3.length()));
                                str2 = stringBuffer4.toString();
                                break;
                            } else {
                                stringBuffer.append(charAt2);
                                break;
                            }
                            break;
                    }
                } else {
                    str2 = "\\r";
                }
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    @Override // bsh.EvalError
    public int getErrorLineNumber() {
        return this.currentToken.next.beginLine;
    }

    @Override // bsh.EvalError
    public String getErrorSourceFile() {
        return this.sourceFile;
    }

    @Override // bsh.EvalError
    public String getErrorText() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[][] iArr = this.expectedTokenSequences;
            if (i >= iArr.length) {
                break;
            }
            if (i2 < iArr[i].length) {
                i2 = iArr[i].length;
            }
            i++;
        }
        Token token = this.currentToken.next;
        String str = "";
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(" ");
                str = stringBuffer.toString();
            }
            if (token.kind == 0) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str);
                stringBuffer2.append(this.tokenImage[0]);
                return stringBuffer2.toString();
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(str);
            stringBuffer3.append(add_escapes(token.image));
            str = stringBuffer3.toString();
            token = token.next;
        }
        return str;
    }

    @Override // bsh.EvalError
    public String getMessage() {
        return getMessage(false);
    }

    public String getMessage(boolean z) {
        StringBuffer stringBuffer;
        String str;
        int[][] iArr;
        if (!this.specialConstructor) {
            return super.getMessage();
        }
        String str2 = "";
        int i = 0;
        int i2 = 0;
        while (true) {
            int[][] iArr2 = this.expectedTokenSequences;
            if (i >= iArr2.length) {
                break;
            }
            if (i2 < iArr2[i].length) {
                i2 = iArr2[i].length;
            }
            int i3 = 0;
            while (true) {
                iArr = this.expectedTokenSequences;
                if (i3 >= iArr[i].length) {
                    break;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str2);
                stringBuffer2.append(this.tokenImage[this.expectedTokenSequences[i][i3]]);
                stringBuffer2.append(" ");
                str2 = stringBuffer2.toString();
                i3++;
            }
            if (iArr[i][iArr[i].length - 1] != 0) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(str2);
                stringBuffer3.append("...");
                str2 = stringBuffer3.toString();
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(str2);
            stringBuffer4.append(this.eol);
            stringBuffer4.append("    ");
            str2 = stringBuffer4.toString();
            i++;
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("In file: ");
        stringBuffer5.append(this.sourceFile);
        stringBuffer5.append(" Encountered \"");
        String stringBuffer6 = stringBuffer5.toString();
        Token token = this.currentToken.next;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (i4 != 0) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(stringBuffer6);
                stringBuffer7.append(" ");
                stringBuffer6 = stringBuffer7.toString();
            }
            if (token.kind == 0) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(stringBuffer6);
                stringBuffer8.append(this.tokenImage[0]);
                stringBuffer6 = stringBuffer8.toString();
                break;
            }
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(stringBuffer6);
            stringBuffer9.append(add_escapes(token.image));
            stringBuffer6 = stringBuffer9.toString();
            token = token.next;
            i4++;
        }
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append(stringBuffer6);
        stringBuffer10.append("\" at line ");
        stringBuffer10.append(this.currentToken.next.beginLine);
        stringBuffer10.append(", column ");
        stringBuffer10.append(this.currentToken.next.beginColumn);
        stringBuffer10.append(".");
        stringBuffer10.append(this.eol);
        String stringBuffer11 = stringBuffer10.toString();
        if (!z) {
            return stringBuffer11;
        }
        if (this.expectedTokenSequences.length == 1) {
            stringBuffer = new StringBuffer();
            stringBuffer.append(stringBuffer11);
            str = "Was expecting:";
        } else {
            stringBuffer = new StringBuffer();
            stringBuffer.append(stringBuffer11);
            str = "Was expecting one of:";
        }
        stringBuffer.append(str);
        stringBuffer.append(this.eol);
        stringBuffer.append("    ");
        String stringBuffer12 = stringBuffer.toString();
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append(stringBuffer12);
        stringBuffer13.append(str2);
        return stringBuffer13.toString();
    }

    public void setErrorSourceFile(String str) {
        this.sourceFile = str;
    }

    @Override // bsh.EvalError
    public String toString() {
        return getMessage();
    }
}
