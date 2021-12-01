package p013b.p044b.p045a.p046a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.util.TypedValue;
import android.view.View;
import bsh.org.objectweb.asm.Constants;
import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.UUID;

/* renamed from: b.b.a.a.r */
public class C0860r {

    /* renamed from: a */
    private static int f1792a = -3;

    /* renamed from: b */
    private static String f1793b;

    /* renamed from: c */
    private static final String[][] f1794c = {new String[]{".3gp", "video/3gpp"}, new String[]{".apk", "application/vnd.android.package-archive"}, new String[]{".asf", "video/x-ms-asf"}, new String[]{".flv", "video/x-flv"}, new String[]{".rar", "application/x-rar"}, new String[]{".avi", "video/x-msvideo"}, new String[]{".ico", "image/x-ico"}, new String[]{".bin", "application/octet-stream"}, new String[]{".bmp", "image/bmp"}, new String[]{".c", "text/plain"}, new String[]{".class", "application/octet-stream"}, new String[]{".conf", "text/plain"}, new String[]{".cpp", "text/plain"}, new String[]{".doc", "application/msword"}, new String[]{".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"}, new String[]{".xls", "application/vnd.ms-excel"}, new String[]{".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"}, new String[]{".exe", "application/octet-stream"}, new String[]{".gif", "image/gif"}, new String[]{".gtar", "application/x-gtar"}, new String[]{".gz", "application/x-gzip"}, new String[]{".h", "text/plain"}, new String[]{".htm", "text/html"}, new String[]{".html", "text/html"}, new String[]{".jar", "application/java-archive"}, new String[]{".java", "text/plain"}, new String[]{".jpeg", "image/jpeg"}, new String[]{".jpg", "image/jpeg"}, new String[]{".js", "application/x-javascript"}, new String[]{".log", "text/plain"}, new String[]{".m3u", "audio/x-mpegurl"}, new String[]{".m4a", "audio/mp4a-latm"}, new String[]{".m4b", "audio/mp4a-latm"}, new String[]{".m4p", "audio/mp4a-latm"}, new String[]{".m4u", "video/vnd.mpegurl"}, new String[]{".m4v", "video/x-m4v"}, new String[]{".mov", "video/quicktime"}, new String[]{".mp2", "audio/x-mpeg"}, new String[]{".mp3", "audio/x-mpeg"}, new String[]{".mp4", "video/mp4"}, new String[]{".mpc", "application/vnd.mpohun.certificate"}, new String[]{".mpe", "video/mpeg"}, new String[]{".mpeg", "video/mpeg"}, new String[]{".mpg", "video/mpeg"}, new String[]{".mpg4", "video/mp4"}, new String[]{".mpga", "audio/mpeg"}, new String[]{".msg", "application/vnd.ms-outlook"}, new String[]{".ogg", "audio/ogg"}, new String[]{".pdf", "application/pdf"}, new String[]{".png", "image/png"}, new String[]{".pps", "application/vnd.ms-powerpoint"}, new String[]{".ppt", "application/vnd.ms-powerpoint"}, new String[]{".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"}, new String[]{".prop", "text/plain"}, new String[]{".rc", "text/plain"}, new String[]{".rmvb", "audio/x-pn-realaudio"}, new String[]{".rtf", "application/rtf"}, new String[]{".sh", "text/plain"}, new String[]{".tar", "application/x-tar"}, new String[]{".tgz", "application/x-compressed"}, new String[]{".txt", "text/plain"}, new String[]{".wav", "audio/x-wav"}, new String[]{".wma", "audio/x-ms-wma"}, new String[]{".wmv", "audio/x-ms-wmv"}, new String[]{".wps", "application/vnd.ms-works"}, new String[]{".xml", "text/plain"}, new String[]{".z", "application/x-compress"}, new String[]{".zip", "application/x-zip-compressed"}, new String[]{"", "*/*"}};

    /* renamed from: A */
    public static int m2037A(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x003a */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* renamed from: B */
    public static String m2038B(String str, String str2) {
        byte[] bArr;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                stringBuffer.append("%25");
            } else if (charAt < 0 || charAt > 255) {
                try {
                    bArr = String.valueOf(charAt).getBytes(str2);
                } catch (Exception unused) {
                    bArr = new byte[0];
                }
                for (byte b : bArr) {
                    if (b < 0) {
                        b += 256;
                    }
                    stringBuffer.append("%" + Integer.toHexString(b == true ? 1 : 0).toUpperCase());
                }
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: C */
    public static String m2039C(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: D */
    public static String m2040D(String str) {
        char c;
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int charAt = str.charAt(i2);
            if (charAt == 37) {
                int i4 = i2 + 1;
                char charAt2 = str.charAt(i4);
                char c2 = (char) charAt2;
                int lowerCase = (Character.isDigit(c2) ? charAt2 - '0' : (Character.toLowerCase(c2) + '\n') - 97) & 15;
                i2 = i4 + 1;
                char charAt3 = str.charAt(i2);
                char c3 = (char) charAt3;
                charAt = (lowerCase << 4) | ((Character.isDigit(c3) ? charAt3 - '0' : (Character.toLowerCase(c3) + '\n') - 97) & 15);
            } else if (charAt == 43) {
                charAt = 32;
            }
            if ((charAt & Constants.CHECKCAST) == 128) {
                i3 = (i3 << 6) | (charAt & 63);
                i--;
                if (i == 0) {
                    c = (char) i3;
                } else {
                    i2++;
                }
            } else if ((charAt & 128) == 0) {
                c = (char) charAt;
            } else {
                if ((charAt & 224) == 192) {
                    i3 = charAt & 31;
                    i = 1;
                } else if ((charAt & 240) == 224) {
                    i3 = charAt & 15;
                    i = 2;
                } else if ((charAt & 248) == 240) {
                    i3 = charAt & 7;
                    i = 3;
                } else if ((charAt & 252) == 248) {
                    i3 = charAt & 3;
                    i = 4;
                } else {
                    i3 = charAt & 1;
                    i = 5;
                }
                i2++;
            }
            stringBuffer.append(c);
            i2++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: E */
    public static String m2041E(String str, String str2) {
        try {
            return URLDecoder.decode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m2042a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return str.substring((lastIndexOf == -1 && (lastIndexOf = str.replace('\\', '/').lastIndexOf(47)) == -1) ? str.length() - 6 : lastIndexOf + 1);
    }

    /* renamed from: b */
    public static String m2043b(String str) {
        return str.substring(str.replace('\\', '/').lastIndexOf(47) + 1);
    }

    /* renamed from: c */
    public static String m2044c(String str, String str2, String str3) {
        int i;
        int i2;
        if (str2 != null) {
            int indexOf = str.indexOf(str2);
            if (indexOf == -1) {
                return null;
            }
            i = indexOf + str2.length();
        } else {
            i = 0;
        }
        if (str3 == null) {
            i2 = str.length();
        } else {
            i2 = str.indexOf(str3, i);
            if (i2 == -1) {
                return null;
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: d */
    public static String m2045d(String str) {
        return m2046e(str.getBytes());
    }

    /* renamed from: e */
    public static String m2046e(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            int length = digest.length;
            char[] cArr2 = new char[(length * 2)];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m2047f(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            int length = bArr.length;
            char[] cArr2 = new char[(length * 2)];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static int m2048g(int i, int i2) {
        double random = Math.random();
        double d = (double) ((i2 + 1) - i);
        Double.isNaN(d);
        double d2 = (double) i;
        Double.isNaN(d2);
        return (int) ((random * d) + d2);
    }

    /* renamed from: h */
    public static String m2049h(String str, String str2) {
        String c = m2044c(str, "<" + str2 + ">", "</" + str2 + ">");
        return c == null ? "" : c;
    }

    /* renamed from: i */
    public static int m2050i(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: j */
    public static String m2051j(String str, String str2) {
        return str + str2;
    }

    /* renamed from: k */
    public static void m2052k(String str, Context context) {
        ((ClipboardManager) context.getSystemService("clipboard")).setText(str.trim());
    }

    /* renamed from: l */
    public static int m2053l(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: m */
    public static View m2054m(int i, View view) {
        return view.findViewById(i);
    }

    /* renamed from: n */
    public static void m2055n(String str, String str2) {
        C0864v.f1802l.put(str, str2.replace("&lt;", "<").replace("&gt;", ">"));
    }

    /* renamed from: o */
    public static int m2056o(String str) {
        return str.startsWith("#") ? Color.parseColor(str) : Integer.parseInt(str);
    }

    /* renamed from: p */
    public static String m2057p(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                String probeContentType = Files.probeContentType(Paths.get(file.toURI()));
                if (probeContentType != null) {
                    return probeContentType;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return m2059r(file);
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: q */
    public static String m2058q(Context context) {
        String str = f1793b;
        if (str != null && str.length() > 0) {
            return f1793b;
        }
        try {
            f1793b = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Throwable unused) {
        }
        String str2 = f1793b;
        if (str2 == null || str2.length() == 0) {
            try {
                f1793b = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
            } catch (Throwable unused2) {
            }
            String str3 = f1793b;
            if (str3 == null || str3.length() == 0) {
                String str4 = null;
                File file = new File(String.format("%s/.UUID.User", context.getFilesDir()));
                if (file.exists()) {
                    str4 = C0835f.m1851h(file.getAbsolutePath());
                }
                if (str4 == null || str4.length() == 0) {
                    str4 = m2045d(UUID.randomUUID().toString()).substring(16);
                    C0835f.m1854k(file.getAbsolutePath(), str4);
                }
                f1793b = str4;
            }
        }
        return f1793b;
    }

    /* renamed from: r */
    private static String m2059r(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf < 0) {
            return "*/*";
        }
        String lowerCase = name.substring(lastIndexOf, name.length()).toLowerCase();
        if (lowerCase.length() == 0) {
            return "*/*";
        }
        int i = 0;
        while (true) {
            String[][] strArr = f1794c;
            if (i >= strArr.length) {
                return "*/*";
            }
            if (lowerCase.equals(strArr[i][0])) {
                return strArr[i][1];
            }
            i++;
        }
    }

    /* renamed from: s */
    public static int m2060s(Context context) {
        if (f1792a == -3) {
            f1792a = -2;
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(2130903043, typedValue, true)) {
                f1792a = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return f1792a;
    }

    /* renamed from: t */
    public static byte m2061t(byte[] bArr) {
        int i = 0;
        for (char c : String.valueOf(bArr.length).toCharArray()) {
            i += Integer.parseInt(String.valueOf(c));
        }
        return (byte) i;
    }

    /* renamed from: u */
    public static String m2062u(int i) {
        Formatter format;
        Calendar instance = Calendar.getInstance();
        long time = new Date().getTime();
        instance.setTimeInMillis(time);
        Formatter formatter = new Formatter(Locale.CHINA);
        if (i == 0) {
            format = formatter.format("%1$tY-%1$tm-%1$td %1$tT", instance);
        } else if (i == 1) {
            format = formatter.format("%1$tY/%1$tm/%1$td %1$tT", instance);
        } else if (i == 2) {
            format = formatter.format("%1$tY-%1$tm-%1$td", instance);
        } else if (i == 3) {
            format = formatter.format("%1$tT", instance);
        } else if (i == 4) {
            return String.valueOf(time);
        } else {
            format = formatter.format("%1$tY年%1$tm月%1$td日 %1$tT", instance);
        }
        return format.toString();
    }

    /* renamed from: v */
    public static boolean m2063v(String str) {
        return str.startsWith("http:") || str.startsWith("https:") || str.startsWith("rtsp:") || str.startsWith("ftp:");
    }

    /* renamed from: w */
    public static int m2064w(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: x */
    public static int m2065x(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: y */
    public static void m2066y(View view, View view2) {
    }

    /* renamed from: z */
    public static boolean m2067z(Context context) {
        return String.valueOf(C0835f.m1849f(context, "extra_conf1g.xml")).contains("<signature>1</signature>");
    }
}
