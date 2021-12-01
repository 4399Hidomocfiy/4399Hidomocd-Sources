package bsh;

class BSHBinaryExpression extends SimpleNode implements ParserConstants {
    static /* synthetic */ Class class$bsh$Primitive;
    public int kind;

    BSHBinaryExpression(int i) {
        super(i);
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private boolean isPrimitiveValue(Object obj) {
        return (!(obj instanceof Primitive) || obj == Primitive.VOID || obj == Primitive.NULL) ? false : true;
    }

    private boolean isWrapper(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number);
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        boolean z = false;
        Object eval = ((SimpleNode) jjtGetChild(0)).eval(callStack, interpreter);
        int i = this.kind;
        if (i != 35) {
            if (i == 98 || i == 99) {
                Object value = isPrimitiveValue(eval) ? ((Primitive) eval).getValue() : eval;
                if ((value instanceof Boolean) && !((Boolean) value).booleanValue()) {
                    return new Primitive(false);
                }
            }
            int i2 = this.kind;
            if (i2 == 96 || i2 == 97) {
                Object value2 = isPrimitiveValue(eval) ? ((Primitive) eval).getValue() : eval;
                if ((value2 instanceof Boolean) && ((Boolean) value2).booleanValue()) {
                    return new Primitive(true);
                }
            }
            boolean isWrapper = isWrapper(eval);
            Object eval2 = ((SimpleNode) jjtGetChild(1)).eval(callStack, interpreter);
            boolean isWrapper2 = isWrapper(eval2);
            if ((isWrapper || isPrimitiveValue(eval)) && ((isWrapper2 || isPrimitiveValue(eval2)) && (!isWrapper || !isWrapper2 || this.kind != 90))) {
                try {
                    return Primitive.binaryOperation(eval, eval2, this.kind);
                } catch (UtilEvalError e) {
                    throw e.toEvalError(this, callStack);
                }
            } else {
                int i3 = this.kind;
                if (i3 == 90) {
                    if (eval == eval2) {
                        z = true;
                    }
                    return new Primitive(z);
                } else if (i3 == 95) {
                    if (eval != eval2) {
                        z = true;
                    }
                    return new Primitive(z);
                } else if (i3 == 102 && ((eval instanceof String) || (eval2 instanceof String))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(eval.toString());
                    stringBuffer.append(eval2.toString());
                    return stringBuffer.toString();
                } else {
                    if ((eval instanceof Primitive) || (eval2 instanceof Primitive)) {
                        Primitive primitive = Primitive.VOID;
                        if (eval == primitive || eval2 == primitive) {
                            throw new EvalError("illegal use of undefined variable, class, or 'void' literal", this, callStack);
                        }
                        Primitive primitive2 = Primitive.NULL;
                        if (eval == primitive2 || eval2 == primitive2) {
                            throw new EvalError("illegal use of null value or 'null' literal", this, callStack);
                        }
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Operator: '");
                    stringBuffer2.append(ParserConstants.tokenImage[this.kind]);
                    stringBuffer2.append("' inappropriate for objects");
                    throw new EvalError(stringBuffer2.toString(), this, callStack);
                }
            }
        } else if (eval == Primitive.NULL) {
            return new Primitive(false);
        } else {
            Class type = ((BSHType) jjtGetChild(1)).getType(callStack, interpreter);
            if (!(eval instanceof Primitive)) {
                return new Primitive(Types.isJavaBaseAssignable(type, eval.getClass()));
            }
            Class cls = class$bsh$Primitive;
            if (cls == null) {
                cls = class$("bsh.Primitive");
                class$bsh$Primitive = cls;
            }
            return type == cls ? new Primitive(true) : new Primitive(false);
        }
    }
}
