package com.iapp.app.p067x5;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iapp.app.Aid_YuCodeX;
import com.iapp.app.Aid_javaCode;
import com.iapp.app.Aid_jsCode;
import com.iapp.app.Aid_luaCode;
import com.iapp.app.C1298d;
import com.iapp.app.C1309h;
import com.iapp.app.run.main;
import com.iapp.app.run.main2;
import com.iapp.app.run.main3;
import com.iapp.app.run.mian;
import org.keplerproject.luajava.LuaObject;
import p013b.p044b.p045a.p046a.C0851m;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.x5.b */
public class C1443b {

    /* renamed from: a */
    public static ValueCallback<Uri> f3454a;

    /* renamed from: b */
    public static ValueCallback<Uri[]> f3455b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$a */
    public class C1444a extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3456a;

        /* renamed from: b */
        final /* synthetic */ Aid_jsCode f3457b;

        /* renamed from: c */
        final /* synthetic */ Activity f3458c;

        C1444a(C1443b bVar, boolean z, Aid_jsCode aid_jsCode, Activity activity) {
            this.f3456a = z;
            this.f3457b = aid_jsCode;
            this.f3458c = activity;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            if (this.f3456a) {
                int id = webView.getId();
                this.f3457b.callMethod("onprogresschanged" + id, id + ", '^view" + this.f3457b.TaskId + "st_vW" + id + "', " + i);
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3458c.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$b */
    public class C1445b extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3459a;

        /* renamed from: b */
        final /* synthetic */ Aid_jsCode f3460b;

        /* renamed from: c */
        final /* synthetic */ Activity f3461c;

        /* renamed from: d */
        final /* synthetic */ boolean f3462d;

        /* renamed from: e */
        final /* synthetic */ boolean f3463e;

        /* renamed from: f */
        final /* synthetic */ boolean f3464f;

        C1445b(C1443b bVar, boolean z, Aid_jsCode aid_jsCode, Activity activity, boolean z2, boolean z3, boolean z4) {
            this.f3459a = z;
            this.f3460b = aid_jsCode;
            this.f3461c = activity;
            this.f3462d = z2;
            this.f3463e = z3;
            this.f3464f = z4;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3463e) {
                int id = webView.getId();
                this.f3460b.callMethod("onpagefinished" + id, id + ", '^view" + this.f3460b.TaskId + "st_vW" + id + "', '" + str + "'");
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3462d) {
                int id = webView.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(this.f3460b.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(str);
                sb.append("', '");
                sb.append(main2.set("^onpagestarted" + this.f3460b.TaskId + "st_bP" + id, bitmap));
                sb.append("'");
                this.f3460b.callMethod("onpagestarted" + id, sb.toString());
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3464f) {
                int id = webView.getId();
                this.f3460b.callMethod("onreceivederror" + id, id + ", '^view" + this.f3460b.TaskId + "st_vW" + id + "', '" + str2 + "', '" + str + "', " + i);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.f3459a) {
                int id = webView.getId();
                this.f3460b.callMethod("shouldoverrideurlloading" + id, id + ", '^view" + this.f3460b.TaskId + "st_vW" + id + "', '" + str + "'");
                return true;
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3461c.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3461c, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$c */
    public class C1446c extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ String[] f3465a;

        /* renamed from: b */
        final /* synthetic */ Aid_jsCode f3466b;

        C1446c(C1443b bVar, String[] strArr, Aid_jsCode aid_jsCode) {
            this.f3465a = strArr;
            this.f3466b = aid_jsCode;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3465a[2] != null) {
                int id = webView.getId();
                Aid_jsCode aid_jsCode = this.f3466b;
                String str2 = this.f3465a[2];
                aid_jsCode.TheCallbackString(str2, id + ", '^view" + this.f3466b.TaskId + "st_vW" + id + "', '" + str + "'");
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3465a[1] != null) {
                int id = webView.getId();
                Aid_jsCode aid_jsCode = this.f3466b;
                String str2 = this.f3465a[1];
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(this.f3466b.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(str);
                sb.append("', '");
                sb.append(main2.set("^onpagestarted" + this.f3466b.TaskId + "st_bP" + id, bitmap));
                sb.append("'");
                aid_jsCode.TheCallbackString(str2, sb.toString());
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3465a[3] != null) {
                int id = webView.getId();
                Aid_jsCode aid_jsCode = this.f3466b;
                String str3 = this.f3465a[3];
                aid_jsCode.TheCallbackString(str3, id + ", '^view" + this.f3466b.TaskId + "st_vW" + id + "', '" + str2 + "', '" + str + "', " + i);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$d */
    public class C1447d extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3467a;

        /* renamed from: b */
        final /* synthetic */ C1298d f3468b;

        /* renamed from: c */
        final /* synthetic */ Activity f3469c;

        C1447d(C1443b bVar, boolean z, C1298d dVar, Activity activity) {
            this.f3467a = z;
            this.f3468b = dVar;
            this.f3469c = activity;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            if (this.f3467a) {
                int id = webView.getId();
                C1298d dVar = this.f3468b;
                dVar.mo11693d("onprogresschanged" + id, Integer.valueOf(id), webView, Integer.valueOf(i));
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3469c.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$e */
    public class C1448e extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3470a;

        /* renamed from: b */
        final /* synthetic */ C1298d f3471b;

        /* renamed from: c */
        final /* synthetic */ Activity f3472c;

        /* renamed from: d */
        final /* synthetic */ boolean f3473d;

        /* renamed from: e */
        final /* synthetic */ boolean f3474e;

        /* renamed from: f */
        final /* synthetic */ boolean f3475f;

        C1448e(C1443b bVar, boolean z, C1298d dVar, Activity activity, boolean z2, boolean z3, boolean z4) {
            this.f3470a = z;
            this.f3471b = dVar;
            this.f3472c = activity;
            this.f3473d = z2;
            this.f3474e = z3;
            this.f3475f = z4;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3474e) {
                int id = webView.getId();
                C1298d dVar = this.f3471b;
                dVar.mo11693d("onpagefinished" + id, Integer.valueOf(id), webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3473d) {
                int id = webView.getId();
                C1298d dVar = this.f3471b;
                dVar.mo11693d("onpagestarted" + id, Integer.valueOf(id), webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3475f) {
                int id = webView.getId();
                C1298d dVar = this.f3471b;
                dVar.mo11693d("onreceivederror" + id, Integer.valueOf(id), webView, str2, str, Integer.valueOf(i));
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.f3470a) {
                int id = webView.getId();
                C1298d dVar = this.f3471b;
                return dVar.mo11694e("shouldoverrideurlloading" + id, Integer.valueOf(id), webView, str);
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3472c.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3472c, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$f */
    public class C1449f extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f3476a;

        C1449f(C1443b bVar, LuaObject[] luaObjectArr) {
            this.f3476a = luaObjectArr;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3476a[2] != null) {
                int id = webView.getId();
                this.f3476a[2].callNoErr(Integer.valueOf(id), webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3476a[1] != null) {
                int id = webView.getId();
                this.f3476a[1].callNoErr(Integer.valueOf(id), webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3476a[3] != null) {
                int id = webView.getId();
                this.f3476a[3].callNoErr(Integer.valueOf(id), webView, str2, str, Integer.valueOf(i));
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.f3476a[0] != null) {
                int id = webView.getId();
                return this.f3476a[0].callBoolNoErr(Integer.valueOf(id), webView, str);
            }
            webView.loadUrl(str);
            return true;
        }
    }

    /* renamed from: com.iapp.app.x5.b$g */
    class C1450g extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3477a;

        /* renamed from: b */
        final /* synthetic */ main f3478b;

        C1450g(C1443b bVar, boolean z, main main) {
            this.f3477a = z;
            this.f3478b = main;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            if (this.f3477a) {
                int id = webView.getId();
                C1298d dVar = this.f3478b.luaj;
                dVar.mo11693d("onprogresschanged" + id, Integer.valueOf(id), webView, Integer.valueOf(i));
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3478b.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* renamed from: com.iapp.app.x5.b$h */
    class C1451h extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3479a;

        /* renamed from: b */
        final /* synthetic */ main f3480b;

        /* renamed from: c */
        final /* synthetic */ boolean f3481c;

        /* renamed from: d */
        final /* synthetic */ boolean f3482d;

        /* renamed from: e */
        final /* synthetic */ boolean f3483e;

        C1451h(C1443b bVar, boolean z, main main, boolean z2, boolean z3, boolean z4) {
            this.f3479a = z;
            this.f3480b = main;
            this.f3481c = z2;
            this.f3482d = z3;
            this.f3483e = z4;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3482d) {
                int id = webView.getId();
                C1298d dVar = this.f3480b.luaj;
                dVar.mo11693d("onpagefinished" + id, Integer.valueOf(id), webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3481c) {
                int id = webView.getId();
                C1298d dVar = this.f3480b.luaj;
                dVar.mo11693d("onpagestarted" + id, Integer.valueOf(id), webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3483e) {
                int id = webView.getId();
                C1298d dVar = this.f3480b.luaj;
                dVar.mo11693d("onreceivederror" + id, Integer.valueOf(id), webView, str2, str, Integer.valueOf(i));
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.f3479a) {
                int id = webView.getId();
                C1298d dVar = this.f3480b.luaj;
                return dVar.mo11694e("shouldoverrideurlloading" + id, Integer.valueOf(id), webView, str);
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3480b.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3480b, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$i */
    public class C1452i extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3484a;

        /* renamed from: b */
        final /* synthetic */ main2 f3485b;

        C1452i(C1443b bVar, boolean z, main2 main2) {
            this.f3484a = z;
            this.f3485b = main2;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            if (this.f3484a) {
                int id = webView.getId();
                this.f3485b.callMethod("onprogresschanged" + id, id + ", '^view" + this.f3485b.TaskId + "st_vW" + id + "', " + i);
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3485b.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$j */
    public class C1453j extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3486a;

        /* renamed from: b */
        final /* synthetic */ main2 f3487b;

        /* renamed from: c */
        final /* synthetic */ boolean f3488c;

        /* renamed from: d */
        final /* synthetic */ boolean f3489d;

        /* renamed from: e */
        final /* synthetic */ boolean f3490e;

        C1453j(C1443b bVar, boolean z, main2 main2, boolean z2, boolean z3, boolean z4) {
            this.f3486a = z;
            this.f3487b = main2;
            this.f3488c = z2;
            this.f3489d = z3;
            this.f3490e = z4;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3489d) {
                int id = webView.getId();
                this.f3487b.callMethod("onpagefinished" + id, id + ", '^view" + this.f3487b.TaskId + "st_vW" + id + "', '" + str + "'");
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3488c) {
                int id = webView.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(this.f3487b.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(str);
                sb.append("', '");
                sb.append(main2.set("^onpagestarted" + this.f3487b.TaskId + "st_bP" + id, bitmap));
                sb.append("'");
                this.f3487b.callMethod("onpagestarted" + id, sb.toString());
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3490e) {
                int id = webView.getId();
                this.f3487b.callMethod("onreceivederror" + id, id + ", '^view" + this.f3487b.TaskId + "st_vW" + id + "', '" + str2 + "', '" + str + "', " + i);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.f3486a) {
                int id = webView.getId();
                this.f3487b.callMethod("shouldoverrideurlloading" + id, id + ", '^view" + this.f3487b.TaskId + "st_vW" + id + "', '" + str + "'");
                return true;
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3487b.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3487b, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$k */
    public class C1454k extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ Context f3491a;

        /* renamed from: b */
        final /* synthetic */ Activity f3492b;

        C1454k(C1443b bVar, Context context, Activity activity) {
            this.f3491a = context;
            this.f3492b = activity;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onprogresschanged\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3491a, this.f3492b);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_nS", Integer.valueOf(i));
                vVar.mo8985f(c);
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3492b.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* renamed from: com.iapp.app.x5.b$l */
    class C1455l extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3493a;

        /* renamed from: b */
        final /* synthetic */ main3 f3494b;

        C1455l(C1443b bVar, boolean z, main3 main3) {
            this.f3493a = z;
            this.f3494b = main3;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            if (this.f3493a) {
                int id = webView.getId();
                C1309h hVar = this.f3494b.javaj;
                hVar.mo11942b("onprogresschanged" + id, Integer.valueOf(id), webView, Integer.valueOf(i));
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3494b.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* renamed from: com.iapp.app.x5.b$m */
    class C1456m extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3495a;

        /* renamed from: b */
        final /* synthetic */ main3 f3496b;

        /* renamed from: c */
        final /* synthetic */ boolean f3497c;

        /* renamed from: d */
        final /* synthetic */ boolean f3498d;

        /* renamed from: e */
        final /* synthetic */ boolean f3499e;

        C1456m(C1443b bVar, boolean z, main3 main3, boolean z2, boolean z3, boolean z4) {
            this.f3495a = z;
            this.f3496b = main3;
            this.f3497c = z2;
            this.f3498d = z3;
            this.f3499e = z4;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3498d) {
                int id = webView.getId();
                C1309h hVar = this.f3496b.javaj;
                hVar.mo11942b("onpagefinished" + id, Integer.valueOf(id), webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3497c) {
                int id = webView.getId();
                C1309h hVar = this.f3496b.javaj;
                hVar.mo11942b("onpagestarted" + id, Integer.valueOf(id), webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3499e) {
                int id = webView.getId();
                C1309h hVar = this.f3496b.javaj;
                hVar.mo11942b("onreceivederror" + id, Integer.valueOf(id), webView, str2, str, Integer.valueOf(i));
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.f3495a) {
                int id = webView.getId();
                C1309h hVar = this.f3496b.javaj;
                return hVar.mo11943c("shouldoverrideurlloading" + id, Integer.valueOf(id), webView, str);
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3496b.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3496b, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$n */
    public class C1457n extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ mian f3500a;

        C1457n(C1443b bVar, mian mian) {
            this.f3500a = mian;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onprogresschanged\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3500a);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_nS", Integer.valueOf(i));
                vVar.mo8985f(c);
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3500a.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$o */
    public class C1458o extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ mian f3501a;

        C1458o(C1443b bVar, mian mian) {
            this.f3501a = mian;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagefinished\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3501a);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str);
                vVar.mo8985f(c);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagestarted\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3501a);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str);
                vVar.mo8981T("st_bP", bitmap);
                vVar.mo8985f(c);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onreceivederror\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3501a);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str2);
                vVar.mo8981T("st_dN", str);
                vVar.mo8981T("st_eE", Integer.valueOf(i));
                vVar.mo8985f(c);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"shouldoverrideurlloading\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3501a);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str);
                vVar.mo8985f(c);
                return true;
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3501a.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3501a, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$p */
    public class C1459p extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ mian f3502a;

        C1459p(C1443b bVar, mian mian) {
            this.f3502a = mian;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onprogresschanged\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3502a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_nS", Integer.valueOf(i));
                mian mian = this.f3502a;
                mian.goUIEventset("onprogresschanged" + c, aid_YuCodeX);
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$q */
    public class C1460q extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ mian f3503a;

        C1460q(C1443b bVar, mian mian) {
            this.f3503a = mian;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagefinished\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3503a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                mian mian = this.f3503a;
                mian.goUIEventset("onpagefinished" + c, aid_YuCodeX);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagestarted\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3503a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                aid_YuCodeX.dim("st_bP", bitmap);
                mian mian = this.f3503a;
                mian.goUIEventset("onpagestarted" + c, aid_YuCodeX);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onreceivederror\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3503a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str2);
                aid_YuCodeX.dim("st_dN", str);
                aid_YuCodeX.dim("st_eE", Integer.valueOf(i));
                mian mian = this.f3503a;
                mian.goUIEventset("onreceivederror" + c, aid_YuCodeX);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"shouldoverrideurlloading\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3503a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                mian mian = this.f3503a;
                mian.goUIEventset("shouldoverrideurlloading" + c, aid_YuCodeX);
                return true;
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3503a.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3503a, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$r */
    public class C1461r extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ Context f3504a;

        /* renamed from: b */
        final /* synthetic */ Activity f3505b;

        C1461r(C1443b bVar, Context context, Activity activity) {
            this.f3504a = context;
            this.f3505b = activity;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagefinished\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3504a, this.f3505b);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str);
                vVar.mo8985f(c);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagestarted\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3504a, this.f3505b);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str);
                vVar.mo8981T("st_bP", bitmap);
                vVar.mo8985f(c);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onreceivederror\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3504a, this.f3505b);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str2);
                vVar.mo8981T("st_dN", str);
                vVar.mo8981T("st_eE", Integer.valueOf(i));
                vVar.mo8985f(c);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"shouldoverrideurlloading\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(this.f3504a, this.f3505b);
                vVar.mo8981T("st_vId", Integer.valueOf(webView.getId()));
                vVar.mo8981T("st_vW", webView);
                vVar.mo8981T("st_url", str);
                vVar.mo8985f(c);
                return true;
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3504a.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3504a, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$s */
    public class C1462s extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ Activity f3506a;

        C1462s(C1443b bVar, Context context, Activity activity) {
            this.f3506a = activity;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3506a.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$t */
    public class C1463t extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ Context f3507a;

        /* renamed from: b */
        final /* synthetic */ Activity f3508b;

        C1463t(C1443b bVar, Context context, Activity activity) {
            this.f3507a = context;
            this.f3508b = activity;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagefinished\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3507a, this.f3508b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                aid_YuCodeX.YuGoX(c);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagestarted\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3507a, this.f3508b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                aid_YuCodeX.dim("st_bP", bitmap);
                aid_YuCodeX.YuGoX(c);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onreceivederror\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3507a, this.f3508b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str2);
                aid_YuCodeX.dim("st_dN", str);
                aid_YuCodeX.dim("st_eE", Integer.valueOf(i));
                aid_YuCodeX.YuGoX(c);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"shouldoverrideurlloading\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3507a, this.f3508b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                aid_YuCodeX.YuGoX(c);
                return true;
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3507a.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3507a, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$u */
    public class C1464u extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ Context f3509a;

        /* renamed from: b */
        final /* synthetic */ Activity f3510b;

        /* renamed from: c */
        final /* synthetic */ Aid_YuCodeX f3511c;

        /* renamed from: d */
        final /* synthetic */ String f3512d;

        C1464u(C1443b bVar, Context context, Activity activity, Aid_YuCodeX aid_YuCodeX, String str) {
            this.f3509a = context;
            this.f3510b = activity;
            this.f3511c = aid_YuCodeX;
            this.f3512d = str;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onprogresschanged\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3509a, this.f3510b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_nS", Integer.valueOf(i));
                Aid_YuCodeX aid_YuCodeX2 = this.f3511c;
                String str = this.f3512d;
                aid_YuCodeX2.goUIEventset(str, "onprogresschanged" + c, aid_YuCodeX);
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$v */
    public class C1465v extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ Context f3513a;

        /* renamed from: b */
        final /* synthetic */ Activity f3514b;

        /* renamed from: c */
        final /* synthetic */ Aid_YuCodeX f3515c;

        /* renamed from: d */
        final /* synthetic */ String f3516d;

        C1465v(C1443b bVar, Context context, Activity activity, Aid_YuCodeX aid_YuCodeX, String str) {
            this.f3513a = context;
            this.f3514b = activity;
            this.f3515c = aid_YuCodeX;
            this.f3516d = str;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagefinished\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3513a, this.f3514b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                Aid_YuCodeX aid_YuCodeX2 = this.f3515c;
                String str2 = this.f3516d;
                aid_YuCodeX2.goUIEventset(str2, "onpagefinished" + c, aid_YuCodeX);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onpagestarted\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3513a, this.f3514b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                aid_YuCodeX.dim("st_bP", bitmap);
                Aid_YuCodeX aid_YuCodeX2 = this.f3515c;
                String str2 = this.f3516d;
                aid_YuCodeX2.goUIEventset(str2, "onpagestarted" + c, aid_YuCodeX);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"onreceivederror\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3513a, this.f3514b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str2);
                aid_YuCodeX.dim("st_dN", str);
                aid_YuCodeX.dim("st_eE", Integer.valueOf(i));
                Aid_YuCodeX aid_YuCodeX2 = this.f3515c;
                String str3 = this.f3516d;
                aid_YuCodeX2.goUIEventset(str3, "onreceivederror" + c, aid_YuCodeX);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"shouldoverrideurlloading\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this.f3513a, this.f3514b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(webView.getId()));
                aid_YuCodeX.dim("st_vW", webView);
                aid_YuCodeX.dim("st_url", str);
                Aid_YuCodeX aid_YuCodeX2 = this.f3515c;
                String str2 = this.f3516d;
                aid_YuCodeX2.goUIEventset(str2, "shouldoverrideurlloading" + c, aid_YuCodeX);
                return true;
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3513a.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3513a, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$w */
    public static class C1466w extends WebViewClient {
        C1466w() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$x */
    public class C1467x extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3517a;

        /* renamed from: b */
        final /* synthetic */ C1309h f3518b;

        /* renamed from: c */
        final /* synthetic */ Activity f3519c;

        C1467x(C1443b bVar, boolean z, C1309h hVar, Activity activity) {
            this.f3517a = z;
            this.f3518b = hVar;
            this.f3519c = activity;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            if (this.f3517a) {
                int id = webView.getId();
                C1309h hVar = this.f3518b;
                hVar.mo11942b("onprogresschanged" + id, Integer.valueOf(id), webView, Integer.valueOf(i));
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1443b.f3455b != null) {
                return true;
            }
            C1443b.f3455b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            this.f3519c.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1101);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.b$y */
    public class C1468y extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ boolean f3520a;

        /* renamed from: b */
        final /* synthetic */ C1309h f3521b;

        /* renamed from: c */
        final /* synthetic */ Activity f3522c;

        /* renamed from: d */
        final /* synthetic */ boolean f3523d;

        /* renamed from: e */
        final /* synthetic */ boolean f3524e;

        /* renamed from: f */
        final /* synthetic */ boolean f3525f;

        C1468y(C1443b bVar, boolean z, C1309h hVar, Activity activity, boolean z2, boolean z3, boolean z4) {
            this.f3520a = z;
            this.f3521b = hVar;
            this.f3522c = activity;
            this.f3523d = z2;
            this.f3524e = z3;
            this.f3525f = z4;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f3524e) {
                int id = webView.getId();
                C1309h hVar = this.f3521b;
                hVar.mo11942b("onpagefinished" + id, Integer.valueOf(id), webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f3523d) {
                int id = webView.getId();
                C1309h hVar = this.f3521b;
                hVar.mo11942b("onpagestarted" + id, Integer.valueOf(id), webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (this.f3525f) {
                int id = webView.getId();
                C1309h hVar = this.f3521b;
                hVar.mo11942b("onreceivederror" + id, Integer.valueOf(id), webView, str2, str, Integer.valueOf(i));
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.f3520a) {
                int id = webView.getId();
                C1309h hVar = this.f3521b;
                return hVar.mo11943c("shouldoverrideurlloading" + id, Integer.valueOf(id), webView, str);
            }
            if (C0860r.m2063v(str.toLowerCase())) {
                webView.loadUrl(str);
            } else {
                try {
                    this.f3522c.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(this.f3522c, str)));
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m4049a(WebView webView) {
        webView.setWebViewClient(new C1466w());
    }

    /* renamed from: c */
    public static void m4050c(WebView webView, Object obj) {
        webView.setWebViewClient((WebViewClient) obj);
    }

    /* renamed from: b */
    public void mo12142b(WebView webView, String str, StringBuffer stringBuffer, C1309h hVar, Activity activity, Aid_javaCode aid_javaCode) {
        webView.setWebChromeClient(new C1467x(this, aid_javaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onprogresschanged", "int st_vId,android.webkit.WebView st_vW,int st_nS"), hVar, activity));
        webView.setWebViewClient(new C1468y(this, aid_javaCode.addViewEventItme(stringBuffer, str, webView.getId(), "shouldoverrideurlloading", "int st_vId,android.webkit.WebView st_vW,String st_url"), hVar, activity, aid_javaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onpagestarted", "int st_vId,android.webkit.WebView st_vW,String st_url,android.graphics.Bitmap st_bP"), aid_javaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onpagefinished", "int st_vId,android.webkit.WebView st_vW,String st_url"), aid_javaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onreceivederror", "int st_vId,android.webkit.WebView st_vW,String st_url,String st_dN,int st_eE")));
    }

    /* renamed from: d */
    public void mo12143d(WebView webView, String str, StringBuffer stringBuffer, Activity activity, Aid_jsCode aid_jsCode) {
        webView.setWebChromeClient(new C1444a(this, aid_jsCode.addViewEventItme(stringBuffer, str, webView.getId(), "onprogresschanged", "st_vId,st_vW,st_nS"), aid_jsCode, activity));
        webView.setWebViewClient(new C1445b(this, aid_jsCode.addViewEventItme(stringBuffer, str, webView.getId(), "shouldoverrideurlloading", "st_vId,st_vW,st_url"), aid_jsCode, activity, aid_jsCode.addViewEventItme(stringBuffer, str, webView.getId(), "onpagestarted", "st_vId,st_vW,st_url,st_bP"), aid_jsCode.addViewEventItme(stringBuffer, str, webView.getId(), "onpagefinished", "st_vId,st_vW,st_url"), aid_jsCode.addViewEventItme(stringBuffer, str, webView.getId(), "onreceivederror", "st_vId,st_vW,st_url,st_dN,st_eE")));
    }

    /* renamed from: e */
    public void mo12144e(View view, String[] strArr, Aid_jsCode aid_jsCode) {
        ((WebView) view).setWebViewClient(new C1446c(this, strArr, aid_jsCode));
    }

    /* renamed from: f */
    public void mo12145f(WebView webView, String str, StringBuffer stringBuffer, Activity activity, C1298d dVar, Aid_luaCode aid_luaCode) {
        webView.setWebChromeClient(new C1447d(this, aid_luaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onprogresschanged", "st_vId,st_vW,st_nS"), dVar, activity));
        webView.setWebViewClient(new C1448e(this, aid_luaCode.addViewEventItme(stringBuffer, str, webView.getId(), "shouldoverrideurlloading", "st_vId,st_vW,st_url"), dVar, activity, aid_luaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onpagestarted", "st_vId,st_vW,st_url,st_bP"), aid_luaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onpagefinished", "st_vId,st_vW,st_url"), aid_luaCode.addViewEventItme(stringBuffer, str, webView.getId(), "onreceivederror", "st_vId,st_vW,st_url,st_dN,st_eE")));
    }

    /* renamed from: g */
    public void mo12146g(View view, LuaObject[] luaObjectArr) {
        ((WebView) view).setWebViewClient(new C1449f(this, luaObjectArr));
    }

    /* renamed from: h */
    public void mo12147h(WebView webView, String str, main main) {
        webView.setWebChromeClient(new C1450g(this, main.addViewEventItme(str, webView.getId(), "onprogresschanged", "st_vId,st_vW,st_nS"), main));
        webView.setWebViewClient(new C1451h(this, main.addViewEventItme(str, webView.getId(), "shouldoverrideurlloading", "st_vId,st_vW,st_url"), main, main.addViewEventItme(str, webView.getId(), "onpagestarted", "st_vId,st_vW,st_url,st_bP"), main.addViewEventItme(str, webView.getId(), "onpagefinished", "st_vId,st_vW,st_url"), main.addViewEventItme(str, webView.getId(), "onreceivederror", "st_vId,st_vW,st_url,st_dN,st_eE")));
    }

    /* renamed from: i */
    public void mo12148i(WebView webView, String str, main2 main2) {
        webView.setWebChromeClient(new C1452i(this, main2.addViewEventItme(str, webView.getId(), "onprogresschanged", "st_vId,st_vW,st_nS"), main2));
        webView.setWebViewClient(new C1453j(this, main2.addViewEventItme(str, webView.getId(), "shouldoverrideurlloading", "st_vId,st_vW,st_url"), main2, main2.addViewEventItme(str, webView.getId(), "onpagestarted", "st_vId,st_vW,st_url,st_bP"), main2.addViewEventItme(str, webView.getId(), "onpagefinished", "st_vId,st_vW,st_url"), main2.addViewEventItme(str, webView.getId(), "onreceivederror", "st_vId,st_vW,st_url,st_dN,st_eE")));
    }

    /* renamed from: j */
    public void mo12149j(WebView webView, String str, main3 main3) {
        webView.setWebChromeClient(new C1455l(this, main3.addViewEventItme(str, webView.getId(), "onprogresschanged", "int st_vId,android.webkit.WebView st_vW,int st_nS"), main3));
        webView.setWebViewClient(new C1456m(this, main3.addViewEventItme(str, webView.getId(), "shouldoverrideurlloading", "int st_vId,android.webkit.WebView st_vW,String st_url"), main3, main3.addViewEventItme(str, webView.getId(), "onpagestarted", "int st_vId,android.webkit.WebView st_vW,String st_url,android.graphics.Bitmap st_bP"), main3.addViewEventItme(str, webView.getId(), "onpagefinished", "int st_vId,android.webkit.WebView st_vW,String st_url"), main3.addViewEventItme(str, webView.getId(), "onreceivederror", "int st_vId,android.webkit.WebView st_vW,String st_url,String st_dN,int st_eE")));
    }

    /* renamed from: k */
    public void mo12150k(WebView webView, String str, mian mian) {
        webView.setWebChromeClient(new C1457n(this, mian));
        webView.setWebViewClient(new C1458o(this, mian));
    }

    /* renamed from: l */
    public void mo12151l(WebView webView, String str, String str2, mian mian) {
        webView.setWebChromeClient(new C1459p(this, mian));
        webView.setWebViewClient(new C1460q(this, mian));
    }

    /* renamed from: m */
    public void mo12152m(WebView webView, Context context, Activity activity) {
        webView.setWebChromeClient(new C1454k(this, context, activity));
        webView.setWebViewClient(new C1461r(this, context, activity));
    }

    /* renamed from: n */
    public void mo12153n(WebView webView, Context context, Activity activity) {
        webView.setWebChromeClient(new C1462s(this, context, activity));
        webView.setWebViewClient(new C1463t(this, context, activity));
    }

    /* renamed from: o */
    public void mo12154o(WebView webView, Context context, Activity activity, Aid_YuCodeX aid_YuCodeX, String str) {
        webView.setWebChromeClient(new C1464u(this, context, activity, aid_YuCodeX, str));
        webView.setWebViewClient(new C1465v(this, context, activity, aid_YuCodeX, str));
    }
}
