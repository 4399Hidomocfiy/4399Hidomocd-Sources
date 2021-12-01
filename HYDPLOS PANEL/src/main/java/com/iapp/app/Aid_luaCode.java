package com.iapp.app;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.Snackbar;
import android.support.p009v4.app.FragmentStatePagerAdapter;
import android.support.p009v4.view.PagerAdapter;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.support.p012v7.app.ActionBar;
import android.support.p012v7.app.ActionBarDrawerToggle;
import android.support.p012v7.app.AppCompatActivity;
import android.support.p012v7.widget.LinearLayoutManager;
import android.support.p012v7.widget.RecyclerView;
import android.support.p012v7.widget.StaggeredGridLayoutManager;
import android.support.p012v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.Display;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import bsh.EvalError;
import com.iapp.app.TabLayout;
import com.iapp.app.p067x5.AbstractC1442a;
import com.iapp.app.p067x5.C1443b;
import com.iapp.app.p067x5.C1469c;
import com.iapp.app.p067x5.WebView;
import com.iapp.app.run.main;
import com.iapp.app.run.main2;
import com.iapp.app.run.main3;
import com.iapp.app.run.mian;
import com.iapp.interfaces.OnFileDownStatusListener;
import com.iapp.interfaces.OnMessagesListener;
import dalvik.system.DexClassLoader;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaObject;
import p013b.p044b.p045a.p046a.C0832d;
import p013b.p044b.p045a.p046a.C0834e;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0836g;
import p013b.p044b.p045a.p046a.C0839h;
import p013b.p044b.p045a.p046a.C0841i;
import p013b.p044b.p045a.p046a.C0844j;
import p013b.p044b.p045a.p046a.C0849k;
import p013b.p044b.p045a.p046a.C0851m;
import p013b.p044b.p045a.p046a.C0853o;
import p013b.p044b.p045a.p046a.C0854p;
import p013b.p044b.p045a.p046a.C0855q;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0861s;
import p013b.p044b.p045a.p046a.C0862t;
import p013b.p044b.p045a.p046a.C0864v;
import p013b.p044b.p045a.p046a.p047y.C0911c;
import p013b.p048c.p049a.C0915a;
import p013b.p048c.p049a.C0916b;
import p013b.p048c.p049a.C0917c;
import p013b.p050d.p051a.AbstractC0918a;
import p013b.p050d.p051a.C0921c;
import p013b.p050d.p051a.C0934i;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;

@SuppressLint({"HandlerLeak"})
public class Aid_luaCode {
    public static AlertDialog alertdialog;

    /* renamed from: f */
    private static HashMap<String, Object> f2779f = new HashMap<>();

    /* renamed from: g */
    private static int f2780g = 0;
    public static HashMap<String, Object> ss_dim;

    /* renamed from: a */
    private HashMap<String, Object> f2781a = new HashMap<>();

    /* renamed from: b */
    private Activity f2782b = null;

    /* renamed from: c */
    private Context f2783c = null;

    /* renamed from: d */
    private C1298d f2784d = null;

    /* renamed from: e */
    private Handler f2785e = null;

    /* renamed from: com.iapp.app.Aid_luaCode$a */
    class DialogInterface$OnClickListenerC1209a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2786a;

        DialogInterface$OnClickListenerC1209a(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2786a = luaObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2786a.callxNoErr();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$a0 */
    public class C1210a0 extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2787a;

        /* renamed from: b */
        final /* synthetic */ C1298d f2788b;

        /* renamed from: c */
        final /* synthetic */ boolean f2789c;

        C1210a0(Aid_luaCode aid_luaCode, boolean z, C1298d dVar, boolean z2) {
            this.f2787a = z;
            this.f2788b = dVar;
            this.f2789c = z2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f2787a) {
                int id = recyclerView.getId();
                C1298d dVar = this.f2788b;
                dVar.mo11693d("onscrollstatechanged" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(i));
            }
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.f2789c) {
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
                C1298d dVar = this.f2788b;
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

    /* renamed from: com.iapp.app.Aid_luaCode$a1 */
    class DialogInterface$OnClickListenerC1211a1 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2790a;

        DialogInterface$OnClickListenerC1211a1(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2790a = luaObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2790a.callxNoErr();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$b */
    public class C1212b implements OnFileDownStatusListener {
        C1212b(Aid_luaCode aid_luaCode) {
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void complete(int i, Object obj) {
            if (obj != null && (obj instanceof LuaObject)) {
                ((LuaObject) obj).callNoErr(Integer.valueOf(i));
            }
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void resultStatus(int i, int i2, Object obj) {
            if (obj != null && (obj instanceof LuaObject)) {
                ((LuaObject) obj).callNoErr(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$b0 */
    public class C1213b0 extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2791a;

        /* renamed from: b */
        final /* synthetic */ View f2792b;

        /* renamed from: c */
        final /* synthetic */ C1298d f2793c;

        C1213b0(Aid_luaCode aid_luaCode, boolean z, View view, C1298d dVar) {
            this.f2791a = z;
            this.f2792b = view;
            this.f2793c = dVar;
        }

        public void onLongPress(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (this.f2791a && (findChildViewUnder = (recyclerView = (RecyclerView) this.f2792b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) != null) {
                int id = recyclerView.getId();
                C1298d dVar = this.f2793c;
                dVar.mo11693d("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (!this.f2791a || (findChildViewUnder = (recyclerView = (RecyclerView) this.f2792b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                return false;
            }
            int id = recyclerView.getId();
            C1298d dVar = this.f2793c;
            dVar.mo11693d("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            return true;
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$b1 */
    class DialogInterface$OnClickListenerC1214b1 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2794a;

        DialogInterface$OnClickListenerC1214b1(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2794a = luaObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2794a.callxNoErr();
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$c */
    class C1215c extends Thread {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2795a;

        C1215c(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2795a = luaObject;
        }

        public void run() {
            this.f2795a.callxNoErr();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$c0 */
    public class C1216c0 implements RecyclerView.OnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f2796a;

        C1216c0(Aid_luaCode aid_luaCode, GestureDetector gestureDetector) {
            this.f2796a = gestureDetector;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f2796a.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$c1 */
    class DialogInterface$OnClickListenerC1217c1 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2797a;

        DialogInterface$OnClickListenerC1217c1(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2797a = luaObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2797a.callxNoErr();
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$d  reason: invalid class name */
    class animationAnimation$AnimationListenerC1218d implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2798a;

        /* renamed from: b */
        final /* synthetic */ LuaObject f2799b;

        /* renamed from: c */
        final /* synthetic */ LuaObject f2800c;

        animationAnimation$AnimationListenerC1218d(Aid_luaCode aid_luaCode, LuaObject luaObject, LuaObject luaObject2, LuaObject luaObject3) {
            this.f2798a = luaObject;
            this.f2799b = luaObject2;
            this.f2800c = luaObject3;
        }

        public void onAnimationEnd(Animation animation) {
            LuaObject luaObject = this.f2798a;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }

        public void onAnimationRepeat(Animation animation) {
            LuaObject luaObject = this.f2799b;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }

        public void onAnimationStart(Animation animation) {
            LuaObject luaObject = this.f2800c;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$d0 */
    public class C1219d0 implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2801a;

        /* renamed from: b */
        final /* synthetic */ View f2802b;

        /* renamed from: c */
        final /* synthetic */ C1298d f2803c;

        /* renamed from: d */
        final /* synthetic */ boolean f2804d;

        /* renamed from: e */
        final /* synthetic */ boolean f2805e;

        C1219d0(Aid_luaCode aid_luaCode, boolean z, View view, C1298d dVar, boolean z2, boolean z3) {
            this.f2801a = z;
            this.f2802b = view;
            this.f2803c = dVar;
            this.f2804d = z2;
            this.f2805e = z3;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f2805e) {
                int id = this.f2802b.getId();
                C1298d dVar = this.f2803c;
                dVar.mo11693d("onpagescrollstatechanged" + id, Integer.valueOf(id), this.f2802b, Integer.valueOf(i));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f2804d) {
                int id = this.f2802b.getId();
                C1298d dVar = this.f2803c;
                dVar.mo11693d("onpagescrolled" + id, Integer.valueOf(id), this.f2802b, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f2801a) {
                int id = this.f2802b.getId();
                C1298d dVar = this.f2803c;
                dVar.mo11693d("onpageselected" + id, Integer.valueOf(id), this.f2802b, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.Aid_luaCode$d1 */
    public class C1220d1 {

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> f2806a;

        /* renamed from: b */
        public Object f2807b;

        private C1220d1(Aid_luaCode aid_luaCode) {
            this.f2806a = new ArrayList<>();
            this.f2807b = null;
        }

        /* synthetic */ C1220d1(Aid_luaCode aid_luaCode, HandlerC1237k kVar) {
            this(aid_luaCode);
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$e */
    class C1221e implements AbstractC0918a.AbstractC0919a {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2808a;

        /* renamed from: b */
        final /* synthetic */ LuaObject f2809b;

        /* renamed from: c */
        final /* synthetic */ LuaObject f2810c;

        /* renamed from: d */
        final /* synthetic */ LuaObject f2811d;

        C1221e(Aid_luaCode aid_luaCode, LuaObject luaObject, LuaObject luaObject2, LuaObject luaObject3, LuaObject luaObject4) {
            this.f2808a = luaObject;
            this.f2809b = luaObject2;
            this.f2810c = luaObject3;
            this.f2811d = luaObject4;
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            LuaObject luaObject = this.f2808a;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: b */
        public void mo9122b(AbstractC0918a aVar) {
            LuaObject luaObject = this.f2809b;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: c */
        public void mo9123c(AbstractC0918a aVar) {
            LuaObject luaObject = this.f2810c;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: d */
        public void mo9124d(AbstractC0918a aVar) {
            LuaObject luaObject = this.f2811d;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$e0 */
    public class C1222e0 implements SwipeRefreshLayout.OnRefreshListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2812a;

        /* renamed from: b */
        final /* synthetic */ View f2813b;

        /* renamed from: c */
        final /* synthetic */ C1298d f2814c;

        C1222e0(Aid_luaCode aid_luaCode, boolean z, View view, C1298d dVar) {
            this.f2812a = z;
            this.f2813b = view;
            this.f2814c = dVar;
        }

        @Override // android.support.p009v4.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            if (this.f2812a) {
                int id = this.f2813b.getId();
                C1298d dVar = this.f2814c;
                dVar.mo11693d("onrefresh" + id, Integer.valueOf(id), this.f2813b);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$e1 */
    private class C1223e1 extends BaseAdapter {

        /* renamed from: a */
        private Context f2815a;

        /* renamed from: b */
        private C0844j f2816b;

        /* renamed from: c */
        private C1220d1 f2817c;

        /* renamed from: d */
        private String f2818d = null;

        /* renamed from: e */
        private LuaObject f2819e = null;

        /* renamed from: f */
        private int f2820f = 0;

        /* renamed from: g */
        private int f2821g;

        /* renamed from: h */
        private int f2822h = -1;

        /* renamed from: i */
        private int f2823i = -2;

        /* renamed from: j */
        private Iterator f2824j;

        /* renamed from: k */
        private C1224a f2825k;

        /* renamed from: l */
        private ArrayList<Integer> f2826l = null;

        /* renamed from: com.iapp.app.Aid_luaCode$e1$a */
        private final class C1224a {

            /* renamed from: a */
            public ViewGroup f2828a;

            /* renamed from: b */
            public int[] f2829b;

            /* renamed from: c */
            public View[] f2830c;

            private C1224a(C1223e1 e1Var) {
                this.f2829b = null;
                this.f2830c = null;
            }

            /* synthetic */ C1224a(C1223e1 e1Var, HandlerC1237k kVar) {
                this(e1Var);
            }
        }

        public C1223e1(Context context) {
            this.f2815a = context;
            this.f2816b = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo11454a() {
            return this.f2817c.f2806a;
        }

        /* renamed from: b */
        public void mo11455b(String str, C1220d1 d1Var) {
            this.f2818d = str;
            this.f2817c = d1Var;
            this.f2820f = Aid_luaCode.this.m3290i(str.substring(0, str.length() - 4));
        }

        /* renamed from: c */
        public void mo11456c(int i, int i2) {
            this.f2822h = i;
            this.f2823i = i2;
        }

        public int getCount() {
            C1220d1 d1Var = this.f2817c;
            if (d1Var == null) {
                return 0;
            }
            return d1Var.f2806a.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout;
            HashMap<Integer, Object> hashMap = this.f2817c.f2806a.get(i);
            int i2 = 0;
            if (view == null) {
                this.f2825k = new C1224a(this, null);
                LinearLayout linearLayout2 = new LinearLayout(this.f2815a);
                linearLayout2.setLayoutParams(new AbsListView.LayoutParams(this.f2822h, this.f2823i));
                linearLayout2.setOrientation(1);
                LinearLayout linearLayout3 = new LinearLayout(this.f2815a);
                linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(this.f2822h, this.f2823i));
                linearLayout3.setOrientation(1);
                linearLayout2.addView(linearLayout3);
                this.f2819e = Aid_luaCode.this.openRestoreinterface(this.f2818d, linearLayout3, this.f2820f, hashMap);
                this.f2824j = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f2824j.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f2824j.next()));
                    this.f2821g = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                C1224a aVar = this.f2825k;
                aVar.f2830c = new View[size];
                aVar.f2829b = new int[size];
                if (this.f2826l == null) {
                    this.f2826l = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue = ((Integer) arrayList.get(i3)).intValue();
                        this.f2821g = intValue;
                        C1224a aVar2 = this.f2825k;
                        aVar2.f2829b[i3] = intValue;
                        if (intValue > 0) {
                            aVar2.f2830c[i3] = linearLayout2.findViewById(intValue + this.f2820f);
                        }
                        stringBuffer.append(this.f2821g + this.f2820f);
                        stringBuffer.append(',');
                    }
                    Aid_luaCode.this.setClickable(this.f2826l, stringBuffer, linearLayout2);
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        int intValue2 = ((Integer) arrayList.get(i4)).intValue();
                        this.f2821g = intValue2;
                        C1224a aVar3 = this.f2825k;
                        aVar3.f2829b[i4] = intValue2;
                        if (intValue2 > 0) {
                            aVar3.f2830c[i4] = linearLayout2.findViewById(intValue2 + this.f2820f);
                        }
                    }
                }
                C1224a aVar4 = this.f2825k;
                aVar4.f2828a = linearLayout3;
                linearLayout2.setTag(aVar4);
                linearLayout = linearLayout2;
            } else {
                this.f2825k = (C1224a) view.getTag();
                linearLayout = view;
            }
            while (true) {
                C1224a aVar5 = this.f2825k;
                int[] iArr = aVar5.f2829b;
                if (i2 >= iArr.length) {
                    break;
                }
                if (iArr[i2] > 0) {
                    C0839h.m1914w(aVar5.f2830c[i2], hashMap.get(Integer.valueOf(iArr[i2])), hashMap, this.f2816b);
                }
                i2++;
            }
            Iterator<Integer> it = this.f2826l.iterator();
            while (it.hasNext()) {
                View findViewById = linearLayout.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            LuaObject luaObject = this.f2819e;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
            return linearLayout;
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$f */
    class C1225f implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2831a;

        C1225f(LuaObject luaObject) {
            this.f2831a = luaObject;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            this.f2831a.callNoErr(Aid_luaCode.this.m3301t((Aid_luaCode) obj), cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$f0 */
    public class C1226f0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2833a;

        /* renamed from: b */
        final /* synthetic */ View f2834b;

        /* renamed from: c */
        final /* synthetic */ C1298d f2835c;

        C1226f0(Aid_luaCode aid_luaCode, boolean z, View view, C1298d dVar) {
            this.f2833a = z;
            this.f2834b = view;
            this.f2835c = dVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f2833a) {
                int id = this.f2834b.getId();
                C1298d dVar = this.f2835c;
                dVar.mo11693d("oncheckedchanged" + id, Integer.valueOf(id), this.f2834b, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$f1 */
    private class C1227f1 extends RecyclerView.Adapter<C1228a> {

        /* renamed from: a */
        private Context f2836a;

        /* renamed from: b */
        private C0844j f2837b;

        /* renamed from: c */
        private C1220d1 f2838c;

        /* renamed from: d */
        private LuaObject f2839d = null;

        /* renamed from: e */
        private String f2840e = null;

        /* renamed from: f */
        private int f2841f = 0;

        /* renamed from: g */
        private int f2842g;

        /* renamed from: h */
        private int f2843h = -1;

        /* renamed from: i */
        private int f2844i = -2;

        /* renamed from: j */
        private Iterator f2845j;

        /* renamed from: k */
        private ArrayList<Integer> f2846k = null;

        /* access modifiers changed from: package-private */
        /* renamed from: com.iapp.app.Aid_luaCode$f1$a */
        public class C1228a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ViewGroup f2848a;

            /* renamed from: b */
            public int[] f2849b = null;

            /* renamed from: c */
            public View[] f2850c = null;

            public C1228a(C1227f1 f1Var, ViewGroup viewGroup) {
                super(viewGroup);
                this.f2848a = viewGroup;
            }
        }

        public C1227f1(Context context) {
            this.f2836a = context;
            this.f2837b = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo11462a() {
            return this.f2838c.f2806a;
        }

        /* renamed from: b */
        public void onBindViewHolder(C1228a aVar, int i) {
            HashMap<Integer, Object> hashMap = this.f2838c.f2806a.get(i);
            int i2 = 0;
            if (aVar.f2849b == null) {
                this.f2839d = Aid_luaCode.this.openRestoreinterface(this.f2840e, aVar.f2848a, this.f2841f, hashMap);
                this.f2845j = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f2845j.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f2845j.next()));
                    this.f2842g = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                aVar.f2850c = new View[size];
                aVar.f2849b = new int[size];
                if (this.f2846k == null) {
                    this.f2846k = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue = ((Integer) arrayList.get(i3)).intValue();
                        this.f2842g = intValue;
                        aVar.f2849b[i3] = intValue;
                        if (intValue > 0) {
                            aVar.f2850c[i3] = aVar.f2848a.findViewById(intValue + this.f2841f);
                        }
                        stringBuffer.append(this.f2842g + this.f2841f);
                        stringBuffer.append(',');
                    }
                    Aid_luaCode.this.setClickable(this.f2846k, stringBuffer, aVar.f2848a);
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        int intValue2 = ((Integer) arrayList.get(i4)).intValue();
                        this.f2842g = intValue2;
                        aVar.f2849b[i4] = intValue2;
                        if (intValue2 > 0) {
                            aVar.f2850c[i4] = aVar.f2848a.findViewById(intValue2 + this.f2841f);
                        }
                    }
                }
            }
            while (true) {
                int[] iArr = aVar.f2849b;
                if (i2 >= iArr.length) {
                    break;
                }
                if (iArr[i2] > 0) {
                    C0839h.m1914w(aVar.f2850c[i2], hashMap.get(Integer.valueOf(iArr[i2])), hashMap, this.f2837b);
                }
                i2++;
            }
            Iterator<Integer> it = this.f2846k.iterator();
            while (it.hasNext()) {
                View findViewById = aVar.f2848a.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            LuaObject luaObject = this.f2839d;
            if (luaObject != null) {
                luaObject.callxNoErr();
            }
        }

        /* renamed from: c */
        public C1228a onCreateViewHolder(ViewGroup viewGroup, int i) {
            LinearLayout linearLayout = new LinearLayout(this.f2836a);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f2843h, this.f2844i));
            linearLayout.setOrientation(1);
            return new C1228a(this, linearLayout);
        }

        /* renamed from: d */
        public void mo11465d(String str, C1220d1 d1Var) {
            this.f2840e = str;
            this.f2838c = d1Var;
            this.f2841f = Aid_luaCode.this.m3290i(str.substring(0, str.length() - 4));
        }

        /* renamed from: e */
        public void mo11466e(int i, int i2) {
            this.f2843h = i;
            this.f2844i = i2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            C1220d1 d1Var = this.f2838c;
            if (d1Var == null) {
                return 0;
            }
            return d1Var.f2806a.size();
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$g */
    class C1229g implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2851a;

        C1229g(LuaObject luaObject) {
            this.f2851a = luaObject;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            this.f2851a.callNoErr(Aid_luaCode.this.m3301t((Aid_luaCode) obj), cVar);
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$g0 */
    class HandlerC1230g0 extends Handler {
        HandlerC1230g0(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_luaCode.this.f2783c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((LuaObject) message.obj).callxNoErr();
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$h */
    class View$OnClickListenerC1231h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2854a;

        View$OnClickListenerC1231h(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2854a = luaObject;
        }

        public void onClick(View view) {
            this.f2854a.callNoErr(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$h0 */
    public class C1232h0 implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2855a;

        /* renamed from: b */
        final /* synthetic */ C1298d f2856b;

        C1232h0(Aid_luaCode aid_luaCode, boolean z, C1298d dVar) {
            this.f2855a = z;
            this.f2856b = dVar;
        }

        @Override // android.support.design.widget.AppBarLayout.OnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (this.f2855a) {
                int id = appBarLayout.getId();
                C1298d dVar = this.f2856b;
                dVar.mo11693d("onoffsetchanged" + id, Integer.valueOf(id), appBarLayout, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$i */
    class C1233i extends ActionBarDrawerToggle {

        /* renamed from: a */
        final /* synthetic */ boolean f2857a;

        /* renamed from: b */
        final /* synthetic */ DrawerLayout f2858b;

        /* renamed from: c */
        final /* synthetic */ boolean f2859c;

        /* renamed from: d */
        final /* synthetic */ boolean f2860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1233i(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2, boolean z, DrawerLayout drawerLayout2, boolean z2, boolean z3) {
            super(activity, drawerLayout, toolbar, i, i2);
            this.f2857a = z;
            this.f2858b = drawerLayout2;
            this.f2859c = z2;
            this.f2860d = z3;
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerClosed(View view) {
            if (this.f2857a) {
                int id = this.f2858b.getId();
                C1298d dVar = Aid_luaCode.this.f2784d;
                dVar.mo11693d("ondrawerclosed" + id, Integer.valueOf(id), this.f2858b, view);
            }
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerOpened(View view) {
            if (this.f2859c) {
                int id = this.f2858b.getId();
                C1298d dVar = Aid_luaCode.this.f2784d;
                dVar.mo11693d("ondraweropened" + id, Integer.valueOf(id), this.f2858b, view);
            }
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (!this.f2860d) {
                return false;
            }
            int id = this.f2858b.getId();
            C1298d dVar = Aid_luaCode.this.f2784d;
            return dVar.mo11694e("onoptionsitemselected" + id, Integer.valueOf(id), this.f2858b, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$i0 */
    public class C1234i0 implements AbstractC1442a {
        C1234i0(Aid_luaCode aid_luaCode) {
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

    /* renamed from: com.iapp.app.Aid_luaCode$j */
    class View$OnClickListenerC1235j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2862a;

        View$OnClickListenerC1235j(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2862a = luaObject;
        }

        public void onClick(View view) {
            this.f2862a.callNoErr(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$j0 */
    public class View$OnClickListenerC1236j0 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2863a;

        View$OnClickListenerC1236j0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2863a = luaObjectArr;
        }

        public void onClick(View view) {
            int id = view.getId();
            this.f2863a[0].callNoErr(Integer.valueOf(id), view);
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$k */
    class HandlerC1237k extends Handler {
        HandlerC1237k(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_luaCode.this.f2783c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((LuaObject) message.obj).callxNoErr();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$k0 */
    public class View$OnTouchListenerC1238k0 implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2865a;

        View$OnTouchListenerC1238k0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2865a = luaObjectArr;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            return this.f2865a[0].callBoolNoErr(Integer.valueOf(id), view, Integer.valueOf(motionEvent.getAction()), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$l */
    class C1239l extends WebChromeClient {
        C1239l(Aid_luaCode aid_luaCode) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$l0 */
    public class View$OnLongClickListenerC1240l0 implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2866a;

        View$OnLongClickListenerC1240l0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2866a = luaObjectArr;
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            return this.f2866a[0].callBoolNoErr(Integer.valueOf(id), view);
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$m */
    class C1241m extends WebChromeClient {
        C1241m(Aid_luaCode aid_luaCode) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$m0 */
    public class View$OnKeyListenerC1242m0 implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2867a;

        View$OnKeyListenerC1242m0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2867a = luaObjectArr;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            return this.f2867a[0].callBoolNoErr(Integer.valueOf(id), view, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$n */
    public class View$OnClickListenerC1243n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2868a;

        View$OnClickListenerC1243n(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2868a = dVar;
        }

        public void onClick(View view) {
            int id = view.getId();
            C1298d dVar = this.f2868a;
            dVar.mo11693d("clicki" + id, Integer.valueOf(id), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$n0 */
    public class C1244n0 implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2869a;

        C1244n0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2869a = luaObjectArr;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            int id = textView.getId();
            LuaObject[] luaObjectArr = this.f2869a;
            if (keyEvent != null) {
                return luaObjectArr[0].callBoolNoErr(Integer.valueOf(id), textView, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(keyEvent.getKeyCode()), keyEvent);
            }
            return luaObjectArr[0].callBoolNoErr(Integer.valueOf(id), textView, Integer.valueOf(i), null, null, null, keyEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$o */
    public class View$OnTouchListenerC1245o implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2870a;

        View$OnTouchListenerC1245o(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2870a = dVar;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            C1298d dVar = this.f2870a;
            return dVar.mo11694e("touchmonitor" + id, Integer.valueOf(id), view, Integer.valueOf(motionEvent.getAction()), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$o0 */
    public class C1246o0 implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2871a;

        /* renamed from: b */
        final /* synthetic */ View f2872b;

        C1246o0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr, View view) {
            this.f2871a = luaObjectArr;
            this.f2872b = view;
        }

        public void afterTextChanged(Editable editable) {
            LuaObject[] luaObjectArr = this.f2871a;
            if (luaObjectArr[2] != null) {
                luaObjectArr[2].callBoolNoErr(Integer.valueOf(this.f2872b.getId()), this.f2872b, editable.toString());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LuaObject[] luaObjectArr = this.f2871a;
            if (luaObjectArr[1] != null) {
                luaObjectArr[1].callBoolNoErr(Integer.valueOf(this.f2872b.getId()), this.f2872b, charSequence.toString(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LuaObject[] luaObjectArr = this.f2871a;
            if (luaObjectArr[0] != null) {
                luaObjectArr[0].callBoolNoErr(Integer.valueOf(this.f2872b.getId()), this.f2872b, charSequence.toString(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$p */
    public class View$OnLongClickListenerC1247p implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2873a;

        View$OnLongClickListenerC1247p(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2873a = dVar;
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            C1298d dVar = this.f2873a;
            return dVar.mo11694e("press" + id, Integer.valueOf(id), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$p0 */
    public class C1248p0 implements AbstractC1442a {

        /* renamed from: a */
        final /* synthetic */ View f2874a;

        /* renamed from: b */
        final /* synthetic */ LuaObject[] f2875b;

        C1248p0(Aid_luaCode aid_luaCode, View view, LuaObject[] luaObjectArr) {
            this.f2874a = view;
            this.f2875b = luaObjectArr;
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            int id = this.f2874a.getId();
            this.f2875b[0].callBoolNoErr(Integer.valueOf(id), this.f2874a, str, str2, str3, str4, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$q */
    public class View$OnKeyListenerC1249q implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2876a;

        View$OnKeyListenerC1249q(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2876a = dVar;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            C1298d dVar = this.f2876a;
            return dVar.mo11694e("keyboard" + id, Integer.valueOf(id), view, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$q0 */
    public class View$OnFocusChangeListenerC1250q0 implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2877a;

        View$OnFocusChangeListenerC1250q0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2877a = luaObjectArr;
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            this.f2877a[0].callNoErr(Integer.valueOf(id), view, Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$r */
    public class View$OnCreateContextMenuListenerC1251r implements View.OnCreateContextMenuListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2878a;

        View$OnCreateContextMenuListenerC1251r(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2878a = dVar;
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
                C1298d dVar = this.f2878a;
                dVar.mo11693d("onCreateContextMenu" + id + "x0", Integer.valueOf(id), view);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$r0 */
    class HandlerC1252r0 extends Handler {
        HandlerC1252r0(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_luaCode.this.f2783c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((LuaObject) message.obj).callxNoErr();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$s */
    public class C1253s implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2880a;

        C1253s(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2880a = dVar;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            StringBuilder sb;
            int id = textView.getId();
            C1298d dVar = this.f2880a;
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
    /* renamed from: com.iapp.app.Aid_luaCode$s0 */
    public class C1254s0 implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2881a;

        C1254s0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2881a = luaObjectArr;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.f2881a[1] != null) {
                int id = absListView.getId();
                this.f2881a[1].callNoErr(Integer.valueOf(id), absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (this.f2881a[0] != null) {
                int id = absListView.getId();
                this.f2881a[0].callNoErr(Integer.valueOf(id), absListView, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$t */
    public class View$OnFocusChangeListenerC1255t implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2882a;

        View$OnFocusChangeListenerC1255t(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2882a = dVar;
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            C1298d dVar = this.f2882a;
            dVar.mo11693d("focuschange" + id, Integer.valueOf(id), view, Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$t0 */
    public class C1256t0 implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2883a;

        C1256t0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2883a = luaObjectArr;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            this.f2883a[0].callNoErr(Integer.valueOf(id), adapterView, Integer.valueOf(i), Long.valueOf(j), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$u */
    public class C1257u implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2884a;

        /* renamed from: b */
        final /* synthetic */ C1298d f2885b;

        /* renamed from: c */
        final /* synthetic */ boolean f2886c;

        C1257u(Aid_luaCode aid_luaCode, boolean z, C1298d dVar, boolean z2) {
            this.f2884a = z;
            this.f2885b = dVar;
            this.f2886c = z2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.f2886c) {
                int id = absListView.getId();
                C1298d dVar = this.f2885b;
                dVar.mo11693d("onscroll" + id, Integer.valueOf(id), absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (this.f2884a) {
                int id = absListView.getId();
                C1298d dVar = this.f2885b;
                dVar.mo11693d("onscrollstatechanged" + id, Integer.valueOf(id), absListView, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$u0 */
    public class C1258u0 implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2887a;

        C1258u0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2887a = luaObjectArr;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f2887a[0] != null) {
                int id = adapterView.getId();
                this.f2887a[0].callNoErr(Integer.valueOf(id), adapterView, view, Integer.valueOf(i), Long.valueOf(j));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (this.f2887a[1] != null) {
                int id = adapterView.getId();
                this.f2887a[1].callNoErr(Integer.valueOf(id), adapterView);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$v */
    class HandlerC1259v extends Handler {
        HandlerC1259v(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_luaCode.this.f2783c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((LuaObject) message.obj).callxNoErr();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$v0 */
    public class C1260v0 implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2889a;

        /* renamed from: b */
        final /* synthetic */ View f2890b;

        C1260v0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr, View view) {
            this.f2889a = luaObjectArr;
            this.f2890b = view;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            LuaObject[] luaObjectArr = this.f2889a;
            if (luaObjectArr[2] != null) {
                luaObjectArr[2].callNoErr(Integer.valueOf(this.f2890b.getId()), this.f2890b, Integer.valueOf(i));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            LuaObject[] luaObjectArr = this.f2889a;
            if (luaObjectArr[1] != null) {
                luaObjectArr[1].callNoErr(Integer.valueOf(this.f2890b.getId()), this.f2890b, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LuaObject[] luaObjectArr = this.f2889a;
            if (luaObjectArr[0] != null) {
                luaObjectArr[0].callNoErr(Integer.valueOf(this.f2890b.getId()), this.f2890b, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$w */
    public class C1261w implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C1298d f2891a;

        C1261w(Aid_luaCode aid_luaCode, C1298d dVar) {
            this.f2891a = dVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            C1298d dVar = this.f2891a;
            dVar.mo11693d("clickitem" + id, Integer.valueOf(id), adapterView, Integer.valueOf(i), Long.valueOf(j), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$w0 */
    public class C1262w0 extends android.support.p009v4.app.ActionBarDrawerToggle {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2892a;

        /* renamed from: b */
        final /* synthetic */ View f2893b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1262w0(Aid_luaCode aid_luaCode, Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3, LuaObject[] luaObjectArr, View view) {
            super(activity, drawerLayout, i, i2, i3);
            this.f2892a = luaObjectArr;
            this.f2893b = view;
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            LuaObject[] luaObjectArr = this.f2892a;
            if (luaObjectArr[0] != null) {
                luaObjectArr[0].callNoErr(Integer.valueOf(this.f2893b.getId()), this.f2893b, view);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            LuaObject[] luaObjectArr = this.f2892a;
            if (luaObjectArr[1] != null) {
                luaObjectArr[1].callNoErr(Integer.valueOf(this.f2893b.getId()), this.f2893b, view);
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            LuaObject[] luaObjectArr = this.f2892a;
            if (luaObjectArr[2] == null) {
                return false;
            }
            return luaObjectArr[2].callBoolNoErr(Integer.valueOf(this.f2893b.getId()), this.f2893b, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$x */
    public class C1263x implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2894a;

        /* renamed from: b */
        final /* synthetic */ C1298d f2895b;

        /* renamed from: c */
        final /* synthetic */ boolean f2896c;

        C1263x(Aid_luaCode aid_luaCode, boolean z, C1298d dVar, boolean z2) {
            this.f2894a = z;
            this.f2895b = dVar;
            this.f2896c = z2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f2894a) {
                int id = adapterView.getId();
                C1298d dVar = this.f2895b;
                dVar.mo11693d("onitemselected" + id, Integer.valueOf(id), adapterView, view, Integer.valueOf(i), Long.valueOf(j));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (this.f2896c) {
                int id = adapterView.getId();
                C1298d dVar = this.f2895b;
                dVar.mo11693d("onnothingselected" + id, Integer.valueOf(id), adapterView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$x0 */
    public class C1264x0 implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject[] f2897a;

        C1264x0(Aid_luaCode aid_luaCode, LuaObject[] luaObjectArr) {
            this.f2897a = luaObjectArr;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.f2897a[2] != null) {
                int id = seekBar.getId();
                this.f2897a[2].callNoErr(Integer.valueOf(id), seekBar, Integer.valueOf(i), Boolean.valueOf(z));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (this.f2897a[1] != null) {
                int id = seekBar.getId();
                this.f2897a[1].callNoErr(Integer.valueOf(id), seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f2897a[0] != null) {
                int id = seekBar.getId();
                this.f2897a[0].callNoErr(Integer.valueOf(id), seekBar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$y */
    public class C1265y implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2898a;

        /* renamed from: b */
        final /* synthetic */ C1298d f2899b;

        /* renamed from: c */
        final /* synthetic */ boolean f2900c;

        /* renamed from: d */
        final /* synthetic */ boolean f2901d;

        C1265y(Aid_luaCode aid_luaCode, boolean z, C1298d dVar, boolean z2, boolean z3) {
            this.f2898a = z;
            this.f2899b = dVar;
            this.f2900c = z2;
            this.f2901d = z3;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.f2901d) {
                int id = seekBar.getId();
                C1298d dVar = this.f2899b;
                dVar.mo11693d("onprogresschanged2" + id, Integer.valueOf(id), seekBar, Integer.valueOf(i), Boolean.valueOf(z));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (this.f2900c) {
                int id = seekBar.getId();
                C1298d dVar = this.f2899b;
                dVar.mo11693d("onstarttrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f2898a) {
                int id = seekBar.getId();
                C1298d dVar = this.f2899b;
                dVar.mo11693d("onstoptrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$y0 */
    class DialogInterface$OnClickListenerC1266y0 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2902a;

        DialogInterface$OnClickListenerC1266y0(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2902a = luaObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2902a.callxNoErr();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_luaCode$z */
    public class C1267z implements TabLayout.AbstractC1278d {

        /* renamed from: a */
        final /* synthetic */ boolean f2903a;

        /* renamed from: b */
        final /* synthetic */ View f2904b;

        /* renamed from: c */
        final /* synthetic */ C1298d f2905c;

        /* renamed from: d */
        final /* synthetic */ boolean f2906d;

        /* renamed from: e */
        final /* synthetic */ boolean f2907e;

        C1267z(Aid_luaCode aid_luaCode, boolean z, View view, C1298d dVar, boolean z2, boolean z3) {
            this.f2903a = z;
            this.f2904b = view;
            this.f2905c = dVar;
            this.f2906d = z2;
            this.f2907e = z3;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(TabLayout.C1283g gVar) {
            if (this.f2907e) {
                int id = this.f2904b.getId();
                C1298d dVar = this.f2905c;
                dVar.mo11693d("ontabreselected" + id, Integer.valueOf(id), this.f2904b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(TabLayout.C1283g gVar) {
            if (this.f2906d) {
                int id = this.f2904b.getId();
                C1298d dVar = this.f2905c;
                dVar.mo11693d("ontabunselected" + id, Integer.valueOf(id), this.f2904b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(TabLayout.C1283g gVar) {
            if (this.f2903a) {
                int id = this.f2904b.getId();
                C1298d dVar = this.f2905c;
                dVar.mo11693d("ontabselected" + id, Integer.valueOf(id), this.f2904b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_luaCode$z0 */
    class DialogInterface$OnClickListenerC1268z0 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LuaObject f2908a;

        DialogInterface$OnClickListenerC1268z0(Aid_luaCode aid_luaCode, LuaObject luaObject) {
            this.f2908a = luaObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2908a.callxNoErr();
        }
    }

    public Aid_luaCode(Activity activity) {
        this.f2783c = activity;
        this.f2782b = activity;
        this.f2785e = new HandlerC1237k(activity.getMainLooper());
    }

    public Aid_luaCode(Activity activity, C1298d dVar) {
        this.f2783c = activity;
        this.f2782b = activity;
        this.f2784d = dVar;
        this.f2785e = new HandlerC1230g0(activity.getMainLooper());
    }

    public Aid_luaCode(Context context, Activity activity) {
        this.f2783c = context;
        this.f2782b = activity;
        this.f2785e = new HandlerC1259v(context.getMainLooper());
    }

    public Aid_luaCode(Context context, Activity activity, C1298d dVar) {
        this.f2783c = context;
        this.f2782b = activity;
        this.f2784d = dVar;
        this.f2785e = new HandlerC1252r0(context.getMainLooper());
    }

    /* renamed from: A */
    private void m3274A(File file) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        C0851m.m1975a(this.f2783c, intent, file, C0860r.m2057p(file));
        this.f2783c.startActivity(intent);
    }

    @TargetApi(11)
    /* renamed from: B */
    private void m3275B(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: C */
    private void m3276C(WebView webView, String str, StringBuffer stringBuffer, C1298d dVar) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(this.f2783c.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(this.f2783c.getApplicationContext().getDir("database", 0).getPath());
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
        if (addViewEventItme(stringBuffer, str, webView.getId(), "ondownloadstart", "st_vId,st_vW,st_url,st_uT,st_cN,st_mE,st_cH")) {
            new C1325l(webView, dVar);
        } else {
            webView.setDownloadListener(new C1234i0(this));
        }
        new C1443b().mo12145f(webView, str, stringBuffer, this.f2782b, dVar, this);
        m3275B(webView);
    }

    /* renamed from: D */
    private void m3277D(String str) {
        C0839h.m1891G(this.f2783c, str);
    }

    /* renamed from: E */
    private String[] m3278E(String str, char c) {
        return C0861s.m2069b(str, c);
    }

    /* renamed from: F */
    private String m3279F(String str) {
        return str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
    }

    /* renamed from: G */
    private void m3280G(Camera camera) {
        Camera.Parameters parameters;
        if (camera != null && (parameters = camera.getParameters()) != null) {
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            String flashMode = parameters.getFlashMode();
            if (supportedFlashModes != null && !"off".equals(flashMode) && supportedFlashModes.contains("off")) {
                parameters.setFlashMode("off");
                camera.setParameters(parameters);
            }
        }
    }

    /* renamed from: H */
    private void m3281H(Camera camera) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        if (camera != null && (parameters = camera.getParameters()) != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !"torch".equals(parameters.getFlashMode()) && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            camera.setParameters(parameters);
        }
    }

    /* renamed from: a */
    private int m3282a(String str) {
        return (int) Double.parseDouble(str);
    }

    public static void degclear() {
        C0864v.f1800j.clear();
        f2779f.clear();
        f2780g = 0;
    }

    /* renamed from: f */
    private void m3287f(View view, int i, String str, StringBuffer stringBuffer, C1298d dVar) {
        if (addViewEventItme(stringBuffer, str, i, "clicki", "st_vId,st_vW")) {
            view.setOnClickListener(new View$OnClickListenerC1243n(this, dVar));
        }
        if (addViewEventItme(stringBuffer, str, i, "touchmonitor", "st_vId,st_vW,st_eA,st_eX,st_eY,st_rX,st_rY")) {
            view.setOnTouchListener(new View$OnTouchListenerC1245o(this, dVar));
        }
        if (addViewEventItme(stringBuffer, str, i, "press", "st_vId,st_vW")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1247p(this, dVar));
        }
        if (addViewEventItme(stringBuffer, str, i, "keyboard", "st_vId,st_vW,st_kC,st_eA,st_eR,st_eT")) {
            view.setOnKeyListener(new View$OnKeyListenerC1249q(this, dVar));
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            String c = C0860r.m2044c(str, "<eventItme type=\"pressmenu\">", "</eventItme>");
            String[] split = c.split("\ncase ");
            for (int i2 = 1; i2 < split.length; i2++) {
                stringBuffer.append("function onCreateContextMenu" + i + "x" + i2 + "()\n" + C0860r.m2044c(split[i2], ":", "\nbreak") + "\nend\n");
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            if (c2 != null) {
                stringBuffer.append("function onCreateContextMenu" + i + "x0(st_vId,st_vW)\n" + c2 + "\nend\n");
            }
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1251r(this, dVar));
        }
        if (view instanceof TextView) {
            if (addViewEventItme(stringBuffer, str, i, "editormonitor", "st_vId,st_vW,st_aI,st_eA,st_eR,st_eK,st_eT")) {
                ((TextView) view).setOnEditorActionListener(new C1253s(this, dVar));
            }
            boolean addViewEventItme = addViewEventItme(stringBuffer, str, i, "ontextchanged", "st_vId,st_vW,st_sS,st_sT,st_bE,st_cT");
            boolean addViewEventItme2 = addViewEventItme(stringBuffer, str, i, "beforetextchanged", "st_vId,st_vW,st_sS,st_sT,st_cT,st_aR");
            boolean addViewEventItme3 = addViewEventItme(stringBuffer, str, i, "aftertextchanged", "st_vId,st_vW,st_sS");
            if (addViewEventItme || addViewEventItme2 || addViewEventItme3) {
                new C1355r((TextView) view, dVar, addViewEventItme, addViewEventItme2, addViewEventItme3);
            }
        }
        if (view instanceof WebView) {
            m3276C((WebView) view, str, stringBuffer, dVar);
        }
        if (addViewEventItme(stringBuffer, str, i, "focuschange", "st_vId,st_vW,st_hF")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1255t(this, dVar));
        }
        if (view instanceof AbsListView) {
            boolean addViewEventItme4 = addViewEventItme(stringBuffer, str, i, "onscrollstatechanged", "st_vId,st_vW,st_sE");
            boolean addViewEventItme5 = addViewEventItme(stringBuffer, str, i, "onscroll", "st_vId,st_vW,st_fM,st_vT,st_bT");
            if (addViewEventItme4 || addViewEventItme5) {
                ((AbsListView) view).setOnScrollListener(new C1257u(this, addViewEventItme4, dVar, addViewEventItme5));
            }
        }
        if (view instanceof AdapterView) {
            if (addViewEventItme(stringBuffer, str, i, "clickitem", "st_vId,st_vW,st_pN,st_iD,st_vW2")) {
                ((AdapterView) view).setOnItemClickListener(new C1261w(this, dVar));
            }
            boolean addViewEventItme6 = addViewEventItme(stringBuffer, str, i, "onitemselected", "st_vId,st_vW,st_vW2,st_pN,st_iD");
            boolean addViewEventItme7 = addViewEventItme(stringBuffer, str, i, "onnothingselected", "st_vId,st_vW");
            if (addViewEventItme6 || addViewEventItme7) {
                ((AdapterView) view).setOnItemSelectedListener(new C1263x(this, addViewEventItme6, dVar, addViewEventItme7));
            }
        }
        if (view instanceof ViewPager) {
            boolean addViewEventItme8 = addViewEventItme(stringBuffer, str, i, "onpageselected", "st_vId,st_vW,st_pN");
            boolean addViewEventItme9 = addViewEventItme(stringBuffer, str, i, "onpagescrolled", "st_vId,st_vW,st_pN,st_pT,st_pS");
            boolean addViewEventItme10 = addViewEventItme(stringBuffer, str, i, "onpagescrollstatechanged", "st_vId,st_vW,st_sE");
            if (addViewEventItme8 || addViewEventItme9 || addViewEventItme10) {
                new C1343o((ViewPager) view, dVar, addViewEventItme8, addViewEventItme9, addViewEventItme10);
            }
        }
        if (view instanceof DrawerLayout) {
            boolean addViewEventItme11 = addViewEventItme(stringBuffer, str, i, "ondrawerclosed", "st_vId,st_vW,st_dW");
            boolean addViewEventItme12 = addViewEventItme(stringBuffer, str, i, "ondraweropened", "st_vId,st_vW,st_dW");
            boolean addViewEventItme13 = addViewEventItme(stringBuffer, str, i, "onoptionsitemselected", "st_vId,st_vW,st_iM");
            if (addViewEventItme11 || addViewEventItme12 || addViewEventItme13) {
                new C1334m((DrawerLayout) view, dVar, addViewEventItme11, addViewEventItme12, addViewEventItme13);
            }
        }
        if ((view instanceof SeekBar) && (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">"))) {
            boolean addViewEventItme14 = addViewEventItme(stringBuffer, str, i, "onstarttrackingtouch", "st_vId,st_vW");
            boolean addViewEventItme15 = addViewEventItme(stringBuffer, str, i, "onstoptrackingtouch", "st_vId,st_vW");
            boolean addViewEventItme16 = addViewEventItme(stringBuffer, str, i, "onprogresschanged2", "st_vId,st_vW,st_nS,st_fR");
            if (addViewEventItme14 || addViewEventItme15 || addViewEventItme16) {
                ((SeekBar) view).setOnSeekBarChangeListener(new C1265y(this, addViewEventItme15, dVar, addViewEventItme14, addViewEventItme16));
            }
        }
        m3289h(view, str, stringBuffer, dVar);
    }

    /* renamed from: g */
    private void m3288g(View view, String str, LuaObject[] luaObjectArr) {
        if (str.equals("clicki")) {
            view.setOnClickListener(new View$OnClickListenerC1236j0(this, luaObjectArr));
        } else if (str.equals("touchmonitor")) {
            view.setOnTouchListener(new View$OnTouchListenerC1238k0(this, luaObjectArr));
        } else if (str.equals("press")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1240l0(this, luaObjectArr));
        } else if (str.equals("keyboard")) {
            view.setOnKeyListener(new View$OnKeyListenerC1242m0(this, luaObjectArr));
        } else if (str.equals("editormonitor")) {
            ((TextView) view).setOnEditorActionListener(new C1244n0(this, luaObjectArr));
        } else if (str.equals("addtextchanged")) {
            ((TextView) view).addTextChangedListener(new C1246o0(this, luaObjectArr, view));
        } else if (str.equals("ondownloadstart")) {
            ((WebView) view).setDownloadListener(new C1248p0(this, view, luaObjectArr));
        } else if (str.equals("webviewclient")) {
            new C1443b().mo12146g(view, luaObjectArr);
        } else if (str.equals("focuschange")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1250q0(this, luaObjectArr));
        } else if (str.equals("onscroll")) {
            ((AbsListView) view).setOnScrollListener(new C1254s0(this, luaObjectArr));
        } else if (str.equals("clickitem")) {
            ((AdapterView) view).setOnItemClickListener(new C1256t0(this, luaObjectArr));
        } else if (str.equals("onitemselected")) {
            ((AdapterView) view).setOnItemSelectedListener(new C1258u0(this, luaObjectArr));
        } else if (str.equals("onpagechange")) {
            ((ViewPager) view).setOnPageChangeListener(new C1260v0(this, luaObjectArr, view));
        } else if (str.equals("ondrawer")) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            Activity activity = this.f2782b;
            int i = C0839h.f1738b;
            int i2 = C0839h.f1739c;
            drawerLayout.setDrawerListener(new C1262w0(this, activity, drawerLayout, i, i2, i2, luaObjectArr, view));
        } else if (str.equals("onseekbarchange")) {
            ((SeekBar) view).setOnSeekBarChangeListener(new C1264x0(this, luaObjectArr));
        }
    }

    /* renamed from: h */
    private void m3289h(View view, String str, StringBuffer stringBuffer, C1298d dVar) {
        if ((view instanceof TabLayout) && (str.contains("<eventItme type=\"ontabselected\">") || str.contains("<eventItme type=\"ontabunselected\">") || str.contains("<eventItme type=\"ontabreselected\">"))) {
            ((TabLayout) view).addOnTabSelectedListener(new C1267z(this, addViewEventItme(stringBuffer, str, view.getId(), "ontabselected", "st_vId,st_vW,st_pN,st_tT,st_taB"), view, dVar, addViewEventItme(stringBuffer, str, view.getId(), "ontabunselected", "st_vId,st_vW,st_pN,st_tT,st_taB"), addViewEventItme(stringBuffer, str, view.getId(), "ontabreselected", "st_vId,st_vW,st_pN,st_tT,st_taB")));
        }
        if (view instanceof RecyclerView) {
            if (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscrolled\">")) {
                ((RecyclerView) view).addOnScrollListener(new C1210a0(this, addViewEventItme(stringBuffer, str, view.getId(), "onscrollstatechanged", "st_vId,st_vW,st_sE"), dVar, addViewEventItme(stringBuffer, str, view.getId(), "onscrolled", "st_vId,st_vW,st_fM,st_vT,st_bT,st_dX,st_dY,st_isB")));
            }
            if (str.contains("<eventItme type=\"clickitem\">")) {
                ((RecyclerView) view).addOnItemTouchListener(new C1216c0(this, new GestureDetector(this.f2783c, new C1213b0(this, addViewEventItme(stringBuffer, str, view.getId(), "clickitem", "st_vId,st_vW,st_pN,st_vW2"), view, dVar))));
            }
        }
        if ((view instanceof VerticalViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ((VerticalViewPager) view).setOnPageChangeListener(new C1219d0(this, addViewEventItme(stringBuffer, str, view.getId(), "onpageselected", "st_vId,st_vW,st_pN"), view, dVar, addViewEventItme(stringBuffer, str, view.getId(), "onpagescrolled", "st_vId,st_vW,st_pN,st_pT,st_pS"), addViewEventItme(stringBuffer, str, view.getId(), "onpagescrollstatechanged", "st_vId,st_vW,st_sE")));
        }
        if ((view instanceof SwipeRefreshLayout) && str.contains("<eventItme type=\"onrefresh\">")) {
            ((SwipeRefreshLayout) view).setOnRefreshListener(new C1222e0(this, addViewEventItme(stringBuffer, str, view.getId(), "onrefresh", "st_vId,st_vW"), view, dVar));
        }
        if ((view instanceof CompoundButton) && str.contains("<eventItme type=\"oncheckedchanged\">")) {
            ((CompoundButton) view).setOnCheckedChangeListener(new C1226f0(this, addViewEventItme(stringBuffer, str, view.getId(), "oncheckedchanged", "st_vId,st_vW,st_iC"), view, dVar));
        }
        if ((view instanceof AppBarLayout) && str.contains("<eventItme type=\"onoffsetchanged\">")) {
            ((AppBarLayout) view).addOnOffsetChangedListener(new C1232h0(this, addViewEventItme(stringBuffer, str, view.getId(), "onoffsetchanged", "st_vId,st_vW,st_vO"), dVar));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private synchronized int m3290i(String str) {
        Object obj = f2779f.get(str);
        if (obj != null) {
            return Integer.parseInt(obj.toString());
        }
        int i = f2780g + 10000;
        f2780g = i;
        f2779f.put(str, Integer.valueOf(i));
        return f2780g;
    }

    /* renamed from: j */
    private byte[] m3291j(String str, char c) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == c) {
                if (z) {
                    byteArrayOutputStream.write(Integer.parseInt(str.substring(i2, i)));
                    z = false;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                z = true;
            }
        }
        if (z) {
            byteArrayOutputStream.write(Integer.parseInt(str.substring(i2, i)));
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: k */
    private void m3292k(String str, Object obj, int i) {
        HashMap<String, Object> hashMap;
        if (!str.equals("null")) {
            if (i == 0) {
                hashMap = this.f2781a;
            } else if (i == 1) {
                hashMap = ss_dim;
            } else if (i == 2) {
                hashMap = C0864v.f1800j;
            } else {
                return;
            }
            hashMap.put(str, obj);
        }
    }

    /* renamed from: l */
    private Object m3293l(Object obj) {
        return obj instanceof Float ? Integer.valueOf(((Float) obj).intValue()) : obj instanceof Double ? Long.valueOf(((Double) obj).longValue()) : obj;
    }

    /* renamed from: m */
    private View m3294m(View view, Object obj, String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(46);
        if (indexOf == -1 || trim.indexOf(34) != -1) {
            String valueOf = String.valueOf(obj);
            int indexOf2 = valueOf.indexOf(46);
            if (indexOf2 == -1) {
                return view.findViewById(Integer.parseInt(valueOf));
            }
            String substring = valueOf.substring(0, indexOf2);
            String substring2 = valueOf.substring(indexOf2 + 1);
            Object obj2 = f2779f.get(substring);
            if (obj2 == null) {
                return null;
            }
            return view.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2779f.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return view.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: n */
    private View m3295n(Object obj, String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(46);
        if (indexOf == -1 || trim.indexOf(34) != -1) {
            String valueOf = String.valueOf(obj);
            int indexOf2 = valueOf.indexOf(46);
            if (indexOf2 == -1) {
                return this.f2782b.findViewById(Integer.parseInt(valueOf));
            }
            String substring = valueOf.substring(0, indexOf2);
            String substring2 = valueOf.substring(indexOf2 + 1);
            Object obj2 = f2779f.get(substring);
            if (obj2 == null) {
                return null;
            }
            return this.f2782b.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2779f.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return this.f2782b.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: o */
    private int m3296o() {
        try {
            Display defaultDisplay = this.f2782b.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return displayMetrics.heightPixels - displayMetrics2.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: p */
    private String[] m3297p() {
        String[] strArr = {"", ""};
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
            String[] split = bufferedReader.readLine().split("\\s+");
            for (int i = 2; i < split.length; i++) {
                strArr[0] = strArr[0] + split[i] + " ";
            }
            String[] split2 = bufferedReader.readLine().split("\\s+");
            strArr[1] = strArr[1] + split2[2];
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return strArr;
    }

    /* renamed from: q */
    private int[] m3298q() {
        return new int[]{this.f2782b.getWindowManager().getDefaultDisplay().getWidth(), this.f2782b.getWindowManager().getDefaultDisplay().getHeight()};
    }

    /* renamed from: r */
    private int[] m3299r() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: s */
    private String[] m3300s() {
        return new String[]{Build.MODEL, Build.BRAND, String.valueOf(Build.VERSION.SDK_INT)};
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: t */
    private String m3301t(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Byte[])) {
            return obj.toString();
        }
        byte[] bArr = (byte[]) obj;
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(' ');
            stringBuffer.append((int) b);
        }
        return stringBuffer.toString().trim();
    }

    /* renamed from: u */
    private int m3302u() {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return this.f2783c.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: v */
    private int m3303v() {
        int identifier = this.f2783c.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f2783c.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: w */
    private String m3304w(String str) {
        return C0839h.m1906o(this.f2783c, str);
    }

    /* renamed from: x */
    private GradientDrawable.Orientation m3305x(String str) {
        return str.equals("topbottom") ? GradientDrawable.Orientation.TOP_BOTTOM : str.equals("trbl") ? GradientDrawable.Orientation.TR_BL : str.equals("rightleft") ? GradientDrawable.Orientation.RIGHT_LEFT : str.equals("brtl") ? GradientDrawable.Orientation.BR_TL : str.equals("bottomtop") ? GradientDrawable.Orientation.BOTTOM_TOP : str.equals("bltr") ? GradientDrawable.Orientation.BL_TR : str.equals("leftright") ? GradientDrawable.Orientation.LEFT_RIGHT : str.equals("tlbr") ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TOP_BOTTOM;
    }

    /* renamed from: y */
    private String m3306y(String str) {
        String c;
        String c2;
        Intent launchIntentForPackage = this.f2783c.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null || (c = C0860r.m2044c(launchIntentForPackage.toString(), "cmp=", " ")) == null || (c2 = C0860r.m2044c(c, "/", null)) == null) {
            return "";
        }
        if (!c2.startsWith(".")) {
            return c2;
        }
        return str + c2;
    }

    /* renamed from: z */
    private void m3307z(C0836g gVar, LuaObject luaObject, LuaObject luaObject2) {
        if (gVar != null) {
            gVar.f1731j = luaObject;
            gVar.f1732k = luaObject2;
            gVar.mo8932s(new C1212b(this));
        }
    }

    public boolean addViewEventItme(StringBuffer stringBuffer, String str, int i, String str2, String str3) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        stringBuffer.append("function " + str2 + i + "(" + str3 + ")\n" + c + "\nend\n");
        return true;
    }

    public Object addv(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            if ((view instanceof ViewPager) || (view instanceof VerticalViewPager)) {
                ArrayList arrayList = new ArrayList();
                String[] E = m3278E(str, '|');
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                for (String str2 : E) {
                    String trim = str2.trim();
                    if (trim.endsWith(".ilua")) {
                        LinearLayout linearLayout = new LinearLayout(this.f2783c);
                        linearLayout.setLayoutParams(layoutParams);
                        linearLayout.setOrientation(1);
                        openRestoreinterface(trim, linearLayout, m3290i(trim.substring(0, trim.length() - 5)), null);
                        arrayList.add(linearLayout);
                    }
                }
                new C1437s(view, arrayList);
                return arrayList;
            } else if ((view instanceof DrawerLayout) || (view instanceof ViewGroup)) {
                String[] E2 = m3278E(str, '|');
                for (String str3 : E2) {
                    String trim2 = str3.trim();
                    if (trim2.endsWith(".ilua")) {
                        openRestoreinterface(str3.trim(), (ViewGroup) view, m3290i(trim2.substring(0, trim2.length() - 5)), null);
                    }
                }
            }
        }
        return null;
    }

    public ArrayList<Object> aslist(ArrayList<Object> arrayList, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public ArrayList<Object> aslist(ArrayList<Object> arrayList, LuaObject luaObject, int i) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                arrayList.add(i, obj);
            }
        }
        return arrayList;
    }

    public MediaPlayer bfm(String str) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (!C0839h.m1895d(this.f2783c, mediaPlayer, str)) {
            return null;
        }
        return mediaPlayer;
    }

    public Object bfms(Object obj, String str) {
        int currentPosition;
        if (!(obj instanceof MediaPlayer)) {
            return null;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) obj;
        if (str == null) {
            return null;
        }
        if (str.equals("st")) {
            try {
                mediaPlayer.start();
                return null;
            } catch (IllegalStateException unused) {
                return null;
            }
        } else if (str.equals("pe")) {
            mediaPlayer.pause();
            return null;
        } else if (str.equals("sp")) {
            mediaPlayer.stop();
            return null;
        } else if (str.equals("re")) {
            mediaPlayer.release();
            return null;
        } else if (str.equals("ip")) {
            try {
                return Boolean.valueOf(mediaPlayer.isPlaying());
            } catch (IllegalStateException unused2) {
                return Boolean.FALSE;
            }
        } else {
            if (str.equals("dn")) {
                currentPosition = mediaPlayer.getDuration();
            } else if (str.equals("cn")) {
                currentPosition = mediaPlayer.getCurrentPosition();
            } else {
                try {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                } catch (Exception unused3) {
                }
                C0839h.m1895d(this.f2783c, mediaPlayer, str);
                return null;
            }
            return Integer.valueOf(currentPosition);
        }
    }

    public Object bfms(Object obj, String str, int i) {
        if (!(obj instanceof MediaPlayer)) {
            return null;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) obj;
        if (str == null || !str.equals("seekto")) {
            return null;
        }
        mediaPlayer.seekTo(i);
        return null;
    }

    public Object bfms(Object obj, String str, int i, int i2) {
        if (!(obj instanceof MediaPlayer)) {
            return null;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) obj;
        if (str == null || !str.equals("volume")) {
            return null;
        }
        mediaPlayer.setVolume((float) i, (float) i2);
        return null;
    }

    public Object bfms(Object obj, String str, boolean z) {
        if (!(obj instanceof MediaPlayer)) {
            return null;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) obj;
        if (str == null || !str.equals("sl")) {
            return null;
        }
        mediaPlayer.setLooping(z);
        return null;
    }

    public void bfs(Object obj, int i, String str) {
        if (obj instanceof Bitmap) {
            C0849k.m1968h((Bitmap) obj, i, m3304w(str));
        }
    }

    public void bfs(Object obj, String str) {
        if (obj instanceof Bitmap) {
            C0849k.m1968h((Bitmap) obj, 100, m3304w(str));
        }
    }

    public void bfv(String str) {
        Intent intent = new Intent(this.f2783c, Videoview.class);
        Bundle bundle = new Bundle();
        bundle.putString("video", str);
        bundle.putBoolean("sfhp", false);
        intent.putExtras(bundle);
        this.f2783c.startActivity(intent);
    }

    public void bfv(String str, boolean z) {
        Intent intent = new Intent(this.f2783c, Videoview.class);
        Bundle bundle = new Bundle();
        bundle.putString("video", str);
        bundle.putBoolean("sfhp", z);
        intent.putExtras(bundle);
        this.f2783c.startActivity(intent);
    }

    public void bfvs(Object obj, Object obj2) {
        Uri c;
        if (!(obj instanceof VideoView)) {
            Object l = m3293l(obj);
            obj = m3295n(l, String.valueOf(l));
        }
        VideoView videoView = (VideoView) obj;
        if (obj2 instanceof Uri) {
            c = (Uri) obj2;
        } else {
            String valueOf = String.valueOf(obj2);
            if (C0860r.m2063v(valueOf.toLowerCase())) {
                c = C0851m.m1977c(this.f2783c, valueOf);
            } else {
                videoView.setVideoPath(m3304w(valueOf));
                return;
            }
        }
        videoView.setVideoURI(c);
    }

    public Object bfvss(Object obj, String str) {
        int currentPosition;
        if (!(obj instanceof VideoView)) {
            Object l = m3293l(obj);
            obj = m3295n(l, String.valueOf(l));
        }
        VideoView videoView = (VideoView) obj;
        if (str.equals("st")) {
            videoView.requestFocus();
            videoView.start();
            return null;
        } else if (str.equals("pe")) {
            videoView.pause();
            return null;
        } else if (str.equals("sp")) {
            videoView.stopPlayback();
            return null;
        } else if (str.equals("media")) {
            MediaController mediaController = new MediaController(this.f2783c);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            return mediaController;
        } else if (str.equals("ip")) {
            try {
                return Boolean.valueOf(videoView.isPlaying());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } else {
            if (str.equals("dn")) {
                currentPosition = videoView.getDuration();
            } else if (!str.equals("cn")) {
                return null;
            } else {
                currentPosition = videoView.getCurrentPosition();
            }
            return Integer.valueOf(currentPosition);
        }
    }

    public Object bfvss(Object obj, String str, int i) {
        if (!(obj instanceof VideoView)) {
            Object l = m3293l(obj);
            obj = m3295n(l, String.valueOf(l));
        }
        VideoView videoView = (VideoView) obj;
        if (!str.equals("seekto")) {
            return null;
        }
        videoView.seekTo(i);
        return null;
    }

    public void blp(String str, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1340n nVar = C1340n.f3148n;
            if (nVar == null) {
                C1340n nVar2 = new C1340n(this.f2782b);
                C1340n.f3148n = nVar2;
                nVar2.mo11986n(m3304w(str), i, i2, i3, i4);
                return;
            }
            nVar.mo11984j(m3304w(str), i, i2, i3, i4);
        }
    }

    public boolean blp(String str) {
        if (Build.VERSION.SDK_INT < 21 || C1340n.f3148n == null) {
            return false;
        }
        if (str.equals("st")) {
            C1340n.f3148n.mo11988p(true);
            return true;
        } else if (str.equals("sp")) {
            C1340n.f3148n.mo11988p(false);
            return true;
        } else if (str.equals("re")) {
            C1340n.f3148n.mo11987o();
            C1340n.f3148n = null;
            return true;
        } else if (str.equals("ip")) {
            return C1340n.f3148n.mo11983i();
        } else {
            return false;
        }
    }

    public MediaRecorder bly(MediaRecorder mediaRecorder, String str) {
        if (!str.equals("sp")) {
            MediaRecorder mediaRecorder2 = new MediaRecorder();
            mediaRecorder2.setAudioSource(1);
            mediaRecorder2.setOutputFormat(0);
            String w = m3304w(str);
            C0835f.m1845b(w, false);
            mediaRecorder2.setOutputFile(w);
            mediaRecorder2.setAudioEncoder(0);
            try {
                mediaRecorder2.prepare();
                mediaRecorder2.start();
                return mediaRecorder2;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else if (mediaRecorder == null) {
            return null;
        } else {
            try {
                mediaRecorder.stop();
                mediaRecorder.release();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    public String btoo(String str, String str2) {
        byte[] bArr;
        try {
            bArr = m3291j(str2.trim(), ' ');
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        if (str == null) {
            return new String(bArr);
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String btoo(String str, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (str == null) {
            return new String(bArr);
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void btoo(String str, String str2, boolean z) {
        byte[] bArr;
        try {
            bArr = m3291j(str2.trim(), ' ');
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr != null) {
            String w = m3304w(str);
            File file = new File(w);
            if (z || !file.exists()) {
                C0835f.m1853j(w, bArr);
            }
        }
    }

    public void btoo(byte[] bArr, String str, boolean z) {
        if (bArr != null) {
            String w = m3304w(str);
            File file = new File(w);
            if (z || !file.exists()) {
                C0835f.m1853j(w, bArr);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public Object call(String str, String str2) {
        if (str.equals("myu")) {
            Object obj = C0864v.f1802l.get(str2 + "0");
            if (obj == null) {
                String substring = str2.substring(0, str2.indexOf(46) + 1);
                for (String str3 : C0864v.f1802l.keySet()) {
                    if (str3.toString().startsWith(substring)) {
                        return null;
                    }
                }
                m3277D(substring + "myu");
                obj = C0864v.f1802l.get(str2 + "0");
            }
            String obj2 = obj.toString();
            C0839h.m1889E(this.f2783c, this.f2782b, str2, obj2.substring(obj2.indexOf(10)).trim());
        } else if (str.equals("mjava")) {
            C1309h hVar = new C1309h(this.f2783c);
            try {
                hVar.set("activity", this.f2783c);
                hVar.set("i", new Aid_javaCode(this.f2783c, this.f2782b, hVar));
            } catch (EvalError e) {
                e.printStackTrace();
            }
            int indexOf = str2.indexOf(46);
            if (hVar.mo11945e(str2.substring(0, indexOf) + ".mjava")) {
                return hVar.mo11941a(str2.substring(indexOf + 1));
            }
        } else if (str.equals("mlua")) {
            int indexOf2 = str2.indexOf(46);
            String str4 = "$_Call_SsS_" + Thread.currentThread().getId() + "_return";
            String str5 = "require 'import'\nrequire '" + str2.substring(0, indexOf2) + "'\nlocal returns = " + str2.substring(indexOf2 + 1) + "()\ni:sss(\"" + str4 + "\", returns)";
            C1298d dVar = new C1298d(this.f2783c);
            dVar.mo11700l("activity", this.f2783c);
            dVar.mo11700l("i", new Aid_luaCode(this.f2783c, this.f2782b, dVar));
            dVar.mo11699k();
            try {
                dVar.mo11696h(str5);
                return C0864v.f1800j.get(str4);
            } catch (LuaException e2) {
                e2.printStackTrace();
                C0864v.m2157O2("LuaErr：\n" + e2.getMessage());
            }
        } else if (str.equals("mjs")) {
            int indexOf3 = str2.indexOf(46);
            StringBuilder sb = new StringBuilder();
            sb.append("<html><head><script type='text/javascript'>");
            sb.append(C0839h.m1896e(this.f2783c, "import.mjs"));
            sb.append("\n");
            sb.append(C0839h.m1892a(this.f2783c, str2.substring(0, indexOf3) + ".mjs"));
            sb.append("\n\nvar returns = ");
            sb.append(str2.substring(indexOf3 + 1));
            sb.append("();</script></head></html>");
            String sb2 = sb.toString();
            android.webkit.WebView webView = new android.webkit.WebView(this.f2783c);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setAppCachePath(this.f2783c.getApplicationContext().getDir("cache", 0).getPath());
            webView.getSettings().setAppCacheMaxSize(8388608);
            webView.getSettings().setDatabaseEnabled(true);
            webView.getSettings().setDatabasePath(this.f2783c.getApplicationContext().getDir("database", 0).getPath());
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setGeolocationEnabled(true);
            webView.getSettings().setLightTouchEnabled(true);
            webView.getSettings().setCacheMode(-1);
            webView.getSettings().setPluginState(WebSettings.PluginState.ON);
            webView.setWebChromeClient(new C1241m(this));
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            }
            webView.addJavascriptInterface(new Aid_jsCode(this.f2783c, this.f2782b, webView, 0), "I");
            C1295c.m3509d(webView, sb2);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public Object call(String str, String str2, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        int length = objArr.length;
        if (str.equals("myu")) {
            Object obj = C0864v.f1802l.get(str2 + length);
            if (obj == null) {
                String substring = str2.substring(0, str2.indexOf(46) + 1);
                for (String str3 : C0864v.f1802l.keySet()) {
                    if (str3.toString().startsWith(substring)) {
                        return null;
                    }
                }
                m3277D(substring + "myu");
                obj = C0864v.f1802l.get(str2 + length);
            }
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf(10);
            String[] E = m3278E(m3279F(obj2.substring(0, indexOf)), ',');
            if (length != E.length) {
                return null;
            }
            C0839h.m1890F(this.f2783c, this.f2782b, E, objArr, str2, obj2.substring(indexOf).trim());
        } else if (str.equals("mjava")) {
            C1309h hVar = new C1309h(this.f2783c);
            try {
                hVar.set("activity", this.f2783c);
                hVar.set("i", new Aid_javaCode(this.f2783c, this.f2782b, hVar));
            } catch (EvalError e2) {
                e2.printStackTrace();
            }
            int indexOf2 = str2.indexOf(46);
            if (hVar.mo11945e(str2.substring(0, indexOf2) + ".mjava")) {
                return hVar.mo11942b(str2.substring(indexOf2 + 1), objArr);
            }
        } else {
            String str4 = "_a";
            if (str.equals("mlua")) {
                long id = Thread.currentThread().getId();
                String str5 = "";
                String str6 = str5;
                int i = 0;
                while (i < length) {
                    String str7 = "$_Call_SsS_" + id + str4 + i;
                    C0864v.f1800j.put(str7, objArr[i]);
                    str6 = str6 + "local a" + i + " = i:sss(\"" + str7 + "\")\n";
                    str5 = str5 + ",a" + i;
                    i++;
                    str4 = str4;
                    length = length;
                }
                if (str5.length() > 0) {
                    str5 = str5.substring(1);
                }
                String str8 = "$_Call_SsS_" + id + "_return";
                int indexOf3 = str2.indexOf(46);
                String str9 = "require 'import'\nrequire '" + str2.substring(0, indexOf3) + "'\n" + str6 + "\nlocal returns = " + str2.substring(indexOf3 + 1) + "(" + str5 + ")\ni:sss(\"" + str8 + "\", returns)";
                C1298d dVar = new C1298d(this.f2783c);
                dVar.mo11700l("activity", this.f2783c);
                dVar.mo11700l("i", new Aid_luaCode(this.f2783c, this.f2782b, dVar));
                dVar.mo11699k();
                try {
                    dVar.mo11696h(str9);
                    return C0864v.f1800j.get(str8);
                } catch (LuaException e3) {
                    e3.printStackTrace();
                    C0864v.m2157O2("LuaErr：\n" + e3.getMessage());
                }
            } else {
                if (str.equals("mjs")) {
                    long id2 = Thread.currentThread().getId();
                    String str10 = "";
                    String str11 = str10;
                    for (int i2 = 0; i2 < length; i2++) {
                        String str12 = "$_Call_SsS_" + id2 + str4 + i2;
                        C0864v.f1800j.put(str12, objArr[i2]);
                        str11 = str11 + "var a" + i2 + " = I.sss(\"" + str12 + "\");\n";
                        str10 = str10 + ",a" + i2;
                    }
                    if (str10.length() > 0) {
                        str10 = str10.substring(1);
                    }
                    int indexOf4 = str2.indexOf(46);
                    StringBuilder sb = new StringBuilder();
                    sb.append("<html><head><script type='text/javascript'>");
                    sb.append(C0839h.m1896e(this.f2783c, "import.mjs"));
                    sb.append("\n");
                    sb.append(C0839h.m1892a(this.f2783c, str2.substring(0, indexOf4) + ".mjs"));
                    sb.append("\n");
                    sb.append(str11);
                    sb.append("\nvar returns = ");
                    sb.append(str2.substring(indexOf4 + 1));
                    sb.append("(");
                    sb.append(str10);
                    sb.append(");</script></head></html>");
                    String sb2 = sb.toString();
                    android.webkit.WebView webView = new android.webkit.WebView(this.f2783c);
                    webView.getSettings().setAllowFileAccess(true);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setAppCacheEnabled(true);
                    webView.getSettings().setAppCachePath(this.f2783c.getApplicationContext().getDir("cache", 0).getPath());
                    webView.getSettings().setAppCacheMaxSize(8388608);
                    webView.getSettings().setDatabaseEnabled(true);
                    webView.getSettings().setDatabasePath(this.f2783c.getApplicationContext().getDir("database", 0).getPath());
                    webView.getSettings().setDomStorageEnabled(true);
                    webView.getSettings().setGeolocationEnabled(true);
                    webView.getSettings().setLightTouchEnabled(true);
                    webView.getSettings().setCacheMode(-1);
                    webView.getSettings().setPluginState(WebSettings.PluginState.ON);
                    webView.setWebChromeClient(new C1239l(this));
                    if (Build.VERSION.SDK_INT >= 11) {
                        webView.removeJavascriptInterface("searchBoxJavaBridge_");
                        webView.removeJavascriptInterface("accessibility");
                        webView.removeJavascriptInterface("accessibilityTraversal");
                    }
                    webView.addJavascriptInterface(new Aid_jsCode(this.f2783c, this.f2782b, webView, 0), "I");
                    C1295c.m3509d(webView, sb2);
                }
                return null;
            }
        }
        return null;
    }

    public Object cast(Object obj, Object obj2) {
        return (obj instanceof Class ? (Class) obj : obj instanceof String ? C0832d.m1816a(String.valueOf(obj)) : obj.getClass()).cast(obj2);
    }

    public void clear_s_dim() {
        this.f2781a.clear();
    }

    public Class<?> cls(ClassLoader classLoader, String str) {
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Class<?> cls(String str) {
        return C0832d.m1817b(str);
    }

    public Object[] clssm(Class<?> cls, String str) {
        if (str.equals("init")) {
            return cls.getDeclaredConstructors();
        }
        if (str.equals("method")) {
            return cls.getDeclaredMethods();
        }
        if (str.equals("field")) {
            return cls.getDeclaredFields();
        }
        return null;
    }

    /* renamed from: dh */
    public Object mo11133dh(AbstractC0918a aVar, String str) {
        if (str.equals("cancel")) {
            aVar.mo9111b();
            return null;
        } else if (str.equals("clone")) {
            return aVar.clone();
        } else {
            if (str.equals("start")) {
                aVar.mo9120j();
                return null;
            } else if (str.equals("running")) {
                return Boolean.valueOf(aVar.mo9115e());
            } else {
                return null;
            }
        }
    }

    /* renamed from: dh */
    public Object mo11134dh(AbstractC0918a aVar, String str, Object obj) {
        View view;
        if (str.equals("duration")) {
            aVar.mo9117g(Long.parseLong(m3293l(obj).toString()));
            return null;
        } else if (str.equals("delay")) {
            aVar.mo9118h(Long.parseLong(m3293l(obj).toString()));
            return null;
        } else if (!str.equals("target")) {
            return null;
        } else {
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                Object l = m3293l(obj);
                view = m3295n(l, String.valueOf(l));
            }
            aVar.mo9119i(view);
            return null;
        }
    }

    /* renamed from: dh */
    public Object mo11135dh(C0921c cVar, String str) {
        if (str.equals("cancel")) {
            cVar.mo9111b();
            return null;
        } else if (str.equals("clone")) {
            return cVar.clone();
        } else {
            if (str.equals("start")) {
                cVar.mo9120j();
                return null;
            } else if (str.equals("running")) {
                return Boolean.valueOf(cVar.mo9115e());
            } else {
                return null;
            }
        }
    }

    /* renamed from: dh */
    public Object mo11136dh(C0921c cVar, String str, Object obj) {
        View view;
        if (str.equals("duration")) {
            cVar.mo9130u(Long.parseLong(m3293l(obj).toString()));
            return null;
        } else if (str.equals("delay")) {
            cVar.mo9118h(Long.parseLong(m3293l(obj).toString()));
            return null;
        } else if (!str.equals("target")) {
            return null;
        } else {
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                Object l = m3293l(obj);
                view = m3295n(l, String.valueOf(l));
            }
            cVar.mo9119i(view);
            return null;
        }
    }

    /* renamed from: dh */
    public void mo11137dh(Animation animation, String str) {
        if (str.equals("cancel")) {
            animation.cancel();
        } else if (str.equals("reset")) {
            animation.reset();
        } else if (str.equals("start")) {
            animation.start();
        }
    }

    /* renamed from: dh */
    public void mo11138dh(Animation animation, String str, Object obj) {
        Boolean bool = Boolean.TRUE;
        if (str.equals("duration")) {
            animation.setDuration(Long.parseLong(m3293l(obj).toString()));
        } else if (str.equals("delay")) {
            animation.setStartOffset(Long.parseLong(m3293l(obj).toString()));
        } else if (str.equals("enabled")) {
            animation.setFillEnabled(obj.equals(bool));
        } else if (str.equals("after")) {
            animation.setFillAfter(obj.equals(bool));
        } else if (str.equals("before")) {
            animation.setFillBefore(obj.equals(bool));
        } else if (str.equals("repeat")) {
            animation.setRepeatCount(Integer.parseInt(m3293l(obj).toString()));
        }
    }

    /* renamed from: dh */
    public void mo11139dh(AnimationSet animationSet, String str) {
        if (str.equals("cancel")) {
            animationSet.cancel();
        } else if (str.equals("reset")) {
            animationSet.reset();
        } else if (str.equals("start")) {
            animationSet.start();
        }
    }

    /* renamed from: dh */
    public void mo11140dh(AnimationSet animationSet, String str, Object obj) {
        Boolean bool = Boolean.TRUE;
        if (str.equals("duration")) {
            animationSet.setDuration(Long.parseLong(m3293l(obj).toString()));
        } else if (str.equals("enabled")) {
            animationSet.setFillEnabled(obj.equals(bool));
        } else if (str.equals("after")) {
            animationSet.setFillAfter(obj.equals(bool));
        } else if (str.equals("before")) {
            animationSet.setFillBefore(obj.equals(bool));
        } else if (str.equals("delay")) {
            animationSet.setStartOffset(Long.parseLong(m3293l(obj).toString()));
        } else if (str.equals("repeat")) {
            animationSet.setRepeatCount(Integer.parseInt(m3293l(obj).toString()));
        } else if (str.equals("add")) {
            animationSet.addAnimation((Animation) obj);
        }
    }

    public AlphaAnimation dha(boolean z, boolean z2) {
        float f = 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (!z2) {
            f = 0.0f;
        }
        return new AlphaAnimation(f2, f);
    }

    public C0934i dhas(Object obj, String str, LuaObject luaObject) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        Object[] objArr = null;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int length = objArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = Float.parseFloat(objArr[i].toString());
        }
        return C0934i.m2550K(view, str, fArr);
    }

    public C0921c dhast(String str, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        int length = objArr.length;
        AbstractC0918a[] aVarArr = new AbstractC0918a[length];
        for (int i = 0; i < length; i++) {
            aVarArr[i] = (AbstractC0918a) objArr[i];
        }
        C0921c cVar = new C0921c();
        if (str.equals("sequen")) {
            cVar.mo9128s(aVarArr);
        } else if (str.equals("together")) {
            cVar.mo9129t(aVarArr);
        }
        return cVar;
    }

    public AnimationDrawable dhb(boolean z) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(z);
        return animationDrawable;
    }

    public Object dhb(AnimationDrawable animationDrawable, String str) {
        if (str.equals("start")) {
            animationDrawable.start();
            return null;
        } else if (str.equals("stop")) {
            animationDrawable.stop();
            return null;
        } else if (str.equals("running")) {
            return Boolean.valueOf(animationDrawable.isRunning());
        } else {
            return null;
        }
    }

    public void dhb(AnimationDrawable animationDrawable, Object obj, int i) {
        animationDrawable.addFrame(obj instanceof Drawable ? (Drawable) obj : obj instanceof Bitmap ? new BitmapDrawable((Bitmap) obj) : C1305g.m3582m(String.valueOf(m3293l(obj)), this.f2783c), i);
    }

    public void dhon(Animation animation, LuaObject luaObject, LuaObject luaObject2, LuaObject luaObject3) {
        animation.setAnimationListener(new animationAnimation$AnimationListenerC1218d(this, luaObject, luaObject2, luaObject3));
    }

    public void dhon(AbstractC0918a aVar, LuaObject luaObject, LuaObject luaObject2, LuaObject luaObject3, LuaObject luaObject4) {
        aVar.mo9110a(new C1221e(this, luaObject, luaObject2, luaObject3, luaObject4));
    }

    public RotateAnimation dhr(float f, float f2) {
        return new RotateAnimation(f, f2);
    }

    public RotateAnimation dhr(float f, float f2, int i, float f3, int i2, float f4) {
        return new RotateAnimation(f, f2, i, f3, i2, f4);
    }

    public ScaleAnimation dhs(float f, float f2, float f3, float f4) {
        return new ScaleAnimation(f, f2, f3, f4);
    }

    public ScaleAnimation dhs(float f, float f2, float f3, float f4, int i, float f5, int i2, float f6) {
        return new ScaleAnimation(f, f2, f3, f4, i, f5, i2, f6);
    }

    public AnimationSet dhset(AnimationSet animationSet, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        for (Object obj : objArr) {
            animationSet.addAnimation((Animation) obj);
        }
        return animationSet;
    }

    public AnimationSet dhset(boolean z, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        AnimationSet animationSet = new AnimationSet(z);
        for (Object obj : objArr) {
            animationSet.addAnimation((Animation) obj);
        }
        return animationSet;
    }

    public TranslateAnimation dht(float f, float f2, float f3, float f4) {
        return new TranslateAnimation(f, f2, f3, f4);
    }

    public void dim(String str, Object obj) {
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
            if (substring.equals("ss")) {
                m3292k(str, obj, 1);
                return;
            } else if (substring.equals("sss")) {
                m3292k(str, obj, 2);
                return;
            }
        }
        this.f2781a.put(str, obj);
    }

    public Object dimget(String str) {
        HashMap<String, Object> hashMap;
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String trim = str.substring(0, indexOf).trim();
            str = str.substring(indexOf + 1).trim();
            if (trim.equals("ss")) {
                hashMap = ss_dim;
            } else if (trim.equals("sss")) {
                hashMap = C0864v.f1800j;
            }
            return hashMap.get(str);
        }
        hashMap = this.f2781a;
        return hashMap.get(str);
    }

    public void dslist(ArrayList<Object> arrayList, Object obj) {
        Object l = m3293l(obj);
        if ((l instanceof Integer) || (l instanceof Double)) {
            int parseInt = Integer.parseInt(String.valueOf(l));
            if (parseInt == -1) {
                arrayList.clear();
            } else {
                arrayList.remove(parseInt);
            }
        } else {
            arrayList.remove(l);
        }
    }

    public void endi() {
        this.f2782b.finish();
    }

    public void endkeyboard() {
        View peekDecorView = this.f2782b.getWindow().peekDecorView();
        if (peekDecorView != null) {
            ((InputMethodManager) this.f2783c.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
    }

    public void ends() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        this.f2783c.startActivity(intent);
    }

    public void endutw() {
        AlertDialog alertDialog = alertdialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            alertdialog = null;
        }
    }

    /* renamed from: fc */
    public boolean mo11163fc(String str, String str2) {
        return C0839h.m1897f(this.f2783c, str, str2, true);
    }

    /* renamed from: fc */
    public boolean mo11164fc(String str, String str2, boolean z) {
        return C0839h.m1897f(this.f2783c, str, str2, z);
    }

    /* renamed from: fd */
    public boolean mo11165fd(String str) {
        File file = new File(m3304w(str));
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public String fdir() {
        return C0835f.f1721a;
    }

    public String fdir(String str) {
        return m3304w(str);
    }

    /* renamed from: fe */
    public boolean mo11168fe(String str) {
        return C0839h.m1898g(this.f2783c, str);
    }

    /* renamed from: fi */
    public boolean mo11169fi(String str) {
        return new File(m3304w(str)).isDirectory();
    }

    /* renamed from: fj */
    public boolean mo11170fj(String str, String str2) {
        String w = m3304w(str2);
        C0835f.m1845b(w, false);
        try {
            C0834e.m1837c(m3304w(str), w, true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: fj */
    public boolean mo11171fj(String str, String str2, boolean z) {
        String w = m3304w(str2);
        C0835f.m1845b(w, false);
        try {
            C0834e.m1837c(m3304w(str), w, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: fl */
    public Object[] mo11172fl(String str) {
        return C0839h.m1899h(this.f2783c, str);
    }

    /* renamed from: fl */
    public Object[] mo11173fl(String str, boolean z) {
        File[] listFiles;
        File file = new File(m3304w(str));
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            if (z) {
                if (!file2.isDirectory()) {
                }
            } else if (!file2.isFile()) {
            }
            arrayList.add(file2.getName());
        }
        return arrayList.toArray();
    }

    /* renamed from: fo */
    public void mo11174fo(String str) {
        String w = m3304w(str);
        File file = new File(w);
        if (!file.exists()) {
            return;
        }
        if (w.toLowerCase().endsWith(".apk")) {
            C0835f.m1847d(this.f2783c, w);
            return;
        }
        try {
            m3274A(file);
        } catch (Exception unused) {
        }
    }

    /* renamed from: fr */
    public String mo11175fr(String str) {
        return C0839h.m1900i(this.f2783c, str);
    }

    /* renamed from: fr */
    public String mo11176fr(String str, String str2) {
        return C0839h.m1901j(this.f2783c, str, str2);
    }

    /* renamed from: fs */
    public long mo11177fs(String str) {
        return C0839h.m1902k(this.f2783c, str);
    }

    /* renamed from: ft */
    public boolean mo11178ft(String str, String str2) {
        File file = new File(m3304w(str));
        if (!file.exists()) {
            return false;
        }
        String w = m3304w(str2);
        C0835f.m1845b(w, false);
        return file.renameTo(new File(w));
    }

    public void ftz(String str, String str2, String str3, Object obj, String str4) {
        C0862t.m2077b(this.f2783c, str, str2, str3, m3293l(obj), new Intent().setClass(this.f2783c, logoActivity.class).putExtra("command2", str4));
    }

    public int fuz(String str, String str2, String str3) {
        String w = m3304w(str3);
        C0835f.m1845b(w, false);
        try {
            return C0839h.m1903l(this.f2783c, str, str2, w, true);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int fuz(String str, String str2, String str3, boolean z) {
        String w = m3304w(str3);
        C0835f.m1845b(w, false);
        try {
            return C0839h.m1903l(this.f2783c, str, str2, w, z);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public boolean fuzs(String str, String str2) {
        String w = m3304w(str2);
        C0835f.m1845b(w, false);
        try {
            C0839h.m1904m(this.f2783c, str, w, true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean fuzs(String str, String str2, boolean z) {
        String w = m3304w(str2);
        C0835f.m1845b(w, false);
        try {
            C0839h.m1904m(this.f2783c, str, w, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: fw */
    public void mo11184fw(String str, String str2) {
        C0835f.m1854k(m3304w(str), str2);
    }

    /* renamed from: fw */
    public void mo11185fw(String str, String str2, String str3) {
        C0835f.m1855l(m3304w(str), str2, str3);
    }

    public Object[] getTableArray(LuaObject luaObject) {
        try {
            return luaObject.array();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        } catch (LuaException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public Object git(Object obj, String str) {
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        if (intent == null) {
            return null;
        }
        if (str.equals("action")) {
            return intent.getAction();
        }
        if (str.equals("type")) {
            return intent.getType();
        }
        if (str.equals("flags")) {
            return Integer.valueOf(intent.getFlags());
        }
        if (str.equals("data")) {
            return intent.getData();
        }
        if (str.equals("datastring")) {
            return intent.getDataString();
        }
        if (str.equals("component")) {
            return intent.getComponent();
        }
        return null;
    }

    public Object git(Object obj, String str, String str2) {
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        if (intent != null && str.equals("extra")) {
            return intent.getExtras().get(str2);
        }
        return null;
    }

    public Object gslist(ArrayList<Object> arrayList, int i) {
        return arrayList.get(i);
    }

    public int gslistiof(ArrayList<Object> arrayList, Object obj) {
        return arrayList.indexOf(obj);
    }

    public boolean gslistis(ArrayList<Object> arrayList, Object obj) {
        return arrayList.contains(obj);
    }

    public int gslistl(ArrayList<Object> arrayList) {
        return arrayList.size();
    }

    public int gslistlof(ArrayList<Object> arrayList, Object obj) {
        return arrayList.lastIndexOf(obj);
    }

    public Object[] gslistsz(ArrayList<Object> arrayList) {
        return arrayList.toArray();
    }

    public View gvs(Object obj) {
        Object l = m3293l(obj);
        return m3295n(l, String.valueOf(l));
    }

    public View gvs(Object obj, Object obj2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (obj2 instanceof View) {
            return (View) obj2;
        }
        Object l2 = m3293l(obj2);
        return m3294m(view, l2, String.valueOf(l2));
    }

    public void has(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view instanceof WebView) {
            ((WebView) view).loadUrl("javascript:{" + str + "};");
        }
    }

    /* renamed from: hd */
    public int mo11198hd(String str, String str2) {
        return C0841i.m1918a(str, m3304w(str2), false);
    }

    /* renamed from: hd */
    public int mo11199hd(String str, String str2, boolean z) {
        return C0841i.m1918a(str, m3304w(str2), z);
    }

    /* renamed from: hd */
    public int mo11200hd(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, String str6) {
        return C0841i.m1919b(str, m3304w(str2), z, str3, str4, str5, z2, str6);
    }

    public void hdd(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        C1293a.f3049b.mo9045m(m3304w(str), m3304w(str2), i, i2, i3, i4, z);
    }

    public C0911c hdda(String str, String str2, Object obj) {
        return C1293a.f3049b.mo9038d(str, str2, obj);
    }

    public C0911c hdda(String str, String str2, String str3, Object obj) {
        return C1293a.f3049b.mo9039e(str, str2, str3, obj);
    }

    public C0911c hdda(String str, String str2, String str3, Object obj, Object obj2) {
        return C1293a.f3049b.mo9040f(str, str2, str3, m3293l(obj), obj2);
    }

    public C0911c hdda(String str, String str2, String str3, String str4, Object obj, boolean z, Object obj2) {
        return C1293a.f3049b.mo9041g(str, m3304w(str2), str3, str4, m3293l(obj), z, obj2);
    }

    public Object hddg(int i, String str) {
        return C1293a.f3049b.mo9042h(C1293a.f3049b.f1934c.get(i), str);
    }

    public Object hddg(C0911c cVar, String str) {
        return C1293a.f3049b.mo9042h(cVar, str);
    }

    public ArrayList<C0911c> hddgl() {
        return C1293a.f3049b.f1934c;
    }

    public void hdds(int i, String str, Object obj) {
        Object l = m3293l(obj);
        C1293a.f3049b.mo9044l(C1293a.f3049b.f1934c.get(i), str, l);
    }

    public void hdds(C0911c cVar, String str, Object obj) {
        C1293a.f3049b.mo9044l(cVar, str, m3293l(obj));
    }

    public void hdduigo() {
        this.f2783c.startActivity(new Intent().setClass(this.f2783c, DownList.class));
    }

    public void hdduigo(String str, String str2) {
        Intent intent = new Intent(this.f2783c, DownList.class);
        Bundle bundle = new Bundle();
        bundle.putString("background", str);
        bundle.putString("backgroundShadow", str2);
        intent.putExtras(bundle);
        this.f2783c.startActivity(intent);
    }

    public C0836g hdfl(String str, String str2, int i, int i2, boolean z, LuaObject luaObject, LuaObject luaObject2) {
        C0836g gVar = new C0836g(m3304w(str), m3304w(str2), i, i2, z);
        m3307z(gVar, luaObject, luaObject2);
        return gVar;
    }

    public C0836g hdfl(String str, String str2, LuaObject luaObject, LuaObject luaObject2) {
        C0836g gVar = new C0836g(m3304w(str), m3304w(str2));
        m3307z(gVar, luaObject, luaObject2);
        return gVar;
    }

    public C0836g hdfl(String str, LuaObject luaObject, LuaObject luaObject2) {
        C0836g gVar = new C0836g(m3304w(str));
        m3307z(gVar, luaObject, luaObject2);
        return gVar;
    }

    public void hdfla(C0836g gVar, String str, int i, Object obj) {
        gVar.mo8929n(str, i, obj);
        gVar.mo8933t();
    }

    public void hdfla(C0836g gVar, String str, int i, Object obj, String str2) {
        gVar.mo8930o(str, i, obj, m3304w(str2));
        gVar.mo8933t();
    }

    /* renamed from: hs */
    public String mo11218hs(String str) {
        return (str.equals("cookie") || str.equals("del cookie")) ? C0841i.m1921d(str) : str.startsWith("cookie:") ? C0841i.m1921d(str.substring(7)) : C0841i.m1922e(str, null, null);
    }

    /* renamed from: hs */
    public String mo11219hs(String str, String str2, String str3) {
        return C0841i.m1922e(str, str2, str3);
    }

    /* renamed from: hs */
    public String mo11220hs(String str, String str2, String str3, String str4) {
        return C0841i.m1923f(str, str2, str3, str4);
    }

    /* renamed from: hs */
    public String mo11221hs(String str, String str2, String str3, String str4, boolean z) {
        return C0841i.m1924g(str, str2, str3, str4, z);
    }

    /* renamed from: hs */
    public String mo11222hs(String str, String str2, String str3, String str4, boolean z, String str5) {
        return C0841i.m1925h(str, str2, str3, str4, z, str5, 20000, 20000, null);
    }

    /* renamed from: hs */
    public String mo11223hs(String str, String str2, String str3, String str4, boolean z, String str5, int i, int i2, String str6) {
        return C0841i.m1925h(str, str2, str3, str4, z, str5, i, i2, str6);
    }

    @TargetApi(11)
    public void hsas(Object obj, boolean z) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("iapp");
            }
            if (z) {
                webView.addJavascriptInterface(new C1311iapp(this.f2783c, this.f2782b), "iapp");
            }
        }
    }

    public String huf(String str, String str2, String str3, String str4) {
        try {
            return C0841i.m1930m(this.f2783c, str, str2, str3, str4);
        } catch (Exception unused) {
            return null;
        }
    }

    public String huf(String str, String str2, String str3, String str4, String str5) {
        try {
            return C0841i.m1931n(this.f2783c, str, str2, str3, str4, str5);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: hw */
    public void mo11227hw(String str) {
        Intent intent = new Intent(this.f2783c, Webview.class);
        Bundle bundle = new Bundle();
        bundle.putString("WebURL", str);
        intent.putExtras(bundle);
        this.f2783c.startActivity(intent);
    }

    /* renamed from: hw */
    public void mo11228hw(String str, String str2, String str3) {
        Intent intent = new Intent(this.f2783c, Webview.class);
        Bundle bundle = new Bundle();
        bundle.putString("WebURL", str);
        bundle.putString("background", str2);
        bundle.putString("backgroundShadow", str3);
        intent.putExtras(bundle);
        this.f2783c.startActivity(intent);
    }

    public void hws(String str) {
        Intent intent;
        try {
            intent = C0841i.m1934q(this.f2783c, str);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(C0851m.m1977c(this.f2783c, str));
            intent = intent2;
        }
        this.f2783c.startActivity(intent);
    }

    public Object java(Object obj, String str) {
        return C0832d.m1822g(this.f2783c, obj, str, null, null, null);
    }

    public Object java(Object obj, String str, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        return C0832d.m1822g(this.f2783c, obj, str, objArr, null, null);
    }

    public Object java(Object obj, String str, LuaObject luaObject, LuaObject luaObject2) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        return C0832d.m1822g(this.f2783c, obj, str, objArr, null, luaObject2);
    }

    public Object javacb(Class<?> cls, LuaObject luaObject) {
        return C0832d.m1830o(cls.getClassLoader(), cls, null, luaObject);
    }

    public Object javags(Object obj, Object obj2, String str) {
        return obj2 instanceof Class ? C0832d.m1824i(obj, (Class) obj2, str) : C0832d.m1826k(obj, obj2.toString(), str);
    }

    public Object javags(Object obj, String str) {
        return C0832d.m1825j(obj, str);
    }

    public Object javanew(Object obj) {
        return obj instanceof Class ? C0832d.m1828m(this.f2783c, (Class) obj, null, null, null) : C0832d.m1829n(this.f2783c, obj.toString(), null, null, null);
    }

    public Object javanew(Object obj, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        return obj instanceof Class ? C0832d.m1828m(this.f2783c, (Class) obj, objArr, null, null) : C0832d.m1829n(this.f2783c, obj.toString(), objArr, null, null);
    }

    public Object javanew(Object obj, LuaObject luaObject, LuaObject luaObject2) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        return obj instanceof Class ? C0832d.m1828m(this.f2783c, (Class) obj, objArr, null, luaObject2) : C0832d.m1829n(this.f2783c, obj.toString(), objArr, null, luaObject2);
    }

    public Object javass(Object obj, Object obj2, String str, Object obj3) {
        return Boolean.valueOf(obj2 instanceof Class ? C0832d.m1832q(obj, (Class) obj2, str, obj3) : C0832d.m1833r(obj, obj2.toString(), str, obj3));
    }

    public Object javass(Object obj, String str, Object obj2) {
        return C0832d.m1831p(obj, str, obj2);
    }

    public Object javax(Object obj, Object obj2, String str) {
        return obj2 instanceof Class ? C0832d.m1820e(this.f2783c, obj, (Class) obj2, str, null, null, null) : C0832d.m1821f(this.f2783c, obj, obj2.toString(), str, null, null, null);
    }

    public Object javax(Object obj, Object obj2, String str, LuaObject luaObject) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        boolean z = obj2 instanceof Class;
        Context context = this.f2783c;
        return z ? C0832d.m1820e(context, obj, (Class) obj2, str, objArr, null, null) : C0832d.m1821f(context, obj, obj2.toString(), str, objArr, null, null);
    }

    public Object javax(Object obj, Object obj2, String str, LuaObject luaObject, LuaObject luaObject2) {
        Object[] objArr;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        boolean z = obj2 instanceof Class;
        Context context = this.f2783c;
        return z ? C0832d.m1820e(context, obj, (Class) obj2, str, objArr, null, luaObject2) : C0832d.m1821f(context, obj, obj2.toString(), str, objArr, null, luaObject2);
    }

    public Object json(Object obj, String str) {
        if (str.equals("size")) {
            if (obj instanceof JSONObject) {
                return Integer.valueOf(((JSONObject) obj).length());
            }
            if (obj instanceof JSONArray) {
                return Integer.valueOf(((JSONArray) obj).length());
            }
            return -1;
        } else if (!str.equals("json")) {
            return null;
        } else {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).toString();
            }
            if (obj instanceof JSONArray) {
                return ((JSONArray) obj).toString();
            }
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public Object json(Object obj, String str, Object obj2) {
        if (str.equals("del")) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).remove(String.valueOf(obj2));
                return null;
            } else if (!(obj instanceof JSONArray) || Build.VERSION.SDK_INT < 19) {
                return null;
            } else {
                ((JSONArray) obj).remove(m3282a(String.valueOf(obj2)));
                return null;
            }
        } else if (str.equals("get")) {
            try {
                if (obj instanceof JSONObject) {
                    return ((JSONObject) obj).get(String.valueOf(obj2));
                }
                if (obj instanceof JSONArray) {
                    return ((JSONArray) obj).get(m3282a(String.valueOf(obj2)));
                }
                return null;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (str.equals("list")) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).getJSONArray(String.valueOf(obj2));
            }
            return null;
        } else if (!str.equals("data")) {
            return null;
        } else {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).getJSONObject(String.valueOf(obj2));
            }
            if (obj instanceof JSONArray) {
                return ((JSONArray) obj).getJSONObject(m3282a(String.valueOf(obj2)));
            }
            return null;
        }
    }

    public JSONObject json(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void json(Object obj, String str, Object obj2, Object obj3) {
        if (str.equals("set")) {
            try {
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).put(String.valueOf(obj2), obj3);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).put(m3282a(String.valueOf(obj2)), obj3);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void lan(int i) {
        C0915a.m2418a(this.f2782b, i);
    }

    public ClassLoader loadjar(String str) {
        Context context = this.f2783c;
        return C0839h.m1909r(context, str, context.getClassLoader());
    }

    public ClassLoader loadjar(String str, boolean z) {
        Context context = this.f2783c;
        DexClassLoader r = C0839h.m1909r(context, str, context.getClassLoader());
        if (z) {
            C0839h.m1912u(this.f2783c, r);
        }
        return r;
    }

    public ClassLoader loadjar(String str, boolean z, ClassLoader classLoader) {
        DexClassLoader r = C0839h.m1909r(this.f2783c, str, classLoader);
        if (z) {
            C0839h.m1912u(this.f2783c, r);
        }
        return r;
    }

    public void loadso(String str) {
        C0839h.m1910s(str);
    }

    public Object ngde(int i, int i2, String str, String str2) {
        int o = C0860r.m2056o(str);
        int o2 = C0860r.m2056o(str2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(o);
        if (i2 > 0) {
            gradientDrawable.setCornerRadius((float) i2);
        }
        if (i > 0) {
            gradientDrawable.setStroke(i, o2);
        }
        return gradientDrawable;
    }

    public Object ngde(int i, int i2, String str, String str2, String str3) {
        int o = C0860r.m2056o(str2);
        String[] E = m3278E(str, '|');
        int[] iArr = new int[E.length];
        for (int i3 = 0; i3 < E.length; i3++) {
            iArr[i3] = C0860r.m2056o(E[i3]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(m3305x(str3), iArr);
        if (i2 > 0) {
            gradientDrawable.setCornerRadius((float) i2);
        }
        if (i > 0) {
            gradientDrawable.setStroke(i, o);
        }
        return gradientDrawable;
    }

    public Object ngde(int i, String str) {
        int o = C0860r.m2056o(str);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(o);
        if (i > 0) {
            gradientDrawable.setCornerRadius((float) i);
        }
        return gradientDrawable;
    }

    public Object ngde(int i, String str, String str2) {
        int o = C0860r.m2056o(str);
        int o2 = C0860r.m2056o(str2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(o);
        if (i > 0) {
            gradientDrawable.setStroke(i, o2);
        }
        return gradientDrawable;
    }

    public Object ngde(String str) {
        int o = C0860r.m2056o(str);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(o);
        return gradientDrawable;
    }

    public Object nsz(int i, Object obj) {
        Class<?> cls;
        if (obj instanceof String) {
            cls = C0832d.m1817b(obj.toString());
        } else if (!(obj instanceof Class)) {
            return null;
        } else {
            cls = (Class) obj;
        }
        return Array.newInstance(cls, i);
    }

    public Object[] nsz(int i) {
        return new Object[i];
    }

    public Object[] nsz(LuaObject luaObject) {
        try {
            return luaObject.array();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        } catch (LuaException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public Object nuibs(Object obj, Object obj2, Object obj3) {
        return new C0917c(this.f2783c).mo9109d(m3293l(obj), m3293l(obj2), m3293l(obj3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View nvw(int r7, java.lang.Object r8, java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.nvw(int, java.lang.Object, java.lang.String, java.lang.String):android.view.View");
    }

    public void nvw(Object obj, Object obj2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            if (!(obj2 instanceof ViewGroup)) {
                Object l2 = m3293l(obj2);
                obj2 = m3295n(l2, String.valueOf(l2));
            }
            ViewGroup viewGroup = (ViewGroup) obj2;
            if (viewGroup != null) {
                viewGroup.addView(view);
            }
        }
    }

    public void nvw(Object obj, Object obj2, int i) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            if (!(obj2 instanceof ViewGroup)) {
                Object l2 = m3293l(obj2);
                obj2 = m3295n(l2, String.valueOf(l2));
            }
            ViewGroup viewGroup = (ViewGroup) obj2;
            if (viewGroup != null) {
                viewGroup.addView(view, i);
            }
        }
    }

    public LuaObject openRestoreinterface(String str, ViewGroup viewGroup, int i, Object obj) {
        C1298d dVar = new C1298d(this.f2783c);
        dVar.mo11700l("activity", this.f2783c);
        dVar.mo11700l("i", this);
        dVar.mo11699k();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("require 'import'\n");
        Context context = this.f2783c;
        C0916b bVar = new C0916b(context);
        bVar.f1974a = 0;
        C0839h.m1908q(this, context, str, viewGroup, i, obj, bVar, stringBuffer, dVar);
        String C = C0839h.m1887C(this.f2783c, str);
        if (C != null) {
            stringBuffer.append("function loading()\n");
            stringBuffer.append(C);
            stringBuffer.append("\nend\n");
        }
        try {
            dVar.mo11695g(stringBuffer.toString());
        } catch (LuaException e) {
            e.printStackTrace();
            C0864v.m2157O2("LuaErr：\n" + e.getMessage());
        }
        if (C == null) {
            return null;
        }
        return dVar.mo11698j().getLuaObject("loading");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openRestoreinterfaceX(java.lang.String r16, android.view.ViewGroup r17, int r18, java.lang.Object r19, p013b.p048c.p049a.C0916b r20, java.lang.StringBuffer r21, com.iapp.app.C1298d r22) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.openRestoreinterfaceX(java.lang.String, android.view.ViewGroup, int, java.lang.Object, b.c.a.b, java.lang.StringBuffer, com.iapp.app.d):void");
    }

    public String otob(String str) {
        byte[] t = C0839h.m1911t(this.f2783c, str);
        if (t == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : t) {
            stringBuffer.append(' ');
            stringBuffer.append((int) b);
        }
        return stringBuffer.toString().trim();
    }

    public String otob(String str, String str2) {
        byte[] bArr;
        if (str == null) {
            bArr = str2.getBytes();
        } else {
            try {
                bArr = str2.getBytes(str);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                bArr = null;
            }
        }
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(' ');
            stringBuffer.append((int) b);
        }
        return stringBuffer.toString().trim();
    }

    public byte[] otob(String str, String str2, String str3) {
        if (str.equals("file")) {
            return C0839h.m1911t(this.f2783c, str3);
        }
        if (!str.equals("str")) {
            return null;
        }
        if (str2 == null) {
            return str3.getBytes();
        }
        try {
            return str3.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public C1310i res() {
        return new C1310i(this.f2783c);
    }

    public C1310i res(String str) {
        return new C1310i(this.f2783c, m3304w(str));
    }

    public Object res(C1310i iVar, String str) {
        if (str.equals("asset")) {
            return iVar.mo11947a();
        }
        if (str.equals("resources")) {
            return iVar.mo11949c();
        }
        return null;
    }

    public Object res(C1310i iVar, String str, String str2) {
        return iVar.mo11950d(str, str2);
    }

    public Object res(C1310i iVar, String str, String str2, boolean z) {
        return z ? Integer.valueOf(iVar.mo11948b(str, str2)) : iVar.mo11950d(str, str2);
    }

    public Bitmap sbp(Object obj) {
        Bitmap v = obj instanceof Bitmap ? (Bitmap) obj : C0839h.m1913v(this.f2783c, String.valueOf(obj));
        if (v == null) {
            return null;
        }
        return v;
    }

    public Bitmap sbp(Object obj, int i, int i2, int i3, int i4) {
        Bitmap c = obj instanceof Bitmap ? (Bitmap) obj : C0849k.m1963c(m3304w(String.valueOf(obj)));
        if (c == null) {
            return null;
        }
        return Bitmap.createBitmap(c, i, i2, i3, i4);
    }

    public Bitmap sbp(Object obj, int i, int i2, int i3, int i4, float f) {
        Bitmap c = obj instanceof Bitmap ? (Bitmap) obj : C0849k.m1963c(m3304w(String.valueOf(obj)));
        if (c == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.preRotate(f);
        return Bitmap.createBitmap(c, i, i2, i3, i4, matrix, true);
    }

    public void sdeg(int i) {
        C0864v.f1811u = i;
    }

    /* renamed from: se */
    public Object mo11279se(Matcher matcher, String str) {
        if (str.equals("ms")) {
            return Boolean.valueOf(matcher.matches());
        }
        if (str.equals("find")) {
            return Boolean.valueOf(matcher.find());
        }
        if (str.equals("gl")) {
            return Integer.valueOf(matcher.groupCount());
        }
        if (str.equals("start")) {
            return Integer.valueOf(matcher.start());
        }
        if (str.equals("end")) {
            return Integer.valueOf(matcher.end());
        }
        if (str.equals("group")) {
            return matcher.group();
        }
        return null;
    }

    /* renamed from: se */
    public Object mo11280se(Matcher matcher, String str, int i) {
        if (str.equals("find")) {
            return Boolean.valueOf(matcher.find(i));
        }
        if (str.equals("start")) {
            return Integer.valueOf(matcher.start(i));
        }
        if (str.equals("end")) {
            return Integer.valueOf(matcher.end(i));
        }
        if (str.equals("group")) {
            return matcher.group(i);
        }
        return null;
    }

    /* renamed from: se */
    public String mo11281se(Matcher matcher, String str, String str2) {
        if (str.equals("sral")) {
            return matcher.replaceAll(str2);
        }
        if (str.equals("srft")) {
            return matcher.replaceFirst(str2);
        }
        return null;
    }

    /* renamed from: se */
    public Matcher mo11282se(String str, String str2, int i) {
        return Pattern.compile(str2, i).matcher(str);
    }

    public void setClickable(ArrayList<Integer> arrayList, StringBuffer stringBuffer, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                setClickable(arrayList, stringBuffer, viewGroup.getChildAt(i));
            }
        }
        int id = view.getId();
        if (id <= 0) {
            return;
        }
        if (view.isClickable() || view.isLongClickable()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(',');
            stringBuffer2.append(id);
            stringBuffer2.append(',');
            if (stringBuffer.indexOf(stringBuffer2.toString()) == -1) {
                arrayList.add(Integer.valueOf(id));
            }
        }
    }

    public Object sgsz(Object obj, int i) {
        try {
            return Array.get(obj, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int sgszl(Object obj) {
        try {
            return Array.getLength(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public String shb() {
        CharSequence text = ((ClipboardManager) this.f2783c.getSystemService("clipboard")).getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    public String simei() {
        return C0860r.m2058q(this.f2783c);
    }

    public String simsi() {
        try {
            return ((TelephonyManager) this.f2783c.getSystemService("phone")).getSubscriberId();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int siof(String str, String str2) {
        return str.indexOf(str2);
    }

    public int siof(String str, String str2, int i) {
        return str.indexOf(str2, i);
    }

    public Intent sit(Intent intent, String str, String str2) {
        if (intent == null) {
            intent = new Intent();
        }
        if (str.equals("action")) {
            intent.setAction(str2);
        } else if (str.equals("type")) {
            intent.setType(str2);
        } else if (str.equals("flags")) {
            intent.setFlags(Integer.parseInt(str2));
        } else if (str.equals("data")) {
            intent.setData(C0851m.m1977c(this.f2783c, str2));
        }
        return intent;
    }

    public Intent sit(Intent intent, String str, String str2, Object obj) {
        if (intent == null) {
            intent = new Intent();
        }
        if (str.equals("extra")) {
            if (obj instanceof String[]) {
                intent.putExtra(str2, (String[]) obj);
            } else if (obj instanceof Boolean) {
                intent.putExtra(str2, obj.equals(Boolean.TRUE));
            } else if (obj instanceof Integer) {
                intent.putExtra(str2, Integer.parseInt(String.valueOf(m3293l(obj))));
            } else if (obj instanceof Long) {
                intent.putExtra(str2, Long.parseLong(String.valueOf(m3293l(obj))));
            } else {
                intent.putExtra(str2, String.valueOf(obj));
            }
        } else if (str.equals("classname")) {
            intent.setClassName(str2, String.valueOf(obj));
        } else if (str.equals("component")) {
            intent.setComponent(new ComponentName(str2, String.valueOf(obj)));
        }
        return intent;
    }

    /* renamed from: sj */
    public String mo11293sj(String str, String str2, String str3) {
        return C0860r.m2044c(str, str2, str3);
    }

    public String[] sjxx() {
        String[] p = m3297p();
        int[] q = m3298q();
        int[] r = m3299r();
        String[] s = m3300s();
        return new String[]{p[0] + "\n" + p[1], q[0] + "\n" + q[1] + "\n" + r[0] + "\n" + r[1], s[0] + "\n" + s[1] + "\n" + s[2]};
    }

    /* renamed from: sl */
    public String[] mo11295sl(String str, String str2) {
        return C0861s.m2072e(str, str2);
    }

    /* renamed from: sl */
    public String[] mo11296sl(String str, String str2, boolean z) {
        return z ? str.split(str2) : C0861s.m2072e(str, str2);
    }

    public int slg(String str) {
        return str.length();
    }

    public int slof(String str, String str2) {
        return str.lastIndexOf(str2);
    }

    public int slof(String str, String str2, int i) {
        return str.lastIndexOf(str2, i);
    }

    public String slower(String str) {
        return str.toLowerCase();
    }

    public C0855q.C0858c sot(C0855q qVar, String str, int i) {
        if (str.equals("list")) {
            return qVar.mo8953A(i);
        }
        return null;
    }

    public C0855q sot(int i, String str, int i2, int i3, boolean z, LuaObject luaObject) {
        C0855q qVar = new C0855q(i, str, i2, i3, z);
        qVar.mo8955F(new C1225f(luaObject));
        return qVar;
    }

    public C0855q sot(String str, int i, int i2, boolean z, LuaObject luaObject) {
        C0855q qVar = new C0855q(str, i, i2, z);
        qVar.mo8955F(new C1229g(luaObject));
        return qVar;
    }

    public Object sot(C0855q qVar, String str) {
        if (str.equals("ip")) {
            return Boolean.valueOf(qVar.mo8954B());
        }
        if (str.equals("id")) {
            return Integer.valueOf(qVar.mo8961t());
        }
        if (str.equals("list")) {
            return qVar.mo8964w();
        }
        if (str.equals("size")) {
            return Integer.valueOf(qVar.mo8962u());
        }
        if (str.equals("server")) {
            return qVar.mo8963v();
        }
        if (!str.equals("re")) {
            return null;
        }
        qVar.mo8960s();
        return null;
    }

    public void sot(C0855q qVar, String str, String str2) {
        if (str.equals("str")) {
            qVar.mo8957b(str2);
        } else if (str.equals("file")) {
            qVar.mo8956a(new File(m3304w(str2)));
        } else if (str.equals("bt")) {
            qVar.mo8958c(m3291j(str2, ' '));
        } else if (str.equals("new")) {
            qVar.f1776c = str2.equals("true");
        }
    }

    public void sot(C0855q qVar, String str, byte[] bArr) {
        if (str.equals("bt2")) {
            qVar.mo8959d(bArr);
        }
    }

    public Object sota(C0855q.C0858c cVar, String str) {
        if (str.equals("re")) {
            cVar.mo8971g();
            return null;
        } else if (str.equals("ip")) {
            return Boolean.valueOf(cVar.mo8975k());
        } else {
            if (str.equals("id")) {
                return Integer.valueOf(cVar.mo8973i());
            }
            if (str.equals("socket")) {
                return cVar.mo8974j();
            }
            if (str.equals("ht")) {
                return cVar.mo8972h();
            }
            return null;
        }
    }

    public void sota(C0855q.C0858c cVar, String str, String str2) {
        if (str.equals("str")) {
            cVar.mo8968b(str2);
        } else if (str.equals("file")) {
            cVar.mo8967a(new File(m3304w(str2)));
        } else if (str.equals("bt")) {
            cVar.mo8969c(m3291j(str2, ' '));
        }
    }

    public void sota(C0855q.C0858c cVar, String str, byte[] bArr) {
        if (str.equals("bt2")) {
            cVar.mo8970d(bArr);
        }
    }

    public Cursor sql(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase != null) {
            try {
                return sQLiteDatabase.rawQuery(str, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Object sql(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        boolean j;
        if (sQLiteDatabase == null) {
            return null;
        }
        if (str2.equals("add")) {
            j = C0854p.m1984a(sQLiteDatabase, str, str3, str4);
        } else if (str2.equals("up")) {
            j = C0854p.m1993j(sQLiteDatabase, str, str3, str4);
        } else if (str2.equals("sele")) {
            return C0854p.m1991h(sQLiteDatabase, str3, str, str4);
        } else {
            return null;
        }
        return Boolean.valueOf(j);
    }

    public void sql(String str, SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(str);
        }
    }

    public boolean sql(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (sQLiteDatabase == null) {
            return false;
        }
        if (str2.equals("ip")) {
            return C0854p.m1992i(sQLiteDatabase, str);
        }
        if (str2.equals("del")) {
            return C0854p.m1988e(sQLiteDatabase, str);
        }
        return false;
    }

    public boolean sql(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (sQLiteDatabase == null) {
            return false;
        }
        if (str2.equals("add")) {
            return C0854p.m1985b(sQLiteDatabase, str, str3);
        }
        if (str2.equals("del")) {
            return C0854p.m1987d(sQLiteDatabase, str, str3);
        }
        return false;
    }

    public SQLiteDatabase sqlite(SQLiteDatabase sQLiteDatabase, String str) {
        Context context;
        boolean z;
        if (!str.equals("re")) {
            if (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) {
                context = this.f2783c;
                str = m3304w(str);
                z = false;
            } else {
                context = this.f2783c;
                z = true;
            }
            return C0839h.m1917z(context, str, z);
        } else if (sQLiteDatabase == null) {
            return null;
        } else {
            sQLiteDatabase.close();
            return null;
        }
    }

    public boolean sqlite(String str, String str2) {
        if (str2.equals("ip")) {
            return (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) ? C0839h.m1916y(this.f2783c, m3304w(str), false) : C0839h.m1916y(this.f2783c, str, true);
        }
        if (str2.equals("del")) {
            return (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) ? C0839h.m1915x(this.f2783c, m3304w(str), false) : C0839h.m1915x(this.f2783c, str, true);
        }
        return false;
    }

    public Object sqlsele(Cursor cursor, Object obj) {
        Object l = m3293l(obj);
        if (l instanceof Integer) {
            return cursor.getString(Integer.parseInt(l.toString()));
        }
        if (!l.equals("re")) {
            return l.equals("columncount") ? Integer.valueOf(cursor.getColumnCount()) : l.equals("count") ? Integer.valueOf(cursor.getCount()) : l.equals("next") ? Boolean.valueOf(cursor.moveToNext()) : l.equals("previous") ? Boolean.valueOf(cursor.moveToPrevious()) : l.equals("first") ? Boolean.valueOf(cursor.moveToFirst()) : l.equals("last") ? Boolean.valueOf(cursor.moveToLast()) : l.equals("getposition") ? Integer.valueOf(cursor.getPosition()) : cursor.getString(m3282a(l.toString()));
        }
        if (cursor == null) {
            return null;
        }
        cursor.close();
        return null;
    }

    public void sqlsele(Cursor cursor, String str, int i) {
        if (str.equals("position")) {
            cursor.moveToPosition(i);
        }
    }

    /* renamed from: sr */
    public String mo11319sr(String str, String str2, String str3) {
        return str.replace(str2, str3);
    }

    /* renamed from: sr */
    public String mo11320sr(String str, String str2, String str3, boolean z) {
        return z ? str.replaceAll(str2, str3) : str.replace(str2, str3);
    }

    public int sran(int i, int i2) {
        return C0860r.m2048g(i, i2);
    }

    public void src(String str, Object obj) {
        this.f2784d.mo11700l(str, obj);
    }

    /* renamed from: ss */
    public Object mo11323ss(String str) {
        return ss_dim.get(str);
    }

    /* renamed from: ss */
    public void mo11324ss(String str, Object obj) {
        ss_dim.put(str, obj);
    }

    public void ssDouble(String str, double d) {
        ss_dim.put(str, Double.valueOf(d));
    }

    public void ssLong(String str, long j) {
        ss_dim.put(str, Long.valueOf(j));
    }

    public String ssg(String str, int i) {
        return str.substring(i);
    }

    public String ssg(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    public void ssj(Object obj, String str, LuaObject luaObject) {
        Object[] objArr;
        View view;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        int length = objArr.length;
        LuaObject[] luaObjectArr = new LuaObject[length];
        for (int i = 0; i < length; i++) {
            luaObjectArr[i] = (LuaObject) objArr[i];
        }
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            m3288g(view, str, luaObjectArr);
        }
    }

    public Object sslist(ArrayList<Object> arrayList, int i, Object obj) {
        return arrayList.set(i, obj);
    }

    public Object sss(String str) {
        return C0864v.f1800j.get(str);
    }

    public void sss(String str, Object obj) {
        C0864v.f1800j.put(str, obj);
    }

    public void sssDouble(String str, double d) {
        C0864v.f1800j.put(str, Double.valueOf(d));
    }

    public void sssLong(String str, long j) {
        C0864v.f1800j.put(str, Long.valueOf(j));
    }

    public void sssz(Object obj, int i, Object obj2) {
        try {
            Array.set(obj, i, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String stobm(String str, String str2) {
        return C0860r.m2038B(str, str2);
    }

    public void stop(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public String strim(String str) {
        return str.trim();
    }

    public String supper(String str) {
        return str.toUpperCase();
    }

    public String sutf8to(String str) {
        return C0860r.m2040D(str);
    }

    public int swh(String str) {
        if (str.equals("w")) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return C0860r.m2064w(this.f2783c, (float) displayMetrics.widthPixels);
        } else if (str.equals("h")) {
            WindowManager.LayoutParams attributes = this.f2782b.getWindow().getAttributes();
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return (attributes.flags & 1024) == 1024 ? C0860r.m2064w(this.f2783c, (float) displayMetrics2.heightPixels) : C0860r.m2064w(this.f2783c, (float) (displayMetrics2.heightPixels - m3302u()));
        } else if (str.equals("pxw")) {
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics3);
            return displayMetrics3.widthPixels;
        } else if (str.equals("pxh")) {
            WindowManager.LayoutParams attributes2 = this.f2782b.getWindow().getAttributes();
            DisplayMetrics displayMetrics4 = new DisplayMetrics();
            this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics4);
            return (attributes2.flags & 1024) == 1024 ? displayMetrics4.heightPixels : displayMetrics4.heightPixels - m3302u();
        } else if (str.equals("pxhh")) {
            DisplayMetrics displayMetrics5 = new DisplayMetrics();
            this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics5);
            return displayMetrics5.heightPixels;
        } else if (str.equals("hh")) {
            DisplayMetrics displayMetrics6 = new DisplayMetrics();
            this.f2782b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics6);
            return C0860r.m2064w(this.f2783c, (float) displayMetrics6.heightPixels);
        } else if (str.equals("pxztl")) {
            return m3303v();
        } else {
            if (str.equals("pxbvk")) {
                return m3296o();
            }
            if (str.equals("ztl")) {
                return C0860r.m2064w(this.f2783c, (float) m3303v());
            }
            if (str.equals("bvk")) {
                return C0860r.m2064w(this.f2783c, (float) m3296o());
            }
            return 0;
        }
    }

    public void sxb(String str) {
        ((ClipboardManager) this.f2783c.getSystemService("clipboard")).setText(str);
    }

    public void syso(Object obj) {
        C0864v.m2157O2(obj);
    }

    public void sysoDouble(double d) {
        C0864v.m2157O2(Double.valueOf(d));
    }

    public void sysoLong(long j) {
        C0864v.m2157O2(Long.valueOf(j));
    }

    /* renamed from: t */
    public void mo11346t(LuaObject luaObject) {
        C1215c cVar = new C1215c(this, luaObject);
        cVar.setName("CeShi_" + cVar.getId());
        cVar.start();
    }

    public int tcc(Object obj, String str) {
        if (!(obj instanceof Bitmap)) {
            return -1;
        }
        if (str.equals("w")) {
            return ((Bitmap) obj).getWidth();
        }
        if (str.equals("h")) {
            return ((Bitmap) obj).getHeight();
        }
        return -1;
    }

    public Bitmap tfz(Object obj, String str) {
        Bitmap bitmap;
        int i;
        if (!(obj instanceof Bitmap)) {
            return null;
        }
        if (str.equals("x")) {
            bitmap = (Bitmap) obj;
            i = 0;
        } else if (!str.equals("y")) {
            return null;
        } else {
            bitmap = (Bitmap) obj;
            i = 1;
        }
        return C0849k.m1966f(bitmap, i);
    }

    public Object time(String str) {
        Formatter format;
        try {
            return C0860r.m2062u(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(new Date().getTime());
            Formatter formatter = new Formatter(Locale.CHINA);
            if (str.length() == 1) {
                format = formatter.format("%1$t" + str, instance);
            } else {
                format = formatter.format(str, instance);
            }
            return format.toString();
        }
    }

    public double toi(double d) {
        double longValue = (double) Double.valueOf(d).longValue();
        int i = (longValue > 0.0d ? 1 : (longValue == 0.0d ? 0 : -1));
        Double.isNaN(longValue);
        return i >= 0 ? longValue + 0.09393d : longValue - 0.09393d;
    }

    public Bitmap tot(Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null && (view instanceof ImageView)) {
            return C0849k.m1961a((ImageView) view);
        }
        return null;
    }

    public Bitmap tsf(Object obj, float f) {
        if (obj instanceof Bitmap) {
            return C0849k.m1964d((Bitmap) obj, f);
        }
        return null;
    }

    public Bitmap tsf(Object obj, int i, int i2) {
        if (obj instanceof Bitmap) {
            return C0849k.m1965e((Bitmap) obj, i, i2);
        }
        return null;
    }

    public C1349p tts() {
        return new C1349p(this.f2783c);
    }

    public C1349p tts(String str, String str2, float f, float f2) {
        return new C1349p(this.f2783c, str, str2, f, f2);
    }

    public Object tts(C1349p pVar, String str) {
        if (str.equals("re")) {
            pVar.mo11995h();
        } else if (str.equals("sp")) {
            return Boolean.valueOf(pVar.mo11997j());
        } else {
            if (str.equals("ip")) {
                return Boolean.valueOf(pVar.mo11991d());
            }
            if (str.equals("is")) {
                return Boolean.TRUE;
            }
            if (str.equals("zt")) {
                return Integer.valueOf(pVar.mo11990c());
            }
        }
        return Boolean.FALSE;
    }

    public void tts(C1349p pVar, String str, Object obj) {
        if (str.equals("ph")) {
            pVar.mo11993f(Float.parseFloat(obj.toString()));
        } else if (str.equals("se")) {
            pVar.mo11994g(Float.parseFloat(obj.toString()));
        } else if (str.equals("lg")) {
            pVar.mo11992e(obj.toString());
        } else if (str.equals("st")) {
            pVar.mo11996i(str, Integer.parseInt(m3293l(obj).toString()));
        } else if (str.equals("ft")) {
            pVar.mo11998k(str, m3304w(obj.toString()));
        }
    }

    /* renamed from: tw */
    public void mo11358tw(Object obj) {
        Toast.makeText(this.f2783c, String.valueOf(obj), 1).show();
    }

    /* renamed from: tw */
    public void mo11359tw(Object obj, int i) {
        Toast.makeText(this.f2783c, String.valueOf(obj), i).show();
    }

    public void twDouble(double d) {
        Toast.makeText(this.f2783c, String.valueOf(d), 1).show();
    }

    public void twDouble(double d, int i) {
        Toast.makeText(this.f2783c, String.valueOf(d), i).show();
    }

    public void twLong(long j) {
        Toast.makeText(this.f2783c, String.valueOf(j), 1).show();
    }

    public void twLong(long j, int i) {
        Toast.makeText(this.f2783c, String.valueOf(j), i).show();
    }

    public void tws(Object obj, String str, int i) {
        View view;
        if (obj == null) {
            view = this.f2782b.findViewById(C0839h.f1737a);
        } else if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            Snackbar.make(view, str, i).show();
        }
    }

    public void tws(Object obj, String str, int i, String str2, LuaObject luaObject) {
        View view;
        if (obj == null) {
            view = this.f2782b.findViewById(C0839h.f1737a);
        } else if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            Snackbar.make(view, str, i).setAction(str2, new View$OnClickListenerC1231h(this, luaObject)).show();
        }
    }

    public Bitmap tzz(Object obj, float f) {
        if (obj instanceof Bitmap) {
            return C0849k.m1967g((Bitmap) obj, f);
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x002e */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] uall(java.lang.Object r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0005
            goto L_0x0011
        L_0x0005:
            java.lang.Object r4 = r3.m3293l(r4)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            android.view.View r4 = r3.m3295n(r4, r0)
        L_0x0011:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x0019:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L_0x0034
            android.view.View r2 = r4.getChildAt(r1)
            if (r5 == 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x002e:
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0034:
            java.lang.Object[] r4 = r0.toArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.uall(java.lang.Object, boolean):java.lang.Object[]");
    }

    public boolean uapp(String str) {
        return C0835f.m1859p(this.f2783c, str);
    }

    public boolean uapp(String str, String str2) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, str2));
            this.f2783c.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public Object[] uapplist(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : this.f2783c.getPackageManager().getInstalledPackages(0)) {
            String str = packageInfo.packageName;
            if (z) {
                arrayList.add(new String[]{str, m3306y(str), packageInfo.applicationInfo.loadLabel(this.f2783c.getPackageManager()).toString(), packageInfo.versionName});
            } else if ((packageInfo.applicationInfo.flags & 1) == 0) {
                arrayList.add(new String[]{str, m3306y(str), packageInfo.applicationInfo.loadLabel(this.f2783c.getPackageManager()).toString(), packageInfo.versionName});
            }
        }
        return arrayList.toArray();
    }

    public void ucall(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        Context context = this.f2783c;
        intent.setData(C0851m.m1977c(context, "tel:" + str));
        this.f2783c.startActivity(intent);
    }

    public void ufnsui(LuaObject luaObject) {
        Message message = new Message();
        message.what = 2;
        message.obj = luaObject;
        this.f2785e.sendMessage(message);
    }

    /* renamed from: ug */
    public Object mo11373ug(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view == null) {
            return null;
        }
        return new C1305g(view, this.f2783c).mo11842e(str);
    }

    /* renamed from: ug */
    public Object mo11374ug(Object obj, String str, Object obj2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view == null) {
            return null;
        }
        return new C1305g(view, this.f2783c).mo11847f(str, obj2);
    }

    public Object uht(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        boolean z = view instanceof ViewPager;
        if (z || (view instanceof VerticalViewPager)) {
            PagerAdapter adapter = z ? ((ViewPager) view).getAdapter() : view instanceof VerticalViewPager ? ((VerticalViewPager) view).getAdapter() : null;
            if (str.equals("size")) {
                if (adapter instanceof FragmentStatePagerAdapter) {
                    return Integer.valueOf(((MyFragmentStatePagerAdapter) adapter).mo11529f());
                }
            } else if (str.equals("close") && (adapter instanceof FragmentStatePagerAdapter)) {
                ((MyFragmentStatePagerAdapter) adapter).mo11525b();
            }
        }
        return null;
    }

    public Object uht(Object obj, String str, int i) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        boolean z = view instanceof ViewPager;
        if (z || (view instanceof VerticalViewPager)) {
            PagerAdapter adapter = z ? ((ViewPager) view).getAdapter() : view instanceof VerticalViewPager ? ((VerticalViewPager) view).getAdapter() : null;
            if (str.equals("del") && (adapter instanceof FragmentStatePagerAdapter)) {
                ((MyFragmentStatePagerAdapter) adapter).mo11526c(i);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[SYNTHETIC, Splitter:B:17:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object uht(java.lang.Object r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21, org.keplerproject.luajava.LuaObject r22, org.keplerproject.luajava.LuaObject r23) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.uht(java.lang.Object, java.lang.String, int, java.lang.String, java.lang.String, org.keplerproject.luajava.LuaObject, org.keplerproject.luajava.LuaObject):java.lang.Object");
    }

    public Object uht(Object obj, String str, Object obj2, Object obj3) {
        View view;
        View view2;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        boolean z = view instanceof ViewPager;
        if (z || (view instanceof VerticalViewPager)) {
            if (str.equals("bd")) {
                if (z) {
                    if (obj2 instanceof View) {
                        view2 = (View) obj2;
                    } else {
                        Object l2 = m3293l(obj2);
                        view2 = m3295n(l2, String.valueOf(l2));
                    }
                    if (view2 instanceof TabLayout) {
                        ((TabLayout) view2).setupWithViewPager((ViewPager) view, obj3.equals(Boolean.TRUE));
                    }
                }
                return null;
            }
            PagerAdapter adapter = z ? ((ViewPager) view).getAdapter() : view instanceof VerticalViewPager ? ((VerticalViewPager) view).getAdapter() : null;
            if (str.equals("title") && (adapter instanceof FragmentStatePagerAdapter)) {
                ((MyFragmentStatePagerAdapter) adapter).mo11528e(m3282a(String.valueOf(obj2)), String.valueOf(obj3));
            }
        }
        return null;
    }

    public void uigo(String str) {
        Intent intent;
        if (str.endsWith(".iyu")) {
            intent = new Intent(this.f2783c, mian.class);
        } else if (str.endsWith(".ijava")) {
            intent = new Intent(this.f2783c, main3.class);
        } else if (str.endsWith(".ilua")) {
            intent = new Intent(this.f2783c, main.class);
        } else if (str.endsWith(".ijs")) {
            intent = new Intent(this.f2783c, main2.class);
        } else {
            return;
        }
        intent.putExtras(C0839h.m1886B(str));
        this.f2783c.startActivity(intent);
    }

    public void uigo(String str, int i) {
        Intent intent;
        if (str.endsWith(".iyu")) {
            intent = new Intent(this.f2783c, mian.class);
        } else if (str.endsWith(".ijava")) {
            intent = new Intent(this.f2783c, main3.class);
        } else if (str.endsWith(".ilua")) {
            intent = new Intent(this.f2783c, main.class);
        } else if (str.endsWith(".ijs")) {
            intent = new Intent(this.f2783c, main2.class);
        } else {
            return;
        }
        intent.putExtras(C0839h.m1886B(str));
        intent.setFlags(i);
        this.f2783c.startActivity(intent);
    }

    public void uit(Intent intent) {
        this.f2783c.startActivity(intent);
    }

    public void uit(Intent intent, String str, String str2) {
        Context context;
        if (str.equals("chooser")) {
            context = this.f2783c;
            intent = Intent.createChooser(intent, str2);
        } else if (str.equals("result")) {
            this.f2782b.startActivityForResult(intent, Integer.parseInt(str2));
            return;
        } else {
            context = this.f2783c;
        }
        context.startActivity(intent);
    }

    public void ujp(String str, int i) {
        C0862t.m2076a(this.f2782b, m3304w(str), i);
    }

    public Object ula(Object obj, String str) {
        Object obj2;
        ArrayList<HashMap<Integer, Object>> a;
        if (str == null || str.equals("clear")) {
            if ((obj instanceof C1220d1) && (obj2 = ((C1220d1) obj).f2807b) != null) {
                if (obj2 instanceof C1223e1) {
                    a = ((C1223e1) obj2).mo11454a();
                } else if (obj2 instanceof C1227f1) {
                    a = ((C1227f1) obj2).mo11462a();
                }
                a.clear();
            }
            return null;
        } else if (!str.equals("list")) {
            return null;
        } else {
            return ((obj == null || !(obj instanceof C1220d1)) ? new C1220d1(this, null) : (C1220d1) obj).f2806a;
        }
    }

    public Object ula(Object obj, LuaObject luaObject, LuaObject luaObject2) {
        Object[] objArr;
        Object[] objArr2;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        try {
            objArr2 = luaObject2.array();
        } catch (Exception e2) {
            e2.printStackTrace();
            objArr2 = null;
        }
        int length = objArr.length;
        C1220d1 d1Var = (obj == null || !(obj instanceof C1220d1)) ? new C1220d1(this, null) : (C1220d1) obj;
        HashMap<Integer, Object> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            hashMap.put(Integer.valueOf((int) Double.parseDouble(objArr[i].toString())), objArr2[i]);
        }
        d1Var.f2806a.add(hashMap);
        return d1Var;
    }

    public void ula(Object obj) {
        Object obj2;
        if ((obj instanceof C1220d1) && (obj2 = ((C1220d1) obj).f2807b) != null) {
            if (obj2 instanceof C1223e1) {
                ((C1223e1) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof ArrayAdapter) {
                ((ArrayAdapter) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof C1227f1) {
                ((C1227f1) obj2).notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        if ((r5 instanceof com.iapp.app.Aid_luaCode.C1220d1) != false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object ulag(java.lang.Object r5, int r6, java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.ulag(java.lang.Object, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object ulag(java.lang.Object r4, java.lang.Object r5) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.ulag(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ulas(java.lang.Object r5, int r6, int r7, java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.ulas(java.lang.Object, int, int, java.lang.Object):void");
    }

    public void ulas(Object obj, int i, Object obj2) {
        if (obj instanceof View) {
            Object[] objArr = (Object[]) ((View) obj).getTag();
            if (objArr[3] instanceof HashMap) {
                ((HashMap) objArr[3]).put(Integer.valueOf(i), obj2);
            }
        }
    }

    public void uls(Object obj, Object obj2) {
        View view;
        ArrayAdapter arrayAdapter;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null && (view instanceof Spinner)) {
            Spinner spinner = (Spinner) view;
            if (obj2 instanceof ArrayList) {
                arrayAdapter = new ArrayAdapter(this.f2783c, 17367048, (ArrayList) obj2);
            } else if (obj2 instanceof String[]) {
                arrayAdapter = new ArrayAdapter(this.f2783c, 17367048, (String[]) obj2);
            } else if (obj2 instanceof Object[]) {
                arrayAdapter = new ArrayAdapter(this.f2783c, 17367048, (Object[]) obj2);
            } else {
                return;
            }
            arrayAdapter.setDropDownViewResource(17367049);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        }
    }

    public void uls(Object obj, Object obj2, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            if (view instanceof ListView) {
                ListView listView = (ListView) view;
                if (obj2 instanceof C1220d1) {
                    C1220d1 d1Var = (C1220d1) obj2;
                    if (d1Var.f2807b == null) {
                        d1Var.f2807b = new C1223e1(this.f2782b);
                    }
                    C1223e1 e1Var = (C1223e1) d1Var.f2807b;
                    e1Var.mo11455b(str, d1Var);
                    listView.setAdapter((ListAdapter) e1Var);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = d1Var;
                    listView.setTag(objArr);
                }
            } else if (view instanceof GridView) {
                GridView gridView = (GridView) view;
                if (obj2 instanceof C1220d1) {
                    C1220d1 d1Var2 = (C1220d1) obj2;
                    if (d1Var2.f2807b == null) {
                        d1Var2.f2807b = new C1223e1(this.f2782b);
                    }
                    C1223e1 e1Var2 = (C1223e1) d1Var2.f2807b;
                    e1Var2.mo11455b(str, d1Var2);
                    gridView.setAdapter((ListAdapter) e1Var2);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = d1Var2;
                    gridView.setTag(objArr2);
                }
            } else if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                if (obj2 instanceof C1220d1) {
                    C1220d1 d1Var3 = (C1220d1) obj2;
                    if (d1Var3.f2807b == null) {
                        d1Var3.f2807b = new C1227f1(this.f2782b);
                    }
                    C1227f1 f1Var = (C1227f1) d1Var3.f2807b;
                    f1Var.mo11465d(str, d1Var3);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.f2782b));
                    recyclerView.setAdapter(f1Var);
                    Object[] objArr3 = (Object[]) recyclerView.getTag();
                    objArr3[3] = d1Var3;
                    recyclerView.setTag(objArr3);
                }
            } else if (view instanceof TabLayout) {
                TabLayout tabLayout = (TabLayout) view;
                if (obj2 instanceof C1220d1) {
                    C0844j jVar = new C0844j(this.f2782b, 2);
                    int i = m3290i(str.substring(0, str.length() - 4));
                    Iterator<HashMap<Integer, Object>> it = ((C1220d1) obj2).f2806a.iterator();
                    while (it.hasNext()) {
                        HashMap<Integer, Object> next = it.next();
                        LinearLayout linearLayout = new LinearLayout(this.f2782b);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        openRestoreinterface(str, linearLayout, i, next);
                        TabLayout.C1283g newTab = tabLayout.newTab();
                        newTab.mo11607k(linearLayout);
                        tabLayout.addTab(newTab);
                        for (Integer num : next.keySet()) {
                            int parseInt = Integer.parseInt(String.valueOf(num));
                            if (parseInt > 0) {
                                C0839h.m1914w(linearLayout.findViewById(parseInt + i), next.get(Integer.valueOf(parseInt)), next, jVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public void uls(Object obj, Object obj2, String str, int i, int i2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            if (view instanceof ListView) {
                ListView listView = (ListView) view;
                if (obj2 instanceof C1220d1) {
                    C1220d1 d1Var = (C1220d1) obj2;
                    if (d1Var.f2807b == null) {
                        d1Var.f2807b = new C1223e1(this.f2782b);
                    }
                    C1223e1 e1Var = (C1223e1) d1Var.f2807b;
                    e1Var.mo11455b(str, d1Var);
                    e1Var.mo11456c(i, i2);
                    listView.setAdapter((ListAdapter) e1Var);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = d1Var;
                    listView.setTag(objArr);
                }
            } else if (view instanceof GridView) {
                GridView gridView = (GridView) view;
                if (obj2 instanceof C1220d1) {
                    C1220d1 d1Var2 = (C1220d1) obj2;
                    if (d1Var2.f2807b == null) {
                        d1Var2.f2807b = new C1223e1(this.f2782b);
                    }
                    C1223e1 e1Var2 = (C1223e1) d1Var2.f2807b;
                    e1Var2.mo11455b(str, d1Var2);
                    e1Var2.mo11456c(i, i2);
                    gridView.setAdapter((ListAdapter) e1Var2);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = d1Var2;
                    gridView.setTag(objArr2);
                }
            } else if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                if (obj2 instanceof C1220d1) {
                    C1220d1 d1Var3 = (C1220d1) obj2;
                    if (d1Var3.f2807b == null) {
                        d1Var3.f2807b = new C1227f1(this.f2782b);
                    }
                    C1227f1 f1Var = (C1227f1) d1Var3.f2807b;
                    f1Var.mo11465d(str, d1Var3);
                    f1Var.mo11466e(i, i2);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.f2782b));
                    recyclerView.setAdapter(f1Var);
                    Object[] objArr3 = (Object[]) recyclerView.getTag();
                    objArr3[3] = d1Var3;
                    recyclerView.setTag(objArr3);
                }
            } else if (view instanceof TabLayout) {
                TabLayout tabLayout = (TabLayout) view;
                if (obj2 instanceof C1220d1) {
                    C0844j jVar = new C0844j(this.f2782b, 2);
                    int i3 = m3290i(str.substring(0, str.length() - 4));
                    Iterator<HashMap<Integer, Object>> it = ((C1220d1) obj2).f2806a.iterator();
                    while (it.hasNext()) {
                        HashMap<Integer, Object> next = it.next();
                        LinearLayout linearLayout = new LinearLayout(this.f2782b);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
                        linearLayout.setOrientation(1);
                        openRestoreinterface(str, linearLayout, i3, next);
                        TabLayout.C1283g newTab = tabLayout.newTab();
                        newTab.mo11607k(linearLayout);
                        tabLayout.addTab(newTab);
                        for (Integer num : next.keySet()) {
                            int parseInt = Integer.parseInt(String.valueOf(num));
                            if (parseInt > 0) {
                                C0839h.m1914w(linearLayout.findViewById(parseInt + i3), next.get(Integer.valueOf(parseInt)), next, jVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public void uninapp(String str) {
        Context context = this.f2783c;
        this.f2783c.startActivity(new Intent("android.intent.action.DELETE", C0851m.m1977c(context, "package:" + str)));
    }

    public Bitmap uqr(String str, int i) {
        return new C0853o(this.f2783c, this.f2782b).mo8950c(str, i);
    }

    public String uqr(Object obj) {
        return (obj instanceof Bitmap ? new C0853o(this.f2783c, this.f2782b).mo8951d((Bitmap) obj) : new C0853o(this.f2783c, this.f2782b).mo8952e(m3304w(String.valueOf(obj)))).mo8696f();
    }

    public void uqr() {
        new C0853o(this.f2783c, this.f2782b).mo8948a();
    }

    public void uqr(int i) {
        new C0853o(this.f2783c, this.f2782b).mo8949b(i);
    }

    public void urvw(Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11400us(java.lang.Object r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r4 = (android.view.View) r4
        L_0x0007:
            r0 = 0
            goto L_0x004d
        L_0x0009:
            java.lang.Object r4 = r3.m3293l(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0 = 46
            int r0 = r4.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0042
            java.lang.String r2 = r4.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_luaCode.f2779f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r3.f2782b
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 + r0
            android.view.View r4 = r2.findViewById(r4)
            goto L_0x004d
        L_0x0040:
            r4 = 0
            goto L_0x0007
        L_0x0042:
            android.app.Activity r0 = r3.f2782b
            int r4 = java.lang.Integer.parseInt(r4)
            android.view.View r4 = r0.findViewById(r4)
            goto L_0x0007
        L_0x004d:
            if (r4 != 0) goto L_0x0050
            return r1
        L_0x0050:
            com.iapp.app.g r1 = new com.iapp.app.g
            android.content.Context r2 = r3.f2783c
            r1.<init>(r4, r2, r0)
            boolean r4 = r1.mo11843e0(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.mo11400us(java.lang.Object, java.lang.String, java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11401us(java.lang.Object r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r4 = (android.view.View) r4
        L_0x0007:
            r0 = 0
            goto L_0x004d
        L_0x0009:
            java.lang.Object r4 = r3.m3293l(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0 = 46
            int r0 = r4.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0042
            java.lang.String r2 = r4.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_luaCode.f2779f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r3.f2782b
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 + r0
            android.view.View r4 = r2.findViewById(r4)
            goto L_0x004d
        L_0x0040:
            r4 = 0
            goto L_0x0007
        L_0x0042:
            android.app.Activity r0 = r3.f2782b
            int r4 = java.lang.Integer.parseInt(r4)
            android.view.View r4 = r0.findViewById(r4)
            goto L_0x0007
        L_0x004d:
            if (r4 != 0) goto L_0x0050
            return r1
        L_0x0050:
            com.iapp.app.g r1 = new com.iapp.app.g
            android.content.Context r2 = r3.f2783c
            r1.<init>(r4, r2, r0)
            boolean r4 = r1.mo11848f0(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.mo11401us(java.lang.Object, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11402us(java.lang.Object r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r4 = (android.view.View) r4
        L_0x0007:
            r0 = 0
            goto L_0x004d
        L_0x0009:
            java.lang.Object r4 = r3.m3293l(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0 = 46
            int r0 = r4.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0042
            java.lang.String r2 = r4.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_luaCode.f2779f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r3.f2782b
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 + r0
            android.view.View r4 = r2.findViewById(r4)
            goto L_0x004d
        L_0x0040:
            r4 = 0
            goto L_0x0007
        L_0x0042:
            android.app.Activity r0 = r3.f2782b
            int r4 = java.lang.Integer.parseInt(r4)
            android.view.View r4 = r0.findViewById(r4)
            goto L_0x0007
        L_0x004d:
            if (r4 != 0) goto L_0x0050
            return r1
        L_0x0050:
            com.iapp.app.g r1 = new com.iapp.app.g
            android.content.Context r2 = r3.f2783c
            r1.<init>(r4, r2, r0)
            boolean r4 = r1.mo11852g0(r5, r6, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.mo11402us(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11403us(java.lang.Object r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r9 = (android.view.View) r9
        L_0x0007:
            r0 = 0
            goto L_0x004d
        L_0x0009:
            java.lang.Object r9 = r8.m3293l(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0 = 46
            int r0 = r9.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0042
            java.lang.String r2 = r9.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r9 = r9.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_luaCode.f2779f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r8.f2782b
            int r9 = java.lang.Integer.parseInt(r9)
            int r9 = r9 + r0
            android.view.View r9 = r2.findViewById(r9)
            goto L_0x004d
        L_0x0040:
            r9 = 0
            goto L_0x0007
        L_0x0042:
            android.app.Activity r0 = r8.f2782b
            int r9 = java.lang.Integer.parseInt(r9)
            android.view.View r9 = r0.findViewById(r9)
            goto L_0x0007
        L_0x004d:
            if (r9 != 0) goto L_0x0050
            return r1
        L_0x0050:
            com.iapp.app.g r2 = new com.iapp.app.g
            android.content.Context r1 = r8.f2783c
            r2.<init>(r9, r1, r0)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            boolean r9 = r2.mo11856h0(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.mo11403us(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public Object usg(Camera camera, boolean z) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return C0862t.m2084i(this.f2783c, z);
            }
            if (z) {
                camera = Camera.open();
                m3281H(camera);
                return camera;
            } else if (camera == null) {
                return null;
            } else {
                m3280G(camera);
                camera.release();
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ushsp(boolean z) {
        Activity activity;
        int i;
        if (!z) {
            i = 1;
            if (this.f2782b.getRequestedOrientation() != 1) {
                activity = this.f2782b;
            } else {
                return;
            }
        } else if (this.f2782b.getRequestedOrientation() != 0) {
            activity = this.f2782b;
            i = 0;
        } else {
            return;
        }
        activity.setRequestedOrientation(i);
    }

    public void usjxm(boolean z) {
        if (z) {
            this.f2782b.getWindow().clearFlags(128);
        } else {
            this.f2782b.getWindow().setFlags(128, 128);
        }
    }

    public void usms(String str, String str2) {
        Context context = this.f2783c;
        Intent intent = new Intent("android.intent.action.SENDTO", C0851m.m1977c(context, "smsto:" + str));
        intent.putExtra("sms_body", str2);
        this.f2783c.startActivity(intent);
    }

    public Object usx(C1319k kVar, String str) {
        if (str.equals("st")) {
            kVar.mo11966y();
            return null;
        } else if (str.equals("sp")) {
            kVar.mo11967z();
            return null;
        } else if (str.equals("re")) {
            kVar.mo11963u();
            return null;
        } else if (str.equals("getrotaing")) {
            return Integer.valueOf(kVar.mo11962r());
        } else {
            return null;
        }
    }

    public void usx(C1319k kVar, Object obj, Object obj2) {
        if (obj.equals("rotaing")) {
            kVar.mo11964w(Integer.parseInt(obj2.toString()));
        } else if (obj.equals("usg")) {
            kVar.mo11965x(obj2.equals(Boolean.TRUE));
        }
    }

    public void usx(C1319k kVar, String str, String str2, int i, boolean z) {
        if (str.equals("shot")) {
            kVar.mo11961q(m3304w(str2), i, z);
        }
    }

    public C1319k usxh(Object obj, int i) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2783c, this.f2782b, (SurfaceView) view, false, i);
        }
        return null;
    }

    public C1319k usxh(Object obj, int i, int i2, int i3, int i4) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2783c, this.f2782b, (SurfaceView) view, false, i, i2, i3, i4);
        }
        return null;
    }

    public C1319k usxq(Object obj, int i) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2783c, this.f2782b, (SurfaceView) view, true, i);
        }
        return null;
    }

    public C1319k usxq(Object obj, int i, int i2, int i3, int i4) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2783c, this.f2782b, (SurfaceView) view, true, i, i2, i3, i4);
        }
        return null;
    }

    public Object utb(Object obj, Object obj2) {
        View view;
        View view2;
        if (!String.valueOf(obj).equals("get")) {
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                Object l = m3293l(obj);
                view = m3295n(l, String.valueOf(l));
            }
            if (view != null && (view instanceof Toolbar)) {
                if (obj2 instanceof View) {
                    view2 = (View) obj2;
                } else {
                    Object l2 = m3293l(obj2);
                    view2 = m3295n(l2, String.valueOf(l2));
                }
                if (view2 != null && (view2 instanceof DrawerLayout)) {
                    ((AppCompatActivity) this.f2782b).getSupportActionBar().setHomeButtonEnabled(true);
                    DrawerLayout drawerLayout = (DrawerLayout) view2;
                    String obj3 = ((Object[]) drawerLayout.getTag())[2].toString();
                    C1233i iVar = new C1233i(this.f2782b, drawerLayout, (Toolbar) view, 0, 0, obj3.contains("<eventItme type=\"ondrawerclosed\">"), drawerLayout, obj3.contains("<eventItme type=\"ondraweropened\">"), obj3.contains("<eventItme type=\"onoptionsitemselected\">"));
                    drawerLayout.setDrawerListener(iVar);
                    iVar.syncState();
                }
            }
            return null;
        } else if (obj2.equals("sab")) {
            return ((AppCompatActivity) this.f2782b).getSupportActionBar();
        } else {
            if (obj2.equals("title")) {
                return String.valueOf(((AppCompatActivity) this.f2782b).getSupportActionBar().getTitle());
            }
            if (obj2.equals("subtitle")) {
                return String.valueOf(((AppCompatActivity) this.f2782b).getSupportActionBar().getSubtitle());
            }
            if (obj2.equals("cv")) {
                return ((AppCompatActivity) this.f2782b).getSupportActionBar().getCustomView();
            }
            if (obj2.equals("do")) {
                return Integer.valueOf(((AppCompatActivity) this.f2782b).getSupportActionBar().getDisplayOptions());
            }
            if (obj2.equals("height")) {
                return Integer.valueOf(((AppCompatActivity) this.f2782b).getSupportActionBar().getHeight());
            }
            return null;
        }
    }

    public void utb(Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view != null && (view instanceof Toolbar)) {
            ((AppCompatActivity) this.f2782b).setSupportActionBar((Toolbar) view);
        }
    }

    public void utb(Object obj, Object obj2, Object obj3) {
        View view;
        View view2;
        boolean z;
        ActionBar supportActionBar;
        Boolean bool = Boolean.TRUE;
        if (obj.equals("set")) {
            if (obj2.equals("title")) {
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setTitle(String.valueOf(obj3));
            }
            if (obj2.equals("subtitle")) {
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setSubtitle(String.valueOf(obj3));
                return;
            } else if (obj2.equals("cv")) {
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setCustomView((View) obj3);
                return;
            } else if (obj2.equals("do")) {
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setDisplayOptions(m3282a(String.valueOf(obj3)));
                return;
            } else if (obj2.equals("dste")) {
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setDisplayShowTitleEnabled(obj3.equals(bool));
                return;
            } else if (obj2.equals("dsce")) {
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setDisplayShowCustomEnabled(obj3.equals(bool));
                return;
            } else if (obj2.equals("dshe")) {
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setHomeButtonEnabled(obj3.equals(bool));
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setDisplayShowHomeEnabled(obj3.equals(bool));
                supportActionBar = ((AppCompatActivity) this.f2782b).getSupportActionBar();
                z = obj3.equals(bool);
            } else {
                return;
            }
        } else if (obj.equals("left")) {
            if (obj2 instanceof View) {
                view2 = (View) obj2;
            } else {
                Object l = m3293l(obj2);
                view2 = m3295n(l, String.valueOf(l));
            }
            if (view2 != null && (view2 instanceof Toolbar)) {
                ((Toolbar) view2).setNavigationIcon(C1305g.m3582m(String.valueOf(obj3), this.f2783c));
                z = true;
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setHomeButtonEnabled(true);
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setDisplayShowHomeEnabled(true);
                supportActionBar = ((AppCompatActivity) this.f2782b).getSupportActionBar();
            } else {
                return;
            }
        } else if (obj.equals("right")) {
            if (obj2 instanceof View) {
                view = (View) obj2;
            } else {
                Object l2 = m3293l(obj2);
                view = m3295n(l2, String.valueOf(l2));
            }
            if (view != null && (view instanceof Toolbar)) {
                ((Toolbar) view).setOverflowIcon(C1305g.m3582m(String.valueOf(obj3), this.f2783c));
                return;
            }
            return;
        } else {
            return;
        }
        supportActionBar.setDisplayHomeAsUpEnabled(z);
    }

    public void utb(Object obj, Object obj2, Object obj3, LuaObject luaObject) {
        View view;
        if (obj.equals("set") && obj2.equals("leftck")) {
            if (obj3 instanceof View) {
                view = (View) obj3;
            } else {
                Object l = m3293l(obj3);
                view = m3295n(l, String.valueOf(l));
            }
            if (view != null && (view instanceof Toolbar)) {
                ((Toolbar) view).setNavigationOnClickListener(new View$OnClickListenerC1235j(this, luaObject));
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setHomeButtonEnabled(true);
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setDisplayShowHomeEnabled(true);
                ((AppCompatActivity) this.f2782b).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
    }

    public View utw(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, LuaObject luaObject, LuaObject luaObject2, LuaObject luaObject3) {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.f2783c).setTitle(str).setPositiveButton(str3, new DialogInterface$OnClickListenerC1211a1(this, luaObject)).setNeutralButton(str4, new DialogInterface$OnClickListenerC1268z0(this, luaObject2)).setNegativeButton(str5, new DialogInterface$OnClickListenerC1266y0(this, luaObject3));
        if (obj != null) {
            negativeButton.setIcon(obj instanceof Drawable ? (Drawable) obj : C1305g.m3582m(String.valueOf(m3293l(obj)), this.f2783c));
        }
        LinearLayout linearLayout = null;
        if (str2.endsWith(".ilua")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout2 = new LinearLayout(this.f2783c);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setOrientation(1);
            try {
                openRestoreinterface(str2, linearLayout2, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            negativeButton.setView(linearLayout2);
            linearLayout = linearLayout2;
        } else {
            negativeButton.setMessage(str2);
        }
        AlertDialog create = negativeButton.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return linearLayout;
    }

    public View utw(Object obj, String str, String str2, String str3, String str4, boolean z, LuaObject luaObject, LuaObject luaObject2) {
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this.f2783c).setTitle(str).setPositiveButton(str3, new DialogInterface$OnClickListenerC1217c1(this, luaObject)).setNeutralButton(str4, new DialogInterface$OnClickListenerC1214b1(this, luaObject2));
        if (obj != null) {
            neutralButton.setIcon(obj instanceof Drawable ? (Drawable) obj : C1305g.m3582m(String.valueOf(m3293l(obj)), this.f2783c));
        }
        LinearLayout linearLayout = null;
        if (str2.endsWith(".ilua")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout2 = new LinearLayout(this.f2783c);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setOrientation(1);
            try {
                openRestoreinterface(str2, linearLayout2, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            neutralButton.setView(linearLayout2);
            linearLayout = linearLayout2;
        } else {
            neutralButton.setMessage(str2);
        }
        AlertDialog create = neutralButton.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return linearLayout;
    }

    public View utw(Object obj, String str, String str2, String str3, boolean z, LuaObject luaObject) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f2783c).setTitle(str).setPositiveButton(str3, new DialogInterface$OnClickListenerC1209a(this, luaObject));
        if (obj != null) {
            positiveButton.setIcon(obj instanceof Drawable ? (Drawable) obj : C1305g.m3582m(String.valueOf(m3293l(obj)), this.f2783c));
        }
        LinearLayout linearLayout = null;
        if (str2.endsWith(".ilua")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout2 = new LinearLayout(this.f2783c);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setOrientation(1);
            try {
                openRestoreinterface(str2, linearLayout2, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            positiveButton.setView(linearLayout2);
            linearLayout = linearLayout2;
        } else {
            positiveButton.setMessage(str2);
        }
        AlertDialog create = positiveButton.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return linearLayout;
    }

    public View utw(Object obj, String str, String str2, boolean z) {
        AlertDialog.Builder title = new AlertDialog.Builder(this.f2783c).setTitle(str);
        if (obj != null) {
            title.setIcon(obj instanceof Drawable ? (Drawable) obj : C1305g.m3582m(String.valueOf(m3293l(obj)), this.f2783c));
        }
        if (str2.endsWith(".ilua")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.f2783c);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            try {
                openRestoreinterface(str2, linearLayout, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            title.setView(linearLayout);
        } else {
            title.setMessage(str2);
        }
        AlertDialog create = title.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return null;
    }

    public View uxf(String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, int i7) {
        try {
            LinearLayout linearLayout = new LinearLayout(this.f2783c);
            linearLayout.setOrientation(1);
            int i8 = m3290i(str.substring(0, str.length() - 4));
            linearLayout.setId(i8);
            openRestoreinterface(str, linearLayout, i8, null);
            View childAt = linearLayout.getChildAt(0);
            linearLayout.removeAllViews();
            C0862t.m2080e(this.f2783c, childAt, i, i2, i3, i4, i5, C1305g.m3587t(str2), i6, i7);
            return childAt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public View uxf(String str, int i, int i2, String str2) {
        try {
            LinearLayout linearLayout = new LinearLayout(this.f2783c);
            linearLayout.setOrientation(1);
            int i3 = m3290i(str.substring(0, str.length() - 4));
            linearLayout.setId(i3);
            openRestoreinterface(str, linearLayout, i3, null);
            View childAt = linearLayout.getChildAt(0);
            linearLayout.removeAllViews();
            C0862t.m2080e(this.f2783c, childAt, 0, 0, i, i2, 0, C1305g.m3587t(str2), 0, 0);
            return childAt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void uxf(Object obj) {
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            ((WindowManager) this.f2783c.getApplicationContext().getSystemService("window")).updateViewLayout(view, view.getLayoutParams());
        }
    }

    public void uxf(Object obj, String str) {
        if (str.equals("del")) {
            View view = null;
            if (obj instanceof View) {
                view = (View) obj;
            }
            if (view != null) {
                ((WindowManager) this.f2783c.getApplicationContext().getSystemService("window")).removeView(view);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uxf(java.lang.Object r2, java.lang.String r3, int r4, int r5, int r6, int r7, int r8, java.lang.String r9, int r10, int r11) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "set"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0063
            android.view.View r2 = (android.view.View) r2
            android.content.Context r3 = r1.f2783c
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0
            r0.x = r4
            r0.y = r5
            r4 = -2
            if (r6 != 0) goto L_0x002c
            r0.width = r4
            goto L_0x002e
        L_0x002c:
            r0.width = r6
        L_0x002e:
            if (r7 != 0) goto L_0x0033
            r0.height = r4
            goto L_0x0035
        L_0x0033:
            r0.height = r7
        L_0x0035:
            if (r8 != 0) goto L_0x003e
            int r4 = p013b.p044b.p045a.p046a.C0862t.m2081f()
            r0.type = r4
            goto L_0x0040
        L_0x003e:
            r0.type = r8
        L_0x0040:
            int r4 = com.iapp.app.C1305g.m3587t(r9)
            r0.gravity = r4
            if (r10 != 0) goto L_0x004d
            r4 = 40
        L_0x004a:
            r0.flags = r4
            goto L_0x0055
        L_0x004d:
            r4 = 1
            if (r10 != r4) goto L_0x0053
            r4 = 32
            goto L_0x004a
        L_0x0053:
            r0.flags = r10
        L_0x0055:
            if (r11 != 0) goto L_0x005b
            r4 = -3
            r0.format = r4
            goto L_0x005d
        L_0x005b:
            r0.format = r11
        L_0x005d:
            r2.setLayoutParams(r0)
            r3.updateViewLayout(r2, r0)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_luaCode.uxf(java.lang.Object, java.lang.String, int, int, int, int, int, java.lang.String, int, int):void");
    }

    public void uxf(Object obj, String str, int i, int i2, int i3, int i4, String str2) {
        if (str.equals("set")) {
            View view = null;
            if (obj instanceof View) {
                view = (View) obj;
            }
            if (view != null) {
                WindowManager windowManager = (WindowManager) this.f2783c.getApplicationContext().getSystemService("window");
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                layoutParams.x = i;
                layoutParams.y = i2;
                if (i3 == 0) {
                    layoutParams.width = -2;
                } else {
                    layoutParams.width = i3;
                }
                if (i4 == 0) {
                    layoutParams.height = -2;
                } else {
                    layoutParams.height = i4;
                }
                layoutParams.gravity = C1305g.m3587t(str2);
                view.setLayoutParams(layoutParams);
                windowManager.updateViewLayout(view, layoutParams);
            }
        }
    }

    public void uycl(String str, boolean z) {
        C0862t.m2078c(this.f2782b, C0860r.m2056o(str), z, this.f2782b.findViewById(C0839h.f1737a));
    }

    public void uycl(String str, boolean z, int i) {
        C0862t.m2079d(this.f2782b, C0860r.m2056o(str), z, this.f2782b.findViewById(C0839h.f1737a), i);
    }

    public void uycl(boolean z) {
        if (z) {
            this.f2782b.getWindow().clearFlags(2048);
            this.f2782b.getWindow().setFlags(1024, 1024);
            return;
        }
        this.f2782b.getWindow().addFlags(2048);
    }

    public Vibrator uzd(Vibrator vibrator, long j) {
        if (vibrator == null) {
            vibrator = (Vibrator) this.f2783c.getSystemService("vibrator");
        }
        vibrator.vibrate(j);
        return vibrator;
    }

    public Vibrator uzd(Vibrator vibrator, LuaObject luaObject, boolean z) {
        if (vibrator == null) {
            vibrator = (Vibrator) this.f2783c.getSystemService("vibrator");
        }
        Object[] objArr = null;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int length = objArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Long.parseLong(objArr[i].toString());
        }
        vibrator.vibrate(jArr, z ? 1 : -1);
        return vibrator;
    }

    @TargetApi(11)
    public Object uzd(Vibrator vibrator, String str) {
        if (vibrator == null) {
            vibrator = (Vibrator) this.f2783c.getSystemService("vibrator");
        }
        if (str.equals("sp")) {
            try {
                vibrator.cancel();
            } catch (Exception unused) {
            }
            return null;
        } else if (str.equals("ip")) {
            return Build.VERSION.SDK_INT >= 11 ? Boolean.valueOf(vibrator.hasVibrator()) : Boolean.FALSE;
        } else {
            return null;
        }
    }

    public String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    public Object yul(Object obj, String str) {
        View view;
        View p;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            Object l = m3293l(obj);
            view = m3295n(l, String.valueOf(l));
        }
        if (view == null || (p = C0839h.m1907p(this.f2783c, str)) == null) {
            return null;
        }
        ((ViewGroup) view).addView(p);
        return null;
    }

    public Object yul(String str) {
        return C0839h.m1907p(this.f2783c, str);
    }

    public int zdp(float f) {
        return C0860r.m2053l(this.f2783c, f);
    }

    /* renamed from: zj */
    public Object mo11439zj(String str) {
        return C0839h.m1905n(str, new Object[]{"Activity", this.f2783c});
    }

    /* renamed from: zj */
    public Object mo11440zj(String str, LuaObject luaObject) {
        Object[] objArr;
        Object[] objArr2;
        try {
            objArr = luaObject.array();
        } catch (Exception e) {
            e.printStackTrace();
            objArr = null;
        }
        if (objArr == null) {
            objArr2 = new Object[]{"Activity", this.f2783c};
        } else {
            int length = objArr.length;
            Object[] objArr3 = new Object[(length + 2)];
            objArr3[0] = "Activity";
            objArr3[1] = this.f2783c;
            for (int i = 0; i < length; i++) {
                objArr3[i + 2] = objArr[i];
            }
            objArr2 = objArr3;
        }
        return C0839h.m1905n(str, objArr2);
    }

    public int zpd(float f) {
        return C0860r.m2064w(this.f2783c, f);
    }

    public int zps(float f) {
        return C0860r.m2065x(this.f2783c, f);
    }

    public int zsp(float f) {
        return C0860r.m2037A(this.f2783c, f);
    }
}
