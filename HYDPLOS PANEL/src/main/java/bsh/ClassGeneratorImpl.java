package bsh;

import bsh.BSHBlock;
import bsh.Capabilities;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ClassGeneratorImpl extends ClassGenerator {

    /* access modifiers changed from: package-private */
    public static class ClassNodeFilter implements BSHBlock.NodeFilter {
        public static ClassNodeFilter CLASSCLASSES = new ClassNodeFilter(2);
        public static final int CLASSES = 2;
        public static ClassNodeFilter CLASSINSTANCE = new ClassNodeFilter(1);
        public static ClassNodeFilter CLASSSTATIC = new ClassNodeFilter(0);
        public static final int INSTANCE = 1;
        public static final int STATIC = 0;
        int context;

        private ClassNodeFilter(int i) {
            this.context = i;
        }

        /* access modifiers changed from: package-private */
        public boolean isStatic(SimpleNode simpleNode) {
            if (simpleNode instanceof BSHTypedVariableDeclaration) {
                Modifiers modifiers = ((BSHTypedVariableDeclaration) simpleNode).modifiers;
                return modifiers != null && modifiers.hasModifier("static");
            } else if (simpleNode instanceof BSHMethodDeclaration) {
                Modifiers modifiers2 = ((BSHMethodDeclaration) simpleNode).modifiers;
                return modifiers2 != null && modifiers2.hasModifier("static");
            } else {
                boolean z = simpleNode instanceof BSHBlock;
                return false;
            }
        }

        @Override // bsh.BSHBlock.NodeFilter
        public boolean isVisible(SimpleNode simpleNode) {
            int i = this.context;
            if (i == 2) {
                return simpleNode instanceof BSHClassDeclaration;
            }
            if (simpleNode instanceof BSHClassDeclaration) {
                return false;
            }
            if (i == 0) {
                return isStatic(simpleNode);
            }
            if (i == 1) {
                return !isStatic(simpleNode);
            }
            return true;
        }
    }

    public static Class generateClassImpl(String str, Modifiers modifiers, Class[] clsArr, Class cls, BSHBlock bSHBlock, boolean z, CallStack callStack, Interpreter interpreter) {
        String str2;
        String str3;
        try {
            Capabilities.setAccessibility(true);
            NameSpace pVar = callStack.top();
            String str4 = pVar.getPackage();
            if (pVar.isClass) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(pVar.getName());
                stringBuffer.append("$");
                stringBuffer.append(str);
                str2 = stringBuffer.toString();
            } else {
                str2 = str;
            }
            if (str4 == null) {
                str3 = str2;
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str4);
                stringBuffer2.append(".");
                stringBuffer2.append(str2);
                str3 = stringBuffer2.toString();
            }
            BshClassManager classManager = interpreter.getClassManager();
            classManager.definingClass(str3);
            NameSpace nameSpace = new NameSpace(pVar, str2);
            nameSpace.isClass = true;
            callStack.push(nameSpace);
            bSHBlock.evalBlock(callStack, interpreter, true, ClassNodeFilter.CLASSCLASSES);
            byte[] generateClass = new ClassGeneratorUtil(modifiers, str2, str4, cls, clsArr, getDeclaredVariables(bSHBlock, callStack, interpreter, str4), getDeclaredMethods(bSHBlock, callStack, interpreter, str4), nameSpace, z).generateClass();
            String property = System.getProperty("debugClasses");
            if (property != null) {
                try {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(property);
                    stringBuffer3.append("/");
                    stringBuffer3.append(str2);
                    stringBuffer3.append(".class");
                    FileOutputStream fileOutputStream = new FileOutputStream(stringBuffer3.toString());
                    fileOutputStream.write(generateClass);
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
            }
            Class defineClass = classManager.defineClass(str3, generateClass);
            pVar.importClass(str3.replace('$', '.'));
            try {
                nameSpace.setLocalVariable("_bshInstanceInitializer", bSHBlock, false);
                nameSpace.setClassStatic(defineClass);
                bSHBlock.evalBlock(callStack, interpreter, true, ClassNodeFilter.CLASSSTATIC);
                callStack.pop();
                if (!defineClass.isInterface()) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("_bshStatic");
                    stringBuffer4.append(str2);
                    try {
                        Reflect.getLHSStaticField(defineClass, stringBuffer4.toString()).assign(nameSpace.getThis(interpreter), false);
                    } catch (Exception e) {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("Error in class gen setup: ");
                        stringBuffer5.append(e);
                        throw new InterpreterError(stringBuffer5.toString());
                    }
                }
                classManager.doneDefiningClass(str3);
                return defineClass;
            } catch (UtilEvalError e2) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("unable to init static: ");
                stringBuffer6.append(e2);
                throw new InterpreterError(stringBuffer6.toString());
            }
        } catch (Capabilities.Unavailable unused2) {
            throw new EvalError("Defining classes currently requires reflective Accessibility.", bSHBlock, callStack);
        }
    }

    static DelayedEvalBshMethod[] getDeclaredMethods(BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter, String str) {
        int i;
        CallStack callStack2 = callStack;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i3 < bSHBlock.jjtGetNumChildren()) {
            SimpleNode simpleNode = (SimpleNode) bSHBlock.jjtGetChild(i3);
            if (simpleNode instanceof BSHMethodDeclaration) {
                BSHMethodDeclaration bSHMethodDeclaration = (BSHMethodDeclaration) simpleNode;
                bSHMethodDeclaration.insureNodesParsed();
                Modifiers modifiers = bSHMethodDeclaration.modifiers;
                String str2 = bSHMethodDeclaration.name;
                String returnTypeDescriptor = bSHMethodDeclaration.getReturnTypeDescriptor(callStack2, interpreter, str);
                BSHReturnType returnTypeNode = bSHMethodDeclaration.getReturnTypeNode();
                BSHFormalParameters bSHFormalParameters = bSHMethodDeclaration.paramsNode;
                i = i3;
                arrayList.add(new DelayedEvalBshMethod(str2, returnTypeDescriptor, returnTypeNode, bSHMethodDeclaration.paramsNode.getParamNames(), bSHFormalParameters.getTypeDescriptors(callStack2, interpreter, str), bSHFormalParameters, bSHMethodDeclaration.blockNode, null, modifiers, callStack, interpreter));
            } else {
                i = i3;
            }
            i3 = i + 1;
            callStack2 = callStack;
            i2 = 0;
        }
        return (DelayedEvalBshMethod[]) arrayList.toArray(new DelayedEvalBshMethod[i2]);
    }

    static Variable[] getDeclaredVariables(BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter, String str) {
        BSHVariableDeclarator[] declarators;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bSHBlock.jjtGetNumChildren(); i++) {
            SimpleNode simpleNode = (SimpleNode) bSHBlock.jjtGetChild(i);
            if (simpleNode instanceof BSHTypedVariableDeclaration) {
                BSHTypedVariableDeclaration bSHTypedVariableDeclaration = (BSHTypedVariableDeclaration) simpleNode;
                Modifiers modifiers = bSHTypedVariableDeclaration.modifiers;
                String typeDescriptor = bSHTypedVariableDeclaration.getTypeDescriptor(callStack, interpreter, str);
                for (BSHVariableDeclarator bSHVariableDeclarator : bSHTypedVariableDeclaration.getDeclarators()) {
                    try {
                        arrayList.add(new Variable(bSHVariableDeclarator.name, typeDescriptor, (Object) null, modifiers));
                    } catch (UtilEvalError unused) {
                    }
                }
            }
        }
        return (Variable[]) arrayList.toArray(new Variable[0]);
    }

    public static Object invokeSuperclassMethodImpl(BshClassManager bshClassManager, Object obj, String str, Object[] objArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("_bshSuper");
        stringBuffer.append(str);
        String stringBuffer2 = stringBuffer.toString();
        Class<?> cls = obj.getClass();
        Method resolveJavaMethod = Reflect.resolveJavaMethod(bshClassManager, cls, stringBuffer2, Types.getTypes(objArr), false);
        return resolveJavaMethod != null ? Reflect.invokeMethod(resolveJavaMethod, obj, objArr) : Reflect.invokeMethod(Reflect.resolveExpectedJavaMethod(bshClassManager, cls.getSuperclass(), obj, str, objArr, false), obj, objArr);
    }

    @Override // bsh.ClassGenerator
    public Class generateClass(String str, Modifiers modifiers, Class[] clsArr, Class cls, BSHBlock bSHBlock, boolean z, CallStack callStack, Interpreter interpreter) {
        return generateClassImpl(str, modifiers, clsArr, cls, bSHBlock, z, callStack, interpreter);
    }

    @Override // bsh.ClassGenerator
    public Object invokeSuperclassMethod(BshClassManager bshClassManager, Object obj, String str, Object[] objArr) {
        return invokeSuperclassMethodImpl(bshClassManager, obj, str, objArr);
    }

    @Override // bsh.ClassGenerator
    public void setInstanceNameSpaceParent(Object obj, String str, NameSpace nameSpace) {
        ClassGeneratorUtil.getClassInstanceThis(obj, str).getNameSpace().setParent(nameSpace);
    }
}
