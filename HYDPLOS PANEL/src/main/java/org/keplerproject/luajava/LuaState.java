package org.keplerproject.luajava;

public class LuaState {
    public static final int LUA_ERRERR = 6;
    public static final int LUA_ERRGCMM = 5;
    public static final int LUA_ERRMEM = 4;
    public static final int LUA_ERRRUN = 2;
    public static final int LUA_ERRSYNTAX = 3;
    public static final Integer LUA_GCCOLLECT = new Integer(2);
    public static final Integer LUA_GCCOUNT = new Integer(3);
    public static final Integer LUA_GCCOUNTB = new Integer(4);
    public static final Integer LUA_GCRESTART = new Integer(1);
    public static final Integer LUA_GCSETPAUSE = new Integer(6);
    public static final Integer LUA_GCSETSTEPMUL = new Integer(7);
    public static final Integer LUA_GCSTEP = new Integer(5);
    public static final Integer LUA_GCSTOP = new Integer(0);
    public static final int LUA_MINSTACK = 20;
    public static final int LUA_MULTRET = -1;
    public static final int LUA_NUMTAGS = 9;
    public static final int LUA_OK = 0;
    public static final int LUA_REGISTRYINDEX = _registryIndex();
    public static final int LUA_TBOOLEAN = 1;
    public static final int LUA_TFUNCTION = 6;
    public static final int LUA_TLIGHTUSERDATA = 2;
    public static final int LUA_TNIL = 0;
    public static final int LUA_TNONE = -1;
    public static final int LUA_TNUMBER = 3;
    public static final int LUA_TSTRING = 4;
    public static final int LUA_TTABLE = 5;
    public static final int LUA_TTHREAD = 8;
    public static final int LUA_TUSERDATA = 7;
    public static final int LUA_YIELD = 1;
    private static final double zs_d = 0.09394d;
    private static final double zs_x = 0.09392d;
    private CPtr luaState;
    private int stateId;

    protected LuaState(int i) {
        CPtr cPtr = (CPtr) _open();
        this.luaState = cPtr;
        _luajavaOpen(cPtr, i);
        this.stateId = i;
    }

    protected LuaState(CPtr cPtr) {
        this.luaState = cPtr;
        int insertLuaState = LuaStateFactory.insertLuaState(this);
        this.stateId = insertLuaState;
        _luajavaOpen(cPtr, insertLuaState);
    }

    private native synchronized int _LargError(CPtr cPtr, int i, String str);

    private native synchronized int _LcallMeta(CPtr cPtr, int i, String str);

    private native synchronized void _LcheckAny(CPtr cPtr, int i);

    private native synchronized int _LcheckInteger(CPtr cPtr, int i);

    private native synchronized double _LcheckNumber(CPtr cPtr, int i);

    private native synchronized void _LcheckStack(CPtr cPtr, int i, String str);

    private native synchronized String _LcheckString(CPtr cPtr, int i);

    private native synchronized void _LcheckType(CPtr cPtr, int i, int i2);

    private native synchronized int _LdoFile(CPtr cPtr, String str);

    private native synchronized int _LdoString(CPtr cPtr, String str);

    private native synchronized int _LgetMetaField(CPtr cPtr, int i, String str);

    private native synchronized void _LgetMetatable(CPtr cPtr, String str);

    private native synchronized String _Lgsub(CPtr cPtr, String str, String str2, String str3);

    private native synchronized int _LloadBuffer(CPtr cPtr, byte[] bArr, long j, String str);

    private native synchronized int _LloadFile(CPtr cPtr, String str);

    private native synchronized int _LloadString(CPtr cPtr, String str);

    private native synchronized int _LnewMetatable(CPtr cPtr, String str);

    private native synchronized int _LoptInteger(CPtr cPtr, int i, int i2);

    private native synchronized double _LoptNumber(CPtr cPtr, int i, double d);

    private native synchronized String _LoptString(CPtr cPtr, int i, String str);

    private native synchronized int _Lref(CPtr cPtr, int i);

    private native synchronized void _LunRef(CPtr cPtr, int i, int i2);

    private native synchronized void _Lwhere(CPtr cPtr, int i);

    private native synchronized void _call(CPtr cPtr, int i, int i2);

    private native synchronized int _checkStack(CPtr cPtr, int i);

    private native synchronized void _close(CPtr cPtr);

    private native synchronized void _concat(CPtr cPtr, int i);

    private native synchronized void _createTable(CPtr cPtr, int i, int i2);

    private native synchronized int _equal(CPtr cPtr, int i, int i2);

    private native synchronized int _error(CPtr cPtr);

    private native synchronized int _gc(CPtr cPtr, int i, int i2);

    private native synchronized void _getField(CPtr cPtr, int i, String str);

    private native synchronized void _getGlobal(CPtr cPtr, String str);

    private native synchronized int _getMetaTable(CPtr cPtr, int i);

    private native synchronized Object _getObjectFromUserdata(CPtr cPtr, int i);

    private native synchronized void _getTable(CPtr cPtr, int i);

    private native synchronized int _getTop(CPtr cPtr);

    private native synchronized void _insert(CPtr cPtr, int i);

    private native synchronized int _isBoolean(CPtr cPtr, int i);

    private native synchronized int _isCFunction(CPtr cPtr, int i);

    private native synchronized int _isFunction(CPtr cPtr, int i);

    private native synchronized boolean _isJavaFunction(CPtr cPtr, int i);

    private native synchronized int _isNil(CPtr cPtr, int i);

    private native synchronized int _isNone(CPtr cPtr, int i);

    private native synchronized int _isNoneOrNil(CPtr cPtr, int i);

    private native synchronized int _isNumber(CPtr cPtr, int i);

    private native synchronized boolean _isObject(CPtr cPtr, int i);

    private native synchronized int _isString(CPtr cPtr, int i);

    private native synchronized int _isTable(CPtr cPtr, int i);

    private native synchronized int _isThread(CPtr cPtr, int i);

    private native synchronized int _isUserdata(CPtr cPtr, int i);

    private native synchronized int _lessthan(CPtr cPtr, int i, int i2);

    private native synchronized void _luajavaOpen(CPtr cPtr, int i);

    private native synchronized void _newTable(CPtr cPtr);

    private native synchronized Object _newthread(CPtr cPtr);

    private native synchronized int _next(CPtr cPtr, int i);

    private native synchronized int _objlen(CPtr cPtr, int i);

    private native synchronized int _objlen2(CPtr cPtr, int i);

    private native synchronized Object _open();

    private native synchronized void _openBase(CPtr cPtr);

    private native synchronized void _openDebug(CPtr cPtr);

    private native synchronized void _openIo(CPtr cPtr);

    private native synchronized void _openLibs(CPtr cPtr);

    private native synchronized void _openMath(CPtr cPtr);

    private native synchronized void _openOs(CPtr cPtr);

    private native synchronized void _openPackage(CPtr cPtr);

    private native synchronized void _openString(CPtr cPtr);

    private native synchronized void _openTable(CPtr cPtr);

    private native synchronized int _pcall(CPtr cPtr, int i, int i2, int i3);

    private native synchronized void _pop(CPtr cPtr, int i);

    private native synchronized void _pushBoolean(CPtr cPtr, int i);

    private native synchronized void _pushInteger(CPtr cPtr, int i);

    private native synchronized void _pushJavaFunction(CPtr cPtr, Object obj);

    private native synchronized void _pushJavaObject(CPtr cPtr, Object obj);

    private native synchronized void _pushNil(CPtr cPtr);

    private native synchronized void _pushNumber(CPtr cPtr, double d);

    private native synchronized void _pushString(CPtr cPtr, String str);

    private native synchronized void _pushString2(CPtr cPtr, byte[] bArr, int i);

    private native synchronized void _pushValue(CPtr cPtr, int i);

    private native synchronized void _rawGet(CPtr cPtr, int i);

    private native synchronized void _rawGetI(CPtr cPtr, int i, int i2);

    private native synchronized void _rawSet(CPtr cPtr, int i);

    private native synchronized void _rawSetI(CPtr cPtr, int i, int i2);

    private native synchronized int _rawequal(CPtr cPtr, int i, int i2);

    private static native int _registryIndex();

    private native synchronized void _remove(CPtr cPtr, int i);

    private native synchronized void _replace(CPtr cPtr, int i);

    private native synchronized int _resume(CPtr cPtr, CPtr cPtr2, int i);

    private native synchronized void _setField(CPtr cPtr, int i, String str);

    private native synchronized void _setGlobal(CPtr cPtr, String str);

    private native synchronized int _setMetaTable(CPtr cPtr, int i);

    private native synchronized void _setTable(CPtr cPtr, int i);

    private native synchronized void _setTop(CPtr cPtr, int i);

    private native synchronized int _status(CPtr cPtr);

    private native synchronized int _strlen(CPtr cPtr, int i);

    private native synchronized int _toBoolean(CPtr cPtr, int i);

    private native synchronized int _toInteger(CPtr cPtr, int i);

    private native synchronized double _toNumber(CPtr cPtr, int i);

    private native synchronized String _toString(CPtr cPtr, int i);

    private native synchronized Object _toThread(CPtr cPtr, int i);

    private native synchronized int _type(CPtr cPtr, int i);

    private native synchronized String _typeName(CPtr cPtr, int i);

    private native synchronized void _xmove(CPtr cPtr, CPtr cPtr2, int i);

    private native synchronized int _yield(CPtr cPtr, int i);

    public static Number convertLuaNumber(Double d, Class cls) {
        if (cls.isPrimitive()) {
            return cls == Integer.TYPE ? new Integer(d.intValue()) : cls == Long.TYPE ? new Long(d.longValue()) : cls == Float.TYPE ? new Float(d.floatValue()) : cls == Double.TYPE ? d : cls == Byte.TYPE ? new Byte(d.byteValue()) : cls == Short.TYPE ? new Short(d.shortValue()) : d;
        }
        if (!cls.isAssignableFrom(Number.class)) {
            return null;
        }
        long longValue = d.longValue();
        double doubleValue = d.doubleValue();
        double d2 = (double) longValue;
        Double.isNaN(d2);
        double d3 = doubleValue - d2;
        if (d3 < 0.0d) {
            d3 = -d3;
        }
        return (d3 <= zs_x || d3 >= zs_d) ? (d.doubleValue() <= 1.401298464324817E-45d || d.doubleValue() >= 3.4028234663852886E38d) ? Double.valueOf(d.doubleValue()) : Float.valueOf(d.floatValue()) : (longValue <= -2147483648L || longValue >= 2147483647L) ? Long.valueOf(longValue) : Integer.valueOf(d.intValue());
    }

    public int LargError(int i, String str) {
        return _LargError(this.luaState, i, str);
    }

    public int LcallMeta(int i, String str) {
        return _LcallMeta(this.luaState, i, str);
    }

    public void LcheckAny(int i) {
        _LcheckAny(this.luaState, i);
    }

    public int LcheckInteger(int i) {
        return _LcheckInteger(this.luaState, i);
    }

    public double LcheckNumber(int i) {
        return _LcheckNumber(this.luaState, i);
    }

    public void LcheckStack(int i, String str) {
        _LcheckStack(this.luaState, i, str);
    }

    public String LcheckString(int i) {
        return _LcheckString(this.luaState, i);
    }

    public void LcheckType(int i, int i2) {
        _LcheckType(this.luaState, i, i2);
    }

    public int LdoFile(String str) {
        return _LdoFile(this.luaState, str);
    }

    public int LdoString(String str) {
        return _LdoString(this.luaState, str);
    }

    public int LgetMetaField(int i, String str) {
        return _LgetMetaField(this.luaState, i, str);
    }

    public void LgetMetatable(String str) {
        _LgetMetatable(this.luaState, str);
    }

    public String Lgsub(String str, String str2, String str3) {
        return _Lgsub(this.luaState, str, str2, str3);
    }

    public int LloadBuffer(byte[] bArr, String str) {
        return _LloadBuffer(this.luaState, bArr, (long) bArr.length, str);
    }

    public int LloadFile(String str) {
        return _LloadFile(this.luaState, str);
    }

    public int LloadString(String str) {
        return _LloadString(this.luaState, str);
    }

    public int LnewMetatable(String str) {
        return _LnewMetatable(this.luaState, str);
    }

    public int LoptInteger(int i, int i2) {
        return _LoptInteger(this.luaState, i, i2);
    }

    public double LoptNumber(int i, double d) {
        return _LoptNumber(this.luaState, i, d);
    }

    public String LoptString(int i, String str) {
        return _LoptString(this.luaState, i, str);
    }

    public int Lref(int i) {
        return _Lref(this.luaState, i);
    }

    public void LunRef(int i, int i2) {
        _LunRef(this.luaState, i, i2);
    }

    public void Lwhere(int i) {
        _Lwhere(this.luaState, i);
    }

    public void call(int i, int i2) {
        _call(this.luaState, i, i2);
    }

    public int checkStack(int i) {
        return _checkStack(this.luaState, i);
    }

    public synchronized void close() {
        LuaStateFactory.removeLuaState(this.stateId);
        _close(this.luaState);
        this.luaState = null;
    }

    public void concat(int i) {
        _concat(this.luaState, i);
    }

    public void createTable(int i, int i2) {
        _createTable(this.luaState, i, i2);
    }

    public String dumpStack() {
        int top = getTop();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= top; i++) {
            int type = type(i);
            sb.append(i);
            sb.append(": ");
            sb.append(typeName(type));
            if (type == 3) {
                sb.append(" = ");
                sb.append(toNumber(i));
            } else if (type == 4) {
                sb.append(" = '");
                sb.append(toString(i));
                sb.append("'");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int equal(int i, int i2) {
        return _equal(this.luaState, i, i2);
    }

    public int error() {
        return _error(this.luaState);
    }

    /* renamed from: gc */
    public int mo12406gc(int i, int i2) {
        return _gc(this.luaState, i, i2);
    }

    public long getCPtrPeer() {
        CPtr cPtr = this.luaState;
        if (cPtr != null) {
            return cPtr.getPeer();
        }
        return 0;
    }

    public void getField(int i, String str) {
        _getField(this.luaState, i, str);
    }

    public synchronized void getGlobal(String str) {
        _getGlobal(this.luaState, str);
    }

    public LuaObject getLuaObject(int i) {
        return new LuaObject(this, i);
    }

    public LuaObject getLuaObject(String str) {
        return new LuaObject(this, str);
    }

    public LuaObject getLuaObject(LuaObject luaObject, Number number) {
        if (luaObject.f3601L.getCPtrPeer() == this.luaState.getPeer()) {
            return new LuaObject(luaObject, number);
        }
        throw new LuaException("Object must have the same LuaState as the parent!");
    }

    public LuaObject getLuaObject(LuaObject luaObject, String str) {
        if (luaObject.f3601L.getCPtrPeer() == this.luaState.getPeer()) {
            return new LuaObject(luaObject, str);
        }
        throw new LuaException("Object must have the same LuaState as the parent!");
    }

    public LuaObject getLuaObject(LuaObject luaObject, LuaObject luaObject2) {
        if (luaObject.getLuaState().getCPtrPeer() == this.luaState.getPeer() && luaObject.getLuaState().getCPtrPeer() == luaObject2.getLuaState().getCPtrPeer()) {
            return new LuaObject(luaObject, luaObject2);
        }
        throw new LuaException("Object must have the same LuaState as the parent!");
    }

    public int getMetaTable(int i) {
        return _getMetaTable(this.luaState, i);
    }

    public Object getObjectFromUserdata(int i) {
        return _getObjectFromUserdata(this.luaState, i);
    }

    public void getTable(int i) {
        _getTable(this.luaState, i);
    }

    public int getTop() {
        return _getTop(this.luaState);
    }

    public void insert(int i) {
        _insert(this.luaState, i);
    }

    public boolean isBoolean(int i) {
        return _isBoolean(this.luaState, i) != 0;
    }

    public boolean isCFunction(int i) {
        return _isCFunction(this.luaState, i) != 0;
    }

    public synchronized boolean isClosed() {
        return this.luaState == null;
    }

    public boolean isFunction(int i) {
        return _isFunction(this.luaState, i) != 0;
    }

    public boolean isJavaFunction(int i) {
        return _isJavaFunction(this.luaState, i);
    }

    public boolean isNil(int i) {
        return _isNil(this.luaState, i) != 0;
    }

    public boolean isNone(int i) {
        return _isNone(this.luaState, i) != 0;
    }

    public boolean isNoneOrNil(int i) {
        return _isNoneOrNil(this.luaState, i) != 0;
    }

    public boolean isNumber(int i) {
        return _isNumber(this.luaState, i) != 0;
    }

    public boolean isObject(int i) {
        return _isObject(this.luaState, i);
    }

    public boolean isString(int i) {
        return _isString(this.luaState, i) != 0;
    }

    public boolean isTable(int i) {
        return _isTable(this.luaState, i) != 0;
    }

    public boolean isThread(int i) {
        return _isThread(this.luaState, i) != 0;
    }

    public boolean isUserdata(int i) {
        return _isUserdata(this.luaState, i) != 0;
    }

    public int lessthan(int i, int i2) {
        return _lessthan(this.luaState, i, i2);
    }

    public void newTable() {
        _newTable(this.luaState);
    }

    public LuaState newThread() {
        LuaState luaState2 = new LuaState((CPtr) _newthread(this.luaState));
        LuaStateFactory.insertLuaState(luaState2);
        return luaState2;
    }

    public int next(int i) {
        return _next(this.luaState, i);
    }

    public int objLen(int i) {
        return _objlen(this.luaState, i);
    }

    public int objLen2(int i) {
        return _objlen2(this.luaState, i);
    }

    public void openBase() {
        _openBase(this.luaState);
    }

    public void openDebug() {
        _openDebug(this.luaState);
    }

    public void openIo() {
        _openIo(this.luaState);
    }

    public void openLibs() {
        _openLibs(this.luaState);
    }

    public void openMath() {
        _openMath(this.luaState);
    }

    public void openOs() {
        _openOs(this.luaState);
    }

    public void openPackage() {
        _openPackage(this.luaState);
    }

    public void openString() {
        _openString(this.luaState);
    }

    public void openTable() {
        _openTable(this.luaState);
    }

    public int pcall(int i, int i2, int i3) {
        return _pcall(this.luaState, i, i2, i3);
    }

    public void pop(int i) {
        _pop(this.luaState, i);
    }

    public void pushBoolean(boolean z) {
        _pushBoolean(this.luaState, z ? 1 : 0);
    }

    public void pushInteger(int i) {
        _pushInteger(this.luaState, i);
    }

    public void pushJavaFunction(JavaFunction javaFunction) {
        _pushJavaFunction(this.luaState, javaFunction);
    }

    public void pushJavaObject(Object obj) {
        _pushJavaObject(this.luaState, obj);
    }

    public void pushNil() {
        _pushNil(this.luaState);
    }

    public void pushNumber(double d) {
        _pushNumber(this.luaState, d);
    }

    public void pushObjectValue(Object obj) {
        if (obj == null) {
            pushNil();
        } else if (obj instanceof Boolean) {
            pushBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Number) {
            pushNumber(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            pushString((String) obj);
        } else if (obj instanceof JavaFunction) {
            pushJavaFunction((JavaFunction) obj);
        } else if (obj instanceof LuaObject) {
            ((LuaObject) obj).push();
        } else if (obj instanceof byte[]) {
            pushString((byte[]) obj);
        } else {
            pushJavaObject(obj);
        }
    }

    public void pushString(String str) {
        if (str == null) {
            _pushNil(this.luaState);
        } else {
            _pushString(this.luaState, str);
        }
    }

    public void pushString(byte[] bArr) {
        if (bArr == null) {
            _pushNil(this.luaState);
        } else {
            _pushString2(this.luaState, bArr, bArr.length);
        }
    }

    public void pushValue(int i) {
        _pushValue(this.luaState, i);
    }

    public void rawGet(int i) {
        _rawGet(this.luaState, i);
    }

    public void rawGetI(int i, int i2) {
        _rawGetI(this.luaState, i, i2);
    }

    public void rawSet(int i) {
        _rawSet(this.luaState, i);
    }

    public void rawSetI(int i, int i2) {
        _rawSetI(this.luaState, i, i2);
    }

    public int rawequal(int i, int i2) {
        return _rawequal(this.luaState, i, i2);
    }

    public void remove(int i) {
        _remove(this.luaState, i);
    }

    public void replace(int i) {
        _replace(this.luaState, i);
    }

    public int resume(CPtr cPtr, int i) {
        return _resume(this.luaState, cPtr, i);
    }

    public void setField(int i, String str) {
        _setField(this.luaState, i, str);
    }

    public synchronized void setGlobal(String str) {
        _setGlobal(this.luaState, str);
    }

    public int setMetaTable(int i) {
        return _setMetaTable(this.luaState, i);
    }

    public void setTable(int i) {
        _setTable(this.luaState, i);
    }

    public void setTop(int i) {
        _setTop(this.luaState, i);
    }

    public int status() {
        return _status(this.luaState);
    }

    public int strLen(int i) {
        return _strlen(this.luaState, i);
    }

    public boolean toBoolean(int i) {
        return _toBoolean(this.luaState, i) != 0;
    }

    public int toInteger(int i) {
        return _toInteger(this.luaState, i);
    }

    public synchronized Object toJavaObject(int i) {
        Object obj;
        obj = null;
        if (isBoolean(i)) {
            obj = new Boolean(toBoolean(i));
        } else if (type(i) == 4) {
            obj = toString(i);
        } else {
            if (!isFunction(i)) {
                if (!isTable(i)) {
                    if (type(i) == 3) {
                        obj = new Double(toNumber(i));
                    } else if (!isUserdata(i)) {
                        isNil(i);
                    } else if (isObject(i)) {
                        obj = getObjectFromUserdata(i);
                    }
                }
            }
            obj = getLuaObject(i);
        }
        return obj;
    }

    public double toNumber(int i) {
        return _toNumber(this.luaState, i);
    }

    public String toString(int i) {
        return _toString(this.luaState, i);
    }

    public LuaState toThread(int i) {
        return new LuaState((CPtr) _toThread(this.luaState, i));
    }

    public int type(int i) {
        return _type(this.luaState, i);
    }

    public String typeName(int i) {
        return _typeName(this.luaState, i);
    }

    public void xmove(LuaState luaState2, int i) {
        _xmove(this.luaState, luaState2.luaState, i);
    }

    public int yield(int i) {
        return _yield(this.luaState, i);
    }
}
