package com.iapp.app;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
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
import android.support.p012v7.app.ActionBarDrawerToggle;
import android.support.p012v7.app.AppCompatActivity;
import android.support.p012v7.widget.LinearLayoutManager;
import android.support.p012v7.widget.RecyclerView;
import android.support.p012v7.widget.StaggeredGridLayoutManager;
import android.support.p012v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
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
import p013b.p014a.p015a.C0716p;
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
import p013b.p057f.p058a.C0969a;
import p059c.p060a.C1017h;
import p059c.p061b.C1027e;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;

@SuppressLint({"HandlerLeak"})
public class Aid_YuCodeX {

    /* renamed from: f */
    public static int f2352f = 9865197;

    /* renamed from: i */
    private static HashMap<String, Object> f2353i = new HashMap<>();

    /* renamed from: j */
    private static int f2354j = 0;

    /* renamed from: k */
    private static HashMap<Integer, String> f2355k = new HashMap<>();

    /* renamed from: l */
    private static Aid_YuCodeX f2356l = null;

    /* renamed from: v */
    public static int f2357v = 9865198;

    /* renamed from: a */
    public Context f2358a = null;

    /* renamed from: b */
    private HashMap<String, Object> f2359b = new HashMap<>();

    /* renamed from: c */
    private HashMap<String, Object> f2360c = new HashMap<>();

    /* renamed from: d */
    private Activity f2361d = null;

    /* renamed from: e */
    private int f2362e = -1;

    /* renamed from: g */
    private Aid_YuCodeX f2363g = null;

    /* renamed from: h */
    private Handler f2364h = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$a */
    public class DialogInterface$OnClickListenerC1060a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2365a;

        DialogInterface$OnClickListenerC1060a(String str) {
            this.f2365a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f2365a;
            if (str != null) {
                Aid_YuCodeX.this.YuGo(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$a0 */
    public class C1061a0 implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ String f2367a;

        /* renamed from: b */
        final /* synthetic */ String f2368b;

        C1061a0(String str, String str2) {
            this.f2367a = str;
            this.f2368b = str2;
        }

        @Override // android.support.design.widget.AppBarLayout.OnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (this.f2367a != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(appBarLayout.getId()));
                aid_YuCodeX2.dim("st_vW", appBarLayout);
                aid_YuCodeX2.dim("st_vO", Integer.valueOf(i));
                String str = this.f2368b;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2367a);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onoffsetchanged" + this.f2367a, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$b */
    public class DialogInterface$OnClickListenerC1062b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2370a;

        DialogInterface$OnClickListenerC1062b(String str) {
            this.f2370a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f2370a;
            if (str != null) {
                Aid_YuCodeX.this.YuGo(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$b0 */
    public class C1063b0 implements AbstractC1442a {
        C1063b0(Aid_YuCodeX aid_YuCodeX) {
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
    /* renamed from: com.iapp.app.Aid_YuCodeX$c */
    public class DialogInterface$OnClickListenerC1064c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2372a;

        DialogInterface$OnClickListenerC1064c(String str) {
            this.f2372a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f2372a;
            if (str != null) {
                Aid_YuCodeX.this.YuGo(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$c0 */
    public class C1065c0 implements AbstractC1442a {
        C1065c0(Aid_YuCodeX aid_YuCodeX) {
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
    /* renamed from: com.iapp.app.Aid_YuCodeX$d */
    public class DialogInterface$OnClickListenerC1066d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2374a;

        DialogInterface$OnClickListenerC1066d(String str) {
            this.f2374a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f2374a;
            if (str != null) {
                Aid_YuCodeX.this.YuGo(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$d0 */
    public class C1067d0 extends Thread {
        C1067d0() {
        }

        public void run() {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            aid_YuCodeX.YuGo(aid_YuCodeX.f2360c.get(String.valueOf(getId())).toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$e */
    public class DialogInterface$OnClickListenerC1068e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2377a;

        DialogInterface$OnClickListenerC1068e(String str) {
            this.f2377a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f2377a;
            if (str != null) {
                Aid_YuCodeX.this.YuGo(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$e0 */
    public class View$OnClickListenerC1069e0 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2379a;

        View$OnClickListenerC1069e0(String str) {
            this.f2379a = str;
        }

        public void onClick(View view) {
            Aid_YuCodeX.this.YuGo(this.f2379a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$f */
    public class DialogInterface$OnClickListenerC1070f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2381a;

        DialogInterface$OnClickListenerC1070f(String str) {
            this.f2381a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f2381a;
            if (str != null) {
                Aid_YuCodeX.this.YuGo(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$f0 */
    public class C1071f0 extends ActionBarDrawerToggle {

        /* renamed from: a */
        final /* synthetic */ String f2383a;

        /* renamed from: b */
        final /* synthetic */ DrawerLayout f2384b;

        /* renamed from: c */
        final /* synthetic */ String f2385c;

        /* renamed from: d */
        final /* synthetic */ String f2386d;

        /* renamed from: e */
        final /* synthetic */ String f2387e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1071f0(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2, String str, DrawerLayout drawerLayout2, String str2, String str3, String str4) {
            super(activity, drawerLayout, toolbar, i, i2);
            this.f2383a = str;
            this.f2384b = drawerLayout2;
            this.f2385c = str2;
            this.f2386d = str3;
            this.f2387e = str4;
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerClosed(View view) {
            if (this.f2383a != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2384b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2384b);
                aid_YuCodeX2.dim("st_dW", view);
                String str = this.f2385c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2383a);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "ondrawerclosed" + this.f2383a, aid_YuCodeX2);
            }
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerOpened(View view) {
            if (this.f2386d != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2384b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2384b);
                aid_YuCodeX2.dim("st_dW", view);
                String str = this.f2385c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2386d);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "ondraweropened" + this.f2386d, aid_YuCodeX2);
            }
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (this.f2387e == null) {
                return false;
            }
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2384b.getId()));
            aid_YuCodeX2.dim("st_vW", this.f2384b);
            aid_YuCodeX2.dim("st_iM", menuItem);
            String str = this.f2385c;
            if (str == null) {
                aid_YuCodeX2.YuGoX(this.f2387e);
                return false;
            }
            Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
            aid_YuCodeX3.goUIEventset(str, "onoptionsitemselected" + this.f2387e, aid_YuCodeX2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$g */
    public class View$OnClickListenerC1072g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2389a;

        View$OnClickListenerC1072g(String str) {
            this.f2389a = str;
        }

        public void onClick(View view) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX2.dim("st_vW", view);
            String str = this.f2389a;
            if (str == null) {
                aid_YuCodeX2.YuGoX(C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"clicki\">", "</eventItme>"));
                return;
            }
            Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
            aid_YuCodeX3.goUIEventset(str, "clicki" + C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"clicki\">", "</eventItme>"), aid_YuCodeX2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$g0 */
    public class View$OnClickListenerC1073g0 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2391a;

        View$OnClickListenerC1073g0(String str) {
            this.f2391a = str;
        }

        public void onClick(View view) {
            Aid_YuCodeX.this.YuGo(this.f2391a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$h */
    public class View$OnTouchListenerC1074h implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ String f2393a;

        View$OnTouchListenerC1074h(String str) {
            this.f2393a = str;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX2.dim("st_vW", view);
            aid_YuCodeX2.dim("st_eA", Integer.valueOf(motionEvent.getAction()));
            aid_YuCodeX2.dim("st_eX", Float.valueOf(motionEvent.getX()));
            aid_YuCodeX2.dim("st_eY", Float.valueOf(motionEvent.getY()));
            aid_YuCodeX2.dim("st_rX", Float.valueOf(motionEvent.getRawX()));
            aid_YuCodeX2.dim("st_rY", Float.valueOf(motionEvent.getRawY()));
            return Aid_YuCodeX.this.m2984N(this.f2393a, aid_YuCodeX2, "touchmonitor", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$h0 */
    public class C1075h0 extends WebChromeClient {
        C1075h0(Aid_YuCodeX aid_YuCodeX) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$i */
    public class View$OnLongClickListenerC1076i implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2395a;

        View$OnLongClickListenerC1076i(String str) {
            this.f2395a = str;
        }

        public boolean onLongClick(View view) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX2.dim("st_vW", view);
            return Aid_YuCodeX.this.m2984N(this.f2395a, aid_YuCodeX2, "press", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$i0 */
    public class C1077i0 implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ String f2397a;

        C1077i0(String str) {
            this.f2397a = str;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            aid_YuCodeX.dim("st_msG", aid_YuCodeX.mo10113C(obj));
            Aid_YuCodeX.this.dim("st_ssR", cVar);
            Aid_YuCodeX.this.YuGoX(this.f2397a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$j */
    public class View$OnKeyListenerC1078j implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ String f2399a;

        View$OnKeyListenerC1078j(String str) {
            this.f2399a = str;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX2.dim("st_vW", view);
            aid_YuCodeX2.dim("st_kC", Integer.valueOf(i));
            aid_YuCodeX2.dim("st_eA", Integer.valueOf(keyEvent.getAction()));
            aid_YuCodeX2.dim("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
            return Aid_YuCodeX.this.m2984N(this.f2399a, aid_YuCodeX2, "keyboard", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$j0 */
    public class C1079j0 implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ String f2401a;

        C1079j0(String str) {
            this.f2401a = str;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            aid_YuCodeX.dim("st_msG", aid_YuCodeX.mo10113C(obj));
            Aid_YuCodeX.this.dim("st_ssR", cVar);
            Aid_YuCodeX.this.YuGoX(this.f2401a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$k */
    public class HandlerC1080k extends Handler {
        HandlerC1080k(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_YuCodeX.this.f2358a, message.obj.toString(), 1).show();
            } else if (i == 2) {
                Aid_YuCodeX.this.YuGo(message.obj.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$k0 */
    public class C1081k0 implements OnFileDownStatusListener {
        C1081k0() {
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void complete(int i, Object obj) {
            if (obj != null) {
                Aid_YuCodeX.this.dim("st_drJ", Integer.valueOf(i));
                Aid_YuCodeX.this.YuGoX(obj.toString());
            }
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void resultStatus(int i, int i2, Object obj) {
            if (obj != null) {
                Aid_YuCodeX.this.dim("st_drD", Integer.valueOf(i));
                Aid_YuCodeX.this.dim("st_drI", Integer.valueOf(i2));
                Aid_YuCodeX.this.YuGoX(obj.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$l */
    public class View$OnCreateContextMenuListenerC1082l implements View.OnCreateContextMenuListener {

        /* renamed from: a */
        final /* synthetic */ String f2405a;

        View$OnCreateContextMenuListenerC1082l(String str) {
            this.f2405a = str;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            String c = C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"pressmenu\">", "</eventItme>");
            contextMenu.setHeaderTitle(C0860r.m2044c(c, "title:", "\n"));
            Aid_YuCodeX.f2355k.clear();
            String[] split = c.split("\ncase ");
            for (int i = 1; i < split.length; i++) {
                contextMenu.add(0, i, 0, C0860r.m2044c(split[i], null, ":"));
                Aid_YuCodeX.f2355k.put(Integer.valueOf(i), C0860r.m2044c(split[i], ":", "\nbreak"));
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX unused = Aid_YuCodeX.f2356l = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            Aid_YuCodeX.f2356l.dim("st_vId", Integer.valueOf(view.getId()));
            Aid_YuCodeX.f2356l.dim("st_vW", view);
            if (c2 != null) {
                String str = this.f2405a;
                if (str == null) {
                    Aid_YuCodeX.f2356l.YuGoX(c2);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX2 = Aid_YuCodeX.this;
                aid_YuCodeX2.goUIEventset(str, "pressmenu" + c2, Aid_YuCodeX.f2356l);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$l0 */
    public class C1083l0 {

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> f2407a;

        /* renamed from: b */
        public Object f2408b;

        private C1083l0(Aid_YuCodeX aid_YuCodeX) {
            this.f2407a = new ArrayList<>();
            this.f2408b = null;
        }

        /* synthetic */ C1083l0(Aid_YuCodeX aid_YuCodeX, HandlerC1080k kVar) {
            this(aid_YuCodeX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$m */
    public class C1084m implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ String f2409a;

        C1084m(String str) {
            this.f2409a = str;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            Integer num;
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(textView.getId()));
            aid_YuCodeX2.dim("st_vW", textView);
            aid_YuCodeX2.dim("st_aI", Integer.valueOf(i));
            if (keyEvent != null) {
                aid_YuCodeX2.dim("st_eA", Integer.valueOf(keyEvent.getAction()));
                aid_YuCodeX2.dim("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
                num = Integer.valueOf(keyEvent.getKeyCode());
            } else {
                num = null;
                aid_YuCodeX2.dim("st_eA", null);
                aid_YuCodeX2.dim("st_eR", null);
            }
            aid_YuCodeX2.dim("st_eK", num);
            return Aid_YuCodeX.this.m2984N(this.f2409a, aid_YuCodeX2, "editormonitor", ((Object[]) textView.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$m0 */
    public class C1085m0 extends BaseAdapter {

        /* renamed from: a */
        private Context f2411a;

        /* renamed from: b */
        private C0844j f2412b;

        /* renamed from: c */
        private C1083l0 f2413c;

        /* renamed from: d */
        private String f2414d = null;

        /* renamed from: e */
        private String f2415e = null;

        /* renamed from: f */
        private String f2416f = null;

        /* renamed from: g */
        private int f2417g = 0;

        /* renamed from: h */
        private int f2418h;

        /* renamed from: i */
        private int f2419i = -1;

        /* renamed from: j */
        private int f2420j = -2;

        /* renamed from: k */
        private Iterator f2421k;

        /* renamed from: l */
        private C1086a f2422l;

        /* renamed from: m */
        private Aid_YuCodeX f2423m = null;

        /* renamed from: n */
        private ArrayList<Integer> f2424n = null;

        /* renamed from: com.iapp.app.Aid_YuCodeX$m0$a */
        private final class C1086a {

            /* renamed from: a */
            public ViewGroup f2426a;

            /* renamed from: b */
            public int[] f2427b;

            /* renamed from: c */
            public View[] f2428c;

            private C1086a(C1085m0 m0Var) {
                this.f2426a = null;
                this.f2427b = null;
                this.f2428c = null;
            }

            /* synthetic */ C1086a(C1085m0 m0Var, HandlerC1080k kVar) {
                this(m0Var);
            }
        }

        public C1085m0(Context context) {
            this.f2411a = context;
            this.f2412b = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo10335a() {
            return this.f2413c.f2407a;
        }

        /* renamed from: b */
        public void mo10336b(String str, C1083l0 l0Var) {
            this.f2414d = str;
            this.f2413c = l0Var;
            String substring = str.substring(0, str.length() - 4);
            this.f2415e = substring;
            this.f2417g = Aid_YuCodeX.this.m3013m(substring);
            this.f2415e = this.f2415e.toLowerCase();
            this.f2416f = Aid_YuCodeX.this.getopenRestoreinterface(str);
        }

        /* renamed from: c */
        public void mo10337c(int i, int i2) {
            this.f2419i = i;
            this.f2420j = i2;
        }

        public int getCount() {
            C1083l0 l0Var = this.f2413c;
            if (l0Var == null) {
                return 0;
            }
            return l0Var.f2407a.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout;
            HashMap<Integer, Object> hashMap = this.f2413c.f2407a.get(i);
            if (view == null) {
                this.f2422l = new C1086a(this, null);
                LinearLayout linearLayout2 = new LinearLayout(this.f2411a);
                linearLayout2.setLayoutParams(new AbsListView.LayoutParams(this.f2419i, this.f2420j));
                linearLayout2.setOrientation(1);
                LinearLayout linearLayout3 = new LinearLayout(this.f2411a);
                linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(this.f2419i, this.f2420j));
                linearLayout3.setOrientation(1);
                linearLayout2.addView(linearLayout3);
                Aid_YuCodeX.this.openRestoreinterface(this.f2414d, linearLayout3, this.f2417g, hashMap);
                this.f2421k = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f2421k.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f2421k.next()));
                    this.f2418h = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                C1086a aVar = this.f2422l;
                aVar.f2428c = new View[size];
                aVar.f2427b = new int[size];
                if (this.f2424n == null) {
                    this.f2424n = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i2 = 0; i2 < size; i2++) {
                        int intValue = ((Integer) arrayList.get(i2)).intValue();
                        this.f2418h = intValue;
                        C1086a aVar2 = this.f2422l;
                        aVar2.f2427b[i2] = intValue;
                        if (intValue > 0) {
                            aVar2.f2428c[i2] = linearLayout2.findViewById(intValue + this.f2417g);
                        }
                        stringBuffer.append(this.f2418h + this.f2417g);
                        stringBuffer.append(',');
                    }
                    Aid_YuCodeX.this.setClickable(this.f2424n, stringBuffer, linearLayout2);
                } else {
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue2 = ((Integer) arrayList.get(i3)).intValue();
                        this.f2418h = intValue2;
                        C1086a aVar3 = this.f2422l;
                        aVar3.f2427b[i3] = intValue2;
                        if (intValue2 > 0) {
                            aVar3.f2428c[i3] = linearLayout2.findViewById(intValue2 + this.f2417g);
                        }
                    }
                }
                C1086a aVar4 = this.f2422l;
                aVar4.f2426a = linearLayout3;
                linearLayout2.setTag(aVar4);
                linearLayout = linearLayout2;
            } else {
                this.f2422l = (C1086a) view.getTag();
                linearLayout = view;
            }
            int i4 = 0;
            while (true) {
                C1086a aVar5 = this.f2422l;
                int[] iArr = aVar5.f2427b;
                if (i4 >= iArr.length) {
                    break;
                }
                if (iArr[i4] > 0) {
                    C0839h.m1914w(aVar5.f2428c[i4], hashMap.get(Integer.valueOf(iArr[i4])), hashMap, this.f2412b);
                }
                i4++;
            }
            Iterator<Integer> it = this.f2424n.iterator();
            while (it.hasNext()) {
                View findViewById = linearLayout.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            if (this.f2416f != null) {
                this.f2422l.f2426a.setTag(new Object[]{null, null, null, hashMap});
                if (this.f2423m == null) {
                    Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                    this.f2423m = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                }
                this.f2423m.dim("st_vW", this.f2422l.f2426a);
                this.f2423m.dim("st_lS", this.f2413c.f2407a);
                this.f2423m.dim("st_pN", Integer.valueOf(i));
                Aid_YuCodeX aid_YuCodeX2 = Aid_YuCodeX.this;
                String str = this.f2415e;
                aid_YuCodeX2.goUIEventset(str, "loading" + this.f2416f, this.f2423m);
            }
            return linearLayout;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$n */
    public class View$OnFocusChangeListenerC1087n implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f2429a;

        View$OnFocusChangeListenerC1087n(String str) {
            this.f2429a = str;
        }

        public void onFocusChange(View view, boolean z) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(view.getId()));
            aid_YuCodeX2.dim("st_vW", view);
            aid_YuCodeX2.dim("st_hF", Boolean.valueOf(z));
            String str = this.f2429a;
            if (str == null) {
                aid_YuCodeX2.YuGoX(C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"focuschange\">", "</eventItme>"));
                return;
            }
            Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
            aid_YuCodeX3.goUIEventset(str, "focuschange" + C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"focuschange\">", "</eventItme>"), aid_YuCodeX2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$n0 */
    public class C1088n0 extends RecyclerView.Adapter<C1089a> {

        /* renamed from: a */
        private Context f2431a;

        /* renamed from: b */
        private C1083l0 f2432b;

        /* renamed from: c */
        private C0844j f2433c;

        /* renamed from: d */
        private String f2434d = null;

        /* renamed from: e */
        private String f2435e = null;

        /* renamed from: f */
        private String f2436f = null;

        /* renamed from: g */
        private int f2437g = 0;

        /* renamed from: h */
        private int f2438h;

        /* renamed from: i */
        private int f2439i = -1;

        /* renamed from: j */
        private int f2440j = -2;

        /* renamed from: k */
        private Iterator f2441k;

        /* renamed from: l */
        private Aid_YuCodeX f2442l = null;

        /* renamed from: m */
        private ArrayList<Integer> f2443m = null;

        /* access modifiers changed from: package-private */
        /* renamed from: com.iapp.app.Aid_YuCodeX$n0$a */
        public class C1089a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ViewGroup f2445a;

            /* renamed from: b */
            public int[] f2446b = null;

            /* renamed from: c */
            public View[] f2447c = null;

            public C1089a(C1088n0 n0Var, ViewGroup viewGroup) {
                super(viewGroup);
                this.f2445a = viewGroup;
            }
        }

        public C1088n0(Context context) {
            this.f2431a = context;
            this.f2433c = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo10343a() {
            return this.f2432b.f2407a;
        }

        /* renamed from: b */
        public void onBindViewHolder(C1089a aVar, int i) {
            HashMap<Integer, Object> hashMap = this.f2432b.f2407a.get(i);
            if (aVar.f2446b == null) {
                Aid_YuCodeX.this.openRestoreinterface(this.f2434d, aVar.f2445a, this.f2437g, hashMap);
                this.f2441k = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f2441k.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f2441k.next()));
                    this.f2438h = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                aVar.f2447c = new View[size];
                aVar.f2446b = new int[size];
                if (this.f2443m == null) {
                    this.f2443m = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i2 = 0; i2 < size; i2++) {
                        int intValue = ((Integer) arrayList.get(i2)).intValue();
                        this.f2438h = intValue;
                        aVar.f2446b[i2] = intValue;
                        if (intValue > 0) {
                            aVar.f2447c[i2] = aVar.f2445a.findViewById(intValue + this.f2437g);
                        }
                        stringBuffer.append(this.f2438h + this.f2437g);
                        stringBuffer.append(',');
                    }
                    Aid_YuCodeX.this.setClickable(this.f2443m, stringBuffer, aVar.f2445a);
                } else {
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue2 = ((Integer) arrayList.get(i3)).intValue();
                        this.f2438h = intValue2;
                        aVar.f2446b[i3] = intValue2;
                        if (intValue2 > 0) {
                            aVar.f2447c[i3] = aVar.f2445a.findViewById(intValue2 + this.f2437g);
                        }
                    }
                }
            }
            int i4 = 0;
            while (true) {
                int[] iArr = aVar.f2446b;
                if (i4 >= iArr.length) {
                    break;
                }
                if (iArr[i4] > 0) {
                    C0839h.m1914w(aVar.f2447c[i4], hashMap.get(Integer.valueOf(iArr[i4])), hashMap, this.f2433c);
                }
                i4++;
            }
            Iterator<Integer> it = this.f2443m.iterator();
            while (it.hasNext()) {
                View findViewById = aVar.f2445a.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            if (this.f2436f != null) {
                aVar.f2445a.setTag(new Object[]{null, null, null, hashMap});
                if (this.f2442l == null) {
                    Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                    this.f2442l = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                }
                this.f2442l.dim("st_vW", aVar.f2445a);
                this.f2442l.dim("st_lS", this.f2432b.f2407a);
                this.f2442l.dim("st_pN", Integer.valueOf(i));
                Aid_YuCodeX aid_YuCodeX2 = Aid_YuCodeX.this;
                String str = this.f2435e;
                aid_YuCodeX2.goUIEventset(str, "loading" + this.f2436f, this.f2442l);
            }
        }

        /* renamed from: c */
        public C1089a onCreateViewHolder(ViewGroup viewGroup, int i) {
            LinearLayout linearLayout = new LinearLayout(this.f2431a);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f2439i, this.f2440j));
            linearLayout.setOrientation(1);
            return new C1089a(this, linearLayout);
        }

        /* renamed from: d */
        public void mo10346d(String str, C1083l0 l0Var) {
            this.f2434d = str;
            this.f2432b = l0Var;
            String substring = str.substring(0, str.length() - 4);
            this.f2435e = substring;
            this.f2437g = Aid_YuCodeX.this.m3013m(substring);
            this.f2435e = this.f2435e.toLowerCase();
            this.f2436f = Aid_YuCodeX.this.getopenRestoreinterface(str);
        }

        /* renamed from: e */
        public void mo10347e(int i, int i2) {
            this.f2439i = i;
            this.f2440j = i2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            C1083l0 l0Var = this.f2432b;
            if (l0Var == null) {
                return 0;
            }
            return l0Var.f2407a.size();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$o */
    public class C1090o implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ String f2448a;

        C1090o(String str) {
            this.f2448a = str;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            String c = C0860r.m2044c(((Object[]) absListView.getTag())[2].toString(), "<eventItme type=\"onscroll\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(absListView.getId()));
                aid_YuCodeX2.dim("st_vW", absListView);
                aid_YuCodeX2.dim("st_fM", Integer.valueOf(i));
                aid_YuCodeX2.dim("st_vT", Integer.valueOf(i2));
                aid_YuCodeX2.dim("st_bT", Integer.valueOf(i3));
                String str = this.f2448a;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onscroll" + c, aid_YuCodeX2);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            String c = C0860r.m2044c(((Object[]) absListView.getTag())[2].toString(), "<eventItme type=\"onscrollstatechanged\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(absListView.getId()));
                aid_YuCodeX2.dim("st_vW", absListView);
                aid_YuCodeX2.dim("st_sE", Integer.valueOf(i));
                String str = this.f2448a;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onscrollstatechanged" + c, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$p */
    public class C1091p implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2450a;

        C1091p(String str) {
            this.f2450a = str;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(adapterView.getId()));
            aid_YuCodeX2.dim("st_vW", adapterView);
            aid_YuCodeX2.dim("st_pN", Integer.valueOf(i));
            aid_YuCodeX2.dim("st_iD", Long.valueOf(j));
            String str = this.f2450a;
            if (str == null) {
                aid_YuCodeX2.YuGoX(C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"clickitem\">", "</eventItme>"));
                return;
            }
            Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
            aid_YuCodeX3.goUIEventset(str, "clickitem" + C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"clickitem\">", "</eventItme>"), aid_YuCodeX2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$q */
    public class C1092q implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ String f2452a;

        C1092q(String str) {
            this.f2452a = str;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String c = C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"onitemselected\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(adapterView.getId()));
                aid_YuCodeX2.dim("st_vW", adapterView);
                aid_YuCodeX2.dim("st_vW2", view);
                aid_YuCodeX2.dim("st_pN", Integer.valueOf(i));
                aid_YuCodeX2.dim("st_iD", Long.valueOf(j));
                String str = this.f2452a;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onitemselected" + c, aid_YuCodeX2);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            String c = C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"onnothingselected\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(adapterView.getId()));
                aid_YuCodeX2.dim("st_vW", adapterView);
                String str = this.f2452a;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onnothingselected" + c, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$r */
    public class C1093r implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f2454a;

        C1093r(String str) {
            this.f2454a = str;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onprogresschanged2\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(seekBar.getId()));
                aid_YuCodeX2.dim("st_vW", seekBar);
                aid_YuCodeX2.dim("st_nS", Integer.valueOf(i));
                aid_YuCodeX2.dim("st_fR", Boolean.valueOf(z));
                String str = this.f2454a;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onprogresschanged2" + c, aid_YuCodeX2);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onstarttrackingtouch\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(seekBar.getId()));
                aid_YuCodeX2.dim("st_vW", seekBar);
                String str = this.f2454a;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onstarttrackingtouch" + c, aid_YuCodeX2);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onstoptrackingtouch\">", "</eventItme>");
            if (c != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(seekBar.getId()));
                aid_YuCodeX2.dim("st_vW", seekBar);
                String str = this.f2454a;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onstoptrackingtouch" + c, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$s */
    public class C1094s implements TabLayout.AbstractC1278d {

        /* renamed from: a */
        final /* synthetic */ String f2456a;

        /* renamed from: b */
        final /* synthetic */ View f2457b;

        /* renamed from: c */
        final /* synthetic */ String f2458c;

        /* renamed from: d */
        final /* synthetic */ String f2459d;

        /* renamed from: e */
        final /* synthetic */ String f2460e;

        C1094s(String str, View view, String str2, String str3, String str4) {
            this.f2456a = str;
            this.f2457b = view;
            this.f2458c = str2;
            this.f2459d = str3;
            this.f2460e = str4;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(TabLayout.C1283g gVar) {
            if (this.f2460e != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2457b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2457b);
                aid_YuCodeX2.dim("st_pN", Integer.valueOf(gVar.mo11600d()));
                aid_YuCodeX2.dim("st_tT", String.valueOf(gVar.mo11601e()));
                aid_YuCodeX2.dim("st_taB", gVar);
                String str = this.f2458c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2460e);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "ontabreselected" + this.f2460e, aid_YuCodeX2);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(TabLayout.C1283g gVar) {
            if (this.f2459d != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2457b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2457b);
                aid_YuCodeX2.dim("st_pN", Integer.valueOf(gVar.mo11600d()));
                aid_YuCodeX2.dim("st_tT", String.valueOf(gVar.mo11601e()));
                aid_YuCodeX2.dim("st_taB", gVar);
                String str = this.f2458c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2459d);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "ontabunselected" + this.f2459d, aid_YuCodeX2);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(TabLayout.C1283g gVar) {
            if (this.f2456a != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2457b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2457b);
                aid_YuCodeX2.dim("st_pN", Integer.valueOf(gVar.mo11600d()));
                aid_YuCodeX2.dim("st_tT", String.valueOf(gVar.mo11601e()));
                aid_YuCodeX2.dim("st_taB", gVar);
                String str = this.f2458c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2456a);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "ontabselected" + this.f2456a, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$t */
    public class C1095t extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ String f2462a;

        /* renamed from: b */
        final /* synthetic */ String f2463b;

        /* renamed from: c */
        final /* synthetic */ String f2464c;

        C1095t(String str, String str2, String str3) {
            this.f2462a = str;
            this.f2463b = str2;
            this.f2464c = str3;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f2462a != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(recyclerView.getId()));
                aid_YuCodeX2.dim("st_vW", recyclerView);
                aid_YuCodeX2.dim("st_sE", Integer.valueOf(i));
                String str = this.f2463b;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2462a);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onscrollstatechanged" + this.f2462a, aid_YuCodeX2);
            }
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.f2464c != null) {
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
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(recyclerView.getId()));
                aid_YuCodeX2.dim("st_vW", recyclerView);
                aid_YuCodeX2.dim("st_fM", Integer.valueOf(i3));
                aid_YuCodeX2.dim("st_vT", Integer.valueOf(childCount));
                aid_YuCodeX2.dim("st_bT", Integer.valueOf(itemCount));
                aid_YuCodeX2.dim("st_dX", Integer.valueOf(i));
                aid_YuCodeX2.dim("st_dY", Integer.valueOf(i2));
                if (i2 > 0 && childCount + i3 >= itemCount) {
                    z = true;
                }
                aid_YuCodeX2.dim("st_isB", Boolean.valueOf(z));
                String str = this.f2463b;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2464c);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onscrolled" + this.f2464c, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$u */
    public class C1096u extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ View f2466a;

        /* renamed from: b */
        final /* synthetic */ String f2467b;

        /* renamed from: c */
        final /* synthetic */ String f2468c;

        C1096u(View view, String str, String str2) {
            this.f2466a = view;
            this.f2467b = str;
            this.f2468c = str2;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View findChildViewUnder = ((RecyclerView) this.f2466a).findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder != null && this.f2467b != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2466a.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2466a);
                aid_YuCodeX2.dim("st_pN", Integer.valueOf(((RecyclerView) this.f2466a).getChildLayoutPosition(findChildViewUnder)));
                aid_YuCodeX2.dim("st_vW2", findChildViewUnder);
                String str = this.f2468c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2467b);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "clickitem" + this.f2467b, aid_YuCodeX2);
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            View findChildViewUnder = ((RecyclerView) this.f2466a).findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder == null) {
                return false;
            }
            if (this.f2467b == null) {
                return true;
            }
            Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
            Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
            aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2466a.getId()));
            aid_YuCodeX2.dim("st_vW", this.f2466a);
            aid_YuCodeX2.dim("st_pN", Integer.valueOf(((RecyclerView) this.f2466a).getChildLayoutPosition(findChildViewUnder)));
            aid_YuCodeX2.dim("st_vW2", findChildViewUnder);
            String str = this.f2468c;
            if (str == null) {
                aid_YuCodeX2.YuGoX(this.f2467b);
                return true;
            }
            Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
            aid_YuCodeX3.goUIEventset(str, "clickitem" + this.f2467b, aid_YuCodeX2);
            return true;
        }
    }

    /* renamed from: com.iapp.app.Aid_YuCodeX$v */
    class HandlerC1097v extends Handler {
        HandlerC1097v(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_YuCodeX.this.f2358a, message.obj.toString(), 1).show();
            } else if (i == 2) {
                Aid_YuCodeX.this.YuGo(message.obj.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$w */
    public class C1098w implements RecyclerView.OnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f2471a;

        C1098w(Aid_YuCodeX aid_YuCodeX, GestureDetector gestureDetector) {
            this.f2471a = gestureDetector;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f2471a.onTouchEvent(motionEvent);
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
    /* renamed from: com.iapp.app.Aid_YuCodeX$x */
    public class C1099x implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f2472a;

        /* renamed from: b */
        final /* synthetic */ View f2473b;

        /* renamed from: c */
        final /* synthetic */ String f2474c;

        /* renamed from: d */
        final /* synthetic */ String f2475d;

        /* renamed from: e */
        final /* synthetic */ String f2476e;

        C1099x(String str, View view, String str2, String str3, String str4) {
            this.f2472a = str;
            this.f2473b = view;
            this.f2474c = str2;
            this.f2475d = str3;
            this.f2476e = str4;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f2476e != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2473b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2473b);
                aid_YuCodeX2.dim("st_sE", Integer.valueOf(i));
                String str = this.f2474c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2476e);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onpagescrollstatechanged" + this.f2476e, aid_YuCodeX2);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f2475d != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2473b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2473b);
                aid_YuCodeX2.dim("st_pN", Integer.valueOf(i));
                aid_YuCodeX2.dim("st_pT", Float.valueOf(f));
                aid_YuCodeX2.dim("st_pS", Integer.valueOf(i2));
                String str = this.f2474c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2475d);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onpagescrolled" + this.f2475d, aid_YuCodeX2);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f2472a != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2473b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2473b);
                aid_YuCodeX2.dim("st_pN", Integer.valueOf(i));
                String str = this.f2474c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2472a);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onpageselected" + this.f2472a, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$y */
    public class C1100y implements SwipeRefreshLayout.OnRefreshListener {

        /* renamed from: a */
        final /* synthetic */ String f2478a;

        /* renamed from: b */
        final /* synthetic */ View f2479b;

        /* renamed from: c */
        final /* synthetic */ String f2480c;

        C1100y(String str, View view, String str2) {
            this.f2478a = str;
            this.f2479b = view;
            this.f2480c = str2;
        }

        @Override // android.support.p009v4.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            if (this.f2478a != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2479b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2479b);
                String str = this.f2480c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2478a);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "onrefresh" + this.f2478a, aid_YuCodeX2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_YuCodeX$z */
    public class C1101z implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f2482a;

        /* renamed from: b */
        final /* synthetic */ View f2483b;

        /* renamed from: c */
        final /* synthetic */ String f2484c;

        C1101z(String str, View view, String str2) {
            this.f2482a = str;
            this.f2483b = view;
            this.f2484c = str2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f2482a != null) {
                Aid_YuCodeX aid_YuCodeX = Aid_YuCodeX.this;
                Aid_YuCodeX aid_YuCodeX2 = new Aid_YuCodeX(aid_YuCodeX.f2358a, aid_YuCodeX.f2361d);
                aid_YuCodeX2.dim("st_vId", Integer.valueOf(this.f2483b.getId()));
                aid_YuCodeX2.dim("st_vW", this.f2483b);
                aid_YuCodeX2.dim("st_iC", Boolean.valueOf(z));
                String str = this.f2484c;
                if (str == null) {
                    aid_YuCodeX2.YuGoX(this.f2482a);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX3 = Aid_YuCodeX.this;
                aid_YuCodeX3.goUIEventset(str, "oncheckedchanged" + this.f2482a, aid_YuCodeX2);
            }
        }
    }

    public Aid_YuCodeX(Activity activity) {
        this.f2361d = activity;
        this.f2358a = activity;
        this.f2364h = new HandlerC1080k(activity.getMainLooper());
    }

    public Aid_YuCodeX(Context context, Activity activity) {
        this.f2361d = activity;
        this.f2358a = context;
        this.f2364h = new HandlerC1097v(context.getMainLooper());
    }

    /* renamed from: A */
    private int[] m2973A() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: B */
    private String[] m2974B() {
        return new String[]{Build.MODEL, Build.BRAND, String.valueOf(Build.VERSION.SDK_INT)};
    }

    /* renamed from: D */
    private int m2975D() {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return this.f2358a.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: E */
    private int m2976E() {
        int identifier = this.f2358a.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f2358a.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: F */
    private Object m2977F(String str) {
        String trim = str.trim();
        if (trim.equals("null")) {
            return null;
        }
        if (trim.equals("true")) {
            return Boolean.TRUE;
        }
        if (trim.equals("false")) {
            return Boolean.FALSE;
        }
        if (trim.equals("activity")) {
            return this.f2358a;
        }
        boolean z = true;
        if (!trim.contains("[\n龘`/r}")) {
            return (!trim.startsWith("\"") || !trim.endsWith("\"")) ? m2985O(trim) ? trim.contains(".") ? trim.startsWith("00") ? trim : Double.valueOf(Double.parseDouble(trim)) : trim.startsWith("00") ? trim : trim.length() < 10 ? Integer.valueOf(Integer.parseInt(trim)) : Long.valueOf(Long.parseLong(trim)) : m3017r(trim) : C0864v.m2183V(C0864v.m2201a(trim.substring(1, trim.length() - 1)));
        }
        String[] a0 = m2998a0(trim, "[\n龘`/r}");
        int length = a0.length;
        Object[] objArr = new Object[length];
        double d = 0.0d;
        for (int i = 0; i < length; i++) {
            objArr[i] = m2977F(a0[i].trim());
            if (z) {
                if (objArr[i] instanceof Number) {
                    d += Double.parseDouble(objArr[i].toString());
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            return Double.valueOf(d);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(objArr[i2]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: G */
    private String m2978G(String str) {
        return String.valueOf(m2977F(str));
    }

    /* renamed from: H */
    private String m2979H(String str) {
        Object F = m2977F(str);
        if (F == null) {
            return null;
        }
        return F.toString();
    }

    /* renamed from: J */
    private String m2980J(String str, String str2, String str3) {
        int indexOf = str.indexOf("type=\"" + str2 + "\">");
        if (indexOf == -1) {
            return str + "<eventItme type=\"" + str2 + "\">" + str3.replace("<", "&lt;").replace(">", "&gt;") + "</eventItme>";
        }
        int indexOf2 = str.indexOf("</eventItme>");
        if (indexOf2 == -1) {
            return str;
        }
        return str.substring(0, indexOf) + "type=\"" + str2 + "\">" + str3.replace("<", "&lt;").replace(">", "&gt;") + str.substring(indexOf2);
    }

    /* renamed from: K */
    private GradientDrawable.Orientation m2981K(String str) {
        return str.equals("topbottom") ? GradientDrawable.Orientation.TOP_BOTTOM : str.equals("trbl") ? GradientDrawable.Orientation.TR_BL : str.equals("rightleft") ? GradientDrawable.Orientation.RIGHT_LEFT : str.equals("brtl") ? GradientDrawable.Orientation.BR_TL : str.equals("bottomtop") ? GradientDrawable.Orientation.BOTTOM_TOP : str.equals("bltr") ? GradientDrawable.Orientation.BL_TR : str.equals("leftright") ? GradientDrawable.Orientation.LEFT_RIGHT : str.equals("tlbr") ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TOP_BOTTOM;
    }

    /* renamed from: L */
    private String m2982L(String str) {
        String c;
        String c2;
        Intent launchIntentForPackage = this.f2358a.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null || (c = C0860r.m2044c(launchIntentForPackage.toString(), "cmp=", " ")) == null || (c2 = C0860r.m2044c(c, "/", null)) == null) {
            return "";
        }
        if (!c2.startsWith(".")) {
            return c2;
        }
        return str + c2;
    }

    /* renamed from: M */
    private int m2983M(String str) {
        if (str.equals("-1")) {
            return -1;
        }
        if (str.equals("-2")) {
            return -2;
        }
        return str.endsWith("dp") ? C0860r.m2053l(this.f2358a, Float.parseFloat(str.substring(0, str.length() - 2))) : m3001c(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: N */
    private boolean m2984N(String str, Aid_YuCodeX aid_YuCodeX, String str2, String str3) {
        String c = C0860r.m2044c(str3, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        boolean z = false;
        if (c == null) {
            return false;
        }
        String trim = c.trim();
        if (trim.startsWith("[true]")) {
            z = true;
            trim = trim.substring(6);
        }
        if (str == null) {
            aid_YuCodeX.YuGoX(trim);
        } else {
            mian.m4024c(str, str2 + trim, aid_YuCodeX);
        }
        return z;
    }

    /* renamed from: O */
    private boolean m2985O(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("[+-]?[0-9]+[0-9]*(\\.[0-9]+)?");
    }

    /* renamed from: P */
    private void m2986P(File file) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        C0851m.m1975a(this.f2358a, intent, file, C0860r.m2057p(file));
        this.f2358a.startActivity(intent);
    }

    /* renamed from: Q */
    private static String[] m2987Q(String str, char c, char c2) {
        return C0864v.m2146M1(str, c, c2);
    }

    /* renamed from: R */
    private static int m2988R(String str, char c) {
        return C0864v.m2151N1(str, c);
    }

    /* renamed from: S */
    private static int m2989S(String str, char c, char c2) {
        return C0864v.m2156O1(str, c, c2);
    }

    /* renamed from: T */
    private static String[] m2990T(String str) {
        return C0864v.m2161P1(str);
    }

    @TargetApi(11)
    /* renamed from: U */
    private void m2991U(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: V */
    private void m2992V(WebView webView, String str) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(this.f2358a.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(this.f2358a.getApplicationContext().getDir("database", 0).getPath());
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
            new C1325l(webView, this.f2361d);
        } else {
            webView.setDownloadListener(new C1063b0(this));
        }
        new C1443b().mo12153n(webView, this.f2358a, this.f2361d);
        m2991U(webView);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: W */
    private void m2993W(WebView webView, String str, String str2) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(this.f2358a.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(this.f2358a.getApplicationContext().getDir("database", 0).getPath());
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
            new C1325l(webView, this.f2361d, str2);
        } else {
            webView.setDownloadListener(new C1065c0(this));
        }
        new C1443b().mo12154o(webView, this.f2358a, this.f2361d, this, str2);
        m2991U(webView);
    }

    /* renamed from: X */
    private void m2994X(String str) {
        C0839h.m1891G(this.f2358a, str);
    }

    /* renamed from: Y */
    private boolean m2995Y(String str, String str2) {
        int indexOf = str.indexOf(10);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        return str.startsWith(str2) && str.endsWith(")");
    }

    public static String YuLaGf(String str) {
        String str2 = "";
        if (str.contains("\r")) {
            str = str.replace("\r", str2);
        }
        boolean z = false;
        for (String str3 : C0861s.m2069b(str, '\n')) {
            String trim = str3.trim();
            if (trim.length() != 0) {
                if (z && trim.startsWith("<")) {
                    z = false;
                } else if (trim.startsWith(".") || trim.startsWith("//") || trim.startsWith("/.") || trim.startsWith("./") || z) {
                    if (trim.startsWith("/.")) {
                        z = true;
                    }
                    if (trim.startsWith("./")) {
                        z = false;
                    }
                }
                if (!trim.equals("}")) {
                    if (trim.startsWith("}")) {
                        trim = "}\n" + trim.substring(1).trim();
                    }
                    if (trim.endsWith("}")) {
                        trim = trim.substring(0, trim.length() - 1).trim() + "\n}";
                    }
                }
                if (!trim.equals("{")) {
                    if (trim.startsWith("{")) {
                        trim = "{\n" + trim.substring(1).trim();
                    }
                    if (trim.endsWith("{")) {
                        trim = trim.substring(0, trim.length() - 1).trim() + "\n{";
                    }
                }
                str2 = str2 + trim + "\n";
            }
        }
        return str2;
    }

    /* renamed from: Z */
    private String[] m2996Z(String str, char c) {
        return C0861s.m2069b(str, c);
    }

    /* renamed from: a */
    private boolean m2997a(String str) {
        int S = m2989S(str, '=', '=');
        if (S != -1) {
            Object F = m2977F(str.substring(0, S));
            Object F2 = m2977F(str.substring(S + 2));
            if (F == null && F2 == null) {
                return true;
            }
            if (!(F == null || F2 == null)) {
                if ((F instanceof Double) || (F2 instanceof Double)) {
                    try {
                        if (Double.parseDouble(String.valueOf(F)) == Double.parseDouble(String.valueOf(F2))) {
                            return true;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                if (String.valueOf(F).equals(String.valueOf(F2))) {
                    return true;
                }
            }
            return false;
        }
        int S2 = m2989S(str, '!', '=');
        if (S2 != -1) {
            Object F3 = m2977F(str.substring(0, S2));
            Object F4 = m2977F(str.substring(S2 + 2));
            if (F3 == null && F4 == null) {
                return false;
            }
            return F3 == null || F4 == null || !String.valueOf(F3).equals(String.valueOf(F4));
        }
        int S3 = m2989S(str, '>', '=');
        if (S3 != -1) {
            Object F5 = m2977F(str.substring(0, S3));
            Object F6 = m2977F(str.substring(S3 + 2));
            return (F5 == null || F6 == null || Double.parseDouble(F5.toString()) < Double.parseDouble(F6.toString())) ? false : true;
        }
        int S4 = m2989S(str, '<', '=');
        if (S4 != -1) {
            Object F7 = m2977F(str.substring(0, S4));
            Object F8 = m2977F(str.substring(S4 + 2));
            return (F7 == null || F8 == null || Double.parseDouble(F7.toString()) > Double.parseDouble(F8.toString())) ? false : true;
        }
        int R = m2988R(str, '>');
        if (R != -1) {
            Object F9 = m2977F(str.substring(0, R));
            Object F10 = m2977F(str.substring(R + 1));
            return (F9 == null || F10 == null || Double.parseDouble(F9.toString()) <= Double.parseDouble(F10.toString())) ? false : true;
        }
        int R2 = m2988R(str, '<');
        if (R2 != -1) {
            String G = m2978G(str.substring(0, R2));
            String G2 = m2978G(str.substring(R2 + 1));
            return (G == null || G2 == null || Double.parseDouble(G.toString()) >= Double.parseDouble(G2.toString())) ? false : true;
        }
        int S5 = m2989S(str, '?', '*');
        if (S5 != -1) {
            String G3 = m2978G(str.substring(0, S5));
            String G4 = m2978G(str.substring(S5 + 2));
            return (G3 == null || G4 == null || !G3.startsWith(G4)) ? false : true;
        }
        int S6 = m2989S(str, '*', '?');
        if (S6 != -1) {
            String G5 = m2978G(str.substring(0, S6));
            String G6 = m2978G(str.substring(S6 + 2));
            return (G5 == null || G6 == null || !G5.endsWith(G6)) ? false : true;
        }
        int R3 = m2988R(str, '?');
        if (R3 != -1) {
            String G7 = m2978G(str.substring(0, R3));
            String G8 = m2978G(str.substring(R3 + 1));
            return (G7 == null || G8 == null || !G7.contains(G8)) ? false : true;
        }
        Object F11 = m2977F(str);
        return F11 != null && F11.equals(Boolean.TRUE);
    }

    /* renamed from: a0 */
    private String[] m2998a0(String str, String str2) {
        return C0861s.m2071d(str, str2);
    }

    /* renamed from: b */
    private boolean m2999b(String str) {
        boolean z = false;
        for (String str2 : m2987Q(str, '|', '|')) {
            boolean z2 = false;
            for (String str3 : m2987Q(str2, '&', '&')) {
                String trim = str3.trim();
                z2 = trim.startsWith("!") ? !m2997a(trim.substring(1)) : m2997a(trim);
                if (!z2) {
                    break;
                }
            }
            z = z2;
            if (z) {
                break;
            }
        }
        return z;
    }

    /* renamed from: b0 */
    private void m3000b0(String str) {
        C0864v.m2157O2(str);
    }

    /* renamed from: c */
    private int m3001c(String str) {
        return (int) Double.parseDouble(str);
    }

    /* renamed from: c0 */
    private String m3002c0(String str) {
        return C0864v.m2201a(str.substring(str.indexOf(40) + 1, str.lastIndexOf(41)));
    }

    /* renamed from: d0 */
    private String m3004d0(String str) {
        int indexOf = str.indexOf(10);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return C0864v.m2201a(str.substring(str.indexOf(40) + 1, str.lastIndexOf(41, indexOf)));
    }

    public static void degclear() {
        C0864v.f1800j.clear();
        f2355k.clear();
        f2356l = null;
        f2353i.clear();
        f2354j = 0;
    }

    /* renamed from: k */
    private void m3011k(View view, String str, String str2) {
        if (str.contains("<eventItme type=\"clicki\">")) {
            view.setOnClickListener(new View$OnClickListenerC1072g(str2));
        }
        if (str.contains("<eventItme type=\"touchmonitor\">")) {
            view.setOnTouchListener(new View$OnTouchListenerC1074h(str2));
        }
        if (str.contains("<eventItme type=\"press\">")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1076i(str2));
        }
        if (str.contains("<eventItme type=\"keyboard\">")) {
            view.setOnKeyListener(new View$OnKeyListenerC1078j(str2));
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1082l(str2));
        }
        if (view instanceof TextView) {
            if (str.contains("<eventItme type=\"editormonitor\">")) {
                ((TextView) view).setOnEditorActionListener(new C1084m(str2));
            }
            if (str.contains("<eventItme type=\"ontextchanged\">") || str.contains("<eventItme type=\"beforetextchanged\">") || str.contains("<eventItme type=\"aftertextchanged\">")) {
                TextView textView = (TextView) view;
                Activity activity = this.f2361d;
                if (str2 != null) {
                    new C1352q(textView, activity, str2);
                }
            }
        }
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            if (str2 == null) {
                m2992V(webView, str);
            } else {
                m2993W(webView, str, str2);
            }
        }
        if (str.contains("<eventItme type=\"focuschange\">")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1087n(str2));
        }
        if ((view instanceof AbsListView) && (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscroll\">"))) {
            ((AbsListView) view).setOnScrollListener(new C1090o(str2));
        }
        if (view instanceof AdapterView) {
            if (str.contains("<eventItme type=\"clickitem\">")) {
                ((AdapterView) view).setOnItemClickListener(new C1091p(str2));
            }
            if (str.contains("<eventItme type=\"onitemselected\">") || str.contains("<eventItme type=\"onnothingselected\">")) {
                ((AdapterView) view).setOnItemSelectedListener(new C1092q(str2));
            }
        }
        if ((view instanceof ViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ViewPager viewPager = (ViewPager) view;
            Activity activity2 = this.f2361d;
            if (str2 != null) {
                new C1343o(viewPager, activity2, str2);
            }
        }
        if ((view instanceof DrawerLayout) && (str.contains("<eventItme type=\"ondrawerclosed\">") || str.contains("<eventItme type=\"ondraweropened\">") || str.contains("<eventItme type=\"onoptionsitemselected\">"))) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            Activity activity3 = this.f2361d;
            if (str2 != null) {
                new C1334m(drawerLayout, activity3, str2);
            }
        }
        if ((view instanceof SeekBar) && (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">"))) {
            ((SeekBar) view).setOnSeekBarChangeListener(new C1093r(str2));
        }
        m3012l(view, str, str2);
    }

    /* renamed from: l */
    private void m3012l(View view, String str, String str2) {
        String c;
        if ((view instanceof TabLayout) && (str.contains("<eventItme type=\"ontabselected\">") || str.contains("<eventItme type=\"ontabunselected\">") || str.contains("<eventItme type=\"ontabreselected\">"))) {
            ((TabLayout) view).addOnTabSelectedListener(new C1094s(C0860r.m2044c(str, "<eventItme type=\"ontabselected\">", "</eventItme>"), view, str2, C0860r.m2044c(str, "<eventItme type=\"ontabunselected\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"ontabreselected\">", "</eventItme>")));
        }
        if (view instanceof RecyclerView) {
            if (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscrolled\">")) {
                ((RecyclerView) view).addOnScrollListener(new C1095t(C0860r.m2044c(str, "<eventItme type=\"onscrollstatechanged\">", "</eventItme>"), str2, C0860r.m2044c(str, "<eventItme type=\"onscrolled\">", "</eventItme>")));
            }
            if (str.contains("<eventItme type=\"clickitem\">") && (c = C0860r.m2044c(str, "<eventItme type=\"clickitem\">", "</eventItme>")) != null) {
                ((RecyclerView) view).addOnItemTouchListener(new C1098w(this, new GestureDetector(this.f2358a, new C1096u(view, c, str2))));
            }
        }
        if ((view instanceof VerticalViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ((VerticalViewPager) view).setOnPageChangeListener(new C1099x(C0860r.m2044c(str, "<eventItme type=\"onpageselected\">", "</eventItme>"), view, str2, C0860r.m2044c(str, "<eventItme type=\"onpagescrolled\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"onpagescrollstatechanged\">", "</eventItme>")));
        }
        if ((view instanceof SwipeRefreshLayout) && str.contains("<eventItme type=\"onrefresh\">")) {
            ((SwipeRefreshLayout) view).setOnRefreshListener(new C1100y(C0860r.m2044c(str, "<eventItme type=\"onrefresh\">", "</eventItme>"), view, str2));
        }
        if ((view instanceof CompoundButton) && str.contains("<eventItme type=\"oncheckedchanged\">")) {
            ((CompoundButton) view).setOnCheckedChangeListener(new C1101z(C0860r.m2044c(str, "<eventItme type=\"oncheckedchanged\">", "</eventItme>"), view, str2));
        }
        if ((view instanceof AppBarLayout) && str.contains("<eventItme type=\"onoffsetchanged\">")) {
            ((AppBarLayout) view).addOnOffsetChangedListener(new C1061a0(C0860r.m2044c(str, "<eventItme type=\"onoffsetchanged\">", "</eventItme>"), str2));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private synchronized int m3013m(String str) {
        Object obj = f2353i.get(str);
        if (obj != null) {
            return Integer.parseInt(obj.toString());
        }
        int i = f2354j + 10000;
        f2354j = i;
        f2353i.put(str, Integer.valueOf(i));
        return f2354j;
    }

    /* renamed from: o */
    private int m3014o(String str) {
        if (str.startsWith("s ")) {
            return dims(str, 0) ? 0 : -1;
        }
        if (str.startsWith("ss ")) {
            return dims(str, 1) ? 0 : -1;
        }
        if (str.startsWith("sss ")) {
            return dims(str, 2) ? 0 : -1;
        }
        if (m2995Y(str, C0864v.f1810t[0])) {
            return f2357v != f2352f ? mo10154f(str) : if_y2(str);
        }
        if (m2995Y(str, C0864v.f1810t[1])) {
            return for_y(str);
        }
        if (m2995Y(str, C0864v.f1810t[2])) {
            return mo10309w(str);
        }
        if (m2995Y(str, C0864v.f1810t[3])) {
            mo10266t(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[4])) {
            ssj(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[5])) {
            syso(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[6])) {
            mo10275tw(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[7])) {
            mo10156fd(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[8])) {
            mo10158fe(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[9])) {
            mo10165fs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[10])) {
            mo10164fr(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[11])) {
            mo10155fc(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[12])) {
            mo10173fw(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[13])) {
            mo10161fl(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[14])) {
            mo10166ft(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[15])) {
            fdir(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[16])) {
            fuz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[17])) {
            fuzs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[18])) {
            mo10162fo(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[19])) {
            mo10160fj(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[20])) {
            mo10221s(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[21])) {
            mo10222s2(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[22])) {
            mo10244sn(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[23])) {
            sjia(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[24])) {
            sjian(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[25])) {
            scheng(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[26])) {
            schu(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[27])) {
            syu(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[28])) {
            mo10252ss(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[29])) {
            mo10250sr(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[30])) {
            mo10236sj(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[31])) {
            mo10240sl(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[32])) {
            siof(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[33])) {
            slof(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[34])) {
            ssg(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[35])) {
            slg(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[36])) {
            strim(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[37])) {
            slower(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[38])) {
            supper(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[39])) {
            stop(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[40])) {
            sran(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[41])) {
            nsz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[42])) {
            sgsz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[43])) {
            sssz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[44])) {
            sgszl(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[45])) {
            mo10194hs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[46])) {
            mo10185hd(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[47])) {
            mo10197hw(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[48])) {
            hws(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[49])) {
            mo10284ug(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[50])) {
            mo10296us(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[51])) {
            uigo(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[52])) {
            utw(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[53])) {
            endutw();
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[54])) {
            this.f2361d.finish();
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[55])) {
            ends();
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[56])) {
            bfm(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[57])) {
            bfms(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[58])) {
            ula(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[59])) {
            uls(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[60])) {
            ulas(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[61])) {
            ulag(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[62])) {
            usms(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[63])) {
            ucall(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[64])) {
            time(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[65])) {
            mo10159fi(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[66])) {
            stobm(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[67])) {
            sutf8to(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[68])) {
            uycl(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[69])) {
            ushsp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[70])) {
            bfv(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[71])) {
            bfvs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[72])) {
            bfvss(str);
            return 0;
        } else if (str.startsWith("fn ")) {
            function(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[73])) {
            ftz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[74])) {
            uapp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[75])) {
            uapplist(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[76])) {
            uapplistgo(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[77])) {
            uninapp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[78])) {
            huf(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[79])) {
            nvw(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[80])) {
            uall(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[81])) {
            urvw(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[82])) {
            sbp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[83])) {
            sdeg(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[84])) {
            bfs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[85])) {
            tot(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[86])) {
            tzz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[87])) {
            tsf(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[88])) {
            tfz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[89])) {
            sxb(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[90])) {
            shb(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[91])) {
            tcc(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[92])) {
            usjxm(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[93])) {
            addv(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[94])) {
            gvs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[95])) {
            aslist(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[96])) {
            sslist(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[97])) {
            gslist(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[98])) {
            gslistl(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[99])) {
            dslist(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[100])) {
            gslistsz(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[101])) {
            gslistis(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[102])) {
            gslistiof(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[103])) {
            gslistlof(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[104])) {
            nuibs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[105])) {
            ngde(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[106])) {
            sit(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[107])) {
            uit(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[108])) {
            git(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[109])) {
            uqr(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[110])) {
            zdp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[111])) {
            zpd(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[112])) {
            zps(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[113])) {
            zsp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[114])) {
            zsp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[115])) {
            lan(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[116])) {
            sjxx(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[117])) {
            simsi(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[118])) {
            simei(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[119])) {
            endkeyboard();
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[120])) {
            hdfl(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[121])) {
            hdfla(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[122])) {
            hdd(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[123])) {
            hdda(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[124])) {
            hddgl(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[125])) {
            hddg(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[126])) {
            hdds(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[127])) {
            hdduigo(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[128])) {
            swh(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[129])) {
            ufnsui(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[130])) {
            mo10227se(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[131])) {
            usg(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[132])) {
            uzd(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[133])) {
            usxq(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[134])) {
            usxh(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[135])) {
            usx(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[136])) {
            ujp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[137])) {
            bly(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[138])) {
            sqlite(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[139])) {
            sql(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[140])) {
            sqlsele(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[141])) {
            dha(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[142])) {
            dhs(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[143])) {
            dht(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[144])) {
            dhr(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[145])) {
            dhset(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[146])) {
            dhas(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[147])) {
            dhast(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[148])) {
            mo10133dh(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[149])) {
            dhon(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[150])) {
            dhb(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[151])) {
            hsas(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[152])) {
            has(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[153])) {
            uxf(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[154])) {
            tts(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[155])) {
            blp(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[156])) {
            otob(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[157])) {
            btoo(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[158])) {
            sot(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[159])) {
            sota(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[160])) {
            loadso(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[161])) {
            loadjar(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[162])) {
            cls(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[163])) {
            javacb(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[164])) {
            javanew(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[165])) {
            java(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[166])) {
            javax(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[167])) {
            javags(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[168])) {
            javass(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[169])) {
            res(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[170])) {
            clssm(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[171])) {
            mo10312zj(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[172])) {
            call(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[173])) {
            json(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[174])) {
            utb(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[175])) {
            tws(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[176])) {
            uht(str);
            return 0;
        } else if (m2995Y(str, C0864v.f1810t[177])) {
            cast(str);
            return 0;
        } else if (!m2995Y(str, C0864v.f1810t[178])) {
            return -1;
        } else {
            yul(str);
            return 0;
        }
    }

    /* renamed from: p */
    private int m3015p(String str) {
        try {
            return m3014o(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: q */
    private void m3016q(String str, Object obj, int i) {
        HashMap<String, Object> hashMap;
        if (!str.equals("null")) {
            if (i == 0) {
                hashMap = this.f2359b;
            } else if (i == 1) {
                hashMap = C0864v.f1801k;
            } else if (i == 2) {
                hashMap = C0864v.f1800j;
            } else {
                return;
            }
            hashMap.put(str, obj);
        }
    }

    /* renamed from: r */
    private Object m3017r(String str) {
        HashMap<String, Object> hashMap;
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String trim = str.substring(0, indexOf).trim();
            str = str.substring(indexOf + 1).trim();
            if (trim.equals("ss")) {
                hashMap = C0864v.f1801k;
            } else if (trim.equals("sss")) {
                hashMap = C0864v.f1800j;
            }
            return hashMap.get(str);
        }
        hashMap = this.f2359b;
        return hashMap.get(str);
    }

    /* renamed from: u */
    private String m3018u(String str) {
        return str.substring(str.indexOf(123, !str.startsWith("{") ? str.indexOf(10) : 0) + 1, str.lastIndexOf(125));
    }

    /* renamed from: v */
    private View m3019v(View view, Object obj, String str) {
        String trim = str.trim();
        if ((obj instanceof Integer) && (trim.startsWith("ss.") || trim.startsWith("sss."))) {
            return this.f2361d.findViewById(Integer.parseInt(obj.toString()));
        }
        int indexOf = trim.indexOf(46);
        if (indexOf == -1 || trim.indexOf(34) != -1) {
            String valueOf = String.valueOf(obj);
            int indexOf2 = valueOf.indexOf(46);
            if (indexOf2 == -1) {
                return view.findViewById(Integer.parseInt(valueOf));
            }
            String substring = valueOf.substring(0, indexOf2);
            String substring2 = valueOf.substring(indexOf2 + 1);
            Object obj2 = f2353i.get(substring);
            if (obj2 == null) {
                return null;
            }
            return view.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2353i.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return view.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: w */
    private View m3020w(Object obj, String str) {
        String trim = str.trim();
        if ((obj instanceof Integer) && (trim.startsWith("ss.") || trim.startsWith("sss."))) {
            return this.f2361d.findViewById(Integer.parseInt(obj.toString()));
        }
        int indexOf = trim.indexOf(46);
        if (indexOf == -1 || trim.indexOf(34) != -1) {
            String valueOf = String.valueOf(obj);
            int indexOf2 = valueOf.indexOf(46);
            if (indexOf2 == -1) {
                return this.f2361d.findViewById(Integer.parseInt(valueOf));
            }
            String substring = valueOf.substring(0, indexOf2);
            String substring2 = valueOf.substring(indexOf2 + 1);
            Object obj2 = f2353i.get(substring);
            if (obj2 == null) {
                return null;
            }
            return this.f2361d.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2353i.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return this.f2361d.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: x */
    private int m3021x() {
        try {
            Display defaultDisplay = this.f2361d.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return displayMetrics.heightPixels - displayMetrics2.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: y */
    private String[] m3022y() {
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

    /* renamed from: z */
    private int[] m3023z() {
        return new int[]{this.f2361d.getWindowManager().getDefaultDisplay().getWidth(), this.f2361d.getWindowManager().getDefaultDisplay().getHeight()};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public String mo10113C(Object obj) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public String mo10114I(String str) {
        return C0839h.m1906o(this.f2358a, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0153, code lost:
        if (r2[r11].startsWith("else") != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0176, code lost:
        if (r2[r12].equals("{") != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r10.length() == 0) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int YuGo(java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.YuGo(java.lang.String):int");
    }

    public void YuGoX(String str) {
        if (str != null && str.trim().length() != 0) {
            YuGo(str.replace("&lt;", "<").replace("&gt;", ">"));
        }
    }

    public void addv(String str) {
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        View w = F instanceof View ? (View) F : m3020w(F, T[0]);
        int length = T.length;
        if (length == 3) {
            if ((w instanceof ViewPager) || (w instanceof VerticalViewPager)) {
                ArrayList arrayList = new ArrayList();
                String[] Z = m2996Z(m2978G(T[1]), '|');
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                for (String str2 : Z) {
                    String trim = str2.trim();
                    if (trim.endsWith(".iyu")) {
                        LinearLayout linearLayout = new LinearLayout(this.f2358a);
                        linearLayout.setLayoutParams(layoutParams);
                        linearLayout.setOrientation(1);
                        openRestoreinterface(trim, linearLayout, m3013m(trim.substring(0, trim.length() - 4)), null);
                        arrayList.add(linearLayout);
                    }
                }
                new C1437s(w, arrayList);
                dim(T[2].trim(), arrayList);
            }
        } else if (length == 2) {
            if ((w instanceof DrawerLayout) || (w instanceof ViewGroup)) {
                String[] Z2 = m2996Z(m2978G(T[1]), '|');
                for (String str3 : Z2) {
                    String trim2 = str3.trim();
                    if (trim2.endsWith(".iyu")) {
                        openRestoreinterface(str3.trim(), (ViewGroup) w, m3013m(trim2.substring(0, trim2.length() - 4)), null);
                    }
                }
            }
        }
    }

    public void aslist(String str) {
        ArrayList arrayList;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        if (F instanceof ArrayList) {
            arrayList = (ArrayList) F;
        } else {
            arrayList = new ArrayList();
            dim(T[0].trim(), arrayList);
        }
        if (T.length == 2) {
            arrayList.add(m2977F(T[1]));
        } else if (T.length == 3) {
            arrayList.add(m3001c(m2978G(T[2])), m2977F(T[1]));
        }
    }

    public void bfm(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        String G = m2978G(T[0]);
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (C0839h.m1895d(this.f2358a, mediaPlayer, G) && length > 1) {
            dim(T[1].trim(), mediaPlayer);
        }
    }

    public void bfms(String str) {
        String str2;
        Object obj;
        int currentPosition;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        if (F instanceof MediaPlayer) {
            MediaPlayer mediaPlayer = (MediaPlayer) F;
            String G = m2978G(T[1]);
            if (G == null) {
                return;
            }
            if (G.equals("st")) {
                try {
                    mediaPlayer.start();
                } catch (IllegalStateException unused) {
                }
            } else if (G.equals("pe")) {
                mediaPlayer.pause();
            } else if (G.equals("sp")) {
                mediaPlayer.stop();
            } else if (G.equals("re")) {
                mediaPlayer.release();
            } else if (G.equals("ip")) {
                try {
                    dim(T[2].trim(), Boolean.valueOf(mediaPlayer.isPlaying()));
                } catch (IllegalStateException unused2) {
                    str2 = T[2].trim();
                    obj = Boolean.FALSE;
                }
            } else {
                if (G.equals("dn")) {
                    str2 = T[2].trim();
                    currentPosition = mediaPlayer.getDuration();
                } else if (G.equals("cn")) {
                    str2 = T[2].trim();
                    currentPosition = mediaPlayer.getCurrentPosition();
                } else if (G.equals("seekto")) {
                    mediaPlayer.seekTo(m3001c(m2978G(T[2])));
                    return;
                } else if (G.equals("volume")) {
                    mediaPlayer.setVolume((float) m3001c(m2978G(T[2])), (float) m3001c(m2978G(T[3])));
                    return;
                } else if (G.equals("sl")) {
                    mediaPlayer.setLooping(m2977F(T[2]).equals(Boolean.TRUE));
                    return;
                } else {
                    try {
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                    } catch (Exception unused3) {
                    }
                    C0839h.m1895d(this.f2358a, mediaPlayer, G);
                    return;
                }
                obj = Integer.valueOf(currentPosition);
                dim(str2, obj);
            }
        }
    }

    public void bfs(String str) {
        Bitmap bitmap;
        int c;
        String str2;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        if (F instanceof Bitmap) {
            int length = T.length;
            if (length == 2) {
                bitmap = (Bitmap) F;
                c = 100;
                str2 = T[1];
            } else if (length == 3) {
                bitmap = (Bitmap) F;
                c = m3001c(m2978G(T[1]));
                str2 = T[2];
            } else {
                return;
            }
            C0849k.m1968h(bitmap, c, mo10114I(m2978G(str2)));
        }
    }

    public void bfv(String str) {
        Intent intent;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            intent = new Intent(this.f2358a, Videoview.class);
            Bundle bundle = new Bundle();
            bundle.putString("video", m2978G(T[0]));
            bundle.putBoolean("sfhp", m2977F(T[1]).equals(Boolean.TRUE));
            intent.putExtras(bundle);
        } else if (length == 1) {
            intent = new Intent(this.f2358a, Videoview.class);
            Bundle bundle2 = new Bundle();
            bundle2.putString("video", m2978G(T[0]));
            bundle2.putBoolean("sfhp", false);
            intent.putExtras(bundle2);
        } else {
            return;
        }
        this.f2358a.startActivity(intent);
    }

    public void bfvs(String str) {
        Uri c;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        VideoView videoView = F instanceof VideoView ? (VideoView) F : (VideoView) m3020w(F, T[0]);
        if (T.length == 2) {
            Object F2 = m2977F(T[1]);
            if (F2 instanceof Uri) {
                c = (Uri) F2;
            } else {
                String valueOf = String.valueOf(F2);
                if (C0860r.m2063v(valueOf.toLowerCase())) {
                    c = C0851m.m1977c(this.f2358a, valueOf);
                } else {
                    videoView.setVideoPath(mo10114I(valueOf));
                    return;
                }
            }
            videoView.setVideoURI(c);
        }
    }

    public void bfvss(String str) {
        String trim;
        int currentPosition;
        Boolean bool;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        VideoView videoView = F instanceof VideoView ? (VideoView) F : (VideoView) m3020w(F, T[0]);
        int length = T.length;
        if (length == 2) {
            String G = m2978G(T[1]);
            if (G.equals("st")) {
                videoView.requestFocus();
                videoView.start();
            } else if (G.equals("pe")) {
                videoView.pause();
            } else if (G.equals("sp")) {
                videoView.stopPlayback();
            }
        } else if (length == 3) {
            String G2 = m2978G(T[1]);
            if (G2.equals("seekto")) {
                videoView.seekTo(m3001c(m2978G(T[2])));
                return;
            }
            if (G2.equals("media")) {
                MediaController mediaController = new MediaController(this.f2358a);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                trim = T[2].trim();
                bool = mediaController;
            } else if (G2.equals("ip")) {
                try {
                    dim(T[2].trim(), Boolean.valueOf(videoView.isPlaying()));
                    return;
                } catch (Exception unused) {
                    trim = T[2].trim();
                    bool = Boolean.FALSE;
                }
            } else {
                if (G2.equals("dn")) {
                    trim = T[2].trim();
                    currentPosition = videoView.getDuration();
                } else if (G2.equals("cn")) {
                    trim = T[2].trim();
                    currentPosition = videoView.getCurrentPosition();
                } else {
                    return;
                }
                bool = Integer.valueOf(currentPosition);
            }
            dim(trim, bool);
        }
    }

    public void blp(String str) {
        String trim;
        String str2;
        Boolean bool = Boolean.TRUE;
        if (Build.VERSION.SDK_INT >= 21) {
            String[] T = m2990T(m3002c0(str));
            int length = T.length;
            if (length == 5) {
                C1340n nVar = C1340n.f3148n;
                if (nVar == null) {
                    C1340n nVar2 = new C1340n(this.f2361d);
                    C1340n.f3148n = nVar2;
                    nVar2.mo11986n(mo10114I(m2978G(T[0])), Integer.parseInt(m2978G(T[1])), Integer.parseInt(m2978G(T[2])), Integer.parseInt(m2978G(T[3])), Integer.parseInt(m2978G(T[4])));
                    return;
                }
                nVar.mo11984j(mo10114I(m2978G(T[0])), Integer.parseInt(m2978G(T[1])), Integer.parseInt(m2978G(T[2])), Integer.parseInt(m2978G(T[3])), Integer.parseInt(m2978G(T[4])));
            } else if (length != 2) {
            } else {
                if (C1340n.f3148n == null) {
                    dim(T[1].trim(), Boolean.FALSE);
                    return;
                }
                String G = m2978G(T[0]);
                if (G.equals("st")) {
                    C1340n.f3148n.mo11988p(true);
                    str2 = T[1];
                } else if (G.equals("sp")) {
                    C1340n.f3148n.mo11988p(false);
                    str2 = T[1];
                } else if (G.equals("re")) {
                    C1340n.f3148n.mo11987o();
                    C1340n.f3148n = null;
                    str2 = T[1];
                } else if (G.equals("ip")) {
                    trim = T[1].trim();
                    bool = Boolean.valueOf(C1340n.f3148n.mo11983i());
                    dim(trim, bool);
                } else {
                    return;
                }
                trim = str2.trim();
                dim(trim, bool);
            }
        }
    }

    public void bly(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            Object F = m2977F(T[1]);
            if (F.equals("sp")) {
                Object F2 = m2977F(T[0]);
                if (F2 instanceof MediaRecorder) {
                    MediaRecorder mediaRecorder = (MediaRecorder) F2;
                    try {
                        mediaRecorder.stop();
                        mediaRecorder.release();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    }
                    dim(T[0].trim(), null);
                    return;
                }
                return;
            }
            MediaRecorder mediaRecorder2 = new MediaRecorder();
            mediaRecorder2.setAudioSource(1);
            mediaRecorder2.setOutputFormat(0);
            String I = mo10114I(String.valueOf(F));
            C0835f.m1845b(I, false);
            mediaRecorder2.setOutputFile(I);
            mediaRecorder2.setAudioEncoder(0);
            try {
                mediaRecorder2.prepare();
                mediaRecorder2.start();
                dim(T[0].trim(), mediaRecorder2);
            } catch (Exception e2) {
                e2.printStackTrace();
                dim(T[0].trim(), null);
            }
        }
    }

    public void btoo(String str) {
        byte[] bArr;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        byte[] bArr2 = null;
        if (length == 2) {
            Object F = m2977F(T[0]);
            if (F instanceof byte[]) {
                bArr2 = (byte[]) F;
            } else {
                try {
                    bArr2 = mo10211n(F.toString().trim(), ' ');
                } catch (Exception unused) {
                }
            }
            if (bArr2 != null) {
                C0835f.m1853j(mo10114I(m2978G(T[1])), bArr2);
            }
        } else if (length == 3) {
            Object F2 = m2977F(T[1]);
            if (F2 instanceof byte[]) {
                bArr = (byte[]) F2;
            } else {
                try {
                    bArr = mo10211n(F2.toString().trim(), ' ');
                } catch (Exception unused2) {
                    bArr = null;
                }
            }
            if (bArr != null) {
                Object F3 = m2977F(T[0]);
                if (F3 == null) {
                    dim(T[2].trim(), new String(bArr));
                    return;
                }
                try {
                    dim(T[2].trim(), new String(bArr, F3.toString()));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    dim(T[2].trim(), null);
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void call(String str) {
        String trim;
        Object b;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object F = m2977F(T[1]);
        int i = 3;
        if (F.equals("myu")) {
            int i2 = length - 3;
            if (i2 >= 0) {
                String G = m2978G(T[2]);
                Object obj = C0864v.f1802l.get(G + i2);
                int indexOf = G.indexOf(46);
                if (obj == null) {
                    String substring = G.substring(0, indexOf + 1);
                    for (String str2 : C0864v.f1802l.keySet()) {
                        if (str2.toString().startsWith(substring)) {
                            return;
                        }
                    }
                    m2994X(substring + "myu");
                    obj = C0864v.f1802l.get(G + i2);
                }
                String obj2 = obj.toString();
                int indexOf2 = obj2.indexOf(10);
                String[] T2 = m2990T(m3002c0(obj2.substring(0, indexOf2)));
                if (i2 == T2.length) {
                    while (i < length) {
                        dim(T2[i - 3].trim(), m2977F(T[i]));
                        i++;
                    }
                    mian.m4024c(G.substring(0, indexOf), G.substring(indexOf + 1) + obj2.substring(indexOf2).trim(), this);
                    return;
                }
                return;
            }
            return;
        }
        String str3 = "i";
        if (F.equals("mjava")) {
            C1309h hVar = new C1309h(this.f2358a);
            try {
                hVar.set("activity", this.f2358a);
                hVar.set(str3, new Aid_javaCode(this.f2358a, this.f2361d, hVar));
            } catch (EvalError e) {
                e.printStackTrace();
            }
            String G2 = m2978G(T[2]);
            int indexOf3 = G2.indexOf(46);
            if (hVar.mo11945e(G2.substring(0, indexOf3) + ".mjava")) {
                if (length == 3) {
                    trim = T[0].trim();
                    b = hVar.mo11941a(G2.substring(indexOf3 + 1));
                } else if (length > 3) {
                    Object[] objArr = new Object[(length - 3)];
                    int i3 = 0;
                    while (i < length) {
                        objArr[i3] = m2977F(T[i]);
                        i3++;
                        i++;
                    }
                    trim = T[0].trim();
                    b = hVar.mo11942b(G2.substring(indexOf3 + 1), objArr);
                } else {
                    return;
                }
                dim(trim, b);
                return;
            }
            return;
        }
        String str4 = "_a";
        if (F.equals("mlua")) {
            String G3 = m2978G(T[2]);
            long id = Thread.currentThread().getId();
            String str5 = "";
            String str6 = str5;
            int i4 = 3;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i5 + 1;
                String str7 = "$_Call_SsS_" + id + str4 + i6;
                C0864v.f1800j.put(str7, m2977F(T[i4]));
                str6 = str6 + "local a" + i6 + " = i:sss(\"" + str7 + "\")\n";
                str5 = str5 + ",a" + i6;
                i4++;
                i5 = i6;
                length = length;
                str4 = str4;
                str3 = str3;
            }
            if (str5.length() > 0) {
                str5 = str5.substring(1);
            }
            String str8 = "$_Call_SsS_" + id + "_return";
            String str9 = "require 'import'\nrequire '" + G3.substring(0, G3.indexOf(46)) + "'\n" + str6 + "\nlocal returns = " + G3.substring(G3.indexOf(46) + 1) + "(" + str5 + ")\ni:sss(\"" + str8 + "\", returns)";
            C1298d dVar = new C1298d(this.f2358a);
            dVar.mo11700l("activity", this.f2358a);
            dVar.mo11700l(str3, new Aid_luaCode(this.f2358a, this.f2361d, dVar));
            dVar.mo11699k();
            try {
                dVar.mo11696h(str9);
                dim(T[0].trim(), C0864v.f1800j.get(str8));
            } catch (LuaException e2) {
                e2.printStackTrace();
                C0864v.m2157O2("LuaErr：\n" + e2.getMessage());
            }
        } else {
            String str10 = str4;
            if (F.equals("mjs")) {
                String G4 = m2978G(T[2]);
                long id2 = Thread.currentThread().getId();
                String str11 = "";
                String str12 = str11;
                int i7 = 0;
                int i8 = 3;
                while (i8 < length) {
                    i7++;
                    String str13 = "$_Call_SsS_" + id2 + str10 + i7;
                    C0864v.f1800j.put(str13, m2977F(T[i8]));
                    str12 = str12 + "var a" + i7 + " = I.sss(\"" + str13 + "\");\n";
                    str11 = str11 + ",a" + i7;
                    i8++;
                    id2 = id2;
                    str10 = str10;
                }
                if (str11.length() > 0) {
                    str11 = str11.substring(1);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("<html><head><script type='text/javascript'>");
                sb.append(C0839h.m1896e(this.f2358a, "import.mjs"));
                sb.append("\n");
                sb.append(C0839h.m1892a(this.f2358a, G4.substring(0, G4.indexOf(46)) + ".mjs"));
                sb.append("\n");
                sb.append(str12);
                sb.append("\nvar returns = ");
                sb.append(G4.substring(G4.indexOf(46) + 1));
                sb.append("(");
                sb.append(str11);
                sb.append(");</script></head></html>");
                String sb2 = sb.toString();
                android.webkit.WebView webView = new android.webkit.WebView(this.f2358a);
                webView.getSettings().setAllowFileAccess(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAppCacheEnabled(true);
                webView.getSettings().setAppCachePath(this.f2358a.getApplicationContext().getDir("cache", 0).getPath());
                webView.getSettings().setAppCacheMaxSize(8388608);
                webView.getSettings().setDatabaseEnabled(true);
                webView.getSettings().setDatabasePath(this.f2358a.getApplicationContext().getDir("database", 0).getPath());
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setGeolocationEnabled(true);
                webView.getSettings().setLightTouchEnabled(true);
                webView.getSettings().setCacheMode(-1);
                webView.getSettings().setPluginState(WebSettings.PluginState.ON);
                webView.setWebChromeClient(new C1075h0(this));
                if (Build.VERSION.SDK_INT >= 11) {
                    webView.removeJavascriptInterface("searchBoxJavaBridge_");
                    webView.removeJavascriptInterface("accessibility");
                    webView.removeJavascriptInterface("accessibilityTraversal");
                }
                webView.addJavascriptInterface(new Aid_jsCode(this.f2358a, this.f2361d, webView, 0), "I");
                C1295c.m3509d(webView, sb2);
            }
        }
    }

    public void cast(String str) {
        Class<?> a;
        String trim;
        String str2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            Object F = m2977F(T[0]);
            a = F instanceof Class ? (Class) F : F instanceof String ? C0832d.m1816a(String.valueOf(F)) : F.getClass();
            trim = T[1].trim();
            str2 = T[1];
        } else if (length == 3) {
            Object F2 = m2977F(T[0]);
            a = F2 instanceof Class ? (Class) F2 : F2 instanceof String ? C0832d.m1816a(String.valueOf(F2)) : F2.getClass();
            trim = T[2].trim();
            str2 = T[1];
        } else {
            return;
        }
        dim(trim, a.cast(m2977F(str2)));
    }

    public void clear_s_dim() {
        this.f2359b.clear();
    }

    public void cls(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            dim(T[1].trim(), C0832d.m1817b(m2978G(T[0])));
        } else if (length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof ClassLoader) {
                try {
                    dim(T[2].trim(), ((ClassLoader) F).loadClass(m2978G(T[1])));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    str2 = T[2];
                }
            } else {
                str2 = T[2];
                dim(str2.trim(), null);
            }
        }
    }

    public void clssm(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof Class) {
                Object F2 = m2977F(T[1]);
                if (F2.equals("init")) {
                    dim(T[2].trim(), ((Class) F).getDeclaredConstructors());
                } else if (F2.equals("method")) {
                    dim(T[2].trim(), ((Class) F).getDeclaredMethods());
                } else if (F2.equals("field")) {
                    dim(T[2].trim(), ((Class) F).getDeclaredFields());
                }
            }
        }
    }

    /* renamed from: dh */
    public void mo10133dh(String str) {
        boolean z;
        String str2;
        Object valueOf;
        Boolean bool = Boolean.TRUE;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        if (F instanceof Animation) {
            Animation animation = (Animation) F;
            Object F2 = m2977F(T[1]);
            if (F2.equals("cancel")) {
                animation.cancel();
            } else if (F2.equals("reset")) {
                animation.reset();
            } else if (F2.equals("start")) {
                animation.start();
            } else if (F2.equals("duration")) {
                animation.setDuration(Long.parseLong(m2978G(T[2])));
            } else if (F2.equals("enabled")) {
                animation.setFillEnabled(m2977F(T[2]).equals(bool));
            } else if (F2.equals("after")) {
                animation.setFillAfter(m2977F(T[2]).equals(bool));
            } else if (F2.equals("before")) {
                animation.setFillBefore(m2977F(T[2]).equals(bool));
            } else if (F2.equals("delay")) {
                animation.setStartOffset(Long.parseLong(m2978G(T[2])));
            } else if (F2.equals("repeat")) {
                animation.setRepeatCount(m3001c(m2978G(T[2])));
            }
        } else {
            if (F instanceof AbstractC0918a) {
                AbstractC0918a aVar = (AbstractC0918a) F;
                Object F3 = m2977F(T[1]);
                if (F3.equals("cancel")) {
                    aVar.mo9111b();
                    return;
                } else if (F3.equals("clone")) {
                    str2 = T[2].trim();
                    valueOf = aVar.clone();
                } else if (F3.equals("start")) {
                    aVar.mo9120j();
                    return;
                } else if (F3.equals("running")) {
                    str2 = T[2].trim();
                    z = aVar.mo9115e();
                    valueOf = Boolean.valueOf(z);
                } else if (F3.equals("duration")) {
                    aVar.mo9117g(Long.parseLong(m2978G(T[2])));
                    return;
                } else if (F3.equals("delay")) {
                    aVar.mo9118h(Long.parseLong(m2978G(T[2])));
                    return;
                } else if (F3.equals("target")) {
                    Object F4 = m2977F(T[2]);
                    aVar.mo9119i(F4 instanceof View ? (View) F4 : m3020w(F4, T[2]));
                    return;
                } else {
                    return;
                }
            } else if (F instanceof AnimationSet) {
                AnimationSet animationSet = (AnimationSet) F;
                Object F5 = m2977F(T[1]);
                if (F5.equals("cancel")) {
                    animationSet.cancel();
                    return;
                } else if (F5.equals("reset")) {
                    animationSet.reset();
                    return;
                } else if (F5.equals("start")) {
                    animationSet.start();
                    return;
                } else if (F5.equals("duration")) {
                    animationSet.setDuration(Long.parseLong(m2978G(T[2])));
                    return;
                } else if (F5.equals("enabled")) {
                    animationSet.setFillEnabled(m2977F(T[2]).equals(bool));
                    return;
                } else if (F5.equals("after")) {
                    animationSet.setFillAfter(m2977F(T[2]).equals(bool));
                    return;
                } else if (F5.equals("before")) {
                    animationSet.setFillBefore(m2977F(T[2]).equals(bool));
                    return;
                } else if (F5.equals("delay")) {
                    animationSet.setStartOffset(Long.parseLong(m2978G(T[2])));
                    return;
                } else if (F5.equals("repeat")) {
                    animationSet.setRepeatCount(m3001c(m2978G(T[2])));
                    return;
                } else if (F5.equals("add")) {
                    animationSet.addAnimation((Animation) m2977F(T[2]));
                    return;
                } else {
                    return;
                }
            } else if (F instanceof C0921c) {
                C0921c cVar = (C0921c) F;
                Object F6 = m2977F(T[1]);
                if (F6.equals("cancel")) {
                    cVar.mo9111b();
                    return;
                } else if (F6.equals("clone")) {
                    str2 = T[2].trim();
                    valueOf = cVar.clone();
                } else if (F6.equals("start")) {
                    cVar.mo9120j();
                    return;
                } else if (F6.equals("running")) {
                    str2 = T[2].trim();
                    z = cVar.mo9115e();
                    valueOf = Boolean.valueOf(z);
                } else if (F6.equals("duration")) {
                    cVar.mo9130u(Long.parseLong(m2978G(T[2])));
                    return;
                } else if (F6.equals("delay")) {
                    cVar.mo9118h(Long.parseLong(m2978G(T[2])));
                    return;
                } else if (F6.equals("target")) {
                    Object F7 = m2977F(T[2]);
                    cVar.mo9119i(F7 instanceof View ? (View) F7 : m3020w(F7, T[2]));
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
            dim(str2, valueOf);
        }
    }

    public void dha(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            String trim = T[0].trim();
            Object F = m2977F(T[1]);
            Boolean bool = Boolean.TRUE;
            float f = 1.0f;
            float f2 = F.equals(bool) ? 1.0f : 0.0f;
            if (!m2977F(T[2]).equals(bool)) {
                f = 0.0f;
            }
            dim(trim, new AlphaAnimation(f2, f));
        }
    }

    public void dhas(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        dim(T[0].trim(), null);
        Object F = m2977F(T[1]);
        View w = F instanceof View ? (View) F : m3020w(F, T[1]);
        float[] fArr = new float[(length - 3)];
        int i = 0;
        for (int i2 = 3; i2 < length; i2++) {
            fArr[i] = Float.parseFloat(m2978G(T[i2]));
            i++;
        }
        dim(T[0].trim(), C0934i.m2550K(w, m2978G(T[2]), fArr));
    }

    public void dhast(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        dim(T[0].trim(), null);
        C0921c cVar = new C0921c();
        AbstractC0918a[] aVarArr = new AbstractC0918a[(length - 2)];
        int i = 0;
        for (int i2 = 2; i2 < length; i2++) {
            Object F = m2977F(T[i2]);
            if (F instanceof AbstractC0918a) {
                aVarArr[i] = (AbstractC0918a) F;
                i++;
            }
        }
        Object F2 = m2977F(T[1]);
        if (F2.equals("sequen")) {
            cVar.mo9128s(aVarArr);
        } else if (F2.equals("together")) {
            cVar.mo9129t(aVarArr);
        }
        dim(T[0].trim(), cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: android.graphics.drawable.AnimationDrawable */
    /* JADX WARN: Multi-variable type inference failed */
    public void dhb(String str) {
        String str2;
        Boolean bool;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            Object F = m2977F(T[1]);
            if (F instanceof Boolean) {
                AnimationDrawable animationDrawable = new AnimationDrawable();
                animationDrawable.setOneShot(!m2977F(T[1]).equals(Boolean.TRUE));
                str2 = T[0].trim();
                bool = animationDrawable;
            } else if (F.equals("start")) {
                Object F2 = m2977F(T[0]);
                if (F2 instanceof AnimationDrawable) {
                    ((AnimationDrawable) F2).start();
                    return;
                }
                return;
            } else if (F.equals("stop")) {
                Object F3 = m2977F(T[0]);
                if (F3 instanceof AnimationDrawable) {
                    ((AnimationDrawable) F3).stop();
                    return;
                }
                return;
            } else {
                return;
            }
        } else if (length == 3) {
            Object F4 = m2977F(T[0]);
            if (F4 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable2 = (AnimationDrawable) F4;
                Object F5 = m2977F(T[1]);
                if (F5.equals("running")) {
                    str2 = T[2].trim();
                    bool = Boolean.valueOf(animationDrawable2.isRunning());
                } else {
                    animationDrawable2.addFrame(F5 instanceof Drawable ? (Drawable) F5 : F5 instanceof Bitmap ? new BitmapDrawable((Bitmap) F5) : C1305g.m3582m(String.valueOf(F5), this.f2358a), m3001c(m2978G(T[2])));
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        dim(str2, bool);
    }

    public void dhon(String str) {
        String[] T = m2990T(m3004d0(str));
        ArrayList arrayList = new ArrayList();
        String[] Z = m2996Z(str, '\n');
        String str2 = "";
        int i = 0;
        for (int i2 = 0; i2 < Z.length; i2++) {
            if (Z[i2].equals("{")) {
                i++;
            } else if (Z[i2].equals("}")) {
                i--;
            } else if (i == 0) {
                if (Z[i2].startsWith("else")) {
                    str2 = Z[i2] + "\n";
                }
            }
            str2 = str2 + Z[i2] + "\n";
            if (i == 0) {
                arrayList.add(m3018u(str2));
            }
        }
        Object F = m2977F(T[0]);
        if (F instanceof Animation) {
            new C1312j(this, (Animation) F, arrayList.toArray());
        } else if (F instanceof AbstractC0918a) {
            new C1312j(this, (AbstractC0918a) F, arrayList.toArray());
        }
    }

    public void dhr(String str) {
        String trim;
        RotateAnimation rotateAnimation;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            trim = T[0].trim();
            rotateAnimation = new RotateAnimation(Float.parseFloat(m2978G(T[1])), Float.parseFloat(m2978G(T[2])));
        } else if (length == 7) {
            trim = T[0].trim();
            rotateAnimation = new RotateAnimation(Float.parseFloat(m2978G(T[1])), Float.parseFloat(m2978G(T[2])), m3001c(m2978G(T[3])), Float.parseFloat(m2978G(T[4])), m3001c(m2978G(T[5])), Float.parseFloat(m2978G(T[6])));
        } else {
            return;
        }
        dim(trim, rotateAnimation);
    }

    public void dhs(String str) {
        String trim;
        ScaleAnimation scaleAnimation;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 5) {
            trim = T[0].trim();
            scaleAnimation = new ScaleAnimation(Float.parseFloat(m2978G(T[1])), Float.parseFloat(m2978G(T[2])), Float.parseFloat(m2978G(T[3])), Float.parseFloat(m2978G(T[4])));
        } else if (length == 9) {
            trim = T[0].trim();
            scaleAnimation = new ScaleAnimation(Float.parseFloat(m2978G(T[1])), Float.parseFloat(m2978G(T[2])), Float.parseFloat(m2978G(T[3])), Float.parseFloat(m2978G(T[4])), m3001c(m2978G(T[5])), Float.parseFloat(m2978G(T[6])), m3001c(m2978G(T[7])), Float.parseFloat(m2978G(T[8])));
        } else {
            return;
        }
        dim(trim, scaleAnimation);
    }

    public void dhset(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        AnimationSet animationSet = new AnimationSet(m2977F(T[1]).equals(Boolean.TRUE));
        for (int i = 2; i < length; i++) {
            Object F = m2977F(T[i]);
            if (F instanceof Animation) {
                animationSet.addAnimation((Animation) F);
            }
        }
        dim(T[0].trim(), animationSet);
    }

    public void dht(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 5) {
            dim(T[0].trim(), new TranslateAnimation(Float.parseFloat(m2978G(T[1])), Float.parseFloat(m2978G(T[2])), Float.parseFloat(m2978G(T[3])), Float.parseFloat(m2978G(T[4]))));
        }
    }

    public void dim(String str, Object obj) {
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
            if (substring.equals("ss")) {
                m3016q(str, obj, 1);
                return;
            } else if (substring.equals("sss")) {
                m3016q(str, obj, 2);
                return;
            }
        }
        this.f2359b.put(str, obj);
    }

    public void dim_y(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] Z = m2996Z(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : Z) {
            str2 = str2.replace(" " + str3.trim() + " ", m2978G(str3));
        }
        dim(substring.substring(indexOf + 1).trim(), String.valueOf((long) C0969a.m2735a(str2)));
    }

    public void dim_y2(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] Z = m2996Z(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : Z) {
            str2 = str2.replace(" " + str3.trim() + " ", m2978G(str3));
        }
        dim(substring.substring(indexOf + 1).trim(), String.format("%.2f", Double.valueOf(C0969a.m2735a(str2))));
    }

    public void dim_yn(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] Z = m2996Z(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : Z) {
            str2 = str2.replace(" " + str3.trim() + " ", m2978G(str3));
        }
        dim(substring.substring(indexOf + 1).trim(), String.valueOf(C0969a.m2735a(str2)));
    }

    public Object dimget2(String str) {
        HashMap<String, Object> hashMap;
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String trim = str.substring(0, indexOf).trim();
            str = str.substring(indexOf + 1).trim();
            if (trim.equals("ss")) {
                hashMap = C0864v.f1801k;
            } else if (trim.equals("sss")) {
                hashMap = C0864v.f1800j;
            }
            return hashMap.get(str);
        }
        hashMap = this.f2359b;
        return hashMap.get(str);
    }

    public boolean dims(String str, int i) {
        Object r;
        Object valueOf;
        int indexOf = str.indexOf(61);
        if (indexOf == -1) {
            String trim = str.substring(i + 2).trim();
            if (m2985O(trim) || trim.indexOf(32) != -1) {
                return false;
            }
            m3016q(trim, null, i);
            return true;
        }
        String trim2 = str.substring(i + 2, indexOf).trim();
        if (m2985O(trim2) || trim2.indexOf(32) != -1) {
            return false;
        }
        String trim3 = str.substring(indexOf + 1).trim();
        if (trim3.contains("\"")) {
            if (!trim3.startsWith("\"") || !trim3.endsWith("\"")) {
                return false;
            }
            r = C0864v.m2183V(C0864v.m2201a(trim3.substring(1, trim3.length() - 1)));
        } else if (trim3.equals("null")) {
            m3016q(trim2, null, i);
            return true;
        } else {
            if (trim3.equals("true")) {
                valueOf = Boolean.TRUE;
            } else if (trim3.equals("false")) {
                valueOf = Boolean.FALSE;
            } else if (!m2985O(trim3)) {
                r = m3017r(trim3);
            } else if (trim3.contains(".")) {
                if (trim3.startsWith("00")) {
                    m3016q(trim2, trim3, i);
                }
                valueOf = Double.valueOf(Double.parseDouble(trim3));
            } else {
                if (trim2.startsWith("00")) {
                    m3016q(trim2, trim3, i);
                }
                m3016q(trim2, trim3.length() < 10 ? Integer.valueOf(Integer.parseInt(trim3)) : Long.valueOf(Long.parseLong(trim3)), i);
                return true;
            }
            m3016q(trim2, valueOf, i);
            return true;
        }
        m3016q(trim2, r, i);
        return true;
    }

    public void dslist(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            Object F = m2977F(T[1]);
            if (F instanceof Integer) {
                int parseInt = Integer.parseInt(String.valueOf(F));
                if (parseInt == -1) {
                    ((ArrayList) m2977F(T[0])).clear();
                } else {
                    ((ArrayList) m2977F(T[0])).remove(parseInt);
                }
            } else {
                ((ArrayList) m2977F(T[0])).remove(F);
            }
        }
    }

    public void end() {
        this.f2361d.finish();
    }

    public void endkeyboard() {
        View peekDecorView = this.f2361d.getWindow().peekDecorView();
        if (peekDecorView != null) {
            ((InputMethodManager) this.f2358a.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
    }

    public void ends() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        this.f2358a.startActivity(intent);
    }

    public void endutw() {
        AlertDialog alertDialog = C0864v.f1804n;
        if (alertDialog != null) {
            alertDialog.dismiss();
            C0864v.f1804n = null;
        }
    }

    /* renamed from: f */
    public int mo10154f(String str) {
        StringBuilder sb;
        String str2;
        if (str.indexOf(40) == 0) {
            str = "f" + str;
        }
        String[] Z = m2996Z(str, '\n');
        String str3 = "";
        int i = 0;
        for (int i2 = 0; i2 < Z.length; i2++) {
            if (Z[i2].equals("{")) {
                i++;
            } else if (Z[i2].equals("}")) {
                i--;
            } else if (i == 0) {
                if (Z[i2].startsWith("f(")) {
                    sb = new StringBuilder();
                    str2 = Z[i2];
                } else {
                    if (Z[i2].startsWith("else")) {
                        String trim = Z[i2].substring(4).trim();
                        if (trim.startsWith("f(")) {
                            str3 = trim + "\n";
                        } else {
                            sb = new StringBuilder();
                            str2 = Z[i2];
                        }
                    }
                }
                sb.append(str2);
                sb.append("\n");
                str3 = sb.toString();
            }
            str3 = str3 + Z[i2] + "\n";
            if (i != 0) {
                continue;
            } else if (!str3.startsWith("f(")) {
                int YuGo = YuGo(m3018u(str3));
                if (YuGo == 2) {
                    return 2;
                }
                return YuGo == 1 ? 1 : 0;
            } else if (m2999b(m3004d0(str3))) {
                int YuGo2 = YuGo(m3018u(str3));
                if (YuGo2 == 2) {
                    return 2;
                }
                return YuGo2 == 1 ? 1 : 0;
            }
        }
        return 0;
    }

    /* renamed from: fc */
    public void mo10155fc(String str) {
        String trim;
        boolean f;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            trim = T[2].trim();
            f = C0839h.m1897f(this.f2358a, m2978G(T[0]), m2978G(T[1]), true);
        } else if (T.length == 4) {
            trim = T[3].trim();
            f = C0839h.m1897f(this.f2358a, m2978G(T[0]), m2978G(T[1]), m2977F(T[2]).equals(Boolean.TRUE));
        } else {
            return;
        }
        dim(trim, Boolean.valueOf(f));
    }

    /* renamed from: fd */
    public void mo10156fd(String str) {
        String str2;
        Boolean bool;
        String[] T = m2990T(m3002c0(str));
        File file = new File(mo10114I(m2978G(T[0])));
        if (file.exists()) {
            str2 = T[1].trim();
            bool = Boolean.valueOf(file.delete());
        } else {
            str2 = T[1].trim();
            bool = Boolean.FALSE;
        }
        dim(str2, bool);
    }

    public void fdir(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 1) {
            dim(T[0].trim(), C0835f.f1721a);
        } else if (T.length == 2) {
            dim(T[1].trim(), mo10114I(m2978G(T[0])));
        }
    }

    /* renamed from: fe */
    public void mo10158fe(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Boolean.valueOf(C0839h.m1898g(this.f2358a, m2978G(T[0]))));
    }

    /* renamed from: fi */
    public void mo10159fi(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Boolean.valueOf(new File(mo10114I(m2978G(T[0]))).isDirectory()));
    }

    /* renamed from: fj */
    public void mo10160fj(String str) {
        String str2;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            String I = mo10114I(m2978G(T[1]));
            C0835f.m1845b(I, false);
            try {
                C0834e.m1837c(mo10114I(m2978G(T[0])), I, true);
                dim(T[2].trim(), bool);
            } catch (Exception unused) {
                str2 = T[2];
                dim(str2.trim(), bool2);
            }
        } else if (T.length == 4) {
            String I2 = mo10114I(m2978G(T[1]));
            C0835f.m1845b(I2, false);
            try {
                C0834e.m1837c(mo10114I(m2978G(T[0])), I2, m2977F(T[2]).equals(bool));
                dim(T[3].trim(), bool);
            } catch (Exception unused2) {
                str2 = T[3];
                dim(str2.trim(), bool2);
            }
        }
    }

    /* renamed from: fl */
    public void mo10161fl(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            dim(T[1].trim(), C0839h.m1899h(this.f2358a, m2978G(T[0])));
        } else if (length == 3) {
            File file = new File(mo10114I(m2978G(T[0])));
            if (file.exists()) {
                ArrayList arrayList = new ArrayList();
                boolean equals = m2977F(T[1]).equals(Boolean.TRUE);
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    dim(T[2].trim(), null);
                    return;
                }
                for (File file2 : listFiles) {
                    if (equals) {
                        if (!file2.isDirectory()) {
                        }
                    } else if (!file2.isFile()) {
                    }
                    arrayList.add(file2.getName());
                }
                dim(T[2].trim(), arrayList.toArray());
                return;
            }
            dim(T[2].trim(), null);
        }
    }

    /* renamed from: fo */
    public void mo10162fo(String str) {
        String I = mo10114I(m2978G(m2990T(m3002c0(str))[0]));
        File file = new File(I);
        if (!file.exists()) {
            return;
        }
        if (I.toLowerCase().endsWith(".apk")) {
            C0835f.m1847d(this.f2358a, I);
            return;
        }
        try {
            m2986P(file);
        } catch (Exception unused) {
        }
    }

    public int for_y(String str) {
        String d0 = m3004d0(str);
        int indexOf = d0.indexOf(59);
        String trim = d0.substring(0, indexOf).trim();
        String trim2 = d0.substring(indexOf + 1).trim();
        Object F = m2977F(trim);
        Object F2 = m2977F(trim2);
        if (F2 instanceof String[]) {
            String u = m3018u(str);
            for (String str2 : (String[]) F2) {
                dim(trim, str2);
                int YuGo = YuGo(u);
                if (YuGo == 2) {
                    return 2;
                }
                if (YuGo == 1) {
                    return 0;
                }
            }
        } else if (F2 instanceof Object[]) {
            String u2 = m3018u(str);
            for (Object obj : (Object[]) F2) {
                dim(trim, obj);
                int YuGo2 = YuGo(u2);
                if (YuGo2 == 2) {
                    return 2;
                }
                if (YuGo2 == 1) {
                    return 0;
                }
            }
        } else if (F2 instanceof ArrayList) {
            String u3 = m3018u(str);
            Iterator it = ((ArrayList) F2).iterator();
            while (it.hasNext()) {
                dim(trim, it.next());
                int YuGo3 = YuGo(u3);
                if (YuGo3 == 2) {
                    return 2;
                }
                if (YuGo3 == 1) {
                    return 0;
                }
            }
        } else {
            int c = m3001c(F2.toString());
            String u4 = m3018u(str);
            for (int c2 = m3001c(F.toString()); c2 <= c; c2++) {
                int YuGo4 = YuGo(u4);
                if (YuGo4 == 2) {
                    return 2;
                }
                if (YuGo4 == 1) {
                    return 0;
                }
            }
        }
        return 0;
    }

    /* renamed from: fr */
    public void mo10164fr(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        String G = m2978G(T[0]);
        if (length == 2) {
            dim(T[1].trim(), C0839h.m1900i(this.f2358a, G));
        } else if (length == 3) {
            dim(T[2].trim(), C0839h.m1901j(this.f2358a, G, m2978G(T[1])));
        }
    }

    /* renamed from: fs */
    public void mo10165fs(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Long.valueOf(C0839h.m1902k(this.f2358a, m2978G(T[0]))));
    }

    /* renamed from: ft */
    public void mo10166ft(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            File file = new File(mo10114I(m2978G(T[0])));
            if (file.exists()) {
                String I = mo10114I(m2978G(T[1]));
                C0835f.m1845b(I, false);
                dim(T[2].trim(), Boolean.valueOf(file.renameTo(new File(I))));
                return;
            }
            dim(T[2].trim(), Boolean.FALSE);
        }
    }

    public void ftz(String str) {
        String[] T = m2990T(m3004d0(str));
        if (T.length == 4) {
            C0862t.m2077b(this.f2358a, m2978G(T[0]), m2978G(T[1]), m2978G(T[2]), m2977F(T[3]), new Intent().setClass(this.f2358a, logoActivity.class).putExtra("command", m3018u(str)));
        }
    }

    public void function(String str) {
        String lowerCase = str.substring(2, str.indexOf(40)).trim().toLowerCase();
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        HashMap<String, Object> hashMap = C0864v.f1802l;
        Object obj = hashMap.get(lowerCase + length);
        if (obj == null) {
            String trim = str.substring(2, str.indexOf(46) + 1).trim();
            for (String str2 : C0864v.f1802l.keySet()) {
                if (str2.toString().startsWith(trim)) {
                    return;
                }
            }
            m2994X(trim + "myu");
            HashMap<String, Object> hashMap2 = C0864v.f1802l;
            obj = hashMap2.get(lowerCase + length);
        }
        String obj2 = obj.toString();
        int indexOf = obj2.indexOf(10);
        String[] T2 = m2990T(m3002c0(obj2.substring(0, indexOf)));
        if (length == T2.length) {
            Aid_YuCodeX aid_YuCodeX = this.f2363g;
            if (aid_YuCodeX == null) {
                this.f2363g = new Aid_YuCodeX(this.f2358a, this.f2361d);
            } else {
                aid_YuCodeX.clear_s_dim();
            }
            for (int i = 0; i < length; i++) {
                this.f2363g.dim(T2[i].trim(), m2977F(T[i]));
            }
            int indexOf2 = lowerCase.indexOf(46);
            String substring = lowerCase.substring(0, indexOf2);
            mian.m4024c(substring, lowerCase.substring(indexOf2 + 1) + obj2.substring(indexOf).trim(), this.f2363g);
        }
    }

    public void function2(String str) {
        String lowerCase = str.substring(0, str.indexOf(40)).trim().toLowerCase();
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        HashMap<String, Object> hashMap = C0864v.f1802l;
        Object obj = hashMap.get(lowerCase + length);
        if (obj == null) {
            String trim = str.substring(0, str.indexOf(46) + 1).trim();
            for (String str2 : C0864v.f1802l.keySet()) {
                if (str2.toString().startsWith(trim)) {
                    return;
                }
            }
            m2994X(trim + "myu");
            HashMap<String, Object> hashMap2 = C0864v.f1802l;
            obj = hashMap2.get(lowerCase + length);
        }
        String obj2 = obj.toString();
        int indexOf = obj2.indexOf(10);
        String[] T2 = m2990T(m3002c0(obj2.substring(0, indexOf)));
        if (length == T2.length) {
            Aid_YuCodeX aid_YuCodeX = this.f2363g;
            if (aid_YuCodeX == null) {
                this.f2363g = new Aid_YuCodeX(this.f2358a, this.f2361d);
            } else {
                aid_YuCodeX.clear_s_dim();
            }
            for (int i = 0; i < length; i++) {
                this.f2363g.dim(T2[i].trim(), m2977F(T[i]));
            }
            int indexOf2 = lowerCase.indexOf(46);
            String substring = lowerCase.substring(0, indexOf2);
            mian.m4024c(substring, lowerCase.substring(indexOf2 + 1) + obj2.substring(indexOf).trim(), this.f2363g);
        }
    }

    public void function3(String str, String str2, Object obj) {
        String lowerCase = str.substring(0, str.indexOf(40)).trim().toLowerCase();
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        HashMap<String, Object> hashMap = C0864v.f1802l;
        Object obj2 = hashMap.get(lowerCase + length);
        if (obj2 == null) {
            String trim = str.substring(0, str.indexOf(46) + 1).trim();
            for (String str3 : C0864v.f1802l.keySet()) {
                if (str3.toString().startsWith(trim)) {
                    return;
                }
            }
            m2994X(trim + "myu");
            HashMap<String, Object> hashMap2 = C0864v.f1802l;
            obj2 = hashMap2.get(lowerCase + length);
        }
        String obj3 = obj2.toString();
        int indexOf = obj3.indexOf(10);
        String[] T2 = m2990T(m3002c0(obj3.substring(0, indexOf)));
        if (length == T2.length) {
            Aid_YuCodeX aid_YuCodeX = this.f2363g;
            if (aid_YuCodeX == null) {
                this.f2363g = new Aid_YuCodeX(this.f2358a, this.f2361d);
            } else {
                aid_YuCodeX.clear_s_dim();
            }
            for (int i = 0; i < length; i++) {
                this.f2363g.dim(T2[i].trim(), m2977F(T[i]));
            }
            this.f2363g.dim(str2, obj);
            int indexOf2 = lowerCase.indexOf(46);
            String substring = lowerCase.substring(0, indexOf2);
            mian.m4024c(substring, lowerCase.substring(indexOf2 + 1) + obj3.substring(indexOf).trim(), this.f2363g);
        }
    }

    public void fuz(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 4) {
            String I = mo10114I(m2978G(T[2]));
            C0835f.m1845b(I, false);
            try {
                dim(T[3].trim(), Integer.valueOf(C0839h.m1903l(this.f2358a, m2978G(T[0]), m2978G(T[1]), I, true)));
            } catch (Exception unused) {
                str2 = T[3];
                dim(str2.trim(), -1);
            }
        } else if (T.length == 5) {
            String I2 = mo10114I(m2978G(T[2]));
            C0835f.m1845b(I2, false);
            try {
                dim(T[4].trim(), Integer.valueOf(C0839h.m1903l(this.f2358a, m2978G(T[0]), m2978G(T[1]), I2, m2977F(T[3]).equals(Boolean.TRUE))));
            } catch (Exception unused2) {
                str2 = T[4];
                dim(str2.trim(), -1);
            }
        }
    }

    public void fuzs(String str) {
        String str2;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            String I = mo10114I(m2978G(T[1]));
            C0835f.m1845b(I, false);
            try {
                C0839h.m1904m(this.f2358a, m2978G(T[0]), I, true);
                dim(T[2].trim(), bool);
            } catch (Exception unused) {
                str2 = T[2];
                dim(str2.trim(), bool2);
            }
        } else if (T.length == 4) {
            String I2 = mo10114I(m2978G(T[1]));
            C0835f.m1845b(I2, false);
            try {
                C0839h.m1904m(this.f2358a, m2978G(T[0]), I2, m2977F(T[2]).equals(bool));
                dim(T[3].trim(), bool);
            } catch (Exception unused2) {
                str2 = T[3];
                dim(str2.trim(), bool2);
            }
        }
    }

    /* renamed from: fw */
    public void mo10173fw(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            C0835f.m1854k(mo10114I(m2978G(T[0])), m2978G(T[1]));
        } else if (length == 3) {
            C0835f.m1855l(mo10114I(m2978G(T[0])), m2978G(T[1]), m2978G(T[2]));
        }
    }

    public String getopenRestoreinterface(String str) {
        return C0839h.m1887C(this.f2358a, str);
    }

    public void git(String str) {
        String trim;
        Object component;
        String str2;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        String G = m2978G(T[1]);
        Intent intent = F instanceof Intent ? (Intent) F : null;
        if (G.equals("action")) {
            if (intent == null) {
                str2 = T[2];
            } else {
                trim = T[2].trim();
                component = intent.getAction();
                dim(trim, component);
                return;
            }
        } else if (G.equals("type")) {
            if (intent == null) {
                str2 = T[2];
            } else {
                trim = T[2].trim();
                component = intent.getType();
                dim(trim, component);
                return;
            }
        } else if (G.equals("extra")) {
            if (intent == null) {
                str2 = T[3];
            } else {
                dim(T[3].trim(), intent.getExtras().get(m2978G(T[2])));
                return;
            }
        } else if (G.equals("flags")) {
            if (intent == null) {
                str2 = T[2];
            } else {
                trim = T[2].trim();
                component = Integer.valueOf(intent.getFlags());
                dim(trim, component);
                return;
            }
        } else if (G.equals("data")) {
            if (intent == null) {
                str2 = T[2];
            } else {
                trim = T[2].trim();
                component = intent.getData();
                dim(trim, component);
                return;
            }
        } else if (G.equals("datastring")) {
            if (intent == null) {
                str2 = T[2];
            } else {
                trim = T[2].trim();
                component = intent.getDataString();
                dim(trim, component);
                return;
            }
        } else if (!G.equals("component")) {
            return;
        } else {
            if (intent == null) {
                str2 = T[2];
            } else {
                trim = T[2].trim();
                component = intent.getComponent();
                dim(trim, component);
                return;
            }
        }
        dim(str2.trim(), null);
    }

    public void goUIEventset(String str, String str2, Aid_YuCodeX aid_YuCodeX) {
        mian.m4024c(str, str2, aid_YuCodeX);
    }

    public void gslist(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            dim(T[2].trim(), ((ArrayList) m2977F(T[0])).get(m3001c(m2978G(T[1]))));
        }
    }

    public void gslistiof(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            dim(T[2].trim(), Integer.valueOf(((ArrayList) m2977F(T[0])).indexOf(m2977F(T[1]))));
        }
    }

    public void gslistis(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            dim(T[2].trim(), Boolean.valueOf(((ArrayList) m2977F(T[0])).contains(m2977F(T[1]))));
        }
    }

    public void gslistl(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            dim(T[1].trim(), Integer.valueOf(((ArrayList) m2977F(T[0])).size()));
        }
    }

    public void gslistlof(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            dim(T[2].trim(), Integer.valueOf(((ArrayList) m2977F(T[0])).lastIndexOf(m2977F(T[1]))));
        }
    }

    public void gslistsz(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            dim(T[1].trim(), ((ArrayList) m2977F(T[0])).toArray());
        }
    }

    public void gvs(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            dim(T[1].trim(), m3020w(m2977F(T[0]), T[0]));
        } else if (length == 3) {
            Object F = m2977F(T[0]);
            View w = F instanceof View ? (View) F : m3020w(F, T[0]);
            Object F2 = m2977F(T[1]);
            dim(T[2].trim(), F2 instanceof View ? (View) F2 : m3019v(w, F2, T[1]));
        }
    }

    public void has(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            Object F = m2977F(T[0]);
            View w = F instanceof View ? (View) F : m3020w(F, T[0]);
            if (w instanceof WebView) {
                ((WebView) w).loadUrl("javascript:{" + m2977F(T[1]) + "};");
            }
        }
    }

    /* renamed from: hd */
    public void mo10185hd(String str) {
        String trim;
        int b;
        Boolean bool = Boolean.TRUE;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            dim(T[2].trim(), Integer.valueOf(C0841i.m1918a(m2978G(T[0]), mo10114I(m2978G(T[1])), false)));
            return;
        }
        if (length == 4) {
            trim = T[3].trim();
            b = C0841i.m1918a(m2978G(T[0]), mo10114I(m2978G(T[1])), m2977F(T[2]).equals(bool));
        } else if (length == 9) {
            trim = T[8].trim();
            b = C0841i.m1919b(m2978G(T[0]), mo10114I(m2978G(T[1])), m2977F(T[2]).equals(bool), (String) m2977F(T[3]), (String) m2977F(T[4]), (String) m2977F(T[5]), m2977F(T[6]).equals(bool), (String) m2977F(T[7]));
        } else {
            return;
        }
        dim(trim, Integer.valueOf(b));
    }

    public void hdd(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 7) {
            C1293a.f3049b.mo9045m(mo10114I(m2978G(T[0])), mo10114I(m2978G(T[1])), m3001c(m2978G(T[2])), m3001c(m2978G(T[3])), m3001c(m2978G(T[4])), m3001c(m2978G(T[5])), m2977F(T[6]).equals(Boolean.TRUE));
        }
    }

    public void hdda(String str) {
        C0911c g;
        String str2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 4) {
            g = C1293a.f3049b.mo9038d(m2978G(T[0]), m2978G(T[1]), m2977F(T[2]));
            str2 = T[3];
        } else if (length == 5) {
            g = C1293a.f3049b.mo9039e(m2978G(T[0]), m2978G(T[1]), m2978G(T[2]), m2977F(T[3]));
            str2 = T[4];
        } else if (length == 6) {
            g = C1293a.f3049b.mo9040f(m2978G(T[0]), m2978G(T[1]), m2978G(T[2]), m2977F(T[3]), m2977F(T[4]));
            str2 = T[5];
        } else if (length == 8) {
            g = C1293a.f3049b.mo9041g(m2978G(T[0]), mo10114I(m2978G(T[1])), m2978G(T[2]), m2978G(T[3]), m2977F(T[4]), m2977F(T[5]).equals(Boolean.TRUE), m2977F(T[6]));
            str2 = T[7];
        } else {
            return;
        }
        dim(str2.trim(), g);
    }

    public void hddg(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            Object F = m2977F(T[0]);
            if (!(F instanceof C0911c)) {
                F = C1293a.f3049b.f1934c.get(m3001c(String.valueOf(F)));
            }
            dim(T[2].trim(), C1293a.f3049b.mo9042h((C0911c) F, m2978G(T[1])));
        }
    }

    public void hddgl(String str) {
        dim(m3002c0(str).trim(), C1293a.f3049b.f1934c);
    }

    public void hdds(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            Object F = m2977F(T[0]);
            if (!(F instanceof C0911c)) {
                F = C1293a.f3049b.f1934c.get(m3001c(String.valueOf(F)));
            }
            C1293a.f3049b.mo9044l((C0911c) F, m2978G(T[1]), m2977F(T[2]));
        }
    }

    public void hdduigo(String str) {
        Intent intent;
        Context context;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 0) {
            context = this.f2358a;
            intent = new Intent().setClass(this.f2358a, DownList.class);
        } else if (length == 2) {
            intent = new Intent(this.f2358a, DownList.class);
            Bundle bundle = new Bundle();
            bundle.putString("background", m2978G(T[0]));
            bundle.putString("backgroundShadow", m2978G(T[1]));
            intent.putExtras(bundle);
            context = this.f2358a;
        } else {
            return;
        }
        context.startActivity(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void hdfl(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.hdfl(java.lang.String):void");
    }

    public void hdfla(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object F = m2977F(T[0]);
        if (F instanceof C0836g) {
            C0836g gVar = (C0836g) F;
            if (length == 4) {
                gVar.mo8929n(m2978G(T[1]), m3001c(m2978G(T[2])), m2977F(T[3]));
            } else if (length == 5) {
                gVar.mo8930o(m2978G(T[1]), m3001c(m2978G(T[2])), m2977F(T[3]), mo10114I(m2978G(T[4])));
            } else {
                return;
            }
            gVar.mo8933t();
        }
    }

    /* renamed from: hs */
    public void mo10194hs(String str) {
        String str2;
        String str3;
        String trim;
        String h;
        String substring;
        Boolean bool = Boolean.TRUE;
        String[] T = m2990T(m3002c0(str.replace("\\&", "\\\\\\&")));
        int length = T.length;
        if (length == 2) {
            T[0] = m2978G(T[0]);
            if (T[0].equals("cookie")) {
                str3 = T[1].trim();
                substring = T[0];
            } else if (T[0].startsWith("cookie:")) {
                str3 = T[1].trim();
                substring = T[0].substring(7);
            } else {
                str3 = T[1].trim();
                str2 = C0841i.m1922e(T[0], null, null);
            }
            str2 = C0841i.m1921d(substring);
        } else if (length == 4) {
            str3 = T[3].trim();
            str2 = C0841i.m1922e((String) m2977F(T[0]), (String) m2977F(T[1]), (String) m2977F(T[2]));
        } else if (length == 5) {
            str3 = T[4].trim();
            str2 = C0841i.m1923f((String) m2977F(T[0]), (String) m2977F(T[1]), (String) m2977F(T[2]), (String) m2977F(T[3]));
        } else {
            if (length == 6) {
                trim = T[5].trim();
                h = C0841i.m1924g((String) m2977F(T[0]), (String) m2977F(T[1]), (String) m2977F(T[2]), (String) m2977F(T[3]), m2977F(T[4]).equals(bool));
            } else if (length == 7) {
                trim = T[6].trim();
                h = C0841i.m1925h((String) m2977F(T[0]), (String) m2977F(T[1]), (String) m2977F(T[2]), (String) m2977F(T[3]), m2977F(T[4]).equals(bool), (String) m2977F(T[5]), 20000, 20000, null);
            } else if (length == 10) {
                trim = T[9].trim();
                h = C0841i.m1925h((String) m2977F(T[0]), (String) m2977F(T[1]), (String) m2977F(T[2]), (String) m2977F(T[3]), m2977F(T[4]).equals(bool), (String) m2977F(T[5]), Integer.parseInt(m2978G(T[6])), Integer.parseInt(m2978G(T[7])), m2979H(T[8]));
            } else if (length == 1) {
                T[0] = m2978G(T[0]);
                C0841i.m1921d(T[0]);
                return;
            } else {
                return;
            }
            dim(trim, h);
            return;
        }
        dim(str3, str2);
    }

    @TargetApi(11)
    public void hsas(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            Object F = m2977F(T[0]);
            View w = F instanceof View ? (View) F : m3020w(F, T[0]);
            if (w instanceof WebView) {
                WebView webView = (WebView) w;
                if (Build.VERSION.SDK_INT >= 11) {
                    webView.removeJavascriptInterface("iapp");
                }
                if (m2977F(T[1]).equals(Boolean.TRUE)) {
                    webView.addJavascriptInterface(new C1311iapp(this.f2358a, this.f2361d), "iapp");
                }
            }
        }
    }

    public void huf(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 5) {
            try {
                dim(T[4].trim(), C0841i.m1930m(this.f2358a, m2978G(T[0]), m2978G(T[1]), m2978G(T[2]), m2978G(T[3])));
                return;
            } catch (Exception unused) {
                str2 = T[4];
            }
        } else if (T.length == 6) {
            try {
                dim(T[5].trim(), C0841i.m1931n(this.f2358a, m2978G(T[0]), m2978G(T[1]), m2978G(T[2]), m2978G(T[3]), (String) m2977F(T[4])));
                return;
            } catch (Exception unused2) {
                str2 = T[5];
            }
        } else {
            return;
        }
        dim(str2.trim(), null);
    }

    /* renamed from: hw */
    public void mo10197hw(String str) {
        Intent intent;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 1) {
            intent = new Intent(this.f2358a, Webview.class);
            Bundle bundle = new Bundle();
            bundle.putString("WebURL", m2978G(T[0]));
            intent.putExtras(bundle);
        } else if (length == 3) {
            intent = new Intent(this.f2358a, Webview.class);
            Bundle bundle2 = new Bundle();
            bundle2.putString("WebURL", m2978G(T[0]));
            bundle2.putString("background", m2978G(T[1]));
            bundle2.putString("backgroundShadow", m2978G(T[2]));
            intent.putExtras(bundle2);
        } else {
            return;
        }
        this.f2358a.startActivity(intent);
    }

    public void hws(String str) {
        Intent intent;
        String G = m2978G(m3002c0(str));
        try {
            intent = C0841i.m1934q(this.f2358a, G);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(C0851m.m1977c(this.f2358a, G));
            intent = intent2;
        }
        this.f2358a.startActivity(intent);
    }

    public int if_y2(String str) {
        StringBuilder sb;
        String str2;
        String[] Z = m2996Z(str, '\n');
        String str3 = "";
        int i = 0;
        for (int i2 = 0; i2 < Z.length; i2++) {
            if (Z[i2].equals("{")) {
                i++;
            } else if (Z[i2].equals("}")) {
                i--;
            } else if (i == 0) {
                if (Z[i2].startsWith(C0864v.f1810t[0])) {
                    sb = new StringBuilder();
                    str2 = Z[i2];
                } else {
                    if (Z[i2].startsWith("else")) {
                        String trim = Z[i2].substring(4).trim();
                        if (trim.startsWith("f(")) {
                            str3 = C0864v.f1810t[0] + trim.substring(2) + "\n";
                        } else {
                            sb = new StringBuilder();
                            str2 = Z[i2];
                        }
                    }
                }
                sb.append(str2);
                sb.append("\n");
                str3 = sb.toString();
            }
            str3 = str3 + Z[i2] + "\n";
            if (i != 0) {
                continue;
            } else if (!str3.startsWith(C0864v.f1810t[0])) {
                int YuGo = YuGo(m3018u(str3));
                if (YuGo == 2) {
                    return 2;
                }
                return YuGo == 1 ? 1 : 0;
            } else if (m2999b(m3004d0(str3))) {
                int YuGo2 = YuGo(m3018u(str3));
                if (YuGo2 == 2) {
                    return 2;
                }
                return YuGo2 == 1 ? 1 : 0;
            }
        }
        return 0;
    }

    /* renamed from: is */
    public boolean mo10200is(int i) {
        return i == 2 || i == -1;
    }

    public void java(String str) {
        Object[] objArr;
        Object obj = null;
        String u = str.endsWith("}") ? m3018u(str) : null;
        String[] T = m2990T(m3004d0(str));
        int length = T.length;
        if (length > 2) {
            if (length > 3) {
                Object[] objArr2 = new Object[(length - 3)];
                for (int i = 3; i < length; i++) {
                    objArr2[i - 3] = m2977F(T[i]);
                }
                objArr = objArr2;
            } else {
                objArr = null;
            }
            try {
                obj = C0832d.m1822g(this.f2358a, m2977F(T[1]), m2978G(T[2]), objArr, u == null ? null : this, u);
            } catch (Throwable th) {
                th.printStackTrace();
                m3000b0(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f2362e), str));
            }
            dim(T[0].trim(), obj);
        }
    }

    public void javacb(String str) {
        Object obj;
        String u = m3018u(str);
        String[] T = m2990T(m3004d0(str));
        Class cls = (Class) m2977F(T[1]);
        try {
            obj = C0832d.m1830o(cls.getClassLoader(), cls, this, u);
        } catch (Throwable th) {
            th.printStackTrace();
            m3000b0(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f2362e), str));
            obj = null;
        }
        dim(T[0].trim(), obj);
    }

    public void javags(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            Object obj = null;
            try {
                obj = C0832d.m1825j(m2977F(T[1]), m2978G(T[2]));
            } catch (Throwable th) {
                th.printStackTrace();
                m3000b0(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f2362e), str));
            }
            dim(T[0].trim(), obj);
        } else if (length == 4) {
            Object F = m2977F(T[2]);
            dim(T[0].trim(), F instanceof Class ? C0832d.m1824i(m2977F(T[1]), (Class) F, m2978G(T[3])) : C0832d.m1826k(m2977F(T[1]), F.toString(), m2978G(T[3])));
        }
    }

    public void javanew(String str) {
        Object[] objArr;
        Object obj = null;
        String u = str.endsWith("}") ? m3018u(str) : null;
        String[] T = m2990T(m3004d0(str));
        int length = T.length;
        if (length > 1) {
            if (length > 2) {
                objArr = new Object[(length - 2)];
                for (int i = 2; i < length; i++) {
                    objArr[i - 2] = m2977F(T[i]);
                }
            } else {
                objArr = null;
            }
            Object F = m2977F(T[1]);
            try {
                obj = F instanceof Class ? C0832d.m1828m(this.f2358a, (Class) F, objArr, u == null ? null : this, u) : C0832d.m1829n(this.f2358a, F.toString(), objArr, u == null ? null : this, u);
            } catch (Throwable th) {
                th.printStackTrace();
                m3000b0(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f2362e), str));
            }
            dim(T[0].trim(), obj);
        }
    }

    public void javass(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object obj = null;
        if (length == 4) {
            try {
                obj = C0832d.m1831p(m2977F(T[1]), m2978G(T[2]), m2977F(T[3]));
            } catch (Throwable th) {
                th.printStackTrace();
                m3000b0(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f2362e), str));
            }
            str2 = T[0];
        } else if (length == 5) {
            Object F = m2977F(T[2]);
            try {
                obj = Boolean.valueOf(F instanceof Class ? C0832d.m1832q(m2977F(T[1]), (Class) F, m2978G(T[3]), m2977F(T[4])) : C0832d.m1833r(m2977F(T[1]), F.toString(), m2978G(T[3]), m2977F(T[4])));
            } catch (Throwable th2) {
                th2.printStackTrace();
                m3000b0(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f2362e), str));
            }
            str2 = T[0];
        } else {
            return;
        }
        dim(str2.trim(), obj);
    }

    public void javax(String str) {
        Object[] objArr;
        Object obj = null;
        String u = str.endsWith("}") ? m3018u(str) : null;
        String[] T = m2990T(m3004d0(str));
        int length = T.length;
        if (length > 3) {
            if (length > 4) {
                Object[] objArr2 = new Object[(length - 4)];
                for (int i = 4; i < length; i++) {
                    objArr2[i - 4] = m2977F(T[i]);
                }
                objArr = objArr2;
            } else {
                objArr = null;
            }
            Object F = m2977F(T[2]);
            try {
                obj = F instanceof Class ? C0832d.m1820e(this.f2358a, m2977F(T[1]), (Class) F, m2978G(T[3]), objArr, u == null ? null : this, u) : C0832d.m1821f(this.f2358a, m2977F(T[1]), F.toString(), m2978G(T[3]), objArr, u == null ? null : this, u);
            } catch (Throwable th) {
                th.printStackTrace();
                m3000b0(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f2362e), str));
            }
            dim(T[0].trim(), obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void json(String str) {
        String str2;
        String trim;
        JSONObject jSONObject;
        String trim2;
        Object obj;
        String trim3;
        Object jSONArray;
        int i;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            try {
                dim(T[1].trim(), new JSONObject(m2978G(T[0])));
            } catch (JSONException e) {
                e.printStackTrace();
                str2 = T[0];
            }
        } else {
            if (length == 3) {
                Object F = m2977F(T[1]);
                if (F.equals("size")) {
                    Object F2 = m2977F(T[0]);
                    if (F2 instanceof JSONObject) {
                        trim3 = T[2].trim();
                        i = ((JSONObject) F2).length();
                    } else if (F2 instanceof JSONArray) {
                        trim3 = T[2].trim();
                        i = ((JSONArray) F2).length();
                    } else {
                        trim3 = T[2].trim();
                        i = -1;
                    }
                    jSONArray = Integer.valueOf(i);
                } else if (F.equals("del")) {
                    Object F3 = m2977F(T[0]);
                    if (F3 instanceof JSONObject) {
                        ((JSONObject) F3).remove(m2978G(T[2]));
                        return;
                    } else if ((F3 instanceof JSONArray) && Build.VERSION.SDK_INT >= 19) {
                        ((JSONArray) F3).remove(m3001c(m2978G(T[2])));
                        return;
                    } else {
                        return;
                    }
                } else if (F.equals("json")) {
                    Object F4 = m2977F(T[0]);
                    if (F4 instanceof JSONObject) {
                        trim3 = T[2].trim();
                        jSONArray = ((JSONObject) F4).toString();
                    } else if (F4 instanceof JSONArray) {
                        trim3 = T[2].trim();
                        jSONArray = ((JSONArray) F4).toString();
                    } else {
                        str2 = T[2];
                    }
                } else {
                    return;
                }
                dim(trim3, jSONArray);
                return;
            } else if (length == 4) {
                Object F5 = m2977F(T[1]);
                if (F5.equals("get")) {
                    Object F6 = m2977F(T[0]);
                    try {
                        if (F6 instanceof JSONObject) {
                            trim2 = T[3].trim();
                            obj = ((JSONObject) F6).get(m2978G(T[2]));
                        } else if (F6 instanceof JSONArray) {
                            trim2 = T[3].trim();
                            obj = ((JSONArray) F6).get(m3001c(m2978G(T[2])));
                        } else {
                            dim(T[3].trim(), null);
                            return;
                        }
                        dim(trim2, obj);
                        return;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        str2 = T[3];
                    }
                } else if (F5.equals("set")) {
                    Object F7 = m2977F(T[0]);
                    try {
                        if (F7 instanceof JSONObject) {
                            ((JSONObject) F7).put(m2978G(T[2]), m2977F(T[3]));
                            return;
                        } else if (F7 instanceof JSONArray) {
                            ((JSONArray) F7).put(m3001c(m2978G(T[2])), m2977F(T[3]));
                            return;
                        } else {
                            return;
                        }
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                        return;
                    }
                } else if (F5.equals("list")) {
                    Object F8 = m2977F(T[0]);
                    if (F8 instanceof JSONObject) {
                        try {
                            dim(T[3].trim(), ((JSONObject) F8).getJSONArray(m2978G(T[2])));
                            return;
                        } catch (JSONException e4) {
                            e4.printStackTrace();
                            str2 = T[3];
                        }
                    } else {
                        str2 = T[3];
                    }
                } else if (F5.equals("data")) {
                    Object F9 = m2977F(T[0]);
                    try {
                        if (F9 instanceof JSONObject) {
                            trim = T[3].trim();
                            jSONObject = ((JSONObject) F9).getJSONObject(m2978G(T[2]));
                        } else if (F9 instanceof JSONArray) {
                            trim = T[3].trim();
                            jSONObject = ((JSONArray) F9).getJSONObject(m3001c(m2978G(T[2])));
                        } else {
                            dim(T[3].trim(), null);
                            return;
                        }
                        dim(trim, jSONObject);
                        return;
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                        str2 = T[3];
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            dim(str2.trim(), null);
        }
    }

    public void lan(String str) {
        C0915a.m2418a(this.f2361d, m3001c(m2978G(m2990T(m3002c0(str))[0])));
    }

    public void loadjar(String str) {
        DexClassLoader r;
        String str2;
        Object obj = Boolean.TRUE;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            dim(T[1].trim(), C0839h.m1909r(this.f2358a, m2978G(T[0]), this.f2358a.getClassLoader()));
            return;
        }
        if (length == 3) {
            r = C0839h.m1909r(this.f2358a, m2978G(T[0]), this.f2358a.getClassLoader());
            if (m2977F(T[1]).equals(obj)) {
                C0839h.m1912u(this.f2358a, r);
            }
            str2 = T[2];
        } else if (length == 4) {
            r = C0839h.m1909r(this.f2358a, m2978G(T[0]), (ClassLoader) m2977F(T[2]));
            if (m2977F(T[1]).equals(obj)) {
                C0839h.m1912u(this.f2358a, r);
            }
            str2 = T[3];
        } else {
            return;
        }
        dim(str2.trim(), r);
    }

    public void loadso(String str) {
        C0839h.m1910s(m2978G(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public byte[] mo10211n(String str, char c) {
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

    public void ngde(String str) {
        GradientDrawable gradientDrawable;
        String str2;
        GradientDrawable gradientDrawable2;
        String str3;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            int o = C0860r.m2056o(m2978G(T[0]));
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(o);
            str2 = T[1];
        } else {
            if (T.length == 3) {
                int c = m3001c(m2978G(T[0]));
                int o2 = C0860r.m2056o(m2978G(T[1]));
                gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(o2);
                if (c > 0) {
                    gradientDrawable2.setCornerRadius((float) c);
                }
                str3 = T[2];
            } else if (T.length == 4) {
                int c2 = m3001c(m2978G(T[0]));
                int o3 = C0860r.m2056o(m2978G(T[1]));
                int o4 = C0860r.m2056o(m2978G(T[2]));
                gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(o3);
                if (c2 > 0) {
                    gradientDrawable2.setStroke(c2, o4);
                }
                str3 = T[3];
            } else if (T.length == 5) {
                int c3 = m3001c(m2978G(T[0]));
                int c4 = m3001c(m2978G(T[1]));
                int o5 = C0860r.m2056o(m2978G(T[2]));
                int o6 = C0860r.m2056o(m2978G(T[3]));
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setColor(o5);
                if (c4 > 0) {
                    gradientDrawable3.setCornerRadius((float) c4);
                }
                if (c3 > 0) {
                    gradientDrawable3.setStroke(c3, o6);
                }
                dim(T[4].trim(), gradientDrawable3);
                return;
            } else if (T.length == 6) {
                int c5 = m3001c(m2978G(T[0]));
                int c6 = m3001c(m2978G(T[1]));
                int o7 = C0860r.m2056o(m2978G(T[3]));
                String[] Z = m2996Z(m2978G(T[2]), '|');
                int[] iArr = new int[Z.length];
                for (int i = 0; i < Z.length; i++) {
                    iArr[i] = C0860r.m2056o(Z[i]);
                }
                gradientDrawable = new GradientDrawable(m2981K(m2978G(T[4])), iArr);
                if (c6 > 0) {
                    gradientDrawable.setCornerRadius((float) c6);
                }
                if (c5 > 0) {
                    gradientDrawable.setStroke(c5, o7);
                }
                str2 = T[5];
            } else {
                return;
            }
            dim(str3.trim(), gradientDrawable2);
            return;
        }
        dim(str2.trim(), gradientDrawable);
    }

    public void nslist(String str) {
        dim(m3002c0(str).trim(), new ArrayList());
    }

    public void nsz(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            dim(T[1].trim(), new Object[m3001c(m2978G(T[0]))]);
        } else if (length == 3) {
            int c = m3001c(m2978G(T[0]));
            Object F = m2977F(T[1]);
            if (F instanceof String) {
                dim(T[2].trim(), Array.newInstance(C0832d.m1817b(F.toString()), c));
            } else if (F instanceof Class) {
                dim(T[2].trim(), Array.newInstance((Class) F, c));
            } else {
                dim(T[2].trim(), null);
            }
        }
    }

    public void nuibs(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 4) {
            dim(T[3].trim(), new C0917c(this.f2358a).mo9109d(m2977F(T[0]), m2977F(T[1]), m2977F(T[2])));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void nvw(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.nvw(java.lang.String):void");
    }

    public void openRestoreinterface(String str, ViewGroup viewGroup, int i, Object obj) {
        Context context = this.f2358a;
        C0916b bVar = new C0916b(context);
        bVar.f1974a = 0;
        C0839h.m1888D(this, context, str, viewGroup, i, obj, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openRestoreinterfaceX(java.lang.String r8, android.view.ViewGroup r9, int r10, java.lang.Object r11, p013b.p048c.p049a.C0916b r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.openRestoreinterfaceX(java.lang.String, android.view.ViewGroup, int, java.lang.Object, b.c.a.b, java.lang.String):void");
    }

    public void otob(String str) {
        byte[] bArr;
        String str2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        byte[] bArr2 = null;
        int i = 0;
        if (length == 2) {
            byte[] t = C0839h.m1911t(this.f2358a, m2978G(T[0]));
            if (t == null) {
                str2 = T[1];
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int length2 = t.length;
                while (i < length2) {
                    byte b = t[i];
                    stringBuffer.append(' ');
                    stringBuffer.append((int) b);
                    i++;
                }
                dim(T[1].trim(), stringBuffer.toString().trim());
                return;
            }
        } else if (length == 3) {
            Object F = m2977F(T[0]);
            if (F == null) {
                bArr = m2978G(T[1]).getBytes();
            } else {
                try {
                    bArr = m2978G(T[1]).getBytes(F.toString());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    bArr = null;
                }
            }
            if (bArr == null) {
                str2 = T[2];
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                int length3 = bArr.length;
                while (i < length3) {
                    byte b2 = bArr[i];
                    stringBuffer2.append(' ');
                    stringBuffer2.append((int) b2);
                    i++;
                }
                dim(T[2].trim(), stringBuffer2.toString().trim());
                return;
            }
        } else if (length == 4) {
            Object F2 = m2977F(T[0]);
            if (F2.equals("file")) {
                dim(T[3].trim(), C0839h.m1911t(this.f2358a, m2978G(T[2])));
                return;
            } else if (F2.equals("str")) {
                Object F3 = m2977F(T[1]);
                if (F3 == null) {
                    bArr2 = m2978G(T[2]).getBytes();
                } else {
                    try {
                        bArr2 = m2978G(T[2]).getBytes(F3.toString());
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                }
                dim(T[3].trim(), bArr2);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        dim(str2.trim(), null);
    }

    public void res(String str) {
        Object obj;
        String str2;
        String str3;
        String str4;
        C1310i iVar;
        String trim;
        Object c;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 1) {
            trim = T[0].trim();
            c = new C1310i(this.f2358a);
        } else if (length == 2) {
            dim(T[1].trim(), new C1310i(this.f2358a, mo10114I(m2978G(T[0]))));
            return;
        } else if (length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof C1310i) {
                Object F2 = m2977F(T[1]);
                if (F2.equals("asset")) {
                    trim = T[2].trim();
                    c = ((C1310i) F).mo11947a();
                } else if (F2.equals("resources")) {
                    trim = T[2].trim();
                    c = ((C1310i) F).mo11949c();
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (length == 4) {
                Object F3 = m2977F(T[0]);
                if (F3 instanceof C1310i) {
                    str2 = T[3].trim();
                    iVar = (C1310i) F3;
                    str4 = m2978G(T[1]);
                    str3 = T[2];
                } else {
                    return;
                }
            } else if (length == 5) {
                Object F4 = m2977F(T[0]);
                if (!(F4 instanceof C1310i)) {
                    return;
                }
                if (m2977F(T[3]).equals(Boolean.TRUE)) {
                    str2 = T[4].trim();
                    obj = Integer.valueOf(((C1310i) F4).mo11948b(m2978G(T[1]), m2978G(T[2])));
                    dim(str2, obj);
                    return;
                }
                str2 = T[4].trim();
                iVar = (C1310i) F4;
                str4 = m2978G(T[1]);
                str3 = T[2];
            } else {
                return;
            }
            obj = iVar.mo11950d(str4, m2978G(str3));
            dim(str2, obj);
            return;
        }
        dim(trim, c);
    }

    /* renamed from: s */
    public void mo10221s(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] Z = m2996Z(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : Z) {
            str2 = str2.replace(" " + str3.trim() + " ", m2978G(str3));
        }
        long j = -1;
        try {
            j = (long) C1017h.m2796f(str2).mo9936a();
        } catch (C1027e e) {
            e.printStackTrace();
        }
        dim(substring.substring(indexOf + 1).trim(), Long.valueOf(j));
    }

    /* renamed from: s2 */
    public void mo10222s2(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] Z = m2996Z(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : Z) {
            str2 = str2.replace(" " + str3.trim() + " ", m2978G(str3));
        }
        double d = -1.0d;
        try {
            d = C1017h.m2796f(str2).mo9936a();
        } catch (C1027e e) {
            e.printStackTrace();
        }
        dim(substring.substring(indexOf + 1).trim(), String.format("%.2f", Double.valueOf(d)));
    }

    public void sbp(String str) {
        Object createBitmap;
        String str2;
        String str3;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object F = m2977F(T[0]);
        Bitmap v = F instanceof Bitmap ? (Bitmap) F : C0839h.m1913v(this.f2358a, String.valueOf(F));
        if (length != 2) {
            if (length == 6) {
                if (v == null) {
                    str3 = T[5];
                } else {
                    createBitmap = Bitmap.createBitmap(v, m3001c(m2978G(T[1])), m3001c(m2978G(T[2])), m3001c(m2978G(T[3])), m3001c(m2978G(T[4])));
                    str2 = T[5];
                }
            } else if (length != 7) {
                return;
            } else {
                if (v == null) {
                    str3 = T[6];
                } else {
                    Matrix matrix = new Matrix();
                    matrix.preRotate((float) m3001c(m2978G(T[5])));
                    createBitmap = Bitmap.createBitmap(v, m3001c(m2978G(T[1])), m3001c(m2978G(T[2])), m3001c(m2978G(T[3])), m3001c(m2978G(T[4])), matrix, true);
                    str2 = T[6];
                }
            }
            dim(str2.trim(), createBitmap);
            return;
        } else if (v == null) {
            str3 = T[1];
        } else {
            dim(T[1].trim(), v);
            return;
        }
        dim(str3.trim(), null);
    }

    public void scheng(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            trim = T[1].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[1])) * Double.parseDouble(m2978G(T[0])));
        } else if (length == 3) {
            trim = T[2].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[0])) * Double.parseDouble(m2978G(T[1])));
        } else if (length == 4 && m2977F(T[2]).equals(Boolean.TRUE)) {
            trim = T[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2978G(T[0])) * Double.parseDouble(m2978G(T[1])));
            dim(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        dim(trim, valueOf);
    }

    public void schu(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            trim = T[1].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[1])) / Double.parseDouble(m2978G(T[0])));
        } else if (length == 3) {
            trim = T[2].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[0])) / Double.parseDouble(m2978G(T[1])));
        } else if (length == 4 && m2977F(T[2]).equals(Boolean.TRUE)) {
            trim = T[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2978G(T[0])) / Double.parseDouble(m2978G(T[1])));
            dim(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        dim(trim, valueOf);
    }

    public void sdeg(String str) {
        C0864v.f1811u = Integer.parseInt(m2978G(m2990T(m3002c0(str))[0]));
    }

    /* renamed from: se */
    public void mo10227se(String str) {
        String str2;
        Object obj;
        String trim;
        Object group;
        int end;
        int end2;
        boolean find;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object F = m2977F(T[0]);
        if (F instanceof Matcher) {
            Matcher matcher = (Matcher) F;
            String G = m2978G(T[1]);
            if (G.equals("sral")) {
                trim = T[3].trim();
                group = matcher.replaceAll(m2978G(T[2]));
            } else if (G.equals("srft")) {
                trim = T[3].trim();
                group = matcher.replaceFirst(m2978G(T[2]));
            } else {
                if (G.equals("ms")) {
                    str2 = T[2].trim();
                    find = matcher.matches();
                } else if (!G.equals("find")) {
                    if (G.equals("gl")) {
                        str2 = T[2].trim();
                        end = matcher.groupCount();
                    } else {
                        if (G.equals("start")) {
                            if (length == 4) {
                                trim = T[3].trim();
                                end2 = matcher.start(m3001c(m2978G(T[2])));
                            } else {
                                str2 = T[2].trim();
                                end = matcher.start();
                            }
                        } else if (G.equals("end")) {
                            if (length == 4) {
                                trim = T[3].trim();
                                end2 = matcher.end(m3001c(m2978G(T[2])));
                            } else {
                                str2 = T[2].trim();
                                end = matcher.end();
                            }
                        } else if (!G.equals("group")) {
                            return;
                        } else {
                            if (length == 4) {
                                trim = T[3].trim();
                                group = matcher.group(m3001c(m2978G(T[2])));
                            } else {
                                str2 = T[2].trim();
                                obj = matcher.group();
                            }
                        }
                        group = Integer.valueOf(end2);
                    }
                    obj = Integer.valueOf(end);
                } else if (length == 4) {
                    trim = T[3].trim();
                    group = Boolean.valueOf(matcher.find(m3001c(m2978G(T[2]))));
                } else {
                    str2 = T[2].trim();
                    find = matcher.find();
                }
                obj = Boolean.valueOf(find);
            }
            dim(trim, group);
            return;
        } else if (F instanceof String) {
            obj = Pattern.compile(m2978G(T[1]), m3001c(m2978G(T[2]))).matcher(String.valueOf(F));
            str2 = T[3].trim();
        } else {
            return;
        }
        dim(str2, obj);
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

    public void sgsz(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            try {
                dim(T[2].trim(), Array.get(m2977F(T[0]), m3001c(m2978G(T[1]))));
            } catch (Exception e) {
                e.printStackTrace();
                dim(T[2].trim(), null);
            }
        }
    }

    public void sgszl(String str) {
        String[] T = m2990T(m3002c0(str));
        try {
            dim(T[1].trim(), Integer.valueOf(Array.getLength(m2977F(T[0]))));
        } catch (Exception e) {
            e.printStackTrace();
            dim(T[1].trim(), -1);
        }
    }

    public void shb(String str) {
        String c0 = m3002c0(str);
        CharSequence text = ((ClipboardManager) this.f2358a.getSystemService("clipboard")).getText();
        dim(c0.trim(), text == null ? null : text.toString());
    }

    public void simei(String str) {
        dim(m3002c0(str).trim(), C0860r.m2058q(this.f2358a));
    }

    public void simsi(String str) {
        String c0 = m3002c0(str);
        try {
            dim(c0.trim(), ((TelephonyManager) this.f2358a.getSystemService("phone")).getSubscriberId());
        } catch (Exception e) {
            e.printStackTrace();
            dim(c0.trim(), null);
        }
    }

    public void siof(String str) {
        String trim;
        int indexOf;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 4) {
            trim = T[3].trim();
            indexOf = m2978G(T[0]).indexOf(m2978G(T[1]), m3001c(m2978G(T[2])));
        } else if (T.length == 3) {
            trim = T[2].trim();
            indexOf = m2978G(T[0]).indexOf(m2978G(T[1]));
        } else {
            return;
        }
        dim(trim, Integer.valueOf(indexOf));
    }

    public void sit(String str) {
        Intent intent;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        String G = m2978G(T[1]);
        if (F instanceof Intent) {
            intent = (Intent) F;
        } else {
            intent = new Intent();
            dim(T[0].trim(), intent);
        }
        if (G.equals("action")) {
            intent.setAction(m2978G(T[2]));
        } else if (G.equals("type")) {
            intent.setType(m2978G(T[2]));
        } else if (G.equals("extra")) {
            Object F2 = m2977F(T[3]);
            if (F2 instanceof String[]) {
                intent.putExtra(m2978G(T[2]), (String[]) F2);
            } else if (F2 instanceof Boolean) {
                intent.putExtra(m2978G(T[2]), F2.equals(Boolean.TRUE));
            } else if (F2 instanceof Integer) {
                intent.putExtra(m2978G(T[2]), Integer.parseInt(String.valueOf(F2)));
            } else if (F2 instanceof Long) {
                intent.putExtra(m2978G(T[2]), Long.parseLong(String.valueOf(F2)));
            } else {
                intent.putExtra(m2978G(T[2]), String.valueOf(F2));
            }
        } else if (G.equals("flags")) {
            intent.setFlags(m3001c(m2978G(T[2])));
        } else if (G.equals("data")) {
            intent.setData(C0851m.m1977c(this.f2358a, m2978G(T[2])));
        } else if (G.equals("classname")) {
            intent.setClassName(m2978G(T[2]), m2978G(T[3]));
        } else if (G.equals("component")) {
            intent.setComponent(new ComponentName(m2978G(T[2]), m2978G(T[3])));
        }
    }

    /* renamed from: sj */
    public void mo10236sj(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 4) {
            Object F = m2977F(T[1]);
            Object F2 = m2977F(T[2]);
            String str2 = null;
            String valueOf = F2 == null ? null : String.valueOf(F2);
            if (F != null) {
                str2 = String.valueOf(F);
            }
            dim(T[3].trim(), C0860r.m2044c(m2978G(T[0]), str2, valueOf));
        }
    }

    public void sjia(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            trim = T[1].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[1])) + Double.parseDouble(m2978G(T[0])));
        } else if (length == 3) {
            trim = T[2].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[0])) + Double.parseDouble(m2978G(T[1])));
        } else if (length == 4 && m2977F(T[2]).equals(Boolean.TRUE)) {
            trim = T[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2978G(T[0])) + Double.parseDouble(m2978G(T[1])));
            dim(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        dim(trim, valueOf);
    }

    public void sjian(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            trim = T[1].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[1])) - Double.parseDouble(m2978G(T[0])));
        } else if (length == 3) {
            trim = T[2].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[0])) - Double.parseDouble(m2978G(T[1])));
        } else if (length == 4 && m2977F(T[2]).equals(Boolean.TRUE)) {
            trim = T[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2978G(T[0])) - Double.parseDouble(m2978G(T[1])));
            dim(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        dim(trim, valueOf);
    }

    public void sjxx(String str) {
        String c0 = m3002c0(str);
        String[] y = m3022y();
        int[] z = m3023z();
        int[] A = m2973A();
        String[] B = m2974B();
        dim(c0.trim(), new String[]{y[0] + "\n" + y[1], z[0] + "\n" + z[1] + "\n" + A[0] + "\n" + A[1], B[0] + "\n" + B[1] + "\n" + B[2]});
    }

    /* renamed from: sl */
    public void mo10240sl(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            dim(T[2].trim(), C0861s.m2072e(m2978G(T[0]), m2978G(T[1])));
        } else if (length == 4) {
            dim(T[3].trim(), m2977F(T[2]).equals(Boolean.TRUE) ? m2978G(T[0]).split(m2978G(T[1])) : C0861s.m2072e(m2978G(T[0]), m2978G(T[1])));
        }
    }

    public void slg(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Integer.valueOf(m2978G(T[0]).length()));
    }

    public void slof(String str) {
        String trim;
        int lastIndexOf;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 4) {
            trim = T[3].trim();
            lastIndexOf = m2978G(T[0]).lastIndexOf(m2978G(T[1]), m3001c(m2978G(T[2])));
        } else if (T.length == 3) {
            trim = T[2].trim();
            lastIndexOf = m2978G(T[0]).lastIndexOf(m2978G(T[1]));
        } else {
            return;
        }
        dim(trim, Integer.valueOf(lastIndexOf));
    }

    public void slower(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), m2978G(T[0]).toLowerCase());
    }

    /* renamed from: sn */
    public void mo10244sn(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] Z = m2996Z(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : Z) {
            str2 = str2.replace(" " + str3.trim() + " ", m2978G(str3));
        }
        double d = -1.0d;
        try {
            d = C1017h.m2796f(str2).mo9936a();
        } catch (C1027e e) {
            e.printStackTrace();
        }
        dim(substring.substring(indexOf + 1).trim(), Double.valueOf(d));
    }

    public void sot(String str) {
        String trim;
        Object v;
        int u;
        Object obj = Boolean.TRUE;
        String[] T = m2990T(m3004d0(str));
        int length = T.length;
        if (length == 6) {
            String u2 = m3018u(str);
            C0855q qVar = new C0855q(m3001c(m2978G(T[0])), mo10114I(m2978G(T[1])), m3001c(m2978G(T[2])), m3001c(m2978G(T[3])), m2977F(T[4]).equals(obj));
            qVar.mo8955F(new C1077i0(u2));
            dim(T[5].trim(), qVar);
        } else if (length == 5) {
            String u3 = m3018u(str);
            C0855q qVar2 = new C0855q(m2978G(T[0]), m3001c(m2978G(T[1])), m3001c(m2978G(T[2])), m2977F(T[3]).equals(obj));
            qVar2.mo8955F(new C1079j0(u3));
            dim(T[4].trim(), qVar2);
        } else if (length == 4) {
            if (m2977F(T[1]).equals("list")) {
                Object F = m2977F(T[0]);
                if (F instanceof C0855q) {
                    dim(T[3].trim(), ((C0855q) F).mo8953A(m3001c(m2978G(T[2]))));
                }
            }
        } else if (length == 3) {
            Object F2 = m2977F(T[0]);
            if (F2 instanceof C0855q) {
                Object F3 = m2977F(T[1]);
                if (F3.equals("str")) {
                    ((C0855q) F2).mo8957b(m2978G(T[2]));
                } else if (F3.equals("file")) {
                    ((C0855q) F2).mo8956a(new File(mo10114I(m2978G(T[2]))));
                } else if (F3.equals("bt")) {
                    ((C0855q) F2).mo8958c(mo10211n(m2978G(T[2]), ' '));
                } else if (F3.equals("bt2")) {
                    ((C0855q) F2).mo8959d((byte[]) m2977F(T[2]));
                } else {
                    if (F3.equals("ip")) {
                        trim = T[2].trim();
                        v = Boolean.valueOf(((C0855q) F2).mo8954B());
                    } else {
                        if (F3.equals("id")) {
                            trim = T[2].trim();
                            u = ((C0855q) F2).mo8961t();
                        } else if (F3.equals("list")) {
                            trim = T[2].trim();
                            v = ((C0855q) F2).mo8964w();
                        } else if (F3.equals("size")) {
                            trim = T[2].trim();
                            u = ((C0855q) F2).mo8962u();
                        } else if (F3.equals("server")) {
                            trim = T[2].trim();
                            v = ((C0855q) F2).mo8963v();
                        } else if (F3.equals("new")) {
                            ((C0855q) F2).f1776c = m2977F(T[2]).equals(obj);
                            return;
                        } else {
                            return;
                        }
                        v = Integer.valueOf(u);
                    }
                    dim(trim, v);
                }
            }
        } else if (length == 2 && m2977F(T[1]).equals("re")) {
            Object F4 = m2977F(T[0]);
            if (F4 instanceof C0855q) {
                ((C0855q) F4).mo8960s();
            }
        }
    }

    public void sota(String str) {
        String trim;
        Object h;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof C0855q.C0858c) {
                Object F2 = m2977F(T[1]);
                if (F2.equals("str")) {
                    ((C0855q.C0858c) F).mo8968b(m2978G(T[2]));
                } else if (F2.equals("file")) {
                    ((C0855q.C0858c) F).mo8967a(new File(mo10114I(m2978G(T[2]))));
                } else if (F2.equals("bt")) {
                    ((C0855q.C0858c) F).mo8969c(mo10211n(m2978G(T[2]), ' '));
                } else if (F2.equals("bt2")) {
                    ((C0855q.C0858c) F).mo8970d((byte[]) m2977F(T[2]));
                } else {
                    if (F2.equals("ip")) {
                        trim = T[2].trim();
                        h = Boolean.valueOf(((C0855q.C0858c) F).mo8975k());
                    } else if (F2.equals("id")) {
                        trim = T[2].trim();
                        h = Integer.valueOf(((C0855q.C0858c) F).mo8973i());
                    } else if (F2.equals("socket")) {
                        trim = T[2].trim();
                        h = ((C0855q.C0858c) F).mo8974j();
                    } else if (F2.equals("ht")) {
                        trim = T[2].trim();
                        h = ((C0855q.C0858c) F).mo8972h();
                    } else {
                        return;
                    }
                    dim(trim, h);
                }
            }
        } else if (length == 2 && m2977F(T[1]).equals("re")) {
            Object F3 = m2977F(T[0]);
            if (F3 instanceof C0855q.C0858c) {
                ((C0855q.C0858c) F3).mo8971g();
            }
        }
    }

    public void sql(String str) {
        Object obj;
        String str2;
        boolean z;
        String str3;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object F = m2977F(T[0]);
        SQLiteDatabase sQLiteDatabase = F instanceof SQLiteDatabase ? (SQLiteDatabase) F : null;
        if (length == 2) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(m2978G(T[0]));
            }
        } else if (length != 3) {
            if (length == 4) {
                Object F2 = m2977F(T[2]);
                if (F2.equals("ip")) {
                    str2 = T[3].trim();
                    z = C0854p.m1992i(sQLiteDatabase, m2978G(T[1]));
                } else if (F2.equals("del")) {
                    str2 = T[3].trim();
                    z = C0854p.m1988e(sQLiteDatabase, m2978G(T[1]));
                } else {
                    return;
                }
            } else if (length == 5) {
                Object F3 = m2977F(T[2]);
                if (F3.equals("add")) {
                    str2 = T[4].trim();
                    z = C0854p.m1985b(sQLiteDatabase, m2978G(T[1]), m2978G(T[3]));
                } else if (F3.equals("del")) {
                    str2 = T[4].trim();
                    z = C0854p.m1987d(sQLiteDatabase, m2978G(T[1]), m2979H(T[3]));
                } else {
                    return;
                }
            } else if (length == 6) {
                Object F4 = m2977F(T[2]);
                if (F4.equals("add")) {
                    str2 = T[5].trim();
                    z = C0854p.m1984a(sQLiteDatabase, m2978G(T[1]), m2978G(T[3]), m2978G(T[4]));
                } else if (F4.equals("up")) {
                    str2 = T[5].trim();
                    z = C0854p.m1993j(sQLiteDatabase, m2978G(T[1]), m2978G(T[3]), m2979H(T[4]));
                } else if (F4.equals("sele")) {
                    str2 = T[5].trim();
                    obj = C0854p.m1991h(sQLiteDatabase, m2978G(T[3]), m2978G(T[1]), m2979H(T[4]));
                    dim(str2, obj);
                } else {
                    return;
                }
            } else {
                return;
            }
            obj = Boolean.valueOf(z);
            dim(str2, obj);
        } else if (sQLiteDatabase != null) {
            try {
                dim(T[2].trim(), sQLiteDatabase.rawQuery(m2978G(T[1]), null));
            } catch (Exception e) {
                e.printStackTrace();
                str3 = T[2];
            }
        } else {
            str3 = T[2];
            dim(str3.trim(), null);
        }
    }

    public void sqlite(String str) {
        String str2;
        Object obj;
        boolean z;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            String G = m2978G(T[1]);
            if (G.equals("re")) {
                Object F = m2977F(T[0]);
                if (F instanceof SQLiteDatabase) {
                    ((SQLiteDatabase) F).close();
                    return;
                }
                return;
            } else if (G.contains("/") || G.contains("\\") || G.startsWith("@") || G.startsWith("$") || G.startsWith("%")) {
                str2 = T[0].trim();
                obj = C0839h.m1917z(this.f2358a, mo10114I(G), false);
            } else {
                str2 = T[0].trim();
                obj = C0839h.m1917z(this.f2358a, G, true);
            }
        } else if (length == 3) {
            Object F2 = m2977F(T[1]);
            if (F2.equals("ip")) {
                String G2 = m2978G(T[0]);
                if (G2.contains("/") || G2.contains("\\") || G2.startsWith("@") || G2.startsWith("$") || G2.startsWith("%")) {
                    str2 = T[2].trim();
                    z = C0839h.m1916y(this.f2358a, mo10114I(G2), false);
                } else {
                    str2 = T[2].trim();
                    z = C0839h.m1916y(this.f2358a, G2, true);
                }
            } else if (F2.equals("del")) {
                String G3 = m2978G(T[0]);
                if (G3.contains("/") || G3.contains("\\") || G3.startsWith("@") || G3.startsWith("$") || G3.startsWith("%")) {
                    str2 = T[2].trim();
                    z = C0839h.m1915x(this.f2358a, mo10114I(G3), false);
                } else {
                    str2 = T[2].trim();
                    z = C0839h.m1915x(this.f2358a, G3, true);
                }
            } else {
                return;
            }
            obj = Boolean.valueOf(z);
        } else {
            return;
        }
        dim(str2, obj);
    }

    public void sqlsele(String str) {
        String trim;
        Object string;
        int position;
        boolean moveToLast;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object F = m2977F(T[0]);
        Object F2 = m2977F(T[1]);
        Cursor cursor = F instanceof Cursor ? (Cursor) F : null;
        if (length == 2) {
            if (F2.equals("re") && cursor != null) {
                cursor.close();
            }
        } else if (length != 3) {
        } else {
            if (F2 instanceof Integer) {
                dim(T[2].trim(), cursor.getString(Integer.parseInt(F2.toString())));
                return;
            }
            if (F2.equals("columncount")) {
                trim = T[2].trim();
                position = cursor.getColumnCount();
            } else if (F2.equals("count")) {
                trim = T[2].trim();
                position = cursor.getCount();
            } else {
                if (F2.equals("next")) {
                    trim = T[2].trim();
                    moveToLast = cursor.moveToNext();
                } else if (F2.equals("previous")) {
                    trim = T[2].trim();
                    moveToLast = cursor.moveToPrevious();
                } else if (F2.equals("first")) {
                    trim = T[2].trim();
                    moveToLast = cursor.moveToFirst();
                } else if (F2.equals("last")) {
                    trim = T[2].trim();
                    moveToLast = cursor.moveToLast();
                } else if (F2.equals("position")) {
                    cursor.moveToPosition(m3001c(m2977F(T[2]).toString()));
                    return;
                } else if (F2.equals("getposition")) {
                    trim = T[2].trim();
                    position = cursor.getPosition();
                } else {
                    trim = T[2].trim();
                    string = cursor.getString(m3001c(F2.toString()));
                    dim(trim, string);
                }
                string = Boolean.valueOf(moveToLast);
                dim(trim, string);
            }
            string = Integer.valueOf(position);
            dim(trim, string);
        }
    }

    /* renamed from: sr */
    public void mo10250sr(String str) {
        String trim;
        String G;
        String G2;
        String str2;
        String replaceAll;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 4) {
            trim = T[3].trim();
            G = m2978G(T[0]);
            G2 = m2978G(T[1]);
            str2 = T[2];
        } else if (length != 5) {
            return;
        } else {
            if (m2977F(T[3]).equals(Boolean.TRUE)) {
                trim = T[4].trim();
                replaceAll = m2978G(T[0]).replaceAll(m2978G(T[1]), m2978G(T[2]));
                dim(trim, replaceAll);
            }
            trim = T[4].trim();
            G = m2978G(T[0]);
            G2 = m2978G(T[1]);
            str2 = T[2];
        }
        replaceAll = G.replace(G2, m2978G(str2));
        dim(trim, replaceAll);
    }

    public void sran(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            dim(T[2].trim(), Integer.valueOf(C0860r.m2048g(m3001c(m2978G(T[0])), m3001c(m2978G(T[1])))));
        }
    }

    /* renamed from: ss */
    public void mo10252ss(String str) {
        String c0 = m3002c0(str);
        int lastIndexOf = c0.lastIndexOf(44);
        String trim = c0.substring(lastIndexOf + 1).trim();
        String str2 = "";
        for (String str3 : m2996Z(c0.substring(0, lastIndexOf).trim(), '+')) {
            Object F = m2977F(str3);
            if (F != null) {
                str2 = str2 + F;
            }
        }
        dim(trim.trim(), str2);
    }

    public void ssg(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 4) {
            try {
                dim(T[3].trim(), m2978G(T[0]).substring(m3001c(m2978G(T[1])), m3001c(m2978G(T[2]))));
            } catch (Exception unused) {
                str2 = T[3];
                dim(str2.trim(), null);
            }
        } else if (T.length == 3) {
            try {
                dim(T[2].trim(), m2978G(T[0]).substring(m3001c(m2978G(T[1]))));
            } catch (Exception unused2) {
                str2 = T[2];
                dim(str2.trim(), null);
            }
        }
    }

    public void ssj(String str) {
        String[] T = m2990T(m3004d0(str));
        if (T.length == 2) {
            String u = m3018u(str);
            Object F = m2977F(T[0]);
            View w = F instanceof View ? (View) F : m3020w(F, T[0]);
            if (w != null) {
                Object[] objArr = (Object[]) w.getTag();
                String G = m2978G(T[1]);
                objArr[2] = m2980J((String) objArr[2], G, u);
                w.setTag(objArr);
                m3011k(w, "<eventItme type=\"" + G + "\">" + u.replace("<", "&lt;").replace(">", "&gt;") + "</eventItme>", null);
            }
        }
    }

    public void sslist(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            ((ArrayList) m2977F(T[0])).set(m3001c(m2978G(T[1])), m2977F(T[2]));
        }
    }

    public void sssz(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            try {
                Array.set(m2977F(T[0]), m3001c(m2978G(T[1])), m2977F(T[2]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stobm(String str) {
        String trim;
        String C;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            trim = T[2].trim();
            C = C0860r.m2038B(m2978G(T[0]), m2978G(T[1]));
        } else if (T.length == 4) {
            trim = T[3].trim();
            C = C0860r.m2039C(m2978G(T[0]), m2978G(T[1]));
        } else {
            return;
        }
        dim(trim, C);
    }

    public void stop(String str) {
        try {
            Thread.sleep((long) m3001c(m2978G(m2990T(m3002c0(str))[0])));
        } catch (InterruptedException unused) {
        }
    }

    public void strim(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), m2978G(T[0]).trim());
    }

    public void supper(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), m2978G(T[0]).toUpperCase());
    }

    public void sutf8to(String str) {
        String trim;
        String E;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            trim = T[1].trim();
            E = C0860r.m2040D(m2978G(T[0]));
        } else if (T.length == 4) {
            trim = T[3].trim();
            E = C0860r.m2041E(m2978G(T[0]), m2978G(T[1]));
        } else {
            return;
        }
        dim(trim, E);
    }

    public void swh(String str) {
        String str2;
        int i;
        Context context;
        Context context2;
        int i2;
        String[] T = m2990T(m3002c0(str));
        int i3 = 0;
        String G = m2978G(T[0]);
        if (G.equals("w")) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            str2 = T[1].trim();
            context2 = this.f2358a;
            i2 = displayMetrics.widthPixels;
        } else {
            if (G.equals("h")) {
                WindowManager.LayoutParams attributes = this.f2361d.getWindow().getAttributes();
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                if ((attributes.flags & 1024) == 1024) {
                    str2 = T[1].trim();
                    context = this.f2358a;
                    i = displayMetrics2.heightPixels;
                } else {
                    str2 = T[1].trim();
                    context = this.f2358a;
                    i = displayMetrics2.heightPixels - m2975D();
                }
            } else {
                if (G.equals("pxw")) {
                    DisplayMetrics displayMetrics3 = new DisplayMetrics();
                    this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics3);
                    str2 = T[1].trim();
                    i3 = displayMetrics3.widthPixels;
                } else if (G.equals("pxh")) {
                    WindowManager.LayoutParams attributes2 = this.f2361d.getWindow().getAttributes();
                    DisplayMetrics displayMetrics4 = new DisplayMetrics();
                    this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics4);
                    if ((attributes2.flags & 1024) == 1024) {
                        str2 = T[1].trim();
                        i3 = displayMetrics4.heightPixels;
                    } else {
                        str2 = T[1].trim();
                        i3 = displayMetrics4.heightPixels - m2975D();
                    }
                } else if (G.equals("pxhh")) {
                    DisplayMetrics displayMetrics5 = new DisplayMetrics();
                    this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics5);
                    str2 = T[1].trim();
                    i3 = displayMetrics5.heightPixels;
                } else if (G.equals("hh")) {
                    DisplayMetrics displayMetrics6 = new DisplayMetrics();
                    this.f2361d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics6);
                    str2 = T[1].trim();
                    context2 = this.f2358a;
                    i2 = displayMetrics6.heightPixels;
                } else if (G.equals("pxztl")) {
                    str2 = T[1].trim();
                    i3 = m2976E();
                } else if (G.equals("pxbvk")) {
                    str2 = T[1].trim();
                    i3 = m3021x();
                } else if (G.equals("ztl")) {
                    str2 = T[1].trim();
                    context = this.f2358a;
                    i = m2976E();
                } else if (G.equals("bvk")) {
                    str2 = T[1].trim();
                    context = this.f2358a;
                    i = m3021x();
                } else {
                    str2 = T[1].trim();
                }
                dim(str2, Integer.valueOf(i3));
            }
            i3 = C0860r.m2064w(context, (float) i);
            dim(str2, Integer.valueOf(i3));
        }
        i3 = C0860r.m2064w(context2, (float) i2);
        dim(str2, Integer.valueOf(i3));
    }

    public void sxb(String str) {
        ((ClipboardManager) this.f2358a.getSystemService("clipboard")).setText(m2978G(m2990T(m3002c0(str))[0]));
    }

    public void syso(String str) {
        C0864v.m2157O2(m2977F(m2990T(m3002c0(str))[0]));
    }

    public void syu(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            trim = T[1].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[1])) % Double.parseDouble(m2978G(T[0])));
        } else if (length == 3) {
            trim = T[2].trim();
            parseDouble = (long) (Double.parseDouble(m2978G(T[0])) % Double.parseDouble(m2978G(T[1])));
        } else if (length == 4 && m2977F(T[2]).equals(Boolean.TRUE)) {
            trim = T[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2978G(T[0])) % Double.parseDouble(m2978G(T[1])));
            dim(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        dim(trim, valueOf);
    }

    /* renamed from: t */
    public void mo10266t(String str) {
        String u = m3018u(str);
        C1067d0 d0Var = new C1067d0();
        this.f2360c.put(String.valueOf(d0Var.getId()), u);
        d0Var.setName("CeShi_" + d0Var.getId());
        d0Var.start();
    }

    public void tcc(String str) {
        String str2;
        Integer num;
        int height;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof Bitmap) {
                String G = m2978G(T[1]);
                if (G.equals("w")) {
                    str2 = T[2].trim();
                    height = ((Bitmap) F).getWidth();
                } else if (G.equals("h")) {
                    str2 = T[2].trim();
                    height = ((Bitmap) F).getHeight();
                } else {
                    return;
                }
                num = Integer.valueOf(height);
            } else {
                str2 = T[2].trim();
                num = null;
            }
            dim(str2, num);
        }
    }

    public void tfz(String str) {
        String str2;
        Bitmap bitmap;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof Bitmap) {
                String G = m2978G(T[1]);
                if (G.equals("x")) {
                    str2 = T[2].trim();
                    bitmap = C0849k.m1966f((Bitmap) F, 0);
                } else if (G.equals("y")) {
                    str2 = T[2].trim();
                    bitmap = C0849k.m1966f((Bitmap) F, 1);
                } else {
                    return;
                }
            } else {
                str2 = T[2].trim();
                bitmap = null;
            }
            dim(str2, bitmap);
        }
    }

    public void time(String str) {
        Formatter formatter;
        String str2;
        String[] T = m2990T(m3002c0(str));
        try {
            dim(T[1].trim(), C0860r.m2062u(m3001c(m2978G(T[0]))));
        } catch (NumberFormatException unused) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(new Date().getTime());
            Formatter formatter2 = new Formatter(Locale.CHINA);
            T[0] = m2978G(T[0]);
            if (T[0].length() == 1) {
                str2 = T[1].trim();
                formatter = formatter2.format("%1$t" + T[0], instance);
            } else {
                str2 = T[1].trim();
                formatter = formatter2.format(T[0], instance);
            }
            dim(str2, formatter.toString());
        }
    }

    public void tot(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            Object F = m2977F(T[0]);
            View w = F instanceof View ? (View) F : m3020w(F, T[0]);
            Bitmap bitmap = null;
            if (w == null) {
                dim(T[1].trim(), null);
                return;
            }
            if (w instanceof ImageView) {
                str2 = T[1].trim();
                bitmap = C0849k.m1961a((ImageView) w);
            } else {
                str2 = T[1].trim();
            }
            dim(str2, bitmap);
        }
    }

    public void tsf(String str) {
        String str2;
        String str3;
        Bitmap bitmap;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof Bitmap) {
                bitmap = C0849k.m1964d((Bitmap) F, (float) m3001c(m2978G(T[1])));
                str3 = T[2];
            } else {
                str2 = T[2];
                dim(str2.trim(), null);
                return;
            }
        } else if (length == 4) {
            Object F2 = m2977F(T[0]);
            if (F2 instanceof Bitmap) {
                bitmap = C0849k.m1965e((Bitmap) F2, m3001c(m2978G(T[1])), m3001c(m2978G(T[2])));
                str3 = T[3];
            } else {
                str2 = T[3];
                dim(str2.trim(), null);
                return;
            }
        } else {
            return;
        }
        dim(str3.trim(), bitmap);
    }

    public void tts(String str) {
        String trim;
        boolean k;
        String str2;
        int i;
        String str3;
        boolean d;
        Object obj = Boolean.FALSE;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 1) {
            str2 = T[0].trim();
            obj = new C1349p(this.f2358a);
        } else if (length == 2) {
            if (m2978G(T[1]).equals("re")) {
                Object F = m2977F(T[0]);
                if (F instanceof C1349p) {
                    ((C1349p) F).mo11995h();
                    str2 = T[0].trim();
                    obj = null;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (length == 3) {
            Object F2 = m2977F(T[0]);
            String G = m2978G(T[1]);
            if (!G.equals("sp")) {
                if (G.equals("ip")) {
                    if (F2 instanceof C1349p) {
                        str2 = T[2].trim();
                        d = ((C1349p) F2).mo11991d();
                    } else {
                        str3 = T[2];
                    }
                } else if (G.equals("is")) {
                    if (F2 instanceof C1349p) {
                        str2 = T[2].trim();
                        obj = Boolean.TRUE;
                    } else {
                        str3 = T[2];
                    }
                } else if (G.equals("ph")) {
                    if (F2 instanceof C1349p) {
                        ((C1349p) F2).mo11993f(Float.parseFloat(m2978G(T[2])));
                        return;
                    }
                    return;
                } else if (G.equals("se")) {
                    if (F2 instanceof C1349p) {
                        ((C1349p) F2).mo11994g(Float.parseFloat(m2978G(T[2])));
                        return;
                    }
                    return;
                } else if (G.equals("lg")) {
                    if (F2 instanceof C1349p) {
                        ((C1349p) F2).mo11992e(m2978G(T[2]));
                        return;
                    }
                    return;
                } else if (G.equals("zt")) {
                    if (F2 instanceof C1349p) {
                        str2 = T[2].trim();
                        i = ((C1349p) F2).mo11990c();
                    } else {
                        str2 = T[2].trim();
                        i = -3;
                    }
                    obj = Integer.valueOf(i);
                } else {
                    return;
                }
                str2 = str3.trim();
            } else if (F2 instanceof C1349p) {
                str2 = T[2].trim();
                d = ((C1349p) F2).mo11997j();
            } else {
                str3 = T[2];
                str2 = str3.trim();
            }
            obj = Boolean.valueOf(d);
        } else if (length == 5) {
            String G2 = m2978G(T[1]);
            if (G2.equals("st")) {
                Object F3 = m2977F(T[0]);
                if (F3 instanceof C1349p) {
                    trim = T[4].trim();
                    k = ((C1349p) F3).mo11996i(m2978G(T[2]), Integer.parseInt(m2978G(T[3])));
                } else {
                    return;
                }
            } else if (G2.equals("ft")) {
                Object F4 = m2977F(T[0]);
                if (F4 instanceof C1349p) {
                    trim = T[4].trim();
                    k = ((C1349p) F4).mo11998k(m2978G(T[2]), mo10114I(m2978G(T[3])));
                } else {
                    return;
                }
            } else {
                dim(T[0].trim(), new C1349p(this.f2358a, m2978G(T[1]), m2978G(T[2]), Float.parseFloat(m2978G(T[3])), Float.parseFloat(m2978G(T[4]))));
                return;
            }
            dim(trim, Boolean.valueOf(k));
            return;
        } else {
            return;
        }
        dim(str2, obj);
    }

    public void turnLightOff(Camera camera) {
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

    public void turnLightOn(Camera camera) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        if (camera != null && (parameters = camera.getParameters()) != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !"torch".equals(parameters.getFlashMode()) && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            camera.setParameters(parameters);
        }
    }

    /* renamed from: tw */
    public void mo10275tw(String str) {
        Toast makeText;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 1) {
            makeText = Toast.makeText(this.f2358a, m2978G(T[0]), 1);
        } else if (T.length == 2) {
            makeText = Toast.makeText(this.f2358a, m2978G(T[0]), Integer.parseInt(m2978G(T[1])));
        } else {
            return;
        }
        makeText.show();
    }

    public void tws(String str) {
        Snackbar snackbar;
        String[] T = m2990T(m3004d0(str));
        int length = T.length;
        if (length == 3) {
            Object F = m2977F(T[0]);
            View findViewById = F == null ? this.f2361d.findViewById(C0839h.f1737a) : F instanceof View ? (View) F : m3020w(F, T[0]);
            if (findViewById != null) {
                snackbar = Snackbar.make(findViewById, m2978G(T[1]), m3001c(m2978G(T[2])));
            } else {
                return;
            }
        } else if (length == 4) {
            Object F2 = m2977F(T[0]);
            View findViewById2 = F2 == null ? this.f2361d.findViewById(C0839h.f1737a) : F2 instanceof View ? (View) F2 : m3020w(F2, T[0]);
            if (findViewById2 != null) {
                snackbar = Snackbar.make(findViewById2, m2978G(T[1]), m3001c(m2978G(T[2]))).setAction(m2978G(T[3]), new View$OnClickListenerC1069e0(m3018u(str)));
            } else {
                return;
            }
        } else {
            return;
        }
        snackbar.show();
    }

    public void tzz(String str) {
        String str2;
        Bitmap bitmap;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 3) {
            Object F = m2977F(T[0]);
            if (F instanceof Bitmap) {
                bitmap = C0849k.m1967g((Bitmap) F, (float) m3001c(m2978G(T[1])));
                str2 = T[2].trim();
            } else {
                str2 = T[2].trim();
                bitmap = null;
            }
            dim(str2, bitmap);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0043 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uall(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = r5.m3002c0(r6)
            java.lang.String[] r6 = m2990T(r6)
            r0 = 0
            r1 = r6[r0]
            java.lang.Object r1 = r5.m2977F(r1)
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            r2 = r6[r0]
            android.view.View r1 = r5.m3020w(r1, r2)
        L_0x001a:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            r2 = r6[r2]
            java.lang.Object r2 = r5.m2977F(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = r2.equals(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002e:
            int r4 = r1.getChildCount()
            if (r0 >= r4) goto L_0x0049
            android.view.View r4 = r1.getChildAt(r0)
            if (r2 == 0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0043:
            r3.add(r4)
            int r0 = r0 + 1
            goto L_0x002e
        L_0x0049:
            r0 = 2
            r6 = r6[r0]
            java.lang.String r6 = r6.trim()
            r5.dim(r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.uall(java.lang.String):void");
    }

    public void uapp(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 2) {
            dim(T[1].trim(), Boolean.valueOf(C0835f.m1859p(this.f2358a, m2978G(T[0]))));
        } else if (length == 3) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(m2978G(T[0]), m2978G(T[1])));
                this.f2358a.startActivity(intent);
                dim(T[2].trim(), Boolean.TRUE);
            } catch (Exception unused) {
                dim(T[2].trim(), Boolean.FALSE);
            }
        }
    }

    public void uapplist(String str) {
        StringBuilder sb;
        String[] T = m2990T(m3002c0(str));
        ArrayList arrayList = new ArrayList();
        boolean equals = m2977F(T[0]).equals(Boolean.TRUE);
        for (PackageInfo packageInfo : this.f2358a.getPackageManager().getInstalledPackages(0)) {
            String str2 = packageInfo.packageName;
            if (equals) {
                sb = new StringBuilder();
            } else if ((1 & packageInfo.applicationInfo.flags) == 0) {
                sb = new StringBuilder();
            }
            sb.append(packageInfo.packageName);
            sb.append("\n");
            sb.append(m2982L(str2));
            sb.append("\n");
            sb.append(packageInfo.applicationInfo.loadLabel(this.f2358a.getPackageManager()).toString());
            sb.append("\n");
            sb.append(packageInfo.versionName);
            arrayList.add(sb.toString());
        }
        dim(T[1].trim(), arrayList.toArray());
    }

    public void uapplistgo(String str) {
        String c0 = m3002c0(str);
        ArrayList arrayList = new ArrayList();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f2358a.getSystemService("activity")).getRunningAppProcesses()) {
            arrayList.add(runningAppProcessInfo.processName + "\n" + runningAppProcessInfo.pid + "\n" + runningAppProcessInfo.uid);
        }
        dim(c0.trim(), arrayList.toArray());
    }

    public void ucall(String str) {
        String G = m2978G(m3002c0(str));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        Context context = this.f2358a;
        intent.setData(C0851m.m1977c(context, "tel:" + G));
        this.f2358a.startActivity(intent);
    }

    public void ufnsui(String str) {
        String u = m3018u(str);
        Message message = new Message();
        message.what = 2;
        message.obj = u;
        this.f2364h.sendMessage(message);
    }

    /* renamed from: ug */
    public void mo10284ug(String str) {
        String str2;
        String trim;
        Object f;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        View w = F instanceof View ? (View) F : m3020w(F, T[0]);
        if (T.length == 3) {
            if (w != null) {
                trim = T[2].trim();
                f = new C1305g(w, this.f2358a).mo11842e(m2978G(T[1]));
            } else {
                str2 = T[2];
                dim(str2.trim(), null);
                return;
            }
        } else if (T.length != 4) {
            return;
        } else {
            if (w != null) {
                trim = T[3].trim();
                f = new C1305g(w, this.f2358a).mo11847f(m2978G(T[1]), m2977F(T[2]));
            } else {
                str2 = T[3];
                dim(str2.trim(), null);
                return;
            }
        }
        dim(trim, f);
    }

    public void uht(String str) {
        MyFragmentStatePagerAdapter myFragmentStatePagerAdapter;
        int i;
        boolean z;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        View w = F instanceof View ? (View) F : m3020w(F, T[0]);
        boolean z2 = w instanceof ViewPager;
        if (z2 || (w instanceof VerticalViewPager)) {
            Object F2 = m2977F(T[1]);
            if (!F2.equals("bd")) {
                PagerAdapter pagerAdapter = null;
                if (z2) {
                    pagerAdapter = ((ViewPager) w).getAdapter();
                } else if (w instanceof VerticalViewPager) {
                    pagerAdapter = ((VerticalViewPager) w).getAdapter();
                }
                if (F2.equals("add")) {
                    int length = T.length;
                    HashMap<Integer, Object> hashMap = new HashMap<>();
                    for (int i2 = 5; i2 < length; i2++) {
                        int indexOf = T[i2].indexOf(61);
                        if (indexOf != -1) {
                            try {
                                hashMap.put(Integer.valueOf(m3001c(m2978G(T[i2].substring(0, indexOf)))), m2977F(T[i2].substring(indexOf + 1)));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    if (pagerAdapter == null || !((z = pagerAdapter instanceof FragmentStatePagerAdapter))) {
                        myFragmentStatePagerAdapter = new MyFragmentStatePagerAdapter(this.f2361d, w.getId(), ((AppCompatActivity) this.f2361d).getSupportFragmentManager());
                        if (z2) {
                            ViewPager viewPager = (ViewPager) w;
                            viewPager.setAdapter(myFragmentStatePagerAdapter);
                            viewPager.setOffscreenPageLimit(5);
                        } else if (w instanceof VerticalViewPager) {
                            VerticalViewPager verticalViewPager = (VerticalViewPager) w;
                            verticalViewPager.setAdapter(myFragmentStatePagerAdapter);
                            verticalViewPager.setOffscreenPageLimit(5);
                        }
                    } else if (z) {
                        myFragmentStatePagerAdapter = (MyFragmentStatePagerAdapter) pagerAdapter;
                    } else {
                        return;
                    }
                    String[] b = C0861s.m2069b(m2978G(T[4]), '|');
                    int length2 = b.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        String trim = b[i3].trim();
                        if (trim.endsWith(".iyu")) {
                            i = i3;
                            myFragmentStatePagerAdapter.mo11524a(m3001c(m2978G(T[2])), m2978G(T[3]), trim, m3013m(trim.substring(0, trim.length() - 4)), hashMap);
                        } else {
                            i = i3;
                        }
                        i3 = i + 1;
                    }
                } else if (F2.equals("del")) {
                    if (pagerAdapter instanceof FragmentStatePagerAdapter) {
                        ((MyFragmentStatePagerAdapter) pagerAdapter).mo11526c(m3001c(m2978G(T[2])));
                    }
                } else if (F2.equals("title")) {
                    if (pagerAdapter instanceof FragmentStatePagerAdapter) {
                        ((MyFragmentStatePagerAdapter) pagerAdapter).mo11528e(m3001c(m2978G(T[2])), m2978G(T[3]));
                    }
                } else if (F2.equals("size")) {
                    if (pagerAdapter instanceof FragmentStatePagerAdapter) {
                        dim(T[2].trim(), Integer.valueOf(((MyFragmentStatePagerAdapter) pagerAdapter).mo11529f()));
                    }
                } else if (F2.equals("close") && (pagerAdapter instanceof FragmentStatePagerAdapter)) {
                    ((MyFragmentStatePagerAdapter) pagerAdapter).mo11525b();
                }
            } else if (z2) {
                Object F3 = m2977F(T[2]);
                View w2 = F3 instanceof View ? (View) F3 : m3020w(F3, T[2]);
                if (w2 instanceof TabLayout) {
                    ((TabLayout) w2).setupWithViewPager((ViewPager) w, m2977F(T[3]).equals(Boolean.TRUE));
                }
            }
        }
    }

    public void uigo(String str) {
        Intent intent;
        Intent intent2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 1) {
            String G = m2978G(T[0]);
            if (G.endsWith(".iyu")) {
                intent2 = new Intent(this.f2358a, mian.class);
            } else if (G.endsWith(".ijava")) {
                intent2 = new Intent(this.f2358a, main3.class);
            } else if (G.endsWith(".ilua")) {
                intent2 = new Intent(this.f2358a, main.class);
            } else if (G.endsWith(".ijs")) {
                intent2 = new Intent(this.f2358a, main2.class);
            } else {
                return;
            }
            intent2.putExtras(C0839h.m1886B(G));
            this.f2358a.startActivity(intent2);
        } else if (length == 2) {
            String G2 = m2978G(T[0]);
            if (G2.endsWith(".iyu")) {
                intent = new Intent(this.f2358a, mian.class);
            } else if (G2.endsWith(".ijava")) {
                intent = new Intent(this.f2358a, main3.class);
            } else if (G2.endsWith(".ilua")) {
                intent = new Intent(this.f2358a, main.class);
            } else if (G2.endsWith(".ijs")) {
                intent = new Intent(this.f2358a, main2.class);
            } else {
                return;
            }
            intent.putExtras(C0839h.m1886B(G2));
            intent.setFlags(m3001c(m2978G(T[1])));
            this.f2358a.startActivity(intent);
        }
    }

    public void uit(String str) {
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        if (F instanceof Intent) {
            Intent intent = (Intent) F;
            if (m2978G(T[1]).equals("chooser")) {
                this.f2358a.startActivity(Intent.createChooser(intent, m2978G(T[2])));
            } else if (m2978G(T[1]).equals("result")) {
                this.f2361d.startActivityForResult(intent, m3001c(m2978G(T[2])));
            } else {
                this.f2358a.startActivity(intent);
            }
        }
    }

    public void ujp(String str) {
        String[] T = m2990T(m3002c0(str));
        C0862t.m2076a(this.f2361d, mo10114I(m2978G(T[0])), m3001c(m2978G(T[1])));
    }

    public void ula(String str) {
        Object F;
        Object obj;
        ArrayList<HashMap<Integer, Object>> a;
        Object obj2;
        String[] T = m2990T(m3002c0(str));
        Object F2 = m2977F(T[0]);
        int length = T.length;
        if (length != 1) {
            if (length == 2) {
                if (!T[1].contains("=") && ((F = m2977F(T[1])) == null || F.equals("clear"))) {
                    if ((F2 instanceof C1083l0) && (obj = ((C1083l0) F2).f2408b) != null) {
                        if (obj instanceof C1085m0) {
                            a = ((C1085m0) obj).mo10335a();
                        } else if (obj instanceof C1088n0) {
                            a = ((C1088n0) obj).mo10343a();
                        } else {
                            return;
                        }
                        a.clear();
                        return;
                    }
                    return;
                }
            } else if (length == 3 && m2978G(T[1]).equals("list")) {
                dim(T[2].trim(), ((F2 == null || !(F2 instanceof C1083l0)) ? new C1083l0(this, null) : (C1083l0) F2).f2407a);
                return;
            }
            C1083l0 l0Var = (F2 == null || !(F2 instanceof C1083l0)) ? new C1083l0(this, null) : (C1083l0) F2;
            HashMap<Integer, Object> hashMap = new HashMap<>();
            for (int i = 1; i < length; i++) {
                int indexOf = T[i].indexOf(61);
                if (indexOf != -1) {
                    try {
                        hashMap.put(Integer.valueOf(m3001c(m2978G(T[i].substring(0, indexOf)))), m2977F(T[i].substring(indexOf + 1)));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            l0Var.f2407a.add(hashMap);
            dim(T[0].trim(), l0Var);
        } else if ((F2 instanceof C1083l0) && (obj2 = ((C1083l0) F2).f2408b) != null) {
            if (obj2 instanceof C1085m0) {
                ((C1085m0) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof ArrayAdapter) {
                ((ArrayAdapter) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof C1088n0) {
                ((C1088n0) obj2).notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d0, code lost:
        if ((r0 instanceof com.iapp.app.Aid_YuCodeX.C1083l0) != false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ulag(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 528
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.ulag(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        if ((r0 instanceof com.iapp.app.Aid_YuCodeX.C1083l0) != false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ulas(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.ulas(java.lang.String):void");
    }

    public void uls(String str) {
        ArrayAdapter arrayAdapter;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        View w = F instanceof View ? (View) F : m3020w(F, T[0]);
        if (w != null) {
            int length = T.length;
            if (w instanceof ListView) {
                ListView listView = (ListView) w;
                Object F2 = m2977F(T[1]);
                if (F2 instanceof C1083l0) {
                    C1083l0 l0Var = (C1083l0) F2;
                    if (l0Var.f2408b == null) {
                        l0Var.f2408b = new C1085m0(this.f2361d);
                    }
                    C1085m0 m0Var = (C1085m0) l0Var.f2408b;
                    m0Var.mo10336b(m2978G(T[2]), l0Var);
                    if (length > 4) {
                        m0Var.mo10337c(m2983M(m2978G(T[3])), m2983M(m2978G(T[4])));
                    }
                    listView.setAdapter((ListAdapter) m0Var);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = l0Var;
                    listView.setTag(objArr);
                }
            } else if (w instanceof GridView) {
                GridView gridView = (GridView) w;
                Object F3 = m2977F(T[1]);
                if (F3 instanceof C1083l0) {
                    C1083l0 l0Var2 = (C1083l0) F3;
                    if (l0Var2.f2408b == null) {
                        l0Var2.f2408b = new C1085m0(this.f2361d);
                    }
                    C1085m0 m0Var2 = (C1085m0) l0Var2.f2408b;
                    m0Var2.mo10336b(m2978G(T[2]), l0Var2);
                    if (length > 4) {
                        m0Var2.mo10337c(m2983M(m2978G(T[3])), m2983M(m2978G(T[4])));
                    }
                    gridView.setAdapter((ListAdapter) m0Var2);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = l0Var2;
                    gridView.setTag(objArr2);
                }
            } else if (w instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) w;
                Object F4 = m2977F(T[1]);
                if (F4 instanceof C1083l0) {
                    C1083l0 l0Var3 = (C1083l0) F4;
                    if (l0Var3.f2408b == null) {
                        l0Var3.f2408b = new C1088n0(this.f2361d);
                    }
                    C1088n0 n0Var = (C1088n0) l0Var3.f2408b;
                    n0Var.mo10346d(m2978G(T[2]), l0Var3);
                    if (length > 4) {
                        n0Var.mo10347e(m2983M(m2978G(T[3])), m2983M(m2978G(T[4])));
                    }
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.f2361d));
                    recyclerView.setAdapter(n0Var);
                    Object[] objArr3 = (Object[]) recyclerView.getTag();
                    objArr3[3] = l0Var3;
                    recyclerView.setTag(objArr3);
                }
            } else if (w instanceof TabLayout) {
                TabLayout tabLayout = (TabLayout) w;
                Object F5 = m2977F(T[1]);
                if (F5 instanceof C1083l0) {
                    C0844j jVar = new C0844j(this.f2361d, 2);
                    String G = m2978G(T[2]);
                    int m = m3013m(G.substring(0, G.length() - 4));
                    Iterator<HashMap<Integer, Object>> it = ((C1083l0) F5).f2407a.iterator();
                    while (it.hasNext()) {
                        HashMap<Integer, Object> next = it.next();
                        LinearLayout linearLayout = new LinearLayout(this.f2361d);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(m2983M(m2978G(T[3])), m2983M(m2978G(T[4]))));
                        linearLayout.setOrientation(1);
                        openRestoreinterface(G, linearLayout, m, next);
                        TabLayout.C1283g newTab = tabLayout.newTab();
                        newTab.mo11607k(linearLayout);
                        tabLayout.addTab(newTab);
                        for (Integer num : next.keySet()) {
                            int parseInt = Integer.parseInt(String.valueOf(num));
                            if (parseInt > 0) {
                                C0839h.m1914w(linearLayout.findViewById(parseInt + m), next.get(Integer.valueOf(parseInt)), next, jVar);
                            }
                        }
                    }
                }
            } else if (w instanceof Spinner) {
                Spinner spinner = (Spinner) w;
                Object F6 = m2977F(T[1]);
                if (F6 instanceof ArrayList) {
                    arrayAdapter = new ArrayAdapter(this.f2358a, 17367048, (ArrayList) F6);
                } else if (F6 instanceof String[]) {
                    arrayAdapter = new ArrayAdapter(this.f2358a, 17367048, (String[]) F6);
                } else if (F6 instanceof Object[]) {
                    arrayAdapter = new ArrayAdapter(this.f2358a, 17367048, (Object[]) F6);
                } else {
                    return;
                }
                arrayAdapter.setDropDownViewResource(17367049);
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            }
        }
    }

    public void uninapp(String str) {
        String[] T = m2990T(m3002c0(str));
        Context context = this.f2358a;
        this.f2358a.startActivity(new Intent("android.intent.action.DELETE", C0851m.m1977c(context, "package:" + m2978G(T[0]))));
    }

    public void uqr(String str) {
        String str2;
        C0716p pVar;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 0) {
            new C0853o(this.f2358a, this.f2361d).mo8948a();
        } else if (length == 1) {
            new C0853o(this.f2358a, this.f2361d).mo8949b(m3001c(m2978G(T[0])));
        } else if (length == 3) {
            dim(T[2].trim(), new C0853o(this.f2358a, this.f2361d).mo8950c(m2978G(T[0]), m3001c(m2978G(T[1]))));
        } else if (length == 2) {
            Object F = m2977F(T[0]);
            if (F instanceof Bitmap) {
                str2 = T[1].trim();
                pVar = new C0853o(this.f2358a, this.f2361d).mo8951d((Bitmap) F);
            } else {
                str2 = T[1].trim();
                pVar = new C0853o(this.f2358a, this.f2361d).mo8952e(mo10114I(String.valueOf(F)));
            }
            dim(str2, pVar.mo8696f());
        }
    }

    public void urvw(String str) {
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        View w = F instanceof View ? (View) F : m3020w(F, T[0]);
        if (w != null) {
            ((ViewGroup) w.getParent()).removeView(w);
        }
    }

    /* renamed from: us */
    public void mo10296us(String str) {
        View view;
        String str2;
        String trim;
        boolean h0;
        Activity activity;
        int i;
        String[] T = m2990T(m3002c0(str));
        int i2 = 0;
        Object F = m2977F(T[0]);
        if (F instanceof View) {
            view = (View) F;
        } else {
            View w = m3020w(F, T[0]);
            int indexOf = T[0].indexOf(46);
            if (indexOf == -1 || T[0].indexOf(34) != -1) {
                String valueOf = String.valueOf(F);
                int indexOf2 = valueOf.indexOf(46);
                if (indexOf2 != -1) {
                    String substring = valueOf.substring(0, indexOf2);
                    String substring2 = valueOf.substring(indexOf2 + 1);
                    Object obj = f2353i.get(substring);
                    if (obj != null) {
                        i2 = Integer.parseInt(String.valueOf(obj));
                        activity = this.f2361d;
                        i = Integer.parseInt(substring2) + i2;
                    }
                } else {
                    activity = this.f2361d;
                    i = Integer.parseInt(valueOf);
                }
                view = activity.findViewById(i);
            } else {
                String substring3 = T[0].substring(0, indexOf);
                String substring4 = T[0].substring(indexOf + 1);
                Object obj2 = f2353i.get(substring3);
                if (obj2 != null) {
                    i2 = Integer.parseInt(String.valueOf(obj2));
                    view = this.f2361d.findViewById(Integer.parseInt(substring4) + i2);
                }
            }
            view = w;
        }
        if (T.length != 3) {
            if (T.length == 4) {
                if (view != null) {
                    trim = T[3].trim();
                    h0 = new C1305g(view, this.f2358a, i2).mo11843e0(m2978G(T[1]), m2977F(T[2]));
                } else {
                    str2 = T[3];
                    dim(str2.trim(), null);
                    return;
                }
            } else if (T.length == 5) {
                if (view != null) {
                    trim = T[4].trim();
                    h0 = new C1305g(view, this.f2358a, i2).mo11848f0(m2978G(T[1]), m2978G(T[2]), m2978G(T[3]));
                } else {
                    str2 = T[4];
                    dim(str2.trim(), null);
                    return;
                }
            } else if (T.length == 6) {
                if (view != null) {
                    trim = T[5].trim();
                    h0 = new C1305g(view, this.f2358a, i2).mo11852g0(m2978G(T[1]), m2978G(T[2]), m2978G(T[3]), m2978G(T[4]));
                } else {
                    str2 = T[5];
                    dim(str2.trim(), null);
                    return;
                }
            } else if (T.length != 7) {
                return;
            } else {
                if (view != null) {
                    trim = T[6].trim();
                    h0 = new C1305g(view, this.f2358a, i2).mo11856h0(m2978G(T[1]), m2978G(T[2]), m2978G(T[3]), m2978G(T[4]), m2978G(T[5]));
                } else {
                    str2 = T[6];
                    dim(str2.trim(), null);
                    return;
                }
            }
            dim(trim, Boolean.valueOf(h0));
        } else if (view != null) {
            new C1305g(view, this.f2358a, i2).mo11843e0(m2978G(T[1]), m2977F(T[2]));
        }
    }

    public void usg(String str) {
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            T[0] = T[0].trim();
            try {
                if (m2977F(T[1]).equals(Boolean.TRUE)) {
                    Object F = m2977F(T[0]);
                    if (F instanceof Camera) {
                        ((Camera) F).release();
                    }
                    Camera open = Camera.open();
                    dim(T[0], open);
                    turnLightOn(open);
                    return;
                }
                Object F2 = m2977F(T[0]);
                if (F2 instanceof Camera) {
                    Camera camera = (Camera) F2;
                    turnLightOff(camera);
                    camera.release();
                    dim(T[0], null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void ushsp(String str) {
        int i = 0;
        if (!m2977F(m2990T(m3002c0(str))[0]).equals(Boolean.TRUE)) {
            i = 1;
            if (this.f2361d.getRequestedOrientation() == 1) {
                return;
            }
        } else if (this.f2361d.getRequestedOrientation() == 0) {
            return;
        }
        this.f2361d.setRequestedOrientation(i);
    }

    public void usjxm(String str) {
        if (m2977F(m2990T(m3002c0(str))[0]).equals(Boolean.TRUE)) {
            this.f2361d.getWindow().clearFlags(128);
        } else {
            this.f2361d.getWindow().setFlags(128, 128);
        }
    }

    public void usms(String str) {
        String[] T = m2990T(m3002c0(str));
        Context context = this.f2358a;
        Intent intent = new Intent("android.intent.action.SENDTO", C0851m.m1977c(context, "smsto:" + m2978G(T[0])));
        intent.putExtra("sms_body", m2978G(T[1]));
        this.f2358a.startActivity(intent);
    }

    public void usx(String str) {
        Boolean bool = Boolean.TRUE;
        String[] T = m2990T(m3002c0(str));
        Object F = m2977F(T[0]);
        if (F instanceof C1319k) {
            C1319k kVar = (C1319k) F;
            Object F2 = m2977F(T[1]);
            if (F2.equals("shot")) {
                kVar.mo11961q(mo10114I(m2978G(T[2])), m3001c(m2978G(T[3])), m2977F(T[4]).equals(bool));
            } else if (F2.equals("st")) {
                kVar.mo11966y();
            } else if (F2.equals("sp")) {
                kVar.mo11967z();
            } else if (F2.equals("re")) {
                kVar.mo11963u();
            } else if (F2.equals("rotaing")) {
                kVar.mo11964w(m3001c(m2978G(T[2])));
            } else if (F2.equals("getrotaing")) {
                dim(T[2].trim(), Integer.valueOf(kVar.mo11962r()));
            } else if (F2.equals("usg")) {
                kVar.mo11965x(m2977F(T[2]).equals(bool));
            }
        }
    }

    public void usxh(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            Object F = m2977F(T[1]);
            View w = F instanceof View ? (View) F : m3020w(F, T[1]);
            if (w instanceof SurfaceView) {
                dim(T[0].trim(), new C1319k(this.f2358a, this.f2361d, (SurfaceView) w, false, m3001c(m2978G(T[2]))));
                return;
            }
            str2 = T[0];
        } else if (length == 6) {
            Object F2 = m2977F(T[1]);
            View w2 = F2 instanceof View ? (View) F2 : m3020w(F2, T[1]);
            if (w2 instanceof SurfaceView) {
                dim(T[0].trim(), new C1319k(this.f2358a, this.f2361d, (SurfaceView) w2, false, m3001c(m2978G(T[2])), m3001c(m2978G(T[3])), m3001c(m2978G(T[4])), m3001c(m2978G(T[5]))));
                return;
            }
            str2 = T[0];
        } else {
            return;
        }
        dim(str2.trim(), null);
    }

    public void usxq(String str) {
        String str2;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 3) {
            Object F = m2977F(T[1]);
            View w = F instanceof View ? (View) F : m3020w(F, T[1]);
            if (w instanceof SurfaceView) {
                dim(T[0].trim(), new C1319k(this.f2358a, this.f2361d, (SurfaceView) w, true, m3001c(m2978G(T[2]))));
                return;
            }
            str2 = T[0];
        } else if (length == 6) {
            Object F2 = m2977F(T[1]);
            View w2 = F2 instanceof View ? (View) F2 : m3020w(F2, T[1]);
            if (w2 instanceof SurfaceView) {
                dim(T[0].trim(), new C1319k(this.f2358a, this.f2361d, (SurfaceView) w2, true, m3001c(m2978G(T[2])), m3001c(m2978G(T[3])), m3001c(m2978G(T[4])), m3001c(m2978G(T[5]))));
                return;
            }
            str2 = T[0];
        } else {
            return;
        }
        dim(str2.trim(), null);
    }

    public void utb(String str) {
        String trim;
        int height;
        Object valueOf;
        CharSequence subtitle;
        Boolean bool = Boolean.TRUE;
        String[] T = m2990T(m3004d0(str));
        int length = T.length;
        if (length == 1) {
            Object F = m2977F(T[0]);
            View w = F instanceof View ? (View) F : m3020w(F, T[0]);
            if (w != null && (w instanceof Toolbar)) {
                ((AppCompatActivity) this.f2361d).setSupportActionBar((Toolbar) w);
            }
        } else if (length == 2) {
            Object F2 = m2977F(T[0]);
            View w2 = F2 instanceof View ? (View) F2 : m3020w(F2, T[0]);
            if (w2 != null && (w2 instanceof Toolbar)) {
                Object F3 = m2977F(T[1]);
                View w3 = F3 instanceof View ? (View) F3 : m3020w(F3, T[1]);
                if (w3 != null && (w3 instanceof DrawerLayout)) {
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setHomeButtonEnabled(true);
                    DrawerLayout drawerLayout = (DrawerLayout) w3;
                    String obj = ((Object[]) drawerLayout.getTag())[2].toString();
                    C1071f0 f0Var = new C1071f0(this.f2361d, drawerLayout, (Toolbar) w2, 0, 0, C0860r.m2044c(obj, "<eventItme type=\"ondrawerclosed\">", "</eventItme>"), drawerLayout, C0860r.m2044c(obj, "<eventItme type=\"$__tag_namexml_\">", "</eventItme>"), C0860r.m2044c(obj, "<eventItme type=\"ondraweropened\">", "</eventItme>"), C0860r.m2044c(obj, "<eventItme type=\"onoptionsitemselected\">", "</eventItme>"));
                    drawerLayout.setDrawerListener(f0Var);
                    f0Var.syncState();
                }
            }
        } else if (length == 3) {
            Object F4 = m2977F(T[0]);
            Object F5 = m2977F(T[1]);
            if (F4.equals("get")) {
                if (F5.equals("sab")) {
                    trim = T[2].trim();
                    valueOf = ((AppCompatActivity) this.f2361d).getSupportActionBar();
                } else {
                    if (F5.equals("title")) {
                        trim = T[2].trim();
                        subtitle = ((AppCompatActivity) this.f2361d).getSupportActionBar().getTitle();
                    } else if (F5.equals("subtitle")) {
                        trim = T[2].trim();
                        subtitle = ((AppCompatActivity) this.f2361d).getSupportActionBar().getSubtitle();
                    } else if (F5.equals("cv")) {
                        trim = T[2].trim();
                        valueOf = ((AppCompatActivity) this.f2361d).getSupportActionBar().getCustomView();
                    } else {
                        if (F5.equals("do")) {
                            trim = T[2].trim();
                            height = ((AppCompatActivity) this.f2361d).getSupportActionBar().getDisplayOptions();
                        } else if (F5.equals("height")) {
                            trim = T[2].trim();
                            height = ((AppCompatActivity) this.f2361d).getSupportActionBar().getHeight();
                        } else {
                            return;
                        }
                        valueOf = Integer.valueOf(height);
                    }
                    valueOf = String.valueOf(subtitle);
                }
                dim(trim, valueOf);
                return;
            }
            if (F4.equals("set")) {
                if (F5.equals("title")) {
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setTitle(m2978G(T[2]));
                }
                if (F5.equals("subtitle")) {
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setSubtitle(m2978G(T[2]));
                    return;
                } else if (F5.equals("cv")) {
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setCustomView((View) m2977F(T[2]));
                    return;
                } else if (F5.equals("do")) {
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setDisplayOptions(m3001c(m2978G(T[2])));
                    return;
                } else if (F5.equals("dste")) {
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setDisplayShowTitleEnabled(m2977F(T[2]).equals(bool));
                    return;
                } else if (F5.equals("dsce")) {
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setDisplayShowCustomEnabled(m2977F(T[2]).equals(bool));
                    return;
                } else if (F5.equals("dshe")) {
                    boolean equals = m2977F(T[2]).equals(bool);
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setHomeButtonEnabled(equals);
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setDisplayShowHomeEnabled(equals);
                    ((AppCompatActivity) this.f2361d).getSupportActionBar().setDisplayHomeAsUpEnabled(equals);
                    return;
                } else if (F5.equals("leftck")) {
                    Object F6 = m2977F(T[2]);
                    View w4 = F6 instanceof View ? (View) F6 : m3020w(F6, T[2]);
                    if (w4 != null && (w4 instanceof Toolbar)) {
                        ((Toolbar) w4).setNavigationOnClickListener(new View$OnClickListenerC1073g0(m3018u(str)));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (F4.equals("left")) {
                View w5 = F5 instanceof View ? (View) F5 : m3020w(F5, T[1]);
                if (w5 != null && (w5 instanceof Toolbar)) {
                    ((Toolbar) w5).setNavigationIcon(C1305g.m3582m(m2978G(T[2]), this.f2358a));
                } else {
                    return;
                }
            } else if (F4.equals("right")) {
                View w6 = F5 instanceof View ? (View) F5 : m3020w(F5, T[1]);
                if (w6 != null && (w6 instanceof Toolbar)) {
                    ((Toolbar) w6).setOverflowIcon(C1305g.m3582m(m2978G(T[2]), this.f2358a));
                    return;
                }
                return;
            } else {
                return;
            }
            ((AppCompatActivity) this.f2361d).getSupportActionBar().setHomeButtonEnabled(true);
            ((AppCompatActivity) this.f2361d).getSupportActionBar().setDisplayShowHomeEnabled(true);
            ((AppCompatActivity) this.f2361d).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f9, code lost:
        if (m2977F(r3[5]).equals(r2) != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0288, code lost:
        if (m2977F(r3[4]).equals(r2) != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ff, code lost:
        if (m2977F(r3[3]).equals(r2) != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0312, code lost:
        r0 = r0.create();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void utw(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 796
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_YuCodeX.utw(java.lang.String):void");
    }

    public void uxf(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        View view = null;
        if (length == 1) {
            Object F = m2977F(T[0]);
            if (F instanceof View) {
                view = (View) F;
            }
            if (view != null) {
                ((WindowManager) this.f2358a.getApplicationContext().getSystemService("window")).updateViewLayout(view, view.getLayoutParams());
            }
        } else if (length == 2) {
            if (m2977F(T[1]).equals("del")) {
                Object F2 = m2977F(T[0]);
                if (F2 instanceof View) {
                    view = (View) F2;
                }
                if (view != null) {
                    ((WindowManager) this.f2358a.getApplicationContext().getSystemService("window")).removeView(view);
                }
            }
        } else if (length == 5) {
            try {
                String G = m2978G(T[0]);
                LinearLayout linearLayout = new LinearLayout(this.f2358a);
                linearLayout.setOrientation(1);
                int m = m3013m(G.substring(0, G.length() - 4));
                linearLayout.setId(m);
                openRestoreinterface(G, linearLayout, m, null);
                View childAt = linearLayout.getChildAt(0);
                linearLayout.removeAllViews();
                C0862t.m2080e(this.f2358a, childAt, 0, 0, m3001c(m2978G(T[1])), m3001c(m2978G(T[2])), 0, C1305g.m3587t(m2978G(T[3])), 0, 0);
                dim(T[4].trim(), childAt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (length == 7) {
            if (m2977F(T[1]).equals("set")) {
                Object F3 = m2977F(T[0]);
                if (F3 instanceof View) {
                    view = (View) F3;
                }
                if (view != null) {
                    WindowManager windowManager = (WindowManager) this.f2358a.getApplicationContext().getSystemService("window");
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                    layoutParams.x = (int) Float.parseFloat(m2978G(T[2]));
                    layoutParams.y = (int) Float.parseFloat(m2978G(T[3]));
                    int c = m3001c(m2978G(T[4]));
                    if (c == 0) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = c;
                    }
                    int c2 = m3001c(m2978G(T[5]));
                    if (c2 == 0) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = c2;
                    }
                    layoutParams.gravity = C1305g.m3587t(m2978G(T[6]));
                    view.setLayoutParams(layoutParams);
                    windowManager.updateViewLayout(view, layoutParams);
                }
            }
        } else if (length == 10) {
            Object F4 = m2977F(T[0]);
            if (!(F4 instanceof View)) {
                String valueOf = String.valueOf(F4);
                LinearLayout linearLayout2 = new LinearLayout(this.f2358a);
                linearLayout2.setOrientation(1);
                int m2 = m3013m(valueOf.substring(0, valueOf.length() - 4));
                linearLayout2.setId(m2);
                openRestoreinterface(valueOf, linearLayout2, m2, null);
                View childAt2 = linearLayout2.getChildAt(0);
                linearLayout2.removeAllViews();
                C0862t.m2080e(this.f2358a, childAt2, (int) Float.parseFloat(m2978G(T[1])), (int) Float.parseFloat(m2978G(T[2])), m3001c(m2978G(T[3])), m3001c(m2978G(T[4])), m3001c(m2978G(T[5])), C1305g.m3587t(m2978G(T[6])), m3001c(m2978G(T[7])), m3001c(m2978G(T[8])));
                dim(T[9].trim(), childAt2);
            } else if (m2977F(T[1]).equals("set")) {
                View view2 = (View) F4;
                WindowManager windowManager2 = (WindowManager) this.f2358a.getApplicationContext().getSystemService("window");
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) view2.getLayoutParams();
                layoutParams2.x = (int) Float.parseFloat(m2978G(T[2]));
                layoutParams2.y = (int) Float.parseFloat(m2978G(T[3]));
                int c3 = m3001c(m2978G(T[4]));
                if (c3 == 0) {
                    layoutParams2.width = -2;
                } else {
                    layoutParams2.width = c3;
                }
                int c4 = m3001c(m2978G(T[5]));
                if (c4 == 0) {
                    layoutParams2.height = -2;
                } else {
                    layoutParams2.height = c4;
                }
                int c5 = m3001c(m2978G(T[6]));
                if (c5 == 0) {
                    c5 = C0862t.m2081f();
                }
                layoutParams2.type = c5;
                layoutParams2.gravity = C1305g.m3587t(m2978G(T[7]));
                int c6 = m3001c(m2978G(T[8]));
                if (c6 == 0) {
                    c6 = 40;
                } else if (c6 == 1) {
                    c6 = 32;
                }
                layoutParams2.flags = c6;
                int c7 = m3001c(m2978G(T[9]));
                if (c7 == 0) {
                    c7 = -3;
                }
                layoutParams2.format = c7;
                view2.setLayoutParams(layoutParams2);
                windowManager2.updateViewLayout(view2, layoutParams2);
            }
        }
    }

    public void uycl(String str) {
        Boolean bool = Boolean.TRUE;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length == 1) {
            if (m2977F(T[0]).equals(bool)) {
                this.f2361d.getWindow().clearFlags(2048);
                this.f2361d.getWindow().setFlags(1024, 1024);
                return;
            }
            this.f2361d.getWindow().addFlags(2048);
        } else if (length == 2) {
            C0862t.m2078c(this.f2361d, C0860r.m2056o(m2978G(T[0])), m2977F(T[1]).equals(bool), this.f2361d.findViewById(C0839h.f1737a));
        } else if (length == 3) {
            C0862t.m2079d(this.f2361d, C0860r.m2056o(m2978G(T[0])), m2977F(T[1]).equals(bool), this.f2361d.findViewById(C0839h.f1737a), m3001c(m2978G(T[2])));
        }
    }

    @TargetApi(11)
    public void uzd(String str) {
        Vibrator vibrator;
        String str2;
        Object obj;
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        Object F = m2977F(T[0]);
        if (F instanceof Vibrator) {
            vibrator = (Vibrator) F;
        } else {
            vibrator = (Vibrator) this.f2358a.getSystemService("vibrator");
            dim(T[0].trim(), vibrator);
        }
        int i = 1;
        if (length == 2) {
            Object F2 = m2977F(T[1]);
            if (F2.equals("sp")) {
                try {
                    vibrator.cancel();
                } catch (Exception unused) {
                }
                str2 = T[0].trim();
                obj = null;
            } else {
                vibrator.vibrate((long) m3001c(String.valueOf(F2)));
                return;
            }
        } else if (length == 3) {
            Object F3 = m2977F(T[1]);
            if (!F3.equals("ip")) {
                String[] Z = m2996Z(String.valueOf(F3), ' ');
                int length2 = Z.length;
                long[] jArr = new long[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    try {
                        jArr[i2] = (long) Integer.parseInt(Z[i2]);
                    } catch (NumberFormatException unused2) {
                        jArr[i2] = 0;
                    }
                }
                if (!m2977F(T[2]).equals(Boolean.TRUE)) {
                    i = -1;
                }
                vibrator.vibrate(jArr, i);
                return;
            } else if (Build.VERSION.SDK_INT >= 11) {
                str2 = T[2].trim();
                obj = Boolean.valueOf(vibrator.hasVibrator());
            } else {
                str2 = T[2].trim();
                obj = Boolean.FALSE;
            }
        } else {
            return;
        }
        dim(str2, obj);
    }

    /* renamed from: w */
    public int mo10309w(String str) {
        String d0 = m3004d0(str);
        String u = m3018u(str);
        while (m2999b(d0)) {
            int YuGo = YuGo(u);
            if (YuGo != 2) {
                if (YuGo == 1) {
                    break;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }

    public void yul(String str) {
        View p;
        String[] T = m2990T(m3002c0(str));
        if (T.length == 2) {
            Object F = m2977F(T[0]);
            if (String.valueOf(F).endsWith(".yul")) {
                dim(T[1].trim(), C0839h.m1907p(this.f2358a, String.valueOf(F)));
                return;
            }
            Object F2 = m2977F(T[1]);
            if (String.valueOf(F2).endsWith(".yul")) {
                View w = F instanceof View ? (View) F : m3020w(F, T[0]);
                if (w != null && (p = C0839h.m1907p(this.f2358a, String.valueOf(F2))) != null) {
                    ((ViewGroup) w).addView(p);
                }
            }
        }
    }

    public void zdp(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Integer.valueOf(C0860r.m2053l(this.f2358a, (float) m3001c(m2978G(T[0])))));
    }

    /* renamed from: zj */
    public void mo10312zj(String str) {
        String[] T = m2990T(m3002c0(str));
        int length = T.length;
        if (length > 1) {
            Object[] objArr = new Object[length];
            objArr[0] = "Activity";
            objArr[1] = this.f2358a;
            if (length > 2) {
                for (int i = 2; i < length; i++) {
                    objArr[i] = m2977F(T[i]);
                }
            }
            dim(T[0].trim(), C0839h.m1905n(m2978G(T[1]), objArr));
        }
    }

    public void zpd(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Integer.valueOf(C0860r.m2064w(this.f2358a, (float) m3001c(m2978G(T[0])))));
    }

    public void zps(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Integer.valueOf(C0860r.m2065x(this.f2358a, (float) m3001c(m2978G(T[0])))));
    }

    public void zsp(String str) {
        String[] T = m2990T(m3002c0(str));
        dim(T[1].trim(), Integer.valueOf(C0860r.m2037A(this.f2358a, (float) m3001c(m2978G(T[0])))));
    }
}
