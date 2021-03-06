package bsh;

/* access modifiers changed from: package-private */
public class Types {
    static final int ASSIGNMENT = 1;
    static final int BSH_ASSIGNABLE = 4;
    static final int CAST = 0;
    static final int FIRST_ROUND_ASSIGNABLE = 1;
    static Primitive INVALID_CAST = new Primitive(-1);
    static final int JAVA_BASE_ASSIGNABLE = 1;
    static final int JAVA_BOX_TYPES_ASSIGABLE = 2;
    static final int JAVA_VARARGS_ASSIGNABLE = 3;
    static final int LAST_ROUND_ASSIGNABLE = 4;
    static Primitive VALID_CAST = new Primitive(1);
    static /* synthetic */ Class class$bsh$Primitive;
    static /* synthetic */ Class class$bsh$This;
    static /* synthetic */ Class class$java$lang$Number;
    static /* synthetic */ Class class$java$lang$Object;

    Types() {
    }

    static UtilEvalError castError(Class cls, Class cls2, int i) {
        return castError(Reflect.normalizeClassName(cls), Reflect.normalizeClassName(cls2), i);
    }

    static UtilEvalError castError(String str, String str2, int i) {
        if (i == 1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't assign ");
            stringBuffer.append(str2);
            stringBuffer.append(" to ");
            stringBuffer.append(str);
            return new UtilEvalError(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Cannot cast ");
        stringBuffer2.append(str2);
        stringBuffer2.append(" to ");
        stringBuffer2.append(str);
        return new UtilTargetError(new ClassCastException(stringBuffer2.toString()));
    }

    private static Object castObject(Class cls, Class cls2, Object obj, int i, boolean z) {
        if (z && obj != null) {
            throw new InterpreterError("bad cast params 1");
        } else if (z || obj != null) {
            Class cls3 = class$bsh$Primitive;
            if (cls3 == null) {
                cls3 = class$("bsh.Primitive");
                class$bsh$Primitive = cls3;
            }
            if (cls2 == cls3) {
                throw new InterpreterError("bad from Type, need to unwrap");
            } else if (obj == Primitive.NULL && cls2 != null) {
                throw new InterpreterError("inconsistent args 1");
            } else if (obj == Primitive.VOID && cls2 != Void.TYPE) {
                throw new InterpreterError("inconsistent args 2");
            } else if (cls == Void.TYPE) {
                throw new InterpreterError("loose toType should be null");
            } else if (cls == null || cls == cls2) {
                return z ? VALID_CAST : obj;
            } else {
                if (cls.isPrimitive()) {
                    if (!(cls2 == Void.TYPE || cls2 == null || cls2.isPrimitive())) {
                        if (Primitive.isWrapperType(cls2)) {
                            Class unboxType = Primitive.unboxType(cls2);
                            return Primitive.castPrimitive(cls, unboxType, z ? null : (Primitive) Primitive.wrap(obj, unboxType), z, i);
                        } else if (z) {
                            return INVALID_CAST;
                        } else {
                            throw castError(cls, cls2, i);
                        }
                    }
                } else if (cls2 == Void.TYPE || cls2 == null || cls2.isPrimitive()) {
                    if (Primitive.isWrapperType(cls) && cls2 != Void.TYPE && cls2 != null) {
                        return z ? VALID_CAST : Primitive.castWrapper(Primitive.unboxType(cls), ((Primitive) obj).getValue());
                    }
                    Class cls4 = class$java$lang$Object;
                    if (cls4 == null) {
                        cls4 = class$("java.lang.Object");
                        class$java$lang$Object = cls4;
                    }
                    if (!(cls != cls4 || cls2 == Void.TYPE || cls2 == null)) {
                        return z ? VALID_CAST : ((Primitive) obj).getValue();
                    }
                } else if (cls.isAssignableFrom(cls2)) {
                    return z ? VALID_CAST : obj;
                } else {
                    if (cls.isInterface()) {
                        Class cls5 = class$bsh$This;
                        if (cls5 == null) {
                            cls5 = class$("bsh.This");
                            class$bsh$This = cls5;
                        }
                        if (cls5.isAssignableFrom(cls2) && Capabilities.canGenerateInterfaces()) {
                            return z ? VALID_CAST : ((This) obj).getInterface(cls);
                        }
                    }
                    if (Primitive.isWrapperType(cls) && Primitive.isWrapperType(cls2)) {
                        return z ? VALID_CAST : Primitive.castWrapper(cls, obj);
                    }
                    if (z) {
                        return INVALID_CAST;
                    }
                    throw castError(cls, cls2, i);
                }
                return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z, i);
            }
        } else {
            throw new InterpreterError("bad cast params 2");
        }
    }

    public static Object castObject(Object obj, Class cls, int i) {
        if (obj != null) {
            return castObject(cls, obj instanceof Primitive ? ((Primitive) obj).getType() : obj.getClass(), obj, i, false);
        }
        throw new InterpreterError("null fromValue");
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static Class[] getTypes(Object[] objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == null) {
                clsArr[i] = null;
            } else if (objArr[i] instanceof Primitive) {
                clsArr[i] = ((Primitive) objArr[i]).getType();
            } else {
                clsArr[i] = objArr[i].getClass();
            }
        }
        return clsArr;
    }

    static boolean isBshAssignable(Class cls, Class cls2) {
        try {
            return castObject(cls, cls2, null, 1, true) == VALID_CAST;
        } catch (UtilEvalError e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("err in cast check: ");
            stringBuffer.append(e);
            throw new InterpreterError(stringBuffer.toString());
        }
    }

    static boolean isJavaAssignable(Class cls, Class cls2) {
        return isJavaBaseAssignable(cls, cls2) || isJavaBoxTypesAssignable(cls, cls2);
    }

    static boolean isJavaBaseAssignable(Class cls, Class cls2) {
        if (cls == null) {
            return false;
        }
        if (cls2 == null) {
            return !cls.isPrimitive();
        }
        if (!cls.isPrimitive() || !cls2.isPrimitive()) {
            if (cls.isAssignableFrom(cls2)) {
                return true;
            }
        } else if (cls == cls2) {
            return true;
        } else {
            if (cls2 == Byte.TYPE && (cls == Short.TYPE || cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
                return true;
            }
            if (cls2 == Short.TYPE && (cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
                return true;
            }
            if (cls2 == Character.TYPE && (cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
                return true;
            }
            if (cls2 == Integer.TYPE && (cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
                return true;
            }
            if (cls2 == Long.TYPE && (cls == Float.TYPE || cls == Double.TYPE)) {
                return true;
            }
            return cls2 == Float.TYPE && cls == Double.TYPE;
        }
    }

    static boolean isJavaBoxTypesAssignable(Class cls, Class cls2) {
        if (cls == null) {
            return false;
        }
        Class cls3 = class$java$lang$Object;
        if (cls3 == null) {
            cls3 = class$("java.lang.Object");
            class$java$lang$Object = cls3;
        }
        if (cls == cls3) {
            return true;
        }
        Class cls4 = class$java$lang$Number;
        if (cls4 == null) {
            cls4 = class$("java.lang.Number");
            class$java$lang$Number = cls4;
        }
        return !(cls != cls4 || cls2 == Character.TYPE || cls2 == Boolean.TYPE) || Primitive.wrapperMap.get(cls) == cls2;
    }

    static boolean isSignatureAssignable(Class[] clsArr, Class[] clsArr2, int i) {
        if (!(i == 3 || clsArr.length == clsArr2.length)) {
            return false;
        }
        if (i == 1) {
            for (int i2 = 0; i2 < clsArr.length; i2++) {
                if (!isJavaBaseAssignable(clsArr2[i2], clsArr[i2])) {
                    return false;
                }
            }
            return true;
        } else if (i == 2) {
            for (int i3 = 0; i3 < clsArr.length; i3++) {
                if (!isJavaBoxTypesAssignable(clsArr2[i3], clsArr[i3])) {
                    return false;
                }
            }
            return true;
        } else if (i == 3) {
            return isSignatureVarargsAssignable(clsArr, clsArr2);
        } else {
            if (i == 4) {
                for (int i4 = 0; i4 < clsArr.length; i4++) {
                    if (!isBshAssignable(clsArr2[i4], clsArr[i4])) {
                        return false;
                    }
                }
                return true;
            }
            throw new InterpreterError("bad case");
        }
    }

    private static boolean isSignatureVarargsAssignable(Class[] clsArr, Class[] clsArr2) {
        return false;
    }
}
