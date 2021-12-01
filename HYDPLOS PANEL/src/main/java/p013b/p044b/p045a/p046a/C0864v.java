package p013b.p044b.p045a.p046a;

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
import android.webkit.WebView;
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
import bsh.org.objectweb.asm.Constants;
import com.iapp.app.Aid_YuCodeX;
import com.iapp.app.Aid_javaCode;
import com.iapp.app.Aid_jsCode;
import com.iapp.app.Aid_luaCode;
import com.iapp.app.C1293a;
import com.iapp.app.C1295c;
import com.iapp.app.C1298d;
import com.iapp.app.C1305g;
import com.iapp.app.C1309h;
import com.iapp.app.C1310i;
import com.iapp.app.C1311iapp;
import com.iapp.app.C1312j;
import com.iapp.app.C1319k;
import com.iapp.app.C1325l;
import com.iapp.app.C1334m;
import com.iapp.app.C1340n;
import com.iapp.app.C1343o;
import com.iapp.app.C1349p;
import com.iapp.app.C1352q;
import com.iapp.app.C1437s;
import com.iapp.app.DownList;
import com.iapp.app.MyFragmentStatePagerAdapter;
import com.iapp.app.TabLayout;
import com.iapp.app.Videoview;
import com.iapp.app.Webview;
import com.iapp.app.logoActivity;
import com.iapp.app.p067x5.AbstractC1442a;
import com.iapp.app.p067x5.C1443b;
import com.iapp.app.p067x5.C1469c;
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
import p013b.p044b.p045a.p046a.C0855q;
import p013b.p044b.p045a.p046a.p047y.C0911c;
import p013b.p048c.p049a.C0915a;
import p013b.p048c.p049a.C0916b;
import p013b.p048c.p049a.C0917c;
import p013b.p050d.p051a.AbstractC0918a;
import p013b.p050d.p051a.C0921c;
import p013b.p050d.p051a.C0934i;
import p059c.p060a.C1017h;
import p059c.p061b.C1027e;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;

@SuppressLint({"HandlerLeak"})
/* renamed from: b.b.a.a.v */
public class C0864v {

    /* renamed from: j */
    public static HashMap<String, Object> f1800j = new HashMap<>();

    /* renamed from: k */
    public static HashMap<String, Object> f1801k;

    /* renamed from: l */
    public static HashMap<String, Object> f1802l = new HashMap<>();

    /* renamed from: m */
    public static String f1803m = "\n\niAppV3.0 2018版 -数据调试工具";

    /* renamed from: n */
    public static AlertDialog f1804n = null;

    /* renamed from: o */
    public static int f1805o = 3;

    /* renamed from: p */
    private static HashMap<String, Object> f1806p = new HashMap<>();

    /* renamed from: q */
    private static int f1807q = 0;

    /* renamed from: r */
    private static HashMap<Integer, String> f1808r = new HashMap<>();

    /* renamed from: s */
    private static C0864v f1809s = null;

    /* renamed from: t */
    public static String[] f1810t = null;

    /* renamed from: u */
    public static int f1811u = 0;

    /* renamed from: a */
    private HashMap<String, Object> f1812a = new HashMap<>();

    /* renamed from: b */
    private HashMap<String, Object> f1813b = new HashMap<>();

    /* renamed from: c */
    private Activity f1814c = null;

    /* renamed from: d */
    private Context f1815d = null;

    /* renamed from: e */
    private int f1816e;

    /* renamed from: f */
    private int f1817f;

    /* renamed from: g */
    private int f1818g = -1;

    /* renamed from: h */
    private C0864v f1819h = null;

    /* renamed from: i */
    private Handler f1820i = null;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$a */
    public class DialogInterface$OnClickListenerC0865a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1821a;

        DialogInterface$OnClickListenerC0865a(String str) {
            this.f1821a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f1821a;
            if (str != null) {
                C0864v.this.mo8984e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$a0 */
    public class C0866a0 implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a */
        final /* synthetic */ String f1823a;

        C0866a0(String str) {
            this.f1823a = str;
        }

        @Override // android.support.design.widget.AppBarLayout.OnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (this.f1823a != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(appBarLayout.getId()));
                vVar.mo8981T("st_vW", appBarLayout);
                vVar.mo8981T("st_vO", Integer.valueOf(i));
                vVar.mo8985f(this.f1823a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$b */
    public class DialogInterface$OnClickListenerC0867b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1825a;

        DialogInterface$OnClickListenerC0867b(String str) {
            this.f1825a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f1825a;
            if (str != null) {
                C0864v.this.mo8984e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$b0 */
    public class C0868b0 implements AbstractC1442a {
        C0868b0(C0864v vVar) {
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
    /* renamed from: b.b.a.a.v$c */
    public class DialogInterface$OnClickListenerC0869c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1827a;

        DialogInterface$OnClickListenerC0869c(String str) {
            this.f1827a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f1827a;
            if (str != null) {
                C0864v.this.mo8984e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$c0 */
    public class C0870c0 extends Thread {
        C0870c0() {
        }

        public void run() {
            C0864v vVar = C0864v.this;
            vVar.mo8984e(vVar.f1813b.get(String.valueOf(getId())).toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$d */
    public class DialogInterface$OnClickListenerC0871d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1830a;

        DialogInterface$OnClickListenerC0871d(String str) {
            this.f1830a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f1830a;
            if (str != null) {
                C0864v.this.mo8984e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$d0 */
    public class View$OnClickListenerC0872d0 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1832a;

        View$OnClickListenerC0872d0(String str) {
            this.f1832a = str;
        }

        public void onClick(View view) {
            C0864v.this.mo8984e(this.f1832a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$e */
    public class DialogInterface$OnClickListenerC0873e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1834a;

        DialogInterface$OnClickListenerC0873e(String str) {
            this.f1834a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f1834a;
            if (str != null) {
                C0864v.this.mo8984e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$e0 */
    public class C0874e0 extends ActionBarDrawerToggle {

        /* renamed from: a */
        final /* synthetic */ String f1836a;

        /* renamed from: b */
        final /* synthetic */ DrawerLayout f1837b;

        /* renamed from: c */
        final /* synthetic */ String f1838c;

        /* renamed from: d */
        final /* synthetic */ String f1839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0874e0(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2, String str, DrawerLayout drawerLayout2, String str2, String str3) {
            super(activity, drawerLayout, toolbar, i, i2);
            this.f1836a = str;
            this.f1837b = drawerLayout2;
            this.f1838c = str2;
            this.f1839d = str3;
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerClosed(View view) {
            if (this.f1836a != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1837b.getId()));
                vVar.mo8981T("st_vW", this.f1837b);
                vVar.mo8981T("st_dW", view);
                vVar.mo8985f(this.f1836a);
            }
        }

        @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener, android.support.p012v7.app.ActionBarDrawerToggle
        public void onDrawerOpened(View view) {
            if (this.f1838c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1837b.getId()));
                vVar.mo8981T("st_vW", this.f1837b);
                vVar.mo8981T("st_dW", view);
                vVar.mo8985f(this.f1838c);
            }
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (this.f1839d == null) {
                return false;
            }
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(this.f1837b.getId()));
            vVar.mo8981T("st_vW", this.f1837b);
            vVar.mo8981T("st_iM", menuItem);
            vVar.mo8985f(this.f1839d);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$f */
    public class DialogInterface$OnClickListenerC0875f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1841a;

        DialogInterface$OnClickListenerC0875f(String str) {
            this.f1841a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f1841a;
            if (str != null) {
                C0864v.this.mo8984e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$f0 */
    public class View$OnClickListenerC0876f0 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f1843a;

        View$OnClickListenerC0876f0(String str) {
            this.f1843a = str;
        }

        public void onClick(View view) {
            C0864v.this.mo8984e(this.f1843a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$g */
    public class View$OnClickListenerC0877g implements View.OnClickListener {
        View$OnClickListenerC0877g() {
        }

        public void onClick(View view) {
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
            vVar.mo8981T("st_vW", view);
            vVar.mo8985f(C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"clicki\">", "</eventItme>"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$g0 */
    public class C0878g0 extends WebChromeClient {
        C0878g0(C0864v vVar) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$h */
    public class View$OnTouchListenerC0879h implements View.OnTouchListener {
        View$OnTouchListenerC0879h() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
            vVar.mo8981T("st_vW", view);
            vVar.mo8981T("st_eA", Integer.valueOf(motionEvent.getAction()));
            vVar.mo8981T("st_eX", Float.valueOf(motionEvent.getX()));
            vVar.mo8981T("st_eY", Float.valueOf(motionEvent.getY()));
            vVar.mo8981T("st_rX", Float.valueOf(motionEvent.getRawX()));
            vVar.mo8981T("st_rY", Float.valueOf(motionEvent.getRawY()));
            return C0864v.this.m2180U0(vVar, "touchmonitor", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$h0 */
    public class C0880h0 implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ String f1847a;

        C0880h0(String str) {
            this.f1847a = str;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            C0864v vVar = C0864v.this;
            vVar.mo8981T("st_msG", vVar.m2117G0(obj));
            C0864v.this.mo8981T("st_ssR", cVar);
            C0864v.this.mo8985f(this.f1847a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$i */
    public class View$OnLongClickListenerC0881i implements View.OnLongClickListener {
        View$OnLongClickListenerC0881i() {
        }

        public boolean onLongClick(View view) {
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
            vVar.mo8981T("st_vW", view);
            return C0864v.this.m2180U0(vVar, "press", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$i0 */
    public class C0882i0 implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ String f1850a;

        C0882i0(String str) {
            this.f1850a = str;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            C0864v vVar = C0864v.this;
            vVar.mo8981T("st_msG", vVar.m2117G0(obj));
            C0864v.this.mo8981T("st_ssR", cVar);
            C0864v.this.mo8985f(this.f1850a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$j */
    public class View$OnKeyListenerC0883j implements View.OnKeyListener {
        View$OnKeyListenerC0883j() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
            vVar.mo8981T("st_vW", view);
            vVar.mo8981T("st_kC", Integer.valueOf(i));
            vVar.mo8981T("st_eA", Integer.valueOf(keyEvent.getAction()));
            vVar.mo8981T("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
            return C0864v.this.m2180U0(vVar, "keyboard", ((Object[]) view.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$j0 */
    public class C0884j0 implements OnFileDownStatusListener {
        C0884j0() {
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void complete(int i, Object obj) {
            if (obj != null) {
                C0864v.this.mo8981T("st_drJ", Integer.valueOf(i));
                C0864v.this.mo8985f(obj.toString());
            }
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void resultStatus(int i, int i2, Object obj) {
            if (obj != null) {
                C0864v.this.mo8981T("st_drD", Integer.valueOf(i));
                C0864v.this.mo8981T("st_drI", Integer.valueOf(i2));
                C0864v.this.mo8985f(obj.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$k */
    public class HandlerC0885k extends Handler {
        HandlerC0885k(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(C0864v.this.f1815d, message.obj.toString(), 1).show();
            } else if (i == 2) {
                C0864v.this.mo8984e(message.obj.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.b.a.a.v$k0 */
    public class C0886k0 {

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> f1855a;

        /* renamed from: b */
        public Object f1856b;

        private C0886k0(C0864v vVar) {
            this.f1855a = new ArrayList<>();
            this.f1856b = null;
        }

        /* synthetic */ C0886k0(C0864v vVar, HandlerC0885k kVar) {
            this(vVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$l */
    public class View$OnCreateContextMenuListenerC0887l implements View.OnCreateContextMenuListener {
        View$OnCreateContextMenuListenerC0887l() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            String c = C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"pressmenu\">", "</eventItme>");
            contextMenu.setHeaderTitle(C0860r.m2044c(c, "title:", "\n"));
            C0864v.f1808r.clear();
            String[] split = c.split("\ncase ");
            for (int i = 1; i < split.length; i++) {
                contextMenu.add(0, i, 0, C0860r.m2044c(split[i], null, ":"));
                C0864v.f1808r.put(Integer.valueOf(i), C0860r.m2044c(split[i], ":", "\nbreak"));
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            C0864v unused = C0864v.f1809s = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            C0864v.f1809s.mo8981T("st_vId", Integer.valueOf(view.getId()));
            C0864v.f1809s.mo8981T("st_vW", view);
            if (c2 != null) {
                C0864v.f1809s.mo8985f(c2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.b.a.a.v$l0 */
    public class C0888l0 extends BaseAdapter {

        /* renamed from: a */
        private Context f1858a;

        /* renamed from: b */
        private C0844j f1859b;

        /* renamed from: c */
        private C0886k0 f1860c;

        /* renamed from: d */
        private String f1861d = null;

        /* renamed from: e */
        private String f1862e = null;

        /* renamed from: f */
        private int f1863f = 0;

        /* renamed from: g */
        private int f1864g;

        /* renamed from: h */
        private int f1865h = -1;

        /* renamed from: i */
        private int f1866i = -2;

        /* renamed from: j */
        private Iterator f1867j;

        /* renamed from: k */
        private C0889a f1868k;

        /* renamed from: l */
        private C0864v f1869l = null;

        /* renamed from: m */
        private ArrayList<Integer> f1870m = null;

        /* renamed from: b.b.a.a.v$l0$a */
        private final class C0889a {

            /* renamed from: a */
            public ViewGroup f1872a;

            /* renamed from: b */
            public int[] f1873b;

            /* renamed from: c */
            public View[] f1874c;

            private C0889a(C0888l0 l0Var) {
                this.f1872a = null;
                this.f1873b = null;
                this.f1874c = null;
            }

            /* synthetic */ C0889a(C0888l0 l0Var, HandlerC0885k kVar) {
                this(l0Var);
            }
        }

        public C0888l0(Context context) {
            this.f1859b = new C0844j(context, this, 1);
            this.f1858a = context;
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo9008a() {
            return this.f1860c.f1855a;
        }

        /* renamed from: b */
        public void mo9009b(String str, C0886k0 k0Var) {
            this.f1861d = str;
            this.f1860c = k0Var;
            this.f1863f = C0864v.this.m2284r(str.substring(0, str.length() - 4));
            this.f1862e = C0864v.this.mo8980Q0(str);
        }

        /* renamed from: c */
        public void mo9010c(int i, int i2) {
            this.f1865h = i;
            this.f1866i = i2;
        }

        public int getCount() {
            C0886k0 k0Var = this.f1860c;
            if (k0Var == null) {
                return 0;
            }
            return k0Var.f1855a.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout;
            HashMap<Integer, Object> hashMap = this.f1860c.f1855a.get(i);
            if (view == null) {
                this.f1868k = new C0889a(this, null);
                LinearLayout linearLayout2 = new LinearLayout(this.f1858a);
                linearLayout2.setLayoutParams(new AbsListView.LayoutParams(this.f1865h, this.f1866i));
                linearLayout2.setOrientation(1);
                LinearLayout linearLayout3 = new LinearLayout(this.f1858a);
                linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(this.f1865h, this.f1866i));
                linearLayout3.setOrientation(1);
                linearLayout2.addView(linearLayout3);
                C0864v.this.mo8978J1(this.f1861d, linearLayout3, this.f1863f, hashMap);
                this.f1867j = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f1867j.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f1867j.next()));
                    this.f1864g = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                C0889a aVar = this.f1868k;
                aVar.f1874c = new View[size];
                aVar.f1873b = new int[size];
                if (this.f1870m == null) {
                    this.f1870m = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i2 = 0; i2 < size; i2++) {
                        int intValue = ((Integer) arrayList.get(i2)).intValue();
                        this.f1864g = intValue;
                        C0889a aVar2 = this.f1868k;
                        aVar2.f1873b[i2] = intValue;
                        if (intValue > 0) {
                            aVar2.f1874c[i2] = linearLayout2.findViewById(intValue + this.f1863f);
                        }
                        stringBuffer.append(this.f1864g + this.f1863f);
                        stringBuffer.append(',');
                    }
                    C0864v.this.mo8983Z1(this.f1870m, stringBuffer, linearLayout2);
                } else {
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue2 = ((Integer) arrayList.get(i3)).intValue();
                        this.f1864g = intValue2;
                        C0889a aVar3 = this.f1868k;
                        aVar3.f1873b[i3] = intValue2;
                        if (intValue2 > 0) {
                            aVar3.f1874c[i3] = linearLayout2.findViewById(intValue2 + this.f1863f);
                        }
                    }
                }
                C0889a aVar4 = this.f1868k;
                aVar4.f1872a = linearLayout3;
                linearLayout2.setTag(aVar4);
                linearLayout = linearLayout2;
            } else {
                this.f1868k = (C0889a) view.getTag();
                linearLayout = view;
            }
            int i4 = 0;
            while (true) {
                C0889a aVar5 = this.f1868k;
                int[] iArr = aVar5.f1873b;
                if (i4 >= iArr.length) {
                    break;
                }
                if (iArr[i4] > 0) {
                    C0839h.m1914w(aVar5.f1874c[i4], hashMap.get(Integer.valueOf(iArr[i4])), hashMap, this.f1859b);
                }
                i4++;
            }
            Iterator<Integer> it = this.f1870m.iterator();
            while (it.hasNext()) {
                View findViewById = linearLayout.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            if (this.f1862e != null) {
                this.f1868k.f1872a.setTag(new Object[]{null, null, null, hashMap});
                if (this.f1869l == null) {
                    this.f1869l = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                }
                this.f1869l.mo8981T("st_vW", this.f1868k.f1872a);
                this.f1869l.mo8981T("st_lS", this.f1860c.f1855a);
                this.f1869l.mo8981T("st_pN", Integer.valueOf(i));
                this.f1869l.mo8985f(this.f1862e);
            }
            return linearLayout;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$m */
    public class C0890m implements TextView.OnEditorActionListener {
        C0890m() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            Integer num;
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(textView.getId()));
            vVar.mo8981T("st_vW", textView);
            vVar.mo8981T("st_aI", Integer.valueOf(i));
            if (keyEvent != null) {
                vVar.mo8981T("st_eA", Integer.valueOf(keyEvent.getAction()));
                vVar.mo8981T("st_eR", Integer.valueOf(keyEvent.getRepeatCount()));
                num = Integer.valueOf(keyEvent.getKeyCode());
            } else {
                num = null;
                vVar.mo8981T("st_eA", null);
                vVar.mo8981T("st_eR", null);
            }
            vVar.mo8981T("st_eK", num);
            return C0864v.this.m2180U0(vVar, "editormonitor", ((Object[]) textView.getTag())[2].toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.b.a.a.v$m0 */
    public class C0891m0 extends RecyclerView.Adapter<C0892a> {

        /* renamed from: a */
        private Context f1876a;

        /* renamed from: b */
        private C0844j f1877b;

        /* renamed from: c */
        private C0886k0 f1878c;

        /* renamed from: d */
        private String f1879d = null;

        /* renamed from: e */
        private String f1880e = null;

        /* renamed from: f */
        private int f1881f = 0;

        /* renamed from: g */
        private int f1882g;

        /* renamed from: h */
        private int f1883h = -1;

        /* renamed from: i */
        private int f1884i = -2;

        /* renamed from: j */
        private Iterator f1885j;

        /* renamed from: k */
        private C0864v f1886k = null;

        /* renamed from: l */
        private ArrayList<Integer> f1887l = null;

        /* access modifiers changed from: package-private */
        /* renamed from: b.b.a.a.v$m0$a */
        public class C0892a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ViewGroup f1889a;

            /* renamed from: b */
            public int[] f1890b = null;

            /* renamed from: c */
            public View[] f1891c = null;

            public C0892a(C0891m0 m0Var, ViewGroup viewGroup) {
                super(viewGroup);
                this.f1889a = viewGroup;
            }
        }

        public C0891m0(Context context) {
            this.f1876a = context;
            this.f1877b = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public ArrayList<HashMap<Integer, Object>> mo9016a() {
            return this.f1878c.f1855a;
        }

        /* renamed from: b */
        public void onBindViewHolder(C0892a aVar, int i) {
            HashMap<Integer, Object> hashMap = this.f1878c.f1855a.get(i);
            if (aVar.f1890b == null) {
                C0864v.this.mo8978J1(this.f1879d, aVar.f1889a, this.f1881f, hashMap);
                this.f1885j = hashMap.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (this.f1885j.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f1885j.next()));
                    this.f1882g = parseInt;
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
                int size = arrayList.size();
                aVar.f1891c = new View[size];
                aVar.f1890b = new int[size];
                if (this.f1887l == null) {
                    this.f1887l = new ArrayList<>();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(',');
                    for (int i2 = 0; i2 < size; i2++) {
                        int intValue = ((Integer) arrayList.get(i2)).intValue();
                        this.f1882g = intValue;
                        aVar.f1890b[i2] = intValue;
                        if (intValue > 0) {
                            aVar.f1891c[i2] = aVar.f1889a.findViewById(intValue + this.f1881f);
                        }
                        stringBuffer.append(this.f1882g + this.f1881f);
                        stringBuffer.append(',');
                    }
                    C0864v.this.mo8983Z1(this.f1887l, stringBuffer, aVar.f1889a);
                } else {
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue2 = ((Integer) arrayList.get(i3)).intValue();
                        this.f1882g = intValue2;
                        aVar.f1890b[i3] = intValue2;
                        if (intValue2 > 0) {
                            aVar.f1891c[i3] = aVar.f1889a.findViewById(intValue2 + this.f1881f);
                        }
                    }
                }
            }
            int i4 = 0;
            while (true) {
                int[] iArr = aVar.f1890b;
                if (i4 >= iArr.length) {
                    break;
                }
                if (iArr[i4] > 0) {
                    C0839h.m1914w(aVar.f1891c[i4], hashMap.get(Integer.valueOf(iArr[i4])), hashMap, this.f1877b);
                }
                i4++;
            }
            Iterator<Integer> it = this.f1887l.iterator();
            while (it.hasNext()) {
                View findViewById = aVar.f1889a.findViewById(it.next().intValue());
                Object[] objArr = (Object[]) findViewById.getTag();
                objArr[3] = hashMap;
                findViewById.setTag(objArr);
            }
            if (this.f1880e != null) {
                aVar.f1889a.setTag(new Object[]{null, null, null, hashMap});
                if (this.f1886k == null) {
                    this.f1886k = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                }
                this.f1886k.mo8981T("st_vW", aVar.f1889a);
                this.f1886k.mo8981T("st_lS", this.f1878c.f1855a);
                this.f1886k.mo8981T("st_pN", Integer.valueOf(i));
                this.f1886k.mo8985f(this.f1880e);
            }
        }

        /* renamed from: c */
        public C0892a onCreateViewHolder(ViewGroup viewGroup, int i) {
            LinearLayout linearLayout = new LinearLayout(this.f1876a);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f1883h, this.f1884i));
            linearLayout.setOrientation(1);
            return new C0892a(this, linearLayout);
        }

        /* renamed from: d */
        public void mo9019d(String str, C0886k0 k0Var) {
            this.f1879d = str;
            this.f1878c = k0Var;
            this.f1881f = C0864v.this.m2284r(str.substring(0, str.length() - 4));
            this.f1880e = C0864v.this.mo8980Q0(str);
        }

        /* renamed from: e */
        public void mo9020e(int i, int i2) {
            this.f1883h = i;
            this.f1884i = i2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            C0886k0 k0Var = this.f1878c;
            if (k0Var == null) {
                return 0;
            }
            return k0Var.f1855a.size();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$n */
    public class View$OnFocusChangeListenerC0893n implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0893n() {
        }

        public void onFocusChange(View view, boolean z) {
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(view.getId()));
            vVar.mo8981T("st_vW", view);
            vVar.mo8981T("st_hF", Boolean.valueOf(z));
            vVar.mo8985f(C0860r.m2044c(((Object[]) view.getTag())[2].toString(), "<eventItme type=\"focuschange\">", "</eventItme>"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$o */
    public class C0894o implements AbsListView.OnScrollListener {
        C0894o() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            String c = C0860r.m2044c(((Object[]) absListView.getTag())[2].toString(), "<eventItme type=\"onscroll\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(absListView.getId()));
                vVar.mo8981T("st_vW", absListView);
                vVar.mo8981T("st_fM", Integer.valueOf(i));
                vVar.mo8981T("st_vT", Integer.valueOf(i2));
                vVar.mo8981T("st_bT", Integer.valueOf(i3));
                vVar.mo8985f(c);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            String c = C0860r.m2044c(((Object[]) absListView.getTag())[2].toString(), "<eventItme type=\"onscrollstatechanged\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(absListView.getId()));
                vVar.mo8981T("st_vW", absListView);
                vVar.mo8981T("st_sE", Integer.valueOf(i));
                vVar.mo8985f(c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$p */
    public class C0895p implements AdapterView.OnItemClickListener {
        C0895p() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(adapterView.getId()));
            vVar.mo8981T("st_vW", adapterView);
            vVar.mo8981T("st_pN", Integer.valueOf(i));
            vVar.mo8981T("st_iD", Long.valueOf(j));
            vVar.mo8985f(C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"clickitem\">", "</eventItme>"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$q */
    public class C0896q implements AdapterView.OnItemSelectedListener {
        C0896q() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String c = C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"onitemselected\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(adapterView.getId()));
                vVar.mo8981T("st_vW", adapterView);
                vVar.mo8981T("st_vW2", view);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8981T("st_iD", Long.valueOf(j));
                vVar.mo8985f(c);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            String c = C0860r.m2044c(((Object[]) adapterView.getTag())[2].toString(), "<eventItme type=\"onnothingselected\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(adapterView.getId()));
                vVar.mo8981T("st_vW", adapterView);
                vVar.mo8985f(c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$r */
    public class C0897r implements SeekBar.OnSeekBarChangeListener {
        C0897r() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onprogresschanged2\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(seekBar.getId()));
                vVar.mo8981T("st_vW", seekBar);
                vVar.mo8981T("st_nS", Integer.valueOf(i));
                vVar.mo8981T("st_fR", Boolean.valueOf(z));
                vVar.mo8985f(c);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onstarttrackingtouch\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(seekBar.getId()));
                vVar.mo8981T("st_vW", seekBar);
                vVar.mo8985f(c);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            String c = C0860r.m2044c(((Object[]) seekBar.getTag())[2].toString(), "<eventItme type=\"onstoptrackingtouch\">", "</eventItme>");
            if (c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(seekBar.getId()));
                vVar.mo8981T("st_vW", seekBar);
                vVar.mo8985f(c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$s */
    public class C0898s implements TabLayout.AbstractC1278d {

        /* renamed from: a */
        final /* synthetic */ String f1897a;

        /* renamed from: b */
        final /* synthetic */ View f1898b;

        /* renamed from: c */
        final /* synthetic */ String f1899c;

        /* renamed from: d */
        final /* synthetic */ String f1900d;

        C0898s(String str, View view, String str2, String str3) {
            this.f1897a = str;
            this.f1898b = view;
            this.f1899c = str2;
            this.f1900d = str3;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(TabLayout.C1283g gVar) {
            if (this.f1900d != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1898b.getId()));
                vVar.mo8981T("st_vW", this.f1898b);
                vVar.mo8981T("st_pN", Integer.valueOf(gVar.mo11600d()));
                vVar.mo8981T("st_tT", String.valueOf(gVar.mo11601e()));
                vVar.mo8981T("st_taB", gVar);
                vVar.mo8985f(this.f1900d);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(TabLayout.C1283g gVar) {
            if (this.f1899c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1898b.getId()));
                vVar.mo8981T("st_vW", this.f1898b);
                vVar.mo8981T("st_pN", Integer.valueOf(gVar.mo11600d()));
                vVar.mo8981T("st_tT", String.valueOf(gVar.mo11601e()));
                vVar.mo8981T("st_taB", gVar);
                vVar.mo8985f(this.f1899c);
            }
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(TabLayout.C1283g gVar) {
            if (this.f1897a != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1898b.getId()));
                vVar.mo8981T("st_vW", this.f1898b);
                vVar.mo8981T("st_pN", Integer.valueOf(gVar.mo11600d()));
                vVar.mo8981T("st_tT", String.valueOf(gVar.mo11601e()));
                vVar.mo8981T("st_taB", gVar);
                vVar.mo8985f(this.f1897a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$t */
    public class C0899t extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ String f1902a;

        /* renamed from: b */
        final /* synthetic */ String f1903b;

        C0899t(String str, String str2) {
            this.f1902a = str;
            this.f1903b = str2;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f1902a != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(recyclerView.getId()));
                vVar.mo8981T("st_vW", recyclerView);
                vVar.mo8981T("st_sE", Integer.valueOf(i));
                vVar.mo8985f(this.f1902a);
            }
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.f1903b != null) {
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
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
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
                vVar.mo8985f(this.f1903b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$u */
    public class C0900u extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ View f1905a;

        /* renamed from: b */
        final /* synthetic */ String f1906b;

        C0900u(View view, String str) {
            this.f1905a = view;
            this.f1906b = str;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View findChildViewUnder = ((RecyclerView) this.f1905a).findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder != null && this.f1906b != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1905a.getId()));
                vVar.mo8981T("st_vW", this.f1905a);
                vVar.mo8981T("st_pN", Integer.valueOf(((RecyclerView) this.f1905a).getChildLayoutPosition(findChildViewUnder)));
                vVar.mo8981T("st_vW2", findChildViewUnder);
                vVar.mo8985f(this.f1906b);
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            View findChildViewUnder = ((RecyclerView) this.f1905a).findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder == null) {
                return false;
            }
            if (this.f1906b == null) {
                return true;
            }
            C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
            vVar.mo8981T("st_vId", Integer.valueOf(this.f1905a.getId()));
            vVar.mo8981T("st_vW", this.f1905a);
            vVar.mo8981T("st_pN", Integer.valueOf(((RecyclerView) this.f1905a).getChildLayoutPosition(findChildViewUnder)));
            vVar.mo8981T("st_vW2", findChildViewUnder);
            vVar.mo8985f(this.f1906b);
            return true;
        }
    }

    /* renamed from: b.b.a.a.v$v */
    class HandlerC0901v extends Handler {
        HandlerC0901v(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(C0864v.this.f1815d, message.obj.toString(), 1).show();
            } else if (i == 2) {
                C0864v.this.mo8984e(message.obj.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$w */
    public class C0902w implements RecyclerView.OnItemTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f1909a;

        C0902w(C0864v vVar, GestureDetector gestureDetector) {
            this.f1909a = gestureDetector;
        }

        @Override // android.support.p012v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f1909a.onTouchEvent(motionEvent);
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
    /* renamed from: b.b.a.a.v$x */
    public class C0903x implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f1910a;

        /* renamed from: b */
        final /* synthetic */ View f1911b;

        /* renamed from: c */
        final /* synthetic */ String f1912c;

        /* renamed from: d */
        final /* synthetic */ String f1913d;

        C0903x(String str, View view, String str2, String str3) {
            this.f1910a = str;
            this.f1911b = view;
            this.f1912c = str2;
            this.f1913d = str3;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f1913d != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1911b.getId()));
                vVar.mo8981T("st_vW", this.f1911b);
                vVar.mo8981T("st_sE", Integer.valueOf(i));
                vVar.mo8985f(this.f1913d);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f1912c != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1911b.getId()));
                vVar.mo8981T("st_vW", this.f1911b);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8981T("st_pT", Float.valueOf(f));
                vVar.mo8981T("st_pS", Integer.valueOf(i2));
                vVar.mo8985f(this.f1912c);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f1910a != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1911b.getId()));
                vVar.mo8981T("st_vW", this.f1911b);
                vVar.mo8981T("st_pN", Integer.valueOf(i));
                vVar.mo8985f(this.f1910a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$y */
    public class C0904y implements SwipeRefreshLayout.OnRefreshListener {

        /* renamed from: a */
        final /* synthetic */ String f1915a;

        /* renamed from: b */
        final /* synthetic */ View f1916b;

        C0904y(String str, View view) {
            this.f1915a = str;
            this.f1916b = view;
        }

        @Override // android.support.p009v4.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            if (this.f1915a != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1916b.getId()));
                vVar.mo8981T("st_vW", this.f1916b);
                vVar.mo8985f(this.f1915a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.v$z */
    public class C0905z implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f1918a;

        /* renamed from: b */
        final /* synthetic */ View f1919b;

        C0905z(String str, View view) {
            this.f1918a = str;
            this.f1919b = view;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f1918a != null) {
                C0864v vVar = new C0864v(C0864v.this.f1815d, C0864v.this.f1814c);
                vVar.mo8981T("st_vId", Integer.valueOf(this.f1919b.getId()));
                vVar.mo8981T("st_vW", this.f1919b);
                vVar.mo8981T("st_iC", Boolean.valueOf(z));
                vVar.mo8985f(this.f1918a);
            }
        }
    }

    public C0864v(Activity activity) {
        this.f1814c = activity;
        this.f1815d = activity;
        this.f1820i = new HandlerC0885k(activity.getMainLooper());
        this.f1817f = m2198Z();
    }

    public C0864v(Context context, Activity activity) {
        this.f1814c = activity;
        this.f1815d = context;
        this.f1820i = new HandlerC0901v(context.getMainLooper());
        this.f1817f = m2198Z();
    }

    /* renamed from: A */
    private void m2087A(String str) {
        String trim;
        String str2;
        Boolean bool = Boolean.TRUE;
        if (Build.VERSION.SDK_INT >= 21) {
            String[] P1 = m2161P1(m2186V2(str));
            int length = P1.length;
            if (length == 5) {
                C1340n nVar = C1340n.f3148n;
                if (nVar == null) {
                    C1340n nVar2 = new C1340n(this.f1814c);
                    C1340n.f3148n = nVar2;
                    nVar2.mo11986n(m2150N0(m2140L0(P1[0])), Integer.parseInt(m2140L0(P1[1])), Integer.parseInt(m2140L0(P1[2])), Integer.parseInt(m2140L0(P1[3])), Integer.parseInt(m2140L0(P1[4])));
                    return;
                }
                nVar.mo11984j(m2150N0(m2140L0(P1[0])), Integer.parseInt(m2140L0(P1[1])), Integer.parseInt(m2140L0(P1[2])), Integer.parseInt(m2140L0(P1[3])), Integer.parseInt(m2140L0(P1[4])));
            } else if (length != 2) {
            } else {
                if (C1340n.f3148n == null) {
                    mo8981T(P1[1].trim(), Boolean.FALSE);
                    return;
                }
                String L0 = m2140L0(P1[0]);
                if (L0.equals("st")) {
                    C1340n.f3148n.mo11988p(true);
                    str2 = P1[1];
                } else if (L0.equals("sp")) {
                    C1340n.f3148n.mo11988p(false);
                    str2 = P1[1];
                } else if (L0.equals("re")) {
                    C1340n.f3148n.mo11987o();
                    C1340n.f3148n = null;
                    str2 = P1[1];
                } else if (L0.equals("ip")) {
                    trim = P1[1].trim();
                    bool = Boolean.valueOf(C1340n.f3148n.mo11983i());
                    mo8981T(trim, bool);
                } else {
                    return;
                }
                trim = str2.trim();
                mo8981T(trim, bool);
            }
        }
    }

    /* renamed from: A0 */
    private void m2088A0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            C0835f.m1854k(m2150N0(m2140L0(P1[0])), m2140L0(P1[1]));
        } else if (length == 3) {
            C0835f.m1855l(m2150N0(m2140L0(P1[0])), m2140L0(P1[1]), m2140L0(P1[2]));
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: A1 */
    private void m2089A1(String str) {
        String str2;
        String trim;
        JSONObject jSONObject;
        String trim2;
        Object obj;
        String trim3;
        Object jSONArray;
        int i;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            try {
                mo8981T(P1[1].trim(), new JSONObject(m2140L0(P1[0])));
            } catch (JSONException e) {
                e.printStackTrace();
                str2 = P1[0];
            }
        } else {
            if (length == 3) {
                Object K0 = m2136K0(P1[1]);
                if (K0.equals("size")) {
                    Object K02 = m2136K0(P1[0]);
                    if (K02 instanceof JSONObject) {
                        trim3 = P1[2].trim();
                        i = ((JSONObject) K02).length();
                    } else if (K02 instanceof JSONArray) {
                        trim3 = P1[2].trim();
                        i = ((JSONArray) K02).length();
                    } else {
                        trim3 = P1[2].trim();
                        i = -1;
                    }
                    jSONArray = Integer.valueOf(i);
                } else if (K0.equals("del")) {
                    Object K03 = m2136K0(P1[0]);
                    if (K03 instanceof JSONObject) {
                        ((JSONObject) K03).remove(m2140L0(P1[2]));
                        return;
                    } else if ((K03 instanceof JSONArray) && Build.VERSION.SDK_INT >= 19) {
                        ((JSONArray) K03).remove(m2216d(m2140L0(P1[2])));
                        return;
                    } else {
                        return;
                    }
                } else if (K0.equals("json")) {
                    Object K04 = m2136K0(P1[0]);
                    if (K04 instanceof JSONObject) {
                        trim3 = P1[2].trim();
                        jSONArray = ((JSONObject) K04).toString();
                    } else if (K04 instanceof JSONArray) {
                        trim3 = P1[2].trim();
                        jSONArray = ((JSONArray) K04).toString();
                    } else {
                        str2 = P1[2];
                    }
                } else {
                    return;
                }
                mo8981T(trim3, jSONArray);
                return;
            } else if (length == 4) {
                Object K05 = m2136K0(P1[1]);
                if (K05.equals("get")) {
                    Object K06 = m2136K0(P1[0]);
                    try {
                        if (K06 instanceof JSONObject) {
                            trim2 = P1[3].trim();
                            obj = ((JSONObject) K06).get(m2140L0(P1[2]));
                        } else if (K06 instanceof JSONArray) {
                            trim2 = P1[3].trim();
                            obj = ((JSONArray) K06).get(m2216d(m2140L0(P1[2])));
                        } else {
                            mo8981T(P1[3].trim(), null);
                            return;
                        }
                        mo8981T(trim2, obj);
                        return;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        str2 = P1[3];
                    }
                } else if (K05.equals("set")) {
                    Object K07 = m2136K0(P1[0]);
                    try {
                        if (K07 instanceof JSONObject) {
                            ((JSONObject) K07).put(m2140L0(P1[2]), m2136K0(P1[3]));
                            return;
                        } else if (K07 instanceof JSONArray) {
                            ((JSONArray) K07).put(m2216d(m2140L0(P1[2])), m2136K0(P1[3]));
                            return;
                        } else {
                            return;
                        }
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                        return;
                    }
                } else if (K05.equals("list")) {
                    Object K08 = m2136K0(P1[0]);
                    if (K08 instanceof JSONObject) {
                        try {
                            mo8981T(P1[3].trim(), ((JSONObject) K08).getJSONArray(m2140L0(P1[2])));
                            return;
                        } catch (JSONException e4) {
                            e4.printStackTrace();
                            str2 = P1[3];
                        }
                    } else {
                        str2 = P1[3];
                    }
                } else if (K05.equals("data")) {
                    Object K09 = m2136K0(P1[0]);
                    try {
                        if (K09 instanceof JSONObject) {
                            trim = P1[3].trim();
                            jSONObject = ((JSONObject) K09).getJSONObject(m2140L0(P1[2]));
                        } else if (K09 instanceof JSONArray) {
                            trim = P1[3].trim();
                            jSONObject = ((JSONArray) K09).getJSONObject(m2216d(m2140L0(P1[2])));
                        } else {
                            mo8981T(P1[3].trim(), null);
                            return;
                        }
                        mo8981T(trim, jSONObject);
                        return;
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                        str2 = P1[3];
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            mo8981T(str2.trim(), null);
        }
    }

    /* renamed from: A2 */
    private void m2090A2(String str) {
        String trim;
        String L0;
        String L02;
        String str2;
        String replaceAll;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 4) {
            trim = P1[3].trim();
            L0 = m2140L0(P1[0]);
            L02 = m2140L0(P1[1]);
            str2 = P1[2];
        } else if (length != 5) {
            return;
        } else {
            if (m2136K0(P1[3]).equals(Boolean.TRUE)) {
                trim = P1[4].trim();
                replaceAll = m2140L0(P1[0]).replaceAll(m2140L0(P1[1]), m2140L0(P1[2]));
                mo8981T(trim, replaceAll);
            }
            trim = P1[4].trim();
            L0 = m2140L0(P1[0]);
            L02 = m2140L0(P1[1]);
            str2 = P1[2];
        }
        replaceAll = L0.replace(L02, m2140L0(str2));
        mo8981T(trim, replaceAll);
    }

    /* renamed from: A3 */
    private void m2091A3(String str) {
        if (m2136K0(m2161P1(m2186V2(str))[0]).equals(Boolean.TRUE)) {
            this.f1814c.getWindow().clearFlags(128);
        } else {
            this.f1814c.getWindow().setFlags(128, 128);
        }
    }

    /* renamed from: B */
    private void m2092B(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            Object K0 = m2136K0(P1[1]);
            if (K0.equals("sp")) {
                Object K02 = m2136K0(P1[0]);
                if (K02 instanceof MediaRecorder) {
                    MediaRecorder mediaRecorder = (MediaRecorder) K02;
                    try {
                        mediaRecorder.stop();
                        mediaRecorder.release();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    }
                    mo8981T(P1[0].trim(), null);
                    return;
                }
                return;
            }
            MediaRecorder mediaRecorder2 = new MediaRecorder();
            mediaRecorder2.setAudioSource(1);
            mediaRecorder2.setOutputFormat(0);
            String N0 = m2150N0(String.valueOf(K0));
            C0835f.m1845b(N0, false);
            mediaRecorder2.setOutputFile(N0);
            mediaRecorder2.setAudioEncoder(0);
            try {
                mediaRecorder2.prepare();
                mediaRecorder2.start();
                mo8981T(P1[0].trim(), mediaRecorder2);
            } catch (Exception e2) {
                e2.printStackTrace();
                mo8981T(P1[0].trim(), null);
            }
        }
    }

    /* renamed from: B0 */
    private int m2093B0() {
        try {
            Display defaultDisplay = this.f1814c.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return displayMetrics.heightPixels - displayMetrics2.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: B1 */
    private void m2094B1(String str) {
        C0915a.m2418a(this.f1814c, m2216d(m2140L0(m2161P1(m2186V2(str))[0])));
    }

    /* renamed from: B2 */
    private void m2095B2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            mo8981T(P1[2].trim(), Integer.valueOf(C0860r.m2048g(m2216d(m2140L0(P1[0])), m2216d(m2140L0(P1[1])))));
        }
    }

    /* renamed from: B3 */
    private void m2096B3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        Context context = this.f1815d;
        Intent intent = new Intent("android.intent.action.SENDTO", C0851m.m1977c(context, "smsto:" + m2140L0(P1[0])));
        intent.putExtra("sms_body", m2140L0(P1[1]));
        this.f1815d.startActivity(intent);
    }

    /* renamed from: C */
    private void m2097C(String str) {
        byte[] bArr;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        byte[] bArr2 = null;
        if (length == 2) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof byte[]) {
                bArr2 = (byte[]) K0;
            } else {
                try {
                    bArr2 = m2102D(K0.toString().trim(), ' ');
                } catch (Exception unused) {
                }
            }
            if (bArr2 != null) {
                C0835f.m1853j(m2150N0(m2140L0(P1[1])), bArr2);
            }
        } else if (length == 3) {
            Object K02 = m2136K0(P1[1]);
            if (K02 instanceof byte[]) {
                bArr = (byte[]) K02;
            } else {
                try {
                    bArr = m2102D(K02.toString().trim(), ' ');
                } catch (Exception unused2) {
                    bArr = null;
                }
            }
            if (bArr != null) {
                Object K03 = m2136K0(P1[0]);
                if (K03 == null) {
                    mo8981T(P1[2].trim(), new String(bArr));
                    return;
                }
                try {
                    mo8981T(P1[2].trim(), new String(bArr, K03.toString()));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    mo8981T(P1[2].trim(), null);
                }
            }
        }
    }

    /* renamed from: C0 */
    private String[] m2098C0() {
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

    /* renamed from: C1 */
    private void m2099C1(String str) {
        DexClassLoader r;
        String str2;
        Object obj = Boolean.TRUE;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            mo8981T(P1[1].trim(), C0839h.m1909r(this.f1815d, m2140L0(P1[0]), this.f1815d.getClassLoader()));
            return;
        }
        if (length == 3) {
            r = C0839h.m1909r(this.f1815d, m2140L0(P1[0]), this.f1815d.getClassLoader());
            if (m2136K0(P1[1]).equals(obj)) {
                C0839h.m1912u(this.f1815d, r);
            }
            str2 = P1[2];
        } else if (length == 4) {
            r = C0839h.m1909r(this.f1815d, m2140L0(P1[0]), (ClassLoader) m2136K0(P1[2]));
            if (m2136K0(P1[1]).equals(obj)) {
                C0839h.m1912u(this.f1815d, r);
            }
            str2 = P1[3];
        } else {
            return;
        }
        mo8981T(str2.trim(), r);
    }

    /* renamed from: C2 */
    private void m2100C2(String str) {
        String V2 = m2186V2(str);
        int lastIndexOf = V2.lastIndexOf(44);
        String trim = V2.substring(lastIndexOf + 1).trim();
        String str2 = "";
        for (String str3 : m2307v2(V2.substring(0, lastIndexOf).trim(), '+')) {
            Object K0 = m2136K0(str3);
            if (K0 != null) {
                str2 = str2 + K0;
            }
        }
        mo8981T(trim.trim(), str2);
    }

    /* renamed from: C3 */
    private void m2101C3(String str) {
        Boolean bool = Boolean.TRUE;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof C1319k) {
            C1319k kVar = (C1319k) K0;
            Object K02 = m2136K0(P1[1]);
            if (K02.equals("shot")) {
                kVar.mo11961q(m2150N0(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2136K0(P1[4]).equals(bool));
            } else if (K02.equals("st")) {
                kVar.mo11966y();
            } else if (K02.equals("sp")) {
                kVar.mo11967z();
            } else if (K02.equals("re")) {
                kVar.mo11963u();
            } else if (K02.equals("rotaing")) {
                kVar.mo11964w(m2216d(m2140L0(P1[2])));
            } else if (K02.equals("getrotaing")) {
                mo8981T(P1[2].trim(), Integer.valueOf(kVar.mo11962r()));
            } else if (K02.equals("usg")) {
                kVar.mo11965x(m2136K0(P1[2]).equals(bool));
            }
        }
    }

    /* renamed from: D */
    private byte[] m2102D(String str, char c) {
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

    /* renamed from: D0 */
    private int[] m2103D0() {
        return new int[]{this.f1814c.getWindowManager().getDefaultDisplay().getWidth(), this.f1814c.getWindowManager().getDefaultDisplay().getHeight()};
    }

    /* renamed from: D1 */
    private void m2104D1(String str) {
        C0839h.m1910s(m2140L0(str));
    }

    /* renamed from: D2 */
    private void m2105D2(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 4) {
            try {
                mo8981T(P1[3].trim(), m2140L0(P1[0]).substring(m2216d(m2140L0(P1[1])), m2216d(m2140L0(P1[2]))));
            } catch (Exception unused) {
                str2 = P1[3];
                mo8981T(str2.trim(), null);
            }
        } else if (P1.length == 3) {
            try {
                mo8981T(P1[2].trim(), m2140L0(P1[0]).substring(m2216d(m2140L0(P1[1]))));
            } catch (Exception unused2) {
                str2 = P1[2];
                mo8981T(str2.trim(), null);
            }
        }
    }

    /* renamed from: D3 */
    private void m2106D3(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 3) {
            Object K0 = m2136K0(P1[1]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[1]);
            if (m0 instanceof SurfaceView) {
                mo8981T(P1[0].trim(), new C1319k(this.f1815d, this.f1814c, (SurfaceView) m0, false, m2216d(m2140L0(P1[2]))));
                return;
            }
            str2 = P1[0];
        } else if (length == 6) {
            Object K02 = m2136K0(P1[1]);
            View m02 = K02 instanceof View ? (View) K02 : m2260m0(K02, P1[1]);
            if (m02 instanceof SurfaceView) {
                mo8981T(P1[0].trim(), new C1319k(this.f1815d, this.f1814c, (SurfaceView) m02, false, m2216d(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2216d(m2140L0(P1[4])), m2216d(m2140L0(P1[5]))));
                return;
            }
            str2 = P1[0];
        } else {
            return;
        }
        mo8981T(str2.trim(), null);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: E */
    private void m2107E(String str) {
        String trim;
        Object b;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object K0 = m2136K0(P1[1]);
        int i = 3;
        if (K0.equals("myu")) {
            int i2 = length - 3;
            if (i2 >= 0) {
                String L0 = m2140L0(P1[2]);
                Object obj = f1802l.get(L0 + i2);
                if (obj == null) {
                    String substring = L0.substring(0, L0.indexOf(46) + 1);
                    for (String str2 : f1802l.keySet()) {
                        if (str2.toString().startsWith(substring)) {
                            return;
                        }
                    }
                    m2209b2(substring + "myu");
                    obj = f1802l.get(L0 + i2);
                }
                String obj2 = obj.toString();
                int indexOf = obj2.indexOf(10);
                String[] P12 = m2161P1(m2186V2(obj2.substring(0, indexOf)));
                if (i2 == P12.length) {
                    while (i < length) {
                        mo8981T(P12[i - 3].trim(), m2136K0(P1[i]));
                        i++;
                    }
                    mo8984e(obj2.substring(indexOf).trim());
                    return;
                }
                return;
            }
            return;
        }
        String str3 = "i";
        if (K0.equals("mjava")) {
            C1309h hVar = new C1309h(this.f1815d);
            try {
                hVar.set("activity", this.f1815d);
                hVar.set(str3, new Aid_javaCode(this.f1815d, this.f1814c, hVar));
            } catch (EvalError e) {
                e.printStackTrace();
            }
            String L02 = m2140L0(P1[2]);
            int indexOf2 = L02.indexOf(46);
            if (hVar.mo11945e(L02.substring(0, indexOf2) + ".mjava")) {
                if (length == 3) {
                    trim = P1[0].trim();
                    b = hVar.mo11941a(L02.substring(indexOf2 + 1));
                } else if (length > 3) {
                    Object[] objArr = new Object[(length - 3)];
                    int i3 = 0;
                    while (i < length) {
                        objArr[i3] = m2136K0(P1[i]);
                        i3++;
                        i++;
                    }
                    trim = P1[0].trim();
                    b = hVar.mo11942b(L02.substring(indexOf2 + 1), objArr);
                } else {
                    return;
                }
                mo8981T(trim, b);
                return;
            }
            return;
        }
        String str4 = "_a";
        if (K0.equals("mlua")) {
            String L03 = m2140L0(P1[2]);
            long id = Thread.currentThread().getId();
            String str5 = "";
            String str6 = str5;
            int i4 = 3;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i5 + 1;
                String str7 = "$_Call_SsS_" + id + str4 + i6;
                f1800j.put(str7, m2136K0(P1[i4]));
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
            String str9 = "require 'import'\nrequire '" + L03.substring(0, L03.indexOf(46)) + "'\n" + str6 + "\nlocal returns = " + L03.substring(L03.indexOf(46) + 1) + "(" + str5 + ")\ni:sss(\"" + str8 + "\", returns)";
            C1298d dVar = new C1298d(this.f1815d);
            dVar.mo11700l("activity", this.f1815d);
            dVar.mo11700l(str3, new Aid_luaCode(this.f1815d, this.f1814c, dVar));
            dVar.mo11699k();
            try {
                dVar.mo11696h(str9);
                mo8981T(P1[0].trim(), f1800j.get(str8));
            } catch (LuaException e2) {
                e2.printStackTrace();
                m2157O2("LuaErr：\n" + e2.getMessage());
            }
        } else {
            String str10 = str4;
            if (K0.equals("mjs")) {
                String L04 = m2140L0(P1[2]);
                long id2 = Thread.currentThread().getId();
                String str11 = "";
                String str12 = str11;
                int i7 = 0;
                int i8 = 3;
                while (i8 < length) {
                    i7++;
                    String str13 = "$_Call_SsS_" + id2 + str10 + i7;
                    f1800j.put(str13, m2136K0(P1[i8]));
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
                sb.append(C0839h.m1896e(this.f1815d, "import.mjs"));
                sb.append("\n");
                sb.append(C0839h.m1892a(this.f1815d, L04.substring(0, L04.indexOf(46)) + ".mjs"));
                sb.append("\n");
                sb.append(str12);
                sb.append("\nvar returns = ");
                sb.append(L04.substring(L04.indexOf(46) + 1));
                sb.append("(");
                sb.append(str11);
                sb.append(");</script></head></html>");
                String sb2 = sb.toString();
                WebView webView = new WebView(this.f1815d);
                webView.getSettings().setAllowFileAccess(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAppCacheEnabled(true);
                webView.getSettings().setAppCachePath(this.f1815d.getApplicationContext().getDir("cache", 0).getPath());
                webView.getSettings().setAppCacheMaxSize(8388608);
                webView.getSettings().setDatabaseEnabled(true);
                webView.getSettings().setDatabasePath(this.f1815d.getApplicationContext().getDir("database", 0).getPath());
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setGeolocationEnabled(true);
                webView.getSettings().setLightTouchEnabled(true);
                webView.getSettings().setCacheMode(-1);
                webView.getSettings().setPluginState(WebSettings.PluginState.ON);
                webView.setWebChromeClient(new C0878g0(this));
                if (Build.VERSION.SDK_INT >= 11) {
                    webView.removeJavascriptInterface("searchBoxJavaBridge_");
                    webView.removeJavascriptInterface("accessibility");
                    webView.removeJavascriptInterface("accessibilityTraversal");
                }
                webView.addJavascriptInterface(new Aid_jsCode(this.f1815d, this.f1814c, webView, 0), "I");
                C1295c.m3509d(webView, sb2);
            }
        }
    }

    /* renamed from: E0 */
    private int[] m2108E0() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: E1 */
    private void m2109E1(String str) {
        GradientDrawable gradientDrawable;
        String str2;
        GradientDrawable gradientDrawable2;
        String str3;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            int o = C0860r.m2056o(m2140L0(P1[0]));
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(o);
            str2 = P1[1];
        } else {
            if (P1.length == 3) {
                int d = m2216d(m2140L0(P1[0]));
                int o2 = C0860r.m2056o(m2140L0(P1[1]));
                gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(o2);
                if (d > 0) {
                    gradientDrawable2.setCornerRadius((float) d);
                }
                str3 = P1[2];
            } else if (P1.length == 4) {
                int d2 = m2216d(m2140L0(P1[0]));
                int o3 = C0860r.m2056o(m2140L0(P1[1]));
                int o4 = C0860r.m2056o(m2140L0(P1[2]));
                gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(o3);
                if (d2 > 0) {
                    gradientDrawable2.setStroke(d2, o4);
                }
                str3 = P1[3];
            } else if (P1.length == 5) {
                int d3 = m2216d(m2140L0(P1[0]));
                int d4 = m2216d(m2140L0(P1[1]));
                int o5 = C0860r.m2056o(m2140L0(P1[2]));
                int o6 = C0860r.m2056o(m2140L0(P1[3]));
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setColor(o5);
                if (d4 > 0) {
                    gradientDrawable3.setCornerRadius((float) d4);
                }
                if (d3 > 0) {
                    gradientDrawable3.setStroke(d3, o6);
                }
                mo8981T(P1[4].trim(), gradientDrawable3);
                return;
            } else if (P1.length == 6) {
                int d5 = m2216d(m2140L0(P1[0]));
                int d6 = m2216d(m2140L0(P1[1]));
                int o7 = C0860r.m2056o(m2140L0(P1[3]));
                String[] v2 = m2307v2(m2140L0(P1[2]), '|');
                int[] iArr = new int[v2.length];
                for (int i = 0; i < v2.length; i++) {
                    iArr[i] = C0860r.m2056o(v2[i]);
                }
                gradientDrawable = new GradientDrawable(m2160P0(m2140L0(P1[4])), iArr);
                if (d6 > 0) {
                    gradientDrawable.setCornerRadius((float) d6);
                }
                if (d5 > 0) {
                    gradientDrawable.setStroke(d5, o7);
                }
                str2 = P1[5];
            } else {
                return;
            }
            mo8981T(str3.trim(), gradientDrawable2);
            return;
        }
        mo8981T(str2.trim(), gradientDrawable);
    }

    /* renamed from: E2 */
    private void m2110E2(String str) {
        String[] P1 = m2161P1(m2190W2(str));
        if (P1.length == 2) {
            String b0 = m2207b0(str);
            Object K0 = m2136K0(P1[0]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
            if (m0 != null) {
                Object[] objArr = (Object[]) m0.getTag();
                String L0 = m2140L0(P1[1]);
                objArr[2] = m2155O0((String) objArr[2], L0, b0);
                m0.setTag(objArr);
                m2274p(m0, "<eventItme type=\"" + L0 + "\">" + b0.replace("<", "&lt;").replace(">", "&gt;") + "</eventItme>");
            }
        }
    }

    /* renamed from: E3 */
    private void m2111E3(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 3) {
            Object K0 = m2136K0(P1[1]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[1]);
            if (m0 instanceof SurfaceView) {
                mo8981T(P1[0].trim(), new C1319k(this.f1815d, this.f1814c, (SurfaceView) m0, true, m2216d(m2140L0(P1[2]))));
                return;
            }
            str2 = P1[0];
        } else if (length == 6) {
            Object K02 = m2136K0(P1[1]);
            View m02 = K02 instanceof View ? (View) K02 : m2260m0(K02, P1[1]);
            if (m02 instanceof SurfaceView) {
                mo8981T(P1[0].trim(), new C1319k(this.f1815d, this.f1814c, (SurfaceView) m02, true, m2216d(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2216d(m2140L0(P1[4])), m2216d(m2140L0(P1[5]))));
                return;
            }
            str2 = P1[0];
        } else {
            return;
        }
        mo8981T(str2.trim(), null);
    }

    /* renamed from: F */
    private void m2112F(String str) {
        Class<?> a;
        String trim;
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            Object K0 = m2136K0(P1[0]);
            a = K0 instanceof Class ? (Class) K0 : K0 instanceof String ? C0832d.m1816a(String.valueOf(K0)) : K0.getClass();
            trim = P1[1].trim();
            str2 = P1[1];
        } else if (length == 3) {
            Object K02 = m2136K0(P1[0]);
            a = K02 instanceof Class ? (Class) K02 : K02 instanceof String ? C0832d.m1816a(String.valueOf(K02)) : K02.getClass();
            trim = P1[2].trim();
            str2 = P1[1];
        } else {
            return;
        }
        mo8981T(trim, a.cast(m2136K0(str2)));
    }

    /* renamed from: F0 */
    private String[] m2113F0() {
        return new String[]{Build.MODEL, Build.BRAND, String.valueOf(Build.VERSION.SDK_INT)};
    }

    /* renamed from: F1 */
    private void m2114F1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            mo8981T(P1[1].trim(), new Object[m2216d(m2140L0(P1[0]))]);
        } else if (length == 3) {
            int d = m2216d(m2140L0(P1[0]));
            Object K0 = m2136K0(P1[1]);
            if (K0 instanceof String) {
                mo8981T(P1[2].trim(), Array.newInstance(C0832d.m1817b(K0.toString()), d));
            } else if (K0 instanceof Class) {
                mo8981T(P1[2].trim(), Array.newInstance((Class) K0, d));
            } else {
                mo8981T(P1[2].trim(), null);
            }
        }
    }

    /* renamed from: F2 */
    private void m2115F2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            ((ArrayList) m2136K0(P1[0])).set(m2216d(m2140L0(P1[1])), m2136K0(P1[2]));
        }
    }

    /* renamed from: F3 */
    private void m2116F3(String str) {
        String trim;
        int height;
        Object valueOf;
        CharSequence subtitle;
        Boolean bool = Boolean.TRUE;
        String[] P1 = m2161P1(m2190W2(str));
        int length = P1.length;
        if (length == 1) {
            Object K0 = m2136K0(P1[0]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
            if (m0 != null && (m0 instanceof Toolbar)) {
                ((AppCompatActivity) this.f1814c).setSupportActionBar((Toolbar) m0);
            }
        } else if (length == 2) {
            Object K02 = m2136K0(P1[0]);
            View m02 = K02 instanceof View ? (View) K02 : m2260m0(K02, P1[0]);
            if (m02 != null && (m02 instanceof Toolbar)) {
                Object K03 = m2136K0(P1[1]);
                View m03 = K03 instanceof View ? (View) K03 : m2260m0(K03, P1[1]);
                if (m03 != null && (m03 instanceof DrawerLayout)) {
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setHomeButtonEnabled(true);
                    DrawerLayout drawerLayout = (DrawerLayout) m03;
                    String obj = ((Object[]) drawerLayout.getTag())[2].toString();
                    C0874e0 e0Var = new C0874e0(this.f1814c, drawerLayout, (Toolbar) m02, 0, 0, C0860r.m2044c(obj, "<eventItme type=\"ondrawerclosed\">", "</eventItme>"), drawerLayout, C0860r.m2044c(obj, "<eventItme type=\"ondraweropened\">", "</eventItme>"), C0860r.m2044c(obj, "<eventItme type=\"onoptionsitemselected\">", "</eventItme>"));
                    drawerLayout.setDrawerListener(e0Var);
                    e0Var.syncState();
                }
            }
        } else if (length == 3) {
            Object K04 = m2136K0(P1[0]);
            Object K05 = m2136K0(P1[1]);
            if (K04.equals("get")) {
                if (K05.equals("sab")) {
                    trim = P1[2].trim();
                    valueOf = ((AppCompatActivity) this.f1814c).getSupportActionBar();
                } else {
                    if (K05.equals("title")) {
                        trim = P1[2].trim();
                        subtitle = ((AppCompatActivity) this.f1814c).getSupportActionBar().getTitle();
                    } else if (K05.equals("subtitle")) {
                        trim = P1[2].trim();
                        subtitle = ((AppCompatActivity) this.f1814c).getSupportActionBar().getSubtitle();
                    } else if (K05.equals("cv")) {
                        trim = P1[2].trim();
                        valueOf = ((AppCompatActivity) this.f1814c).getSupportActionBar().getCustomView();
                    } else {
                        if (K05.equals("do")) {
                            trim = P1[2].trim();
                            height = ((AppCompatActivity) this.f1814c).getSupportActionBar().getDisplayOptions();
                        } else if (K05.equals("height")) {
                            trim = P1[2].trim();
                            height = ((AppCompatActivity) this.f1814c).getSupportActionBar().getHeight();
                        } else {
                            return;
                        }
                        valueOf = Integer.valueOf(height);
                    }
                    valueOf = String.valueOf(subtitle);
                }
                mo8981T(trim, valueOf);
                return;
            }
            if (K04.equals("set")) {
                if (K05.equals("title")) {
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setTitle(m2140L0(P1[2]));
                }
                if (K05.equals("subtitle")) {
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setSubtitle(m2140L0(P1[2]));
                    return;
                } else if (K05.equals("cv")) {
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setCustomView((View) m2136K0(P1[2]));
                    return;
                } else if (K05.equals("do")) {
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setDisplayOptions(m2216d(m2140L0(P1[2])));
                    return;
                } else if (K05.equals("dste")) {
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setDisplayShowTitleEnabled(m2136K0(P1[2]).equals(bool));
                    return;
                } else if (K05.equals("dsce")) {
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setDisplayShowCustomEnabled(m2136K0(P1[2]).equals(bool));
                    return;
                } else if (K05.equals("dshe")) {
                    boolean equals = m2136K0(P1[2]).equals(bool);
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setHomeButtonEnabled(equals);
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setDisplayShowHomeEnabled(equals);
                    ((AppCompatActivity) this.f1814c).getSupportActionBar().setDisplayHomeAsUpEnabled(equals);
                    return;
                } else if (K05.equals("leftck")) {
                    Object K06 = m2136K0(P1[2]);
                    View m04 = K06 instanceof View ? (View) K06 : m2260m0(K06, P1[2]);
                    if (m04 != null && (m04 instanceof Toolbar)) {
                        ((Toolbar) m04).setNavigationOnClickListener(new View$OnClickListenerC0876f0(m2207b0(str)));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (K04.equals("left")) {
                View m05 = K05 instanceof View ? (View) K05 : m2260m0(K05, P1[1]);
                if (m05 != null && (m05 instanceof Toolbar)) {
                    ((Toolbar) m05).setNavigationIcon(C1305g.m3582m(m2140L0(P1[2]), this.f1815d));
                } else {
                    return;
                }
            } else if (K04.equals("right")) {
                View m06 = K05 instanceof View ? (View) K05 : m2260m0(K05, P1[1]);
                if (m06 != null && (m06 instanceof Toolbar)) {
                    ((Toolbar) m06).setOverflowIcon(C1305g.m3582m(m2140L0(P1[2]), this.f1815d));
                    return;
                }
                return;
            } else {
                return;
            }
            ((AppCompatActivity) this.f1814c).getSupportActionBar().setHomeButtonEnabled(true);
            ((AppCompatActivity) this.f1814c).getSupportActionBar().setDisplayShowHomeEnabled(true);
            ((AppCompatActivity) this.f1814c).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: G0 */
    private String m2117G0(Object obj) {
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

    /* renamed from: G1 */
    private void m2118G1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 4) {
            mo8981T(P1[3].trim(), new C0917c(this.f1815d).mo9109d(m2136K0(P1[0]), m2136K0(P1[1]), m2136K0(P1[2])));
        }
    }

    /* renamed from: G2 */
    private void m2119G2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            try {
                Array.set(m2136K0(P1[0]), m2216d(m2140L0(P1[1])), m2136K0(P1[2]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f9, code lost:
        if (m2136K0(r3[5]).equals(r2) != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0288, code lost:
        if (m2136K0(r3[4]).equals(r2) != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ff, code lost:
        if (m2136K0(r3[3]).equals(r2) != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0312, code lost:
        r0 = r0.create();
     */
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2120G3(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 796
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.m2120G3(java.lang.String):void");
    }

    /* renamed from: H */
    private void m2121H(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            mo8981T(P1[1].trim(), C0832d.m1817b(m2140L0(P1[0])));
        } else if (length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof ClassLoader) {
                try {
                    mo8981T(P1[2].trim(), ((ClassLoader) K0).loadClass(m2140L0(P1[1])));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    str2 = P1[2];
                }
            } else {
                str2 = P1[2];
                mo8981T(str2.trim(), null);
            }
        }
    }

    /* renamed from: H0 */
    private int m2122H0() {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return this.f1815d.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0133  */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2123H1(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.m2123H1(java.lang.String):void");
    }

    /* renamed from: H2 */
    private void m2124H2(String str) {
        String trim;
        String C;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            trim = P1[2].trim();
            C = C0860r.m2038B(m2140L0(P1[0]), m2140L0(P1[1]));
        } else if (P1.length == 4) {
            trim = P1[3].trim();
            C = C0860r.m2039C(m2140L0(P1[0]), m2140L0(P1[1]));
        } else {
            return;
        }
        mo8981T(trim, C);
    }

    /* renamed from: H3 */
    private void m2125H3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        View view = null;
        if (length == 1) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof View) {
                view = (View) K0;
            }
            if (view != null) {
                ((WindowManager) this.f1815d.getApplicationContext().getSystemService("window")).updateViewLayout(view, view.getLayoutParams());
            }
        } else if (length == 2) {
            if (m2136K0(P1[1]).equals("del")) {
                Object K02 = m2136K0(P1[0]);
                if (K02 instanceof View) {
                    view = (View) K02;
                }
                if (view != null) {
                    ((WindowManager) this.f1815d.getApplicationContext().getSystemService("window")).removeView(view);
                }
            }
        } else if (length == 5) {
            try {
                String L0 = m2140L0(P1[0]);
                LinearLayout linearLayout = new LinearLayout(this.f1815d);
                linearLayout.setOrientation(1);
                int r = m2284r(L0.substring(0, L0.length() - 4));
                linearLayout.setId(r);
                mo8978J1(L0, linearLayout, r, null);
                View childAt = linearLayout.getChildAt(0);
                linearLayout.removeAllViews();
                C0862t.m2080e(this.f1815d, childAt, 0, 0, m2216d(m2140L0(P1[1])), m2216d(m2140L0(P1[2])), 0, C1305g.m3587t(m2140L0(P1[3])), 0, 0);
                mo8981T(P1[4].trim(), childAt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (length == 7) {
            if (m2136K0(P1[1]).equals("set")) {
                Object K03 = m2136K0(P1[0]);
                if (K03 instanceof View) {
                    view = (View) K03;
                }
                if (view != null) {
                    WindowManager windowManager = (WindowManager) this.f1815d.getApplicationContext().getSystemService("window");
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                    layoutParams.x = (int) Float.parseFloat(m2140L0(P1[2]));
                    layoutParams.y = (int) Float.parseFloat(m2140L0(P1[3]));
                    int d = m2216d(m2140L0(P1[4]));
                    if (d == 0) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = d;
                    }
                    int d2 = m2216d(m2140L0(P1[5]));
                    if (d2 == 0) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = d2;
                    }
                    layoutParams.gravity = C1305g.m3587t(m2140L0(P1[6]));
                    view.setLayoutParams(layoutParams);
                    windowManager.updateViewLayout(view, layoutParams);
                }
            }
        } else if (length == 10) {
            Object K04 = m2136K0(P1[0]);
            if (!(K04 instanceof View)) {
                String valueOf = String.valueOf(K04);
                LinearLayout linearLayout2 = new LinearLayout(this.f1815d);
                linearLayout2.setOrientation(1);
                int r2 = m2284r(valueOf.substring(0, valueOf.length() - 4));
                linearLayout2.setId(r2);
                mo8978J1(valueOf, linearLayout2, r2, null);
                View childAt2 = linearLayout2.getChildAt(0);
                linearLayout2.removeAllViews();
                C0862t.m2080e(this.f1815d, childAt2, (int) Float.parseFloat(m2140L0(P1[1])), (int) Float.parseFloat(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2216d(m2140L0(P1[4])), m2216d(m2140L0(P1[5])), C1305g.m3587t(m2140L0(P1[6])), m2216d(m2140L0(P1[7])), m2216d(m2140L0(P1[8])));
                mo8981T(P1[9].trim(), childAt2);
            } else if (m2136K0(P1[1]).equals("set")) {
                View view2 = (View) K04;
                WindowManager windowManager2 = (WindowManager) this.f1815d.getApplicationContext().getSystemService("window");
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) view2.getLayoutParams();
                layoutParams2.x = (int) Float.parseFloat(m2140L0(P1[2]));
                layoutParams2.y = (int) Float.parseFloat(m2140L0(P1[3]));
                int d3 = m2216d(m2140L0(P1[4]));
                if (d3 == 0) {
                    layoutParams2.width = -2;
                } else {
                    layoutParams2.width = d3;
                }
                int d4 = m2216d(m2140L0(P1[5]));
                if (d4 == 0) {
                    layoutParams2.height = -2;
                } else {
                    layoutParams2.height = d4;
                }
                int d5 = m2216d(m2140L0(P1[6]));
                if (d5 == 0) {
                    d5 = C0862t.m2081f();
                }
                layoutParams2.type = d5;
                layoutParams2.gravity = C1305g.m3587t(m2140L0(P1[7]));
                int d6 = m2216d(m2140L0(P1[8]));
                if (d6 == 0) {
                    d6 = 40;
                } else if (d6 == 1) {
                    d6 = 32;
                }
                layoutParams2.flags = d6;
                int d7 = m2216d(m2140L0(P1[9]));
                if (d7 == 0) {
                    d7 = -3;
                }
                layoutParams2.format = d7;
                view2.setLayoutParams(layoutParams2);
                windowManager2.updateViewLayout(view2, layoutParams2);
            }
        }
    }

    /* renamed from: I */
    private void m2126I(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof Class) {
                Object K02 = m2136K0(P1[1]);
                if (K02.equals("init")) {
                    mo8981T(P1[2].trim(), ((Class) K0).getDeclaredConstructors());
                } else if (K02.equals("method")) {
                    mo8981T(P1[2].trim(), ((Class) K0).getDeclaredMethods());
                } else if (K02.equals("field")) {
                    mo8981T(P1[2].trim(), ((Class) K0).getDeclaredFields());
                }
            }
        }
    }

    /* renamed from: I0 */
    private int m2127I0() {
        int identifier = this.f1815d.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f1815d.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: I1 */
    private void m2128I1(File file) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        C0851m.m1975a(this.f1815d, intent, file, C0860r.m2057p(file));
        this.f1815d.startActivity(intent);
    }

    /* renamed from: I2 */
    private void m2129I2(String str) {
        try {
            Thread.sleep((long) m2216d(m2140L0(m2161P1(m2186V2(str))[0])));
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: I3 */
    private void m2130I3(String str) {
        Boolean bool = Boolean.TRUE;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 1) {
            if (m2136K0(P1[0]).equals(bool)) {
                this.f1814c.getWindow().clearFlags(2048);
                this.f1814c.getWindow().setFlags(1024, 1024);
                return;
            }
            this.f1814c.getWindow().addFlags(2048);
        } else if (length == 2) {
            C0862t.m2078c(this.f1814c, C0860r.m2056o(m2140L0(P1[0])), m2136K0(P1[1]).equals(bool), this.f1814c.findViewById(C0839h.f1737a));
        } else if (length == 3) {
            C0862t.m2079d(this.f1814c, C0860r.m2056o(m2140L0(P1[0])), m2136K0(P1[1]).equals(bool), this.f1814c.findViewById(C0839h.f1737a), m2216d(m2140L0(P1[2])));
        }
    }

    /* renamed from: J */
    private void m2131J(String str) {
        boolean z;
        String str2;
        Object valueOf;
        Boolean bool = Boolean.TRUE;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof Animation) {
            Animation animation = (Animation) K0;
            Object K02 = m2136K0(P1[1]);
            if (K02.equals("cancel")) {
                animation.cancel();
            } else if (K02.equals("reset")) {
                animation.reset();
            } else if (K02.equals("start")) {
                animation.start();
            } else if (K02.equals("duration")) {
                animation.setDuration(Long.parseLong(m2140L0(P1[2])));
            } else if (K02.equals("enabled")) {
                animation.setFillEnabled(m2136K0(P1[2]).equals(bool));
            } else if (K02.equals("after")) {
                animation.setFillAfter(m2136K0(P1[2]).equals(bool));
            } else if (K02.equals("before")) {
                animation.setFillBefore(m2136K0(P1[2]).equals(bool));
            } else if (K02.equals("delay")) {
                animation.setStartOffset(Long.parseLong(m2140L0(P1[2])));
            } else if (K02.equals("repeat")) {
                animation.setRepeatCount(m2216d(m2140L0(P1[2])));
            }
        } else {
            if (K0 instanceof AbstractC0918a) {
                AbstractC0918a aVar = (AbstractC0918a) K0;
                Object K03 = m2136K0(P1[1]);
                if (K03.equals("cancel")) {
                    aVar.mo9111b();
                    return;
                } else if (K03.equals("clone")) {
                    str2 = P1[2].trim();
                    valueOf = aVar.clone();
                } else if (K03.equals("start")) {
                    aVar.mo9120j();
                    return;
                } else if (K03.equals("running")) {
                    str2 = P1[2].trim();
                    z = aVar.mo9115e();
                    valueOf = Boolean.valueOf(z);
                } else if (K03.equals("duration")) {
                    aVar.mo9117g(Long.parseLong(m2140L0(P1[2])));
                    return;
                } else if (K03.equals("delay")) {
                    aVar.mo9118h(Long.parseLong(m2140L0(P1[2])));
                    return;
                } else if (K03.equals("target")) {
                    Object K04 = m2136K0(P1[2]);
                    aVar.mo9119i(K04 instanceof View ? (View) K04 : m2260m0(K04, P1[2]));
                    return;
                } else {
                    return;
                }
            } else if (K0 instanceof AnimationSet) {
                AnimationSet animationSet = (AnimationSet) K0;
                Object K05 = m2136K0(P1[1]);
                if (K05.equals("cancel")) {
                    animationSet.cancel();
                    return;
                } else if (K05.equals("reset")) {
                    animationSet.reset();
                    return;
                } else if (K05.equals("start")) {
                    animationSet.start();
                    return;
                } else if (K05.equals("duration")) {
                    animationSet.setDuration(Long.parseLong(m2140L0(P1[2])));
                    return;
                } else if (K05.equals("enabled")) {
                    animationSet.setFillEnabled(m2136K0(P1[2]).equals(bool));
                    return;
                } else if (K05.equals("after")) {
                    animationSet.setFillAfter(m2136K0(P1[2]).equals(bool));
                    return;
                } else if (K05.equals("before")) {
                    animationSet.setFillBefore(m2136K0(P1[2]).equals(bool));
                    return;
                } else if (K05.equals("delay")) {
                    animationSet.setStartOffset(Long.parseLong(m2140L0(P1[2])));
                    return;
                } else if (K05.equals("repeat")) {
                    animationSet.setRepeatCount(m2216d(m2140L0(P1[2])));
                    return;
                } else if (K05.equals("add")) {
                    animationSet.addAnimation((Animation) m2136K0(P1[2]));
                    return;
                } else {
                    return;
                }
            } else if (K0 instanceof C0921c) {
                C0921c cVar = (C0921c) K0;
                Object K06 = m2136K0(P1[1]);
                if (K06.equals("cancel")) {
                    cVar.mo9111b();
                    return;
                } else if (K06.equals("clone")) {
                    str2 = P1[2].trim();
                    valueOf = cVar.clone();
                } else if (K06.equals("start")) {
                    cVar.mo9120j();
                    return;
                } else if (K06.equals("running")) {
                    str2 = P1[2].trim();
                    z = cVar.mo9115e();
                    valueOf = Boolean.valueOf(z);
                } else if (K06.equals("duration")) {
                    cVar.mo9130u(Long.parseLong(m2140L0(P1[2])));
                    return;
                } else if (K06.equals("delay")) {
                    cVar.mo9118h(Long.parseLong(m2140L0(P1[2])));
                    return;
                } else if (K06.equals("target")) {
                    Object K07 = m2136K0(P1[2]);
                    cVar.mo9119i(K07 instanceof View ? (View) K07 : m2260m0(K07, P1[2]));
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
            mo8981T(str2, valueOf);
        }
    }

    /* renamed from: J0 */
    private void m2132J0(String str) {
        String str2;
        int i;
        Context context;
        Context context2;
        int i2;
        String[] P1 = m2161P1(m2186V2(str));
        int i3 = 0;
        String L0 = m2140L0(P1[0]);
        if (L0.equals("w")) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            str2 = P1[1].trim();
            context2 = this.f1815d;
            i2 = displayMetrics.widthPixels;
        } else {
            if (L0.equals("h")) {
                WindowManager.LayoutParams attributes = this.f1814c.getWindow().getAttributes();
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                if ((attributes.flags & 1024) == 1024) {
                    str2 = P1[1].trim();
                    context = this.f1815d;
                    i = displayMetrics2.heightPixels;
                } else {
                    str2 = P1[1].trim();
                    context = this.f1815d;
                    i = displayMetrics2.heightPixels - m2122H0();
                }
            } else {
                if (L0.equals("pxw")) {
                    DisplayMetrics displayMetrics3 = new DisplayMetrics();
                    this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics3);
                    str2 = P1[1].trim();
                    i3 = displayMetrics3.widthPixels;
                } else if (L0.equals("pxh")) {
                    WindowManager.LayoutParams attributes2 = this.f1814c.getWindow().getAttributes();
                    DisplayMetrics displayMetrics4 = new DisplayMetrics();
                    this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics4);
                    if ((attributes2.flags & 1024) == 1024) {
                        str2 = P1[1].trim();
                        i3 = displayMetrics4.heightPixels;
                    } else {
                        str2 = P1[1].trim();
                        i3 = displayMetrics4.heightPixels - m2122H0();
                    }
                } else if (L0.equals("pxhh")) {
                    DisplayMetrics displayMetrics5 = new DisplayMetrics();
                    this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics5);
                    str2 = P1[1].trim();
                    i3 = displayMetrics5.heightPixels;
                } else if (L0.equals("hh")) {
                    DisplayMetrics displayMetrics6 = new DisplayMetrics();
                    this.f1814c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics6);
                    str2 = P1[1].trim();
                    context2 = this.f1815d;
                    i2 = displayMetrics6.heightPixels;
                } else if (L0.equals("pxztl")) {
                    str2 = P1[1].trim();
                    i3 = m2127I0();
                } else if (L0.equals("pxbvk")) {
                    str2 = P1[1].trim();
                    i3 = m2093B0();
                } else if (L0.equals("ztl")) {
                    str2 = P1[1].trim();
                    context = this.f1815d;
                    i = m2127I0();
                } else if (L0.equals("bvk")) {
                    str2 = P1[1].trim();
                    context = this.f1815d;
                    i = m2093B0();
                } else {
                    str2 = P1[1].trim();
                }
                mo8981T(str2, Integer.valueOf(i3));
            }
            i3 = C0860r.m2064w(context, (float) i);
            mo8981T(str2, Integer.valueOf(i3));
        }
        i3 = C0860r.m2064w(context2, (float) i2);
        mo8981T(str2, Integer.valueOf(i3));
    }

    /* renamed from: J2 */
    private void m2133J2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), m2140L0(P1[0]).trim());
    }

    @TargetApi(11)
    /* renamed from: J3 */
    private void m2134J3(String str) {
        Vibrator vibrator;
        String str2;
        Object obj;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof Vibrator) {
            vibrator = (Vibrator) K0;
        } else {
            vibrator = (Vibrator) this.f1815d.getSystemService("vibrator");
            mo8981T(P1[0].trim(), vibrator);
        }
        int i = 1;
        if (length == 2) {
            Object K02 = m2136K0(P1[1]);
            if (K02.equals("sp")) {
                try {
                    vibrator.cancel();
                } catch (Exception unused) {
                }
                str2 = P1[0].trim();
                obj = null;
            } else {
                vibrator.vibrate((long) m2216d(String.valueOf(K02)));
                return;
            }
        } else if (length == 3) {
            Object K03 = m2136K0(P1[1]);
            if (!K03.equals("ip")) {
                String[] v2 = m2307v2(String.valueOf(K03), ' ');
                int length2 = v2.length;
                long[] jArr = new long[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    try {
                        jArr[i2] = (long) Integer.parseInt(v2[i2]);
                    } catch (NumberFormatException unused2) {
                        jArr[i2] = 0;
                    }
                }
                if (!m2136K0(P1[2]).equals(Boolean.TRUE)) {
                    i = -1;
                }
                vibrator.vibrate(jArr, i);
                return;
            } else if (Build.VERSION.SDK_INT >= 11) {
                str2 = P1[2].trim();
                obj = Boolean.valueOf(vibrator.hasVibrator());
            } else {
                str2 = P1[2].trim();
                obj = Boolean.FALSE;
            }
        } else {
            return;
        }
        mo8981T(str2, obj);
    }

    /* renamed from: K */
    private void m2135K(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            String trim = P1[0].trim();
            Object K0 = m2136K0(P1[1]);
            Boolean bool = Boolean.TRUE;
            float f = 1.0f;
            float f2 = K0.equals(bool) ? 1.0f : 0.0f;
            if (!m2136K0(P1[2]).equals(bool)) {
                f = 0.0f;
            }
            mo8981T(trim, new AlphaAnimation(f2, f));
        }
    }

    /* renamed from: K0 */
    private Object m2136K0(String str) {
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
            return this.f1815d;
        }
        boolean z = true;
        if (!trim.contains("[\n龘`/r}")) {
            return (!trim.startsWith("\"") || !trim.endsWith("\"")) ? m2296t1(trim) ? trim.contains(".") ? trim.startsWith("00") ? trim : Double.valueOf(Double.parseDouble(trim)) : trim.startsWith("00") ? trim : trim.length() < 10 ? Integer.valueOf(Integer.parseInt(trim)) : Long.valueOf(Long.parseLong(trim)) : m2187W(trim) : m2183V(m2201a(trim.substring(1, trim.length() - 1)));
        }
        String[] w2 = m2311w2(trim, "[\n龘`/r}");
        int length = w2.length;
        Object[] objArr = new Object[length];
        double d = 0.0d;
        for (int i = 0; i < length; i++) {
            objArr[i] = m2136K0(w2[i].trim());
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

    /* renamed from: K2 */
    private void m2137K2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), m2140L0(P1[0]).toUpperCase());
    }

    /* renamed from: K3 */
    private int m2138K3(String str) {
        String W2 = m2190W2(str);
        String b0 = m2207b0(str);
        while (m2211c(W2)) {
            int e = mo8984e(b0);
            if (e != 2) {
                if (e == 1) {
                    break;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: L */
    private void m2139L(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        mo8981T(P1[0].trim(), null);
        Object K0 = m2136K0(P1[1]);
        View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[1]);
        float[] fArr = new float[(length - 3)];
        int i = 0;
        for (int i2 = 3; i2 < length; i2++) {
            fArr[i] = Float.parseFloat(m2140L0(P1[i2]));
            i++;
        }
        mo8981T(P1[0].trim(), C0934i.m2550K(m0, m2140L0(P1[2]), fArr));
    }

    /* renamed from: L0 */
    private String m2140L0(String str) {
        return String.valueOf(m2136K0(str));
    }

    /* renamed from: L1 */
    private void m2141L1(String str) {
        byte[] bArr;
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        byte[] bArr2 = null;
        int i = 0;
        if (length == 2) {
            byte[] t = C0839h.m1911t(this.f1815d, m2140L0(P1[0]));
            if (t == null) {
                str2 = P1[1];
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int length2 = t.length;
                while (i < length2) {
                    byte b = t[i];
                    stringBuffer.append(' ');
                    stringBuffer.append((int) b);
                    i++;
                }
                mo8981T(P1[1].trim(), stringBuffer.toString().trim());
                return;
            }
        } else if (length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 == null) {
                bArr = m2140L0(P1[1]).getBytes();
            } else {
                try {
                    bArr = m2140L0(P1[1]).getBytes(K0.toString());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    bArr = null;
                }
            }
            if (bArr == null) {
                str2 = P1[2];
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                int length3 = bArr.length;
                while (i < length3) {
                    byte b2 = bArr[i];
                    stringBuffer2.append(' ');
                    stringBuffer2.append((int) b2);
                    i++;
                }
                mo8981T(P1[2].trim(), stringBuffer2.toString().trim());
                return;
            }
        } else if (length == 4) {
            Object K02 = m2136K0(P1[0]);
            if (K02.equals("file")) {
                mo8981T(P1[3].trim(), C0839h.m1911t(this.f1815d, m2140L0(P1[2])));
                return;
            } else if (K02.equals("str")) {
                Object K03 = m2136K0(P1[1]);
                if (K03 == null) {
                    bArr2 = m2140L0(P1[2]).getBytes();
                } else {
                    try {
                        bArr2 = m2140L0(P1[2]).getBytes(K03.toString());
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                }
                mo8981T(P1[3].trim(), bArr2);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        mo8981T(str2.trim(), null);
    }

    /* renamed from: L2 */
    private void m2142L2(String str) {
        String trim;
        String E;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            trim = P1[1].trim();
            E = C0860r.m2040D(m2140L0(P1[0]));
        } else if (P1.length == 4) {
            trim = P1[3].trim();
            E = C0860r.m2041E(m2140L0(P1[0]), m2140L0(P1[1]));
        } else {
            return;
        }
        mo8981T(trim, E);
    }

    /* renamed from: L3 */
    private void m2143L3(String str) {
        View p;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            Object K0 = m2136K0(P1[0]);
            if (String.valueOf(K0).endsWith(".yul")) {
                mo8981T(P1[1].trim(), C0839h.m1907p(this.f1815d, String.valueOf(K0)));
                return;
            }
            Object K02 = m2136K0(P1[1]);
            if (String.valueOf(K02).endsWith(".yul")) {
                View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
                if (m0 != null && (p = C0839h.m1907p(this.f1815d, String.valueOf(K02))) != null) {
                    ((ViewGroup) m0).addView(p);
                }
            }
        }
    }

    /* renamed from: M */
    private void m2144M(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        mo8981T(P1[0].trim(), null);
        C0921c cVar = new C0921c();
        AbstractC0918a[] aVarArr = new AbstractC0918a[(length - 2)];
        int i = 0;
        for (int i2 = 2; i2 < length; i2++) {
            Object K0 = m2136K0(P1[i2]);
            if (K0 instanceof AbstractC0918a) {
                aVarArr[i] = (AbstractC0918a) K0;
                i++;
            }
        }
        Object K02 = m2136K0(P1[1]);
        if (K02.equals("sequen")) {
            cVar.mo9128s(aVarArr);
        } else if (K02.equals("together")) {
            cVar.mo9129t(aVarArr);
        }
        mo8981T(P1[0].trim(), cVar);
    }

    /* renamed from: M0 */
    private String m2145M0(String str) {
        Object K0 = m2136K0(str);
        if (K0 == null) {
            return null;
        }
        return K0.toString();
    }

    /* renamed from: M1 */
    public static String[] m2146M1(String str, char c, char c2) {
        char c3;
        if (f1805o == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(c);
            stringBuffer.append(c2);
            return C0861s.m2071d(str, stringBuffer.toString());
        }
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer2 = new StringBuffer();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        boolean z = false;
        loop0:
        while (i < length) {
            if (charArray[i] == '\"') {
                stringBuffer2.append(charArray[i]);
                do {
                    i++;
                    if (i >= length) {
                        break loop0;
                    }
                    stringBuffer2.append(charArray[i]);
                } while (charArray[i] != '\"');
                z = true;
            } else if (charArray[i] == c) {
                if (z) {
                    z = false;
                }
                i++;
                if (i >= length) {
                    break;
                }
                if (charArray[i] == c2) {
                    String trim = stringBuffer2.toString().trim();
                    if (trim.length() > 0) {
                        arrayList.add(trim);
                    }
                }
                stringBuffer2.setLength(0);
            } else if (charArray[i] == '+') {
                if (z) {
                    z = false;
                }
                stringBuffer2.append("[\n龘`/r}");
            } else {
                if (charArray[i] == '=' || charArray[i] == '!' || charArray[i] == '>' || charArray[i] == '<' || charArray[i] == '?' || charArray[i] == '*' || charArray[i] == '|' || charArray[i] == '&' || charArray[i] == '[') {
                    if (z) {
                        z = false;
                    }
                    c3 = charArray[i];
                } else if (z && charArray[i] != ' ') {
                    return null;
                } else {
                    c3 = charArray[i];
                }
                stringBuffer2.append(c3);
            }
            i++;
        }
        String trim2 = stringBuffer2.toString().trim();
        if (trim2.length() > 0) {
            arrayList.add(trim2);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: M2 */
    private void m2147M2(String str) {
        ((ClipboardManager) this.f1815d.getSystemService("clipboard")).setText(m2140L0(m2161P1(m2186V2(str))[0]));
    }

    /* renamed from: M3 */
    private void m2148M3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Integer.valueOf(C0860r.m2053l(this.f1815d, (float) m2216d(m2140L0(P1[0])))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: android.graphics.drawable.AnimationDrawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m2149N(String str) {
        String str2;
        Boolean bool;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            Object K0 = m2136K0(P1[1]);
            if (K0 instanceof Boolean) {
                AnimationDrawable animationDrawable = new AnimationDrawable();
                animationDrawable.setOneShot(!m2136K0(P1[1]).equals(Boolean.TRUE));
                str2 = P1[0].trim();
                bool = animationDrawable;
            } else if (K0.equals("start")) {
                Object K02 = m2136K0(P1[0]);
                if (K02 instanceof AnimationDrawable) {
                    ((AnimationDrawable) K02).start();
                    return;
                }
                return;
            } else if (K0.equals("stop")) {
                Object K03 = m2136K0(P1[0]);
                if (K03 instanceof AnimationDrawable) {
                    ((AnimationDrawable) K03).stop();
                    return;
                }
                return;
            } else {
                return;
            }
        } else if (length == 3) {
            Object K04 = m2136K0(P1[0]);
            if (K04 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable2 = (AnimationDrawable) K04;
                Object K05 = m2136K0(P1[1]);
                if (K05.equals("running")) {
                    str2 = P1[2].trim();
                    bool = Boolean.valueOf(animationDrawable2.isRunning());
                } else {
                    animationDrawable2.addFrame(K05 instanceof Drawable ? (Drawable) K05 : K05 instanceof Bitmap ? new BitmapDrawable((Bitmap) K05) : C1305g.m3582m(String.valueOf(K05), this.f1815d), m2216d(m2140L0(P1[2])));
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        mo8981T(str2, bool);
    }

    /* renamed from: N0 */
    private String m2150N0(String str) {
        return C0839h.m1906o(this.f1815d, str);
    }

    /* renamed from: N1 */
    public static int m2151N1(String str, char c) {
        if (f1805o == 0) {
            return str.indexOf(c);
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (i < length) {
            if (charArray[i] == '\"') {
                do {
                    i++;
                    if (i >= length) {
                        return -1;
                    }
                } while (charArray[i] != '\"');
            } else if (charArray[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: N2 */
    private void m2152N2(String str) {
        m2157O2(m2136K0(m2161P1(m2186V2(str))[0]));
    }

    /* renamed from: N3 */
    private void m2153N3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length > 1) {
            Object[] objArr = new Object[length];
            objArr[0] = "Activity";
            objArr[1] = this.f1815d;
            if (length > 2) {
                for (int i = 2; i < length; i++) {
                    objArr[i] = m2136K0(P1[i]);
                }
            }
            mo8981T(P1[0].trim(), C0839h.m1905n(m2140L0(P1[1]), objArr));
        }
    }

    /* renamed from: O */
    private void m2154O(String str) {
        String[] P1 = m2161P1(m2190W2(str));
        ArrayList arrayList = new ArrayList();
        String[] v2 = m2307v2(str, '\n');
        String str2 = "";
        int i = 0;
        for (int i2 = 0; i2 < v2.length; i2++) {
            if (v2[i2].equals("{")) {
                i++;
            } else if (v2[i2].equals("}")) {
                i--;
            } else if (i == 0) {
                if (v2[i2].startsWith("else")) {
                    str2 = v2[i2] + "\n";
                }
            }
            str2 = str2 + v2[i2] + "\n";
            if (i == 0) {
                arrayList.add(m2207b0(str2));
            }
        }
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof Animation) {
            new C1312j(this, (Animation) K0, arrayList.toArray());
        } else if (K0 instanceof AbstractC0918a) {
            new C1312j(this, (AbstractC0918a) K0, arrayList.toArray());
        }
    }

    /* renamed from: O0 */
    private String m2155O0(String str, String str2, String str3) {
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

    /* renamed from: O1 */
    public static int m2156O1(String str, char c, char c2) {
        if (f1805o == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(c);
            stringBuffer.append(c2);
            return str.indexOf(stringBuffer.toString());
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (i < length) {
            if (charArray[i] == '\"') {
                do {
                    i++;
                    if (i >= length) {
                        return -1;
                    }
                } while (charArray[i] != '\"');
            } else if (charArray[i] != c) {
                continue;
            } else {
                i++;
                if (i >= length) {
                    return -1;
                }
                if (charArray[i] == c2) {
                    return i - 1;
                }
            }
            i++;
        }
        return -1;
    }

    /* renamed from: O2 */
    public static void m2157O2(Object obj) {
        C0839h.m1885A(obj);
    }

    /* renamed from: O3 */
    private void m2158O3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Integer.valueOf(C0860r.m2064w(this.f1815d, (float) m2216d(m2140L0(P1[0])))));
    }

    /* renamed from: P */
    private void m2159P(String str) {
        String trim;
        RotateAnimation rotateAnimation;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 3) {
            trim = P1[0].trim();
            rotateAnimation = new RotateAnimation(Float.parseFloat(m2140L0(P1[1])), Float.parseFloat(m2140L0(P1[2])));
        } else if (length == 7) {
            trim = P1[0].trim();
            rotateAnimation = new RotateAnimation(Float.parseFloat(m2140L0(P1[1])), Float.parseFloat(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), Float.parseFloat(m2140L0(P1[4])), m2216d(m2140L0(P1[5])), Float.parseFloat(m2140L0(P1[6])));
        } else {
            return;
        }
        mo8981T(trim, rotateAnimation);
    }

    /* renamed from: P0 */
    private GradientDrawable.Orientation m2160P0(String str) {
        return str.equals("topbottom") ? GradientDrawable.Orientation.TOP_BOTTOM : str.equals("trbl") ? GradientDrawable.Orientation.TR_BL : str.equals("rightleft") ? GradientDrawable.Orientation.RIGHT_LEFT : str.equals("brtl") ? GradientDrawable.Orientation.BR_TL : str.equals("bottomtop") ? GradientDrawable.Orientation.BOTTOM_TOP : str.equals("bltr") ? GradientDrawable.Orientation.BL_TR : str.equals("leftright") ? GradientDrawable.Orientation.LEFT_RIGHT : str.equals("tlbr") ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TOP_BOTTOM;
    }

    /* renamed from: P1 */
    public static String[] m2161P1(String str) {
        if (f1805o == 0) {
            return C0861s.m2069b(str, ',');
        }
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        boolean z = false;
        loop0:
        while (i < length) {
            if (charArray[i] == '\"') {
                stringBuffer.append(charArray[i]);
                do {
                    i++;
                    if (i >= length) {
                        break loop0;
                    }
                    stringBuffer.append(charArray[i]);
                } while (charArray[i] != '\"');
                z = true;
            } else if (charArray[i] == ',') {
                if (z) {
                    z = false;
                }
                String trim = stringBuffer.toString().trim();
                if (trim.length() > 0) {
                    arrayList.add(trim);
                }
                stringBuffer.setLength(0);
            } else if (charArray[i] == '+') {
                if (z) {
                    z = false;
                }
                stringBuffer.append("[\n龘`/r}");
            } else if (z && charArray[i] != ' ') {
                return null;
            } else {
                stringBuffer.append(charArray[i]);
            }
            i++;
        }
        String trim2 = stringBuffer.toString().trim();
        if (trim2.length() > 0) {
            arrayList.add(trim2);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: P2 */
    private void m2162P2(String str) {
        m2157O2(str);
    }

    /* renamed from: P3 */
    private void m2163P3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Integer.valueOf(C0860r.m2065x(this.f1815d, (float) m2216d(m2140L0(P1[0])))));
    }

    /* renamed from: Q */
    private void m2164Q(String str) {
        String trim;
        ScaleAnimation scaleAnimation;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 5) {
            trim = P1[0].trim();
            scaleAnimation = new ScaleAnimation(Float.parseFloat(m2140L0(P1[1])), Float.parseFloat(m2140L0(P1[2])), Float.parseFloat(m2140L0(P1[3])), Float.parseFloat(m2140L0(P1[4])));
        } else if (length == 9) {
            trim = P1[0].trim();
            scaleAnimation = new ScaleAnimation(Float.parseFloat(m2140L0(P1[1])), Float.parseFloat(m2140L0(P1[2])), Float.parseFloat(m2140L0(P1[3])), Float.parseFloat(m2140L0(P1[4])), m2216d(m2140L0(P1[5])), Float.parseFloat(m2140L0(P1[6])), m2216d(m2140L0(P1[7])), Float.parseFloat(m2140L0(P1[8])));
        } else {
            return;
        }
        mo8981T(trim, scaleAnimation);
    }

    @TargetApi(11)
    /* renamed from: Q1 */
    private void m2165Q1(com.iapp.app.p067x5.WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    /* renamed from: Q2 */
    private void m2166Q2(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            trim = P1[1].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[1])) % Double.parseDouble(m2140L0(P1[0])));
        } else if (length == 3) {
            trim = P1[2].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[0])) % Double.parseDouble(m2140L0(P1[1])));
        } else if (length == 4 && m2136K0(P1[2]).equals(Boolean.TRUE)) {
            trim = P1[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2140L0(P1[0])) % Double.parseDouble(m2140L0(P1[1])));
            mo8981T(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        mo8981T(trim, valueOf);
    }

    /* renamed from: Q3 */
    private void m2167Q3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Integer.valueOf(C0860r.m2037A(this.f1815d, (float) m2216d(m2140L0(P1[0])))));
    }

    /* renamed from: R */
    private void m2168R(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        AnimationSet animationSet = new AnimationSet(m2136K0(P1[1]).equals(Boolean.TRUE));
        for (int i = 2; i < length; i++) {
            Object K0 = m2136K0(P1[i]);
            if (K0 instanceof Animation) {
                animationSet.addAnimation((Animation) K0);
            }
        }
        mo8981T(P1[0].trim(), animationSet);
    }

    /* renamed from: R0 */
    private String m2169R0(String str) {
        String c;
        String c2;
        Intent launchIntentForPackage = this.f1815d.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null || (c = C0860r.m2044c(launchIntentForPackage.toString(), "cmp=", " ")) == null || (c2 = C0860r.m2044c(c, "/", null)) == null) {
            return "";
        }
        if (!c2.startsWith(".")) {
            return c2;
        }
        return str + c2;
    }

    /* renamed from: R1 */
    private void m2170R1(String str) {
        Object obj;
        String str2;
        String str3;
        String str4;
        C1310i iVar;
        String trim;
        Object c;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 1) {
            trim = P1[0].trim();
            c = new C1310i(this.f1815d);
        } else if (length == 2) {
            mo8981T(P1[1].trim(), new C1310i(this.f1815d, m2150N0(m2140L0(P1[0]))));
            return;
        } else if (length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof C1310i) {
                Object K02 = m2136K0(P1[1]);
                if (K02.equals("asset")) {
                    trim = P1[2].trim();
                    c = ((C1310i) K0).mo11947a();
                } else if (K02.equals("resources")) {
                    trim = P1[2].trim();
                    c = ((C1310i) K0).mo11949c();
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (length == 4) {
                Object K03 = m2136K0(P1[0]);
                if (K03 instanceof C1310i) {
                    str2 = P1[3].trim();
                    iVar = (C1310i) K03;
                    str4 = m2140L0(P1[1]);
                    str3 = P1[2];
                } else {
                    return;
                }
            } else if (length == 5) {
                Object K04 = m2136K0(P1[0]);
                if (!(K04 instanceof C1310i)) {
                    return;
                }
                if (m2136K0(P1[3]).equals(Boolean.TRUE)) {
                    str2 = P1[4].trim();
                    obj = Integer.valueOf(((C1310i) K04).mo11948b(m2140L0(P1[1]), m2140L0(P1[2])));
                    mo8981T(str2, obj);
                    return;
                }
                str2 = P1[4].trim();
                iVar = (C1310i) K04;
                str4 = m2140L0(P1[1]);
                str3 = P1[2];
            } else {
                return;
            }
            obj = iVar.mo11950d(str4, m2140L0(str3));
            mo8981T(str2, obj);
            return;
        }
        mo8981T(trim, c);
    }

    /* renamed from: R2 */
    private void m2171R2(String str) {
        String b0 = m2207b0(str);
        C0870c0 c0Var = new C0870c0();
        this.f1813b.put(String.valueOf(c0Var.getId()), b0);
        c0Var.setName("CeShi_" + c0Var.getId());
        c0Var.start();
    }

    /* renamed from: S */
    private void m2172S(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 5) {
            mo8981T(P1[0].trim(), new TranslateAnimation(Float.parseFloat(m2140L0(P1[1])), Float.parseFloat(m2140L0(P1[2])), Float.parseFloat(m2140L0(P1[3])), Float.parseFloat(m2140L0(P1[4]))));
        }
    }

    /* renamed from: S0 */
    private int m2173S0(String str) {
        if (str.equals("-1")) {
            return -1;
        }
        if (str.equals("-2")) {
            return -2;
        }
        return str.endsWith("dp") ? C0860r.m2053l(this.f1815d, Float.parseFloat(str.substring(0, str.length() - 2))) : m2216d(str);
    }

    /* renamed from: S1 */
    private void m2174S1(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] v2 = m2307v2(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : v2) {
            str2 = str2.replace(" " + str3.trim() + " ", m2140L0(str3));
        }
        long j = -1;
        try {
            j = (long) C1017h.m2796f(str2).mo9936a();
        } catch (C1027e e) {
            e.printStackTrace();
        }
        mo8981T(substring.substring(indexOf + 1).trim(), Long.valueOf(j));
    }

    /* renamed from: S2 */
    private void m2175S2(String str) {
        String str2;
        Integer num;
        int height;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof Bitmap) {
                String L0 = m2140L0(P1[1]);
                if (L0.equals("w")) {
                    str2 = P1[2].trim();
                    height = ((Bitmap) K0).getWidth();
                } else if (L0.equals("h")) {
                    str2 = P1[2].trim();
                    height = ((Bitmap) K0).getHeight();
                } else {
                    return;
                }
                num = Integer.valueOf(height);
            } else {
                str2 = P1[2].trim();
                num = null;
            }
            mo8981T(str2, num);
        }
    }

    /* renamed from: T0 */
    private void m2176T0(String str) {
        String trim;
        Object component;
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        String L0 = m2140L0(P1[1]);
        Intent intent = K0 instanceof Intent ? (Intent) K0 : null;
        if (L0.equals("action")) {
            if (intent == null) {
                str2 = P1[2];
            } else {
                trim = P1[2].trim();
                component = intent.getAction();
                mo8981T(trim, component);
                return;
            }
        } else if (L0.equals("type")) {
            if (intent == null) {
                str2 = P1[2];
            } else {
                trim = P1[2].trim();
                component = intent.getType();
                mo8981T(trim, component);
                return;
            }
        } else if (L0.equals("extra")) {
            if (intent == null) {
                str2 = P1[3];
            } else {
                mo8981T(P1[3].trim(), intent.getExtras().get(m2140L0(P1[2])));
                return;
            }
        } else if (L0.equals("flags")) {
            if (intent == null) {
                str2 = P1[2];
            } else {
                trim = P1[2].trim();
                component = Integer.valueOf(intent.getFlags());
                mo8981T(trim, component);
                return;
            }
        } else if (L0.equals("data")) {
            if (intent == null) {
                str2 = P1[2];
            } else {
                trim = P1[2].trim();
                component = intent.getData();
                mo8981T(trim, component);
                return;
            }
        } else if (L0.equals("datastring")) {
            if (intent == null) {
                str2 = P1[2];
            } else {
                trim = P1[2].trim();
                component = intent.getDataString();
                mo8981T(trim, component);
                return;
            }
        } else if (!L0.equals("component")) {
            return;
        } else {
            if (intent == null) {
                str2 = P1[2];
            } else {
                trim = P1[2].trim();
                component = intent.getComponent();
                mo8981T(trim, component);
                return;
            }
        }
        mo8981T(str2.trim(), null);
    }

    /* renamed from: T1 */
    private void m2177T1(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] v2 = m2307v2(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : v2) {
            str2 = str2.replace(" " + str3.trim() + " ", m2140L0(str3));
        }
        double d = -1.0d;
        try {
            d = C1017h.m2796f(str2).mo9936a();
        } catch (C1027e e) {
            e.printStackTrace();
        }
        mo8981T(substring.substring(indexOf + 1).trim(), String.format("%.2f", Double.valueOf(d)));
    }

    /* renamed from: T2 */
    private void m2178T2(String str) {
        String str2;
        Bitmap bitmap;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof Bitmap) {
                String L0 = m2140L0(P1[1]);
                if (L0.equals("x")) {
                    str2 = P1[2].trim();
                    bitmap = C0849k.m1966f((Bitmap) K0, 0);
                } else if (L0.equals("y")) {
                    str2 = P1[2].trim();
                    bitmap = C0849k.m1966f((Bitmap) K0, 1);
                } else {
                    return;
                }
            } else {
                str2 = P1[2].trim();
                bitmap = null;
            }
            mo8981T(str2, bitmap);
        }
    }

    /* renamed from: U */
    private void m2179U(String str, Object obj, int i) {
        HashMap<String, Object> hashMap;
        if (!str.equals("null")) {
            if (i == 0) {
                hashMap = this.f1812a;
            } else if (i == 1) {
                hashMap = f1801k;
            } else if (i == 2) {
                hashMap = f1800j;
            } else {
                return;
            }
            hashMap.put(str, obj);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: U0 */
    private boolean m2180U0(C0864v vVar, String str, String str2) {
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

    /* renamed from: U1 */
    private void m2181U1(String str) {
        Object createBitmap;
        String str2;
        String str3;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object K0 = m2136K0(P1[0]);
        Bitmap v = K0 instanceof Bitmap ? (Bitmap) K0 : C0839h.m1913v(this.f1815d, String.valueOf(K0));
        if (length != 2) {
            if (length == 6) {
                if (v == null) {
                    str3 = P1[5];
                } else {
                    createBitmap = Bitmap.createBitmap(v, m2216d(m2140L0(P1[1])), m2216d(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2216d(m2140L0(P1[4])));
                    str2 = P1[5];
                }
            } else if (length != 7) {
                return;
            } else {
                if (v == null) {
                    str3 = P1[6];
                } else {
                    Matrix matrix = new Matrix();
                    matrix.preRotate((float) m2216d(m2140L0(P1[5])));
                    createBitmap = Bitmap.createBitmap(v, m2216d(m2140L0(P1[1])), m2216d(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2216d(m2140L0(P1[4])), matrix, true);
                    str2 = P1[6];
                }
            }
            mo8981T(str2.trim(), createBitmap);
            return;
        } else if (v == null) {
            str3 = P1[1];
        } else {
            mo8981T(P1[1].trim(), v);
            return;
        }
        mo8981T(str3.trim(), null);
    }

    /* renamed from: U2 */
    private void m2182U2(String str) {
        Formatter formatter;
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        try {
            mo8981T(P1[1].trim(), C0860r.m2062u(m2216d(m2140L0(P1[0]))));
        } catch (NumberFormatException unused) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(new Date().getTime());
            Formatter formatter2 = new Formatter(Locale.CHINA);
            P1[0] = m2140L0(P1[0]);
            if (P1[0].length() == 1) {
                str2 = P1[1].trim();
                formatter = formatter2.format("%1$t" + P1[0], instance);
            } else {
                str2 = P1[1].trim();
                formatter = formatter2.format(P1[0], instance);
            }
            mo8981T(str2, formatter.toString());
        }
    }

    /* renamed from: V */
    public static String m2183V(String str) {
        if (!str.contains("\\")) {
            return str;
        }
        if (str.contains("\\\\")) {
            str = str.replace("\\\\", "\\U5c");
        }
        if (str.contains("\\t")) {
            str = str.replace("\\t", "\t");
        }
        if (str.contains("\\n")) {
            str = str.replace("\\n", "\n");
        }
        if (str.contains("\\r")) {
            str = str.replace("\\r", "\r");
        }
        if (str.contains("\\b")) {
            str = str.replace("\\b", "\b");
        }
        if (str.contains("\\f")) {
            str = str.replace("\\f", "\f");
        }
        if (!str.contains("\\U")) {
            return str;
        }
        if (str.contains("\\U5c")) {
            str = str.replace("\\U5c", "\\");
        }
        if (str.contains("\\U28")) {
            str = str.replace("\\U28", "(");
        }
        if (str.contains("\\U29")) {
            str = str.replace("\\U29", ")");
        }
        if (str.contains("\\U2c")) {
            str = str.replace("\\U2c", ",");
        }
        if (str.contains("\\U3d")) {
            str = str.replace("\\U3d", "=");
        }
        if (str.contains("\\U21")) {
            str = str.replace("\\U21", "!");
        }
        if (str.contains("\\U3e")) {
            str = str.replace("\\U3e", ">");
        }
        if (str.contains("\\U3c")) {
            str = str.replace("\\U3c", "<");
        }
        if (str.contains("\\U3f")) {
            str = str.replace("\\U3f", "?");
        }
        if (str.contains("\\U2a")) {
            str = str.replace("\\U2a", "*");
        }
        if (str.contains("\\U2b")) {
            str = str.replace("\\U2b", "+");
        }
        if (str.contains("\\U7b")) {
            str = str.replace("\\U7b", "{");
        }
        if (str.contains("\\U7d")) {
            str = str.replace("\\U7d", "}");
        }
        if (str.contains("\\U7c")) {
            str = str.replace("\\U7c", "|");
        }
        if (str.contains("\\U26")) {
            str = str.replace("\\U26", "&");
        }
        return str.contains("\\U22") ? str.replace("\\U22", "\"") : str;
    }

    /* renamed from: V0 */
    private void m2184V0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            mo8981T(P1[2].trim(), ((ArrayList) m2136K0(P1[0])).get(m2216d(m2140L0(P1[1]))));
        }
    }

    /* renamed from: V1 */
    private void m2185V1(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            trim = P1[1].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[1])) * Double.parseDouble(m2140L0(P1[0])));
        } else if (length == 3) {
            trim = P1[2].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[0])) * Double.parseDouble(m2140L0(P1[1])));
        } else if (length == 4 && m2136K0(P1[2]).equals(Boolean.TRUE)) {
            trim = P1[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2140L0(P1[0])) * Double.parseDouble(m2140L0(P1[1])));
            mo8981T(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        mo8981T(trim, valueOf);
    }

    /* renamed from: V2 */
    private String m2186V2(String str) {
        return m2201a(str.substring(str.indexOf(40) + 1, str.lastIndexOf(41)));
    }

    /* renamed from: W */
    private Object m2187W(String str) {
        HashMap<String, Object> hashMap;
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String trim = str.substring(0, indexOf).trim();
            str = str.substring(indexOf + 1).trim();
            if (trim.equals("ss")) {
                hashMap = f1801k;
            } else if (trim.equals("sss")) {
                hashMap = f1800j;
            }
            return hashMap.get(str);
        }
        hashMap = this.f1812a;
        return hashMap.get(str);
    }

    /* renamed from: W0 */
    private void m2188W0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            mo8981T(P1[2].trim(), Integer.valueOf(((ArrayList) m2136K0(P1[0])).indexOf(m2136K0(P1[1]))));
        }
    }

    /* renamed from: W1 */
    private void m2189W1(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            trim = P1[1].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[1])) / Double.parseDouble(m2140L0(P1[0])));
        } else if (length == 3) {
            trim = P1[2].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[0])) / Double.parseDouble(m2140L0(P1[1])));
        } else if (length == 4 && m2136K0(P1[2]).equals(Boolean.TRUE)) {
            trim = P1[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2140L0(P1[0])) / Double.parseDouble(m2140L0(P1[1])));
            mo8981T(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        mo8981T(trim, valueOf);
    }

    /* renamed from: W2 */
    private String m2190W2(String str) {
        int indexOf = str.indexOf(10);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return m2201a(str.substring(str.indexOf(40) + 1, str.lastIndexOf(41, indexOf)));
    }

    /* renamed from: X0 */
    private void m2191X0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            mo8981T(P1[2].trim(), Boolean.valueOf(((ArrayList) m2136K0(P1[0])).contains(m2136K0(P1[1]))));
        }
    }

    /* renamed from: X1 */
    private void m2192X1(String str) {
        f1811u = Integer.parseInt(m2140L0(m2161P1(m2186V2(str))[0]));
    }

    /* renamed from: X2 */
    private void m2193X2(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            Object K0 = m2136K0(P1[0]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
            Bitmap bitmap = null;
            if (m0 == null) {
                mo8981T(P1[1].trim(), null);
                return;
            }
            if (m0 instanceof ImageView) {
                str2 = P1[1].trim();
                bitmap = C0849k.m1961a((ImageView) m0);
            } else {
                str2 = P1[1].trim();
            }
            mo8981T(str2, bitmap);
        }
    }

    /* renamed from: Y */
    private boolean m2194Y(String str, int i) {
        Object W;
        Object valueOf;
        int indexOf = str.indexOf(61);
        if (indexOf == -1) {
            String trim = str.substring(i + 2).trim();
            if (m2296t1(trim) || trim.indexOf(32) != -1) {
                return false;
            }
            m2179U(trim, null, i);
            return true;
        }
        String trim2 = str.substring(i + 2, indexOf).trim();
        if (m2296t1(trim2) || trim2.indexOf(32) != -1) {
            return false;
        }
        String trim3 = str.substring(indexOf + 1).trim();
        if (trim3.contains("\"")) {
            if (!trim3.startsWith("\"") || !trim3.endsWith("\"")) {
                return false;
            }
            W = m2183V(m2201a(trim3.substring(1, trim3.length() - 1)));
        } else if (trim3.equals("null")) {
            m2179U(trim2, null, i);
            return true;
        } else {
            if (trim3.equals("true")) {
                valueOf = Boolean.TRUE;
            } else if (trim3.equals("false")) {
                valueOf = Boolean.FALSE;
            } else if (!m2296t1(trim3)) {
                W = m2187W(trim3);
            } else if (trim3.contains(".")) {
                if (trim3.startsWith("00")) {
                    m2179U(trim2, trim3, i);
                }
                valueOf = Double.valueOf(Double.parseDouble(trim3));
            } else {
                if (trim2.startsWith("00")) {
                    m2179U(trim2, trim3, i);
                }
                m2179U(trim2, trim3.length() < 10 ? Integer.valueOf(Integer.parseInt(trim3)) : Long.valueOf(Long.parseLong(trim3)), i);
                return true;
            }
            m2179U(trim2, valueOf, i);
            return true;
        }
        m2179U(trim2, W, i);
        return true;
    }

    /* renamed from: Y0 */
    private void m2195Y0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            mo8981T(P1[1].trim(), Integer.valueOf(((ArrayList) m2136K0(P1[0])).size()));
        }
    }

    /* renamed from: Y1 */
    private void m2196Y1(String str) {
        String str2;
        Object obj;
        String trim;
        Object group;
        int end;
        int end2;
        boolean find;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof Matcher) {
            Matcher matcher = (Matcher) K0;
            String L0 = m2140L0(P1[1]);
            if (L0.equals("sral")) {
                trim = P1[3].trim();
                group = matcher.replaceAll(m2140L0(P1[2]));
            } else if (L0.equals("srft")) {
                trim = P1[3].trim();
                group = matcher.replaceFirst(m2140L0(P1[2]));
            } else {
                if (L0.equals("ms")) {
                    str2 = P1[2].trim();
                    find = matcher.matches();
                } else if (!L0.equals("find")) {
                    if (L0.equals("gl")) {
                        str2 = P1[2].trim();
                        end = matcher.groupCount();
                    } else {
                        if (L0.equals("start")) {
                            if (length == 4) {
                                trim = P1[3].trim();
                                end2 = matcher.start(m2216d(m2140L0(P1[2])));
                            } else {
                                str2 = P1[2].trim();
                                end = matcher.start();
                            }
                        } else if (L0.equals("end")) {
                            if (length == 4) {
                                trim = P1[3].trim();
                                end2 = matcher.end(m2216d(m2140L0(P1[2])));
                            } else {
                                str2 = P1[2].trim();
                                end = matcher.end();
                            }
                        } else if (!L0.equals("group")) {
                            return;
                        } else {
                            if (length == 4) {
                                trim = P1[3].trim();
                                group = matcher.group(m2216d(m2140L0(P1[2])));
                            } else {
                                str2 = P1[2].trim();
                                obj = matcher.group();
                            }
                        }
                        group = Integer.valueOf(end2);
                    }
                    obj = Integer.valueOf(end);
                } else if (length == 4) {
                    trim = P1[3].trim();
                    group = Boolean.valueOf(matcher.find(m2216d(m2140L0(P1[2]))));
                } else {
                    str2 = P1[2].trim();
                    find = matcher.find();
                }
                obj = Boolean.valueOf(find);
            }
            mo8981T(trim, group);
            return;
        } else if (K0 instanceof String) {
            obj = Pattern.compile(m2140L0(P1[1]), m2216d(m2140L0(P1[2]))).matcher(String.valueOf(K0));
            str2 = P1[3].trim();
        } else {
            return;
        }
        mo8981T(str2, obj);
    }

    /* renamed from: Y2 */
    private void m2197Y2(String str) {
        String str2;
        String str3;
        Bitmap bitmap;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof Bitmap) {
                bitmap = C0849k.m1964d((Bitmap) K0, (float) m2216d(m2140L0(P1[1])));
                str3 = P1[2];
            } else {
                str2 = P1[2];
                mo8981T(str2.trim(), null);
                return;
            }
        } else if (length == 4) {
            Object K02 = m2136K0(P1[0]);
            if (K02 instanceof Bitmap) {
                bitmap = C0849k.m1965e((Bitmap) K02, m2216d(m2140L0(P1[1])), m2216d(m2140L0(P1[2])));
                str3 = P1[3];
            } else {
                str2 = P1[3];
                mo8981T(str2.trim(), null);
                return;
            }
        } else {
            return;
        }
        mo8981T(str3.trim(), bitmap);
    }

    /* renamed from: Z */
    private int m2198Z() {
        this.f1816e = 9865198;
        this.f1817f = 9865197;
        return 9865197 + 1;
    }

    /* renamed from: Z0 */
    private void m2199Z0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            mo8981T(P1[2].trim(), Integer.valueOf(((ArrayList) m2136K0(P1[0])).lastIndexOf(m2136K0(P1[1]))));
        }
    }

    /* renamed from: Z2 */
    private void m2200Z2(String str) {
        String trim;
        boolean k;
        String str2;
        int i;
        String str3;
        boolean d;
        Object obj = Boolean.FALSE;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 1) {
            str2 = P1[0].trim();
            obj = new C1349p(this.f1815d);
        } else if (length == 2) {
            if (m2140L0(P1[1]).equals("re")) {
                Object K0 = m2136K0(P1[0]);
                if (K0 instanceof C1349p) {
                    ((C1349p) K0).mo11995h();
                    str2 = P1[0].trim();
                    obj = null;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (length == 3) {
            Object K02 = m2136K0(P1[0]);
            String L0 = m2140L0(P1[1]);
            if (!L0.equals("sp")) {
                if (L0.equals("ip")) {
                    if (K02 instanceof C1349p) {
                        str2 = P1[2].trim();
                        d = ((C1349p) K02).mo11991d();
                    } else {
                        str3 = P1[2];
                    }
                } else if (L0.equals("is")) {
                    if (K02 instanceof C1349p) {
                        str2 = P1[2].trim();
                        obj = Boolean.TRUE;
                    } else {
                        str3 = P1[2];
                    }
                } else if (L0.equals("ph")) {
                    if (K02 instanceof C1349p) {
                        ((C1349p) K02).mo11993f(Float.parseFloat(m2140L0(P1[2])));
                        return;
                    }
                    return;
                } else if (L0.equals("se")) {
                    if (K02 instanceof C1349p) {
                        ((C1349p) K02).mo11994g(Float.parseFloat(m2140L0(P1[2])));
                        return;
                    }
                    return;
                } else if (L0.equals("lg")) {
                    if (K02 instanceof C1349p) {
                        ((C1349p) K02).mo11992e(m2140L0(P1[2]));
                        return;
                    }
                    return;
                } else if (L0.equals("zt")) {
                    if (K02 instanceof C1349p) {
                        str2 = P1[2].trim();
                        i = ((C1349p) K02).mo11990c();
                    } else {
                        str2 = P1[2].trim();
                        i = -3;
                    }
                    obj = Integer.valueOf(i);
                } else {
                    return;
                }
                str2 = str3.trim();
            } else if (K02 instanceof C1349p) {
                str2 = P1[2].trim();
                d = ((C1349p) K02).mo11997j();
            } else {
                str3 = P1[2];
                str2 = str3.trim();
            }
            obj = Boolean.valueOf(d);
        } else if (length == 5) {
            String L02 = m2140L0(P1[1]);
            if (L02.equals("st")) {
                Object K03 = m2136K0(P1[0]);
                if (K03 instanceof C1349p) {
                    trim = P1[4].trim();
                    k = ((C1349p) K03).mo11996i(m2140L0(P1[2]), Integer.parseInt(m2140L0(P1[3])));
                } else {
                    return;
                }
            } else if (L02.equals("ft")) {
                Object K04 = m2136K0(P1[0]);
                if (K04 instanceof C1349p) {
                    trim = P1[4].trim();
                    k = ((C1349p) K04).mo11998k(m2140L0(P1[2]), m2150N0(m2140L0(P1[3])));
                } else {
                    return;
                }
            } else {
                mo8981T(P1[0].trim(), new C1349p(this.f1815d, m2140L0(P1[1]), m2140L0(P1[2]), Float.parseFloat(m2140L0(P1[3])), Float.parseFloat(m2140L0(P1[4]))));
                return;
            }
            mo8981T(trim, Boolean.valueOf(k));
            return;
        } else {
            return;
        }
        mo8981T(str2, obj);
    }

    /* renamed from: a */
    public static String m2201a(String str) {
        if (!str.contains("\\")) {
            return str;
        }
        if (str.contains("\\\\")) {
            str = str.replace("\\\\", "\\U5c");
        }
        if (str.contains("\\(")) {
            str = str.replace("\\(", "\\U28");
        }
        if (str.contains("\\)")) {
            str = str.replace("\\)", "\\U29");
        }
        if (str.contains("\\,")) {
            str = str.replace("\\,", "\\U2c");
        }
        if (str.contains("\\=")) {
            str = str.replace("\\=", "\\U3d");
        }
        if (str.contains("\\!")) {
            str = str.replace("\\!", "\\U21");
        }
        if (str.contains("\\>")) {
            str = str.replace("\\>", "\\U3e");
        }
        if (str.contains("\\<")) {
            str = str.replace("\\<", "\\U3c");
        }
        if (str.contains("\\?")) {
            str = str.replace("\\?", "\\U3f");
        }
        if (str.contains("\\*")) {
            str = str.replace("\\*", "\\U2a");
        }
        if (str.contains("\\+")) {
            str = str.replace("\\+", "\\U2b");
        }
        if (str.contains("\\{")) {
            str = str.replace("\\{", "\\U7b");
        }
        if (str.contains("\\}")) {
            str = str.replace("\\}", "\\U7d");
        }
        if (str.contains("\\|")) {
            str = str.replace("\\|", "\\U7c");
        }
        if (str.contains("\\&")) {
            str = str.replace("\\&", "\\U26");
        }
        if (str.contains("\\\"")) {
            str = str.replace("\\\"", "\\U22");
        }
        return str.contains("\\U5c") ? str.replace("\\U5c", "\\\\") : str;
    }

    /* renamed from: a0 */
    public static void m2202a0() {
        if (f1810t != null) {
            return;
        }
        if (Aid_YuCodeX.f2357v != Aid_YuCodeX.f2352f) {
            String[] strArr = new String[Constants.PUTSTATIC];
            strArr[0] = "f(";
            strArr[1] = "for(";
            strArr[2] = "w(";
            strArr[3] = "t(";
            strArr[4] = "ssj(";
            strArr[5] = "syso(";
            strArr[6] = "tw(";
            strArr[7] = "fd(";
            strArr[8] = "fe(";
            strArr[9] = "fs(";
            strArr[10] = "fr(";
            strArr[11] = "fc(";
            strArr[12] = "fw(";
            strArr[13] = "fl(";
            strArr[14] = "ft(";
            strArr[15] = "fdir(";
            strArr[16] = "fuz(";
            strArr[17] = "fuzs(";
            strArr[18] = "fo(";
            strArr[19] = "fj(";
            strArr[20] = "s(";
            strArr[21] = "s2(";
            strArr[22] = "sn(";
            strArr[23] = "s+(";
            strArr[24] = "s-(";
            strArr[25] = "s*(";
            strArr[26] = "s/(";
            strArr[27] = "s%(";
            strArr[28] = "ss(";
            strArr[29] = "sr(";
            strArr[30] = "sj(";
            strArr[31] = "sl(";
            strArr[32] = "siof(";
            strArr[33] = "slof(";
            strArr[34] = "ssg(";
            strArr[35] = "slg(";
            strArr[36] = "strim(";
            strArr[37] = "slower(";
            strArr[38] = "supper(";
            strArr[39] = "stop(";
            strArr[40] = "sran(";
            strArr[41] = "nsz(";
            strArr[42] = "sgsz(";
            strArr[43] = "sssz(";
            strArr[44] = "sgszl(";
            strArr[45] = "hs(";
            strArr[46] = "hd(";
            strArr[47] = "hw(";
            strArr[48] = "hws(";
            strArr[49] = "ug(";
            strArr[50] = "us(";
            strArr[51] = "uigo(";
            strArr[52] = "utw(";
            strArr[53] = "endutw(";
            strArr[54] = "end(";
            strArr[55] = "ends(";
            strArr[56] = "bfm(";
            strArr[57] = "bfms(";
            strArr[58] = "ula(";
            strArr[59] = "uls(";
            strArr[60] = "ulas(";
            strArr[61] = "ulag(";
            strArr[62] = "usms(";
            strArr[63] = "ucall(";
            strArr[64] = "time(";
            strArr[65] = "fi(";
            strArr[66] = "stobm(";
            strArr[67] = "sutf8to(";
            strArr[68] = "uycl(";
            strArr[69] = "ushsp(";
            strArr[70] = "bfv(";
            strArr[71] = "bfvs(";
            strArr[72] = "bfvss(";
            strArr[73] = "ftz(";
            strArr[74] = "uapp(";
            strArr[75] = "uapplist(";
            strArr[76] = "uapplistgo(";
            strArr[77] = "uninapp(";
            strArr[78] = "huf(";
            strArr[79] = "nvw(";
            strArr[80] = "uall(";
            strArr[81] = "urvw(";
            strArr[82] = "sbp(";
            strArr[83] = "sdeg(";
            strArr[84] = "bfs(";
            strArr[85] = "tot(";
            strArr[86] = "tzz(";
            strArr[87] = "tsf(";
            strArr[88] = "tfz(";
            strArr[89] = "sxb(";
            strArr[90] = "shb(";
            strArr[91] = "tcc(";
            strArr[92] = "usjxm(";
            strArr[93] = "addv(";
            strArr[94] = "gvs(";
            strArr[95] = "aslist(";
            strArr[96] = "sslist(";
            strArr[97] = "gslist(";
            strArr[98] = "gslistl(";
            strArr[99] = "dslist(";
            strArr[100] = "gslistsz(";
            strArr[101] = "gslistis(";
            strArr[102] = "gslistiof(";
            strArr[103] = "gslistlof(";
            strArr[104] = "nuibs(";
            strArr[105] = "ngde(";
            strArr[106] = "sit(";
            strArr[107] = "uit(";
            strArr[108] = "git(";
            strArr[109] = "uqr(";
            strArr[110] = "zdp(";
            strArr[111] = "zpd(";
            strArr[112] = "zps(";
            strArr[113] = "zsp(";
            strArr[114] = "zsp(";
            strArr[115] = "lan(";
            strArr[116] = "sjxx(";
            strArr[117] = "simsi(";
            strArr[118] = "simei(";
            strArr[119] = "endkeyboard(";
            strArr[120] = "hdfl(";
            strArr[121] = "hdfla(";
            strArr[122] = "hdd(";
            strArr[123] = "hdda(";
            strArr[124] = "hddgl(";
            strArr[125] = "hddg(";
            strArr[126] = "hdds(";
            strArr[127] = "hdduigo(";
            strArr[128] = "swh(";
            strArr[129] = "ufnsui(";
            strArr[130] = "se(";
            strArr[131] = "usg(";
            strArr[132] = "uzd(";
            strArr[133] = "usxq(";
            strArr[134] = "usxh(";
            strArr[135] = "usx(";
            strArr[136] = "ujp(";
            strArr[137] = "bly(";
            strArr[138] = "sqlite(";
            strArr[139] = "sql(";
            strArr[140] = "sqlsele(";
            strArr[141] = "dha(";
            strArr[142] = "dhs(";
            strArr[143] = "dht(";
            strArr[144] = "dhr(";
            strArr[145] = "dhset(";
            strArr[146] = "dhas(";
            strArr[147] = "dhast(";
            strArr[148] = "dh(";
            strArr[149] = "dhon(";
            strArr[150] = "dhb(";
            strArr[151] = "hsas(";
            strArr[152] = "has(";
            strArr[153] = "uxf(";
            strArr[154] = "tts(";
            strArr[155] = "blp(";
            strArr[156] = "otob(";
            strArr[157] = "btoo(";
            strArr[158] = "sot(";
            strArr[159] = "sota(";
            strArr[160] = "loadso(";
            strArr[161] = "loadjar(";
            strArr[162] = "cls(";
            strArr[163] = "javacb(";
            strArr[164] = "javanew(";
            strArr[165] = "java(";
            strArr[166] = "javax(";
            strArr[167] = "javags(";
            strArr[168] = "javass(";
            strArr[169] = "res(";
            strArr[170] = "clssm(";
            strArr[171] = "zj(";
            strArr[172] = "call(";
            strArr[173] = "json(";
            strArr[174] = "utb(";
            strArr[175] = "tws(";
            strArr[176] = "uht(";
            strArr[177] = "cast(";
            strArr[178] = "yul(";
            f1810t = strArr;
            return;
        }
        String[] strArr2 = new String[Constants.PUTSTATIC];
        StringBuffer stringBuffer = new StringBuffer(Integer.toString(145001));
        stringBuffer.append('(');
        strArr2[0] = stringBuffer.toString();
        StringBuffer stringBuffer2 = new StringBuffer(Integer.toString(145002));
        stringBuffer2.append('(');
        strArr2[1] = stringBuffer2.toString();
        StringBuffer stringBuffer3 = new StringBuffer(Integer.toString(145003));
        stringBuffer3.append('(');
        strArr2[2] = stringBuffer3.toString();
        StringBuffer stringBuffer4 = new StringBuffer(Integer.toString(145004));
        stringBuffer4.append('(');
        strArr2[3] = stringBuffer4.toString();
        StringBuffer stringBuffer5 = new StringBuffer(Integer.toString(145005));
        stringBuffer5.append('(');
        strArr2[4] = stringBuffer5.toString();
        StringBuffer stringBuffer6 = new StringBuffer(Integer.toString(145006));
        stringBuffer6.append('(');
        strArr2[5] = stringBuffer6.toString();
        StringBuffer stringBuffer7 = new StringBuffer(Integer.toString(145007));
        stringBuffer7.append('(');
        strArr2[6] = stringBuffer7.toString();
        StringBuffer stringBuffer8 = new StringBuffer(Integer.toString(145008));
        stringBuffer8.append('(');
        strArr2[7] = stringBuffer8.toString();
        StringBuffer stringBuffer9 = new StringBuffer(Integer.toString(145009));
        stringBuffer9.append('(');
        strArr2[8] = stringBuffer9.toString();
        StringBuffer stringBuffer10 = new StringBuffer(Integer.toString(145010));
        stringBuffer10.append('(');
        strArr2[9] = stringBuffer10.toString();
        StringBuffer stringBuffer11 = new StringBuffer(Integer.toString(145011));
        stringBuffer11.append('(');
        strArr2[10] = stringBuffer11.toString();
        StringBuffer stringBuffer12 = new StringBuffer(Integer.toString(145012));
        stringBuffer12.append('(');
        strArr2[11] = stringBuffer12.toString();
        StringBuffer stringBuffer13 = new StringBuffer(Integer.toString(145013));
        stringBuffer13.append('(');
        strArr2[12] = stringBuffer13.toString();
        StringBuffer stringBuffer14 = new StringBuffer(Integer.toString(145014));
        stringBuffer14.append('(');
        strArr2[13] = stringBuffer14.toString();
        StringBuffer stringBuffer15 = new StringBuffer(Integer.toString(145015));
        stringBuffer15.append('(');
        strArr2[14] = stringBuffer15.toString();
        StringBuffer stringBuffer16 = new StringBuffer(Integer.toString(145016));
        stringBuffer16.append('(');
        strArr2[15] = stringBuffer16.toString();
        StringBuffer stringBuffer17 = new StringBuffer(Integer.toString(145017));
        stringBuffer17.append('(');
        strArr2[16] = stringBuffer17.toString();
        StringBuffer stringBuffer18 = new StringBuffer(Integer.toString(145018));
        stringBuffer18.append('(');
        strArr2[17] = stringBuffer18.toString();
        StringBuffer stringBuffer19 = new StringBuffer(Integer.toString(145019));
        stringBuffer19.append('(');
        strArr2[18] = stringBuffer19.toString();
        StringBuffer stringBuffer20 = new StringBuffer(Integer.toString(145020));
        stringBuffer20.append('(');
        strArr2[19] = stringBuffer20.toString();
        StringBuffer stringBuffer21 = new StringBuffer(Integer.toString(145021));
        stringBuffer21.append('(');
        strArr2[20] = stringBuffer21.toString();
        StringBuffer stringBuffer22 = new StringBuffer(Integer.toString(145022));
        stringBuffer22.append('(');
        strArr2[21] = stringBuffer22.toString();
        StringBuffer stringBuffer23 = new StringBuffer(Integer.toString(145023));
        stringBuffer23.append('(');
        strArr2[22] = stringBuffer23.toString();
        StringBuffer stringBuffer24 = new StringBuffer(Integer.toString(145024));
        stringBuffer24.append('(');
        strArr2[23] = stringBuffer24.toString();
        StringBuffer stringBuffer25 = new StringBuffer(Integer.toString(145025));
        stringBuffer25.append('(');
        strArr2[24] = stringBuffer25.toString();
        StringBuffer stringBuffer26 = new StringBuffer(Integer.toString(145026));
        stringBuffer26.append('(');
        strArr2[25] = stringBuffer26.toString();
        StringBuffer stringBuffer27 = new StringBuffer(Integer.toString(145027));
        stringBuffer27.append('(');
        strArr2[26] = stringBuffer27.toString();
        StringBuffer stringBuffer28 = new StringBuffer(Integer.toString(145028));
        stringBuffer28.append('(');
        strArr2[27] = stringBuffer28.toString();
        StringBuffer stringBuffer29 = new StringBuffer(Integer.toString(145029));
        stringBuffer29.append('(');
        strArr2[28] = stringBuffer29.toString();
        StringBuffer stringBuffer30 = new StringBuffer(Integer.toString(145030));
        stringBuffer30.append('(');
        strArr2[29] = stringBuffer30.toString();
        StringBuffer stringBuffer31 = new StringBuffer(Integer.toString(145031));
        stringBuffer31.append('(');
        strArr2[30] = stringBuffer31.toString();
        StringBuffer stringBuffer32 = new StringBuffer(Integer.toString(145032));
        stringBuffer32.append('(');
        strArr2[31] = stringBuffer32.toString();
        StringBuffer stringBuffer33 = new StringBuffer(Integer.toString(145033));
        stringBuffer33.append('(');
        strArr2[32] = stringBuffer33.toString();
        StringBuffer stringBuffer34 = new StringBuffer(Integer.toString(145034));
        stringBuffer34.append('(');
        strArr2[33] = stringBuffer34.toString();
        StringBuffer stringBuffer35 = new StringBuffer(Integer.toString(145035));
        stringBuffer35.append('(');
        strArr2[34] = stringBuffer35.toString();
        StringBuffer stringBuffer36 = new StringBuffer(Integer.toString(145036));
        stringBuffer36.append('(');
        strArr2[35] = stringBuffer36.toString();
        StringBuffer stringBuffer37 = new StringBuffer(Integer.toString(145037));
        stringBuffer37.append('(');
        strArr2[36] = stringBuffer37.toString();
        StringBuffer stringBuffer38 = new StringBuffer(Integer.toString(145038));
        stringBuffer38.append('(');
        strArr2[37] = stringBuffer38.toString();
        StringBuffer stringBuffer39 = new StringBuffer(Integer.toString(145039));
        stringBuffer39.append('(');
        strArr2[38] = stringBuffer39.toString();
        StringBuffer stringBuffer40 = new StringBuffer(Integer.toString(145040));
        stringBuffer40.append('(');
        strArr2[39] = stringBuffer40.toString();
        StringBuffer stringBuffer41 = new StringBuffer(Integer.toString(145041));
        stringBuffer41.append('(');
        strArr2[40] = stringBuffer41.toString();
        StringBuffer stringBuffer42 = new StringBuffer(Integer.toString(145042));
        stringBuffer42.append('(');
        strArr2[41] = stringBuffer42.toString();
        StringBuffer stringBuffer43 = new StringBuffer(Integer.toString(145043));
        stringBuffer43.append('(');
        strArr2[42] = stringBuffer43.toString();
        StringBuffer stringBuffer44 = new StringBuffer(Integer.toString(145044));
        stringBuffer44.append('(');
        strArr2[43] = stringBuffer44.toString();
        StringBuffer stringBuffer45 = new StringBuffer(Integer.toString(145045));
        stringBuffer45.append('(');
        strArr2[44] = stringBuffer45.toString();
        StringBuffer stringBuffer46 = new StringBuffer(Integer.toString(145046));
        stringBuffer46.append('(');
        strArr2[45] = stringBuffer46.toString();
        StringBuffer stringBuffer47 = new StringBuffer(Integer.toString(145047));
        stringBuffer47.append('(');
        strArr2[46] = stringBuffer47.toString();
        StringBuffer stringBuffer48 = new StringBuffer(Integer.toString(145048));
        stringBuffer48.append('(');
        strArr2[47] = stringBuffer48.toString();
        StringBuffer stringBuffer49 = new StringBuffer(Integer.toString(145049));
        stringBuffer49.append('(');
        strArr2[48] = stringBuffer49.toString();
        StringBuffer stringBuffer50 = new StringBuffer(Integer.toString(145050));
        stringBuffer50.append('(');
        strArr2[49] = stringBuffer50.toString();
        StringBuffer stringBuffer51 = new StringBuffer(Integer.toString(145051));
        stringBuffer51.append('(');
        strArr2[50] = stringBuffer51.toString();
        StringBuffer stringBuffer52 = new StringBuffer(Integer.toString(145052));
        stringBuffer52.append('(');
        strArr2[51] = stringBuffer52.toString();
        StringBuffer stringBuffer53 = new StringBuffer(Integer.toString(145053));
        stringBuffer53.append('(');
        strArr2[52] = stringBuffer53.toString();
        StringBuffer stringBuffer54 = new StringBuffer(Integer.toString(145054));
        stringBuffer54.append('(');
        strArr2[53] = stringBuffer54.toString();
        StringBuffer stringBuffer55 = new StringBuffer(Integer.toString(145055));
        stringBuffer55.append('(');
        strArr2[54] = stringBuffer55.toString();
        StringBuffer stringBuffer56 = new StringBuffer(Integer.toString(145056));
        stringBuffer56.append('(');
        strArr2[55] = stringBuffer56.toString();
        StringBuffer stringBuffer57 = new StringBuffer(Integer.toString(145057));
        stringBuffer57.append('(');
        strArr2[56] = stringBuffer57.toString();
        StringBuffer stringBuffer58 = new StringBuffer(Integer.toString(145058));
        stringBuffer58.append('(');
        strArr2[57] = stringBuffer58.toString();
        StringBuffer stringBuffer59 = new StringBuffer(Integer.toString(145059));
        stringBuffer59.append('(');
        strArr2[58] = stringBuffer59.toString();
        StringBuffer stringBuffer60 = new StringBuffer(Integer.toString(145060));
        stringBuffer60.append('(');
        strArr2[59] = stringBuffer60.toString();
        StringBuffer stringBuffer61 = new StringBuffer(Integer.toString(145061));
        stringBuffer61.append('(');
        strArr2[60] = stringBuffer61.toString();
        StringBuffer stringBuffer62 = new StringBuffer(Integer.toString(145062));
        stringBuffer62.append('(');
        strArr2[61] = stringBuffer62.toString();
        StringBuffer stringBuffer63 = new StringBuffer(Integer.toString(145063));
        stringBuffer63.append('(');
        strArr2[62] = stringBuffer63.toString();
        StringBuffer stringBuffer64 = new StringBuffer(Integer.toString(145064));
        stringBuffer64.append('(');
        strArr2[63] = stringBuffer64.toString();
        StringBuffer stringBuffer65 = new StringBuffer(Integer.toString(145065));
        stringBuffer65.append('(');
        strArr2[64] = stringBuffer65.toString();
        StringBuffer stringBuffer66 = new StringBuffer(Integer.toString(145066));
        stringBuffer66.append('(');
        strArr2[65] = stringBuffer66.toString();
        StringBuffer stringBuffer67 = new StringBuffer(Integer.toString(145067));
        stringBuffer67.append('(');
        strArr2[66] = stringBuffer67.toString();
        StringBuffer stringBuffer68 = new StringBuffer(Integer.toString(145068));
        stringBuffer68.append('(');
        strArr2[67] = stringBuffer68.toString();
        StringBuffer stringBuffer69 = new StringBuffer(Integer.toString(145069));
        stringBuffer69.append('(');
        strArr2[68] = stringBuffer69.toString();
        StringBuffer stringBuffer70 = new StringBuffer(Integer.toString(145070));
        stringBuffer70.append('(');
        strArr2[69] = stringBuffer70.toString();
        StringBuffer stringBuffer71 = new StringBuffer(Integer.toString(145071));
        stringBuffer71.append('(');
        strArr2[70] = stringBuffer71.toString();
        StringBuffer stringBuffer72 = new StringBuffer(Integer.toString(145072));
        stringBuffer72.append('(');
        strArr2[71] = stringBuffer72.toString();
        StringBuffer stringBuffer73 = new StringBuffer(Integer.toString(145073));
        stringBuffer73.append('(');
        strArr2[72] = stringBuffer73.toString();
        StringBuffer stringBuffer74 = new StringBuffer(Integer.toString(145074));
        stringBuffer74.append('(');
        strArr2[73] = stringBuffer74.toString();
        StringBuffer stringBuffer75 = new StringBuffer(Integer.toString(145075));
        stringBuffer75.append('(');
        strArr2[74] = stringBuffer75.toString();
        StringBuffer stringBuffer76 = new StringBuffer(Integer.toString(145076));
        stringBuffer76.append('(');
        strArr2[75] = stringBuffer76.toString();
        StringBuffer stringBuffer77 = new StringBuffer(Integer.toString(145077));
        stringBuffer77.append('(');
        strArr2[76] = stringBuffer77.toString();
        StringBuffer stringBuffer78 = new StringBuffer(Integer.toString(145078));
        stringBuffer78.append('(');
        strArr2[77] = stringBuffer78.toString();
        StringBuffer stringBuffer79 = new StringBuffer(Integer.toString(145079));
        stringBuffer79.append('(');
        strArr2[78] = stringBuffer79.toString();
        StringBuffer stringBuffer80 = new StringBuffer(Integer.toString(145080));
        stringBuffer80.append('(');
        strArr2[79] = stringBuffer80.toString();
        StringBuffer stringBuffer81 = new StringBuffer(Integer.toString(145081));
        stringBuffer81.append('(');
        strArr2[80] = stringBuffer81.toString();
        StringBuffer stringBuffer82 = new StringBuffer(Integer.toString(145082));
        stringBuffer82.append('(');
        strArr2[81] = stringBuffer82.toString();
        StringBuffer stringBuffer83 = new StringBuffer(Integer.toString(145083));
        stringBuffer83.append('(');
        strArr2[82] = stringBuffer83.toString();
        StringBuffer stringBuffer84 = new StringBuffer(Integer.toString(145084));
        stringBuffer84.append('(');
        strArr2[83] = stringBuffer84.toString();
        StringBuffer stringBuffer85 = new StringBuffer(Integer.toString(145085));
        stringBuffer85.append('(');
        strArr2[84] = stringBuffer85.toString();
        StringBuffer stringBuffer86 = new StringBuffer(Integer.toString(145086));
        stringBuffer86.append('(');
        strArr2[85] = stringBuffer86.toString();
        StringBuffer stringBuffer87 = new StringBuffer(Integer.toString(145087));
        stringBuffer87.append('(');
        strArr2[86] = stringBuffer87.toString();
        StringBuffer stringBuffer88 = new StringBuffer(Integer.toString(145088));
        stringBuffer88.append('(');
        strArr2[87] = stringBuffer88.toString();
        StringBuffer stringBuffer89 = new StringBuffer(Integer.toString(145089));
        stringBuffer89.append('(');
        strArr2[88] = stringBuffer89.toString();
        StringBuffer stringBuffer90 = new StringBuffer(Integer.toString(145090));
        stringBuffer90.append('(');
        strArr2[89] = stringBuffer90.toString();
        StringBuffer stringBuffer91 = new StringBuffer(Integer.toString(145091));
        stringBuffer91.append('(');
        strArr2[90] = stringBuffer91.toString();
        StringBuffer stringBuffer92 = new StringBuffer(Integer.toString(145092));
        stringBuffer92.append('(');
        strArr2[91] = stringBuffer92.toString();
        StringBuffer stringBuffer93 = new StringBuffer(Integer.toString(145093));
        stringBuffer93.append('(');
        strArr2[92] = stringBuffer93.toString();
        StringBuffer stringBuffer94 = new StringBuffer(Integer.toString(145094));
        stringBuffer94.append('(');
        strArr2[93] = stringBuffer94.toString();
        StringBuffer stringBuffer95 = new StringBuffer(Integer.toString(145095));
        stringBuffer95.append('(');
        strArr2[94] = stringBuffer95.toString();
        StringBuffer stringBuffer96 = new StringBuffer(Integer.toString(145096));
        stringBuffer96.append('(');
        strArr2[95] = stringBuffer96.toString();
        StringBuffer stringBuffer97 = new StringBuffer(Integer.toString(145097));
        stringBuffer97.append('(');
        strArr2[96] = stringBuffer97.toString();
        StringBuffer stringBuffer98 = new StringBuffer(Integer.toString(145098));
        stringBuffer98.append('(');
        strArr2[97] = stringBuffer98.toString();
        StringBuffer stringBuffer99 = new StringBuffer(Integer.toString(145099));
        stringBuffer99.append('(');
        strArr2[98] = stringBuffer99.toString();
        StringBuffer stringBuffer100 = new StringBuffer(Integer.toString(145100));
        stringBuffer100.append('(');
        strArr2[99] = stringBuffer100.toString();
        StringBuffer stringBuffer101 = new StringBuffer(Integer.toString(145101));
        stringBuffer101.append('(');
        strArr2[100] = stringBuffer101.toString();
        StringBuffer stringBuffer102 = new StringBuffer(Integer.toString(145102));
        stringBuffer102.append('(');
        strArr2[101] = stringBuffer102.toString();
        StringBuffer stringBuffer103 = new StringBuffer(Integer.toString(145103));
        stringBuffer103.append('(');
        strArr2[102] = stringBuffer103.toString();
        StringBuffer stringBuffer104 = new StringBuffer(Integer.toString(145104));
        stringBuffer104.append('(');
        strArr2[103] = stringBuffer104.toString();
        StringBuffer stringBuffer105 = new StringBuffer(Integer.toString(145105));
        stringBuffer105.append('(');
        strArr2[104] = stringBuffer105.toString();
        StringBuffer stringBuffer106 = new StringBuffer(Integer.toString(145106));
        stringBuffer106.append('(');
        strArr2[105] = stringBuffer106.toString();
        StringBuffer stringBuffer107 = new StringBuffer(Integer.toString(145107));
        stringBuffer107.append('(');
        strArr2[106] = stringBuffer107.toString();
        StringBuffer stringBuffer108 = new StringBuffer(Integer.toString(145108));
        stringBuffer108.append('(');
        strArr2[107] = stringBuffer108.toString();
        StringBuffer stringBuffer109 = new StringBuffer(Integer.toString(145109));
        stringBuffer109.append('(');
        strArr2[108] = stringBuffer109.toString();
        StringBuffer stringBuffer110 = new StringBuffer(Integer.toString(145110));
        stringBuffer110.append('(');
        strArr2[109] = stringBuffer110.toString();
        StringBuffer stringBuffer111 = new StringBuffer(Integer.toString(145111));
        stringBuffer111.append('(');
        strArr2[110] = stringBuffer111.toString();
        StringBuffer stringBuffer112 = new StringBuffer(Integer.toString(145112));
        stringBuffer112.append('(');
        strArr2[111] = stringBuffer112.toString();
        StringBuffer stringBuffer113 = new StringBuffer(Integer.toString(145113));
        stringBuffer113.append('(');
        strArr2[112] = stringBuffer113.toString();
        StringBuffer stringBuffer114 = new StringBuffer(Integer.toString(145114));
        stringBuffer114.append('(');
        strArr2[113] = stringBuffer114.toString();
        StringBuffer stringBuffer115 = new StringBuffer(Integer.toString(145115));
        stringBuffer115.append('(');
        strArr2[114] = stringBuffer115.toString();
        StringBuffer stringBuffer116 = new StringBuffer(Integer.toString(145116));
        stringBuffer116.append('(');
        strArr2[115] = stringBuffer116.toString();
        StringBuffer stringBuffer117 = new StringBuffer(Integer.toString(145117));
        stringBuffer117.append('(');
        strArr2[116] = stringBuffer117.toString();
        StringBuffer stringBuffer118 = new StringBuffer(Integer.toString(145118));
        stringBuffer118.append('(');
        strArr2[117] = stringBuffer118.toString();
        StringBuffer stringBuffer119 = new StringBuffer(Integer.toString(145119));
        stringBuffer119.append('(');
        strArr2[118] = stringBuffer119.toString();
        StringBuffer stringBuffer120 = new StringBuffer(Integer.toString(145120));
        stringBuffer120.append('(');
        strArr2[119] = stringBuffer120.toString();
        StringBuffer stringBuffer121 = new StringBuffer(Integer.toString(145121));
        stringBuffer121.append('(');
        strArr2[120] = stringBuffer121.toString();
        StringBuffer stringBuffer122 = new StringBuffer(Integer.toString(145122));
        stringBuffer122.append('(');
        strArr2[121] = stringBuffer122.toString();
        StringBuffer stringBuffer123 = new StringBuffer(Integer.toString(145123));
        stringBuffer123.append('(');
        strArr2[122] = stringBuffer123.toString();
        StringBuffer stringBuffer124 = new StringBuffer(Integer.toString(145124));
        stringBuffer124.append('(');
        strArr2[123] = stringBuffer124.toString();
        StringBuffer stringBuffer125 = new StringBuffer(Integer.toString(145125));
        stringBuffer125.append('(');
        strArr2[124] = stringBuffer125.toString();
        StringBuffer stringBuffer126 = new StringBuffer(Integer.toString(145126));
        stringBuffer126.append('(');
        strArr2[125] = stringBuffer126.toString();
        StringBuffer stringBuffer127 = new StringBuffer(Integer.toString(145127));
        stringBuffer127.append('(');
        strArr2[126] = stringBuffer127.toString();
        StringBuffer stringBuffer128 = new StringBuffer(Integer.toString(145128));
        stringBuffer128.append('(');
        strArr2[127] = stringBuffer128.toString();
        StringBuffer stringBuffer129 = new StringBuffer(Integer.toString(145129));
        stringBuffer129.append('(');
        strArr2[128] = stringBuffer129.toString();
        StringBuffer stringBuffer130 = new StringBuffer(Integer.toString(145130));
        stringBuffer130.append('(');
        strArr2[129] = stringBuffer130.toString();
        StringBuffer stringBuffer131 = new StringBuffer(Integer.toString(145131));
        stringBuffer131.append('(');
        strArr2[130] = stringBuffer131.toString();
        StringBuffer stringBuffer132 = new StringBuffer(Integer.toString(145132));
        stringBuffer132.append('(');
        strArr2[131] = stringBuffer132.toString();
        StringBuffer stringBuffer133 = new StringBuffer(Integer.toString(145133));
        stringBuffer133.append('(');
        strArr2[132] = stringBuffer133.toString();
        StringBuffer stringBuffer134 = new StringBuffer(Integer.toString(145134));
        stringBuffer134.append('(');
        strArr2[133] = stringBuffer134.toString();
        StringBuffer stringBuffer135 = new StringBuffer(Integer.toString(145135));
        stringBuffer135.append('(');
        strArr2[134] = stringBuffer135.toString();
        StringBuffer stringBuffer136 = new StringBuffer(Integer.toString(145136));
        stringBuffer136.append('(');
        strArr2[135] = stringBuffer136.toString();
        StringBuffer stringBuffer137 = new StringBuffer(Integer.toString(145137));
        stringBuffer137.append('(');
        strArr2[136] = stringBuffer137.toString();
        StringBuffer stringBuffer138 = new StringBuffer(Integer.toString(145138));
        stringBuffer138.append('(');
        strArr2[137] = stringBuffer138.toString();
        StringBuffer stringBuffer139 = new StringBuffer(Integer.toString(145139));
        stringBuffer139.append('(');
        strArr2[138] = stringBuffer139.toString();
        StringBuffer stringBuffer140 = new StringBuffer(Integer.toString(145140));
        stringBuffer140.append('(');
        strArr2[139] = stringBuffer140.toString();
        StringBuffer stringBuffer141 = new StringBuffer(Integer.toString(145141));
        stringBuffer141.append('(');
        strArr2[140] = stringBuffer141.toString();
        StringBuffer stringBuffer142 = new StringBuffer(Integer.toString(145142));
        stringBuffer142.append('(');
        strArr2[141] = stringBuffer142.toString();
        StringBuffer stringBuffer143 = new StringBuffer(Integer.toString(145143));
        stringBuffer143.append('(');
        strArr2[142] = stringBuffer143.toString();
        StringBuffer stringBuffer144 = new StringBuffer(Integer.toString(145144));
        stringBuffer144.append('(');
        strArr2[143] = stringBuffer144.toString();
        StringBuffer stringBuffer145 = new StringBuffer(Integer.toString(145145));
        stringBuffer145.append('(');
        strArr2[144] = stringBuffer145.toString();
        StringBuffer stringBuffer146 = new StringBuffer(Integer.toString(145146));
        stringBuffer146.append('(');
        strArr2[145] = stringBuffer146.toString();
        StringBuffer stringBuffer147 = new StringBuffer(Integer.toString(145147));
        stringBuffer147.append('(');
        strArr2[146] = stringBuffer147.toString();
        StringBuffer stringBuffer148 = new StringBuffer(Integer.toString(145148));
        stringBuffer148.append('(');
        strArr2[147] = stringBuffer148.toString();
        StringBuffer stringBuffer149 = new StringBuffer(Integer.toString(145149));
        stringBuffer149.append('(');
        strArr2[148] = stringBuffer149.toString();
        StringBuffer stringBuffer150 = new StringBuffer(Integer.toString(145150));
        stringBuffer150.append('(');
        strArr2[149] = stringBuffer150.toString();
        StringBuffer stringBuffer151 = new StringBuffer(Integer.toString(145151));
        stringBuffer151.append('(');
        strArr2[150] = stringBuffer151.toString();
        StringBuffer stringBuffer152 = new StringBuffer(Integer.toString(145152));
        stringBuffer152.append('(');
        strArr2[151] = stringBuffer152.toString();
        StringBuffer stringBuffer153 = new StringBuffer(Integer.toString(145153));
        stringBuffer153.append('(');
        strArr2[152] = stringBuffer153.toString();
        StringBuffer stringBuffer154 = new StringBuffer(Integer.toString(145154));
        stringBuffer154.append('(');
        strArr2[153] = stringBuffer154.toString();
        StringBuffer stringBuffer155 = new StringBuffer(Integer.toString(145155));
        stringBuffer155.append('(');
        strArr2[154] = stringBuffer155.toString();
        StringBuffer stringBuffer156 = new StringBuffer(Integer.toString(145156));
        stringBuffer156.append('(');
        strArr2[155] = stringBuffer156.toString();
        StringBuffer stringBuffer157 = new StringBuffer(Integer.toString(145157));
        stringBuffer157.append('(');
        strArr2[156] = stringBuffer157.toString();
        StringBuffer stringBuffer158 = new StringBuffer(Integer.toString(145158));
        stringBuffer158.append('(');
        strArr2[157] = stringBuffer158.toString();
        StringBuffer stringBuffer159 = new StringBuffer(Integer.toString(145159));
        stringBuffer159.append('(');
        strArr2[158] = stringBuffer159.toString();
        StringBuffer stringBuffer160 = new StringBuffer(Integer.toString(145160));
        stringBuffer160.append('(');
        strArr2[159] = stringBuffer160.toString();
        StringBuffer stringBuffer161 = new StringBuffer(Integer.toString(145161));
        stringBuffer161.append('(');
        strArr2[160] = stringBuffer161.toString();
        StringBuffer stringBuffer162 = new StringBuffer(Integer.toString(145162));
        stringBuffer162.append('(');
        strArr2[161] = stringBuffer162.toString();
        StringBuffer stringBuffer163 = new StringBuffer(Integer.toString(145163));
        stringBuffer163.append('(');
        strArr2[162] = stringBuffer163.toString();
        StringBuffer stringBuffer164 = new StringBuffer(Integer.toString(145164));
        stringBuffer164.append('(');
        strArr2[163] = stringBuffer164.toString();
        StringBuffer stringBuffer165 = new StringBuffer(Integer.toString(145165));
        stringBuffer165.append('(');
        strArr2[164] = stringBuffer165.toString();
        StringBuffer stringBuffer166 = new StringBuffer(Integer.toString(145166));
        stringBuffer166.append('(');
        strArr2[165] = stringBuffer166.toString();
        StringBuffer stringBuffer167 = new StringBuffer(Integer.toString(145167));
        stringBuffer167.append('(');
        strArr2[166] = stringBuffer167.toString();
        StringBuffer stringBuffer168 = new StringBuffer(Integer.toString(145168));
        stringBuffer168.append('(');
        strArr2[167] = stringBuffer168.toString();
        StringBuffer stringBuffer169 = new StringBuffer(Integer.toString(145169));
        stringBuffer169.append('(');
        strArr2[168] = stringBuffer169.toString();
        StringBuffer stringBuffer170 = new StringBuffer(Integer.toString(145170));
        stringBuffer170.append('(');
        strArr2[169] = stringBuffer170.toString();
        StringBuffer stringBuffer171 = new StringBuffer(Integer.toString(145171));
        stringBuffer171.append('(');
        strArr2[170] = stringBuffer171.toString();
        StringBuffer stringBuffer172 = new StringBuffer(Integer.toString(145172));
        stringBuffer172.append('(');
        strArr2[171] = stringBuffer172.toString();
        StringBuffer stringBuffer173 = new StringBuffer(Integer.toString(145173));
        stringBuffer173.append('(');
        strArr2[172] = stringBuffer173.toString();
        StringBuffer stringBuffer174 = new StringBuffer(Integer.toString(145174));
        stringBuffer174.append('(');
        strArr2[173] = stringBuffer174.toString();
        StringBuffer stringBuffer175 = new StringBuffer(Integer.toString(145175));
        stringBuffer175.append('(');
        strArr2[174] = stringBuffer175.toString();
        StringBuffer stringBuffer176 = new StringBuffer(Integer.toString(145176));
        stringBuffer176.append('(');
        strArr2[175] = stringBuffer176.toString();
        StringBuffer stringBuffer177 = new StringBuffer(Integer.toString(145177));
        stringBuffer177.append('(');
        strArr2[176] = stringBuffer177.toString();
        StringBuffer stringBuffer178 = new StringBuffer(Integer.toString(145178));
        stringBuffer178.append('(');
        strArr2[177] = stringBuffer178.toString();
        StringBuffer stringBuffer179 = new StringBuffer(Integer.toString(145179));
        stringBuffer179.append('(');
        strArr2[178] = stringBuffer179.toString();
        f1810t = strArr2;
    }

    /* renamed from: a1 */
    private void m2203a1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            mo8981T(P1[1].trim(), ((ArrayList) m2136K0(P1[0])).toArray());
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: a2 */
    private void m2204a2(com.iapp.app.p067x5.WebView webView, String str) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(this.f1815d.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(this.f1815d.getApplicationContext().getDir("database", 0).getPath());
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
        new C1443b().mo12152m(webView, this.f1815d, this.f1814c);
        if (str.contains("<eventItme type=\"ondownloadstart\">")) {
            new C1325l(webView, this.f1814c);
        } else {
            webView.setDownloadListener(new C0868b0(this));
        }
        m2165Q1(webView);
    }

    /* renamed from: a3 */
    private void m2205a3(Camera camera) {
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

    /* renamed from: b */
    private boolean m2206b(String str) {
        int O1 = m2156O1(str, '=', '=');
        if (O1 != -1) {
            Object K0 = m2136K0(str.substring(0, O1));
            Object K02 = m2136K0(str.substring(O1 + 2));
            if (K0 == null && K02 == null) {
                return true;
            }
            if (!(K0 == null || K02 == null)) {
                if ((K0 instanceof Double) || (K02 instanceof Double)) {
                    try {
                        if (Double.parseDouble(String.valueOf(K0)) == Double.parseDouble(String.valueOf(K02))) {
                            return true;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                if (String.valueOf(K0).equals(String.valueOf(K02))) {
                    return true;
                }
            }
            return false;
        }
        int O12 = m2156O1(str, '!', '=');
        if (O12 != -1) {
            Object K03 = m2136K0(str.substring(0, O12));
            Object K04 = m2136K0(str.substring(O12 + 2));
            if (K03 == null && K04 == null) {
                return false;
            }
            return K03 == null || K04 == null || !String.valueOf(K03).equals(String.valueOf(K04));
        }
        int O13 = m2156O1(str, '>', '=');
        if (O13 != -1) {
            Object K05 = m2136K0(str.substring(0, O13));
            Object K06 = m2136K0(str.substring(O13 + 2));
            return (K05 == null || K06 == null || Double.parseDouble(K05.toString()) < Double.parseDouble(K06.toString())) ? false : true;
        }
        int O14 = m2156O1(str, '<', '=');
        if (O14 != -1) {
            Object K07 = m2136K0(str.substring(0, O14));
            Object K08 = m2136K0(str.substring(O14 + 2));
            return (K07 == null || K08 == null || Double.parseDouble(K07.toString()) > Double.parseDouble(K08.toString())) ? false : true;
        }
        int N1 = m2151N1(str, '>');
        if (N1 != -1) {
            Object K09 = m2136K0(str.substring(0, N1));
            Object K010 = m2136K0(str.substring(N1 + 1));
            return (K09 == null || K010 == null || Double.parseDouble(K09.toString()) <= Double.parseDouble(K010.toString())) ? false : true;
        }
        int N12 = m2151N1(str, '<');
        if (N12 != -1) {
            String L0 = m2140L0(str.substring(0, N12));
            String L02 = m2140L0(str.substring(N12 + 1));
            return (L0 == null || L02 == null || Double.parseDouble(L0.toString()) >= Double.parseDouble(L02.toString())) ? false : true;
        }
        int O15 = m2156O1(str, '?', '*');
        if (O15 != -1) {
            String L03 = m2140L0(str.substring(0, O15));
            String L04 = m2140L0(str.substring(O15 + 2));
            return (L03 == null || L04 == null || !L03.startsWith(L04)) ? false : true;
        }
        int O16 = m2156O1(str, '*', '?');
        if (O16 != -1) {
            String L05 = m2140L0(str.substring(0, O16));
            String L06 = m2140L0(str.substring(O16 + 2));
            return (L05 == null || L06 == null || !L05.endsWith(L06)) ? false : true;
        }
        int N13 = m2151N1(str, '?');
        if (N13 != -1) {
            String L07 = m2140L0(str.substring(0, N13));
            String L08 = m2140L0(str.substring(N13 + 1));
            return (L07 == null || L08 == null || !L07.contains(L08)) ? false : true;
        }
        Object K011 = m2136K0(str);
        return K011 != null && K011.equals(Boolean.TRUE);
    }

    /* renamed from: b0 */
    private String m2207b0(String str) {
        return str.substring(str.indexOf(123, !str.startsWith("{") ? str.indexOf(10) : 0) + 1, str.lastIndexOf(125));
    }

    /* renamed from: b1 */
    private void m2208b1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            mo8981T(P1[1].trim(), m2260m0(m2136K0(P1[0]), P1[0]));
        } else if (length == 3) {
            Object K0 = m2136K0(P1[0]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
            Object K02 = m2136K0(P1[1]);
            mo8981T(P1[2].trim(), K02 instanceof View ? (View) K02 : m2255l0(m0, K02, P1[1]));
        }
    }

    /* renamed from: b2 */
    private void m2209b2(String str) {
        C0839h.m1891G(this.f1815d, str);
    }

    /* renamed from: b3 */
    private void m2210b3(Camera camera) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        if (camera != null && (parameters = camera.getParameters()) != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !"torch".equals(parameters.getFlashMode()) && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            camera.setParameters(parameters);
        }
    }

    /* renamed from: c */
    private boolean m2211c(String str) {
        boolean z = false;
        for (String str2 : m2146M1(str, '|', '|')) {
            boolean z2 = false;
            for (String str3 : m2146M1(str2, '&', '&')) {
                String trim = str3.trim();
                z2 = trim.startsWith("!") ? !m2206b(trim.substring(1)) : m2206b(trim);
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

    /* renamed from: c0 */
    private void m2212c0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            Object K0 = m2136K0(P1[1]);
            if (K0 instanceof Integer) {
                int parseInt = Integer.parseInt(String.valueOf(K0));
                if (parseInt == -1) {
                    ((ArrayList) m2136K0(P1[0])).clear();
                } else {
                    ((ArrayList) m2136K0(P1[0])).remove(parseInt);
                }
            } else {
                ((ArrayList) m2136K0(P1[0])).remove(K0);
            }
        }
    }

    /* renamed from: c1 */
    private void m2213c1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            Object K0 = m2136K0(P1[0]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
            if (m0 instanceof com.iapp.app.p067x5.WebView) {
                ((com.iapp.app.p067x5.WebView) m0).loadUrl("javascript:{" + m2136K0(P1[1]) + "};");
            }
        }
    }

    /* renamed from: c2 */
    private boolean m2214c2(String str, String str2) {
        int indexOf = str.indexOf(10);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        return str.startsWith(str2) && str.endsWith(")");
    }

    /* renamed from: c3 */
    private void m2215c3(String str) {
        Toast makeText;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 1) {
            makeText = Toast.makeText(this.f1815d, m2140L0(P1[0]), 1);
        } else if (P1.length == 2) {
            makeText = Toast.makeText(this.f1815d, m2140L0(P1[0]), Integer.parseInt(m2140L0(P1[1])));
        } else {
            return;
        }
        makeText.show();
    }

    /* renamed from: d */
    private int m2216d(String str) {
        return (int) Double.parseDouble(str);
    }

    /* renamed from: d0 */
    private void m2217d0() {
        View peekDecorView = this.f1814c.getWindow().peekDecorView();
        if (peekDecorView != null) {
            ((InputMethodManager) this.f1815d.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
    }

    /* renamed from: d1 */
    private void m2218d1(String str) {
        String trim;
        int b;
        Boolean bool = Boolean.TRUE;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 3) {
            mo8981T(P1[2].trim(), Integer.valueOf(C0841i.m1918a(m2140L0(P1[0]), m2150N0(m2140L0(P1[1])), false)));
            return;
        }
        if (length == 4) {
            trim = P1[3].trim();
            b = C0841i.m1918a(m2140L0(P1[0]), m2150N0(m2140L0(P1[1])), m2136K0(P1[2]).equals(bool));
        } else if (length == 9) {
            trim = P1[8].trim();
            b = C0841i.m1919b(m2140L0(P1[0]), m2150N0(m2140L0(P1[1])), m2136K0(P1[2]).equals(bool), (String) m2136K0(P1[3]), (String) m2136K0(P1[4]), (String) m2136K0(P1[5]), m2136K0(P1[6]).equals(bool), (String) m2136K0(P1[7]));
        } else {
            return;
        }
        mo8981T(trim, Integer.valueOf(b));
    }

    /* renamed from: d2 */
    private void m2219d2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            try {
                mo8981T(P1[2].trim(), Array.get(m2136K0(P1[0]), m2216d(m2140L0(P1[1]))));
            } catch (Exception e) {
                e.printStackTrace();
                mo8981T(P1[2].trim(), null);
            }
        }
    }

    /* renamed from: d3 */
    private void m2220d3(String str) {
        Snackbar snackbar;
        String[] P1 = m2161P1(m2190W2(str));
        int length = P1.length;
        if (length == 3) {
            Object K0 = m2136K0(P1[0]);
            View findViewById = K0 == null ? this.f1814c.findViewById(C0839h.f1737a) : K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
            if (findViewById != null) {
                snackbar = Snackbar.make(findViewById, m2140L0(P1[1]), m2216d(m2140L0(P1[2])));
            } else {
                return;
            }
        } else if (length == 4) {
            Object K02 = m2136K0(P1[0]);
            View findViewById2 = K02 == null ? this.f1814c.findViewById(C0839h.f1737a) : K02 instanceof View ? (View) K02 : m2260m0(K02, P1[0]);
            if (findViewById2 != null) {
                snackbar = Snackbar.make(findViewById2, m2140L0(P1[1]), m2216d(m2140L0(P1[2]))).setAction(m2140L0(P1[3]), new View$OnClickListenerC0872d0(m2207b0(str)));
            } else {
                return;
            }
        } else {
            return;
        }
        snackbar.show();
    }

    /* renamed from: e0 */
    private void m2221e0() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        this.f1815d.startActivity(intent);
    }

    /* renamed from: e1 */
    private void m2222e1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 7) {
            C1293a.f3049b.mo9045m(m2150N0(m2140L0(P1[0])), m2150N0(m2140L0(P1[1])), m2216d(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2216d(m2140L0(P1[4])), m2216d(m2140L0(P1[5])), m2136K0(P1[6]).equals(Boolean.TRUE));
        }
    }

    /* renamed from: e2 */
    private void m2223e2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        try {
            mo8981T(P1[1].trim(), Integer.valueOf(Array.getLength(m2136K0(P1[0]))));
        } catch (Exception e) {
            e.printStackTrace();
            mo8981T(P1[1].trim(), -1);
        }
    }

    /* renamed from: e3 */
    private void m2224e3(String str) {
        String str2;
        Bitmap bitmap;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof Bitmap) {
                bitmap = C0849k.m1967g((Bitmap) K0, (float) m2216d(m2140L0(P1[1])));
                str2 = P1[2].trim();
            } else {
                str2 = P1[2].trim();
                bitmap = null;
            }
            mo8981T(str2, bitmap);
        }
    }

    /* renamed from: f0 */
    private void m2225f0() {
        AlertDialog alertDialog = f1804n;
        if (alertDialog != null) {
            alertDialog.dismiss();
            f1804n = null;
        }
    }

    /* renamed from: f1 */
    private void m2226f1(String str) {
        C0911c g;
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 4) {
            g = C1293a.f3049b.mo9038d(m2140L0(P1[0]), m2140L0(P1[1]), m2136K0(P1[2]));
            str2 = P1[3];
        } else if (length == 5) {
            g = C1293a.f3049b.mo9039e(m2140L0(P1[0]), m2140L0(P1[1]), m2140L0(P1[2]), m2136K0(P1[3]));
            str2 = P1[4];
        } else if (length == 6) {
            g = C1293a.f3049b.mo9040f(m2140L0(P1[0]), m2140L0(P1[1]), m2140L0(P1[2]), m2136K0(P1[3]), m2136K0(P1[4]));
            str2 = P1[5];
        } else if (length == 8) {
            g = C1293a.f3049b.mo9041g(m2140L0(P1[0]), m2150N0(m2140L0(P1[1])), m2140L0(P1[2]), m2140L0(P1[3]), m2136K0(P1[4]), m2136K0(P1[5]).equals(Boolean.TRUE), m2136K0(P1[6]));
            str2 = P1[7];
        } else {
            return;
        }
        mo8981T(str2.trim(), g);
    }

    /* renamed from: f2 */
    private void m2227f2(String str) {
        String V2 = m2186V2(str);
        CharSequence text = ((ClipboardManager) this.f1815d.getSystemService("clipboard")).getText();
        mo8981T(V2.trim(), text == null ? null : text.toString());
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0043 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2228f3(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = r5.m2186V2(r6)
            java.lang.String[] r6 = m2161P1(r6)
            r0 = 0
            r1 = r6[r0]
            java.lang.Object r1 = r5.m2136K0(r1)
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            r2 = r6[r0]
            android.view.View r1 = r5.m2260m0(r1, r2)
        L_0x001a:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            r2 = r6[r2]
            java.lang.Object r2 = r5.m2136K0(r2)
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
            r5.mo8981T(r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.m2228f3(java.lang.String):void");
    }

    /* renamed from: g0 */
    private void m2230g0(String str) {
        String trim;
        boolean f;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            trim = P1[2].trim();
            f = C0839h.m1897f(this.f1815d, m2140L0(P1[0]), m2140L0(P1[1]), true);
        } else if (P1.length == 4) {
            trim = P1[3].trim();
            f = C0839h.m1897f(this.f1815d, m2140L0(P1[0]), m2140L0(P1[1]), m2136K0(P1[2]).equals(Boolean.TRUE));
        } else {
            return;
        }
        mo8981T(trim, Boolean.valueOf(f));
    }

    /* renamed from: g1 */
    private void m2231g1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (!(K0 instanceof C0911c)) {
                K0 = C1293a.f3049b.f1934c.get(m2216d(String.valueOf(K0)));
            }
            mo8981T(P1[2].trim(), C1293a.f3049b.mo9042h((C0911c) K0, m2140L0(P1[1])));
        }
    }

    /* renamed from: g2 */
    private void m2232g2(String str) {
        mo8981T(m2186V2(str).trim(), C0860r.m2058q(this.f1815d));
    }

    /* renamed from: g3 */
    private void m2233g3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            mo8981T(P1[1].trim(), Boolean.valueOf(C0835f.m1859p(this.f1815d, m2140L0(P1[0]))));
        } else if (length == 3) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(m2140L0(P1[0]), m2140L0(P1[1])));
                this.f1815d.startActivity(intent);
                mo8981T(P1[2].trim(), Boolean.TRUE);
            } catch (Exception unused) {
                mo8981T(P1[2].trim(), Boolean.FALSE);
            }
        }
    }

    /* renamed from: h0 */
    private void m2235h0(String str) {
        String str2;
        Boolean bool;
        String[] P1 = m2161P1(m2186V2(str));
        File file = new File(m2150N0(m2140L0(P1[0])));
        if (file.exists()) {
            str2 = P1[1].trim();
            bool = Boolean.valueOf(file.delete());
        } else {
            str2 = P1[1].trim();
            bool = Boolean.FALSE;
        }
        mo8981T(str2, bool);
    }

    /* renamed from: h1 */
    private void m2236h1(String str) {
        mo8981T(m2186V2(str).trim(), C1293a.f3049b.f1934c);
    }

    /* renamed from: h2 */
    private void m2237h2(String str) {
        String V2 = m2186V2(str);
        try {
            mo8981T(V2.trim(), ((TelephonyManager) this.f1815d.getSystemService("phone")).getSubscriberId());
        } catch (Exception e) {
            e.printStackTrace();
            mo8981T(V2.trim(), null);
        }
    }

    /* renamed from: h3 */
    private void m2238h3(String str) {
        StringBuilder sb;
        String[] P1 = m2161P1(m2186V2(str));
        ArrayList arrayList = new ArrayList();
        boolean equals = m2136K0(P1[0]).equals(Boolean.TRUE);
        for (PackageInfo packageInfo : this.f1815d.getPackageManager().getInstalledPackages(0)) {
            String str2 = packageInfo.packageName;
            if (equals) {
                sb = new StringBuilder();
            } else if ((1 & packageInfo.applicationInfo.flags) == 0) {
                sb = new StringBuilder();
            }
            sb.append(packageInfo.packageName);
            sb.append("\n");
            sb.append(m2169R0(str2));
            sb.append("\n");
            sb.append(packageInfo.applicationInfo.loadLabel(this.f1815d.getPackageManager()).toString());
            sb.append("\n");
            sb.append(packageInfo.versionName);
            arrayList.add(sb.toString());
        }
        mo8981T(P1[1].trim(), arrayList.toArray());
    }

    /* renamed from: i0 */
    private void m2240i0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 1) {
            mo8981T(P1[0].trim(), C0835f.f1721a);
        } else if (P1.length == 2) {
            mo8981T(P1[1].trim(), m2150N0(m2140L0(P1[0])));
        }
    }

    /* renamed from: i1 */
    private void m2241i1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (!(K0 instanceof C0911c)) {
                K0 = C1293a.f3049b.f1934c.get(m2216d(String.valueOf(K0)));
            }
            C1293a.f3049b.mo9044l((C0911c) K0, m2140L0(P1[1]), m2136K0(P1[2]));
        }
    }

    /* renamed from: i2 */
    private void m2242i2(String str) {
        String trim;
        int indexOf;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 4) {
            trim = P1[3].trim();
            indexOf = m2140L0(P1[0]).indexOf(m2140L0(P1[1]), m2216d(m2140L0(P1[2])));
        } else if (P1.length == 3) {
            trim = P1[2].trim();
            indexOf = m2140L0(P1[0]).indexOf(m2140L0(P1[1]));
        } else {
            return;
        }
        mo8981T(trim, Integer.valueOf(indexOf));
    }

    /* renamed from: i3 */
    private void m2243i3(String str) {
        String V2 = m2186V2(str);
        ArrayList arrayList = new ArrayList();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f1815d.getSystemService("activity")).getRunningAppProcesses()) {
            arrayList.add(runningAppProcessInfo.processName + "\n" + runningAppProcessInfo.pid + "\n" + runningAppProcessInfo.uid);
        }
        mo8981T(V2.trim(), arrayList.toArray());
    }

    /* renamed from: j0 */
    private void m2245j0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Boolean.valueOf(C0839h.m1898g(this.f1815d, m2140L0(P1[0]))));
    }

    /* renamed from: j1 */
    private void m2246j1(String str) {
        Intent intent;
        Context context;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 0) {
            context = this.f1815d;
            intent = new Intent().setClass(this.f1815d, DownList.class);
        } else if (length == 2) {
            intent = new Intent(this.f1815d, DownList.class);
            Bundle bundle = new Bundle();
            bundle.putString("background", m2140L0(P1[0]));
            bundle.putString("backgroundShadow", m2140L0(P1[1]));
            intent.putExtras(bundle);
            context = this.f1815d;
        } else {
            return;
        }
        context.startActivity(intent);
    }

    /* renamed from: j2 */
    private void m2247j2(String str) {
        Intent intent;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        String L0 = m2140L0(P1[1]);
        if (K0 instanceof Intent) {
            intent = (Intent) K0;
        } else {
            intent = new Intent();
            mo8981T(P1[0].trim(), intent);
        }
        if (L0.equals("action")) {
            intent.setAction(m2140L0(P1[2]));
        } else if (L0.equals("type")) {
            intent.setType(m2140L0(P1[2]));
        } else if (L0.equals("extra")) {
            Object K02 = m2136K0(P1[3]);
            if (K02 instanceof String[]) {
                intent.putExtra(m2140L0(P1[2]), (String[]) K02);
            } else if (K02 instanceof Boolean) {
                intent.putExtra(m2140L0(P1[2]), K02.equals(Boolean.TRUE));
            } else if (K02 instanceof Integer) {
                intent.putExtra(m2140L0(P1[2]), Integer.parseInt(String.valueOf(K02)));
            } else if (K02 instanceof Long) {
                intent.putExtra(m2140L0(P1[2]), Long.parseLong(String.valueOf(K02)));
            } else {
                intent.putExtra(m2140L0(P1[2]), String.valueOf(K02));
            }
        } else if (L0.equals("flags")) {
            intent.setFlags(m2216d(m2140L0(P1[2])));
        } else if (L0.equals("data")) {
            intent.setData(C0851m.m1977c(this.f1815d, m2140L0(P1[2])));
        } else if (L0.equals("classname")) {
            intent.setClassName(m2140L0(P1[2]), m2140L0(P1[3]));
        } else if (L0.equals("component")) {
            intent.setComponent(new ComponentName(m2140L0(P1[2]), m2140L0(P1[3])));
        }
    }

    /* renamed from: j3 */
    private void m2248j3(String str) {
        String L0 = m2140L0(m2186V2(str));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        Context context = this.f1815d;
        intent.setData(C0851m.m1977c(context, "tel:" + L0));
        this.f1815d.startActivity(intent);
    }

    /* renamed from: k0 */
    private void m2250k0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Boolean.valueOf(new File(m2150N0(m2140L0(P1[0]))).isDirectory()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2251k1(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.m2251k1(java.lang.String):void");
    }

    /* renamed from: k2 */
    private void m2252k2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 4) {
            Object K0 = m2136K0(P1[1]);
            Object K02 = m2136K0(P1[2]);
            String str2 = null;
            String valueOf = K02 == null ? null : String.valueOf(K02);
            if (K0 != null) {
                str2 = String.valueOf(K0);
            }
            mo8981T(P1[3].trim(), C0860r.m2044c(m2140L0(P1[0]), str2, valueOf));
        }
    }

    /* renamed from: k3 */
    private void m2253k3(String str) {
        String b0 = m2207b0(str);
        Message message = new Message();
        message.what = 2;
        message.obj = b0;
        this.f1820i.sendMessage(message);
    }

    /* renamed from: l0 */
    private View m2255l0(View view, Object obj, String str) {
        String trim = str.trim();
        if ((obj instanceof Integer) && (trim.startsWith("ss.") || trim.startsWith("sss."))) {
            return this.f1814c.findViewById(Integer.parseInt(obj.toString()));
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
            Object obj2 = f1806p.get(substring);
            if (obj2 == null) {
                return null;
            }
            return view.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f1806p.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return view.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: l1 */
    private void m2256l1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof C0836g) {
            C0836g gVar = (C0836g) K0;
            if (length == 4) {
                gVar.mo8929n(m2140L0(P1[1]), m2216d(m2140L0(P1[2])), m2136K0(P1[3]));
            } else if (length == 5) {
                gVar.mo8930o(m2140L0(P1[1]), m2216d(m2140L0(P1[2])), m2136K0(P1[3]), m2150N0(m2140L0(P1[4])));
            } else {
                return;
            }
            gVar.mo8933t();
        }
    }

    /* renamed from: l2 */
    private void m2257l2(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            trim = P1[1].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[1])) + Double.parseDouble(m2140L0(P1[0])));
        } else if (length == 3) {
            trim = P1[2].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[0])) + Double.parseDouble(m2140L0(P1[1])));
        } else if (length == 4 && m2136K0(P1[2]).equals(Boolean.TRUE)) {
            trim = P1[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2140L0(P1[0])) + Double.parseDouble(m2140L0(P1[1])));
            mo8981T(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        mo8981T(trim, valueOf);
    }

    /* renamed from: l3 */
    private void m2258l3(String str) {
        String str2;
        String trim;
        Object f;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
        if (P1.length == 3) {
            if (m0 != null) {
                trim = P1[2].trim();
                f = new C1305g(m0, this.f1815d).mo11842e(m2140L0(P1[1]));
            } else {
                str2 = P1[2];
                mo8981T(str2.trim(), null);
                return;
            }
        } else if (P1.length != 4) {
            return;
        } else {
            if (m0 != null) {
                trim = P1[3].trim();
                f = new C1305g(m0, this.f1815d).mo11847f(m2140L0(P1[1]), m2136K0(P1[2]));
            } else {
                str2 = P1[3];
                mo8981T(str2.trim(), null);
                return;
            }
        }
        mo8981T(trim, f);
    }

    /* renamed from: m0 */
    private View m2260m0(Object obj, String str) {
        String trim = str.trim();
        if ((obj instanceof Integer) && (trim.startsWith("ss.") || trim.startsWith("sss."))) {
            return this.f1814c.findViewById(Integer.parseInt(obj.toString()));
        }
        int indexOf = trim.indexOf(46);
        if (indexOf == -1 || trim.indexOf(34) != -1) {
            String valueOf = String.valueOf(obj);
            int indexOf2 = valueOf.indexOf(46);
            if (indexOf2 == -1) {
                return this.f1814c.findViewById(Integer.parseInt(valueOf));
            }
            String substring = valueOf.substring(0, indexOf2);
            String substring2 = valueOf.substring(indexOf2 + 1);
            Object obj2 = f1806p.get(substring);
            if (obj2 == null) {
                return null;
            }
            return this.f1814c.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f1806p.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return this.f1814c.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: m1 */
    private void m2261m1(String str) {
        String str2;
        String str3;
        String trim;
        String h;
        String substring;
        Boolean bool = Boolean.TRUE;
        String[] P1 = m2161P1(m2186V2(str.replace("\\&", "\\\\\\&")));
        int length = P1.length;
        if (length == 2) {
            P1[0] = m2140L0(P1[0]);
            if (P1[0].equals("cookie")) {
                str3 = P1[1].trim();
                substring = P1[0];
            } else if (P1[0].startsWith("cookie:")) {
                str3 = P1[1].trim();
                substring = P1[0].substring(7);
            } else {
                str3 = P1[1].trim();
                str2 = C0841i.m1922e(P1[0], null, null);
            }
            str2 = C0841i.m1921d(substring);
        } else if (length == 4) {
            str3 = P1[3].trim();
            str2 = C0841i.m1922e((String) m2136K0(P1[0]), (String) m2136K0(P1[1]), (String) m2136K0(P1[2]));
        } else if (length == 5) {
            str3 = P1[4].trim();
            str2 = C0841i.m1923f((String) m2136K0(P1[0]), (String) m2136K0(P1[1]), (String) m2136K0(P1[2]), (String) m2136K0(P1[3]));
        } else {
            if (length == 6) {
                trim = P1[5].trim();
                h = C0841i.m1924g((String) m2136K0(P1[0]), (String) m2136K0(P1[1]), (String) m2136K0(P1[2]), (String) m2136K0(P1[3]), m2136K0(P1[4]).equals(bool));
            } else if (length == 7) {
                trim = P1[6].trim();
                h = C0841i.m1925h((String) m2136K0(P1[0]), (String) m2136K0(P1[1]), (String) m2136K0(P1[2]), (String) m2136K0(P1[3]), m2136K0(P1[4]).equals(bool), (String) m2136K0(P1[5]), 20000, 20000, null);
            } else if (length == 10) {
                trim = P1[9].trim();
                h = C0841i.m1925h((String) m2136K0(P1[0]), (String) m2136K0(P1[1]), (String) m2136K0(P1[2]), (String) m2136K0(P1[3]), m2136K0(P1[4]).equals(bool), (String) m2136K0(P1[5]), Integer.parseInt(m2140L0(P1[6])), Integer.parseInt(m2140L0(P1[7])), m2145M0(P1[8]));
            } else if (length == 1) {
                P1[0] = m2140L0(P1[0]);
                C0841i.m1921d(P1[0]);
                return;
            } else {
                return;
            }
            mo8981T(trim, h);
            return;
        }
        mo8981T(str3, str2);
    }

    /* renamed from: m2 */
    private void m2262m2(String str) {
        String trim;
        Object valueOf;
        long parseDouble;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            trim = P1[1].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[1])) - Double.parseDouble(m2140L0(P1[0])));
        } else if (length == 3) {
            trim = P1[2].trim();
            parseDouble = (long) (Double.parseDouble(m2140L0(P1[0])) - Double.parseDouble(m2140L0(P1[1])));
        } else if (length == 4 && m2136K0(P1[2]).equals(Boolean.TRUE)) {
            trim = P1[3].trim();
            valueOf = Double.valueOf(Double.parseDouble(m2140L0(P1[0])) - Double.parseDouble(m2140L0(P1[1])));
            mo8981T(trim, valueOf);
        } else {
            return;
        }
        valueOf = Long.valueOf(parseDouble);
        mo8981T(trim, valueOf);
    }

    /* renamed from: m3 */
    private void m2263m3(String str) {
        MyFragmentStatePagerAdapter myFragmentStatePagerAdapter;
        int i;
        boolean z;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
        boolean z2 = m0 instanceof ViewPager;
        if (z2 || (m0 instanceof VerticalViewPager)) {
            Object K02 = m2136K0(P1[1]);
            if (!K02.equals("bd")) {
                PagerAdapter pagerAdapter = null;
                if (z2) {
                    pagerAdapter = ((ViewPager) m0).getAdapter();
                } else if (m0 instanceof VerticalViewPager) {
                    pagerAdapter = ((VerticalViewPager) m0).getAdapter();
                }
                if (K02.equals("add")) {
                    int length = P1.length;
                    HashMap<Integer, Object> hashMap = new HashMap<>();
                    for (int i2 = 5; i2 < length; i2++) {
                        int indexOf = P1[i2].indexOf(61);
                        if (indexOf != -1) {
                            try {
                                hashMap.put(Integer.valueOf(m2216d(m2140L0(P1[i2].substring(0, indexOf)))), m2136K0(P1[i2].substring(indexOf + 1)));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    if (pagerAdapter == null || !((z = pagerAdapter instanceof FragmentStatePagerAdapter))) {
                        myFragmentStatePagerAdapter = new MyFragmentStatePagerAdapter(this.f1814c, m0.getId(), ((AppCompatActivity) this.f1814c).getSupportFragmentManager());
                        if (z2) {
                            ViewPager viewPager = (ViewPager) m0;
                            viewPager.setAdapter(myFragmentStatePagerAdapter);
                            viewPager.setOffscreenPageLimit(5);
                        } else if (m0 instanceof VerticalViewPager) {
                            VerticalViewPager verticalViewPager = (VerticalViewPager) m0;
                            verticalViewPager.setAdapter(myFragmentStatePagerAdapter);
                            verticalViewPager.setOffscreenPageLimit(5);
                        }
                    } else if (z) {
                        myFragmentStatePagerAdapter = (MyFragmentStatePagerAdapter) pagerAdapter;
                    } else {
                        return;
                    }
                    String[] b = C0861s.m2069b(m2140L0(P1[4]), '|');
                    int length2 = b.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        String trim = b[i3].trim();
                        if (trim.endsWith(".iyu")) {
                            i = i3;
                            myFragmentStatePagerAdapter.mo11524a(m2216d(m2140L0(P1[2])), m2140L0(P1[3]), trim, m2284r(trim.substring(0, trim.length() - 4)), hashMap);
                        } else {
                            i = i3;
                        }
                        i3 = i + 1;
                    }
                } else if (K02.equals("del")) {
                    if (pagerAdapter instanceof FragmentStatePagerAdapter) {
                        ((MyFragmentStatePagerAdapter) pagerAdapter).mo11526c(m2216d(m2140L0(P1[2])));
                    }
                } else if (K02.equals("title")) {
                    if (pagerAdapter instanceof FragmentStatePagerAdapter) {
                        ((MyFragmentStatePagerAdapter) pagerAdapter).mo11528e(m2216d(m2140L0(P1[2])), m2140L0(P1[3]));
                    }
                } else if (K02.equals("size")) {
                    if (pagerAdapter instanceof FragmentStatePagerAdapter) {
                        mo8981T(P1[2].trim(), Integer.valueOf(((MyFragmentStatePagerAdapter) pagerAdapter).mo11529f()));
                    }
                } else if (K02.equals("close") && (pagerAdapter instanceof FragmentStatePagerAdapter)) {
                    ((MyFragmentStatePagerAdapter) pagerAdapter).mo11525b();
                }
            } else if (z2) {
                Object K03 = m2136K0(P1[2]);
                View m02 = K03 instanceof View ? (View) K03 : m2260m0(K03, P1[2]);
                if (m02 instanceof TabLayout) {
                    ((TabLayout) m02).setupWithViewPager((ViewPager) m0, m2136K0(P1[3]).equals(Boolean.TRUE));
                }
            }
        }
    }

    /* renamed from: n0 */
    private void m2265n0(String str) {
        String str2;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            String N0 = m2150N0(m2140L0(P1[1]));
            C0835f.m1845b(N0, false);
            try {
                C0834e.m1837c(m2150N0(m2140L0(P1[0])), N0, true);
                mo8981T(P1[2].trim(), bool);
            } catch (Exception unused) {
                str2 = P1[2];
                mo8981T(str2.trim(), bool2);
            }
        } else if (P1.length == 4) {
            String N02 = m2150N0(m2140L0(P1[1]));
            C0835f.m1845b(N02, false);
            try {
                C0834e.m1837c(m2150N0(m2140L0(P1[0])), N02, m2136K0(P1[2]).equals(bool));
                mo8981T(P1[3].trim(), bool);
            } catch (Exception unused2) {
                str2 = P1[3];
                mo8981T(str2.trim(), bool2);
            }
        }
    }

    @TargetApi(11)
    /* renamed from: n1 */
    private void m2266n1(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            Object K0 = m2136K0(P1[0]);
            View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
            if (m0 instanceof com.iapp.app.p067x5.WebView) {
                com.iapp.app.p067x5.WebView webView = (com.iapp.app.p067x5.WebView) m0;
                if (Build.VERSION.SDK_INT >= 11) {
                    webView.removeJavascriptInterface("iapp");
                }
                if (m2136K0(P1[1]).equals(Boolean.TRUE)) {
                    webView.addJavascriptInterface(new C1311iapp(this.f1815d, this.f1814c), "iapp");
                }
            }
        }
    }

    /* renamed from: n2 */
    private void m2267n2(String str) {
        String V2 = m2186V2(str);
        String[] C0 = m2098C0();
        int[] D0 = m2103D0();
        int[] E0 = m2108E0();
        String[] F0 = m2113F0();
        mo8981T(V2.trim(), new String[]{C0[0] + "\n" + C0[1], D0[0] + "\n" + D0[1] + "\n" + E0[0] + "\n" + E0[1], F0[0] + "\n" + F0[1] + "\n" + F0[2]});
    }

    /* renamed from: n3 */
    private void m2268n3(String str) {
        Intent intent;
        Intent intent2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 1) {
            String L0 = m2140L0(P1[0]);
            if (L0.endsWith(".iyu")) {
                intent2 = new Intent(this.f1815d, mian.class);
            } else if (L0.endsWith(".ijava")) {
                intent2 = new Intent(this.f1815d, main3.class);
            } else if (L0.endsWith(".ilua")) {
                intent2 = new Intent(this.f1815d, main.class);
            } else if (L0.endsWith(".ijs")) {
                intent2 = new Intent(this.f1815d, main2.class);
            } else {
                return;
            }
            intent2.putExtras(C0839h.m1886B(L0));
            this.f1815d.startActivity(intent2);
        } else if (length == 2) {
            String L02 = m2140L0(P1[0]);
            if (L02.endsWith(".iyu")) {
                intent = new Intent(this.f1815d, mian.class);
            } else if (L02.endsWith(".ijava")) {
                intent = new Intent(this.f1815d, main3.class);
            } else if (L02.endsWith(".ilua")) {
                intent = new Intent(this.f1815d, main.class);
            } else if (L02.endsWith(".ijs")) {
                intent = new Intent(this.f1815d, main2.class);
            } else {
                return;
            }
            intent.putExtras(C0839h.m1886B(L02));
            intent.setFlags(m2216d(m2140L0(P1[1])));
            this.f1815d.startActivity(intent);
        }
    }

    /* renamed from: o0 */
    private void m2270o0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            mo8981T(P1[1].trim(), C0839h.m1899h(this.f1815d, m2140L0(P1[0])));
        } else if (length == 3) {
            File file = new File(m2150N0(m2140L0(P1[0])));
            if (file.exists()) {
                ArrayList arrayList = new ArrayList();
                boolean equals = m2136K0(P1[1]).equals(Boolean.TRUE);
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    mo8981T(P1[2].trim(), null);
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
                mo8981T(P1[2].trim(), arrayList.toArray());
                return;
            }
            mo8981T(P1[2].trim(), null);
        }
    }

    /* renamed from: o1 */
    private void m2271o1(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 5) {
            try {
                mo8981T(P1[4].trim(), C0841i.m1930m(this.f1815d, m2140L0(P1[0]), m2140L0(P1[1]), m2140L0(P1[2]), m2140L0(P1[3])));
                return;
            } catch (Exception unused) {
                str2 = P1[4];
            }
        } else if (P1.length == 6) {
            try {
                mo8981T(P1[5].trim(), C0841i.m1931n(this.f1815d, m2140L0(P1[0]), m2140L0(P1[1]), m2140L0(P1[2]), m2140L0(P1[3]), (String) m2136K0(P1[4])));
                return;
            } catch (Exception unused2) {
                str2 = P1[5];
            }
        } else {
            return;
        }
        mo8981T(str2.trim(), null);
    }

    /* renamed from: o2 */
    private void m2272o2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 3) {
            mo8981T(P1[2].trim(), C0861s.m2072e(m2140L0(P1[0]), m2140L0(P1[1])));
        } else if (length == 4) {
            mo8981T(P1[3].trim(), m2136K0(P1[2]).equals(Boolean.TRUE) ? m2140L0(P1[0]).split(m2140L0(P1[1])) : C0861s.m2072e(m2140L0(P1[0]), m2140L0(P1[1])));
        }
    }

    /* renamed from: o3 */
    private void m2273o3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof Intent) {
            Intent intent = (Intent) K0;
            if (m2140L0(P1[1]).equals("chooser")) {
                this.f1815d.startActivity(Intent.createChooser(intent, m2140L0(P1[2])));
            } else if (m2140L0(P1[1]).equals("result")) {
                this.f1814c.startActivityForResult(intent, m2216d(m2140L0(P1[2])));
            } else {
                this.f1815d.startActivity(intent);
            }
        }
    }

    /* renamed from: p */
    private void m2274p(View view, String str) {
        if (str.contains("<eventItme type=\"clicki\">")) {
            view.setOnClickListener(new View$OnClickListenerC0877g());
        }
        if (str.contains("<eventItme type=\"touchmonitor\">")) {
            view.setOnTouchListener(new View$OnTouchListenerC0879h());
        }
        if (str.contains("<eventItme type=\"press\">")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC0881i());
        }
        if (str.contains("<eventItme type=\"keyboard\">")) {
            view.setOnKeyListener(new View$OnKeyListenerC0883j());
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC0887l());
        }
        if (view instanceof TextView) {
            if (str.contains("<eventItme type=\"editormonitor\">")) {
                ((TextView) view).setOnEditorActionListener(new C0890m());
            }
            if (str.contains("<eventItme type=\"ontextchanged\">") || str.contains("<eventItme type=\"beforetextchanged\">") || str.contains("<eventItme type=\"aftertextchanged\">")) {
                new C1352q((TextView) view, this.f1814c);
            }
        }
        if (view instanceof com.iapp.app.p067x5.WebView) {
            m2204a2((com.iapp.app.p067x5.WebView) view, str);
        }
        if (str.contains("<eventItme type=\"focuschange\">")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC0893n());
        }
        if ((view instanceof AbsListView) && (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscroll\">"))) {
            ((AbsListView) view).setOnScrollListener(new C0894o());
        }
        if (view instanceof AdapterView) {
            if (str.contains("<eventItme type=\"clickitem\">")) {
                ((AdapterView) view).setOnItemClickListener(new C0895p());
            }
            if (str.contains("<eventItme type=\"onitemselected\">") || str.contains("<eventItme type=\"onnothingselected\">")) {
                ((AdapterView) view).setOnItemSelectedListener(new C0896q());
            }
        }
        if ((view instanceof ViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            new C1343o((ViewPager) view, this.f1814c);
        }
        if ((view instanceof DrawerLayout) && (str.contains("<eventItme type=\"ondrawerclosed\">") || str.contains("<eventItme type=\"ondraweropened\">") || str.contains("<eventItme type=\"onoptionsitemselected\">"))) {
            new C1334m((DrawerLayout) view, this.f1814c);
        }
        if ((view instanceof SeekBar) && (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">"))) {
            ((SeekBar) view).setOnSeekBarChangeListener(new C0897r());
        }
        m2279q(view, str);
    }

    /* renamed from: p0 */
    private void m2275p0(String str) {
        String N0 = m2150N0(m2140L0(m2161P1(m2186V2(str))[0]));
        File file = new File(N0);
        if (!file.exists()) {
            return;
        }
        if (N0.toLowerCase().endsWith(".apk")) {
            C0835f.m1847d(this.f1815d, N0);
            return;
        }
        try {
            m2128I1(file);
        } catch (Exception unused) {
        }
    }

    /* renamed from: p1 */
    private void m2276p1(String str) {
        Intent intent;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 1) {
            intent = new Intent(this.f1815d, Webview.class);
            Bundle bundle = new Bundle();
            bundle.putString("WebURL", m2140L0(P1[0]));
            intent.putExtras(bundle);
        } else if (length == 3) {
            intent = new Intent(this.f1815d, Webview.class);
            Bundle bundle2 = new Bundle();
            bundle2.putString("WebURL", m2140L0(P1[0]));
            bundle2.putString("background", m2140L0(P1[1]));
            bundle2.putString("backgroundShadow", m2140L0(P1[2]));
            intent.putExtras(bundle2);
        } else {
            return;
        }
        this.f1815d.startActivity(intent);
    }

    /* renamed from: p2 */
    private void m2277p2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Integer.valueOf(m2140L0(P1[0]).length()));
    }

    /* renamed from: p3 */
    private void m2278p3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        C0862t.m2076a(this.f1814c, m2150N0(m2140L0(P1[0])), m2216d(m2140L0(P1[1])));
    }

    /* renamed from: q */
    private void m2279q(View view, String str) {
        String c;
        if ((view instanceof TabLayout) && (str.contains("<eventItme type=\"ontabselected\">") || str.contains("<eventItme type=\"ontabunselected\">") || str.contains("<eventItme type=\"ontabreselected\">"))) {
            ((TabLayout) view).addOnTabSelectedListener(new C0898s(C0860r.m2044c(str, "<eventItme type=\"ontabselected\">", "</eventItme>"), view, C0860r.m2044c(str, "<eventItme type=\"ontabunselected\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"ontabreselected\">", "</eventItme>")));
        }
        if (view instanceof RecyclerView) {
            if (str.contains("<eventItme type=\"onscrollstatechanged\">") || str.contains("<eventItme type=\"onscrolled\">")) {
                ((RecyclerView) view).addOnScrollListener(new C0899t(C0860r.m2044c(str, "<eventItme type=\"onscrollstatechanged\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"onscrolled\">", "</eventItme>")));
            }
            if (str.contains("<eventItme type=\"clickitem\">") && (c = C0860r.m2044c(str, "<eventItme type=\"clickitem\">", "</eventItme>")) != null) {
                ((RecyclerView) view).addOnItemTouchListener(new C0902w(this, new GestureDetector(this.f1815d, new C0900u(view, c))));
            }
        }
        if ((view instanceof VerticalViewPager) && (str.contains("<eventItme type=\"onpageselected\">") || str.contains("<eventItme type=\"onpagescrolled\">") || str.contains("<eventItme type=\"onpagescrollstatechanged\">"))) {
            ((VerticalViewPager) view).setOnPageChangeListener(new C0903x(C0860r.m2044c(str, "<eventItme type=\"onpageselected\">", "</eventItme>"), view, C0860r.m2044c(str, "<eventItme type=\"onpagescrolled\">", "</eventItme>"), C0860r.m2044c(str, "<eventItme type=\"onpagescrollstatechanged\">", "</eventItme>")));
        }
        if ((view instanceof SwipeRefreshLayout) && str.contains("<eventItme type=\"onrefresh\">")) {
            ((SwipeRefreshLayout) view).setOnRefreshListener(new C0904y(C0860r.m2044c(str, "<eventItme type=\"onrefresh\">", "</eventItme>"), view));
        }
        if ((view instanceof CompoundButton) && str.contains("<eventItme type=\"oncheckedchanged\">")) {
            ((CompoundButton) view).setOnCheckedChangeListener(new C0905z(C0860r.m2044c(str, "<eventItme type=\"oncheckedchanged\">", "</eventItme>"), view));
        }
        if ((view instanceof AppBarLayout) && str.contains("<eventItme type=\"onoffsetchanged\">")) {
            ((AppBarLayout) view).addOnOffsetChangedListener(new C0866a0(C0860r.m2044c(str, "<eventItme type=\"onoffsetchanged\">", "</eventItme>")));
        }
    }

    /* renamed from: q0 */
    private int m2280q0(String str) {
        String W2 = m2190W2(str);
        int indexOf = W2.indexOf(59);
        String trim = W2.substring(0, indexOf).trim();
        String trim2 = W2.substring(indexOf + 1).trim();
        Object K0 = m2136K0(trim);
        Object K02 = m2136K0(trim2);
        if (K02 instanceof String[]) {
            String b0 = m2207b0(str);
            for (String str2 : (String[]) K02) {
                mo8981T(trim, str2);
                int e = mo8984e(b0);
                if (e == 2) {
                    return 2;
                }
                if (e == 1) {
                    return 0;
                }
            }
        } else if (K02 instanceof Object[]) {
            String b02 = m2207b0(str);
            for (Object obj : (Object[]) K02) {
                mo8981T(trim, obj);
                int e2 = mo8984e(b02);
                if (e2 == 2) {
                    return 2;
                }
                if (e2 == 1) {
                    return 0;
                }
            }
        } else if (K02 instanceof ArrayList) {
            String b03 = m2207b0(str);
            Iterator it = ((ArrayList) K02).iterator();
            while (it.hasNext()) {
                mo8981T(trim, it.next());
                int e3 = mo8984e(b03);
                if (e3 == 2) {
                    return 2;
                }
                if (e3 == 1) {
                    return 0;
                }
            }
        } else {
            int d = m2216d(K02.toString());
            String b04 = m2207b0(str);
            for (int d2 = m2216d(K0.toString()); d2 <= d; d2++) {
                int e4 = mo8984e(b04);
                if (e4 == 2) {
                    return 2;
                }
                if (e4 == 1) {
                    return 0;
                }
            }
        }
        return 0;
    }

    /* renamed from: q1 */
    private void m2281q1(String str) {
        Intent intent;
        String L0 = m2140L0(m2186V2(str));
        try {
            intent = C0841i.m1934q(this.f1815d, L0);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(C0851m.m1977c(this.f1815d, L0));
            intent = intent2;
        }
        this.f1815d.startActivity(intent);
    }

    /* renamed from: q2 */
    private void m2282q2(String str) {
        String trim;
        int lastIndexOf;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 4) {
            trim = P1[3].trim();
            lastIndexOf = m2140L0(P1[0]).lastIndexOf(m2140L0(P1[1]), m2216d(m2140L0(P1[2])));
        } else if (P1.length == 3) {
            trim = P1[2].trim();
            lastIndexOf = m2140L0(P1[0]).lastIndexOf(m2140L0(P1[1]));
        } else {
            return;
        }
        mo8981T(trim, Integer.valueOf(lastIndexOf));
    }

    /* renamed from: q3 */
    private void m2283q3(String str) {
        Object K0;
        Object obj;
        ArrayList<HashMap<Integer, Object>> a;
        Object obj2;
        String[] P1 = m2161P1(m2186V2(str));
        Object K02 = m2136K0(P1[0]);
        int length = P1.length;
        if (length != 1) {
            if (length == 2) {
                if (!P1[1].contains("=") && ((K0 = m2136K0(P1[1])) == null || K0.equals("clear"))) {
                    if ((K02 instanceof C0886k0) && (obj = ((C0886k0) K02).f1856b) != null) {
                        if (obj instanceof C0888l0) {
                            a = ((C0888l0) obj).mo9008a();
                        } else if (obj instanceof C0891m0) {
                            a = ((C0891m0) obj).mo9016a();
                        } else {
                            return;
                        }
                        a.clear();
                        return;
                    }
                    return;
                }
            } else if (length == 3 && m2140L0(P1[1]).equals("list")) {
                mo8981T(P1[2].trim(), ((K02 == null || !(K02 instanceof C0886k0)) ? new C0886k0(this, null) : (C0886k0) K02).f1855a);
                return;
            }
            C0886k0 k0Var = (K02 == null || !(K02 instanceof C0886k0)) ? new C0886k0(this, null) : (C0886k0) K02;
            HashMap<Integer, Object> hashMap = new HashMap<>();
            for (int i = 1; i < length; i++) {
                int indexOf = P1[i].indexOf(61);
                if (indexOf != -1) {
                    try {
                        hashMap.put(Integer.valueOf(m2216d(m2140L0(P1[i].substring(0, indexOf)))), m2136K0(P1[i].substring(indexOf + 1)));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            k0Var.f1855a.add(hashMap);
            mo8981T(P1[0].trim(), k0Var);
        } else if ((K02 instanceof C0886k0) && (obj2 = ((C0886k0) K02).f1856b) != null) {
            if (obj2 instanceof C0888l0) {
                ((C0888l0) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof ArrayAdapter) {
                ((ArrayAdapter) obj2).notifyDataSetChanged();
            } else if (obj2 instanceof C0891m0) {
                ((C0891m0) obj2).notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: r */
    private synchronized int m2284r(String str) {
        Object obj = f1806p.get(str);
        if (obj != null) {
            return Integer.parseInt(obj.toString());
        }
        int i = f1807q + 10000;
        f1807q = i;
        f1806p.put(str, Integer.valueOf(i));
        return f1807q;
    }

    /* renamed from: r0 */
    private void m2285r0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        String L0 = m2140L0(P1[0]);
        if (length == 2) {
            mo8981T(P1[1].trim(), C0839h.m1900i(this.f1815d, L0));
        } else if (length == 3) {
            mo8981T(P1[2].trim(), C0839h.m1901j(this.f1815d, L0, m2140L0(P1[1])));
        }
    }

    /* renamed from: r1 */
    private int m2286r1(String str) {
        StringBuilder sb;
        String str2;
        String[] v2 = m2307v2(str, '\n');
        String str3 = "";
        int i = 0;
        for (int i2 = 0; i2 < v2.length; i2++) {
            if (v2[i2].equals("{")) {
                i++;
            } else if (v2[i2].equals("}")) {
                i--;
            } else if (i == 0) {
                if (v2[i2].startsWith(f1810t[0])) {
                    sb = new StringBuilder();
                    str2 = v2[i2];
                } else {
                    if (v2[i2].startsWith("else")) {
                        String trim = v2[i2].substring(4).trim();
                        if (trim.startsWith("f(")) {
                            str3 = trim + "\n";
                        } else {
                            sb = new StringBuilder();
                            str2 = v2[i2];
                        }
                    }
                }
                sb.append(str2);
                sb.append("\n");
                str3 = sb.toString();
            }
            str3 = str3 + v2[i2] + "\n";
            if (i != 0) {
                continue;
            } else if (!str3.startsWith(f1810t[0])) {
                int e = mo8984e(m2207b0(str3));
                if (e == 2) {
                    return 2;
                }
                return e == 1 ? 1 : 0;
            } else if (m2211c(m2190W2(str3))) {
                int e2 = mo8984e(m2207b0(str3));
                if (e2 == 2) {
                    return 2;
                }
                return e2 == 1 ? 1 : 0;
            }
        }
        return 0;
    }

    /* renamed from: r2 */
    private void m2287r2(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), m2140L0(P1[0]).toLowerCase());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d0, code lost:
        if ((r0 instanceof p013b.p044b.p045a.p046a.C0864v.C0886k0) != false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e2  */
    /* renamed from: r3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2288r3(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 528
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.m2288r3(java.lang.String):void");
    }

    /* renamed from: s */
    private void m2289s(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
        int length = P1.length;
        if (length == 3) {
            if ((m0 instanceof ViewPager) || (m0 instanceof VerticalViewPager)) {
                ArrayList arrayList = new ArrayList();
                String[] v2 = m2307v2(m2140L0(P1[1]), '|');
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                for (String str2 : v2) {
                    String trim = str2.trim();
                    if (trim.endsWith(".iyu")) {
                        LinearLayout linearLayout = new LinearLayout(this.f1815d);
                        linearLayout.setLayoutParams(layoutParams);
                        linearLayout.setOrientation(1);
                        mo8978J1(trim, linearLayout, m2284r(trim.substring(0, trim.length() - 4)), null);
                        arrayList.add(linearLayout);
                    }
                }
                new C1437s(m0, arrayList);
                mo8981T(P1[2].trim(), arrayList);
            }
        } else if (length == 2) {
            if ((m0 instanceof DrawerLayout) || (m0 instanceof ViewGroup)) {
                String[] v22 = m2307v2(m2140L0(P1[1]), '|');
                for (String str3 : v22) {
                    String trim2 = str3.trim();
                    if (trim2.endsWith(".iyu")) {
                        mo8978J1(str3.trim(), (ViewGroup) m0, m2284r(trim2.substring(0, trim2.length() - 4)), null);
                    }
                }
            }
        }
    }

    /* renamed from: s0 */
    private void m2290s0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        mo8981T(P1[1].trim(), Long.valueOf(C0839h.m1902k(this.f1815d, m2140L0(P1[0]))));
    }

    /* renamed from: s1 */
    private int m2291s1(String str) {
        StringBuilder sb;
        String str2;
        String[] v2 = m2307v2(str, '\n');
        String str3 = "";
        int i = 0;
        for (int i2 = 0; i2 < v2.length; i2++) {
            if (v2[i2].equals("{")) {
                i++;
            } else if (v2[i2].equals("}")) {
                i--;
            } else if (i == 0) {
                if (v2[i2].startsWith(f1810t[0])) {
                    sb = new StringBuilder();
                    str2 = v2[i2];
                } else {
                    if (v2[i2].startsWith("else")) {
                        String trim = v2[i2].substring(4).trim();
                        if (trim.startsWith("f(")) {
                            str3 = f1810t[0] + trim.substring(2) + "\n";
                        } else {
                            sb = new StringBuilder();
                            str2 = v2[i2];
                        }
                    }
                }
                sb.append(str2);
                sb.append("\n");
                str3 = sb.toString();
            }
            str3 = str3 + v2[i2] + "\n";
            if (i != 0) {
                continue;
            } else if (!str3.startsWith(f1810t[0])) {
                int e = mo8984e(m2207b0(str3));
                if (e == 2) {
                    return 2;
                }
                return e == 1 ? 1 : 0;
            } else if (m2211c(m2190W2(str3))) {
                int e2 = mo8984e(m2207b0(str3));
                if (e2 == 2) {
                    return 2;
                }
                return e2 == 1 ? 1 : 0;
            }
        }
        return 0;
    }

    /* renamed from: s2 */
    private void m2292s2(String str) {
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        int indexOf = substring.indexOf(44);
        String trim = substring.substring(0, indexOf).trim();
        String str2 = " " + trim.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").replace("(", " ( ").replace(")", " ) ").replace("%", " % ") + " ";
        String[] v2 = m2307v2(trim.replace('+', ',').replace('-', ',').replace('*', ',').replace('/', ',').replace('(', ',').replace(')', ',').replace('%', ','), ',');
        for (String str3 : v2) {
            str2 = str2.replace(" " + str3.trim() + " ", m2140L0(str3));
        }
        double d = -1.0d;
        try {
            d = C1017h.m2796f(str2).mo9936a();
        } catch (C1027e e) {
            e.printStackTrace();
        }
        mo8981T(substring.substring(indexOf + 1).trim(), Double.valueOf(d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        if ((r0 instanceof p013b.p044b.p045a.p046a.C0864v.C0886k0) != false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* renamed from: s3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2293s3(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.m2293s3(java.lang.String):void");
    }

    /* renamed from: t */
    private void m2294t(String str) {
        ArrayList arrayList;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof ArrayList) {
            arrayList = (ArrayList) K0;
        } else {
            arrayList = new ArrayList();
            mo8981T(P1[0].trim(), arrayList);
        }
        if (P1.length == 2) {
            arrayList.add(m2136K0(P1[1]));
        } else if (P1.length == 3) {
            arrayList.add(m2216d(m2140L0(P1[2])), m2136K0(P1[1]));
        }
    }

    /* renamed from: t0 */
    private void m2295t0(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            File file = new File(m2150N0(m2140L0(P1[0])));
            if (file.exists()) {
                String N0 = m2150N0(m2140L0(P1[1]));
                C0835f.m1845b(N0, false);
                mo8981T(P1[2].trim(), Boolean.valueOf(file.renameTo(new File(N0))));
                return;
            }
            mo8981T(P1[2].trim(), Boolean.FALSE);
        }
    }

    /* renamed from: t1 */
    private boolean m2296t1(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("[+-]?[0-9]+[0-9]*(\\.[0-9]+)?");
    }

    /* renamed from: t2 */
    private void m2297t2(String str) {
        String trim;
        Object v;
        int u;
        Object obj = Boolean.TRUE;
        String[] P1 = m2161P1(m2190W2(str));
        int length = P1.length;
        if (length == 6) {
            String b0 = m2207b0(str);
            C0855q qVar = new C0855q(m2216d(m2140L0(P1[0])), m2150N0(m2140L0(P1[1])), m2216d(m2140L0(P1[2])), m2216d(m2140L0(P1[3])), m2136K0(P1[4]).equals(obj));
            qVar.mo8955F(new C0880h0(b0));
            mo8981T(P1[5].trim(), qVar);
        } else if (length == 5) {
            String b02 = m2207b0(str);
            C0855q qVar2 = new C0855q(m2140L0(P1[0]), m2216d(m2140L0(P1[1])), m2216d(m2140L0(P1[2])), m2136K0(P1[3]).equals(obj));
            qVar2.mo8955F(new C0882i0(b02));
            mo8981T(P1[4].trim(), qVar2);
        } else if (length == 4) {
            if (m2136K0(P1[1]).equals("list")) {
                Object K0 = m2136K0(P1[0]);
                if (K0 instanceof C0855q) {
                    mo8981T(P1[3].trim(), ((C0855q) K0).mo8953A(m2216d(m2140L0(P1[2]))));
                }
            }
        } else if (length == 3) {
            Object K02 = m2136K0(P1[0]);
            if (K02 instanceof C0855q) {
                Object K03 = m2136K0(P1[1]);
                if (K03.equals("str")) {
                    ((C0855q) K02).mo8957b(m2140L0(P1[2]));
                } else if (K03.equals("file")) {
                    ((C0855q) K02).mo8956a(new File(m2150N0(m2140L0(P1[2]))));
                } else if (K03.equals("bt")) {
                    ((C0855q) K02).mo8958c(m2102D(m2140L0(P1[2]), ' '));
                } else if (K03.equals("bt2")) {
                    ((C0855q) K02).mo8959d((byte[]) m2136K0(P1[2]));
                } else {
                    if (K03.equals("ip")) {
                        trim = P1[2].trim();
                        v = Boolean.valueOf(((C0855q) K02).mo8954B());
                    } else {
                        if (K03.equals("id")) {
                            trim = P1[2].trim();
                            u = ((C0855q) K02).mo8961t();
                        } else if (K03.equals("list")) {
                            trim = P1[2].trim();
                            v = ((C0855q) K02).mo8964w();
                        } else if (K03.equals("size")) {
                            trim = P1[2].trim();
                            u = ((C0855q) K02).mo8962u();
                        } else if (K03.equals("server")) {
                            trim = P1[2].trim();
                            v = ((C0855q) K02).mo8963v();
                        } else if (K03.equals("new")) {
                            ((C0855q) K02).f1776c = m2136K0(P1[2]).equals(obj);
                            return;
                        } else {
                            return;
                        }
                        v = Integer.valueOf(u);
                    }
                    mo8981T(trim, v);
                }
            }
        } else if (length == 2 && m2136K0(P1[1]).equals("re")) {
            Object K04 = m2136K0(P1[0]);
            if (K04 instanceof C0855q) {
                ((C0855q) K04).mo8960s();
            }
        }
    }

    /* renamed from: t3 */
    private void m2298t3(String str) {
        ArrayAdapter arrayAdapter;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
        if (m0 != null) {
            int length = P1.length;
            if (m0 instanceof ListView) {
                ListView listView = (ListView) m0;
                Object K02 = m2136K0(P1[1]);
                if (K02 instanceof C0886k0) {
                    C0886k0 k0Var = (C0886k0) K02;
                    if (k0Var.f1856b == null) {
                        k0Var.f1856b = new C0888l0(this.f1814c);
                    }
                    C0888l0 l0Var = (C0888l0) k0Var.f1856b;
                    l0Var.mo9009b(m2140L0(P1[2]), k0Var);
                    if (length > 4) {
                        l0Var.mo9010c(m2173S0(m2140L0(P1[3])), m2173S0(m2140L0(P1[4])));
                    }
                    listView.setAdapter((ListAdapter) l0Var);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = k0Var;
                    listView.setTag(objArr);
                }
            } else if (m0 instanceof GridView) {
                GridView gridView = (GridView) m0;
                Object K03 = m2136K0(P1[1]);
                if (K03 instanceof C0886k0) {
                    C0886k0 k0Var2 = (C0886k0) K03;
                    if (k0Var2.f1856b == null) {
                        k0Var2.f1856b = new C0888l0(this.f1814c);
                    }
                    C0888l0 l0Var2 = (C0888l0) k0Var2.f1856b;
                    l0Var2.mo9009b(m2140L0(P1[2]), k0Var2);
                    if (length > 4) {
                        l0Var2.mo9010c(m2173S0(m2140L0(P1[3])), m2173S0(m2140L0(P1[4])));
                    }
                    gridView.setAdapter((ListAdapter) l0Var2);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = k0Var2;
                    gridView.setTag(objArr2);
                }
            } else if (m0 instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) m0;
                Object K04 = m2136K0(P1[1]);
                if (K04 instanceof C0886k0) {
                    C0886k0 k0Var3 = (C0886k0) K04;
                    if (k0Var3.f1856b == null) {
                        k0Var3.f1856b = new C0891m0(this.f1814c);
                    }
                    C0891m0 m0Var = (C0891m0) k0Var3.f1856b;
                    m0Var.mo9019d(m2140L0(P1[2]), k0Var3);
                    if (length > 4) {
                        m0Var.mo9020e(m2173S0(m2140L0(P1[3])), m2173S0(m2140L0(P1[4])));
                    }
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.f1814c));
                    recyclerView.setAdapter(m0Var);
                    Object[] objArr3 = (Object[]) recyclerView.getTag();
                    objArr3[3] = k0Var3;
                    recyclerView.setTag(objArr3);
                }
            } else if (m0 instanceof TabLayout) {
                TabLayout tabLayout = (TabLayout) m0;
                Object K05 = m2136K0(P1[1]);
                if (K05 instanceof C0886k0) {
                    C0844j jVar = new C0844j(this.f1814c, 2);
                    String L0 = m2140L0(P1[2]);
                    int r = m2284r(L0.substring(0, L0.length() - 4));
                    Iterator<HashMap<Integer, Object>> it = ((C0886k0) K05).f1855a.iterator();
                    while (it.hasNext()) {
                        HashMap<Integer, Object> next = it.next();
                        LinearLayout linearLayout = new LinearLayout(this.f1814c);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(m2173S0(m2140L0(P1[3])), m2173S0(m2140L0(P1[4]))));
                        linearLayout.setOrientation(1);
                        mo8978J1(L0, linearLayout, r, next);
                        TabLayout.C1283g newTab = tabLayout.newTab();
                        newTab.mo11607k(linearLayout);
                        tabLayout.addTab(newTab);
                        for (Integer num : next.keySet()) {
                            int parseInt = Integer.parseInt(String.valueOf(num));
                            if (parseInt > 0) {
                                C0839h.m1914w(linearLayout.findViewById(parseInt + r), next.get(Integer.valueOf(parseInt)), next, jVar);
                            }
                        }
                    }
                }
            } else if (m0 instanceof Spinner) {
                Spinner spinner = (Spinner) m0;
                Object K06 = m2136K0(P1[1]);
                if (K06 instanceof ArrayList) {
                    arrayAdapter = new ArrayAdapter(this.f1815d, 17367048, (ArrayList) K06);
                } else if (K06 instanceof String[]) {
                    arrayAdapter = new ArrayAdapter(this.f1815d, 17367048, (String[]) K06);
                } else if (K06 instanceof Object[]) {
                    arrayAdapter = new ArrayAdapter(this.f1815d, 17367048, (Object[]) K06);
                } else {
                    return;
                }
                arrayAdapter.setDropDownViewResource(17367049);
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            }
        }
    }

    /* renamed from: u */
    private void m2299u(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        String L0 = m2140L0(P1[0]);
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (C0839h.m1895d(this.f1815d, mediaPlayer, L0) && length > 1) {
            mo8981T(P1[1].trim(), mediaPlayer);
        }
    }

    /* renamed from: u0 */
    private void m2300u0(String str) {
        String[] P1 = m2161P1(m2190W2(str));
        if (P1.length == 4) {
            C0862t.m2077b(this.f1815d, m2140L0(P1[0]), m2140L0(P1[1]), m2140L0(P1[2]), m2136K0(P1[3]), new Intent().setClass(this.f1815d, logoActivity.class).putExtra("command", m2207b0(str)));
        }
    }

    /* renamed from: u1 */
    private void m2301u1(String str) {
        Object[] objArr;
        Object obj = null;
        String b0 = str.endsWith("}") ? m2207b0(str) : null;
        String[] P1 = m2161P1(m2190W2(str));
        int length = P1.length;
        if (length > 2) {
            if (length > 3) {
                Object[] objArr2 = new Object[(length - 3)];
                for (int i = 3; i < length; i++) {
                    objArr2[i - 3] = m2136K0(P1[i]);
                }
                objArr = objArr2;
            } else {
                objArr = null;
            }
            try {
                obj = C0832d.m1822g(this.f1815d, m2136K0(P1[1]), m2140L0(P1[2]), objArr, b0 == null ? null : this, b0);
            } catch (Throwable th) {
                th.printStackTrace();
                m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            }
            mo8981T(P1[0].trim(), obj);
        }
    }

    /* renamed from: u2 */
    private void m2302u2(String str) {
        String trim;
        Object h;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 3) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof C0855q.C0858c) {
                Object K02 = m2136K0(P1[1]);
                if (K02.equals("str")) {
                    ((C0855q.C0858c) K0).mo8968b(m2140L0(P1[2]));
                } else if (K02.equals("file")) {
                    ((C0855q.C0858c) K0).mo8967a(new File(m2150N0(m2140L0(P1[2]))));
                } else if (K02.equals("bt")) {
                    ((C0855q.C0858c) K0).mo8969c(m2102D(m2140L0(P1[2]), ' '));
                } else if (K02.equals("bt2")) {
                    ((C0855q.C0858c) K0).mo8970d((byte[]) m2136K0(P1[2]));
                } else {
                    if (K02.equals("ip")) {
                        trim = P1[2].trim();
                        h = Boolean.valueOf(((C0855q.C0858c) K0).mo8975k());
                    } else if (K02.equals("id")) {
                        trim = P1[2].trim();
                        h = Integer.valueOf(((C0855q.C0858c) K0).mo8973i());
                    } else if (K02.equals("socket")) {
                        trim = P1[2].trim();
                        h = ((C0855q.C0858c) K0).mo8974j();
                    } else if (K02.equals("ht")) {
                        trim = P1[2].trim();
                        h = ((C0855q.C0858c) K0).mo8972h();
                    } else {
                        return;
                    }
                    mo8981T(trim, h);
                }
            }
        } else if (length == 2 && m2136K0(P1[1]).equals("re")) {
            Object K03 = m2136K0(P1[0]);
            if (K03 instanceof C0855q.C0858c) {
                ((C0855q.C0858c) K03).mo8971g();
            }
        }
    }

    /* renamed from: u3 */
    private void m2303u3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        Context context = this.f1815d;
        this.f1815d.startActivity(new Intent("android.intent.action.DELETE", C0851m.m1977c(context, "package:" + m2140L0(P1[0]))));
    }

    /* renamed from: v */
    private void m2304v(String str) {
        String str2;
        Object obj;
        int currentPosition;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof MediaPlayer) {
            MediaPlayer mediaPlayer = (MediaPlayer) K0;
            String L0 = m2140L0(P1[1]);
            if (L0 == null) {
                return;
            }
            if (L0.equals("st")) {
                try {
                    mediaPlayer.start();
                } catch (IllegalStateException unused) {
                }
            } else if (L0.equals("pe")) {
                mediaPlayer.pause();
            } else if (L0.equals("sp")) {
                mediaPlayer.stop();
            } else if (L0.equals("re")) {
                mediaPlayer.release();
            } else if (L0.equals("ip")) {
                try {
                    mo8981T(P1[2].trim(), Boolean.valueOf(mediaPlayer.isPlaying()));
                } catch (IllegalStateException unused2) {
                    str2 = P1[2].trim();
                    obj = Boolean.FALSE;
                }
            } else {
                if (L0.equals("dn")) {
                    str2 = P1[2].trim();
                    currentPosition = mediaPlayer.getDuration();
                } else if (L0.equals("cn")) {
                    str2 = P1[2].trim();
                    currentPosition = mediaPlayer.getCurrentPosition();
                } else if (L0.equals("seekto")) {
                    mediaPlayer.seekTo(m2216d(m2140L0(P1[2])));
                    return;
                } else if (L0.equals("volume")) {
                    mediaPlayer.setVolume((float) m2216d(m2140L0(P1[2])), (float) m2216d(m2140L0(P1[3])));
                    return;
                } else if (L0.equals("sl")) {
                    mediaPlayer.setLooping(m2136K0(P1[2]).equals(Boolean.TRUE));
                    return;
                } else {
                    try {
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                    } catch (Exception unused3) {
                    }
                    C0839h.m1895d(this.f1815d, mediaPlayer, L0);
                    return;
                }
                obj = Integer.valueOf(currentPosition);
                mo8981T(str2, obj);
            }
        }
    }

    /* renamed from: v0 */
    private void m2305v0(String str) {
        String lowerCase = str.substring(2, str.indexOf(40)).trim().toLowerCase();
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        HashMap<String, Object> hashMap = f1802l;
        Object obj = hashMap.get(lowerCase + length);
        if (obj == null) {
            String trim = str.substring(2, str.indexOf(46) + 1).trim();
            for (String str2 : f1802l.keySet()) {
                if (str2.toString().startsWith(trim)) {
                    return;
                }
            }
            m2209b2(trim + "myu");
            HashMap<String, Object> hashMap2 = f1802l;
            obj = hashMap2.get(lowerCase + length);
        }
        String obj2 = obj.toString();
        int indexOf = obj2.indexOf(10);
        String[] P12 = m2161P1(m2186V2(obj2.substring(0, indexOf)));
        if (length == P12.length) {
            C0864v vVar = this.f1819h;
            if (vVar == null) {
                this.f1819h = new C0864v(this.f1815d, this.f1814c);
            } else {
                vVar.mo8977G();
            }
            for (int i = 0; i < length; i++) {
                this.f1819h.mo8981T(P12[i].trim(), m2136K0(P1[i]));
            }
            this.f1819h.mo8984e(obj2.substring(indexOf).trim());
        }
    }

    /* renamed from: v1 */
    private void m2306v1(String str) {
        Object obj;
        String b0 = m2207b0(str);
        String[] P1 = m2161P1(m2190W2(str));
        Class cls = (Class) m2136K0(P1[1]);
        try {
            obj = C0832d.m1830o(cls.getClassLoader(), cls, this, b0);
        } catch (Throwable th) {
            th.printStackTrace();
            m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            obj = null;
        }
        mo8981T(P1[0].trim(), obj);
    }

    /* renamed from: v2 */
    private String[] m2307v2(String str, char c) {
        return C0861s.m2069b(str, c);
    }

    /* renamed from: v3 */
    private void m2308v3(String str) {
        String str2;
        C0716p pVar;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 0) {
            new C0853o(this.f1815d, this.f1814c).mo8948a();
        } else if (length == 1) {
            new C0853o(this.f1815d, this.f1814c).mo8949b(m2216d(m2140L0(P1[0])));
        } else if (length == 3) {
            mo8981T(P1[2].trim(), new C0853o(this.f1815d, this.f1814c).mo8950c(m2140L0(P1[0]), m2216d(m2140L0(P1[1]))));
        } else if (length == 2) {
            Object K0 = m2136K0(P1[0]);
            if (K0 instanceof Bitmap) {
                str2 = P1[1].trim();
                pVar = new C0853o(this.f1815d, this.f1814c).mo8951d((Bitmap) K0);
            } else {
                str2 = P1[1].trim();
                pVar = new C0853o(this.f1815d, this.f1814c).mo8952e(m2150N0(String.valueOf(K0)));
            }
            mo8981T(str2, pVar.mo8696f());
        }
    }

    /* renamed from: w */
    private void m2309w(String str) {
        Bitmap bitmap;
        int d;
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof Bitmap) {
            int length = P1.length;
            if (length == 2) {
                bitmap = (Bitmap) K0;
                d = 100;
                str2 = P1[1];
            } else if (length == 3) {
                bitmap = (Bitmap) K0;
                d = m2216d(m2140L0(P1[1]));
                str2 = P1[2];
            } else {
                return;
            }
            C0849k.m1968h(bitmap, d, m2150N0(m2140L0(str2)));
        }
    }

    /* renamed from: w1 */
    private void m2310w1(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object obj = null;
        if (length == 3) {
            try {
                obj = C0832d.m1825j(m2136K0(P1[1]), m2140L0(P1[2]));
            } catch (Throwable th) {
                th.printStackTrace();
                m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            }
            str2 = P1[0];
        } else if (length == 4) {
            Object K0 = m2136K0(P1[2]);
            try {
                obj = K0 instanceof Class ? C0832d.m1824i(m2136K0(P1[1]), (Class) K0, m2140L0(P1[3])) : C0832d.m1826k(m2136K0(P1[1]), K0.toString(), m2140L0(P1[3]));
            } catch (Throwable th2) {
                th2.printStackTrace();
                m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            }
            str2 = P1[0];
        } else {
            return;
        }
        mo8981T(str2.trim(), obj);
    }

    /* renamed from: w2 */
    private String[] m2311w2(String str, String str2) {
        return C0861s.m2071d(str, str2);
    }

    /* renamed from: w3 */
    private void m2312w3(String str) {
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        View m0 = K0 instanceof View ? (View) K0 : m2260m0(K0, P1[0]);
        if (m0 != null) {
            ((ViewGroup) m0.getParent()).removeView(m0);
        }
    }

    /* renamed from: x */
    private void m2313x(String str) {
        Intent intent;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            intent = new Intent(this.f1815d, Videoview.class);
            Bundle bundle = new Bundle();
            bundle.putString("video", m2140L0(P1[0]));
            bundle.putBoolean("sfhp", m2136K0(P1[1]).equals(Boolean.TRUE));
            intent.putExtras(bundle);
        } else if (length == 1) {
            intent = new Intent(this.f1815d, Videoview.class);
            Bundle bundle2 = new Bundle();
            bundle2.putString("video", m2140L0(P1[0]));
            bundle2.putBoolean("sfhp", false);
            intent.putExtras(bundle2);
        } else {
            return;
        }
        this.f1815d.startActivity(intent);
    }

    /* renamed from: x1 */
    private void m2314x1(String str) {
        Object[] objArr;
        Object obj = null;
        String b0 = str.endsWith("}") ? m2207b0(str) : null;
        String[] P1 = m2161P1(m2190W2(str));
        int length = P1.length;
        if (length > 1) {
            if (length > 2) {
                objArr = new Object[(length - 2)];
                for (int i = 2; i < length; i++) {
                    objArr[i - 2] = m2136K0(P1[i]);
                }
            } else {
                objArr = null;
            }
            Object K0 = m2136K0(P1[1]);
            try {
                obj = K0 instanceof Class ? C0832d.m1828m(this.f1815d, (Class) K0, objArr, b0 == null ? null : this, b0) : C0832d.m1829n(this.f1815d, K0.toString(), objArr, b0 == null ? null : this, b0);
            } catch (Throwable th) {
                th.printStackTrace();
                m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            }
            mo8981T(P1[0].trim(), obj);
        }
    }

    /* renamed from: x2 */
    private void m2315x2(String str) {
        Object obj;
        String str2;
        boolean z;
        String str3;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object K0 = m2136K0(P1[0]);
        SQLiteDatabase sQLiteDatabase = K0 instanceof SQLiteDatabase ? (SQLiteDatabase) K0 : null;
        if (length == 2) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(m2140L0(P1[0]));
            }
        } else if (length != 3) {
            if (length == 4) {
                Object K02 = m2136K0(P1[2]);
                if (K02.equals("ip")) {
                    str2 = P1[3].trim();
                    z = C0854p.m1992i(sQLiteDatabase, m2140L0(P1[1]));
                } else if (K02.equals("del")) {
                    str2 = P1[3].trim();
                    z = C0854p.m1988e(sQLiteDatabase, m2140L0(P1[1]));
                } else {
                    return;
                }
            } else if (length == 5) {
                Object K03 = m2136K0(P1[2]);
                if (K03.equals("add")) {
                    str2 = P1[4].trim();
                    z = C0854p.m1985b(sQLiteDatabase, m2140L0(P1[1]), m2140L0(P1[3]));
                } else if (K03.equals("del")) {
                    str2 = P1[4].trim();
                    z = C0854p.m1987d(sQLiteDatabase, m2140L0(P1[1]), m2145M0(P1[3]));
                } else {
                    return;
                }
            } else if (length == 6) {
                Object K04 = m2136K0(P1[2]);
                if (K04.equals("add")) {
                    str2 = P1[5].trim();
                    z = C0854p.m1984a(sQLiteDatabase, m2140L0(P1[1]), m2140L0(P1[3]), m2140L0(P1[4]));
                } else if (K04.equals("up")) {
                    str2 = P1[5].trim();
                    z = C0854p.m1993j(sQLiteDatabase, m2140L0(P1[1]), m2140L0(P1[3]), m2145M0(P1[4]));
                } else if (K04.equals("sele")) {
                    str2 = P1[5].trim();
                    obj = C0854p.m1991h(sQLiteDatabase, m2140L0(P1[3]), m2140L0(P1[1]), m2145M0(P1[4]));
                    mo8981T(str2, obj);
                } else {
                    return;
                }
            } else {
                return;
            }
            obj = Boolean.valueOf(z);
            mo8981T(str2, obj);
        } else if (sQLiteDatabase != null) {
            try {
                mo8981T(P1[2].trim(), sQLiteDatabase.rawQuery(m2140L0(P1[1]), null));
            } catch (Exception e) {
                e.printStackTrace();
                str3 = P1[2];
            }
        } else {
            str3 = P1[2];
            mo8981T(str3.trim(), null);
        }
    }

    /* renamed from: x3 */
    private void m2316x3(String str) {
        View view;
        String str2;
        String trim;
        boolean h0;
        Activity activity;
        int i;
        String[] P1 = m2161P1(m2186V2(str));
        int i2 = 0;
        Object K0 = m2136K0(P1[0]);
        if (K0 instanceof View) {
            view = (View) K0;
        } else {
            View m0 = m2260m0(K0, P1[0]);
            int indexOf = P1[0].indexOf(46);
            if (indexOf == -1 || P1[0].indexOf(34) != -1) {
                String valueOf = String.valueOf(K0);
                int indexOf2 = valueOf.indexOf(46);
                if (indexOf2 != -1) {
                    String substring = valueOf.substring(0, indexOf2);
                    String substring2 = valueOf.substring(indexOf2 + 1);
                    Object obj = f1806p.get(substring);
                    if (obj != null) {
                        i2 = Integer.parseInt(String.valueOf(obj));
                        activity = this.f1814c;
                        i = Integer.parseInt(substring2) + i2;
                    }
                } else {
                    activity = this.f1814c;
                    i = Integer.parseInt(valueOf);
                }
                view = activity.findViewById(i);
            } else {
                String substring3 = P1[0].substring(0, indexOf);
                String substring4 = P1[0].substring(indexOf + 1);
                Object obj2 = f1806p.get(substring3);
                if (obj2 != null) {
                    i2 = Integer.parseInt(String.valueOf(obj2));
                    view = this.f1814c.findViewById(Integer.parseInt(substring4) + i2);
                }
            }
            view = m0;
        }
        if (P1.length != 3) {
            if (P1.length == 4) {
                if (view != null) {
                    trim = P1[3].trim();
                    h0 = new C1305g(view, this.f1815d, i2).mo11843e0(m2140L0(P1[1]), m2136K0(P1[2]));
                } else {
                    str2 = P1[3];
                    mo8981T(str2.trim(), null);
                    return;
                }
            } else if (P1.length == 5) {
                if (view != null) {
                    trim = P1[4].trim();
                    h0 = new C1305g(view, this.f1815d, i2).mo11848f0(m2140L0(P1[1]), m2140L0(P1[2]), m2140L0(P1[3]));
                } else {
                    str2 = P1[4];
                    mo8981T(str2.trim(), null);
                    return;
                }
            } else if (P1.length == 6) {
                if (view != null) {
                    trim = P1[5].trim();
                    h0 = new C1305g(view, this.f1815d, i2).mo11852g0(m2140L0(P1[1]), m2140L0(P1[2]), m2140L0(P1[3]), m2140L0(P1[4]));
                } else {
                    str2 = P1[5];
                    mo8981T(str2.trim(), null);
                    return;
                }
            } else if (P1.length != 7) {
                return;
            } else {
                if (view != null) {
                    trim = P1[6].trim();
                    h0 = new C1305g(view, this.f1815d, i2).mo11856h0(m2140L0(P1[1]), m2140L0(P1[2]), m2140L0(P1[3]), m2140L0(P1[4]), m2140L0(P1[5]));
                } else {
                    str2 = P1[6];
                    mo8981T(str2.trim(), null);
                    return;
                }
            }
            mo8981T(trim, Boolean.valueOf(h0));
        } else if (view != null) {
            new C1305g(view, this.f1815d, i2).mo11843e0(m2140L0(P1[1]), m2136K0(P1[2]));
        }
    }

    /* renamed from: y */
    private void m2317y(String str) {
        Uri c;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        VideoView videoView = K0 instanceof VideoView ? (VideoView) K0 : (VideoView) m2260m0(K0, P1[0]);
        if (P1.length == 2) {
            Object K02 = m2136K0(P1[1]);
            if (K02 instanceof Uri) {
                c = (Uri) K02;
            } else {
                String valueOf = String.valueOf(K02);
                if (C0860r.m2063v(valueOf.toLowerCase())) {
                    c = C0851m.m1977c(this.f1815d, valueOf);
                } else {
                    videoView.setVideoPath(m2150N0(valueOf));
                    return;
                }
            }
            videoView.setVideoURI(c);
        }
    }

    /* renamed from: y0 */
    private void m2318y0(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 4) {
            String N0 = m2150N0(m2140L0(P1[2]));
            C0835f.m1845b(N0, false);
            try {
                mo8981T(P1[3].trim(), Integer.valueOf(C0839h.m1903l(this.f1815d, m2140L0(P1[0]), m2140L0(P1[1]), N0, true)));
            } catch (Exception unused) {
                str2 = P1[3];
                mo8981T(str2.trim(), -1);
            }
        } else if (P1.length == 5) {
            String N02 = m2150N0(m2140L0(P1[2]));
            C0835f.m1845b(N02, false);
            try {
                mo8981T(P1[4].trim(), Integer.valueOf(C0839h.m1903l(this.f1815d, m2140L0(P1[0]), m2140L0(P1[1]), N02, m2136K0(P1[3]).equals(Boolean.TRUE))));
            } catch (Exception unused2) {
                str2 = P1[4];
                mo8981T(str2.trim(), -1);
            }
        }
    }

    /* renamed from: y1 */
    private void m2319y1(String str) {
        String str2;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object obj = null;
        if (length == 4) {
            try {
                obj = C0832d.m1831p(m2136K0(P1[1]), m2140L0(P1[2]), m2136K0(P1[3]));
            } catch (Throwable th) {
                th.printStackTrace();
                m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            }
            str2 = P1[0];
        } else if (length == 5) {
            Object K0 = m2136K0(P1[2]);
            try {
                obj = Boolean.valueOf(K0 instanceof Class ? C0832d.m1832q(m2136K0(P1[1]), (Class) K0, m2140L0(P1[3]), m2136K0(P1[4])) : C0832d.m1833r(m2136K0(P1[1]), K0.toString(), m2140L0(P1[3]), m2136K0(P1[4])));
            } catch (Throwable th2) {
                th2.printStackTrace();
                m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            }
            str2 = P1[0];
        } else {
            return;
        }
        mo8981T(str2.trim(), obj);
    }

    /* renamed from: y2 */
    private void m2320y2(String str) {
        String str2;
        Object obj;
        boolean z;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        if (length == 2) {
            String L0 = m2140L0(P1[1]);
            if (L0.equals("re")) {
                Object K0 = m2136K0(P1[0]);
                if (K0 instanceof SQLiteDatabase) {
                    ((SQLiteDatabase) K0).close();
                    return;
                }
                return;
            } else if (L0.contains("/") || L0.contains("\\") || L0.startsWith("@") || L0.startsWith("$") || L0.startsWith("%")) {
                str2 = P1[0].trim();
                obj = C0839h.m1917z(this.f1815d, m2150N0(L0), false);
            } else {
                str2 = P1[0].trim();
                obj = C0839h.m1917z(this.f1815d, L0, true);
            }
        } else if (length == 3) {
            Object K02 = m2136K0(P1[1]);
            if (K02.equals("ip")) {
                String L02 = m2140L0(P1[0]);
                if (L02.contains("/") || L02.contains("\\") || L02.startsWith("@") || L02.startsWith("$") || L02.startsWith("%")) {
                    str2 = P1[2].trim();
                    z = C0839h.m1916y(this.f1815d, m2150N0(L02), false);
                } else {
                    str2 = P1[2].trim();
                    z = C0839h.m1916y(this.f1815d, L02, true);
                }
            } else if (K02.equals("del")) {
                String L03 = m2140L0(P1[0]);
                if (L03.contains("/") || L03.contains("\\") || L03.startsWith("@") || L03.startsWith("$") || L03.startsWith("%")) {
                    str2 = P1[2].trim();
                    z = C0839h.m1915x(this.f1815d, m2150N0(L03), false);
                } else {
                    str2 = P1[2].trim();
                    z = C0839h.m1915x(this.f1815d, L03, true);
                }
            } else {
                return;
            }
            obj = Boolean.valueOf(z);
        } else {
            return;
        }
        mo8981T(str2, obj);
    }

    /* renamed from: y3 */
    private void m2321y3(String str) {
        String str2;
        Object i;
        int i2 = Build.VERSION.SDK_INT;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 2) {
            P1[0] = P1[0].trim();
            try {
                if (m2136K0(P1[1]).equals(Boolean.TRUE)) {
                    Object K0 = m2136K0(P1[0]);
                    if (i2 >= 23) {
                        str2 = P1[0];
                        i = C0862t.m2084i(this.f1815d, true);
                    } else {
                        if (K0 instanceof Camera) {
                            ((Camera) K0).release();
                        }
                        Camera open = Camera.open();
                        mo8981T(P1[0], open);
                        m2210b3(open);
                        return;
                    }
                } else {
                    Object K02 = m2136K0(P1[0]);
                    if (i2 >= 23) {
                        str2 = P1[0];
                        i = C0862t.m2084i(this.f1815d, false);
                    } else if (K02 instanceof Camera) {
                        Camera camera = (Camera) K02;
                        m2205a3(camera);
                        camera.release();
                        mo8981T(P1[0], null);
                        return;
                    } else {
                        return;
                    }
                }
                mo8981T(str2, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: z */
    private void m2322z(String str) {
        String trim;
        int currentPosition;
        Boolean bool;
        String[] P1 = m2161P1(m2186V2(str));
        Object K0 = m2136K0(P1[0]);
        VideoView videoView = K0 instanceof VideoView ? (VideoView) K0 : (VideoView) m2260m0(K0, P1[0]);
        int length = P1.length;
        if (length == 2) {
            String L0 = m2140L0(P1[1]);
            if (L0.equals("st")) {
                videoView.requestFocus();
                videoView.start();
            } else if (L0.equals("pe")) {
                videoView.pause();
            } else if (L0.equals("sp")) {
                videoView.stopPlayback();
            }
        } else if (length == 3) {
            String L02 = m2140L0(P1[1]);
            if (L02.equals("seekto")) {
                videoView.seekTo(m2216d(m2140L0(P1[2])));
                return;
            }
            if (L02.equals("media")) {
                MediaController mediaController = new MediaController(this.f1815d);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                trim = P1[2].trim();
                bool = mediaController;
            } else if (L02.equals("ip")) {
                try {
                    mo8981T(P1[2].trim(), Boolean.valueOf(videoView.isPlaying()));
                    return;
                } catch (Exception unused) {
                    trim = P1[2].trim();
                    bool = Boolean.FALSE;
                }
            } else {
                if (L02.equals("dn")) {
                    trim = P1[2].trim();
                    currentPosition = videoView.getDuration();
                } else if (L02.equals("cn")) {
                    trim = P1[2].trim();
                    currentPosition = videoView.getCurrentPosition();
                } else {
                    return;
                }
                bool = Integer.valueOf(currentPosition);
            }
            mo8981T(trim, bool);
        }
    }

    /* renamed from: z0 */
    private void m2323z0(String str) {
        String str2;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        String[] P1 = m2161P1(m2186V2(str));
        if (P1.length == 3) {
            String N0 = m2150N0(m2140L0(P1[1]));
            C0835f.m1845b(N0, false);
            try {
                C0839h.m1904m(this.f1815d, m2140L0(P1[0]), N0, true);
                mo8981T(P1[2].trim(), bool);
            } catch (Exception unused) {
                str2 = P1[2];
                mo8981T(str2.trim(), bool2);
            }
        } else if (P1.length == 4) {
            String N02 = m2150N0(m2140L0(P1[1]));
            C0835f.m1845b(N02, false);
            try {
                C0839h.m1904m(this.f1815d, m2140L0(P1[0]), N02, m2136K0(P1[2]).equals(bool));
                mo8981T(P1[3].trim(), bool);
            } catch (Exception unused2) {
                str2 = P1[3];
                mo8981T(str2.trim(), bool2);
            }
        }
    }

    /* renamed from: z1 */
    private void m2324z1(String str) {
        Object[] objArr;
        Object obj = null;
        String b0 = str.endsWith("}") ? m2207b0(str) : null;
        String[] P1 = m2161P1(m2190W2(str));
        int length = P1.length;
        if (length > 3) {
            if (length > 4) {
                Object[] objArr2 = new Object[(length - 4)];
                for (int i = 4; i < length; i++) {
                    objArr2[i - 4] = m2136K0(P1[i]);
                }
                objArr = objArr2;
            } else {
                objArr = null;
            }
            Object K0 = m2136K0(P1[2]);
            try {
                obj = K0 instanceof Class ? C0832d.m1820e(this.f1815d, m2136K0(P1[1]), (Class) K0, m2140L0(P1[3]), objArr, b0 == null ? null : this, b0) : C0832d.m1821f(this.f1815d, m2136K0(P1[1]), K0.toString(), m2140L0(P1[3]), objArr, b0 == null ? null : this, b0);
            } catch (Throwable th) {
                th.printStackTrace();
                m2162P2(String.format("javaErr：\n第%s行,错误,但不终止:%s", Integer.valueOf(this.f1818g), str));
            }
            mo8981T(P1[0].trim(), obj);
        }
    }

    /* renamed from: z2 */
    private void m2325z2(String str) {
        String trim;
        Object string;
        int position;
        boolean moveToLast;
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        Object K0 = m2136K0(P1[0]);
        Object K02 = m2136K0(P1[1]);
        Cursor cursor = K0 instanceof Cursor ? (Cursor) K0 : null;
        if (length == 2) {
            if (K02.equals("re") && cursor != null) {
                cursor.close();
            }
        } else if (length != 3) {
        } else {
            if (K02 instanceof Integer) {
                mo8981T(P1[2].trim(), cursor.getString(Integer.parseInt(K02.toString())));
                return;
            }
            if (K02.equals("columncount")) {
                trim = P1[2].trim();
                position = cursor.getColumnCount();
            } else if (K02.equals("count")) {
                trim = P1[2].trim();
                position = cursor.getCount();
            } else {
                if (K02.equals("next")) {
                    trim = P1[2].trim();
                    moveToLast = cursor.moveToNext();
                } else if (K02.equals("previous")) {
                    trim = P1[2].trim();
                    moveToLast = cursor.moveToPrevious();
                } else if (K02.equals("first")) {
                    trim = P1[2].trim();
                    moveToLast = cursor.moveToFirst();
                } else if (K02.equals("last")) {
                    trim = P1[2].trim();
                    moveToLast = cursor.moveToLast();
                } else if (K02.equals("position")) {
                    cursor.moveToPosition(m2216d(m2136K0(P1[2]).toString()));
                    return;
                } else if (K02.equals("getposition")) {
                    trim = P1[2].trim();
                    position = cursor.getPosition();
                } else {
                    trim = P1[2].trim();
                    string = cursor.getString(m2216d(K02.toString()));
                    mo8981T(trim, string);
                }
                string = Boolean.valueOf(moveToLast);
                mo8981T(trim, string);
            }
            string = Integer.valueOf(position);
            mo8981T(trim, string);
        }
    }

    /* renamed from: z3 */
    private void m2326z3(String str) {
        int i = 0;
        if (!m2136K0(m2161P1(m2186V2(str))[0]).equals(Boolean.TRUE)) {
            i = 1;
            if (this.f1814c.getRequestedOrientation() == 1) {
                return;
            }
        } else if (this.f1814c.getRequestedOrientation() == 0) {
            return;
        }
        this.f1814c.setRequestedOrientation(i);
    }

    /* renamed from: G */
    public void mo8977G() {
        this.f1812a.clear();
    }

    /* renamed from: J1 */
    public void mo8978J1(String str, ViewGroup viewGroup, int i, Object obj) {
        Context context = this.f1815d;
        C0916b bVar = new C0916b(context);
        bVar.f1974a = 0;
        C0839h.m1888D(this, context, str, viewGroup, i, obj, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0060  */
    /* renamed from: K1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8979K1(java.lang.String r8, android.view.ViewGroup r9, int r10, java.lang.Object r11, p013b.p048c.p049a.C0916b r12) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.mo8979K1(java.lang.String, android.view.ViewGroup, int, java.lang.Object, b.c.a.b):void");
    }

    /* renamed from: Q0 */
    public String mo8980Q0(String str) {
        return C0839h.m1887C(this.f1815d, str);
    }

    /* renamed from: T */
    public void mo8981T(String str, Object obj) {
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
            if (substring.equals("ss")) {
                m2179U(str, obj, 1);
                return;
            } else if (substring.equals("sss")) {
                m2179U(str, obj, 2);
                return;
            }
        }
        this.f1812a.put(str, obj);
    }

    /* renamed from: X */
    public Object mo8982X(String str) {
        HashMap<String, Object> hashMap;
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String trim = str.substring(0, indexOf).trim();
            str = str.substring(indexOf + 1).trim();
            if (trim.equals("ss")) {
                hashMap = f1801k;
            } else if (trim.equals("sss")) {
                hashMap = f1800j;
            }
            return hashMap.get(str);
        }
        hashMap = this.f1812a;
        return hashMap.get(str);
    }

    /* renamed from: Z1 */
    public void mo8983Z1(ArrayList<Integer> arrayList, StringBuffer stringBuffer, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                mo8983Z1(arrayList, stringBuffer, viewGroup.getChildAt(i));
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

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x146f, code lost:
        if (r10.length() == 0) goto L_0x1471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x2046, code lost:
        if (m2194Y(r2, 0) != false) goto L_0x2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x204a, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x2061, code lost:
        if (m2194Y(r2, 1) != false) goto L_0x2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x2070, code lost:
        if (m2194Y(r2, 2) != false) goto L_0x2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x1552, code lost:
        if (r3[r2].startsWith("else") != false) goto L_0x1471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x157b, code lost:
        if (m2194Y(r2, r11) != false) goto L_0x157d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1225:0x2b22  */
    /* JADX WARNING: Removed duplicated region for block: B:1231:0x2afc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x147c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x1484  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8984e(java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 11060
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0864v.mo8984e(java.lang.String):int");
    }

    /* renamed from: f */
    public void mo8985f(String str) {
        if (str != null && str.trim().length() != 0) {
            mo8984e(str.replace("&lt;", "<").replace("&gt;", ">"));
        }
    }

    /* renamed from: w0 */
    public void mo8986w0(String str) {
        String lowerCase = str.substring(0, str.indexOf(40)).trim().toLowerCase();
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        HashMap<String, Object> hashMap = f1802l;
        Object obj = hashMap.get(lowerCase + length);
        if (obj == null) {
            String trim = str.substring(0, str.indexOf(46) + 1).trim();
            for (String str2 : f1802l.keySet()) {
                if (str2.toString().startsWith(trim)) {
                    return;
                }
            }
            m2209b2(trim + "myu");
            HashMap<String, Object> hashMap2 = f1802l;
            obj = hashMap2.get(lowerCase + length);
        }
        String obj2 = obj.toString();
        int indexOf = obj2.indexOf(10);
        String[] P12 = m2161P1(m2186V2(obj2.substring(0, indexOf)));
        if (length == P12.length) {
            C0864v vVar = this.f1819h;
            if (vVar == null) {
                this.f1819h = new C0864v(this.f1815d, this.f1814c);
            } else {
                vVar.mo8977G();
            }
            for (int i = 0; i < length; i++) {
                this.f1819h.mo8981T(P12[i].trim(), m2136K0(P1[i]));
            }
            this.f1819h.mo8984e(obj2.substring(indexOf).trim());
        }
    }

    /* renamed from: x0 */
    public void mo8987x0(String str, String str2, Object obj) {
        String lowerCase = str.substring(0, str.indexOf(40)).trim().toLowerCase();
        String[] P1 = m2161P1(m2186V2(str));
        int length = P1.length;
        HashMap<String, Object> hashMap = f1802l;
        Object obj2 = hashMap.get(lowerCase + length);
        if (obj2 == null) {
            String trim = str.substring(0, str.indexOf(46) + 1).trim();
            for (String str3 : f1802l.keySet()) {
                if (str3.toString().startsWith(trim)) {
                    return;
                }
            }
            m2209b2(trim + "myu");
            HashMap<String, Object> hashMap2 = f1802l;
            obj2 = hashMap2.get(lowerCase + length);
        }
        String obj3 = obj2.toString();
        int indexOf = obj3.indexOf(10);
        String[] P12 = m2161P1(m2186V2(obj3.substring(0, indexOf)));
        if (length == P12.length) {
            C0864v vVar = this.f1819h;
            if (vVar == null) {
                this.f1819h = new C0864v(this.f1815d, this.f1814c);
            } else {
                vVar.mo8977G();
            }
            for (int i = 0; i < length; i++) {
                this.f1819h.mo8981T(P12[i].trim(), m2136K0(P1[i]));
            }
            this.f1819h.mo8981T(str2, obj);
            this.f1819h.mo8984e(obj3.substring(indexOf).trim());
        }
    }
}
