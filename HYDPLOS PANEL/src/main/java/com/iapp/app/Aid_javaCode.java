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
import com.iapp.interfaces.OnHandler;
import com.iapp.interfaces.OnMessagesListener;
import com.iapp.interfaces.OnThread;
import dalvik.system.DexClassLoader;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
public class Aid_javaCode {
    public static AlertDialog alertdialog;

    /* renamed from: f */
    private static HashMap<String, Object> f2486f = new HashMap<>();

    /* renamed from: g */
    private static int f2487g = 0;
    public static HashMap<String, Object> ss_dim;

    /* renamed from: a */
    private HashMap<String, Object> f2488a = new HashMap<>();

    /* renamed from: b */
    private Activity f2489b = null;

    /* renamed from: c */
    private Context f2490c = null;

    /* renamed from: d */
    private C1309h f2491d = null;

    /* renamed from: e */
    private Handler f2492e = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$a */
    public class View$OnLongClickListenerC1102a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2493a;

        View$OnLongClickListenerC1102a(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2493a = hVar;
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            C1309h hVar = this.f2493a;
            return hVar.mo11943c("press" + id, Integer.valueOf(id), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$a0 */
    public class View$OnTouchListenerC1103a0 implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2494a;

        View$OnTouchListenerC1103a0(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2494a = hVar;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            C1309h hVar = this.f2494a;
            return hVar.mo11943c("touchmonitor" + id, Integer.valueOf(id), view, Integer.valueOf(motionEvent.getAction()), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$b */
    public class View$OnKeyListenerC1104b implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2495a;

        View$OnKeyListenerC1104b(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2495a = hVar;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            C1309h hVar = this.f2495a;
            return hVar.mo11943c("keyboard" + id, Integer.valueOf(id), view, Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getRepeatCount()), keyEvent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.Aid_javaCode$b0 */
    public class C1105b0 {

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> f2496a;

        /* renamed from: b */
        public Object f2497b;

        private C1105b0(Aid_javaCode aid_javaCode) {
            this.f2496a = new ArrayList<>();
            this.f2497b = null;
        }

        /* synthetic */ C1105b0(Aid_javaCode aid_javaCode, HandlerC1120k kVar) {
            this(aid_javaCode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$c */
    public class View$OnCreateContextMenuListenerC1106c implements View.OnCreateContextMenuListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2498a;

        View$OnCreateContextMenuListenerC1106c(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2498a = hVar;
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
                C1309h hVar = this.f2498a;
                hVar.mo11942b("onCreateContextMenu" + id + "x0", Integer.valueOf(id), view);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$c0 */
    private class C1107c0 extends BaseAdapter {

        /* renamed from: a */
        private Context f2499a;

        /* renamed from: b */
        private C0844j f2500b;

        /* renamed from: c */
        private C1105b0 f2501c;

        /* renamed from: d */
        private String f2502d = null;

        /* renamed from: e */
        private C1309h f2503e = null;

        /* renamed from: f */
        private final Object[] f2504f = new Object[0];

        /* renamed from: g */
        private int f2505g = 0;

        /* renamed from: h */
        private int f2506h;

        /* renamed from: i */
        private int f2507i = -1;

        /* renamed from: j */
        private int f2508j = -2;

        /* renamed from: k */
        private Iterator f2509k;

        /* renamed from: l */
        private C1108a f2510l;

        /* renamed from: m */
        private ArrayList<Integer> f2511m = null;

        /* renamed from: com.iapp.app.Aid_javaCode$c0$a */
        private final class C1108a {

            /* renamed from: a */
            public ViewGroup f2513a;

            /* renamed from: b */
            public int[] f2514b;

            /* renamed from: c */
            public View[] f2515c;

            private C1108a(C1107c0 c0Var) {
                this.f2514b = null;
                this.f2515c = null;
            }

            /* synthetic */ C1108a(C1107c0 c0Var, HandlerC1120k kVar) {
                this(c0Var);
            }
        }

        public C1107c0(Context context) {
            this.f2499a = context;
            this.f2500b = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo10693a() {
            return this.f2501c.f2496a;
        }

        /* renamed from: b */
        public void mo10694b(String str, C1105b0 b0Var) {
            this.f2502d = str;
            this.f2501c = b0Var;
            this.f2505g = Aid_javaCode.this.m3082h(str.substring(0, str.length() - 4));
        }

        /* renamed from: c */
        public void mo10695c(int i, int i2) {
            this.f2507i = i;
            this.f2508j = i2;
        }

        public int getCount() {
            C1105b0 b0Var = this.f2501c;
            if (b0Var == null) {
                return 0;
            }
            return b0Var.f2496a.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout;
            HashMap<Integer, Object> hashMap = this.f2501c.f2496a.get(i);
            int i2 = 0;
            if (view == null) {
                this.f2510l = new C1108a(this, null);
                LinearLayout linearLayout2 = new LinearLayout(this.f2499a);
                linearLayout2.setLayoutParams(new AbsListView.LayoutParams(this.f2507i, this.f2508j));
                linearLayout2.setOrientation(1);
                LinearLayout linearLayout3 = new LinearLayout(this.f2499a);
                linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(this.f2507i, this.f2508j));
                linearLayout3.setOrientation(1);
                linearLayout2.addView(linearLayout3);
                this.f2503e = Aid_javaCode.this.openRestoreinterface(this.f2502d, linearLayout3, this.f2505g, hashMap);
                this.f2509k = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f2509k.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f2509k.next()));
                    this.f2506h = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                C1108a aVar = this.f2510l;
                aVar.f2515c = new View[size];
                aVar.f2514b = new int[size];
                if (this.f2511m == null) {
                    this.f2511m = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue = ((Integer) arrayList.get(i3)).intValue();
                        this.f2506h = intValue;
                        C1108a aVar2 = this.f2510l;
                        aVar2.f2514b[i3] = intValue;
                        if (intValue > 0) {
                            aVar2.f2515c[i3] = linearLayout2.findViewById(intValue + this.f2505g);
                        }
                        stringBuffer.append(this.f2506h + this.f2505g);
                        stringBuffer.append(',');
                    }
                    Aid_javaCode.this.setClickable(this.f2511m, stringBuffer, linearLayout2);
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        int intValue2 = ((Integer) arrayList.get(i4)).intValue();
                        this.f2506h = intValue2;
                        C1108a aVar3 = this.f2510l;
                        aVar3.f2514b[i4] = intValue2;
                        if (intValue2 > 0) {
                            aVar3.f2515c[i4] = linearLayout2.findViewById(intValue2 + this.f2505g);
                        }
                    }
                }
                C1108a aVar4 = this.f2510l;
                aVar4.f2513a = linearLayout3;
                linearLayout2.setTag(aVar4);
                linearLayout = linearLayout2;
            } else {
                this.f2510l = (C1108a) view.getTag();
                linearLayout = view;
            }
            while (true) {
                C1108a aVar5 = this.f2510l;
                int[] iArr = aVar5.f2514b;
                if (i2 >= iArr.length) {
                    break;
                }
                if (iArr[i2] > 0) {
                    C0839h.m1914w(aVar5.f2515c[i2], hashMap.get(Integer.valueOf(iArr[i2])), hashMap, this.f2500b);
                }
                i2++;
            }
            Iterator<Integer> it = this.f2511m.iterator();
            while (it.hasNext()) {
                View findViewById = linearLayout.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            C1309h hVar = this.f2503e;
            if (hVar != null) {
                try {
                    hVar.getNameSpace().invokeMethod("loading", this.f2504f, this.f2503e);
                } catch (EvalError e) {
                    e.printStackTrace();
                }
            }
            return linearLayout;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$d */
    public class C1109d implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2516a;

        C1109d(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2516a = hVar;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            StringBuilder sb;
            int id = textView.getId();
            C1309h hVar = this.f2516a;
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

    /* renamed from: com.iapp.app.Aid_javaCode$d0 */
    private class C1110d0 extends RecyclerView.Adapter<C1111a> {

        /* renamed from: a */
        private Context f2517a;

        /* renamed from: b */
        private C0844j f2518b;

        /* renamed from: c */
        private C1105b0 f2519c;

        /* renamed from: d */
        private C1309h f2520d = null;

        /* renamed from: e */
        private String f2521e = null;

        /* renamed from: f */
        private final Object[] f2522f = new Object[0];

        /* renamed from: g */
        private int f2523g = 0;

        /* renamed from: h */
        private int f2524h;

        /* renamed from: i */
        private int f2525i = -1;

        /* renamed from: j */
        private int f2526j = -2;

        /* renamed from: k */
        private Iterator f2527k;

        /* renamed from: l */
        private ArrayList<Integer> f2528l = null;

        /* access modifiers changed from: package-private */
        /* renamed from: com.iapp.app.Aid_javaCode$d0$a */
        public class C1111a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ViewGroup f2530a;

            /* renamed from: b */
            public int[] f2531b = null;

            /* renamed from: c */
            public View[] f2532c = null;

            public C1111a(C1110d0 d0Var, ViewGroup viewGroup) {
                super(viewGroup);
                this.f2530a = viewGroup;
            }
        }

        public C1110d0(Context context) {
            this.f2517a = context;
            this.f2518b = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo10701a() {
            return this.f2519c.f2496a;
        }

        /* renamed from: b */
        public void onBindViewHolder(C1111a aVar, int i) {
            HashMap<Integer, Object> hashMap = this.f2519c.f2496a.get(i);
            int i2 = 0;
            if (aVar.f2531b == null) {
                this.f2520d = Aid_javaCode.this.openRestoreinterface(this.f2521e, aVar.f2530a, this.f2523g, hashMap);
                this.f2527k = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f2527k.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f2527k.next()));
                    this.f2524h = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                aVar.f2532c = new View[size];
                aVar.f2531b = new int[size];
                if (this.f2528l == null) {
                    this.f2528l = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue = ((Integer) arrayList.get(i3)).intValue();
                        this.f2524h = intValue;
                        aVar.f2531b[i3] = intValue;
                        if (intValue > 0) {
                            aVar.f2532c[i3] = aVar.f2530a.findViewById(intValue + this.f2523g);
                        }
                        stringBuffer.append(this.f2524h + this.f2523g);
                        stringBuffer.append(',');
                    }
                    Aid_javaCode.this.setClickable(this.f2528l, stringBuffer, aVar.f2530a);
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        int intValue2 = ((Integer) arrayList.get(i4)).intValue();
                        this.f2524h = intValue2;
                        aVar.f2531b[i4] = intValue2;
                        if (intValue2 > 0) {
                            aVar.f2532c[i4] = aVar.f2530a.findViewById(intValue2 + this.f2523g);
                        }
                    }
                }
            }
            while (true) {
                int[] iArr = aVar.f2531b;
                if (i2 >= iArr.length) {
                    break;
                }
                if (iArr[i2] > 0) {
                    C0839h.m1914w(aVar.f2532c[i2], hashMap.get(Integer.valueOf(iArr[i2])), hashMap, this.f2518b);
                }
                i2++;
            }
            Iterator<Integer> it = this.f2528l.iterator();
            while (it.hasNext()) {
                View findViewById = aVar.f2530a.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            C1309h hVar = this.f2520d;
            if (hVar != null) {
                try {
                    hVar.getNameSpace().invokeMethod("loading", this.f2522f, this.f2520d);
                } catch (EvalError e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: c */
        public C1111a onCreateViewHolder(ViewGroup viewGroup, int i) {
            LinearLayout linearLayout = new LinearLayout(this.f2517a);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f2525i, this.f2526j));
            linearLayout.setOrientation(1);
            return new C1111a(this, linearLayout);
        }

        /* renamed from: d */
        public void mo10704d(String str, C1105b0 b0Var) {
            this.f2521e = str;
            this.f2519c = b0Var;
            this.f2523g = Aid_javaCode.this.m3082h(str.substring(0, str.length() - 4));
        }

        /* renamed from: e */
        public void mo10705e(int i, int i2) {
            this.f2525i = i;
            this.f2526j = i2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            C1105b0 b0Var = this.f2519c;
            if (b0Var == null) {
                return 0;
            }
            return b0Var.f2496a.size();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$e */
    public class View$OnFocusChangeListenerC1112e implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2533a;

        View$OnFocusChangeListenerC1112e(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2533a = hVar;
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            C1309h hVar = this.f2533a;
            hVar.mo11942b("focuschange" + id, Integer.valueOf(id), view, Boolean.valueOf(z));
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$e0 */
    private class C1113e0 {

        /* renamed from: a */
        private OnThread f2534a;

        /* renamed from: com.iapp.app.Aid_javaCode$e0$a */
        class C1114a extends Thread {
            C1114a(Aid_javaCode aid_javaCode) {
            }

            public void run() {
                C1113e0.this.f2534a.run();
            }
        }

        public C1113e0(Aid_javaCode aid_javaCode, OnThread onThread) {
            this.f2534a = onThread;
            C1114a aVar = new C1114a(aid_javaCode);
            aVar.setName("CeShi_" + aVar.getId());
            aVar.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$f */
    public class C1115f implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2536a;

        /* renamed from: b */
        final /* synthetic */ C1309h f2537b;

        /* renamed from: c */
        final /* synthetic */ boolean f2538c;

        C1115f(Aid_javaCode aid_javaCode, boolean z, C1309h hVar, boolean z2) {
            this.f2536a = z;
            this.f2537b = hVar;
            this.f2538c = z2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.f2538c) {
                int id = absListView.getId();
                C1309h hVar = this.f2537b;
                hVar.mo11942b("onscroll" + id, Integer.valueOf(id), absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (this.f2536a) {
                int id = absListView.getId();
                C1309h hVar = this.f2537b;
                hVar.mo11942b("onscrollstatechanged" + id, Integer.valueOf(id), absListView, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$g */
    public class C1116g implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2539a;

        C1116g(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2539a = hVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            C1309h hVar = this.f2539a;
            hVar.mo11942b("clickitem" + id, Integer.valueOf(id), adapterView, Integer.valueOf(i), Long.valueOf(j), view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$h */
    public class C1117h implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2540a;

        /* renamed from: b */
        final /* synthetic */ C1309h f2541b;

        /* renamed from: c */
        final /* synthetic */ boolean f2542c;

        C1117h(Aid_javaCode aid_javaCode, boolean z, C1309h hVar, boolean z2) {
            this.f2540a = z;
            this.f2541b = hVar;
            this.f2542c = z2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f2540a) {
                int id = adapterView.getId();
                C1309h hVar = this.f2541b;
                hVar.mo11942b("onitemselected" + id, Integer.valueOf(id), adapterView, view, Integer.valueOf(i), Long.valueOf(j));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (this.f2542c) {
                int id = adapterView.getId();
                C1309h hVar = this.f2541b;
                hVar.mo11942b("onnothingselected" + id, Integer.valueOf(id), adapterView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$i */
    public class C1118i implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2543a;

        /* renamed from: b */
        final /* synthetic */ C1309h f2544b;

        /* renamed from: c */
        final /* synthetic */ boolean f2545c;

        /* renamed from: d */
        final /* synthetic */ boolean f2546d;

        C1118i(Aid_javaCode aid_javaCode, boolean z, C1309h hVar, boolean z2, boolean z3) {
            this.f2543a = z;
            this.f2544b = hVar;
            this.f2545c = z2;
            this.f2546d = z3;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.f2546d) {
                int id = seekBar.getId();
                C1309h hVar = this.f2544b;
                hVar.mo11942b("onprogresschanged2" + id, Integer.valueOf(id), seekBar, Integer.valueOf(i), Boolean.valueOf(z));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (this.f2545c) {
                int id = seekBar.getId();
                C1309h hVar = this.f2544b;
                hVar.mo11942b("onstarttrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f2543a) {
                int id = seekBar.getId();
                C1309h hVar = this.f2544b;
                hVar.mo11942b("onstoptrackingtouch" + id, Integer.valueOf(id), seekBar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$j */
    public class C1119j implements TabLayout.AbstractC1278d {

        /* renamed from: a */
        final /* synthetic */ boolean f2547a;

        /* renamed from: b */
        final /* synthetic */ View f2548b;

        /* renamed from: c */
        final /* synthetic */ C1309h f2549c;

        /* renamed from: d */
        final /* synthetic */ boolean f2550d;

        /* renamed from: e */
        final /* synthetic */ boolean f2551e;

        C1119j(Aid_javaCode aid_javaCode, boolean z, View view, C1309h hVar, boolean z2, boolean z3) {
            this.f2547a = z;
            this.f2548b = view;
            this.f2549c = hVar;
            this.f2550d = z2;
            this.f2551e = z3;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(TabLayout.C1283g gVar) {
            if (this.f2551e) {
                int id = this.f2548b.getId();
                C1309h hVar = this.f2549c;
                hVar.mo11942b("ontabreselected" + id, Integer.valueOf(id), (TabLayout) this.f2548b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(TabLayout.C1283g gVar) {
            if (this.f2550d) {
                int id = this.f2548b.getId();
                C1309h hVar = this.f2549c;
                hVar.mo11942b("ontabunselected" + id, Integer.valueOf(id), (TabLayout) this.f2548b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(TabLayout.C1283g gVar) {
            if (this.f2547a) {
                int id = this.f2548b.getId();
                C1309h hVar = this.f2549c;
                hVar.mo11942b("ontabselected" + id, Integer.valueOf(id), (TabLayout) this.f2548b, Integer.valueOf(gVar.mo11600d()), String.valueOf(gVar.mo11601e()), gVar);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$k */
    class HandlerC1120k extends Handler {
        HandlerC1120k(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_javaCode.this.f2490c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((OnHandler) message.obj).mo12261on();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$l */
    public class C1121l extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2553a;

        /* renamed from: b */
        final /* synthetic */ C1309h f2554b;

        /* renamed from: c */
        final /* synthetic */ boolean f2555c;

        C1121l(Aid_javaCode aid_javaCode, boolean z, C1309h hVar, boolean z2) {
            this.f2553a = z;
            this.f2554b = hVar;
            this.f2555c = z2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f2553a) {
                int id = recyclerView.getId();
                C1309h hVar = this.f2554b;
                hVar.mo11942b("onscrollstatechanged" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(i));
            }
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.f2555c) {
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
                C1309h hVar = this.f2554b;
                hVar.mo11942b("onscrolled" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(i3), Integer.valueOf(childCount), Integer.valueOf(itemCount), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$m */
    public class C1122m extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2556a;

        /* renamed from: b */
        final /* synthetic */ View f2557b;

        /* renamed from: c */
        final /* synthetic */ C1309h f2558c;

        C1122m(Aid_javaCode aid_javaCode, boolean z, View view, C1309h hVar) {
            this.f2556a = z;
            this.f2557b = view;
            this.f2558c = hVar;
        }

        public void onLongPress(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (this.f2556a && (findChildViewUnder = (recyclerView = (RecyclerView) this.f2557b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) != null) {
                int id = recyclerView.getId();
                C1309h hVar = this.f2558c;
                hVar.mo11942b("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            RecyclerView recyclerView;
            View findChildViewUnder;
            if (!this.f2556a || (findChildViewUnder = (recyclerView = (RecyclerView) this.f2557b).findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                return false;
            }
            int id = recyclerView.getId();
            C1309h hVar = this.f2558c;
            hVar.mo11942b("clickitem" + id, Integer.valueOf(id), recyclerView, Integer.valueOf(recyclerView.getChildLayoutPosition(findChildViewUnder)), findChildViewUnder);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$n */
    public class C1123n implements RecyclerView.OnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f2559a;

        C1123n(Aid_javaCode aid_javaCode, GestureDetector gestureDetector) {
            this.f2559a = gestureDetector;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f2559a.onTouchEvent(motionEvent);
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
    /* renamed from: com.iapp.app.Aid_javaCode$o */
    public class C1124o implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2560a;

        /* renamed from: b */
        final /* synthetic */ View f2561b;

        /* renamed from: c */
        final /* synthetic */ C1309h f2562c;

        /* renamed from: d */
        final /* synthetic */ boolean f2563d;

        /* renamed from: e */
        final /* synthetic */ boolean f2564e;

        C1124o(Aid_javaCode aid_javaCode, boolean z, View view, C1309h hVar, boolean z2, boolean z3) {
            this.f2560a = z;
            this.f2561b = view;
            this.f2562c = hVar;
            this.f2563d = z2;
            this.f2564e = z3;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f2564e) {
                int id = this.f2561b.getId();
                C1309h hVar = this.f2562c;
                hVar.mo11942b("onpagescrollstatechanged" + id, Integer.valueOf(id), (VerticalViewPager) this.f2561b, Integer.valueOf(i));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f2563d) {
                int id = this.f2561b.getId();
                C1309h hVar = this.f2562c;
                hVar.mo11942b("onpagescrolled" + id, Integer.valueOf(id), (VerticalViewPager) this.f2561b, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f2560a) {
                int id = this.f2561b.getId();
                C1309h hVar = this.f2562c;
                hVar.mo11942b("onpageselected" + id, Integer.valueOf(id), (VerticalViewPager) this.f2561b, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$p */
    public class C1125p implements SwipeRefreshLayout.OnRefreshListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2565a;

        /* renamed from: b */
        final /* synthetic */ View f2566b;

        /* renamed from: c */
        final /* synthetic */ C1309h f2567c;

        C1125p(Aid_javaCode aid_javaCode, boolean z, View view, C1309h hVar) {
            this.f2565a = z;
            this.f2566b = view;
            this.f2567c = hVar;
        }

        @Override // android.support.p009v4.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            if (this.f2565a) {
                int id = this.f2566b.getId();
                C1309h hVar = this.f2567c;
                hVar.mo11942b("onrefresh" + id, Integer.valueOf(id), (SwipeRefreshLayout) this.f2566b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$q */
    public class C1126q implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2568a;

        /* renamed from: b */
        final /* synthetic */ View f2569b;

        /* renamed from: c */
        final /* synthetic */ C1309h f2570c;

        C1126q(Aid_javaCode aid_javaCode, boolean z, View view, C1309h hVar) {
            this.f2568a = z;
            this.f2569b = view;
            this.f2570c = hVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f2568a) {
                int id = this.f2569b.getId();
                C1309h hVar = this.f2570c;
                hVar.mo11942b("oncheckedchanged" + id, Integer.valueOf(id), compoundButton, Boolean.valueOf(z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$r */
    public class C1127r implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2571a;

        /* renamed from: b */
        final /* synthetic */ C1309h f2572b;

        C1127r(Aid_javaCode aid_javaCode, boolean z, C1309h hVar) {
            this.f2571a = z;
            this.f2572b = hVar;
        }

        @Override // android.support.design.widget.AppBarLayout.OnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (this.f2571a) {
                int id = appBarLayout.getId();
                C1309h hVar = this.f2572b;
                hVar.mo11942b("onoffsetchanged" + id, Integer.valueOf(id), appBarLayout, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$s */
    public class C1128s implements AbstractC1442a {
        C1128s(Aid_javaCode aid_javaCode) {
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

    /* renamed from: com.iapp.app.Aid_javaCode$t */
    class HandlerC1129t extends Handler {
        HandlerC1129t(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_javaCode.this.f2490c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((OnHandler) message.obj).mo12261on();
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$u */
    class HandlerC1130u extends Handler {
        HandlerC1130u(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_javaCode.this.f2490c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((OnHandler) message.obj).mo12261on();
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$v */
    class HandlerC1131v extends Handler {
        HandlerC1131v(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_javaCode.this.f2490c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                ((OnHandler) message.obj).mo12261on();
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$w */
    class C1132w extends ActionBarDrawerToggle {

        /* renamed from: a */
        final /* synthetic */ boolean f2576a;

        /* renamed from: b */
        final /* synthetic */ DrawerLayout f2577b;

        /* renamed from: c */
        final /* synthetic */ boolean f2578c;

        /* renamed from: d */
        final /* synthetic */ boolean f2579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1132w(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2, boolean z, DrawerLayout drawerLayout2, boolean z2, boolean z3) {
            super(activity, drawerLayout, toolbar, i, i2);
            this.f2576a = z;
            this.f2577b = drawerLayout2;
            this.f2578c = z2;
            this.f2579d = z3;
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerClosed(View view) {
            if (this.f2576a) {
                int id = this.f2577b.getId();
                C1309h hVar = Aid_javaCode.this.f2491d;
                hVar.mo11942b("ondrawerclosed" + id, Integer.valueOf(id), this.f2577b, view);
            }
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerOpened(View view) {
            if (this.f2578c) {
                int id = this.f2577b.getId();
                C1309h hVar = Aid_javaCode.this.f2491d;
                hVar.mo11942b("ondraweropened" + id, Integer.valueOf(id), this.f2577b, view);
            }
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (!this.f2579d) {
                return false;
            }
            int id = this.f2577b.getId();
            C1309h hVar = Aid_javaCode.this.f2491d;
            return hVar.mo11943c("onoptionsitemselected" + id, Integer.valueOf(id), this.f2577b, menuItem);
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$x */
    class C1133x extends WebChromeClient {
        C1133x(Aid_javaCode aid_javaCode) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* renamed from: com.iapp.app.Aid_javaCode$y */
    class C1134y extends WebChromeClient {
        C1134y(Aid_javaCode aid_javaCode) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_javaCode$z */
    public class View$OnClickListenerC1135z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1309h f2581a;

        View$OnClickListenerC1135z(Aid_javaCode aid_javaCode, C1309h hVar) {
            this.f2581a = hVar;
        }

        public void onClick(View view) {
            int id = view.getId();
            C1309h hVar = this.f2581a;
            hVar.mo11942b("clicki" + id, Integer.valueOf(id), view);
        }
    }

    public Aid_javaCode(Activity activity) {
        this.f2490c = activity;
        this.f2489b = activity;
        this.f2492e = new HandlerC1120k(activity.getMainLooper());
    }

    public Aid_javaCode(Activity activity, C1309h hVar) {
        this.f2490c = activity;
        this.f2489b = activity;
        this.f2491d = hVar;
        this.f2492e = new HandlerC1130u(activity.getMainLooper());
    }

    public Aid_javaCode(Context context, Activity activity) {
        this.f2490c = context;
        this.f2489b = activity;
        this.f2492e = new HandlerC1129t(context.getMainLooper());
    }

    public Aid_javaCode(Context context, Activity activity, C1309h hVar) {
        this.f2490c = context;
        this.f2489b = activity;
        this.f2491d = hVar;
        this.f2492e = new HandlerC1131v(context.getMainLooper());
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: A */
    private void m3069A(WebView webView, String str, StringBuffer stringBuffer, C1309h hVar) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(this.f2490c.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(this.f2490c.getApplicationContext().getDir("database", 0).getPath());
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
        if (addViewEventItme(stringBuffer, str, webView.getId(), "ondownloadstart", "int st_vId,android.webkit.WebView st_vW,String st_url,String st_uT,String st_cN,String st_mE,long st_cH")) {
            new C1325l(webView, hVar);
        } else {
            webView.setDownloadListener(new C1128s(this));
        }
        new C1443b().mo12142b(webView, str, stringBuffer, hVar, this.f2489b, this);
        m3100z(webView);
    }

    /* renamed from: B */
    private void m3070B(String str) {
        C0839h.m1891G(this.f2490c, str);
    }

    /* renamed from: C */
    private String[] m3071C(String str, char c) {
        return C0861s.m2069b(str, c);
    }

    /* renamed from: D */
    private String m3072D(String str) {
        return str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
    }

    /* renamed from: E */
    private void m3073E(Camera camera) {
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

    /* renamed from: F */
    private void m3074F(Camera camera) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        if (camera != null && (parameters = camera.getParameters()) != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !"torch".equals(parameters.getFlashMode()) && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            camera.setParameters(parameters);
        }
    }

    /* renamed from: a */
    private int m3075a(String str) {
        return (int) Double.parseDouble(str);
    }

    public static void degclear() {
        C0864v.f1800j.clear();
        f2486f.clear();
        f2487g = 0;
    }

    /* renamed from: e */
    private void m3079e(View view, int i, String str, StringBuffer stringBuffer, C1309h hVar) {
        if (addViewEventItme(stringBuffer, str, i, "clicki", "int st_vId,android.view.View st_vW")) {
            view.setOnClickListener(new View$OnClickListenerC1135z(this, hVar));
        }
        if (addViewEventItme(stringBuffer, str, i, "touchmonitor", "int st_vId,android.view.View st_vW,int st_eA,float st_eX,float st_eY,float st_rX,float st_rY")) {
            view.setOnTouchListener(new View$OnTouchListenerC1103a0(this, hVar));
        }
        if (addViewEventItme(stringBuffer, str, i, "press", "int st_vId,android.view.View st_vW")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1102a(this, hVar));
        }
        if (addViewEventItme(stringBuffer, str, i, "keyboard", "int st_vId,android.view.View st_vW,int st_kC,int st_eA,int st_eR,android.view.KeyEvent st_eT")) {
            view.setOnKeyListener(new View$OnKeyListenerC1104b(this, hVar));
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            String c = C0860r.m2044c(str, "<eventItme type=\"pressmenu\">", "</eventItme>");
            String[] split = c.split("\ncase ");
            for (int i2 = 1; i2 < split.length; i2++) {
                stringBuffer.append("private void onCreateContextMenu" + i + "x" + i2 + "(){\n" + C0860r.m2044c(split[i2], ":", "\nbreak") + "\n}\n");
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            if (c2 != null) {
                stringBuffer.append("private void onCreateContextMenu" + i + "x0(int st_vId, android.view.View st_vW){\n" + c2 + "\n}\n");
            }
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1106c(this, hVar));
        }
        if (view instanceof TextView) {
            if (addViewEventItme(stringBuffer, str, i, "editormonitor", "int st_vId,android.widget.TextView st_vW,st_aI,st_eA,st_eR,st_eK,st_eT")) {
                ((TextView) view).setOnEditorActionListener(new C1109d(this, hVar));
            }
            boolean addViewEventItme = addViewEventItme(stringBuffer, str, i, "ontextchanged", "int st_vId,android.widget.TextView st_vW,String st_sS,st_sT,int st_bE,int st_cT");
            boolean addViewEventItme2 = addViewEventItme(stringBuffer, str, i, "beforetextchanged", "int st_vId,android.view.TextView st_vW,String st_sS,int st_sT,int st_cT,int st_aR");
            boolean addViewEventItme3 = addViewEventItme(stringBuffer, str, i, "aftertextchanged", "int st_vId,android.view.TextView st_vW,String st_sS");
            if (addViewEventItme || addViewEventItme2 || addViewEventItme3) {
                new C1355r((TextView) view, hVar, addViewEventItme, addViewEventItme2, addViewEventItme3);
            }
        }
        if (view instanceof WebView) {
            m3069A((WebView) view, str, stringBuffer, hVar);
        }
        if (addViewEventItme(stringBuffer, str, i, "focuschange", "int st_vId,android.view.View st_vW,boolean st_hF")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1112e(this, hVar));
        }
        if (view instanceof AbsListView) {
            boolean addViewEventItme4 = addViewEventItme(stringBuffer, str, i, "onscrollstatechanged", "int st_vId,android.widget.AbsListView st_vW,int st_sE");
            boolean addViewEventItme5 = addViewEventItme(stringBuffer, str, i, "onscroll", "int st_vId,android.widget.AbsListView st_vW,int st_fM,int st_vT,int st_bT");
            if (addViewEventItme4 || addViewEventItme5) {
                ((AbsListView) view).setOnScrollListener(new C1115f(this, addViewEventItme4, hVar, addViewEventItme5));
            }
        }
        if (view instanceof AdapterView) {
            if (addViewEventItme(stringBuffer, str, i, "clickitem", "int st_vId,android.widget.AdapterView st_vW,int st_pN,long st_iD,android.view.View st_vW2")) {
                ((AdapterView) view).setOnItemClickListener(new C1116g(this, hVar));
            }
            boolean addViewEventItme6 = addViewEventItme(stringBuffer, str, i, "onitemselected", "int st_vId,android.widget.AdapterView st_vW,android.view.View st_vW2,int st_pN,long st_iD");
            boolean addViewEventItme7 = addViewEventItme(stringBuffer, str, i, "onnothingselected", "int st_vId,android.widget.AdapterView st_vW");
            if (addViewEventItme6 || addViewEventItme7) {
                ((AdapterView) view).setOnItemSelectedListener(new C1117h(this, addViewEventItme6, hVar, addViewEventItme7));
            }
        }
        if (view instanceof ViewPager) {
            boolean addViewEventItme8 = addViewEventItme(stringBuffer, str, i, "onpageselected", "int st_vId,android.support.v4.view.ViewPager st_vW,int st_pN");
            boolean addViewEventItme9 = addViewEventItme(stringBuffer, str, i, "onpagescrolled", "int st_vId,android.support.v4.view.ViewPager st_vW,int st_pN,float st_pT,int st_pS");
            boolean addViewEventItme10 = addViewEventItme(stringBuffer, str, i, "onpagescrollstatechanged", "int st_vId,android.support.v4.view.ViewPager st_vW,int st_sE");
            if (addViewEventItme8 || addViewEventItme9 || addViewEventItme10) {
                new C1343o((ViewPager) view, hVar, addViewEventItme8, addViewEventItme9, addViewEventItme10);
            }
        }
        if (view instanceof DrawerLayout) {
            boolean addViewEventItme11 = addViewEventItme(stringBuffer, str, i, "ondrawerclosed", "int st_vId,android.support.v4.widget.DrawerLayout st_vW,android.view.View st_dW");
            boolean addViewEventItme12 = addViewEventItme(stringBuffer, str, i, "ondraweropened", "int st_vId,android.support.v4.widget.DrawerLayout st_vW,android.view.View st_dW");
            boolean addViewEventItme13 = addViewEventItme(stringBuffer, str, i, "onoptionsitemselected", "int st_vId,android.support.v4.widget.DrawerLayout st_vW,android.view.MenuItem st_iM");
            if (addViewEventItme11 || addViewEventItme12 || addViewEventItme13) {
                new C1334m((DrawerLayout) view, hVar, addViewEventItme11, addViewEventItme12, addViewEventItme13);
            }
        }
        if ((view instanceof SeekBar) && (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">"))) {
            boolean addViewEventItme14 = addViewEventItme(stringBuffer, str, i, "onstarttrackingtouch", "int st_vId,android.widget.SeekBar st_vW");
            boolean addViewEventItme15 = addViewEventItme(stringBuffer, str, i, "onstoptrackingtouch", "int st_vId,android.widget.SeekBar st_vW");
            boolean addViewEventItme16 = addViewEventItme(stringBuffer, str, i, "onprogresschanged2", "int st_vId,android.widget.SeekBar st_vW,int st_nS,boolean st_fR");
            if (addViewEventItme14 || addViewEventItme15 || addViewEventItme16) {
                ((SeekBar) view).setOnSeekBarChangeListener(new C1118i(this, addViewEventItme15, hVar, addViewEventItme14, addViewEventItme16));
            }
        }
        m3081g(view, str, stringBuffer, hVar);
    }

    /* renamed from: f */
    private void m3080f(View view, String str, Object obj) {
        if (str.equals("clicki")) {
            view.setOnClickListener((View.OnClickListener) obj);
        } else if (str.equals("touchmonitor")) {
            view.setOnTouchListener((View.OnTouchListener) obj);
        } else if (str.equals("press")) {
            view.setOnLongClickListener((View.OnLongClickListener) obj);
        } else if (str.equals("keyboard")) {
            view.setOnKeyListener((View.OnKeyListener) obj);
        } else if (str.equals("editormonitor")) {
            ((TextView) view).setOnEditorActionListener((TextView.OnEditorActionListener) obj);
        } else if (str.equals("addtextchanged")) {
            ((TextView) view).addTextChangedListener((TextWatcher) obj);
        } else if (str.equals("ondownloadstart")) {
            ((WebView) view).setDownloadListener((AbstractC1442a) obj);
        } else if (str.equals("webviewclient")) {
            C1443b.m4050c((WebView) view, obj);
        } else if (str.equals("focuschange")) {
            view.setOnFocusChangeListener((View.OnFocusChangeListener) obj);
        } else if (str.equals("onscroll")) {
            ((AbsListView) view).setOnScrollListener((AbsListView.OnScrollListener) obj);
        } else if (str.equals("clickitem")) {
            ((AdapterView) view).setOnItemClickListener((AdapterView.OnItemClickListener) obj);
        } else if (str.equals("onitemselected")) {
            ((AdapterView) view).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) obj);
        } else if (str.equals("onpagechange")) {
            ((ViewPager) view).setOnPageChangeListener((ViewPager.OnPageChangeListener) obj);
        } else if (str.equals("ondrawer")) {
            ((DrawerLayout) view).setDrawerListener((DrawerLayout.DrawerListener) obj);
        } else if (str.equals("onseekbarchange")) {
            ((SeekBar) view).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) obj);
        }
    }

    /* renamed from: g */
    private void m3081g(View view, String str, StringBuffer stringBuffer, C1309h hVar) {
        if ((view instanceof TabLayout) && (str.contains("<eventItme type=\"ontabselected\">") || str.contains("<eventItme type=\"ontabunselected\">") || str.contains("<eventItme type=\"ontabreselected\">"))) {
            ((TabLayout) view).addOnTabSelectedListener(new C1119j(this, addViewEventItme(stringBuffer, str, view.getId(), "ontabselected", "int st_vId,com.iapp.app.TabLayout st_vW,int st_pN,String st_tT,com.iapp.app.TabLayout.Tab st_taB"), view, hVar, addViewEventItme(stringBuffer, str, view.getId(), "ontabunselected", "int st_vId,com.iapp.app.TabLayout st_vW,int st_pN,String st_tT,com.iapp.app.TabLayout.Tab st_taB"), addViewEventItme(stringBuffer, str, view.getId(), "ontabreselected", "int st_vId,com.iapp.app.TabLayout st_vW,int st_pN,String st_tT,com.iapp.app.TabLayout.Tab st_taB")));
        }
        if (view instanceof RecyclerView) {
            if (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscrolled\">")) {
                ((RecyclerView) view).addOnScrollListener(new C1121l(this, addViewEventItme(stringBuffer, str, view.getId(), "onscrollstatechanged", "int st_vId,android.support.v7.widget.RecyclerView st_vW,int st_sE"), hVar, addViewEventItme(stringBuffer, str, view.getId(), "onscrolled", "int st_vId,android.support.v7.widget.RecyclerView st_vW,int st_fM,int st_vT,int st_bT,int st_dX,int st_dY,boolean st_isB")));
            }
            if (str.contains("<eventItme type=\"clickitem\">")) {
                ((RecyclerView) view).addOnItemTouchListener(new C1123n(this, new GestureDetector(this.f2490c, new C1122m(this, addViewEventItme(stringBuffer, str, view.getId(), "clickitem", "int st_vId,android.support.v7.widget.RecyclerView st_vW,int st_pN,android.view.View st_vW2"), view, hVar))));
            }
        }
        if ((view instanceof VerticalViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ((VerticalViewPager) view).setOnPageChangeListener(new C1124o(this, addViewEventItme(stringBuffer, str, view.getId(), "onpageselected", "int st_vId,fr.castorflex.android.verticalviewpager.VerticalViewPager st_vW,int st_pN"), view, hVar, addViewEventItme(stringBuffer, str, view.getId(), "onpagescrolled", "int st_vId,fr.castorflex.android.verticalviewpager.VerticalViewPager st_vW,int st_pN,float st_pT,int st_pS"), addViewEventItme(stringBuffer, str, view.getId(), "onpagescrollstatechanged", "int st_vId,fr.castorflex.android.verticalviewpager.VerticalViewPager st_vW,int st_sE")));
        }
        if ((view instanceof SwipeRefreshLayout) && str.contains("<eventItme type=\"onrefresh\">")) {
            ((SwipeRefreshLayout) view).setOnRefreshListener(new C1125p(this, addViewEventItme(stringBuffer, str, view.getId(), "onrefresh", "int st_vId,android.support.v4.widget.SwipeRefreshLayout st_vW"), view, hVar));
        }
        if ((view instanceof CompoundButton) && str.contains("<eventItme type=\"oncheckedchanged\">")) {
            ((CompoundButton) view).setOnCheckedChangeListener(new C1126q(this, addViewEventItme(stringBuffer, str, view.getId(), "oncheckedchanged", "int st_vId,android.widget.CompoundButton st_vW,boolean st_iC"), view, hVar));
        }
        if ((view instanceof AppBarLayout) && str.contains("<eventItme type=\"onoffsetchanged\">")) {
            ((AppBarLayout) view).addOnOffsetChangedListener(new C1127r(this, addViewEventItme(stringBuffer, str, view.getId(), "onoffsetchanged", "st_vId,st_vW,st_vO"), hVar));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private synchronized int m3082h(String str) {
        Object obj = f2486f.get(str);
        if (obj != null) {
            return Integer.parseInt(obj.toString());
        }
        int i = f2487g + 10000;
        f2487g = i;
        f2486f.put(str, Integer.valueOf(i));
        return f2487g;
    }

    /* renamed from: i */
    private byte[] m3083i(String str, char c) {
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

    /* renamed from: j */
    private void m3084j(String str, Object obj, int i) {
        HashMap<String, Object> hashMap;
        if (!str.equals("null")) {
            if (i == 0) {
                hashMap = this.f2488a;
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

    /* renamed from: k */
    private Object m3085k(Object obj) {
        return obj;
    }

    /* renamed from: l */
    private View m3086l(View view, Object obj, String str) {
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
            Object obj2 = f2486f.get(substring);
            if (obj2 == null) {
                return null;
            }
            return view.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2486f.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return view.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: m */
    private View m3087m(Object obj, String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(46);
        if (indexOf == -1 || trim.indexOf(34) != -1) {
            String valueOf = String.valueOf(obj);
            int indexOf2 = valueOf.indexOf(46);
            if (indexOf2 == -1) {
                return this.f2489b.findViewById(Integer.parseInt(valueOf));
            }
            String substring = valueOf.substring(0, indexOf2);
            String substring2 = valueOf.substring(indexOf2 + 1);
            Object obj2 = f2486f.get(substring);
            if (obj2 == null) {
                return null;
            }
            return this.f2489b.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2486f.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return this.f2489b.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: n */
    private int m3088n() {
        try {
            Display defaultDisplay = this.f2489b.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return displayMetrics.heightPixels - displayMetrics2.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: o */
    private String[] m3089o() {
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

    /* renamed from: p */
    private int[] m3090p() {
        return new int[]{this.f2489b.getWindowManager().getDefaultDisplay().getWidth(), this.f2489b.getWindowManager().getDefaultDisplay().getHeight()};
    }

    /* renamed from: q */
    private int[] m3091q() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: r */
    private String[] m3092r() {
        return new String[]{Build.MODEL, Build.BRAND, String.valueOf(Build.VERSION.SDK_INT)};
    }

    /* renamed from: s */
    private int m3093s() {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return this.f2490c.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: t */
    private int m3094t() {
        int identifier = this.f2490c.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f2490c.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: u */
    private String m3095u(String str) {
        return C0839h.m1906o(this.f2490c, str);
    }

    /* renamed from: v */
    private GradientDrawable.Orientation m3096v(String str) {
        return str.equals("topbottom") ? GradientDrawable.Orientation.TOP_BOTTOM : str.equals("trbl") ? GradientDrawable.Orientation.TR_BL : str.equals("rightleft") ? GradientDrawable.Orientation.RIGHT_LEFT : str.equals("brtl") ? GradientDrawable.Orientation.BR_TL : str.equals("bottomtop") ? GradientDrawable.Orientation.BOTTOM_TOP : str.equals("bltr") ? GradientDrawable.Orientation.BL_TR : str.equals("leftright") ? GradientDrawable.Orientation.LEFT_RIGHT : str.equals("tlbr") ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TOP_BOTTOM;
    }

    /* renamed from: w */
    private String m3097w(String str) {
        String c;
        String c2;
        Intent launchIntentForPackage = this.f2490c.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null || (c = C0860r.m2044c(launchIntentForPackage.toString(), "cmp=", " ")) == null || (c2 = C0860r.m2044c(c, "/", null)) == null) {
            return "";
        }
        if (!c2.startsWith(".")) {
            return c2;
        }
        return str + c2;
    }

    /* renamed from: x */
    private void m3098x(C0836g gVar, Object obj) {
        if (gVar != null) {
            gVar.f1731j = null;
            gVar.f1732k = null;
            gVar.mo8932s((OnFileDownStatusListener) obj);
        }
    }

    /* renamed from: y */
    private void m3099y(File file) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        C0851m.m1975a(this.f2490c, intent, file, C0860r.m2057p(file));
        this.f2490c.startActivity(intent);
    }

    @TargetApi(11)
    /* renamed from: z */
    private void m3100z(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
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
        stringBuffer.append("private void " + str2 + i + "(" + str3 + "){\n" + c + "\n}\n");
        return true;
    }

    public Object addv(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            if ((view instanceof ViewPager) || (view instanceof VerticalViewPager)) {
                ArrayList arrayList = new ArrayList();
                String[] C = m3071C(str, '|');
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                for (String str2 : C) {
                    String trim = str2.trim();
                    if (trim.endsWith(".ijava")) {
                        LinearLayout linearLayout = new LinearLayout(this.f2490c);
                        linearLayout.setLayoutParams(layoutParams);
                        linearLayout.setOrientation(1);
                        openRestoreinterface(trim, linearLayout, m3082h(trim.substring(0, trim.length() - 5)), null);
                        arrayList.add(linearLayout);
                    }
                }
                new C1437s(view, arrayList);
                return arrayList;
            } else if ((view instanceof DrawerLayout) || (view instanceof ViewGroup)) {
                String[] C2 = m3071C(str, '|');
                for (String str3 : C2) {
                    String trim2 = str3.trim();
                    if (trim2.endsWith(".ijava")) {
                        openRestoreinterface(str3.trim(), (ViewGroup) view, m3082h(trim2.substring(0, trim2.length() - 5)), null);
                    }
                }
            }
        }
        return null;
    }

    public ArrayList<Object> aslist(ArrayList<Object> arrayList, Object[] objArr) {
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

    public ArrayList<Object> aslist(ArrayList<Object> arrayList, Object[] objArr, int i) {
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
        if (!C0839h.m1895d(this.f2490c, mediaPlayer, str)) {
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
                C0839h.m1895d(this.f2490c, mediaPlayer, str);
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
            C0849k.m1968h((Bitmap) obj, i, m3095u(str));
        }
    }

    public void bfs(Object obj, String str) {
        if (obj instanceof Bitmap) {
            C0849k.m1968h((Bitmap) obj, 100, m3095u(str));
        }
    }

    public void bfv(String str) {
        Intent intent = new Intent(this.f2490c, Videoview.class);
        Bundle bundle = new Bundle();
        bundle.putString("video", str);
        bundle.putBoolean("sfhp", false);
        intent.putExtras(bundle);
        this.f2490c.startActivity(intent);
    }

    public void bfv(String str, boolean z) {
        Intent intent = new Intent(this.f2490c, Videoview.class);
        Bundle bundle = new Bundle();
        bundle.putString("video", str);
        bundle.putBoolean("sfhp", z);
        intent.putExtras(bundle);
        this.f2490c.startActivity(intent);
    }

    public void bfvs(Object obj, Object obj2) {
        Uri c;
        if (!(obj instanceof VideoView)) {
            m3085k(obj);
            obj = m3087m(obj, String.valueOf(obj));
        }
        VideoView videoView = (VideoView) obj;
        if (obj2 instanceof Uri) {
            c = (Uri) obj2;
        } else {
            String valueOf = String.valueOf(obj2);
            if (C0860r.m2063v(valueOf.toLowerCase())) {
                c = C0851m.m1977c(this.f2490c, valueOf);
            } else {
                videoView.setVideoPath(m3095u(valueOf));
                return;
            }
        }
        videoView.setVideoURI(c);
    }

    public Object bfvss(Object obj, String str) {
        int currentPosition;
        if (!(obj instanceof VideoView)) {
            m3085k(obj);
            obj = m3087m(obj, String.valueOf(obj));
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
            MediaController mediaController = new MediaController(this.f2490c);
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
            m3085k(obj);
            obj = m3087m(obj, String.valueOf(obj));
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
                C1340n nVar2 = new C1340n(this.f2489b);
                C1340n.f3148n = nVar2;
                nVar2.mo11986n(m3095u(str), i, i2, i3, i4);
                return;
            }
            nVar.mo11984j(m3095u(str), i, i2, i3, i4);
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
            String u = m3095u(str);
            C0835f.m1845b(u, false);
            mediaRecorder2.setOutputFile(u);
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
            bArr = m3083i(str2.trim(), ' ');
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
            bArr = m3083i(str.trim(), ' ');
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr != null) {
            String u = m3095u(str2);
            File file = new File(u);
            if (z || !file.exists()) {
                C0835f.m1853j(u, bArr);
            }
        }
    }

    public void btoo(byte[] bArr, String str, boolean z) {
        if (bArr != null) {
            String u = m3095u(str);
            File file = new File(u);
            if (z || !file.exists()) {
                C0835f.m1853j(u, bArr);
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
                m3070B(substring + "myu");
                obj = C0864v.f1802l.get(str2 + "0");
            }
            String obj2 = obj.toString();
            C0839h.m1889E(this.f2490c, this.f2489b, str2, obj2.substring(obj2.indexOf(10)).trim());
        } else if (str.equals("mjava")) {
            C1309h hVar = new C1309h(this.f2490c);
            try {
                hVar.set("activity", this.f2490c);
                hVar.set("i", new Aid_javaCode(this.f2490c, this.f2489b, hVar));
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
            C1298d dVar = new C1298d(this.f2490c);
            dVar.mo11700l("activity", this.f2490c);
            dVar.mo11700l("i", new Aid_luaCode(this.f2490c, this.f2489b, dVar));
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
            sb.append(C0839h.m1896e(this.f2490c, "import.mjs"));
            sb.append("\n");
            sb.append(C0839h.m1892a(this.f2490c, str2.substring(0, indexOf3) + ".mjs"));
            sb.append("\n\nvar returns = ");
            sb.append(str2.substring(indexOf3 + 1));
            sb.append("();</script></head></html>");
            String sb2 = sb.toString();
            android.webkit.WebView webView = new android.webkit.WebView(this.f2490c);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setAppCachePath(this.f2490c.getApplicationContext().getDir("cache", 0).getPath());
            webView.getSettings().setAppCacheMaxSize(8388608);
            webView.getSettings().setDatabaseEnabled(true);
            webView.getSettings().setDatabasePath(this.f2490c.getApplicationContext().getDir("database", 0).getPath());
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setGeolocationEnabled(true);
            webView.getSettings().setLightTouchEnabled(true);
            webView.getSettings().setCacheMode(-1);
            webView.getSettings().setPluginState(WebSettings.PluginState.ON);
            webView.setWebChromeClient(new C1134y(this));
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            }
            webView.addJavascriptInterface(new Aid_jsCode(this.f2490c, this.f2489b, webView, 0), "I");
            C1295c.m3509d(webView, sb2);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public Object call(String str, String str2, Object[] objArr) {
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
                m3070B(substring + "myu");
                obj = C0864v.f1802l.get(str2 + length);
            }
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf(10);
            String[] C = m3071C(m3072D(obj2.substring(0, indexOf)), ',');
            if (length != C.length) {
                return null;
            }
            C0839h.m1890F(this.f2490c, this.f2489b, C, objArr, str2, obj2.substring(indexOf).trim());
        } else if (str.equals("mjava")) {
            C1309h hVar = new C1309h(this.f2490c);
            try {
                hVar.set("activity", this.f2490c);
                hVar.set("i", new Aid_javaCode(this.f2490c, this.f2489b, hVar));
            } catch (EvalError e) {
                e.printStackTrace();
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
                C1298d dVar = new C1298d(this.f2490c);
                dVar.mo11700l("activity", this.f2490c);
                dVar.mo11700l("i", new Aid_luaCode(this.f2490c, this.f2489b, dVar));
                dVar.mo11699k();
                try {
                    dVar.mo11696h(str9);
                    return C0864v.f1800j.get(str8);
                } catch (LuaException e2) {
                    e2.printStackTrace();
                    C0864v.m2157O2("LuaErr：\n" + e2.getMessage());
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
                    sb.append(C0839h.m1896e(this.f2490c, "import.mjs"));
                    sb.append("\n");
                    sb.append(C0839h.m1892a(this.f2490c, str2.substring(0, indexOf4) + ".mjs"));
                    sb.append("\n");
                    sb.append(str11);
                    sb.append("\nvar returns = ");
                    sb.append(str2.substring(indexOf4 + 1));
                    sb.append("(");
                    sb.append(str10);
                    sb.append(");</script></head></html>");
                    String sb2 = sb.toString();
                    android.webkit.WebView webView = new android.webkit.WebView(this.f2490c);
                    webView.getSettings().setAllowFileAccess(true);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setAppCacheEnabled(true);
                    webView.getSettings().setAppCachePath(this.f2490c.getApplicationContext().getDir("cache", 0).getPath());
                    webView.getSettings().setAppCacheMaxSize(8388608);
                    webView.getSettings().setDatabaseEnabled(true);
                    webView.getSettings().setDatabasePath(this.f2490c.getApplicationContext().getDir("database", 0).getPath());
                    webView.getSettings().setDomStorageEnabled(true);
                    webView.getSettings().setGeolocationEnabled(true);
                    webView.getSettings().setLightTouchEnabled(true);
                    webView.getSettings().setCacheMode(-1);
                    webView.getSettings().setPluginState(WebSettings.PluginState.ON);
                    webView.setWebChromeClient(new C1133x(this));
                    if (Build.VERSION.SDK_INT >= 11) {
                        webView.removeJavascriptInterface("searchBoxJavaBridge_");
                        webView.removeJavascriptInterface("accessibility");
                        webView.removeJavascriptInterface("accessibilityTraversal");
                    }
                    webView.addJavascriptInterface(new Aid_jsCode(this.f2490c, this.f2489b, webView, 0), "I");
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
        this.f2488a.clear();
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
    public Object mo10390dh(AbstractC0918a aVar, String str) {
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
    public Object mo10391dh(AbstractC0918a aVar, String str, Object obj) {
        View view;
        if (str.equals("duration")) {
            m3085k(obj);
            aVar.mo9117g(Long.parseLong(obj.toString()));
            return null;
        } else if (str.equals("delay")) {
            m3085k(obj);
            aVar.mo9118h(Long.parseLong(obj.toString()));
            return null;
        } else if (!str.equals("target")) {
            return null;
        } else {
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                m3085k(obj);
                view = m3087m(obj, String.valueOf(obj));
            }
            aVar.mo9119i(view);
            return null;
        }
    }

    /* renamed from: dh */
    public Object mo10392dh(C0921c cVar, String str) {
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
    public Object mo10393dh(C0921c cVar, String str, Object obj) {
        View view;
        if (str.equals("duration")) {
            m3085k(obj);
            cVar.mo9130u(Long.parseLong(obj.toString()));
            return null;
        } else if (str.equals("delay")) {
            m3085k(obj);
            cVar.mo9118h(Long.parseLong(obj.toString()));
            return null;
        } else if (!str.equals("target")) {
            return null;
        } else {
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                m3085k(obj);
                view = m3087m(obj, String.valueOf(obj));
            }
            cVar.mo9119i(view);
            return null;
        }
    }

    /* renamed from: dh */
    public void mo10394dh(Animation animation, String str) {
        if (str.equals("cancel")) {
            animation.cancel();
        } else if (str.equals("reset")) {
            animation.reset();
        } else if (str.equals("start")) {
            animation.start();
        }
    }

    /* renamed from: dh */
    public void mo10395dh(Animation animation, String str, Object obj) {
        Boolean bool = Boolean.TRUE;
        if (str.equals("duration")) {
            m3085k(obj);
            animation.setDuration(Long.parseLong(obj.toString()));
        } else if (str.equals("delay")) {
            m3085k(obj);
            animation.setStartOffset(Long.parseLong(obj.toString()));
        } else if (str.equals("enabled")) {
            animation.setFillEnabled(obj.equals(bool));
        } else if (str.equals("after")) {
            animation.setFillAfter(obj.equals(bool));
        } else if (str.equals("before")) {
            animation.setFillBefore(obj.equals(bool));
        } else if (str.equals("repeat")) {
            m3085k(obj);
            animation.setRepeatCount(Integer.parseInt(obj.toString()));
        }
    }

    /* renamed from: dh */
    public void mo10396dh(AnimationSet animationSet, String str) {
        if (str.equals("cancel")) {
            animationSet.cancel();
        } else if (str.equals("reset")) {
            animationSet.reset();
        } else if (str.equals("start")) {
            animationSet.start();
        }
    }

    /* renamed from: dh */
    public void mo10397dh(AnimationSet animationSet, String str, Object obj) {
        Boolean bool = Boolean.TRUE;
        if (str.equals("duration")) {
            m3085k(obj);
            animationSet.setDuration(Long.parseLong(obj.toString()));
        } else if (str.equals("enabled")) {
            animationSet.setFillEnabled(obj.equals(bool));
        } else if (str.equals("after")) {
            animationSet.setFillAfter(obj.equals(bool));
        } else if (str.equals("before")) {
            animationSet.setFillBefore(obj.equals(bool));
        } else if (str.equals("delay")) {
            m3085k(obj);
            animationSet.setStartOffset(Long.parseLong(obj.toString()));
        } else if (str.equals("repeat")) {
            m3085k(obj);
            animationSet.setRepeatCount(Integer.parseInt(obj.toString()));
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

    public C0934i dhas(Object obj, String str, Object[] objArr) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        int length = objArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = Float.parseFloat(objArr[i].toString());
        }
        return C0934i.m2550K(view, str, fArr);
    }

    public C0921c dhast(String str, Object[] objArr) {
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
        Drawable drawable;
        if (obj instanceof Drawable) {
            drawable = (Drawable) obj;
        } else if (obj instanceof Bitmap) {
            drawable = new BitmapDrawable((Bitmap) obj);
        } else {
            m3085k(obj);
            drawable = C1305g.m3582m(String.valueOf(obj), this.f2490c);
        }
        animationDrawable.addFrame(drawable, i);
    }

    public void dhon(Animation animation, Animation.AnimationListener animationListener) {
        animation.setAnimationListener(animationListener);
    }

    public void dhon(AbstractC0918a aVar, AbstractC0918a.AbstractC0919a aVar2) {
        aVar.mo9110a(aVar2);
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

    public AnimationSet dhset(AnimationSet animationSet, Object[] objArr) {
        for (Object obj : objArr) {
            animationSet.addAnimation((Animation) obj);
        }
        return animationSet;
    }

    public AnimationSet dhset(boolean z, Object[] objArr) {
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
                m3084j(str, obj, 1);
                return;
            } else if (substring.equals("sss")) {
                m3084j(str, obj, 2);
                return;
            }
        }
        this.f2488a.put(str, obj);
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
        hashMap = this.f2488a;
        return hashMap.get(str);
    }

    public void dslist(ArrayList<Object> arrayList, Object obj) {
        m3085k(obj);
        if ((obj instanceof Integer) || (obj instanceof Double)) {
            int parseInt = Integer.parseInt(String.valueOf(obj));
            if (parseInt == -1) {
                arrayList.clear();
            } else {
                arrayList.remove(parseInt);
            }
        } else {
            arrayList.remove(obj);
        }
    }

    public void endi() {
        this.f2489b.finish();
    }

    public void endkeyboard() {
        View peekDecorView = this.f2489b.getWindow().peekDecorView();
        if (peekDecorView != null) {
            ((InputMethodManager) this.f2490c.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
    }

    public void ends() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        this.f2490c.startActivity(intent);
    }

    public void endutw() {
        AlertDialog alertDialog = alertdialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            alertdialog = null;
        }
    }

    /* renamed from: fc */
    public boolean mo10420fc(String str, String str2) {
        return C0839h.m1897f(this.f2490c, str, str2, true);
    }

    /* renamed from: fc */
    public boolean mo10421fc(String str, String str2, boolean z) {
        return C0839h.m1897f(this.f2490c, str, str2, z);
    }

    /* renamed from: fd */
    public boolean mo10422fd(String str) {
        File file = new File(m3095u(str));
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public String fdir() {
        return C0835f.f1721a;
    }

    public String fdir(String str) {
        return m3095u(str);
    }

    /* renamed from: fe */
    public boolean mo10425fe(String str) {
        return C0839h.m1898g(this.f2490c, str);
    }

    /* renamed from: fi */
    public boolean mo10426fi(String str) {
        return new File(m3095u(str)).isDirectory();
    }

    /* renamed from: fj */
    public boolean mo10427fj(String str, String str2) {
        String u = m3095u(str2);
        C0835f.m1845b(u, false);
        try {
            C0834e.m1837c(m3095u(str), u, true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: fj */
    public boolean mo10428fj(String str, String str2, boolean z) {
        String u = m3095u(str2);
        C0835f.m1845b(u, false);
        try {
            C0834e.m1837c(m3095u(str), u, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: fl */
    public Object[] mo10429fl(String str) {
        return C0839h.m1899h(this.f2490c, str);
    }

    /* renamed from: fl */
    public Object[] mo10430fl(String str, boolean z) {
        File[] listFiles;
        File file = new File(m3095u(str));
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

    /* renamed from: fn */
    public void mo10431fn(String str) {
        C1309h hVar = this.f2491d;
        hVar.mo11946f(str + ".mjava");
    }

    /* renamed from: fo */
    public void mo10432fo(String str) {
        String u = m3095u(str);
        File file = new File(u);
        if (!file.exists()) {
            return;
        }
        if (u.toLowerCase().endsWith(".apk")) {
            C0835f.m1847d(this.f2490c, u);
            return;
        }
        try {
            m3099y(file);
        } catch (Exception unused) {
        }
    }

    /* renamed from: fr */
    public String mo10433fr(String str) {
        return C0839h.m1900i(this.f2490c, str);
    }

    /* renamed from: fr */
    public String mo10434fr(String str, String str2) {
        return C0839h.m1901j(this.f2490c, str, str2);
    }

    /* renamed from: fs */
    public long mo10435fs(String str) {
        return C0839h.m1902k(this.f2490c, str);
    }

    /* renamed from: ft */
    public boolean mo10436ft(String str, String str2) {
        File file = new File(m3095u(str));
        if (!file.exists()) {
            return false;
        }
        String u = m3095u(str2);
        C0835f.m1845b(u, false);
        return file.renameTo(new File(u));
    }

    public void ftz(String str, String str2, String str3, Object obj, String str4) {
        m3085k(obj);
        C0862t.m2077b(this.f2490c, str, str2, str3, obj, new Intent().setClass(this.f2490c, logoActivity.class).putExtra("command2", str4));
    }

    public int fuz(String str, String str2, String str3) {
        String u = m3095u(str3);
        C0835f.m1845b(u, false);
        try {
            return C0839h.m1903l(this.f2490c, str, str2, u, true);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int fuz(String str, String str2, String str3, boolean z) {
        String u = m3095u(str3);
        C0835f.m1845b(u, false);
        try {
            return C0839h.m1903l(this.f2490c, str, str2, u, z);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public boolean fuzs(String str, String str2) {
        String u = m3095u(str2);
        C0835f.m1845b(u, false);
        try {
            C0839h.m1904m(this.f2490c, str, u, true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean fuzs(String str, String str2, boolean z) {
        String u = m3095u(str2);
        C0835f.m1845b(u, false);
        try {
            C0839h.m1904m(this.f2490c, str, u, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: fw */
    public void mo10442fw(String str, String str2) {
        C0835f.m1854k(m3095u(str), str2);
    }

    /* renamed from: fw */
    public void mo10443fw(String str, String str2, String str3) {
        C0835f.m1855l(m3095u(str), str2, str3);
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
        m3085k(obj);
        return m3087m(obj, String.valueOf(obj));
    }

    public View gvs(Object obj, Object obj2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (obj2 instanceof View) {
            return (View) obj2;
        }
        m3085k(obj2);
        return m3086l(view, obj2, String.valueOf(obj2));
    }

    public void has(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view instanceof WebView) {
            ((WebView) view).loadUrl("javascript:{" + str + "};");
        }
    }

    /* renamed from: hd */
    public int mo10455hd(String str, String str2) {
        return C0841i.m1918a(str, m3095u(str2), false);
    }

    /* renamed from: hd */
    public int mo10456hd(String str, String str2, boolean z) {
        return C0841i.m1918a(str, m3095u(str2), z);
    }

    /* renamed from: hd */
    public int mo10457hd(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, String str6) {
        return C0841i.m1919b(str, m3095u(str2), z, str3, str4, str5, z2, str6);
    }

    public void hdd(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        C1293a.f3049b.mo9045m(m3095u(str), m3095u(str2), i, i2, i3, i4, z);
    }

    public C0911c hdda(String str, String str2, Object obj) {
        return C1293a.f3049b.mo9038d(str, str2, obj);
    }

    public C0911c hdda(String str, String str2, String str3, Object obj) {
        return C1293a.f3049b.mo9039e(str, str2, str3, obj);
    }

    public C0911c hdda(String str, String str2, String str3, Object obj, Object obj2) {
        m3085k(obj);
        return C1293a.f3049b.mo9040f(str, str2, str3, obj, obj2);
    }

    public C0911c hdda(String str, String str2, String str3, String str4, Object obj, boolean z, Object obj2) {
        m3085k(obj);
        return C1293a.f3049b.mo9041g(str, m3095u(str2), str3, str4, obj, z, obj2);
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
        m3085k(obj);
        C1293a.f3049b.mo9044l(C1293a.f3049b.f1934c.get(i), str, obj);
    }

    public void hdds(C0911c cVar, String str, Object obj) {
        m3085k(obj);
        C1293a.f3049b.mo9044l(cVar, str, obj);
    }

    public void hdduigo() {
        this.f2490c.startActivity(new Intent().setClass(this.f2490c, DownList.class));
    }

    public void hdduigo(String str, String str2) {
        Intent intent = new Intent(this.f2490c, DownList.class);
        Bundle bundle = new Bundle();
        bundle.putString("background", str);
        bundle.putString("backgroundShadow", str2);
        intent.putExtras(bundle);
        this.f2490c.startActivity(intent);
    }

    public C0836g hdfl(String str, Object obj) {
        C0836g gVar = new C0836g(m3095u(str));
        m3098x(gVar, obj);
        return gVar;
    }

    public C0836g hdfl(String str, String str2, int i, int i2, boolean z, Object obj) {
        C0836g gVar = new C0836g(m3095u(str), m3095u(str2), i, i2, z);
        m3098x(gVar, obj);
        return gVar;
    }

    public C0836g hdfl(String str, String str2, Object obj) {
        C0836g gVar = new C0836g(m3095u(str), m3095u(str2));
        m3098x(gVar, obj);
        return gVar;
    }

    public void hdfla(C0836g gVar, String str, int i, Object obj) {
        gVar.mo8929n(str, i, obj);
        gVar.mo8933t();
    }

    public void hdfla(C0836g gVar, String str, int i, Object obj, String str2) {
        gVar.mo8930o(str, i, obj, m3095u(str2));
        gVar.mo8933t();
    }

    /* renamed from: hs */
    public String mo10475hs(String str) {
        return (str.equals("cookie") || str.equals("del cookie")) ? C0841i.m1921d(str) : str.startsWith("cookie:") ? C0841i.m1921d(str.substring(7)) : C0841i.m1922e(str, null, null);
    }

    /* renamed from: hs */
    public String mo10476hs(String str, String str2, String str3) {
        return C0841i.m1922e(str, str2, str3);
    }

    /* renamed from: hs */
    public String mo10477hs(String str, String str2, String str3, String str4) {
        return C0841i.m1923f(str, str2, str3, str4);
    }

    /* renamed from: hs */
    public String mo10478hs(String str, String str2, String str3, String str4, boolean z) {
        return C0841i.m1924g(str, str2, str3, str4, z);
    }

    /* renamed from: hs */
    public String mo10479hs(String str, String str2, String str3, String str4, boolean z, String str5) {
        return C0841i.m1925h(str, str2, str3, str4, z, str5, 20000, 20000, null);
    }

    /* renamed from: hs */
    public String mo10480hs(String str, String str2, String str3, String str4, boolean z, String str5, int i, int i2, String str6) {
        return C0841i.m1925h(str, str2, str3, str4, z, str5, i, i2, str6);
    }

    @TargetApi(11)
    public void hsas(Object obj, boolean z) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("iapp");
            }
            if (z) {
                webView.addJavascriptInterface(new C1311iapp(this.f2490c, this.f2489b), "iapp");
            }
        }
    }

    public String huf(String str, String str2, String str3, String str4) {
        try {
            return C0841i.m1930m(this.f2490c, str, str2, str3, str4);
        } catch (Exception unused) {
            return null;
        }
    }

    public String huf(String str, String str2, String str3, String str4, String str5) {
        try {
            return C0841i.m1931n(this.f2490c, str, str2, str3, str4, str5);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: hw */
    public void mo10484hw(String str) {
        Intent intent = new Intent(this.f2490c, Webview.class);
        Bundle bundle = new Bundle();
        bundle.putString("WebURL", str);
        intent.putExtras(bundle);
        this.f2490c.startActivity(intent);
    }

    /* renamed from: hw */
    public void mo10485hw(String str, String str2, String str3) {
        Intent intent = new Intent(this.f2490c, Webview.class);
        Bundle bundle = new Bundle();
        bundle.putString("WebURL", str);
        bundle.putString("background", str2);
        bundle.putString("backgroundShadow", str3);
        intent.putExtras(bundle);
        this.f2490c.startActivity(intent);
    }

    public void hws(String str) {
        Intent intent;
        try {
            intent = C0841i.m1934q(this.f2490c, str);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(C0851m.m1977c(this.f2490c, str));
            intent = intent2;
        }
        this.f2490c.startActivity(intent);
    }

    public void imports(String str) {
        try {
            C1309h hVar = this.f2491d;
            hVar.eval("import " + str.replace(';', ' ').replace('\n', ' ').replace(",", "; import ") + ";", this.f2491d.getNameSpace());
        } catch (EvalError e) {
            e.printStackTrace();
            C0864v.m2157O2("JavaErr：\n" + e.toString());
        }
    }

    public Object java(Object obj, String str) {
        return C0832d.m1822g(this.f2490c, obj, str, null, null, null);
    }

    public Object java(Object obj, String str, Object[] objArr) {
        return C0832d.m1822g(this.f2490c, obj, str, objArr, null, null);
    }

    public Object java(Object obj, String str, Object[] objArr, Object obj2) {
        return C0832d.m1822g(this.f2490c, obj, str, objArr, null, obj2);
    }

    public Object javacb(Class<?> cls, Object obj) {
        return C0832d.m1830o(cls.getClassLoader(), cls, null, obj);
    }

    public Object javags(Object obj, Object obj2, String str) {
        return obj2 instanceof Class ? C0832d.m1824i(obj, (Class) obj2, str) : C0832d.m1826k(obj, obj2.toString(), str);
    }

    public Object javags(Object obj, String str) {
        return C0832d.m1825j(obj, str);
    }

    public Object javanew(Object obj) {
        return obj instanceof Class ? C0832d.m1828m(this.f2490c, (Class) obj, null, null, null) : C0832d.m1829n(this.f2490c, obj.toString(), null, null, null);
    }

    public Object javanew(Object obj, Object[] objArr) {
        return obj instanceof Class ? C0832d.m1828m(this.f2490c, (Class) obj, objArr, null, null) : C0832d.m1829n(this.f2490c, obj.toString(), objArr, null, null);
    }

    public Object javanew(Object obj, Object[] objArr, Object obj2) {
        return obj instanceof Class ? C0832d.m1828m(this.f2490c, (Class) obj, objArr, null, obj2) : C0832d.m1829n(this.f2490c, obj.toString(), objArr, null, obj2);
    }

    public Object javass(Object obj, Object obj2, String str, Object obj3) {
        return Boolean.valueOf(obj2 instanceof Class ? C0832d.m1832q(obj, (Class) obj2, str, obj3) : C0832d.m1833r(obj, obj2.toString(), str, obj3));
    }

    public Object javass(Object obj, String str, Object obj2) {
        return C0832d.m1831p(obj, str, obj2);
    }

    public Object javax(Object obj, Object obj2, String str) {
        return obj2 instanceof Class ? C0832d.m1820e(this.f2490c, obj, (Class) obj2, str, null, null, null) : C0832d.m1821f(this.f2490c, obj, obj2.toString(), str, null, null, null);
    }

    public Object javax(Object obj, Object obj2, String str, Object[] objArr) {
        return obj2 instanceof Class ? C0832d.m1820e(this.f2490c, obj, (Class) obj2, str, objArr, null, null) : C0832d.m1821f(this.f2490c, obj, obj2.toString(), str, objArr, null, null);
    }

    public Object javax(Object obj, Object obj2, String str, Object[] objArr, Object obj3) {
        return obj2 instanceof Class ? C0832d.m1820e(this.f2490c, obj, (Class) obj2, str, objArr, null, obj3) : C0832d.m1821f(this.f2490c, obj, obj2.toString(), str, objArr, null, obj3);
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
                ((JSONArray) obj).remove(m3075a(String.valueOf(obj2)));
                return null;
            }
        } else if (str.equals("get")) {
            try {
                if (obj instanceof JSONObject) {
                    return ((JSONObject) obj).get(String.valueOf(obj2));
                }
                if (obj instanceof JSONArray) {
                    return ((JSONArray) obj).get(m3075a(String.valueOf(obj2)));
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
                return ((JSONArray) obj).getJSONObject(m3075a(String.valueOf(obj2)));
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
                    ((JSONArray) obj).put(m3075a(String.valueOf(obj2)), obj3);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void lan(int i) {
        C0915a.m2418a(this.f2489b, i);
    }

    public ClassLoader loadjar(String str) {
        Context context = this.f2490c;
        return C0839h.m1909r(context, str, context.getClassLoader());
    }

    public ClassLoader loadjar(String str, boolean z) {
        Context context = this.f2490c;
        DexClassLoader r = C0839h.m1909r(context, str, context.getClassLoader());
        if (z) {
            C0839h.m1912u(this.f2490c, r);
        }
        return r;
    }

    public ClassLoader loadjar(String str, boolean z, ClassLoader classLoader) {
        DexClassLoader r = C0839h.m1909r(this.f2490c, str, classLoader);
        if (z) {
            C0839h.m1912u(this.f2490c, r);
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
        String[] C = m3071C(str, '|');
        int[] iArr = new int[C.length];
        for (int i3 = 0; i3 < C.length; i3++) {
            iArr[i3] = C0860r.m2056o(C[i3]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(m3096v(str3), iArr);
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

    public Object nuibs(Object obj, Object obj2, Object obj3) {
        m3085k(obj);
        m3085k(obj2);
        m3085k(obj3);
        return new C0917c(this.f2490c).mo9109d(obj, obj2, obj3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View nvw(int r7, java.lang.Object r8, java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.nvw(int, java.lang.Object, java.lang.String, java.lang.String):android.view.View");
    }

    public void nvw(Object obj, Object obj2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            if (!(obj2 instanceof ViewGroup)) {
                m3085k(obj2);
                obj2 = m3087m(obj2, String.valueOf(obj2));
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
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            if (!(obj2 instanceof ViewGroup)) {
                m3085k(obj2);
                obj2 = m3087m(obj2, String.valueOf(obj2));
            }
            ViewGroup viewGroup = (ViewGroup) obj2;
            if (viewGroup != null) {
                viewGroup.addView(view, i);
            }
        }
    }

    public C1309h openRestoreinterface(String str, ViewGroup viewGroup, int i, Object obj) {
        C1309h hVar = new C1309h(this.f2490c);
        try {
            hVar.set("activity", this.f2490c);
            hVar.set("i", this);
        } catch (EvalError e) {
            e.printStackTrace();
        }
        StringBuffer stringBuffer = new StringBuffer();
        Context context = this.f2490c;
        C0916b bVar = new C0916b(context);
        bVar.f1974a = 0;
        C0839h.m1908q(this, context, str, viewGroup, i, obj, bVar, stringBuffer, hVar);
        String C = C0839h.m1887C(this.f2490c, str);
        if (C != null) {
            stringBuffer.append("private void loading(){\n" + C + "\n}\n");
        }
        hVar.mo11944d(stringBuffer.toString());
        if (C == null) {
            return null;
        }
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openRestoreinterfaceX(java.lang.String r16, android.view.ViewGroup r17, int r18, java.lang.Object r19, p013b.p048c.p049a.C0916b r20, java.lang.StringBuffer r21, com.iapp.app.C1309h r22) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.openRestoreinterfaceX(java.lang.String, android.view.ViewGroup, int, java.lang.Object, b.c.a.b, java.lang.StringBuffer, com.iapp.app.h):void");
    }

    public String otob(String str) {
        byte[] t = C0839h.m1911t(this.f2490c, str);
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
            return C0839h.m1911t(this.f2490c, str3);
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
        return new C1310i(this.f2490c);
    }

    public C1310i res(String str) {
        return new C1310i(this.f2490c, m3095u(str));
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
        Bitmap v = obj instanceof Bitmap ? (Bitmap) obj : C0839h.m1913v(this.f2490c, String.valueOf(obj));
        if (v == null) {
            return null;
        }
        return v;
    }

    public Bitmap sbp(Object obj, int i, int i2, int i3, int i4) {
        Bitmap c = obj instanceof Bitmap ? (Bitmap) obj : C0849k.m1963c(m3095u(String.valueOf(obj)));
        if (c == null) {
            return null;
        }
        return Bitmap.createBitmap(c, i, i2, i3, i4);
    }

    public Bitmap sbp(Object obj, int i, int i2, int i3, int i4, float f) {
        Bitmap c = obj instanceof Bitmap ? (Bitmap) obj : C0849k.m1963c(m3095u(String.valueOf(obj)));
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
    public Object mo10534se(Matcher matcher, String str) {
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
    public Object mo10535se(Matcher matcher, String str, int i) {
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
    public String mo10536se(Matcher matcher, String str, String str2) {
        if (str.equals("sral")) {
            return matcher.replaceAll(str2);
        }
        if (str.equals("srft")) {
            return matcher.replaceFirst(str2);
        }
        return null;
    }

    /* renamed from: se */
    public Matcher mo10537se(String str, String str2, int i) {
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

    public String shb() {
        CharSequence text = ((ClipboardManager) this.f2490c.getSystemService("clipboard")).getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    public String simei() {
        return C0860r.m2058q(this.f2490c);
    }

    public String simsi() {
        try {
            return ((TelephonyManager) this.f2490c.getSystemService("phone")).getSubscriberId();
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
            intent.setData(C0851m.m1977c(this.f2490c, str2));
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
                m3085k(obj);
                intent.putExtra(str2, Integer.parseInt(String.valueOf(obj)));
            } else if (obj instanceof Long) {
                m3085k(obj);
                intent.putExtra(str2, Long.parseLong(String.valueOf(obj)));
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
    public String mo10546sj(String str, String str2, String str3) {
        return C0860r.m2044c(str, str2, str3);
    }

    public String[] sjxx() {
        String[] o = m3089o();
        int[] p = m3090p();
        int[] q = m3091q();
        String[] r = m3092r();
        return new String[]{o[0] + "\n" + o[1], p[0] + "\n" + p[1] + "\n" + q[0] + "\n" + q[1], r[0] + "\n" + r[1] + "\n" + r[2]};
    }

    /* renamed from: sl */
    public String[] mo10548sl(String str, String str2) {
        return C0861s.m2072e(str, str2);
    }

    /* renamed from: sl */
    public String[] mo10549sl(String str, String str2, boolean z) {
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

    public C0855q sot(int i, String str, int i2, int i3, boolean z, Object obj) {
        C0855q qVar = new C0855q(i, str, i2, i3, z);
        qVar.mo8955F((OnMessagesListener) obj);
        return qVar;
    }

    public C0855q sot(String str, int i, int i2, boolean z, Object obj) {
        C0855q qVar = new C0855q(str, i, i2, z);
        qVar.mo8955F((OnMessagesListener) obj);
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
            qVar.mo8956a(new File(m3095u(str2)));
        } else if (str.equals("bt")) {
            qVar.mo8958c(m3083i(str2, ' '));
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
            cVar.mo8967a(new File(m3095u(str2)));
        } else if (str.equals("bt")) {
            cVar.mo8969c(m3083i(str2, ' '));
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
                context = this.f2490c;
                str = m3095u(str);
                z = false;
            } else {
                context = this.f2490c;
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
            return (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) ? C0839h.m1916y(this.f2490c, m3095u(str), false) : C0839h.m1916y(this.f2490c, str, true);
        }
        if (str2.equals("del")) {
            return (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) ? C0839h.m1915x(this.f2490c, m3095u(str), false) : C0839h.m1915x(this.f2490c, str, true);
        }
        return false;
    }

    public Object sqlsele(Cursor cursor, Object obj) {
        m3085k(obj);
        if (obj instanceof Integer) {
            return cursor.getString(Integer.parseInt(obj.toString()));
        }
        if (!obj.equals("re")) {
            return obj.equals("columncount") ? Integer.valueOf(cursor.getColumnCount()) : obj.equals("count") ? Integer.valueOf(cursor.getCount()) : obj.equals("next") ? Boolean.valueOf(cursor.moveToNext()) : obj.equals("previous") ? Boolean.valueOf(cursor.moveToPrevious()) : obj.equals("first") ? Boolean.valueOf(cursor.moveToFirst()) : obj.equals("last") ? Boolean.valueOf(cursor.moveToLast()) : obj.equals("getposition") ? Integer.valueOf(cursor.getPosition()) : cursor.getString(m3075a(obj.toString()));
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
    public String mo10572sr(String str, String str2, String str3) {
        return str.replace(str2, str3);
    }

    /* renamed from: sr */
    public String mo10573sr(String str, String str2, String str3, boolean z) {
        return z ? str.replaceAll(str2, str3) : str.replace(str2, str3);
    }

    public int sran(int i, int i2) {
        return C0860r.m2048g(i, i2);
    }

    public void src(String str, Object obj) {
        try {
            this.f2491d.set(str, obj);
        } catch (EvalError e) {
            e.printStackTrace();
        }
    }

    /* renamed from: ss */
    public Object mo10576ss(String str) {
        return ss_dim.get(str);
    }

    /* renamed from: ss */
    public void mo10577ss(String str, Object obj) {
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

    public void ssj(Object obj, String str, Object obj2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            m3080f(view, str, obj2);
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
            this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return C0860r.m2064w(this.f2490c, (float) displayMetrics.widthPixels);
        } else if (str.equals("h")) {
            WindowManager.LayoutParams attributes = this.f2489b.getWindow().getAttributes();
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return (attributes.flags & 1024) == 1024 ? C0860r.m2064w(this.f2490c, (float) displayMetrics2.heightPixels) : C0860r.m2064w(this.f2490c, (float) (displayMetrics2.heightPixels - m3093s()));
        } else if (str.equals("pxw")) {
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics3);
            return displayMetrics3.widthPixels;
        } else if (str.equals("pxh")) {
            WindowManager.LayoutParams attributes2 = this.f2489b.getWindow().getAttributes();
            DisplayMetrics displayMetrics4 = new DisplayMetrics();
            this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics4);
            return (attributes2.flags & 1024) == 1024 ? displayMetrics4.heightPixels : displayMetrics4.heightPixels - m3093s();
        } else if (str.equals("pxhh")) {
            DisplayMetrics displayMetrics5 = new DisplayMetrics();
            this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics5);
            return displayMetrics5.heightPixels;
        } else if (str.equals("hh")) {
            DisplayMetrics displayMetrics6 = new DisplayMetrics();
            this.f2489b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics6);
            return C0860r.m2064w(this.f2490c, (float) displayMetrics6.heightPixels);
        } else if (str.equals("pxztl")) {
            return m3094t();
        } else {
            if (str.equals("pxbvk")) {
                return m3088n();
            }
            if (str.equals("ztl")) {
                return C0860r.m2064w(this.f2490c, (float) m3094t());
            }
            if (str.equals("bvk")) {
                return C0860r.m2064w(this.f2490c, (float) m3088n());
            }
            return 0;
        }
    }

    public void sxb(String str) {
        ((ClipboardManager) this.f2490c.getSystemService("clipboard")).setText(str);
    }

    public void syso(Object obj) {
        C0864v.m2157O2(obj);
    }

    /* renamed from: t */
    public void mo10596t(OnThread onThread) {
        new C1113e0(this, onThread);
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

    public Bitmap tot(Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
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
        return new C1349p(this.f2490c);
    }

    public C1349p tts(String str, String str2, float f, float f2) {
        return new C1349p(this.f2490c, str, str2, f, f2);
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
            m3085k(obj);
            pVar.mo11996i(str, Integer.parseInt(obj.toString()));
        } else if (str.equals("ft")) {
            pVar.mo11998k(str, m3095u(obj.toString()));
        }
    }

    /* renamed from: tw */
    public void mo10607tw(Object obj) {
        Toast.makeText(this.f2490c, String.valueOf(obj), 1).show();
    }

    /* renamed from: tw */
    public void mo10608tw(Object obj, int i) {
        Toast.makeText(this.f2490c, String.valueOf(obj), i).show();
    }

    public void tws(Object obj, String str, int i) {
        View view;
        if (obj == null) {
            view = this.f2489b.findViewById(C0839h.f1737a);
        } else if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            Snackbar.make(view, str, i).show();
        }
    }

    public void tws(Object obj, String str, int i, String str2, Object obj2) {
        View view;
        if (obj == null) {
            view = this.f2489b.findViewById(C0839h.f1737a);
        } else if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            Snackbar.make(view, str, i).setAction(str2, (View.OnClickListener) obj2).show();
        }
    }

    public Bitmap tzz(Object obj, float f) {
        if (obj instanceof Bitmap) {
            return C0849k.m1967g((Bitmap) obj, f);
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x002d */
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
            goto L_0x0010
        L_0x0005:
            r3.m3085k(r4)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            android.view.View r4 = r3.m3087m(r4, r0)
        L_0x0010:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x0018:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L_0x0033
            android.view.View r2 = r4.getChildAt(r1)
            if (r5 == 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x002d:
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0033:
            java.lang.Object[] r4 = r0.toArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.uall(java.lang.Object, boolean):java.lang.Object[]");
    }

    public boolean uapp(String str) {
        return C0835f.m1859p(this.f2490c, str);
    }

    public boolean uapp(String str, String str2) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, str2));
            this.f2490c.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public Object[] uapplist(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : this.f2490c.getPackageManager().getInstalledPackages(0)) {
            String str = packageInfo.packageName;
            if (z) {
                arrayList.add(new String[]{str, m3097w(str), packageInfo.applicationInfo.loadLabel(this.f2490c.getPackageManager()).toString(), packageInfo.versionName});
            } else if ((packageInfo.applicationInfo.flags & 1) == 0) {
                arrayList.add(new String[]{str, m3097w(str), packageInfo.applicationInfo.loadLabel(this.f2490c.getPackageManager()).toString(), packageInfo.versionName});
            }
        }
        return arrayList.toArray();
    }

    public void ucall(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        Context context = this.f2490c;
        intent.setData(C0851m.m1977c(context, "tel:" + str));
        this.f2490c.startActivity(intent);
    }

    public void ufnsui(Object obj) {
        Message message = new Message();
        message.what = 2;
        message.obj = obj;
        this.f2492e.sendMessage(message);
    }

    /* renamed from: ug */
    public Object mo10618ug(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view == null) {
            return null;
        }
        return new C1305g(view, this.f2490c).mo11842e(str);
    }

    /* renamed from: ug */
    public Object mo10619ug(Object obj, String str, Object obj2) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view == null) {
            return null;
        }
        return new C1305g(view, this.f2490c).mo11847f(str, obj2);
    }

    public Object uht(Object obj, String str) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
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
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
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

    public Object uht(Object obj, String str, int i, String str2, String str3, Object[] objArr, Object[] objArr2) {
        View view;
        MyFragmentStatePagerAdapter myFragmentStatePagerAdapter;
        boolean z;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        boolean z2 = view instanceof ViewPager;
        if (z2 || (view instanceof VerticalViewPager)) {
            PagerAdapter adapter = z2 ? ((ViewPager) view).getAdapter() : view instanceof VerticalViewPager ? ((VerticalViewPager) view).getAdapter() : null;
            if (str.equals("add")) {
                int length = objArr.length;
                HashMap<Integer, Object> hashMap = new HashMap<>();
                for (int i2 = 0; i2 < length; i2++) {
                    hashMap.put(Integer.valueOf((int) Double.parseDouble(objArr[i2].toString())), objArr2[i2]);
                }
                if (adapter == null || !((z = adapter instanceof FragmentStatePagerAdapter))) {
                    myFragmentStatePagerAdapter = new MyFragmentStatePagerAdapter(this.f2489b, view.getId(), ((AppCompatActivity) this.f2489b).getSupportFragmentManager());
                    if (z2) {
                        ViewPager viewPager = (ViewPager) view;
                        viewPager.setAdapter(myFragmentStatePagerAdapter);
                        viewPager.setOffscreenPageLimit(5);
                    } else if (view instanceof VerticalViewPager) {
                        VerticalViewPager verticalViewPager = (VerticalViewPager) view;
                        verticalViewPager.setAdapter(myFragmentStatePagerAdapter);
                        verticalViewPager.setOffscreenPageLimit(5);
                    }
                } else if (!z) {
                    return null;
                } else {
                    myFragmentStatePagerAdapter = (MyFragmentStatePagerAdapter) adapter;
                }
                for (String str4 : C0861s.m2069b(str3, '|')) {
                    String trim = str4.trim();
                    if (trim.endsWith(".ijava")) {
                        myFragmentStatePagerAdapter.mo11524a(i, str2, trim, m3082h(trim.substring(0, trim.length() - 4)), hashMap);
                    }
                }
            }
        }
        return null;
    }

    public Object uht(Object obj, String str, Object obj2, Object obj3) {
        View view;
        View view2;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        boolean z = view instanceof ViewPager;
        if (z || (view instanceof VerticalViewPager)) {
            if (str.equals("bd")) {
                if (z) {
                    if (obj2 instanceof View) {
                        view2 = (View) obj2;
                    } else {
                        m3085k(obj2);
                        view2 = m3087m(obj2, String.valueOf(obj2));
                    }
                    if (view2 instanceof TabLayout) {
                        ((TabLayout) view2).setupWithViewPager((ViewPager) view, obj3.equals(Boolean.TRUE));
                    }
                }
                return null;
            }
            PagerAdapter adapter = z ? ((ViewPager) view).getAdapter() : view instanceof VerticalViewPager ? ((VerticalViewPager) view).getAdapter() : null;
            if (str.equals("title") && (adapter instanceof FragmentStatePagerAdapter)) {
                ((MyFragmentStatePagerAdapter) adapter).mo11528e(m3075a(String.valueOf(obj2)), String.valueOf(obj3));
            }
        }
        return null;
    }

    public void uigo(String str) {
        Intent intent;
        if (str.endsWith(".iyu")) {
            intent = new Intent(this.f2490c, mian.class);
        } else if (str.endsWith(".ijava")) {
            intent = new Intent(this.f2490c, main3.class);
        } else if (str.endsWith(".ilua")) {
            intent = new Intent(this.f2490c, main.class);
        } else if (str.endsWith(".ijs")) {
            intent = new Intent(this.f2490c, main2.class);
        } else {
            return;
        }
        intent.putExtras(C0839h.m1886B(str));
        this.f2490c.startActivity(intent);
    }

    public void uigo(String str, int i) {
        Intent intent;
        if (str.endsWith(".iyu")) {
            intent = new Intent(this.f2490c, mian.class);
        } else if (str.endsWith(".ijava")) {
            intent = new Intent(this.f2490c, main3.class);
        } else if (str.endsWith(".ilua")) {
            intent = new Intent(this.f2490c, main.class);
        } else if (str.endsWith(".ijs")) {
            intent = new Intent(this.f2490c, main2.class);
        } else {
            return;
        }
        intent.putExtras(C0839h.m1886B(str));
        intent.setFlags(i);
        this.f2490c.startActivity(intent);
    }

    public void uit(Intent intent) {
        this.f2490c.startActivity(intent);
    }

    public void uit(Intent intent, String str, String str2) {
        Context context;
        if (str.equals("chooser")) {
            context = this.f2490c;
            intent = Intent.createChooser(intent, str2);
        } else if (str.equals("result")) {
            this.f2489b.startActivityForResult(intent, Integer.parseInt(str2));
            return;
        } else {
            context = this.f2490c;
        }
        context.startActivity(intent);
    }

    public void ujp(String str, int i) {
        C0862t.m2076a(this.f2489b, m3095u(str), i);
    }

    public Object ula(Object obj, String str) {
        Object obj2;
        ArrayList<HashMap<Integer, Object>> a;
        if (str == null || str.equals("clear")) {
            if ((obj instanceof C1105b0) && (obj2 = ((C1105b0) obj).f2497b) != null) {
                if (obj2 instanceof C1107c0) {
                    a = ((C1107c0) obj2).mo10693a();
                } else if (obj2 instanceof C1110d0) {
                    a = ((C1110d0) obj2).mo10701a();
                }
                a.clear();
            }
        } else if (str.equals("list")) {
            return ((obj == null || !(obj instanceof C1105b0)) ? new C1105b0(this, null) : (C1105b0) obj).f2496a;
        }
        return null;
    }

    public Object ula(Object obj, Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        C1105b0 b0Var = (obj == null || !(obj instanceof C1105b0)) ? new C1105b0(this, null) : (C1105b0) obj;
        HashMap<Integer, Object> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            hashMap.put(Integer.valueOf((int) Double.parseDouble(objArr[i].toString())), objArr2[i]);
        }
        b0Var.f2496a.add(hashMap);
        return b0Var;
    }

    public void ula(Object obj) {
        Object obj2;
        if ((obj instanceof C1105b0) && (obj2 = ((C1105b0) obj).f2497b) != null) {
            if (obj2 instanceof C1107c0) {
                ((C1107c0) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof ArrayAdapter) {
                ((ArrayAdapter) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof C1110d0) {
                ((C1110d0) obj2).notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if ((r5 instanceof com.iapp.app.Aid_javaCode.C1105b0) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object ulag(java.lang.Object r5, int r6, java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.ulag(java.lang.Object, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object ulag(java.lang.Object r4, java.lang.Object r5) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.ulag(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ulas(java.lang.Object r5, int r6, int r7, java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.ulas(java.lang.Object, int, int, java.lang.Object):void");
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
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null && (view instanceof Spinner)) {
            Spinner spinner = (Spinner) view;
            if (obj2 instanceof ArrayList) {
                arrayAdapter = new ArrayAdapter(this.f2490c, 17367048, (ArrayList) obj2);
            } else if (obj2 instanceof String[]) {
                arrayAdapter = new ArrayAdapter(this.f2490c, 17367048, (String[]) obj2);
            } else if (obj2 instanceof Object[]) {
                arrayAdapter = new ArrayAdapter(this.f2490c, 17367048, (Object[]) obj2);
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
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            if (view instanceof ListView) {
                ListView listView = (ListView) view;
                if (obj2 instanceof C1105b0) {
                    C1105b0 b0Var = (C1105b0) obj2;
                    if (b0Var.f2497b == null) {
                        b0Var.f2497b = new C1107c0(this.f2489b);
                    }
                    C1107c0 c0Var = (C1107c0) b0Var.f2497b;
                    c0Var.mo10694b(str, b0Var);
                    listView.setAdapter((ListAdapter) c0Var);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = b0Var;
                    listView.setTag(objArr);
                }
            } else if (view instanceof GridView) {
                GridView gridView = (GridView) view;
                if (obj2 instanceof C1105b0) {
                    C1105b0 b0Var2 = (C1105b0) obj2;
                    if (b0Var2.f2497b == null) {
                        b0Var2.f2497b = new C1107c0(this.f2489b);
                    }
                    C1107c0 c0Var2 = (C1107c0) b0Var2.f2497b;
                    c0Var2.mo10694b(str, b0Var2);
                    gridView.setAdapter((ListAdapter) c0Var2);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = b0Var2;
                    gridView.setTag(objArr2);
                }
            } else if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                if (obj2 instanceof C1105b0) {
                    C1105b0 b0Var3 = (C1105b0) obj2;
                    if (b0Var3.f2497b == null) {
                        b0Var3.f2497b = new C1110d0(this.f2489b);
                    }
                    C1110d0 d0Var = (C1110d0) b0Var3.f2497b;
                    d0Var.mo10704d(str, b0Var3);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.f2489b));
                    recyclerView.setAdapter(d0Var);
                    Object[] objArr3 = (Object[]) recyclerView.getTag();
                    objArr3[3] = b0Var3;
                    recyclerView.setTag(objArr3);
                }
            } else if (view instanceof TabLayout) {
                TabLayout tabLayout = (TabLayout) view;
                if (obj2 instanceof C1105b0) {
                    C0844j jVar = new C0844j(this.f2489b, 2);
                    int h = m3082h(str.substring(0, str.length() - 4));
                    Iterator<HashMap<Integer, Object>> it = ((C1105b0) obj2).f2496a.iterator();
                    while (it.hasNext()) {
                        HashMap<Integer, Object> next = it.next();
                        LinearLayout linearLayout = new LinearLayout(this.f2489b);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        openRestoreinterface(str, linearLayout, h, next);
                        TabLayout.C1283g newTab = tabLayout.newTab();
                        newTab.mo11607k(linearLayout);
                        tabLayout.addTab(newTab);
                        for (Integer num : next.keySet()) {
                            int parseInt = Integer.parseInt(String.valueOf(num));
                            if (parseInt > 0) {
                                C0839h.m1914w(linearLayout.findViewById(parseInt + h), next.get(Integer.valueOf(parseInt)), next, jVar);
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
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            if (view instanceof ListView) {
                ListView listView = (ListView) view;
                if (obj2 instanceof C1105b0) {
                    C1105b0 b0Var = (C1105b0) obj2;
                    if (b0Var.f2497b == null) {
                        b0Var.f2497b = new C1107c0(this.f2489b);
                    }
                    C1107c0 c0Var = (C1107c0) b0Var.f2497b;
                    c0Var.mo10694b(str, b0Var);
                    c0Var.mo10695c(i, i2);
                    listView.setAdapter((ListAdapter) c0Var);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = b0Var;
                    listView.setTag(objArr);
                }
            } else if (view instanceof GridView) {
                GridView gridView = (GridView) view;
                if (obj2 instanceof C1105b0) {
                    C1105b0 b0Var2 = (C1105b0) obj2;
                    if (b0Var2.f2497b == null) {
                        b0Var2.f2497b = new C1107c0(this.f2489b);
                    }
                    C1107c0 c0Var2 = (C1107c0) b0Var2.f2497b;
                    c0Var2.mo10694b(str, b0Var2);
                    c0Var2.mo10695c(i, i2);
                    gridView.setAdapter((ListAdapter) c0Var2);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = b0Var2;
                    gridView.setTag(objArr2);
                }
            } else if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                if (obj2 instanceof C1105b0) {
                    C1105b0 b0Var3 = (C1105b0) obj2;
                    if (b0Var3.f2497b == null) {
                        b0Var3.f2497b = new C1110d0(this.f2489b);
                    }
                    C1110d0 d0Var = (C1110d0) b0Var3.f2497b;
                    d0Var.mo10704d(str, b0Var3);
                    d0Var.mo10705e(i, i2);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.f2489b));
                    recyclerView.setAdapter(d0Var);
                    Object[] objArr3 = (Object[]) recyclerView.getTag();
                    objArr3[3] = b0Var3;
                    recyclerView.setTag(objArr3);
                }
            } else if (view instanceof TabLayout) {
                TabLayout tabLayout = (TabLayout) view;
                if (obj2 instanceof C1105b0) {
                    C0844j jVar = new C0844j(this.f2489b, 2);
                    int h = m3082h(str.substring(0, str.length() - 4));
                    Iterator<HashMap<Integer, Object>> it = ((C1105b0) obj2).f2496a.iterator();
                    while (it.hasNext()) {
                        HashMap<Integer, Object> next = it.next();
                        LinearLayout linearLayout = new LinearLayout(this.f2489b);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
                        linearLayout.setOrientation(1);
                        openRestoreinterface(str, linearLayout, h, next);
                        TabLayout.C1283g newTab = tabLayout.newTab();
                        newTab.mo11607k(linearLayout);
                        tabLayout.addTab(newTab);
                        for (Integer num : next.keySet()) {
                            int parseInt = Integer.parseInt(String.valueOf(num));
                            if (parseInt > 0) {
                                C0839h.m1914w(linearLayout.findViewById(parseInt + h), next.get(Integer.valueOf(parseInt)), next, jVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public void uninapp(String str) {
        Context context = this.f2490c;
        this.f2490c.startActivity(new Intent("android.intent.action.DELETE", C0851m.m1977c(context, "package:" + str)));
    }

    public Bitmap uqr(String str, int i) {
        return new C0853o(this.f2490c, this.f2489b).mo8950c(str, i);
    }

    public String uqr(Object obj) {
        return (obj instanceof Bitmap ? new C0853o(this.f2490c, this.f2489b).mo8951d((Bitmap) obj) : new C0853o(this.f2490c, this.f2489b).mo8952e(m3095u(String.valueOf(obj)))).mo8696f();
    }

    public void uqr() {
        new C0853o(this.f2490c, this.f2489b).mo8948a();
    }

    public void uqr(int i) {
        new C0853o(this.f2490c, this.f2489b).mo8949b(i);
    }

    public void urvw(Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10645us(java.lang.Object r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r4 = (android.view.View) r4
        L_0x0007:
            r0 = 0
            goto L_0x004c
        L_0x0009:
            r3.m3085k(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0 = 46
            int r0 = r4.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0041
            java.lang.String r2 = r4.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_javaCode.f2486f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r3.f2489b
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 + r0
            android.view.View r4 = r2.findViewById(r4)
            goto L_0x004c
        L_0x003f:
            r4 = 0
            goto L_0x0007
        L_0x0041:
            android.app.Activity r0 = r3.f2489b
            int r4 = java.lang.Integer.parseInt(r4)
            android.view.View r4 = r0.findViewById(r4)
            goto L_0x0007
        L_0x004c:
            if (r4 != 0) goto L_0x004f
            return r1
        L_0x004f:
            com.iapp.app.g r1 = new com.iapp.app.g
            android.content.Context r2 = r3.f2490c
            r1.<init>(r4, r2, r0)
            boolean r4 = r1.mo11843e0(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.mo10645us(java.lang.Object, java.lang.String, java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10646us(java.lang.Object r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r4 = (android.view.View) r4
        L_0x0007:
            r0 = 0
            goto L_0x004c
        L_0x0009:
            r3.m3085k(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0 = 46
            int r0 = r4.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0041
            java.lang.String r2 = r4.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_javaCode.f2486f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r3.f2489b
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 + r0
            android.view.View r4 = r2.findViewById(r4)
            goto L_0x004c
        L_0x003f:
            r4 = 0
            goto L_0x0007
        L_0x0041:
            android.app.Activity r0 = r3.f2489b
            int r4 = java.lang.Integer.parseInt(r4)
            android.view.View r4 = r0.findViewById(r4)
            goto L_0x0007
        L_0x004c:
            if (r4 != 0) goto L_0x004f
            return r1
        L_0x004f:
            com.iapp.app.g r1 = new com.iapp.app.g
            android.content.Context r2 = r3.f2490c
            r1.<init>(r4, r2, r0)
            boolean r4 = r1.mo11848f0(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.mo10646us(java.lang.Object, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10647us(java.lang.Object r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r4 = (android.view.View) r4
        L_0x0007:
            r0 = 0
            goto L_0x004c
        L_0x0009:
            r3.m3085k(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0 = 46
            int r0 = r4.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0041
            java.lang.String r2 = r4.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_javaCode.f2486f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r3.f2489b
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 + r0
            android.view.View r4 = r2.findViewById(r4)
            goto L_0x004c
        L_0x003f:
            r4 = 0
            goto L_0x0007
        L_0x0041:
            android.app.Activity r0 = r3.f2489b
            int r4 = java.lang.Integer.parseInt(r4)
            android.view.View r4 = r0.findViewById(r4)
            goto L_0x0007
        L_0x004c:
            if (r4 != 0) goto L_0x004f
            return r1
        L_0x004f:
            com.iapp.app.g r1 = new com.iapp.app.g
            android.content.Context r2 = r3.f2490c
            r1.<init>(r4, r2, r0)
            boolean r4 = r1.mo11852g0(r5, r6, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.mo10647us(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10648us(java.lang.Object r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0009
            android.view.View r9 = (android.view.View) r9
        L_0x0007:
            r0 = 0
            goto L_0x004c
        L_0x0009:
            r8.m3085k(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0 = 46
            int r0 = r9.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0041
            java.lang.String r2 = r9.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r9 = r9.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_javaCode.f2486f
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r2 = r8.f2489b
            int r9 = java.lang.Integer.parseInt(r9)
            int r9 = r9 + r0
            android.view.View r9 = r2.findViewById(r9)
            goto L_0x004c
        L_0x003f:
            r9 = 0
            goto L_0x0007
        L_0x0041:
            android.app.Activity r0 = r8.f2489b
            int r9 = java.lang.Integer.parseInt(r9)
            android.view.View r9 = r0.findViewById(r9)
            goto L_0x0007
        L_0x004c:
            if (r9 != 0) goto L_0x004f
            return r1
        L_0x004f:
            com.iapp.app.g r2 = new com.iapp.app.g
            android.content.Context r1 = r8.f2490c
            r2.<init>(r9, r1, r0)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            boolean r9 = r2.mo11856h0(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.mo10648us(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public Object usg(Camera camera, boolean z) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return C0862t.m2084i(this.f2490c, z);
            }
            if (z) {
                camera = Camera.open();
                m3074F(camera);
                return camera;
            } else if (camera == null) {
                return null;
            } else {
                m3073E(camera);
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
            if (this.f2489b.getRequestedOrientation() != 1) {
                activity = this.f2489b;
            } else {
                return;
            }
        } else if (this.f2489b.getRequestedOrientation() != 0) {
            activity = this.f2489b;
            i = 0;
        } else {
            return;
        }
        activity.setRequestedOrientation(i);
    }

    public void usjxm(boolean z) {
        if (z) {
            this.f2489b.getWindow().clearFlags(128);
        } else {
            this.f2489b.getWindow().setFlags(128, 128);
        }
    }

    public void usms(String str, String str2) {
        Context context = this.f2490c;
        Intent intent = new Intent("android.intent.action.SENDTO", C0851m.m1977c(context, "smsto:" + str));
        intent.putExtra("sms_body", str2);
        this.f2490c.startActivity(intent);
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
            kVar.mo11961q(m3095u(str2), i, z);
        }
    }

    public C1319k usxh(Object obj, int i) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2490c, this.f2489b, (SurfaceView) view, false, i);
        }
        return null;
    }

    public C1319k usxh(Object obj, int i, int i2, int i3, int i4) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2490c, this.f2489b, (SurfaceView) view, false, i, i2, i3, i4);
        }
        return null;
    }

    public C1319k usxq(Object obj, int i) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2490c, this.f2489b, (SurfaceView) view, true, i);
        }
        return null;
    }

    public C1319k usxq(Object obj, int i, int i2, int i3, int i4) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view instanceof SurfaceView) {
            return new C1319k(this.f2490c, this.f2489b, (SurfaceView) view, true, i, i2, i3, i4);
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
                m3085k(obj);
                view = m3087m(obj, String.valueOf(obj));
            }
            if (view != null && (view instanceof Toolbar)) {
                if (obj2 instanceof View) {
                    view2 = (View) obj2;
                } else {
                    m3085k(obj2);
                    view2 = m3087m(obj2, String.valueOf(obj2));
                }
                if (view2 != null && (view2 instanceof DrawerLayout)) {
                    ((AppCompatActivity) this.f2489b).getSupportActionBar().setHomeButtonEnabled(true);
                    DrawerLayout drawerLayout = (DrawerLayout) view2;
                    String obj3 = ((Object[]) drawerLayout.getTag())[2].toString();
                    C1132w wVar = new C1132w(this.f2489b, drawerLayout, (Toolbar) view, 0, 0, obj3.contains("<eventItme type=\"ondrawerclosed\">"), drawerLayout, obj3.contains("<eventItme type=\"ondraweropened\">"), obj3.contains("<eventItme type=\"onoptionsitemselected\">"));
                    drawerLayout.setDrawerListener(wVar);
                    wVar.syncState();
                }
            }
            return null;
        } else if (obj2.equals("sab")) {
            return ((AppCompatActivity) this.f2489b).getSupportActionBar();
        } else {
            if (obj2.equals("title")) {
                return String.valueOf(((AppCompatActivity) this.f2489b).getSupportActionBar().getTitle());
            }
            if (obj2.equals("subtitle")) {
                return String.valueOf(((AppCompatActivity) this.f2489b).getSupportActionBar().getSubtitle());
            }
            if (obj2.equals("cv")) {
                return ((AppCompatActivity) this.f2489b).getSupportActionBar().getCustomView();
            }
            if (obj2.equals("do")) {
                return Integer.valueOf(((AppCompatActivity) this.f2489b).getSupportActionBar().getDisplayOptions());
            }
            if (obj2.equals("height")) {
                return Integer.valueOf(((AppCompatActivity) this.f2489b).getSupportActionBar().getHeight());
            }
            return null;
        }
    }

    public void utb(Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view != null && (view instanceof Toolbar)) {
            ((AppCompatActivity) this.f2489b).setSupportActionBar((Toolbar) view);
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
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setTitle(String.valueOf(obj3));
            }
            if (obj2.equals("subtitle")) {
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setSubtitle(String.valueOf(obj3));
                return;
            } else if (obj2.equals("cv")) {
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setCustomView((View) obj3);
                return;
            } else if (obj2.equals("do")) {
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setDisplayOptions(m3075a(String.valueOf(obj3)));
                return;
            } else if (obj2.equals("dste")) {
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setDisplayShowTitleEnabled(obj3.equals(bool));
                return;
            } else if (obj2.equals("dsce")) {
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setDisplayShowCustomEnabled(obj3.equals(bool));
                return;
            } else if (obj2.equals("dshe")) {
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setHomeButtonEnabled(obj3.equals(bool));
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setDisplayShowHomeEnabled(obj3.equals(bool));
                supportActionBar = ((AppCompatActivity) this.f2489b).getSupportActionBar();
                z = obj3.equals(bool);
            } else {
                return;
            }
        } else if (obj.equals("left")) {
            if (obj2 instanceof View) {
                view2 = (View) obj2;
            } else {
                m3085k(obj2);
                view2 = m3087m(obj2, String.valueOf(obj2));
            }
            if (view2 != null && (view2 instanceof Toolbar)) {
                ((Toolbar) view2).setNavigationIcon(C1305g.m3582m(String.valueOf(obj3), this.f2490c));
                z = true;
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setHomeButtonEnabled(true);
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setDisplayShowHomeEnabled(true);
                supportActionBar = ((AppCompatActivity) this.f2489b).getSupportActionBar();
            } else {
                return;
            }
        } else if (obj.equals("right")) {
            if (obj2 instanceof View) {
                view = (View) obj2;
            } else {
                m3085k(obj2);
                view = m3087m(obj2, String.valueOf(obj2));
            }
            if (view != null && (view instanceof Toolbar)) {
                ((Toolbar) view).setOverflowIcon(C1305g.m3582m(String.valueOf(obj3), this.f2490c));
                return;
            }
            return;
        } else {
            return;
        }
        supportActionBar.setDisplayHomeAsUpEnabled(z);
    }

    public void utb(Object obj, Object obj2, Object obj3, Object obj4) {
        View view;
        if (obj.equals("set") && obj2.equals("leftck")) {
            if (obj3 instanceof View) {
                view = (View) obj3;
            } else {
                m3085k(obj3);
                view = m3087m(obj3, String.valueOf(obj3));
            }
            if (view != null && (view instanceof Toolbar)) {
                ((Toolbar) view).setNavigationOnClickListener((View.OnClickListener) obj4);
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setHomeButtonEnabled(true);
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setDisplayShowHomeEnabled(true);
                ((AppCompatActivity) this.f2489b).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
    }

    public View utw(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3) {
        Drawable drawable;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.f2490c).setTitle(str).setPositiveButton(str3, onClickListener).setNeutralButton(str4, onClickListener2).setNegativeButton(str5, onClickListener3);
        if (obj != null) {
            if (obj instanceof Drawable) {
                drawable = (Drawable) obj;
            } else {
                m3085k(obj);
                drawable = C1305g.m3582m(String.valueOf(obj), this.f2490c);
            }
            negativeButton.setIcon(drawable);
        }
        LinearLayout linearLayout = null;
        if (str2.endsWith(".ijava")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout2 = new LinearLayout(this.f2490c);
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

    public View utw(Object obj, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Drawable drawable;
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this.f2490c).setTitle(str).setPositiveButton(str3, onClickListener).setNeutralButton(str4, onClickListener2);
        if (obj != null) {
            if (obj instanceof Drawable) {
                drawable = (Drawable) obj;
            } else {
                m3085k(obj);
                drawable = C1305g.m3582m(String.valueOf(obj), this.f2490c);
            }
            neutralButton.setIcon(drawable);
        }
        LinearLayout linearLayout = null;
        if (str2.endsWith(".ijava")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout2 = new LinearLayout(this.f2490c);
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

    public View utw(Object obj, String str, String str2, String str3, boolean z, DialogInterface.OnClickListener onClickListener) {
        Drawable drawable;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f2490c).setTitle(str).setPositiveButton(str3, onClickListener);
        if (obj != null) {
            if (obj instanceof Drawable) {
                drawable = (Drawable) obj;
            } else {
                m3085k(obj);
                drawable = C1305g.m3582m(String.valueOf(obj), this.f2490c);
            }
            positiveButton.setIcon(drawable);
        }
        LinearLayout linearLayout = null;
        if (str2.endsWith(".ijava")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout2 = new LinearLayout(this.f2490c);
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
        Drawable drawable;
        AlertDialog.Builder title = new AlertDialog.Builder(this.f2490c).setTitle(str);
        if (obj != null) {
            if (obj instanceof Drawable) {
                drawable = (Drawable) obj;
            } else {
                m3085k(obj);
                drawable = C1305g.m3582m(String.valueOf(obj), this.f2490c);
            }
            title.setIcon(drawable);
        }
        if (str2.endsWith(".ijava")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.f2490c);
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
            LinearLayout linearLayout = new LinearLayout(this.f2490c);
            linearLayout.setOrientation(1);
            int h = m3082h(str.substring(0, str.length() - 4));
            linearLayout.setId(h);
            openRestoreinterface(str, linearLayout, h, null);
            View childAt = linearLayout.getChildAt(0);
            linearLayout.removeAllViews();
            C0862t.m2080e(this.f2490c, childAt, i, i2, i3, i4, i5, C1305g.m3587t(str2), i6, i7);
            return childAt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public View uxf(String str, int i, int i2, String str2) {
        try {
            LinearLayout linearLayout = new LinearLayout(this.f2490c);
            linearLayout.setOrientation(1);
            int h = m3082h(str.substring(0, str.length() - 4));
            linearLayout.setId(h);
            openRestoreinterface(str, linearLayout, h, null);
            View childAt = linearLayout.getChildAt(0);
            linearLayout.removeAllViews();
            C0862t.m2080e(this.f2490c, childAt, 0, 0, i, i2, 0, C1305g.m3587t(str2), 0, 0);
            return childAt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void uxf(Object obj) {
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            ((WindowManager) this.f2490c.getApplicationContext().getSystemService("window")).updateViewLayout(view, view.getLayoutParams());
        }
    }

    public void uxf(Object obj, String str) {
        if (str.equals("del")) {
            View view = null;
            if (obj instanceof View) {
                view = (View) obj;
            }
            if (view != null) {
                ((WindowManager) this.f2490c.getApplicationContext().getSystemService("window")).removeView(view);
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
            android.content.Context r3 = r1.f2490c
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
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_javaCode.uxf(java.lang.Object, java.lang.String, int, int, int, int, int, java.lang.String, int, int):void");
    }

    public void uxf(Object obj, String str, int i, int i2, int i3, int i4, String str2) {
        if (str.equals("set")) {
            View view = null;
            if (obj instanceof View) {
                view = (View) obj;
            }
            if (view != null) {
                WindowManager windowManager = (WindowManager) this.f2490c.getApplicationContext().getSystemService("window");
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
        C0862t.m2078c(this.f2489b, C0860r.m2056o(str), z, this.f2489b.findViewById(C0839h.f1737a));
    }

    public void uycl(String str, boolean z, int i) {
        C0862t.m2079d(this.f2489b, C0860r.m2056o(str), z, this.f2489b.findViewById(C0839h.f1737a), i);
    }

    public void uycl(boolean z) {
        if (z) {
            this.f2489b.getWindow().clearFlags(2048);
            this.f2489b.getWindow().setFlags(1024, 1024);
            return;
        }
        this.f2489b.getWindow().addFlags(2048);
    }

    public Vibrator uzd(Vibrator vibrator, long j) {
        if (vibrator == null) {
            vibrator = (Vibrator) this.f2490c.getSystemService("vibrator");
        }
        vibrator.vibrate(j);
        return vibrator;
    }

    public Vibrator uzd(Vibrator vibrator, long[] jArr, boolean z) {
        if (vibrator == null) {
            vibrator = (Vibrator) this.f2490c.getSystemService("vibrator");
        }
        vibrator.vibrate(jArr, z ? 1 : -1);
        return vibrator;
    }

    @TargetApi(11)
    public Object uzd(Vibrator vibrator, String str) {
        if (vibrator == null) {
            vibrator = (Vibrator) this.f2490c.getSystemService("vibrator");
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

    public View yul(String str) {
        return C0839h.m1907p(this.f2490c, str);
    }

    public Object yul(Object obj, String str) {
        View view;
        View p;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            m3085k(obj);
            view = m3087m(obj, String.valueOf(obj));
        }
        if (view == null || (p = C0839h.m1907p(this.f2490c, str)) == null) {
            return null;
        }
        ((ViewGroup) view).addView(p);
        return null;
    }

    public int zdp(float f) {
        return C0860r.m2053l(this.f2490c, f);
    }

    /* renamed from: zj */
    public Object mo10684zj(String str) {
        return C0839h.m1905n(str, new Object[]{"Activity", this.f2490c});
    }

    /* renamed from: zj */
    public Object mo10685zj(String str, Object[] objArr) {
        Object[] objArr2;
        if (objArr == null) {
            objArr2 = new Object[]{"Activity", this.f2490c};
        } else {
            int length = objArr.length;
            Object[] objArr3 = new Object[(length + 2)];
            objArr3[0] = "Activity";
            objArr3[1] = this.f2490c;
            for (int i = 0; i < length; i++) {
                objArr3[i + 2] = objArr[i];
            }
            objArr2 = objArr3;
        }
        return C0839h.m1905n(str, objArr2);
    }

    public int zpd(float f) {
        return C0860r.m2064w(this.f2490c, f);
    }

    public int zps(float f) {
        return C0860r.m2065x(this.f2490c, f);
    }

    public int zsp(float f) {
        return C0860r.m2037A(this.f2490c, f);
    }
}
