package bsh;

/* access modifiers changed from: package-private */
public class BSHClassDeclaration extends SimpleNode {
    static final String CLASSINITNAME = "_bshClassInit";
    boolean extend;
    boolean isInterface;
    Modifiers modifiers;
    String name;
    int numInterfaces;

    BSHClassDeclaration(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        Class cls;
        int i;
        int i2 = 0;
        if (this.extend) {
            i = 1;
            cls = ((BSHAmbiguousName) jjtGetChild(0)).toClass(callStack, interpreter);
        } else {
            cls = null;
            i = 0;
        }
        Class[] clsArr = new Class[this.numInterfaces];
        while (i2 < this.numInterfaces) {
            int i3 = i + 1;
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(i);
            clsArr[i2] = bSHAmbiguousName.toClass(callStack, interpreter);
            if (clsArr[i2].isInterface()) {
                i2++;
                i = i3;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Type: ");
                stringBuffer.append(bSHAmbiguousName.text);
                stringBuffer.append(" is not an interface!");
                throw new EvalError(stringBuffer.toString(), this, callStack);
            }
        }
        try {
            return ClassGenerator.getClassGenerator().generateClass(this.name, this.modifiers, clsArr, cls, i < jjtGetNumChildren() ? (BSHBlock) jjtGetChild(i) : new BSHBlock(25), this.isInterface, callStack, interpreter);
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClassDeclaration: ");
        stringBuffer.append(this.name);
        return stringBuffer.toString();
    }
}
