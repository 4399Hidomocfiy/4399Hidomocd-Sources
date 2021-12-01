package p013b.p044b.p045a.p046a;

import com.iapp.interfaces.OnMessagesListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.b.a.a.q */
public class C0855q {

    /* renamed from: a */
    private List<C0858c> f1774a = new ArrayList();

    /* renamed from: b */
    private ServerSocket f1775b = null;

    /* renamed from: c */
    public boolean f1776c = true;

    /* renamed from: d */
    private int f1777d = 0;

    /* renamed from: e */
    private String f1778e = null;

    /* renamed from: f */
    public boolean f1779f = false;

    /* renamed from: g */
    private int f1780g = 1000;

    /* renamed from: h */
    private C0858c f1781h = null;

    /* renamed from: i */
    private OnMessagesListener f1782i;

    /* renamed from: b.b.a.a.q$a */
    class C0856a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f1783a;

        /* renamed from: b */
        final /* synthetic */ int f1784b;

        C0856a(String str, int i) {
            this.f1783a = str;
            this.f1784b = i;
        }

        public void run() {
            try {
                Socket socket = new Socket(this.f1783a, this.f1784b);
                if (C0855q.this.f1777d != 0) {
                    socket.setSoTimeout(C0855q.this.f1777d);
                }
                C0855q qVar = C0855q.this;
                qVar.f1781h = new C0858c(socket, 1000, qVar.f1782i);
                C0855q.this.f1774a.add(C0855q.this.f1781h);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b.b.a.a.q$b */
    class C0857b extends Thread {
        C0857b() {
        }

        public void run() {
            while (!C0855q.this.f1775b.isClosed()) {
                try {
                    Socket accept = C0855q.this.f1775b.accept();
                    C0855q qVar = C0855q.this;
                    if (qVar.f1776c) {
                        if (qVar.f1777d != 0) {
                            accept.setSoTimeout(C0855q.this.f1777d);
                        }
                        C0855q.m2007o(C0855q.this);
                        List list = C0855q.this.f1774a;
                        C0855q qVar2 = C0855q.this;
                        list.add(new C0858c(accept, qVar2.f1780g, C0855q.this.f1782i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b.b.a.a.q$c */
    public class C0858c {

        /* renamed from: a */
        private Socket f1787a;

        /* renamed from: b */
        private int f1788b;

        /* renamed from: c */
        private OnMessagesListener f1789c;

        /* renamed from: b.b.a.a.q$c$a */
        class C0859a extends Thread {
            C0859a(C0855q qVar) {
            }

            public void run() {
                InputStream inputStream;
                long j;
                byte[] bArr = new byte[512];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    inputStream = C0858c.this.f1787a.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                    inputStream = null;
                }
                String str = null;
                long j2 = 0;
                long j3 = 0;
                byte b = 0;
                while (!C0858c.this.f1787a.isClosed()) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            if (read < 20 || !C0855q.this.m1994C(bArr)) {
                                j2 += (long) read;
                                j = 0;
                                if (j3 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            } else {
                                long z = C0855q.this.m2013z(bArr);
                                byte b2 = bArr[0];
                                if (b2 != 1) {
                                    if (b2 != 3) {
                                        if (b2 == 2) {
                                            int i = bArr[20] + 21;
                                            int i2 = read - i;
                                            long j4 = (long) i2;
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream((int) z);
                                            String str2 = new String(bArr, 21, (int) bArr[20]);
                                            if (read > i) {
                                                byteArrayOutputStream2.write(bArr, i, i2);
                                            }
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            str = str2;
                                            b = b2;
                                            j3 = z;
                                            j2 = j4;
                                            j = 0;
                                        } else {
                                            b = b2;
                                            j = 0;
                                            j2 = 0;
                                            j3 = 0;
                                        }
                                    }
                                }
                                int i3 = read - 20;
                                long j5 = (long) i3;
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream((int) z);
                                if (read > 20) {
                                    byteArrayOutputStream3.write(bArr, 20, i3);
                                }
                                byteArrayOutputStream = byteArrayOutputStream3;
                                b = b2;
                                j = 0;
                                j2 = j5;
                                j3 = z;
                            }
                            if (j3 == j2) {
                                if (b == 1) {
                                    C0858c.this.f1789c.Message(C0855q.this.m2012y(byteArrayOutputStream.toByteArray()), C0858c.this);
                                } else if (b == 2) {
                                    C0858c.this.f1789c.Message(C0855q.this.m2011x(byteArrayOutputStream.toByteArray(), str), C0858c.this);
                                } else {
                                    if (b == 3) {
                                        C0858c.this.f1789c.Message(byteArrayOutputStream.toByteArray(), C0858c.this);
                                    }
                                    j2 = j;
                                    j3 = j2;
                                }
                                byteArrayOutputStream.close();
                                j2 = j;
                                j3 = j2;
                            }
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            }
        }

        public C0858c(Socket socket, int i, OnMessagesListener onMessagesListener) {
            this.f1787a = socket;
            this.f1788b = i;
            this.f1789c = onMessagesListener;
            C0859a aVar = new C0859a(C0855q.this);
            aVar.setName("CeShi_" + aVar.getId());
            aVar.start();
        }

        /* renamed from: a */
        public void mo8967a(File file) {
            byte[] s = C0835f.m1862s(file);
            try {
                this.f1787a.getOutputStream().write(C0855q.this.m1996E((long) s.length, file.getName()));
                this.f1787a.getOutputStream().write(s);
                this.f1787a.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo8968b(String str) {
            byte[] bytes = str.getBytes();
            try {
                this.f1787a.getOutputStream().write(C0855q.this.m1995D(1, (long) bytes.length));
                this.f1787a.getOutputStream().write(bytes);
                this.f1787a.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public void mo8969c(byte[] bArr) {
            try {
                this.f1787a.getOutputStream().write(C0855q.this.m1995D(1, (long) bArr.length));
                this.f1787a.getOutputStream().write(bArr);
                this.f1787a.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: d */
        public void mo8970d(byte[] bArr) {
            try {
                this.f1787a.getOutputStream().write(bArr);
                this.f1787a.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: g */
        public void mo8971g() {
            if (!this.f1787a.isClosed()) {
                C0855q.this.f1774a.remove(this.f1787a);
                try {
                    this.f1787a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: h */
        public String mo8972h() {
            return this.f1787a.getInetAddress().getHostAddress();
        }

        /* renamed from: i */
        public int mo8973i() {
            return this.f1788b;
        }

        /* renamed from: j */
        public Socket mo8974j() {
            return this.f1787a;
        }

        /* renamed from: k */
        public boolean mo8975k() {
            return this.f1787a.isClosed();
        }
    }

    public C0855q(int i, String str, int i2, int i3, boolean z) {
        try {
            this.f1775b = new ServerSocket(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (i2 != 0) {
            try {
                this.f1775b.setSoTimeout(i2);
            } catch (SocketException e2) {
                e2.printStackTrace();
            }
        }
        this.f1777d = i3;
        this.f1778e = str;
        this.f1779f = z;
        C0857b bVar = new C0857b();
        bVar.setName("CeShi_" + bVar.getId());
        bVar.start();
    }

    public C0855q(String str, int i, int i2, boolean z) {
        this.f1777d = i2;
        this.f1779f = z;
        C0856a aVar = new C0856a(str, i);
        aVar.setName("CeShi_" + aVar.getId());
        aVar.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: C */
    private boolean m1994C(byte[] bArr) {
        return bArr[16] == 116 && bArr[17] == 93 && bArr[18] == 123 && bArr[19] == 111;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: D */
    private byte[] m1995D(int i, long j) {
        byte[] bArr = new byte[20];
        bArr[0] = (byte) i;
        char[] charArray = String.valueOf(j).toCharArray();
        int length = charArray.length;
        bArr[1] = (byte) length;
        int i2 = 2;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            bArr[i2] = (byte) Integer.parseInt(String.valueOf(charArray[i3]));
            i2++;
        }
        bArr[16] = 116;
        bArr[17] = 93;
        bArr[18] = 123;
        bArr[19] = 111;
        return bArr;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: E */
    private byte[] m1996E(long j, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[(length + 21)];
        int i = 2;
        bArr[0] = 2;
        char[] charArray = String.valueOf(j).toCharArray();
        int length2 = charArray.length;
        bArr[1] = (byte) length2;
        for (int i2 = length2 - 1; i2 >= 0; i2--) {
            bArr[i] = (byte) Integer.parseInt(String.valueOf(charArray[i2]));
            i++;
        }
        bArr[16] = 116;
        bArr[17] = 93;
        bArr[18] = 123;
        bArr[19] = 111;
        bArr[20] = (byte) length;
        int i3 = 21;
        for (byte b : bytes) {
            bArr[i3] = b;
            i3++;
        }
        return bArr;
    }

    /* renamed from: o */
    static /* synthetic */ int m2007o(C0855q qVar) {
        int i = qVar.f1780g;
        qVar.f1780g = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: x */
    private String m2011x(byte[] bArr, String str) {
        String e = C0860r.m2046e(bArr);
        String str2 = this.f1778e + "/" + e + ".temp";
        File file = new File(str2);
        if (this.f1779f || !file.exists()) {
            C0835f.m1853j(str2, bArr);
        }
        return "{FileSend:[file:" + str2 + "; name:" + str + "; md5:" + e + "; size:" + bArr.length + "]}";
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: y */
    private String m2012y(byte[] bArr) {
        return new String(bArr);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z */
    private long m2013z(byte[] bArr) {
        byte b = bArr[1];
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = b + 1; i > 1; i--) {
            stringBuffer.append((int) bArr[i]);
        }
        return Long.parseLong(stringBuffer.toString());
    }

    /* renamed from: A */
    public C0858c mo8953A(int i) {
        if (this.f1774a.size() < i) {
            return this.f1774a.get(i);
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo8954B() {
        ServerSocket serverSocket = this.f1775b;
        if (serverSocket != null) {
            return serverSocket.isClosed();
        }
        C0858c cVar = this.f1781h;
        if (cVar != null) {
            return cVar.mo8975k();
        }
        return true;
    }

    /* renamed from: F */
    public void mo8955F(OnMessagesListener onMessagesListener) {
        this.f1782i = onMessagesListener;
    }

    /* renamed from: a */
    public void mo8956a(File file) {
        byte[] s = C0835f.m1862s(file);
        byte[] E = m1996E((long) s.length, file.getName());
        for (C0858c cVar : this.f1774a) {
            try {
                cVar.mo8974j().getOutputStream().write(E);
                cVar.mo8974j().getOutputStream().write(s);
                cVar.mo8974j().getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo8957b(String str) {
        byte[] bytes = str.getBytes();
        byte[] D = m1995D(1, (long) bytes.length);
        for (C0858c cVar : this.f1774a) {
            try {
                cVar.mo8974j().getOutputStream().write(D);
                cVar.mo8974j().getOutputStream().write(bytes);
                cVar.mo8974j().getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo8958c(byte[] bArr) {
        byte[] D = m1995D(3, (long) bArr.length);
        for (C0858c cVar : this.f1774a) {
            try {
                cVar.mo8974j().getOutputStream().write(D);
                cVar.mo8974j().getOutputStream().write(bArr);
                cVar.mo8974j().getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void mo8959d(byte[] bArr) {
        for (C0858c cVar : this.f1774a) {
            try {
                cVar.mo8974j().getOutputStream().write(bArr);
                cVar.mo8974j().getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: s */
    public void mo8960s() {
        this.f1776c = false;
        for (C0858c cVar : this.f1774a) {
            try {
                cVar.mo8974j().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.f1774a.clear();
        ServerSocket serverSocket = this.f1775b;
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                this.f1775b.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: t */
    public int mo8961t() {
        return this.f1780g;
    }

    /* renamed from: u */
    public int mo8962u() {
        return this.f1774a.size();
    }

    /* renamed from: v */
    public ServerSocket mo8963v() {
        return this.f1775b;
    }

    /* renamed from: w */
    public List<C0858c> mo8964w() {
        return this.f1774a;
    }
}
