package bsh.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class JConsole extends JScrollPane implements GUIConsoleInterface, Runnable, KeyListener, MouseListener, ActionListener, PropertyChangeListener {
    private static final String COPY = "Copy";
    private static final String CUT = "Cut";
    private static final String PASTE = "Paste";
    final int SHOW_AMBIG_MAX;
    String ZEROS;
    private int cmdStart;
    private DefaultStyledDocument doc;
    private boolean gotUp;
    private int histLine;
    private Vector history;

    /* renamed from: in */
    private InputStream f2136in;
    private InputStream inPipe;
    private JPopupMenu menu;
    NameCompletion nameCompletion;
    private PrintStream out;
    private OutputStream outPipe;
    private String startedLine;
    private JTextPane text;

    public static class BlockingPipedInputStream extends PipedInputStream {
        boolean closed;

        public BlockingPipedInputStream(PipedOutputStream pipedOutputStream) {
            super(pipedOutputStream);
        }

        @Override // java.io.PipedInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
            this.closed = true;
            super.close();
        }

        @Override // java.io.PipedInputStream, java.io.InputStream
        public synchronized int read() {
            int i;
            int i2;
            if (!this.closed) {
                while (true) {
                    i = ((PipedInputStream) this).in;
                    if (i >= 0) {
                        break;
                    }
                    notifyAll();
                    try {
                        wait(750);
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                byte[] bArr = ((PipedInputStream) this).buffer;
                int i3 = ((PipedInputStream) this).out;
                int i4 = i3 + 1;
                ((PipedInputStream) this).out = i4;
                i2 = bArr[i3] & 255;
                if (i4 >= bArr.length) {
                    ((PipedInputStream) this).out = 0;
                }
                if (i == ((PipedInputStream) this).out) {
                    ((PipedInputStream) this).in = -1;
                }
            } else {
                throw new IOException("stream closed");
            }
            return i2;
        }
    }

    public JConsole() {
        this(null, null);
    }

    public JConsole(InputStream inputStream, OutputStream outputStream) {
        this.cmdStart = 0;
        this.history = new Vector();
        this.histLine = 0;
        this.SHOW_AMBIG_MAX = 10;
        this.gotUp = true;
        this.ZEROS = "000";
        DefaultStyledDocument defaultStyledDocument = new DefaultStyledDocument();
        this.doc = defaultStyledDocument;
        this.text = new JTextPane(this, defaultStyledDocument) {
            /* class bsh.util.JConsole.C09791 */
            private final /* synthetic */ JConsole this$0;

            {
                this.this$0 = r1;
            }

            public void cut() {
                if (this.this$0.text.getCaretPosition() < this.this$0.cmdStart) {
                    JConsole.super.copy();
                } else {
                    JConsole.super.cut();
                }
            }

            public void paste() {
                this.this$0.forceCaretMoveToEnd();
                JConsole.super.paste();
            }
        };
        Font font = new Font("Monospaced", 0, 14);
        this.text.setText("");
        this.text.setFont(font);
        this.text.setMargin(new Insets(7, 5, 7, 5));
        this.text.addKeyListener(this);
        setViewportView(this.text);
        JPopupMenu jPopupMenu = new JPopupMenu("JConsole\tMenu");
        this.menu = jPopupMenu;
        jPopupMenu.add(new JMenuItem(CUT)).addActionListener(this);
        this.menu.add(new JMenuItem(COPY)).addActionListener(this);
        this.menu.add(new JMenuItem(PASTE)).addActionListener(this);
        this.text.addMouseListener(this);
        UIManager.addPropertyChangeListener(this);
        this.outPipe = outputStream;
        if (outputStream == null) {
            this.outPipe = new PipedOutputStream();
            try {
                this.f2136in = new PipedInputStream((PipedOutputStream) this.outPipe);
            } catch (IOException unused) {
                print("Console internal\terror (1)...", Color.red);
            }
        }
        this.inPipe = inputStream;
        if (inputStream == null) {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.out = new PrintStream(pipedOutputStream);
            try {
                this.inPipe = new BlockingPipedInputStream(pipedOutputStream);
            } catch (IOException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Console internal error: ");
                stringBuffer.append(e);
                print(stringBuffer.toString());
            }
        }
        new Thread(this).start();
        requestFocus();
    }

    private void acceptLine(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String num = Integer.toString(str.charAt(i), 16);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.ZEROS.substring(0, 4 - num.length()));
            stringBuffer2.append(num);
            String stringBuffer3 = stringBuffer2.toString();
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("\\u");
            stringBuffer4.append(stringBuffer3);
            stringBuffer.append(stringBuffer4.toString());
        }
        String stringBuffer5 = stringBuffer.toString();
        OutputStream outputStream = this.outPipe;
        if (outputStream == null) {
            print("Console internal\terror: cannot output ...", Color.red);
            return;
        }
        try {
            outputStream.write(stringBuffer5.getBytes());
            this.outPipe.flush();
        } catch (IOException unused) {
            this.outPipe = null;
            throw new RuntimeException("Console pipe broken...");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void append(String str) {
        int textLength = textLength();
        this.text.select(textLength, textLength);
        this.text.replaceSelection(str);
    }

    private void doCommandCompletion(String str) {
        if (this.nameCompletion != null) {
            int length = str.length() - 1;
            while (length >= 0 && (Character.isJavaIdentifierPart(str.charAt(length)) || str.charAt(length) == '.')) {
                length--;
            }
            String substring = str.substring(length + 1);
            if (substring.length() >= 2) {
                String[] completeName = this.nameCompletion.completeName(substring);
                if (completeName.length == 0) {
                    Toolkit.getDefaultToolkit().beep();
                    return;
                }
                int i = 0;
                if (completeName.length != 1 || completeName.equals(substring)) {
                    String text2 = this.text.getText();
                    String substring2 = text2.substring(this.cmdStart);
                    int i2 = this.cmdStart;
                    while (text2.charAt(i2) != '\n' && i2 > 0) {
                        i2--;
                    }
                    Object substring3 = text2.substring(i2 + 1, this.cmdStart);
                    StringBuffer stringBuffer = new StringBuffer("\n");
                    while (i < completeName.length && i < 10) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(completeName[i]);
                        stringBuffer2.append("\n");
                        stringBuffer.append(stringBuffer2.toString());
                        i++;
                    }
                    if (i == 10) {
                        stringBuffer.append("...\n");
                    }
                    print(stringBuffer, Color.gray);
                    print(substring3);
                    append(substring2);
                    return;
                }
                append(completeName[0].substring(substring.length()));
            }
        }
    }

    private void enter() {
        String str;
        String cmd = getCmd();
        if (cmd.length() == 0) {
            str = ";\n";
        } else {
            this.history.addElement(cmd);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cmd);
            stringBuffer.append("\n");
            str = stringBuffer.toString();
        }
        append("\n");
        this.histLine = 0;
        acceptLine(str);
        this.text.repaint();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void forceCaretMoveToEnd() {
        if (this.text.getCaretPosition() < this.cmdStart) {
            this.text.setCaretPosition(textLength());
        }
        this.text.repaint();
    }

    private void forceCaretMoveToStart() {
        this.text.getCaretPosition();
        this.text.repaint();
    }

    private String getCmd() {
        try {
            return this.text.getText(this.cmdStart, textLength() - this.cmdStart);
        } catch (BadLocationException e) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Internal JConsole Error: ");
            stringBuffer.append(e);
            printStream.println(stringBuffer.toString());
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private AttributeSet getStyle() {
        return this.text.getCharacterAttributes();
    }

    private void historyDown() {
        int i = this.histLine;
        if (i != 0) {
            this.histLine = i - 1;
            showHistoryLine();
        }
    }

    private void historyUp() {
        if (this.history.size() != 0) {
            if (this.histLine == 0) {
                this.startedLine = getCmd();
            }
            if (this.histLine < this.history.size()) {
                this.histLine++;
                showHistoryLine();
            }
        }
    }

    private void inPipeWatcher() {
        byte[] bArr = new byte[256];
        while (true) {
            int read = this.inPipe.read(bArr);
            if (read == -1) {
                println("Console: Input\tclosed...");
                return;
            }
            print(new String(bArr, 0, read));
        }
    }

    private void invokeAndWait(Runnable runnable) {
        if (!SwingUtilities.isEventDispatchThread()) {
            try {
                SwingUtilities.invokeAndWait(runnable);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            runnable.run();
        }
    }

    private String replaceRange(Object obj, int i, int i2) {
        String obj2 = obj.toString();
        this.text.select(i, i2);
        this.text.replaceSelection(obj2);
        return obj2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void resetCommandStart() {
        this.cmdStart = textLength();
    }

    private AttributeSet setStyle(Color color) {
        return setStyle((Font) null, color);
    }

    private AttributeSet setStyle(Font font) {
        return setStyle(font, (Color) null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private AttributeSet setStyle(Font font, Color color) {
        return font != null ? setStyle(font.getFamily(), font.getSize(), color, font.isBold(), font.isItalic(), StyleConstants.isUnderline(getStyle())) : setStyle(null, -1, color);
    }

    private AttributeSet setStyle(String str, int i, Color color) {
        SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
        if (color != null) {
            StyleConstants.setForeground(simpleAttributeSet, color);
        }
        if (str != null) {
            StyleConstants.setFontFamily(simpleAttributeSet, str);
        }
        if (i != -1) {
            StyleConstants.setFontSize(simpleAttributeSet, i);
        }
        setStyle((AttributeSet) simpleAttributeSet);
        return getStyle();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private AttributeSet setStyle(String str, int i, Color color, boolean z, boolean z2, boolean z3) {
        SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
        if (color != null) {
            StyleConstants.setForeground(simpleAttributeSet, color);
        }
        if (str != null) {
            StyleConstants.setFontFamily(simpleAttributeSet, str);
        }
        if (i != -1) {
            StyleConstants.setFontSize(simpleAttributeSet, i);
        }
        StyleConstants.setBold(simpleAttributeSet, z);
        StyleConstants.setItalic(simpleAttributeSet, z2);
        StyleConstants.setUnderline(simpleAttributeSet, z3);
        setStyle((AttributeSet) simpleAttributeSet);
        return getStyle();
    }

    private void setStyle(AttributeSet attributeSet) {
        setStyle(attributeSet, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStyle(AttributeSet attributeSet, boolean z) {
        this.text.setCharacterAttributes(attributeSet, z);
    }

    private void showHistoryLine() {
        String str;
        if (this.histLine == 0) {
            str = this.startedLine;
        } else {
            Vector vector = this.history;
            str = (String) vector.elementAt(vector.size() - this.histLine);
        }
        replaceRange(str, this.cmdStart, textLength());
        this.text.setCaretPosition(textLength());
        this.text.repaint();
    }

    private int textLength() {
        return this.text.getDocument().getLength();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r3.text.getCaretPosition() <= r3.cmdStart) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void type(java.awt.event.KeyEvent r4) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.util.JConsole.type(java.awt.event.KeyEvent):void");
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String actionCommand = actionEvent.getActionCommand();
        if (actionCommand.equals(CUT)) {
            this.text.cut();
        } else if (actionCommand.equals(COPY)) {
            this.text.copy();
        } else if (actionCommand.equals(PASTE)) {
            this.text.paste();
        }
    }

    @Override // bsh.ConsoleInterface
    public void error(Object obj) {
        print(obj, Color.red);
    }

    @Override // bsh.ConsoleInterface
    public PrintStream getErr() {
        return this.out;
    }

    @Override // bsh.ConsoleInterface
    public Reader getIn() {
        return new InputStreamReader(this.f2136in);
    }

    public InputStream getInputStream() {
        return this.f2136in;
    }

    @Override // bsh.ConsoleInterface
    public PrintStream getOut() {
        return this.out;
    }

    public void keyPressed(KeyEvent keyEvent) {
        type(keyEvent);
        this.gotUp = false;
    }

    public void keyReleased(KeyEvent keyEvent) {
        this.gotUp = true;
        type(keyEvent);
    }

    public void keyTyped(KeyEvent keyEvent) {
        type(keyEvent);
    }

    public void mouseClicked(MouseEvent mouseEvent) {
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }

    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            this.menu.show((Component) mouseEvent.getSource(), mouseEvent.getX(), mouseEvent.getY());
        }
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            this.menu.show((Component) mouseEvent.getSource(), mouseEvent.getX(), mouseEvent.getY());
        }
        this.text.repaint();
    }

    @Override // bsh.ConsoleInterface
    public void print(final Object obj) {
        invokeAndWait(new Runnable() {
            /* class bsh.util.JConsole.RunnableC09802 */

            public void run() {
                JConsole.this.append(String.valueOf(obj));
                JConsole.this.resetCommandStart();
                JConsole.this.text.setCaretPosition(JConsole.this.cmdStart);
            }
        });
    }

    @Override // bsh.util.GUIConsoleInterface
    public void print(Object obj, Color color) {
        print(obj, null, color);
    }

    public void print(Object obj, Font font) {
        print(obj, font, null);
    }

    public void print(final Object obj, final Font font, final Color color) {
        invokeAndWait(new Runnable() {
            /* class bsh.util.JConsole.RunnableC09824 */

            public void run() {
                AttributeSet style = JConsole.this.getStyle();
                JConsole.this.setStyle((JConsole) font, (Font) color);
                JConsole.this.append(String.valueOf(obj));
                JConsole.this.resetCommandStart();
                JConsole.this.text.setCaretPosition(JConsole.this.cmdStart);
                JConsole.this.setStyle((JConsole) style, (AttributeSet) true);
            }
        });
    }

    public void print(Object obj, String str, int i, Color color) {
        print(obj, str, i, color, false, false, false);
    }

    public void print(final Object obj, final String str, final int i, final Color color, final boolean z, final boolean z2, final boolean z3) {
        invokeAndWait(new Runnable() {
            /* class bsh.util.JConsole.RunnableC09835 */

            public void run() {
                AttributeSet style = JConsole.this.getStyle();
                JConsole.this.setStyle(str, i, color, z, z2, z3);
                JConsole.this.append(String.valueOf(obj));
                JConsole.this.resetCommandStart();
                JConsole.this.text.setCaretPosition(JConsole.this.cmdStart);
                JConsole.this.setStyle((JConsole) style, (AttributeSet) true);
            }
        });
    }

    public void print(final Icon icon) {
        if (icon != null) {
            invokeAndWait(new Runnable() {
                /* class bsh.util.JConsole.RunnableC09813 */

                public void run() {
                    JConsole.this.text.insertIcon(icon);
                    JConsole.this.resetCommandStart();
                    JConsole.this.text.setCaretPosition(JConsole.this.cmdStart);
                }
            });
        }
    }

    public void println() {
        print("\n");
        this.text.repaint();
    }

    @Override // bsh.ConsoleInterface
    public void println(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(obj));
        stringBuffer.append("\n");
        print(stringBuffer.toString());
        this.text.repaint();
    }

    public void println(Icon icon) {
        print(icon);
        println();
        this.text.repaint();
    }

    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals("lookAndFeel")) {
            SwingUtilities.updateComponentTreeUI(this.menu);
        }
    }

    public void requestFocus() {
        JConsole.super.requestFocus();
        this.text.requestFocus();
    }

    public void run() {
        try {
            inPipeWatcher();
        } catch (IOException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Console: I/O Error: ");
            stringBuffer.append(e);
            stringBuffer.append("\n");
            print(stringBuffer.toString(), Color.red);
        }
    }

    public void setFont(Font font) {
        JConsole.super.setFont(font);
        JTextPane jTextPane = this.text;
        if (jTextPane != null) {
            jTextPane.setFont(font);
        }
    }

    @Override // bsh.util.GUIConsoleInterface
    public void setNameCompletion(NameCompletion nameCompletion2) {
        this.nameCompletion = nameCompletion2;
    }

    @Override // bsh.util.GUIConsoleInterface
    public void setWaitFeedback(boolean z) {
        setCursor(Cursor.getPredefinedCursor(z ? 3 : 0));
    }

    public String toString() {
        return "BeanShell console";
    }
}
