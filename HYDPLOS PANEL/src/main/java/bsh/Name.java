package bsh;

import java.io.Serializable;
import java.lang.reflect.Array;

/* access modifiers changed from: package-private */
public class Name implements Serializable {
    private static String FINISHED;
    Class asClass;
    private int callstackDepth;
    Class classOfStaticMethod;
    private Object evalBaseObject;
    private String evalName;
    private String lastEvalName;
    public NameSpace namespace;
    String value = null;

    Name(NameSpace nameSpace, String str) {
        this.namespace = nameSpace;
        this.value = str;
    }

    private Object completeRound(String str, String str2, Object obj) {
        if (obj != null) {
            this.lastEvalName = str;
            this.evalName = str2;
            this.evalBaseObject = obj;
            return obj;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lastEvalName = ");
        stringBuffer.append(str);
        throw new InterpreterError(stringBuffer.toString());
    }

    private Object consumeNextObjectField(CallStack callStack, Interpreter interpreter, boolean z, boolean z2) {
        boolean z3;
        NameSpace nameSpace;
        Object resolveThisFieldReference;
        if (!(this.evalBaseObject != null || isCompound(this.evalName) || z || (resolveThisFieldReference = resolveThisFieldReference(callStack, this.namespace, interpreter, this.evalName, false)) == Primitive.VOID)) {
            return completeRound(this.evalName, FINISHED, resolveThisFieldReference);
        }
        String prefix = prefix(this.evalName, 1);
        Object obj = this.evalBaseObject;
        if ((obj == null || (obj instanceof This)) && !z) {
            if (Interpreter.DEBUG) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("trying to resolve variable: ");
                stringBuffer.append(prefix);
                Interpreter.debug(stringBuffer.toString());
            }
            Object obj2 = this.evalBaseObject;
            if (obj2 == null) {
                nameSpace = this.namespace;
                z3 = false;
            } else {
                nameSpace = ((This) obj2).namespace;
                z3 = true;
            }
            Object resolveThisFieldReference2 = resolveThisFieldReference(callStack, nameSpace, interpreter, prefix, z3);
            if (resolveThisFieldReference2 != Primitive.VOID) {
                if (Interpreter.DEBUG) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("resolved variable: ");
                    stringBuffer2.append(prefix);
                    stringBuffer2.append(" in namespace: ");
                    stringBuffer2.append(this.namespace);
                    Interpreter.debug(stringBuffer2.toString());
                }
                return completeRound(prefix, suffix(this.evalName), resolveThisFieldReference2);
            }
        }
        Object obj3 = null;
        if (this.evalBaseObject == null) {
            if (Interpreter.DEBUG) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("trying class: ");
                stringBuffer3.append(this.evalName);
                Interpreter.debug(stringBuffer3.toString());
            }
            Class cls = null;
            String str = null;
            int i = 1;
            while (i <= countParts(this.evalName) && (cls = this.namespace.getClass((str = prefix(this.evalName, i)))) == null) {
                i++;
            }
            if (cls != null) {
                String str2 = this.evalName;
                return completeRound(str, suffix(str2, countParts(str2) - i), new ClassIdentifier(cls));
            } else if (Interpreter.DEBUG) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("not a class, trying var prefix ");
                stringBuffer4.append(this.evalName);
                Interpreter.debug(stringBuffer4.toString());
            }
        }
        Object obj4 = this.evalBaseObject;
        if ((obj4 == null || (obj4 instanceof This)) && !z && z2) {
            NameSpace nameSpace2 = obj4 == null ? this.namespace : ((This) obj4).namespace;
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("auto: ");
            stringBuffer5.append(prefix);
            This r10 = new NameSpace(nameSpace2, stringBuffer5.toString()).getThis(interpreter);
            nameSpace2.setVariable(prefix, r10, false);
            return completeRound(prefix, suffix(this.evalName), r10);
        } else if (obj4 == null) {
            if (!isCompound(this.evalName)) {
                return completeRound(this.evalName, FINISHED, Primitive.VOID);
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("Class or variable not found: ");
            stringBuffer6.append(this.evalName);
            throw new UtilEvalError(stringBuffer6.toString());
        } else if (obj4 == Primitive.NULL) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("Null Pointer while evaluating: ");
            stringBuffer7.append(this.value);
            throw new UtilTargetError(new NullPointerException(stringBuffer7.toString()));
        } else if (obj4 == Primitive.VOID) {
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append("Undefined variable or class name while evaluating: ");
            stringBuffer8.append(this.value);
            throw new UtilEvalError(stringBuffer8.toString());
        } else if (obj4 instanceof Primitive) {
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append("Can't treat primitive like an object. Error while evaluating: ");
            stringBuffer9.append(this.value);
            throw new UtilEvalError(stringBuffer9.toString());
        } else if (obj4 instanceof ClassIdentifier) {
            Class<?> targetClass = ((ClassIdentifier) obj4).getTargetClass();
            String prefix2 = prefix(this.evalName, 1);
            if (prefix2.equals("this")) {
                for (NameSpace nameSpace3 = this.namespace; nameSpace3 != null; nameSpace3 = nameSpace3.getParent()) {
                    Object obj5 = nameSpace3.classInstance;
                    if (obj5 != null && obj5.getClass() == targetClass) {
                        return completeRound(prefix2, suffix(this.evalName), nameSpace3.classInstance);
                    }
                }
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append("Can't find enclosing 'this' instance of class: ");
                stringBuffer10.append(targetClass);
                throw new UtilEvalError(stringBuffer10.toString());
            }
            try {
                if (Interpreter.DEBUG) {
                    StringBuffer stringBuffer11 = new StringBuffer();
                    stringBuffer11.append("Name call to getStaticFieldValue, class: ");
                    stringBuffer11.append(targetClass);
                    stringBuffer11.append(", field:");
                    stringBuffer11.append(prefix2);
                    Interpreter.debug(stringBuffer11.toString());
                }
                obj3 = Reflect.getStaticFieldValue(targetClass, prefix2);
            } catch (ReflectError e) {
                if (Interpreter.DEBUG) {
                    StringBuffer stringBuffer12 = new StringBuffer();
                    stringBuffer12.append("field reflect error: ");
                    stringBuffer12.append(e);
                    Interpreter.debug(stringBuffer12.toString());
                }
            }
            if (obj3 == null) {
                StringBuffer stringBuffer13 = new StringBuffer();
                stringBuffer13.append(targetClass.getName());
                stringBuffer13.append("$");
                stringBuffer13.append(prefix2);
                Class cls2 = this.namespace.getClass(stringBuffer13.toString());
                if (cls2 != null) {
                    obj3 = new ClassIdentifier(cls2);
                }
            }
            if (obj3 != null) {
                return completeRound(prefix2, suffix(this.evalName), obj3);
            }
            StringBuffer stringBuffer14 = new StringBuffer();
            stringBuffer14.append("No static field or inner class: ");
            stringBuffer14.append(prefix2);
            stringBuffer14.append(" of ");
            stringBuffer14.append(targetClass);
            throw new UtilEvalError(stringBuffer14.toString());
        } else if (!z) {
            String prefix3 = prefix(this.evalName, 1);
            if (prefix3.equals("length") && this.evalBaseObject.getClass().isArray()) {
                return completeRound(prefix3, suffix(this.evalName), new Primitive(Array.getLength(this.evalBaseObject)));
            }
            try {
                return completeRound(prefix3, suffix(this.evalName), Reflect.getObjectFieldValue(this.evalBaseObject, prefix3));
            } catch (ReflectError unused) {
                StringBuffer stringBuffer15 = new StringBuffer();
                stringBuffer15.append("Cannot access field: ");
                stringBuffer15.append(prefix3);
                stringBuffer15.append(", on object: ");
                stringBuffer15.append(this.evalBaseObject);
                throw new UtilEvalError(stringBuffer15.toString());
            }
        } else {
            StringBuffer stringBuffer16 = new StringBuffer();
            stringBuffer16.append(this.value);
            stringBuffer16.append(" does not resolve to a class name.");
            throw new UtilEvalError(stringBuffer16.toString());
        }
    }

    static int countParts(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        int i2 = -1;
        while (true) {
            i2 = str.indexOf(46, i2 + 1);
            if (i2 == -1) {
                return i + 1;
            }
            i++;
        }
    }

    static NameSpace getClassNameSpace(NameSpace nameSpace) {
        if (nameSpace.isClass) {
            return nameSpace;
        }
        if (!nameSpace.isMethod || nameSpace.getParent() == null || !nameSpace.getParent().isClass) {
            return null;
        }
        return nameSpace.getParent();
    }

    private Object invokeLocalMethod(Interpreter interpreter, Object[] objArr, CallStack callStack, SimpleNode simpleNode) {
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("invokeLocalMethod: ");
            stringBuffer.append(this.value);
            Interpreter.debug(stringBuffer.toString());
        }
        if (interpreter != null) {
            String str = this.value;
            Class[] types = Types.getTypes(objArr);
            try {
                BshMethod method = this.namespace.getMethod(str, types);
                if (method != null) {
                    return method.invoke(objArr, interpreter, callStack, simpleNode);
                }
                interpreter.getClassManager();
                try {
                    Object command = this.namespace.getCommand(str, types, interpreter);
                    if (command == null) {
                        try {
                            BshMethod method2 = this.namespace.getMethod("invoke", new Class[]{null, null});
                            if (method2 != null) {
                                return method2.invoke(new Object[]{str, objArr}, interpreter, callStack, simpleNode);
                            }
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Command not found: ");
                            stringBuffer2.append(StringUtil.methodString(str, types));
                            throw new EvalError(stringBuffer2.toString(), simpleNode, callStack);
                        } catch (UtilEvalError e) {
                            throw e.toEvalError("Local method invocation", simpleNode, callStack);
                        }
                    } else if (command instanceof BshMethod) {
                        return ((BshMethod) command).invoke(objArr, interpreter, callStack, simpleNode);
                    } else {
                        if (command instanceof Class) {
                            try {
                                return Reflect.invokeCompiledCommand((Class) command, objArr, interpreter, callStack);
                            } catch (UtilEvalError e2) {
                                throw e2.toEvalError("Error invoking compiled command: ", simpleNode, callStack);
                            }
                        } else {
                            throw new InterpreterError("invalid command type");
                        }
                    }
                } catch (UtilEvalError e3) {
                    throw e3.toEvalError("Error loading command: ", simpleNode, callStack);
                }
            } catch (UtilEvalError e4) {
                throw e4.toEvalError("Local method invocation", simpleNode, callStack);
            }
        } else {
            throw new InterpreterError("invokeLocalMethod: interpreter = null");
        }
    }

    public static boolean isCompound(String str) {
        return str.indexOf(46) != -1;
    }

    static String prefix(String str) {
        if (!isCompound(str)) {
            return null;
        }
        return prefix(str, countParts(str) - 1);
    }

    static String prefix(String str, int i) {
        if (i < 1) {
            return null;
        }
        int i2 = -1;
        int i3 = 0;
        do {
            i2 = str.indexOf(46, i2 + 1);
            if (i2 == -1) {
                break;
            }
            i3++;
        } while (i3 < i);
        return i2 == -1 ? str : str.substring(0, i2);
    }

    private void reset() {
        this.evalName = this.value;
        this.evalBaseObject = null;
        this.callstackDepth = 0;
    }

    static String suffix(String str) {
        if (!isCompound(str)) {
            return null;
        }
        return suffix(str, countParts(str) - 1);
    }

    public static String suffix(String str, int i) {
        if (i < 1) {
            return null;
        }
        int i2 = 0;
        int length = str.length() + 1;
        do {
            length = str.lastIndexOf(46, length - 1);
            if (length == -1) {
                break;
            }
            i2++;
        } while (i2 < i);
        return length == -1 ? str : str.substring(length + 1);
    }

    public Object invokeMethod(Interpreter interpreter, Object[] objArr, CallStack callStack, SimpleNode simpleNode) {
        NameSpace classNameSpace;
        String suffix = suffix(this.value, 1);
        BshClassManager classManager = interpreter.getClassManager();
        NameSpace pVar = callStack.top();
        Class cls = this.classOfStaticMethod;
        if (cls != null) {
            return Reflect.invokeStaticMethod(classManager, cls, suffix, objArr);
        }
        if (!isCompound(this.value)) {
            return invokeLocalMethod(interpreter, objArr, callStack, simpleNode);
        }
        String prefix = prefix(this.value);
        if (prefix.equals("super") && countParts(this.value) == 2 && (classNameSpace = getClassNameSpace(pVar.getThis(interpreter).getNameSpace())) != null) {
            return ClassGenerator.getClassGenerator().invokeSuperclassMethod(classManager, classNameSpace.getClassInstance(), suffix, objArr);
        }
        Name nameResolver = pVar.getNameResolver(prefix);
        Object object = nameResolver.toObject(callStack, interpreter);
        if (object == Primitive.VOID) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attempt to resolve method: ");
            stringBuffer.append(suffix);
            stringBuffer.append("() on undefined variable or class name: ");
            stringBuffer.append(nameResolver);
            throw new UtilEvalError(stringBuffer.toString());
        } else if (!(object instanceof ClassIdentifier)) {
            if (object instanceof Primitive) {
                if (object == Primitive.NULL) {
                    throw new UtilTargetError(new NullPointerException("Null Pointer in Method Invocation"));
                } else if (Interpreter.DEBUG) {
                    Interpreter.debug("Attempt to access method on primitive... allowing bsh.Primitive to peek through for debugging");
                }
            }
            return Reflect.invokeObjectMethod(object, suffix, objArr, interpreter, callStack, simpleNode);
        } else {
            if (Interpreter.DEBUG) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("invokeMethod: trying static - ");
                stringBuffer2.append(nameResolver);
                Interpreter.debug(stringBuffer2.toString());
            }
            Class targetClass = ((ClassIdentifier) object).getTargetClass();
            this.classOfStaticMethod = targetClass;
            if (targetClass != null) {
                return Reflect.invokeStaticMethod(classManager, targetClass, suffix, objArr);
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("invokeMethod: unknown target: ");
            stringBuffer3.append(nameResolver);
            throw new UtilEvalError(stringBuffer3.toString());
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x010c */
    /* access modifiers changed from: package-private */
    public Object resolveThisFieldReference(CallStack callStack, NameSpace nameSpace, Interpreter interpreter, String str, boolean z) {
        Object obj;
        if (str.equals("this")) {
            if (!z) {
                This r6 = nameSpace.getThis(interpreter);
                NameSpace classNameSpace = getClassNameSpace(r6.getNameSpace());
                return classNameSpace != null ? isCompound(this.evalName) ? classNameSpace.getThis(interpreter) : classNameSpace.getClassInstance() : r6;
            }
            throw new UtilEvalError("Redundant to call .this on This type");
        } else if (str.equals("super")) {
            This r62 = nameSpace.getSuper(interpreter);
            NameSpace nameSpace2 = r62.getNameSpace();
            return (nameSpace2.getParent() == null || !nameSpace2.getParent().isClass) ? r62 : nameSpace2.getParent().getThis(interpreter);
        } else {
            Object obj2 = null;
            if (str.equals("global")) {
                obj2 = nameSpace.getGlobal(interpreter);
            }
            if (obj2 == null && z) {
                if (str.equals("namespace")) {
                    obj2 = nameSpace;
                } else if (str.equals("variables")) {
                    obj2 = nameSpace.getVariableNames();
                } else if (str.equals("methods")) {
                    obj2 = nameSpace.getMethodNames();
                } else if (str.equals("interpreter")) {
                    if (this.lastEvalName.equals("this")) {
                        obj2 = interpreter;
                    } else {
                        throw new UtilEvalError("Can only call .interpreter on literal 'this'");
                    }
                }
            }
            if (obj2 != null || !z || !str.equals("caller")) {
                if (obj2 != null || !z || !str.equals("callstack")) {
                    obj = obj2;
                } else {
                    obj = callStack;
                    if (!this.lastEvalName.equals("this")) {
                        throw new UtilEvalError("Can only call .callstack on literal 'this'");
                    } else if (callStack == null) {
                        throw new InterpreterError("no callstack");
                    }
                }
                if (obj == null) {
                    obj = nameSpace.getVariable(str);
                }
                if (obj != null) {
                    return obj;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("null this field ref:");
                stringBuffer.append(str);
                throw new InterpreterError(stringBuffer.toString());
            } else if (!this.lastEvalName.equals("this") && !this.lastEvalName.equals("caller")) {
                throw new UtilEvalError("Can only call .caller on literal 'this' or literal '.caller'");
            } else if (callStack != null) {
                int i = this.callstackDepth + 1;
                this.callstackDepth = i;
                return callStack.get(i).getThis(interpreter);
            } else {
                throw new InterpreterError("no callstack");
            }
        }
    }

    public synchronized Class toClass() {
        Class cls = this.asClass;
        if (cls != null) {
            return cls;
        }
        reset();
        Object obj = null;
        if (this.evalName.equals("var")) {
            this.asClass = null;
            return null;
        }
        Class cls2 = this.namespace.getClass(this.evalName);
        if (cls2 == null) {
            try {
                obj = toObject(null, null, true);
            } catch (UtilEvalError unused) {
            }
            if (obj instanceof ClassIdentifier) {
                cls2 = ((ClassIdentifier) obj).getTargetClass();
            }
        }
        if (cls2 != null) {
            this.asClass = cls2;
            return cls2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Class: ");
        stringBuffer.append(this.value);
        stringBuffer.append(" not found in namespace");
        throw new ClassNotFoundException(stringBuffer.toString());
    }

    public synchronized LHS toLHS(CallStack callStack, Interpreter interpreter) {
        reset();
        boolean z = false;
        if (isCompound(this.evalName)) {
            Object obj = null;
            while (true) {
                try {
                    String str = this.evalName;
                    if (str == null) {
                        break;
                    } else if (!isCompound(str)) {
                        break;
                    } else {
                        obj = consumeNextObjectField(callStack, interpreter, false, true);
                    }
                } catch (UtilEvalError e) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("LHS evaluation: ");
                    stringBuffer.append(e.getMessage());
                    throw new UtilEvalError(stringBuffer.toString());
                }
            }
            String str2 = this.evalName;
            if (str2 == null && (obj instanceof ClassIdentifier)) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Can't assign to class: ");
                stringBuffer2.append(this.value);
                throw new UtilEvalError(stringBuffer2.toString());
            } else if (obj == null) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Error in LHS: ");
                stringBuffer3.append(this.value);
                throw new UtilEvalError(stringBuffer3.toString());
            } else if (obj instanceof This) {
                if (str2.equals("namespace") || this.evalName.equals("variables") || this.evalName.equals("methods") || this.evalName.equals("caller")) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Can't assign to special variable: ");
                    stringBuffer4.append(this.evalName);
                    throw new UtilEvalError(stringBuffer4.toString());
                }
                Interpreter.debug("found This reference evaluating LHS");
                if (!this.lastEvalName.equals("super")) {
                    z = true;
                }
                return new LHS(((This) obj).namespace, this.evalName, z);
            } else if (str2 != null) {
                try {
                    if (obj instanceof ClassIdentifier) {
                        return Reflect.getLHSStaticField(((ClassIdentifier) obj).getTargetClass(), this.evalName);
                    }
                    return Reflect.getLHSObjectField(obj, str2);
                } catch (ReflectError e2) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("Field access: ");
                    stringBuffer5.append(e2);
                    throw new UtilEvalError(stringBuffer5.toString());
                }
            } else {
                throw new InterpreterError("Internal error in lhs...");
            }
        } else if (!this.evalName.equals("this")) {
            return new LHS(this.namespace, this.evalName, false);
        } else {
            throw new UtilEvalError("Can't assign to 'this'.");
        }
    }

    public Object toObject(CallStack callStack, Interpreter interpreter) {
        return toObject(callStack, interpreter, false);
    }

    public synchronized Object toObject(CallStack callStack, Interpreter interpreter, boolean z) {
        Object obj;
        reset();
        obj = null;
        while (this.evalName != null) {
            obj = consumeNextObjectField(callStack, interpreter, z, false);
        }
        if (obj == null) {
            throw new InterpreterError("null value in toObject()");
        }
        return obj;
    }

    public String toString() {
        return this.value;
    }
}
