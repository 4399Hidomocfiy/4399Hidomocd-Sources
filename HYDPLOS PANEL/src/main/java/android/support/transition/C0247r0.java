package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: android.support.transition.r0 */
class C0247r0 implements AbstractC0252t0 {

    /* renamed from: a */
    protected C0248a f954a;

    /* renamed from: android.support.transition.r0$a */
    static class C0248a extends ViewGroup {

        /* renamed from: a */
        ViewGroup f955a;

        /* renamed from: b */
        View f956b;

        /* renamed from: c */
        ArrayList<Drawable> f957c = null;

        /* renamed from: d */
        C0247r0 f958d;

        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C0248a(Context context, ViewGroup viewGroup, View view, C0247r0 r0Var) {
            super(context);
            this.f955a = viewGroup;
            this.f956b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f958d = r0Var;
        }

        /* renamed from: c */
        private void m667c(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f955a.getLocationOnScreen(iArr2);
            this.f956b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo1603a(Drawable drawable) {
            if (this.f957c == null) {
                this.f957c = new ArrayList<>();
            }
            if (!this.f957c.contains(drawable)) {
                this.f957c.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo1604b(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f955a || viewGroup.getParent() == null || !ViewCompat.isAttachedToWindow(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f955a.getLocationOnScreen(iArr2);
                    ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo1605d() {
            ArrayList<Drawable> arrayList;
            return getChildCount() == 0 && ((arrayList = this.f957c) == null || arrayList.size() == 0);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f955a.getLocationOnScreen(iArr);
            this.f956b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f956b.getWidth(), this.f956b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f957c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f957c.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public void mo1608e(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f957c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* renamed from: f */
        public void mo1609f(View view) {
            super.removeView(view);
            if (mo1605d()) {
                this.f955a.removeView(this);
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f955a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f955a instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m667c(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f957c) != null && arrayList.contains(drawable));
        }
    }

    C0247r0(Context context, ViewGroup viewGroup, View view) {
        this.f954a = new C0248a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C0247r0 m663e(View view) {
        ViewGroup f = m664f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C0248a) {
                return ((C0248a) childAt).f958d;
            }
        }
        return new C0230k0(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m664f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // android.support.transition.AbstractC0252t0
    /* renamed from: b */
    public void mo1565b(Drawable drawable) {
        this.f954a.mo1603a(drawable);
    }

    @Override // android.support.transition.AbstractC0252t0
    /* renamed from: d */
    public void mo1566d(Drawable drawable) {
        this.f954a.mo1608e(drawable);
    }
}
