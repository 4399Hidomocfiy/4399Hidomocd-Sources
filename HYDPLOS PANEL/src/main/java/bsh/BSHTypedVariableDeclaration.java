package bsh;

class BSHTypedVariableDeclaration extends SimpleNode {
    public Modifiers modifiers;

    BSHTypedVariableDeclaration(int i) {
        super(i);
    }

    private BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        try {
            NameSpace pVar = callStack.top();
            BSHType typeNode = getTypeNode();
            Class type = typeNode.getType(callStack, interpreter);
            BSHVariableDeclarator[] declarators = getDeclarators();
            for (BSHVariableDeclarator bSHVariableDeclarator : declarators) {
                try {
                    pVar.setTypedVariable(bSHVariableDeclarator.name, type, bSHVariableDeclarator.eval(typeNode, callStack, interpreter), this.modifiers);
                } catch (UtilEvalError e) {
                    throw e.toEvalError(this, callStack);
                }
            }
        } catch (EvalError e2) {
            e2.reThrow("Typed variable declaration");
        }
        return Primitive.VOID;
    }

    /* access modifiers changed from: package-private */
    public Class evalType(CallStack callStack, Interpreter interpreter) {
        return getTypeNode().getType(callStack, interpreter);
    }

    /* access modifiers changed from: package-private */
    public BSHVariableDeclarator[] getDeclarators() {
        int jjtGetNumChildren = jjtGetNumChildren();
        BSHVariableDeclarator[] bSHVariableDeclaratorArr = new BSHVariableDeclarator[(jjtGetNumChildren - 1)];
        for (int i = 1; i < jjtGetNumChildren; i++) {
            bSHVariableDeclaratorArr[i - 1] = (BSHVariableDeclarator) jjtGetChild(i);
        }
        return bSHVariableDeclaratorArr;
    }

    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        return getTypeNode().getTypeDescriptor(callStack, interpreter, str);
    }
}
