package bsh.servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SimpleTemplate {
    static String NO_TEMPLATE = "NO_TEMPLATE";
    static boolean cacheTemplates = true;
    static Map templateData = new HashMap();
    StringBuffer buff;

    public SimpleTemplate(Reader reader) {
        init(getStringFromStream(reader));
    }

    public SimpleTemplate(String str) {
        init(str);
    }

    public SimpleTemplate(URL url) {
        init(getStringFromStream(url.openStream()));
    }

    public static String getStringFromStream(InputStream inputStream) {
        return getStringFromStream(new InputStreamReader(inputStream));
    }

    public static String getStringFromStream(Reader reader) {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return stringBuffer.toString();
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(readLine);
            stringBuffer2.append("\n");
            stringBuffer.append(stringBuffer2.toString());
        }
    }

    public static SimpleTemplate getTemplate(String str) {
        String str2 = (String) templateData.get(str);
        if (str2 == null || !cacheTemplates) {
            try {
                str2 = getStringFromStream(new FileReader(str));
                templateData.put(str, str2);
            } catch (IOException unused) {
                templateData.put(str, NO_TEMPLATE);
            }
        } else if (str2.equals(NO_TEMPLATE)) {
            return null;
        }
        if (str2 == null) {
            return null;
        }
        return new SimpleTemplate(str2);
    }

    private void init(String str) {
        this.buff = new StringBuffer(str);
    }

    public static void main(String[] strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        SimpleTemplate simpleTemplate = new SimpleTemplate(getStringFromStream(new FileReader(str)));
        simpleTemplate.replace(str2, str3);
        simpleTemplate.write(System.out);
    }

    public static void setCacheTemplates(boolean z) {
        cacheTemplates = z;
    }

    /* access modifiers changed from: package-private */
    public int[] findTemplate(String str) {
        int indexOf;
        int indexOf2;
        String stringBuffer = this.buff.toString();
        int length = stringBuffer.length();
        int i = 0;
        while (i < length && (indexOf = stringBuffer.indexOf("<!--", i)) != -1 && (indexOf2 = stringBuffer.indexOf("-->", indexOf)) != -1) {
            int i2 = indexOf2 + 3;
            int indexOf3 = stringBuffer.indexOf("TEMPLATE-", indexOf);
            if (indexOf3 != -1 && indexOf3 <= i2) {
                int i3 = indexOf3 + 9;
                int i4 = i3;
                while (i4 < length) {
                    char charAt = stringBuffer.charAt(i4);
                    if (charAt == ' ' || charAt == '\t' || charAt == '-') {
                        break;
                    }
                    i4++;
                }
                if (i4 >= length) {
                    return null;
                }
                if (stringBuffer.substring(i3, i4).equals(str)) {
                    return new int[]{indexOf, i2};
                }
            }
            i = i2;
        }
        return null;
    }

    public void replace(String str, String str2) {
        while (true) {
            int[] findTemplate = findTemplate(str);
            if (findTemplate != null) {
                this.buff.replace(findTemplate[0], findTemplate[1], str2);
            } else {
                return;
            }
        }
    }

    public String toString() {
        return this.buff.toString();
    }

    public void write(PrintStream printStream) {
        printStream.println(toString());
    }

    public void write(PrintWriter printWriter) {
        printWriter.println(toString());
    }
}
