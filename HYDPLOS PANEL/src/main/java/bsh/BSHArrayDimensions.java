package bsh;

import java.lang.reflect.Array;

class BSHArrayDimensions extends SimpleNode {
    public Class baseType;
    public int[] definedDimensions;
    public int numDefinedDims;
    public int numUndefinedDims;

    BSHArrayDimensions(int i) {
        super(i);
    }

    public void addDefinedDimension() {
        this.numDefinedDims++;
    }

    public void addUndefinedDimension() {
        this.numUndefinedDims++;
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        SimpleNode simpleNode = (SimpleNode) jjtGetChild(0);
        if (simpleNode instanceof BSHArrayInitializer) {
            Class cls = this.baseType;
            if (cls != null) {
                Object eval = ((BSHArrayInitializer) simpleNode).eval(cls, this.numUndefinedDims, callStack, interpreter);
                int arrayDimensions = Reflect.getArrayDimensions(eval.getClass());
                int[] iArr = new int[arrayDimensions];
                this.definedDimensions = iArr;
                if (iArr.length == this.numUndefinedDims) {
                    Object obj = eval;
                    int i = 0;
                    while (true) {
                        int[] iArr2 = this.definedDimensions;
                        if (i >= iArr2.length) {
                            return eval;
                        }
                        iArr2[i] = Array.getLength(obj);
                        if (this.definedDimensions[i] > 0) {
                            obj = Array.get(obj, 0);
                        }
                        i++;
                    }
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Incompatible initializer. Allocation calls for a ");
                    stringBuffer.append(this.numUndefinedDims);
                    stringBuffer.append(" dimensional array, but initializer is a ");
                    stringBuffer.append(arrayDimensions);
                    stringBuffer.append(" dimensional array");
                    throw new EvalError(stringBuffer.toString(), this, callStack);
                }
            } else {
                throw new EvalError("Internal Array Eval err:  unknown base type", this, callStack);
            }
        } else {
            this.definedDimensions = new int[this.numDefinedDims];
            for (int i2 = 0; i2 < this.numDefinedDims; i2++) {
                try {
                    this.definedDimensions[i2] = ((Primitive) ((SimpleNode) jjtGetChild(i2)).eval(callStack, interpreter)).intValue();
                } catch (Exception unused) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Array index: ");
                    stringBuffer2.append(i2);
                    stringBuffer2.append(" does not evaluate to an integer");
                    throw new EvalError(stringBuffer2.toString(), this, callStack);
                }
            }
            return Primitive.VOID;
        }
    }

    public Object eval(Class cls, CallStack callStack, Interpreter interpreter) {
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("array base type = ");
            stringBuffer.append(cls);
            Interpreter.debug(stringBuffer.toString());
        }
        this.baseType = cls;
        return eval(callStack, interpreter);
    }
}
