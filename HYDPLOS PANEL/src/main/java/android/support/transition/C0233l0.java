package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: android.support.transition.l0 */
class C0233l0 implements AbstractC0235m0 {

    /* renamed from: a */
    private final ViewGroupOverlay f941a;

    C0233l0(ViewGroup viewGroup) {
        this.f941a = viewGroup.getOverlay();
    }

    @Override // android.support.transition.AbstractC0235m0
    /* renamed from: a */
    public void mo1559a(View view) {
        this.f941a.add(view);
    }

    @Override // android.support.transition.AbstractC0252t0
    /* renamed from: b */
    public void mo1565b(Drawable drawable) {
        this.f941a.add(drawable);
    }

    @Override // android.support.transition.AbstractC0235m0
    /* renamed from: c */
    public void mo1560c(View view) {
        this.f941a.remove(view);
    }

    @Override // android.support.transition.AbstractC0252t0
    /* renamed from: d */
    public void mo1566d(Drawable drawable) {
        this.f941a.remove(drawable);
    }
}
