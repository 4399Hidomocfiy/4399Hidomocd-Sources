package bsh;

import android.support.p009v4.view.InputDeviceCompat;
import bsh.ClassGeneratorImpl;
import bsh.org.objectweb.asm.ClassWriter;
import bsh.org.objectweb.asm.CodeVisitor;
import bsh.org.objectweb.asm.Constants;
import bsh.org.objectweb.asm.Label;
import bsh.org.objectweb.asm.Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ClassGeneratorUtil implements Constants {
    static final String BSHCONSTRUCTORS = "_bshConstructors";
    static final String BSHINIT = "_bshInstanceInitializer";
    static final String BSHSTATIC = "_bshStatic";
    static final String BSHSUPER = "_bshSuper";
    static final String BSHTHIS = "_bshThis";
    static final int DEFAULTCONSTRUCTOR = -1;
    static final String OBJECT = "Ljava/lang/Object;";
    static /* synthetic */ Class array$Ljava$lang$Object;
    static /* synthetic */ Class class$bsh$CallStack;
    static /* synthetic */ Class class$bsh$Interpreter;
    static /* synthetic */ Class class$bsh$SimpleNode;
    static /* synthetic */ Class class$java$lang$Object;
    static /* synthetic */ Class class$java$lang$String;
    Modifiers classModifiers;
    String className;
    NameSpace classStaticNameSpace;
    DelayedEvalBshMethod[] constructors;
    String fqClassName;
    Class[] interfaces;
    boolean isInterface;
    DelayedEvalBshMethod[] methods;
    Class superClass;
    String superClassName;
    Constructor[] superConstructors;
    Variable[] vars;

    public static class ConstructorArgs {
        public static ConstructorArgs DEFAULT = new ConstructorArgs();
        int arg = 0;
        Object[] args;
        public int selector = -1;

        ConstructorArgs() {
        }

        ConstructorArgs(int i, Object[] objArr) {
            this.selector = i;
            this.args = objArr;
        }

        public boolean getBoolean() {
            return ((Boolean) next()).booleanValue();
        }

        public byte getByte() {
            return ((Byte) next()).byteValue();
        }

        public char getChar() {
            return ((Character) next()).charValue();
        }

        public double getDouble() {
            return ((Double) next()).doubleValue();
        }

        public float getFloat() {
            return ((Float) next()).floatValue();
        }

        public int getInt() {
            return ((Integer) next()).intValue();
        }

        public long getLong() {
            return ((Long) next()).longValue();
        }

        public Object getObject() {
            return next();
        }

        public short getShort() {
            return ((Short) next()).shortValue();
        }

        /* access modifiers changed from: package-private */
        public Object next() {
            Object[] objArr = this.args;
            int i = this.arg;
            this.arg = i + 1;
            return objArr[i];
        }
    }

    public ClassGeneratorUtil(Modifiers modifiers, String str, String str2, Class cls, Class[] clsArr, Variable[] variableArr, DelayedEvalBshMethod[] delayedEvalBshMethodArr, NameSpace nameSpace, boolean z) {
        this.classModifiers = modifiers;
        this.className = str;
        if (str2 != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2.replace('.', '/'));
            stringBuffer.append("/");
            stringBuffer.append(str);
            this.fqClassName = stringBuffer.toString();
        } else {
            this.fqClassName = str;
        }
        if (cls == null) {
            Class cls2 = class$java$lang$Object;
            if (cls2 == null) {
                cls2 = class$("java.lang.Object");
                class$java$lang$Object = cls2;
            }
            cls = cls2;
        }
        this.superClass = cls;
        this.superClassName = Type.getInternalName(cls);
        this.interfaces = clsArr == null ? new Class[0] : clsArr;
        this.vars = variableArr;
        this.classStaticNameSpace = nameSpace;
        this.superConstructors = cls.getDeclaredConstructors();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String baseName = getBaseName(str);
        for (int i = 0; i < delayedEvalBshMethodArr.length; i++) {
            if (delayedEvalBshMethodArr[i].getName().equals(baseName)) {
                arrayList.add(delayedEvalBshMethodArr[i]);
            } else {
                arrayList2.add(delayedEvalBshMethodArr[i]);
            }
        }
        this.constructors = (DelayedEvalBshMethod[]) arrayList.toArray(new DelayedEvalBshMethod[0]);
        this.methods = (DelayedEvalBshMethod[]) arrayList2.toArray(new DelayedEvalBshMethod[0]);
        try {
            nameSpace.setLocalVariable(BSHCONSTRUCTORS, this.constructors, false);
            this.isInterface = z;
        } catch (UtilEvalError unused) {
            throw new InterpreterError("can't set cons var");
        }
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static String descriptorToClassName(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : str.substring(1, str.length() - 1);
    }

    static void doSwitchBranch(int i, String str, String[] strArr, Label label, Label[] labelArr, int i2, CodeVisitor codeVisitor) {
        codeVisitor.visitLabel(labelArr[i]);
        codeVisitor.visitVarInsn(25, 0);
        for (String str2 : strArr) {
            String str3 = str2.equals("Z") ? "getBoolean" : str2.equals("B") ? "getByte" : str2.equals("C") ? "getChar" : str2.equals("S") ? "getShort" : str2.equals("I") ? "getInt" : str2.equals("J") ? "getLong" : str2.equals("D") ? "getDouble" : str2.equals("F") ? "getFloat" : "getObject";
            codeVisitor.visitVarInsn(25, i2);
            String str4 = str3.equals("getObject") ? OBJECT : str2;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("()");
            stringBuffer.append(str4);
            codeVisitor.visitMethodInsn(Constants.INVOKEVIRTUAL, "bsh/ClassGeneratorUtil$ConstructorArgs", str3, stringBuffer.toString());
            if (str3.equals("getObject")) {
                codeVisitor.visitTypeInsn(Constants.CHECKCAST, descriptorToClassName(str2));
            }
        }
        codeVisitor.visitMethodInsn(Constants.INVOKESPECIAL, str, "<init>", getMethodDescriptor("V", strArr));
        codeVisitor.visitJumpInsn(Constants.GOTO, label);
    }

    static void generateField(String str, String str2, int i, ClassWriter classWriter) {
        classWriter.visitField(i, str, str2, null);
    }

    static void generateMethod(String str, String str2, String str3, String str4, String[] strArr, int i, ClassWriter classWriter) {
        String str5;
        StringBuffer stringBuffer;
        int i2;
        boolean z = (i & 8) != 0;
        if (str4 == null) {
            str4 = OBJECT;
        }
        CodeVisitor visitMethod = classWriter.visitMethod(i, str3, getMethodDescriptor(str4, strArr), null);
        if ((i & 1024) == 0) {
            if (z) {
                i2 = Constants.GETSTATIC;
                stringBuffer = new StringBuffer();
                str5 = BSHSTATIC;
            } else {
                visitMethod.visitVarInsn(25, 0);
                i2 = Constants.GETFIELD;
                stringBuffer = new StringBuffer();
                str5 = BSHTHIS;
            }
            stringBuffer.append(str5);
            stringBuffer.append(str);
            visitMethod.visitFieldInsn(i2, str2, stringBuffer.toString(), "Lbsh/This;");
            visitMethod.visitLdcInsn(str3);
            generateParameterReifierCode(strArr, z, visitMethod);
            visitMethod.visitInsn(1);
            visitMethod.visitInsn(1);
            visitMethod.visitInsn(1);
            visitMethod.visitInsn(4);
            Class cls = class$java$lang$Object;
            if (cls == null) {
                cls = class$("java.lang.Object");
                class$java$lang$Object = cls;
            }
            Type type = Type.getType(cls);
            Type[] typeArr = new Type[6];
            Class cls2 = class$java$lang$String;
            if (cls2 == null) {
                cls2 = class$("java.lang.String");
                class$java$lang$String = cls2;
            }
            typeArr[0] = Type.getType(cls2);
            Class cls3 = array$Ljava$lang$Object;
            if (cls3 == null) {
                cls3 = class$("[Ljava.lang.Object;");
                array$Ljava$lang$Object = cls3;
            }
            typeArr[1] = Type.getType(cls3);
            Class cls4 = class$bsh$Interpreter;
            if (cls4 == null) {
                cls4 = class$("bsh.Interpreter");
                class$bsh$Interpreter = cls4;
            }
            typeArr[2] = Type.getType(cls4);
            Class cls5 = class$bsh$CallStack;
            if (cls5 == null) {
                cls5 = class$("bsh.CallStack");
                class$bsh$CallStack = cls5;
            }
            typeArr[3] = Type.getType(cls5);
            Class cls6 = class$bsh$SimpleNode;
            if (cls6 == null) {
                cls6 = class$("bsh.SimpleNode");
                class$bsh$SimpleNode = cls6;
            }
            typeArr[4] = Type.getType(cls6);
            typeArr[5] = Type.getType(Boolean.TYPE);
            visitMethod.visitMethodInsn(Constants.INVOKEVIRTUAL, "bsh/This", "invokeMethod", Type.getMethodDescriptor(type, typeArr));
            visitMethod.visitMethodInsn(Constants.INVOKESTATIC, "bsh/Primitive", "unwrap", "(Ljava/lang/Object;)Ljava/lang/Object;");
            generateReturnCode(str4, visitMethod);
            visitMethod.visitMaxs(20, 20);
        }
    }

    public static void generateParameterReifierCode(String[] strArr, boolean z, CodeVisitor codeVisitor) {
        codeVisitor.visitIntInsn(17, strArr.length);
        codeVisitor.visitTypeInsn(Constants.ANEWARRAY, "java/lang/Object");
        int i = !z ? 1 : 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            codeVisitor.visitInsn(89);
            codeVisitor.visitIntInsn(17, i2);
            if (isPrimitive(str)) {
                int i3 = str.equals("F") ? 23 : str.equals("D") ? 24 : str.equals("J") ? 22 : 21;
                codeVisitor.visitTypeInsn(Constants.NEW, "bsh/Primitive");
                codeVisitor.visitInsn(89);
                codeVisitor.visitVarInsn(i3, i);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("(");
                stringBuffer.append(str);
                stringBuffer.append(")V");
                codeVisitor.visitMethodInsn(Constants.INVOKESPECIAL, "bsh/Primitive", "<init>", stringBuffer.toString());
            } else {
                codeVisitor.visitVarInsn(25, i);
            }
            codeVisitor.visitInsn(83);
            i += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    static void generatePlainReturnCode(String str, CodeVisitor codeVisitor) {
        int i;
        if (str.equals("V")) {
            i = Constants.RETURN;
        } else if (isPrimitive(str)) {
            int i2 = Constants.IRETURN;
            if (str.equals("D")) {
                i2 = Constants.DRETURN;
            } else if (str.equals("F")) {
                i2 = Constants.FRETURN;
            } else if (str.equals("J")) {
                i2 = Constants.LRETURN;
            }
            codeVisitor.visitInsn(i2);
            return;
        } else {
            codeVisitor.visitTypeInsn(Constants.CHECKCAST, descriptorToClassName(str));
            i = Constants.ARETURN;
        }
        codeVisitor.visitInsn(i);
    }

    public static void generateReturnCode(String str, CodeVisitor codeVisitor) {
        int i;
        String str2;
        String str3;
        if (str.equals("V")) {
            codeVisitor.visitInsn(87);
            i = Constants.RETURN;
        } else if (isPrimitive(str)) {
            int i2 = Constants.IRETURN;
            if (str.equals("B")) {
                str3 = "java/lang/Byte";
                str2 = "byteValue";
            } else if (str.equals("I")) {
                str3 = "java/lang/Integer";
                str2 = "intValue";
            } else if (str.equals("Z")) {
                str3 = "java/lang/Boolean";
                str2 = "booleanValue";
            } else if (str.equals("D")) {
                i2 = Constants.DRETURN;
                str3 = "java/lang/Double";
                str2 = "doubleValue";
            } else if (str.equals("F")) {
                i2 = Constants.FRETURN;
                str3 = "java/lang/Float";
                str2 = "floatValue";
            } else if (str.equals("J")) {
                i2 = Constants.LRETURN;
                str3 = "java/lang/Long";
                str2 = "longValue";
            } else if (str.equals("C")) {
                str3 = "java/lang/Character";
                str2 = "charValue";
            } else {
                str3 = "java/lang/Short";
                str2 = "shortValue";
            }
            codeVisitor.visitTypeInsn(Constants.CHECKCAST, str3);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("()");
            stringBuffer.append(str);
            codeVisitor.visitMethodInsn(Constants.INVOKEVIRTUAL, str3, str2, stringBuffer.toString());
            codeVisitor.visitInsn(i2);
            return;
        } else {
            codeVisitor.visitTypeInsn(Constants.CHECKCAST, descriptorToClassName(str));
            i = Constants.ARETURN;
        }
        codeVisitor.visitInsn(i);
    }

    static void generateSuperDelegateMethod(String str, String str2, String str3, String[] strArr, int i, ClassWriter classWriter) {
        if (str3 == null) {
            str3 = OBJECT;
        }
        String methodDescriptor = getMethodDescriptor(str3, strArr);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(BSHSUPER);
        stringBuffer.append(str2);
        CodeVisitor visitMethod = classWriter.visitMethod(i, stringBuffer.toString(), methodDescriptor, null);
        visitMethod.visitVarInsn(25, 0);
        int i2 = 1;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (isPrimitive(strArr[i3])) {
                visitMethod.visitVarInsn(21, i2);
            } else {
                visitMethod.visitVarInsn(25, i2);
            }
            i2 += (strArr[i3].equals("D") || strArr[i3].equals("J")) ? 2 : 1;
        }
        visitMethod.visitMethodInsn(Constants.INVOKESPECIAL, str, str2, methodDescriptor);
        generatePlainReturnCode(str3, visitMethod);
        visitMethod.visitMaxs(20, 20);
    }

    static int getASMModifiers(Modifiers modifiers) {
        int i = 0;
        if (modifiers == null) {
            return 0;
        }
        if (modifiers.hasModifier("public")) {
            i = 1;
        }
        if (modifiers.hasModifier("protected")) {
            i += 4;
        }
        if (modifiers.hasModifier("static")) {
            i += 8;
        }
        if (modifiers.hasModifier("synchronized")) {
            i += 32;
        }
        return modifiers.hasModifier("abstract") ? i + 1024 : i;
    }

    private static String getBaseName(String str) {
        int indexOf = str.indexOf("$");
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }

    static This getClassInstanceThis(Object obj, String str) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(BSHTHIS);
            stringBuffer.append(str);
            return (This) Primitive.unwrap(Reflect.getObjectFieldValue(obj, stringBuffer.toString()));
        } catch (Exception e) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Generated class: Error getting This");
            stringBuffer2.append(e);
            throw new InterpreterError(stringBuffer2.toString());
        }
    }

    static This getClassStaticThis(Class cls, String str) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(BSHSTATIC);
            stringBuffer.append(str);
            return (This) Reflect.getStaticFieldValue(cls, stringBuffer.toString());
        } catch (Exception e) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Unable to get class static space: ");
            stringBuffer2.append(e);
            throw new InterpreterError(stringBuffer2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static bsh.ClassGeneratorUtil.ConstructorArgs getConstructorArgs(java.lang.String r16, bsh.This r17, java.lang.Object[] r18, int r19) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.ClassGeneratorUtil.getConstructorArgs(java.lang.String, bsh.This, java.lang.Object[], int):bsh.ClassGeneratorUtil$ConstructorArgs");
    }

    static String getMethodDescriptor(String str, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer("(");
        for (String str2 : strArr) {
            stringBuffer.append(str2);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(")");
        stringBuffer2.append(str);
        stringBuffer.append(stringBuffer2.toString());
        return stringBuffer.toString();
    }

    static String[] getTypeDescriptors(Class[] clsArr) {
        int length = clsArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = BSHType.getTypeDescriptor(clsArr[i]);
        }
        return strArr;
    }

    public static void initInstance(Object obj, String str, Object[] objArr) {
        NameSpace nameSpace;
        Interpreter interpreter;
        Class[] types = Types.getTypes(objArr);
        CallStack callStack = new CallStack();
        This classInstanceThis = getClassInstanceThis(obj, str);
        if (classInstanceThis == null) {
            This classStaticThis = getClassStaticThis(obj.getClass(), str);
            interpreter = classStaticThis.declaringInterpreter;
            try {
                BSHBlock bSHBlock = (BSHBlock) classStaticThis.getNameSpace().getVariable(BSHINIT);
                nameSpace = new NameSpace(classStaticThis.getNameSpace(), str);
                nameSpace.isClass = true;
                This r1 = nameSpace.getThis(interpreter);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(BSHTHIS);
                    stringBuffer.append(str);
                    Reflect.getLHSObjectField(obj, stringBuffer.toString()).assign(r1, false);
                    nameSpace.setClassInstance(obj);
                    callStack.push(nameSpace);
                    try {
                        bSHBlock.evalBlock(callStack, interpreter, true, ClassGeneratorImpl.ClassNodeFilter.CLASSINSTANCE);
                        callStack.pop();
                    } catch (Exception e) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Error in class initialization: ");
                        stringBuffer2.append(e);
                        throw new InterpreterError(stringBuffer2.toString());
                    }
                } catch (Exception e2) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Error in class gen setup: ");
                    stringBuffer3.append(e2);
                    throw new InterpreterError(stringBuffer3.toString());
                }
            } catch (Exception e3) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("unable to get instance initializer: ");
                stringBuffer4.append(e3);
                throw new InterpreterError(stringBuffer4.toString());
            }
        } else {
            Interpreter interpreter2 = classInstanceThis.declaringInterpreter;
            nameSpace = classInstanceThis.getNameSpace();
            interpreter = interpreter2;
        }
        try {
            BshMethod method = nameSpace.getMethod(getBaseName(str), types, true);
            if (objArr.length > 0) {
                if (method == null) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("Can't find constructor: ");
                    stringBuffer5.append(str);
                    throw new InterpreterError(stringBuffer5.toString());
                }
            }
            if (method != null) {
                method.invoke(objArr, interpreter, callStack, null, false);
            }
        } catch (Exception e4) {
            e = e4;
            if (e instanceof TargetError) {
                e = (Exception) ((TargetError) e).getTarget();
            }
            if (e instanceof InvocationTargetException) {
                e = (Exception) ((InvocationTargetException) e).getTargetException();
            }
            e.printStackTrace(System.err);
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("Error in class initialization: ");
            stringBuffer6.append(e);
            throw new InterpreterError(stringBuffer6.toString());
        }
    }

    private static boolean isPrimitive(String str) {
        return str.length() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean classContainsMethod(Class cls, String str, String[] strArr) {
        boolean z;
        while (cls != null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (int i = 0; i < declaredMethods.length; i++) {
                if (declaredMethods[i].getName().equals(str)) {
                    String[] typeDescriptors = getTypeDescriptors(declaredMethods[i].getParameterTypes());
                    int i2 = 0;
                    while (true) {
                        if (i2 >= typeDescriptors.length) {
                            z = true;
                            break;
                        } else if (!strArr[i2].equals(typeDescriptors[i2])) {
                            z = false;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    public byte[] generateClass() {
        int aSMModifiers = getASMModifiers(this.classModifiers) | 1;
        if (this.isInterface) {
            aSMModifiers |= 512;
        }
        String[] strArr = new String[this.interfaces.length];
        int i = 0;
        while (true) {
            Class[] clsArr = this.interfaces;
            if (i >= clsArr.length) {
                break;
            }
            strArr[i] = Type.getInternalName(clsArr[i]);
            i++;
        }
        ClassWriter classWriter = new ClassWriter(false);
        classWriter.visit(aSMModifiers, this.fqClassName, this.superClassName, strArr, "BeanShell Generated via ASM (www.objectweb.org)");
        if (!this.isInterface) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(BSHTHIS);
            stringBuffer.append(this.className);
            generateField(stringBuffer.toString(), "Lbsh/This;", 1, classWriter);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(BSHSTATIC);
            stringBuffer2.append(this.className);
            generateField(stringBuffer2.toString(), "Lbsh/This;", 9, classWriter);
        }
        int i2 = 0;
        while (true) {
            Variable[] variableArr = this.vars;
            if (i2 >= variableArr.length) {
                break;
            }
            String typeDescriptor = variableArr[i2].getTypeDescriptor();
            if (!this.vars[i2].hasModifier("private") && typeDescriptor != null) {
                generateField(this.vars[i2].getName(), typeDescriptor, this.isInterface ? 25 : getASMModifiers(this.vars[i2].getModifiers()), classWriter);
            }
            i2++;
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            DelayedEvalBshMethod[] delayedEvalBshMethodArr = this.constructors;
            if (i3 >= delayedEvalBshMethodArr.length) {
                break;
            }
            if (!delayedEvalBshMethodArr[i3].hasModifier("private")) {
                generateConstructor(i3, this.constructors[i3].getParamTypeDescriptors(), getASMModifiers(this.constructors[i3].getModifiers()), classWriter);
                z = true;
            }
            i3++;
        }
        if (!this.isInterface && !z) {
            generateConstructor(-1, new String[0], 1, classWriter);
        }
        int i4 = 0;
        while (true) {
            DelayedEvalBshMethod[] delayedEvalBshMethodArr2 = this.methods;
            if (i4 >= delayedEvalBshMethodArr2.length) {
                return classWriter.toByteArray();
            }
            String returnTypeDescriptor = delayedEvalBshMethodArr2[i4].getReturnTypeDescriptor();
            if (!this.methods[i4].hasModifier("private")) {
                int aSMModifiers2 = getASMModifiers(this.methods[i4].getModifiers());
                if (this.isInterface) {
                    aSMModifiers2 |= InputDeviceCompat.SOURCE_GAMEPAD;
                }
                generateMethod(this.className, this.fqClassName, this.methods[i4].getName(), returnTypeDescriptor, this.methods[i4].getParamTypeDescriptors(), aSMModifiers2, classWriter);
                boolean z2 = (aSMModifiers2 & 8) > 0;
                boolean classContainsMethod = classContainsMethod(this.superClass, this.methods[i4].getName(), this.methods[i4].getParamTypeDescriptors());
                if (!z2 && classContainsMethod) {
                    generateSuperDelegateMethod(this.superClassName, this.methods[i4].getName(), returnTypeDescriptor, this.methods[i4].getParamTypeDescriptors(), aSMModifiers2, classWriter);
                }
            }
            i4++;
        }
    }

    /* access modifiers changed from: package-private */
    public void generateConstructor(int i, String[] strArr, int i2, ClassWriter classWriter) {
        int length = strArr.length + 1;
        CodeVisitor visitMethod = classWriter.visitMethod(i2, "<init>", getMethodDescriptor("V", strArr), null);
        generateParameterReifierCode(strArr, false, visitMethod);
        visitMethod.visitVarInsn(58, length);
        generateConstructorSwitch(i, length, strArr.length + 2, visitMethod);
        visitMethod.visitVarInsn(25, 0);
        visitMethod.visitLdcInsn(this.className);
        visitMethod.visitVarInsn(25, length);
        visitMethod.visitMethodInsn(Constants.INVOKESTATIC, "bsh/ClassGeneratorUtil", "initInstance", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V");
        visitMethod.visitInsn(Constants.RETURN);
        visitMethod.visitMaxs(20, 20);
    }

    /* access modifiers changed from: package-private */
    public void generateConstructorSwitch(int i, int i2, int i3, CodeVisitor codeVisitor) {
        Label label = new Label();
        Label label2 = new Label();
        int length = this.superConstructors.length + this.constructors.length;
        Label[] labelArr = new Label[length];
        for (int i4 = 0; i4 < length; i4++) {
            labelArr[i4] = new Label();
        }
        codeVisitor.visitLdcInsn(this.superClass.getName());
        String str = this.fqClassName;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(BSHSTATIC);
        stringBuffer.append(this.className);
        codeVisitor.visitFieldInsn(Constants.GETSTATIC, str, stringBuffer.toString(), "Lbsh/This;");
        codeVisitor.visitVarInsn(25, i2);
        codeVisitor.visitIntInsn(16, i);
        codeVisitor.visitMethodInsn(Constants.INVOKESTATIC, "bsh/ClassGeneratorUtil", "getConstructorArgs", "(Ljava/lang/String;Lbsh/This;[Ljava/lang/Object;I)Lbsh/ClassGeneratorUtil$ConstructorArgs;");
        codeVisitor.visitVarInsn(58, i3);
        codeVisitor.visitVarInsn(25, i3);
        codeVisitor.visitFieldInsn(Constants.GETFIELD, "bsh/ClassGeneratorUtil$ConstructorArgs", "selector", "I");
        codeVisitor.visitTableSwitchInsn(0, length - 1, label, labelArr);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            Constructor[] constructorArr = this.superConstructors;
            if (i5 >= constructorArr.length) {
                break;
            }
            doSwitchBranch(i6, this.superClassName, getTypeDescriptors(constructorArr[i5].getParameterTypes()), label2, labelArr, i3, codeVisitor);
            i5++;
            i6++;
        }
        int i7 = 0;
        while (true) {
            DelayedEvalBshMethod[] delayedEvalBshMethodArr = this.constructors;
            if (i7 >= delayedEvalBshMethodArr.length) {
                codeVisitor.visitLabel(label);
                codeVisitor.visitVarInsn(25, 0);
                codeVisitor.visitMethodInsn(Constants.INVOKESPECIAL, this.superClassName, "<init>", "()V");
                codeVisitor.visitLabel(label2);
                return;
            }
            doSwitchBranch(i6, this.fqClassName, delayedEvalBshMethodArr[i7].getParamTypeDescriptors(), label2, labelArr, i3, codeVisitor);
            i7++;
            i6++;
        }
    }
}
