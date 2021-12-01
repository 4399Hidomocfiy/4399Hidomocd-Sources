package com.iapp.app;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.d */
public class C1298d {

    /* renamed from: a */
    private LuaState f3058a;

    /* renamed from: b */
    private Context f3059b;

    /* renamed from: c */
    private Handler f3060c = new HandlerC1302d();

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.d$a */
    public class C1299a extends JavaFunction {
        C1299a(C1298d dVar, LuaState luaState) {
            super(luaState);
        }

        @Override // org.keplerproject.luajava.JavaFunction
        public int execute() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 2; i <= this.f3600L.getTop(); i++) {
                String typeName = this.f3600L.typeName(this.f3600L.type(i));
                String str = null;
                if (typeName.equals("userdata")) {
                    Object javaObject = this.f3600L.toJavaObject(i);
                    if (javaObject != null) {
                        str = javaObject.toString();
                    }
                } else {
                    str = typeName.equals("nil") ? "null" : typeName.equals("boolean") ? this.f3600L.toBoolean(i) ? "true" : "false" : this.f3600L.toString(i);
                }
                if (str != null) {
                    typeName = str;
                }
                stringBuffer.append(typeName);
                stringBuffer.append('\t');
            }
            C0864v.m2157O2(stringBuffer.toString());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.d$b */
    public class C1300b extends JavaFunction {
        C1300b(LuaState luaState) {
            super(luaState);
        }

        @Override // org.keplerproject.luajava.JavaFunction
        public int execute() {
            Message message;
            int top = this.f3600L.getTop();
            if (top < 2) {
                return 0;
            }
            String typeName = this.f3600L.typeName(this.f3600L.type(2));
            String str = null;
            if (typeName.equals("userdata")) {
                Object javaObject = this.f3600L.toJavaObject(2);
                if (javaObject != null) {
                    str = javaObject.toString();
                }
            } else {
                str = typeName.equals("nil") ? "null" : typeName.equals("boolean") ? this.f3600L.toBoolean(2) ? "true" : "false" : this.f3600L.toString(2);
            }
            if (str != null) {
                typeName = str;
            }
            if (top > 2) {
                message = new Message();
                message.what = 1;
                message.arg1 = this.f3600L.toInteger(3);
            } else {
                message = new Message();
                message.what = 1;
                message.arg1 = 1;
            }
            message.obj = typeName;
            C1298d.this.f3060c.sendMessage(message);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.d$c */
    public class C1301c extends JavaFunction {
        C1301c(LuaState luaState) {
            super(luaState);
        }

        @Override // org.keplerproject.luajava.JavaFunction
        public int execute() {
            C1294b.m3504h8(C1298d.this.f3059b, this.f3600L, this.f3600L.toString(-1).toLowerCase());
            return 1;
        }
    }

    /* renamed from: com.iapp.app.d$d */
    class HandlerC1302d extends Handler {
        HandlerC1302d() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                Toast.makeText(C1298d.this.f3059b, (String) message.obj, message.arg1).show();
            }
        }
    }

    public C1298d(Context context) {
        this.f3059b = context;
        LuaState newLuaState = LuaStateFactory.newLuaState();
        this.f3058a = newLuaState;
        newLuaState.openLibs();
    }

    /* renamed from: f */
    private String m3512f(int i) {
        if (i == 1) {
            return "Yield error";
        }
        if (i == 2) {
            return "Runtime error";
        }
        if (i == 3) {
            return "Syntax error";
        }
        if (i == 4) {
            return "Out of memory";
        }
        return "Unknown error " + i;
    }

    /* renamed from: c */
    public void mo11692c(String str) {
        try {
            this.f3058a.getLuaObject(str).callx();
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("VoidMethod LuaErr：\n" + e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo11693d(String str, Object... objArr) {
        try {
            LuaObject luaObject = this.f3058a.getLuaObject(str);
            if (!luaObject.isNil()) {
                luaObject.call(objArr);
            }
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("Method LuaErr：\n" + e.getMessage());
        }
    }

    /* renamed from: e */
    public boolean mo11694e(String str, Object... objArr) {
        Object obj;
        try {
            LuaObject luaObject = this.f3058a.getLuaObject(str);
            if (luaObject.isNil()) {
                return false;
            }
            obj = luaObject.call(objArr);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("Method LuaErr：\n" + e.getMessage());
            obj = null;
        }
    }

    /* renamed from: g */
    public void mo11695g(String str) {
        this.f3058a.setTop(0);
        int LloadString = this.f3058a.LloadString(str.replace("&lt;", "<").replace("&gt;", ">"));
        if (LloadString == 0) {
            this.f3058a.getGlobal("debug");
            this.f3058a.getField(-1, "traceback");
            this.f3058a.remove(-2);
            this.f3058a.insert(-2);
            LloadString = this.f3058a.pcall(0, 0, -2);
            if (LloadString == 0) {
                return;
            }
        }
        throw new LuaException(m3512f(LloadString) + ": " + this.f3058a.toString(-1));
    }

    /* renamed from: h */
    public void mo11696h(String str) {
        this.f3058a.setTop(0);
        int LloadString = this.f3058a.LloadString(str);
        if (LloadString == 0) {
            this.f3058a.getGlobal("debug");
            this.f3058a.getField(-1, "traceback");
            this.f3058a.remove(-2);
            this.f3058a.insert(-2);
            LloadString = this.f3058a.pcall(0, 0, -2);
            if (LloadString == 0) {
                return;
            }
        }
        throw new LuaException(m3512f(LloadString) + ": " + this.f3058a.toString(-1));
    }

    /* renamed from: i */
    public void mo11697i(String str) {
        this.f3058a.setTop(0);
        int h8 = C1294b.m3504h8(this.f3059b, this.f3058a, str.toLowerCase());
        if (h8 == 0) {
            this.f3058a.getGlobal("debug");
            this.f3058a.getField(-1, "traceback");
            this.f3058a.remove(-2);
            this.f3058a.insert(-2);
            h8 = this.f3058a.pcall(0, 0, -2);
            if (h8 == 0) {
                return;
            }
        }
        throw new LuaException(m3512f(h8) + ": " + this.f3058a.toString(-1));
    }

    /* renamed from: j */
    public LuaState mo11698j() {
        return this.f3058a;
    }

    /* renamed from: k */
    public void mo11699k() {
        try {
            C1299a aVar = new C1299a(this, this.f3058a);
            aVar.register("print");
            aVar.register("syso");
            new C1300b(this.f3058a).register("tw");
            C1301c cVar = new C1301c(this.f3058a);
            this.f3058a.getGlobal("package");
            this.f3058a.getField(-1, "loaders");
            int objLen = this.f3058a.objLen(-1);
            this.f3058a.pushJavaFunction(cVar);
            this.f3058a.rawSetI(-2, objLen + 1);
            this.f3058a.pop(1);
            this.f3058a.getField(-1, "path");
            LuaState luaState = this.f3058a;
            luaState.pushString(";" + (this.f3059b.getFilesDir() + "/?.lua"));
            this.f3058a.concat(2);
            this.f3058a.setField(-2, "path");
            this.f3058a.pop(1);
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public void mo11700l(String str, Object obj) {
        this.f3058a.pushJavaObject(obj);
        this.f3058a.setGlobal(str);
    }
}
