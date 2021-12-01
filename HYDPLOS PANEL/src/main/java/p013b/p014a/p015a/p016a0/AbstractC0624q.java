package p013b.p014a.p015a.p016a0;

import java.util.Arrays;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0714n;
import p013b.p014a.p015a.C0663c;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.q */
public abstract class AbstractC0624q implements AbstractC0714n {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ o -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p013b.p014a.p015a.C0716p m911d(p013b.p014a.p015a.C0663c r22, java.util.Map<p013b.p014a.p015a.EnumC0704e, ?> r23) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p016a0.AbstractC0624q.m911d(b.a.a.c, java.util.Map):b.a.a.p");
    }

    /* renamed from: e */
    protected static float m912e(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: f */
    protected static void m913f(C0775a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int k = aVar.mo8778k();
        if (i < k) {
            boolean z = !aVar.mo8773g(i);
            while (i < k) {
                if (aVar.mo8773g(i) ^ z) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != k) {
                throw C0712l.m1333a();
            }
            return;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: g */
    protected static void m914g(C0775a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean g = aVar.mo8773g(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo8773g(i) != g) {
                length--;
                g = !g;
            }
        }
        if (length < 0) {
            m913f(aVar, i + 1, iArr);
            return;
        }
        throw C0712l.m1333a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: a */
    public C0716p mo8489a(C0663c cVar, Map<EnumC0704e, ?> map) {
        try {
            return m911d(cVar, map);
        } catch (C0712l e) {
            if (!(map != null && map.containsKey(EnumC0704e.TRY_HARDER)) || !cVar.mo8601e()) {
                throw e;
            }
            cVar.mo8602f();
            throw null;
        }
    }

    @Override // p013b.p014a.p015a.AbstractC0714n
    /* renamed from: b */
    public void mo8434b() {
    }

    /* renamed from: c */
    public abstract C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map);
}
