package p013b.p014a.p015a.p029v.p032f;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: b.a.a.v.f.d */
public final class C0733d {

    /* renamed from: b */
    static final String[] f1425b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    static final int[][] f1426c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    private static final int[][] f1427d;

    /* renamed from: e */
    static final int[][] f1428e;

    /* renamed from: a */
    private final byte[] f1429a;

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.v.f.d$a */
    public class C0734a implements Comparator<C0736f> {
        C0734a(C0733d dVar) {
        }

        /* renamed from: a */
        public int compare(C0736f fVar, C0736f fVar2) {
            return fVar.mo8731d() - fVar2.mo8731d();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 5, 256);
        f1427d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f1427d[0][i] = (i - 65) + 2;
        }
        f1427d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f1427d[1][i2] = (i2 - 97) + 2;
        }
        f1427d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f1427d[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f1427d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f1427d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f1427d[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(int.class, 6, 6);
        f1428e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f1428e;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public C0733d(byte[] bArr) {
        this.f1429a = bArr;
    }

    /* renamed from: b */
    private static Collection<C0736f> m1410b(Iterable<C0736f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C0736f fVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0736f fVar2 = (C0736f) it.next();
                if (fVar2.mo8733f(fVar)) {
                    z = false;
                    break;
                } else if (fVar.mo8733f(fVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m1411c(C0736f fVar, int i, Collection<C0736f> collection) {
        char c = (char) (this.f1429a[i] & 255);
        boolean z = f1427d[fVar.mo8732e()][c] > 0;
        C0736f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f1427d[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo8729b(i);
                }
                if (!z || i2 == fVar.mo8732e() || i2 == 2) {
                    collection.add(fVar2.mo8734g(i2, i3));
                }
                if (!z && f1428e[fVar.mo8732e()][i2] >= 0) {
                    collection.add(fVar2.mo8735h(i2, i3));
                }
            }
        }
        if (fVar.mo8730c() > 0 || f1427d[fVar.mo8732e()][c] == 0) {
            collection.add(fVar.mo8728a(i));
        }
    }

    /* renamed from: d */
    private static void m1412d(C0736f fVar, int i, int i2, Collection<C0736f> collection) {
        C0736f b = fVar.mo8729b(i);
        collection.add(b.mo8734g(4, i2));
        if (fVar.mo8732e() != 4) {
            collection.add(b.mo8735h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b.mo8734g(2, 16 - i2).mo8734g(2, 1));
        }
        if (fVar.mo8730c() > 0) {
            collection.add(fVar.mo8728a(i).mo8728a(i + 1));
        }
    }

    /* renamed from: e */
    private Collection<C0736f> m1413e(Iterable<C0736f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C0736f fVar : iterable) {
            m1411c(fVar, i, linkedList);
        }
        return m1410b(linkedList);
    }

    /* renamed from: f */
    private static Collection<C0736f> m1414f(Iterable<C0736f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C0736f fVar : iterable) {
            m1412d(fVar, i, i2, linkedList);
        }
        return m1410b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p013b.p014a.p015a.p035x.C0775a mo8724a() {
        /*
            r8 = this;
            b.a.a.v.f.f r0 = p013b.p014a.p015a.p029v.p032f.C0736f.f1432e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.f1429a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = m1414f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.m1413e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            b.a.a.v.f.d$a r1 = new b.a.a.v.f.d$a
            r1.<init>(r8)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            b.a.a.v.f.f r0 = (p013b.p014a.p015a.p029v.p032f.C0736f) r0
            byte[] r1 = r8.f1429a
            b.a.a.x.a r0 = r0.mo8736i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p029v.p032f.C0733d.mo8724a():b.a.a.x.a");
    }
}
