package p013b.p014a.p015a.p025c0.p026c;

import android.support.p012v7.widget.ActivityChooserView;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.c.g */
public final class C0681g {

    /* renamed from: c */
    private static final int[][] f1269c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: d */
    private static final int[] f1270d = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};

    /* renamed from: a */
    private final EnumC0680f f1271a;

    /* renamed from: b */
    private final byte f1272b;

    private C0681g(int i) {
        this.f1271a = EnumC0680f.m1191a((i >> 3) & 3);
        this.f1272b = (byte) (i & 7);
    }

    /* renamed from: a */
    static C0681g m1193a(int i, int i2) {
        C0681g b = m1194b(i, i2);
        return b != null ? b : m1194b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C0681g m1194b(int i, int i2) {
        int e;
        int[][] iArr = f1269c;
        int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i4 = 0;
        for (int[] iArr2 : iArr) {
            int i5 = iArr2[0];
            if (i5 == i || i5 == i2) {
                return new C0681g(iArr2[1]);
            }
            int e2 = m1195e(i, i5);
            if (e2 < i3) {
                i4 = iArr2[1];
                i3 = e2;
            }
            if (i != i2 && (e = m1195e(i2, i5)) < i3) {
                i4 = iArr2[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C0681g(i4);
        }
        return null;
    }

    /* renamed from: e */
    static int m1195e(int i, int i2) {
        int i3 = i ^ i2;
        int[] iArr = f1270d;
        return iArr[i3 & 15] + iArr[(i3 >>> 4) & 15] + iArr[(i3 >>> 8) & 15] + iArr[(i3 >>> 12) & 15] + iArr[(i3 >>> 16) & 15] + iArr[(i3 >>> 20) & 15] + iArr[(i3 >>> 24) & 15] + iArr[(i3 >>> 28) & 15];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo8616c() {
        return this.f1272b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public EnumC0680f mo8617d() {
        return this.f1271a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0681g)) {
            return false;
        }
        C0681g gVar = (C0681g) obj;
        return this.f1271a == gVar.f1271a && this.f1272b == gVar.f1272b;
    }

    public int hashCode() {
        return (this.f1271a.ordinal() << 3) | this.f1272b;
    }
}
