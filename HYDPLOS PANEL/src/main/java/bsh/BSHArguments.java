package bsh;

class BSHArguments extends SimpleNode {
    BSHArguments(int i) {
        super(i);
    }

    public Object[] getArguments(CallStack callStack, Interpreter interpreter) {
        int jjtGetNumChildren = jjtGetNumChildren();
        Object[] objArr = new Object[jjtGetNumChildren];
        for (int i = 0; i < jjtGetNumChildren; i++) {
            objArr[i] = ((SimpleNode) jjtGetChild(i)).eval(callStack, interpreter);
            if (objArr[i] == Primitive.VOID) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Undefined argument: ");
                stringBuffer.append(((SimpleNode) jjtGetChild(i)).getText());
                throw new EvalError(stringBuffer.toString(), this, callStack);
            }
        }
        return objArr;
    }
}
