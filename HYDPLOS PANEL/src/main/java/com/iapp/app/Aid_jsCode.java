package com.iapp.app;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import android.support.p009v4.app.ActionBarDrawerToggle;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.widget.DrawerLayout;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.Display;
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
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
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

@SuppressLint({"HandlerLeak"})
public class Aid_jsCode {
    public static AlertDialog alertdialog;

    /* renamed from: g */
    private static HashMap<String, Object> f2582g = new HashMap<>();

    /* renamed from: h */
    private static int f2583h = 0;
    public static HashMap<String, Object> ss_dim;
    public int TaskId = 0;

    /* renamed from: a */
    private HashMap<String, Object> f2584a = new HashMap<>();

    /* renamed from: b */
    private Activity f2585b = null;

    /* renamed from: c */
    private Context f2586c = null;

    /* renamed from: d */
    private WebView f2587d = null;

    /* renamed from: e */
    private long f2588e = 0;

    /* renamed from: f */
    private Handler f2589f = null;

    /* renamed from: com.iapp.app.Aid_jsCode$a */
    class DialogInterface$OnClickListenerC1136a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2590a;

        DialogInterface$OnClickListenerC1136a(String str) {
            this.f2590a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Aid_jsCode.this.m3191a(this.f2590a);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$a0  reason: invalid class name */
    class animationAnimation$AnimationListenerC1137a0 implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ String f2592a;

        /* renamed from: b */
        final /* synthetic */ String f2593b;

        /* renamed from: c */
        final /* synthetic */ String f2594c;

        animationAnimation$AnimationListenerC1137a0(String str, String str2, String str3) {
            this.f2592a = str;
            this.f2593b = str2;
            this.f2594c = str3;
        }

        public void onAnimationEnd(Animation animation) {
            String str = this.f2592a;
            if (str != null) {
                Aid_jsCode.this.m3191a(str);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            String str = this.f2593b;
            if (str != null) {
                Aid_jsCode.this.m3191a(str);
            }
        }

        public void onAnimationStart(Animation animation) {
            String str = this.f2594c;
            if (str != null) {
                Aid_jsCode.this.m3191a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$a1 */
    public class View$OnClickListenerC1138a1 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2596a;

        View$OnClickListenerC1138a1(String[] strArr) {
            this.f2596a = strArr;
        }

        public void onClick(View view) {
            int id = view.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2596a[0];
            aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$b */
    class DialogInterface$OnClickListenerC1139b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2598a;

        DialogInterface$OnClickListenerC1139b(String str) {
            this.f2598a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Aid_jsCode.this.m3191a(this.f2598a);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$b0 */
    class C1140b0 implements AbstractC0918a.AbstractC0919a {

        /* renamed from: a */
        final /* synthetic */ String f2600a;

        /* renamed from: b */
        final /* synthetic */ String f2601b;

        /* renamed from: c */
        final /* synthetic */ String f2602c;

        /* renamed from: d */
        final /* synthetic */ String f2603d;

        C1140b0(String str, String str2, String str3, String str4) {
            this.f2600a = str;
            this.f2601b = str2;
            this.f2602c = str3;
            this.f2603d = str4;
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            String str = this.f2600a;
            if (str != null) {
                Aid_jsCode.this.m3191a(str);
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: b */
        public void mo9122b(AbstractC0918a aVar) {
            String str = this.f2601b;
            if (str != null) {
                Aid_jsCode.this.m3191a(str);
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: c */
        public void mo9123c(AbstractC0918a aVar) {
            String str = this.f2602c;
            if (str != null) {
                Aid_jsCode.this.m3191a(str);
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: d */
        public void mo9124d(AbstractC0918a aVar) {
            String str = this.f2603d;
            if (str != null) {
                Aid_jsCode.this.m3191a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$b1 */
    public class View$OnTouchListenerC1141b1 implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2605a;

        View$OnTouchListenerC1141b1(String[] strArr) {
            this.f2605a = strArr;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2605a[0];
            aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + motionEvent.getAction() + ", " + motionEvent.getX() + ", " + motionEvent.getY() + ", " + motionEvent.getRawX() + ", " + motionEvent.getRawY());
            return false;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$c */
    class DialogInterface$OnClickListenerC1142c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2607a;

        DialogInterface$OnClickListenerC1142c(String str) {
            this.f2607a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Aid_jsCode.this.m3191a(this.f2607a);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$c0 */
    class RunnableC1143c0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2609a;

        RunnableC1143c0(View view) {
            this.f2609a = view;
        }

        public void run() {
            View view = this.f2609a;
            ((WindowManager) Aid_jsCode.this.f2586c.getApplicationContext().getSystemService("window")).updateViewLayout(view, view.getLayoutParams());
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$c1 */
    class RunnableC1144c1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2611a;

        /* renamed from: b */
        final /* synthetic */ int f2612b;

        /* renamed from: c */
        final /* synthetic */ String f2613c;

        /* renamed from: d */
        final /* synthetic */ Object f2614d;

        RunnableC1144c1(View view, int i, String str, Object obj) {
            this.f2611a = view;
            this.f2612b = i;
            this.f2613c = str;
            this.f2614d = obj;
        }

        public void run() {
            new C1305g(this.f2611a, Aid_jsCode.this.f2586c, this.f2612b).mo11843e0(this.f2613c, this.f2614d);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$d */
    class DialogInterface$OnClickListenerC1145d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2616a;

        DialogInterface$OnClickListenerC1145d(String str) {
            this.f2616a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Aid_jsCode.this.m3191a(this.f2616a);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$d0 */
    class RunnableC1146d0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2618a;

        RunnableC1146d0(View view) {
            this.f2618a = view;
        }

        public void run() {
            ((WindowManager) Aid_jsCode.this.f2586c.getApplicationContext().getSystemService("window")).removeView(this.f2618a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$d1 */
    public class View$OnLongClickListenerC1147d1 implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2620a;

        View$OnLongClickListenerC1147d1(String[] strArr) {
            this.f2620a = strArr;
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2620a[0];
            aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            return false;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$e */
    class DialogInterface$OnClickListenerC1148e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2622a;

        DialogInterface$OnClickListenerC1148e(String str) {
            this.f2622a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Aid_jsCode.this.m3191a(this.f2622a);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$e0 */
    class RunnableC1149e0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2624a;

        /* renamed from: b */
        final /* synthetic */ int f2625b;

        /* renamed from: c */
        final /* synthetic */ int f2626c;

        /* renamed from: d */
        final /* synthetic */ String f2627d;

        RunnableC1149e0(View view, int i, int i2, String str) {
            this.f2624a = view;
            this.f2625b = i;
            this.f2626c = i2;
            this.f2627d = str;
        }

        public void run() {
            C0862t.m2080e(Aid_jsCode.this.f2586c, this.f2624a, 0, 0, this.f2625b, this.f2626c, 0, C1305g.m3587t(this.f2627d), 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$e1 */
    public class View$OnKeyListenerC1150e1 implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2629a;

        View$OnKeyListenerC1150e1(String[] strArr) {
            this.f2629a = strArr;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2629a[0];
            aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount());
            return false;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$f */
    class RunnableC1151f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f2631a;

        RunnableC1151f(String str) {
            this.f2631a = str;
        }

        public void run() {
            Object x = Aid_jsCode.this.m3214x(this.f2631a);
            if (x instanceof C1195t1) {
                ((C1195t1) x).notifyDataSetChanged();
            } else if (x instanceof ArrayAdapter) {
                ((ArrayAdapter) x).notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$f0 */
    class RunnableC1152f0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WindowManager f2633a;

        /* renamed from: b */
        final /* synthetic */ View f2634b;

        /* renamed from: c */
        final /* synthetic */ WindowManager.LayoutParams f2635c;

        RunnableC1152f0(Aid_jsCode aid_jsCode, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
            this.f2633a = windowManager;
            this.f2634b = view;
            this.f2635c = layoutParams;
        }

        public void run() {
            this.f2633a.updateViewLayout(this.f2634b, this.f2635c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$f1 */
    public class C1153f1 implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2636a;

        C1153f1(String[] strArr) {
            this.f2636a = strArr;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            int id = textView.getId();
            if (keyEvent != null) {
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2636a[0];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount() + ", " + keyEvent.getKeyCode());
            } else {
                Aid_jsCode aid_jsCode2 = Aid_jsCode.this;
                String str2 = this.f2636a[0];
                aid_jsCode2.TheCallbackString(str2, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", null, null, null");
            }
            return false;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$g */
    class RunnableC1154g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Spinner f2638a;

        /* renamed from: b */
        final /* synthetic */ ArrayAdapter f2639b;

        RunnableC1154g(Aid_jsCode aid_jsCode, Spinner spinner, ArrayAdapter arrayAdapter) {
            this.f2638a = spinner;
            this.f2639b = arrayAdapter;
        }

        public void run() {
            this.f2638a.setAdapter((SpinnerAdapter) this.f2639b);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$g0 */
    class RunnableC1155g0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f2640a;

        RunnableC1155g0(String str) {
            this.f2640a = str;
        }

        public void run() {
            Toast.makeText(Aid_jsCode.this.f2586c, this.f2640a, 1).show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$g1 */
    public class C1156g1 implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ String[] f2642a;

        /* renamed from: b */
        final /* synthetic */ View f2643b;

        C1156g1(String[] strArr, View view) {
            this.f2642a = strArr;
            this.f2643b = view;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f2642a[2] != null) {
                int id = this.f2643b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2642a[2];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', '" + editable.toString() + "'");
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f2642a[1] != null) {
                int id = this.f2643b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2642a[1];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', '" + charSequence.toString() + "', " + i + ", " + i2 + ", " + i3);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f2642a[0] != null) {
                int id = this.f2643b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2642a[0];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', '" + charSequence.toString() + "', " + i + ", " + i2 + ", " + i3);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$h */
    class RunnableC1157h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Spinner f2645a;

        /* renamed from: b */
        final /* synthetic */ ArrayAdapter f2646b;

        RunnableC1157h(Aid_jsCode aid_jsCode, Spinner spinner, ArrayAdapter arrayAdapter) {
            this.f2645a = spinner;
            this.f2646b = arrayAdapter;
        }

        public void run() {
            this.f2645a.setAdapter((SpinnerAdapter) this.f2646b);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$h0 */
    class RunnableC1158h0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WindowManager f2647a;

        /* renamed from: b */
        final /* synthetic */ View f2648b;

        /* renamed from: c */
        final /* synthetic */ WindowManager.LayoutParams f2649c;

        RunnableC1158h0(Aid_jsCode aid_jsCode, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
            this.f2647a = windowManager;
            this.f2648b = view;
            this.f2649c = layoutParams;
        }

        public void run() {
            this.f2647a.updateViewLayout(this.f2648b, this.f2649c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$h1 */
    public class C1159h1 implements AbstractC1442a {

        /* renamed from: a */
        final /* synthetic */ View f2650a;

        /* renamed from: b */
        final /* synthetic */ String[] f2651b;

        C1159h1(View view, String[] strArr) {
            this.f2650a = view;
            this.f2651b = strArr;
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            int id = this.f2650a.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str5 = this.f2651b[0];
            aid_jsCode.TheCallbackString(str5, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', '" + str + "', '" + str2 + "', '" + str3 + "', '" + str4 + "', " + j);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$i */
    class RunnableC1160i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Spinner f2653a;

        /* renamed from: b */
        final /* synthetic */ ArrayAdapter f2654b;

        RunnableC1160i(Aid_jsCode aid_jsCode, Spinner spinner, ArrayAdapter arrayAdapter) {
            this.f2653a = spinner;
            this.f2654b = arrayAdapter;
        }

        public void run() {
            this.f2653a.setAdapter((SpinnerAdapter) this.f2654b);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$i0 */
    class RunnableC1161i0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2655a;

        /* renamed from: b */
        final /* synthetic */ int f2656b;

        /* renamed from: c */
        final /* synthetic */ int f2657c;

        /* renamed from: d */
        final /* synthetic */ int f2658d;

        /* renamed from: e */
        final /* synthetic */ int f2659e;

        /* renamed from: f */
        final /* synthetic */ int f2660f;

        /* renamed from: g */
        final /* synthetic */ String f2661g;

        /* renamed from: h */
        final /* synthetic */ int f2662h;

        /* renamed from: i */
        final /* synthetic */ int f2663i;

        RunnableC1161i0(View view, int i, int i2, int i3, int i4, int i5, String str, int i6, int i7) {
            this.f2655a = view;
            this.f2656b = i;
            this.f2657c = i2;
            this.f2658d = i3;
            this.f2659e = i4;
            this.f2660f = i5;
            this.f2661g = str;
            this.f2662h = i6;
            this.f2663i = i7;
        }

        public void run() {
            C0862t.m2080e(Aid_jsCode.this.f2586c, this.f2655a, this.f2656b, this.f2657c, this.f2658d, this.f2659e, this.f2660f, C1305g.m3587t(this.f2661g), this.f2662h, this.f2663i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$i1 */
    public class View$OnFocusChangeListenerC1162i1 implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2665a;

        View$OnFocusChangeListenerC1162i1(String[] strArr) {
            this.f2665a = strArr;
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2665a[0];
            aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + z);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$j */
    class RunnableC1163j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ListView f2667a;

        /* renamed from: b */
        final /* synthetic */ C1195t1 f2668b;

        RunnableC1163j(Aid_jsCode aid_jsCode, ListView listView, C1195t1 t1Var) {
            this.f2667a = listView;
            this.f2668b = t1Var;
        }

        public void run() {
            this.f2667a.setAdapter((ListAdapter) this.f2668b);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$j0 */
    class C1164j0 implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ String f2669a;

        C1164j0(String str) {
            this.f2669a = str;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2669a;
            aid_jsCode.TheCallbackString(str, "'" + Aid_jsCode.this.m3216z(obj) + "', '" + Aid_jsCode.this.m3184N("sot", cVar) + "'");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$j1 */
    public class C1165j1 implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2671a;

        C1165j1(String[] strArr) {
            this.f2671a = strArr;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.f2671a[1] != null) {
                int id = absListView.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2671a[1];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + i2 + ", " + i3);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (this.f2671a[0] != null) {
                int id = absListView.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2671a[0];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$k */
    class HandlerC1166k extends Handler {
        HandlerC1166k(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_jsCode.this.f2586c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                Aid_jsCode.this.m3191a(message.obj.toString());
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$k0 */
    class C1167k0 implements OnMessagesListener {

        /* renamed from: a */
        final /* synthetic */ String f2674a;

        C1167k0(String str) {
            this.f2674a = str;
        }

        @Override // com.iapp.interfaces.OnMessagesListener
        public void Message(Object obj, C0855q.C0858c cVar) {
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2674a;
            aid_jsCode.TheCallbackString(str, "'" + Aid_jsCode.this.m3216z(obj) + "', '" + Aid_jsCode.this.m3184N("sot", cVar) + "'");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$k1 */
    public class C1168k1 implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2676a;

        C1168k1(String[] strArr) {
            this.f2676a = strArr;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2676a[0];
            aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + j);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$l */
    class RunnableC1169l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GridView f2678a;

        /* renamed from: b */
        final /* synthetic */ C1195t1 f2679b;

        RunnableC1169l(Aid_jsCode aid_jsCode, GridView gridView, C1195t1 t1Var) {
            this.f2678a = gridView;
            this.f2679b = t1Var;
        }

        public void run() {
            this.f2678a.setAdapter((ListAdapter) this.f2679b);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$l0 */
    class C1170l0 extends WebChromeClient {
        C1170l0(Aid_jsCode aid_jsCode) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$l1 */
    public class C1171l1 implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2680a;

        C1171l1(String[] strArr) {
            this.f2680a = strArr;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f2680a[0] != null) {
                int id = adapterView.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2680a[0];
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(Aid_jsCode.this.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(main2.set("^onitemselected" + Aid_jsCode.this.TaskId + "st_vW2" + id, view));
                sb.append("', ");
                sb.append(i);
                sb.append(", ");
                sb.append(j);
                aid_jsCode.TheCallbackString(str, sb.toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (this.f2680a[1] != null) {
                int id = adapterView.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2680a[1];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$m */
    class RunnableC1172m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ListView f2682a;

        /* renamed from: b */
        final /* synthetic */ C1195t1 f2683b;

        RunnableC1172m(Aid_jsCode aid_jsCode, ListView listView, C1195t1 t1Var) {
            this.f2682a = listView;
            this.f2683b = t1Var;
        }

        public void run() {
            this.f2682a.setAdapter((ListAdapter) this.f2683b);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$m0 */
    class C1173m0 extends WebChromeClient {
        C1173m0(Aid_jsCode aid_jsCode) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0864v.m2157O2("JsErr：\nLine" + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$m1 */
    public class C1174m1 implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2684a;

        /* renamed from: b */
        final /* synthetic */ View f2685b;

        C1174m1(String[] strArr, View view) {
            this.f2684a = strArr;
            this.f2685b = view;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f2684a[2] != null) {
                int id = this.f2685b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2684a[2];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f2684a[1] != null) {
                int id = this.f2685b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2684a[1];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + f + ", " + i2);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f2684a[0] != null) {
                int id = this.f2685b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2684a[0];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$n */
    class RunnableC1175n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GridView f2687a;

        /* renamed from: b */
        final /* synthetic */ C1195t1 f2688b;

        RunnableC1175n(Aid_jsCode aid_jsCode, GridView gridView, C1195t1 t1Var) {
            this.f2687a = gridView;
            this.f2688b = t1Var;
        }

        public void run() {
            this.f2687a.setAdapter((ListAdapter) this.f2688b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$n0 */
    public class View$OnClickListenerC1176n0 implements View.OnClickListener {
        View$OnClickListenerC1176n0() {
        }

        public void onClick(View view) {
            int id = view.getId();
            Aid_jsCode.this.callMethod("clicki" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$n1 */
    class RunnableC1177n1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2690a;

        /* renamed from: b */
        final /* synthetic */ int f2691b;

        /* renamed from: c */
        final /* synthetic */ String f2692c;

        /* renamed from: d */
        final /* synthetic */ String f2693d;

        /* renamed from: e */
        final /* synthetic */ String f2694e;

        RunnableC1177n1(View view, int i, String str, String str2, String str3) {
            this.f2690a = view;
            this.f2691b = i;
            this.f2692c = str;
            this.f2693d = str2;
            this.f2694e = str3;
        }

        public void run() {
            new C1305g(this.f2690a, Aid_jsCode.this.f2586c, this.f2691b).mo11848f0(this.f2692c, this.f2693d, this.f2694e);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$o */
    class RunnableC1178o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f2696a;

        RunnableC1178o(boolean z) {
            this.f2696a = z;
        }

        public void run() {
            if (this.f2696a) {
                Aid_jsCode.this.f2585b.getWindow().clearFlags(2048);
                Aid_jsCode.this.f2585b.getWindow().setFlags(1024, 1024);
                return;
            }
            Aid_jsCode.this.f2585b.getWindow().addFlags(2048);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$o0 */
    public class View$OnTouchListenerC1179o0 implements View.OnTouchListener {
        View$OnTouchListenerC1179o0() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int id = view.getId();
            Aid_jsCode.this.callMethod("touchmonitor" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + motionEvent.getAction() + ", " + motionEvent.getX() + ", " + motionEvent.getY() + ", " + motionEvent.getRawX() + ", " + motionEvent.getRawY());
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$o1 */
    public class C1180o1 extends ActionBarDrawerToggle {

        /* renamed from: a */
        final /* synthetic */ String[] f2699a;

        /* renamed from: b */
        final /* synthetic */ View f2700b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1180o1(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3, String[] strArr, View view) {
            super(activity, drawerLayout, i, i2, i3);
            this.f2699a = strArr;
            this.f2700b = view;
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            if (this.f2699a[0] != null) {
                int id = this.f2700b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2699a[0];
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(Aid_jsCode.this.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(main2.set("^ondrawerclosed" + Aid_jsCode.this.TaskId + "st_dW" + id, view));
                sb.append("'");
                aid_jsCode.TheCallbackString(str, sb.toString());
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle, android.support.p009v4.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            if (this.f2699a[1] != null) {
                int id = this.f2700b.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2699a[1];
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(Aid_jsCode.this.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(main2.set("^ondraweropened" + Aid_jsCode.this.TaskId + "st_dW" + id, view));
                sb.append("'");
                aid_jsCode.TheCallbackString(str, sb.toString());
            }
        }

        @Override // android.support.p009v4.app.ActionBarDrawerToggle
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (this.f2699a[2] == null) {
                return false;
            }
            int id = this.f2700b.getId();
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2699a[2];
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            sb.append(", '^view");
            sb.append(Aid_jsCode.this.TaskId);
            sb.append("st_vW");
            sb.append(id);
            sb.append("', '");
            sb.append(main2.set("^onoptionsitemselected" + Aid_jsCode.this.TaskId + "st_iM" + id, menuItem));
            sb.append("'");
            aid_jsCode.TheCallbackString(str, sb.toString());
            return false;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$p */
    class RunnableC1181p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f2702a;

        /* renamed from: b */
        final /* synthetic */ boolean f2703b;

        RunnableC1181p(String str, boolean z) {
            this.f2702a = str;
            this.f2703b = z;
        }

        public void run() {
            C0862t.m2078c(Aid_jsCode.this.f2585b, C0860r.m2056o(this.f2702a), this.f2703b, Aid_jsCode.this.f2585b.findViewById(C0839h.f1737a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$p0 */
    public class View$OnLongClickListenerC1182p0 implements View.OnLongClickListener {
        View$OnLongClickListenerC1182p0() {
        }

        public boolean onLongClick(View view) {
            int id = view.getId();
            Aid_jsCode.this.callMethod("press" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$p1 */
    public class C1183p1 implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ String[] f2706a;

        C1183p1(String[] strArr) {
            this.f2706a = strArr;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.f2706a[2] != null) {
                int id = seekBar.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2706a[2];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + z);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (this.f2706a[1] != null) {
                int id = seekBar.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2706a[1];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f2706a[0] != null) {
                int id = seekBar.getId();
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String str = this.f2706a[0];
                aid_jsCode.TheCallbackString(str, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$q */
    class RunnableC1184q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f2708a;

        /* renamed from: b */
        final /* synthetic */ boolean f2709b;

        /* renamed from: c */
        final /* synthetic */ int f2710c;

        RunnableC1184q(String str, boolean z, int i) {
            this.f2708a = str;
            this.f2709b = z;
            this.f2710c = i;
        }

        public void run() {
            C0862t.m2079d(Aid_jsCode.this.f2585b, C0860r.m2056o(this.f2708a), this.f2709b, Aid_jsCode.this.f2585b.findViewById(C0839h.f1737a), this.f2710c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$q0 */
    public class View$OnKeyListenerC1185q0 implements View.OnKeyListener {
        View$OnKeyListenerC1185q0() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            int id = view.getId();
            Aid_jsCode.this.callMethod("keyboard" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount());
            return false;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$q1 */
    class RunnableC1186q1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2713a;

        /* renamed from: b */
        final /* synthetic */ int f2714b;

        /* renamed from: c */
        final /* synthetic */ String f2715c;

        /* renamed from: d */
        final /* synthetic */ String f2716d;

        /* renamed from: e */
        final /* synthetic */ String f2717e;

        /* renamed from: f */
        final /* synthetic */ String f2718f;

        RunnableC1186q1(View view, int i, String str, String str2, String str3, String str4) {
            this.f2713a = view;
            this.f2714b = i;
            this.f2715c = str;
            this.f2716d = str2;
            this.f2717e = str3;
            this.f2718f = str4;
        }

        public void run() {
            new C1305g(this.f2713a, Aid_jsCode.this.f2586c, this.f2714b).mo11852g0(this.f2715c, this.f2716d, this.f2717e, this.f2718f);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$r */
    class RunnableC1187r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2720a;

        /* renamed from: b */
        final /* synthetic */ View f2721b;

        RunnableC1187r(Aid_jsCode aid_jsCode, ViewGroup viewGroup, View view) {
            this.f2720a = viewGroup;
            this.f2721b = view;
        }

        public void run() {
            this.f2720a.addView(this.f2721b);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$r0 */
    class RunnableC1188r0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f2722a;

        /* renamed from: b */
        final /* synthetic */ int f2723b;

        RunnableC1188r0(String str, int i) {
            this.f2722a = str;
            this.f2723b = i;
        }

        public void run() {
            Toast.makeText(Aid_jsCode.this.f2586c, this.f2722a, this.f2723b).show();
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$r1 */
    class RunnableC1189r1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2725a;

        /* renamed from: b */
        final /* synthetic */ int f2726b;

        /* renamed from: c */
        final /* synthetic */ String f2727c;

        /* renamed from: d */
        final /* synthetic */ String f2728d;

        /* renamed from: e */
        final /* synthetic */ String f2729e;

        /* renamed from: f */
        final /* synthetic */ String f2730f;

        /* renamed from: g */
        final /* synthetic */ String f2731g;

        RunnableC1189r1(View view, int i, String str, String str2, String str3, String str4, String str5) {
            this.f2725a = view;
            this.f2726b = i;
            this.f2727c = str;
            this.f2728d = str2;
            this.f2729e = str3;
            this.f2730f = str4;
            this.f2731g = str5;
        }

        public void run() {
            new C1305g(this.f2725a, Aid_jsCode.this.f2586c, this.f2726b).mo11856h0(this.f2727c, this.f2728d, this.f2729e, this.f2730f, this.f2731g);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$s */
    class RunnableC1190s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2733a;

        /* renamed from: b */
        final /* synthetic */ View f2734b;

        /* renamed from: c */
        final /* synthetic */ int f2735c;

        RunnableC1190s(Aid_jsCode aid_jsCode, ViewGroup viewGroup, View view, int i) {
            this.f2733a = viewGroup;
            this.f2734b = view;
            this.f2735c = i;
        }

        public void run() {
            this.f2733a.addView(this.f2734b, this.f2735c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$s0 */
    public class View$OnCreateContextMenuListenerC1191s0 implements View.OnCreateContextMenuListener {
        View$OnCreateContextMenuListenerC1191s0() {
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
                Aid_jsCode.this.callMethod("onCreateContextMenu" + id + "x0", id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$s1 */
    class DialogInterface$OnClickListenerC1192s1 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f2737a;

        DialogInterface$OnClickListenerC1192s1(String str) {
            this.f2737a = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Aid_jsCode.this.m3191a(this.f2737a);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$t */
    class RunnableC1193t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2739a;

        /* renamed from: b */
        final /* synthetic */ View f2740b;

        RunnableC1193t(Aid_jsCode aid_jsCode, ViewGroup viewGroup, View view) {
            this.f2739a = viewGroup;
            this.f2740b = view;
        }

        public void run() {
            this.f2739a.addView(this.f2740b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$t0 */
    public class C1194t0 implements TextView.OnEditorActionListener {
        C1194t0() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            int id = textView.getId();
            if (keyEvent != null) {
                Aid_jsCode.this.callMethod("editormonitor" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + keyEvent.getAction() + ", " + keyEvent.getRepeatCount() + ", " + keyEvent.getKeyCode());
                return false;
            }
            Aid_jsCode.this.callMethod("editormonitor" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", null, null, null");
            return false;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$t1 */
    private class C1195t1 extends BaseAdapter {

        /* renamed from: a */
        private Context f2742a;

        /* renamed from: b */
        private C0844j f2743b;

        /* renamed from: c */
        private ArrayList<HashMap<Integer, Object>> f2744c = new ArrayList<>();

        /* renamed from: d */
        private String f2745d = null;

        /* renamed from: e */
        private WebView f2746e = null;

        /* renamed from: f */
        private int f2747f = 0;

        /* renamed from: g */
        private int f2748g;

        /* renamed from: h */
        private int f2749h = -1;

        /* renamed from: i */
        private int f2750i = -2;

        /* renamed from: j */
        private Iterator f2751j;

        /* renamed from: k */
        private LinearLayout f2752k;

        /* renamed from: l */
        private C1196a f2753l;

        /* renamed from: com.iapp.app.Aid_jsCode$t1$a */
        private final class C1196a {

            /* renamed from: a */
            public HashMap<Integer, View> f2755a;

            private C1196a(C1195t1 t1Var) {
                this.f2755a = new HashMap<>();
            }

            /* synthetic */ C1196a(C1195t1 t1Var, HandlerC1166k kVar) {
                this(t1Var);
            }
        }

        public C1195t1(Context context) {
            this.f2742a = context;
            this.f2743b = new C0844j(context, this, 1);
        }

        /* renamed from: a */
        public void mo11080a(HashMap<Integer, Object> hashMap) {
            this.f2744c.add(hashMap);
        }

        /* renamed from: b */
        public ArrayList<HashMap<Integer, Object>> mo11081b() {
            return this.f2744c;
        }

        /* renamed from: c */
        public void mo11082c(String str) {
            this.f2745d = str;
            this.f2747f = Aid_jsCode.this.m3203m(str.substring(0, str.length() - 4));
        }

        /* renamed from: d */
        public void mo11083d(int i, int i2) {
            this.f2749h = i;
            this.f2750i = i2;
        }

        public int getCount() {
            return this.f2744c.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                this.f2753l = new C1196a(this, null);
                LinearLayout linearLayout = new LinearLayout(this.f2742a);
                this.f2752k = linearLayout;
                linearLayout.setLayoutParams(new AbsListView.LayoutParams(this.f2749h, this.f2750i));
                this.f2752k.setOrientation(1);
                this.f2746e = Aid_jsCode.this.m3181K(this.f2745d, this.f2752k, this.f2747f, this.f2744c.get(i));
                this.f2751j = this.f2744c.get(i).keySet().iterator();
                while (this.f2751j.hasNext()) {
                    int parseInt = Integer.parseInt(String.valueOf(this.f2751j.next()));
                    this.f2748g = parseInt;
                    if (parseInt > 0) {
                        this.f2753l.f2755a.put(Integer.valueOf(parseInt), this.f2752k.findViewById(this.f2748g + this.f2747f));
                    }
                }
                view = this.f2752k;
                view.setTag(this.f2753l);
            } else {
                this.f2753l = (C1196a) view.getTag();
            }
            this.f2751j = this.f2744c.get(i).keySet().iterator();
            while (this.f2751j.hasNext()) {
                int parseInt2 = Integer.parseInt(String.valueOf(this.f2751j.next()));
                this.f2748g = parseInt2;
                if (parseInt2 > 0) {
                    C0839h.m1914w(this.f2753l.f2755a.get(Integer.valueOf(parseInt2)), this.f2744c.get(i).get(Integer.valueOf(this.f2748g)), this.f2744c.get(i), this.f2743b);
                }
            }
            WebView webView = this.f2746e;
            if (webView != null) {
                Aid_jsCode.this.m3205o(webView, "loading");
            }
            return view;
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$u */
    class RunnableC1197u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2756a;

        /* renamed from: b */
        final /* synthetic */ View f2757b;

        RunnableC1197u(Aid_jsCode aid_jsCode, ViewGroup viewGroup, View view) {
            this.f2756a = viewGroup;
            this.f2757b = view;
        }

        public void run() {
            this.f2756a.removeView(this.f2757b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$u0 */
    public class View$OnFocusChangeListenerC1198u0 implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1198u0() {
        }

        public void onFocusChange(View view, boolean z) {
            int id = view.getId();
            Aid_jsCode.this.callMethod("focuschange" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + z);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$v */
    class HandlerC1199v extends Handler {
        HandlerC1199v(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(Aid_jsCode.this.f2586c, message.obj.toString(), 1).show();
            } else if (i == 2) {
                Aid_jsCode.this.m3191a(message.obj.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$v0 */
    public class C1200v0 implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2760a;

        /* renamed from: b */
        final /* synthetic */ boolean f2761b;

        C1200v0(boolean z, boolean z2) {
            this.f2760a = z;
            this.f2761b = z2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.f2761b) {
                int id = absListView.getId();
                Aid_jsCode.this.callMethod("onscroll" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + i2 + ", " + i3);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (this.f2760a) {
                int id = absListView.getId();
                Aid_jsCode.this.callMethod("onscrollstatechanged" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i);
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$w */
    class RunnableC1201w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewPager f2763a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2764b;

        RunnableC1201w(Aid_jsCode aid_jsCode, ViewPager viewPager, ArrayList arrayList) {
            this.f2763a = viewPager;
            this.f2764b = arrayList;
        }

        public void run() {
            new C1437s(this.f2763a, this.f2764b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$w0 */
    public class C1202w0 implements AdapterView.OnItemClickListener {
        C1202w0() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int id = adapterView.getId();
            Aid_jsCode.this.callMethod("clickitem" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + j);
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$x */
    class RunnableC1203x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f2766a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2767b;

        RunnableC1203x(String str, ViewGroup viewGroup) {
            this.f2766a = str;
            this.f2767b = viewGroup;
        }

        public void run() {
            Aid_jsCode aid_jsCode = Aid_jsCode.this;
            String str = this.f2766a;
            aid_jsCode.m3181K(str, this.f2767b, aid_jsCode.m3203m(str.substring(0, str.length() - 5)), null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$x0 */
    public class C1204x0 implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2769a;

        /* renamed from: b */
        final /* synthetic */ boolean f2770b;

        C1204x0(boolean z, boolean z2) {
            this.f2769a = z;
            this.f2770b = z2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f2769a) {
                int id = adapterView.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                sb.append(", '^view");
                sb.append(Aid_jsCode.this.TaskId);
                sb.append("st_vW");
                sb.append(id);
                sb.append("', '");
                sb.append(main2.set("^onitemselected" + Aid_jsCode.this.TaskId + "st_vW2" + id, view));
                sb.append("', ");
                sb.append(i);
                sb.append(", ");
                sb.append(j);
                Aid_jsCode.this.callMethod("onitemselected" + id, sb.toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (this.f2770b) {
                int id = adapterView.getId();
                Aid_jsCode.this.callMethod("onnothingselected" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$y */
    public class C1205y implements OnFileDownStatusListener {
        C1205y() {
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void complete(int i, Object obj) {
            if (obj != null) {
                Aid_jsCode.this.TheCallbackString(obj.toString(), String.valueOf(i));
            }
        }

        @Override // com.iapp.interfaces.OnFileDownStatusListener
        public void resultStatus(int i, int i2, Object obj) {
            if (obj != null) {
                Aid_jsCode aid_jsCode = Aid_jsCode.this;
                String obj2 = obj.toString();
                aid_jsCode.TheCallbackString(obj2, i + "," + i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$y0 */
    public class C1206y0 implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f2773a;

        /* renamed from: b */
        final /* synthetic */ boolean f2774b;

        /* renamed from: c */
        final /* synthetic */ boolean f2775c;

        C1206y0(boolean z, boolean z2, boolean z3) {
            this.f2773a = z;
            this.f2774b = z2;
            this.f2775c = z3;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.f2775c) {
                int id = seekBar.getId();
                Aid_jsCode.this.callMethod("onprogresschanged2" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "', " + i + ", " + z);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (this.f2774b) {
                int id = seekBar.getId();
                Aid_jsCode.this.callMethod("onstarttrackingtouch" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f2773a) {
                int id = seekBar.getId();
                Aid_jsCode.this.callMethod("onstoptrackingtouch" + id, id + ", '^view" + Aid_jsCode.this.TaskId + "st_vW" + id + "'");
            }
        }
    }

    /* renamed from: com.iapp.app.Aid_jsCode$z */
    class C1207z extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f2777a;

        C1207z(String str) {
            this.f2777a = str;
        }

        public void run() {
            Aid_jsCode.this.m3191a(this.f2777a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.Aid_jsCode$z0 */
    public class C1208z0 implements AbstractC1442a {
        C1208z0(Aid_jsCode aid_jsCode) {
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

    public Aid_jsCode(Activity activity, WebView webView, int i) {
        this.f2586c = activity;
        this.f2585b = activity;
        this.f2587d = webView;
        this.TaskId = i;
        this.f2589f = new HandlerC1166k(activity.getMainLooper());
    }

    public Aid_jsCode(Context context, Activity activity, WebView webView, int i) {
        this.f2586c = context;
        this.f2585b = activity;
        this.f2587d = webView;
        this.TaskId = i;
        this.f2589f = new HandlerC1199v(context.getMainLooper());
    }

    /* renamed from: A */
    private int m3171A() {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return this.f2586c.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: B */
    private int m3172B() {
        int identifier = this.f2586c.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f2586c.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: C */
    private String m3173C(String str) {
        return C0839h.m1906o(this.f2586c, str);
    }

    /* renamed from: D */
    private GradientDrawable.Orientation m3174D(String str) {
        return str.equals("topbottom") ? GradientDrawable.Orientation.TOP_BOTTOM : str.equals("trbl") ? GradientDrawable.Orientation.TR_BL : str.equals("rightleft") ? GradientDrawable.Orientation.RIGHT_LEFT : str.equals("brtl") ? GradientDrawable.Orientation.BR_TL : str.equals("bottomtop") ? GradientDrawable.Orientation.BOTTOM_TOP : str.equals("bltr") ? GradientDrawable.Orientation.BL_TR : str.equals("leftright") ? GradientDrawable.Orientation.LEFT_RIGHT : str.equals("tlbr") ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TOP_BOTTOM;
    }

    /* renamed from: E */
    private String m3175E(String str) {
        String c;
        String c2;
        Intent launchIntentForPackage = this.f2586c.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null || (c = C0860r.m2044c(launchIntentForPackage.toString(), "cmp=", " ")) == null || (c2 = C0860r.m2044c(c, "/", null)) == null) {
            return "";
        }
        if (!c2.startsWith(".")) {
            return c2;
        }
        return str + c2;
    }

    /* renamed from: F */
    private String[] m3176F(String str) {
        if (str == null) {
            return null;
        }
        return C0861s.m2071d(str, "\n\\\r");
    }

    /* renamed from: G */
    private Object[] m3177G(String str) {
        if (str == null) {
            return null;
        }
        String[] d = C0861s.m2071d(str, "\n\\\r");
        int length = d.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = m3214x(d[i]);
        }
        return objArr;
    }

    /* renamed from: H */
    private void m3178H(C0836g gVar, String str, String str2) {
        if (gVar != null) {
            gVar.f1731j = str;
            gVar.f1732k = str2;
            gVar.mo8932s(new C1205y());
        }
    }

    /* renamed from: I */
    private String m3179I(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        return ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) ? String.valueOf(obj) : m3184N(str, obj);
    }

    /* renamed from: J */
    private void m3180J(File file) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        C0851m.m1975a(this.f2586c, intent, file, C0860r.m2057p(file));
        this.f2586c.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: K */
    private WebView m3181K(String str, ViewGroup viewGroup, int i, Object obj) {
        WebView b = C1295c.m3507b(this.f2586c, this.f2585b, 0);
        StringBuffer stringBuffer = new StringBuffer();
        Context context = this.f2586c;
        C0916b bVar = new C0916b(context);
        bVar.f1974a = 0;
        C0839h.m1908q(this, context, str, viewGroup, i, obj, bVar, stringBuffer, b);
        String C = C0839h.m1887C(this.f2586c, str);
        if (C != null) {
            stringBuffer.append("function loading()\n");
            stringBuffer.append(C);
            stringBuffer.append("\nend\n");
        }
        C1295c.m3508c(this.f2586c, b, stringBuffer.toString());
        if (C == null) {
            return null;
        }
        return b;
    }

    @TargetApi(11)
    /* renamed from: L */
    private void m3182L(com.iapp.app.p067x5.WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    /* renamed from: M */
    private String m3183M(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        if (length > 0) {
            stringBuffer.append(objArr[0]);
        }
        if (length > 1) {
            for (int i = 1; i < length; i++) {
                stringBuffer.append("\n\\\r");
                stringBuffer.append(objArr[i]);
            }
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: N */
    private String m3184N(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f2588e++;
        StringBuffer stringBuffer = new StringBuffer("^_");
        stringBuffer.append(str);
        stringBuffer.append(this.TaskId);
        stringBuffer.append('_');
        stringBuffer.append(this.f2588e);
        return main2.set(stringBuffer.toString(), obj);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: O */
    private void m3185O(com.iapp.app.p067x5.WebView webView, String str, StringBuffer stringBuffer, WebView webView2) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(this.f2586c.getApplicationContext().getDir("cache", 0).getPath());
        webView.getSettings().setAppCacheMaxSize(8388608);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(this.f2586c.getApplicationContext().getDir("database", 0).getPath());
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
            new C1325l(webView, webView2, this.TaskId);
        } else {
            webView.setDownloadListener(new C1208z0(this));
        }
        new C1443b().mo12143d(webView, str, stringBuffer, this.f2585b, this);
        m3182L(webView);
    }

    /* renamed from: P */
    private void m3186P(String str) {
        C0839h.m1891G(this.f2586c, str);
    }

    /* renamed from: Q */
    private String[] m3187Q(String str, char c) {
        return C0861s.m2069b(str, c);
    }

    /* renamed from: R */
    private String m3188R(String str) {
        return str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
    }

    /* renamed from: S */
    private void m3189S(Camera camera) {
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

    /* renamed from: T */
    private void m3190T(Camera camera) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        if (camera != null && (parameters = camera.getParameters()) != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !"torch".equals(parameters.getFlashMode()) && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            camera.setParameters(parameters);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m3191a(String str) {
        WebView webView = this.f2587d;
        webView.loadUrl("javascript:{\nvar functionItme = " + str + ";\nfunctionItme();\n}");
    }

    public static void degclear() {
        C0864v.f1800j.clear();
        f2582g.clear();
        f2583h = 0;
    }

    /* renamed from: k */
    private void m3201k(View view, int i, String str, StringBuffer stringBuffer, WebView webView) {
        main2.set("^view" + this.TaskId + "st_vW" + i, view);
        if (addViewEventItme(stringBuffer, str, i, "clicki", "st_vId,st_vW")) {
            view.setOnClickListener(new View$OnClickListenerC1176n0());
        }
        if (addViewEventItme(stringBuffer, str, i, "touchmonitor", "st_vId,st_vW,st_eA,st_eX,st_eY,st_rX,st_rY")) {
            view.setOnTouchListener(new View$OnTouchListenerC1179o0());
        }
        if (addViewEventItme(stringBuffer, str, i, "press", "st_vId,st_vW")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1182p0());
        }
        if (addViewEventItme(stringBuffer, str, i, "keyboard", "st_vId,st_vW,st_kC,st_eA,st_eR,st_eT")) {
            view.setOnKeyListener(new View$OnKeyListenerC1185q0());
        }
        if (str.contains("<eventItme type=\"pressmenu\">")) {
            String c = C0860r.m2044c(str, "<eventItme type=\"pressmenu\">", "</eventItme>");
            String[] split = c.split("\ncase ");
            for (int i2 = 1; i2 < split.length; i2++) {
                stringBuffer.append("function onCreateContextMenu" + i + "x" + i2 + "(){\n" + C0860r.m2044c(split[i2], ":", "\nbreak") + "\n}\n");
            }
            String c2 = C0860r.m2044c(c, "\ndefault:", "\nbreak");
            if (c2 != null) {
                stringBuffer.append("function onCreateContextMenu" + i + "x0(st_vId,st_vW){\n" + c2 + "\n}\n");
            }
            view.setOnCreateContextMenuListener(new View$OnCreateContextMenuListenerC1191s0());
        }
        if (view instanceof TextView) {
            if (addViewEventItme(stringBuffer, str, i, "editormonitor", "st_vId,st_vW,st_aI,st_eA,st_eR,st_eK,st_eT")) {
                ((TextView) view).setOnEditorActionListener(new C1194t0());
            }
            boolean addViewEventItme = addViewEventItme(stringBuffer, str, i, "ontextchanged", "st_vId,st_vW,st_sS,st_sT,st_bE,st_cT");
            boolean addViewEventItme2 = addViewEventItme(stringBuffer, str, i, "beforetextchanged", "st_vId,st_vW,st_sS,st_sT,st_cT,st_aR");
            boolean addViewEventItme3 = addViewEventItme(stringBuffer, str, i, "aftertextchanged", "st_vId,st_vW,st_sS");
            if (addViewEventItme || addViewEventItme2 || addViewEventItme3) {
                WebView webView2 = this.f2587d;
                new C1355r((TextView) view, webView2, "^view" + this.TaskId + "st_vW" + i, addViewEventItme, addViewEventItme2, addViewEventItme3);
            }
        }
        if (view instanceof com.iapp.app.p067x5.WebView) {
            m3185O((com.iapp.app.p067x5.WebView) view, str, stringBuffer, webView);
        }
        if (addViewEventItme(stringBuffer, str, i, "focuschange", "st_vId,st_vW,st_hF")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1198u0());
        }
        if (view instanceof AbsListView) {
            boolean addViewEventItme4 = addViewEventItme(stringBuffer, str, i, "onscrollstatechanged", "st_vId,st_vW,st_sE");
            boolean addViewEventItme5 = addViewEventItme(stringBuffer, str, i, "onscroll", "st_vId,st_vW,st_fM,st_vT,st_bT");
            if (addViewEventItme4 || addViewEventItme5) {
                ((AbsListView) view).setOnScrollListener(new C1200v0(addViewEventItme4, addViewEventItme5));
            }
        }
        if (view instanceof AdapterView) {
            if (addViewEventItme(stringBuffer, str, i, "clickitem", "st_vId,st_vW,st_pN,st_iD,st_vW2")) {
                ((AdapterView) view).setOnItemClickListener(new C1202w0());
            }
            boolean addViewEventItme6 = addViewEventItme(stringBuffer, str, i, "onitemselected", "st_vId,st_vW,st_vW2,st_pN,st_iD");
            boolean addViewEventItme7 = addViewEventItme(stringBuffer, str, i, "onnothingselected", "st_vId,st_vW");
            if (addViewEventItme6 || addViewEventItme7) {
                ((AdapterView) view).setOnItemSelectedListener(new C1204x0(addViewEventItme6, addViewEventItme7));
            }
        }
        if (view instanceof ViewPager) {
            boolean addViewEventItme8 = addViewEventItme(stringBuffer, str, i, "onpageselected", "st_vId,st_vW,st_pN");
            boolean addViewEventItme9 = addViewEventItme(stringBuffer, str, i, "onpagescrolled", "st_vId,st_vW,st_pN,st_pT,st_pS");
            boolean addViewEventItme10 = addViewEventItme(stringBuffer, str, i, "onpagescrollstatechanged", "st_vId,st_vW,st_sE");
            if (addViewEventItme8 || addViewEventItme9 || addViewEventItme10) {
                WebView webView3 = this.f2587d;
                new C1343o((ViewPager) view, webView3, "^view" + this.TaskId + "st_vW" + i, addViewEventItme8, addViewEventItme9, addViewEventItme10);
            }
        }
        if (view instanceof DrawerLayout) {
            boolean addViewEventItme11 = addViewEventItme(stringBuffer, str, i, "ondrawerclosed", "st_vId,st_vW,st_dW");
            boolean addViewEventItme12 = addViewEventItme(stringBuffer, str, i, "ondraweropened", "st_vId,st_vW,st_dW");
            boolean addViewEventItme13 = addViewEventItme(stringBuffer, str, i, "onoptionsitemselected", "st_vId,st_vW,st_iM");
            if (addViewEventItme11 || addViewEventItme12 || addViewEventItme13) {
                WebView webView4 = this.f2587d;
                new C1334m((DrawerLayout) view, webView4, "^view" + this.TaskId + "st_vW" + i, this.TaskId, addViewEventItme11, addViewEventItme12, addViewEventItme13);
            }
        }
        if (!(view instanceof SeekBar)) {
            return;
        }
        if (str.contains("<eventItme type=\"onstarttrackingtouch\">") || str.contains("<eventItme type=\"onstoptrackingtouch\">") || str.contains("<eventItme type=\"onprogresschanged2\">")) {
            boolean addViewEventItme14 = addViewEventItme(stringBuffer, str, i, "onstarttrackingtouch", "st_vId,st_vW");
            boolean addViewEventItme15 = addViewEventItme(stringBuffer, str, i, "onstoptrackingtouch", "st_vId,st_vW");
            boolean addViewEventItme16 = addViewEventItme(stringBuffer, str, i, "onprogresschanged2", "st_vId,st_vW,st_nS,st_fR");
            if (addViewEventItme14 || addViewEventItme15 || addViewEventItme16) {
                ((SeekBar) view).setOnSeekBarChangeListener(new C1206y0(addViewEventItme15, addViewEventItme14, addViewEventItme16));
            }
        }
    }

    /* renamed from: l */
    private void m3202l(View view, String str, String[] strArr) {
        main2.set("^view" + this.TaskId + "st_vW" + view.getId(), view);
        if (str.equals("clicki")) {
            view.setOnClickListener(new View$OnClickListenerC1138a1(strArr));
        } else if (str.equals("touchmonitor")) {
            view.setOnTouchListener(new View$OnTouchListenerC1141b1(strArr));
        } else if (str.equals("press")) {
            view.setOnLongClickListener(new View$OnLongClickListenerC1147d1(strArr));
        } else if (str.equals("keyboard")) {
            view.setOnKeyListener(new View$OnKeyListenerC1150e1(strArr));
        } else if (str.equals("editormonitor")) {
            ((TextView) view).setOnEditorActionListener(new C1153f1(strArr));
        } else if (str.equals("addtextchanged")) {
            ((TextView) view).addTextChangedListener(new C1156g1(strArr, view));
        } else if (str.equals("ondownloadstart")) {
            ((com.iapp.app.p067x5.WebView) view).setDownloadListener(new C1159h1(view, strArr));
        } else if (str.equals("webviewclient")) {
            new C1443b().mo12144e(view, strArr, this);
        } else if (str.equals("focuschange")) {
            view.setOnFocusChangeListener(new View$OnFocusChangeListenerC1162i1(strArr));
        } else if (str.equals("onscroll")) {
            ((AbsListView) view).setOnScrollListener(new C1165j1(strArr));
        } else if (str.equals("clickitem")) {
            ((AdapterView) view).setOnItemClickListener(new C1168k1(strArr));
        } else if (str.equals("onitemselected")) {
            ((AdapterView) view).setOnItemSelectedListener(new C1171l1(strArr));
        } else if (str.equals("onpagechange")) {
            ((ViewPager) view).setOnPageChangeListener(new C1174m1(strArr, view));
        } else if (str.equals("ondrawer")) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            Activity activity = this.f2585b;
            int i = C0839h.f1738b;
            int i2 = C0839h.f1739c;
            drawerLayout.setDrawerListener(new C1180o1(activity, drawerLayout, i, i2, i2, strArr, view));
        } else if (str.equals("onseekbarchange")) {
            ((SeekBar) view).setOnSeekBarChangeListener(new C1183p1(strArr));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private synchronized int m3203m(String str) {
        Object obj = f2582g.get(str);
        if (obj != null) {
            return Integer.parseInt(obj.toString());
        }
        int i = f2583h + 10000;
        f2583h = i;
        f2582g.put(str, Integer.valueOf(i));
        return f2583h;
    }

    /* renamed from: n */
    private byte[] m3204n(String str, char c) {
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

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private void m3205o(WebView webView, String str) {
        webView.loadUrl("javascript:" + str + "()");
    }

    /* renamed from: p */
    private void m3206p(String str, Object obj, int i) {
        HashMap<String, Object> hashMap;
        if (!str.equals("null")) {
            if (i == 0) {
                hashMap = this.f2584a;
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

    /* renamed from: q */
    private View m3207q(View view, Object obj, String str) {
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
            Object obj2 = f2582g.get(substring);
            if (obj2 == null) {
                return null;
            }
            return view.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2582g.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return view.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: r */
    private View m3208r(Object obj, String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(46);
        if (indexOf == -1 || trim.indexOf(34) != -1) {
            String valueOf = String.valueOf(obj);
            int indexOf2 = valueOf.indexOf(46);
            if (indexOf2 == -1) {
                return this.f2585b.findViewById(Integer.parseInt(valueOf));
            }
            String substring = valueOf.substring(0, indexOf2);
            String substring2 = valueOf.substring(indexOf2 + 1);
            Object obj2 = f2582g.get(substring);
            if (obj2 == null) {
                return null;
            }
            return this.f2585b.findViewById(Integer.parseInt(String.valueOf(obj2)) + Integer.parseInt(substring2));
        }
        String substring3 = trim.substring(0, indexOf);
        String substring4 = trim.substring(indexOf + 1);
        Object obj3 = f2582g.get(substring3);
        if (obj3 == null) {
            return null;
        }
        return this.f2585b.findViewById(Integer.parseInt(String.valueOf(obj3)) + Integer.parseInt(substring4));
    }

    /* renamed from: s */
    private int m3209s() {
        try {
            Display defaultDisplay = this.f2585b.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return displayMetrics.heightPixels - displayMetrics2.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: t */
    private String[] m3210t() {
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

    /* renamed from: u */
    private int[] m3211u() {
        return new int[]{this.f2585b.getWindowManager().getDefaultDisplay().getWidth(), this.f2585b.getWindowManager().getDefaultDisplay().getHeight()};
    }

    /* renamed from: v */
    private int[] m3212v() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: w */
    private String[] m3213w() {
        return new String[]{Build.MODEL, Build.BRAND, String.valueOf(Build.VERSION.SDK_INT)};
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: x */
    private Object m3214x(String str) {
        if (str == null) {
            return null;
        }
        return str.equals("^_activity_") ? this.f2586c : str.startsWith("^") ? main2.get(str) : str;
    }

    /* renamed from: y */
    private String m3215y(Object obj) {
        return ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) ? obj.toString() : m3184N("sss", obj);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z */
    private String m3216z(Object obj) {
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

    public void TheCallbackString(String str, String str2) {
        WebView webView = this.f2587d;
        webView.loadUrl("javascript:{\nvar functionItme = " + str + ";\nfunctionItme(" + str2 + ");\n}");
    }

    public boolean addViewEventItme(StringBuffer stringBuffer, String str, int i, String str2, String str3) {
        if (!str.contains("<eventItme type=\"" + str2 + "\">")) {
            return false;
        }
        String c = C0860r.m2044c(str, "<eventItme type=\"" + str2 + "\">", "</eventItme>");
        if (c == null) {
            return false;
        }
        stringBuffer.append("function " + str2 + i + "(" + str3 + "){\n" + c + "\n}\n");
        return true;
    }

    @JavascriptInterface
    public String addv(String str, String str2) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null) {
            if (r instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) r;
                ArrayList arrayList = new ArrayList();
                String[] Q = m3187Q(str2, '|');
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                for (String str3 : Q) {
                    String trim = str3.trim();
                    if (trim.endsWith(".ijs")) {
                        LinearLayout linearLayout = new LinearLayout(this.f2586c);
                        linearLayout.setLayoutParams(layoutParams);
                        linearLayout.setOrientation(1);
                        m3181K(trim, linearLayout, m3203m(trim.substring(0, trim.length() - 5)), null);
                        arrayList.add(linearLayout);
                    }
                }
                this.f2589f.post(new RunnableC1201w(this, viewPager, arrayList));
                return m3184N("addv", arrayList);
            } else if ((r instanceof DrawerLayout) || (r instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) r;
                for (String str4 : m3187Q(str2, '|')) {
                    String trim2 = str4.trim();
                    if (trim2.endsWith(".ijs")) {
                        this.f2589f.post(new RunnableC1203x(trim2, viewGroup));
                    }
                }
            }
        }
        return null;
    }

    @JavascriptInterface
    public String aslist(String str, String str2) {
        Object x = m3214x(str);
        ArrayList arrayList = x == null ? new ArrayList() : (ArrayList) x;
        String[] F = m3176F(str2);
        if (F != null) {
            for (String str3 : F) {
                arrayList.add(str3);
            }
        }
        return (str == null || !str.startsWith("^")) ? m3184N("aslist", arrayList) : main2.set(str, arrayList);
    }

    @JavascriptInterface
    public String aslist(String str, String str2, int i) {
        Object x = m3214x(str);
        ArrayList arrayList = x == null ? new ArrayList() : (ArrayList) x;
        String[] F = m3176F(str2);
        if (F != null) {
            for (String str3 : F) {
                arrayList.add(i, str3);
            }
        }
        return (str == null || !str.startsWith("^")) ? m3184N("aslist", arrayList) : main2.set(str, arrayList);
    }

    @JavascriptInterface
    public String bfm(String str) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (!C0839h.m1895d(this.f2586c, mediaPlayer, str)) {
            return null;
        }
        return m3184N("bfm", mediaPlayer);
    }

    @JavascriptInterface
    public String bfms(String str, String str2) {
        Object x = m3214x(str);
        if (!(x instanceof MediaPlayer)) {
            return null;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) x;
        if (str2 == null) {
            return null;
        }
        if (str2.equals("st")) {
            try {
                mediaPlayer.start();
                return null;
            } catch (IllegalStateException unused) {
                return null;
            }
        } else if (str2.equals("pe")) {
            mediaPlayer.pause();
            return null;
        } else if (str2.equals("sp")) {
            mediaPlayer.stop();
            return null;
        } else if (str2.equals("re")) {
            mediaPlayer.release();
            return null;
        } else if (str2.equals("ip")) {
            try {
                return String.valueOf(mediaPlayer.isPlaying());
            } catch (IllegalStateException unused2) {
                return String.valueOf(false);
            }
        } else if (str2.equals("dn")) {
            return String.valueOf(mediaPlayer.getDuration());
        } else {
            if (str2.equals("cn")) {
                return String.valueOf(mediaPlayer.getCurrentPosition());
            }
            try {
                mediaPlayer.stop();
                mediaPlayer.reset();
            } catch (Exception unused3) {
            }
            C0839h.m1895d(this.f2586c, mediaPlayer, str2);
            return null;
        }
    }

    @JavascriptInterface
    public String bfms(String str, String str2, int i, int i2) {
        Object x = m3214x(str);
        if (!(x instanceof MediaPlayer)) {
            return null;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) x;
        if (str2 == null || !str2.equals("volume")) {
            return null;
        }
        mediaPlayer.setVolume((float) i, (float) i2);
        return null;
    }

    @JavascriptInterface
    public String bfms(String str, String str2, String str3) {
        Object x = m3214x(str);
        if (!(x instanceof MediaPlayer)) {
            return null;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) x;
        if (str2 == null) {
            return null;
        }
        if (str2.equals("seekto")) {
            mediaPlayer.seekTo(Integer.parseInt(str3));
            return null;
        } else if (!str2.equals("sl")) {
            return null;
        } else {
            mediaPlayer.setLooping(str3.equals("true"));
            return null;
        }
    }

    @JavascriptInterface
    public void bfs(String str, int i, String str2) {
        Object x = m3214x(str);
        if (x instanceof Bitmap) {
            C0849k.m1968h((Bitmap) x, i, m3173C(str2));
        }
    }

    @JavascriptInterface
    public void bfs(String str, String str2) {
        Object x = m3214x(str);
        if (x instanceof Bitmap) {
            C0849k.m1968h((Bitmap) x, 100, m3173C(str2));
        }
    }

    @JavascriptInterface
    public void bfv(String str) {
        Intent intent = new Intent(this.f2586c, Videoview.class);
        Bundle bundle = new Bundle();
        bundle.putString("video", str);
        bundle.putBoolean("sfhp", false);
        intent.putExtras(bundle);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public void bfv(String str, boolean z) {
        Intent intent = new Intent(this.f2586c, Videoview.class);
        Bundle bundle = new Bundle();
        bundle.putString("video", str);
        bundle.putBoolean("sfhp", z);
        intent.putExtras(bundle);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public void bfvs(String str, String str2) {
        Uri c;
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        if (!(x instanceof VideoView)) {
            x = m3208r(x, String.valueOf(x));
        }
        VideoView videoView = (VideoView) x;
        if (x2 instanceof Uri) {
            c = (Uri) x2;
        } else {
            String valueOf = String.valueOf(x2);
            if (C0860r.m2063v(valueOf.toLowerCase())) {
                c = C0851m.m1977c(this.f2586c, valueOf);
            } else {
                videoView.setVideoPath(m3173C(valueOf));
                return;
            }
        }
        videoView.setVideoURI(c);
    }

    @JavascriptInterface
    public String bfvss(String str, String str2) {
        Object x = m3214x(str);
        if (!(x instanceof VideoView)) {
            x = m3208r(x, String.valueOf(x));
        }
        VideoView videoView = (VideoView) x;
        if (str2.equals("st")) {
            videoView.requestFocus();
            videoView.start();
            return null;
        } else if (str2.equals("pe")) {
            videoView.pause();
            return null;
        } else if (str2.equals("sp")) {
            videoView.stopPlayback();
            return null;
        } else if (str2.equals("media")) {
            MediaController mediaController = new MediaController(this.f2586c);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            return m3179I("bfvss", mediaController);
        } else if (str2.equals("ip")) {
            try {
                return String.valueOf(videoView.isPlaying());
            } catch (Exception unused) {
                return "false";
            }
        } else if (str2.equals("dn")) {
            return String.valueOf(videoView.getDuration());
        } else {
            if (str2.equals("cn")) {
                return String.valueOf(videoView.getCurrentPosition());
            }
            return null;
        }
    }

    @JavascriptInterface
    public String bfvss(String str, String str2, int i) {
        Object x = m3214x(str);
        if (!(x instanceof VideoView)) {
            x = m3208r(x, String.valueOf(x));
        }
        VideoView videoView = (VideoView) x;
        if (!str2.equals("seekto")) {
            return null;
        }
        videoView.seekTo(i);
        return null;
    }

    @JavascriptInterface
    public void blp(String str, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1340n nVar = C1340n.f3148n;
            if (nVar == null) {
                C1340n nVar2 = new C1340n(this.f2585b);
                C1340n.f3148n = nVar2;
                nVar2.mo11986n(m3173C(str), i, i2, i3, i4);
                return;
            }
            nVar.mo11984j(m3173C(str), i, i2, i3, i4);
        }
    }

    @JavascriptInterface
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

    @JavascriptInterface
    public String bly(String str, String str2) {
        Object x = m3214x(str);
        if (!str2.equals("sp")) {
            MediaRecorder mediaRecorder = new MediaRecorder();
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(0);
            String C = m3173C(str2);
            C0835f.m1845b(C, false);
            mediaRecorder.setOutputFile(C);
            mediaRecorder.setAudioEncoder(0);
            try {
                mediaRecorder.prepare();
                mediaRecorder.start();
                return m3184N("bly", mediaRecorder);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else if (x == null) {
            return null;
        } else {
            MediaRecorder mediaRecorder2 = (MediaRecorder) x;
            try {
                mediaRecorder2.stop();
                mediaRecorder2.release();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    @JavascriptInterface
    public String btoo(String str, String str2) {
        byte[] bArr;
        try {
            bArr = m3204n(str2.trim(), ' ');
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

    @JavascriptInterface
    public void btoo(String str, String str2, boolean z) {
        byte[] bArr;
        try {
            bArr = m3204n(str2.trim(), ' ');
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr != null) {
            String C = m3173C(str);
            File file = new File(C);
            if (z || !file.exists()) {
                C0835f.m1853j(C, bArr);
            }
        }
    }

    @JavascriptInterface
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
                m3186P(substring + "myu");
                obj = C0864v.f1802l.get(str2 + "0");
            }
            String obj2 = obj.toString();
            C0839h.m1889E(this.f2586c, this.f2585b, str2, obj2.substring(obj2.indexOf(10)).trim());
        } else if (str.equals("mjava")) {
            C1309h hVar = new C1309h(this.f2586c);
            try {
                hVar.set("activity", this.f2586c);
                hVar.set("i", new Aid_javaCode(this.f2586c, this.f2585b, hVar));
            } catch (EvalError e) {
                e.printStackTrace();
            }
            int indexOf = str2.indexOf(46);
            if (hVar.mo11945e(str2.substring(0, indexOf) + ".mjava")) {
                return hVar.mo11941a(str2.substring(indexOf + 1));
            }
        } else if (str.equals("mlua")) {
            String str4 = "$_Call_SsS_" + Thread.currentThread().getId() + "_return";
            String str5 = "require 'import'\nrequire '" + str2.substring(0, str2.indexOf(46)) + "'\n\nlocal returns = " + str2.substring(str2.indexOf(46) + 1) + "()\ni:sss(\"" + str4 + "\", returns)";
            C1298d dVar = new C1298d(this.f2586c);
            dVar.mo11700l("activity", this.f2586c);
            dVar.mo11700l("i", new Aid_luaCode(this.f2586c, this.f2585b, dVar));
            dVar.mo11699k();
            try {
                dVar.mo11696h(str5);
                return m3179I("zj", C0864v.f1800j.get(str4));
            } catch (LuaException e2) {
                e2.printStackTrace();
                C0864v.m2157O2("LuaErr：\n" + e2.getMessage());
            }
        } else if (str.equals("mjs")) {
            StringBuilder sb = new StringBuilder();
            sb.append("<html><head><script type='text/javascript'>");
            sb.append(C0839h.m1896e(this.f2586c, "import.mjs"));
            sb.append("\n");
            sb.append(C0839h.m1892a(this.f2586c, str2.substring(0, str2.indexOf(46)) + ".mjs"));
            sb.append("\n\nvar returns = ");
            sb.append(str2.substring(str2.indexOf(46) + 1));
            sb.append("();</script></head></html>");
            String sb2 = sb.toString();
            WebView webView = new WebView(this.f2586c);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setAppCachePath(this.f2586c.getApplicationContext().getDir("cache", 0).getPath());
            webView.getSettings().setAppCacheMaxSize(8388608);
            webView.getSettings().setDatabaseEnabled(true);
            webView.getSettings().setDatabasePath(this.f2586c.getApplicationContext().getDir("database", 0).getPath());
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setGeolocationEnabled(true);
            webView.getSettings().setLightTouchEnabled(true);
            webView.getSettings().setCacheMode(-1);
            webView.getSettings().setPluginState(WebSettings.PluginState.ON);
            webView.setWebChromeClient(new C1173m0(this));
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            }
            webView.addJavascriptInterface(new Aid_jsCode(this.f2586c, this.f2585b, webView, 0), "I");
            C1295c.m3509d(webView, sb2);
        }
        return null;
    }

    @JavascriptInterface
    @SuppressLint({"NewApi"})
    public Object call(String str, String str2, String str3) {
        Object[] G = m3177G(str3);
        int length = G.length;
        if (str.equals("myu")) {
            Object obj = C0864v.f1802l.get(str2 + length);
            if (obj == null) {
                String substring = str2.substring(0, str2.indexOf(46) + 1);
                for (String str4 : C0864v.f1802l.keySet()) {
                    if (str4.toString().startsWith(substring)) {
                        return null;
                    }
                }
                m3186P(substring + "myu");
                obj = C0864v.f1802l.get(str2 + length);
            }
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf(10);
            String[] Q = m3187Q(m3188R(obj2.substring(0, indexOf)), ',');
            if (length != Q.length) {
                return null;
            }
            C0839h.m1890F(this.f2586c, this.f2585b, Q, G, str2, obj2.substring(indexOf).trim());
        } else if (str.equals("mjava")) {
            C1309h hVar = new C1309h(this.f2586c);
            try {
                hVar.set("activity", this.f2586c);
                hVar.set("i", new Aid_javaCode(this.f2586c, this.f2585b, hVar));
            } catch (EvalError e) {
                e.printStackTrace();
            }
            int indexOf2 = str2.indexOf(46);
            if (hVar.mo11945e(str2.substring(0, indexOf2) + ".mjava")) {
                return hVar.mo11942b(str2.substring(indexOf2 + 1), G);
            }
        } else {
            String str5 = "_a";
            if (str.equals("mlua")) {
                long id = Thread.currentThread().getId();
                String str6 = "";
                String str7 = str6;
                int i = 0;
                while (i < length) {
                    String str8 = "$_Call_SsS_" + id + str5 + i;
                    C0864v.f1800j.put(str8, G[i]);
                    str7 = str7 + "local a" + i + " = i:sss(\"" + str8 + "\")\n";
                    str6 = str6 + ",a" + i;
                    i++;
                    str5 = str5;
                    length = length;
                }
                if (str6.length() > 0) {
                    str6 = str6.substring(1);
                }
                String str9 = "$_Call_SsS_" + id + "_return";
                String str10 = "require 'import'\nrequire '" + str2.substring(0, str2.indexOf(46)) + "'\n" + str7 + "\nlocal returns = " + str2.substring(str2.indexOf(46) + 1) + "(" + str6 + ")\ni:sss(\"" + str9 + "\", returns)";
                C1298d dVar = new C1298d(this.f2586c);
                dVar.mo11700l("activity", this.f2586c);
                dVar.mo11700l("i", new Aid_luaCode(this.f2586c, this.f2585b, dVar));
                dVar.mo11699k();
                try {
                    dVar.mo11696h(str10);
                    return m3179I("zj", C0864v.f1800j.get(str9));
                } catch (LuaException e2) {
                    e2.printStackTrace();
                    C0864v.m2157O2("LuaErr：\n" + e2.getMessage());
                }
            } else {
                if (str.equals("mjs")) {
                    long id2 = Thread.currentThread().getId();
                    String str11 = "";
                    String str12 = str11;
                    for (int i2 = 0; i2 < length; i2++) {
                        String str13 = "$_Call_SsS_" + id2 + str5 + i2;
                        C0864v.f1800j.put(str13, G[i2]);
                        str12 = str12 + "var a" + i2 + " = I.sss(\"" + str13 + "\");\n";
                        str11 = str11 + ",a" + i2;
                    }
                    if (str11.length() > 0) {
                        str11 = str11.substring(1);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("<html><head><script type='text/javascript'>");
                    sb.append(C0839h.m1896e(this.f2586c, "import.mjs"));
                    sb.append("\n");
                    sb.append(C0839h.m1892a(this.f2586c, str2.substring(0, str2.indexOf(46)) + ".mjs"));
                    sb.append("\n");
                    sb.append(str12);
                    sb.append("\nvar returns = ");
                    sb.append(str2.substring(str2.indexOf(46) + 1));
                    sb.append("(");
                    sb.append(str11);
                    sb.append(");</script></head></html>");
                    String sb2 = sb.toString();
                    WebView webView = new WebView(this.f2586c);
                    webView.getSettings().setAllowFileAccess(true);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setAppCacheEnabled(true);
                    webView.getSettings().setAppCachePath(this.f2586c.getApplicationContext().getDir("cache", 0).getPath());
                    webView.getSettings().setAppCacheMaxSize(8388608);
                    webView.getSettings().setDatabaseEnabled(true);
                    webView.getSettings().setDatabasePath(this.f2586c.getApplicationContext().getDir("database", 0).getPath());
                    webView.getSettings().setDomStorageEnabled(true);
                    webView.getSettings().setGeolocationEnabled(true);
                    webView.getSettings().setLightTouchEnabled(true);
                    webView.getSettings().setCacheMode(-1);
                    webView.getSettings().setPluginState(WebSettings.PluginState.ON);
                    webView.setWebChromeClient(new C1170l0(this));
                    if (Build.VERSION.SDK_INT >= 11) {
                        webView.removeJavascriptInterface("searchBoxJavaBridge_");
                        webView.removeJavascriptInterface("accessibility");
                        webView.removeJavascriptInterface("accessibilityTraversal");
                    }
                    webView.addJavascriptInterface(new Aid_jsCode(this.f2586c, this.f2585b, webView, 0), "I");
                    C1295c.m3509d(webView, sb2);
                }
                return null;
            }
        }
        return null;
    }

    public void callMethod(String str, String str2) {
        WebView webView = this.f2587d;
        webView.loadUrl("javascript:" + str + "(" + str2 + ")");
    }

    public void clear_s_dim() {
        this.f2584a.clear();
    }

    @JavascriptInterface
    public String cls(String str) {
        return m3184N("cls", C0832d.m1817b(str));
    }

    @JavascriptInterface
    public String cls(String str, String str2) {
        try {
            return m3184N("cls", ((ClassLoader) m3214x(str)).loadClass(str2));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @JavascriptInterface
    public String clssm(String str, String str2) {
        Class cls = (Class) m3214x(str);
        if (str2.equals("init")) {
            return m3184N("clssm", cls.getDeclaredConstructors());
        }
        if (str2.equals("method")) {
            return m3184N("clssm", cls.getDeclaredMethods());
        }
        if (str2.equals("field")) {
            return m3184N("clssm", cls.getDeclaredFields());
        }
        return null;
    }

    @JavascriptInterface
    /* renamed from: dh */
    public String mo10755dh(String str, String str2) {
        Object x = m3214x(str);
        if (x instanceof C0921c) {
            C0921c cVar = (C0921c) x;
            if (str2.equals("cancel")) {
                cVar.mo9111b();
                return null;
            } else if (str2.equals("clone")) {
                return m3184N("dh", cVar.clone());
            } else {
                if (str2.equals("start")) {
                    cVar.mo9120j();
                    return null;
                } else if (str2.equals("running")) {
                    return String.valueOf(cVar.mo9115e());
                } else {
                    return null;
                }
            }
        } else if (x instanceof AnimationSet) {
            AnimationSet animationSet = (AnimationSet) x;
            if (str2.equals("cancel")) {
                animationSet.cancel();
                return null;
            } else if (str2.equals("reset")) {
                animationSet.reset();
                return null;
            } else if (!str2.equals("start")) {
                return null;
            } else {
                animationSet.start();
                return null;
            }
        } else if (x instanceof Animation) {
            Animation animation = (Animation) x;
            if (str2.equals("cancel")) {
                animation.cancel();
                return null;
            } else if (str2.equals("reset")) {
                animation.reset();
                return null;
            } else if (!str2.equals("start")) {
                return null;
            } else {
                animation.start();
                return null;
            }
        } else if (!(x instanceof AbstractC0918a)) {
            return null;
        } else {
            AbstractC0918a aVar = (AbstractC0918a) x;
            if (str2.equals("cancel")) {
                aVar.mo9111b();
                return null;
            } else if (str2.equals("clone")) {
                return m3184N("dh", aVar.clone());
            } else {
                if (str2.equals("start")) {
                    aVar.mo9120j();
                    return null;
                } else if (str2.equals("running")) {
                    return String.valueOf(aVar.mo9115e());
                } else {
                    return null;
                }
            }
        }
    }

    @JavascriptInterface
    /* renamed from: dh */
    public String mo10756dh(String str, String str2, String str3) {
        Object x = m3214x(str);
        if (x instanceof Animation) {
            Animation animation = (Animation) x;
            if (str2.equals("duration")) {
                animation.setDuration(Long.parseLong(str3));
                return null;
            } else if (str2.equals("delay")) {
                animation.setStartOffset(Long.parseLong(str3));
                return null;
            } else if (str2.equals("enabled")) {
                animation.setFillEnabled(str3.equals("true"));
                return null;
            } else if (str2.equals("after")) {
                animation.setFillAfter(str3.equals("true"));
                return null;
            } else if (str2.equals("before")) {
                animation.setFillBefore(str3.equals("true"));
                return null;
            } else if (!str2.equals("repeat")) {
                return null;
            } else {
                animation.setRepeatCount(Integer.parseInt(str3));
                return null;
            }
        } else if (x instanceof AbstractC0918a) {
            AbstractC0918a aVar = (AbstractC0918a) x;
            if (str2.equals("duration")) {
                aVar.mo9117g(Long.parseLong(str3));
                return null;
            } else if (str2.equals("delay")) {
                aVar.mo9118h(Long.parseLong(str3));
                return null;
            } else if (!str2.equals("target")) {
                return null;
            } else {
                Object x2 = m3214x(str3);
                aVar.mo9119i(x2 instanceof View ? (View) x2 : m3208r(x2, String.valueOf(x2)));
                return null;
            }
        } else if (x instanceof AnimationSet) {
            AnimationSet animationSet = (AnimationSet) x;
            if (str2.equals("duration")) {
                animationSet.setDuration(Long.parseLong(str3));
                return null;
            } else if (str2.equals("enabled")) {
                animationSet.setFillEnabled(str3.equals("true"));
                return null;
            } else if (str2.equals("after")) {
                animationSet.setFillAfter(str3.equals("true"));
                return null;
            } else if (str2.equals("before")) {
                animationSet.setFillBefore(str3.equals("true"));
                return null;
            } else if (str2.equals("delay")) {
                animationSet.setStartOffset(Long.parseLong(str3));
                return null;
            } else if (str2.equals("repeat")) {
                animationSet.setRepeatCount(Integer.parseInt(str3));
                return null;
            } else if (!str2.equals("add")) {
                return null;
            } else {
                animationSet.addAnimation((Animation) m3214x(str3));
                return null;
            }
        } else if (!(x instanceof C0921c)) {
            return null;
        } else {
            C0921c cVar = (C0921c) x;
            if (str2.equals("duration")) {
                cVar.mo9130u(Long.parseLong(str3));
                return null;
            } else if (str2.equals("delay")) {
                cVar.mo9118h(Long.parseLong(str3));
                return null;
            } else if (!str2.equals("target")) {
                return null;
            } else {
                Object x3 = m3214x(str3);
                cVar.mo9119i(x3 instanceof View ? (View) x3 : m3208r(x3, String.valueOf(x3)));
                return null;
            }
        }
    }

    @JavascriptInterface
    public String dha(boolean z, boolean z2) {
        float f = 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (!z2) {
            f = 0.0f;
        }
        return m3184N("dha", new AlphaAnimation(f2, f));
    }

    @JavascriptInterface
    public String dhas(String str, String str2, String str3) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        String[] F = m3176F(str3);
        int length = F.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = Float.parseFloat(F[i]);
        }
        return m3184N("dhas", C0934i.m2550K(r, str2, fArr));
    }

    @JavascriptInterface
    public String dhast(String str, String str2) {
        String[] F = m3176F(str2);
        int length = F.length;
        AbstractC0918a[] aVarArr = new AbstractC0918a[length];
        for (int i = 0; i < length; i++) {
            Object x = m3214x(F[i]);
            if (x instanceof AbstractC0918a) {
                aVarArr[i] = (AbstractC0918a) x;
            }
        }
        C0921c cVar = new C0921c();
        if (str.equals("sequen")) {
            cVar.mo9128s(aVarArr);
        } else if (str.equals("together")) {
            cVar.mo9129t(aVarArr);
        }
        return m3184N("dhast", cVar);
    }

    @JavascriptInterface
    public String dhb(String str, String str2) {
        AnimationDrawable animationDrawable = (AnimationDrawable) m3214x(str);
        if (str2.equals("start")) {
            animationDrawable.start();
            return null;
        } else if (str2.equals("stop")) {
            animationDrawable.stop();
            return null;
        } else if (str2.equals("running")) {
            return String.valueOf(animationDrawable.isRunning());
        } else {
            return null;
        }
    }

    @JavascriptInterface
    public String dhb(boolean z) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(z);
        return m3184N("dhb", animationDrawable);
    }

    @JavascriptInterface
    public void dhb(String str, String str2, int i) {
        AnimationDrawable animationDrawable = (AnimationDrawable) m3214x(str);
        Object x = m3214x(str2);
        animationDrawable.addFrame(x instanceof Drawable ? (Drawable) x : x instanceof Bitmap ? new BitmapDrawable((Bitmap) x) : C1305g.m3582m(String.valueOf(x), this.f2586c), i);
    }

    @JavascriptInterface
    public void dhon(String str, String str2, String str3, String str4) {
        ((Animation) m3214x(str)).setAnimationListener(new animationAnimation$AnimationListenerC1137a0(str2, str3, str4));
    }

    @JavascriptInterface
    public void dhon(String str, String str2, String str3, String str4, String str5) {
        ((AbstractC0918a) m3214x(str)).mo9110a(new C1140b0(str2, str3, str4, str5));
    }

    @JavascriptInterface
    public String dhr(float f, float f2) {
        return m3184N("dhr", new RotateAnimation(f, f2));
    }

    @JavascriptInterface
    public String dhr(float f, float f2, int i, float f3, int i2, float f4) {
        return m3184N("dhr", new RotateAnimation(f, f2, i, f3, i2, f4));
    }

    @JavascriptInterface
    public String dhs(float f, float f2, float f3, float f4) {
        return m3184N("dhs", new ScaleAnimation(f, f2, f3, f4));
    }

    @JavascriptInterface
    public String dhs(float f, float f2, float f3, float f4, int i, float f5, int i2, float f6) {
        return m3184N("dhs", new ScaleAnimation(f, f2, f3, f4, i, f5, i2, f6));
    }

    @JavascriptInterface
    public String dhset(String str, String str2) {
        String[] F = m3176F(str2);
        Object x = m3214x(str);
        AnimationSet animationSet = x instanceof AnimationSet ? (AnimationSet) x : new AnimationSet(str.equals("true"));
        for (String str3 : F) {
            Object x2 = m3214x(str3);
            if (x2 instanceof Animation) {
                animationSet.addAnimation((Animation) x2);
            }
        }
        return m3184N("dhset", animationSet);
    }

    @JavascriptInterface
    public String dht(float f, float f2, float f3, float f4) {
        return m3184N("dht", new TranslateAnimation(f, f2, f3, f4));
    }

    public void dim(String str, Object obj) {
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
            if (substring.equals("ss")) {
                m3206p(str, obj, 1);
                return;
            } else if (substring.equals("sss")) {
                m3206p(str, obj, 2);
                return;
            }
        }
        this.f2584a.put(str, obj);
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
        hashMap = this.f2584a;
        return hashMap.get(str);
    }

    @JavascriptInterface
    public void dslist(String str, String str2) {
        ArrayList arrayList = (ArrayList) m3214x(str);
        Object x = m3214x(str2);
        if ((x instanceof Integer) || (x instanceof Double)) {
            int parseInt = Integer.parseInt(String.valueOf(x));
            if (parseInt == -1) {
                arrayList.clear();
            } else {
                arrayList.remove(parseInt);
            }
        } else {
            arrayList.remove(x);
        }
    }

    @JavascriptInterface
    public void end() {
        this.f2585b.finish();
    }

    @JavascriptInterface
    public void endkeyboard() {
        View peekDecorView = this.f2585b.getWindow().peekDecorView();
        if (peekDecorView != null) {
            ((InputMethodManager) this.f2586c.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
    }

    @JavascriptInterface
    public void ends() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public void endutw() {
        AlertDialog alertDialog = alertdialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            alertdialog = null;
        }
    }

    @JavascriptInterface
    /* renamed from: fc */
    public boolean mo10778fc(String str, String str2) {
        return C0839h.m1897f(this.f2586c, str, str2, true);
    }

    @JavascriptInterface
    /* renamed from: fc */
    public boolean mo10779fc(String str, String str2, boolean z) {
        return C0839h.m1897f(this.f2586c, str, str2, z);
    }

    @JavascriptInterface
    /* renamed from: fd */
    public boolean mo10780fd(String str) {
        File file = new File(m3173C(str));
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    @JavascriptInterface
    public String fdir() {
        return C0835f.f1721a;
    }

    @JavascriptInterface
    public String fdir(String str) {
        return m3173C(str);
    }

    @JavascriptInterface
    /* renamed from: fe */
    public boolean mo10783fe(String str) {
        return C0839h.m1898g(this.f2586c, str);
    }

    @JavascriptInterface
    /* renamed from: fi */
    public boolean mo10784fi(String str) {
        return new File(m3173C(str)).isDirectory();
    }

    @JavascriptInterface
    /* renamed from: fj */
    public boolean mo10785fj(String str, String str2) {
        String C = m3173C(str2);
        C0835f.m1845b(C, false);
        try {
            C0834e.m1837c(m3173C(str), C, true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    /* renamed from: fj */
    public boolean mo10786fj(String str, String str2, boolean z) {
        String C = m3173C(str2);
        C0835f.m1845b(C, false);
        try {
            C0834e.m1837c(m3173C(str), C, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    /* renamed from: fl */
    public String mo10787fl(String str) {
        return m3183M(C0839h.m1899h(this.f2586c, str));
    }

    @JavascriptInterface
    /* renamed from: fl */
    public String mo10788fl(String str, boolean z) {
        File[] listFiles;
        File file = new File(m3173C(str));
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return null;
        }
        StringBuffer stringBuffer = null;
        for (File file2 : listFiles) {
            String name = (!z ? !file2.isFile() : !file2.isDirectory()) ? null : file2.getName();
            if (name != null) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                } else {
                    stringBuffer.append("\n\\\r");
                }
                stringBuffer.append(name);
            }
        }
        if (stringBuffer != null) {
            return stringBuffer.toString();
        }
        return null;
    }

    @JavascriptInterface
    /* renamed from: fo */
    public void mo10789fo(String str) {
        String C = m3173C(str);
        File file = new File(C);
        if (!file.exists()) {
            return;
        }
        if (C.toLowerCase().endsWith(".apk")) {
            C0835f.m1847d(this.f2586c, C);
            return;
        }
        try {
            m3180J(file);
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    /* renamed from: fr */
    public String mo10790fr(String str) {
        return C0839h.m1900i(this.f2586c, str);
    }

    @JavascriptInterface
    /* renamed from: fr */
    public String mo10791fr(String str, String str2) {
        return C0839h.m1901j(this.f2586c, str, str2);
    }

    @JavascriptInterface
    /* renamed from: fs */
    public long mo10792fs(String str) {
        return C0839h.m1902k(this.f2586c, str);
    }

    @JavascriptInterface
    /* renamed from: ft */
    public boolean mo10793ft(String str, String str2) {
        File file = new File(m3173C(str));
        if (!file.exists()) {
            return false;
        }
        String C = m3173C(str2);
        C0835f.m1845b(C, false);
        return file.renameTo(new File(C));
    }

    @JavascriptInterface
    public void ftz(String str, String str2, String str3, String str4, String str5) {
        C0862t.m2077b(this.f2586c, str, str2, str3, m3214x(str4), new Intent().setClass(this.f2586c, logoActivity.class).putExtra("command2", str5));
    }

    @JavascriptInterface
    public int fuz(String str, String str2, String str3) {
        String C = m3173C(str3);
        C0835f.m1845b(C, false);
        try {
            return C0839h.m1903l(this.f2586c, str, str2, C, true);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @JavascriptInterface
    public int fuz(String str, String str2, String str3, boolean z) {
        String C = m3173C(str3);
        C0835f.m1845b(C, false);
        try {
            return C0839h.m1903l(this.f2586c, str, str2, C, z);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @JavascriptInterface
    public boolean fuzs(String str, String str2) {
        String C = m3173C(str2);
        C0835f.m1845b(C, false);
        try {
            C0839h.m1904m(this.f2586c, str, C, true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public boolean fuzs(String str, String str2, boolean z) {
        String C = m3173C(str2);
        C0835f.m1845b(C, false);
        try {
            C0839h.m1904m(this.f2586c, str, C, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    /* renamed from: fw */
    public void mo10799fw(String str, String str2) {
        C0835f.m1854k(m3173C(str), str2);
    }

    @JavascriptInterface
    /* renamed from: fw */
    public void mo10800fw(String str, String str2, String str3) {
        C0835f.m1855l(m3173C(str), str2, str3);
    }

    @JavascriptInterface
    public String getjs(String str) {
        Context context = this.f2586c;
        return C0839h.m1892a(context, str + ".mjs");
    }

    @JavascriptInterface
    public String git(String str, String str2) {
        Object x = m3214x(str);
        Intent intent = x instanceof Intent ? (Intent) x : null;
        if (intent == null) {
            return null;
        }
        if (str2.equals("action")) {
            return intent.getAction();
        }
        if (str2.equals("type")) {
            return intent.getType();
        }
        if (str2.equals("flags")) {
            return String.valueOf(intent.getFlags());
        }
        if (str2.equals("data")) {
            return m3184N("git", intent.getData());
        }
        if (str2.equals("datastring")) {
            return intent.getDataString();
        }
        if (str2.equals("component")) {
            return m3184N("git", intent.getComponent());
        }
        return null;
    }

    @JavascriptInterface
    public String git(String str, String str2, String str3) {
        Object x = m3214x(str);
        Intent intent = x instanceof Intent ? (Intent) x : null;
        if (intent != null && str2.equals("extra")) {
            return m3179I("git", intent.getExtras().get(str3));
        }
        return null;
    }

    @JavascriptInterface
    public String gslist(String str, int i) {
        return m3179I("gslist", ((ArrayList) m3214x(str)).get(i));
    }

    @JavascriptInterface
    public int gslistiof(String str, String str2) {
        return ((ArrayList) m3214x(str)).indexOf(m3214x(str2));
    }

    @JavascriptInterface
    public boolean gslistis(String str, String str2) {
        return ((ArrayList) m3214x(str)).contains(m3214x(str2));
    }

    @JavascriptInterface
    public int gslistl(String str) {
        return ((ArrayList) m3214x(str)).size();
    }

    @JavascriptInterface
    public int gslistlof(String str, String str2) {
        return ((ArrayList) m3214x(str)).lastIndexOf(m3214x(str2));
    }

    @JavascriptInterface
    public String gslistsz(String str) {
        return m3183M(((ArrayList) m3214x(str)).toArray());
    }

    @JavascriptInterface
    public String gvs(String str) {
        Object x = m3214x(str);
        return m3184N("gvs", m3208r(x, String.valueOf(x)));
    }

    @JavascriptInterface
    public String gvs(String str, String str2) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        return m3184N("gvs", x2 instanceof View ? (View) x2 : m3207q(x instanceof View ? (View) x : m3208r(x, String.valueOf(x)), x2, String.valueOf(x2)));
    }

    @JavascriptInterface
    public void has(String str, String str2) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r instanceof com.iapp.app.p067x5.WebView) {
            ((com.iapp.app.p067x5.WebView) r).loadUrl("javascript:{" + str2 + "};");
        }
    }

    @JavascriptInterface
    /* renamed from: hd */
    public int mo10813hd(String str, String str2) {
        return C0841i.m1918a(str, m3173C(str2), false);
    }

    @JavascriptInterface
    /* renamed from: hd */
    public int mo10814hd(String str, String str2, boolean z) {
        return C0841i.m1918a(str, m3173C(str2), z);
    }

    @JavascriptInterface
    /* renamed from: hd */
    public int mo10815hd(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, String str6) {
        return C0841i.m1919b(str, m3173C(str2), z, str3, str4, str5, z2, str6);
    }

    @JavascriptInterface
    public void hdd(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        C1293a.f3049b.mo9045m(m3173C(str), m3173C(str2), i, i2, i3, i4, z);
    }

    @JavascriptInterface
    public String hdda(String str, String str2, String str3) {
        return m3184N("hdda", C1293a.f3049b.mo9038d(str, str2, m3214x(str3)));
    }

    @JavascriptInterface
    public String hdda(String str, String str2, String str3, String str4) {
        return m3184N("hdda", C1293a.f3049b.mo9039e(str, str2, str3, m3214x(str4)));
    }

    @JavascriptInterface
    public String hdda(String str, String str2, String str3, String str4, String str5) {
        return m3184N("hdda", C1293a.f3049b.mo9040f(str, str2, str3, m3214x(str4), m3214x(str5)));
    }

    @JavascriptInterface
    public String hdda(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        return m3184N("hdda", C1293a.f3049b.mo9041g(str, m3173C(str2), str3, str4, m3214x(str5), z, m3214x(str6)));
    }

    @JavascriptInterface
    public String hddg(String str, String str2) {
        try {
            return m3179I("hddg", C1293a.f3049b.mo9042h(C1293a.f3049b.f1934c.get(Integer.parseInt(str)), str2));
        } catch (NumberFormatException unused) {
            return m3179I("hddg", C1293a.f3049b.mo9042h((C0911c) m3214x(str), str2));
        }
    }

    @JavascriptInterface
    public String hddgl() {
        return m3184N("hddgl", C1293a.f3049b.f1934c);
    }

    @JavascriptInterface
    public void hdds(String str, String str2, String str3) {
        Object x = m3214x(str3);
        try {
            C1293a.f3049b.mo9044l(C1293a.f3049b.f1934c.get(Integer.parseInt(str3)), str2, x);
        } catch (NumberFormatException unused) {
            C1293a.f3049b.mo9044l((C0911c) m3214x(str), str2, x);
        }
    }

    @JavascriptInterface
    public void hdduigo() {
        this.f2586c.startActivity(new Intent().setClass(this.f2586c, DownList.class));
    }

    @JavascriptInterface
    public void hdduigo(String str, String str2) {
        Intent intent = new Intent(this.f2586c, DownList.class);
        Bundle bundle = new Bundle();
        bundle.putString("background", str);
        bundle.putString("backgroundShadow", str2);
        intent.putExtras(bundle);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public String hdfl(String str, String str2, int i, int i2, boolean z, String str3, String str4) {
        C0836g gVar = new C0836g(m3173C(str), m3173C(str2), i, i2, z);
        m3178H(gVar, str3, str4);
        return m3184N("hdfl", gVar);
    }

    @JavascriptInterface
    public String hdfl(String str, String str2, String str3) {
        C0836g gVar = new C0836g(m3173C(str));
        m3178H(gVar, str2, str3);
        return m3184N("hdfl", gVar);
    }

    @JavascriptInterface
    public String hdfl(String str, String str2, String str3, String str4) {
        C0836g gVar = new C0836g(m3173C(str), m3173C(str2));
        m3178H(gVar, str3, str4);
        return m3184N("hdfl", gVar);
    }

    @JavascriptInterface
    public void hdfla(String str, String str2, int i, String str3) {
        C0836g gVar = (C0836g) m3214x(str);
        gVar.mo8929n(str2, i, m3214x(str3));
        gVar.mo8933t();
    }

    @JavascriptInterface
    public void hdfla(String str, String str2, int i, String str3, String str4) {
        C0836g gVar = (C0836g) m3214x(str);
        gVar.mo8930o(str2, i, m3214x(str3), m3173C(str4));
        gVar.mo8933t();
    }

    @JavascriptInterface
    /* renamed from: hs */
    public String mo10831hs(String str) {
        return (str.equals("cookie") || str.equals("del cookie")) ? C0841i.m1921d(str) : C0841i.m1922e(str, null, null);
    }

    @JavascriptInterface
    /* renamed from: hs */
    public String mo10832hs(String str, String str2, String str3) {
        return C0841i.m1922e(str, str2, str3);
    }

    @JavascriptInterface
    /* renamed from: hs */
    public String mo10833hs(String str, String str2, String str3, String str4) {
        return C0841i.m1923f(str, str2, str3, str4);
    }

    @JavascriptInterface
    /* renamed from: hs */
    public String mo10834hs(String str, String str2, String str3, String str4, boolean z) {
        return C0841i.m1924g(str, str2, str3, str4, z);
    }

    @JavascriptInterface
    /* renamed from: hs */
    public String mo10835hs(String str, String str2, String str3, String str4, boolean z, String str5) {
        return C0841i.m1925h(str, str2, str3, str4, z, str5, 20000, 20000, null);
    }

    @JavascriptInterface
    /* renamed from: hs */
    public String mo10836hs(String str, String str2, String str3, String str4, boolean z, String str5, int i, int i2, String str6) {
        return C0841i.m1925h(str, str2, str3, str4, z, str5, i, i2, str6);
    }

    @JavascriptInterface
    @TargetApi(11)
    public void hsas(String str, boolean z) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r instanceof com.iapp.app.p067x5.WebView) {
            com.iapp.app.p067x5.WebView webView = (com.iapp.app.p067x5.WebView) r;
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("iapp");
            }
            if (z) {
                webView.addJavascriptInterface(new C1311iapp(this.f2586c, this.f2585b), "iapp");
            }
        }
    }

    @JavascriptInterface
    public String huf(String str, String str2, String str3, String str4) {
        try {
            return C0841i.m1930m(this.f2586c, str, str2, str3, str4);
        } catch (Exception unused) {
            return null;
        }
    }

    @JavascriptInterface
    public String huf(String str, String str2, String str3, String str4, String str5) {
        try {
            return C0841i.m1931n(this.f2586c, str, str2, str3, str4, str5);
        } catch (Exception unused) {
            return null;
        }
    }

    @JavascriptInterface
    /* renamed from: hw */
    public void mo10840hw(String str) {
        Intent intent = new Intent(this.f2586c, Webview.class);
        Bundle bundle = new Bundle();
        bundle.putString("WebURL", str);
        intent.putExtras(bundle);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    /* renamed from: hw */
    public void mo10841hw(String str, String str2, String str3) {
        Intent intent = new Intent(this.f2586c, Webview.class);
        Bundle bundle = new Bundle();
        bundle.putString("WebURL", str);
        bundle.putString("background", str2);
        bundle.putString("backgroundShadow", str3);
        intent.putExtras(bundle);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public void hws(String str) {
        Intent intent;
        try {
            intent = C0841i.m1934q(this.f2586c, str);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(C0851m.m1977c(this.f2586c, str));
            intent = intent2;
        }
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public String java(String str, String str2) {
        return m3179I("java", C0832d.m1822g(this.f2586c, m3214x(str), str2, null, null, null));
    }

    @JavascriptInterface
    public String java(String str, String str2, String str3) {
        return m3179I("java", C0832d.m1822g(this.f2586c, m3214x(str), str2, m3177G(str3), null, null));
    }

    @JavascriptInterface
    public String java(String str, String str2, String str3, String str4) {
        return m3179I("java", C0832d.m1822g(this.f2586c, m3214x(str), str2, m3177G(str3), this.f2587d, str4));
    }

    @JavascriptInterface
    public String javacb(String str, String str2) {
        Class cls = (Class) m3214x(str);
        return m3184N("javacb", C0832d.m1830o(cls.getClassLoader(), cls, this.f2587d, str2));
    }

    @JavascriptInterface
    public String javags(String str, String str2) {
        return m3179I("javags", C0832d.m1825j(m3214x(str), str2));
    }

    @JavascriptInterface
    public String javags(String str, String str2, String str3) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        return m3179I("javags", x2 instanceof Class ? C0832d.m1824i(x, (Class) x2, str3) : C0832d.m1826k(x, x2.toString(), str3));
    }

    @JavascriptInterface
    public String javanew(String str) {
        Object x = m3214x(str);
        return m3179I("javanew", x instanceof Class ? C0832d.m1828m(this.f2586c, (Class) x, null, null, null) : C0832d.m1829n(this.f2586c, x.toString(), null, null, null));
    }

    @JavascriptInterface
    public String javanew(String str, String str2) {
        Object x = m3214x(str);
        return m3179I("javanew", x instanceof Class ? C0832d.m1828m(this.f2586c, (Class) x, m3177G(str2), null, null) : C0832d.m1829n(this.f2586c, x.toString(), m3177G(str2), null, null));
    }

    @JavascriptInterface
    public String javanew(String str, String str2, String str3) {
        Object x = m3214x(str);
        return m3179I("javanew", x instanceof Class ? C0832d.m1828m(this.f2586c, (Class) x, m3177G(str2), this.f2587d, str3) : C0832d.m1829n(this.f2586c, x.toString(), m3177G(str2), this.f2587d, str3));
    }

    @JavascriptInterface
    public String javass(String str, String str2, String str3) {
        return m3179I("javass", C0832d.m1831p(m3214x(str), str2, m3214x(str3)));
    }

    @JavascriptInterface
    public String javass(String str, String str2, String str3, String str4) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        Object x3 = m3214x(str4);
        return m3179I("javass", Boolean.valueOf(x2 instanceof Class ? C0832d.m1832q(x, (Class) x2, str3, x3) : C0832d.m1833r(x, x2.toString(), str3, x3)));
    }

    @JavascriptInterface
    public String javax(String str, String str2, String str3) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        boolean z = x2 instanceof Class;
        Context context = this.f2586c;
        return m3179I("javax", z ? C0832d.m1820e(context, x, (Class) x2, str3, null, null, null) : C0832d.m1821f(context, x, x2.toString(), str3, null, null, null));
    }

    @JavascriptInterface
    public String javax(String str, String str2, String str3, String str4) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        boolean z = x2 instanceof Class;
        Context context = this.f2586c;
        return m3179I("javax", z ? C0832d.m1820e(context, x, (Class) x2, str3, m3177G(str4), null, null) : C0832d.m1821f(context, x, x2.toString(), str3, m3177G(str4), null, null));
    }

    @JavascriptInterface
    public String javax(String str, String str2, String str3, String str4, String str5) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        boolean z = x2 instanceof Class;
        Context context = this.f2586c;
        return m3179I("javax", z ? C0832d.m1820e(context, x, (Class) x2, str3, m3177G(str4), this.f2587d, str5) : C0832d.m1821f(context, x, x2.toString(), str3, m3177G(str4), this.f2587d, str5));
    }

    @JavascriptInterface
    public void lan(int i) {
        C0915a.m2418a(this.f2585b, i);
    }

    @JavascriptInterface
    public String loadjar(String str) {
        Context context = this.f2586c;
        return m3184N("loadjar", C0839h.m1909r(context, str, context.getClassLoader()));
    }

    @JavascriptInterface
    public String loadjar(String str, boolean z) {
        Context context = this.f2586c;
        DexClassLoader r = C0839h.m1909r(context, str, context.getClassLoader());
        if (z) {
            C0839h.m1912u(this.f2586c, r);
        }
        return m3184N("loadjar", r);
    }

    @JavascriptInterface
    public String loadjar(String str, boolean z, String str2) {
        DexClassLoader r = C0839h.m1909r(this.f2586c, str, (ClassLoader) m3214x(str2));
        if (z) {
            C0839h.m1912u(this.f2586c, r);
        }
        return m3184N("loadjar", r);
    }

    @JavascriptInterface
    public void loadso(String str) {
        C0839h.m1910s(str);
    }

    @JavascriptInterface
    public String ngde(int i, int i2, String str, String str2) {
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
        return m3184N("ngde", gradientDrawable);
    }

    @JavascriptInterface
    public String ngde(int i, int i2, String str, String str2, String str3) {
        int o = C0860r.m2056o(str2);
        String[] Q = m3187Q(str, '|');
        int[] iArr = new int[Q.length];
        for (int i3 = 0; i3 < Q.length; i3++) {
            iArr[i3] = C0860r.m2056o(Q[i3]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(m3174D(str3), iArr);
        if (i2 > 0) {
            gradientDrawable.setCornerRadius((float) i2);
        }
        if (i > 0) {
            gradientDrawable.setStroke(i, o);
        }
        return m3184N("ngde", gradientDrawable);
    }

    @JavascriptInterface
    public String ngde(int i, String str) {
        int o = C0860r.m2056o(str);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(o);
        if (i > 0) {
            gradientDrawable.setCornerRadius((float) i);
        }
        return m3184N("ngde", gradientDrawable);
    }

    @JavascriptInterface
    public String ngde(int i, String str, String str2) {
        int o = C0860r.m2056o(str);
        int o2 = C0860r.m2056o(str2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(o);
        if (i > 0) {
            gradientDrawable.setStroke(i, o2);
        }
        return m3184N("ngde", gradientDrawable);
    }

    @JavascriptInterface
    public String ngde(String str) {
        int o = C0860r.m2056o(str);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(o);
        return m3184N("ngde", gradientDrawable);
    }

    @JavascriptInterface
    public String nsz(String str) {
        try {
            return m3183M(new Object[Integer.parseInt(str)]);
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    @JavascriptInterface
    public String nuibs(String str, String str2, String str3) {
        return m3184N("nuibs", new C0917c(this.f2586c).mo9109d(m3214x(str), m3214x(str2), m3214x(str3)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    @android.webkit.JavascriptInterface
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String nvw(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.nvw(int, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public void nvw(String str, String str2) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null) {
            if (!(x2 instanceof ViewGroup)) {
                x2 = m3208r(x2, String.valueOf(x2));
            }
            ViewGroup viewGroup = (ViewGroup) x2;
            if (viewGroup != null) {
                this.f2589f.post(new RunnableC1187r(this, viewGroup, r));
            }
        }
    }

    @JavascriptInterface
    public void nvw(String str, String str2, int i) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null) {
            if (!(x2 instanceof ViewGroup)) {
                x2 = m3208r(x2, String.valueOf(x2));
            }
            ViewGroup viewGroup = (ViewGroup) x2;
            if (viewGroup != null) {
                this.f2589f.post(new RunnableC1190s(this, viewGroup, r, i));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openRestoreinterfaceX(java.lang.String r16, android.view.ViewGroup r17, int r18, java.lang.Object r19, p013b.p048c.p049a.C0916b r20, java.lang.StringBuffer r21, android.webkit.WebView r22) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.openRestoreinterfaceX(java.lang.String, android.view.ViewGroup, int, java.lang.Object, b.c.a.b, java.lang.StringBuffer, android.webkit.WebView):void");
    }

    @JavascriptInterface
    public String otob(String str) {
        byte[] t = C0839h.m1911t(this.f2586c, str);
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

    @JavascriptInterface
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

    @JavascriptInterface
    public String res() {
        return m3184N("res", new C1310i(this.f2586c));
    }

    @JavascriptInterface
    public String res(String str) {
        return m3184N("res", new C1310i(this.f2586c, m3173C(str)));
    }

    @JavascriptInterface
    public String res(String str, String str2) {
        Object c;
        C1310i iVar = (C1310i) m3214x(str);
        if (str2.equals("asset")) {
            c = iVar.mo11947a();
        } else if (!str2.equals("resources")) {
            return null;
        } else {
            c = iVar.mo11949c();
        }
        return m3184N("res", c);
    }

    @JavascriptInterface
    public String res(String str, String str2, String str3) {
        return m3179I("res", ((C1310i) m3214x(str)).mo11950d(str2, str3));
    }

    @JavascriptInterface
    public String res(String str, String str2, String str3, boolean z) {
        C1310i iVar = (C1310i) m3214x(str);
        return m3179I("res", z ? Integer.valueOf(iVar.mo11948b(str2, str3)) : iVar.mo11950d(str2, str3));
    }

    @JavascriptInterface
    public String sbp(String str) {
        Object x = m3214x(str);
        Bitmap v = x instanceof Bitmap ? (Bitmap) x : C0839h.m1913v(this.f2586c, String.valueOf(x));
        if (v == null) {
            return null;
        }
        return m3184N("sbp", v);
    }

    @JavascriptInterface
    public String sbp(String str, int i, int i2, int i3, int i4) {
        Object x = m3214x(str);
        Bitmap c = x instanceof Bitmap ? (Bitmap) x : C0849k.m1963c(m3173C(String.valueOf(x)));
        if (c == null) {
            return null;
        }
        return m3184N("sbp", Bitmap.createBitmap(c, i, i2, i3, i4));
    }

    @JavascriptInterface
    public String sbp(String str, int i, int i2, int i3, int i4, float f) {
        Object x = m3214x(str);
        Bitmap c = x instanceof Bitmap ? (Bitmap) x : C0849k.m1963c(m3173C(String.valueOf(x)));
        if (c == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.preRotate(f);
        return m3184N("sbp", Bitmap.createBitmap(c, i, i2, i3, i4, matrix, true));
    }

    @JavascriptInterface
    public void sdeg(String str) {
        C0864v.f1811u = Integer.parseInt(str);
    }

    @JavascriptInterface
    /* renamed from: se */
    public String mo10884se(String str, String str2) {
        Matcher matcher = (Matcher) m3214x(str);
        if (str2.equals("ms")) {
            return String.valueOf(matcher.matches());
        }
        if (str2.equals("find")) {
            return String.valueOf(matcher.find());
        }
        if (str2.equals("gl")) {
            return String.valueOf(matcher.groupCount());
        }
        if (str2.equals("start")) {
            return String.valueOf(matcher.start());
        }
        if (str2.equals("end")) {
            return String.valueOf(matcher.end());
        }
        if (str2.equals("group")) {
            return matcher.group();
        }
        return null;
    }

    @JavascriptInterface
    /* renamed from: se */
    public String mo10885se(String str, String str2, String str3) {
        Object x = m3214x(str);
        if (x instanceof Matcher) {
            Matcher matcher = (Matcher) x;
            if (str2.equals("sral")) {
                return matcher.replaceAll(str3);
            }
            if (str2.equals("srft")) {
                return matcher.replaceFirst(str3);
            }
            if (str2.equals("find")) {
                return String.valueOf(matcher.find(Integer.parseInt(str3)));
            }
            if (str2.equals("start")) {
                return String.valueOf(matcher.start(Integer.parseInt(str3)));
            }
            if (str2.equals("end")) {
                return String.valueOf(matcher.end(Integer.parseInt(str3)));
            }
            if (str2.equals("group")) {
                return matcher.group(Integer.parseInt(str3));
            }
        }
        return m3184N("se", Pattern.compile(str2, Integer.parseInt(str3)).matcher(str));
    }

    @JavascriptInterface
    public String shb() {
        CharSequence text = ((ClipboardManager) this.f2586c.getSystemService("clipboard")).getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    @JavascriptInterface
    public String simei() {
        return C0860r.m2058q(this.f2586c);
    }

    @JavascriptInterface
    public String simsi() {
        try {
            return ((TelephonyManager) this.f2586c.getSystemService("phone")).getSubscriberId();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @JavascriptInterface
    public int siof(String str, String str2) {
        return str.indexOf(str2);
    }

    @JavascriptInterface
    public int siof(String str, String str2, int i) {
        return str.indexOf(str2, i);
    }

    @JavascriptInterface
    public String sit(String str, String str2, String str3) {
        Object x = m3214x(str);
        Intent intent = x == null ? new Intent() : (Intent) x;
        if (str2.equals("action")) {
            intent.setAction(str3);
        } else if (str2.equals("type")) {
            intent.setType(str3);
        } else if (str2.equals("flags")) {
            intent.setFlags(Integer.parseInt(str3));
        } else if (str2.equals("data")) {
            intent.setData(C0851m.m1977c(this.f2586c, str3));
        }
        return (str == null || !str.startsWith("^")) ? m3184N("sit", intent) : main2.set(str, intent);
    }

    @JavascriptInterface
    public String sit(String str, String str2, String str3, String str4) {
        Object x = m3214x(str);
        Object F = str4.contains("\n\\\r") ? m3176F(str4) : m3214x(str4);
        Intent intent = x == null ? new Intent() : (Intent) x;
        if (str2.equals("extra")) {
            if (F instanceof String[]) {
                intent.putExtra(str3, (String[]) F);
            } else if (F instanceof Boolean) {
                intent.putExtra(str3, F.equals(Boolean.TRUE));
            } else if (F instanceof Integer) {
                intent.putExtra(str3, Integer.parseInt(String.valueOf(F)));
            } else if (F instanceof Long) {
                intent.putExtra(str3, Long.parseLong(String.valueOf(F)));
            } else {
                intent.putExtra(str3, String.valueOf(F));
            }
        } else if (str2.equals("classname")) {
            intent.setClassName(str3, String.valueOf(F));
        } else if (str2.equals("component")) {
            intent.setComponent(new ComponentName(str3, String.valueOf(F)));
        }
        return (str == null || !str.startsWith("^")) ? m3184N("sit", intent) : main2.set(str, intent);
    }

    @JavascriptInterface
    /* renamed from: sj */
    public String mo10893sj(String str, String str2, String str3) {
        return C0860r.m2044c(str, str2, str3);
    }

    @JavascriptInterface
    public String sjxx() {
        String[] t = m3210t();
        int[] u = m3211u();
        int[] v = m3212v();
        String[] w = m3213w();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(t[0]);
        stringBuffer.append('\n');
        stringBuffer.append(t[1]);
        stringBuffer.append("\n\\\r");
        stringBuffer.append(u[0]);
        stringBuffer.append('\n');
        stringBuffer.append(u[1]);
        stringBuffer.append('\n');
        stringBuffer.append(v[0]);
        stringBuffer.append('\n');
        stringBuffer.append(v[1]);
        stringBuffer.append("\n\\\r");
        stringBuffer.append(w[0]);
        stringBuffer.append('\n');
        stringBuffer.append(w[1]);
        stringBuffer.append('\n');
        stringBuffer.append(w[2]);
        return stringBuffer.toString();
    }

    @JavascriptInterface
    /* renamed from: sl */
    public String mo10895sl(String str, String str2) {
        return m3183M(C0861s.m2072e(str, str2));
    }

    @JavascriptInterface
    /* renamed from: sl */
    public String mo10896sl(String str, String str2, boolean z) {
        return z ? m3183M(str.split(str2)) : m3183M(C0861s.m2072e(str, str2));
    }

    @JavascriptInterface
    public int slg(String str) {
        return str.length();
    }

    @JavascriptInterface
    public int slof(String str, String str2) {
        return str.lastIndexOf(str2);
    }

    @JavascriptInterface
    public int slof(String str, String str2, int i) {
        return str.lastIndexOf(str2, i);
    }

    @JavascriptInterface
    public String slower(String str) {
        return str.toLowerCase();
    }

    @JavascriptInterface
    public String sot(int i, String str, int i2, int i3, boolean z, String str2) {
        C0855q qVar = new C0855q(i, str, i2, i3, z);
        qVar.mo8955F(new C1164j0(str2));
        return m3184N("sot", qVar);
    }

    @JavascriptInterface
    public String sot(String str, int i, int i2, boolean z, String str2) {
        C0855q qVar = new C0855q(str, i, i2, z);
        qVar.mo8955F(new C1167k0(str2));
        return m3184N("sot", qVar);
    }

    @JavascriptInterface
    public String sot(String str, String str2) {
        C0855q qVar = (C0855q) m3214x(str);
        if (str2.equals("ip")) {
            return String.valueOf(qVar.mo8954B());
        }
        if (str2.equals("id")) {
            return String.valueOf(qVar.mo8961t());
        }
        if (str2.equals("list")) {
            return m3184N("sot", qVar.mo8964w());
        }
        if (str2.equals("size")) {
            return String.valueOf(qVar.mo8962u());
        }
        if (str2.equals("server")) {
            return m3184N("sot", qVar.mo8963v());
        }
        if (!str2.equals("re")) {
            return null;
        }
        qVar.mo8960s();
        return null;
    }

    @JavascriptInterface
    public String sot(String str, String str2, String str3) {
        C0855q qVar = (C0855q) m3214x(str);
        if (str2.equals("list")) {
            return m3184N("sot", qVar.mo8953A(Integer.parseInt(str3)));
        }
        if (str2.equals("str")) {
            qVar.mo8957b(str3);
            return null;
        } else if (str2.equals("file")) {
            qVar.mo8956a(new File(m3173C(str3)));
            return null;
        } else if (str2.equals("bt")) {
            qVar.mo8958c(m3204n(str3, ' '));
            return null;
        } else if (!str2.equals("new")) {
            return null;
        } else {
            qVar.f1776c = str3.equals("true");
            return null;
        }
    }

    @JavascriptInterface
    public String sota(String str, String str2) {
        C0855q.C0858c cVar = (C0855q.C0858c) m3214x(str);
        if (str2.equals("re")) {
            cVar.mo8971g();
            return null;
        } else if (str2.equals("ip")) {
            return String.valueOf(cVar.mo8975k());
        } else {
            if (str2.equals("id")) {
                return String.valueOf(cVar.mo8973i());
            }
            if (str2.equals("socket")) {
                return m3184N("sota", cVar.mo8974j());
            }
            if (str2.equals("ht")) {
                return cVar.mo8972h();
            }
            return null;
        }
    }

    @JavascriptInterface
    public void sota(String str, String str2, String str3) {
        C0855q.C0858c cVar = (C0855q.C0858c) m3214x(str);
        if (str2.equals("str")) {
            cVar.mo8968b(str3);
        } else if (str2.equals("file")) {
            cVar.mo8967a(new File(m3173C(str3)));
        } else if (str2.equals("bt")) {
            cVar.mo8969c(m3204n(str3, ' '));
        }
    }

    @JavascriptInterface
    public String sql(String str, String str2) {
        Object x = m3214x(str2);
        if (x instanceof SQLiteDatabase) {
            ((SQLiteDatabase) x).execSQL(str);
            return null;
        }
        Object x2 = m3214x(str);
        if (x2 instanceof SQLiteDatabase) {
            try {
                return m3184N("sql", ((SQLiteDatabase) x2).rawQuery(str2, null));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @JavascriptInterface
    public String sql(String str, String str2, String str3, String str4, String str5) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) m3214x(str);
        if (sQLiteDatabase == null) {
            return null;
        }
        if (str3.equals("add")) {
            return String.valueOf(C0854p.m1984a(sQLiteDatabase, str2, str4, str5));
        }
        if (str3.equals("up")) {
            return String.valueOf(C0854p.m1993j(sQLiteDatabase, str2, str4, str5));
        }
        if (str3.equals("sele")) {
            return m3184N("sql", C0854p.m1991h(sQLiteDatabase, str4, str2, str5));
        }
        return null;
    }

    @JavascriptInterface
    public boolean sql(String str, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) m3214x(str);
        if (sQLiteDatabase == null) {
            return false;
        }
        if (str3.equals("ip")) {
            return C0854p.m1992i(sQLiteDatabase, str2);
        }
        if (str3.equals("del")) {
            return C0854p.m1988e(sQLiteDatabase, str2);
        }
        return false;
    }

    @JavascriptInterface
    public boolean sql(String str, String str2, String str3, String str4) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) m3214x(str);
        if (sQLiteDatabase == null) {
            return false;
        }
        if (str3.equals("add")) {
            return C0854p.m1985b(sQLiteDatabase, str2, str4);
        }
        if (str3.equals("del")) {
            return C0854p.m1987d(sQLiteDatabase, str2, str4);
        }
        return false;
    }

    @JavascriptInterface
    public String sqlite(String str, String str2) {
        if (!str2.equals("re")) {
            return str2.equals("ip") ? (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) ? String.valueOf(C0839h.m1916y(this.f2586c, m3173C(str), false)) : String.valueOf(C0839h.m1916y(this.f2586c, str, true)) : str2.equals("del") ? (str.contains("/") || str.contains("\\") || str.startsWith("@") || str.startsWith("$") || str.startsWith("%")) ? String.valueOf(C0839h.m1915x(this.f2586c, m3173C(str), false)) : String.valueOf(C0839h.m1915x(this.f2586c, str, true)) : (str2.contains("/") || str2.contains("\\") || str2.startsWith("@") || str2.startsWith("$") || str2.startsWith("%")) ? m3184N("sqlite", C0839h.m1917z(this.f2586c, m3173C(str2), false)) : m3184N("sqlite", C0839h.m1917z(this.f2586c, str2, true));
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) m3214x(str);
        if (sQLiteDatabase == null) {
            return null;
        }
        sQLiteDatabase.close();
        return null;
    }

    @JavascriptInterface
    public String sqlsele(String str, String str2) {
        Cursor cursor = (Cursor) m3214x(str);
        try {
            return cursor.getString(Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            if (!str2.equals("re")) {
                return str2.equals("columncount") ? String.valueOf(cursor.getColumnCount()) : str2.equals("count") ? String.valueOf(cursor.getCount()) : str2.equals("next") ? String.valueOf(cursor.moveToNext()) : str2.equals("previous") ? String.valueOf(cursor.moveToPrevious()) : str2.equals("first") ? String.valueOf(cursor.moveToFirst()) : str2.equals("last") ? String.valueOf(cursor.moveToLast()) : str2.equals("getposition") ? String.valueOf(cursor.getPosition()) : cursor.getString(Integer.parseInt(str2));
            }
            if (cursor == null) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    @JavascriptInterface
    public void sqlsele(String str, String str2, int i) {
        if (str2.equals("position")) {
            ((Cursor) m3214x(str)).moveToPosition(i);
        }
    }

    @JavascriptInterface
    /* renamed from: sr */
    public String mo10914sr(String str, String str2, String str3) {
        return str.replace(str2, str3);
    }

    @JavascriptInterface
    /* renamed from: sr */
    public String mo10915sr(String str, String str2, String str3, boolean z) {
        return z ? str.replaceAll(str2, str3) : str.replace(str2, str3);
    }

    @JavascriptInterface
    public int sran(int i, int i2) {
        return C0860r.m2048g(i, i2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void src(String str, String str2) {
        this.f2587d.addJavascriptInterface(m3214x(str2), str);
    }

    @JavascriptInterface
    /* renamed from: ss */
    public String mo10918ss(String str) {
        Object obj = ss_dim.get(str);
        if (obj != null) {
            return m3215y(obj);
        }
        return null;
    }

    @JavascriptInterface
    /* renamed from: ss */
    public void mo10919ss(String str, String str2) {
        ss_dim.put(str, m3214x(str2));
    }

    @JavascriptInterface
    public void ssBoolean(String str, boolean z) {
        ss_dim.put(str, Boolean.valueOf(z));
    }

    @JavascriptInterface
    public void ssNumber(String str, double d) {
        ss_dim.put(str, Double.valueOf(d));
    }

    @JavascriptInterface
    public void ssNumber(String str, long j) {
        ss_dim.put(str, Long.valueOf(j));
    }

    @JavascriptInterface
    public String ssg(String str, int i) {
        return str.substring(i);
    }

    @JavascriptInterface
    public String ssg(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    public void ssj(Object obj, String str, String str2) {
        View r = obj instanceof View ? (View) obj : m3208r(obj, String.valueOf(obj));
        if (r != null) {
            m3202l(r, str, m3176F(str2));
        }
    }

    @JavascriptInterface
    public void sslist(String str, int i, String str2) {
        ((ArrayList) m3214x(str)).set(i, m3214x(str2));
    }

    @JavascriptInterface
    public String sss(String str) {
        Object obj = C0864v.f1800j.get(str);
        if (obj != null) {
            return m3215y(obj);
        }
        return null;
    }

    @JavascriptInterface
    public void sss(String str, String str2) {
        C0864v.f1800j.put(str, str2);
    }

    @JavascriptInterface
    public void sssBoolean(String str, boolean z) {
        C0864v.f1800j.put(str, Boolean.valueOf(z));
    }

    @JavascriptInterface
    public void sssNumber(String str, double d) {
        C0864v.f1800j.put(str, Double.valueOf(d));
    }

    @JavascriptInterface
    public void sssNumber(String str, long j) {
        C0864v.f1800j.put(str, Long.valueOf(j));
    }

    @JavascriptInterface
    public String stobm(String str, String str2) {
        return C0860r.m2038B(str, str2);
    }

    @JavascriptInterface
    public void stop(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @JavascriptInterface
    public String strim(String str) {
        return str.trim();
    }

    @JavascriptInterface
    public String supper(String str) {
        return str.toUpperCase();
    }

    @JavascriptInterface
    public String sutf8to(String str) {
        return C0860r.m2040D(str);
    }

    @JavascriptInterface
    public int swh(String str) {
        if (str.equals("w")) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return C0860r.m2064w(this.f2586c, (float) displayMetrics.widthPixels);
        } else if (str.equals("h")) {
            WindowManager.LayoutParams attributes = this.f2585b.getWindow().getAttributes();
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            return (attributes.flags & 1024) == 1024 ? C0860r.m2064w(this.f2586c, (float) displayMetrics2.heightPixels) : C0860r.m2064w(this.f2586c, (float) (displayMetrics2.heightPixels - m3171A()));
        } else if (str.equals("pxw")) {
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics3);
            return displayMetrics3.widthPixels;
        } else if (str.equals("pxh")) {
            WindowManager.LayoutParams attributes2 = this.f2585b.getWindow().getAttributes();
            DisplayMetrics displayMetrics4 = new DisplayMetrics();
            this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics4);
            return (attributes2.flags & 1024) == 1024 ? displayMetrics4.heightPixels : displayMetrics4.heightPixels - m3171A();
        } else if (str.equals("pxhh")) {
            DisplayMetrics displayMetrics5 = new DisplayMetrics();
            this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics5);
            return displayMetrics5.heightPixels;
        } else if (str.equals("hh")) {
            DisplayMetrics displayMetrics6 = new DisplayMetrics();
            this.f2585b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics6);
            return C0860r.m2064w(this.f2586c, (float) displayMetrics6.heightPixels);
        } else if (str.equals("pxztl")) {
            return m3172B();
        } else {
            if (str.equals("pxbvk")) {
                return m3209s();
            }
            if (str.equals("ztl")) {
                return C0860r.m2064w(this.f2586c, (float) m3172B());
            }
            if (str.equals("bvk")) {
                return C0860r.m2064w(this.f2586c, (float) m3209s());
            }
            return 0;
        }
    }

    @JavascriptInterface
    public void sxb(String str) {
        ((ClipboardManager) this.f2586c.getSystemService("clipboard")).setText(str);
    }

    @JavascriptInterface
    public void syso(String str) {
        C0864v.m2157O2(str);
    }

    @JavascriptInterface
    /* renamed from: t */
    public void mo10940t(String str) {
        if (str != null) {
            C1207z zVar = new C1207z(str);
            zVar.setName("CeShi_" + zVar.getId());
            zVar.start();
        }
    }

    @JavascriptInterface
    public int tcc(String str, String str2) {
        Object x = m3214x(str);
        if (!(x instanceof Bitmap)) {
            return -1;
        }
        if (str2.equals("w")) {
            return ((Bitmap) x).getWidth();
        }
        if (str2.equals("h")) {
            return ((Bitmap) x).getHeight();
        }
        return -1;
    }

    @JavascriptInterface
    public String tfz(String str, String str2) {
        Bitmap bitmap;
        int i;
        Object x = m3214x(str);
        if (!(x instanceof Bitmap)) {
            return null;
        }
        if (str2.equals("x")) {
            bitmap = (Bitmap) x;
            i = 0;
        } else if (!str2.equals("y")) {
            return null;
        } else {
            bitmap = (Bitmap) x;
            i = 1;
        }
        return m3184N("tfz", C0849k.m1966f(bitmap, i));
    }

    @JavascriptInterface
    public String time(String str) {
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

    @JavascriptInterface
    public String tot(String str) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null && (r instanceof ImageView)) {
            return m3184N("tot", C0849k.m1961a((ImageView) r));
        }
        return null;
    }

    @JavascriptInterface
    public String tsf(String str, float f) {
        Object x = m3214x(str);
        if (x instanceof Bitmap) {
            return m3184N("tsf", C0849k.m1964d((Bitmap) x, f));
        }
        return null;
    }

    @JavascriptInterface
    public String tsf(String str, int i, int i2) {
        Object x = m3214x(str);
        if (x instanceof Bitmap) {
            return m3184N("tsf", C0849k.m1965e((Bitmap) x, i, i2));
        }
        return null;
    }

    @JavascriptInterface
    public String tts() {
        return m3184N("tts", new C1349p(this.f2586c));
    }

    @JavascriptInterface
    public String tts(String str, String str2) {
        C1349p pVar = (C1349p) m3214x(str);
        if (str2.equals("re")) {
            pVar.mo11995h();
            return null;
        } else if (str2.equals("sp")) {
            return String.valueOf(pVar.mo11997j());
        } else {
            if (str2.equals("ip")) {
                return String.valueOf(pVar.mo11991d());
            }
            if (str2.equals("is")) {
                return "true";
            }
            if (str2.equals("zt")) {
                return String.valueOf(pVar.mo11990c());
            }
            return null;
        }
    }

    @JavascriptInterface
    public String tts(String str, String str2, float f, float f2) {
        return m3184N("tts", new C1349p(this.f2586c, str, str2, f, f2));
    }

    @JavascriptInterface
    public void tts(String str, String str2, String str3) {
        C1349p pVar = (C1349p) m3214x(str);
        if (str2.equals("ph")) {
            pVar.mo11993f(Float.parseFloat(str3));
        } else if (str2.equals("se")) {
            pVar.mo11994g(Float.parseFloat(str3));
        } else if (str2.equals("lg")) {
            pVar.mo11992e(str3);
        } else if (str2.equals("st")) {
            pVar.mo11996i(str2, Integer.parseInt(str3));
        } else if (str2.equals("ft")) {
            pVar.mo11998k(str2, m3173C(str3));
        }
    }

    @JavascriptInterface
    /* renamed from: tw */
    public void mo10951tw(String str) {
        this.f2589f.post(new RunnableC1155g0(str));
    }

    @JavascriptInterface
    /* renamed from: tw */
    public void mo10952tw(String str, int i) {
        this.f2589f.post(new RunnableC1188r0(str, i));
    }

    @JavascriptInterface
    public String tzz(String str, float f) {
        Object x = m3214x(str);
        if (x instanceof Bitmap) {
            return m3184N("tzz", C0849k.m1967g((Bitmap) x, f));
        }
        return null;
    }

    @JavascriptInterface
    public String uall(String str, boolean z) {
        Object x = m3214x(str);
        if (!(x instanceof ViewGroup)) {
            x = m3208r(x, String.valueOf(x));
        }
        ViewGroup viewGroup = (ViewGroup) x;
        StringBuffer stringBuffer = null;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            Object N = z ? m3184N("uall", childAt) : Integer.valueOf(childAt.getId());
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            } else {
                stringBuffer.append("\n\\\r");
            }
            stringBuffer.append(N);
        }
        if (stringBuffer == null) {
            return null;
        }
        return stringBuffer.toString();
    }

    @JavascriptInterface
    public boolean uapp(String str) {
        return C0835f.m1859p(this.f2586c, str);
    }

    @JavascriptInterface
    public boolean uapp(String str, String str2) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, str2));
            this.f2586c.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0011 A[SYNTHETIC] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String uapplist(boolean r9) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.uapplist(boolean):java.lang.String");
    }

    @JavascriptInterface
    public void ucall(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        Context context = this.f2586c;
        intent.setData(C0851m.m1977c(context, "tel:" + str));
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public void ufnsui(String str) {
        if (str != null) {
            Message message = new Message();
            message.what = 2;
            message.obj = str;
            this.f2589f.sendMessage(message);
        }
    }

    @JavascriptInterface
    /* renamed from: ug */
    public String mo10960ug(String str, String str2) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r == null) {
            return null;
        }
        return m3179I("ug", new C1305g(r, this.f2586c).mo11842e(str2));
    }

    @JavascriptInterface
    /* renamed from: ug */
    public String mo10961ug(String str, String str2, String str3) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r == null) {
            return null;
        }
        return m3179I("ug", new C1305g(r, this.f2586c).mo11847f(str2, str3));
    }

    @JavascriptInterface
    public void uigo(String str) {
        Intent intent;
        if (str.endsWith(".iyu")) {
            intent = new Intent(this.f2586c, mian.class);
        } else if (str.endsWith(".ijava")) {
            intent = new Intent(this.f2586c, main3.class);
        } else if (str.endsWith(".ilua")) {
            intent = new Intent(this.f2586c, main.class);
        } else if (str.endsWith(".ijs")) {
            intent = new Intent(this.f2586c, main2.class);
        } else {
            return;
        }
        intent.putExtras(C0839h.m1886B(str));
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public void uigo(String str, int i) {
        Intent intent;
        if (str.endsWith(".iyu")) {
            intent = new Intent(this.f2586c, mian.class);
        } else if (str.endsWith(".ijava")) {
            intent = new Intent(this.f2586c, main3.class);
        } else if (str.endsWith(".ilua")) {
            intent = new Intent(this.f2586c, main.class);
        } else if (str.endsWith(".ijs")) {
            intent = new Intent(this.f2586c, main2.class);
        } else {
            return;
        }
        intent.putExtras(C0839h.m1886B(str));
        intent.setFlags(i);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public void uit(String str) {
        this.f2586c.startActivity((Intent) m3214x(str));
    }

    @JavascriptInterface
    public void uit(String str, String str2, String str3) {
        Context context;
        Intent intent = (Intent) m3214x(str);
        if (str2.equals("chooser")) {
            context = this.f2586c;
            intent = Intent.createChooser(intent, str3);
        } else if (str2.equals("result")) {
            this.f2585b.startActivityForResult(intent, Integer.parseInt(str3));
            return;
        } else {
            context = this.f2586c;
        }
        context.startActivity(intent);
    }

    @JavascriptInterface
    public void ujp(String str, int i) {
        C0862t.m2076a(this.f2585b, m3173C(str), i);
    }

    @JavascriptInterface
    public String ula(String str, String str2) {
        Object x = m3214x(str);
        if (str2 == null || str2.equals("clear")) {
            if (x == null || !(x instanceof C1195t1)) {
                return null;
            }
            ((C1195t1) x).mo11081b().clear();
            return null;
        } else if (!str2.equals("list")) {
            return null;
        } else {
            return m3184N("ula", ((x == null || !(x instanceof C1195t1)) ? new C1195t1(this.f2586c) : (C1195t1) x).mo11081b());
        }
    }

    @JavascriptInterface
    public String ula(String str, String str2, String str3) {
        Object x = m3214x(str);
        String[] F = m3176F(str2);
        String[] F2 = m3176F(str3);
        int length = F.length;
        C1195t1 t1Var = (x == null || !(x instanceof C1195t1)) ? new C1195t1(this.f2586c) : (C1195t1) x;
        HashMap<Integer, Object> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            hashMap.put(Integer.valueOf(Integer.parseInt(F[i])), F2[i]);
        }
        t1Var.mo11080a(hashMap);
        return (str == null || !str.startsWith("^")) ? m3184N("ula", t1Var) : main2.set(str, t1Var);
    }

    @JavascriptInterface
    public void ula(String str) {
        this.f2589f.post(new RunnableC1151f(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if ((r5 instanceof com.iapp.app.Aid_jsCode.C1195t1) != false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String ulag(java.lang.String r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.m3214x(r5)
            boolean r0 = r5 instanceof p013b.p044b.p045a.p046a.C0836g
            java.lang.String r1 = "ulag"
            if (r0 == 0) goto L_0x001f
            b.b.a.a.g r5 = (p013b.p044b.p045a.p046a.C0836g) r5
            java.util.ArrayList r5 = r5.mo8931q()
            java.lang.Object r5 = r5.get(r6)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r7)
        L_0x001a:
            java.lang.String r5 = r4.m3179I(r1, r5)
            return r5
        L_0x001f:
            boolean r0 = r5 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0038
            java.util.ArrayList r5 = (java.util.ArrayList) r5
        L_0x0025:
            java.lang.Object r5 = r5.get(r6)
            java.util.HashMap r5 = (java.util.HashMap) r5
            int r6 = java.lang.Integer.parseInt(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r5 = r5.get(r6)
            goto L_0x001a
        L_0x0038:
            boolean r0 = r5 instanceof android.widget.AbsListView
            r2 = 0
            if (r0 == 0) goto L_0x004f
            android.widget.AbsListView r5 = (android.widget.AbsListView) r5
            java.lang.Object r5 = r5.getTag()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r0 = 3
            r3 = r5[r0]
            boolean r3 = r3 instanceof com.iapp.app.Aid_jsCode.C1195t1
            if (r3 == 0) goto L_0x0056
            r5 = r5[r0]
            goto L_0x0053
        L_0x004f:
            boolean r0 = r5 instanceof com.iapp.app.Aid_jsCode.C1195t1
            if (r0 == 0) goto L_0x0056
        L_0x0053:
            com.iapp.app.Aid_jsCode$t1 r5 = (com.iapp.app.Aid_jsCode.C1195t1) r5
            goto L_0x0057
        L_0x0056:
            r5 = r2
        L_0x0057:
            if (r5 != 0) goto L_0x005a
            return r2
        L_0x005a:
            java.util.ArrayList r5 = r5.mo11081b()
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.ulag(java.lang.String, int, java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public String ulag(String str, String str2) {
        Object x = m3214x(str);
        if (x instanceof View) {
            Object[] objArr = (Object[]) ((View) x).getTag();
            if (objArr[3] instanceof HashMap) {
                return m3179I("ulag", ((HashMap) objArr[3]).get(Integer.valueOf(Integer.parseInt(str2))));
            }
            return null;
        } else if (x instanceof HashMap) {
            return m3179I("ulag", ((HashMap) x).get(str2));
        } else {
            if (x instanceof ArrayList) {
                return m3184N("ulag", ((ArrayList) x).get(Integer.parseInt(str2)));
            }
            return null;
        }
    }

    @JavascriptInterface
    public void ulas(String str, int i, int i2, String str2) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        C1195t1 t1Var = null;
        if (x instanceof AbsListView) {
            Object[] objArr = (Object[]) ((AbsListView) x).getTag();
            if (objArr[3] instanceof C1195t1) {
                t1Var = (C1195t1) objArr[3];
            }
        } else if (x instanceof C1195t1) {
            t1Var = (C1195t1) x;
        }
        if (t1Var != null) {
            t1Var.mo11081b().get(i).put(Integer.valueOf(i2), x2);
        }
    }

    @JavascriptInterface
    public void ulas(String str, int i, String str2) {
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        if (x instanceof View) {
            Object[] objArr = (Object[]) ((View) x).getTag();
            if (objArr[3] instanceof HashMap) {
                ((HashMap) objArr[3]).put(Integer.valueOf(i), x2);
            }
        }
    }

    @JavascriptInterface
    public void uls(String str, String str2) {
        Handler handler;
        Runnable iVar;
        Object x = m3214x(str);
        Object F = str2.contains("\n\\\r") ? m3176F(str2) : m3214x(str2);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null && (r instanceof Spinner)) {
            Spinner spinner = (Spinner) r;
            if (F instanceof ArrayList) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(this.f2586c, 17367048, (ArrayList) F);
                arrayAdapter.setDropDownViewResource(17367049);
                handler = this.f2589f;
                iVar = new RunnableC1154g(this, spinner, arrayAdapter);
            } else if (F instanceof String[]) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.f2586c, 17367048, (String[]) F);
                arrayAdapter2.setDropDownViewResource(17367049);
                handler = this.f2589f;
                iVar = new RunnableC1157h(this, spinner, arrayAdapter2);
            } else if (F instanceof Object[]) {
                ArrayAdapter arrayAdapter3 = new ArrayAdapter(this.f2586c, 17367048, (Object[]) F);
                arrayAdapter3.setDropDownViewResource(17367049);
                handler = this.f2589f;
                iVar = new RunnableC1160i(this, spinner, arrayAdapter3);
            } else {
                return;
            }
            handler.post(iVar);
        }
    }

    @JavascriptInterface
    public void uls(String str, String str2, String str3) {
        Handler handler;
        Runnable runnable;
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null) {
            if (r instanceof ListView) {
                ListView listView = (ListView) r;
                if (x2 instanceof C1195t1) {
                    C1195t1 t1Var = (C1195t1) x2;
                    t1Var.mo11082c(str3);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = t1Var;
                    listView.setTag(objArr);
                    handler = this.f2589f;
                    runnable = new RunnableC1163j(this, listView, t1Var);
                } else {
                    return;
                }
            } else if (r instanceof GridView) {
                GridView gridView = (GridView) r;
                if (x2 instanceof C1195t1) {
                    C1195t1 t1Var2 = (C1195t1) x2;
                    t1Var2.mo11082c(str3);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = t1Var2;
                    gridView.setTag(objArr2);
                    handler = this.f2589f;
                    runnable = new RunnableC1169l(this, gridView, t1Var2);
                } else {
                    return;
                }
            } else {
                return;
            }
            handler.post(runnable);
        }
    }

    @JavascriptInterface
    public void uls(String str, String str2, String str3, int i, int i2) {
        Runnable runnable;
        Handler handler;
        Object x = m3214x(str);
        Object x2 = m3214x(str2);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null) {
            if (r instanceof ListView) {
                ListView listView = (ListView) r;
                if (x2 instanceof C1195t1) {
                    C1195t1 t1Var = (C1195t1) x2;
                    t1Var.mo11082c(str3);
                    t1Var.mo11083d(i, i2);
                    Object[] objArr = (Object[]) listView.getTag();
                    objArr[3] = t1Var;
                    listView.setTag(objArr);
                    handler = this.f2589f;
                    runnable = new RunnableC1172m(this, listView, t1Var);
                } else {
                    return;
                }
            } else if (r instanceof GridView) {
                GridView gridView = (GridView) r;
                if (x2 instanceof C1195t1) {
                    C1195t1 t1Var2 = (C1195t1) x2;
                    t1Var2.mo11082c(str3);
                    t1Var2.mo11083d(i, i2);
                    Object[] objArr2 = (Object[]) gridView.getTag();
                    objArr2[3] = t1Var2;
                    gridView.setTag(objArr2);
                    handler = this.f2589f;
                    runnable = new RunnableC1175n(this, gridView, t1Var2);
                } else {
                    return;
                }
            } else {
                return;
            }
            handler.post(runnable);
        }
    }

    @JavascriptInterface
    public void uninapp(String str) {
        Context context = this.f2586c;
        this.f2586c.startActivity(new Intent("android.intent.action.DELETE", C0851m.m1977c(context, "package:" + str)));
    }

    @JavascriptInterface
    public String uqr(String str) {
        try {
            new C0853o(this.f2586c, this.f2585b).mo8949b(Integer.parseInt(str));
            return null;
        } catch (NumberFormatException unused) {
            Object x = m3214x(str);
            return (x instanceof Bitmap ? new C0853o(this.f2586c, this.f2585b).mo8951d((Bitmap) x) : new C0853o(this.f2586c, this.f2585b).mo8952e(m3173C(String.valueOf(x)))).mo8696f();
        }
    }

    @JavascriptInterface
    public String uqr(String str, int i) {
        return m3184N("uqr", new C0853o(this.f2586c, this.f2585b).mo8950c(str, i));
    }

    @JavascriptInterface
    public void uqr() {
        new C0853o(this.f2586c, this.f2585b).mo8948a();
    }

    @JavascriptInterface
    public void urvw(String str) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r != null) {
            this.f2589f.post(new RunnableC1197u(this, (ViewGroup) r.getParent(), r));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    @android.webkit.JavascriptInterface
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10982us(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.mo10982us(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    @android.webkit.JavascriptInterface
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10983us(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            java.lang.Object r11 = r10.m3214x(r11)
            boolean r0 = r11 instanceof android.view.View
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000f
            android.view.View r11 = (android.view.View) r11
        L_0x000c:
            r5 = r11
            r6 = 0
            goto L_0x0051
        L_0x000f:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0 = 46
            int r0 = r11.indexOf(r0)
            r3 = -1
            if (r0 == r3) goto L_0x0046
            java.lang.String r3 = r11.substring(r2, r0)
            int r0 = r0 + r1
            java.lang.String r11 = r11.substring(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.iapp.app.Aid_jsCode.f2582g
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.app.Activity r3 = r10.f2585b
            int r11 = java.lang.Integer.parseInt(r11)
            int r11 = r11 + r0
            android.view.View r11 = r3.findViewById(r11)
            goto L_0x0043
        L_0x0041:
            r11 = 0
            r0 = 0
        L_0x0043:
            r5 = r11
            r6 = r0
            goto L_0x0051
        L_0x0046:
            android.app.Activity r0 = r10.f2585b
            int r11 = java.lang.Integer.parseInt(r11)
            android.view.View r11 = r0.findViewById(r11)
            goto L_0x000c
        L_0x0051:
            if (r5 != 0) goto L_0x0054
            return r2
        L_0x0054:
            android.os.Handler r11 = r10.f2589f
            com.iapp.app.Aid_jsCode$n1 r0 = new com.iapp.app.Aid_jsCode$n1
            r3 = r0
            r4 = r10
            r7 = r12
            r8 = r13
            r9 = r14
            r3.<init>(r5, r6, r7, r8, r9)
            r11.post(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.mo10983us(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    @android.webkit.JavascriptInterface
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10984us(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.mo10984us(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    @android.webkit.JavascriptInterface
    /* renamed from: us */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10985us(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.mo10985us(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    @JavascriptInterface
    public String usg(String str, boolean z) {
        Exception e;
        if (Build.VERSION.SDK_INT >= 23) {
            return main2.set(str, C0862t.m2084i(this.f2586c, z));
        }
        Object x = m3214x(str);
        Camera camera = null;
        Camera camera2 = x == null ? null : (Camera) x;
        if (z) {
            try {
                camera = Camera.open();
                try {
                    m3190T(camera);
                } catch (Exception e2) {
                    e = e2;
                    camera2 = camera;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                camera = camera2;
                if (str != null) {
                }
            }
        } else if (camera2 == null) {
            return null;
        } else {
            m3189S(camera2);
            camera2.release();
        }
        return (str != null || !str.startsWith("^")) ? m3184N("usg", camera) : main2.set(str, camera);
    }

    @JavascriptInterface
    public void ushsp(boolean z) {
        Activity activity;
        int i;
        if (!z) {
            i = 1;
            if (this.f2585b.getRequestedOrientation() != 1) {
                activity = this.f2585b;
            } else {
                return;
            }
        } else if (this.f2585b.getRequestedOrientation() != 0) {
            activity = this.f2585b;
            i = 0;
        } else {
            return;
        }
        activity.setRequestedOrientation(i);
    }

    @JavascriptInterface
    public void usjxm(boolean z) {
        if (z) {
            this.f2585b.getWindow().clearFlags(128);
        } else {
            this.f2585b.getWindow().setFlags(128, 128);
        }
    }

    @JavascriptInterface
    public void usms(String str, String str2) {
        Context context = this.f2586c;
        Intent intent = new Intent("android.intent.action.SENDTO", C0851m.m1977c(context, "smsto:" + str));
        intent.putExtra("sms_body", str2);
        this.f2586c.startActivity(intent);
    }

    @JavascriptInterface
    public String usx(String str, String str2) {
        C1319k kVar = (C1319k) m3214x(str);
        if (str2.equals("st")) {
            kVar.mo11966y();
            return null;
        } else if (str2.equals("sp")) {
            kVar.mo11967z();
            return null;
        } else if (str2.equals("re")) {
            kVar.mo11963u();
            return null;
        } else if (str2.equals("getrotaing")) {
            return String.valueOf(kVar.mo11962r());
        } else {
            return null;
        }
    }

    @JavascriptInterface
    public void usx(String str, String str2, String str3) {
        C1319k kVar = (C1319k) m3214x(str);
        if (str2.equals("rotaing")) {
            kVar.mo11964w(Integer.parseInt(str3));
        } else if (str2.equals("usg")) {
            kVar.mo11965x(str3.equals("true"));
        }
    }

    @JavascriptInterface
    public void usx(String str, String str2, String str3, int i, boolean z) {
        C1319k kVar = (C1319k) m3214x(str);
        if (str2.equals("shot")) {
            kVar.mo11961q(m3173C(str3), i, z);
        }
    }

    @JavascriptInterface
    public String usxh(String str, int i) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r instanceof SurfaceView) {
            return m3184N("usxh", new C1319k(this.f2586c, this.f2585b, (SurfaceView) r, false, i));
        }
        return null;
    }

    @JavascriptInterface
    public String usxh(String str, int i, int i2, int i3, int i4) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r instanceof SurfaceView) {
            return m3184N("usxh", new C1319k(this.f2586c, this.f2585b, (SurfaceView) r, false, i, i2, i3, i4));
        }
        return null;
    }

    @JavascriptInterface
    public String usxq(String str, int i) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r instanceof SurfaceView) {
            return m3184N("usxq", new C1319k(this.f2586c, this.f2585b, (SurfaceView) r, true, i));
        }
        return null;
    }

    @JavascriptInterface
    public String usxq(String str, int i, int i2, int i3, int i4) {
        Object x = m3214x(str);
        View r = x instanceof View ? (View) x : m3208r(x, String.valueOf(x));
        if (r instanceof SurfaceView) {
            return m3184N("usxq", new C1319k(this.f2586c, this.f2585b, (SurfaceView) r, true, i, i2, i3, i4));
        }
        return null;
    }

    @JavascriptInterface
    public String utw(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9) {
        Object x = m3214x(str);
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.f2586c).setTitle(str2).setPositiveButton(str4, new DialogInterface$OnClickListenerC1139b(str7)).setNeutralButton(str5, new DialogInterface$OnClickListenerC1136a(str8)).setNegativeButton(str6, new DialogInterface$OnClickListenerC1192s1(str9));
        if (x != null) {
            negativeButton.setIcon(x instanceof Drawable ? (Drawable) x : C1305g.m3582m(String.valueOf(x), this.f2586c));
        }
        Object obj = null;
        if (str3.endsWith(".ijs")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.f2586c);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            try {
                m3181K(str3, linearLayout, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            negativeButton.setView(linearLayout);
            obj = linearLayout;
        } else {
            negativeButton.setMessage(str3);
        }
        AlertDialog create = negativeButton.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return m3184N("utw", obj);
    }

    @JavascriptInterface
    public String utw(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        Object x = m3214x(str);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this.f2586c).setTitle(str2).setPositiveButton(str4, new DialogInterface$OnClickListenerC1145d(str6)).setNeutralButton(str5, new DialogInterface$OnClickListenerC1142c(str7));
        if (x != null) {
            neutralButton.setIcon(x instanceof Drawable ? (Drawable) x : C1305g.m3582m(String.valueOf(x), this.f2586c));
        }
        Object obj = null;
        if (str3.endsWith(".ijs")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.f2586c);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            try {
                m3181K(str3, linearLayout, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            neutralButton.setView(linearLayout);
            obj = linearLayout;
        } else {
            neutralButton.setMessage(str3);
        }
        AlertDialog create = neutralButton.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return m3184N("utw", obj);
    }

    @JavascriptInterface
    public String utw(String str, String str2, String str3, String str4, boolean z, String str5) {
        Object x = m3214x(str);
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f2586c).setTitle(str2).setPositiveButton(str4, new DialogInterface$OnClickListenerC1148e(str5));
        if (x != null) {
            positiveButton.setIcon(x instanceof Drawable ? (Drawable) x : C1305g.m3582m(String.valueOf(x), this.f2586c));
        }
        Object obj = null;
        if (str3.endsWith(".ijs")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.f2586c);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            try {
                m3181K(str3, linearLayout, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            positiveButton.setView(linearLayout);
            obj = linearLayout;
        } else {
            positiveButton.setMessage(str3);
        }
        AlertDialog create = positiveButton.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return m3184N("utw", obj);
    }

    @JavascriptInterface
    public String utw(String str, String str2, String str3, boolean z) {
        Object x = m3214x(str);
        AlertDialog.Builder title = new AlertDialog.Builder(this.f2586c).setTitle(str2);
        if (x != null) {
            title.setIcon(x instanceof Drawable ? (Drawable) x : C1305g.m3582m(String.valueOf(x), this.f2586c));
        }
        if (str3.endsWith(".ijs")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.f2586c);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            try {
                m3181K(str3, linearLayout, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            title.setView(linearLayout);
        } else {
            title.setMessage(str3);
        }
        AlertDialog create = title.create();
        alertdialog = create;
        if (z) {
            create.setCanceledOnTouchOutside(false);
            alertdialog.setCancelable(false);
            create = alertdialog;
        }
        create.show();
        return m3184N("utw", null);
    }

    @JavascriptInterface
    public String uxf(String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, int i7) {
        try {
            LinearLayout linearLayout = new LinearLayout(this.f2586c);
            linearLayout.setOrientation(1);
            int m = m3203m(str.substring(0, str.length() - 4));
            linearLayout.setId(m);
            m3181K(str, linearLayout, m, null);
            View childAt = linearLayout.getChildAt(0);
            linearLayout.removeAllViews();
            this.f2589f.post(new RunnableC1161i0(childAt, i, i2, i3, i4, i5, str2, i6, i7));
            return m3184N("uxf", childAt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @JavascriptInterface
    public String uxf(String str, int i, int i2, String str2) {
        try {
            LinearLayout linearLayout = new LinearLayout(this.f2586c);
            linearLayout.setOrientation(1);
            int m = m3203m(str.substring(0, str.length() - 4));
            linearLayout.setId(m);
            m3181K(str, linearLayout, m, null);
            View childAt = linearLayout.getChildAt(0);
            linearLayout.removeAllViews();
            this.f2589f.post(new RunnableC1149e0(childAt, i, i2, str2));
            return m3184N("uxf", childAt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @JavascriptInterface
    public void uxf(String str) {
        Object x = m3214x(str);
        View view = x instanceof View ? (View) x : null;
        if (view != null) {
            this.f2589f.post(new RunnableC1143c0(view));
        }
    }

    @JavascriptInterface
    public void uxf(String str, String str2) {
        Object x = m3214x(str);
        if (str2.equals("del")) {
            View view = null;
            if (x instanceof View) {
                view = (View) x;
            }
            if (view != null) {
                this.f2589f.post(new RunnableC1146d0(view));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uxf(java.lang.String r2, java.lang.String r3, int r4, int r5, int r6, int r7, int r8, java.lang.String r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.Aid_jsCode.uxf(java.lang.String, java.lang.String, int, int, int, int, int, java.lang.String, int, int):void");
    }

    @JavascriptInterface
    public void uxf(String str, String str2, int i, int i2, int i3, int i4, String str3) {
        Object x = m3214x(str);
        if (str2.equals("set")) {
            View view = null;
            if (x instanceof View) {
                view = (View) x;
            }
            if (view != null) {
                WindowManager windowManager = (WindowManager) this.f2586c.getApplicationContext().getSystemService("window");
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
                layoutParams.gravity = C1305g.m3587t(str3);
                view.setLayoutParams(layoutParams);
                this.f2589f.post(new RunnableC1152f0(this, windowManager, view, layoutParams));
            }
        }
    }

    @JavascriptInterface
    public void uycl(String str, boolean z) {
        this.f2589f.post(new RunnableC1181p(str, z));
    }

    @JavascriptInterface
    public void uycl(String str, boolean z, int i) {
        this.f2589f.post(new RunnableC1184q(str, z, i));
    }

    @JavascriptInterface
    public void uycl(boolean z) {
        this.f2589f.post(new RunnableC1178o(z));
    }

    @JavascriptInterface
    @TargetApi(11)
    public String uzd(String str, String str2) {
        Object x = m3214x(str);
        if (x == null) {
            x = this.f2586c.getSystemService("vibrator");
        }
        Vibrator vibrator = (Vibrator) x;
        if (str2.equals("sp")) {
            try {
                vibrator.cancel();
                return null;
            } catch (Exception unused) {
                return null;
            }
        } else if (str2.equals("ip")) {
            return Build.VERSION.SDK_INT >= 11 ? String.valueOf(vibrator.hasVibrator()) : "false";
        } else {
            vibrator.vibrate(Long.parseLong(str2));
            return (str == null || !str.startsWith("^")) ? m3184N("uzd", vibrator) : main2.set(str, vibrator);
        }
    }

    @JavascriptInterface
    public String uzd(String str, String str2, boolean z) {
        Object x = m3214x(str);
        if (x == null) {
            x = this.f2586c.getSystemService("vibrator");
        }
        Vibrator vibrator = (Vibrator) x;
        String[] F = m3176F(str2);
        int length = F.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Long.parseLong(F[i]);
        }
        vibrator.vibrate(jArr, z ? 1 : -1);
        return (str == null || !str.startsWith("^")) ? m3184N("uzd", vibrator) : main2.set(str, vibrator);
    }

    @JavascriptInterface
    public int zdp(float f) {
        return C0860r.m2053l(this.f2586c, f);
    }

    @JavascriptInterface
    /* renamed from: zj */
    public String mo11013zj(String str) {
        return m3179I("zj", C0839h.m1905n(str, new Object[]{"Activity", this.f2586c}));
    }

    @JavascriptInterface
    /* renamed from: zj */
    public String mo11014zj(String str, String str2) {
        Object[] objArr;
        Object[] G = m3177G(str2);
        if (G == null) {
            objArr = new Object[]{"Activity", this.f2586c};
        } else {
            int length = G.length;
            Object[] objArr2 = new Object[(length + 2)];
            objArr2[0] = "Activity";
            objArr2[1] = this.f2586c;
            for (int i = 0; i < length; i++) {
                objArr2[i + 2] = G[i];
            }
            objArr = objArr2;
        }
        return m3179I("zj", C0839h.m1905n(str, objArr));
    }

    @JavascriptInterface
    public int zpd(float f) {
        return C0860r.m2064w(this.f2586c, f);
    }

    @JavascriptInterface
    public int zps(float f) {
        return C0860r.m2065x(this.f2586c, f);
    }

    @JavascriptInterface
    public int zsp(float f) {
        return C0860r.m2037A(this.f2586c, f);
    }
}
