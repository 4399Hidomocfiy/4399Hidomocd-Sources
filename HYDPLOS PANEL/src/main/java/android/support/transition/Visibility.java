package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.transition.C0196b;
import android.support.transition.Transition;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public abstract class Visibility extends Transition {

    /* renamed from: b */
    private static final String[] f860b = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: a */
    private int f861a = 3;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.transition.Visibility$a */
    public class C0190a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC0235m0 f862a;

        /* renamed from: b */
        final /* synthetic */ View f863b;

        C0190a(Visibility visibility, AbstractC0235m0 m0Var, View view) {
            this.f862a = m0Var;
            this.f863b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f862a.mo1560c(this.f863b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.Visibility$b */
    public static class C0191b extends AnimatorListenerAdapter implements Transition.AbstractC0187g, C0196b.AbstractC0197a {

        /* renamed from: a */
        private final View f864a;

        /* renamed from: b */
        private final int f865b;

        /* renamed from: c */
        private final ViewGroup f866c;

        /* renamed from: d */
        private final boolean f867d;

        /* renamed from: e */
        private boolean f868e;

        /* renamed from: f */
        boolean f869f = false;

        C0191b(View view, int i, boolean z) {
            this.f864a = view;
            this.f865b = i;
            this.f866c = (ViewGroup) view.getParent();
            this.f867d = z;
            m543g(true);
        }

        /* renamed from: f */
        private void m542f() {
            if (!this.f869f) {
                C0254u0.m690j(this.f864a, this.f865b);
                ViewGroup viewGroup = this.f866c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m543g(false);
        }

        /* renamed from: g */
        private void m543g(boolean z) {
            ViewGroup viewGroup;
            if (this.f867d && this.f868e != z && (viewGroup = this.f866c) != null) {
                this.f868e = z;
                C0237n0.m650b(viewGroup, z);
            }
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: a */
        public void mo1383a(Transition transition) {
            m543g(false);
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: b */
        public void mo1384b(Transition transition) {
            m542f();
            transition.removeListener(this);
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: c */
        public void mo1385c(Transition transition) {
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: d */
        public void mo1484d(Transition transition) {
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: e */
        public void mo1386e(Transition transition) {
            m543g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f869f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m542f();
        }

        @Override // android.support.transition.C0196b.AbstractC0197a
        public void onAnimationPause(Animator animator) {
            if (!this.f869f) {
                C0254u0.m690j(this.f864a, this.f865b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.support.transition.C0196b.AbstractC0197a
        public void onAnimationResume(Animator animator) {
            if (!this.f869f) {
                C0254u0.m690j(this.f864a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.Visibility$c */
    public static class C0192c {

        /* renamed from: a */
        boolean f870a;

        /* renamed from: b */
        boolean f871b;

        /* renamed from: c */
        int f872c;

        /* renamed from: d */
        int f873d;

        /* renamed from: e */
        ViewGroup f874e;

        /* renamed from: f */
        ViewGroup f875f;

        private C0192c() {
        }

        /* synthetic */ C0192c(C0190a aVar) {
            this();
        }
    }

    public Visibility() {
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f884c);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (namedInt != 0) {
            mo1504g(namedInt);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r9 == 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r0.f874e == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r0.f872c == 0) goto L_0x0091;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.transition.Visibility.C0192c m535b(android.support.transition.C0221h0 r8, android.support.transition.C0221h0 r9) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Visibility.m535b(android.support.transition.h0, android.support.transition.h0):android.support.transition.Visibility$c");
    }

    private void captureValues(C0221h0 h0Var) {
        h0Var.f922a.put("android:visibility:visibility", Integer.valueOf(h0Var.f923b.getVisibility()));
        h0Var.f922a.put("android:visibility:parent", h0Var.f923b.getParent());
        int[] iArr = new int[2];
        h0Var.f923b.getLocationOnScreen(iArr);
        h0Var.f922a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public int mo1501a() {
        return this.f861a;
    }

    /* renamed from: c */
    public Animator mo1502c(ViewGroup viewGroup, C0221h0 h0Var, int i, C0221h0 h0Var2, int i2) {
        if ((this.f861a & 1) != 1 || h0Var2 == null) {
            return null;
        }
        if (h0Var == null) {
            View view = (View) h0Var2.f923b.getParent();
            if (m535b(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f870a) {
                return null;
            }
        }
        return mo1414d(viewGroup, h0Var2.f923b, h0Var, h0Var2);
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
        C0192c b = m535b(h0Var, h0Var2);
        if (!b.f870a) {
            return null;
        }
        if (b.f874e == null && b.f875f == null) {
            return null;
        }
        return b.f871b ? mo1502c(viewGroup, h0Var, b.f872c, h0Var2, b.f873d) : mo1503e(viewGroup, h0Var, b.f872c, h0Var2, b.f873d);
    }

    /* renamed from: d */
    public Animator mo1414d(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo1503e(android.view.ViewGroup r7, android.support.transition.C0221h0 r8, int r9, android.support.transition.C0221h0 r10, int r11) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Visibility.mo1503e(android.view.ViewGroup, android.support.transition.h0, int, android.support.transition.h0, int):android.animation.Animator");
    }

    /* renamed from: f */
    public Animator mo1415f(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        return null;
    }

    /* renamed from: g */
    public void mo1504g(int i) {
        if ((i & -4) == 0) {
            this.f861a = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f860b;
    }

    @Override // android.support.transition.Transition
    public boolean isTransitionRequired(C0221h0 h0Var, C0221h0 h0Var2) {
        if (h0Var == null && h0Var2 == null) {
            return false;
        }
        if (h0Var != null && h0Var2 != null && h0Var2.f922a.containsKey("android:visibility:visibility") != h0Var.f922a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0192c b = m535b(h0Var, h0Var2);
        if (b.f870a) {
            return b.f872c == 0 || b.f873d == 0;
        }
        return false;
    }
}
