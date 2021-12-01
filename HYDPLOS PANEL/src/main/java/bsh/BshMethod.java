package bsh;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BshMethod implements Serializable {
    private Class[] cparamTypes;
    private Class creturnType;
    NameSpace declaringNameSpace;
    private Method javaMethod;
    private Object javaObject;
    BSHBlock methodBody;
    Modifiers modifiers;
    private String name;
    private int numArgs;
    private String[] paramNames;

    BshMethod(BSHMethodDeclaration bSHMethodDeclaration, NameSpace nameSpace, Modifiers modifiers2) {
        this(bSHMethodDeclaration.name, bSHMethodDeclaration.returnType, bSHMethodDeclaration.paramsNode.getParamNames(), bSHMethodDeclaration.paramsNode.paramTypes, bSHMethodDeclaration.blockNode, nameSpace, modifiers2);
    }

    BshMethod(String str, Class cls, String[] strArr, Class[] clsArr, BSHBlock bSHBlock, NameSpace nameSpace, Modifiers modifiers2) {
        this.name = str;
        this.creturnType = cls;
        this.paramNames = strArr;
        if (strArr != null) {
            this.numArgs = strArr.length;
        }
        this.cparamTypes = clsArr;
        this.methodBody = bSHBlock;
        this.declaringNameSpace = nameSpace;
        this.modifiers = modifiers2;
    }

    BshMethod(Method method, Object obj) {
        this(method.getName(), method.getReturnType(), null, method.getParameterTypes(), null, null, null);
        this.javaMethod = method;
        this.javaObject = obj;
    }

    private Object invokeImpl(Object[] objArr, Interpreter interpreter, CallStack callStack, SimpleNode simpleNode, boolean z) {
        NameSpace nameSpace;
        Class returnType = getReturnType();
        Class[] parameterTypes = getParameterTypes();
        if (callStack == null) {
            callStack = new CallStack(this.declaringNameSpace);
        }
        int i = 0;
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (objArr.length == this.numArgs) {
            if (z) {
                nameSpace = callStack.top();
            } else {
                nameSpace = new NameSpace(this.declaringNameSpace, this.name);
                nameSpace.isMethod = true;
            }
            nameSpace.setNode(simpleNode);
            while (true) {
                ReturnControl returnControl = null;
                if (i >= this.numArgs) {
                    if (!z) {
                        callStack.push(nameSpace);
                    }
                    Object eval = this.methodBody.eval(callStack, interpreter, true);
                    CallStack copy = callStack.copy();
                    if (!z) {
                        callStack.pop();
                    }
                    if (eval instanceof ReturnControl) {
                        returnControl = (ReturnControl) eval;
                        if (returnControl.kind == 46) {
                            eval = returnControl.value;
                            if (returnType == Void.TYPE && eval != Primitive.VOID) {
                                throw new EvalError("Cannot return value from void method", returnControl.returnPoint, copy);
                            }
                        } else {
                            throw new EvalError("'continue' or 'break' in method body", returnControl.returnPoint, copy);
                        }
                    }
                    if (returnType == null) {
                        return eval;
                    }
                    if (returnType == Void.TYPE) {
                        return Primitive.VOID;
                    }
                    try {
                        return Types.castObject(eval, returnType, 1);
                    } catch (UtilEvalError e) {
                        if (returnControl != null) {
                            simpleNode = returnControl.returnPoint;
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Incorrect type returned from method: ");
                        stringBuffer.append(this.name);
                        stringBuffer.append(e.getMessage());
                        throw e.toEvalError(stringBuffer.toString(), simpleNode, callStack);
                    }
                } else {
                    if (parameterTypes[i] != null) {
                        try {
                            objArr[i] = Types.castObject(objArr[i], parameterTypes[i], 1);
                            try {
                                nameSpace.setTypedVariable(this.paramNames[i], parameterTypes[i], objArr[i], (Modifiers) null);
                            } catch (UtilEvalError e2) {
                                throw e2.toEvalError("Typed method parameter assignment", simpleNode, callStack);
                            }
                        } catch (UtilEvalError e3) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Invalid argument: `");
                            stringBuffer2.append(this.paramNames[i]);
                            stringBuffer2.append("'");
                            stringBuffer2.append(" for method: ");
                            stringBuffer2.append(this.name);
                            stringBuffer2.append(" : ");
                            stringBuffer2.append(e3.getMessage());
                            throw new EvalError(stringBuffer2.toString(), simpleNode, callStack);
                        }
                    } else if (objArr[i] != Primitive.VOID) {
                        try {
                            nameSpace.setLocalVariable(this.paramNames[i], objArr[i], interpreter.getStrictJava());
                        } catch (UtilEvalError e4) {
                            throw e4.toEvalError(simpleNode, callStack);
                        }
                    } else {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Undefined variable or class name, parameter: ");
                        stringBuffer3.append(this.paramNames[i]);
                        stringBuffer3.append(" to method: ");
                        stringBuffer3.append(this.name);
                        throw new EvalError(stringBuffer3.toString(), simpleNode, callStack);
                    }
                    i++;
                }
            }
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Wrong number of arguments for local method: ");
            stringBuffer4.append(this.name);
            throw new EvalError(stringBuffer4.toString(), simpleNode, callStack);
        }
    }

    public Modifiers getModifiers() {
        return this.modifiers;
    }

    public String getName() {
        return this.name;
    }

    public String[] getParameterNames() {
        return this.paramNames;
    }

    public Class[] getParameterTypes() {
        return this.cparamTypes;
    }

    public Class getReturnType() {
        return this.creturnType;
    }

    public boolean hasModifier(String str) {
        Modifiers modifiers2 = this.modifiers;
        return modifiers2 != null && modifiers2.hasModifier(str);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter) {
        return invoke(objArr, interpreter, null, null, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, SimpleNode simpleNode) {
        return invoke(objArr, interpreter, callStack, simpleNode, false);
    }

    /* access modifiers changed from: package-private */
    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, SimpleNode simpleNode, boolean z) {
        Object obj;
        Object invokeImpl;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    throw new Error("HERE!");
                }
            }
        }
        Method method = this.javaMethod;
        if (method != null) {
            try {
                return Reflect.invokeMethod(method, this.javaObject, objArr);
            } catch (ReflectError e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Error invoking Java method: ");
                stringBuffer.append(e);
                throw new EvalError(stringBuffer.toString(), simpleNode, callStack);
            } catch (InvocationTargetException e2) {
                throw new TargetError("Exception invoking imported object method.", e2, simpleNode, callStack, true);
            }
        } else {
            Modifiers modifiers2 = this.modifiers;
            if (modifiers2 == null || !modifiers2.hasModifier("synchronized")) {
                return invokeImpl(objArr, interpreter, callStack, simpleNode, z);
            }
            NameSpace nameSpace = this.declaringNameSpace;
            if (nameSpace.isClass) {
                try {
                    obj = nameSpace.getClassInstance();
                } catch (UtilEvalError unused) {
                    throw new InterpreterError("Can't get class instance for synchronized method.");
                }
            } else {
                obj = nameSpace.getThis(interpreter);
            }
            synchronized (obj) {
                invokeImpl = invokeImpl(objArr, interpreter, callStack, simpleNode, z);
            }
            return invokeImpl;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scripted Method: ");
        stringBuffer.append(StringUtil.methodString(this.name, getParameterTypes()));
        return stringBuffer.toString();
    }
}
