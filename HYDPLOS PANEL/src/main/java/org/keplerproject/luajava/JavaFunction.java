package org.keplerproject.luajava;

public abstract class JavaFunction {

    /* renamed from: L */
    protected LuaState f3600L;

    public JavaFunction(LuaState luaState) {
        this.f3600L = luaState;
    }

    public abstract int execute();

    public LuaObject getParam(int i) {
        return this.f3600L.getLuaObject(i);
    }

    public void register(String str) {
        synchronized (this.f3600L) {
            this.f3600L.pushJavaFunction(this);
            this.f3600L.setGlobal(str);
        }
    }
}
