package p013b.p014a.p015a.p025c0.p026c;

import bsh.org.objectweb.asm.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0777c;
import p013b.p014a.p015a.p035x.C0786l;
import p013b.p014a.p015a.p035x.EnumC0778d;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.c.d */
public final class C0678d {

    /* renamed from: a */
    private static final char[] f1260a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea A[LOOP:0: B:1:0x001d->B:59:0x00ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c9 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p013b.p014a.p015a.p035x.C0779e m1180a(byte[] r17, p013b.p014a.p015a.p025c0.p026c.C0684j r18, p013b.p014a.p015a.p025c0.p026c.EnumC0680f r19, java.util.Map<p013b.p014a.p015a.EnumC0704e, ?> r20) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p025c0.p026c.C0678d.m1180a(byte[], b.a.a.c0.c.j, b.a.a.c0.c.f, java.util.Map):b.a.a.x.e");
    }

    /* renamed from: b */
    private static void m1181b(C0777c cVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (cVar.mo8805a() >= 11) {
                int d = cVar.mo8808d(11);
                sb.append(m1187h(d / 45));
                sb.append(m1187h(d % 45));
                i -= 2;
            } else {
                throw C0707h.m1320a();
            }
        }
        if (i == 1) {
            if (cVar.mo8805a() >= 6) {
                sb.append(m1187h(cVar.mo8808d(6)));
            } else {
                throw C0707h.m1320a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m1182c(C0777c cVar, StringBuilder sb, int i, EnumC0778d dVar, Collection<byte[]> collection, Map<EnumC0704e, ?> map) {
        if (i * 8 <= cVar.mo8805a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo8808d(8);
            }
            try {
                sb.append(new String(bArr, dVar == null ? C0786l.m1613a(bArr, map) : dVar.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C0707h.m1320a();
            }
        } else {
            throw C0707h.m1320a();
        }
    }

    /* renamed from: d */
    private static void m1183d(C0777c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo8805a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo8808d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) ((i4 >> 8) & 255);
                bArr[i2 + 1] = (byte) (i4 & 255);
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C0707h.m1320a();
            }
        } else {
            throw C0707h.m1320a();
        }
    }

    /* renamed from: e */
    private static void m1184e(C0777c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo8805a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo8808d(13);
                int i3 = (d % Constants.CHECKCAST) | ((d / Constants.CHECKCAST) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C0707h.m1320a();
            }
        } else {
            throw C0707h.m1320a();
        }
    }

    /* renamed from: f */
    private static void m1185f(C0777c cVar, StringBuilder sb, int i) {
        int d;
        while (i >= 3) {
            if (cVar.mo8805a() >= 10) {
                int d2 = cVar.mo8808d(10);
                if (d2 < 1000) {
                    sb.append(m1187h(d2 / 100));
                    sb.append(m1187h((d2 / 10) % 10));
                    sb.append(m1187h(d2 % 10));
                    i -= 3;
                } else {
                    throw C0707h.m1320a();
                }
            } else {
                throw C0707h.m1320a();
            }
        }
        if (i == 2) {
            if (cVar.mo8805a() >= 7) {
                int d3 = cVar.mo8808d(7);
                if (d3 < 100) {
                    sb.append(m1187h(d3 / 10));
                    d = d3 % 10;
                } else {
                    throw C0707h.m1320a();
                }
            } else {
                throw C0707h.m1320a();
            }
        } else if (i != 1) {
            return;
        } else {
            if (cVar.mo8805a() >= 4) {
                d = cVar.mo8808d(4);
                if (d >= 10) {
                    throw C0707h.m1320a();
                }
            } else {
                throw C0707h.m1320a();
            }
        }
        sb.append(m1187h(d));
    }

    /* renamed from: g */
    private static int m1186g(C0777c cVar) {
        int d = cVar.mo8808d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & Constants.CHECKCAST) == 128) {
            return cVar.mo8808d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo8808d(16) | ((d & 31) << 16);
        }
        throw C0707h.m1320a();
    }

    /* renamed from: h */
    private static char m1187h(int i) {
        char[] cArr = f1260a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C0707h.m1320a();
    }
}
