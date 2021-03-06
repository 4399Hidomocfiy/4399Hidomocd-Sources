package bsh;

import java.io.Serializable;

public class This implements Serializable, Runnable {
    transient Interpreter declaringInterpreter;
    NameSpace namespace;

    protected This(NameSpace nameSpace, Interpreter interpreter) {
        this.namespace = nameSpace;
        this.declaringInterpreter = interpreter;
    }

    public static void bind(This r1, NameSpace nameSpace, Interpreter interpreter) {
        r1.namespace.setParent(nameSpace);
        r1.declaringInterpreter = interpreter;
    }

    static This getThis(NameSpace nameSpace, Interpreter interpreter) {
        String str;
        try {
            if (Capabilities.canGenerateInterfaces()) {
                str = "bsh.XThis";
            } else if (!Capabilities.haveSwing()) {
                return new This(nameSpace, interpreter);
            } else {
                str = "bsh.JThis";
            }
            return (This) Reflect.constructObject(Class.forName(str), new Object[]{nameSpace, interpreter});
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("internal error 1 in This: ");
            stringBuffer.append(e);
            throw new InterpreterError(stringBuffer.toString());
        }
    }

    static boolean isExposedThisMethod(String str) {
        return str.equals("getClass") || str.equals("invokeMethod") || str.equals("getInterface") || str.equals("wait") || str.equals("notify") || str.equals("notifyAll");
    }

    public Object getInterface(Class cls) {
        if (cls.isInstance(this)) {
            return this;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Dynamic proxy mechanism not available. Cannot construct interface type: ");
        stringBuffer.append(cls);
        throw new UtilEvalError(stringBuffer.toString());
    }

    public Object getInterface(Class[] clsArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isInstance(this)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Dynamic proxy mechanism not available. Cannot construct interface type: ");
                stringBuffer.append(clsArr[i]);
                throw new UtilEvalError(stringBuffer.toString());
            }
        }
        return this;
    }

    public NameSpace getNameSpace() {
        return this.namespace;
    }

    public Object invokeMethod(String str, Object[] objArr) {
        return invokeMethod(str, objArr, null, null, null, false);
    }

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, SimpleNode simpleNode, boolean z) {
        BshMethod bshMethod;
        boolean z2 = false;
        if (objArr != null) {
            Object[] objArr2 = new Object[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                objArr2[i] = objArr[i] == null ? Primitive.NULL : objArr[i];
            }
            objArr = objArr2;
        }
        if (interpreter == null) {
            interpreter = this.declaringInterpreter;
        }
        if (callStack == null) {
            callStack = new CallStack(this.namespace);
        }
        if (simpleNode == null) {
            simpleNode = SimpleNode.JAVACODE;
        }
        Class[] types = Types.getTypes(objArr);
        try {
            bshMethod = this.namespace.getMethod(str, types, z);
        } catch (UtilEvalError unused) {
            bshMethod = null;
        }
        if (bshMethod != null) {
            return bshMethod.invoke(objArr, interpreter, callStack, simpleNode);
        }
        if (str.equals("toString")) {
            return toString();
        }
        if (str.equals("hashCode")) {
            return new Integer(hashCode());
        }
        if (str.equals("equals")) {
            if (this == objArr[0]) {
                z2 = true;
            }
            return new Boolean(z2);
        }
        try {
            bshMethod = this.namespace.getMethod("invoke", new Class[]{null, null});
        } catch (UtilEvalError unused2) {
        }
        if (bshMethod != null) {
            return bshMethod.invoke(new Object[]{str, objArr}, interpreter, callStack, simpleNode);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Method ");
        stringBuffer.append(StringUtil.methodString(str, types));
        stringBuffer.append(" not found in bsh scripted object: ");
        stringBuffer.append(this.namespace.getName());
        throw new EvalError(stringBuffer.toString(), simpleNode, callStack);
    }

    public void run() {
        try {
            invokeMethod("run", new Object[0]);
        } catch (EvalError e) {
            Interpreter interpreter = this.declaringInterpreter;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Exception in runnable:");
            stringBuffer.append(e);
            interpreter.error(stringBuffer.toString());
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("'this' reference to Bsh object: ");
        stringBuffer.append(this.namespace);
        return stringBuffer.toString();
    }
}
