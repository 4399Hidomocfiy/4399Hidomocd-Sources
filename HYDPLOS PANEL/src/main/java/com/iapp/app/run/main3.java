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
import bsh.EvalError;
import com.iapp.app.Aid_javaCode;
import com.iapp.app.C1293a;
import com.iapp.app.C1294b;
import com.iapp.app.C1305g;
import com.iapp.app.C1309h;
import com.iapp.app.C1325l;
import com.iapp.app.C1334m;
import com.iapp.app.C1340n;
import com.iapp.app.C1343o;
import com.iapp.app.C1355r;
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
public class main3 extends AppCompatActivity {

    /* renamed from: a */
    private LinearLayout f3321a;

    /* renamed from: b */
    private HashMap<String, Object> f3322b = new HashMap<>();

    /* renamed from: c */
    private String[] f3323c = null;

    /* renamed from: d */
    private C0916b f3324d = new C0916b(this);

    /* renamed from: e */
    private String f3325e = null;

    /* renamed from: f */
    private SensorEventListener f3326f = null;

    /* renamed from: g */
    private SensorManager f3327g = null;

    /* renamed from: h */
    private Sensor f3328h = null;

    /* renamed from: i */
    private Aid_javaCode f3329i;

    /* renamed from: j */
    private String f3330j = "";
    public C1309h javaj;

    /* renamed from: k */
    private boolean f3331k = false;

    /* renamed from: l */
    private boolean f3332l = false;

    /* renamed from: m */
    private boolean f3333m = false;

    /* renamed from: n */
    private boolean f3334n = false;

    /* renamed from: o */
    private boolean f3335o = false;

    /* renamed from: p */
    private boolean f3336p = false;

    /* renamed from: q */
    private boolean f3337q = false;

    /* renamed from: r */
    public String f3338r = null;

    /* renamed from: s */
    private boolean f3339s = false;

    /* renamed from: t */
    private boolean f3340t = false;

    /* renamed from: u */
    private boolean f3341u = false;

    /* renamed from: v */
    private boolean f3342v = false;

    /* renamed from: w */
    private boolean f3343w = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$a */
    public class C1393a implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3344a;

        /* renamed from: b */
        final /* synthetic */ boolean f3345b;

        C1393a(boolean z, boolean z2) {
            this.f3344a = z;
            this.f3345b = z2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.f3345b) {
                int id = absListView.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onscroll" + id, Integer.valueOf(id), absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (this.f3344a) {
                int id = absListView.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onscrollstatechanged" + id, Integer.valueOf(id), absListView, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$b */
    public class C1394b implements AdapterView.OnItemClickListener {
        C1394b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            C1309h hVar = main3.this.javaj;
            hVar.mo11942b("clickitem" + id, Integer.valueOf(id), adapterView, Integer.valueOf(i), Long.valueOf(j), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$c */
    public class C1395c implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3348a;

        /* renamed from: b */
        final /* synthetic */ boolean f3349b;

        C1395c(boolean z, boolean z2) {
            this.f3348a = z;
            this.f3349b = z2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f3348a) {
                int id = adapterView.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onitemselected" + id, Integer.valueOf(id), adapterView, view, Integer.valueOf(i), Long.valueOf(j));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (this.f3349b) {
                int id = adapterView.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onnothingselected" + id, Integer.valueOf(id), adapterView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$d */
    public class C1396d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3351a;

        /* renamed from: b */
        final /* synthetic */ boolean f3352b;

        /* renamed from: c */
        final /* synthetic */ boolean f3353c;

        C1396d(boolean z, boolean z2, boolean z3) {
            this.f3351a = z;
            this.f3352b = z2;
            this.f3353c = z3;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.f3353c) {
                int id = seekBar.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onprogresschanged2" + id, Integer.valueOf(id), seekBar, Integer.valueOf(i), Boolean.valueOf(z));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (this.f3352b) {
                int id = seekBar.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onstarttrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f3351a) {
                int id = seekBar.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onstoptrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$e */
    public class C1397e implements TabLayout.AbstractC1278d {

        /* renamed from: a */
        final /* synthetic */ boolean f3355a;

        /* renamed from: b */
        final /* synthetic */ View f3356b;

        /* renamed from: c */
        final /* synthetic */ boolean f3357c;

        /* renamed from: d */
        final /* synthetic */ boolean f3358d;

        C1397e(boolean z, View view, boolean z2, boolean z3) {
            this.f3355a = z;
            this.f3356b = view;
            this.f3357c = z2;
            this.f3358d = z3;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(TabLayout.C1283g gVar) {
            if (this.f3358d) {
                int id = this.f3356b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("ontabreselected" + id, Integer.valueOf(id), (TabLayout) this.f3356b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(TabLayout.C1283g gVar) {
            if (this.f3357c) {
                int id = this.f3356b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("ontabunselected" + id, Integer.valueOf(id), (TabLayout) this.f3356b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(TabLayout.C1283g gVar) {
            if (this.f3355a) {
                int id = this.f3356b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("ontabselected" + id, Integer.valueOf(id), (TabLayout) this.f3356b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$f */
    public class C1398f extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3360a;

        /* renamed from: b */
        final /* synthetic */ boolean f3361b;

        C1398f(boolean z, boolean z2) {
            this.f3360a = z;
            this.f3361b = z2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f3360a) {
                int id = recyclerView.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onscrollstatechanged" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(i));
            }
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.f3361b) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int itemCount = layoutManager.getItemCount();
                int i3 = -1;
                if (layoutManager instanceof LinearLayoutManager) {
                    i3 = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    if (staggeredGridLayoutManager.getSpanCount() > 0) {
                        i3 = staggeredGridLayoutManager.findFirstVisibleItemPositions(null)[0];
                    }
                }
                int id = recyclerView.getId();
                boolean z = i2 > 0 && childCount + i3 >= itemCount;
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onscrolled" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(i3), Integer.valueOf(childCount), Integer.valueOf(itemCount), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$g */
    public class C1399g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3363a;

        /* renamed from: b */
        final /* synthetic */ View f3364b;

        C1399g(boolean z, View view) {
            this.f3363a = z;
            this.f3364b = view;
        }

        public void onLongPress(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (this.f3363a && (findChildViewUnder = (recyclerView = (RecyclerView) this.f3364b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) != null) {
                int id = recyclerView.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (!this.f3363a || (findChildViewUnder = (recyclerView = (RecyclerView) this.f3364b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                return false;
            }
            int id = recyclerView.getId();
            C1309h hVar = main3.this.javaj;
            hVar.mo11942b("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$h */
    public class C1400h implements RecyclerView.OnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f3366a;

        C1400h(main3 main3, GestureDetector gestureDetector) {
            this.f3366a = gestureDetector;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f3366a.onTouchEvent(motionEvent);
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
    /* renamed from: com.iapp.app.run.main3$i */
    public class C1401i implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3367a;

        /* renamed from: b */
        final /* synthetic */ View f3368b;

        /* renamed from: c */
        final /* synthetic */ boolean f3369c;

        /* renamed from: d */
        final /* synthetic */ boolean f3370d;

        C1401i(boolean z, View view, boolean z2, boolean z3) {
            this.f3367a = z;
            this.f3368b = view;
            this.f3369c = z2;
            this.f3370d = z3;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f3370d) {
                int id = this.f3368b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onpagescrollstatechanged" + id, Integer.valueOf(id), (VerticalViewPager) this.f3368b, Integer.valueOf(i));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f3369c) {
                int id = this.f3368b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onpagescrolled" + id, Integer.valueOf(id), (VerticalViewPager) this.f3368b, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f3367a) {
                int id = this.f3368b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onpageselected" + id, Integer.valueOf(id), (VerticalViewPager) this.f3368b, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$j */
    public class C1402j implements SwipeRefreshLayout.OnRefreshListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3372a;

        /* renamed from: b */
        final /* synthetic */ View f3373b;

        C1402j(boolean z, View view) {
            this.f3372a = z;
            this.f3373b = view;
        }

        @Override // android.support.p009v4.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            if (this.f3372a) {
                int id = this.f3373b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onrefresh" + id, Integer.valueOf(id), (SwipeRefreshLayout) this.f3373b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$k */
    public class C1403k implements AbstractC1442a {
        C1403k(main3 main3) {
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
    /* renamed from: com.iapp.app.run.main3$l */
    public class C1404l implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3375a;

        /* renamed from: b */
        final /* synthetic */ View f3376b;

        C1404l(boolean z, View view) {
            this.f3375a = z;
            this.f3376b = view;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f3375a) {
                int id = this.f3376b.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("oncheckedchanged" + id, Integer.valueOf(id), compoundButton, Boolean.valueOf(z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$m */
    public class C1405m implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3378a;

        C1405m(boolean z) {
            this.f3378a = z;
        }

        @Override // android.support.design.widget.AppBarLayout.OnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (this.f3378a) {
                int id = appBarLayout.getId();
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onoffsetchanged" + id, Integer.valueOf(id), appBarLayout, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.iapp.app.run.main3$n */
    class C1406n implements SensorEventListener {
        C1406n() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            main3.this.javaj.mo11942b("sensor", Float.valueOf(sensorEvent.values[0]), Float.valueOf(sensorEvent.values[1]), Float.valueOf(sensorEvent.values[2]));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$o */
    public class View$OnClickListenerC1407o implements View.OnClickListener {
        View$OnClickListenerC1407o() {
        }

        public void onClick(View view) {
            int id = view.getId();
            C1309h hVar = main3.this.javaj;
            hVar.mo11942b("clicki" + id, Integer.valueOf(id), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$p */
    public class View$OnTouchListenerC1408p implements View.OnTouchListener {
        View$OnTouchListenerC1408p() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            C1309h hVar = main3.this.javaj;
            return hVar.mo11943c("touchmonitor" + id, Integer.valueOf(id), view, Integer.valueOf(motionEvent.getAction()), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$q */
    public class View$OnLongClickListenerC1409q implements View.OnLongClickListener {
        View$OnLongClickListenerC1409q() {
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            C1309h hVar = main3.this.javaj;
            return hVar.mo11943c("press" + id, Integer.valueOf(id), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$r */
    public class View$OnKeyListenerC1410r implements View.OnKeyListener {
        View$OnKeyListenerC1410r() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            C1309h hVar = main3.this.javaj;
            return hVar.mo11943c("keyboard" + id, Integer.valueOf(id), view, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$s */
    public class View$OnCreateContextMenuListenerC1411s implements View.OnCreateContextMenuListener {
        View$OnCreateContextMenuListenerC1411s() {
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
                C1309h hVar = main3.this.javaj;
                hVar.mo11942b("onCreateContextMenu" + id + "x0", Integer.valueOf(id), view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$t */
    public class C1412t implements TextView.OnEditorActionListener {
        C1412t() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            StringBuilder sb;
            int id = textView.getId();
            C1309h hVar = main3.this.javaj;
            if (keyEvent != null) {
                sb.append("editormonitor");
                sb.append(id);
                return hVar.mo11943c(sb.toString(), Integer.valueOf(id), textView, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(keyEvent.getKeyCode()), keyEvent);
            }
            sb = new StringBuilder();
            sb.append("editormonitor");
            sb.append(id);
            return hVar.mo11943c(sb.toString(), Integer.valueOf(id), textView, Integer.valueOf(i), null, null, null, keyEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main3$u */
    public class View$OnFocusChangeListenerC1413u implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1413u() {
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            C1309h hVar = main3.this.javaj;
            hVar.mo11942b("focuschange" + id, Integer.valueOf(id), view, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private void m4007a(View view, int i, String str) {
        if (addViewEventItme(str, i, "clicki", "int st_vId,android.view.View st_vW")) {
            view.setOnClickListener(new View$OnClickListenerC1407o());
        }
        if (addViewEventItme(str, i, "touchmonitor", "int st_vId,android.view.View st_vW,int st_eA,float st_eX,float st_eY,float st_rX,float st_rY")) {
            view.setOnTouchListener(new View$OnTouchListenerC1408p());
        }
        if (addViewEventItme(str, i, "press", "int st_vId,android.view.View st_vW")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1409q());
        }
        if (addViewEventItme(str, i, "keyboard", "int st_vId,android.view.View st_vW,int st_kC,int st_eA,int st_eR,android.view.KeyEvent st_eT")) {
            view.setOnKeyListener(new View$OnKeyListenerC1410r());
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            String c = C0860r.m2044c(str, "<eventItme type=\"pressmenu\">", "</eventItme>");
            String[] split = c.split("\ncase ");
            for (int i2 = 1; i2 < split.length; i2++) {
                this.f3330j += "private void onCreateContextMenu" + i + "x" + i2 + "(){\n" + C0860r.m2044c(split[i2], ":", "\nbreak") + "\n}\n";
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            if (c2 != null) {
                this.f3330j += "private void onCreateContextMenu" + i + "x0(int st_vId, android.view.View st_vW){\n" + c2 + "\n}\n";
            }
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1411s());
        }
        if (view instanceof TextView) {
            if (addViewEventItme(str, i, "editormonitor", "int st_vId,android.widget.TextView st_vW,st_aI,st_eA,st_eR,st_eK,st_eT")) {
                ((TextView) view).setOnEditorActionListener(new C1412t());
            }
            boolean addViewEventItme = addViewEventItme(str, i, "ontextchanged", "int st_vId,android.widget.TextView st_vW,String st_sS,st_sT,int st_bE,int st_cT");
            boolean addViewEventItme2 = addViewEventItme(str, i, "beforetextchanged", "int st_vId,android.view.TextView st_vW,String st_sS,int st_sT,int st_cT,int st_aR");
            boolean addViewEventItme3 = addViewEventItme(str, i, "aftertextchanged", "int st_vId,android.view.TextView st_vW,String st_sS");
            if (addViewEventItme || addViewEventItme2 || addViewEventItme3) {
                new C1355r((TextView) view, this.javaj, addViewEventItme, addViewEventItme2, addViewEventItme3);
            }
        }
        if (view instanceof WebView) {
            m4014i((WebView) view, str);
        }
        if (addViewEventItme(str, i, "focuschange", "int st_vId,android.view.View st_vW,boolean st_hF")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1413u());
        }
        if (view instanceof AbsListView) {
            boolean addViewEventItme4 = addViewEventItme(str, i, "onscrollstatechanged", "int st_vId,android.widget.AbsListView st_vW,int st_sE");
            boolean addViewEventItme5 = addViewEventItme(str, i, "onscroll", "int st_vId,android.widget.AbsListView st_vW,int st_fM,int st_vT,int st_bT");
            if (addViewEventItme4 || addViewEventItme5) {
                ((AbsListView) view).setOnScrollListener(new C1393a(addViewEventItme4, addViewEventItme5));
            }
        }
        if (view instanceof AdapterView) {
            if (addViewEventItme(str, i, "clickitem", "int st_vId,android.widget.AdapterView st_vW,int st_pN,long st_iD,android.view.View st_vW2")) {
                ((AdapterView) view).setOnItemClickListener(new C1394b());
            }
            boolean addViewEventItme6 = addViewEventItme(str, i, "onitemselected", "int st_vId,android.widget.AdapterView st_vW,android.view.View st_vW2,int st_pN,long st_iD");
            boolean addViewEventItme7 = addViewEventItme(str, i, "onnothingselected", "int st_vId,android.widget.AdapterView st_vW");
            if (addViewEventItme6 || addViewEventItme7) {
                ((AdapterView) view).setOnItemSelectedListener(new C1395c(addViewEventItme6, addViewEventItme7));
            }
        }
        if (view instanceof ViewPager) {
            boolean addViewEventItme8 = addViewEventItme(str, i, "onpageselected", "int st_vId,android.support.v4.view.ViewPager st_vW,int st_pN");
            boolean addViewEventItme9 = addViewEventItme(str, i, "onpagescrolled", "int st_vId,android.support.v4.view.ViewPager st_vW,int st_pN,float st_pT,int st_pS");
            boolean addViewEventItme10 = addViewEventItme(str, i, "onpagescrollstatechanged", "int st_vId,android.support.v4.view.ViewPager st_vW,int st_sE");
            if (addViewEventItme8 || addViewEventItme9 || addViewEventItme10) {
                new C1343o((ViewPager) view, this.javaj, addViewEventItme8, addViewEventItme9, addViewEventItme10);
            }
        }
        if (view instanceof DrawerLayout) {
            boolean addViewEventItme11 = addViewEventItme(str, i, "ondrawerclosed", "int st_vId,android.support.v4.widget.DrawerLayout st_vW,android.view.View st_dW");
            boolean addViewEventItme12 = addViewEventItme(str, i, "ondraweropened", "int st_vId,android.support.v4.widget.DrawerLayout st_vW,android.view.View st_dW");
            boolean addViewEventItme13 = addViewEventItme(str, i, "onoptionsitemselected", "int st_vId,android.support.v4.widget.DrawerLayout st_vW,android.view.MenuItem st_iM");
            if (addViewEventItme11 || addViewEventItme12 || addViewEventItme13) {
                new C1334m((DrawerLayout) view, this.javaj, addViewEventItme11, addViewEventItme12, addViewEventItme13);
            }
        }
        if ((view instanceof SeekBar) && (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">"))) {
            boolean addViewEventItme14 = addViewEventItme(str, i, "onstarttrackingtouch", "int st_vId,android.widget.SeekBar st_vW");
            boolean addViewEventItme15 = addViewEventItme(str, i, "onstoptrackingtouch", "int st_vId,android.widget.SeekBar st_vW");
            boolean addViewEventItme16 = addViewEventItme(str, i, "onprogresschanged2", "int st_vId,android.widget.SeekBar st_vW,int st_nS,boolean st_fR");
            if (addViewEventItme14 || addViewEventItme15 || addViewEventItme16) {
                ((SeekBar) view).setOnSeekBarChangeListener(new C1396d(addViewEventItme15, addViewEventItme14, addViewEventItme16));
            }
        }
        m4008b(view, str);
    }

    /* renamed from: b */
    private void m4008b(View view, String str) {
        if ((view instanceof TabLayout) && (str.contains("<eventItme type=\"ontabselected\">") || str.contains("<eventItme type=\"ontabunselected\">") || str.contains("<eventItme type=\"ontabreselected\">"))) {
            ((TabLayout) view).addOnTabSelectedListener(new C1397e(addViewEventItme(str, view.getId(), "ontabselected", "int st_vId,com.iapp.app.TabLayout st_vW,int st_pN,String st_tT,com.iapp.app.TabLayout.Tab st_taB"), view, addViewEventItme(str, view.getId(), "ontabunselected", "int st_vId,com.iapp.app.TabLayout st_vW,int st_pN,String st_tT,com.iapp.app.TabLayout.Tab st_taB"), addViewEventItme(str, view.getId(), "ontabreselected", "int st_vId,com.iapp.app.TabLayout st_vW,int st_pN,String st_tT,com.iapp.app.TabLayout.Tab st_taB")));
        }
        if (view instanceof RecyclerView) {
            if (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscrolled\">")) {
                ((RecyclerView) view).addOnScrollListener(new C1398f(addViewEventItme(str, view.getId(), "onscrollstatechanged", "int st_vId,android.support.v7.widget.RecyclerView st_vW,int st_sE"), addViewEventItme(str, view.getId(), "onscrolled", "int st_vId,android.support.v7.widget.RecyclerView st_vW,int st_fM,int st_vT,int st_bT,int st_dX,int st_dY,boolean st_isB")));
            }
            if (str.contains("<eventItme type=\"clickitem\">")) {
                ((RecyclerView) view).addOnItemTouchListener(new C1400h(this, new GestureDetector(this, new C1399g(addViewEventItme(str, view.getId(), "clickitem", "int st_vId,android.support.v7.widget.RecyclerView st_vW,int st_pN,android.view.View st_vW2"), view))));
            }
        }
        if ((view instanceof VerticalViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ((VerticalViewPager) view).setOnPageChangeListener(new C1401i(addViewEventItme(str, view.getId(), "onpageselected", "int st_vId,fr.castorflex.android.verticalviewpager.VerticalViewPager st_vW,int st_pN"), view, addViewEventItme(str, view.getId(), "onpagescrolled", "int st_vId,fr.castorflex.android.verticalviewpager.VerticalViewPager st_vW,int st_pN,float st_pT,int st_pS"), addViewEventItme(str, view.getId(), "onpagescrollstatechanged", "int st_vId,fr.castorflex.android.verticalviewpager.VerticalViewPager st_vW,int st_sE")));
        }
        if ((view instanceof SwipeRefreshLayout) && str.contains("<eventItme type=\"onrefresh\">")) {
            ((SwipeRefreshLayout) view).setOnRefreshListener(new C1402j(addViewEventItme(str, view.getId(), "onrefresh", "int st_vId,android.support.v4.widget.SwipeRefreshLayout st_vW"), view));
        }
        if ((view instanceof CompoundButton) && str.contains("<eventItme type=\"oncheckedchanged\">")) {
            ((CompoundButton) view).setOnCheckedChangeListener(new C1404l(addViewEventItme(str, view.getId(), "oncheckedchanged", "int st_vId,android.widget.CompoundButton st_vW,boolean st_iC"), view));
        }
        if ((view instanceof AppBarLayout) && str.contains("<eventItme type=\"onoffsetchanged\">")) {
            ((AppBarLayout) view).addOnOffsetChangedListener(new C1405m(addViewEventItme(str, view.getId(), "onoffsetchanged", "st_vId,st_vW,st_vO")));
        }
    }

    /* renamed from: c */
    private boolean m4009c(String str, String str2) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3330j += "private void " + str2 + "(){\n" + c + "\n}\n";
        return true;
    }

    /* renamed from: d */
    private boolean m4010d(String str, String str2, String str3) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3330j += "private void " + str2 + "(" + str3 + "){\n" + c + "\n}\n";
        return true;
    }

    /* renamed from: e */
    private void m4011e(String str) {
        if (this.f3331k) {
            str = str + "\nloading();\n";
        }
        this.javaj.mo11944d(str);
    }

    /* renamed from: f */
    private String m4012f(String str, String str2) {
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
    /* renamed from: h */
    private void m4013h(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: i */
    private void m4014i(WebView webView, String str) {
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
        if (addViewEventItme(str, webView.getId(), "ondownloadstart", "int st_vId,android.webkit.WebView st_vW,String st_url,String st_uT,String st_cN,String st_mE,long st_cH")) {
            new C1325l(webView, this.javaj);
        } else {
            webView.setDownloadListener(new C1403k(this));
        }
        new C1443b().mo12149j(webView, str, this);
        m4013h(webView);
    }

    /* renamed from: j */
    private void m4015j() {
        String c;
        String str = this.f3338r;
        if (str != null) {
            String f = m4012f(str, "loading");
            if (f != null) {
                this.f3331k = true;
                this.f3330j += "private void loading(){\n" + f + "\n}\n";
            }
            this.f3332l = m4009c(this.f3338r, "loadingComplete");
            this.f3334n = m4010d(this.f3338r, "downkey", "int st_kC,int st_eA,int st_eR,android.view.KeyEvent st_eT");
            this.f3335o = m4010d(this.f3338r, "upkey", "int st_kC,int st_eA,int st_eR,android.view.KeyEvent st_eT");
            this.f3336p = m4009c(this.f3338r, "destroy");
            this.f3337q = m4009c(this.f3338r, "stop");
            this.f3339s = m4009c(this.f3338r, "restart");
            this.f3340t = m4010d(this.f3338r, "onactivityresult", "int st_sC,int st_lC,android.content.Intent st_iT");
            this.f3341u = m4010d(this.f3338r, "sensor", "float st_x,float st_y,float st_z");
            if (this.f3338r.contains("<eventItme type=\"menu\">") && (c = C0860r.m2044c(this.f3338r, "<eventItme type=\"menu\">", "</eventItme>")) != null) {
                String[] split = ("m\n" + c).split("\ncase ", -1);
                this.f3323c = new String[split.length];
                for (int i = 1; i < split.length; i++) {
                    this.f3323c[i] = C0860r.m2044c(split[i], null, ":");
                    this.f3330j += "private void CreateOptionsMenu" + i + "(){\n" + C0860r.m2044c(split[i], ":", "\nbreak") + "\n}\n";
                }
                String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
                if (c2 != null) {
                    this.f3333m = true;
                    this.f3330j += "private void onCreateOptionsMenuloading(){\n" + c2 + "\n}\n";
                }
            }
        }
    }

    public boolean addViewEventItme(String str, int i, String str2, String str3) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3330j += "private void " + str2 + i + "(" + str3 + "){\n" + c + "\n}\n";
        return true;
    }

    /* renamed from: g */
    public void mo12075g() {
        this.javaj = new C1309h(this);
        this.f3329i = new Aid_javaCode(this, this.javaj);
        try {
            this.javaj.set("activity", this);
            this.javaj.set("i", this.f3329i);
        } catch (EvalError e) {
            e.printStackTrace();
        }
        m4015j();
        if (this.f3341u) {
            SensorManager sensorManager = (SensorManager) getSystemService("sensor");
            this.f3327g = sensorManager;
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.f3328h = defaultSensor;
            C1406n nVar = new C1406n();
            this.f3326f = nVar;
            this.f3327g.registerListener(nVar, defaultSensor, 2);
        }
        m4011e(this.f3330j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12076g(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.run.main3.mo12076g(java.lang.String):void");
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
        } else if (this.f3340t) {
            this.javaj.mo11942b("onactivityresult", Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C1309h hVar = this.javaj;
        hVar.mo11941a("onCreateContextMenu" + menuItem.getGroupId() + "x" + menuItem.getItemId());
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
        C0864v.f1801k = this.f3322b;
        setContentView(2131361857);
        this.f3325e = getIntent().getExtras().getString("OpenFilexmlui");
        this.f3321a = (LinearLayout) findViewById(2131230939);
        C1294b.m3499h3(this, this.f3325e.toLowerCase());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String[] strArr = this.f3323c;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                if (this.f3323c[i].contains("|")) {
                    boolean c0 = C1305g.m3576c0(menu, i, this.f3323c[i], this);
                    if (!this.f3342v && c0) {
                        this.f3342v = true;
                    }
                } else {
                    menu.add(0, i, 0, this.f3323c[i]);
                }
            }
        }
        if (this.f3333m) {
            this.javaj.mo11941a("onCreateOptionsMenuloading");
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (this.f3336p) {
            this.javaj.mo11941a("destroy");
        }
        SensorManager sensorManager = this.f3327g;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f3326f, this.f3328h);
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f3334n) {
            return this.javaj.mo11943c("downkey", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
        } else if (i != 4) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f3335o) {
            return false;
        }
        return this.javaj.mo11943c("upkey", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onMenuOpened(int i, Menu menu) {
        if (this.f3342v && menu != null && menu.getClass().getSimpleName().equalsIgnoreCase("MenuBuilder")) {
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
        C1309h hVar = this.javaj;
        hVar.mo11941a("CreateOptionsMenu" + menuItem.getItemId());
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
        C0864v.f1801k = this.f3322b;
        if (this.f3339s) {
            this.javaj.mo11941a("restart");
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
        if (this.f3337q) {
            this.javaj.mo11941a("stop");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.f3343w) {
            this.f3343w = true;
            if (this.f3332l) {
                this.javaj.mo11941a("loadingComplete");
            }
        }
    }
}
