package com.iapp.app.run;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p012v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.iapp.app.C1293a;
import com.iapp.app.C1294b;
import com.iapp.app.C1295c;
import com.iapp.app.C1325l;
import com.iapp.app.C1334m;
import com.iapp.app.C1340n;
import com.iapp.app.C1343o;
import com.iapp.app.C1355r;
import com.iapp.app.p067x5.AbstractC1442a;
import com.iapp.app.p067x5.C1443b;
import com.iapp.app.p067x5.C1469c;
import java.util.HashMap;
import java.util.Map;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;
import p013b.p048c.p049a.C0916b;

@SuppressLint({"UseSparseArrays"})
public class main2 extends AppCompatActivity {

    /* renamed from: D */
    private static HashMap<String, Object> f3279D = new HashMap<>();

    /* renamed from: A */
    private boolean f3280A = false;

    /* renamed from: B */
    private boolean f3281B = false;

    /* renamed from: C */
    private boolean f3282C = false;
    public int TaskId;

    /* renamed from: a */
    private LinearLayout f3283a;

    /* renamed from: b */
    private HashMap<String, Object> f3284b = new HashMap<>();

    /* renamed from: c */
    private String[] f3285c = null;

    /* renamed from: d */
    private C0916b f3286d = new C0916b(this);

    /* renamed from: e */
    private String f3287e = null;

    /* renamed from: f */
    private WebView f3288f;

    /* renamed from: g */
    private SensorEventListener f3289g = null;

    /* renamed from: h */
    private SensorManager f3290h = null;

    /* renamed from: i */
    private Sensor f3291i = null;

    /* renamed from: j */
    private String f3292j = "";

    /* renamed from: k */
    private boolean f3293k = false;

    /* renamed from: l */
    private boolean f3294l = false;

    /* renamed from: m */
    private boolean f3295m = false;

    /* renamed from: n */
    private boolean f3296n = false;

    /* renamed from: o */
    private boolean f3297o = false;

    /* renamed from: p */
    private boolean f3298p = false;

    /* renamed from: q */
    private boolean f3299q = false;

    /* renamed from: r */
    public String f3300r = null;

    /* renamed from: s */
    private boolean f3301s = false;

    /* renamed from: t */
    private boolean f3302t = false;

    /* renamed from: u */
    private boolean f3303u = false;

    /* renamed from: v */
    private boolean f3304v = false;

    /* renamed from: w */
    private boolean f3305w = false;

    /* renamed from: x */
    private boolean f3306x = false;

    /* renamed from: y */
    private boolean f3307y = false;

    /* renamed from: z */
    private boolean f3308z = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$a */
    public class C1380a implements AbsListView.OnScrollListener {
        C1380a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (main2.this.f3305w) {
                int id = absListView.getId();
                main2.this.callMethod("onscroll" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + i + ", " + i2 + ", " + i3);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (main2.this.f3304v) {
                int id = absListView.getId();
                main2.this.callMethod("onscrollstatechanged" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$b */
    public class C1381b implements AdapterView.OnItemClickListener {
        C1381b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            main2.this.callMethod("clickitem" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + i + ", " + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$c */
    public class C1382c implements AdapterView.OnItemSelectedListener {
        C1382c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (main2.this.f3306x) {
                int id = adapterView.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(main2.this.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(main2.set("^onitemselected" + main2.this.TaskId + "st_vW2" + id, view));
                sb.append("', ");
                sb.append(i);
                sb.append(", ");
                sb.append(j);
                main2.this.callMethod("onitemselected" + id, sb.toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (main2.this.f3307y) {
                int id = adapterView.getId();
                main2.this.callMethod("onnothingselected" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$d */
    public class C1383d implements SeekBar.OnSeekBarChangeListener {
        C1383d() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (main2.this.f3281B) {
                int id = seekBar.getId();
                main2.this.callMethod("onprogresschanged2" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + i + ", " + z);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (main2.this.f3308z) {
                int id = seekBar.getId();
                main2.this.callMethod("onstarttrackingtouch" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "'");
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (main2.this.f3280A) {
                int id = seekBar.getId();
                main2.this.callMethod("onstoptrackingtouch" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$e */
    public class C1384e implements AbstractC1442a {
        C1384e(main2 main2) {
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
                C1293a.f3049b.mo9038d(str, c, null);
            }
        }
    }

    /* renamed from: com.iapp.app.run.main2$f */
    class C1385f implements SensorEventListener {
        C1385f() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            main2 main2 = main2.this;
            main2.callMethod("sensor", sensorEvent.values[0] + ", " + sensorEvent.values[1] + ", " + sensorEvent.values[2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$g */
    public class View$OnClickListenerC1386g implements View.OnClickListener {
        View$OnClickListenerC1386g() {
        }

        public void onClick(View view) {
            int id = view.getId();
            main2.this.callMethod("clicki" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "'");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$h */
    public class View$OnTouchListenerC1387h implements View.OnTouchListener {
        View$OnTouchListenerC1387h() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            main2.this.callMethod("touchmonitor" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + motionEvent.getAction() + ", " + motionEvent.getX() + ", " + motionEvent.getY() + ", " + motionEvent.getRawX() + ", " + motionEvent.getRawY());
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$i */
    public class View$OnLongClickListenerC1388i implements View.OnLongClickListener {
        View$OnLongClickListenerC1388i() {
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            main2.this.callMethod("press" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "'");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$j */
    public class View$OnKeyListenerC1389j implements View.OnKeyListener {
        View$OnKeyListenerC1389j() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            main2.this.callMethod("keyboard" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount());
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$k */
    public class View$OnCreateContextMenuListenerC1390k implements View.OnCreateContextMenuListener {
        View$OnCreateContextMenuListenerC1390k() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            String c = C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"pressmenu\">", "</eventItme>");
            contextMenu.setHeaderTitle(C0860r.m2044c(c, "title:", "\n"));
            int id = view.getId();
            String[] split = c.split("\ncase ");
            for (int i = 1; i < split.length; i++) {
                contextMenu.add(id, i, 0, C0860r.m2044c(split[i], null, ":"));
            }
            if (C0860r.m2044c(c, "\ndefault:", "\nbreak") != null) {
                main2.this.callMethod("onCreateContextMenu" + id + "x0", id + ", '^view" + main2.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$l */
    public class C1391l implements TextView.OnEditorActionListener {
        C1391l() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            int id = textView.getId();
            if (keyEvent != null) {
                main2.this.callMethod("editormonitor" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount() + ", " + keyEvent.getKeyCode());
                return false;
            }
            main2.this.callMethod("editormonitor" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + i + ", null, null, null");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main2$m */
    public class View$OnFocusChangeListenerC1392m implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1392m() {
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            main2.this.callMethod("focuschange" + id, id + ", '^view" + main2.this.TaskId + "st_vW" + id + "', " + z);
        }
    }

    public static Object get(String str) {
        return f3279D.get(str);
    }

    /* renamed from: h */
    private void m3997h(View view, int i, String str) {
        set("^view" + this.TaskId + "st_vW" + i, view);
        if (addViewEventItme(str, i, "clicki", "st_vId,st_vW")) {
            view.setOnClickListener(new View$OnClickListenerC1386g());
        }
        if (addViewEventItme(str, i, "touchmonitor", "st_vId,st_vW,st_eA,st_eX,st_eY,st_rX,st_rY")) {
            view.setOnTouchListener(new View$OnTouchListenerC1387h());
        }
        if (addViewEventItme(str, i, "press", "st_vId,st_vW")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1388i());
        }
        if (addViewEventItme(str, i, "keyboard", "st_vId,st_vW,st_kC,st_eA,st_eR")) {
            view.setOnKeyListener(new View$OnKeyListenerC1389j());
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            String c = C0860r.m2044c(str, "<eventItme type=\"pressmenu\">", "</eventItme>");
            String[] split = c.split("\ncase ");
            for (int i2 = 1; i2 < split.length; i2++) {
                this.f3292j += "function onCreateContextMenu" + i + "x" + i2 + "(){\n" + C0860r.m2044c(split[i2], ":", "\nbreak") + "\n}\n";
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            if (c2 != null) {
                this.f3292j += "function onCreateContextMenu" + i + "x0(st_vId,st_vW){\n" + c2 + "\n}\n";
            }
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1390k());
        }
        if (view instanceof TextView) {
            if (addViewEventItme(str, i, "editormonitor", "st_vId,st_vW,st_aI,st_eA,st_eR,st_eK")) {
                ((TextView) view).setOnEditorActionListener(new C1391l());
            }
            boolean addViewEventItme = addViewEventItme(str, i, "ontextchanged", "st_vId,st_vW,st_sS,st_sT,st_bE,st_cT");
            boolean addViewEventItme2 = addViewEventItme(str, i, "beforetextchanged", "st_vId,st_vW,st_sS,st_sT,st_cT,st_aR");
            boolean addViewEventItme3 = addViewEventItme(str, i, "aftertextchanged", "st_vId,st_vW,st_sS");
            if (addViewEventItme || addViewEventItme2 || addViewEventItme3) {
                new C1355r((TextView) view, this.f3288f, "^view" + this.TaskId + "st_vW" + i, addViewEventItme, addViewEventItme2, addViewEventItme3);
            }
        }
        if (view instanceof com.iapp.app.p067x5.WebView) {
            m4003n((com.iapp.app.p067x5.WebView) view, str);
        }
        if (addViewEventItme(str, i, "focuschange", "st_vId,st_vW,st_hF")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1392m());
        }
        if (view instanceof AbsListView) {
            this.f3304v = addViewEventItme(str, i, "onscrollstatechanged", "st_vId,st_vW,st_sE");
            boolean addViewEventItme4 = addViewEventItme(str, i, "onscroll", "st_vId,st_vW,st_fM,st_vT,st_bT");
            this.f3305w = addViewEventItme4;
            if (this.f3304v || addViewEventItme4) {
                ((AbsListView) view).setOnScrollListener(new C1380a());
            }
        }
        if (view instanceof AdapterView) {
            if (addViewEventItme(str, i, "clickitem", "st_vId,st_vW,st_pN,st_iD")) {
                ((AdapterView) view).setOnItemClickListener(new C1381b());
            }
            this.f3306x = addViewEventItme(str, i, "onitemselected", "st_vId,st_vW,st_vW2,st_pN,st_iD");
            boolean addViewEventItme5 = addViewEventItme(str, i, "onnothingselected", "st_vId,st_vW");
            this.f3307y = addViewEventItme5;
            if (this.f3306x || addViewEventItme5) {
                ((AdapterView) view).setOnItemSelectedListener(new C1382c());
            }
        }
        if (view instanceof ViewPager) {
            boolean addViewEventItme6 = addViewEventItme(str, i, "onpageselected", "st_vId,st_vW,st_pN");
            boolean addViewEventItme7 = addViewEventItme(str, i, "onpagescrolled", "st_vId,st_vW,st_pN,st_pT,st_pS");
            boolean addViewEventItme8 = addViewEventItme(str, i, "onpagescrollstatechanged", "st_vId,st_vW,st_sE");
            if (addViewEventItme6 || addViewEventItme7 || addViewEventItme8) {
                new C1343o((ViewPager) view, this.f3288f, "^view" + this.TaskId + "st_vW" + i, addViewEventItme6, addViewEventItme7, addViewEventItme8);
            }
        }
        if (view instanceof DrawerLayout) {
            boolean addViewEventItme9 = addViewEventItme(str, i, "ondrawerclosed", "st_vId,st_vW,st_dW");
            boolean addViewEventItme10 = addViewEventItme(str, i, "ondraweropened", "st_vId,st_vW,st_dW");
            boolean addViewEventItme11 = addViewEventItme(str, i, "onoptionsitemselected", "st_vId,st_vW,st_iM");
            if (addViewEventItme9 || addViewEventItme10 || addViewEventItme11) {
                new C1334m((DrawerLayout) view, this.f3288f, "^view" + this.TaskId + "st_vW" + i, this.TaskId, addViewEventItme9, addViewEventItme10, addViewEventItme11);
            }
        }
        if (!(view instanceof SeekBar)) {
            return;
        }
        if (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">")) {
            this.f3308z = addViewEventItme(str, i, "onstarttrackingtouch", "st_vId,st_vW");
            this.f3280A = addViewEventItme(str, i, "onstoptrackingtouch", "st_vId,st_vW");
            boolean addViewEventItme12 = addViewEventItme(str, i, "onprogresschanged2", "st_vId,st_vW,st_nS,st_fR");
            this.f3281B = addViewEventItme12;
            if (this.f3308z || this.f3280A || addViewEventItme12) {
                ((SeekBar) view).setOnSeekBarChangeListener(new C1383d());
            }
        }
    }

    /* renamed from: i */
    private boolean m3998i(String str, String str2) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3292j += "function " + str2 + "(){\n" + c + "\n}\n";
        return true;
    }

    /* renamed from: j */
    private boolean m3999j(String str, String str2, String str3) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3292j += "function " + str2 + "(" + str3 + "){\n" + c + "\n}\n";
        return true;
    }

    /* renamed from: k */
    private void m4000k(String str) {
        WebView webView = this.f3288f;
        webView.loadUrl("javascript:" + str + "()");
    }

    /* renamed from: l */
    private String m4001l(String str, String str2) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return null;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c != null) {
            return c;
        }
        return null;
    }

    @TargetApi(11)
    /* renamed from: m */
    private void m4002m(com.iapp.app.p067x5.WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: n */
    private void m4003n(com.iapp.app.p067x5.WebView webView, String str) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(getApplicationContext().getDir("database", 0).getPath());
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setLightTouchEnabled(true);
        C1469c.m4064a(webView);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        if (Build.VERSION.SDK_INT >= 16) {
            webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            webView.getSettings().setAllowFileAccessFromFileURLs(true);
        }
        webView.setScrollBarStyle(0);
        if (addViewEventItme(str, webView.getId(), "ondownloadstart", "st_vId,st_vW,st_url,st_uT,st_cN,st_mE,st_cH")) {
            new C1325l(webView, this.f3288f, this.TaskId);
        } else {
            webView.setDownloadListener(new C1384e(this));
        }
        new C1443b().mo12148i(webView, str, this);
        m4002m(webView);
    }

    /* renamed from: o */
    private void m4004o() {
        String c;
        String str = this.f3300r;
        if (str != null) {
            String l = m4001l(str, "loading");
            if (l != null) {
                this.f3293k = true;
                this.f3292j += "function loading(){\n" + l + "\n}\n";
            }
            this.f3294l = m3998i(this.f3300r, "loadingComplete");
            this.f3296n = m3999j(this.f3300r, "downkey", "st_kC,st_eA,st_eR");
            this.f3297o = m3999j(this.f3300r, "upkey", "st_kC,st_eA,st_eR");
            this.f3298p = m3998i(this.f3300r, "destroy");
            this.f3299q = m3998i(this.f3300r, "stop");
            this.f3301s = m3998i(this.f3300r, "restart");
            this.f3302t = m3999j(this.f3300r, "onactivityresult", "st_sC,st_lC,st_iT");
            this.f3303u = m3999j(this.f3300r, "sensor", "st_x,st_y,st_z");
            if (this.f3300r.contains("<eventItme type=\"menu\">") && (c = C0860r.m2044c(this.f3300r, "<eventItme type=\"menu\">", "</eventItme>")) != null) {
                String[] split = ("m\n" + c).split("\ncase ", -1);
                this.f3285c = new String[split.length];
                for (int i = 1; i < split.length; i++) {
                    this.f3285c[i] = C0860r.m2044c(split[i], null, ":");
                    this.f3292j += "function CreateOptionsMenu" + i + "(){\n" + C0860r.m2044c(split[i], ":", "\nbreak") + "\n}\n";
                }
                String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
                if (c2 != null) {
                    this.f3295m = true;
                    this.f3292j += "function onCreateOptionsMenuloading(){\n" + c2 + "\n}\n";
                }
            }
        }
    }

    public static String set(String str, Object obj) {
        if (f3279D.containsKey(str)) {
            Object obj2 = f3279D.get(str);
            if (obj == null && obj2 == null) {
                return str;
            }
            if (!(obj == null || obj2 == null || !obj2.equals(obj))) {
                return str;
            }
        } else if (obj != null && f3279D.containsValue(obj)) {
            for (Map.Entry<String, Object> entry : f3279D.entrySet()) {
                if (entry.getValue().equals(obj)) {
                    return entry.getKey().toString();
                }
            }
        }
        f3279D.put(str, obj);
        return str;
    }

    public boolean addViewEventItme(String str, int i, String str2, String str3) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3292j += "function " + str2 + i + "(" + str3 + "){\n" + c + "\n}\n";
        return true;
    }

    public void callMethod(String str, String str2) {
        WebView webView = this.f3288f;
        webView.loadUrl("javascript:" + str + "(" + str2 + ")");
    }

    /* renamed from: g */
    public void mo12048g() {
        m4004o();
        if (this.f3303u) {
            SensorManager sensorManager = (SensorManager) getSystemService("sensor");
            this.f3290h = sensorManager;
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.f3291i = defaultSensor;
            C1385f fVar = new C1385f();
            this.f3289g = fVar;
            this.f3290h.registerListener(fVar, defaultSensor, 2);
        }
        if (this.f3293k) {
            this.f3292j += "\nloading();\n";
        }
        C1295c.m3508c(this, this.f3288f, this.f3292j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12049g(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.run.main2.mo12049g(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p009v4.app.FragmentActivity
    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1101) {
            Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            try {
                ValueCallback<Uri> valueCallback = C1443b.f3454a;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(data);
                } else {
                    ValueCallback<Uri[]> valueCallback2 = C1443b.f3455b;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            C1443b.f3454a = null;
            C1443b.f3455b = null;
        } else if (i == 1103) {
            C1340n nVar = C1340n.f3148n;
            if (nVar != null) {
                nVar.mo11985m(i, i2, intent);
            }
        } else if (this.f3302t) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", '");
            sb.append(set("^onactivityresult" + this.TaskId, intent));
            sb.append("'");
            callMethod("onactivityresult", sb.toString());
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        m4000k("onCreateContextMenu" + menuItem.getGroupId() + "x" + menuItem.getItemId());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.SupportActivity, android.support.p009v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (C1293a.f3049b == null) {
            C0835f.m1860q(this);
            finish();
            return;
        }
        C0864v.f1801k = this.f3284b;
        this.TaskId = getTaskId();
        setContentView(2131361857);
        this.f3288f = C1295c.m3506a(this, this.TaskId);
        this.f3287e = getIntent().getExtras().getString("OpenFilexmlui");
        this.f3283a = (LinearLayout) findViewById(2131230939);
        C1294b.m3499h3(this, this.f3287e.toLowerCase());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String[] strArr = this.f3285c;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                menu.add(0, i, 0, this.f3285c[i]);
            }
        }
        if (this.f3295m) {
            m4000k("onCreateOptionsMenuloading");
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (this.f3298p) {
            m4000k("destroy");
        }
        SensorManager sensorManager = this.f3290h;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f3289g, this.f3291i);
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f3296n) {
            callMethod("downkey", i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount());
            return false;
        } else if (i != 4) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f3297o) {
            return false;
        }
        callMethod("upkey", i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount());
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        m4000k("CreateOptionsMenu" + menuItem.getItemId());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p009v4.app.FragmentActivity
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        C0864v.f1801k = this.f3284b;
        if (this.f3301s) {
            m4000k("restart");
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p009v4.app.FragmentActivity
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onStop() {
        super.onStop();
        if (this.f3299q) {
            m4000k("stop");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.f3282C) {
            this.f3282C = true;
            if (this.f3294l) {
                m4000k("loadingComplete");
            }
        }
    }
}
