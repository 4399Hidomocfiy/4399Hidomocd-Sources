package p013b.p014a.p015a.p025c0.p026c;

import java.util.Map;
import p013b.p014a.p015a.C0703d;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0779e;
import p013b.p014a.p015a.p035x.p037n.C0789a;
import p013b.p014a.p015a.p035x.p037n.C0791c;
import p013b.p014a.p015a.p035x.p037n.C0793e;

/* renamed from: b.a.a.c0.c.e */
public final class C0679e {

    /* renamed from: a */
    private final C0791c f1261a = new C0791c(C0789a.f1616l);

    /* renamed from: a */
    private void m1188a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f1261a.mo8850a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C0793e unused) {
            throw C0703d.m1317a();
        }
    }

    /* renamed from: c */
    private C0779e m1189c(C0666a aVar, Map<EnumC0704e, ?> map) {
        C0684j e = aVar.mo8607e();
        EnumC0680f d = aVar.mo8606d().mo8617d();
        C0667b[] b = C0667b.m1166b(aVar.mo8605c(), e, d);
        int i = 0;
        for (C0667b bVar : b) {
            i += bVar.mo8611c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C0667b bVar2 : b) {
            byte[] a = bVar2.mo8610a();
            int c = bVar2.mo8611c();
            m1188a(a, c);
            int i3 = 0;
            while (i3 < c) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C0678d.m1180a(bArr, e, d, map);
    }

    /* renamed from: b */
    public C0779e mo8614b(C0776b bVar, Map<EnumC0704e, ?> map) {
        C0703d e;
        C0666a aVar = new C0666a(bVar);
        C0707h hVar = null;
        try {
            return m1189c(aVar, map);
        } catch (C0707h e2) {
            e = null;
            hVar = e2;
            try {
                aVar.mo8608f();
                aVar.mo8609g(true);
                aVar.mo8607e();
                aVar.mo8606d();
                aVar.mo8604b();
                C0779e c = m1189c(aVar, map);
                c.mo8820k(new C0683i(true));
                return c;
            } catch (C0703d | C0707h e3) {
                if (hVar != null) {
                    throw hVar;
                } else if (e != null) {
                    throw e;
                } else {
                    throw e3;
                }
            }
        } catch (C0703d e4) {
            e = e4;
            aVar.mo8608f();
            aVar.mo8609g(true);
            aVar.mo8607e();
            aVar.mo8606d();
            aVar.mo8604b();
            C0779e c2 = m1189c(aVar, map);
            c2.mo8820k(new C0683i(true));
            return c2;
        }
    }
}
