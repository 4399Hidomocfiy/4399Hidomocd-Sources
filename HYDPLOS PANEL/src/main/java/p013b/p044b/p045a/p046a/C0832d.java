package p013b.p044b.p045a.p046a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import com.iapp.app.Aid_YuCodeX;
import com.iapp.app.Webview;
import com.iapp.app.run.main2;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import org.keplerproject.luajava.LuaObject;

/* renamed from: b.b.a.a.d */
public class C0832d {

    /* renamed from: a */
    protected static HashMap<String, Class<?>> f1712a;

    /* renamed from: b */
    private static int f1713b;

    /* renamed from: b.b.a.a.d$a */
    public static class C0833a implements InvocationHandler {

        /* renamed from: a */
        private C0864v f1714a = null;

        /* renamed from: b */
        private Aid_YuCodeX f1715b = null;

        /* renamed from: c */
        private WebView f1716c = null;

        /* renamed from: d */
        private LuaObject f1717d = null;

        /* renamed from: e */
        private String f1718e = null;

        /* renamed from: f */
        private int f1719f = 0;

        /* renamed from: g */
        private int f1720g;

        public C0833a(Object obj, Object obj2) {
            int i;
            C0832d.m1819d();
            this.f1720g = C0832d.f1713b;
            if (obj2 != null) {
                if (obj == null) {
                    if (obj2 instanceof LuaObject) {
                        this.f1717d = (LuaObject) obj2;
                        i = 1;
                    } else {
                        return;
                    }
                } else if (obj instanceof C0864v) {
                    this.f1714a = (C0864v) obj;
                    this.f1718e = obj2.toString();
                    i = 2;
                } else if (obj instanceof Aid_YuCodeX) {
                    this.f1715b = (Aid_YuCodeX) obj;
                    this.f1718e = obj2.toString();
                    i = 4;
                } else if (obj instanceof Webview) {
                    this.f1716c = (WebView) obj;
                    this.f1718e = obj2.toString();
                    i = 3;
                } else {
                    return;
                }
                this.f1719f = i;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            int i = this.f1719f;
            if (i == 2) {
                this.f1714a.mo8981T("st_mD", method);
                this.f1714a.mo8981T("st_aS", objArr);
                this.f1714a.mo8984e(this.f1718e);
                return null;
            } else if (i == 4) {
                this.f1715b.dim("st_mD", method);
                this.f1715b.dim("st_aS", objArr);
                this.f1715b.YuGo(this.f1718e);
                return null;
            } else if (i == 1) {
                this.f1717d.callNoErr(method, objArr);
                return null;
            } else if (i != 3) {
                return null;
            } else {
                WebView webView = this.f1716c;
                StringBuilder sb = new StringBuilder();
                sb.append("javascript:{\nvar functionItme = ");
                sb.append(this.f1718e);
                sb.append(";\nfunctionItme('");
                sb.append(main2.set("^_InvocationHandler_" + this.f1720g + "_st_mD", method));
                sb.append("', '");
                sb.append(main2.set("^_InvocationHandler_" + this.f1720g + "_st_aS", objArr));
                sb.append("');\n}");
                webView.loadUrl(sb.toString());
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Class<?> m1816a(String str) {
        if (f1712a == null) {
            m1827l();
        }
        Class<?> cls = null;
        try {
            cls = Class.forName(str);
            f1712a.put(str, cls);
            return cls;
        } catch (Exception e) {
            e.printStackTrace();
            return cls;
        }
    }

    /* renamed from: b */
    public static Class<?> m1817b(String str) {
        if (f1712a == null) {
            m1827l();
        }
        Class<?> cls = f1712a.get(str);
        if (cls == null) {
            try {
                cls = Class.forName(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (cls == null) {
                return null;
            }
            f1712a.put(str, cls);
        }
        return cls;
    }

    /* renamed from: d */
    static /* synthetic */ int m1819d() {
        int i = f1713b;
        f1713b = i + 1;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6 A[SYNTHETIC, Splitter:B:38:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb A[Catch:{ IllegalAccessException -> 0x00dc, IllegalArgumentException -> 0x00d7, InvocationTargetException -> 0x00d2 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m1820e(android.content.Context r17, java.lang.Object r18, java.lang.Class<?> r19, java.lang.String r20, java.lang.Object[] r21, java.lang.Object r22, java.lang.Object r23) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0832d.m1820e(android.content.Context, java.lang.Object, java.lang.Class, java.lang.String, java.lang.Object[], java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: f */
    public static Object m1821f(Context context, Object obj, String str, String str2, Object[] objArr, Object obj2, Object obj3) {
        return m1820e(context, obj, m1817b(str), str2, objArr, obj2, obj3);
    }

    /* renamed from: g */
    public static Object m1822g(Context context, Object obj, String str, Object[] objArr, Object obj2, Object obj3) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = str.substring(0, lastIndexOf);
        return m1820e(context, obj, m1817b(substring), str.substring(lastIndexOf + 1), objArr, obj2, obj3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e A[SYNTHETIC, Splitter:B:27:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[Catch:{ IllegalArgumentException -> 0x0074, IllegalAccessException -> 0x006f, InvocationTargetException -> 0x006a }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m1823h(java.lang.Object r10, java.lang.Class<?> r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0832d.m1823h(java.lang.Object, java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: i */
    public static Object m1824i(Object obj, Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static Object m1825j(Object obj, String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return m1826k(obj, str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1));
    }

    /* renamed from: k */
    public static Object m1826k(Object obj, String str, String str2) {
        return m1824i(obj, m1817b(str), str2);
    }

    @TargetApi(14)
    /* renamed from: l */
    public static void m1827l() {
        f1712a = new HashMap<>(0);
        Class<?>[] clsArr = {Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE, Boolean.class, Byte.class, Character.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Void.class, Number.class, String.class, Object.class, CharSequence.class, File.class, Class.class, Context.class, Activity.class, AccessibilityEvent.class, boolean[].class, byte[].class, char[].class, short[].class, int[].class, long[].class, float[].class, double[].class, Boolean[].class, Byte[].class, Character[].class, Short[].class, Integer[].class, Long[].class, Float[].class, Double[].class, Number[].class, String[].class, Object[].class, CharSequence[].class, File[].class, Class[].class, Context[].class, Activity[].class};
        String[] strArr = {"boolean", "byte", "char", "short", "int", "long", "float", "double", "void", "Boolean", "Byte", "Character", "Short", "Integer", "Long", "Float", "Double", "Void", "Number", "String", "Object", "CharSequence", "File", "Class", "Context", "Activity", "AccessibilityEvent", "boolean[]", "byte[]", "char[]", "short[]", "int[]", "long[]", "float[]", "double[]", "Boolean[]", "Byte[]", "Character[]", "Short[]", "Integer[]", "Long[]", "Float[]", "Number[]", "Double[]", "String[]", "Object[]", "CharSequence[]", "File[]", "Class[]", "Context[]", "Activity[]"};
        for (int i = 0; i < 51; i++) {
            f1712a.put(strArr[i], clsArr[i]);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            f1712a.put("AccessibilityNodeInfo", AccessibilityNodeInfo.class);
        }
    }

    /* renamed from: m */
    public static Object m1828m(Context context, Class<?> cls, Object[] objArr, Object obj, Object obj2) {
        Constructor<?> constructor;
        NoSuchMethodException e;
        if (objArr == null) {
            try {
                return cls.newInstance();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
                return null;
            }
        } else {
            int length = objArr.length;
            int i = length / 2;
            Class<?>[] clsArr = new Class[i];
            Object[] objArr2 = new Object[i];
            ArrayList arrayList = new ArrayList();
            boolean[] zArr = new boolean[i];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3 += 2) {
                if (objArr[i3] instanceof Class) {
                    clsArr[i2] = (Class) objArr[i3];
                    zArr[i2] = false;
                    objArr2[i2] = m1834s(clsArr[i2], objArr[i3 + 1]);
                } else {
                    String obj3 = objArr[i3].toString();
                    if (obj3.indexOf(46) == 0) {
                        clsArr[i2] = m1817b(obj3.substring(1));
                        arrayList.add(clsArr[i2]);
                        zArr[i2] = true;
                    } else {
                        clsArr[i2] = m1817b(obj3);
                        zArr[i2] = false;
                        objArr2[i2] = m1834s(clsArr[i2], objArr[i3 + 1]);
                    }
                }
                i2++;
            }
            int size = arrayList.size();
            if (size > 0) {
                Object newProxyInstance = Proxy.newProxyInstance(context.getClassLoader(), (Class[]) arrayList.toArray(new Class[size]), new C0833a(obj, obj2));
                for (int i4 = 0; i4 < i; i4++) {
                    if (zArr[i4]) {
                        objArr2[i4] = newProxyInstance;
                    }
                }
            }
            try {
                constructor = cls.getDeclaredConstructor(clsArr);
                try {
                    constructor.setAccessible(true);
                } catch (NoSuchMethodException e4) {
                    e = e4;
                }
            } catch (NoSuchMethodException e5) {
                e = e5;
                constructor = null;
                e.printStackTrace();
                return constructor.newInstance(objArr2);
            }
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalArgumentException e6) {
                e6.printStackTrace();
                return null;
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: n */
    public static Object m1829n(Context context, String str, Object[] objArr, Object obj, Object obj2) {
        return m1828m(context, m1817b(str), objArr, obj, obj2);
    }

    /* renamed from: o */
    public static Object m1830o(ClassLoader classLoader, Class<?> cls, Object obj, Object obj2) {
        return Proxy.newProxyInstance(classLoader, new Class[]{cls}, new C0833a(obj, obj2));
    }

    /* renamed from: p */
    public static Object m1831p(Object obj, String str, Object obj2) {
        int lastIndexOf = str.lastIndexOf(46);
        return Boolean.valueOf(m1833r(obj, str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1), obj2));
    }

    /* renamed from: q */
    public static boolean m1832q(Object obj, Class<?> cls, String str, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj3 = declaredField.get(obj);
            if (obj3 != null) {
                obj2 = m1834s(obj3.getClass(), obj2);
            }
            declaredField.set(obj, obj2);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: r */
    public static boolean m1833r(Object obj, String str, String str2, Object obj2) {
        return m1832q(obj, m1817b(str), str2, obj2);
    }

    /* renamed from: s */
    private static Object m1834s(Class<?> cls, Object obj) {
        if (cls == Integer.TYPE || cls == Integer.class) {
            return obj instanceof Integer ? Integer.valueOf(((Integer) obj).intValue()) : obj instanceof Double ? Integer.valueOf((int) Double.parseDouble(obj.toString())) : Integer.valueOf(Integer.parseInt(obj.toString()));
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return obj instanceof Double ? Double.valueOf(((Double) obj).doubleValue()) : Double.valueOf(Double.parseDouble(obj.toString()));
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return obj instanceof Long ? Long.valueOf(((Long) obj).longValue()) : obj instanceof Double ? Long.valueOf((long) Double.parseDouble(obj.toString())) : Long.valueOf(Long.parseLong(obj.toString()));
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return obj instanceof Float ? Float.valueOf(((Float) obj).floatValue()) : Float.valueOf(Float.parseFloat(obj.toString()));
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return obj instanceof Boolean ? Boolean.valueOf(((Boolean) obj).booleanValue()) : Boolean.valueOf(obj.equals("true"));
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return obj instanceof Byte ? Byte.valueOf(((Byte) obj).byteValue()) : obj instanceof Double ? Byte.valueOf((byte) ((int) Double.parseDouble(obj.toString()))) : Byte.valueOf(Byte.parseByte(obj.toString()));
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return obj instanceof Character ? Character.valueOf(((Character) obj).charValue()) : Character.valueOf(obj.toString().charAt(0));
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return obj instanceof Short ? Short.valueOf(((Short) obj).shortValue()) : obj instanceof Double ? Short.valueOf((short) ((int) Double.parseDouble(obj.toString()))) : Short.valueOf(Short.parseShort(obj.toString()));
        }
        try {
            return !obj.getClass().equals(cls) ? cls.cast(obj) : obj;
        } catch (Exception e) {
            e.printStackTrace();
            return obj;
        }
    }
}
