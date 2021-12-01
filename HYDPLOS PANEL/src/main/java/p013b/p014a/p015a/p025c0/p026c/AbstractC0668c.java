package p013b.p014a.p015a.p025c0.p026c;

import p013b.p014a.p015a.p035x.C0776b;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.c.c */
public abstract class AbstractC0668c {

    /* renamed from: a */
    private static final AbstractC0668c[] f1259a = {new C0670b(), new C0671c(), new C0672d(), new C0673e(), new C0674f(), new C0675g(), new C0676h(), new C0677i()};

    /* renamed from: b.a.a.c0.c.c$b */
    private static final class C0670b extends AbstractC0668c {
        private C0670b() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    /* renamed from: b.a.a.c0.c.c$c */
    private static final class C0671c extends AbstractC0668c {
        private C0671c() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            return (i & 1) == 0;
        }
    }

    /* renamed from: b.a.a.c0.c.c$d */
    private static final class C0672d extends AbstractC0668c {
        private C0672d() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            return i2 % 3 == 0;
        }
    }

    /* renamed from: b.a.a.c0.c.c$e */
    private static final class C0673e extends AbstractC0668c {
        private C0673e() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }

    /* renamed from: b.a.a.c0.c.c$f */
    private static final class C0674f extends AbstractC0668c {
        private C0674f() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    }

    /* renamed from: b.a.a.c0.c.c$g */
    private static final class C0675g extends AbstractC0668c {
        private C0675g() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            int i3 = i * i2;
            return (i3 & 1) + (i3 % 3) == 0;
        }
    }

    /* renamed from: b.a.a.c0.c.c$h */
    private static final class C0676h extends AbstractC0668c {
        private C0676h() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            int i3 = i * i2;
            return (((i3 & 1) + (i3 % 3)) & 1) == 0;
        }
    }

    /* renamed from: b.a.a.c0.c.c$i */
    private static final class C0677i extends AbstractC0668c {
        private C0677i() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // p013b.p014a.p015a.p025c0.p026c.AbstractC0668c
        /* renamed from: b */
        public boolean mo8612b(int i, int i2) {
            return ((((i + i2) & 1) + ((i * i2) % 3)) & 1) == 0;
        }
    }

    private AbstractC0668c() {
    }

    /* renamed from: a */
    static AbstractC0668c m1169a(int i) {
        if (i >= 0 && i <= 7) {
            return f1259a[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo8612b(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8613c(C0776b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo8612b(i2, i3)) {
                    bVar.mo8789c(i3, i2);
                }
            }
        }
    }
}
