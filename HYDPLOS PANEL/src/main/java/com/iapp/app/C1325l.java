package com.iapp.app;

import android.app.Activity;
import com.iapp.app.p067x5.AbstractC1442a;
import com.iapp.app.p067x5.WebView;
import com.iapp.app.run.main2;
import com.iapp.app.run.mian;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.l */
public class C1325l {

    /* renamed from: a */
    private Activity f3108a = null;

    /* renamed from: b */
    private WebView f3109b = null;

    /* renamed from: c */
    private C1298d f3110c = null;

    /* renamed from: d */
    private String f3111d = null;

    /* renamed from: e */
    private String f3112e = null;

    /* renamed from: f */
    private C1309h f3113f = null;

    /* renamed from: g */
    private android.webkit.WebView f3114g;

    /* renamed from: h */
    private String f3115h;

    /* renamed from: com.iapp.app.l$a */
    class C1326a implements AbstractC1442a {
        C1326a() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            C0864v vVar = new C0864v(C1325l.this.f3108a);
            vVar.mo8981T("st_vId", Integer.valueOf(C1325l.this.f3109b.getId()));
            vVar.mo8981T("st_vW", C1325l.this.f3109b);
            vVar.mo8981T("st_url", str);
            vVar.mo8981T("st_uT", str2);
            vVar.mo8981T("st_cN", str3);
            vVar.mo8981T("st_mE", str4);
            vVar.mo8981T("st_cH", Long.valueOf(j));
            vVar.mo8985f(C1325l.this.f3111d);
        }
    }

    /* renamed from: com.iapp.app.l$b */
    class C1327b implements AbstractC1442a {
        C1327b() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1325l.this.f3108a);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(C1325l.this.f3109b.getId()));
            aid_YuCodeX.dim("st_vW", C1325l.this.f3109b);
            aid_YuCodeX.dim("st_url", str);
            aid_YuCodeX.dim("st_uT", str2);
            aid_YuCodeX.dim("st_cN", str3);
            aid_YuCodeX.dim("st_mE", str4);
            aid_YuCodeX.dim("st_cH", Long.valueOf(j));
            String str5 = C1325l.this.f3112e;
            mian.m4024c(str5, "ondownloadstart" + C1325l.this.f3111d, aid_YuCodeX);
        }
    }

    /* renamed from: com.iapp.app.l$c */
    class C1328c implements AbstractC1442a {
        C1328c() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            int id = C1325l.this.f3109b.getId();
            C1298d dVar = C1325l.this.f3110c;
            dVar.mo11693d("ondownloadstart" + id, Integer.valueOf(id), C1325l.this.f3109b, str, str2, str3, str4, Long.valueOf(j));
        }
    }

    /* renamed from: com.iapp.app.l$d */
    class C1329d implements AbstractC1442a {
        C1329d() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            int id = C1325l.this.f3109b.getId();
            C1309h hVar = C1325l.this.f3113f;
            hVar.mo11942b("ondownloadstart" + id, Integer.valueOf(id), C1325l.this.f3109b, str, str2, str3, str4, Long.valueOf(j));
        }
    }

    /* renamed from: com.iapp.app.l$e */
    class C1330e implements AbstractC1442a {
        C1330e() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            int id = C1325l.this.f3109b.getId();
            C1325l.this.m3889i("ondownloadstart" + id, id + ", '" + C1325l.this.f3115h + "', '" + str + "', '" + str2 + "', '" + str3 + "', '" + str4 + "', " + j);
        }
    }

    public C1325l(WebView webView, Activity activity) {
        this.f3109b = webView;
        this.f3108a = activity;
        String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"ondownloadstart\">", "</eventItme>");
        this.f3111d = c;
        if (c != null) {
            webView.setDownloadListener(new C1326a());
        }
    }

    public C1325l(WebView webView, Activity activity, String str) {
        this.f3109b = webView;
        this.f3108a = activity;
        this.f3112e = str;
        String c = C0860r.m2044c(((Object[]) webView.getTag())[2].toString(), "<eventItme type=\"ondownloadstart\">", "</eventItme>");
        this.f3111d = c;
        if (c != null) {
            webView.setDownloadListener(new C1327b());
        }
    }

    public C1325l(WebView webView, android.webkit.WebView webView2, int i) {
        this.f3109b = webView;
        this.f3114g = webView2;
        String str = "^ondownloadstart" + i + "st_vW" + webView.getId();
        this.f3115h = str;
        main2.set(str, webView);
        webView.setDownloadListener(new C1330e());
    }

    public C1325l(WebView webView, C1298d dVar) {
        this.f3109b = webView;
        this.f3110c = dVar;
        webView.setDownloadListener(new C1328c());
    }

    public C1325l(WebView webView, C1309h hVar) {
        this.f3109b = webView;
        this.f3113f = hVar;
        webView.setDownloadListener(new C1329d());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private void m3889i(String str, String str2) {
        android.webkit.WebView webView = this.f3114g;
        webView.loadUrl("javascript:" + str + "(" + str2 + ")");
    }
}
