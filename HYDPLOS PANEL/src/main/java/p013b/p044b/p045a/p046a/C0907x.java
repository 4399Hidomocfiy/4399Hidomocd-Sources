package p013b.p044b.p045a.p046a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: b.b.a.a.x */
public class C0907x {
    public C0907x() {
        Pattern.compile("classes(?:[2-9]?|[1-9][0-9]+)\\.dex(\\.jar)?");
    }

    /* renamed from: a */
    private Object m2368a(Object obj, Object obj2) {
        Class<?> componentType = obj.getClass().getComponentType();
        int length = Array.getLength(obj) + 1;
        Object newInstance = Array.newInstance(componentType, length);
        Array.set(newInstance, 0, obj2);
        for (int i = 1; i < length; i++) {
            Array.set(newInstance, i, Array.get(obj, i - 1));
        }
        return newInstance;
    }

    /* renamed from: b */
    private Object m2369b(Object obj, Object obj2) {
        Class<?> componentType = obj2.getClass().getComponentType();
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj) + length;
        Object newInstance = Array.newInstance(componentType, length2);
        int i = 0;
        while (i < length2) {
            Array.set(newInstance, i, i < length ? Array.get(obj2, i) : Array.get(obj, i - length));
            i++;
        }
        return newInstance;
    }

    /* renamed from: c */
    private Object m2370c(Object obj) {
        return m2371d(obj, obj.getClass(), "dexElements");
    }

    /* renamed from: d */
    private Object m2371d(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: e */
    private Object m2372e(Object obj) {
        return m2371d(obj, Class.forName("dalvik.system.BaseDexClassLoader"), "pathList");
    }

    /* renamed from: f */
    private boolean m2373f() {
        try {
            Class.forName("dalvik.system.BaseDexClassLoader");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: g */
    private boolean m2374g() {
        try {
            Class.forName("dalvik.system.LexClassLoader");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: h */
    private void m2375h(Context context, String str) {
        if (str != null && new File(str).exists()) {
            m2376i(context, str);
        }
    }

    /* renamed from: i */
    private void m2376i(Context context, String str) {
        try {
            if (m2374g()) {
                m2379l(context, str);
            } else if (m2373f()) {
                m2377j(context, str);
            } else {
                m2378k(context, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    private void m2377j(Context context, String str) {
        PathClassLoader pathClassLoader = (PathClassLoader) context.getClassLoader();
        Object b = m2369b(m2370c(m2372e(pathClassLoader)), m2370c(m2372e(new DexClassLoader(str, context.getDir("dex", 0).getAbsolutePath(), str, context.getClassLoader()))));
        Object e = m2372e(pathClassLoader);
        m2380n(e, e.getClass(), "dexElements", b);
    }

    @TargetApi(14)
    /* renamed from: k */
    private void m2378k(Context context, String str) {
        PathClassLoader pathClassLoader = (PathClassLoader) context.getClassLoader();
        DexClassLoader dexClassLoader = new DexClassLoader(str, context.getDir("dex", 0).getAbsolutePath(), str, context.getClassLoader());
        m2380n(pathClassLoader, PathClassLoader.class, "mPaths", m2368a(m2371d(pathClassLoader, PathClassLoader.class, "mPaths"), m2371d(dexClassLoader, DexClassLoader.class, "mRawDexPath")));
        m2380n(pathClassLoader, PathClassLoader.class, "mFiles", m2369b(m2371d(pathClassLoader, PathClassLoader.class, "mFiles"), m2371d(dexClassLoader, DexClassLoader.class, "mFiles")));
        m2380n(pathClassLoader, PathClassLoader.class, "mZips", m2369b(m2371d(pathClassLoader, PathClassLoader.class, "mZips"), m2371d(dexClassLoader, DexClassLoader.class, "mZips")));
        m2380n(pathClassLoader, PathClassLoader.class, "mDexs", m2369b(m2371d(pathClassLoader, PathClassLoader.class, "mDexs"), m2371d(dexClassLoader, DexClassLoader.class, "mDexs")));
    }

    /* renamed from: l */
    private void m2379l(Context context, String str) {
        PathClassLoader pathClassLoader = (PathClassLoader) context.getClassLoader();
        String replaceAll = new File(str).getName().replaceAll("\\.[a-zA-Z0-9]+", ".lex");
        Class<?> cls = Class.forName("dalvik.system.LexClassLoader");
        Constructor<?> constructor = cls.getConstructor(String.class, String.class, String.class, ClassLoader.class);
        Object newInstance = constructor.newInstance(context.getDir("dex", 0).getAbsolutePath() + File.separator + replaceAll, context.getDir("dex", 0).getAbsolutePath(), str, pathClassLoader);
        m2380n(pathClassLoader, PathClassLoader.class, "mPaths", m2368a(m2371d(pathClassLoader, PathClassLoader.class, "mPaths"), m2371d(newInstance, cls, "mRawDexPath")));
        m2380n(pathClassLoader, PathClassLoader.class, "mFiles", m2369b(m2371d(pathClassLoader, PathClassLoader.class, "mFiles"), m2371d(newInstance, cls, "mFiles")));
        m2380n(pathClassLoader, PathClassLoader.class, "mZips", m2369b(m2371d(pathClassLoader, PathClassLoader.class, "mZips"), m2371d(newInstance, cls, "mZips")));
        m2380n(pathClassLoader, PathClassLoader.class, "mLexs", m2369b(m2371d(pathClassLoader, PathClassLoader.class, "mLexs"), m2371d(newInstance, cls, "mDexs")));
    }

    /* renamed from: n */
    private void m2380n(Object obj, Class cls, String str, Object obj2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    /* renamed from: m */
    public void mo9037m(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            String str = context.getFilesDir().getPath() + "/_RunDex";
            new File(str).mkdirs();
            try {
                ZipFile zipFile = new ZipFile(new File(applicationInfo.sourceDir));
                ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
                int i = 2;
                while (entry != null) {
                    String format = String.format("%s/%s", str, entry.getName());
                    InputStream inputStream = zipFile.getInputStream(entry);
                    FileOutputStream fileOutputStream = new FileOutputStream(format);
                    byte[] bArr = new byte[5024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    inputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    m2375h(context, format);
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                }
                zipFile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
