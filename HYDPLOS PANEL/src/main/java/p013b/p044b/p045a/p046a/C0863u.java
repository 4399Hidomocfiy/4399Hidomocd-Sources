package p013b.p044b.p045a.p046a;

import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;

/* renamed from: b.b.a.a.u */
public class C0863u {

    /* renamed from: a */
    static BitSet f1798a = new BitSet(256);

    /* renamed from: b */
    static String f1799b = "utf-8";

    static {
        for (int i = 97; i <= 122; i++) {
            f1798a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f1798a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f1798a.set(i3);
        }
        f1798a.set(32);
        f1798a.set(45);
        f1798a.set(95);
        f1798a.set(46);
        f1798a.set(42);
    }

    @Deprecated
    /* renamed from: a */
    public static String m2085a(String str) {
        try {
            return m2086b(str, f1799b);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m2086b(String str, String str2) {
        BitSet bitSet;
        int i;
        char charAt;
        StringBuffer stringBuffer = new StringBuffer(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        if (str2 != null) {
            try {
                Charset forName = Charset.forName(str2);
                int i2 = 0;
                boolean z = false;
                while (i2 < str.length()) {
                    char charAt2 = str.charAt(i2);
                    if (f1798a.get(charAt2)) {
                        if (charAt2 == ' ') {
                            stringBuffer.append("%20");
                            z = true;
                        } else {
                            stringBuffer.append((char) charAt2);
                        }
                        i2++;
                    } else {
                        do {
                            charArrayWriter.write(charAt2);
                            if (charAt2 >= 55296 && charAt2 <= 56319 && (i = i2 + 1) < str.length() && (charAt = str.charAt(i)) >= 56320 && charAt <= 57343) {
                                charArrayWriter.write(charAt);
                                i2 = i;
                            }
                            i2++;
                            if (i2 >= str.length()) {
                                break;
                            }
                            bitSet = f1798a;
                            charAt2 = str.charAt(i2);
                        } while (!bitSet.get(charAt2));
                        charArrayWriter.flush();
                        byte[] bytes = new String(charArrayWriter.toCharArray()).getBytes(forName);
                        for (int i3 = 0; i3 < bytes.length; i3++) {
                            stringBuffer.append('%');
                            char forDigit = Character.forDigit((bytes[i3] >> 4) & 15, 16);
                            if (Character.isLetter(forDigit)) {
                                forDigit = (char) (forDigit - ' ');
                            }
                            stringBuffer.append(forDigit);
                            char forDigit2 = Character.forDigit(bytes[i3] & 15, 16);
                            if (Character.isLetter(forDigit2)) {
                                forDigit2 = (char) (forDigit2 - ' ');
                            }
                            stringBuffer.append(forDigit2);
                        }
                        charArrayWriter.reset();
                        z = true;
                    }
                }
                return z ? stringBuffer.toString() : str;
            } catch (IllegalCharsetNameException unused) {
                throw new UnsupportedEncodingException(str2);
            } catch (UnsupportedCharsetException unused2) {
                throw new UnsupportedEncodingException(str2);
            }
        } else {
            throw new NullPointerException("charsetName");
        }
    }
}
