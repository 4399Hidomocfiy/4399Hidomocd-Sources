package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

/* access modifiers changed from: package-private */
public class BSHPrimarySuffix extends SimpleNode {
    public static final int CLASS = 0;
    public static final int INDEX = 1;
    public static final int NAME = 2;
    public static final int PROPERTY = 3;
    public String field;
    Object index;
    public int operation;

    BSHPrimarySuffix(int i) {
        super(i);
    }

    private Object doIndex(Object obj, boolean z, CallStack callStack, Interpreter interpreter) {
        int indexAux = getIndexAux(obj, callStack, interpreter, this);
        if (z) {
            return new LHS(obj, indexAux);
        }
        try {
            return Reflect.getIndex(obj, indexAux);
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    private Object doName(Object obj, boolean z, CallStack callStack, Interpreter interpreter) {
        try {
            if (!this.field.equals("length") || !obj.getClass().isArray()) {
                if (jjtGetNumChildren() == 0) {
                    return z ? Reflect.getLHSObjectField(obj, this.field) : Reflect.getObjectFieldValue(obj, this.field);
                }
                try {
                    return Reflect.invokeObjectMethod(obj, this.field, ((BSHArguments) jjtGetChild(0)).getArguments(callStack, interpreter), interpreter, callStack, this);
                } catch (ReflectError e) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Error in method invocation: ");
                    stringBuffer.append(e.getMessage());
                    throw new EvalError(stringBuffer.toString(), this, callStack);
                } catch (InvocationTargetException e2) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Method Invocation ");
                    stringBuffer2.append(this.field);
                    String stringBuffer3 = stringBuffer2.toString();
                    Throwable targetException = e2.getTargetException();
                    throw new TargetError(stringBuffer3, targetException, this, callStack, targetException instanceof EvalError ? targetException instanceof TargetError ? ((TargetError) targetException).inNativeCode() : false : true);
                }
            } else if (!z) {
                return new Primitive(Array.getLength(obj));
            } else {
                throw new EvalError("Can't assign array length", this, callStack);
            }
        } catch (UtilEvalError e3) {
            throw e3.toEvalError(this, callStack);
        }
    }

    private Object doProperty(boolean z, Object obj, CallStack callStack, Interpreter interpreter) {
        if (obj == Primitive.VOID) {
            throw new EvalError("Attempt to access property on undefined variable or class name", this, callStack);
        } else if (!(obj instanceof Primitive)) {
            Object eval = ((SimpleNode) jjtGetChild(0)).eval(callStack, interpreter);
            if (!(eval instanceof String)) {
                throw new EvalError("Property expression must be a String or identifier.", this, callStack);
            } else if (z) {
                return new LHS(obj, (String) eval);
            } else {
                CollectionManager collectionManager = CollectionManager.getCollectionManager();
                if (collectionManager.isMap(obj)) {
                    Object fromMap = collectionManager.getFromMap(obj, eval);
                    return fromMap == null ? Primitive.NULL : fromMap;
                }
                try {
                    return Reflect.getObjectProperty(obj, (String) eval);
                } catch (UtilEvalError e) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Property: ");
                    stringBuffer.append(eval);
                    throw e.toEvalError(stringBuffer.toString(), this, callStack);
                } catch (ReflectError unused) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No such property: ");
                    stringBuffer2.append(eval);
                    throw new EvalError(stringBuffer2.toString(), this, callStack);
                }
            }
        } else {
            throw new EvalError("Attempt to access property on a primitive", this, callStack);
        }
    }

    static int getIndexAux(Object obj, CallStack callStack, Interpreter interpreter, SimpleNode simpleNode) {
        if (obj.getClass().isArray()) {
            try {
                Object eval = ((SimpleNode) simpleNode.jjtGetChild(0)).eval(callStack, interpreter);
                if (!(eval instanceof Primitive)) {
                    eval = Types.castObject(eval, Integer.TYPE, 1);
                }
                return ((Primitive) eval).intValue();
            } catch (UtilEvalError e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("doIndex: ");
                stringBuffer.append(e);
                Interpreter.debug(stringBuffer.toString());
                throw e.toEvalError("Arrays may only be indexed by integer types.", simpleNode, callStack);
            }
        } else {
            throw new EvalError("Not an array", simpleNode, callStack);
        }
    }

    public Object doSuffix(Object obj, boolean z, CallStack callStack, Interpreter interpreter) {
        if (this.operation != 0) {
            if (obj instanceof SimpleNode) {
                obj = obj instanceof BSHAmbiguousName ? ((BSHAmbiguousName) obj).toObject(callStack, interpreter) : ((SimpleNode) obj).eval(callStack, interpreter);
            } else if (obj instanceof LHS) {
                try {
                    obj = ((LHS) obj).getValue();
                } catch (UtilEvalError e) {
                    throw e.toEvalError(this, callStack);
                }
            }
            try {
                int i = this.operation;
                if (i == 1) {
                    return doIndex(obj, z, callStack, interpreter);
                }
                if (i == 2) {
                    return doName(obj, z, callStack, interpreter);
                }
                if (i == 3) {
                    return doProperty(z, obj, callStack, interpreter);
                }
                throw new InterpreterError("Unknown suffix type");
            } catch (ReflectError e2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("reflection error: ");
                stringBuffer.append(e2);
                throw new EvalError(stringBuffer.toString(), this, callStack);
            } catch (InvocationTargetException e3) {
                throw new TargetError("target exception", e3.getTargetException(), this, callStack, true);
            }
        } else if (!(obj instanceof BSHType)) {
            throw new EvalError("Attempt to use .class suffix on non class.", this, callStack);
        } else if (!z) {
            callStack.top();
            return ((BSHType) obj).getType(callStack, interpreter);
        } else {
            throw new EvalError("Can't assign .class", this, callStack);
        }
    }
}
