package bsh.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.StringTokenizer;

class HttpdConnection extends Thread {
    Socket client;

    /* renamed from: in */
    BufferedReader f2135in;
    boolean isHttp1;
    OutputStream out;
    PrintStream pout;

    HttpdConnection(Socket socket) {
        this.client = socket;
        setPriority(4);
    }

    private void error(int i, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><h1>");
        stringBuffer.append(str);
        stringBuffer.append("</h1></html>");
        String stringBuffer2 = stringBuffer.toString();
        if (this.isHttp1) {
            PrintStream printStream = this.pout;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("HTTP/1.0 ");
            stringBuffer3.append(i);
            stringBuffer3.append(" ");
            stringBuffer3.append(stringBuffer2);
            printStream.println(stringBuffer3.toString());
            this.pout.println("Content-type: text/html");
            PrintStream printStream2 = this.pout;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Content-length: ");
            stringBuffer4.append(stringBuffer2.length());
            stringBuffer4.append("\n");
            printStream2.println(stringBuffer4.toString());
        }
        this.pout.println(stringBuffer2);
    }

    private void sendFileData(String str) {
        int read;
        PrintStream printStream;
        String str2;
        InputStream resourceAsStream = getClass().getResourceAsStream(str);
        if (resourceAsStream != null) {
            int available = resourceAsStream.available();
            byte[] bArr = new byte[available];
            if (this.isHttp1) {
                this.pout.println("HTTP/1.0 200 Document follows");
                PrintStream printStream2 = this.pout;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Content-length: ");
                stringBuffer.append(available);
                printStream2.println(stringBuffer.toString());
                if (str.endsWith(".gif")) {
                    printStream = this.pout;
                    str2 = "Content-type: image/gif";
                } else if (str.endsWith(".html") || str.endsWith(".htm")) {
                    printStream = this.pout;
                    str2 = "Content-Type: text/html";
                } else {
                    printStream = this.pout;
                    str2 = "Content-Type: application/octet-stream";
                }
                printStream.println(str2);
                this.pout.println();
            }
            do {
                read = resourceAsStream.read(bArr);
                if (read > 0) {
                    this.pout.write(bArr, 0, read);
                }
            } while (read != -1);
            this.pout.flush();
            return;
        }
        throw new FileNotFoundException(str);
    }

    private void serveFile(String str) {
        if (str.equals("/")) {
            str = "/remote/remote.html";
        }
        if (str.startsWith("/remote/")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("/bsh/util/lib/");
            stringBuffer.append(str.substring(8));
            str = stringBuffer.toString();
        }
        if (!str.startsWith("/java")) {
            try {
                PrintStream printStream = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("sending file: ");
                stringBuffer2.append(str);
                printStream.println(stringBuffer2.toString());
                sendFileData(str);
                return;
            } catch (FileNotFoundException unused) {
            }
        }
        error(404, "Object Not Found");
    }

    public void run() {
        String readLine;
        try {
            this.f2135in = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
            this.out = this.client.getOutputStream();
            this.pout = new PrintStream(this.out);
            String readLine2 = this.f2135in.readLine();
            if (readLine2 == null) {
                error(400, "Empty Request");
            }
            if (readLine2.toLowerCase().indexOf("http/1.") != -1) {
                do {
                    readLine = this.f2135in.readLine();
                    if (readLine.equals("")) {
                        break;
                    }
                } while (readLine != null);
                this.isHttp1 = true;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine2);
            if (stringTokenizer.countTokens() >= 2 && stringTokenizer.nextToken().equals("GET")) {
                serveFile(stringTokenizer.nextToken());
            } else {
                error(400, "Bad Request");
            }
            this.client.close();
        } catch (IOException e) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("I/O error ");
            stringBuffer.append(e);
            printStream.println(stringBuffer.toString());
            try {
                this.client.close();
            } catch (Exception unused) {
            }
        }
    }
}
