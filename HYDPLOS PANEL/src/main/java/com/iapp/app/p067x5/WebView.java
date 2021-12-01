package com.iapp.app.p067x5;

import android.content.Context;
import android.content.DialogInterface;
import android.support.p012v7.app.AlertDialog;
import android.util.AttributeSet;
import android.webkit.SslErrorHandler;

/* renamed from: com.iapp.app.x5.WebView */
public class WebView extends android.webkit.WebView {

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.WebView$a */
    public static class DialogInterface$OnClickListenerC1440a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SslErrorHandler f3452a;

        DialogInterface$OnClickListenerC1440a(SslErrorHandler sslErrorHandler) {
            this.f3452a = sslErrorHandler;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f3452a.proceed();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.x5.WebView$b */
    public static class DialogInterface$OnClickListenerC1441b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SslErrorHandler f3453a;

        DialogInterface$OnClickListenerC1441b(SslErrorHandler sslErrorHandler) {
            this.f3453a = sslErrorHandler;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f3453a.cancel();
        }
    }

    public WebView(Context context) {
        super(context);
    }

    public WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static void m4047a(Context context, SslErrorHandler sslErrorHandler, String str) {
        String substring;
        int indexOf;
        String str2 = "此网站";
        if (str != null) {
            try {
                String replace = str.replace('\\', '/');
                int indexOf2 = replace.indexOf("//");
                if (!(indexOf2 == -1 || (indexOf = (substring = replace.substring(indexOf2 + 2)).indexOf("/")) == -1)) {
                    str2 = String.format(" %s ", substring.substring(0, indexOf));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("您与此网站之间建立的连接不安全，攻击者可能会试图从" + str2 + "窃取您的信息！");
        builder.setPositiveButton("继续访问", new DialogInterface$OnClickListenerC1440a(sslErrorHandler));
        builder.setNegativeButton("取消", new DialogInterface$OnClickListenerC1441b(sslErrorHandler));
        builder.create().show();
    }

    /* renamed from: b */
    public static void m4048b(Context context) {
    }
}
