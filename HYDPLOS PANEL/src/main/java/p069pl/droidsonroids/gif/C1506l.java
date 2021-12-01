package p069pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.l */
public class C1506l {

    /* renamed from: a */
    private static final String f3698a = System.mapLibraryName("pl_droidsonroids_gif");

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.l$a */
    public static class C1507a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f3699a;

        C1507a(String str) {
            this.f3699a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(C1506l.f3698a) || str.startsWith(this.f3699a);
        }
    }

    private C1506l() {
    }

    /* renamed from: b */
    private static void m4196b(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.getParentFile().listFiles(filenameFilter);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    /* renamed from: c */
    private static void m4197c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m4198d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private static ZipEntry m4199e(ZipFile zipFile) {
        for (String str : m4201g()) {
            ZipEntry f = m4200f(zipFile, str);
            if (f != null) {
                return f;
            }
        }
        return null;
    }

    /* renamed from: f */
    private static ZipEntry m4200f(ZipFile zipFile, String str) {
        return zipFile.getEntry("lib/" + str + "/" + f3698a);
    }

    /* renamed from: g */
    private static String[] m4201g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    /* renamed from: h */
    static void m4202h(Context context) {
        synchronized (C1506l.class) {
            System.load(m4205k(context).getAbsolutePath());
        }
    }

    /* renamed from: i */
    private static ZipFile m4203i(File file) {
        ZipFile zipFile;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i >= 5) {
                zipFile = null;
                break;
            }
            try {
                zipFile = new ZipFile(file, 1);
                break;
            } catch (IOException unused) {
                i = i2;
            }
        }
        if (zipFile != null) {
            return zipFile;
        }
        throw new IllegalStateException("Could not open APK file: " + file.getAbsolutePath());
    }

    @SuppressLint({"SetWorldReadable"})
    /* renamed from: j */
    private static void m4204j(File file) {
        file.setReadable(true, false);
        file.setExecutable(true, false);
        file.setWritable(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c6 A[SYNTHETIC, Splitter:B:49:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0092 A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File m4205k(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: p069pl.droidsonroids.gif.C1506l.m4205k(android.content.Context):java.io.File");
    }
}
