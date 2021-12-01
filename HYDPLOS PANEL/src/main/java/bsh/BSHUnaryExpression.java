package bsh;

class BSHUnaryExpression extends SimpleNode implements ParserConstants {
    public int kind;
    public boolean postfix = false;

    BSHUnaryExpression(int i) {
        super(i);
    }

    private Object lhsUnaryOperation(LHS lhs, boolean z) {
        if (Interpreter.DEBUG) {
            Interpreter.debug("lhsUnaryOperation");
        }
        Object value = lhs.getValue();
        Object unaryOperation = unaryOperation(value, this.kind);
        if (!this.postfix) {
            value = unaryOperation;
        }
        lhs.assign(unaryOperation, z);
        return value;
    }

    private Object primitiveWrapperUnaryOperation(Object obj, int i) {
        Class<?> cls = obj.getClass();
        Object promoteToInteger = Primitive.promoteToInteger(obj);
        if (promoteToInteger instanceof Boolean) {
            return new Boolean(Primitive.booleanUnaryOperation((Boolean) promoteToInteger, i));
        }
        if (promoteToInteger instanceof Integer) {
            int intUnaryOperation = Primitive.intUnaryOperation((Integer) promoteToInteger, i);
            if (i == 100 || i == 101) {
                if (cls == Byte.TYPE) {
                    return new Byte((byte) intUnaryOperation);
                }
                if (cls == Short.TYPE) {
                    return new Short((short) intUnaryOperation);
                }
                if (cls == Character.TYPE) {
                    return new Character((char) intUnaryOperation);
                }
            }
            return new Integer(intUnaryOperation);
        } else if (promoteToInteger instanceof Long) {
            return new Long(Primitive.longUnaryOperation((Long) promoteToInteger, i));
        } else {
            if (promoteToInteger instanceof Float) {
                return new Float(Primitive.floatUnaryOperation((Float) promoteToInteger, i));
            }
            if (promoteToInteger instanceof Double) {
                return new Double(Primitive.doubleUnaryOperation((Double) promoteToInteger, i));
            }
            throw new InterpreterError("An error occurred.  Please call technical support.");
        }
    }

    private Object unaryOperation(Object obj, int i) {
        if ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number)) {
            return primitiveWrapperUnaryOperation(obj, i);
        }
        if (obj instanceof Primitive) {
            return Primitive.unaryOperation((Primitive) obj, i);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unary operation ");
        stringBuffer.append(ParserConstants.tokenImage[i]);
        stringBuffer.append(" inappropriate for object");
        throw new UtilEvalError(stringBuffer.toString());
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        SimpleNode simpleNode = (SimpleNode) jjtGetChild(0);
        try {
            int i = this.kind;
            if (i != 100) {
                if (i != 101) {
                    return unaryOperation(simpleNode.eval(callStack, interpreter), this.kind);
                }
            }
            return lhsUnaryOperation(((BSHPrimaryExpression) simpleNode).toLHS(callStack, interpreter), interpreter.getStrictJava());
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }
}
