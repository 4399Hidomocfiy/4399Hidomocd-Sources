package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Vector;

/* access modifiers changed from: package-private */
public class Reflect {
    Reflect() {
    }

    private static String accessorName(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(String.valueOf(Character.toUpperCase(str2.charAt(0))));
        stringBuffer.append(str2.substring(1));
        return stringBuffer.toString();
    }

    private static Vector addCandidates(Method[] methodArr, String str, int i, boolean z, Vector vector) {
        for (Method method : methodArr) {
            if (method.getName().equals(str) && method.getParameterTypes().length == i && (!z || isPublic(method))) {
                vector.add(method);
            }
        }
        return vector;
    }

    private static ReflectError cantFindConstructor(Class cls, Class[] clsArr) {
        if (clsArr.length == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't find default constructor for: ");
            stringBuffer.append(cls);
            return new ReflectError(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Can't find constructor: ");
        stringBuffer2.append(StringUtil.methodString(cls.getName(), clsArr));
        stringBuffer2.append(" in class: ");
        stringBuffer2.append(cls.getName());
        return new ReflectError(stringBuffer2.toString());
    }

    private static void checkFoundStaticMethod(Method method, boolean z, Class cls) {
        if (method != null && z && !isStatic(method)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Cannot reach instance method: ");
            stringBuffer.append(StringUtil.methodString(method.getName(), method.getParameterTypes()));
            stringBuffer.append(" from static context: ");
            stringBuffer.append(cls.getName());
            throw new UtilEvalError(stringBuffer.toString());
        }
    }

    static Object constructObject(Class cls, Object[] objArr) {
        if (!cls.isInterface()) {
            Class[] types = Types.getTypes(objArr);
            Constructor<?>[] declaredConstructors = Capabilities.haveAccessibility() ? cls.getDeclaredConstructors() : cls.getConstructors();
            if (Interpreter.DEBUG) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Looking for most specific constructor: ");
                stringBuffer.append(cls);
                Interpreter.debug(stringBuffer.toString());
            }
            Constructor findMostSpecificConstructor = findMostSpecificConstructor(types, declaredConstructors);
            if (findMostSpecificConstructor != null) {
                if (!isPublic(findMostSpecificConstructor)) {
                    try {
                        ReflectManager.RMSetAccessible(findMostSpecificConstructor);
                    } catch (UtilEvalError unused) {
                    }
                }
                try {
                    Object newInstance = findMostSpecificConstructor.newInstance(Primitive.unwrap(objArr));
                    if (newInstance != null) {
                        return newInstance;
                    }
                    throw new ReflectError("Couldn't construct the object");
                } catch (InstantiationException unused2) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("The class ");
                    stringBuffer2.append(cls);
                    stringBuffer2.append(" is abstract ");
                    throw new ReflectError(stringBuffer2.toString());
                } catch (IllegalAccessException unused3) {
                    throw new ReflectError("We don't have permission to create an instance.Use setAccessibility(true) to enable access.");
                } catch (IllegalArgumentException unused4) {
                    throw new ReflectError("The number of arguments was wrong");
                }
            } else {
                throw cantFindConstructor(cls, types);
            }
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Can't create instance of an interface: ");
            stringBuffer3.append(cls);
            throw new ReflectError(stringBuffer3.toString());
        }
    }

    private static Field findAccessibleField(Class cls, String str) {
        try {
            Field field = cls.getField(str);
            ReflectManager.RMSetAccessible(field);
            return field;
        } catch (NoSuchFieldException unused) {
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    ReflectManager.RMSetAccessible(declaredField);
                    return declaredField;
                } catch (NoSuchFieldException unused2) {
                    cls = cls.getSuperclass();
                }
            }
            throw new NoSuchFieldException(str);
        }
    }

    static Constructor findMostSpecificConstructor(Class[] clsArr, Constructor[] constructorArr) {
        int findMostSpecificConstructorIndex = findMostSpecificConstructorIndex(clsArr, constructorArr);
        if (findMostSpecificConstructorIndex == -1) {
            return null;
        }
        return constructorArr[findMostSpecificConstructorIndex];
    }

    static int findMostSpecificConstructorIndex(Class[] clsArr, Constructor[] constructorArr) {
        int length = constructorArr.length;
        Class[][] clsArr2 = new Class[length][];
        for (int i = 0; i < length; i++) {
            clsArr2[i] = constructorArr[i].getParameterTypes();
        }
        return findMostSpecificSignature(clsArr, clsArr2);
    }

    static Method findMostSpecificMethod(Class[] clsArr, Method[] methodArr) {
        Class[][] clsArr2 = new Class[methodArr.length][];
        for (int i = 0; i < methodArr.length; i++) {
            clsArr2[i] = methodArr[i].getParameterTypes();
        }
        int findMostSpecificSignature = findMostSpecificSignature(clsArr, clsArr2);
        if (findMostSpecificSignature == -1) {
            return null;
        }
        return methodArr[findMostSpecificSignature];
    }

    static int findMostSpecificSignature(Class[] clsArr, Class[][] clsArr2) {
        int i = 1;
        while (true) {
            int i2 = -1;
            if (i > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i3 = 0; i3 < clsArr2.length; i3++) {
                Class[] clsArr4 = clsArr2[i3];
                if (Types.isSignatureAssignable(clsArr, clsArr4, i) && (clsArr3 == null || Types.isSignatureAssignable(clsArr4, clsArr3, 1))) {
                    i2 = i3;
                    clsArr3 = clsArr4;
                }
            }
            if (clsArr3 != null) {
                return i2;
            }
            i++;
        }
    }

    private static Method findOverloadedMethod(Class cls, String str, Class[] clsArr, boolean z) {
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Searching for method: ");
            stringBuffer.append(StringUtil.methodString(str, clsArr));
            stringBuffer.append(" in '");
            stringBuffer.append(cls.getName());
            stringBuffer.append("'");
            Interpreter.debug(stringBuffer.toString());
        }
        Method[] candidateMethods = getCandidateMethods(cls, str, clsArr.length, z);
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Looking for most specific method: ");
            stringBuffer2.append(str);
            Interpreter.debug(stringBuffer2.toString());
        }
        return findMostSpecificMethod(clsArr, candidateMethods);
    }

    private static Vector gatherMethodsRecursive(Class cls, String str, int i, boolean z, Vector vector) {
        Class<?>[] interfaces;
        if (vector == null) {
            vector = new Vector();
        }
        if (!z) {
            addCandidates(cls.getDeclaredMethods(), str, i, z, vector);
        } else if (isPublic(cls)) {
            addCandidates(cls.getMethods(), str, i, z, vector);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            gatherMethodsRecursive(cls2, str, i, z, vector);
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            gatherMethodsRecursive(superclass, str, i, z, vector);
        }
        return vector;
    }

    public static Class getArrayBaseType(Class cls) {
        if (cls.isArray()) {
            return cls.getComponentType();
        }
        throw new ReflectError("The class is not an array.");
    }

    public static int getArrayDimensions(Class cls) {
        if (!cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    static Method[] getCandidateMethods(Class cls, String str, int i, boolean z) {
        Vector gatherMethodsRecursive = gatherMethodsRecursive(cls, str, i, z, null);
        Method[] methodArr = new Method[gatherMethodsRecursive.size()];
        gatherMethodsRecursive.copyInto(methodArr);
        return methodArr;
    }

    private static Object getFieldValue(Class cls, Object obj, String str, boolean z) {
        try {
            Field resolveExpectedJavaField = resolveExpectedJavaField(cls, str, z);
            return Primitive.wrap(resolveExpectedJavaField.get(obj), resolveExpectedJavaField.getType());
        } catch (NullPointerException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("???");
            stringBuffer.append(str);
            stringBuffer.append(" is not a static field.");
            throw new ReflectError(stringBuffer.toString());
        } catch (IllegalAccessException unused2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Can't access field: ");
            stringBuffer2.append(str);
            throw new ReflectError(stringBuffer2.toString());
        }
    }

    public static Object getIndex(Object obj, int i) {
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("getIndex: ");
            stringBuffer.append(obj);
            stringBuffer.append(", index=");
            stringBuffer.append(i);
            Interpreter.debug(stringBuffer.toString());
        }
        try {
            return Primitive.wrap(Array.get(obj, i), obj.getClass().getComponentType());
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new UtilTargetError(e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Array access:");
            stringBuffer2.append(e2);
            throw new ReflectError(stringBuffer2.toString());
        }
    }

    static LHS getLHSObjectField(Object obj, String str) {
        if (obj instanceof This) {
            return new LHS(((This) obj).namespace, str, false);
        }
        try {
            return new LHS(obj, resolveExpectedJavaField(obj.getClass(), str, false));
        } catch (ReflectError e) {
            if (hasObjectPropertySetter(obj.getClass(), str)) {
                return new LHS(obj, str);
            }
            throw e;
        }
    }

    static LHS getLHSStaticField(Class cls, String str) {
        return new LHS(resolveExpectedJavaField(cls, str, true));
    }

    public static Object getObjectFieldValue(Object obj, String str) {
        if (obj instanceof This) {
            return ((This) obj).namespace.getVariable(str);
        }
        try {
            return getFieldValue(obj.getClass(), obj, str, false);
        } catch (ReflectError e) {
            if (hasObjectPropertyGetter(obj.getClass(), str)) {
                return getObjectProperty(obj, str);
            }
            throw e;
        }
    }

    public static Object getObjectProperty(Object obj, String str) {
        Exception exc;
        Method method;
        String str2;
        Object[] objArr = new Object[0];
        Interpreter.debug("property access: ");
        Exception exc2 = null;
        try {
            method = resolveExpectedJavaMethod(null, obj.getClass(), obj, accessorName("get", str), objArr, false);
            exc = null;
        } catch (Exception e) {
            exc = e;
            method = null;
        }
        if (method == null) {
            try {
                method = resolveExpectedJavaMethod(null, obj.getClass(), obj, accessorName("is", str), objArr, false);
                if (method.getReturnType() != Boolean.TYPE) {
                    method = null;
                }
            } catch (Exception e2) {
                exc2 = e2;
            }
        }
        if (method == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Error in property getter: ");
            stringBuffer.append(exc);
            if (exc2 != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(" : ");
                stringBuffer2.append(exc2);
                str2 = stringBuffer2.toString();
            } else {
                str2 = "";
            }
            stringBuffer.append(str2);
            throw new ReflectError(stringBuffer.toString());
        }
        try {
            return invokeMethod(method, obj, objArr);
        } catch (InvocationTargetException e3) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Property accessor threw exception: ");
            stringBuffer3.append(e3.getTargetException());
            throw new UtilEvalError(stringBuffer3.toString());
        }
    }

    public static Object getStaticFieldValue(Class cls, String str) {
        return getFieldValue(cls, null, str, true);
    }

    public static boolean hasObjectPropertyGetter(Class cls, String str) {
        try {
            cls.getMethod(accessorName("get", str), new Class[0]);
            return true;
        } catch (NoSuchMethodException unused) {
            try {
                return cls.getMethod(accessorName("is", str), new Class[0]).getReturnType() == Boolean.TYPE;
            } catch (NoSuchMethodException unused2) {
                return false;
            }
        }
    }

    public static boolean hasObjectPropertySetter(Class cls, String str) {
        Method[] methods;
        String accessorName = accessorName("set", str);
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(accessorName)) {
                return true;
            }
        }
        return false;
    }

    public static Object invokeCompiledCommand(Class cls, Object[] objArr, Interpreter interpreter, CallStack callStack) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        objArr2[0] = interpreter;
        objArr2[1] = callStack;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return invokeStaticMethod(interpreter.getClassManager(), cls, "invoke", objArr2);
        } catch (InvocationTargetException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Error in compiled command: ");
            stringBuffer.append(e.getTargetException());
            throw new UtilEvalError(stringBuffer.toString());
        } catch (ReflectError e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Error invoking compiled command: ");
            stringBuffer2.append(e2);
            throw new UtilEvalError(stringBuffer2.toString());
        }
    }

    static Object invokeMethod(Method method, Object obj, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        logInvokeMethod("Invoking method (entry): ", method, objArr);
        Object[] objArr2 = new Object[objArr.length];
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < objArr.length; i++) {
            try {
                objArr2[i] = Types.castObject(objArr[i], parameterTypes[i], 1);
            } catch (UtilEvalError e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("illegal argument type in method invocation: ");
                stringBuffer.append(e);
                throw new InterpreterError(stringBuffer.toString());
            }
        }
        Object[] unwrap = Primitive.unwrap(objArr2);
        logInvokeMethod("Invoking method (after massaging values): ", method, unwrap);
        try {
            Object invoke = method.invoke(obj, unwrap);
            if (invoke == null) {
                invoke = Primitive.NULL;
            }
            return Primitive.wrap(invoke, method.getReturnType());
        } catch (IllegalAccessException e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Cannot access method ");
            stringBuffer2.append(StringUtil.methodString(method.getName(), method.getParameterTypes()));
            stringBuffer2.append(" in '");
            stringBuffer2.append(method.getDeclaringClass());
            stringBuffer2.append("' :");
            stringBuffer2.append(e2);
            throw new ReflectError(stringBuffer2.toString());
        }
    }

    public static Object invokeObjectMethod(Object obj, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, SimpleNode simpleNode) {
        BshClassManager bshClassManager;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, interpreter, callStack, simpleNode, false);
        }
        if (interpreter == null) {
            bshClassManager = null;
        } else {
            try {
                bshClassManager = interpreter.getClassManager();
            } catch (UtilEvalError e) {
                throw e.toEvalError(simpleNode, callStack);
            }
        }
        return invokeMethod(resolveExpectedJavaMethod(bshClassManager, obj.getClass(), obj, str, objArr, false), obj, objArr);
    }

    public static Object invokeStaticMethod(BshClassManager bshClassManager, Class cls, String str, Object[] objArr) {
        Interpreter.debug("invoke static Method");
        return invokeMethod(resolveExpectedJavaMethod(bshClassManager, cls, null, str, objArr, true), null, objArr);
    }

    private static boolean isPublic(Class cls) {
        return Modifier.isPublic(cls.getModifiers());
    }

    private static boolean isPublic(Constructor constructor) {
        return Modifier.isPublic(constructor.getModifiers());
    }

    private static boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private static boolean isStatic(Method method) {
        return Modifier.isStatic(method.getModifiers());
    }

    private static void logInvokeMethod(String str, Method method, Object[] objArr) {
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(method);
            stringBuffer.append(" with args:");
            Interpreter.debug(stringBuffer.toString());
            for (int i = 0; i < objArr.length; i++) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("args[");
                stringBuffer2.append(i);
                stringBuffer2.append("] = ");
                stringBuffer2.append(objArr[i]);
                stringBuffer2.append(" type = ");
                stringBuffer2.append(objArr[i].getClass());
                Interpreter.debug(stringBuffer2.toString());
            }
        }
    }

    public static String normalizeClassName(Class cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(getArrayBaseType(cls).getName());
            stringBuffer2.append(" ");
            stringBuffer.append(stringBuffer2.toString());
            for (int i = 0; i < getArrayDimensions(cls); i++) {
                stringBuffer.append("[]");
            }
        } catch (ReflectError unused) {
        }
        return stringBuffer.toString();
    }

    protected static Field resolveExpectedJavaField(Class cls, String str, boolean z) {
        try {
            Field findAccessibleField = Capabilities.haveAccessibility() ? findAccessibleField(cls, str) : cls.getField(str);
            if (!z || Modifier.isStatic(findAccessibleField.getModifiers())) {
                return findAccessibleField;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't reach instance field: ");
            stringBuffer.append(str);
            stringBuffer.append(" from static context: ");
            stringBuffer.append(cls.getName());
            throw new UtilEvalError(stringBuffer.toString());
        } catch (NoSuchFieldException unused) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("No such field: ");
            stringBuffer2.append(str);
            throw new ReflectError(stringBuffer2.toString());
        } catch (SecurityException e) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Security Exception while searching fields of: ");
            stringBuffer3.append(cls);
            throw new UtilTargetError(stringBuffer3.toString(), e);
        }
    }

    protected static Method resolveExpectedJavaMethod(BshClassManager bshClassManager, Class cls, Object obj, String str, Object[] objArr, boolean z) {
        if (obj != Primitive.NULL) {
            Class[] types = Types.getTypes(objArr);
            Method resolveJavaMethod = resolveJavaMethod(bshClassManager, cls, str, types, z);
            if (resolveJavaMethod != null) {
                return resolveJavaMethod;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(z ? "Static method " : "Method ");
            stringBuffer.append(StringUtil.methodString(str, types));
            stringBuffer.append(" not found in class'");
            stringBuffer.append(cls.getName());
            stringBuffer.append("'");
            throw new ReflectError(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Attempt to invoke method ");
        stringBuffer2.append(str);
        stringBuffer2.append(" on null value");
        throw new UtilTargetError(new NullPointerException(stringBuffer2.toString()));
    }

    protected static Field resolveJavaField(Class cls, String str, boolean z) {
        try {
            return resolveExpectedJavaField(cls, str, z);
        } catch (ReflectError unused) {
            return null;
        }
    }

    protected static Method resolveJavaMethod(BshClassManager bshClassManager, Class cls, String str, Class[] clsArr, boolean z) {
        if (cls != null) {
            Method method = null;
            if (bshClassManager == null) {
                Interpreter.debug("resolveJavaMethod UNOPTIMIZED lookup");
            } else {
                method = bshClassManager.getResolvedMethod(cls, str, clsArr, z);
            }
            if (method != null) {
                return method;
            }
            boolean z2 = !Capabilities.haveAccessibility();
            try {
                Method findOverloadedMethod = findOverloadedMethod(cls, str, clsArr, z2);
                checkFoundStaticMethod(findOverloadedMethod, z, cls);
                if (findOverloadedMethod != null && !z2) {
                    try {
                        ReflectManager.RMSetAccessible(findOverloadedMethod);
                    } catch (UtilEvalError unused) {
                    }
                }
                if (!(findOverloadedMethod == null || bshClassManager == null)) {
                    bshClassManager.cacheResolvedMethod(cls, clsArr, findOverloadedMethod);
                }
                return findOverloadedMethod;
            } catch (SecurityException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Security Exception while searching methods of: ");
                stringBuffer.append(cls);
                throw new UtilTargetError(stringBuffer.toString(), e);
            }
        } else {
            throw new InterpreterError("null class");
        }
    }

    public static void setIndex(Object obj, int i, Object obj2) {
        try {
            Array.set(obj, i, Primitive.unwrap(obj2));
        } catch (ArrayStoreException e) {
            throw new UtilTargetError(e);
        } catch (IllegalArgumentException e2) {
            throw new UtilTargetError(new ArrayStoreException(e2.toString()));
        } catch (Exception e3) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Array access:");
            stringBuffer.append(e3);
            throw new ReflectError(stringBuffer.toString());
        }
    }

    public static void setObjectProperty(Object obj, String str, Object obj2) {
        String accessorName = accessorName("set", str);
        Object[] objArr = {obj2};
        Interpreter.debug("property access: ");
        try {
            invokeMethod(resolveExpectedJavaMethod(null, obj.getClass(), obj, accessorName, objArr, false), obj, objArr);
        } catch (InvocationTargetException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Property accessor threw exception: ");
            stringBuffer.append(e.getTargetException());
            throw new UtilEvalError(stringBuffer.toString());
        }
    }
}
