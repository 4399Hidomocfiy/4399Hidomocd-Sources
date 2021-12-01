package com.iapp.app;

import android.content.Context;
import bsh.EvalError;
import bsh.Interpreter;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.h */
public class C1309h extends Interpreter {

    /* renamed from: a */
    private Context f3073a;

    public C1309h(Context context) {
        this.f3073a = context;
    }

    /* renamed from: a */
    public Object mo11941a(String str) {
        try {
            return getNameSpace().invokeMethod(str, new Object[0], this);
        } catch (EvalError e) {
            e.printStackTrace();
            C0864v.m2157O2("JavaErr：\n" + e.toString());
            return null;
        }
    }

    /* renamed from: b */
    public Object mo11942b(String str, Object... objArr) {
        try {
            return getNameSpace().invokeMethod(str, objArr, this);
        } catch (EvalError e) {
            e.printStackTrace();
            C0864v.m2157O2("JavaErr：\n" + e.toString());
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo11943c(String str, Object... objArr) {
        Object obj;
        try {
            obj = getNameSpace().invokeMethod(str, objArr, this);
        } catch (EvalError e) {
            e.printStackTrace();
            C0864v.m2157O2("JavaErr：\n" + e.toString());
            obj = null;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo11944d(String str) {
        try {
            eval("import com.iapp.interfaces.*;\nimport java.lang.*;\nimport java.util.*;\nprivate void syso(Object o){\ni.syso(o);\n}\nprivate void tw(Object o){\ni.tw(o);\n}\nprivate void tw(Object o,int s){\ni.tw(o,s);\n}\nprivate void fn(String o){\ni.fn(o);\n}\nprivate void ss(String o,Object v){\ni.ss(o,v);\n}\nprivate void sss(String o,Object v){\ni.sss(o,v);\n}\nprivate Object ss(String o){\nreturn i.ss(o);\n}\nprivate Object sss(String o){\nreturn i.sss(o);\n}\nprivate void imports(String o){\ni.imports(o);\n}\n");
            eval(str.replace("&lt;", "<").replace("&gt;", ">"), getNameSpace());
            return true;
        } catch (EvalError e) {
            e.printStackTrace();
            C0864v.m2157O2("JavaErr：\n" + e.toString());
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo11945e(String str) {
        try {
            eval("import com.iapp.interfaces.*;\nimport java.lang.*;\nimport java.util.*;\nprivate void syso(Object o){\ni.syso(o);\n}\nprivate void tw(Object o){\ni.tw(o);\n}\nprivate void tw(Object o,int s){\ni.tw(o,s);\n}\nprivate void fn(String o){\ni.fn(o);\n}\nprivate void ss(String o,Object v){\ni.ss(o,v);\n}\nprivate void sss(String o,Object v){\ni.sss(o,v);\n}\nprivate Object ss(String o){\nreturn i.ss(o);\n}\nprivate Object sss(String o){\nreturn i.sss(o);\n}\nprivate void imports(String o){\ni.imports(o);\n}\n");
            return C1294b.m3503h7(this.f3073a, this, str.toLowerCase());
        } catch (EvalError e) {
            e.printStackTrace();
            C0864v.m2157O2("MJavaErr：\n" + e.toString());
            return false;
        }
    }

    /* renamed from: f */
    public boolean mo11946f(String str) {
        return C1294b.m3503h7(this.f3073a, this, str.toLowerCase());
    }
}
