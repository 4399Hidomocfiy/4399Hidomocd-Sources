package p013b.p044b.p045a.p046a;

import android.net.Uri;
import com.iapp.interfaces.OnFileDownStatusListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: b.b.a.a.g */
public class C0836g {

    /* renamed from: a */
    private int f1722a = 3;

    /* renamed from: b */
    private int f1723b = 25000;

    /* renamed from: c */
    private String f1724c;

    /* renamed from: d */
    private String f1725d;

    /* renamed from: e */
    private ArrayList<HashMap<Object, Object>> f1726e = new ArrayList<>();

    /* renamed from: f */
    private boolean f1727f = false;

    /* renamed from: g */
    private boolean f1728g = false;

    /* renamed from: h */
    private int f1729h = 0;

    /* renamed from: i */
    private OnFileDownStatusListener f1730i;

    /* renamed from: j */
    public Object f1731j = null;

    /* renamed from: k */
    public Object f1732k = null;

    /* renamed from: l */
    private HashMap<Object, Object> f1733l;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.g$a */
    public class C0837a extends Thread {
        C0837a() {
        }

        public void run() {
            boolean z;
            int i = 0;
            while (C0836g.this.f1727f) {
                if (C0836g.this.f1729h < C0836g.this.f1722a) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= C0836g.this.f1726e.size()) {
                            z = true;
                            break;
                        } else if (C0836g.this.f1729h >= C0836g.this.f1722a) {
                            z = false;
                            break;
                        } else {
                            if (((HashMap) C0836g.this.f1726e.get(i2)).get("ok").equals(-3)) {
                                C0836g.this.m1878p(i2);
                                i++;
                            }
                            i2++;
                        }
                    }
                    if (z) {
                        C0836g.this.f1727f = false;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while (C0836g.this.f1729h > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            C0836g.this.f1730i.complete(i, C0836g.this.f1732k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.g$b */
    public class C0838b extends Thread {

        /* renamed from: a */
        final /* synthetic */ int f1735a;

        C0838b(int i) {
            this.f1735a = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0836g.C0838b.run():void");
        }
    }

    public C0836g(String str) {
        String replace = str.replace('\\', '/');
        if (!replace.endsWith("/")) {
            replace = replace + File.separator;
        }
        this.f1724c = replace;
        this.f1725d = replace;
        C0835f.m1845b(replace, true);
    }

    public C0836g(String str, String str2) {
        String replace = str.replace('\\', '/');
        if (!replace.endsWith("/")) {
            replace = replace + File.separator;
        }
        String replace2 = str2.replace('\\', '/');
        if (!replace2.endsWith("/")) {
            replace2 = replace2 + File.separator;
        }
        this.f1724c = replace;
        this.f1725d = replace2;
        C0835f.m1845b(replace, true);
        C0835f.m1845b(this.f1725d, true);
    }

    public C0836g(String str, String str2, int i, int i2, boolean z) {
        String replace = str.replace('\\', '/');
        if (!replace.endsWith("/")) {
            replace = replace + File.separator;
        }
        String replace2 = str2.replace('\\', '/');
        if (!replace2.endsWith("/")) {
            replace2 = replace2 + File.separator;
        }
        this.f1724c = replace;
        this.f1725d = replace2;
        this.f1722a = i;
        this.f1723b = i2;
        this.f1728g = z;
        C0835f.m1845b(replace, true);
        C0835f.m1845b(this.f1725d, true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b A[SYNTHETIC, Splitter:B:37:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1865a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0836g.m1865a(java.lang.String, java.lang.String, boolean):int");
    }

    /* renamed from: e */
    static /* synthetic */ int m1869e(C0836g gVar) {
        int i = gVar.f1729h;
        gVar.f1729h = i + 1;
        return i;
    }

    /* renamed from: f */
    static /* synthetic */ int m1870f(C0836g gVar) {
        int i = gVar.f1729h;
        gVar.f1729h = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: p */
    private void m1878p(int i) {
        C0838b bVar = new C0838b(i);
        bVar.setName("CeShi_" + bVar.getId());
        bVar.start();
    }

    /* renamed from: r */
    private int m1879r(URL url) {
        MalformedURLException e;
        IOException e2;
        int i = -1;
        try {
            URLConnection openConnection = url.openConnection();
            openConnection.setRequestProperty("Accept-Encoding", "identity");
            openConnection.setConnectTimeout(this.f1723b);
            int contentLength = openConnection.getContentLength();
            if (contentLength != -1) {
                return contentLength;
            }
            try {
                String headerField = openConnection.getHeaderField("Content-Length");
                return headerField != null ? Integer.parseInt(headerField) : contentLength;
            } catch (MalformedURLException e3) {
                e = e3;
                i = contentLength;
                e.printStackTrace();
                return i;
            } catch (IOException e4) {
                e2 = e4;
                i = contentLength;
                e2.printStackTrace();
                return i;
            }
        } catch (MalformedURLException e5) {
            e = e5;
            e.printStackTrace();
            return i;
        } catch (IOException e6) {
            e2 = e6;
            e2.printStackTrace();
            return i;
        }
    }

    /* renamed from: n */
    public void mo8929n(String str, int i, Object obj) {
        if (str.contains(" ")) {
            str = str.replace(" ", "%20");
        }
        if (str.getBytes().length != str.length()) {
            char[] charArray = str.toCharArray();
            String str2 = "";
            for (char c : charArray) {
                String valueOf = String.valueOf(c);
                str2 = valueOf.getBytes().length == 1 ? str2 + c : str2 + Uri.encode(valueOf);
            }
            str = str2;
        }
        HashMap<Object, Object> hashMap = new HashMap<>();
        this.f1733l = hashMap;
        hashMap.put("url", str);
        this.f1733l.put("type", Integer.valueOf(i));
        this.f1733l.put("text", obj);
        this.f1733l.put("filename", null);
        this.f1733l.put("coveringis", Boolean.FALSE);
        this.f1733l.put("ok", -3);
        this.f1726e.add(this.f1733l);
    }

    /* renamed from: o */
    public void mo8930o(String str, int i, Object obj, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "%20");
        }
        if (str.getBytes().length != str.length()) {
            char[] charArray = str.toCharArray();
            String str3 = "";
            for (char c : charArray) {
                String valueOf = String.valueOf(c);
                str3 = valueOf.getBytes().length == 1 ? str3 + c : str3 + Uri.encode(valueOf);
            }
            str = str3;
        }
        C0835f.m1845b(str2, false);
        HashMap<Object, Object> hashMap = new HashMap<>();
        this.f1733l = hashMap;
        hashMap.put("url", str);
        this.f1733l.put("type", Integer.valueOf(i));
        this.f1733l.put("text", obj);
        this.f1733l.put("filename", str2);
        this.f1733l.put("coveringis", Boolean.FALSE);
        this.f1733l.put("ok", -3);
        this.f1726e.add(this.f1733l);
    }

    /* renamed from: q */
    public ArrayList<HashMap<Object, Object>> mo8931q() {
        return this.f1726e;
    }

    /* renamed from: s */
    public void mo8932s(OnFileDownStatusListener onFileDownStatusListener) {
        this.f1730i = onFileDownStatusListener;
    }

    /* renamed from: t */
    public boolean mo8933t() {
        if (this.f1727f) {
            return false;
        }
        this.f1727f = true;
        C0837a aVar = new C0837a();
        aVar.setName("CeShi_" + aVar.getId());
        aVar.start();
        return true;
    }
}
