package p013b.p014a.p015a.p020b0;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0720t;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p020b0.p024g.C0659d;
import p013b.p014a.p015a.p020b0.p024g.C0660e;
import p013b.p014a.p015a.p020b0.p024g.EnumC0658c;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.b0.d */
public final class C0638d implements AbstractC0720t {
    /* renamed from: b */
    private static C0776b m978b(C0660e eVar, String str, int i, int i2, int i3) {
        boolean z;
        eVar.mo8591e(str, 2);
        byte[][] b = eVar.mo8592f().mo8582b(2, 8);
        if ((i2 > i) ^ (b[0].length < b.length)) {
            b = m980d(b);
            z = true;
        } else {
            z = false;
        }
        int length = i / b[0].length;
        int length2 = i2 / b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m979c(b, i3);
        }
        byte[][] b2 = eVar.mo8592f().mo8582b(length * 2, length * 4 * 2);
        if (z) {
            b2 = m980d(b2);
        }
        return m979c(b2, i3);
    }

    /* renamed from: c */
    private static C0776b m979c(byte[][] bArr, int i) {
        int i2 = i * 2;
        C0776b bVar = new C0776b(bArr[0].length + i2, bArr.length + i2);
        bVar.mo8787a();
        int g = (bVar.mo8795g() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr[i3][i4] == 1) {
                    bVar.mo8801l(i4 + i, g);
                }
            }
            i3++;
            g--;
        }
        return bVar;
    }

    /* renamed from: d */
    private static byte[][] m980d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // p013b.p014a.p015a.AbstractC0720t
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        if (aVar == EnumC0577a.PDF_417) {
            C0660e eVar = new C0660e();
            int i3 = 30;
            if (map != null) {
                EnumC0706g gVar = EnumC0706g.PDF417_COMPACT;
                if (map.containsKey(gVar)) {
                    eVar.mo8593h(((Boolean) map.get(gVar)).booleanValue());
                }
                EnumC0706g gVar2 = EnumC0706g.PDF417_COMPACTION;
                if (map.containsKey(gVar2)) {
                    eVar.mo8594i((EnumC0658c) map.get(gVar2));
                }
                EnumC0706g gVar3 = EnumC0706g.PDF417_DIMENSIONS;
                if (map.containsKey(gVar3)) {
                    C0659d dVar = (C0659d) map.get(gVar3);
                    eVar.mo8595j(dVar.mo8587a(), dVar.mo8589c(), dVar.mo8588b(), dVar.mo8590d());
                }
                EnumC0706g gVar4 = EnumC0706g.MARGIN;
                if (map.containsKey(gVar4)) {
                    i3 = ((Number) map.get(gVar4)).intValue();
                }
                EnumC0706g gVar5 = EnumC0706g.CHARACTER_SET;
                if (map.containsKey(gVar5)) {
                    eVar.mo8596k(Charset.forName((String) map.get(gVar5)));
                }
            }
            return m978b(eVar, str, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got " + aVar);
    }
}
