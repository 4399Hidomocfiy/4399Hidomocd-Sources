package android.support.transition;

import android.view.View;

/* renamed from: android.support.transition.b1 */
public abstract class AbstractC0199b1 extends AbstractC0212f0 {

    /* renamed from: a */
    private static final String[] f881a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    private static int m572d(C0221h0 h0Var, int i) {
        int[] iArr;
        if (h0Var == null || (iArr = (int[]) h0Var.f922a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // android.support.transition.AbstractC0212f0
    /* renamed from: a */
    public void mo1528a(C0221h0 h0Var) {
        View view = h0Var.f923b;
        Integer num = (Integer) h0Var.f922a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        h0Var.f922a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        h0Var.f922a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // android.support.transition.AbstractC0212f0
    /* renamed from: b */
    public String[] mo1529b() {
        return f881a;
    }

    /* renamed from: e */
    public int mo1530e(C0221h0 h0Var) {
        Integer num;
        if (h0Var == null || (num = (Integer) h0Var.f922a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo1531f(C0221h0 h0Var) {
        return m572d(h0Var, 0);
    }

    /* renamed from: g */
    public int mo1532g(C0221h0 h0Var) {
        return m572d(h0Var, 1);
    }
}
