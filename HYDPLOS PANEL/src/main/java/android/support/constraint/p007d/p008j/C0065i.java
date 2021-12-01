package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.C0043e;
import android.support.constraint.p007d.p008j.C0058e;

/* renamed from: android.support.constraint.d.j.i */
public class C0065i {

    /* renamed from: a */
    static boolean[] f633a = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r6 != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r6 != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r6 != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r6 != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ff, code lost:
        if (r6 != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01aa, code lost:
        if (r6 != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b5, code lost:
        r4.mo300i(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c2, code lost:
        if (r6 != false) goto L_0x01ac;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m305a(int r16, android.support.constraint.p007d.p008j.C0058e r17) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0065i.m305a(int, android.support.constraint.d.j.e):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r6 == 2) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r6 == 2) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m306b(android.support.constraint.p007d.p008j.C0061f r20, android.support.constraint.p007d.C0043e r21, int r22, int r23, android.support.constraint.p007d.p008j.C0052c r24) {
        /*
        // Method dump skipped, instructions count: 818
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0065i.m306b(android.support.constraint.d.j.f, android.support.constraint.d.e, int, int, android.support.constraint.d.j.c):boolean");
    }

    /* renamed from: c */
    static void m307c(C0061f fVar, C0043e eVar, C0058e eVar2) {
        C0058e.EnumC0060b bVar = fVar.f549B[0];
        C0058e.EnumC0060b bVar2 = C0058e.EnumC0060b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar2.f549B[0] == C0058e.EnumC0060b.MATCH_PARENT) {
            int i = eVar2.f594r.f524e;
            int A = fVar.mo201A() - eVar2.f596t.f524e;
            C0053d dVar = eVar2.f594r;
            dVar.f528i = eVar.mo164r(dVar);
            C0053d dVar2 = eVar2.f596t;
            dVar2.f528i = eVar.mo164r(dVar2);
            eVar.mo155f(eVar2.f594r.f528i, i);
            eVar.mo155f(eVar2.f596t.f528i, A);
            eVar2.f574a = 2;
            eVar2.mo222X(i, A);
        }
        if (fVar.f549B[1] != bVar2 && eVar2.f549B[1] == C0058e.EnumC0060b.MATCH_PARENT) {
            int i2 = eVar2.f595s.f524e;
            int p = fVar.mo250p() - eVar2.f597u.f524e;
            C0053d dVar3 = eVar2.f595s;
            dVar3.f528i = eVar.mo164r(dVar3);
            C0053d dVar4 = eVar2.f597u;
            dVar4.f528i = eVar.mo164r(dVar4);
            eVar.mo155f(eVar2.f595s.f528i, i2);
            eVar.mo155f(eVar2.f597u.f528i, p);
            if (eVar2.f561N > 0 || eVar2.mo271z() == 8) {
                C0053d dVar5 = eVar2.f598v;
                dVar5.f528i = eVar.mo164r(dVar5);
                eVar.mo155f(eVar2.f598v.f528i, eVar2.f561N + i2);
            }
            eVar2.f576b = 2;
            eVar2.mo241k0(i2, p);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m308d(android.support.constraint.p007d.p008j.C0058e r6, int r7) {
        /*
            android.support.constraint.d.j.e$b[] r0 = r6.f549B
            r1 = r0[r7]
            android.support.constraint.d.j.e$b r2 = android.support.constraint.p007d.p008j.C0058e.EnumC0060b.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r6.f553F
            r4 = 0
            r5 = 1
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0019
            if (r7 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            r6 = r0[r5]
            return r3
        L_0x0019:
            if (r7 != 0) goto L_0x0029
            int r7 = r6.f581e
            if (r7 == 0) goto L_0x0020
            return r3
        L_0x0020:
            int r7 = r6.f584h
            if (r7 != 0) goto L_0x0028
            int r6 = r6.f585i
            if (r6 == 0) goto L_0x0037
        L_0x0028:
            return r3
        L_0x0029:
            int r7 = r6.f582f
            if (r7 == 0) goto L_0x002e
            return r3
        L_0x002e:
            int r7 = r6.f587k
            if (r7 != 0) goto L_0x0038
            int r6 = r6.f588l
            if (r6 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return r5
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0065i.m308d(android.support.constraint.d.j.e, int):boolean");
    }
}
