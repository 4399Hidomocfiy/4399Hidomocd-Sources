package android.support.constraint.p007d;

import android.support.constraint.p007d.C0048i;
import java.util.Arrays;

/* renamed from: android.support.constraint.d.a */
public class C0039a {

    /* renamed from: a */
    int f418a = 0;

    /* renamed from: b */
    private final C0040b f419b;

    /* renamed from: c */
    private final C0041c f420c;

    /* renamed from: d */
    private int f421d = 8;

    /* renamed from: e */
    private C0048i f422e = null;

    /* renamed from: f */
    private int[] f423f = new int[8];

    /* renamed from: g */
    private int[] f424g = new int[8];

    /* renamed from: h */
    private float[] f425h = new float[8];

    /* renamed from: i */
    private int f426i = -1;

    /* renamed from: j */
    private int f427j = -1;

    /* renamed from: k */
    private boolean f428k = false;

    C0039a(C0040b bVar, C0041c cVar) {
        this.f419b = bVar;
        this.f420c = cVar;
    }

    /* renamed from: k */
    private boolean m84k(C0048i iVar, C0043e eVar) {
        return iVar.f493j <= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo106a(C0048i iVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f426i;
            if (i == -1) {
                this.f426i = 0;
                this.f425h[0] = f;
                this.f423f[0] = iVar.f485b;
                this.f424g[0] = -1;
                iVar.f493j++;
                iVar.mo172a(this.f419b);
                this.f418a++;
                if (!this.f428k) {
                    int i2 = this.f427j + 1;
                    this.f427j = i2;
                    int[] iArr = this.f423f;
                    if (i2 >= iArr.length) {
                        this.f428k = true;
                        this.f427j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f418a) {
                int[] iArr2 = this.f423f;
                int i5 = iArr2[i];
                int i6 = iVar.f485b;
                if (i5 == i6) {
                    float[] fArr = this.f425h;
                    fArr[i] = fArr[i] + f;
                    if (fArr[i] == 0.0f) {
                        if (i == this.f426i) {
                            this.f426i = this.f424g[i];
                        } else {
                            int[] iArr3 = this.f424g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo173c(this.f419b);
                        }
                        if (this.f428k) {
                            this.f427j = i;
                        }
                        iVar.f493j--;
                        this.f418a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f424g[i];
                i3++;
            }
            int i7 = this.f427j;
            int i8 = i7 + 1;
            if (this.f428k) {
                int[] iArr4 = this.f423f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f423f;
            if (i7 >= iArr5.length && this.f418a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f423f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f423f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f421d * 2;
                this.f421d = i10;
                this.f428k = false;
                this.f427j = i7 - 1;
                this.f425h = Arrays.copyOf(this.f425h, i10);
                this.f423f = Arrays.copyOf(this.f423f, this.f421d);
                this.f424g = Arrays.copyOf(this.f424g, this.f421d);
            }
            this.f423f[i7] = iVar.f485b;
            this.f425h[i7] = f;
            int[] iArr8 = this.f424g;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f426i;
                this.f426i = i7;
            }
            iVar.f493j++;
            iVar.mo172a(this.f419b);
            this.f418a++;
            if (!this.f428k) {
                this.f427j++;
            }
            int i11 = this.f427j;
            int[] iArr9 = this.f423f;
            if (i11 >= iArr9.length) {
                this.f428k = true;
                this.f427j = iArr9.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.constraint.p007d.C0048i mo107b(android.support.constraint.p007d.C0043e r15) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.C0039a.mo107b(android.support.constraint.d.e):android.support.constraint.d.i");
    }

    /* renamed from: c */
    public final void mo108c() {
        int i = this.f426i;
        int i2 = 0;
        while (i != -1 && i2 < this.f418a) {
            C0048i iVar = this.f420c.f436c[this.f423f[i]];
            if (iVar != null) {
                iVar.mo173c(this.f419b);
            }
            i = this.f424g[i];
            i2++;
        }
        this.f426i = -1;
        this.f427j = -1;
        this.f428k = false;
        this.f418a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo109d(C0048i iVar) {
        int i = this.f426i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f418a) {
            if (this.f423f[i] == iVar.f485b) {
                return true;
            }
            i = this.f424g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo110e(float f) {
        int i = this.f426i;
        int i2 = 0;
        while (i != -1 && i2 < this.f418a) {
            float[] fArr = this.f425h;
            fArr[i] = fArr[i] / f;
            i = this.f424g[i];
            i2++;
        }
    }

    /* renamed from: f */
    public final float mo111f(C0048i iVar) {
        int i = this.f426i;
        int i2 = 0;
        while (i != -1 && i2 < this.f418a) {
            if (this.f423f[i] == iVar.f485b) {
                return this.f425h[i];
            }
            i = this.f424g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0048i mo112g(boolean[] zArr, C0048i iVar) {
        C0048i.EnumC0049a aVar;
        int i = this.f426i;
        int i2 = 0;
        C0048i iVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f418a) {
            float[] fArr = this.f425h;
            if (fArr[i] < 0.0f) {
                C0048i iVar3 = this.f420c.f436c[this.f423f[i]];
                if ((zArr == null || !zArr[iVar3.f485b]) && iVar3 != iVar && ((aVar = iVar3.f490g) == C0048i.EnumC0049a.SLACK || aVar == C0048i.EnumC0049a.ERROR)) {
                    float f2 = fArr[i];
                    if (f2 < f) {
                        f = f2;
                        iVar2 = iVar3;
                    }
                }
            }
            i = this.f424g[i];
            i2++;
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C0048i mo113h(int i) {
        int i2 = this.f426i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f418a) {
            if (i3 == i) {
                return this.f420c.f436c[this.f423f[i2]];
            }
            i2 = this.f424g[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final float mo114i(int i) {
        int i2 = this.f426i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f418a) {
            if (i3 == i) {
                return this.f425h[i2];
            }
            i2 = this.f424g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo115j() {
        int i = this.f426i;
        int i2 = 0;
        while (i != -1 && i2 < this.f418a) {
            float[] fArr = this.f425h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f424g[i];
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo116l(C0048i iVar, float f) {
        if (f == 0.0f) {
            mo117m(iVar, true);
            return;
        }
        int i = this.f426i;
        if (i == -1) {
            this.f426i = 0;
            this.f425h[0] = f;
            this.f423f[0] = iVar.f485b;
            this.f424g[0] = -1;
            iVar.f493j++;
            iVar.mo172a(this.f419b);
            this.f418a++;
            if (!this.f428k) {
                int i2 = this.f427j + 1;
                this.f427j = i2;
                int[] iArr = this.f423f;
                if (i2 >= iArr.length) {
                    this.f428k = true;
                    this.f427j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f418a) {
            int[] iArr2 = this.f423f;
            int i5 = iArr2[i];
            int i6 = iVar.f485b;
            if (i5 == i6) {
                this.f425h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f424g[i];
            i3++;
        }
        int i7 = this.f427j;
        int i8 = i7 + 1;
        if (this.f428k) {
            int[] iArr3 = this.f423f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f423f;
        if (i7 >= iArr4.length && this.f418a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f423f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f423f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f421d * 2;
            this.f421d = i10;
            this.f428k = false;
            this.f427j = i7 - 1;
            this.f425h = Arrays.copyOf(this.f425h, i10);
            this.f423f = Arrays.copyOf(this.f423f, this.f421d);
            this.f424g = Arrays.copyOf(this.f424g, this.f421d);
        }
        this.f423f[i7] = iVar.f485b;
        this.f425h[i7] = f;
        int[] iArr7 = this.f424g;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f426i;
            this.f426i = i7;
        }
        iVar.f493j++;
        iVar.mo172a(this.f419b);
        int i11 = this.f418a + 1;
        this.f418a = i11;
        if (!this.f428k) {
            this.f427j++;
        }
        int[] iArr8 = this.f423f;
        if (i11 >= iArr8.length) {
            this.f428k = true;
        }
        if (this.f427j >= iArr8.length) {
            this.f428k = true;
            this.f427j = iArr8.length - 1;
        }
    }

    /* renamed from: m */
    public final float mo117m(C0048i iVar, boolean z) {
        if (this.f422e == iVar) {
            this.f422e = null;
        }
        int i = this.f426i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f418a) {
            if (this.f423f[i] == iVar.f485b) {
                if (i == this.f426i) {
                    this.f426i = this.f424g[i];
                } else {
                    int[] iArr = this.f424g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo173c(this.f419b);
                }
                iVar.f493j--;
                this.f418a--;
                this.f423f[i] = -1;
                if (this.f428k) {
                    this.f427j = i;
                }
                return this.f425h[i];
            }
            i2++;
            i3 = i;
            i = this.f424g[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo118n(C0040b bVar, C0040b bVar2, boolean z) {
        int i = this.f426i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f418a) {
                int i3 = this.f423f[i];
                C0048i iVar = bVar2.f429a;
                if (i3 == iVar.f485b) {
                    float f = this.f425h[i];
                    mo117m(iVar, z);
                    C0039a aVar = bVar2.f432d;
                    int i4 = aVar.f426i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f418a) {
                        mo106a(this.f420c.f436c[aVar.f423f[i4]], aVar.f425h[i4] * f, z);
                        i4 = aVar.f424g[i4];
                        i5++;
                    }
                    bVar.f430b += bVar2.f430b * f;
                    if (z) {
                        bVar2.f429a.mo173c(bVar);
                    }
                    i = this.f426i;
                } else {
                    i = this.f424g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo119o(C0040b bVar, C0040b[] bVarArr) {
        int i = this.f426i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f418a) {
                C0048i iVar = this.f420c.f436c[this.f423f[i]];
                if (iVar.f486c != -1) {
                    float f = this.f425h[i];
                    mo117m(iVar, true);
                    C0040b bVar2 = bVarArr[iVar.f486c];
                    if (!bVar2.f433e) {
                        C0039a aVar = bVar2.f432d;
                        int i3 = aVar.f426i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f418a) {
                            mo106a(this.f420c.f436c[aVar.f423f[i3]], aVar.f425h[i3] * f, true);
                            i3 = aVar.f424g[i3];
                            i4++;
                        }
                    }
                    bVar.f430b += bVar2.f430b * f;
                    bVar2.f429a.mo173c(bVar);
                    i = this.f426i;
                } else {
                    i = this.f424g[i];
                    i2++;
                }
            }
            return;
        }
    }

    public String toString() {
        int i = this.f426i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f418a) {
            str = ((str + " -> ") + this.f425h[i] + " : ") + this.f420c.f436c[this.f423f[i]];
            i = this.f424g[i];
            i2++;
        }
        return str;
    }
}
