package p013b.p014a.p015a.p016a0.p017a0;

import android.support.p012v7.widget.ActivityChooserView;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.p016a0.AbstractC0624q;

/* renamed from: b.a.a.a0.a0.a */
public abstract class AbstractC0579a extends AbstractC0624q {

    /* renamed from: a */
    private final int[] f1045a = new int[4];

    /* renamed from: b */
    private final int[] f1046b;

    /* renamed from: c */
    private final float[] f1047c;

    /* renamed from: d */
    private final float[] f1048d;

    /* renamed from: e */
    private final int[] f1049e;

    /* renamed from: f */
    private final int[] f1050f;

    protected AbstractC0579a() {
        int[] iArr = new int[8];
        this.f1046b = iArr;
        this.f1047c = new float[4];
        this.f1048d = new float[4];
        this.f1049e = new int[(iArr.length / 2)];
        this.f1050f = new int[(iArr.length / 2)];
    }

    /* renamed from: h */
    protected static int m740h(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: i */
    protected static void m741i(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: p */
    protected static void m742p(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: q */
    protected static boolean m743q(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f < 0.7916667f || f > 0.89285713f) {
            return false;
        }
        int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i3 = Integer.MIN_VALUE;
        for (int i4 : iArr) {
            if (i4 > i3) {
                i3 = i4;
            }
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i3 < i2 * 10;
    }

    /* renamed from: r */
    protected static int m744r(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (AbstractC0624q.m912e(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] mo8415j() {
        return this.f1046b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int[] mo8416k() {
        return this.f1045a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] mo8417l() {
        return this.f1050f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] mo8418m() {
        return this.f1048d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int[] mo8419n() {
        return this.f1049e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final float[] mo8420o() {
        return this.f1047c;
    }
}
