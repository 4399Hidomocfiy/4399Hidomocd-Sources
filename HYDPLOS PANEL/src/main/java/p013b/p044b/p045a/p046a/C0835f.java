package p013b.p044b.p045a.p046a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import com.iapp.app.C1293a;
import com.iapp.app.logoActivity;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: b.b.a.a.f */
public class C0835f {

    /* renamed from: a */
    public static String f1721a = Environment.getExternalStorageDirectory().toString();

    /* JADX WARNING: Removed duplicated region for block: B:41:0x006d A[SYNTHETIC, Splitter:B:41:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007e A[SYNTHETIC, Splitter:B:50:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0088 A[SYNTHETIC, Splitter:B:55:0x0088] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1844a(java.lang.String r3, java.lang.String r4, java.lang.Boolean r5) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0835f.m1844a(java.lang.String, java.lang.String, java.lang.Boolean):boolean");
    }

    /* renamed from: b */
    public static boolean m1845b(String str, boolean z) {
        return (z ? new File(str) : new File(new File(str).getParent())).mkdirs();
    }

    /* renamed from: c */
    public static String m1846c(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.packageName;
        }
        return null;
    }

    /* renamed from: d */
    public static String m1847d(Context context, String str) {
        String c;
        File file = new File(str);
        if (!file.exists() || (c = m1846c(context, str)) == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        C0851m.m1975a(context, intent, file, "application/vnd.android.package-archive");
        context.startActivity(intent);
        return c;
    }

    /* renamed from: e */
    public static boolean m1848e(Context context, String str, String str2, boolean z) {
        Throwable th;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        IOException e;
        File file = new File(str2);
        boolean z2 = false;
        if (file.exists()) {
            if (!z) {
                return false;
            }
            file.delete();
        }
        m1845b(str2, false);
        try {
            inputStream = context.getAssets().open(str);
            try {
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
                try {
                    e.printStackTrace();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    inputStream.close();
                    return z2;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileOutputStream.close();
                inputStream.close();
                throw th;
            }
            try {
                byte[] bArr = new byte[512];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                z2 = true;
                try {
                    fileOutputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            } catch (IOException e8) {
                e = e8;
                e.printStackTrace();
                fileOutputStream.close();
                inputStream.close();
                return z2;
            }
        } catch (IOException e9) {
            fileOutputStream = null;
            e = e9;
            inputStream = null;
            e.printStackTrace();
            fileOutputStream.close();
            inputStream.close();
            return z2;
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            inputStream = null;
            fileOutputStream.close();
            inputStream.close();
            throw th;
        }
        return z2;
    }

    /* renamed from: f */
    public static String m1849f(Context context, String str) {
        return m1850g(context, str, "utf-8");
    }

    /* renamed from: g */
    public static String m1850g(Context context, String str, String str2) {
        Throwable th;
        IOException e;
        InputStreamReader inputStreamReader;
        StringBuffer stringBuffer = new StringBuffer();
        InputStreamReader inputStreamReader2 = null;
        try {
            InputStream open = context.getAssets().open(str);
            try {
                inputStreamReader = new InputStreamReader(open, str2);
                try {
                    char[] cArr = new char[512];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read <= 0) {
                            break;
                        }
                        stringBuffer.append(cArr, 0, read);
                    }
                    String str3 = new String(stringBuffer);
                    try {
                        open.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return str3;
                } catch (IOException e4) {
                    e = e4;
                    try {
                        e.printStackTrace();
                        try {
                            open.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        try {
                            inputStreamReader.close();
                            return null;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader2 = inputStreamReader;
                        try {
                            open.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        try {
                            inputStreamReader2.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (IOException e9) {
                e = e9;
                inputStreamReader = null;
                e.printStackTrace();
                open.close();
                inputStreamReader.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                open.close();
                inputStreamReader2.close();
                throw th;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static String m1851h(String str) {
        return m1852i(str, "utf-8");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0061 A[SYNTHETIC, Splitter:B:42:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006b A[SYNTHETIC, Splitter:B:47:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0077 A[SYNTHETIC, Splitter:B:53:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x008d A[SYNTHETIC, Splitter:B:63:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00a4 A[SYNTHETIC, Splitter:B:74:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ae A[SYNTHETIC, Splitter:B:79:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1852i(java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0835f.m1852i(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static boolean m1853j(String str, byte[] bArr) {
        boolean z;
        m1845b(str, false);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                z = true;
            } catch (IOException e) {
                e.printStackTrace();
                z = false;
            }
            try {
                fileOutputStream.close();
                return z;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    /* renamed from: k */
    public static void m1854k(String str, String str2) {
        m1855l(str, str2, "utf-8");
    }

    /* renamed from: l */
    public static void m1855l(String str, String str2, String str3) {
        Throwable th;
        OutputStreamWriter outputStreamWriter;
        UnsupportedEncodingException e;
        FileNotFoundException e2;
        IOException e3;
        File file = new File(str);
        m1845b(str, false);
        try {
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), str3);
            try {
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                try {
                    outputStreamWriter.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (UnsupportedEncodingException e5) {
                e = e5;
                e.printStackTrace();
                outputStreamWriter.close();
            } catch (FileNotFoundException e6) {
                e2 = e6;
                e2.printStackTrace();
                outputStreamWriter.close();
            } catch (IOException e7) {
                e3 = e7;
                try {
                    e3.printStackTrace();
                    outputStreamWriter.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (UnsupportedEncodingException e9) {
            outputStreamWriter = null;
            e = e9;
            e.printStackTrace();
            outputStreamWriter.close();
        } catch (FileNotFoundException e10) {
            outputStreamWriter = null;
            e2 = e10;
            e2.printStackTrace();
            outputStreamWriter.close();
        } catch (IOException e11) {
            outputStreamWriter = null;
            e3 = e11;
            e3.printStackTrace();
            outputStreamWriter.close();
        } catch (Throwable th3) {
            outputStreamWriter = null;
            th = th3;
            outputStreamWriter.close();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m1856m(java.lang.Object r4, java.lang.Class<?> r5, java.lang.String r6, java.lang.Class<?>[] r7, java.lang.Object[] r8) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0835f.m1856m(java.lang.Object, java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: n */
    public static String m1857n(Context context, String str) {
        if (str.startsWith("@")) {
            return "res/" + str.substring(1);
        } else if (str.startsWith("%")) {
            String substring = str.substring(1);
            if (substring.indexOf(92) != -1) {
                substring = substring.replace('\\', '/');
            }
            if (substring.startsWith("/")) {
                return substring;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return String.format("%s/%s", context.getExternalFilesDir(""), substring);
            }
            return f1721a + '/' + substring;
        } else if (str.startsWith("$")) {
            return C1293a.m3483a(context) + str.substring(1);
        } else if (str.startsWith("/")) {
            return str;
        } else {
            return f1721a + '/' + str;
        }
    }

    /* renamed from: o */
    private static String m1858o(Exception exc) {
        if (!(exc instanceof InvocationTargetException)) {
            return exc.getMessage();
        }
        Throwable targetException = ((InvocationTargetException) exc).getTargetException();
        if (targetException != null) {
            return targetException.getMessage();
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m1859p(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        launchIntentForPackage.setFlags(337641472);
        context.startActivity(launchIntentForPackage);
        return true;
    }

    /* renamed from: q */
    public static void m1860q(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, logoActivity.class);
        intent.setFlags(335544320);
        context.startActivity(intent);
    }

    /* renamed from: r */
    public static byte[] m1861r(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
        } catch (Exception unused) {
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        return m1863t(inputStream);
    }

    /* renamed from: s */
    public static byte[] m1862s(File file) {
        Throwable th;
        IOException e;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
        byte[] bArr = null;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr2, 0, 1024);
                    if (-1 == read) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    bufferedInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    e.printStackTrace();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    byteArrayOutputStream.close();
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (IOException e8) {
            e = e8;
            bufferedInputStream = null;
            e.printStackTrace();
            bufferedInputStream.close();
            byteArrayOutputStream.close();
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2.close();
            byteArrayOutputStream.close();
            throw th;
        }
        return bArr;
    }

    /* renamed from: t */
    public static byte[] m1863t(InputStream inputStream) {
        Throwable th;
        IOException e;
        BufferedInputStream bufferedInputStream;
        byte[] bArr = null;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr2, 0, 1024);
                        if (-1 == read) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (IOException e4) {
                    e = e4;
                    try {
                        e.printStackTrace();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                        return bArr;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = bufferedInputStream;
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
                bufferedInputStream = null;
                e.printStackTrace();
                bufferedInputStream.close();
                byteArrayOutputStream.close();
                return bArr;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2.close();
                byteArrayOutputStream.close();
                throw th;
            }
            return bArr;
        } catch (IOException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    /* renamed from: u */
    public static byte[] m1864u(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        return m1862s(file);
    }
}
