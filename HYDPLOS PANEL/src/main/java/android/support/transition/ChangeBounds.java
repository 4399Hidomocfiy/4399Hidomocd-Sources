package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeBounds extends Transition {

    /* renamed from: d */
    private static final String[] f759d = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: e */
    private static final Property<Drawable, PointF> f760e = new C0150b(PointF.class, "boundsOrigin");

    /* renamed from: f */
    private static final Property<C0159k, PointF> f761f = new C0151c(PointF.class, "topLeft");

    /* renamed from: g */
    private static final Property<C0159k, PointF> f762g = new C0152d(PointF.class, "bottomRight");

    /* renamed from: h */
    private static final Property<View, PointF> f763h = new C0153e(PointF.class, "bottomRight");

    /* renamed from: i */
    private static final Property<View, PointF> f764i = new C0154f(PointF.class, "topLeft");

    /* renamed from: j */
    private static final Property<View, PointF> f765j = new C0155g(PointF.class, "position");

    /* renamed from: k */
    private static C0265z f766k = new C0265z();

    /* renamed from: a */
    private int[] f767a;

    /* renamed from: b */
    private boolean f768b;

    /* renamed from: c */
    private boolean f769c;

    /* renamed from: android.support.transition.ChangeBounds$a */
    class C0149a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f770a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f771b;

        /* renamed from: c */
        final /* synthetic */ View f772c;

        /* renamed from: d */
        final /* synthetic */ float f773d;

        C0149a(ChangeBounds changeBounds, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f770a = viewGroup;
            this.f771b = bitmapDrawable;
            this.f772c = view;
            this.f773d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C0254u0.m683c(this.f770a).mo1566d(this.f771b);
            C0254u0.m689i(this.f772c, this.f773d);
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$b */
    static class C0150b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f774a = new Rect();

        C0150b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f774a);
            Rect rect = this.f774a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f774a);
            this.f774a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f774a);
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$c */
    static class C0151c extends Property<C0159k, PointF> {
        C0151c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0159k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C0159k kVar, PointF pointF) {
            kVar.mo1388c(pointF);
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$d */
    static class C0152d extends Property<C0159k, PointF> {
        C0152d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0159k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C0159k kVar, PointF pointF) {
            kVar.mo1387a(pointF);
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$e */
    static class C0153e extends Property<View, PointF> {
        C0153e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0254u0.m688h(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$f */
    static class C0154f extends Property<View, PointF> {
        C0154f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0254u0.m688h(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$g */
    static class C0155g extends Property<View, PointF> {
        C0155g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0254u0.m688h(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$h */
    class C0156h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0159k f775a;

        C0156h(ChangeBounds changeBounds, C0159k kVar) {
            this.f775a = kVar;
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$i */
    class C0157i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f776a;

        /* renamed from: b */
        final /* synthetic */ View f777b;

        /* renamed from: c */
        final /* synthetic */ Rect f778c;

        /* renamed from: d */
        final /* synthetic */ int f779d;

        /* renamed from: e */
        final /* synthetic */ int f780e;

        /* renamed from: f */
        final /* synthetic */ int f781f;

        /* renamed from: g */
        final /* synthetic */ int f782g;

        C0157i(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f777b = view;
            this.f778c = rect;
            this.f779d = i;
            this.f780e = i2;
            this.f781f = i3;
            this.f782g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f776a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f776a) {
                ViewCompat.setClipBounds(this.f777b, this.f778c);
                C0254u0.m688h(this.f777b, this.f779d, this.f780e, this.f781f, this.f782g);
            }
        }
    }

    /* renamed from: android.support.transition.ChangeBounds$j */
    class C0158j extends C0204d0 {

        /* renamed from: a */
        boolean f783a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f784b;

        C0158j(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f784b = viewGroup;
        }

        @Override // android.support.transition.Transition.AbstractC0187g, android.support.transition.C0204d0
        /* renamed from: a */
        public void mo1383a(Transition transition) {
            C0237n0.m650b(this.f784b, false);
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: b */
        public void mo1384b(Transition transition) {
            if (!this.f783a) {
                C0237n0.m650b(this.f784b, false);
            }
            transition.removeListener(this);
        }

        @Override // android.support.transition.Transition.AbstractC0187g, android.support.transition.C0204d0
        /* renamed from: c */
        public void mo1385c(Transition transition) {
            C0237n0.m650b(this.f784b, false);
            this.f783a = true;
        }

        @Override // android.support.transition.Transition.AbstractC0187g, android.support.transition.C0204d0
        /* renamed from: e */
        public void mo1386e(Transition transition) {
            C0237n0.m650b(this.f784b, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.ChangeBounds$k */
    public static class C0159k {

        /* renamed from: a */
        private int f785a;

        /* renamed from: b */
        private int f786b;

        /* renamed from: c */
        private int f787c;

        /* renamed from: d */
        private int f788d;

        /* renamed from: e */
        private View f789e;

        /* renamed from: f */
        private int f790f;

        /* renamed from: g */
        private int f791g;

        C0159k(View view) {
            this.f789e = view;
        }

        /* renamed from: b */
        private void m442b() {
            C0254u0.m688h(this.f789e, this.f785a, this.f786b, this.f787c, this.f788d);
            this.f790f = 0;
            this.f791g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1387a(PointF pointF) {
            this.f787c = Math.round(pointF.x);
            this.f788d = Math.round(pointF.y);
            int i = this.f791g + 1;
            this.f791g = i;
            if (this.f790f == i) {
                m442b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1388c(PointF pointF) {
            this.f785a = Math.round(pointF.x);
            this.f786b = Math.round(pointF.y);
            int i = this.f790f + 1;
            this.f790f = i;
            if (i == this.f791g) {
                m442b();
            }
        }
    }

    public ChangeBounds() {
        this.f767a = new int[2];
        this.f768b = false;
        this.f769c = false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f767a = new int[2];
        this.f768b = false;
        this.f769c = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f883b);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo1354b(namedBoolean);
    }

    /* renamed from: a */
    private boolean m424a(View view, View view2) {
        if (!this.f769c) {
            return true;
        }
        C0221h0 matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.f923b) {
            return true;
        }
        return false;
    }

    private void captureValues(C0221h0 h0Var) {
        View view = h0Var.f923b;
        if (ViewCompat.isLaidOut(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            h0Var.f922a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            h0Var.f922a.put("android:changeBounds:parent", h0Var.f923b.getParent());
            if (this.f769c) {
                h0Var.f923b.getLocationInWindow(this.f767a);
                h0Var.f922a.put("android:changeBounds:windowX", Integer.valueOf(this.f767a[0]));
                h0Var.f922a.put("android:changeBounds:windowY", Integer.valueOf(this.f767a[1]));
            }
            if (this.f768b) {
                h0Var.f922a.put("android:changeBounds:clip", ViewCompat.getClipBounds(view));
            }
        }
    }

    /* renamed from: b */
    public void mo1354b(boolean z) {
        this.f768b = z;
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(C0221h0 h0Var) {
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(C0221h0 h0Var) {
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0221h0 h0Var, C0221h0 h0Var2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        if (h0Var == null || h0Var2 == null) {
            return null;
        }
        Map<String, Object> map = h0Var.f922a;
        Map<String, Object> map2 = h0Var2.f922a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = h0Var2.f923b;
        if (m424a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) h0Var.f922a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) h0Var2.f922a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect4 = (Rect) h0Var.f922a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) h0Var2.f922a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            if (!this.f768b) {
                view = view2;
                C0254u0.m688h(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = getPathMotion().mo1350a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f765j;
                    } else {
                        C0159k kVar = new C0159k(view);
                        ObjectAnimator a = C0242p.m655a(kVar, f761f, getPathMotion().mo1350a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C0242p.m655a(kVar, f762g, getPathMotion().mo1350a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a, a2);
                        animatorSet.addListener(new C0156h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = getPathMotion().mo1350a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f763h;
                } else {
                    path = getPathMotion().mo1350a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f764i;
                }
                animator = C0242p.m655a(view, property, path);
            } else {
                view = view2;
                C0254u0.m688h(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C0242p.m655a(view, f765j, getPathMotion().mo1350a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect4 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                if (!rect.equals(rect6)) {
                    ViewCompat.setClipBounds(view, rect);
                    C0265z zVar = f766k;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", zVar, objArr);
                    ofObject.addListener(new C0157i(this, view, rect5, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = C0216g0.m609c(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0237n0.m650b(viewGroup4, true);
                addListener(new C0158j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) h0Var.f922a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) h0Var.f922a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) h0Var2.f922a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) h0Var2.f922a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f767a);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float d = C0254u0.m684d(view2);
        C0254u0.m689i(view2, 0.0f);
        C0254u0.m683c(viewGroup).mo1565b(bitmapDrawable);
        PathMotion pathMotion = getPathMotion();
        int[] iArr = this.f767a;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C0253u.m680a(f760e, pathMotion.mo1350a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1]))));
        ofPropertyValuesHolder.addListener(new C0149a(this, viewGroup, bitmapDrawable, view2, d));
        return ofPropertyValuesHolder;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f759d;
    }
}
