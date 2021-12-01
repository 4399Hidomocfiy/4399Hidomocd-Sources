package android.support.transition;

import android.support.p009v4.util.ArrayMap;
import android.support.p009v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.e0 */
public class C0207e0 {

    /* renamed from: a */
    private static Transition f894a = new AutoTransition();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> f895b = new ThreadLocal<>();

    /* renamed from: c */
    private static ArrayList<ViewGroup> f896c = new ArrayList<>();

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.e0$a */
    public static class ViewTreeObserver$OnPreDrawListenerC0208a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        Transition f897a;

        /* renamed from: b */
        ViewGroup f898b;

        /* renamed from: android.support.transition.e0$a$a */
        class C0209a extends C0204d0 {

            /* renamed from: a */
            final /* synthetic */ ArrayMap f899a;

            C0209a(ArrayMap arrayMap) {
                this.f899a = arrayMap;
            }

            @Override // android.support.transition.Transition.AbstractC0187g
            /* renamed from: b */
            public void mo1384b(Transition transition) {
                ((ArrayList) this.f899a.get(ViewTreeObserver$OnPreDrawListenerC0208a.this.f898b)).remove(transition);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC0208a(Transition transition, ViewGroup viewGroup) {
            this.f897a = transition;
            this.f898b = viewGroup;
        }

        /* renamed from: a */
        private void m595a() {
            this.f898b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f898b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m595a();
            if (!C0207e0.f896c.remove(this.f898b)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition>> c = C0207e0.m592c();
            ArrayList<Transition> arrayList = c.get(this.f898b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c.put(this.f898b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f897a);
            this.f897a.addListener(new C0209a(c));
            this.f897a.captureValues(this.f898b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.f898b);
                }
            }
            this.f897a.playTransition(this.f898b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m595a();
            C0207e0.f896c.remove(this.f898b);
            ArrayList<Transition> arrayList = C0207e0.m592c().get(this.f898b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f898b);
                }
            }
            this.f897a.clearValues(true);
        }
    }

    /* renamed from: b */
    public static void m591b(ViewGroup viewGroup, Transition transition) {
        if (!f896c.contains(viewGroup) && ViewCompat.isLaidOut(viewGroup)) {
            f896c.add(viewGroup);
            if (transition == null) {
                transition = f894a;
            }
            Transition clone = transition.clone();
            m594e(viewGroup, clone);
            C0194a0.m553c(viewGroup, null);
            m593d(viewGroup, clone);
        }
    }

    /* renamed from: c */
    static ArrayMap<ViewGroup, ArrayList<Transition>> m592c() {
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference = f895b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference2 = new WeakReference<>(new ArrayMap());
            f895b.set(weakReference2);
            weakReference = weakReference2;
        }
        return weakReference.get();
    }

    /* renamed from: d */
    private static void m593d(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            ViewTreeObserver$OnPreDrawListenerC0208a aVar = new ViewTreeObserver$OnPreDrawListenerC0208a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: e */
    private static void m594e(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = m592c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        C0194a0 b = C0194a0.m552b(viewGroup);
        if (b != null) {
            b.mo1512a();
        }
    }
}
