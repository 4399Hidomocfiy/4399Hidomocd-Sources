package bsh.util;

import java.io.IOException;
import java.net.ServerSocket;

public class Httpd extends Thread {

    /* renamed from: ss */
    ServerSocket f2134ss;

    public Httpd(int i) {
        this.f2134ss = new ServerSocket(i);
    }

    public static void main(String[] strArr) {
        new Httpd(Integer.parseInt(strArr[0])).start();
    }

    public void run() {
        while (true) {
            try {
                new HttpdConnection(this.f2134ss.accept()).start();
            } catch (IOException e) {
                System.out.println(e);
                return;
            }
        }
    }
}
