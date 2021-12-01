package bsh;

/* access modifiers changed from: package-private */
public class BSHMethodDeclaration extends SimpleNode {
    BSHBlock blockNode;
    int firstThrowsClause;
    public Modifiers modifiers;
    public String name;
    int numThrows = 0;
    BSHFormalParameters paramsNode;
    Class returnType;
    BSHReturnType returnTypeNode;

    BSHMethodDeclaration(int i) {
        super(i);
    }

    private void evalNodes(CallStack callStack, Interpreter interpreter) {
        insureNodesParsed();
        for (int i = this.firstThrowsClause; i < this.numThrows + this.firstThrowsClause; i++) {
            ((BSHAmbiguousName) jjtGetChild(i)).toClass(callStack, interpreter);
        }
        this.paramsNode.eval(callStack, interpreter);
        if (interpreter.getStrictJava()) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.paramsNode.paramTypes;
                if (i2 >= clsArr.length) {
                    if (this.returnType == null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("(Strict Java Mode) Undeclared return type for method: ");
                        stringBuffer.append(this.name);
                        throw new EvalError(stringBuffer.toString(), this, null);
                    }
                    return;
                } else if (clsArr[i2] != null) {
                    i2++;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("(Strict Java Mode) Undeclared argument type, parameter: ");
                    stringBuffer2.append(this.paramsNode.getParamNames()[i2]);
                    stringBuffer2.append(" in method: ");
                    stringBuffer2.append(this.name);
                    throw new EvalError(stringBuffer2.toString(), this, null);
                }
            }
        }
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        this.returnType = evalReturnType(callStack, interpreter);
        evalNodes(callStack, interpreter);
        NameSpace pVar = callStack.top();
        try {
            pVar.setMethod(this.name, new BshMethod(this, pVar, this.modifiers));
            return Primitive.VOID;
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    /* access modifiers changed from: package-private */
    public Class evalReturnType(CallStack callStack, Interpreter interpreter) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType != null) {
            return bSHReturnType.evalReturnType(callStack, interpreter);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String getReturnTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType == null) {
            return null;
        }
        return bSHReturnType.getTypeDescriptor(callStack, interpreter, str);
    }

    /* access modifiers changed from: package-private */
    public BSHReturnType getReturnTypeNode() {
        insureNodesParsed();
        return this.returnTypeNode;
    }

    /* access modifiers changed from: package-private */
    public synchronized void insureNodesParsed() {
        if (this.paramsNode == null) {
            Node jjtGetChild = jjtGetChild(0);
            this.firstThrowsClause = 1;
            if (jjtGetChild instanceof BSHReturnType) {
                this.returnTypeNode = (BSHReturnType) jjtGetChild;
                this.paramsNode = (BSHFormalParameters) jjtGetChild(1);
                int jjtGetNumChildren = jjtGetNumChildren();
                int i = this.numThrows;
                if (jjtGetNumChildren > i + 2) {
                    this.blockNode = (BSHBlock) jjtGetChild(i + 2);
                }
                this.firstThrowsClause++;
            } else {
                this.paramsNode = (BSHFormalParameters) jjtGetChild(0);
                this.blockNode = (BSHBlock) jjtGetChild(this.numThrows + 1);
            }
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MethodDeclaration: ");
        stringBuffer.append(this.name);
        return stringBuffer.toString();
    }
}
