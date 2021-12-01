package p013b.p014a.p015a.p042z.p043b;

import java.util.Map;
import p013b.p014a.p015a.C0703d;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;
import p013b.p014a.p015a.p035x.p037n.C0789a;
import p013b.p014a.p015a.p035x.p037n.C0791c;
import p013b.p014a.p015a.p035x.p037n.C0793e;

/* renamed from: b.a.a.z.b.c */
public final class C0827c {

    /* renamed from: a */
    private final C0791c f1708a = new C0791c(C0789a.f1619o);

    /* renamed from: a */
    private void m1802a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f1708a.mo8850a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C0793e unused) {
            throw C0703d.m1317a();
        }
    }

    /* renamed from: b */
    public C0779e mo8925b(C0776b bVar, Map<EnumC0704e, ?> map) {
        int i;
        byte[] a = new C0825a(bVar).mo8924a();
        m1802a(a, 0, 10, 10, 0);
        int i2 = a[0] & 15;
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            m1802a(a, 20, 84, 40, 1);
            m1802a(a, 20, 84, 40, 2);
            i = 94;
        } else if (i2 == 5) {
            m1802a(a, 20, 68, 56, 1);
            m1802a(a, 20, 68, 56, 2);
            i = 78;
        } else {
            throw C0707h.m1320a();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C0826b.m1793a(bArr, i2);
    }
}
