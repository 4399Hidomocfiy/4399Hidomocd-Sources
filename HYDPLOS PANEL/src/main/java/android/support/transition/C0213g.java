package android.support.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.p009v4.view.ViewCompat;
import android.support.transition.AbstractC0222i;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* renamed from: android.support.transition.g */
class C0213g extends View implements AbstractC0222i {

    /* renamed from: a */
    final View f902a;

    /* renamed from: b */
    ViewGroup f903b;

    /* renamed from: c */
    View f904c;

    /* renamed from: d */
    int f905d;

    /* renamed from: e */
    private int f906e;

    /* renamed from: f */
    private int f907f;

    /* renamed from: g */
    Matrix f908g;

    /* renamed from: h */
    private final Matrix f909h = new Matrix();

    /* renamed from: i */
    private final ViewTreeObserver.OnPreDrawListener f910i = new ViewTreeObserver$OnPreDrawListenerC0214a();

    /* renamed from: android.support.transition.g$a */
    class ViewTreeObserver$OnPreDrawListenerC0214a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC0214a() {
        }

        public boolean onPreDraw() {
            View view;
            C0213g gVar = C0213g.this;
            gVar.f908g = gVar.f902a.getMatrix();
            ViewCompat.postInvalidateOnAnimation(C0213g.this);
            C0213g gVar2 = C0213g.this;
            ViewGroup viewGroup = gVar2.f903b;
            if (viewGroup == null || (view = gVar2.f904c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            ViewCompat.postInvalidateOnAnimation(C0213g.this.f903b);
            C0213g gVar3 = C0213g.this;
            gVar3.f903b = null;
            gVar3.f904c = null;
            return true;
        }
    }

    /* renamed from: android.support.transition.g$b */
    static class C0215b implements AbstractC0222i.AbstractC0223a {
        C0215b() {
        }

        /* renamed from: c */
        private static FrameLayout m604c(ViewGroup viewGroup) {
            while (!(viewGroup instanceof FrameLayout)) {
                ViewParent parent = viewGroup.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return null;
                }
                viewGroup = (ViewGroup) parent;
            }
            return (FrameLayout) viewGroup;
        }

        @Override // android.support.transition.AbstractC0222i.AbstractC0223a
        /* renamed from: a */
        public AbstractC0222i mo1548a(View view, ViewGroup viewGroup, Matrix matrix) {
            C0213g b = C0213g.m601b(view);
            if (b == null) {
                FrameLayout c = m604c(viewGroup);
                if (c == null) {
                    return null;
                }
                b = new C0213g(view);
                c.addView(b);
            }
            b.f905d++;
            return b;
        }

        @Override // android.support.transition.AbstractC0222i.AbstractC0223a
        /* renamed from: b */
        public void mo1549b(View view) {
            C0213g b = C0213g.m601b(view);
            if (b != null) {
                int i = b.f905d - 1;
                b.f905d = i;
                if (i <= 0) {
                    ViewParent parent = b.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.endViewTransition(b);
                        viewGroup.removeView(b);
                    }
                }
            }
        }
    }

    C0213g(View view) {
        super(view.getContext());
        this.f902a = view;
        setLayerType(2, null);
    }

    /* renamed from: b */
    static C0213g m601b(View view) {
        return (C0213g) view.getTag(C0263y.f977a);
    }

    /* renamed from: c */
    private static void m602c(View view, C0213g gVar) {
        view.setTag(C0263y.f977a, gVar);
    }

    @Override // android.support.transition.AbstractC0222i
    /* renamed from: a */
    public void mo1542a(ViewGroup viewGroup, View view) {
        this.f903b = viewGroup;
        this.f904c = view;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m602c(this.f902a, this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        this.f902a.getLocationOnScreen(iArr2);
        iArr2[0] = (int) (((float) iArr2[0]) - this.f902a.getTranslationX());
        iArr2[1] = (int) (((float) iArr2[1]) - this.f902a.getTranslationY());
        this.f906e = iArr2[0] - iArr[0];
        this.f907f = iArr2[1] - iArr[1];
        this.f902a.getViewTreeObserver().addOnPreDrawListener(this.f910i);
        this.f902a.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f902a.getViewTreeObserver().removeOnPreDrawListener(this.f910i);
        this.f902a.setVisibility(0);
        m602c(this.f902a, null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f909h.set(this.f908g);
        this.f909h.postTranslate((float) this.f906e, (float) this.f907f);
        canvas.setMatrix(this.f909h);
        this.f902a.draw(canvas);
    }

    @Override // android.support.transition.AbstractC0222i
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f902a.setVisibility(i == 0 ? 4 : 0);
    }
}
