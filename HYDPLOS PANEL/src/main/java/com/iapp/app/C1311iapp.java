package com.iapp.app;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.iapp.app.run.mian;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.iapp */
public class C1311iapp {
    private C0864v ayc;
    private Aid_YuCodeX aycX;

    public C1311iapp(Context context, Activity activity) {
        if (mian.f3388sh) {
            this.ayc = new C0864v(context, activity);
        } else {
            this.aycX = new Aid_YuCodeX(context, activity);
        }
    }

    @JavascriptInterface
    /* renamed from: fn */
    public void mo11951fn(String str) {
        if (mian.f3388sh) {
            this.ayc.mo8986w0(str);
        } else {
            this.aycX.function2(str);
        }
    }

    @JavascriptInterface
    public String fn2(String str, String str2) {
        if (mian.f3388sh) {
            this.ayc.mo8986w0(str);
            Object X = this.ayc.mo8982X(str2);
            if (X == null) {
                return null;
            }
            return X.toString();
        }
        this.aycX.function2(str);
        Object dimget2 = this.aycX.dimget2(str2);
        if (dimget2 == null) {
            return null;
        }
        return dimget2.toString();
    }

    @JavascriptInterface
    /* renamed from: g */
    public String mo11953g(String str) {
        if (mian.f3388sh) {
            Object X = this.ayc.mo8982X(str);
            if (X == null) {
                return null;
            }
            return X.toString();
        }
        Object dimget2 = this.aycX.dimget2(str);
        if (dimget2 == null) {
            return null;
        }
        return dimget2.toString();
    }

    @JavascriptInterface
    /* renamed from: s */
    public void mo11954s(String str, String str2) {
        if (mian.f3388sh) {
            this.ayc.mo8981T(str, str2);
        } else {
            this.aycX.dim(str, str2);
        }
    }
}
