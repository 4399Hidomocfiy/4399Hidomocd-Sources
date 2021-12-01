package p013b.p044b.p045a.p046a;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.p009v4.media.session.PlaybackStateCompat;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.iapp.app.Aid_YuCodeX;
import com.iapp.app.C1293a;
import com.iapp.app.C1294b;
import com.iapp.app.C1470z;
import com.iapp.app.run.mian;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.b.a.a.h */
public class C0839h {

    /* renamed from: a */
    public static int f1737a = 2131230940;

    /* renamed from: b */
    public static int f1738b = 2131427340;

    /* renamed from: c */
    public static int f1739c = 2131558431;

    /* renamed from: d */
    private static long f1740d;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.h$a */
    public static class C0840a implements MediaPlayer.OnCompletionListener {
        C0840a() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.release();
        }
    }

    /* renamed from: A */
    public static void m1885A(Object obj) {
        if (C0864v.f1811u != 0) {
            if (C0864v.f1803m.length() > 6000) {
                C0864v.f1803m = C0864v.f1803m.substring(0, 3000);
            }
            StringBuffer stringBuffer = new StringBuffer("[");
            stringBuffer.append(new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()));
            stringBuffer.append("]  ");
            stringBuffer.append(obj);
            stringBuffer.append('\n');
            stringBuffer.append(C0864v.f1803m);
            C0864v.f1803m = stringBuffer.toString();
            Log.v("ygs", String.valueOf(obj));
            if (C0864v.f1811u == 2) {
                long time = new Date().getTime();
                if (time - f1740d > 1000) {
                    C0835f.m1854k(C0835f.f1721a + "/iApp/Log/" + String.valueOf(C1293a.f3050c) + ".log", C0864v.f1803m);
                    f1740d = time;
                }
            }
        }
    }

    /* renamed from: B */
    public static Bundle m1886B(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("OpenFilexmlui", str);
        return bundle;
    }

    /* renamed from: C */
    public static String m1887C(Context context, String str) {
        return C1294b.m3501h5(context, str.toLowerCase());
    }

    /* renamed from: D */
    public static void m1888D(Object obj, Context context, String str, Object obj2, int i, Object obj3, Object obj4) {
        String lowerCase = str.toLowerCase();
        C1294b.m3500h4(context, lowerCase, obj instanceof Aid_YuCodeX ? lowerCase.endsWith(".iyu") ? new Object[]{obj, obj2, Integer.valueOf(i), obj3, obj4, lowerCase.substring(0, lowerCase.length() - 4)} : new Object[]{obj, obj2, Integer.valueOf(i), obj3, obj4, lowerCase} : new Object[]{obj, obj2, Integer.valueOf(i), obj3, obj4});
    }

    /* renamed from: E */
    public static void m1889E(Context context, Activity activity, String str, String str2) {
        if (mian.f3388sh) {
            new C0864v(context, activity).mo8984e(str2);
            return;
        }
        Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(context, activity);
        int indexOf = str.indexOf(46);
        String substring = str.substring(0, indexOf);
        mian.m4024c(substring, str.substring(indexOf + 1) + str2, aid_YuCodeX);
    }

    /* renamed from: F */
    public static void m1890F(Context context, Activity activity, String[] strArr, Object[] objArr, String str, String str2) {
        if (mian.f3388sh) {
            C0864v vVar = new C0864v(context, activity);
            for (int i = 0; i < objArr.length; i++) {
                vVar.mo8981T(strArr[i].trim(), objArr[i]);
            }
            vVar.mo8984e(str2);
            return;
        }
        Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(context, activity);
        for (int i2 = 0; i2 < objArr.length; i2++) {
            aid_YuCodeX.dim(strArr[i2].trim(), objArr[i2]);
        }
        int indexOf = str.indexOf(46);
        String substring = str.substring(0, indexOf);
        mian.m4024c(substring, str.substring(indexOf + 1) + str2, aid_YuCodeX);
    }

    /* renamed from: G */
    public static void m1891G(Context context, String str) {
        C1294b.m3502h6(context, str.toLowerCase(), C0864v.f1802l);
    }

    /* renamed from: a */
    public static String m1892a(Context context, String str) {
        return C1294b.m3497h(context, str.toLowerCase());
    }

    /* renamed from: b */
    public static Bitmap m1893b(Context context, String str) {
        return str.startsWith("@") ? C0849k.m1962b(context, C0835f.m1857n(context, str)) : C0849k.m1963c(C0835f.m1857n(context, str));
    }

    /* renamed from: c */
    public static Bitmap m1894c(Context context, String str) {
        boolean z;
        InputStream inputStream;
        long j;
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (str == null) {
            return null;
        }
        String n = C0835f.m1857n(context, str);
        int i = 1;
        if (str.startsWith("@")) {
            try {
                inputStream = context.getAssets().open(n);
                j = (long) inputStream.available();
                z = true;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            File file = new File(n);
            if (!file.exists()) {
                return null;
            }
            j = file.length();
            inputStream = null;
            z = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (j >= 67584) {
            i = j < 204800 ? 2 : j < 512000 ? 3 : j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? 5 : 10;
        }
        options.inSampleSize = i;
        options.inDensity = 120;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inJustDecodeBounds = false;
        if (z) {
            try {
                bitmap = BitmapFactory.decodeStream(inputStream, null, options);
            } catch (Throwable unused) {
            }
        } else {
            bitmap = BitmapFactory.decodeFile(n, options);
        }
        bitmap2 = bitmap;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return bitmap2;
    }

    /* renamed from: d */
    public static boolean m1895d(Context context, MediaPlayer mediaPlayer, String str) {
        if (C0860r.m2063v(str.toLowerCase())) {
            try {
                mediaPlayer.setDataSource(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (str.startsWith("@")) {
            AssetFileDescriptor openFd = context.getAssets().openFd(m1906o(context, str));
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
        } else {
            File file = new File(m1906o(context, str));
            if (!file.exists()) {
                return false;
            }
            mediaPlayer.setDataSource(file.getPath());
        }
        try {
            mediaPlayer.prepare();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new C0840a());
        return true;
    }

    /* renamed from: e */
    public static String m1896e(Context context, String str) {
        return C1294b.m3497h(context, str.toLowerCase());
    }

    /* renamed from: f */
    public static boolean m1897f(Context context, String str, String str2, boolean z) {
        boolean startsWith = str.startsWith("@");
        String o = m1906o(context, str);
        return startsWith ? C0835f.m1848e(context, o, m1906o(context, str2), z) : C0835f.m1844a(o, m1906o(context, str2), Boolean.valueOf(z));
    }

    /* renamed from: g */
    public static boolean m1898g(Context context, String str) {
        if (!str.startsWith("@")) {
            return new File(m1906o(context, str)).exists();
        }
        try {
            context.getAssets().open(m1906o(context, str)).close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: h */
    public static String[] m1899h(Context context, String str) {
        if (str.startsWith("@")) {
            try {
                return context.getAssets().list(m1906o(context, str));
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            File file = new File(m1906o(context, str));
            if (file.exists()) {
                return file.list();
            }
            return null;
        }
    }

    /* renamed from: i */
    public static String m1900i(Context context, String str) {
        return str.startsWith("@") ? C0835f.m1849f(context, m1906o(context, str)) : C0835f.m1851h(m1906o(context, str));
    }

    /* renamed from: j */
    public static String m1901j(Context context, String str, String str2) {
        return str.startsWith("@") ? C0835f.m1850g(context, m1906o(context, str), str2) : C0835f.m1852i(m1906o(context, str), str2);
    }

    /* renamed from: k */
    public static long m1902k(Context context, String str) {
        if (str.startsWith("@")) {
            int i = -1;
            try {
                InputStream open = context.getAssets().open(m1906o(context, str));
                i = open.available();
                open.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (long) i;
        }
        File file = new File(m1906o(context, str));
        if (file.exists()) {
            return file.length();
        }
        return -1;
    }

    /* renamed from: l */
    public static int m1903l(Context context, String str, String str2, String str3, boolean z) {
        return str.startsWith("@") ? C0834e.m1839e(context.getAssets().open(m1906o(context, str)), str2, str3, z) : C0834e.m1840f(m1906o(context, str), str2, str3, z);
    }

    /* renamed from: m */
    public static void m1904m(Context context, String str, String str2, boolean z) {
        if (str.startsWith("@")) {
            C0834e.m1841g(context.getAssets().open(m1906o(context, str)), str2, z);
        } else {
            C0834e.m1842h(m1906o(context, str), str2, z);
        }
    }

    /* renamed from: n */
    public static Object m1905n(String str, Object[] objArr) {
        return C0832d.m1823h(null, C1470z.class, str, objArr);
    }

    /* renamed from: o */
    public static String m1906o(Context context, String str) {
        return C0835f.m1857n(context, str);
    }

    /* renamed from: p */
    public static View m1907p(Context context, String str) {
        AssetManager assets = context.getResources().getAssets();
        LayoutInflater from = LayoutInflater.from(context);
        try {
            return from.inflate(assets.openXmlResourceParser("assets/res/" + str), (ViewGroup) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: q */
    public static void m1908q(Object obj, Context context, String str, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6) {
        C1294b.m3500h4(context, str.toLowerCase(), new Object[]{obj, obj2, Integer.valueOf(i), obj3, obj4, obj5, obj6});
    }

    /* renamed from: r */
    public static DexClassLoader m1909r(Context context, String str, ClassLoader classLoader) {
        String str2 = C1293a.m3483a(context) + "_RunDex";
        String str3 = C1293a.m3483a(context) + "_RunDex_";
        C0835f.m1845b(str2, true);
        C0835f.m1845b(str3, true);
        byte[] t = C0835f.m1863t(context.getClassLoader().getResourceAsStream("lib/" + str));
        File file = new File(str3 + "/" + str);
        if (file.exists() && !C0860r.m2046e(t).equals(C0860r.m2046e(C0835f.m1862s(file)))) {
            file.delete();
        }
        if (!file.exists()) {
            C0835f.m1853j(str3 + "/" + str, t);
        }
        return new DexClassLoader(str3 + "/" + str, str2, null, classLoader);
    }

    /* renamed from: s */
    public static void m1910s(String str) {
        System.loadLibrary(str);
    }

    /* renamed from: t */
    public static byte[] m1911t(Context context, String str) {
        return str.startsWith("@") ? C0835f.m1861r(context, m1906o(context, str)) : C0835f.m1864u(m1906o(context, str));
    }

    /* renamed from: u */
    public static void m1912u(Context context, DexClassLoader dexClassLoader) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Class<?> cls2 = Class.forName("android.app.LoadedApk");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mPackages");
            declaredField.setAccessible(true);
            Field declaredField2 = cls2.getDeclaredField("mClassLoader");
            declaredField2.setAccessible(true);
            declaredField2.set(((WeakReference) ((Map) declaredField.get(invoke)).get(context.getPackageName())).get(), dexClassLoader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v */
    public static Bitmap m1913v(Context context, String str) {
        return str.startsWith("@") ? C0849k.m1962b(context, m1906o(context, str)) : C0849k.m1963c(m1906o(context, str));
    }

    /* renamed from: w */
    public static void m1914w(View view, Object obj, HashMap<Integer, Object> hashMap, C0844j jVar) {
        Boolean bool = Boolean.TRUE;
        if (view != null) {
            Object[] objArr = (Object[]) view.getTag();
            objArr[3] = hashMap;
            view.setTag(objArr);
            Drawable drawable = null;
            if (obj == null) {
                if (view instanceof RadioButton) {
                    ((RadioButton) view).setText("");
                } else if (view instanceof CheckBox) {
                    ((CheckBox) view).setText("");
                } else if (view instanceof TextView) {
                    ((TextView) view).setText("");
                } else if (view instanceof ImageView) {
                    ((ImageView) view).setImageDrawable(null);
                }
            } else if (view instanceof RadioButton) {
                if (obj instanceof Boolean) {
                    ((RadioButton) view).setChecked(obj.equals(bool));
                    return;
                }
                String valueOf = String.valueOf(obj);
                boolean startsWith = valueOf.startsWith("(html)");
                RadioButton radioButton = (RadioButton) view;
                CharSequence charSequence = valueOf;
                if (startsWith) {
                    charSequence = Html.fromHtml(valueOf.substring(6));
                }
                radioButton.setText(charSequence);
            } else if (view instanceof CheckBox) {
                if (obj instanceof Boolean) {
                    ((CheckBox) view).setChecked(obj.equals(bool));
                    return;
                }
                String valueOf2 = String.valueOf(obj);
                boolean startsWith2 = valueOf2.startsWith("(html)");
                CheckBox checkBox = (CheckBox) view;
                CharSequence charSequence2 = valueOf2;
                if (startsWith2) {
                    charSequence2 = Html.fromHtml(valueOf2.substring(6));
                }
                checkBox.setText(charSequence2);
            } else if (view instanceof TextView) {
                String valueOf3 = String.valueOf(obj);
                boolean startsWith3 = valueOf3.startsWith("(html)");
                TextView textView = (TextView) view;
                CharSequence charSequence3 = valueOf3;
                if (startsWith3) {
                    charSequence3 = Html.fromHtml(valueOf3.substring(6));
                }
                textView.setText(charSequence3);
            } else if (!(view instanceof ImageView)) {
            } else {
                if (obj instanceof Bitmap) {
                    ((ImageView) view).setImageBitmap((Bitmap) obj);
                } else if (obj instanceof Drawable) {
                    ((ImageView) view).setImageDrawable((Drawable) obj);
                } else if (jVar == null) {
                    ((ImageView) view).setImageBitmap(m1893b(view.getContext(), String.valueOf(obj)));
                } else {
                    ImageView imageView = (ImageView) view;
                    String obj2 = obj.toString();
                    String lowerCase = obj2.toLowerCase();
                    SoftReference<Drawable> softReference = jVar.f1747b.get(lowerCase);
                    if (softReference != null) {
                        drawable = softReference.get();
                    }
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    } else if (lowerCase.startsWith("http:") || lowerCase.startsWith("https:") || lowerCase.startsWith("ftp:")) {
                        jVar.mo8944u(imageView, obj2, lowerCase, true);
                    } else {
                        jVar.mo8942r(imageView, obj2, lowerCase, true);
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public static boolean m1915x(Context context, String str, boolean z) {
        return C0854p.m1986c(context, str, z);
    }

    /* renamed from: y */
    public static boolean m1916y(Context context, String str, boolean z) {
        return C0854p.m1989f(context, str, z);
    }

    /* renamed from: z */
    public static SQLiteDatabase m1917z(Context context, String str, boolean z) {
        return C0854p.m1990g(context, str, z);
    }
}
