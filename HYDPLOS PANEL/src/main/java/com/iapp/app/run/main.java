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
import com.iapp.app.Aid_luaCode;
import com.iapp.app.C1293a;
import com.iapp.app.C1294b;
import com.iapp.app.C1298d;
import com.iapp.app.C1305g;
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
import org.keplerproject.luajava.LuaException;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;
import p013b.p048c.p049a.C0916b;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;

@SuppressLint({"UseSparseArrays"})
public class main extends AppCompatActivity {

    /* renamed from: a */
    private LinearLayout f3212a;

    /* renamed from: b */
    private HashMap<String, Object> f3213b = new HashMap<>();

    /* renamed from: c */
    private String[] f3214c = null;

    /* renamed from: d */
    private C0916b f3215d = new C0916b(this);

    /* renamed from: e */
    private String f3216e = null;

    /* renamed from: f */
    private SensorEventListener f3217f = null;

    /* renamed from: g */
    private SensorManager f3218g = null;

    /* renamed from: h */
    private Sensor f3219h = null;

    /* renamed from: i */
    private Aid_luaCode f3220i;

    /* renamed from: j */
    private String f3221j = "require 'import'\n";

    /* renamed from: k */
    private boolean f3222k = false;

    /* renamed from: l */
    private boolean f3223l = false;
    public C1298d luaj;

    /* renamed from: m */
    private boolean f3224m = false;

    /* renamed from: n */
    private boolean f3225n = false;

    /* renamed from: o */
    private boolean f3226o = false;

    /* renamed from: p */
    private boolean f3227p = false;

    /* renamed from: q */
    private boolean f3228q = false;

    /* renamed from: r */
    public String f3229r = null;

    /* renamed from: s */
    private boolean f3230s = false;

    /* renamed from: t */
    private boolean f3231t = false;

    /* renamed from: u */
    private boolean f3232u = false;

    /* renamed from: v */
    private boolean f3233v = false;

    /* renamed from: w */
    private boolean f3234w = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$a */
    public class C1359a implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3235a;

        /* renamed from: b */
        final /* synthetic */ boolean f3236b;

        C1359a(boolean z, boolean z2) {
            this.f3235a = z;
            this.f3236b = z2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.f3236b) {
                int id = absListView.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onscroll" + id, Integer.valueOf(id), absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (this.f3235a) {
                int id = absListView.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onscrollstatechanged" + id, Integer.valueOf(id), absListView, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$b */
    public class C1360b implements AdapterView.OnItemClickListener {
        C1360b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            C1298d dVar = main.this.luaj;
            dVar.mo11693d("clickitem" + id, Integer.valueOf(id), adapterView, Integer.valueOf(i), Long.valueOf(j), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$c */
    public class C1361c implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3239a;

        /* renamed from: b */
        final /* synthetic */ boolean f3240b;

        C1361c(boolean z, boolean z2) {
            this.f3239a = z;
            this.f3240b = z2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f3239a) {
                int id = adapterView.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onitemselected" + id, Integer.valueOf(id), adapterView, view, Integer.valueOf(i), Long.valueOf(j));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (this.f3240b) {
                int id = adapterView.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onnothingselected" + id, Integer.valueOf(id), adapterView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$d */
    public class C1362d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3242a;

        /* renamed from: b */
        final /* synthetic */ boolean f3243b;

        /* renamed from: c */
        final /* synthetic */ boolean f3244c;

        C1362d(boolean z, boolean z2, boolean z3) {
            this.f3242a = z;
            this.f3243b = z2;
            this.f3244c = z3;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.f3244c) {
                int id = seekBar.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onprogresschanged2" + id, Integer.valueOf(id), seekBar, Integer.valueOf(i), Boolean.valueOf(z));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (this.f3243b) {
                int id = seekBar.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onstarttrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f3242a) {
                int id = seekBar.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onstoptrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$e */
    public class C1363e implements TabLayout.AbstractC1278d {

        /* renamed from: a */
        final /* synthetic */ boolean f3246a;

        /* renamed from: b */
        final /* synthetic */ View f3247b;

        /* renamed from: c */
        final /* synthetic */ boolean f3248c;

        /* renamed from: d */
        final /* synthetic */ boolean f3249d;

        C1363e(boolean z, View view, boolean z2, boolean z3) {
            this.f3246a = z;
            this.f3247b = view;
            this.f3248c = z2;
            this.f3249d = z3;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(TabLayout.C1283g gVar) {
            if (this.f3249d) {
                int id = this.f3247b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("ontabreselected" + id, Integer.valueOf(id), this.f3247b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(TabLayout.C1283g gVar) {
            if (this.f3248c) {
                int id = this.f3247b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("ontabunselected" + id, Integer.valueOf(id), this.f3247b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(TabLayout.C1283g gVar) {
            if (this.f3246a) {
                int id = this.f3247b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("ontabselected" + id, Integer.valueOf(id), this.f3247b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$f */
    public class C1364f extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3251a;

        /* renamed from: b */
        final /* synthetic */ boolean f3252b;

        C1364f(boolean z, boolean z2) {
            this.f3251a = z;
            this.f3252b = z2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f3251a) {
                int id = recyclerView.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onscrollstatechanged" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(i));
            }
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.f3252b) {
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
                int id = recyclerView.getId();
                C1298d dVar = main.this.luaj;
                String str = "onscrolled" + id;
                Object[] objArr = new Object[8];
                objArr[0] = Integer.valueOf(id);
                objArr[1] = recyclerView;
                objArr[2] = Integer.valueOf(i3);
                objArr[3] = Integer.valueOf(childCount);
                objArr[4] = Integer.valueOf(itemCount);
                objArr[5] = Integer.valueOf(i);
                objArr[6] = Integer.valueOf(i2);
                if (i2 > 0 && childCount + i3 >= itemCount) {
                    z = true;
                }
                objArr[7] = Boolean.valueOf(z);
                dVar.mo11693d(str, objArr);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$g */
    public class C1365g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3254a;

        /* renamed from: b */
        final /* synthetic */ View f3255b;

        C1365g(boolean z, View view) {
            this.f3254a = z;
            this.f3255b = view;
        }

        public void onLongPress(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (this.f3254a && (findChildViewUnder = (recyclerView = (RecyclerView) this.f3255b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) != null) {
                int id = recyclerView.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (!this.f3254a || (findChildViewUnder = (recyclerView = (RecyclerView) this.f3255b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                return false;
            }
            int id = recyclerView.getId();
            C1298d dVar = main.this.luaj;
            dVar.mo11693d("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$h */
    public class C1366h implements RecyclerView.OnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f3257a;

        C1366h(main main, GestureDetector gestureDetector) {
            this.f3257a = gestureDetector;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f3257a.onTouchEvent(motionEvent);
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
    /* renamed from: com.iapp.app.run.main$i */
    public class C1367i implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3258a;

        /* renamed from: b */
        final /* synthetic */ View f3259b;

        /* renamed from: c */
        final /* synthetic */ boolean f3260c;

        /* renamed from: d */
        final /* synthetic */ boolean f3261d;

        C1367i(boolean z, View view, boolean z2, boolean z3) {
            this.f3258a = z;
            this.f3259b = view;
            this.f3260c = z2;
            this.f3261d = z3;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f3261d) {
                int id = this.f3259b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onpagescrollstatechanged" + id, Integer.valueOf(id), this.f3259b, Integer.valueOf(i));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f3260c) {
                int id = this.f3259b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onpagescrolled" + id, Integer.valueOf(id), this.f3259b, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f3258a) {
                int id = this.f3259b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onpageselected" + id, Integer.valueOf(id), this.f3259b, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$j */
    public class C1368j implements SwipeRefreshLayout.OnRefreshListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3263a;

        /* renamed from: b */
        final /* synthetic */ View f3264b;

        C1368j(boolean z, View view) {
            this.f3263a = z;
            this.f3264b = view;
        }

        @Override // android.support.p009v4.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            if (this.f3263a) {
                int id = this.f3264b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onrefresh" + id, Integer.valueOf(id), this.f3264b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$k */
    public class C1369k implements AbstractC1442a {
        C1369k(main main) {
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
    /* renamed from: com.iapp.app.run.main$l */
    public class C1370l implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3266a;

        /* renamed from: b */
        final /* synthetic */ View f3267b;

        C1370l(boolean z, View view) {
            this.f3266a = z;
            this.f3267b = view;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f3266a) {
                int id = this.f3267b.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("oncheckedchanged" + id, Integer.valueOf(id), this.f3267b, Boolean.valueOf(z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$m */
    public class C1371m implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f3269a;

        C1371m(boolean z) {
            this.f3269a = z;
        }

        @Override // android.support.design.widget.AppBarLayout.OnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (this.f3269a) {
                int id = appBarLayout.getId();
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onoffsetchanged" + id, Integer.valueOf(id), appBarLayout, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.iapp.app.run.main$n */
    class C1372n implements SensorEventListener {
        C1372n() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            main.this.luaj.mo11693d("sensor", Float.valueOf(sensorEvent.values[0]), Float.valueOf(sensorEvent.values[1]), Float.valueOf(sensorEvent.values[2]));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$o */
    public class View$OnClickListenerC1373o implements View.OnClickListener {
        View$OnClickListenerC1373o() {
        }

        public void onClick(View view) {
            int id = view.getId();
            C1298d dVar = main.this.luaj;
            dVar.mo11693d("clicki" + id, Integer.valueOf(id), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$p */
    public class View$OnTouchListenerC1374p implements View.OnTouchListener {
        View$OnTouchListenerC1374p() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            C1298d dVar = main.this.luaj;
            return dVar.mo11694e("touchmonitor" + id, Integer.valueOf(id), view, Integer.valueOf(motionEvent.getAction()), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$q */
    public class View$OnLongClickListenerC1375q implements View.OnLongClickListener {
        View$OnLongClickListenerC1375q() {
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            C1298d dVar = main.this.luaj;
            return dVar.mo11694e("press" + id, Integer.valueOf(id), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$r */
    public class View$OnKeyListenerC1376r implements View.OnKeyListener {
        View$OnKeyListenerC1376r() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            C1298d dVar = main.this.luaj;
            return dVar.mo11694e("keyboard" + id, Integer.valueOf(id), view, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$s */
    public class View$OnCreateContextMenuListenerC1377s implements View.OnCreateContextMenuListener {
        View$OnCreateContextMenuListenerC1377s() {
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
                C1298d dVar = main.this.luaj;
                dVar.mo11693d("onCreateContextMenu" + id + "x0", Integer.valueOf(id), view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$t */
    public class C1378t implements TextView.OnEditorActionListener {
        C1378t() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            StringBuilder sb;
            int id = textView.getId();
            C1298d dVar = main.this.luaj;
            if (keyEvent != null) {
                sb.append("editormonitor");
                sb.append(id);
                return dVar.mo11694e(sb.toString(), Integer.valueOf(id), textView, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(keyEvent.getKeyCode()), keyEvent);
            }
            sb = new StringBuilder();
            sb.append("editormonitor");
            sb.append(id);
            return dVar.mo11694e(sb.toString(), Integer.valueOf(id), textView, Integer.valueOf(i), null, null, null, keyEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.run.main$u */
    public class View$OnFocusChangeListenerC1379u implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1379u() {
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            C1298d dVar = main.this.luaj;
            dVar.mo11693d("focuschange" + id, Integer.valueOf(id), view, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private void m3976a(View view, int i, String str) {
        if (addViewEventItme(str, i, "clicki", "st_vId,st_vW")) {
            view.setOnClickListener(new View$OnClickListenerC1373o());
        }
        if (addViewEventItme(str, i, "touchmonitor", "st_vId,st_vW,st_eA,st_eX,st_eY,st_rX,st_rY")) {
            view.setOnTouchListener(new View$OnTouchListenerC1374p());
        }
        if (addViewEventItme(str, i, "press", "st_vId,st_vW")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1375q());
        }
        if (addViewEventItme(str, i, "keyboard", "st_vId,st_vW,st_kC,st_eA,st_eR,st_eT")) {
            view.setOnKeyListener(new View$OnKeyListenerC1376r());
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            String c = C0860r.m2044c(str, "<eventItme type=\"pressmenu\">", "</eventItme>");
            String[] split = c.split("\ncase ");
            for (int i2 = 1; i2 < split.length; i2++) {
                this.f3221j += "function onCreateContextMenu" + i + "x" + i2 + "()\n" + C0860r.m2044c(split[i2], ":", "\nbreak") + "\nend\n";
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            if (c2 != null) {
                this.f3221j += "function onCreateContextMenu" + i + "x0(st_vId,st_vW)\n" + c2 + "\nend\n";
            }
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1377s());
        }
        if (view instanceof TextView) {
            if (addViewEventItme(str, i, "editormonitor", "st_vId,st_vW,st_aI,st_eA,st_eR,st_eK,st_eT")) {
                ((TextView) view).setOnEditorActionListener(new C1378t());
            }
            boolean addViewEventItme = addViewEventItme(str, i, "ontextchanged", "st_vId,st_vW,st_sS,st_sT,st_bE,st_cT");
            boolean addViewEventItme2 = addViewEventItme(str, i, "beforetextchanged", "st_vId,st_vW,st_sS,st_sT,st_cT,st_aR");
            boolean addViewEventItme3 = addViewEventItme(str, i, "aftertextchanged", "st_vId,st_vW,st_sS");
            if (addViewEventItme || addViewEventItme2 || addViewEventItme3) {
                new C1355r((TextView) view, this.luaj, addViewEventItme, addViewEventItme2, addViewEventItme3);
            }
        }
        if (view instanceof WebView) {
            m3983i((WebView) view, str);
        }
        if (addViewEventItme(str, i, "focuschange", "st_vId,st_vW,st_hF")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1379u());
        }
        if (view instanceof AbsListView) {
            boolean addViewEventItme4 = addViewEventItme(str, i, "onscrollstatechanged", "st_vId,st_vW,st_sE");
            boolean addViewEventItme5 = addViewEventItme(str, i, "onscroll", "st_vId,st_vW,st_fM,st_vT,st_bT");
            if (addViewEventItme4 || addViewEventItme5) {
                ((AbsListView) view).setOnScrollListener(new C1359a(addViewEventItme4, addViewEventItme5));
            }
        }
        if (view instanceof AdapterView) {
            if (addViewEventItme(str, i, "clickitem", "st_vId,st_vW,st_pN,st_iD,st_vW2")) {
                ((AdapterView) view).setOnItemClickListener(new C1360b());
            }
            boolean addViewEventItme6 = addViewEventItme(str, i, "onitemselected", "st_vId,st_vW,st_vW2,st_pN,st_iD");
            boolean addViewEventItme7 = addViewEventItme(str, i, "onnothingselected", "st_vId,st_vW");
            if (addViewEventItme6 || addViewEventItme7) {
                ((AdapterView) view).setOnItemSelectedListener(new C1361c(addViewEventItme6, addViewEventItme7));
            }
        }
        if (view instanceof ViewPager) {
            boolean addViewEventItme8 = addViewEventItme(str, i, "onpageselected", "st_vId,st_vW,st_pN");
            boolean addViewEventItme9 = addViewEventItme(str, i, "onpagescrolled", "st_vId,st_vW,st_pN,st_pT,st_pS");
            boolean addViewEventItme10 = addViewEventItme(str, i, "onpagescrollstatechanged", "st_vId,st_vW,st_sE");
            if (addViewEventItme8 || addViewEventItme9 || addViewEventItme10) {
                new C1343o((ViewPager) view, this.luaj, addViewEventItme8, addViewEventItme9, addViewEventItme10);
            }
        }
        if (view instanceof DrawerLayout) {
            boolean addViewEventItme11 = addViewEventItme(str, i, "ondrawerclosed", "st_vId,st_vW,st_dW");
            boolean addViewEventItme12 = addViewEventItme(str, i, "ondraweropened", "st_vId,st_vW,st_dW");
            boolean addViewEventItme13 = addViewEventItme(str, i, "onoptionsitemselected", "st_vId,st_vW,st_iM");
            if (addViewEventItme11 || addViewEventItme12 || addViewEventItme13) {
                new C1334m((DrawerLayout) view, this.luaj, addViewEventItme11, addViewEventItme12, addViewEventItme13);
            }
        }
        if ((view instanceof SeekBar) && (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">"))) {
            boolean addViewEventItme14 = addViewEventItme(str, i, "onstarttrackingtouch", "st_vId,st_vW");
            boolean addViewEventItme15 = addViewEventItme(str, i, "onstoptrackingtouch", "st_vId,st_vW");
            boolean addViewEventItme16 = addViewEventItme(str, i, "onprogresschanged2", "st_vId,st_vW,st_nS,st_fR");
            if (addViewEventItme14 || addViewEventItme15 || addViewEventItme16) {
                ((SeekBar) view).setOnSeekBarChangeListener(new C1362d(addViewEventItme15, addViewEventItme14, addViewEventItme16));
            }
        }
        m3977b(view, str);
    }

    /* renamed from: b */
    private void m3977b(View view, String str) {
        if ((view instanceof TabLayout) && (str.contains("<eventItme type=\"ontabselected\">") || str.contains("<eventItme type=\"ontabunselected\">") || str.contains("<eventItme type=\"ontabreselected\">"))) {
            ((TabLayout) view).addOnTabSelectedListener(new C1363e(addViewEventItme(str, view.getId(), "ontabselected", "st_vId,st_vW,st_pN,st_tT,st_taB"), view, addViewEventItme(str, view.getId(), "ontabunselected", "st_vId,st_vW,st_pN,st_tT,st_taB"), addViewEventItme(str, view.getId(), "ontabreselected", "st_vId,st_vW,st_pN,st_tT,st_taB")));
        }
        if (view instanceof RecyclerView) {
            if (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscrolled\">")) {
                ((RecyclerView) view).addOnScrollListener(new C1364f(addViewEventItme(str, view.getId(), "onscrollstatechanged", "st_vId,st_vW,st_sE"), addViewEventItme(str, view.getId(), "onscrolled", "st_vId,st_vW,st_fM,st_vT,st_bT,st_dX,st_dY,st_isB")));
            }
            if (str.contains("<eventItme type=\"clickitem\">")) {
                ((RecyclerView) view).addOnItemTouchListener(new C1366h(this, new GestureDetector(this, new C1365g(addViewEventItme(str, view.getId(), "clickitem", "st_vId,st_vW,st_pN,st_vW2"), view))));
            }
        }
        if ((view instanceof VerticalViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ((VerticalViewPager) view).setOnPageChangeListener(new C1367i(addViewEventItme(str, view.getId(), "onpageselected", "st_vId,st_vW,st_pN"), view, addViewEventItme(str, view.getId(), "onpagescrolled", "st_vId,st_vW,st_pN,st_pT,st_pS"), addViewEventItme(str, view.getId(), "onpagescrollstatechanged", "st_vId,st_vW,st_sE")));
        }
        if ((view instanceof SwipeRefreshLayout) && str.contains("<eventItme type=\"onrefresh\">")) {
            ((SwipeRefreshLayout) view).setOnRefreshListener(new C1368j(addViewEventItme(str, view.getId(), "onrefresh", "st_vId,st_vW"), view));
        }
        if ((view instanceof CompoundButton) && str.contains("<eventItme type=\"oncheckedchanged\">")) {
            ((CompoundButton) view).setOnCheckedChangeListener(new C1370l(addViewEventItme(str, view.getId(), "oncheckedchanged", "st_vId,st_vW,st_iC"), view));
        }
        if ((view instanceof AppBarLayout) && str.contains("<eventItme type=\"onoffsetchanged\">")) {
            ((AppBarLayout) view).addOnOffsetChangedListener(new C1371m(addViewEventItme(str, view.getId(), "onoffsetchanged", "st_vId,st_vW,st_vO")));
        }
    }

    /* renamed from: c */
    private boolean m3978c(String str, String str2) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3221j += "function " + str2 + "()\n" + c + "\nend\n";
        return true;
    }

    /* renamed from: d */
    private boolean m3979d(String str, String str2, String str3) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        this.f3221j += "function " + str2 + "(" + str3 + ")\n" + c + "\nend\n";
        return true;
    }

    /* renamed from: e */
    private void m3980e(String str) {
        if (this.f3222k) {
            str = str + "\nloading();\n";
        }
        try {
            this.luaj.mo11695g(str);
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("LuaErr：\n" + e.getMessage());
        }
    }

    /* renamed from: f */
    private String m3981f(String str, String str2) {
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
    private void m3982h(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: i */
    private void m3983i(WebView webView, String str) {
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
            new C1325l(webView, this.luaj);
        } else {
            webView.setDownloadListener(new C1369k(this));
        }
        new C1443b().mo12147h(webView, str, this);
        m3982h(webView);
    }

    /* renamed from: j */
    private void m3984j() {
        String c;
        String str = this.f3229r;
        if (str != null) {
            String f = m3981f(str, "loading");
            if (f != null) {
                this.f3222k = true;
                this.f3221j += "function loading()\n" + f + "\nend\n";
            }
            this.f3223l = m3978c(this.f3229r, "loadingComplete");
            this.f3225n = m3979d(this.f3229r, "downkey", "st_kC,st_eA,st_eR,st_eT");
            this.f3226o = m3979d(this.f3229r, "upkey", "st_kC,st_eA,st_eR,st_eT");
            this.f3227p = m3978c(this.f3229r, "destroy");
            this.f3228q = m3978c(this.f3229r, "stop");
            this.f3230s = m3978c(this.f3229r, "restart");
            this.f3231t = m3979d(this.f3229r, "onactivityresult", "st_sC,st_lC,st_iT");
            this.f3232u = m3979d(this.f3229r, "sensor", "st_x,st_y,st_z");
            if (this.f3229r.contains("<eventItme type=\"menu\">") && (c = C0860r.m2044c(this.f3229r, "<eventItme type=\"menu\">", "</eventItme>")) != null) {
                String[] split = ("m\n" + c).split("\ncase ", -1);
                this.f3214c = new String[split.length];
                for (int i = 1; i < split.length; i++) {
                    this.f3214c[i] = C0860r.m2044c(split[i], null, ":");
                    this.f3221j += "function CreateOptionsMenu" + i + "()\n" + C0860r.m2044c(split[i], ":", "\nbreak") + "\nend\n";
                }
                String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
                if (c2 != null) {
                    this.f3224m = true;
                    this.f3221j += "function onCreateOptionsMenuloading()\n" + c2 + "\nend\n";
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
        this.f3221j += "function " + str2 + i + "(" + str3 + ")\n" + c + "\nend\n";
        return true;
    }

    /* renamed from: g */
    public void mo12017g() {
        this.luaj = new C1298d(this);
        this.f3220i = new Aid_luaCode(this, this.luaj);
        this.luaj.mo11700l("activity", this);
        this.luaj.mo11700l("i", this.f3220i);
        this.luaj.mo11699k();
        m3984j();
        if (this.f3232u) {
            SensorManager sensorManager = (SensorManager) getSystemService("sensor");
            this.f3218g = sensorManager;
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.f3219h = defaultSensor;
            C1372n nVar = new C1372n();
            this.f3217f = nVar;
            this.f3218g.registerListener(nVar, defaultSensor, 2);
        }
        m3980e(this.f3221j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12018g(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.run.main.mo12018g(java.lang.String):void");
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
        } else if (this.f3231t) {
            this.luaj.mo11693d("onactivityresult", Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C1298d dVar = this.luaj;
        dVar.mo11692c("onCreateContextMenu" + menuItem.getGroupId() + "x" + menuItem.getItemId());
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
        C0864v.f1801k = this.f3213b;
        setContentView(2131361857);
        this.f3216e = getIntent().getExtras().getString("OpenFilexmlui");
        this.f3212a = (LinearLayout) findViewById(2131230939);
        C1294b.m3499h3(this, this.f3216e.toLowerCase());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String[] strArr = this.f3214c;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                if (this.f3214c[i].contains("|")) {
                    boolean c0 = C1305g.m3576c0(menu, i, this.f3214c[i], this);
                    if (!this.f3233v && c0) {
                        this.f3233v = true;
                    }
                } else {
                    menu.add(0, i, 0, this.f3214c[i]);
                }
            }
        }
        if (this.f3224m) {
            this.luaj.mo11692c("onCreateOptionsMenuloading");
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (this.f3227p) {
            this.luaj.mo11692c("destroy");
        }
        SensorManager sensorManager = this.f3218g;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f3217f, this.f3219h);
        }
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f3225n) {
            return this.luaj.mo11694e("downkey", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
        } else if (i != 4) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f3226o) {
            return false;
        }
        return this.luaj.mo11694e("upkey", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
    }

    @Override // android.support.p012v7.app.AppCompatActivity
    public boolean onMenuOpened(int i, Menu menu) {
        if (this.f3233v && menu != null && menu.getClass().getSimpleName().equalsIgnoreCase("MenuBuilder")) {
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
        C1298d dVar = this.luaj;
        dVar.mo11692c("CreateOptionsMenu" + menuItem.getItemId());
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
        C0864v.f1801k = this.f3213b;
        if (this.f3230s) {
            this.luaj.mo11692c("restart");
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
        if (this.f3228q) {
            this.luaj.mo11692c("stop");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.f3234w) {
            this.f3234w = true;
            if (this.f3223l) {
                this.luaj.mo11692c("loadingComplete");
            }
        }
    }
}
