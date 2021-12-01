package bsh;

class BSHLiteral extends SimpleNode {
    public Object value;

    BSHLiteral(int i) {
        super(i);
    }

    private char getEscapeChar(char c) {
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c != 't') {
            return c;
        }
        return '\t';
    }

    public void charSetup(String str) {
        char charAt = str.charAt(0);
        if (charAt == '\\') {
            char charAt2 = str.charAt(1);
            charAt = Character.isDigit(charAt2) ? (char) Integer.parseInt(str.substring(1), 8) : getEscapeChar(charAt2);
        }
        this.value = new Primitive(new Character(charAt).charValue());
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Null in bsh literal: ");
        stringBuffer.append(this.value);
        throw new InterpreterError(stringBuffer.toString());
    }

    /* access modifiers changed from: package-private */
    public void stringSetup(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i++;
                char charAt2 = str.charAt(i);
                if (Character.isDigit(charAt2)) {
                    int i2 = i;
                    while (i2 < i + 2) {
                        int i3 = i2 + 1;
                        if (!Character.isDigit(str.charAt(i3))) {
                            break;
                        }
                        i2 = i3;
                    }
                    charAt = (char) Integer.parseInt(str.substring(i, i2 + 1), 8);
                    i = i2;
                } else {
                    charAt = getEscapeChar(charAt2);
                }
            }
            stringBuffer.append(charAt);
            i++;
        }
        this.value = stringBuffer.toString().intern();
    }
}
