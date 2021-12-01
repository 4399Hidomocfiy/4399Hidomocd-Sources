package p013b.p044b.p045a.p046a.p047y;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0861s;

/* renamed from: b.b.a.a.y.c */
public class C0911c {

    /* renamed from: A */
    public RandomAccessFile f1937A = null;

    /* renamed from: B */
    private ArrayList<C0913b> f1938B = new ArrayList<>();

    /* renamed from: C */
    private String f1939C = null;

    /* renamed from: a */
    public C0908a f1940a = null;

    /* renamed from: b */
    public int f1941b = 0;

    /* renamed from: c */
    public URL f1942c = null;

    /* renamed from: d */
    public String f1943d = null;

    /* renamed from: e */
    public String f1944e = null;

    /* renamed from: f */
    public String f1945f = null;

    /* renamed from: g */
    public String f1946g = null;

    /* renamed from: h */
    public long f1947h = -1;

    /* renamed from: i */
    public long f1948i = -1;

    /* renamed from: j */
    public long f1949j = 0;

    /* renamed from: k */
    public int f1950k = 0;

    /* renamed from: l */
    public int f1951l = 0;

    /* renamed from: m */
    public int f1952m = 0;

    /* renamed from: n */
    public int f1953n = 0;

    /* renamed from: o */
    public int f1954o = 0;

    /* renamed from: p */
    public long f1955p = 0;

    /* renamed from: q */
    public boolean f1956q = true;

    /* renamed from: r */
    public boolean f1957r = true;

    /* renamed from: s */
    public boolean f1958s = true;

    /* renamed from: t */
    public Object f1959t = null;

    /* renamed from: u */
    public String f1960u = null;

    /* renamed from: v */
    public Object f1961v = null;

    /* renamed from: w */
    public String f1962w;

    /* renamed from: x */
    private DecimalFormat f1963x = new DecimalFormat("0.0");

    /* renamed from: y */
    private NotificationManager f1964y = null;

    /* renamed from: z */
    private Notification.Builder f1965z = null;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.y.c$a */
    public class C0912a extends Thread {
        C0912a() {
        }

        public void run() {
            boolean z;
            C0911c cVar;
            long[] p;
            HttpURLConnection r = C0911c.this.m2409r(-1, -1);
            if (r == null) {
                C0911c.this.m2405m(-1);
                return;
            }
            long contentLength = (long) r.getContentLength();
            C0911c cVar2 = C0911c.this;
            cVar2.f1947h = contentLength;
            cVar2.f1948i = contentLength - 1;
            if (!"bytes".equals(r.getHeaderField("Accept-Ranges"))) {
                C0911c cVar3 = C0911c.this;
                cVar3.f1958s = false;
                HttpURLConnection r2 = cVar3.m2409r(32, 64);
                if (r2 != null && (p = C0911c.this.m2408p(r2)) != null && p[0] == 32 && p[1] == 64) {
                    long j = p[2];
                    C0911c cVar4 = C0911c.this;
                    if (j == cVar4.f1947h) {
                        cVar4.f1958s = true;
                    }
                }
            }
            File file = new File(C0911c.this.f1943d);
            if (file.exists()) {
                long length = file.length();
                C0911c cVar5 = C0911c.this;
                if (length == cVar5.f1947h) {
                    cVar5.m2405m(2);
                    C0911c cVar6 = C0911c.this;
                    cVar6.f1949j = cVar6.f1947h;
                    if (cVar6.f1957r) {
                        cVar6.mo9047a(cVar6.f1940a.f1930j, "已下载");
                    }
                    C0911c.this.m2407o();
                    return;
                }
                file.delete();
            }
            C0911c cVar7 = C0911c.this;
            int i = cVar7.f1940a.f1925e;
            cVar7.f1953n = i;
            cVar7.f1955p = cVar7.f1947h / ((long) i);
            File file2 = new File(C0911c.this.f1940a.f1921a + C0911c.this.f1944e + C0911c.this.f1940a.f1923c);
            if (!file2.exists() || file2.length() != C0911c.this.f1947h) {
                C0911c.m2406n(file2, C0911c.this.f1947h);
                z = false;
            } else {
                z = true;
            }
            try {
                C0911c.this.f1937A = new RandomAccessFile(file2, "rw");
                C0911c.this.f1938B.clear();
                C0911c.this.f1939C = C0911c.this.f1940a.f1921a + C0911c.this.f1944e + C0911c.this.f1940a.f1923c + ".config";
                C0911c cVar8 = C0911c.this;
                if (!cVar8.f1958s || cVar8.f1947h <= 2097152) {
                    int size = cVar8.f1938B.size() + 1;
                    C0911c cVar9 = C0911c.this;
                    C0913b bVar = new C0913b(size, 0, cVar9.f1948i, 0, cVar9.f1947h);
                    cVar9.f1938B.add(bVar);
                    C0911c.this.m2395c();
                    bVar.mo9054a();
                } else {
                    if (z) {
                        String h = C0835f.m1851h(cVar8.f1939C);
                        if (h != null && h.contains("</Thread>")) {
                            String[] d = C0861s.m2071d(h, "<Thread");
                            int length2 = d.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    break;
                                }
                                String str = d[i2];
                                if (str.contains("</Thread>") || str.contains("/>")) {
                                    try {
                                        long parseLong = Long.parseLong(C0860r.m2044c(str, " start=\"", "\""));
                                        long parseLong2 = Long.parseLong(C0860r.m2044c(str, " end=\"", "\""));
                                        long parseLong3 = Long.parseLong(C0860r.m2044c(str, " current=\"", "\""));
                                        long parseLong4 = Long.parseLong(C0860r.m2044c(str, " size=\"", "\""));
                                        C0911c cVar10 = C0911c.this;
                                        if (parseLong4 != cVar10.f1947h) {
                                            break;
                                        }
                                        ArrayList arrayList = cVar10.f1938B;
                                        C0911c cVar11 = C0911c.this;
                                        arrayList.add(new C0913b(cVar11.f1938B.size() + 1, parseLong, parseLong2, parseLong3, parseLong4));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                i2++;
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                        C0911c cVar12 = C0911c.this;
                        long j2 = cVar12.f1948i;
                        int i3 = cVar12.f1953n - 1;
                        long j3 = j2;
                        int i4 = 0;
                        while (i4 < i3) {
                            C0911c cVar13 = C0911c.this;
                            long j4 = j3 - cVar13.f1955p;
                            ArrayList arrayList2 = cVar13.f1938B;
                            C0911c cVar14 = C0911c.this;
                            arrayList2.add(new C0913b(cVar14.f1938B.size() + 1, j4, j3, j4, C0911c.this.f1947h));
                            i4++;
                            j3 = j4;
                        }
                        ArrayList arrayList3 = C0911c.this.f1938B;
                        C0911c cVar15 = C0911c.this;
                        arrayList3.add(new C0913b(cVar15.f1938B.size() + 1, 0, j3, 0, C0911c.this.f1947h));
                    }
                    C0911c.this.m2395c();
                    Iterator it = C0911c.this.f1938B.iterator();
                    while (it.hasNext()) {
                        ((C0913b) it.next()).mo9054a();
                    }
                }
                C0911c cVar16 = C0911c.this;
                if (cVar16.f1957r) {
                    cVar16.mo9047a(cVar16.f1940a.f1930j, "开始下载");
                }
                while (true) {
                    cVar = C0911c.this;
                    if (cVar.f1954o <= 0) {
                        break;
                    }
                    long j5 = cVar.f1949j;
                    try {
                        Thread.sleep(1600);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    C0911c cVar17 = C0911c.this;
                    cVar17.f1949j = cVar17.mo9049q();
                    C0911c cVar18 = C0911c.this;
                    long j6 = cVar18.f1949j;
                    cVar18.f1950k = (int) (j6 - j5);
                    cVar18.f1951l = (int) ((j6 * 100) / cVar18.f1947h);
                    if (cVar18.f1957r) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C0911c.this.f1951l);
                        sb.append("% ");
                        C0911c cVar19 = C0911c.this;
                        sb.append(cVar19.m2410s((double) cVar19.f1950k));
                        sb.append("/s，");
                        C0911c cVar20 = C0911c.this;
                        sb.append(cVar20.m2410s((double) cVar20.f1949j));
                        sb.append("/");
                        C0911c cVar21 = C0911c.this;
                        sb.append(cVar21.m2410s((double) cVar21.f1947h));
                        cVar18.mo9048b(sb.toString(), true);
                    }
                }
                if (cVar.f1956q) {
                    cVar.m2405m(3);
                    C0911c cVar22 = C0911c.this;
                    if (cVar22.f1957r) {
                        cVar22.mo9048b("已暂停下载", true);
                        return;
                    }
                    return;
                }
                cVar.f1949j = cVar.f1947h;
                if (cVar.f1957r) {
                    cVar.mo9048b("下载完成", false);
                }
                try {
                    RandomAccessFile randomAccessFile = C0911c.this.f1937A;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                if (!file2.renameTo(file)) {
                    C0835f.m1844a(file2.getAbsolutePath(), file.getAbsolutePath(), Boolean.TRUE);
                    file2.delete();
                }
                new File(C0911c.this.f1939C).delete();
                C0911c cVar23 = C0911c.this;
                cVar23.f1952m = 2;
                cVar23.f1956q = true;
                cVar23.f1940a.f1928h--;
                cVar23.m2407o();
            } catch (FileNotFoundException e4) {
                e4.printStackTrace();
                C0911c.this.m2405m(-1);
            }
        }
    }

    /* renamed from: b.b.a.a.y.c$b */
    public class C0913b {

        /* renamed from: a */
        long f1967a;

        /* renamed from: b */
        long f1968b;

        /* renamed from: c */
        long f1969c;

        /* renamed from: d */
        long f1970d;

        /* renamed from: e */
        long f1971e = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: b.b.a.a.y.c$b$a */
        public class C0914a extends Thread {
            C0914a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5 */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v9 */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[SYNTHETIC, Splitter:B:42:0x00c4] */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x00ce A[SYNTHETIC, Splitter:B:47:0x00ce] */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8 A[SYNTHETIC, Splitter:B:52:0x00d8] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 235
                */
                throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.p047y.C0911c.C0913b.C0914a.run():void");
            }
        }

        public C0913b(int i, long j, long j2, long j3, long j4) {
            this.f1967a = j;
            this.f1968b = j2;
            this.f1969c = j3;
            this.f1970d = j4;
            this.f1971e = j3 - j;
        }

        /* renamed from: a */
        public void mo9054a() {
            if (this.f1969c <= this.f1968b) {
                C0911c.this.f1954o++;
                C0914a aVar = new C0914a();
                aVar.setName("CeShi_" + aVar.getId());
                aVar.start();
            }
        }
    }

    public C0911c(C0908a aVar, int i, String str, String str2, String str3, String str4, Object obj, String str5, Object obj2, boolean z) {
        this.f1940a = aVar;
        this.f1941b = i;
        this.f1944e = str4;
        this.f1942c = new URL(str);
        this.f1943d = str2 + str3;
        this.f1945f = str2;
        this.f1946g = str3;
        this.f1959t = obj;
        this.f1960u = str5;
        this.f1961v = obj2;
        this.f1957r = z;
        this.f1956q = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m2395c() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ys>");
        Iterator<C0913b> it = this.f1938B.iterator();
        while (it.hasNext()) {
            C0913b next = it.next();
            sb.append("<Thread start=\"");
            sb.append(next.f1967a);
            sb.append("\" end=\"");
            sb.append(next.f1968b);
            sb.append("\" current=\"");
            sb.append(next.f1969c);
            sb.append("\" size=\"");
            sb.append(next.f1970d);
            sb.append("\"></Thread>");
        }
        sb.append("</ys>");
        C0835f.m1854k(this.f1939C, sb.toString());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private void m2405m(int i) {
        this.f1952m = i;
        this.f1956q = true;
        this.f1940a.f1928h--;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[SYNTHETIC, Splitter:B:10:0x0016] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2406n(java.io.File r3, long r4) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x000f }
            java.lang.String r2 = "rw"
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x000f }
            r1.setLength(r4)     // Catch:{ Exception -> 0x000c }
            goto L_0x0014
        L_0x000c:
            r3 = move-exception
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r3 = move-exception
        L_0x0010:
            r3.printStackTrace()
            r1 = r0
        L_0x0014:
            if (r1 == 0) goto L_0x001e
            r1.close()     // Catch:{ Exception -> 0x001a }
            goto L_0x001e
        L_0x001a:
            r3 = move-exception
            r3.printStackTrace()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.p047y.C0911c.m2406n(java.io.File, long):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private void m2407o() {
        if (new File(this.f1943d).exists() && this.f1943d.toLowerCase().endsWith(".apk")) {
            C0835f.m1847d(this.f1940a.f1930j, this.f1943d);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: p */
    private long[] m2408p(HttpURLConnection httpURLConnection) {
        String substring;
        int indexOf;
        String headerField = httpURLConnection.getHeaderField("Content-Range");
        if (!(headerField == null || !headerField.startsWith("bytes") || (indexOf = (substring = headerField.substring(5)).indexOf(47)) == -1)) {
            String trim = substring.substring(indexOf + 1).trim();
            String substring2 = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(45);
            if (indexOf2 != -1) {
                try {
                    return new long[]{Long.parseLong(substring2.substring(0, indexOf2).trim()), Long.parseLong(substring2.substring(indexOf2 + 1).trim()), Long.parseLong(trim)};
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: r */
    private HttpURLConnection m2409r(long j, long j2) {
        for (int i = 0; i < this.f1940a.f1926f; i++) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) this.f1942c.openConnection();
                if (!(j == -1 || j2 == -1)) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setConnectTimeout(this.f1940a.f1927g);
                httpURLConnection.setRequestProperty("Referer", this.f1942c.toString());
                httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                if (((long) httpURLConnection.getContentLength()) != -1) {
                    return httpURLConnection;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: s */
    private String m2410s(double d) {
        double d2 = d / 1024.0d;
        if (d2 > 1024.0d) {
            double d3 = d2 / 1024.0d;
            if (d3 > 1024.0d) {
                return this.f1963x.format(d3 / 1024.0d) + "G";
            }
            return this.f1963x.format(d3) + "M";
        }
        return this.f1963x.format(d2) + "K";
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9047a(android.content.Context r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.p047y.C0911c.mo9047a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: b */
    public void mo9048b(String str, boolean z) {
        this.f1965z.setContentText(str).setOnlyAlertOnce(z);
        this.f1964y.notify(1, Build.VERSION.SDK_INT >= 16 ? this.f1965z.build() : this.f1965z.getNotification());
    }

    /* renamed from: q */
    public long mo9049q() {
        Iterator<C0913b> it = this.f1938B.iterator();
        long j = 1;
        while (it.hasNext()) {
            long j2 = it.next().f1971e;
            if (j2 > 0) {
                j += j2 - 1;
            }
        }
        return j;
    }

    /* renamed from: t */
    public void mo9050t() {
        this.f1956q = false;
        this.f1952m = 1;
        this.f1940a.f1928h++;
        C0912a aVar = new C0912a();
        aVar.setName("CeShi_" + aVar.getId());
        aVar.start();
    }

    /* renamed from: u */
    public void mo9051u(int i) {
        this.f1952m = i;
        if (i == 0) {
            this.f1949j = 0;
            this.f1956q = false;
            this.f1940a.f1931k.mo9043j();
        } else if (i == 3 || i == -2) {
            this.f1956q = true;
        }
    }

    /* renamed from: v */
    public synchronized boolean mo9052v(byte[] bArr, long j) {
        try {
            this.f1937A.seek(j);
            this.f1937A.write(bArr);
        } catch (IOException e) {
            e.printStackTrace();
            m2405m(-1);
            return false;
        }
        return true;
    }
}
