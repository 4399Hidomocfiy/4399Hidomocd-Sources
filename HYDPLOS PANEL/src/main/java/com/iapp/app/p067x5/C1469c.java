package com.iapp.app.p067x5;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.iapp.app.x5.c */
public class C1469c {
    /* renamed from: a */
    public static void m4064a(WebView webView) {
        webView.getSettings().setCacheMode(-1);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        if (Build.VERSION.SDK_INT >= 21) {
            webView.getSettings().setMixedContentMode(0);
        }
    }
}
