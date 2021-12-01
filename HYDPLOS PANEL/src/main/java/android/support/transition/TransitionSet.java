package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.transition.Transition;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {

    /* renamed from: a */
    private ArrayList<Transition> f854a = new ArrayList<>();

    /* renamed from: b */
    private boolean f855b = true;

    /* renamed from: c */
    private int f856c;

    /* renamed from: d */
    private boolean f857d = false;

    /* renamed from: android.support.transition.TransitionSet$a */
    class C0188a extends C0204d0 {

        /* renamed from: a */
        final /* synthetic */ Transition f858a;

        C0188a(TransitionSet transitionSet, Transition transition) {
            this.f858a = transition;
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: b */
        public void mo1384b(Transition transition) {
            this.f858a.runAnimators();
            transition.removeListener(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.transition.TransitionSet$b */
    public static class C0189b extends C0204d0 {

        /* renamed from: a */
        TransitionSet f859a;

        C0189b(TransitionSet transitionSet) {
            this.f859a = transitionSet;
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: b */
        public void mo1384b(Transition transition) {
            TransitionSet.m514d(this.f859a);
            if (this.f859a.f856c == 0) {
                this.f859a.f857d = false;
                this.f859a.end();
            }
            transition.removeListener(this);
        }

        @Override // android.support.transition.Transition.AbstractC0187g, android.support.transition.C0204d0
        /* renamed from: d */
        public void mo1484d(Transition transition) {
            if (!this.f859a.f857d) {
                this.f859a.start();
                this.f859a.f857d = true;
            }
        }
    }

    public TransitionSet() {
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f888g);
        mo1498r(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    static /* synthetic */ int m514d(TransitionSet transitionSet) {
        int i = transitionSet.f856c - 1;
        transitionSet.f856c = i;
        return i;
    }

    /* renamed from: u */
    private void m515u() {
        C0189b bVar = new C0189b(this);
        Iterator<Transition> it = this.f854a.iterator();
        while (it.hasNext()) {
            it.next().addListener(bVar);
        }
        this.f856c = this.f854a.size();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    public void cancel() {
        super.cancel();
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).cancel();
        }
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(C0221h0 h0Var) {
        if (isValidTarget(h0Var.f923b)) {
            Iterator<Transition> it = this.f854a.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(h0Var.f923b)) {
                    next.captureEndValues(h0Var);
                    h0Var.f924c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public void capturePropagationValues(C0221h0 h0Var) {
        super.capturePropagationValues(h0Var);
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).capturePropagationValues(h0Var);
        }
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(C0221h0 h0Var) {
        if (isValidTarget(h0Var.f923b)) {
            Iterator<Transition> it = this.f854a.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(h0Var.f923b)) {
                    next.captureStartValues(h0Var);
                    h0Var.f924c.add(next);
                }
            }
        }
    }

    @Override // android.support.transition.Transition, android.support.transition.Transition, java.lang.Object
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f854a = new ArrayList<>();
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            transitionSet.mo1490j(this.f854a.get(i).clone());
        }
        return transitionSet;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    public void createAnimators(ViewGroup viewGroup, C0224i0 i0Var, C0224i0 i0Var2, ArrayList<C0221h0> arrayList, ArrayList<C0221h0> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f854a.get(i);
            if (startDelay > 0 && (this.f855b || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, i0Var, i0Var2, arrayList, arrayList2);
        }
    }

    /* renamed from: e */
    public TransitionSet addListener(Transition.AbstractC0187g gVar) {
        return (TransitionSet) super.addListener(gVar);
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f854a.size(); i2++) {
            this.f854a.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(Class cls, boolean z) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    /* renamed from: f */
    public TransitionSet addTarget(int i) {
        for (int i2 = 0; i2 < this.f854a.size(); i2++) {
            this.f854a.get(i2).addTarget(i);
        }
        return (TransitionSet) super.addTarget(i);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).forceToEnd(viewGroup);
        }
    }

    /* renamed from: g */
    public TransitionSet addTarget(View view) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    /* renamed from: h */
    public TransitionSet addTarget(Class cls) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    /* renamed from: i */
    public TransitionSet addTarget(String str) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    /* renamed from: j */
    public TransitionSet mo1490j(Transition transition) {
        this.f854a.add(transition);
        transition.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            transition.setDuration(j);
        }
        return this;
    }

    /* renamed from: k */
    public TransitionSet removeListener(Transition.AbstractC0187g gVar) {
        return (TransitionSet) super.removeListener(gVar);
    }

    /* renamed from: l */
    public TransitionSet removeTarget(int i) {
        for (int i2 = 0; i2 < this.f854a.size(); i2++) {
            this.f854a.get(i2).removeTarget(i);
        }
        return (TransitionSet) super.removeTarget(i);
    }

    /* renamed from: m */
    public TransitionSet removeTarget(View view) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    /* renamed from: n */
    public TransitionSet removeTarget(Class cls) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    /* renamed from: o */
    public TransitionSet removeTarget(String str) {
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }

    /* renamed from: p */
    public TransitionSet mo1496p(long j) {
        super.setDuration(j);
        if (this.mDuration >= 0) {
            int size = this.f854a.size();
            for (int i = 0; i < size; i++) {
                this.f854a.get(i).setDuration(j);
            }
        }
        return this;
    }

    @Override // android.support.transition.Transition
    public void pause(View view) {
        super.pause(view);
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).pause(view);
        }
    }

    /* renamed from: q */
    public TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    /* renamed from: r */
    public TransitionSet mo1498r(int i) {
        if (i == 0) {
            this.f855b = true;
        } else if (i == 1) {
            this.f855b = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // android.support.transition.Transition
    public void resume(View view) {
        super.resume(view);
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).resume(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    public void runAnimators() {
        if (this.f854a.isEmpty()) {
            start();
            end();
            return;
        }
        m515u();
        if (!this.f855b) {
            for (int i = 1; i < this.f854a.size(); i++) {
                this.f854a.get(i - 1).addListener(new C0188a(this, this.f854a.get(i)));
            }
            Transition transition = this.f854a.get(0);
            if (transition != null) {
                transition.runAnimators();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f854a.iterator();
        while (it.hasNext()) {
            it.next().runAnimators();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public TransitionSet mo1499s(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).setSceneRoot(viewGroup);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).setCanRemoveViews(z);
        }
    }

    @Override // android.support.transition.Transition
    public /* bridge */ /* synthetic */ Transition setDuration(long j) {
        mo1496p(j);
        return this;
    }

    @Override // android.support.transition.Transition
    public void setEpicenterCallback(Transition.AbstractC0186f fVar) {
        super.setEpicenterCallback(fVar);
        int size = this.f854a.size();
        for (int i = 0; i < size; i++) {
            this.f854a.get(i).setEpicenterCallback(fVar);
        }
    }

    @Override // android.support.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        for (int i = 0; i < this.f854a.size(); i++) {
            this.f854a.get(i).setPathMotion(pathMotion);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public /* bridge */ /* synthetic */ Transition setSceneRoot(ViewGroup viewGroup) {
        mo1499s(viewGroup);
        return this;
    }

    /* renamed from: t */
    public TransitionSet setStartDelay(long j) {
        return (TransitionSet) super.setStartDelay(j);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public String toString(String str) {
        String transition = super.toString(str);
        for (int i = 0; i < this.f854a.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(transition);
            sb.append("\n");
            sb.append(this.f854a.get(i).toString(str + "  "));
            transition = sb.toString();
        }
        return transition;
    }
}
