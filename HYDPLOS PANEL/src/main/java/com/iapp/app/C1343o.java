package com.iapp.app;

import android.app.Activity;
import android.support.p009v4.view.ViewPager;
import android.webkit.WebView;
import com.iapp.app.run.mian;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.o */
public class C1343o {

    /* renamed from: a */
    private Activity f3163a = null;

    /* renamed from: b */
    private ViewPager f3164b = null;

    /* renamed from: c */
    private String f3165c;

    /* renamed from: d */
    private String f3166d;

    /* renamed from: e */
    private String f3167e;

    /* renamed from: f */
    private String f3168f = null;

    /* renamed from: g */
    private boolean f3169g;

    /* renamed from: h */
    private boolean f3170h;

    /* renamed from: i */
    private boolean f3171i;

    /* renamed from: j */
    private C1298d f3172j;

    /* renamed from: k */
    private int f3173k;

    /* renamed from: l */
    private C1309h f3174l = null;

    /* renamed from: m */
    private WebView f3175m;

    /* renamed from: n */
    private String f3176n;

    /* renamed from: com.iapp.app.o$a */
    class C1344a implements ViewPager.OnPageChangeListener {
        C1344a() {
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (C1343o.this.f3167e != null) {
                C0864v vVar = new C0864v(C1343o.this.f3163a);
                vVar.mo8981T("st_vId", Integer.valueOf(C1343o.this.f3164b.getId()));
                vVar.mo8981T("st_vW", C1343o.this.f3164b);
                vVar.mo8981T("st_sE", Integer.valueOf(i));
                vVar.mo8985f(C1343o.this.f3167e);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (C1343o.this.f3166d != null) {
                C0864v vVar = new C0864v(C1343o.this.f3163a);
                vVar.mo8981T("st_vId", Integer.valueOf(C1343o.this.f3164b.getId()));
                vVar.mo8981T("st_vW", C1343o.this.f3164b);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8981T("st_pT", Float.valueOf(f));
                vVar.mo8981T("st_pS", Integer.valueOf(i2));
                vVar.mo8985f(C1343o.this.f3166d);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (C1343o.this.f3165c != null) {
                C0864v vVar = new C0864v(C1343o.this.f3163a);
                vVar.mo8981T("st_vId", Integer.valueOf(C1343o.this.f3164b.getId()));
                vVar.mo8981T("st_vW", C1343o.this.f3164b);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8985f(C1343o.this.f3165c);
            }
        }
    }

    /* renamed from: com.iapp.app.o$b */
    class C1345b implements ViewPager.OnPageChangeListener {
        C1345b() {
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (C1343o.this.f3167e != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1343o.this.f3163a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1343o.this.f3164b.getId()));
                aid_YuCodeX.dim("st_vW", C1343o.this.f3164b);
                aid_YuCodeX.dim("st_sE", Integer.valueOf(i));
                String str = C1343o.this.f3168f;
                mian.m4024c(str, "onpagescrollstatechanged" + C1343o.this.f3167e, aid_YuCodeX);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (C1343o.this.f3166d != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1343o.this.f3163a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1343o.this.f3164b.getId()));
                aid_YuCodeX.dim("st_vW", C1343o.this.f3164b);
                aid_YuCodeX.dim("st_pN", Integer.valueOf(i));
                aid_YuCodeX.dim("st_pT", Float.valueOf(f));
                aid_YuCodeX.dim("st_pS", Integer.valueOf(i2));
                String str = C1343o.this.f3168f;
                mian.m4024c(str, "onpagescrolled" + C1343o.this.f3166d, aid_YuCodeX);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (C1343o.this.f3165c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1343o.this.f3163a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1343o.this.f3164b.getId()));
                aid_YuCodeX.dim("st_vW", C1343o.this.f3164b);
                aid_YuCodeX.dim("st_pN", Integer.valueOf(i));
                String str = C1343o.this.f3168f;
                mian.m4024c(str, "onpageselected" + C1343o.this.f3165c, aid_YuCodeX);
            }
        }
    }

    /* renamed from: com.iapp.app.o$c */
    class C1346c implements ViewPager.OnPageChangeListener {
        C1346c() {
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (C1343o.this.f3171i) {
                C1298d dVar = C1343o.this.f3172j;
                dVar.mo11693d("onpagescrollstatechanged" + C1343o.this.f3173k, Integer.valueOf(C1343o.this.f3173k), C1343o.this.f3164b, Integer.valueOf(i));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (C1343o.this.f3170h) {
                C1298d dVar = C1343o.this.f3172j;
                dVar.mo11693d("onpagescrolled" + C1343o.this.f3173k, Integer.valueOf(C1343o.this.f3173k), C1343o.this.f3164b, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (C1343o.this.f3169g) {
                C1298d dVar = C1343o.this.f3172j;
                dVar.mo11693d("onpageselected" + C1343o.this.f3173k, Integer.valueOf(C1343o.this.f3173k), C1343o.this.f3164b, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.iapp.app.o$d */
    class C1347d implements ViewPager.OnPageChangeListener {
        C1347d() {
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (C1343o.this.f3171i) {
                C1309h hVar = C1343o.this.f3174l;
                hVar.mo11942b("onpagescrollstatechanged" + C1343o.this.f3173k, Integer.valueOf(C1343o.this.f3173k), C1343o.this.f3164b, Integer.valueOf(i));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (C1343o.this.f3170h) {
                C1309h hVar = C1343o.this.f3174l;
                hVar.mo11942b("onpagescrolled" + C1343o.this.f3173k, Integer.valueOf(C1343o.this.f3173k), C1343o.this.f3164b, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (C1343o.this.f3169g) {
                C1309h hVar = C1343o.this.f3174l;
                hVar.mo11942b("onpageselected" + C1343o.this.f3173k, Integer.valueOf(C1343o.this.f3173k), C1343o.this.f3164b, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.iapp.app.o$e */
    class C1348e implements ViewPager.OnPageChangeListener {
        C1348e() {
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (C1343o.this.f3171i) {
                C1343o.this.f3172j.mo11693d("onpagescrollstatechanged" + C1343o.this.f3173k, C1343o.this.f3173k + ", '" + C1343o.this.f3176n + "', " + i);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (C1343o.this.f3170h) {
                C1343o.this.f3172j.mo11693d("onpagescrolled" + C1343o.this.f3173k, C1343o.this.f3173k + ", '" + C1343o.this.f3176n + "', " + i + ", " + f + ", " + i2);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (C1343o.this.f3169g) {
                C1343o.this.m3948o("onpageselected" + C1343o.this.f3173k, C1343o.this.f3173k + ", '" + C1343o.this.f3176n + "', " + i);
            }
        }
    }

    public C1343o(ViewPager viewPager, Activity activity) {
        this.f3163a = activity;
        this.f3164b = viewPager;
        String obj = ((Object[]) viewPager.getTag())[2].toString();
        this.f3165c = C0860r.m2044c(obj, "<eventItme type=\"onpageselected\">", "</eventItme>");
        this.f3166d = C0860r.m2044c(obj, "<eventItme type=\"onpagescrolled\">", "</eventItme>");
        this.f3167e = C0860r.m2044c(obj, "<eventItme type=\"onpagescrollstatechanged\">", "</eventItme>");
        viewPager.setOnPageChangeListener(new C1344a());
    }

    public C1343o(ViewPager viewPager, Activity activity, String str) {
        this.f3163a = activity;
        this.f3164b = viewPager;
        this.f3168f = str;
        String obj = ((Object[]) viewPager.getTag())[2].toString();
        this.f3165c = C0860r.m2044c(obj, "<eventItme type=\"onpageselected\">", "</eventItme>");
        this.f3166d = C0860r.m2044c(obj, "<eventItme type=\"onpagescrolled\">", "</eventItme>");
        this.f3167e = C0860r.m2044c(obj, "<eventItme type=\"onpagescrollstatechanged\">", "</eventItme>");
        viewPager.setOnPageChangeListener(new C1345b());
    }

    public C1343o(ViewPager viewPager, WebView webView, String str, boolean z, boolean z2, boolean z3) {
        this.f3164b = viewPager;
        this.f3175m = webView;
        this.f3176n = str;
        this.f3173k = viewPager.getId();
        this.f3169g = z;
        this.f3170h = z2;
        this.f3171i = z3;
        viewPager.setOnPageChangeListener(new C1348e());
    }

    public C1343o(ViewPager viewPager, C1298d dVar, boolean z, boolean z2, boolean z3) {
        this.f3164b = viewPager;
        this.f3172j = dVar;
        this.f3173k = viewPager.getId();
        this.f3169g = z;
        this.f3170h = z2;
        this.f3171i = z3;
        viewPager.setOnPageChangeListener(new C1346c());
    }

    public C1343o(ViewPager viewPager, C1309h hVar, boolean z, boolean z2, boolean z3) {
        this.f3164b = viewPager;
        this.f3174l = hVar;
        this.f3173k = viewPager.getId();
        this.f3169g = z;
        this.f3170h = z2;
        this.f3171i = z3;
        viewPager.setOnPageChangeListener(new C1347d());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private void m3948o(String str, String str2) {
        WebView webView = this.f3175m;
        webView.loadUrl("javascript:" + str + "(" + str2 + ")");
    }
}
