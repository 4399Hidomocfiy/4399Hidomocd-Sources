package com.iapp.app;

import android.content.Context;
import android.os.Build;
import p013b.p044b.p045a.p046a.p047y.C0909b;

/* renamed from: com.iapp.app.a */
public class C1293a {

    /* renamed from: a */
    private static String f3048a;

    /* renamed from: b */
    public static C0909b f3049b;

    /* renamed from: c */
    public static String f3050c;

    static {
        String str = Build.MODEL;
    }

    /* renamed from: a */
    public static String m3483a(Context context) {
        if (f3048a == null) {
            f3048a = context.getFilesDir().getPath() + '/';
        }
        return f3048a;
    }
}
