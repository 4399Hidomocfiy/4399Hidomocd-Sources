package org.keplerproject.luajava;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p013b.p044b.p045a.p046a.C0850l;

public final class LuaJavaAPI {
    private LuaJavaAPI() {
    }

    public static int checkField(int i, Object obj, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            try {
                Field field = (obj instanceof Class ? (Class) obj : obj.getClass()).getField(str);
                if (field == null) {
                    return 0;
                }
                try {
                    Object obj2 = field.get(obj);
                    if (obj == null) {
                        return 0;
                    }
                    existingState.pushObjectValue(obj2);
                    return 1;
                } catch (Exception unused) {
                    return 0;
                }
            } catch (Exception unused2) {
                return 0;
            }
        }
    }

    public static int checkMethod(int i, Object obj, String str) {
        Method[] methods;
        synchronized (LuaStateFactory.getExistingState(i)) {
            for (Method method : (obj instanceof Class ? (Class) obj : obj.getClass()).getMethods()) {
                if (method.getName().equals(str)) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static int classIndex(int i, Class cls, String str) {
        synchronized (LuaStateFactory.getExistingState(i)) {
            if (checkField(i, cls, str) != 0) {
                return 1;
            }
            return checkMethod(i, cls, str) != 0 ? 2 : 0;
        }
    }

    public static int createProxyObject(int i, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            try {
                if (existingState.isTable(2)) {
                    existingState.pushJavaObject(existingState.getLuaObject(2).createProxy(str));
                } else {
                    throw new LuaException("Parameter is not a table. Can't create proxy.");
                }
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return 1;
    }

    private static Object getObjInstance(LuaState luaState, Class cls) {
        Object newInstance;
        boolean z;
        synchronized (luaState) {
            int top = luaState.getTop() - 1;
            Object[] objArr = new Object[top];
            Constructor<?>[] constructors = cls.getConstructors();
            Constructor<?> constructor = null;
            int i = 0;
            while (true) {
                if (i >= constructors.length) {
                    break;
                }
                Class<?>[] parameterTypes = constructors[i].getParameterTypes();
                if (parameterTypes.length == top) {
                    for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                        try {
                            objArr[i2] = C0850l.m1969a(luaState, parameterTypes[i2], i2 + 2);
                        } catch (Exception unused) {
                            z = false;
                        }
                    }
                    z = true;
                    if (z) {
                        constructor = constructors[i];
                        break;
                    }
                }
                i++;
            }
            if (constructor != null) {
                try {
                    newInstance = constructor.newInstance(objArr);
                    if (newInstance == null) {
                        throw new LuaException("Couldn't instantiate java Object");
                    }
                } catch (Exception e) {
                    throw new LuaException(e);
                }
            } else {
                throw new LuaException("Invalid method call. No such method.");
            }
        }
        return newInstance;
    }

    public static int javaLoadLib(int i, String str, String str2) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            try {
                Object invoke = Class.forName(str).getMethod(str2, LuaState.class).invoke(null, existingState);
                if (invoke == null || !(invoke instanceof Integer)) {
                    return 0;
                }
                return ((Integer) invoke).intValue();
            } catch (ClassNotFoundException e) {
                throw new LuaException(e);
            } catch (Exception e2) {
                throw new LuaException("Error on calling method. Library could not be loaded. " + e2.getMessage());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int javaNew(int i, Class cls) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            existingState.pushJavaObject(getObjInstance(existingState, cls));
        }
        return 1;
    }

    public static int javaNewInstance(int i, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            try {
                existingState.pushJavaObject(getObjInstance(existingState, Class.forName(str)));
            } catch (ClassNotFoundException e) {
                throw new LuaException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return 1;
    }

    public static int objectIndex(int i, Object obj, String str) {
        Method method;
        boolean z;
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            int top = existingState.getTop() - 1;
            Object[] objArr = new Object[top];
            Method[] methods = (obj instanceof Class ? (Class) obj : obj.getClass()).getMethods();
            int i2 = 0;
            while (true) {
                if (i2 >= methods.length) {
                    method = null;
                    break;
                }
                if (methods[i2].getName().equals(str)) {
                    Class<?>[] parameterTypes = methods[i2].getParameterTypes();
                    if (parameterTypes.length == top) {
                        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                            try {
                                objArr[i3] = C0850l.m1969a(existingState, parameterTypes[i3], i3 + 2);
                            } catch (Exception unused) {
                                z = false;
                            }
                        }
                        z = true;
                        if (z) {
                            method = methods[i2];
                            break;
                        }
                    }
                }
                i2++;
            }
            if (method != null) {
                try {
                    if (Modifier.isPublic(method.getModifiers())) {
                        method.setAccessible(true);
                    }
                    Object invoke = obj instanceof Class ? method.invoke(null, objArr) : method.invoke(obj, objArr);
                    if (invoke == null) {
                        return 0;
                    }
                    existingState.pushObjectValue(invoke);
                    return 1;
                } catch (Exception e) {
                    throw new LuaException(e);
                }
            } else {
                throw new LuaException("Invalid method call. No such method.");
            }
        }
    }

    public static int objectIndex2(int i, Object obj, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            if (C0850l.m1973e(existingState, obj, str) != 0) {
                return 1;
            }
            return C0850l.m1972d(existingState, obj, str) != 0 ? 1 : 0;
        }
    }

    public static int setsz(int i, Object obj, int i2) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            Class<?> componentType = obj.getClass().getComponentType();
            if (componentType != null) {
                try {
                    Array.set(obj, i2, C0850l.m1969a(existingState, componentType, 3));
                } catch (LuaException unused) {
                    throw new LuaException("bad argument to '" + obj.getClass().getName() + "' (" + componentType.getName() + " expected, got " + C0850l.m1974f(existingState, 3) + " value)");
                } catch (Exception e) {
                    throw new LuaException("can not set array value: " + e.getMessage());
                }
            } else {
                throw new LuaException(obj.toString() + " is not a array");
            }
        }
        return 0;
    }
}
