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
import android.support.design.widget.AppBarLayout;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.support.p012v7.app.AppCompatActivity;
import android.support.p012v7.widget.LinearLayoutManager;
import android.support.p012v7.widget.RecyclerView;
import android.support.p012v7.widget.StaggeredGridLayoutManager;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.iapp.app.Aid_YuCodeX;
import com.iapp.app.C1293a;
import com.iapp.app.C1294b;
import com.iapp.app.C1305g;
import com.iapp.app.C1325l;
import com.iapp.app.C1334m;
import com.iapp.app.C1340n;
import com.iapp.app.C1343o;
import com.iapp.app.C1352q;
import com.iapp.app.TabLayout;
import com.iapp.app.p067x5.AbstractC1442a;
import com.iapp.app.p067x5.C1443b;
import com.iapp.app.p067x5.C1469c;
import com.iapp.app.p067x5.WebView;
import java.lang.reflect.Method;
import java.util.HashMap;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;
import p013b.p048c.p049a.C0916b;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;

@SuppressLint({"UseSparseArrays"})
public class mian extends AppCompatActivity {
    public static String packageName = null;

    /* renamed from: sh */
    public static boolean f3388sh = true;

    /* renamed from: t */
    private static Class[] f3389t;

    /* renamed from: u */
    private static HashMap<String, Class<?>> f3390u = new HashMap<>();

    /* renamed from: a */
    private LinearLayout f3391a;

    /* renamed from: b */
    private HashMap<String, Object> f3392b = new HashMap<>();

    /* renamed from: c */
    private HashMap<Integer, String> f3393c = new HashMap<>();

    /* renamed from: d */
    private HashMap<Integer, String> f3394d = new HashMap<>();

    /* renamed from: e */
    private C0864v f3395e;

    /* renamed from: f */
    private C0864v f3396f;

    /* renamed from: g */
    private C0864v f3397g = null;

    /* renamed from: h */
    private Aid_YuCodeX f3398h;

    /* renamed from: i */
    private Aid_YuCodeX f3399i;

    /* renamed from: j */
    private Aid_YuCodeX f3400j = null;

    /* renamed from: k */
    private C0916b f3401k = new C0916b(this);

    /* renamed from: l */
    private String f3402l = null;

    /* renamed from: m */
    private String f3403m = null;

    /* renamed from: n */
    private SensorEventListener f3404n = null;

    /* renamed from: o */
    private SensorManager f3405o = null;

    /* renamed from: p */
    private Sensor f3406p = null;

    /* renamed from: q */
    private boolean f3407q = false;

    /* renamed from: r */
    public String f3408r = null;

    /* renamed from: s */
    private boolean f3409s = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$a */
    public class C1414a implements TextView.OnEditorActionListener {
        C1414a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(textView.getId()));
                vVar.mo8981T("st_vW", textView);
                vVar.mo8981T("st_aI", Integer.valueOf(i));
                if (keyEvent != null) {
                    vVar.mo8981T("st_eA", Integer.valueOf(keyEvent.getAction()));
                    vVar.mo8981T("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
                    vVar.mo8981T("st_eK", Integer.valueOf(keyEvent.getKeyCode()));
                } else {
                    vVar.mo8981T("st_eA", null);
                    vVar.mo8981T("st_eR", null);
                    vVar.mo8981T("st_eK", null);
                }
                return mian.this.m4036o(vVar, "editormonitor", ((Object[]) textView.getTag())[2].toString());
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(textView.getId()));
            aid_YuCodeX.dim("st_vW", textView);
            aid_YuCodeX.dim("st_aI", Integer.valueOf(i));
            if (keyEvent != null) {
                aid_YuCodeX.dim("st_eA", Integer.valueOf(keyEvent.getAction()));
                aid_YuCodeX.dim("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
                aid_YuCodeX.dim("st_eK", Integer.valueOf(keyEvent.getKeyCode()));
            } else {
                aid_YuCodeX.dim("st_eA", null);
                aid_YuCodeX.dim("st_eR", null);
                aid_YuCodeX.dim("st_eK", null);
            }
            return mian.this.m4037p(aid_YuCodeX, "editormonitor", ((Object[]) textView.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$b */
    public class View$OnFocusChangeListenerC1415b implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1415b() {
        }

        public void onFocusChange(View view, boolean z) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
                vVar.mo8981T("st_vW", view);
                vVar.mo8981T("st_hF", Boolean.valueOf(z));
                vVar.mo8985f(C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"focuschange\">", "</eventItme>"));
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX.dim("st_vW", view);
            aid_YuCodeX.dim("st_hF", Boolean.valueOf(z));
            mian mian = mian.this;
            mian.goUIEventset("focuschange" + C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"focuschange\">", "</eventItme>"), aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$c */
    public class C1416c implements AbsListView.OnScrollListener {
        C1416c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            String c = C0860r.m2044c(((Object[]) absListView.getTag())[2].toString(), "<eventItme type=\"onscroll\">", "</eventItme>");
            if (c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(absListView.getId()));
                vVar.mo8981T("st_vW", absListView);
                vVar.mo8981T("st_fM", Integer.valueOf(i));
                vVar.mo8981T("st_vT", Integer.valueOf(i2));
                vVar.mo8981T("st_bT", Integer.valueOf(i3));
                vVar.mo8985f(c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(absListView.getId()));
            aid_YuCodeX.dim("st_vW", absListView);
            aid_YuCodeX.dim("st_fM", Integer.valueOf(i));
            aid_YuCodeX.dim("st_vT", Integer.valueOf(i2));
            aid_YuCodeX.dim("st_bT", Integer.valueOf(i3));
            mian mian = mian.this;
            mian.goUIEventset("onscroll" + c, aid_YuCodeX);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            String c = C0860r.m2044c(((Object[]) absListView.getTag())[2].toString(), "<eventItme type=\"onscrollstatechanged\">", "</eventItme>");
            if (c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(absListView.getId()));
                vVar.mo8981T("st_vW", absListView);
                vVar.mo8981T("st_sE", Integer.valueOf(i));
                vVar.mo8985f(c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(absListView.getId()));
            aid_YuCodeX.dim("st_vW", absListView);
            aid_YuCodeX.dim("st_sE", Integer.valueOf(i));
            mian mian = mian.this;
            mian.goUIEventset("onscrollstatechanged" + c, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$d */
    public class C1417d implements AdapterView.OnItemClickListener {
        C1417d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(adapterView.getId()));
                vVar.mo8981T("st_vW", adapterView);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8981T("st_iD", Long.valueOf(j));
                vVar.mo8985f(C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"clickitem\">", "</eventItme>"));
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(adapterView.getId()));
            aid_YuCodeX.dim("st_vW", adapterView);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(i));
            aid_YuCodeX.dim("st_iD", Long.valueOf(j));
            mian mian = mian.this;
            mian.goUIEventset("clickitem" + C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"clickitem\">", "</eventItme>"), aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$e */
    public class C1418e implements AdapterView.OnItemSelectedListener {
        C1418e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String c = C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"onitemselected\">", "</eventItme>");
            if (c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(adapterView.getId()));
                vVar.mo8981T("st_vW", adapterView);
                vVar.mo8981T("st_vW2", view);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8981T("st_iD", Long.valueOf(j));
                vVar.mo8985f(c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(adapterView.getId()));
            aid_YuCodeX.dim("st_vW", adapterView);
            aid_YuCodeX.dim("st_vW2", view);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(i));
            aid_YuCodeX.dim("st_iD", Long.valueOf(j));
            mian mian = mian.this;
            mian.goUIEventset("onitemselected" + c, aid_YuCodeX);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            String c = C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"onnothingselected\">", "</eventItme>");
            if (c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(adapterView.getId()));
                vVar.mo8981T("st_vW", adapterView);
                vVar.mo8985f(c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(adapterView.getId()));
            aid_YuCodeX.dim("st_vW", adapterView);
            mian mian = mian.this;
            mian.goUIEventset("onnothingselected" + c, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$f */
    public class C1419f implements SeekBar.OnSeekBarChangeListener {
        C1419f() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onprogresschanged2\">", "</eventItme>");
            if (c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(seekBar.getId()));
                vVar.mo8981T("st_vW", seekBar);
                vVar.mo8981T("st_nS", Integer.valueOf(i));
                vVar.mo8981T("st_fR", Boolean.valueOf(z));
                vVar.mo8985f(c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(seekBar.getId()));
            aid_YuCodeX.dim("st_vW", seekBar);
            aid_YuCodeX.dim("st_nS", Integer.valueOf(i));
            aid_YuCodeX.dim("st_fR", Boolean.valueOf(z));
            mian mian = mian.this;
            mian.goUIEventset("onprogresschanged2" + c, aid_YuCodeX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onstarttrackingtouch\">", "</eventItme>");
            if (c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(seekBar.getId()));
                vVar.mo8981T("st_vW", seekBar);
                vVar.mo8985f(c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(seekBar.getId()));
            aid_YuCodeX.dim("st_vW", seekBar);
            mian mian = mian.this;
            mian.goUIEventset("onstarttrackingtouch" + c, aid_YuCodeX);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onstoptrackingtouch\">", "</eventItme>");
            if (c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(seekBar.getId()));
                vVar.mo8981T("st_vW", seekBar);
                vVar.mo8985f(c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(seekBar.getId()));
            aid_YuCodeX.dim("st_vW", seekBar);
            mian mian = mian.this;
            mian.goUIEventset("onstoptrackingtouch" + c, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$g */
    public class C1420g implements TabLayout.AbstractC1278d {

        /* renamed from: a */
        final /* synthetic */ String f3416a;

        /* renamed from: b */
        final /* synthetic */ View f3417b;

        /* renamed from: c */
        final /* synthetic */ String f3418c;

        /* renamed from: d */
        final /* synthetic */ String f3419d;

        C1420g(String str, View view, String str2, String str3) {
            this.f3416a = str;
            this.f3417b = view;
            this.f3418c = str2;
            this.f3419d = str3;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(TabLayout.C1283g gVar) {
            if (this.f3419d == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3417b.getId()));
                vVar.mo8981T("st_vW", this.f3417b);
                vVar.mo8981T("st_pN", Integer.valueOf(gVar.mo11600d()));
                vVar.mo8981T("st_tT", String.valueOf(gVar.mo11601e()));
                vVar.mo8981T("st_taB", gVar);
                vVar.mo8985f(this.f3419d);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3417b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3417b);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(gVar.mo11600d()));
            aid_YuCodeX.dim("st_tT", String.valueOf(gVar.mo11601e()));
            aid_YuCodeX.dim("st_taB", gVar);
            mian mian = mian.this;
            mian.goUIEventset("ontabreselected" + this.f3419d, aid_YuCodeX);
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(TabLayout.C1283g gVar) {
            if (this.f3418c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3417b.getId()));
                vVar.mo8981T("st_vW", this.f3417b);
                vVar.mo8981T("st_pN", Integer.valueOf(gVar.mo11600d()));
                vVar.mo8981T("st_tT", String.valueOf(gVar.mo11601e()));
                vVar.mo8981T("st_taB", gVar);
                vVar.mo8985f(this.f3418c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3417b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3417b);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(gVar.mo11600d()));
            aid_YuCodeX.dim("st_tT", String.valueOf(gVar.mo11601e()));
            aid_YuCodeX.dim("st_taB", gVar);
            mian mian = mian.this;
            mian.goUIEventset("ontabunselected" + this.f3418c, aid_YuCodeX);
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(TabLayout.C1283g gVar) {
            if (this.f3416a == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3417b.getId()));
                vVar.mo8981T("st_vW", this.f3417b);
                vVar.mo8981T("st_pN", Integer.valueOf(gVar.mo11600d()));
                vVar.mo8981T("st_tT", String.valueOf(gVar.mo11601e()));
                vVar.mo8981T("st_taB", gVar);
                vVar.mo8985f(this.f3416a);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3417b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3417b);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(gVar.mo11600d()));
            aid_YuCodeX.dim("st_tT", String.valueOf(gVar.mo11601e()));
            aid_YuCodeX.dim("st_taB", gVar);
            mian mian = mian.this;
            mian.goUIEventset("ontabselected" + this.f3416a, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$h */
    public class C1421h extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ String f3421a;

        /* renamed from: b */
        final /* synthetic */ String f3422b;

        C1421h(String str, String str2) {
            this.f3421a = str;
            this.f3422b = str2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f3421a == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(recyclerView.getId()));
                vVar.mo8981T("st_vW", recyclerView);
                vVar.mo8981T("st_sE", Integer.valueOf(i));
                vVar.mo8985f(this.f3421a);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(recyclerView.getId()));
            aid_YuCodeX.dim("st_vW", recyclerView);
            aid_YuCodeX.dim("st_sE", Integer.valueOf(i));
            mian mian = mian.this;
            mian.goUIEventset("onscrollstatechanged" + this.f3421a, aid_YuCodeX);
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.f3422b != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int itemCount = layoutManager.getItemCount();
                int i3 = -1;
                boolean z = false;
                if (layoutManager instanceof LinearLayoutManager) {
                    i3 = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    if (staggeredGridLayoutManager.getSpanCount() > 0) {
                        i3 = staggeredGridLayoutManager.findFirstVisibleItemPositions(null)[0];
                    }
                }
                if (mian.f3388sh) {
                    C0864v vVar = new C0864v(mian.this);
                    vVar.mo8981T("st_vId", Integer.valueOf(recyclerView.getId()));
                    vVar.mo8981T("st_vW", recyclerView);
                    vVar.mo8981T("st_fM", Integer.valueOf(i3));
                    vVar.mo8981T("st_vT", Integer.valueOf(childCount));
                    vVar.mo8981T("st_bT", Integer.valueOf(itemCount));
                    vVar.mo8981T("st_dX", Integer.valueOf(i));
                    vVar.mo8981T("st_dY", Integer.valueOf(i2));
                    if (i2 > 0 && childCount + i3 >= itemCount) {
                        z = true;
                    }
                    vVar.mo8981T("st_isB", Boolean.valueOf(z));
                    vVar.mo8985f(this.f3422b);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(recyclerView.getId()));
                aid_YuCodeX.dim("st_vW", recyclerView);
                aid_YuCodeX.dim("st_fM", Integer.valueOf(i3));
                aid_YuCodeX.dim("st_vT", Integer.valueOf(childCount));
                aid_YuCodeX.dim("st_bT", Integer.valueOf(itemCount));
                aid_YuCodeX.dim("st_dX", Integer.valueOf(i));
                aid_YuCodeX.dim("st_dY", Integer.valueOf(i2));
                if (i2 > 0 && childCount + i3 >= itemCount) {
                    z = true;
                }
                aid_YuCodeX.dim("st_isB", Boolean.valueOf(z));
                mian mian = mian.this;
                mian.goUIEventset("onscrolled" + this.f3422b, aid_YuCodeX);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$i */
    public class C1422i extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ View f3424a;

        /* renamed from: b */
        final /* synthetic */ String f3425b;

        C1422i(View view, String str) {
            this.f3424a = view;
            this.f3425b = str;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View findChildViewUnder = ((RecyclerView) this.f3424a).findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder != null && this.f3425b != null) {
                if (mian.f3388sh) {
                    C0864v vVar = new C0864v(mian.this);
                    vVar.mo8981T("st_vId", Integer.valueOf(this.f3424a.getId()));
                    vVar.mo8981T("st_vW", this.f3424a);
                    vVar.mo8981T("st_pN", Integer.valueOf(((RecyclerView) this.f3424a).getChildLayoutPosition(findChildViewUnder)));
                    vVar.mo8981T("st_vW2", findChildViewUnder);
                    vVar.mo8985f(this.f3425b);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3424a.getId()));
                aid_YuCodeX.dim("st_vW", this.f3424a);
                aid_YuCodeX.dim("st_pN", Integer.valueOf(((RecyclerView) this.f3424a).getChildLayoutPosition(findChildViewUnder)));
                aid_YuCodeX.dim("st_vW2", findChildViewUnder);
                mian mian = mian.this;
                mian.goUIEventset("clickitem" + this.f3425b, aid_YuCodeX);
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            View findChildViewUnder = ((RecyclerView) this.f3424a).findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder == null) {
                return false;
            }
            if (this.f3425b == null) {
                return true;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3424a.getId()));
                vVar.mo8981T("st_vW", this.f3424a);
                vVar.mo8981T("st_pN", Integer.valueOf(((RecyclerView) this.f3424a).getChildLayoutPosition(findChildViewUnder)));
                vVar.mo8981T("st_vW2", findChildViewUnder);
                vVar.mo8985f(this.f3425b);
                return true;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3424a.getId()));
            aid_YuCodeX.dim("st_vW", this.f3424a);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(((RecyclerView) this.f3424a).getChildLayoutPosition(findChildViewUnder)));
            aid_YuCodeX.dim("st_vW2", findChildViewUnder);
            mian mian = mian.this;
            mian.goUIEventset("clickitem" + this.f3425b, aid_YuCodeX);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$j */
    public class C1423j implements RecyclerView.OnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f3427a;

        C1423j(mian mian, GestureDetector gestureDetector) {
            this.f3427a = gestureDetector;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f3427a.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$k */
    public class C1424k implements AbstractC1442a {
        C1424k(mian mian) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$l */
    public class C1425l implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f3428a;

        /* renamed from: b */
        final /* synthetic */ View f3429b;

        /* renamed from: c */
        final /* synthetic */ String f3430c;

        /* renamed from: d */
        final /* synthetic */ String f3431d;

        C1425l(String str, View view, String str2, String str3) {
            this.f3428a = str;
            this.f3429b = view;
            this.f3430c = str2;
            this.f3431d = str3;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f3431d == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3429b.getId()));
                vVar.mo8981T("st_vW", this.f3429b);
                vVar.mo8981T("st_sE", Integer.valueOf(i));
                vVar.mo8985f(this.f3431d);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3429b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3429b);
            aid_YuCodeX.dim("st_sE", Integer.valueOf(i));
            mian mian = mian.this;
            mian.goUIEventset("onpagescrollstatechanged" + this.f3431d, aid_YuCodeX);
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f3430c == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3429b.getId()));
                vVar.mo8981T("st_vW", this.f3429b);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8981T("st_pT", Float.valueOf(f));
                vVar.mo8981T("st_pS", Integer.valueOf(i2));
                vVar.mo8985f(this.f3430c);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3429b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3429b);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(i));
            aid_YuCodeX.dim("st_pT", Float.valueOf(f));
            aid_YuCodeX.dim("st_pS", Integer.valueOf(i2));
            mian mian = mian.this;
            mian.goUIEventset("onpagescrolled" + this.f3430c, aid_YuCodeX);
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f3428a == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3429b.getId()));
                vVar.mo8981T("st_vW", this.f3429b);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8985f(this.f3428a);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3429b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3429b);
            aid_YuCodeX.dim("st_pN", Integer.valueOf(i));
            mian mian = mian.this;
            mian.goUIEventset("onpageselected" + this.f3428a, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$m */
    public class C1426m implements SwipeRefreshLayout.OnRefreshListener {

        /* renamed from: a */
        final /* synthetic */ String f3433a;

        /* renamed from: b */
        final /* synthetic */ View f3434b;

        C1426m(String str, View view) {
            this.f3433a = str;
            this.f3434b = view;
        }

        @Override // android.support.p009v4.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            if (this.f3433a == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3434b.getId()));
                vVar.mo8981T("st_vW", this.f3434b);
                vVar.mo8985f(this.f3433a);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3434b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3434b);
            mian mian = mian.this;
            mian.goUIEventset("onrefresh" + this.f3433a, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$n */
    public class C1427n implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f3436a;

        /* renamed from: b */
        final /* synthetic */ View f3437b;

        C1427n(String str, View view) {
            this.f3436a = str;
            this.f3437b = view;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f3436a == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f3437b.getId()));
                vVar.mo8981T("st_vW", this.f3437b);
                vVar.mo8981T("st_iC", Boolean.valueOf(z));
                vVar.mo8985f(this.f3436a);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(this.f3437b.getId()));
            aid_YuCodeX.dim("st_vW", this.f3437b);
            aid_YuCodeX.dim("st_iC", Boolean.valueOf(z));
            mian mian = mian.this;
            mian.goUIEventset("oncheckedchanged" + this.f3436a, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$o */
    public class C1428o implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ String f3439a;

        C1428o(String str) {
            this.f3439a = str;
        }

        @Override // android.support.design.widget.AppBarLayout.OnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (this.f3439a == null) {
                return;
            }
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(appBarLayout.getId()));
                vVar.mo8981T("st_vW", appBarLayout);
                vVar.mo8981T("st_vO", Integer.valueOf(i));
                vVar.mo8985f(this.f3439a);
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(appBarLayout.getId()));
            aid_YuCodeX.dim("st_vW", appBarLayout);
            aid_YuCodeX.dim("st_vO", Integer.valueOf(i));
            mian mian = mian.this;
            mian.goUIEventset("onoffsetchanged" + this.f3439a, aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$p */
    public class C1429p implements AbstractC1442a {
        C1429p(mian mian) {
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

    /* renamed from: com.iapp.app.run.mian$q */
    class C1430q implements SensorEventListener {
        C1430q() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            mian.this.f3397g.mo8981T("st_x", Float.valueOf(sensorEvent.values[0]));
            mian.this.f3397g.mo8981T("st_y", Float.valueOf(sensorEvent.values[1]));
            mian.this.f3397g.mo8981T("st_z", Float.valueOf(sensorEvent.values[2]));
            mian.this.f3397g.mo8985f(C0860r.m2044c(mian.this.f3408r, "<eventItme type=\"sensor\">", "</eventItme>"));
        }
    }

    /* renamed from: com.iapp.app.run.mian$r */
    class C1431r implements SensorEventListener {
        C1431r() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            mian.this.f3400j.dim("st_x", Float.valueOf(sensorEvent.values[0]));
            mian.this.f3400j.dim("st_y", Float.valueOf(sensorEvent.values[1]));
            mian.this.f3400j.dim("st_z", Float.valueOf(sensorEvent.values[2]));
            mian mian = mian.this;
            mian.goUIEventset("sensor" + C0860r.m2044c(mian.this.f3408r, "<eventItme type=\"sensor\">", "</eventItme>"), mian.this.f3400j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$s */
    public class View$OnClickListenerC1432s implements View.OnClickListener {
        View$OnClickListenerC1432s() {
        }

        public void onClick(View view) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
                vVar.mo8981T("st_vW", view);
                vVar.mo8985f(C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"clicki\">", "</eventItme>"));
                return;
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX.dim("st_vW", view);
            mian mian = mian.this;
            mian.goUIEventset("clicki" + C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"clicki\">", "</eventItme>"), aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$t */
    public class View$OnTouchListenerC1433t implements View.OnTouchListener {
        View$OnTouchListenerC1433t() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
                vVar.mo8981T("st_vW", view);
                vVar.mo8981T("st_eA", Integer.valueOf(motionEvent.getAction()));
                vVar.mo8981T("st_eX", Float.valueOf(motionEvent.getX()));
                vVar.mo8981T("st_eY", Float.valueOf(motionEvent.getY()));
                vVar.mo8981T("st_rX", Float.valueOf(motionEvent.getRawX()));
                vVar.mo8981T("st_rY", Float.valueOf(motionEvent.getRawY()));
                return mian.this.m4036o(vVar, "touchmonitor", ((Object[]) view.getTag())[2].toString());
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX.dim("st_vW", view);
            aid_YuCodeX.dim("st_eA", Integer.valueOf(motionEvent.getAction()));
            aid_YuCodeX.dim("st_eX", Float.valueOf(motionEvent.getX()));
            aid_YuCodeX.dim("st_eY", Float.valueOf(motionEvent.getY()));
            aid_YuCodeX.dim("st_rX", Float.valueOf(motionEvent.getRawX()));
            aid_YuCodeX.dim("st_rY", Float.valueOf(motionEvent.getRawY()));
            return mian.this.m4037p(aid_YuCodeX, "touchmonitor", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$u */
    public class View$OnLongClickListenerC1434u implements View.OnLongClickListener {
        View$OnLongClickListenerC1434u() {
        }

        public boolean onLongClick(View view) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
                vVar.mo8981T("st_vW", view);
                return mian.this.m4036o(vVar, "press", ((Object[]) view.getTag())[2].toString());
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX.dim("st_vW", view);
            return mian.this.m4037p(aid_YuCodeX, "press", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$v */
    public class View$OnKeyListenerC1435v implements View.OnKeyListener {
        View$OnKeyListenerC1435v() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(mian.this);
                vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
                vVar.mo8981T("st_vW", view);
                vVar.mo8981T("st_kC", Integer.valueOf(i));
                vVar.mo8981T("st_eA", Integer.valueOf(keyEvent.getAction()));
                vVar.mo8981T("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
                return mian.this.m4036o(vVar, "keyboard", ((Object[]) view.getTag())[2].toString());
            }
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(mian.this);
            aid_YuCodeX.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX.dim("st_vW", view);
            aid_YuCodeX.dim("st_kC", Integer.valueOf(i));
            aid_YuCodeX.dim("st_eA", Integer.valueOf(keyEvent.getAction()));
            aid_YuCodeX.dim("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
            return mian.this.m4037p(aid_YuCodeX, "keyboard", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.mian$w */
    public class View$OnCreateContextMenuListenerC1436w implements View.OnCreateContextMenuListener {
        View$OnCreateContextMenuListenerC1436w() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            String c = C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"pressmenu\">", "</eventItme>");
            contextMenu.setHeaderTitle(C0860r.m2044c(c, "title:", "\n"));
            mian.this.f3393c.clear();
            String[] split = c.split("\ncase ");
            for (int i = 1; i < split.length; i++) {
                contextMenu.add(0, i, 0, C0860r.m2044c(split[i], null, ":"));
                mian.this.f3393c.put(Integer.valueOf(i), C0860r.m2044c(split[i], ":", "\nbreak"));
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            if (mian.f3388sh) {
                mian.this.f3395e = new C0864v(mian.this);
                mian.this.f3395e.mo8981T("st_vId", Integer.valueOf(view.getId()));
                mian.this.f3395e.mo8981T("st_vW", view);
                if (c2 != null) {
                    mian.this.f3395e.mo8985f(c2);
                    return;
                }
                return;
            }
            mian.this.f3398h = new Aid_YuCodeX(mian.this);
            mian.this.f3398h.dim("st_vId", Integer.valueOf(view.getId()));
            mian.this.f3398h.dim("st_vW", view);
            if (c2 != null) {
                mian mian = mian.this;
                mian.goUIEventset("pressmenu" + c2, mian.this.f3398h);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[SYNTHETIC, Splitter:B:14:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[SYNTHETIC, Splitter:B:24:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[SYNTHETIC, Splitter:B:35:0x0097] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m4021a(java.lang.String r4, java.lang.Class<?>[] r5, java.lang.Object[] r6) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.run.mian.m4021a(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: c */
    public static void m4024c(String str, String str2, Object obj) {
        Object a = m4021a(str, null, null);
        C0835f.m1856m(a, a.getClass(), str2, m4034m(), new Object[]{obj});
    }

    /* renamed from: k */
    private void m4032k(View view, String str) {
        if (str.contains("<eventItme type=\"clicki\">")) {
            view.setOnClickListener(new View$OnClickListenerC1432s());
        }
        if (str.contains("<eventItme type=\"touchmonitor\">")) {
            view.setOnTouchListener(new View$OnTouchListenerC1433t());
        }
        if (str.contains("<eventItme type=\"press\">")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1434u());
        }
        if (str.contains("<eventItme type=\"keyboard\">")) {
            view.setOnKeyListener(new View$OnKeyListenerC1435v());
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1436w());
        }
        if (view instanceof TextView) {
            if (str.contains("<eventItme type=\"editormonitor\">")) {
                ((TextView) view).setOnEditorActionListener(new C1414a());
            }
            if (str.contains("<eventItme type=\"ontextchanged\">") || str.contains("<eventItme type=\"beforetextchanged\">") || str.contains("<eventItme type=\"aftertextchanged\">")) {
                if (f3388sh) {
                    new C1352q((TextView) view, this);
                } else {
                    new C1352q((TextView) view, this, this.f3403m);
                }
            }
        }
        if (view instanceof WebView) {
            if (f3388sh) {
                m4039r((WebView) view, str);
            } else {
                m4040s((WebView) view, str, this.f3403m);
            }
        }
        if (str.contains("<eventItme type=\"focuschange\">")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1415b());
        }
        if ((view instanceof AbsListView) && (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscroll\">"))) {
            ((AbsListView) view).setOnScrollListener(new C1416c());
        }
        if (view instanceof AdapterView) {
            if (str.contains("<eventItme type=\"clickitem\">")) {
                ((AdapterView) view).setOnItemClickListener(new C1417d());
            }
            if (str.contains("<eventItme type=\"onitemselected\">") || str.contains("<eventItme type=\"onnothingselected\">")) {
                ((AdapterView) view).setOnItemSelectedListener(new C1418e());
            }
        }
        if ((view instanceof ViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            if (f3388sh) {
                new C1343o((ViewPager) view, this);
            } else {
                new C1343o((ViewPager) view, this, this.f3403m);
            }
        }
        if ((view instanceof DrawerLayout) && (str.contains("<eventItme type=\"ondrawerclosed\">") || str.contains("<eventItme type=\"ondraweropened\">") || str.contains("<eventItme type=\"onoptionsitemselected\">"))) {
            if (f3388sh) {
                new C1334m((DrawerLayout) view, this);
            } else {
                new C1334m((DrawerLayout) view, this, this.f3403m);
            }
        }
        if ((view instanceof SeekBar) && (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">"))) {
            ((SeekBar) view).setOnSeekBarChangeListener(new C1419f());
        }
        m4033l(view, str);
    }

    /* renamed from: l */
    private void m4033l(View view, String str) {
        String c;
        if ((view instanceof TabLayout) && (str.contains("<eventItme type=\"ontabselected\">") || str.contains("<eventItme type=\"ontabunselected\">") || str.contains("<eventItme type=\"ontabreselected\">"))) {
            ((TabLayout) view).addOnTabSelectedListener(new C1420g(C0860r.m2044c(str, "<eventItme type=\"ontabselected\">", "</eventItme>"), view, C0860r.m2044c(str, "<eventItme type=\"ontabunselected\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"ontabreselected\">", "</eventItme>")));
        }
        if (view instanceof RecyclerView) {
            if (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscrolled\">")) {
                ((RecyclerView) view).addOnScrollListener(new C1421h(C0860r.m2044c(str, "<eventItme type=\"onscrollstatechanged\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"onscrolled\">", "</eventItme>")));
            }
            if (str.contains("<eventItme type=\"clickitem\">") && (c = C0860r.m2044c(str, "<eventItme type=\"clickitem\">", "</eventItme>")) != null) {
                ((RecyclerView) view).addOnItemTouchListener(new C1423j(this, new GestureDetector(this, new C1422i(view, c))));
            }
        }
        if ((view instanceof VerticalViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ((VerticalViewPager) view).setOnPageChangeListener(new C1425l(C0860r.m2044c(str, "<eventItme type=\"onpageselected\">", "</eventItme>"), view, C0860r.m2044c(str, "<eventItme type=\"onpagescrolled\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"onpagescrollstatechanged\">", "</eventItme>")));
        }
        if ((view instanceof SwipeRefreshLayout) && str.contains("<eventItme type=\"onrefresh\">")) {
            ((SwipeRefreshLayout) view).setOnRefreshListener(new C1426m(C0860r.m2044c(str, "<eventItme type=\"onrefresh\">", "</eventItme>"), view));
        }
        if ((view instanceof CompoundButton) && str.contains("<eventItme type=\"oncheckedchanged\">")) {
            ((CompoundButton) view).setOnCheckedChangeListener(new C1427n(C0860r.m2044c(str, "<eventItme type=\"oncheckedchanged\">", "</eventItme>"), view));
        }
        if ((view instanceof AppBarLayout) && str.contains("<eventItme type=\"onoffsetchanged\">")) {
            ((AppBarLayout) view).addOnOffsetChangedListener(new C1428o(C0860r.m2044c(str, "<eventItme type=\"onoffsetchanged\">", "</eventItme>")));
        }
    }

    /* renamed from: m */
    private static Class[] m4034m() {
        if (f3389t == null) {
            f3389t = new Class[]{Aid_YuCodeX.class};
        }
        return f3389t;
    }

    /* renamed from: n */
    private void m4035n(String str) {
        if (f3388sh) {
            String str2 = this.f3408r;
            if (str2 != null) {
                if (str2.contains("<eventItme type=\"" + str + "\">")) {
                    C0864v vVar = new C0864v(this);
                    String str3 = this.f3408r;
                    vVar.mo8985f(C0860r.m2044c(str3, "<eventItme type=\"" + str + "\">", "</eventItme>"));
                    return;
                }
                return;
            }
            return;
        }
        String str4 = this.f3408r;
        if (str4 != null) {
            if (str4.contains("<eventItme type=\"" + str + "\">")) {
                Object a = m4021a(this.f3403m, null, null);
                Class<?> cls = a.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str5 = this.f3408r;
                sb.append(C0860r.m2044c(str5, "<eventItme type=\"" + str + "\">", "</eventItme>"));
                C0835f.m1856m(a, cls, sb.toString(), m4034m(), new Object[]{new Aid_YuCodeX(this)});
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private boolean m4036o(C0864v vVar, String str, String str2) {
        String c = C0860r.m2044c(str2, "<eventItme type=\"" + str + "\">", "</eventItme>");
        boolean z = false;
        if (c == null) {
            return false;
        }
        String trim = c.trim();
        if (trim.startsWith("[true]")) {
            z = true;
            trim = trim.substring(6);
        }
        vVar.mo8985f(trim);
        return z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: p */
    private boolean m4037p(Aid_YuCodeX aid_YuCodeX, String str, String str2) {
        String c = C0860r.m2044c(str2, "<eventItme type=\"" + str + "\">", "</eventItme>");
        boolean z = false;
        if (c == null) {
            return false;
        }
        String trim = c.trim();
        if (trim.startsWith("[true]")) {
            z = true;
            trim = trim.substring(6);
        }
        goUIEventset(str + trim, aid_YuCodeX);
        return z;
    }

    @TargetApi(11)
    /* renamed from: q */
    private void m4038q(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: r */
    private void m4039r(WebView webView, String str) {
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
        if (str.contains("<eventItme type=\"ondownloadstart\">")) {
            new C1325l(webView, this);
        } else {
            webView.setDownloadListener(new C1424k(this));
        }
        new C1443b().mo12150k(webView, str, this);
        m4038q(webView);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: s */
    private void m4040s(WebView webView, String str, String str2) {
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
        if (str.contains("<eventItme type=\"ondownloadstart\">")) {
            new C1325l(webView, this, str2);
        } else {
            webView.setDownloadListener(new C1429p(this));
        }
        new C1443b().mo12151l(webView, str, str2, this);
        m4038q(webView);
    }

    /* renamed from: g */
    public void mo12104g() {
        SensorEventListener sensorEventListener;
        Sensor sensor;
        boolean z = f3388sh;
        m4035n("loading");
        if (z) {
            String str = this.f3408r;
            if (str != null && str.contains("<eventItme type=\"sensor\">")) {
                this.f3397g = new C0864v(this);
                SensorManager sensorManager = (SensorManager) getSystemService("sensor");
                this.f3405o = sensorManager;
                sensor = sensorManager.getDefaultSensor(1);
                this.f3406p = sensor;
                sensorEventListener = new C1430q();
            } else {
                return;
            }
        } else {
            String str2 = this.f3408r;
            if (str2 != null && str2.contains("<eventItme type=\"sensor\">")) {
                this.f3400j = new Aid_YuCodeX(this);
                SensorManager sensorManager2 = (SensorManager) getSystemService("sensor");
                this.f3405o = sensorManager2;
                sensor = sensorManager2.getDefaultSensor(1);
                this.f3406p = sensor;
                sensorEventListener = new C1431r();
            } else {
                return;
            }
        }
        this.f3404n = sensorEventListener;
        this.f3405o.registerListener(sensorEventListener, sensor, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12105g(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.run.mian.mo12105g(java.lang.String):void");
    }

    public void goUIEventset(String str, Aid_YuCodeX aid_YuCodeX) {
        Object a = m4021a(this.f3403m, null, null);
        C0835f.m1856m(a, a.getClass(), str, m4034m(), new Object[]{aid_YuCodeX});
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p009v4.app.FragmentActivity
    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        String c;
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
        } else {
            String str = this.f3408r;
            if (str != null && (c = C0860r.m2044c(str, "<eventItme type=\"onactivityresult\">", "</eventItme>")) != null) {
                if (f3388sh) {
                    C0864v vVar = new C0864v(this);
                    vVar.mo8981T("st_sC", Integer.valueOf(i));
                    vVar.mo8981T("st_lC", Integer.valueOf(i2));
                    vVar.mo8981T("st_iT", intent);
                    vVar.mo8985f(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this);
                aid_YuCodeX.dim("st_sC", Integer.valueOf(i));
                aid_YuCodeX.dim("st_lC", Integer.valueOf(i2));
                aid_YuCodeX.dim("st_iT", intent);
                goUIEventset("onactivityresult" + c, aid_YuCodeX);
            }
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        if (f3388sh) {
            this.f3395e.mo8985f(this.f3393c.get(Integer.valueOf(menuItem.getItemId())));
            return true;
        }
        goUIEventset("pressmenu" + this.f3393c.get(Integer.valueOf(menuItem.getItemId())), this.f3398h);
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
        C0864v.f1801k = this.f3392b;
        if (packageName == null) {
            upPackageName();
        }
        setContentView(2131361857);
        String lowerCase = getIntent().getExtras().getString("OpenFilexmlui").toLowerCase();
        this.f3402l = lowerCase;
        this.f3403m = lowerCase.substring(0, lowerCase.length() - 4);
        this.f3391a = (LinearLayout) findViewById(2131230939);
        C1294b.m3499h3(this, this.f3402l);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String c;
        String str = this.f3408r;
        if (str == null || (c = C0860r.m2044c(str, "<eventItme type=\"menu\">", "</eventItme>")) == null) {
            return true;
        }
        this.f3394d.clear();
        String[] split = ("m\n" + c).split("\ncase ", -1);
        for (int i = 1; i < split.length; i++) {
            String c2 = C0860r.m2044c(split[i], null, ":");
            if (c2.contains("|")) {
                boolean c0 = C1305g.m3576c0(menu, i, c2, this);
                if (!this.f3407q && c0) {
                    this.f3407q = true;
                }
            } else {
                menu.add(0, i, 0, c2);
            }
            this.f3394d.put(Integer.valueOf(i), C0860r.m2044c(split[i], ":", "\nbreak"));
        }
        String c3 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
        if (f3388sh) {
            C0864v vVar = new C0864v(this);
            this.f3396f = vVar;
            if (c3 != null) {
                vVar.mo8985f(c3);
            }
        } else {
            this.f3399i = new Aid_YuCodeX(this);
            if (c3 != null) {
                goUIEventset("menu" + c3, this.f3399i);
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        m4035n("destroy");
        SensorManager sensorManager = this.f3405o;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f3404n, this.f3406p);
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        String str = this.f3408r;
        if (str == null || !str.contains("<eventItme type=\"downkey\">")) {
            if (i != 4) {
                return false;
            }
            finish();
            return true;
        } else if (f3388sh) {
            C0864v vVar = new C0864v(this);
            vVar.mo8981T("st_kC", Integer.valueOf(i));
            vVar.mo8981T("st_eA", Integer.valueOf(keyEvent.getAction()));
            vVar.mo8981T("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
            return m4036o(vVar, "downkey", this.f3408r);
        } else {
            Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this);
            aid_YuCodeX.dim("st_kC", Integer.valueOf(i));
            aid_YuCodeX.dim("st_eA", Integer.valueOf(keyEvent.getAction()));
            aid_YuCodeX.dim("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
            return m4037p(aid_YuCodeX, "downkey", this.f3408r);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        String str = this.f3408r;
        if (str == null || !str.contains("<eventItme type=\"upkey\">")) {
            return false;
        }
        if (f3388sh) {
            C0864v vVar = new C0864v(this);
            vVar.mo8981T("st_kC", Integer.valueOf(i));
            vVar.mo8981T("st_eA", Integer.valueOf(keyEvent.getAction()));
            vVar.mo8981T("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
            return m4036o(vVar, "upkey", this.f3408r);
        }
        Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(this);
        aid_YuCodeX.dim("st_kC", Integer.valueOf(i));
        aid_YuCodeX.dim("st_eA", Integer.valueOf(keyEvent.getAction()));
        aid_YuCodeX.dim("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
        return m4037p(aid_YuCodeX, "upkey", this.f3408r);
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onMenuOpened(int i, Menu menu) {
        if (this.f3407q && menu != null && menu.getClass().getSimpleName().equalsIgnoreCase("MenuBuilder")) {
            try {
                Method declaredMethod = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(menu, Boolean.TRUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.onMenuOpened(i, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (f3388sh) {
            this.f3396f.mo8985f(this.f3394d.get(Integer.valueOf(menuItem.getItemId())));
            return true;
        }
        goUIEventset("menu" + this.f3394d.get(Integer.valueOf(menuItem.getItemId())), this.f3399i);
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
        C0864v.f1801k = this.f3392b;
        m4035n("restart");
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
        m4035n("stop");
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.f3409s) {
            this.f3409s = true;
            m4035n("loadingComplete");
        }
    }

    public void upPackageName() {
        packageName = "null";
        try {
            String obj = Class.forName(String.format("%s.IConfig", getPackageName())).getMethod("packageName", new Class[0]).invoke(null, new Object[0]).toString();
            packageName = obj;
            if (obj != null) {
                f3388sh = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
