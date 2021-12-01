package com.iapp.app;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.support.p012v7.app.ActionBar;
import android.support.p012v7.app.AppCompatActivity;
import android.support.p012v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0841i;
import p013b.p044b.p045a.p046a.C0851m;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0862t;

public class Webview extends AppCompatActivity {

    /* renamed from: a */
    private String f3031a = null;

    /* renamed from: b */
    private WebView f3032b;

    /* renamed from: c */
    private String f3033c = null;
    public int chongzhi_i = 0;
    public String chongzhi_id = null;
    public int chongzhi_q = 0;
    public String chongzhi_type = null;
    public String contentDispositionXX = null;
    public long contentLengthXX = 0;

    /* renamed from: d */
    private RotateAnimation f3034d = null;

    /* renamed from: e */
    private ImageView f3035e;

    /* renamed from: f */
    private Toolbar f3036f;

    /* renamed from: g */
    private String f3037g;

    /* renamed from: h */
    private ValueCallback<Uri> f3038h = null;

    /* renamed from: i */
    private ValueCallback<Uri[]> f3039i = null;

    /* renamed from: j */
    private Handler f3040j = new HandlerC1292f();
    public String mimetypeXX = null;
    public String uid = null;
    public String urlXX = null;
    public String userAgentXX = null;

    /* renamed from: com.iapp.app.Webview$a */
    public class C1287a implements DownloadListener {
        public C1287a() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            String lowerCase = str4.toLowerCase();
            String c = str3 != null ? C0860r.m2044c(str3, "filename=\"", "\"") : null;
            if (c == null) {
                if (str.contains("?")) {
                    str = str.substring(0, str.indexOf(63));
                }
                c = C0860r.m2043b(str);
                String lowerCase2 = c.toLowerCase();
                if (lowerCase.equals("application/vnd.android.package-archive") && !lowerCase2.endsWith(".apk")) {
                    c = c + ".apk";
                }
            }
            if (c != null) {
                Toast.makeText(Webview.this, "开始下载 " + c, 1).show();
                C1293a.f3049b.mo9038d(str, c, null);
            }
            if (Webview.this.f3033c == null) {
                Webview.this.finish();
            }
        }
    }

    /* renamed from: com.iapp.app.Webview$b */
    class View$OnClickListenerC1288b implements View.OnClickListener {
        View$OnClickListenerC1288b() {
        }

        public void onClick(View view) {
            if (Webview.this.f3032b.canGoBack()) {
                Webview.this.f3032b.goBack();
            } else {
                Webview.this.finish();
            }
        }
    }

    /* renamed from: com.iapp.app.Webview$c */
    class C1289c extends WebChromeClient {
        C1289c() {
        }

        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j2 * 2);
        }

        public void onProgressChanged(WebView webView, int i) {
            String title = webView.getTitle();
            if (i == 100) {
                Webview.this.f3033c = title;
                Webview.this.f3036f.setTitle(title);
                Webview.this.f3035e.clearAnimation();
                Webview.this.f3035e.setVisibility(8);
            } else if (title != null) {
                if (title.length() > 16) {
                    title = title.substring(0, 15);
                }
                Toolbar toolbar = Webview.this.f3036f;
                toolbar.setTitle("[" + i + "%] " + title + "..");
            }
        }

        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j * 2);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (Webview.this.f3039i != null) {
                return true;
            }
            Webview.this.f3039i = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            Webview.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 1);
            return true;
        }
    }

    /* renamed from: com.iapp.app.Webview$d */
    class C1290d extends WebViewClient {
        C1290d() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            com.iapp.app.p067x5.WebView.m4047a(webView.getContext(), sslErrorHandler, sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String lowerCase = str.toLowerCase();
            if (str.endsWith("DYBJLLQ")) {
                Webview.this.m3480m(str);
                return true;
            }
            if (C0860r.m2063v(lowerCase)) {
                Webview.this.loadurl(webView, str);
            } else if (lowerCase.startsWith("iappcopy://")) {
                C0860r.m2052k(str.substring(11), Webview.this);
                Toast.makeText(Webview.this, "已复制", 1).show();
            } else if (lowerCase.startsWith("iappoay://iapp.yx93.com:")) {
                Webview webview = Webview.this;
                webview.m3481n("http://" + str.substring(10));
            } else if (lowerCase.startsWith("iappopenapp://")) {
                C0835f.m1859p(Webview.this, str.substring(14));
            } else {
                try {
                    Webview.this.startActivity(new Intent("android.intent.action.VIEW", C0851m.m1977c(Webview.this, str)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Webview$e */
    public class C1291e extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f3045a;

        C1291e(String str) {
            this.f3045a = str;
        }

        public void run() {
            String str = C0835f.f1721a + "/img/" + C0860r.m2043b(this.f3045a);
            try {
                if (C0841i.m1918a(this.f3045a, str, true) != -1) {
                    Webview.this.f3037g = str;
                    Webview.this.m3468a("已保存至:" + str);
                    Webview.saveImageToGallery(Webview.this, new File(str));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.iapp.app.Webview$f */
    class HandlerC1292f extends Handler {
        HandlerC1292f() {
        }

        public void handleMessage(Message message) {
            ImageView imageView;
            int i;
            int i2 = message.what;
            if (i2 == 1) {
                Toast.makeText(Webview.this, message.obj.toString(), 1).show();
                return;
            }
            if (i2 == 2) {
                imageView = Webview.this.f3035e;
                i = 8;
            } else if (i2 == 3) {
                imageView = Webview.this.f3035e;
                i = 0;
            } else {
                return;
            }
            imageView.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m3468a(String str) {
        Message message = new Message();
        message.what = 1;
        message.obj = str;
        this.f3040j.sendMessage(message);
    }

    public static String getFilePathByContentResolver(Context context, Uri uri) {
        String str = null;
        if (uri == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        if (query != null) {
            try {
                if (query.getCount() == 1) {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                }
                return str;
            } finally {
                query.close();
            }
        } else {
            throw new IllegalArgumentException("Query on " + uri + " returns null result.");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private void m3480m(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (str.toLowerCase().startsWith("file://")) {
            C0851m.m1975a(this, intent, new File(str), "text/html");
        } else {
            intent.setData(C0851m.m1977c(this, str));
        }
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n */
    private void m3481n(String str) {
        new C1291e(str).start();
    }

    @TargetApi(11)
    /* renamed from: o */
    private void m3482o(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    public static void saveImageToGallery(Context context, File file) {
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(), file.getAbsolutePath(), file.getName(), (String) null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(C0851m.m1976b(context, file));
        context.sendBroadcast(intent);
    }

    public void loadurl(WebView webView, String str) {
        this.f3035e.startAnimation(this.f3034d);
        this.f3035e.setVisibility(0);
        webView.loadUrl(str);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p009v4.app.FragmentActivity
    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data = (intent == null || i2 != -1) ? null : intent.getData();
        try {
            ValueCallback<Uri> valueCallback = this.f3038h;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data);
            } else {
                ValueCallback<Uri[]> valueCallback2 = this.f3039i;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f3038h = null;
        this.f3039i = null;
    }

    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.SupportActivity, android.support.p009v4.app.FragmentActivity
    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.f3031a = extras.getString("WebURL");
        setContentView(2131361858);
        Toolbar toolbar = (Toolbar) findViewById(2131230944);
        this.f3036f = toolbar;
        setSupportActionBar(toolbar);
        String string = extras.getString("background");
        String string2 = extras.getString("backgroundShadow");
        if (!(string == null || string2 == null)) {
            this.f3036f.setBackgroundColor(Color.parseColor(string));
            C0862t.m2078c(this, Color.parseColor(string2), true, findViewById(2131230941));
        }
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setHomeButtonEnabled(true);
        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        this.f3036f.setNavigationOnClickListener(new View$OnClickListenerC1288b());
        this.f3035e = (ImageView) findViewById(2131230943);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 350.0f, 1, 0.5f, 1, 0.5f);
        this.f3034d = rotateAnimation;
        rotateAnimation.setDuration(1000);
        this.f3034d.setRepeatCount(100);
        this.f3035e.startAnimation(this.f3034d);
        WebView webView = (WebView) findViewById(2131230942);
        this.f3032b = webView;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            webView.getSettings().setMixedContentMode(0);
        }
        this.f3032b.getSettings().setAllowFileAccess(true);
        this.f3032b.getSettings().setJavaScriptEnabled(true);
        this.f3032b.getSettings().setAppCacheEnabled(true);
        this.f3032b.getSettings().setAppCachePath(getApplicationContext().getDir("cache", 0).getPath());
        this.f3032b.getSettings().setAppCacheMaxSize(8388608);
        this.f3032b.getSettings().setDatabaseEnabled(true);
        this.f3032b.getSettings().setDatabasePath(getApplicationContext().getDir("database", 0).getPath());
        this.f3032b.getSettings().setDomStorageEnabled(true);
        this.f3032b.getSettings().setGeolocationEnabled(true);
        this.f3032b.getSettings().setLightTouchEnabled(true);
        this.f3032b.getSettings().setCacheMode(-1);
        this.f3032b.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f3032b.getSettings().setSupportZoom(true);
        this.f3032b.getSettings().setBuiltInZoomControls(true);
        this.f3032b.getSettings().setUseWideViewPort(true);
        this.f3032b.getSettings().setLoadWithOverviewMode(true);
        if (i >= 16) {
            this.f3032b.getSettings().setAllowUniversalAccessFromFileURLs(true);
            this.f3032b.getSettings().setAllowFileAccessFromFileURLs(true);
        }
        this.f3032b.setScrollBarStyle(0);
        this.f3032b.loadUrl(this.f3031a);
        this.f3032b.setDownloadListener(new C1287a());
        this.f3032b.setWebChromeClient(new C1289c());
        this.f3032b.setWebViewClient(new C1290d());
        m3482o(this.f3032b);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "后退");
        menu.add(0, 1, 1, "前进");
        menu.add(0, 2, 2, "刷新");
        menu.add(0, 3, 3, "下载");
        menu.add(0, 4, 4, "默认浏览器打开");
        menu.add(0, 5, 5, "关闭");
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f3034d.cancel();
        this.f3034d = null;
        this.f3035e.clearAnimation();
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return i == 82;
        }
        if (keyEvent.getRepeatCount() == 0) {
            if (this.f3032b.canGoBack()) {
                this.f3032b.goBack();
            } else {
                finish();
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.f3032b.goBack();
        } else if (itemId == 1) {
            this.f3032b.goForward();
        } else if (itemId == 2) {
            WebView webView = this.f3032b;
            loadurl(webView, webView.getUrl());
        } else if (itemId == 3) {
            Bundle extras = getIntent().getExtras();
            String string = extras.getString("background");
            String string2 = extras.getString("backgroundShadow");
            if (string == null || string2 == null) {
                startActivity(new Intent().setClass(this, DownList.class));
            } else {
                Intent intent = new Intent(this, DownList.class);
                Bundle bundle = new Bundle();
                bundle.putString("background", string);
                bundle.putString("backgroundShadow", string2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        } else if (itemId == 4) {
            m3480m(this.f3032b.getUrl());
        } else if (itemId == 5) {
            finish();
        }
        return true;
    }

    public void synCookies(Context context, String str, String str2) {
        CookieSyncManager.createInstance(context);
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.removeSessionCookie();
        instance.setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }
}
