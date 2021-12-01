package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {

    /* renamed from: d */
    private static final TimeInterpolator f837d = new DecelerateInterpolator();

    /* renamed from: e */
    private static final TimeInterpolator f838e = new AccelerateInterpolator();

    /* renamed from: f */
    private static final AbstractC0178g f839f = new C0172a();

    /* renamed from: g */
    private static final AbstractC0178g f840g = new C0173b();

    /* renamed from: h */
    private static final AbstractC0178g f841h = new C0174c();

    /* renamed from: i */
    private static final AbstractC0178g f842i = new C0175d();

    /* renamed from: j */
    private static final AbstractC0178g f843j = new C0176e();

    /* renamed from: k */
    private static final AbstractC0178g f844k = new C0177f();

    /* renamed from: c */
    private AbstractC0178g f845c = f844k;

    /* renamed from: android.support.transition.Slide$a */
    static class C0172a extends AbstractC0179h {
        C0172a() {
            super(null);
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: a */
        public float mo1420a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$b */
    static class C0173b extends AbstractC0179h {
        C0173b() {
            super(null);
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: a */
        public float mo1420a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.getLayoutDirection(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    /* renamed from: android.support.transition.Slide$c */
    static class C0174c extends AbstractC0180i {
        C0174c() {
            super(null);
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: b */
        public float mo1421b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: android.support.transition.Slide$d */
    static class C0175d extends AbstractC0179h {
        C0175d() {
            super(null);
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: a */
        public float mo1420a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$e */
    static class C0176e extends AbstractC0179h {
        C0176e() {
            super(null);
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: a */
        public float mo1420a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.getLayoutDirection(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    /* renamed from: android.support.transition.Slide$f */
    static class C0177f extends AbstractC0180i {
        C0177f() {
            super(null);
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: b */
        public float mo1421b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.Slide$g */
    public interface AbstractC0178g {
        /* renamed from: a */
        float mo1420a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo1421b(ViewGroup viewGroup, View view);
    }

    /* renamed from: android.support.transition.Slide$h */
    private static abstract class AbstractC0179h implements AbstractC0178g {
        private AbstractC0179h() {
        }

        /* synthetic */ AbstractC0179h(C0172a aVar) {
            this();
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: b */
        public float mo1421b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: android.support.transition.Slide$i */
    private static abstract class AbstractC0180i implements AbstractC0178g {
        private AbstractC0180i() {
        }

        /* synthetic */ AbstractC0180i(C0172a aVar) {
            this();
        }

        @Override // android.support.transition.Slide.AbstractC0178g
        /* renamed from: a */
        public float mo1420a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        mo1419h(80);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f887f);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo1419h(namedInt);
    }

    private void captureValues(C0221h0 h0Var) {
        int[] iArr = new int[2];
        h0Var.f923b.getLocationOnScreen(iArr);
        h0Var.f922a.put("android:slide:screenPosition", iArr);
    }

    @Override // android.support.transition.Transition, android.support.transition.Visibility
    public void captureEndValues(C0221h0 h0Var) {
        super.captureEndValues(h0Var);
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition, android.support.transition.Visibility
    public void captureStartValues(C0221h0 h0Var) {
        super.captureStartValues(h0Var);
        captureValues(h0Var);
    }

    @Override // android.support.transition.Visibility
    /* renamed from: d */
    public Animator mo1414d(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        if (h0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) h0Var2.f922a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C0226j0.m626a(view, h0Var2, iArr[0], iArr[1], this.f845c.mo1420a(viewGroup, view), this.f845c.mo1421b(viewGroup, view), translationX, translationY, f837d);
    }

    @Override // android.support.transition.Visibility
    /* renamed from: f */
    public Animator mo1415f(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        if (h0Var == null) {
            return null;
        }
        int[] iArr = (int[]) h0Var.f922a.get("android:slide:screenPosition");
        return C0226j0.m626a(view, h0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f845c.mo1420a(viewGroup, view), this.f845c.mo1421b(viewGroup, view), f838e);
    }

    /* renamed from: h */
    public void mo1419h(int i) {
        AbstractC0178g gVar;
        if (i == 3) {
            gVar = f839f;
        } else if (i == 5) {
            gVar = f842i;
        } else if (i == 48) {
            gVar = f841h;
        } else if (i == 80) {
            gVar = f844k;
        } else if (i == 8388611) {
            gVar = f840g;
        } else if (i == 8388613) {
            gVar = f843j;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f845c = gVar;
        C0198b0 b0Var = new C0198b0();
        b0Var.mo1527j(i);
        setPropagation(b0Var);
    }
}
