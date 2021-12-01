package p013b.p044b.p045a.p046a.p047y;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p009v4.app.NotificationCompat;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0849k;
import p013b.p044b.p045a.p046a.C0860r;

/* renamed from: b.b.a.a.y.b */
public class C0909b {

    /* renamed from: a */
    private C0908a f1932a = null;

    /* renamed from: b */
    private Context f1933b = null;

    /* renamed from: c */
    public ArrayList<C0911c> f1934c = new ArrayList<>();

    /* renamed from: d */
    private boolean f1935d = true;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.y.b$a */
    public class C0910a extends Thread {
        C0910a() {
        }

        public void run() {
            boolean z;
            while (C0909b.this.f1935d) {
                if (C0909b.this.f1932a.f1928h < C0909b.this.f1932a.f1924d) {
                    Iterator<C0911c> it = C0909b.this.f1934c.iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        C0911c next = it.next();
                        if (next.f1952m == 0 && !next.f1956q) {
                            next.f1952m = 1;
                            next.mo9050t();
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        C0909b.this.f1935d = false;
                        return;
                    }
                }
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public C0909b(Context context, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        C0908a aVar = new C0908a();
        this.f1932a = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str3 = File.separator;
        sb.append(str3);
        aVar.f1921a = sb.toString();
        C0908a aVar2 = this.f1932a;
        aVar2.f1922b = str2 + str3;
        C0908a aVar3 = this.f1932a;
        aVar3.f1924d = i;
        aVar3.f1925e = i2;
        aVar3.f1926f = i3;
        aVar3.f1927g = i4;
        aVar3.f1929i = z;
        aVar3.f1930j = context;
        aVar3.f1931k = this;
        this.f1933b = context;
        m2386k();
    }

    /* renamed from: i */
    private Object m2385i(Object obj) {
        if ((obj instanceof Bitmap) || (obj instanceof Integer)) {
            return obj;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.startsWith("@")) {
            Context context = this.f1933b;
            return C0849k.m1962b(context, C0835f.m1857n(context, valueOf));
        } else if (valueOf.startsWith("%") || valueOf.startsWith("$")) {
            return C0849k.m1963c(C0835f.m1857n(this.f1933b, valueOf));
        } else {
            if (valueOf.matches("[0-9]+")) {
                return Integer.valueOf(Integer.parseInt(valueOf));
            }
            return null;
        }
    }

    /* renamed from: k */
    private void m2386k() {
        C0835f.m1845b(this.f1932a.f1921a, true);
        C0835f.m1845b(this.f1932a.f1922b, true);
        this.f1935d = false;
    }

    /* renamed from: d */
    public C0911c mo9038d(String str, String str2, Object obj) {
        return mo9039e(str, str2, str2, obj);
    }

    /* renamed from: e */
    public C0911c mo9039e(String str, String str2, String str3, Object obj) {
        int i = 2131427345;
        if (str2.endsWith(".zip") || str2.endsWith(".rar") || str2.endsWith(".7z")) {
            i = 2131427349;
        } else if (str2.endsWith(".mp3")) {
            i = 2131427343;
        } else if (str2.endsWith(".mp4")) {
            i = 2131427344;
        } else if (str2.endsWith(".xml")) {
            i = 2131427348;
        } else if (str2.endsWith(".txt")) {
            i = 2131427347;
        } else if (!str2.endsWith(".myu") && !str2.endsWith(".iyu")) {
            if (str2.endsWith(".apk")) {
                i = 17301651;
            } else if (!str2.endsWith(".iapp")) {
                i = 2131427346;
            }
        }
        return mo9041g(str, this.f1932a.f1922b, str2, str3, Integer.valueOf(i), this.f1932a.f1929i, obj);
    }

    /* renamed from: f */
    public C0911c mo9040f(String str, String str2, String str3, Object obj, Object obj2) {
        C0908a aVar = this.f1932a;
        return mo9041g(str, aVar.f1922b, str2, str3, obj, aVar.f1929i, obj2);
    }

    /* renamed from: g */
    public C0911c mo9041g(String str, String str2, String str3, String str4, Object obj, boolean z, Object obj2) {
        String str5 = str;
        if (str5.contains(" ")) {
            str5 = str5.replace(" ", "%20");
        }
        if (str5.getBytes().length != str5.length()) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str5.toCharArray();
            for (char c : charArray) {
                String valueOf = String.valueOf(c);
                if (valueOf.getBytes().length == 1) {
                    sb.append(c);
                } else {
                    sb.append(Uri.encode(valueOf));
                }
            }
            str5 = sb.toString();
        }
        String replace = str2.replace('\\', '/');
        if (!replace.endsWith("/")) {
            replace = replace + File.separator;
        }
        C0835f.m1845b(replace, true);
        C0911c cVar = null;
        try {
            cVar = new C0911c(this.f1932a, 0, str5, replace, str3, C0860r.m2045d(str5.toLowerCase()), obj2, str4, m2385i(obj), z);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (cVar != null) {
            this.f1934c.add(cVar);
            cVar.f1941b = this.f1934c.size() - 1;
            mo9043j();
        }
        return cVar;
    }

    /* renamed from: h */
    public Object mo9042h(C0911c cVar, String str) {
        if (str.equals("id")) {
            return Integer.valueOf(cVar.f1941b);
        }
        if (str.equals("url")) {
            return cVar.f1942c;
        }
        if (str.equals("dirfilename")) {
            return cVar.f1943d;
        }
        if (str.equals("urlmd5")) {
            return cVar.f1944e;
        }
        if (str.equals("dir")) {
            return cVar.f1945f;
        }
        if (str.equals("filename")) {
            return cVar.f1946g;
        }
        if (str.equals("contentlength")) {
            return Long.valueOf(cVar.f1947h);
        }
        if (str.equals("equivalent")) {
            return Long.valueOf(cVar.f1949j);
        }
        if (str.equals("downloadspeed")) {
            return Integer.valueOf(cVar.f1950k);
        }
        if (str.equals("downloadpercentage")) {
            return Integer.valueOf(cVar.f1951l);
        }
        if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
            return Integer.valueOf(cVar.f1952m);
        }
        if (str.equals("notificationshow")) {
            return Boolean.valueOf(cVar.f1957r);
        }
        if (str.equals("text")) {
            return cVar.f1959t;
        }
        if (str.equals("title")) {
            return cVar.f1960u;
        }
        if (str.equals("icon")) {
            return cVar.f1961v;
        }
        return null;
    }

    /* renamed from: j */
    public void mo9043j() {
        if (!this.f1935d) {
            this.f1935d = true;
            C0910a aVar = new C0910a();
            aVar.setName("CeShi_" + aVar.getId());
            aVar.start();
        }
    }

    /* renamed from: l */
    public void mo9044l(C0911c cVar, String str, Object obj) {
        if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
            cVar.mo9051u(Integer.parseInt(String.valueOf(obj)));
        } else if (str.equals("notificationshow")) {
            cVar.f1957r = obj.equals(Boolean.TRUE);
        } else if (str.equals("text")) {
            cVar.f1959t = obj;
        } else if (str.equals("title")) {
            cVar.f1960u = String.valueOf(obj);
            cVar.f1962w = "“" + cVar.f1960u + "”下载";
        } else if (str.equals("icon")) {
            cVar.f1961v = m2385i(obj);
        }
    }

    /* renamed from: m */
    public void mo9045m(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        String replace = str.replace('\\', '/');
        if (!replace.endsWith("/")) {
            replace = replace + File.separator;
        }
        String replace2 = str2.replace('\\', '/');
        if (!replace2.endsWith("/")) {
            replace2 = replace2 + File.separator;
        }
        C0908a aVar = this.f1932a;
        aVar.f1921a = replace;
        aVar.f1922b = replace2;
        C0835f.m1845b(replace, true);
        C0835f.m1845b(replace2, true);
        C0908a aVar2 = this.f1932a;
        aVar2.f1924d = i;
        aVar2.f1925e = i2;
        aVar2.f1926f = i3;
        aVar2.f1927g = i4;
        aVar2.f1929i = z;
    }
}
