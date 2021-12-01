package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: android.support.transition.b0 */
public class C0198b0 extends AbstractC0199b1 {

    /* renamed from: b */
    private float f879b = 3.0f;

    /* renamed from: c */
    private int f880c = 80;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m568h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f880c
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L_0x0019
            int r7 = android.support.p009v4.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 == 0) goto L_0x0017
        L_0x0015:
            r0 = 5
            goto L_0x0029
        L_0x0017:
            r0 = 3
            goto L_0x0029
        L_0x0019:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L_0x0029
            int r7 = android.support.p009v4.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r4) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0029:
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x0048
            r7 = 48
            if (r0 == r7) goto L_0x003f
            r7 = 80
            if (r0 == r7) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L_0x0059
        L_0x003f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L_0x0059
        L_0x0048:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L_0x0059
        L_0x0051:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0198b0.m568h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    /* renamed from: i */
    private int m569i(ViewGroup viewGroup) {
        int i = this.f880c;
        return (i == 3 || i == 5 || i == 8388611 || i == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // android.support.transition.AbstractC0212f0
    /* renamed from: c */
    public long mo1526c(ViewGroup viewGroup, Transition transition, C0221h0 h0Var, C0221h0 h0Var2) {
        int i;
        int i2;
        int i3;
        C0221h0 h0Var3 = h0Var;
        if (h0Var3 == null && h0Var2 == null) {
            return 0;
        }
        Rect epicenter = transition.getEpicenter();
        if (h0Var2 == null || mo1530e(h0Var3) == 0) {
            i = -1;
        } else {
            h0Var3 = h0Var2;
            i = 1;
        }
        int f = mo1531f(h0Var3);
        int g = mo1532g(h0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            i3 = epicenter.centerX();
            i2 = epicenter.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float h = ((float) m568h(viewGroup, f, g, i3, i2, round, round2, width, height)) / ((float) m569i(viewGroup));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return (long) Math.round((((float) (duration * ((long) i))) / this.f879b) * h);
    }

    /* renamed from: j */
    public void mo1527j(int i) {
        this.f880c = i;
    }
}
