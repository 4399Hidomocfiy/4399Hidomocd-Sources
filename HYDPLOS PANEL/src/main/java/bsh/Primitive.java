package bsh;

import java.io.Serializable;
import java.util.Hashtable;

public final class Primitive implements ParserConstants, Serializable {
    public static final Primitive NULL = new Primitive(Special.NULL_VALUE);
    public static final Primitive VOID = new Primitive(Special.VOID_TYPE);
    static /* synthetic */ Class class$bsh$Primitive;
    static /* synthetic */ Class class$java$lang$Boolean;
    static /* synthetic */ Class class$java$lang$Byte;
    static /* synthetic */ Class class$java$lang$Character;
    static /* synthetic */ Class class$java$lang$Double;
    static /* synthetic */ Class class$java$lang$Float;
    static /* synthetic */ Class class$java$lang$Integer;
    static /* synthetic */ Class class$java$lang$Long;
    static /* synthetic */ Class class$java$lang$Short;
    static Hashtable wrapperMap;
    private Object value;

    /* access modifiers changed from: private */
    public static class Special implements Serializable {
        public static final Special NULL_VALUE = new Special();
        public static final Special VOID_TYPE = new Special();

        private Special() {
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        wrapperMap = hashtable;
        Class cls = Boolean.TYPE;
        Class cls2 = class$java$lang$Boolean;
        if (cls2 == null) {
            cls2 = class$("java.lang.Boolean");
            class$java$lang$Boolean = cls2;
        }
        hashtable.put(cls, cls2);
        Hashtable hashtable2 = wrapperMap;
        Class cls3 = Byte.TYPE;
        Class cls4 = class$java$lang$Byte;
        if (cls4 == null) {
            cls4 = class$("java.lang.Byte");
            class$java$lang$Byte = cls4;
        }
        hashtable2.put(cls3, cls4);
        Hashtable hashtable3 = wrapperMap;
        Class cls5 = Short.TYPE;
        Class cls6 = class$java$lang$Short;
        if (cls6 == null) {
            cls6 = class$("java.lang.Short");
            class$java$lang$Short = cls6;
        }
        hashtable3.put(cls5, cls6);
        Hashtable hashtable4 = wrapperMap;
        Class cls7 = Character.TYPE;
        Class cls8 = class$java$lang$Character;
        if (cls8 == null) {
            cls8 = class$("java.lang.Character");
            class$java$lang$Character = cls8;
        }
        hashtable4.put(cls7, cls8);
        Hashtable hashtable5 = wrapperMap;
        Class cls9 = Integer.TYPE;
        Class cls10 = class$java$lang$Integer;
        if (cls10 == null) {
            cls10 = class$("java.lang.Integer");
            class$java$lang$Integer = cls10;
        }
        hashtable5.put(cls9, cls10);
        Hashtable hashtable6 = wrapperMap;
        Class cls11 = Long.TYPE;
        Class cls12 = class$java$lang$Long;
        if (cls12 == null) {
            cls12 = class$("java.lang.Long");
            class$java$lang$Long = cls12;
        }
        hashtable6.put(cls11, cls12);
        Hashtable hashtable7 = wrapperMap;
        Class cls13 = Float.TYPE;
        Class cls14 = class$java$lang$Float;
        if (cls14 == null) {
            cls14 = class$("java.lang.Float");
            class$java$lang$Float = cls14;
        }
        hashtable7.put(cls13, cls14);
        Hashtable hashtable8 = wrapperMap;
        Class cls15 = Double.TYPE;
        Class cls16 = class$java$lang$Double;
        if (cls16 == null) {
            cls16 = class$("java.lang.Double");
            class$java$lang$Double = cls16;
        }
        hashtable8.put(cls15, cls16);
        Hashtable hashtable9 = wrapperMap;
        Class cls17 = class$java$lang$Boolean;
        if (cls17 == null) {
            cls17 = class$("java.lang.Boolean");
            class$java$lang$Boolean = cls17;
        }
        hashtable9.put(cls17, cls);
        Hashtable hashtable10 = wrapperMap;
        Class cls18 = class$java$lang$Byte;
        if (cls18 == null) {
            cls18 = class$("java.lang.Byte");
            class$java$lang$Byte = cls18;
        }
        hashtable10.put(cls18, Byte.TYPE);
        Hashtable hashtable11 = wrapperMap;
        Class cls19 = class$java$lang$Short;
        if (cls19 == null) {
            cls19 = class$("java.lang.Short");
            class$java$lang$Short = cls19;
        }
        hashtable11.put(cls19, Short.TYPE);
        Hashtable hashtable12 = wrapperMap;
        Class cls20 = class$java$lang$Character;
        if (cls20 == null) {
            cls20 = class$("java.lang.Character");
            class$java$lang$Character = cls20;
        }
        hashtable12.put(cls20, Character.TYPE);
        Hashtable hashtable13 = wrapperMap;
        Class cls21 = class$java$lang$Integer;
        if (cls21 == null) {
            cls21 = class$("java.lang.Integer");
            class$java$lang$Integer = cls21;
        }
        hashtable13.put(cls21, cls9);
        Hashtable hashtable14 = wrapperMap;
        Class cls22 = class$java$lang$Long;
        if (cls22 == null) {
            cls22 = class$("java.lang.Long");
            class$java$lang$Long = cls22;
        }
        hashtable14.put(cls22, cls11);
        Hashtable hashtable15 = wrapperMap;
        Class cls23 = class$java$lang$Float;
        if (cls23 == null) {
            cls23 = class$("java.lang.Float");
            class$java$lang$Float = cls23;
        }
        hashtable15.put(cls23, cls13);
        Hashtable hashtable16 = wrapperMap;
        Class cls24 = class$java$lang$Double;
        if (cls24 == null) {
            cls24 = class$("java.lang.Double");
            class$java$lang$Double = cls24;
        }
        hashtable16.put(cls24, Double.TYPE);
    }

    public Primitive(byte b) {
        this(new Byte(b));
    }

    public Primitive(char c) {
        this(new Character(c));
    }

    public Primitive(double d) {
        this(new Double(d));
    }

    public Primitive(float f) {
        this(new Float(f));
    }

    public Primitive(int i) {
        this(new Integer(i));
    }

    public Primitive(long j) {
        this(new Long(j));
    }

    public Primitive(Object obj) {
        if (obj == null) {
            throw new InterpreterError("Use Primitve.NULL instead of Primitive(null)");
        } else if (obj == Special.NULL_VALUE || obj == Special.VOID_TYPE || isWrapperType(obj.getClass())) {
            this.value = obj;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Not a wrapper type: ");
            stringBuffer.append(obj);
            throw new InterpreterError(stringBuffer.toString());
        }
    }

    public Primitive(short s) {
        this(new Short(s));
    }

    public Primitive(boolean z) {
        this(new Boolean(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r1 != r5) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object binaryOperation(java.lang.Object r4, java.lang.Object r5, int r6) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Primitive.binaryOperation(java.lang.Object, java.lang.Object, int):java.lang.Object");
    }

    static Object binaryOperationImpl(Object obj, Object obj2, int i) {
        if (obj instanceof Boolean) {
            return booleanBinaryOperation((Boolean) obj, (Boolean) obj2, i);
        }
        if (obj instanceof Integer) {
            return intBinaryOperation((Integer) obj, (Integer) obj2, i);
        }
        if (obj instanceof Long) {
            return longBinaryOperation((Long) obj, (Long) obj2, i);
        }
        if (obj instanceof Float) {
            return floatBinaryOperation((Float) obj, (Float) obj2, i);
        }
        if (obj instanceof Double) {
            return doubleBinaryOperation((Double) obj, (Double) obj2, i);
        }
        throw new UtilEvalError("Invalid types in binary operator");
    }

    static Boolean booleanBinaryOperation(Boolean bool, Boolean bool2, int i) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        boolean z = true;
        if (i != 90) {
            switch (i) {
                case 95:
                    if (booleanValue == booleanValue2) {
                        z = false;
                    }
                    return new Boolean(z);
                case 96:
                case 97:
                    if (!booleanValue && !booleanValue2) {
                        z = false;
                    }
                    return new Boolean(z);
                case 98:
                case 99:
                    if (!booleanValue || !booleanValue2) {
                        z = false;
                    }
                    return new Boolean(z);
                default:
                    throw new InterpreterError("unimplemented binary operator");
            }
        } else {
            if (booleanValue != booleanValue2) {
                z = false;
            }
            return new Boolean(z);
        }
    }

    static boolean booleanUnaryOperation(Boolean bool, int i) {
        boolean booleanValue = bool.booleanValue();
        if (i == 86) {
            return !booleanValue;
        }
        throw new UtilEvalError("Operator inappropriate for boolean");
    }

    public static Class boxType(Class cls) {
        Class cls2 = (Class) wrapperMap.get(cls);
        if (cls2 != null) {
            return cls2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Not a primitive type: ");
        stringBuffer.append(cls);
        throw new InterpreterError(stringBuffer.toString());
    }

    static Primitive castPrimitive(Class cls, Class cls2, Primitive primitive, boolean z, int i) {
        if (z && primitive != null) {
            throw new InterpreterError("bad cast param 1");
        } else if (!z && primitive == null) {
            throw new InterpreterError("bad cast param 2");
        } else if (cls2 == null || cls2.isPrimitive()) {
            Primitive primitive2 = NULL;
            if (primitive == primitive2 && cls2 != null) {
                throw new InterpreterError("inconsistent args 1");
            } else if (primitive == VOID && cls2 != Void.TYPE) {
                throw new InterpreterError("inconsistent args 2");
            } else if (cls2 != Void.TYPE) {
                Object obj = null;
                if (primitive != null) {
                    obj = primitive.getValue();
                }
                if (cls.isPrimitive()) {
                    if (cls2 != null) {
                        Class cls3 = Boolean.TYPE;
                        if (cls2 == cls3) {
                            if (cls == cls3) {
                                return z ? Types.VALID_CAST : primitive;
                            }
                            if (z) {
                                return Types.INVALID_CAST;
                            }
                            throw Types.castError(cls, cls2, i);
                        } else if (i != 1 || Types.isJavaAssignable(cls, cls2)) {
                            return z ? Types.VALID_CAST : new Primitive(castWrapper(cls, obj));
                        } else {
                            if (z) {
                                return Types.INVALID_CAST;
                            }
                            throw Types.castError(cls, cls2, i);
                        }
                    } else if (z) {
                        return Types.INVALID_CAST;
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("primitive type:");
                        stringBuffer.append(cls);
                        throw Types.castError(stringBuffer.toString(), "Null value", i);
                    }
                } else if (cls2 == null) {
                    return z ? Types.VALID_CAST : primitive2;
                } else {
                    if (z) {
                        return Types.INVALID_CAST;
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("object type:");
                    stringBuffer2.append(cls);
                    throw Types.castError(stringBuffer2.toString(), "primitive value", i);
                }
            } else if (z) {
                return Types.INVALID_CAST;
            } else {
                throw Types.castError(Reflect.normalizeClassName(cls), "void value", i);
            }
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("bad fromType:");
            stringBuffer3.append(cls2);
            throw new InterpreterError(stringBuffer3.toString());
        }
    }

    static Object castWrapper(Class cls, Object obj) {
        if (!cls.isPrimitive()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("invalid type in castWrapper: ");
            stringBuffer.append(cls);
            throw new InterpreterError(stringBuffer.toString());
        } else if (obj == null) {
            throw new InterpreterError("null value in castWrapper, guard");
        } else if (!(obj instanceof Boolean)) {
            if (obj instanceof Character) {
                obj = new Integer(((Character) obj).charValue());
            }
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (cls == Byte.TYPE) {
                    return new Byte(number.byteValue());
                }
                if (cls == Short.TYPE) {
                    return new Short(number.shortValue());
                }
                if (cls == Character.TYPE) {
                    return new Character((char) number.intValue());
                }
                if (cls == Integer.TYPE) {
                    return new Integer(number.intValue());
                }
                if (cls == Long.TYPE) {
                    return new Long(number.longValue());
                }
                if (cls == Float.TYPE) {
                    return new Float(number.floatValue());
                }
                if (cls == Double.TYPE) {
                    return new Double(number.doubleValue());
                }
                throw new InterpreterError("error in wrapper cast");
            }
            throw new InterpreterError("bad type in cast");
        } else if (cls == Boolean.TYPE) {
            return obj;
        } else {
            throw new InterpreterError("bad wrapper cast of boolean");
        }
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    static Object doubleBinaryOperation(Double d, Double d2, int i) {
        double doubleValue = d.doubleValue();
        double doubleValue2 = d2.doubleValue();
        boolean z = true;
        switch (i) {
            case 82:
            case 83:
                if (doubleValue <= doubleValue2) {
                    z = false;
                }
                return new Boolean(z);
            case 84:
            case 85:
                if (doubleValue >= doubleValue2) {
                    z = false;
                }
                return new Boolean(z);
            default:
                switch (i) {
                    case 90:
                        if (doubleValue != doubleValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 91:
                    case 92:
                        if (doubleValue > doubleValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 93:
                    case 94:
                        if (doubleValue < doubleValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 95:
                        if (doubleValue == doubleValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    default:
                        switch (i) {
                            case 102:
                                return new Double(doubleValue + doubleValue2);
                            case 103:
                                return new Double(doubleValue - doubleValue2);
                            case 104:
                                return new Double(doubleValue * doubleValue2);
                            case 105:
                                return new Double(doubleValue / doubleValue2);
                            default:
                                switch (i) {
                                    case 111:
                                        return new Double(doubleValue % doubleValue2);
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                        throw new UtilEvalError("Can't shift doubles");
                                    default:
                                        throw new InterpreterError("Unimplemented binary double operator");
                                }
                        }
                }
        }
    }

    static double doubleUnaryOperation(Double d, int i) {
        double doubleValue = d.doubleValue();
        if (i == 102) {
            return doubleValue;
        }
        if (i == 103) {
            return -doubleValue;
        }
        throw new InterpreterError("bad double unaryOperation");
    }

    static Object floatBinaryOperation(Float f, Float f2, int i) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        boolean z = true;
        switch (i) {
            case 82:
            case 83:
                if (floatValue <= floatValue2) {
                    z = false;
                }
                return new Boolean(z);
            case 84:
            case 85:
                if (floatValue >= floatValue2) {
                    z = false;
                }
                return new Boolean(z);
            default:
                switch (i) {
                    case 90:
                        if (floatValue != floatValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 91:
                    case 92:
                        if (floatValue > floatValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 93:
                    case 94:
                        if (floatValue < floatValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 95:
                        if (floatValue == floatValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    default:
                        switch (i) {
                            case 102:
                                return new Float(floatValue + floatValue2);
                            case 103:
                                return new Float(floatValue - floatValue2);
                            case 104:
                                return new Float(floatValue * floatValue2);
                            case 105:
                                return new Float(floatValue / floatValue2);
                            default:
                                switch (i) {
                                    case 111:
                                        return new Float(floatValue % floatValue2);
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                        throw new UtilEvalError("Can't shift floats ");
                                    default:
                                        throw new InterpreterError("Unimplemented binary float operator");
                                }
                        }
                }
        }
    }

    static float floatUnaryOperation(Float f, int i) {
        float floatValue = f.floatValue();
        if (i == 102) {
            return floatValue;
        }
        if (i == 103) {
            return -floatValue;
        }
        throw new InterpreterError("bad float unaryOperation");
    }

    public static Primitive getDefaultValue(Class cls) {
        if (cls == null || !cls.isPrimitive()) {
            return NULL;
        }
        if (cls == Boolean.TYPE) {
            return new Primitive(false);
        }
        try {
            return new Primitive(0).castToType(cls, 0);
        } catch (UtilEvalError unused) {
            throw new InterpreterError("bad cast");
        }
    }

    static Object intBinaryOperation(Integer num, Integer num2, int i) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        boolean z = true;
        switch (i) {
            case 82:
            case 83:
                if (intValue <= intValue2) {
                    z = false;
                }
                return new Boolean(z);
            case 84:
            case 85:
                if (intValue >= intValue2) {
                    z = false;
                }
                return new Boolean(z);
            default:
                switch (i) {
                    case 90:
                        if (intValue != intValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 91:
                    case 92:
                        if (intValue > intValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 93:
                    case 94:
                        if (intValue < intValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 95:
                        if (intValue == intValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    default:
                        switch (i) {
                            case 102:
                                return new Integer(intValue + intValue2);
                            case 103:
                                return new Integer(intValue - intValue2);
                            case 104:
                                return new Integer(intValue * intValue2);
                            case 105:
                                return new Integer(intValue / intValue2);
                            case 106:
                            case 107:
                                return new Integer(intValue & intValue2);
                            case 108:
                            case 109:
                                return new Integer(intValue | intValue2);
                            case 110:
                                return new Integer(intValue ^ intValue2);
                            case 111:
                                return new Integer(intValue % intValue2);
                            case 112:
                            case 113:
                                return new Integer(intValue << intValue2);
                            case 114:
                            case 115:
                                return new Integer(intValue >> intValue2);
                            case 116:
                            case 117:
                                return new Integer(intValue >>> intValue2);
                            default:
                                throw new InterpreterError("Unimplemented binary integer operator");
                        }
                }
        }
    }

    static int intUnaryOperation(Integer num, int i) {
        int intValue = num.intValue();
        if (i == 87) {
            return intValue ^ -1;
        }
        switch (i) {
            case 100:
                return intValue + 1;
            case 101:
                return intValue - 1;
            case 102:
                return intValue;
            case 103:
                return -intValue;
            default:
                throw new InterpreterError("bad integer unaryOperation");
        }
    }

    public static boolean isWrapperType(Class cls) {
        return wrapperMap.get(cls) != null && !cls.isPrimitive();
    }

    static Object longBinaryOperation(Long l, Long l2, int i) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        boolean z = true;
        switch (i) {
            case 82:
            case 83:
                if (longValue <= longValue2) {
                    z = false;
                }
                return new Boolean(z);
            case 84:
            case 85:
                if (longValue >= longValue2) {
                    z = false;
                }
                return new Boolean(z);
            default:
                switch (i) {
                    case 90:
                        if (longValue != longValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 91:
                    case 92:
                        if (longValue > longValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 93:
                    case 94:
                        if (longValue < longValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    case 95:
                        if (longValue == longValue2) {
                            z = false;
                        }
                        return new Boolean(z);
                    default:
                        switch (i) {
                            case 102:
                                return new Long(longValue + longValue2);
                            case 103:
                                return new Long(longValue - longValue2);
                            case 104:
                                return new Long(longValue * longValue2);
                            case 105:
                                return new Long(longValue / longValue2);
                            case 106:
                            case 107:
                                return new Long(longValue2 & longValue);
                            case 108:
                            case 109:
                                return new Long(longValue2 | longValue);
                            case 110:
                                return new Long(longValue2 ^ longValue);
                            case 111:
                                return new Long(longValue % longValue2);
                            case 112:
                            case 113:
                                return new Long(longValue << ((int) longValue2));
                            case 114:
                            case 115:
                                return new Long(longValue >> ((int) longValue2));
                            case 116:
                            case 117:
                                return new Long(longValue >>> ((int) longValue2));
                            default:
                                throw new InterpreterError("Unimplemented binary long operator");
                        }
                }
        }
    }

    static long longUnaryOperation(Long l, int i) {
        long longValue = l.longValue();
        if (i == 87) {
            return -1 ^ longValue;
        }
        switch (i) {
            case 100:
                return longValue + 1;
            case 101:
                return longValue - 1;
            case 102:
                return longValue;
            case 103:
                return -longValue;
            default:
                throw new InterpreterError("bad long unaryOperation");
        }
    }

    static Object[] promotePrimitives(Object obj, Object obj2) {
        Object promoteToInteger = promoteToInteger(obj);
        Object promoteToInteger2 = promoteToInteger(obj2);
        if ((promoteToInteger instanceof Number) && (promoteToInteger2 instanceof Number)) {
            Number number = (Number) promoteToInteger;
            Number number2 = (Number) promoteToInteger2;
            boolean z = number instanceof Double;
            if (!z && !(number2 instanceof Double)) {
                boolean z2 = number instanceof Float;
                if (!z2 && !(number2 instanceof Float)) {
                    boolean z3 = number instanceof Long;
                    if (z3 || (number2 instanceof Long)) {
                        if (z3) {
                            promoteToInteger2 = new Long(number2.longValue());
                        } else {
                            promoteToInteger = new Long(number.longValue());
                        }
                    }
                } else if (z2) {
                    promoteToInteger2 = new Float(number2.floatValue());
                } else {
                    promoteToInteger = new Float(number.floatValue());
                }
            } else if (z) {
                promoteToInteger2 = new Double(number2.doubleValue());
            } else {
                promoteToInteger = new Double(number.doubleValue());
            }
        }
        return new Object[]{promoteToInteger, promoteToInteger2};
    }

    static Object promoteToInteger(Object obj) {
        return obj instanceof Character ? new Integer(((Character) obj).charValue()) : ((obj instanceof Byte) || (obj instanceof Short)) ? new Integer(((Number) obj).intValue()) : obj;
    }

    public static Primitive unaryOperation(Primitive primitive, int i) {
        if (primitive == NULL) {
            throw new UtilEvalError("illegal use of null object or 'null' literal");
        } else if (primitive != VOID) {
            Class type = primitive.getType();
            Object promoteToInteger = promoteToInteger(primitive.getValue());
            if (promoteToInteger instanceof Boolean) {
                return new Primitive(booleanUnaryOperation((Boolean) promoteToInteger, i));
            }
            if (promoteToInteger instanceof Integer) {
                int intUnaryOperation = intUnaryOperation((Integer) promoteToInteger, i);
                if (i == 100 || i == 101) {
                    if (type == Byte.TYPE) {
                        return new Primitive((byte) intUnaryOperation);
                    }
                    if (type == Short.TYPE) {
                        return new Primitive((short) intUnaryOperation);
                    }
                    if (type == Character.TYPE) {
                        return new Primitive((char) intUnaryOperation);
                    }
                }
                return new Primitive(intUnaryOperation);
            } else if (promoteToInteger instanceof Long) {
                return new Primitive(longUnaryOperation((Long) promoteToInteger, i));
            } else {
                if (promoteToInteger instanceof Float) {
                    return new Primitive(floatUnaryOperation((Float) promoteToInteger, i));
                }
                if (promoteToInteger instanceof Double) {
                    return new Primitive(doubleUnaryOperation((Double) promoteToInteger, i));
                }
                throw new InterpreterError("An error occurred.  Please call technical support.");
            }
        } else {
            throw new UtilEvalError("illegal use of undefined object or 'void' literal");
        }
    }

    public static Class unboxType(Class cls) {
        Class cls2 = (Class) wrapperMap.get(cls);
        if (cls2 != null) {
            return cls2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Not a primitive wrapper type: ");
        stringBuffer.append(cls);
        throw new InterpreterError(stringBuffer.toString());
    }

    public static Object unwrap(Object obj) {
        if (obj == VOID) {
            return null;
        }
        return obj instanceof Primitive ? ((Primitive) obj).getValue() : obj;
    }

    public static Object[] unwrap(Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = unwrap(objArr[i]);
        }
        return objArr2;
    }

    public static Object wrap(Object obj, Class cls) {
        return cls == Void.TYPE ? VOID : obj == null ? NULL : cls.isPrimitive() ? new Primitive(obj) : obj;
    }

    public static Object[] wrap(Object[] objArr, Class[] clsArr) {
        if (objArr == null) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = wrap(objArr[i], clsArr[i]);
        }
        return objArr2;
    }

    public boolean booleanValue() {
        Object obj = this.value;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new UtilEvalError("Primitive not a boolean");
    }

    public Primitive castToType(Class cls, int i) {
        return castPrimitive(cls, getType(), this, false, i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Primitive) {
            return ((Primitive) obj).value.equals(this.value);
        }
        return false;
    }

    public Class getType() {
        if (this == VOID) {
            return Void.TYPE;
        }
        if (this == NULL) {
            return null;
        }
        return unboxType(this.value.getClass());
    }

    public Object getValue() {
        Object obj = this.value;
        if (obj == Special.NULL_VALUE) {
            return null;
        }
        if (obj != Special.VOID_TYPE) {
            return obj;
        }
        throw new InterpreterError("attempt to unwrap void type");
    }

    public int hashCode() {
        return this.value.hashCode() * 21;
    }

    public int intValue() {
        Object obj = this.value;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new UtilEvalError("Primitive not a number");
    }

    public boolean isNumber() {
        return ((this.value instanceof Boolean) || this == NULL || this == VOID) ? false : true;
    }

    public Number numberValue() {
        Object obj = this.value;
        if (obj instanceof Character) {
            obj = new Integer(((Character) obj).charValue());
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        throw new UtilEvalError("Primitive not a number");
    }

    public String toString() {
        Object obj = this.value;
        return obj == Special.NULL_VALUE ? "null" : obj == Special.VOID_TYPE ? "void" : obj.toString();
    }
}
