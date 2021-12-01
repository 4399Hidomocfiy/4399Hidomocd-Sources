package p013b.p014a.p015a.p038y.p039c;

import android.support.p012v7.widget.helper.ItemTouchHelper;
import bsh.org.objectweb.asm.Constants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.p035x.C0777c;
import p013b.p014a.p015a.p035x.C0779e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.c.c */
public final class C0798c {

    /* renamed from: a */
    private static final char[] f1639a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    private static final char[] f1640b = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    /* renamed from: c */
    private static final char[] f1641c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d */
    private static final char[] f1642d = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.y.c.c$a */
    public static /* synthetic */ class C0799a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1643a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                b.a.a.y.c.c$b[] r0 = p013b.p014a.p015a.p038y.p039c.C0798c.EnumC0800b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p013b.p014a.p015a.p038y.p039c.C0798c.C0799a.f1643a = r0
                b.a.a.y.c.c$b r1 = p013b.p014a.p015a.p038y.p039c.C0798c.EnumC0800b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p013b.p014a.p015a.p038y.p039c.C0798c.C0799a.f1643a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.a.a.y.c.c$b r1 = p013b.p014a.p015a.p038y.p039c.C0798c.EnumC0800b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p013b.p014a.p015a.p038y.p039c.C0798c.C0799a.f1643a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.a.a.y.c.c$b r1 = p013b.p014a.p015a.p038y.p039c.C0798c.EnumC0800b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p013b.p014a.p015a.p038y.p039c.C0798c.C0799a.f1643a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.a.a.y.c.c$b r1 = p013b.p014a.p015a.p038y.p039c.C0798c.EnumC0800b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = p013b.p014a.p015a.p038y.p039c.C0798c.C0799a.f1643a     // Catch:{ NoSuchFieldError -> 0x003e }
                b.a.a.y.c.c$b r1 = p013b.p014a.p015a.p038y.p039c.C0798c.EnumC0800b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p038y.p039c.C0798c.C0799a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.y.c.c$b */
    public enum EnumC0800b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    /* renamed from: a */
    static C0779e m1667a(byte[] bArr) {
        C0777c cVar = new C0777c(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        EnumC0800b bVar = EnumC0800b.ASCII_ENCODE;
        do {
            EnumC0800b bVar2 = EnumC0800b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = m1669c(cVar, sb, sb2);
            } else {
                int i = C0799a.f1643a[bVar.ordinal()];
                if (i == 1) {
                    m1671e(cVar, sb);
                } else if (i == 2) {
                    m1673g(cVar, sb);
                } else if (i == 3) {
                    m1668b(cVar, sb);
                } else if (i == 4) {
                    m1672f(cVar, sb);
                } else if (i == 5) {
                    m1670d(cVar, sb, arrayList);
                } else {
                    throw C0707h.m1320a();
                }
                bVar = bVar2;
            }
            if (bVar == EnumC0800b.PAD_ENCODE) {
                break;
            }
        } while (cVar.mo8805a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C0779e(bArr, sb3, arrayList, null);
    }

    /* renamed from: b */
    private static void m1668b(C0777c cVar, StringBuilder sb) {
        int d;
        int i;
        char c;
        int[] iArr = new int[3];
        while (cVar.mo8805a() != 8 && (d = cVar.mo8808d(8)) != 254) {
            m1674h(d, cVar.mo8808d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    c = '\r';
                } else if (i3 == 1) {
                    c = '*';
                } else if (i3 == 2) {
                    c = '>';
                } else if (i3 == 3) {
                    c = ' ';
                } else {
                    if (i3 < 14) {
                        i = i3 + 44;
                    } else if (i3 < 40) {
                        i = i3 + 51;
                    } else {
                        throw C0707h.m1320a();
                    }
                    c = (char) i;
                }
                sb.append(c);
            }
            if (cVar.mo8805a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static EnumC0800b m1669c(C0777c cVar, StringBuilder sb, StringBuilder sb2) {
        String str;
        boolean z = false;
        do {
            int d = cVar.mo8808d(8);
            if (d == 0) {
                throw C0707h.m1320a();
            } else if (d <= 128) {
                if (z) {
                    d += 128;
                }
                sb.append((char) (d - 1));
                return EnumC0800b.ASCII_ENCODE;
            } else if (d == 129) {
                return EnumC0800b.PAD_ENCODE;
            } else {
                if (d <= 229) {
                    int i = d - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else if (d == 230) {
                    return EnumC0800b.C40_ENCODE;
                } else {
                    if (d == 231) {
                        return EnumC0800b.BASE256_ENCODE;
                    }
                    if (d == 232) {
                        sb.append((char) 29);
                    } else if (!(d == 233 || d == 234)) {
                        if (d == 235) {
                            z = true;
                        } else {
                            if (d == 236) {
                                str = "[)>\u001e05\u001d";
                            } else if (d == 237) {
                                str = "[)>\u001e06\u001d";
                            } else if (d == 238) {
                                return EnumC0800b.ANSIX12_ENCODE;
                            } else {
                                if (d == 239) {
                                    return EnumC0800b.TEXT_ENCODE;
                                }
                                if (d == 240) {
                                    return EnumC0800b.EDIFACT_ENCODE;
                                }
                                if (!(d == 241 || d < 242 || (d == 254 && cVar.mo8805a() == 0))) {
                                    throw C0707h.m1320a();
                                }
                            }
                            sb.append(str);
                            sb2.insert(0, "\u001e\u0004");
                        }
                    }
                }
            }
        } while (cVar.mo8805a() > 0);
        return EnumC0800b.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m1670d(C0777c cVar, StringBuilder sb, Collection<byte[]> collection) {
        int c = cVar.mo8807c() + 1;
        int i = c + 1;
        int i2 = m1675i(cVar.mo8808d(8), c);
        if (i2 == 0) {
            i2 = cVar.mo8805a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + m1675i(cVar.mo8808d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (cVar.mo8805a() >= 8) {
                    bArr[i3] = (byte) m1675i(cVar.mo8808d(8), i);
                    i3++;
                    i++;
                } else {
                    throw C0707h.m1320a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: " + e);
            }
        } else {
            throw C0707h.m1320a();
        }
    }

    /* renamed from: e */
    private static void m1671e(C0777c cVar, StringBuilder sb) {
        int d;
        char c;
        char c2;
        int i;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (cVar.mo8805a() != 8 && (d = cVar.mo8808d(8)) != 254) {
            m1674h(d, cVar.mo8808d(8), iArr);
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (z) {
                            i = i4 + 128;
                        }
                        c = (char) i4;
                        sb.append(c);
                        i2 = 0;
                    } else if (i2 == 2) {
                        char[] cArr = f1640b;
                        if (i4 < cArr.length) {
                            c = cArr[i4];
                            if (z) {
                                c2 = (char) (c + 128);
                                sb.append(c2);
                                z = false;
                                i2 = 0;
                            }
                        } else if (i4 == 27) {
                            c = 29;
                        } else if (i4 == 30) {
                            z = true;
                            i2 = 0;
                        } else {
                            throw C0707h.m1320a();
                        }
                        sb.append(c);
                        i2 = 0;
                    } else if (i2 != 3) {
                        throw C0707h.m1320a();
                    } else if (z) {
                        i = i4 + 224;
                    } else {
                        i4 += 96;
                        c = (char) i4;
                        sb.append(c);
                        i2 = 0;
                    }
                    c2 = (char) i;
                    sb.append(c2);
                    z = false;
                    i2 = 0;
                } else if (i4 < 3) {
                    i2 = i4 + 1;
                } else {
                    char[] cArr2 = f1639a;
                    if (i4 < cArr2.length) {
                        char c3 = cArr2[i4];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw C0707h.m1320a();
                    }
                }
            }
            if (cVar.mo8805a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m1672f(C0777c cVar, StringBuilder sb) {
        while (cVar.mo8805a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d = cVar.mo8808d(6);
                if (d == 31) {
                    int b = 8 - cVar.mo8806b();
                    if (b != 8) {
                        cVar.mo8808d(b);
                        return;
                    }
                    return;
                }
                if ((d & 32) == 0) {
                    d |= 64;
                }
                sb.append((char) d);
            }
            if (cVar.mo8805a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1673g(p013b.p014a.p015a.p035x.C0777c r9, java.lang.StringBuilder r10) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p038y.p039c.C0798c.m1673g(b.a.a.x.c, java.lang.StringBuilder):void");
    }

    /* renamed from: h */
    private static void m1674h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m1675i(int i, int i2) {
        int i3 = i - (((i2 * Constants.FCMPL) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
