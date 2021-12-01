package p013b.p044b.p045a.p046a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Random;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/* renamed from: b.b.a.a.i */
public class C0841i {

    /* renamed from: a */
    private static CookieManager f1741a;

    /* renamed from: b */
    private static X509TrustManager[] f1742b;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.i$a */
    public static class C0842a implements X509TrustManager {

        /* renamed from: a */
        private final X509Certificate[] f1743a = new X509Certificate[0];

        C0842a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return this.f1743a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.i$b */
    public static class C0843b implements HostnameVerifier {
        C0843b() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[SYNTHETIC, Splitter:B:25:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1918a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0841i.m1918a(java.lang.String, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    public static int m1919b(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, String str6) {
        int i = 0;
        C0835f.m1845b(str2, false);
        File file = new File(str2);
        File file2 = new File(file.getParent() + "/" + new Random().nextLong() + ".xzz");
        try {
            URL url = new URL(m1933p(str));
            HttpURLConnection l = m1929l(url);
            if (str6 != null) {
                String[] split = str6.split("\\|\\|");
                for (String str7 : split) {
                    int indexOf = str7.indexOf(61);
                    if (indexOf != -1) {
                        l.setRequestProperty(str7.substring(0, indexOf).trim(), str7.substring(indexOf + 1).trim());
                    }
                }
            }
            if (str5 != null) {
                l.setRequestProperty("Cookie", str5);
            } else if (z2) {
                m1926i(l, url.toURI());
            }
            m1920c(l, str3, str4);
            int responseCode = l.getResponseCode();
            int i2 = 0;
            while (true) {
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                } else if (i2 > 8) {
                    break;
                } else {
                    m1932o().put(url.toURI(), l.getHeaderFields());
                    String headerField = l.getHeaderField("Location");
                    if (headerField == null) {
                        break;
                    }
                    URL url2 = new URL(m1933p(C0906w.m2357i(url.toURI(), headerField)));
                    l.disconnect();
                    l = m1929l(url2);
                    m1926i(l, url2.toURI());
                    m1920c(l, null, str4);
                    i2++;
                    responseCode = l.getResponseCode();
                    url = url2;
                }
            }
            if (responseCode == 200) {
                if (z2) {
                    m1932o().put(url.toURI(), l.getHeaderFields());
                }
                InputStream inputStream = l.getInputStream();
                if (!file.exists() || z || !(((long) inputStream.available()) == file.length() || ((long) l.getContentLength()) == file.length())) {
                    file2.createNewFile();
                    byte[] bArr = new byte[1024];
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                    file2.renameTo(file);
                    inputStream.close();
                    fileOutputStream.close();
                } else if (inputStream == null) {
                    return 1;
                } else {
                    inputStream.close();
                    return 1;
                }
            } else {
                i = -1;
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                file2.delete();
                return -1;
            } catch (Exception unused) {
                e.printStackTrace();
                return -1;
            }
        }
    }

    /* renamed from: c */
    private static void m1920c(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            m1935r((HttpsURLConnection) httpURLConnection);
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        if (str != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            if (str.trim().indexOf(123) == 0) {
                httpURLConnection.setRequestProperty("Charsert", str2);
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=" + str2);
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), str2));
                printWriter.println(str);
                printWriter.flush();
                printWriter.close();
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                String[] split = str.replace("\\&", "\\U26").split("&");
                for (int i = 0; i < split.length; i++) {
                    int indexOf = split[i].indexOf("=");
                    if (indexOf != -1) {
                        int i2 = indexOf + 1;
                        if (i == 0) {
                            outputStream.write(split[i].substring(0, i2).getBytes());
                            outputStream.write(split[i].substring(i2).replace("\\U26", "%26").getBytes(str2));
                        } else {
                            outputStream.write(38);
                            outputStream.write(split[i].substring(0, i2).getBytes());
                            outputStream.write(split[i].substring(i2).replace("\\U26", "%26").getBytes(str2));
                        }
                    }
                }
                outputStream.flush();
                outputStream.close();
            }
        }
        httpURLConnection.connect();
    }

    /* renamed from: d */
    public static String m1921d(String str) {
        if (str == null) {
            return null;
        }
        String str2 = "";
        if (str.equals("cookie")) {
            for (HttpCookie httpCookie : m1932o().getCookieStore().getCookies()) {
                str2 = str2 + httpCookie.getName() + "=" + httpCookie.getValue() + ";";
            }
            return str2;
        }
        if (str.equals("del cookie")) {
            f1741a = null;
        } else {
            try {
                URI uri = new URI(str);
                CookieStore cookieStore = m1932o().getCookieStore();
                String lowerCase = uri.getHost().toLowerCase();
                for (HttpCookie httpCookie2 : cookieStore.getCookies()) {
                    String lowerCase2 = httpCookie2.getDomain().toLowerCase();
                    if ((lowerCase2.startsWith(".") && lowerCase.endsWith(lowerCase2.substring(1))) || lowerCase.endsWith(lowerCase2)) {
                        str2 = str2 + httpCookie2.getName() + "=" + httpCookie2.getValue() + ";";
                    }
                }
                return str2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m1922e(String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "utf-8";
        }
        try {
            URL url = new URL(m1933p(str));
            return m1927j(url, m1929l(url), str2, str3, false, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m1923f(String str, String str2, String str3, String str4) {
        try {
            URL url = new URL(m1933p(str));
            HttpURLConnection l = m1929l(url);
            l.setConnectTimeout(20000);
            l.setReadTimeout(20000);
            if (str4 != null) {
                l.setRequestProperty("Cookie", str4);
            }
            return m1927j(url, l, str2, str3, false, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static String m1924g(String str, String str2, String str3, String str4, boolean z) {
        try {
            URL url = new URL(m1933p(str));
            HttpURLConnection l = m1929l(url);
            l.setConnectTimeout(20000);
            l.setReadTimeout(20000);
            if (str4 != null) {
                l.setRequestProperty("Cookie", str4);
            } else if (z) {
                m1926i(l, url.toURI());
            }
            return m1927j(url, l, str2, str3, false, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static String m1925h(String str, String str2, String str3, String str4, boolean z, String str5, int i, int i2, String str6) {
        int i3;
        URLConnection openConnection;
        try {
            URL url = new URL(m1933p(str));
            if (str6 == null) {
                openConnection = url.openConnection();
            } else {
                int indexOf = str6.indexOf(58);
                if (indexOf != -1) {
                    String substring = str6.substring(0, indexOf);
                    i3 = Integer.parseInt(str6.substring(indexOf + 1));
                    str6 = substring;
                } else {
                    i3 = 80;
                }
                openConnection = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str6, i3)));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", "Apache-HttpClient/UNAVAILABLE (java 1.4)");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            if (str5 != null) {
                String[] split = str5.split("\\|\\|");
                for (String str7 : split) {
                    int indexOf2 = str7.indexOf(61);
                    if (indexOf2 != -1) {
                        httpURLConnection.setRequestProperty(str7.substring(0, indexOf2).trim(), str7.substring(indexOf2 + 1).trim());
                    }
                }
            }
            if (str4 != null) {
                httpURLConnection.setRequestProperty("Cookie", str4);
            } else if (z) {
                m1926i(httpURLConnection, url.toURI());
            }
            return m1927j(url, httpURLConnection, str2, str3, false, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static void m1926i(HttpURLConnection httpURLConnection, URI uri) {
        try {
            CookieStore cookieStore = m1932o().getCookieStore();
            String str = "";
            String lowerCase = uri.getHost().toLowerCase();
            for (HttpCookie httpCookie : cookieStore.getCookies()) {
                String lowerCase2 = httpCookie.getDomain().toLowerCase();
                if ((lowerCase2.startsWith(".") && lowerCase.endsWith(lowerCase2.substring(1))) || lowerCase.endsWith(lowerCase2)) {
                    str = str + httpCookie.getName() + "=" + httpCookie.getValue() + ";";
                }
            }
            if (str.length() > 0) {
                httpURLConnection.setRequestProperty("Cookie", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m1927j(java.net.URL r6, java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0841i.m1927j(java.net.URL, java.net.HttpURLConnection, java.lang.String, java.lang.String, boolean, boolean):java.lang.String");
    }

    /* renamed from: k */
    private static void m1928k(HttpURLConnection httpURLConnection, String str, String str2, boolean z) {
        String str3;
        if (httpURLConnection instanceof HttpsURLConnection) {
            m1935r((HttpsURLConnection) httpURLConnection);
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        if (str != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            if (str.trim().indexOf(123) == 0) {
                httpURLConnection.setRequestProperty("Charsert", str2);
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=" + str2);
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), str2));
                printWriter.println(str);
                printWriter.flush();
                printWriter.close();
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                String[] split = str.replace("\\&", "\\U26").split("&");
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i = 0; i < split.length; i++) {
                        int indexOf = split[i].indexOf("=");
                        if (indexOf != -1) {
                            int i2 = indexOf + 1;
                            if (i == 0) {
                                stringBuffer.append(split[i].substring(0, i2));
                                str3 = split[i];
                            } else {
                                stringBuffer.append('&');
                                stringBuffer.append(split[i].substring(0, i2));
                                str3 = split[i];
                            }
                            stringBuffer.append(C0863u.m2085a(str3.substring(i2).replace("\\U26", "&")));
                        }
                    }
                    outputStream.write(stringBuffer.toString().getBytes());
                } else {
                    for (int i3 = 0; i3 < split.length; i3++) {
                        int indexOf2 = split[i3].indexOf("=");
                        if (indexOf2 != -1) {
                            int i4 = indexOf2 + 1;
                            if (i3 == 0) {
                                outputStream.write(split[i3].substring(0, i4).getBytes());
                                outputStream.write(split[i3].substring(i4).replace("\\U26", "%26").getBytes(str2));
                            } else {
                                outputStream.write(38);
                                outputStream.write(split[i3].substring(0, i4).getBytes());
                                outputStream.write(split[i3].substring(i4).replace("\\U26", "%26").getBytes(str2));
                            }
                        }
                    }
                }
                outputStream.flush();
                outputStream.close();
            }
        }
        httpURLConnection.connect();
    }

    /* renamed from: l */
    private static HttpURLConnection m1929l(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", "Apache-HttpClient/UNAVAILABLE (java 1.4)");
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        return httpURLConnection;
    }

    /* renamed from: m */
    public static String m1930m(Context context, String str, String str2, String str3, String str4) {
        return m1931n(context, str, str2, str3, str4, null);
    }

    /* renamed from: n */
    public static String m1931n(Context context, String str, String str2, String str3, String str4, String str5) {
        String str6;
        Exception e;
        String[] strArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m1933p(str)).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Charset", str4);
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + "******");
            int i = -1;
            if (str5 != null) {
                String[] split = str5.split("\\|\\|");
                for (String str7 : split) {
                    int indexOf = str7.indexOf(61);
                    if (indexOf != -1) {
                        httpURLConnection.setRequestProperty(str7.substring(0, indexOf).trim(), str7.substring(indexOf + 1).trim());
                    }
                }
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            String[] split2 = str2.replace("\\&", "\\U26").split("&");
            int length = split2.length;
            int i2 = 0;
            while (i2 < length) {
                String str8 = split2[i2];
                int indexOf2 = str8.indexOf("=");
                if (indexOf2 != i) {
                    dataOutputStream.writeBytes("--" + "******" + "\r\n");
                    dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str8.substring(0, indexOf2) + "\"" + "\r\n");
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.write(str8.substring(indexOf2 + 1).replace("\\U26", "&").getBytes(str4));
                    dataOutputStream.writeBytes("\r\n");
                }
                i2++;
                i = -1;
            }
            dataOutputStream.writeBytes("--" + "******" + "\r\n");
            String[] b = C0861s.m2069b(str3, '|');
            String str9 = b.length > 1 ? "file[]" : "file";
            int length2 = b.length;
            int i3 = 0;
            boolean z = false;
            while (i3 < length2) {
                File file = new File(C0839h.m1906o(context, b[i3]));
                if (file.exists()) {
                    if (z) {
                        dataOutputStream.writeBytes("--" + "******" + "\r\n");
                    }
                    dataOutputStream.write(("Content-Disposition: form-data; name=\"" + str9 + "\"; filename=\"" + file.getName() + "\"" + "\r\n" + "Content-Type: " + C0860r.m2057p(file) + "\r\n").getBytes(str4));
                    dataOutputStream.writeBytes("\r\n");
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        strArr = b;
                        if (read == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, read);
                        b = strArr;
                    }
                    fileInputStream.close();
                    dataOutputStream.writeBytes("\r\n");
                    z = true;
                } else {
                    strArr = b;
                }
                i3++;
                b = strArr;
            }
            dataOutputStream.writeBytes("--" + "******" + "--" + "\r\n");
            dataOutputStream.flush();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str4));
            str6 = "";
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str6 = str6 + readLine;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return str6;
                }
            }
            dataOutputStream.close();
            inputStream.close();
        } catch (Exception e3) {
            e = e3;
            str6 = null;
            e.printStackTrace();
            return str6;
        }
        return str6;
    }

    /* renamed from: o */
    private static CookieManager m1932o() {
        if (f1741a == null) {
            CookieManager cookieManager = new CookieManager();
            f1741a = cookieManager;
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        }
        return f1741a;
    }

    /* renamed from: p */
    private static String m1933p(String str) {
        return str.replace(" ", "%20").replace("\\&", "%26");
    }

    /* renamed from: q */
    public static Intent m1934q(Context context, String str) {
        if (context == null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(C0851m.m1977c(context, str));
            return intent;
        }
        String[] split = "com.tencent.mtt,com.tencent.mtt.x86,com.UCMobile,sogou.mobile.explorer,com.oupeng.browser,com.baidu.browser.apps,com.android.chrome,com.UCMobile.cmcc,org.mozilla.firefox,com.ijinshan.browser_fast,com.uc.browser,com.roboo.explorer,com.mx.browser,com.kk.jd.browser,com.opera.mini.android".split(",");
        PackageManager packageManager = context.getPackageManager();
        Intent intent2 = null;
        for (String str2 : split) {
            intent2 = packageManager.getLaunchIntentForPackage(str2);
            if (intent2 != null) {
                break;
            }
        }
        if (intent2 != null) {
            intent2.setAction("android.intent.action.VIEW");
            intent2.addCategory("android.intent.category.DEFAULT");
        } else {
            intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
        }
        intent2.setData(C0851m.m1977c(context, str));
        return intent2;
    }

    /* renamed from: r */
    private static void m1935r(HttpsURLConnection httpsURLConnection) {
        if (f1742b == null) {
            f1742b = new X509TrustManager[]{new C0842a()};
        }
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(new KeyManager[0], f1742b, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(new C0843b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
