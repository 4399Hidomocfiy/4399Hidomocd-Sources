package com.iapp.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.io.File;
import java.util.Date;
import p013b.p044b.p045a.p046a.C0828a;
import p013b.p044b.p045a.p046a.C0830c;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0839h;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;
import p013b.p048c.p049a.C0916b;

/* renamed from: com.iapp.app.e */
public class C1303e {

    /* renamed from: a */
    private static String f3064a;

    /* renamed from: lb */
    private static byte[] f3065lb;

    /* renamed from: a */
    public static String m3522a(String str, String str2) {
        return C0860r.m2051j(str, str2);
    }

    /* renamed from: aa */
    public static String m3523aa() {
        return m3524ab().substring(6);
    }

    /* renamed from: ab */
    public static String m3524ab() {
        return C0860r.m2045d(String.valueOf(m3525ac()));
    }

    /* renamed from: ac */
    public static int m3525ac() {
        return 0;
    }

    /* renamed from: ad */
    public static String m3526ad(byte[] bArr) {
        return C0860r.m2046e(bArr);
    }

    /* renamed from: ae */
    public static boolean m3527ae(Context context) {
        return C0860r.m2067z(context);
    }

    /* renamed from: af */
    public static String m3528af(Context context) {
        if (f3064a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0835f.m1851h(context.getFilesDir().getPath() + "/config/userencryption.xml"));
            sb.append("");
            f3064a = C0860r.m2044c(sb.toString(), "<s>", "</s>");
        }
        return f3064a;
    }

    /* renamed from: ag */
    public static String m3529ag(byte[] bArr) {
        return C0860r.m2047f(bArr);
    }

    /* renamed from: ah */
    public static void m3530ah(Object[] objArr, String str) {
        if (objArr[0] instanceof C0864v) {
            ((C0864v) objArr[0]).mo8979K1(str, (ViewGroup) objArr[1], Integer.parseInt(objArr[2].toString()), objArr[3], (C0916b) objArr[4]);
        }
        if (objArr[0] instanceof Aid_YuCodeX) {
            ((Aid_YuCodeX) objArr[0]).openRestoreinterfaceX(str, (ViewGroup) objArr[1], Integer.parseInt(objArr[2].toString()), objArr[3], (C0916b) objArr[4], objArr[5].toString());
        } else if (objArr[0] instanceof Aid_luaCode) {
            ((Aid_luaCode) objArr[0]).openRestoreinterfaceX(str, (ViewGroup) objArr[1], Integer.parseInt(objArr[2].toString()), objArr[3], (C0916b) objArr[4], (StringBuffer) objArr[5], (C1298d) objArr[6]);
        } else if (objArr[0] instanceof Aid_javaCode) {
            ((Aid_javaCode) objArr[0]).openRestoreinterfaceX(str, (ViewGroup) objArr[1], Integer.parseInt(objArr[2].toString()), objArr[3], (C0916b) objArr[4], (StringBuffer) objArr[5], (C1309h) objArr[6]);
        } else if (objArr[0] instanceof Aid_jsCode) {
            ((Aid_jsCode) objArr[0]).openRestoreinterfaceX(str, (ViewGroup) objArr[1], Integer.parseInt(objArr[2].toString()), objArr[3], (C0916b) objArr[4], (StringBuffer) objArr[5], (WebView) objArr[6]);
        }
    }

    /* renamed from: ai */
    public static void m3531ai(Object obj) {
        C0839h.m1885A(obj);
    }

    /* renamed from: b */
    public static String m3532b(String str) {
        return C0835f.m1851h(str);
    }

    /* renamed from: c */
    public static String m3533c(String str, String str2) {
        return C0860r.m2049h(str, str2);
    }

    /* renamed from: d */
    public static String m3534d(String str) {
        return C0860r.m2045d(str);
    }

    /* renamed from: e */
    public static int m3535e(int i, int i2) {
        return C0860r.m2048g(i, i2);
    }

    /* renamed from: f */
    public static long m3536f() {
        return new Date().getTime();
    }

    /* renamed from: g */
    public static String[] m3537g(String str) {
        return new File(str).list();
    }

    /* renamed from: h */
    public static byte[] m3538h(String str) {
        return C0835f.m1864u(str);
    }

    /* renamed from: i */
    public static void m3539i(String str, byte[] bArr) {
        C0835f.m1853j(str, bArr);
    }

    /* renamed from: j */
    public static byte m3540j(byte[] bArr) {
        return C0860r.m2061t(bArr);
    }

    /* renamed from: k */
    public static byte[] m3541k(byte[] bArr, byte[] bArr2) {
        return C0830c.m1812c(bArr, bArr2);
    }

    /* renamed from: l */
    public static byte[] m3542l(String str, Context context) {
        if (f3065lb == null) {
            try {
                String f = C0835f.m1849f(context, str);
                f3065lb = C0828a.m1804a(f, C0860r.m2045d(m3525ac() + C1294b.m3496g()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (byte[]) f3065lb.clone();
    }

    /* renamed from: m */
    public static byte[] m3543m(byte[] bArr, int i, int i2) {
        return C0830c.m1810a(bArr, i, i2);
    }

    /* renamed from: n */
    public static int m3544n(byte[] bArr, byte[] bArr2, int i) {
        return C0830c.m1813d(bArr, bArr2, i);
    }

    /* renamed from: o */
    public static String m3545o(String str) {
        return str;
    }

    /* renamed from: p */
    public static void m3546p(String str, String str2) {
        C0860r.m2055n(str, str2.replace("&lt;", "<").replace("&gt;", ">"));
    }

    /* renamed from: q */
    public static byte[] m3547q(byte[] bArr, byte[] bArr2) {
        return C0830c.m1812c(bArr, bArr2);
    }

    /* renamed from: r */
    public static int m3548r(String str, int i) {
        return C0860r.m2050i(str, i);
    }

    /* renamed from: s */
    public static String m3549s(String str, String str2, String str3) {
        return C0860r.m2044c(str, str2, str3);
    }

    /* renamed from: s */
    public static byte[] m3550s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return C0830c.m1811b(bArr, bArr2, bArr3, 0);
    }

    /* renamed from: t */
    public static View m3551t(int i, String str) {
        return null;
    }

    /* renamed from: t */
    public static View m3552t(int i, String str, String str2) {
        return null;
    }

    /* renamed from: u */
    public static View m3553u(int i, View view) {
        return C0860r.m2054m(i, view);
    }

    /* renamed from: v */
    public static void m3554v(View view, View view2) {
        C0860r.m2066y(view, view2);
    }

    /* renamed from: w */
    public static boolean m3555w(View view, int i, String str) {
        return true;
    }

    /* renamed from: w */
    public static boolean m3556w(View view, String str) {
        return true;
    }

    /* renamed from: x */
    public static void m3557x(View view, String str, String str2, String str3) {
    }

    /* renamed from: x */
    public static void m3558x(View view, String str, String str2, String str3, Object obj) {
    }

    /* renamed from: y */
    public static void m3559y(View view, View view2) {
    }

    /* renamed from: z */
    public static void m3560z(View view, String str) {
    }
}
