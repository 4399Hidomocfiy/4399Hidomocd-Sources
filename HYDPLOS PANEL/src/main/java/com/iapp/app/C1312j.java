package com.iapp.app;

import android.view.animation.Animation;
import p013b.p044b.p045a.p046a.C0864v;
import p013b.p050d.p051a.AbstractC0918a;
import p013b.p050d.p051a.AbstractC0920b;

/* renamed from: com.iapp.app.j */
public class C1312j {

    /* renamed from: a */
    private C0864v f3078a = null;

    /* renamed from: b */
    private Object[] f3079b = null;

    /* renamed from: c */
    private int f3080c = -1;

    /* renamed from: d */
    private Aid_YuCodeX f3081d = null;

    /* renamed from: com.iapp.app.j$a  reason: invalid class name */
    class animationAnimation$AnimationListenerC1313a implements Animation.AnimationListener {
        animationAnimation$AnimationListenerC1313a() {
        }

        public void onAnimationEnd(Animation animation) {
            C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[0].toString());
        }

        public void onAnimationRepeat(Animation animation) {
            if (C1312j.this.f3080c > 1) {
                C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[1].toString());
            }
        }

        public void onAnimationStart(Animation animation) {
            if (C1312j.this.f3080c > 2) {
                C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[2].toString());
            }
        }
    }

    /* renamed from: com.iapp.app.j$b */
    class C1314b extends AbstractC0920b {
        C1314b() {
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[0].toString());
        }
    }

    /* renamed from: com.iapp.app.j$c */
    class C1315c implements AbstractC0918a.AbstractC0919a {
        C1315c() {
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[0].toString());
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: b */
        public void mo9122b(AbstractC0918a aVar) {
            if (C1312j.this.f3080c > 1) {
                C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[1].toString());
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: c */
        public void mo9123c(AbstractC0918a aVar) {
            if (C1312j.this.f3080c > 2) {
                C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[2].toString());
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: d */
        public void mo9124d(AbstractC0918a aVar) {
            if (C1312j.this.f3080c > 3) {
                C1312j.this.f3078a.mo8985f(C1312j.this.f3079b[3].toString());
            }
        }
    }

    /* renamed from: com.iapp.app.j$d  reason: invalid class name */
    class animationAnimation$AnimationListenerC1316d implements Animation.AnimationListener {
        animationAnimation$AnimationListenerC1316d() {
        }

        public void onAnimationEnd(Animation animation) {
            C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[0].toString());
        }

        public void onAnimationRepeat(Animation animation) {
            if (C1312j.this.f3080c > 1) {
                C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[1].toString());
            }
        }

        public void onAnimationStart(Animation animation) {
            if (C1312j.this.f3080c > 2) {
                C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[2].toString());
            }
        }
    }

    /* renamed from: com.iapp.app.j$e */
    class C1317e extends AbstractC0920b {
        C1317e() {
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[0].toString());
        }
    }

    /* renamed from: com.iapp.app.j$f */
    class C1318f implements AbstractC0918a.AbstractC0919a {
        C1318f() {
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[0].toString());
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: b */
        public void mo9122b(AbstractC0918a aVar) {
            if (C1312j.this.f3080c > 1) {
                C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[1].toString());
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: c */
        public void mo9123c(AbstractC0918a aVar) {
            if (C1312j.this.f3080c > 2) {
                C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[2].toString());
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: d */
        public void mo9124d(AbstractC0918a aVar) {
            if (C1312j.this.f3080c > 3) {
                C1312j.this.f3081d.YuGoX(C1312j.this.f3079b[3].toString());
            }
        }
    }

    public C1312j(C0864v vVar, Animation animation, Object[] objArr) {
        this.f3078a = vVar;
        this.f3079b = objArr;
        this.f3080c = objArr.length;
        animation.setAnimationListener(new animationAnimation$AnimationListenerC1313a());
    }

    public C1312j(C0864v vVar, AbstractC0918a aVar, Object[] objArr) {
        this.f3078a = vVar;
        this.f3079b = objArr;
        int length = objArr.length;
        this.f3080c = length;
        aVar.mo9110a(length == 1 ? new C1314b() : new C1315c());
    }

    public C1312j(Aid_YuCodeX aid_YuCodeX, Animation animation, Object[] objArr) {
        this.f3081d = aid_YuCodeX;
        this.f3079b = objArr;
        this.f3080c = objArr.length;
        animation.setAnimationListener(new animationAnimation$AnimationListenerC1316d());
    }

    public C1312j(Aid_YuCodeX aid_YuCodeX, AbstractC0918a aVar, Object[] objArr) {
        this.f3081d = aid_YuCodeX;
        this.f3079b = objArr;
        int length = objArr.length;
        this.f3080c = length;
        aVar.mo9110a(length == 1 ? new C1317e() : new C1318f());
    }
}
