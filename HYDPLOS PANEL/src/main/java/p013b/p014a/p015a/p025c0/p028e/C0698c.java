package p013b.p014a.p015a.p025c0.p028e;

import android.support.p012v7.widget.ActivityChooserView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import p013b.p014a.p015a.C0721u;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p025c0.p026c.C0684j;
import p013b.p014a.p015a.p025c0.p026c.EnumC0680f;
import p013b.p014a.p015a.p025c0.p026c.EnumC0682h;
import p013b.p014a.p015a.p035x.C0775a;
import p013b.p014a.p015a.p035x.EnumC0778d;
import p013b.p014a.p015a.p035x.p037n.C0789a;
import p013b.p014a.p015a.p035x.p037n.C0792d;

/* renamed from: b.a.a.c0.e.c */
public final class C0698c {

    /* renamed from: a */
    private static final int[] f1326a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.c0.e.c$a */
    public static /* synthetic */ class C0699a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1327a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                b.a.a.c0.c.h[] r0 = p013b.p014a.p015a.p025c0.p026c.EnumC0682h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p013b.p014a.p015a.p025c0.p028e.C0698c.C0699a.f1327a = r0
                b.a.a.c0.c.h r1 = p013b.p014a.p015a.p025c0.p026c.EnumC0682h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p013b.p014a.p015a.p025c0.p028e.C0698c.C0699a.f1327a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.a.a.c0.c.h r1 = p013b.p014a.p015a.p025c0.p026c.EnumC0682h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p013b.p014a.p015a.p025c0.p028e.C0698c.C0699a.f1327a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.a.a.c0.c.h r1 = p013b.p014a.p015a.p025c0.p026c.EnumC0682h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p013b.p014a.p015a.p025c0.p028e.C0698c.C0699a.f1327a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.a.a.c0.c.h r1 = p013b.p014a.p015a.p025c0.p026c.EnumC0682h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p025c0.p028e.C0698c.C0699a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static void m1264a(String str, C0775a aVar, String str2) {
        try {
            for (byte b : str.getBytes(str2)) {
                aVar.mo8768c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new C0721u(e);
        }
    }

    /* renamed from: b */
    static void m1265b(CharSequence charSequence, C0775a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int o = m1278o(charSequence.charAt(i));
            if (o != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int o2 = m1278o(charSequence.charAt(i2));
                    if (o2 != -1) {
                        aVar.mo8768c((o * 45) + o2, 11);
                        i += 2;
                    } else {
                        throw new C0721u();
                    }
                } else {
                    aVar.mo8768c(o, 6);
                    i = i2;
                }
            } else {
                throw new C0721u();
            }
        }
    }

    /* renamed from: c */
    static void m1266c(String str, EnumC0682h hVar, C0775a aVar, String str2) {
        int i = C0699a.f1327a[hVar.ordinal()];
        if (i == 1) {
            m1271h(str, aVar);
        } else if (i == 2) {
            m1265b(str, aVar);
        } else if (i == 3) {
            m1264a(str, aVar, str2);
        } else if (i == 4) {
            m1268e(str, aVar);
        } else {
            throw new C0721u("Invalid mode: " + hVar);
        }
    }

    /* renamed from: d */
    private static void m1267d(EnumC0778d dVar, C0775a aVar) {
        aVar.mo8768c(EnumC0682h.ECI.mo8620b(), 4);
        aVar.mo8768c(dVar.mo8809c(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1268e(java.lang.String r6, p013b.p014a.p015a.p035x.C0775a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo8768c(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            b.a.a.u r6 = new b.a.a.u
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            b.a.a.u r7 = new b.a.a.u
            r7.<init>(r6)
            goto L_0x0055
        L_0x0054:
            throw r7
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p025c0.p028e.C0698c.m1268e(java.lang.String, b.a.a.x.a):void");
    }

    /* renamed from: f */
    static void m1269f(int i, C0684j jVar, EnumC0682h hVar, C0775a aVar) {
        int c = hVar.mo8621c(jVar);
        int i2 = 1 << c;
        if (i < i2) {
            aVar.mo8768c(i, c);
            return;
        }
        throw new C0721u(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    static void m1270g(EnumC0682h hVar, C0775a aVar) {
        aVar.mo8768c(hVar.mo8620b(), 4);
    }

    /* renamed from: h */
    static void m1271h(CharSequence charSequence, C0775a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo8768c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo8768c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo8768c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m1272i(C0697b bVar) {
        return C0700d.m1283a(bVar) + C0700d.m1285c(bVar) + C0700d.m1286d(bVar) + C0700d.m1287e(bVar);
    }

    /* renamed from: j */
    private static int m1273j(C0775a aVar, EnumC0680f fVar, C0684j jVar, C0697b bVar) {
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C0701e.m1291a(aVar, fVar, jVar, i3, bVar);
            int i4 = m1272i(bVar);
            if (i4 < i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    /* renamed from: k */
    private static EnumC0682h m1274k(String str, String str2) {
        if ("Shift_JIS".equals(str2)) {
            return m1281r(str) ? EnumC0682h.KANJI : EnumC0682h.BYTE;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m1278o(charAt) == -1) {
                return EnumC0682h.BYTE;
            } else {
                z = true;
            }
        }
        return z ? EnumC0682h.ALPHANUMERIC : z2 ? EnumC0682h.NUMERIC : EnumC0682h.BYTE;
    }

    /* renamed from: l */
    private static C0684j m1275l(int i, EnumC0680f fVar) {
        for (int i2 = 1; i2 <= 40; i2++) {
            C0684j i3 = C0684j.m1205i(i2);
            if (i3.mo8627h() - i3.mo8626f(fVar).mo8635d() >= (i + 7) / 8) {
                return i3;
            }
        }
        throw new C0721u("Data too big");
    }

    /* renamed from: m */
    public static C0702f m1276m(String str, EnumC0680f fVar, Map<EnumC0706g, ?> map) {
        EnumC0778d a;
        String str2 = map == null ? null : (String) map.get(EnumC0706g.CHARACTER_SET);
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        EnumC0682h k = m1274k(str, str2);
        C0775a aVar = new C0775a();
        EnumC0682h hVar = EnumC0682h.BYTE;
        if (k == hVar && !"ISO-8859-1".equals(str2) && (a = EnumC0778d.m1576a(str2)) != null) {
            m1267d(a, aVar);
        }
        m1270g(k, aVar);
        C0775a aVar2 = new C0775a();
        m1266c(str, k, aVar2, str2);
        C0684j l = m1275l(aVar.mo8778k() + k.mo8621c(m1275l(aVar.mo8778k() + k.mo8621c(C0684j.m1205i(1)) + aVar2.mo8778k(), fVar)) + aVar2.mo8778k(), fVar);
        C0775a aVar3 = new C0775a();
        aVar3.mo8767b(aVar);
        m1269f(k == hVar ? aVar2.mo8779l() : str.length(), l, k, aVar3);
        aVar3.mo8767b(aVar2);
        C0684j.C0686b f = l.mo8626f(fVar);
        int h = l.mo8627h() - f.mo8635d();
        m1282s(h, aVar3);
        C0775a q = m1280q(aVar3, l.mo8627h(), h, f.mo8634c());
        C0702f fVar2 = new C0702f();
        fVar2.mo8667c(fVar);
        fVar2.mo8670f(k);
        fVar2.mo8671g(l);
        int e = l.mo8625e();
        C0697b bVar = new C0697b(e, e);
        int j = m1273j(q, fVar, l, bVar);
        fVar2.mo8668d(j);
        C0701e.m1291a(q, fVar, l, j, bVar);
        fVar2.mo8669e(bVar);
        return fVar2;
    }

    /* renamed from: n */
    static byte[] m1277n(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C0792d(C0789a.f1616l).mo8851b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: o */
    static int m1278o(int i) {
        int[] iArr = f1326a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: p */
    static void m1279p(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new C0721u("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new C0721u("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new C0721u("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new C0721u("Block ID too large");
        }
    }

    /* renamed from: q */
    static C0775a m1280q(C0775a aVar, int i, int i2, int i3) {
        if (aVar.mo8779l() == i2) {
            ArrayList<C0696a> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m1279p(i, i2, i3, i7, iArr, iArr2);
                int i8 = iArr[0];
                byte[] bArr = new byte[i8];
                aVar.mo8784r(i4 * 8, bArr, 0, i8);
                byte[] n = m1277n(bArr, iArr2[0]);
                arrayList.add(new C0696a(bArr, n));
                i5 = Math.max(i5, i8);
                i6 = Math.max(i6, n.length);
                i4 += iArr[0];
            }
            if (i2 == i4) {
                C0775a aVar2 = new C0775a();
                for (int i9 = 0; i9 < i5; i9++) {
                    for (C0696a aVar3 : arrayList) {
                        byte[] a = aVar3.mo8656a();
                        if (i9 < a.length) {
                            aVar2.mo8768c(a[i9], 8);
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (C0696a aVar4 : arrayList) {
                        byte[] b = aVar4.mo8657b();
                        if (i10 < b.length) {
                            aVar2.mo8768c(b[i10], 8);
                        }
                    }
                }
                if (i == aVar2.mo8779l()) {
                    return aVar2;
                }
                throw new C0721u("Interleaving error: " + i + " and " + aVar2.mo8779l() + " differ.");
            }
            throw new C0721u("Data bytes does not match offset");
        }
        throw new C0721u("Number of bits and data bytes does not match");
    }

    /* renamed from: r */
    private static boolean m1281r(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: s */
    static void m1282s(int i, C0775a aVar) {
        int i2 = i * 8;
        if (aVar.mo8778k() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo8778k() < i2; i3++) {
                aVar.mo8766a(false);
            }
            int k = aVar.mo8778k() & 7;
            if (k > 0) {
                while (k < 8) {
                    aVar.mo8766a(false);
                    k++;
                }
            }
            int l = i - aVar.mo8779l();
            for (int i4 = 0; i4 < l; i4++) {
                aVar.mo8768c((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo8778k() != i2) {
                throw new C0721u("Bits size does not equal capacity");
            }
            return;
        }
        throw new C0721u("data bits cannot fit in the QR Code" + aVar.mo8778k() + " > " + i2);
    }
}
