package bsh;

class BSHFormalParameters extends SimpleNode {
    int numArgs;
    private String[] paramNames;
    Class[] paramTypes;
    String[] typeDescriptors;

    BSHFormalParameters(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        Class[] clsArr = this.paramTypes;
        if (clsArr != null) {
            return clsArr;
        }
        insureParsed();
        Class[] clsArr2 = new Class[this.numArgs];
        for (int i = 0; i < this.numArgs; i++) {
            clsArr2[i] = (Class) ((BSHFormalParameter) jjtGetChild(i)).eval(callStack, interpreter);
        }
        this.paramTypes = clsArr2;
        return clsArr2;
    }

    public String[] getParamNames() {
        insureParsed();
        return this.paramNames;
    }

    public String[] getTypeDescriptors(CallStack callStack, Interpreter interpreter, String str) {
        String[] strArr = this.typeDescriptors;
        if (strArr != null) {
            return strArr;
        }
        insureParsed();
        String[] strArr2 = new String[this.numArgs];
        for (int i = 0; i < this.numArgs; i++) {
            strArr2[i] = ((BSHFormalParameter) jjtGetChild(i)).getTypeDescriptor(callStack, interpreter, str);
        }
        this.typeDescriptors = strArr2;
        return strArr2;
    }

    /* access modifiers changed from: package-private */
    public void insureParsed() {
        if (this.paramNames == null) {
            int jjtGetNumChildren = jjtGetNumChildren();
            this.numArgs = jjtGetNumChildren;
            String[] strArr = new String[jjtGetNumChildren];
            for (int i = 0; i < this.numArgs; i++) {
                strArr[i] = ((BSHFormalParameter) jjtGetChild(i)).name;
            }
            this.paramNames = strArr;
        }
    }
}
