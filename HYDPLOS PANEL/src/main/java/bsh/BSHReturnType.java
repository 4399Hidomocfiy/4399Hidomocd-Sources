package bsh;

class BSHReturnType extends SimpleNode {
    public boolean isVoid;

    BSHReturnType(int i) {
        super(i);
    }

    public Class evalReturnType(CallStack callStack, Interpreter interpreter) {
        return this.isVoid ? Void.TYPE : getTypeNode().getType(callStack, interpreter);
    }

    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        return this.isVoid ? "V" : getTypeNode().getTypeDescriptor(callStack, interpreter, str);
    }

    /* access modifiers changed from: package-private */
    public BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }
}
