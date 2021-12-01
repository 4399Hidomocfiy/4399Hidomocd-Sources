package org.keplerproject.luajava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LuaInvocationHandler implements InvocationHandler {
    private LuaObject obj;

    public LuaInvocationHandler(LuaObject luaObject) {
        this.obj = luaObject;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj2, Method method, Object[] objArr) {
        synchronized (this.obj.f3601L) {
            LuaObject field = this.obj.getField(method.getName());
            Object obj3 = null;
            if (field.isNil()) {
                return null;
            }
            Class<?> returnType = method.getReturnType();
            if (!returnType.equals(Void.class)) {
                if (!returnType.equals(Void.TYPE)) {
                    obj3 = field.call(objArr, 1)[0];
                    if (obj3 != null && (obj3 instanceof Double)) {
                        obj3 = LuaState.convertLuaNumber((Double) obj3, returnType);
                    }
                    return obj3;
                }
            }
            field.call(objArr, 0);
            return obj3;
        }
    }
}
