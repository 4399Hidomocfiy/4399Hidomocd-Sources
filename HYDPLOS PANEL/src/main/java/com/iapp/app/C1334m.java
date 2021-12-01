package com.iapp.app;

import android.app.Activity;
import android.support.p009v4.app.ActionBarDrawerToggle;
import android.support.p009v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import com.iapp.app.run.main2;
import com.iapp.app.run.mian;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.m */
public class C1334m {

    /* renamed from: a */
    private Activity f3127a = null;

    /* renamed from: b */
    private DrawerLayout f3128b = null;

    /* renamed from: c */
    private ActionBarDrawerToggle f3129c = null;

    /* renamed from: d */
    private String f3130d;

    /* renamed from: e */
    private String f3131e;

    /* renamed from: f */
    private String f3132f;

    /* renamed from: g */
    private String f3133g = null;

    /* renamed from: h */
    private boolean f3134h;

    /* renamed from: i */
    private boolean f3135i;

    /* renamed from: j */
    private boolean f3136j;

    /* renamed from: k */
    private C1298d f3137k;

    /* renamed from: l */
    private int f3138l;

    /* renamed from: m */
    private C1309h f3139m = null;

    /* renamed from: n */
    private int f3140n;

    /* renamed from: o */
    private WebView f3141o;

    /* renamed from: p */
    private String f3142p;

    /* renamed from: com.iapp.app.m$a */
    class C1335a extends ActionBarDrawerToggle {
        C1335a(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3) {
            super(activity, drawerLayout, i, i2, i3);
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            if (C1334m.this.f3130d != null) {
                C0864v vVar = new C0864v(C1334m.this.f3127a);
                vVar.mo8981T("st_vId", Integer.valueOf(C1334m.this.f3128b.getId()));
                vVar.mo8981T("st_vW", C1334m.this.f3128b);
                vVar.mo8981T("st_dW", view);
                vVar.mo8985f(C1334m.this.f3130d);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            if (C1334m.this.f3131e != null) {
                C0864v vVar = new C0864v(C1334m.this.f3127a);
                vVar.mo8981T("st_vId", Integer.valueOf(C1334m.this.f3128b.getId()));
                vVar.mo8981T("st_vW", C1334m.this.f3128b);
                vVar.mo8981T("st_dW", view);
                vVar.mo8985f(C1334m.this.f3131e);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (C1334m.this.f3132f == null) {
                return false;
            }
            C0864v vVar = new C0864v(C1334m.this.f3127a);
            vVar.mo8981T("st_vId", Integer.valueOf(C1334m.this.f3128b.getId()));
            vVar.mo8981T("st_vW", C1334m.this.f3128b);
            vVar.mo8981T("st_iM", menuItem);
            vVar.mo8985f(C1334m.this.f3132f);
            return false;
        }
    }

    /* renamed from: com.iapp.app.m$b */
    class C1336b extends ActionBarDrawerToggle {
        C1336b(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3) {
            super(activity, drawerLayout, i, i2, i3);
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            if (C1334m.this.f3130d != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1334m.this.f3127a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1334m.this.f3128b.getId()));
                aid_YuCodeX.dim("st_vW", C1334m.this.f3128b);
                aid_YuCodeX.dim("st_dW", view);
                String str = C1334m.this.f3133g;
                mian.m4024c(str, "ondrawerclosed" + C1334m.this.f3130d, aid_YuCodeX);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            if (C1334m.this.f3131e != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1334m.this.f3127a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1334m.this.f3128b.getId()));
                aid_YuCodeX.dim("st_vW", C1334m.this.f3128b);
                aid_YuCodeX.dim("st_dW", view);
                String str = C1334m.this.f3133g;
                mian.m4024c(str, "ondraweropened" + C1334m.this.f3131e, aid_YuCodeX);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (C1334m.this.f3132f == null) {
                return false;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1334m.this.f3127a);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(C1334m.this.f3128b.getId()));
            aid_YuCodeX.dim("st_vW", C1334m.this.f3128b);
            aid_YuCodeX.dim("st_iM", menuItem);
            String str = C1334m.this.f3133g;
            mian.m4024c(str, "onoptionsitemselected" + C1334m.this.f3132f, aid_YuCodeX);
            return false;
        }
    }

    /* renamed from: com.iapp.app.m$c */
    class C1337c extends ActionBarDrawerToggle {
        C1337c(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3) {
            super(activity, drawerLayout, i, i2, i3);
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            if (C1334m.this.f3134h) {
                C1298d dVar = C1334m.this.f3137k;
                dVar.mo11693d("ondrawerclosed" + C1334m.this.f3138l, Integer.valueOf(C1334m.this.f3138l), C1334m.this.f3128b, view);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            if (C1334m.this.f3135i) {
                C1298d dVar = C1334m.this.f3137k;
                dVar.mo11693d("ondraweropened" + C1334m.this.f3138l, Integer.valueOf(C1334m.this.f3138l), C1334m.this.f3128b, view);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (!C1334m.this.f3136j) {
                return false;
            }
            C1298d dVar = C1334m.this.f3137k;
            return dVar.mo11694e("onoptionsitemselected" + C1334m.this.f3138l, Integer.valueOf(C1334m.this.f3138l), C1334m.this.f3128b, menuItem);
        }
    }

    /* renamed from: com.iapp.app.m$d */
    class C1338d extends ActionBarDrawerToggle {
        C1338d(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3) {
            super(activity, drawerLayout, i, i2, i3);
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            if (C1334m.this.f3134h) {
                C1309h hVar = C1334m.this.f3139m;
                hVar.mo11942b("ondrawerclosed" + C1334m.this.f3138l, Integer.valueOf(C1334m.this.f3138l), C1334m.this.f3128b, view);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            if (C1334m.this.f3135i) {
                C1309h hVar = C1334m.this.f3139m;
                hVar.mo11942b("ondraweropened" + C1334m.this.f3138l, Integer.valueOf(C1334m.this.f3138l), C1334m.this.f3128b, view);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (!C1334m.this.f3136j) {
                return false;
            }
            C1309h hVar = C1334m.this.f3139m;
            return hVar.mo11943c("onoptionsitemselected" + C1334m.this.f3138l, Integer.valueOf(C1334m.this.f3138l), C1334m.this.f3128b, menuItem);
        }
    }

    /* renamed from: com.iapp.app.m$e */
    class C1339e extends ActionBarDrawerToggle {
        C1339e(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3) {
            super(activity, drawerLayout, i, i2, i3);
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            if (C1334m.this.f3134h) {
                StringBuilder sb = new StringBuilder();
                sb.append(C1334m.this.f3138l);
                sb.append(", '");
                sb.append(C1334m.this.f3142p);
                sb.append("', '");
                sb.append(main2.set("^ondrawerclosed" + C1334m.this.f3140n + "st_dW" + C1334m.this.f3138l, view));
                sb.append("'");
                C1334m.this.m3915p("ondrawerclosed" + C1334m.this.f3138l, sb.toString());
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            if (C1334m.this.f3135i) {
                StringBuilder sb = new StringBuilder();
                sb.append(C1334m.this.f3138l);
                sb.append(", '");
                sb.append(C1334m.this.f3142p);
                sb.append("', '");
                sb.append(main2.set("^ondraweropened" + C1334m.this.f3140n + "st_dW" + C1334m.this.f3138l, view));
                sb.append("'");
                C1334m.this.m3915p("ondraweropened" + C1334m.this.f3138l, sb.toString());
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (!C1334m.this.f3136j) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C1334m.this.f3138l);
            sb.append(", '");
            sb.append(C1334m.this.f3142p);
            sb.append("', '");
            sb.append(main2.set("^onoptionsitemselected" + C1334m.this.f3140n + "st_iM" + C1334m.this.f3138l, menuItem));
            sb.append("'");
            C1334m.this.m3915p("onoptionsitemselected" + C1334m.this.f3138l, sb.toString());
            return false;
        }
    }

    public C1334m(DrawerLayout drawerLayout, Activity activity) {
        this.f3128b = drawerLayout;
        this.f3127a = activity;
        String obj = ((Object[]) drawerLayout.getTag())[2].toString();
        this.f3130d = C0860r.m2044c(obj, "<eventItme type=\"ondrawerclosed\">", "</eventItme>");
        this.f3131e = C0860r.m2044c(obj, "<eventItme type=\"ondraweropened\">", "</eventItme>");
        this.f3132f = C0860r.m2044c(obj, "<eventItme type=\"onoptionsitemselected\">", "</eventItme>");
        C1335a aVar = new C1335a(activity, drawerLayout, 2131427340, 2131558431, 2131558431);
        this.f3129c = aVar;
        drawerLayout.setDrawerListener(aVar);
    }

    public C1334m(DrawerLayout drawerLayout, Activity activity, String str) {
        this.f3128b = drawerLayout;
        this.f3127a = activity;
        this.f3133g = str;
        String obj = ((Object[]) drawerLayout.getTag())[2].toString();
        this.f3130d = C0860r.m2044c(obj, "<eventItme type=\"ondrawerclosed\">", "</eventItme>");
        this.f3131e = C0860r.m2044c(obj, "<eventItme type=\"ondraweropened\">", "</eventItme>");
        this.f3132f = C0860r.m2044c(obj, "<eventItme type=\"onoptionsitemselected\">", "</eventItme>");
        C1336b bVar = new C1336b(activity, drawerLayout, 2131427340, 2131558431, 2131558431);
        this.f3129c = bVar;
        drawerLayout.setDrawerListener(bVar);
    }

    public C1334m(DrawerLayout drawerLayout, WebView webView, String str, int i, boolean z, boolean z2, boolean z3) {
        this.f3128b = drawerLayout;
        this.f3138l = drawerLayout.getId();
        this.f3141o = webView;
        this.f3142p = str;
        this.f3140n = i;
        this.f3134h = z;
        this.f3135i = z2;
        this.f3136j = z3;
        C1339e eVar = new C1339e(this.f3127a, drawerLayout, 2131427340, 2131558431, 2131558431);
        this.f3129c = eVar;
        drawerLayout.setDrawerListener(eVar);
    }

    public C1334m(DrawerLayout drawerLayout, C1298d dVar, boolean z, boolean z2, boolean z3) {
        this.f3128b = drawerLayout;
        this.f3138l = drawerLayout.getId();
        this.f3137k = dVar;
        this.f3134h = z;
        this.f3135i = z2;
        this.f3136j = z3;
        C1337c cVar = new C1337c(this.f3127a, drawerLayout, 2131427340, 2131558431, 2131558431);
        this.f3129c = cVar;
        drawerLayout.setDrawerListener(cVar);
    }

    public C1334m(DrawerLayout drawerLayout, C1309h hVar, boolean z, boolean z2, boolean z3) {
        this.f3128b = drawerLayout;
        this.f3138l = drawerLayout.getId();
        this.f3139m = hVar;
        this.f3134h = z;
        this.f3135i = z2;
        this.f3136j = z3;
        C1338d dVar = new C1338d(this.f3127a, drawerLayout, 2131427340, 2131558431, 2131558431);
        this.f3129c = dVar;
        drawerLayout.setDrawerListener(dVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: p */
    private void m3915p(String str, String str2) {
        WebView webView = this.f3141o;
        webView.loadUrl("javascript:" + str + "(" + str2 + ")");
    }
}
