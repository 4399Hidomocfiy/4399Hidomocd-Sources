package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

import android.support.p012v7.widget.helper.ItemTouchHelper;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.a0.g.e.s */
public final class C0608s {

    /* renamed from: a */
    private final C0775a f1107a;

    /* renamed from: b */
    private final C0601m f1108b = new C0601m();

    /* renamed from: c */
    private final StringBuilder f1109c = new StringBuilder();

    C0608s(C0775a aVar) {
        this.f1107a = aVar;
    }

    /* renamed from: b */
    private C0603n m846b(int i) {
        char c;
        int f = mo8481f(i, 5);
        if (f == 15) {
            return new C0603n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C0603n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo8481f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C0603n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + f2);
        }
        return new C0603n(i + 6, c);
    }

    /* renamed from: d */
    private C0603n m847d(int i) {
        char c;
        int f = mo8481f(i, 5);
        if (f == 15) {
            return new C0603n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C0603n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo8481f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C0603n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C0603n(i + 7, (char) (f2 + 7));
        }
        switch (mo8481f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C0707h.m1320a();
        }
        return new C0603n(i + 8, c);
    }

    /* renamed from: e */
    private C0605p m848e(int i) {
        int i2 = i + 7;
        if (i2 > this.f1107a.mo8778k()) {
            int f = mo8481f(i, 4);
            return f == 0 ? new C0605p(this.f1107a.mo8778k(), 10, 10) : new C0605p(this.f1107a.mo8778k(), f - 1, 10);
        }
        int f2 = mo8481f(i, 7) - 8;
        return new C0605p(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: g */
    static int m849g(C0775a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo8773g(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m850h(int i) {
        int i2 = i + 3;
        if (i2 > this.f1107a.mo8778k()) {
            return false;
        }
        while (i < i2) {
            if (this.f1107a.mo8773g(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m851i(int i) {
        int i2;
        if (i + 1 > this.f1107a.mo8778k()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f1107a.mo8778k()) {
            if (i3 == 2) {
                if (!this.f1107a.mo8773g(i + 2)) {
                    return false;
                }
            } else if (this.f1107a.mo8773g(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m852j(int i) {
        int i2;
        if (i + 1 > this.f1107a.mo8778k()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f1107a.mo8778k()) {
            if (this.f1107a.mo8773g(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m853k(int i) {
        int f;
        if (i + 5 > this.f1107a.mo8778k()) {
            return false;
        }
        int f2 = mo8481f(i, 5);
        if (f2 < 5 || f2 >= 16) {
            return i + 6 <= this.f1107a.mo8778k() && (f = mo8481f(i, 6)) >= 16 && f < 63;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m854l(int i) {
        int f;
        if (i + 5 > this.f1107a.mo8778k()) {
            return false;
        }
        int f2 = mo8481f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.f1107a.mo8778k()) {
            return false;
        }
        int f3 = mo8481f(i, 7);
        if (f3 < 64 || f3 >= 116) {
            return i + 8 <= this.f1107a.mo8778k() && (f = mo8481f(i, 8)) >= 232 && f < 253;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m855m(int i) {
        if (i + 7 > this.f1107a.mo8778k()) {
            return i + 4 <= this.f1107a.mo8778k();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f1107a.mo8773g(i3);
            }
            if (this.f1107a.mo8773g(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: n */
    private C0600l m856n() {
        while (m853k(this.f1108b.mo8461a())) {
            C0603n b = m846b(this.f1108b.mo8461a());
            this.f1108b.mo8468h(b.mo8478a());
            if (b.mo8470c()) {
                return new C0600l(new C0604o(this.f1108b.mo8461a(), this.f1109c.toString()), true);
            }
            this.f1109c.append(b.mo8469b());
        }
        if (m850h(this.f1108b.mo8461a())) {
            this.f1108b.mo8462b(3);
            this.f1108b.mo8467g();
        } else if (m851i(this.f1108b.mo8461a())) {
            if (this.f1108b.mo8461a() + 5 < this.f1107a.mo8778k()) {
                this.f1108b.mo8462b(5);
            } else {
                this.f1108b.mo8468h(this.f1107a.mo8778k());
            }
            this.f1108b.mo8466f();
        }
        return new C0600l(false);
    }

    /* renamed from: o */
    private C0604o m857o() {
        C0600l n;
        boolean b;
        do {
            int a = this.f1108b.mo8461a();
            n = this.f1108b.mo8463c() ? m856n() : this.f1108b.mo8464d() ? m858p() : m859q();
            b = n.mo8460b();
            if (!(a != this.f1108b.mo8461a()) && !b) {
                break;
            }
        } while (!b);
        return n.mo8459a();
    }

    /* renamed from: p */
    private C0600l m858p() {
        while (m854l(this.f1108b.mo8461a())) {
            C0603n d = m847d(this.f1108b.mo8461a());
            this.f1108b.mo8468h(d.mo8478a());
            if (d.mo8470c()) {
                return new C0600l(new C0604o(this.f1108b.mo8461a(), this.f1109c.toString()), true);
            }
            this.f1109c.append(d.mo8469b());
        }
        if (m850h(this.f1108b.mo8461a())) {
            this.f1108b.mo8462b(3);
            this.f1108b.mo8467g();
        } else if (m851i(this.f1108b.mo8461a())) {
            if (this.f1108b.mo8461a() + 5 < this.f1107a.mo8778k()) {
                this.f1108b.mo8462b(5);
            } else {
                this.f1108b.mo8468h(this.f1107a.mo8778k());
            }
            this.f1108b.mo8465e();
        }
        return new C0600l(false);
    }

    /* renamed from: q */
    private C0600l m859q() {
        while (m855m(this.f1108b.mo8461a())) {
            C0605p e = m848e(this.f1108b.mo8461a());
            this.f1108b.mo8468h(e.mo8478a());
            if (e.mo8476d()) {
                return new C0600l(e.mo8477e() ? new C0604o(this.f1108b.mo8461a(), this.f1109c.toString()) : new C0604o(this.f1108b.mo8461a(), this.f1109c.toString(), e.mo8475c()), true);
            }
            this.f1109c.append(e.mo8474b());
            if (e.mo8477e()) {
                return new C0600l(new C0604o(this.f1108b.mo8461a(), this.f1109c.toString()), true);
            }
            this.f1109c.append(e.mo8475c());
        }
        if (m852j(this.f1108b.mo8461a())) {
            this.f1108b.mo8465e();
            this.f1108b.mo8462b(4);
        }
        return new C0600l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo8479a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            C0604o c = mo8480c(i, str);
            String a = C0607r.m843a(c.mo8471b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo8473d() ? String.valueOf(c.mo8472c()) : null;
            if (i == c.mo8478a()) {
                return sb.toString();
            }
            i = c.mo8478a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0604o mo8480c(int i, String str) {
        this.f1109c.setLength(0);
        if (str != null) {
            this.f1109c.append(str);
        }
        this.f1108b.mo8468h(i);
        C0604o o = m857o();
        return (o == null || !o.mo8473d()) ? new C0604o(this.f1108b.mo8461a(), this.f1109c.toString()) : new C0604o(this.f1108b.mo8461a(), this.f1109c.toString(), o.mo8472c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8481f(int i, int i2) {
        return m849g(this.f1107a, i, i2);
    }
}
