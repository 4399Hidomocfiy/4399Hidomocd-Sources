package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.C0041c;
import android.support.constraint.p007d.C0048i;

/* renamed from: android.support.constraint.d.j.d */
public class C0053d {

    /* renamed from: a */
    private C0066j f520a = new C0066j(this);

    /* renamed from: b */
    final C0058e f521b;

    /* renamed from: c */
    final EnumC0057d f522c;

    /* renamed from: d */
    C0053d f523d;

    /* renamed from: e */
    public int f524e = 0;

    /* renamed from: f */
    int f525f = -1;

    /* renamed from: g */
    private EnumC0056c f526g = EnumC0056c.NONE;

    /* renamed from: h */
    private int f527h;

    /* renamed from: i */
    C0048i f528i;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.d.j.d$a */
    public static /* synthetic */ class C0054a {

        /* renamed from: a */
        static final /* synthetic */ int[] f529a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0053d.C0054a.<clinit>():void");
        }
    }

    /* renamed from: android.support.constraint.d.j.d$b */
    public enum EnumC0055b {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.d.j.d$c */
    public enum EnumC0056c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.d.j.d$d */
    public enum EnumC0057d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0053d(C0058e eVar, EnumC0057d dVar) {
        EnumC0055b bVar = EnumC0055b.RELAXED;
        this.f527h = 0;
        this.f521b = eVar;
        this.f522c = dVar;
    }

    /* renamed from: a */
    public boolean mo186a(C0053d dVar, int i, int i2, EnumC0056c cVar, int i3, boolean z) {
        if (dVar == null) {
            this.f523d = null;
            this.f524e = 0;
            this.f525f = -1;
            this.f526g = EnumC0056c.NONE;
            this.f527h = 2;
            return true;
        } else if (!z && !mo197l(dVar)) {
            return false;
        } else {
            this.f523d = dVar;
            if (i > 0) {
                this.f524e = i;
            } else {
                this.f524e = 0;
            }
            this.f525f = i2;
            this.f526g = cVar;
            this.f527h = i3;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo187b(C0053d dVar, int i, EnumC0056c cVar, int i2) {
        return mo186a(dVar, i, -1, cVar, i2, false);
    }

    /* renamed from: c */
    public int mo188c() {
        return this.f527h;
    }

    /* renamed from: d */
    public int mo189d() {
        C0053d dVar;
        if (this.f521b.mo271z() == 8) {
            return 0;
        }
        return (this.f525f <= -1 || (dVar = this.f523d) == null || dVar.f521b.mo271z() != 8) ? this.f524e : this.f525f;
    }

    /* renamed from: e */
    public C0058e mo190e() {
        return this.f521b;
    }

    /* renamed from: f */
    public C0066j mo191f() {
        return this.f520a;
    }

    /* renamed from: g */
    public C0048i mo192g() {
        return this.f528i;
    }

    /* renamed from: h */
    public EnumC0056c mo193h() {
        return this.f526g;
    }

    /* renamed from: i */
    public C0053d mo194i() {
        return this.f523d;
    }

    /* renamed from: j */
    public EnumC0057d mo195j() {
        return this.f522c;
    }

    /* renamed from: k */
    public boolean mo196k() {
        return this.f523d != null;
    }

    /* renamed from: l */
    public boolean mo197l(C0053d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        EnumC0057d j = dVar.mo195j();
        EnumC0057d dVar2 = this.f522c;
        if (j == dVar2) {
            return dVar2 != EnumC0057d.BASELINE || (dVar.mo190e().mo206F() && mo190e().mo206F());
        }
        switch (C0054a.f529a[dVar2.ordinal()]) {
            case 1:
                return (j == EnumC0057d.BASELINE || j == EnumC0057d.CENTER_X || j == EnumC0057d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = j == EnumC0057d.LEFT || j == EnumC0057d.RIGHT;
                if (!(dVar.mo190e() instanceof C0062g)) {
                    return z2;
                }
                if (z2 || j == EnumC0057d.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = j == EnumC0057d.TOP || j == EnumC0057d.BOTTOM;
                if (!(dVar.mo190e() instanceof C0062g)) {
                    return z3;
                }
                if (z3 || j == EnumC0057d.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f522c.name());
        }
    }

    /* renamed from: m */
    public void mo198m() {
        this.f523d = null;
        this.f524e = 0;
        this.f525f = -1;
        this.f526g = EnumC0056c.STRONG;
        this.f527h = 0;
        EnumC0055b bVar = EnumC0055b.RELAXED;
        this.f520a.mo296e();
    }

    /* renamed from: n */
    public void mo199n(C0041c cVar) {
        C0048i iVar = this.f528i;
        if (iVar == null) {
            this.f528i = new C0048i(C0048i.EnumC0049a.UNRESTRICTED, null);
        } else {
            iVar.mo174d();
        }
    }

    public String toString() {
        return this.f521b.mo244m() + ":" + this.f522c.toString();
    }
}
