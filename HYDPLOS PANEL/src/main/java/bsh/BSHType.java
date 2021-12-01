package bsh;

import bsh.BshClassManager;
import java.lang.reflect.Array;

/* access modifiers changed from: package-private */
public class BSHType extends SimpleNode implements BshClassManager.Listener {
    private int arrayDims;
    private Class baseType;
    String descriptor;
    private Class type;

    BSHType(int i) {
        super(i);
    }

    public static String getTypeDescriptor(Class cls) {
        if (cls == Boolean.TYPE) {
            return "Z";
        }
        if (cls == Character.TYPE) {
            return "C";
        }
        if (cls == Byte.TYPE) {
            return "B";
        }
        if (cls == Short.TYPE) {
            return "S";
        }
        if (cls == Integer.TYPE) {
            return "I";
        }
        if (cls == Long.TYPE) {
            return "J";
        }
        if (cls == Float.TYPE) {
            return "F";
        }
        if (cls == Double.TYPE) {
            return "D";
        }
        if (cls == Void.TYPE) {
            return "V";
        }
        String replace = cls.getName().replace('.', '/');
        if (replace.startsWith("[") || replace.endsWith(";")) {
            return replace;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("L");
        stringBuffer.append(replace.replace('.', '/'));
        stringBuffer.append(";");
        return stringBuffer.toString();
    }

    public void addArrayDimension() {
        this.arrayDims++;
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        this.type = null;
        this.baseType = null;
    }

    public int getArrayDims() {
        return this.arrayDims;
    }

    public Class getBaseType() {
        return this.baseType;
    }

    public Class getType(CallStack callStack, Interpreter interpreter) {
        Class cls = this.type;
        if (cls != null) {
            return cls;
        }
        SimpleNode typeNode = getTypeNode();
        this.baseType = typeNode instanceof BSHPrimitiveType ? ((BSHPrimitiveType) typeNode).getType() : ((BSHAmbiguousName) typeNode).toClass(callStack, interpreter);
        int i = this.arrayDims;
        if (i > 0) {
            try {
                this.type = Array.newInstance(this.baseType, new int[i]).getClass();
            } catch (Exception unused) {
                throw new EvalError("Couldn't construct array type", this, callStack);
            }
        } else {
            this.type = this.baseType;
        }
        interpreter.getClassManager().addListener(this);
        return this.type;
    }

    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        String str2;
        String str3 = this.descriptor;
        if (str3 != null) {
            return str3;
        }
        SimpleNode typeNode = getTypeNode();
        if (typeNode instanceof BSHPrimitiveType) {
            str2 = getTypeDescriptor(((BSHPrimitiveType) typeNode).type);
        } else {
            String str4 = ((BSHAmbiguousName) typeNode).text;
            String classBeingDefined = interpreter.getClassManager().getClassBeingDefined(str4);
            Class cls = null;
            if (classBeingDefined == null) {
                try {
                    cls = ((BSHAmbiguousName) typeNode).toClass(callStack, interpreter);
                } catch (EvalError unused) {
                }
            } else {
                str4 = classBeingDefined;
            }
            if (cls != null) {
                str2 = getTypeDescriptor(cls);
            } else if (str == null || Name.isCompound(str4)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("L");
                stringBuffer.append(str4.replace('.', '/'));
                stringBuffer.append(";");
                str2 = stringBuffer.toString();
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("L");
                stringBuffer2.append(str.replace('.', '/'));
                stringBuffer2.append("/");
                stringBuffer2.append(str4);
                stringBuffer2.append(";");
                str2 = stringBuffer2.toString();
            }
        }
        for (int i = 0; i < this.arrayDims; i++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[");
            stringBuffer3.append(str2);
            str2 = stringBuffer3.toString();
        }
        this.descriptor = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    public SimpleNode getTypeNode() {
        return (SimpleNode) jjtGetChild(0);
    }
}
