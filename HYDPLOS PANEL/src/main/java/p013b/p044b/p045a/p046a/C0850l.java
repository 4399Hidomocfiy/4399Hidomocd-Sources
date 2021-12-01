package p013b.p044b.p045a.p046a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/* renamed from: b.b.a.a.l */
public class C0850l {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r7.isAssignableFrom(org.keplerproject.luajava.LuaObject.class) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r7.isAssignableFrom(org.keplerproject.luajava.LuaObject.class) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r2 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        if (r7.isAssignableFrom(org.keplerproject.luajava.LuaObject.class) == false) goto L_0x00a4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m1969a(org.keplerproject.luajava.LuaState r6, java.lang.Class r7, int r8) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0850l.m1969a(org.keplerproject.luajava.LuaState, java.lang.Class, int):java.lang.Object");
    }

    /* renamed from: b */
    private static int m1970b(LuaState luaState, Object obj, String str, Method[] methodArr, boolean z) {
        synchronized (luaState) {
            String str2 = "setOn" + str.substring(2) + "Listener";
            for (Method method : methodArr) {
                if (method.getName().equals(str2)) {
                    if (!z || Modifier.isStatic(method.getModifiers())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1 && parameterTypes[0].isInterface()) {
                            luaState.newTable();
                            luaState.pushValue(-2);
                            luaState.setField(-2, str);
                            try {
                                method.invoke(obj, luaState.getLuaObject(-1).createProxy(parameterTypes[0]));
                                return 1;
                            } catch (Exception e) {
                                throw new LuaException(e);
                            }
                        }
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: c */
    private static int m1971c(LuaState luaState, Object obj, String str, Method[] methodArr, boolean z) {
        synchronized (luaState) {
            String str2 = "set" + str;
            StringBuilder sb = new StringBuilder();
            for (Method method : methodArr) {
                if (method.getName().equals(str2)) {
                    if (!z || Modifier.isStatic(method.getModifiers())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length != 1) {
                            continue;
                        } else {
                            try {
                                try {
                                    method.invoke(obj, m1969a(luaState, parameterTypes[0], -1));
                                    return 1;
                                } catch (Exception e) {
                                    throw new LuaException(e);
                                }
                            } catch (LuaException unused) {
                                sb.append(parameterTypes[0]);
                                sb.append("\n");
                            }
                        }
                    }
                }
            }
            if (sb.length() <= 0) {
                return 0;
            }
            throw new LuaException("Invalid setter " + str + ". Invalid Parameters.\n" + sb.toString() + luaState.typeName(-1));
        }
    }

    /* renamed from: d */
    public static int m1972d(LuaState luaState, Object obj, String str) {
        Class<?> cls;
        synchronized (luaState) {
            boolean z = true;
            if (obj instanceof Map) {
                ((Map) obj).put(str, luaState.toJavaObject(2));
                return 1;
            }
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
                z = false;
            }
            cls.getName();
            Method[] methods = cls.getMethods();
            if (str.length() <= 2 || !str.substring(0, 2).equals("on") || luaState.type(-1) != 6) {
                return m1971c(luaState, obj, str, methods, z);
            }
            return m1970b(luaState, obj, str, methods, z);
        }
    }

    /* renamed from: e */
    public static int m1973e(LuaState luaState, Object obj, String str) {
        boolean z;
        Class<?> cls;
        synchronized (luaState) {
            if (obj == null) {
                return 0;
            }
            if (obj instanceof Class) {
                cls = (Class) obj;
                z = true;
            } else {
                cls = obj.getClass();
                z = false;
            }
            try {
                Field field = cls.getField(str);
                if (field == null) {
                    return 0;
                }
                if (z && !Modifier.isStatic(field.getModifiers())) {
                    return 0;
                }
                Class<?> type = field.getType();
                try {
                    if (!Modifier.isPublic(field.getModifiers())) {
                        field.setAccessible(true);
                    }
                    field.set(obj, m1969a(luaState, type, 3));
                    return 1;
                } catch (LuaException unused) {
                    throw new LuaException("bad argument to '" + str + "' (" + type.getName() + " expected, got " + m1974f(luaState, 3) + " value)");
                } catch (Exception e) {
                    throw new LuaException(e);
                }
            } catch (NoSuchFieldException unused2) {
                return 0;
            }
        }
    }

    /* renamed from: f */
    public static String m1974f(LuaState luaState, int i) {
        if (luaState.isObject(i)) {
            return luaState.getObjectFromUserdata(i).getClass().getName();
        }
        switch (luaState.type(i)) {
            case 1:
                return "boolean";
            case 2:
            case 7:
                return "userdata";
            case 3:
                return "number";
            case 4:
                return "string";
            case 5:
                return "table";
            case 6:
                return "function";
            case 8:
                return "thread";
            default:
                return "unkown";
        }
    }
}
