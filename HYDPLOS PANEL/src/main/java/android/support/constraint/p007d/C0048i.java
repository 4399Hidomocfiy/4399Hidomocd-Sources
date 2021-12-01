package android.support.constraint.p007d;

import java.util.Arrays;

/* renamed from: android.support.constraint.d.i */
public class C0048i {

    /* renamed from: k */
    private static int f483k = 1;

    /* renamed from: a */
    private String f484a;

    /* renamed from: b */
    public int f485b = -1;

    /* renamed from: c */
    int f486c = -1;

    /* renamed from: d */
    public int f487d = 0;

    /* renamed from: e */
    public float f488e;

    /* renamed from: f */
    float[] f489f = new float[7];

    /* renamed from: g */
    EnumC0049a f490g;

    /* renamed from: h */
    C0040b[] f491h = new C0040b[8];

    /* renamed from: i */
    int f492i = 0;

    /* renamed from: j */
    public int f493j = 0;

    /* renamed from: android.support.constraint.d.i$a */
    public enum EnumC0049a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0048i(EnumC0049a aVar, String str) {
        this.f490g = aVar;
    }

    /* renamed from: b */
    static void m161b() {
        f483k++;
    }

    /* renamed from: a */
    public final void mo172a(C0040b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f492i;
            if (i >= i2) {
                C0040b[] bVarArr = this.f491h;
                if (i2 >= bVarArr.length) {
                    this.f491h = (C0040b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0040b[] bVarArr2 = this.f491h;
                int i3 = this.f492i;
                bVarArr2[i3] = bVar;
                this.f492i = i3 + 1;
                return;
            } else if (this.f491h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo173c(C0040b bVar) {
        int i = this.f492i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f491h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0040b[] bVarArr = this.f491h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f492i--;
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo174d() {
        this.f484a = null;
        this.f490g = EnumC0049a.UNKNOWN;
        this.f487d = 0;
        this.f485b = -1;
        this.f486c = -1;
        this.f488e = 0.0f;
        this.f492i = 0;
        this.f493j = 0;
    }

    /* renamed from: e */
    public void mo175e(EnumC0049a aVar, String str) {
        this.f490g = aVar;
    }

    /* renamed from: f */
    public final void mo176f(C0040b bVar) {
        int i = this.f492i;
        for (int i2 = 0; i2 < i; i2++) {
            C0040b[] bVarArr = this.f491h;
            bVarArr[i2].f432d.mo118n(bVarArr[i2], bVar, false);
        }
        this.f492i = 0;
    }

    public String toString() {
        return "" + this.f484a;
    }
}
