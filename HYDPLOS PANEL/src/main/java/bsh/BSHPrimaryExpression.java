package bsh;

class BSHPrimaryExpression extends SimpleNode {
    BSHPrimaryExpression(int i) {
        super(i);
    }

    private Object eval(boolean z, CallStack callStack, Interpreter interpreter) {
        Object jjtGetChild = jjtGetChild(0);
        int jjtGetNumChildren = jjtGetNumChildren();
        for (int i = 1; i < jjtGetNumChildren; i++) {
            jjtGetChild = ((BSHPrimarySuffix) jjtGetChild(i)).doSuffix(jjtGetChild, z, callStack, interpreter);
        }
        if (jjtGetChild instanceof SimpleNode) {
            if (jjtGetChild instanceof BSHAmbiguousName) {
                BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild;
                jjtGetChild = z ? bSHAmbiguousName.toLHS(callStack, interpreter) : bSHAmbiguousName.toObject(callStack, interpreter);
            } else if (!z) {
                jjtGetChild = ((SimpleNode) jjtGetChild).eval(callStack, interpreter);
            } else {
                throw new EvalError("Can't assign to prefix.", this, callStack);
            }
        }
        if (!(jjtGetChild instanceof LHS) || z) {
            return jjtGetChild;
        }
        try {
            return ((LHS) jjtGetChild).getValue();
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return eval(false, callStack, interpreter);
    }

    public LHS toLHS(CallStack callStack, Interpreter interpreter) {
        Object eval = eval(true, callStack, interpreter);
        if (eval instanceof LHS) {
            return (LHS) eval;
        }
        throw new EvalError("Can't assign to:", this, callStack);
    }
}
