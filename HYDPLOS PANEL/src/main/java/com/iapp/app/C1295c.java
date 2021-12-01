package com.iapp.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p013b.p044b.p045a.p046a.C0839h;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.c */
public class C1295c {

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.c$a */
    public static class C1296a extends WebChromeClient {
        C1296a() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.c$b */
    public static class C1297b extends WebChromeClient {
        C1297b() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static WebView m3506a(Activity activity, int i) {
        WebView webView = new WebView(activity);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(activity.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(activity.getApplicationContext().getDir("database", 0).getPath());
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setLightTouchEnabled(true);
        webView.getSettings().setCacheMode(-1);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.setWebChromeClient(new C1296a());
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
        webView.addJavascriptInterface(new Aid_jsCode(activity, webView, i), "I");
        return webView;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static WebView m3507b(Context context, Activity activity, int i) {
        WebView webView = new WebView(context);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(context.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(context.getApplicationContext().getDir("database", 0).getPath());
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setLightTouchEnabled(true);
        webView.getSettings().setCacheMode(-1);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.setWebChromeClient(new C1297b());
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
        webView.addJavascriptInterface(new Aid_jsCode(context, activity, webView, i), "I");
        return webView;
    }

    /* renamed from: c */
    public static void m3508c(Context context, WebView webView, String str) {
        webView.getSettings().setDefaultTextEncodingName("utf-8");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><head><script type='text/javascript'>");
        stringBuffer.append(C0839h.m1896e(context, "import.mjs"));
        stringBuffer.append('\n');
        stringBuffer.append(str.replace("&lt;", "<").replace("&gt;", ">"));
        stringBuffer.append("</script></head></html>");
        webView.loadDataWithBaseURL(null, stringBuffer.toString(), "text/html", "utf-8", null);
    }

    /* renamed from: d */
    public static void m3509d(WebView webView, String str) {
        webView.getSettings().setDefaultTextEncodingName("utf-8");
        webView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
    }
}
