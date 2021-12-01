package android.support.p009v4.net;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* renamed from: android.support.v4.net.DatagramSocketWrapper */
class DatagramSocketWrapper extends Socket {

    /* renamed from: android.support.v4.net.DatagramSocketWrapper$DatagramSocketImplWrapper */
    private static class DatagramSocketImplWrapper extends SocketImpl {
        public DatagramSocketImplWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
            ((SocketImpl) this).localport = datagramSocket.getLocalPort();
            ((SocketImpl) this).fd = fileDescriptor;
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void accept(SocketImpl socketImpl) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public int available() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void bind(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void close() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void connect(String str, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void connect(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void connect(SocketAddress socketAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void create(boolean z) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public InputStream getInputStream() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public Object getOption(int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public OutputStream getOutputStream() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void listen(int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        @Override // java.net.SocketImpl
        public void sendUrgentData(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public void setOption(int i, Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public DatagramSocketWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
        super(new DatagramSocketImplWrapper(datagramSocket, fileDescriptor));
    }
}
