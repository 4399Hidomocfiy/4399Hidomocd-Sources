package bsh.servlet;

import bsh.EvalError;
import bsh.Interpreter;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BshServlet extends HttpServlet {
    static String bshVersion = null;
    static /* synthetic */ Class class$bsh$servlet$BshServlet = null;
    static String exampleScript = "print(\"hello!\");";

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static String escape(String str) {
        String[] strArr = {"&amp;", "&lt;", "&gt;"};
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int indexOf = "&<>".indexOf(charAt);
            if (indexOf < 0) {
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append(strArr[indexOf]);
            }
        }
        return stringBuffer.toString();
    }

    static String getBshVersion() {
        String str = bshVersion;
        if (str != null) {
            return str;
        }
        Interpreter interpreter = new Interpreter();
        try {
            Class cls = class$bsh$servlet$BshServlet;
            if (cls == null) {
                cls = class$("bsh.servlet.BshServlet");
                class$bsh$servlet$BshServlet = cls;
            }
            interpreter.eval(new InputStreamReader(cls.getResource("getVersion.bsh").openStream()));
            bshVersion = (String) interpreter.eval("getVersion()");
        } catch (Exception unused) {
            bshVersion = "BeanShell: unknown version";
        }
        return bshVersion;
    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        Object obj;
        String parameter = httpServletRequest.getParameter("bsh.script");
        String parameter2 = httpServletRequest.getParameter("bsh.client");
        String parameter3 = httpServletRequest.getParameter("bsh.servlet.output");
        String parameter4 = httpServletRequest.getParameter("bsh.servlet.captureOutErr");
        boolean z = parameter4 != null && parameter4.equalsIgnoreCase("true");
        StringBuffer stringBuffer = new StringBuffer();
        Exception exc = null;
        if (parameter != null) {
            try {
                obj = evalScript(parameter, stringBuffer, z, httpServletRequest, httpServletResponse);
            } catch (Exception e) {
                obj = null;
                exc = e;
            }
        } else {
            obj = null;
        }
        httpServletResponse.setHeader("Bsh-Return", String.valueOf(obj));
        if ((parameter3 == null || !parameter3.equalsIgnoreCase("raw")) && (parameter2 == null || !parameter2.equals("Remote"))) {
            sendHTML(httpServletRequest, httpServletResponse, parameter, exc, obj, stringBuffer, z);
        } else {
            sendRaw(httpServletRequest, httpServletResponse, exc, obj, stringBuffer);
        }
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        doGet(httpServletRequest, httpServletResponse);
    }

    /* access modifiers changed from: package-private */
    public Object evalScript(String str, StringBuffer stringBuffer, boolean z, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        Interpreter interpreter = new Interpreter(null, printStream, printStream, false);
        interpreter.set("bsh.httpServletRequest", httpServletRequest);
        interpreter.set("bsh.httpServletResponse", httpServletResponse);
        PrintStream printStream2 = System.out;
        PrintStream printStream3 = System.err;
        if (z) {
            System.setOut(printStream);
            System.setErr(printStream);
        }
        try {
            Object eval = interpreter.eval(str);
            printStream.flush();
            stringBuffer.append(byteArrayOutputStream.toString());
            return eval;
        } finally {
            if (z) {
                System.setOut(printStream2);
                System.setErr(printStream3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String formatScriptResultHTML(String str, Object obj, Exception exc, StringBuffer stringBuffer) {
        SimpleTemplate simpleTemplate;
        String str2;
        if (exc != null) {
            simpleTemplate = new SimpleTemplate(getClass().getResource("error.template"));
            if (exc instanceof EvalError) {
                int errorLineNumber = ((EvalError) exc).getErrorLineNumber();
                str2 = escape(exc.getMessage());
                if (errorLineNumber > -1) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str2);
                    stringBuffer2.append("<hr>");
                    stringBuffer2.append(showScriptContextHTML(str, errorLineNumber, 4));
                    str2 = stringBuffer2.toString();
                }
            } else {
                str2 = escape(exc.toString());
            }
            simpleTemplate.replace("error", str2);
        } else {
            SimpleTemplate simpleTemplate2 = new SimpleTemplate(getClass().getResource("result.template"));
            simpleTemplate2.replace("value", escape(String.valueOf(obj)));
            simpleTemplate2.replace("output", escape(stringBuffer.toString()));
            simpleTemplate = simpleTemplate2;
        }
        return simpleTemplate.toString();
    }

    /* access modifiers changed from: package-private */
    public void sendHTML(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String str, Exception exc, Object obj, StringBuffer stringBuffer, boolean z) {
        Class cls = class$bsh$servlet$BshServlet;
        if (cls == null) {
            cls = class$("bsh.servlet.BshServlet");
            class$bsh$servlet$BshServlet = cls;
        }
        SimpleTemplate simpleTemplate = new SimpleTemplate(cls.getResource("page.template"));
        simpleTemplate.replace("version", getBshVersion());
        simpleTemplate.replace("servletURL", httpServletRequest.getRequestURI());
        if (str != null) {
            simpleTemplate.replace("script", str);
        } else {
            simpleTemplate.replace("script", exampleScript);
        }
        simpleTemplate.replace("captureOutErr", z ? "CHECKED" : "");
        if (str != null) {
            simpleTemplate.replace("scriptResult", formatScriptResultHTML(str, obj, exc, stringBuffer));
        }
        httpServletResponse.setContentType("text/html");
        PrintWriter writer = httpServletResponse.getWriter();
        simpleTemplate.write(writer);
        writer.flush();
    }

    /* access modifiers changed from: package-private */
    public void sendRaw(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Exception exc, Object obj, StringBuffer stringBuffer) {
        String str;
        httpServletResponse.setContentType("text/plain");
        PrintWriter writer = httpServletResponse.getWriter();
        if (exc != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Script Error:\n");
            stringBuffer2.append(exc);
            str = stringBuffer2.toString();
        } else {
            str = stringBuffer.toString();
        }
        writer.println(str);
        writer.flush();
    }

    /* access modifiers changed from: package-private */
    public String showScriptContextHTML(String str, int i, int i2) {
        StringBuffer stringBuffer;
        String str2;
        StringBuffer stringBuffer2 = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        int max = Math.max(1, i - i2);
        int i3 = i2 + i;
        for (int i4 = 1; i4 <= i3 + 1; i4++) {
            if (i4 < max) {
                try {
                    bufferedReader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e.toString());
                }
            } else if (i4 > i3) {
                break;
            } else {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (i4 == i) {
                        stringBuffer.append("<font color=\"red\">");
                        stringBuffer.append(i4);
                        stringBuffer.append(": ");
                        stringBuffer.append(readLine);
                        str2 = "</font><br/>";
                    } else {
                        stringBuffer = new StringBuffer();
                        stringBuffer.append(i4);
                        stringBuffer.append(": ");
                        stringBuffer.append(readLine);
                        str2 = "<br/>";
                    }
                    stringBuffer.append(str2);
                    stringBuffer2.append(stringBuffer.toString());
                } catch (IOException e2) {
                    throw new RuntimeException(e2.toString());
                }
            }
        }
        return stringBuffer2.toString();
    }
}
