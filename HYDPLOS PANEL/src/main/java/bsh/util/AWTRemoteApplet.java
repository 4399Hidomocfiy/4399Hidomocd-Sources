package bsh.util;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Label;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

public class AWTRemoteApplet extends Applet {

    /* renamed from: in */
    InputStream f2133in;
    OutputStream out;

    public void init() {
        setLayout(new BorderLayout());
        try {
            URL documentBase = getDocumentBase();
            Socket socket = new Socket(documentBase.getHost(), documentBase.getPort() + 1);
            this.out = socket.getOutputStream();
            this.f2133in = socket.getInputStream();
            add("Center", new AWTConsole(this.f2133in, this.out));
        } catch (IOException unused) {
            add("Center", new Label("Remote Connection Failed", 1));
        }
    }
}
