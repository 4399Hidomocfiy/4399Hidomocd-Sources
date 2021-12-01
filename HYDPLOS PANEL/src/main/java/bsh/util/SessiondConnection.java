package bsh.util;

import bsh.Interpreter;
import bsh.NameSpace;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

class SessiondConnection extends Thread {
    Socket client;
    NameSpace globalNameSpace;

    SessiondConnection(NameSpace nameSpace, Socket socket) {
        this.client = socket;
        this.globalNameSpace = nameSpace;
    }

    public void run() {
        try {
            InputStream inputStream = this.client.getInputStream();
            PrintStream printStream = new PrintStream(this.client.getOutputStream());
            Interpreter interpreter = new Interpreter(new InputStreamReader(inputStream), printStream, printStream, true, this.globalNameSpace);
            interpreter.setExitOnEOF(false);
            interpreter.run();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
