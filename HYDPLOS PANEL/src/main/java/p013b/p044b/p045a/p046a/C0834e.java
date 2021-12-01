package p013b.p044b.p045a.p046a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: b.b.a.a.e */
public class C0834e {
    /* renamed from: a */
    private static boolean m1835a(String str, boolean z) {
        return (z ? new File(str) : new File(new File(str).getParent())).mkdirs();
    }

    /* renamed from: b */
    public static void m1836b(String str, String str2, ZipOutputStream zipOutputStream) {
        if (zipOutputStream != null) {
            File file = new File(str + str2);
            if (file.isFile()) {
                ZipEntry zipEntry = new ZipEntry(str2);
                FileInputStream fileInputStream = new FileInputStream(file);
                String lowerCase = file.getName().toLowerCase();
                if (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".ogg") || lowerCase.endsWith(".amr") || lowerCase.endsWith(".wma") || lowerCase.endsWith(".aac") || lowerCase.endsWith(".wav") || lowerCase.endsWith(".ra") || lowerCase.endsWith(".mid") || lowerCase.endsWith(".ape")) {
                    zipEntry.setCrc(m1838d(file));
                    zipEntry.setMethod(0);
                    zipEntry.setCompressedSize(file.length());
                }
                zipOutputStream.putNextEntry(zipEntry);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                        return;
                    }
                }
            } else {
                String[] list = file.list();
                if (list.length <= 0) {
                    zipOutputStream.putNextEntry(new ZipEntry(str2 + File.separator));
                    zipOutputStream.closeEntry();
                }
                for (int i = 0; i < list.length; i++) {
                    m1836b(str, str2 + File.separator + list[i], zipOutputStream);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m1837c(String str, String str2, boolean z) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
        File file = new File(str);
        if (!z || file.isFile()) {
            m1836b(file.getParent() + File.separator, file.getName(), zipOutputStream);
        } else {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                m1836b(file2.getParent() + File.separator, file2.getName(), zipOutputStream);
            }
        }
        zipOutputStream.finish();
        zipOutputStream.close();
    }

    /* renamed from: d */
    public static long m1838d(File file) {
        CRC32 crc32 = new CRC32();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                crc32.update(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                return crc32.getValue();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1839e(java.io.InputStream r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r0 = 92
            r1 = 47
            java.lang.String r0 = r6.replace(r0, r1)
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = r0.toString()
        L_0x001f:
            r0 = 0
            r1 = 0
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0056 }
            r2.<init>(r4)     // Catch:{ all -> 0x0056 }
        L_0x0026:
            java.util.zip.ZipEntry r4 = r2.getNextEntry()     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x004f
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0053 }
            boolean r0 = r0.startsWith(r5)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
            r0.<init>()     // Catch:{ all -> 0x0053 }
            r0.append(r6)     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = r4.getName()     // Catch:{ all -> 0x0053 }
            r0.append(r3)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0053 }
            m1843i(r2, r4, r0, r7)     // Catch:{ all -> 0x0053 }
            int r1 = r1 + 1
            goto L_0x0026
        L_0x004f:
            r2.close()
            return r1
        L_0x0053:
            r4 = move-exception
            r0 = r2
            goto L_0x0057
        L_0x0056:
            r4 = move-exception
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            r0.close()
        L_0x005c:
            goto L_0x005e
        L_0x005d:
            throw r4
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0834e.m1839e(java.io.InputStream, java.lang.String, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1840f(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0834e.m1840f(java.lang.String, java.lang.String, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1841g(java.io.InputStream r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 92
            r1 = 47
            java.lang.String r0 = r4.replace(r0, r1)
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
        L_0x001f:
            r0 = 0
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0049 }
            r1.<init>(r3)     // Catch:{ all -> 0x0049 }
        L_0x0025:
            java.util.zip.ZipEntry r3 = r1.getNextEntry()     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0042
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r0.<init>()     // Catch:{ all -> 0x0046 }
            r0.append(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r3.getName()     // Catch:{ all -> 0x0046 }
            r0.append(r2)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0046 }
            m1843i(r1, r3, r0, r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0025
        L_0x0042:
            r1.close()
            return
        L_0x0046:
            r3 = move-exception
            r0 = r1
            goto L_0x004a
        L_0x0049:
            r3 = move-exception
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()
        L_0x004f:
            goto L_0x0051
        L_0x0050:
            throw r3
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0834e.m1841g(java.io.InputStream, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1842h(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 92
            r1 = 47
            java.lang.String r0 = r4.replace(r0, r1)
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
        L_0x001f:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r3 = 0
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0052 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0052 }
            r2.<init>(r0)     // Catch:{ all -> 0x0052 }
            r1.<init>(r2)     // Catch:{ all -> 0x0052 }
        L_0x002f:
            java.util.zip.ZipEntry r3 = r1.getNextEntry()     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r0.<init>()     // Catch:{ all -> 0x0050 }
            r0.append(r4)     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = r3.getName()     // Catch:{ all -> 0x0050 }
            r0.append(r2)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0050 }
            m1843i(r1, r3, r0, r5)     // Catch:{ all -> 0x0050 }
            goto L_0x002f
        L_0x004c:
            r1.close()
            return
        L_0x0050:
            r3 = move-exception
            goto L_0x0055
        L_0x0052:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.close()
        L_0x005a:
            goto L_0x005c
        L_0x005b:
            throw r3
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0834e.m1842h(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0067 A[SYNTHETIC, Splitter:B:43:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1843i(java.util.zip.ZipInputStream r2, java.util.zip.ZipEntry r3, java.lang.String r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0834e.m1843i(java.util.zip.ZipInputStream, java.util.zip.ZipEntry, java.lang.String, boolean):void");
    }
}
