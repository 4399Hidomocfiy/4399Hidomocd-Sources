package p013b.p014a.p015a.p016a0;

import android.support.p012v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Map;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.a */
public final class C0578a extends AbstractC0624q {

    /* renamed from: d */
    static final char[] f1039d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f1040e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f1041f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f1042a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f1043b = new int[80];

    /* renamed from: c */
    private int f1044c = 0;

    /* renamed from: h */
    static boolean m733h(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m734i(int i) {
        int[] iArr = this.f1043b;
        int i2 = this.f1044c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f1044c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f1043b = iArr2;
        }
    }

    /* renamed from: j */
    private int m735j() {
        for (int i = 1; i < this.f1044c; i += 2) {
            int l = m737l(i);
            if (l != -1 && m733h(f1041f, f1039d[l])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f1043b[i3];
                }
                if (i == 1 || this.f1043b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw C0712l.m1333a();
    }

    /* renamed from: k */
    private void m736k(C0775a aVar) {
        int i = 0;
        this.f1044c = 0;
        int j = aVar.mo8777j(0);
        int k = aVar.mo8778k();
        if (j < k) {
            boolean z = true;
            while (j < k) {
                if (aVar.mo8773g(j) ^ z) {
                    i++;
                } else {
                    m734i(i);
                    z = !z;
                    i = 1;
                }
                j++;
            }
            m734i(i);
            return;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: l */
    private int m737l(int i) {
        int i2 = i + 7;
        if (i2 >= this.f1044c) {
            return -1;
        }
        int[] iArr = this.f1043b;
        int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i4 = 0;
        int i5 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f1040e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        Arrays.fill(this.f1043b, 0);
        m736k(aVar);
        int j = m735j();
        this.f1042a.setLength(0);
        int i2 = j;
        do {
            int l = m737l(i2);
            if (l != -1) {
                this.f1042a.append((char) l);
                i2 += 8;
                if (this.f1042a.length() > 1 && m733h(f1041f, f1039d[l])) {
                    break;
                }
            } else {
                throw C0712l.m1333a();
            }
        } while (i2 < this.f1044c);
        int i3 = i2 - 1;
        int i4 = this.f1043b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.f1043b[i2 + i6];
        }
        if (i2 >= this.f1044c || i4 >= i5 / 2) {
            mo8414m(j);
            for (int i7 = 0; i7 < this.f1042a.length(); i7++) {
                StringBuilder sb = this.f1042a;
                sb.setCharAt(i7, f1039d[sb.charAt(i7)]);
            }
            char charAt = this.f1042a.charAt(0);
            char[] cArr = f1041f;
            if (m733h(cArr, charAt)) {
                StringBuilder sb2 = this.f1042a;
                if (!m733h(cArr, sb2.charAt(sb2.length() - 1))) {
                    throw C0712l.m1333a();
                } else if (this.f1042a.length() > 3) {
                    if (map == null || !map.containsKey(EnumC0704e.RETURN_CODABAR_START_END)) {
                        StringBuilder sb3 = this.f1042a;
                        sb3.deleteCharAt(sb3.length() - 1);
                        this.f1042a.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < j; i9++) {
                        i8 += this.f1043b[i9];
                    }
                    float f = (float) i8;
                    while (j < i3) {
                        i8 += this.f1043b[j];
                        j++;
                    }
                    float f2 = (float) i;
                    return new C0716p(this.f1042a.toString(), null, new C0718r[]{new C0718r(f, f2), new C0718r((float) i8, f2)}, EnumC0577a.CODABAR);
                } else {
                    throw C0712l.m1333a();
                }
            } else {
                throw C0712l.m1333a();
            }
        } else {
            throw C0712l.m1333a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8414m(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f1042a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f1040e[this.f1042a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) * 2);
                iArr[i7] = iArr[i7] + this.f1043b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * 2.0f) + 1.5f) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = f1040e[this.f1042a.charAt(i2)];
            for (int i11 = 6; i11 >= 0; i11--) {
                int i12 = (i11 & 1) + ((i10 & 1) * 2);
                float f = (float) this.f1043b[i + i11];
                if (f >= fArr2[i12] && f <= fArr[i12]) {
                    i10 >>= 1;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw C0712l.m1333a();
    }
}
