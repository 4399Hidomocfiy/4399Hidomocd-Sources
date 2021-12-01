package bsh.util;

import bsh.NameSpace;
import java.io.IOException;
import java.net.ServerSocket;

public class Sessiond extends Thread {
    NameSpace globalNameSpace;

    /* renamed from: ss */
    private ServerSocket f2138ss;

    public Sessiond(NameSpace nameSpace, int i) {
        this.f2138ss = new ServerSocket(i);
        this.globalNameSpace = nameSpace;
    }

    public void run() {
        while (true) {
            try {
                new SessiondConnection(this.globalNameSpace, this.f2138ss.accept()).start();
            } catch (IOException e) {
                System.out.println(e);
                return;
            }
        }
    }
}
