package org.keplerproject.luajava;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Proxy;
import java.util.StringTokenizer;
import p013b.p044b.p045a.p046a.C0864v;

public class LuaObject {

    /* renamed from: L */
    protected LuaState f3601L;
    protected Integer ref;

    protected LuaObject(LuaObject luaObject, Number number) {
        synchronized (luaObject.getLuaState()) {
            this.f3601L = luaObject.getLuaState();
            if (!luaObject.isTable()) {
                if (!luaObject.isUserdata()) {
                    throw new LuaException("Object parent should be a table or userdata .");
                }
            }
            luaObject.push();
            this.f3601L.pushNumber(number.doubleValue());
            this.f3601L.getTable(-2);
            this.f3601L.remove(-2);
            registerValue(-1);
            this.f3601L.pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, String str) {
        synchronized (luaObject.getLuaState()) {
            this.f3601L = luaObject.getLuaState();
            if (!luaObject.isTable()) {
                if (!luaObject.isUserdata()) {
                    throw new LuaException("Object parent should be a table or userdata .");
                }
            }
            luaObject.push();
            this.f3601L.pushString(str);
            this.f3601L.getTable(-2);
            this.f3601L.remove(-2);
            registerValue(-1);
            this.f3601L.pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, LuaObject luaObject2) {
        if (luaObject.getLuaState() == luaObject2.getLuaState()) {
            synchronized (luaObject.getLuaState()) {
                if (!luaObject.isTable()) {
                    if (!luaObject.isUserdata()) {
                        throw new LuaException("Object parent should be a table or userdata .");
                    }
                }
                this.f3601L = luaObject.getLuaState();
                luaObject.push();
                luaObject2.push();
                this.f3601L.getTable(-2);
                this.f3601L.remove(-2);
                registerValue(-1);
                this.f3601L.pop(1);
            }
            return;
        }
        throw new LuaException("LuaStates must be the same!");
    }

    protected LuaObject(LuaState luaState, int i) {
        synchronized (luaState) {
            this.f3601L = luaState;
            registerValue(i);
        }
    }

    protected LuaObject(LuaState luaState, String str) {
        synchronized (luaState) {
            this.f3601L = luaState;
            luaState.getGlobal(str);
            registerValue(-1);
            luaState.pop(1);
        }
    }

    private void registerValue(int i) {
        synchronized (this.f3601L) {
            this.f3601L.pushValue(i);
            this.ref = new Integer(this.f3601L.Lref(LuaState.LUA_REGISTRYINDEX));
        }
    }

    public Object[] array() {
        Object[] objArr;
        synchronized (this.f3601L) {
            if (isTable()) {
                push();
                int objLen2 = this.f3601L.objLen2(-1);
                Object newInstance = Array.newInstance(Object.class, objLen2);
                for (int i = 1; i <= objLen2; i++) {
                    this.f3601L.pushInteger(i);
                    this.f3601L.getTable(-2);
                    Array.set(newInstance, i - 1, this.f3601L.toJavaObject(-1));
                    this.f3601L.pop(1);
                }
                this.f3601L.pop(1);
                objArr = (Object[]) newInstance;
            } else {
                throw new LuaException("Invalid object. Not a table .");
            }
        }
        return objArr;
    }

    public Object call(Object... objArr) {
        return call(objArr, 1)[0];
    }

    public Object[] call(Object[] objArr, int i) {
        int i2;
        Object[] objArr2;
        String str;
        String str2;
        StringBuilder sb;
        synchronized (this.f3601L) {
            if (!isFunction() && !isTable()) {
                if (!isUserdata()) {
                    throw new LuaException("Invalid object. Not a function, table or userdata .");
                }
            }
            int top = this.f3601L.getTop();
            push();
            if (objArr != null) {
                for (Object obj : objArr) {
                    this.f3601L.pushObjectValue(obj);
                }
            } else {
                i2 = 0;
            }
            int pcall = this.f3601L.pcall(i2, i, 0);
            if (pcall != 0) {
                if (this.f3601L.isString(-1)) {
                    str = this.f3601L.toString(-1);
                    this.f3601L.pop(1);
                } else {
                    str = "";
                }
                if (pcall == 2) {
                    sb = new StringBuilder();
                    sb.append("Runtime error. ");
                    sb.append(str);
                } else if (pcall == 4) {
                    sb = new StringBuilder();
                    sb.append("Memory allocation error. ");
                    sb.append(str);
                } else if (pcall == 6) {
                    sb = new StringBuilder();
                    sb.append("Error while running the error handler function. ");
                    sb.append(str);
                } else {
                    str2 = "Lua Error code " + pcall + ". " + str;
                    throw new LuaException(str2);
                }
                str2 = sb.toString();
                throw new LuaException(str2);
            }
            if (i == -1) {
                i = this.f3601L.getTop() - top;
            }
            if (this.f3601L.getTop() - top >= i) {
                objArr2 = new Object[i];
                while (i > 0) {
                    objArr2[i - 1] = this.f3601L.toJavaObject(-1);
                    this.f3601L.pop(1);
                    i--;
                }
            } else {
                throw new LuaException("Invalid Number of Results .");
            }
        }
        return objArr2;
    }

    public boolean callBoolNoErr(Object... objArr) {
        Boolean bool;
        try {
            bool = callx(objArr, 1)[0];
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("Method LuaErr：\n" + e.getMessage());
            bool = null;
        }
        if (bool instanceof Boolean) {
            return bool.booleanValue();
        }
        return false;
    }

    public Object callNoErr(Object... objArr) {
        try {
            return callx(objArr, 1)[0];
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("Method LuaErr：\n" + e.getMessage());
            return null;
        }
    }

    public void callx() {
        String str;
        String str2;
        StringBuilder sb;
        synchronized (this.f3601L) {
            if (!isFunction() && !isTable()) {
                if (!isUserdata()) {
                    throw new LuaException("Invalid object. Not a function, table or userdata .");
                }
            }
            int top = this.f3601L.getTop();
            push();
            int pcall = this.f3601L.pcall(0, 1, 0);
            if (pcall != 0) {
                if (this.f3601L.isString(-1)) {
                    str = this.f3601L.toString(-1);
                    this.f3601L.pop(1);
                } else {
                    str = "";
                }
                if (pcall == 2) {
                    sb = new StringBuilder();
                    sb.append("Runtime error. ");
                    sb.append(str);
                } else if (pcall == 4) {
                    sb = new StringBuilder();
                    sb.append("Memory allocation error. ");
                    sb.append(str);
                } else if (pcall == 6) {
                    sb = new StringBuilder();
                    sb.append("Error while running the error handler function. ");
                    sb.append(str);
                } else {
                    str2 = "Lua Error code " + pcall + ". " + str;
                    throw new LuaException(str2);
                }
                str2 = sb.toString();
                throw new LuaException(str2);
            } else if (this.f3601L.getTop() - top >= 1) {
                Object[] objArr = new Object[1];
                for (int i = 1; i > 0; i--) {
                    objArr[i - 1] = this.f3601L.toJavaObject(-1);
                    this.f3601L.pop(1);
                }
            } else {
                throw new LuaException("Invalid Number of Results .");
            }
        }
    }

    public Object[] callx(Object[] objArr, int i) {
        int i2;
        Object[] objArr2;
        String str;
        String str2;
        StringBuilder sb;
        synchronized (this.f3601L) {
            if (!isFunction() && !isTable()) {
                if (!isUserdata()) {
                    throw new LuaException("Invalid object. Not a function, table or userdata .");
                }
            }
            int top = this.f3601L.getTop();
            push();
            if (objArr != null) {
                for (Object obj : objArr) {
                    this.f3601L.pushObjectValue(obj);
                }
            } else {
                i2 = 0;
            }
            int pcall = this.f3601L.pcall(i2, i, 0);
            if (pcall != 0) {
                if (this.f3601L.isString(-1)) {
                    str = this.f3601L.toString(-1);
                    this.f3601L.pop(1);
                } else {
                    str = "";
                }
                if (pcall == 2) {
                    sb = new StringBuilder();
                    sb.append("Runtime error. ");
                    sb.append(str);
                } else if (pcall == 4) {
                    sb = new StringBuilder();
                    sb.append("Memory allocation error. ");
                    sb.append(str);
                } else if (pcall == 6) {
                    sb = new StringBuilder();
                    sb.append("Error while running the error handler function. ");
                    sb.append(str);
                } else {
                    str2 = "Lua Error code " + pcall + ". " + str;
                    throw new LuaException(str2);
                }
                str2 = sb.toString();
                throw new LuaException(str2);
            }
            if (i == -1) {
                i = this.f3601L.getTop() - top;
            }
            if (this.f3601L.getTop() - top >= i) {
                objArr2 = new Object[i];
                while (i > 0) {
                    objArr2[i - 1] = this.f3601L.toJavaObject(-1);
                    this.f3601L.pop(1);
                    i--;
                }
            } else {
                throw new LuaException("Invalid Number of Results .");
            }
        }
        return objArr2;
    }

    public void callxNoErr() {
        try {
            callx();
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("VoidMethod LuaErr：\n" + e.getMessage());
        }
    }

    public Object createProxy(Class cls) {
        Object newProxyInstance;
        synchronized (this.f3601L) {
            if (isTable()) {
                newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new LuaInvocationHandler(this));
            } else {
                throw new LuaException("Invalid Object. Must be Table.");
            }
        }
        return newProxyInstance;
    }

    public Object createProxy(String str) {
        Object newProxyInstance;
        synchronized (this.f3601L) {
            if (isTable()) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                Class[] clsArr = new Class[stringTokenizer.countTokens()];
                int i = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    clsArr[i] = Class.forName(stringTokenizer.nextToken());
                    i++;
                }
                newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new LuaInvocationHandler(this));
            } else {
                throw new LuaException("Invalid Object. Must be Table.");
            }
        }
        return newProxyInstance;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this.f3601L) {
                if (this.f3601L.getCPtrPeer() != 0) {
                    this.f3601L.LunRef(LuaState.LUA_REGISTRYINDEX, this.ref.intValue());
                }
            }
        } catch (Exception unused) {
            PrintStream printStream = System.err;
            printStream.println("Unable to release object " + this.ref);
        }
    }

    public boolean getBoolean() {
        boolean z;
        synchronized (this.f3601L) {
            push();
            z = this.f3601L.toBoolean(-1);
            this.f3601L.pop(1);
        }
        return z;
    }

    public LuaObject getField(String str) {
        return this.f3601L.getLuaObject(this, str);
    }

    public LuaState getLuaState() {
        return this.f3601L;
    }

    public double getNumber() {
        double number;
        synchronized (this.f3601L) {
            push();
            number = this.f3601L.toNumber(-1);
            this.f3601L.pop(1);
        }
        return number;
    }

    public Object getObject() {
        Object objectFromUserdata;
        synchronized (this.f3601L) {
            push();
            objectFromUserdata = this.f3601L.getObjectFromUserdata(-1);
            this.f3601L.pop(1);
        }
        return objectFromUserdata;
    }

    public String getString() {
        String luaState;
        synchronized (this.f3601L) {
            push();
            luaState = this.f3601L.toString(-1);
            this.f3601L.pop(1);
        }
        return luaState;
    }

    public boolean isBoolean() {
        boolean isBoolean;
        synchronized (this.f3601L) {
            push();
            isBoolean = this.f3601L.isBoolean(-1);
            this.f3601L.pop(1);
        }
        return isBoolean;
    }

    public boolean isFunction() {
        boolean isFunction;
        synchronized (this.f3601L) {
            push();
            isFunction = this.f3601L.isFunction(-1);
            this.f3601L.pop(1);
        }
        return isFunction;
    }

    public boolean isJavaFunction() {
        boolean isJavaFunction;
        synchronized (this.f3601L) {
            push();
            isJavaFunction = this.f3601L.isJavaFunction(-1);
            this.f3601L.pop(1);
        }
        return isJavaFunction;
    }

    public boolean isJavaObject() {
        boolean isObject;
        synchronized (this.f3601L) {
            push();
            isObject = this.f3601L.isObject(-1);
            this.f3601L.pop(1);
        }
        return isObject;
    }

    public boolean isNil() {
        boolean isNil;
        synchronized (this.f3601L) {
            push();
            isNil = this.f3601L.isNil(-1);
            this.f3601L.pop(1);
        }
        return isNil;
    }

    public boolean isNumber() {
        boolean isNumber;
        synchronized (this.f3601L) {
            push();
            isNumber = this.f3601L.isNumber(-1);
            this.f3601L.pop(1);
        }
        return isNumber;
    }

    public boolean isString() {
        boolean isString;
        synchronized (this.f3601L) {
            push();
            isString = this.f3601L.isString(-1);
            this.f3601L.pop(1);
        }
        return isString;
    }

    public boolean isTable() {
        boolean isTable;
        synchronized (this.f3601L) {
            push();
            isTable = this.f3601L.isTable(-1);
            this.f3601L.pop(1);
        }
        return isTable;
    }

    public boolean isUserdata() {
        boolean isUserdata;
        synchronized (this.f3601L) {
            push();
            isUserdata = this.f3601L.isUserdata(-1);
            this.f3601L.pop(1);
        }
        return isUserdata;
    }

    public void push() {
        this.f3601L.rawGetI(LuaState.LUA_REGISTRYINDEX, this.ref.intValue());
    }

    public String toString() {
        synchronized (this.f3601L) {
            try {
                if (isNil()) {
                    return "nil";
                }
                if (isBoolean()) {
                    return String.valueOf(getBoolean());
                } else if (isNumber()) {
                    return String.valueOf(getNumber());
                } else if (isString()) {
                    return getString();
                } else if (isFunction()) {
                    return "Lua Function";
                } else {
                    if (isJavaObject()) {
                        return getObject().toString();
                    } else if (isUserdata()) {
                        return "Userdata";
                    } else {
                        if (isTable()) {
                            return "Lua Table";
                        }
                        if (isJavaFunction()) {
                            return "Java Function";
                        }
                        return null;
                    }
                }
            } catch (LuaException unused) {
                return null;
            }
        }
    }

    public int type() {
        int type;
        synchronized (this.f3601L) {
            push();
            type = this.f3601L.type(-1);
            this.f3601L.pop(1);
        }
        return type;
    }
}
