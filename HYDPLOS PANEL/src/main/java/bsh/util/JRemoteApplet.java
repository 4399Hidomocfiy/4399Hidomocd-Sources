package bsh.util;

import java.awt.BorderLayout;
import java.awt.Label;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import javax.swing.JApplet;

public class JRemoteApplet extends JApplet {

    /* renamed from: in */
    InputStream f2137in;
    OutputStream out;

    public void init() {
        getContentPane().setLayout(new BorderLayout());
        try {
            URL documentBase = getDocumentBase();
            Socket socket = new Socket(documentBase.getHost(), documentBase.getPort() + 1);
            this.out = socket.getOutputStream();
            this.f2137in = socket.getInputStream();
            getContentPane().add("Center", new JConsole(this.f2137in, this.out));
        } catch (IOException unused) {
            getContentPane().add("Center", new Label("Remote Connection Failed", 1));
        }
    }
}
