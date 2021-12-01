package bsh.org.objectweb.asm;

import java.lang.reflect.Method;

public class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final Type BOOLEAN_TYPE = new Type(1);
    public static final int BYTE = 3;
    public static final Type BYTE_TYPE = new Type(3);
    public static final int CHAR = 2;
    public static final Type CHAR_TYPE = new Type(2);
    public static final int DOUBLE = 8;
    public static final Type DOUBLE_TYPE = new Type(8);
    public static final int FLOAT = 6;
    public static final Type FLOAT_TYPE = new Type(6);
    public static final int INT = 5;
    public static final Type INT_TYPE = new Type(5);
    public static final int LONG = 7;
    public static final Type LONG_TYPE = new Type(7);
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final Type SHORT_TYPE = new Type(4);
    public static final int VOID = 0;
    public static final Type VOID_TYPE = new Type(0);
    private char[] buf;
    private int len;
    private int off;
    private final int sort;

    private Type(int i) {
        this.sort = i;
        this.len = 1;
    }

    private Type(int i, char[] cArr, int i2, int i3) {
        this.sort = i;
        this.buf = cArr;
        this.off = i2;
        this.len = i3;
    }

    public static Type[] getArgumentTypes(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = charArray[i2];
            if (c == ')') {
                break;
            } else if (c == 'L') {
                while (true) {
                    i2 = i4 + 1;
                    if (charArray[i4] == ';') {
                        break;
                    }
                    i4 = i2;
                }
                i3++;
            } else {
                if (c != '[') {
                    i3++;
                }
                i2 = i4;
            }
        }
        Type[] typeArr = new Type[i3];
        int i5 = 1;
        while (charArray[i5] != ')') {
            typeArr[i] = getType(charArray, i5);
            i5 += typeArr[i].len;
            i++;
        }
        return typeArr;
    }

    public static Type[] getArgumentTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Type[] typeArr = new Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }

    public static String getDescriptor(Class cls) {
        StringBuffer stringBuffer = new StringBuffer();
        getDescriptor(stringBuffer, cls);
        return stringBuffer.toString();
    }

    private void getDescriptor(StringBuffer stringBuffer) {
        switch (this.sort) {
            case 0:
                stringBuffer.append('V');
                return;
            case 1:
                stringBuffer.append('Z');
                return;
            case 2:
                stringBuffer.append('C');
                return;
            case 3:
                stringBuffer.append('B');
                return;
            case 4:
                stringBuffer.append('S');
                return;
            case 5:
                stringBuffer.append('I');
                return;
            case 6:
                stringBuffer.append('F');
                return;
            case 7:
                stringBuffer.append('J');
                return;
            case 8:
                stringBuffer.append('D');
                return;
            default:
                stringBuffer.append(this.buf, this.off, this.len);
                return;
        }
    }

    private static void getDescriptor(StringBuffer stringBuffer, Class cls) {
        while (!cls.isPrimitive()) {
            if (cls.isArray()) {
                stringBuffer.append('[');
                cls = cls.getComponentType();
            } else {
                stringBuffer.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char charAt = name.charAt(i);
                    if (charAt == '.') {
                        charAt = '/';
                    }
                    stringBuffer.append(charAt);
                }
                stringBuffer.append(';');
                return;
            }
        }
        stringBuffer.append(cls == Integer.TYPE ? 'I' : cls == Void.TYPE ? 'V' : cls == Boolean.TYPE ? 'Z' : cls == Byte.TYPE ? 'B' : cls == Character.TYPE ? 'C' : cls == Short.TYPE ? 'S' : cls == Double.TYPE ? 'D' : cls == Float.TYPE ? 'F' : 'J');
    }

    public static String getInternalName(Class cls) {
        return cls.getName().replace('.', '/');
    }

    public static String getMethodDescriptor(Type type, Type[] typeArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Type type2 : typeArr) {
            type2.getDescriptor(stringBuffer);
        }
        stringBuffer.append(')');
        type.getDescriptor(stringBuffer);
        return stringBuffer.toString();
    }

    public static String getMethodDescriptor(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Class<?> cls : parameterTypes) {
            getDescriptor(stringBuffer, cls);
        }
        stringBuffer.append(')');
        getDescriptor(stringBuffer, method.getReturnType());
        return stringBuffer.toString();
    }

    public static Type getReturnType(String str) {
        return getType(str.toCharArray(), str.indexOf(41) + 1);
    }

    public static Type getReturnType(Method method) {
        return getType(method.getReturnType());
    }

    public static Type getType(Class cls) {
        return cls.isPrimitive() ? cls == Integer.TYPE ? INT_TYPE : cls == Void.TYPE ? VOID_TYPE : cls == Boolean.TYPE ? BOOLEAN_TYPE : cls == Byte.TYPE ? BYTE_TYPE : cls == Character.TYPE ? CHAR_TYPE : cls == Short.TYPE ? SHORT_TYPE : cls == Double.TYPE ? DOUBLE_TYPE : cls == Float.TYPE ? FLOAT_TYPE : LONG_TYPE : getType(getDescriptor(cls));
    }

    public static Type getType(String str) {
        return getType(str.toCharArray(), 0);
    }

    private static Type getType(char[] cArr, int i) {
        int i2;
        char c = cArr[i];
        if (c == 'F') {
            return FLOAT_TYPE;
        }
        if (c == 'S') {
            return SHORT_TYPE;
        }
        if (c == 'V') {
            return VOID_TYPE;
        }
        if (c == 'I') {
            return INT_TYPE;
        }
        if (c == 'J') {
            return LONG_TYPE;
        }
        if (c == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (c != '[') {
            switch (c) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    int i3 = 1;
                    while (cArr[i + i3] != ';') {
                        i3++;
                    }
                    return new Type(10, cArr, i, i3 + 1);
            }
        } else {
            int i4 = 1;
            while (true) {
                i2 = i + i4;
                if (cArr[i2] != '[') {
                    break;
                }
                i4++;
            }
            if (cArr[i2] == 'L') {
                do {
                    i4++;
                } while (cArr[i + i4] != ';');
            }
            return new Type(9, cArr, i, i4 + 1);
        }
    }

    public String getClassName() {
        return new String(this.buf, this.off + 1, this.len - 2).replace('/', '.');
    }

    public String getDescriptor() {
        StringBuffer stringBuffer = new StringBuffer();
        getDescriptor(stringBuffer);
        return stringBuffer.toString();
    }

    public int getDimensions() {
        int i = 1;
        while (this.buf[this.off + i] == '[') {
            i++;
        }
        return i;
    }

    public Type getElementType() {
        return getType(this.buf, this.off + getDimensions());
    }

    public String getInternalName() {
        return new String(this.buf, this.off + 1, this.len - 2);
    }

    public int getOpcode(int i) {
        if (i == 46 || i == 79) {
            switch (this.sort) {
                case 0:
                    return i + 5;
                case 1:
                case 3:
                    return i + 6;
                case 2:
                    return i + 7;
                case 4:
                    return i + 8;
                case 5:
                    return i;
                case 6:
                    return i + 2;
                case 7:
                    return i + 1;
                case 8:
                    return i + 3;
                default:
                    return i + 4;
            }
        } else {
            switch (this.sort) {
                case 0:
                    return i + 5;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return i;
                case 6:
                    return i + 2;
                case 7:
                    return i + 1;
                case 8:
                    return i + 3;
                default:
                    return i + 4;
            }
        }
    }

    public int getSize() {
        int i = this.sort;
        return (i == 7 || i == 8) ? 2 : 1;
    }

    public int getSort() {
        return this.sort;
    }
}
