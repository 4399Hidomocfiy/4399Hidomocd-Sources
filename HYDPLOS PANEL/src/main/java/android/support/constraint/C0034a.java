package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.a */
public class C0034a {

    /* renamed from: b */
    private static final int[] f211b = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f212c;

    /* renamed from: a */
    private HashMap<Integer, C0036b> f213a = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: android.support.constraint.a$b */
    public static class C0036b {

        /* renamed from: A */
        public int f214A;

        /* renamed from: B */
        public int f215B;

        /* renamed from: C */
        public int f216C;

        /* renamed from: D */
        public int f217D;

        /* renamed from: E */
        public int f218E;

        /* renamed from: F */
        public int f219F;

        /* renamed from: G */
        public int f220G;

        /* renamed from: H */
        public int f221H;

        /* renamed from: I */
        public int f222I;

        /* renamed from: J */
        public int f223J;

        /* renamed from: K */
        public int f224K;

        /* renamed from: L */
        public int f225L;

        /* renamed from: M */
        public int f226M;

        /* renamed from: N */
        public int f227N;

        /* renamed from: O */
        public int f228O;

        /* renamed from: P */
        public int f229P;

        /* renamed from: Q */
        public float f230Q;

        /* renamed from: R */
        public float f231R;

        /* renamed from: S */
        public int f232S;

        /* renamed from: T */
        public int f233T;

        /* renamed from: U */
        public float f234U;

        /* renamed from: V */
        public boolean f235V;

        /* renamed from: W */
        public float f236W;

        /* renamed from: X */
        public float f237X;

        /* renamed from: Y */
        public float f238Y;

        /* renamed from: Z */
        public float f239Z;

        /* renamed from: a */
        boolean f240a;

        /* renamed from: a0 */
        public float f241a0;

        /* renamed from: b */
        public int f242b;

        /* renamed from: b0 */
        public float f243b0;

        /* renamed from: c */
        public int f244c;

        /* renamed from: c0 */
        public float f245c0;

        /* renamed from: d */
        int f246d;

        /* renamed from: d0 */
        public float f247d0;

        /* renamed from: e */
        public int f248e;

        /* renamed from: e0 */
        public float f249e0;

        /* renamed from: f */
        public int f250f;

        /* renamed from: f0 */
        public float f251f0;

        /* renamed from: g */
        public float f252g;

        /* renamed from: g0 */
        public float f253g0;

        /* renamed from: h */
        public int f254h;

        /* renamed from: h0 */
        public boolean f255h0;

        /* renamed from: i */
        public int f256i;

        /* renamed from: i0 */
        public boolean f257i0;

        /* renamed from: j */
        public int f258j;

        /* renamed from: j0 */
        public int f259j0;

        /* renamed from: k */
        public int f260k;

        /* renamed from: k0 */
        public int f261k0;

        /* renamed from: l */
        public int f262l;

        /* renamed from: l0 */
        public int f263l0;

        /* renamed from: m */
        public int f264m;

        /* renamed from: m0 */
        public int f265m0;

        /* renamed from: n */
        public int f266n;

        /* renamed from: n0 */
        public int f267n0;

        /* renamed from: o */
        public int f268o;

        /* renamed from: o0 */
        public int f269o0;

        /* renamed from: p */
        public int f270p;

        /* renamed from: p0 */
        public float f271p0;

        /* renamed from: q */
        public int f272q;

        /* renamed from: q0 */
        public float f273q0;

        /* renamed from: r */
        public int f274r;

        /* renamed from: r0 */
        public int f275r0;

        /* renamed from: s */
        public int f276s;

        /* renamed from: s0 */
        public int f277s0;

        /* renamed from: t */
        public int f278t;

        /* renamed from: t0 */
        public int[] f279t0;

        /* renamed from: u */
        public float f280u;

        /* renamed from: v */
        public float f281v;

        /* renamed from: w */
        public String f282w;

        /* renamed from: x */
        public int f283x;

        /* renamed from: y */
        public int f284y;

        /* renamed from: z */
        public float f285z;

        private C0036b() {
            this.f240a = false;
            this.f248e = -1;
            this.f250f = -1;
            this.f252g = -1.0f;
            this.f254h = -1;
            this.f256i = -1;
            this.f258j = -1;
            this.f260k = -1;
            this.f262l = -1;
            this.f264m = -1;
            this.f266n = -1;
            this.f268o = -1;
            this.f270p = -1;
            this.f272q = -1;
            this.f274r = -1;
            this.f276s = -1;
            this.f278t = -1;
            this.f280u = 0.5f;
            this.f281v = 0.5f;
            this.f282w = null;
            this.f283x = -1;
            this.f284y = 0;
            this.f285z = 0.0f;
            this.f214A = -1;
            this.f215B = -1;
            this.f216C = -1;
            this.f217D = -1;
            this.f218E = -1;
            this.f219F = -1;
            this.f220G = -1;
            this.f221H = -1;
            this.f222I = -1;
            this.f223J = 0;
            this.f224K = -1;
            this.f225L = -1;
            this.f226M = -1;
            this.f227N = -1;
            this.f228O = -1;
            this.f229P = -1;
            this.f230Q = 0.0f;
            this.f231R = 0.0f;
            this.f232S = 0;
            this.f233T = 0;
            this.f234U = 1.0f;
            this.f235V = false;
            this.f236W = 0.0f;
            this.f237X = 0.0f;
            this.f238Y = 0.0f;
            this.f239Z = 0.0f;
            this.f241a0 = 1.0f;
            this.f243b0 = 1.0f;
            this.f245c0 = Float.NaN;
            this.f247d0 = Float.NaN;
            this.f249e0 = 0.0f;
            this.f251f0 = 0.0f;
            this.f253g0 = 0.0f;
            this.f255h0 = false;
            this.f257i0 = false;
            this.f259j0 = 0;
            this.f261k0 = 0;
            this.f263l0 = -1;
            this.f265m0 = -1;
            this.f267n0 = -1;
            this.f269o0 = -1;
            this.f271p0 = 1.0f;
            this.f273q0 = 1.0f;
            this.f275r0 = -1;
            this.f277s0 = -1;
        }

        /* renamed from: e */
        private void m79e(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f246d = i;
            this.f254h = layoutParams.f161d;
            this.f256i = layoutParams.f163e;
            this.f258j = layoutParams.f165f;
            this.f260k = layoutParams.f167g;
            this.f262l = layoutParams.f169h;
            this.f264m = layoutParams.f171i;
            this.f266n = layoutParams.f173j;
            this.f268o = layoutParams.f175k;
            this.f270p = layoutParams.f177l;
            this.f272q = layoutParams.f182p;
            this.f274r = layoutParams.f183q;
            this.f276s = layoutParams.f184r;
            this.f278t = layoutParams.f185s;
            this.f280u = layoutParams.f192z;
            this.f281v = layoutParams.f129A;
            this.f282w = layoutParams.f130B;
            this.f283x = layoutParams.f179m;
            this.f284y = layoutParams.f180n;
            this.f285z = layoutParams.f181o;
            this.f214A = layoutParams.f144P;
            this.f215B = layoutParams.f145Q;
            this.f216C = layoutParams.f146R;
            this.f252g = layoutParams.f159c;
            this.f248e = layoutParams.f155a;
            this.f250f = layoutParams.f157b;
            this.f242b = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            this.f244c = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            this.f217D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            this.f218E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            this.f219F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            this.f220G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            this.f230Q = layoutParams.f133E;
            this.f231R = layoutParams.f132D;
            this.f233T = layoutParams.f135G;
            this.f232S = layoutParams.f134F;
            boolean z = layoutParams.f147S;
            this.f255h0 = z;
            this.f257i0 = layoutParams.f148T;
            this.f259j0 = layoutParams.f136H;
            this.f261k0 = layoutParams.f137I;
            this.f255h0 = z;
            this.f263l0 = layoutParams.f140L;
            this.f265m0 = layoutParams.f141M;
            this.f267n0 = layoutParams.f138J;
            this.f269o0 = layoutParams.f139K;
            this.f271p0 = layoutParams.f142N;
            this.f273q0 = layoutParams.f143O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f221H = layoutParams.getMarginEnd();
                this.f222I = layoutParams.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: f */
        private void m80f(int i, Constraints.LayoutParams layoutParams) {
            m79e(i, layoutParams);
            this.f234U = layoutParams.f195m0;
            this.f237X = layoutParams.f198p0;
            this.f238Y = layoutParams.f199q0;
            this.f239Z = layoutParams.f200r0;
            this.f241a0 = layoutParams.f201s0;
            this.f243b0 = layoutParams.f202t0;
            this.f245c0 = layoutParams.f203u0;
            this.f247d0 = layoutParams.f204v0;
            this.f249e0 = layoutParams.f205w0;
            this.f251f0 = layoutParams.f206x0;
            this.f253g0 = layoutParams.f207y0;
            this.f236W = layoutParams.f197o0;
            this.f235V = layoutParams.f196n0;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: g */
        private void m81g(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            m80f(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                this.f277s0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.f275r0 = barrier.getType();
                this.f279t0 = barrier.getReferencedIds();
            }
        }

        /* renamed from: c */
        public void mo103c(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.f161d = this.f254h;
            layoutParams.f163e = this.f256i;
            layoutParams.f165f = this.f258j;
            layoutParams.f167g = this.f260k;
            layoutParams.f169h = this.f262l;
            layoutParams.f171i = this.f264m;
            layoutParams.f173j = this.f266n;
            layoutParams.f175k = this.f268o;
            layoutParams.f177l = this.f270p;
            layoutParams.f182p = this.f272q;
            layoutParams.f183q = this.f274r;
            layoutParams.f184r = this.f276s;
            layoutParams.f185s = this.f278t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f217D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f218E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f219F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f220G;
            layoutParams.f190x = this.f229P;
            layoutParams.f191y = this.f228O;
            layoutParams.f192z = this.f280u;
            layoutParams.f129A = this.f281v;
            layoutParams.f179m = this.f283x;
            layoutParams.f180n = this.f284y;
            layoutParams.f181o = this.f285z;
            layoutParams.f130B = this.f282w;
            layoutParams.f144P = this.f214A;
            layoutParams.f145Q = this.f215B;
            layoutParams.f133E = this.f230Q;
            layoutParams.f132D = this.f231R;
            layoutParams.f135G = this.f233T;
            layoutParams.f134F = this.f232S;
            layoutParams.f147S = this.f255h0;
            layoutParams.f148T = this.f257i0;
            layoutParams.f136H = this.f259j0;
            layoutParams.f137I = this.f261k0;
            layoutParams.f140L = this.f263l0;
            layoutParams.f141M = this.f265m0;
            layoutParams.f138J = this.f267n0;
            layoutParams.f139K = this.f269o0;
            layoutParams.f142N = this.f271p0;
            layoutParams.f143O = this.f273q0;
            layoutParams.f146R = this.f216C;
            layoutParams.f159c = this.f252g;
            layoutParams.f155a = this.f248e;
            layoutParams.f157b = this.f250f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = this.f242b;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = this.f244c;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f222I);
                layoutParams.setMarginEnd(this.f221H);
            }
            layoutParams.mo78a();
        }

        /* renamed from: d */
        public C0036b clone() {
            C0036b bVar = new C0036b();
            bVar.f240a = this.f240a;
            bVar.f242b = this.f242b;
            bVar.f244c = this.f244c;
            bVar.f248e = this.f248e;
            bVar.f250f = this.f250f;
            bVar.f252g = this.f252g;
            bVar.f254h = this.f254h;
            bVar.f256i = this.f256i;
            bVar.f258j = this.f258j;
            bVar.f260k = this.f260k;
            bVar.f262l = this.f262l;
            bVar.f264m = this.f264m;
            bVar.f266n = this.f266n;
            bVar.f268o = this.f268o;
            bVar.f270p = this.f270p;
            bVar.f272q = this.f272q;
            bVar.f274r = this.f274r;
            bVar.f276s = this.f276s;
            bVar.f278t = this.f278t;
            bVar.f280u = this.f280u;
            bVar.f281v = this.f281v;
            bVar.f282w = this.f282w;
            bVar.f214A = this.f214A;
            bVar.f215B = this.f215B;
            bVar.f280u = this.f280u;
            bVar.f280u = this.f280u;
            bVar.f280u = this.f280u;
            bVar.f280u = this.f280u;
            bVar.f280u = this.f280u;
            bVar.f216C = this.f216C;
            bVar.f217D = this.f217D;
            bVar.f218E = this.f218E;
            bVar.f219F = this.f219F;
            bVar.f220G = this.f220G;
            bVar.f221H = this.f221H;
            bVar.f222I = this.f222I;
            bVar.f223J = this.f223J;
            bVar.f224K = this.f224K;
            bVar.f225L = this.f225L;
            bVar.f226M = this.f226M;
            bVar.f227N = this.f227N;
            bVar.f228O = this.f228O;
            bVar.f229P = this.f229P;
            bVar.f230Q = this.f230Q;
            bVar.f231R = this.f231R;
            bVar.f232S = this.f232S;
            bVar.f233T = this.f233T;
            bVar.f234U = this.f234U;
            bVar.f235V = this.f235V;
            bVar.f236W = this.f236W;
            bVar.f237X = this.f237X;
            bVar.f238Y = this.f238Y;
            bVar.f239Z = this.f239Z;
            bVar.f241a0 = this.f241a0;
            bVar.f243b0 = this.f243b0;
            bVar.f245c0 = this.f245c0;
            bVar.f247d0 = this.f247d0;
            bVar.f249e0 = this.f249e0;
            bVar.f251f0 = this.f251f0;
            bVar.f253g0 = this.f253g0;
            bVar.f255h0 = this.f255h0;
            bVar.f257i0 = this.f257i0;
            bVar.f259j0 = this.f259j0;
            bVar.f261k0 = this.f261k0;
            bVar.f263l0 = this.f263l0;
            bVar.f265m0 = this.f265m0;
            bVar.f267n0 = this.f267n0;
            bVar.f269o0 = this.f269o0;
            bVar.f271p0 = this.f271p0;
            bVar.f273q0 = this.f273q0;
            bVar.f275r0 = this.f275r0;
            bVar.f277s0 = this.f277s0;
            int[] iArr = this.f279t0;
            if (iArr != null) {
                bVar.f279t0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f283x = this.f283x;
            bVar.f284y = this.f284y;
            bVar.f285z = this.f285z;
            return bVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f212c = sparseIntArray;
        sparseIntArray.append(C0038c.f354e1, 25);
        f212c.append(C0038c.f357f1, 26);
        f212c.append(C0038c.f363h1, 29);
        f212c.append(C0038c.f366i1, 30);
        f212c.append(C0038c.f381n1, 36);
        f212c.append(C0038c.f378m1, 35);
        f212c.append(C0038c.f315N0, 4);
        f212c.append(C0038c.f313M0, 3);
        f212c.append(C0038c.f309K0, 1);
        f212c.append(C0038c.f402u1, 6);
        f212c.append(C0038c.f405v1, 7);
        f212c.append(C0038c.f329U0, 17);
        f212c.append(C0038c.f331V0, 18);
        f212c.append(C0038c.f333W0, 19);
        f212c.append(C0038c.f377m0, 27);
        f212c.append(C0038c.f369j1, 32);
        f212c.append(C0038c.f372k1, 33);
        f212c.append(C0038c.f327T0, 10);
        f212c.append(C0038c.f325S0, 9);
        f212c.append(C0038c.f414y1, 13);
        f212c.append(C0038c.f291B1, 16);
        f212c.append(C0038c.f417z1, 14);
        f212c.append(C0038c.f408w1, 11);
        f212c.append(C0038c.f288A1, 15);
        f212c.append(C0038c.f411x1, 12);
        f212c.append(C0038c.f390q1, 40);
        f212c.append(C0038c.f348c1, 39);
        f212c.append(C0038c.f345b1, 41);
        f212c.append(C0038c.f387p1, 42);
        f212c.append(C0038c.f342a1, 20);
        f212c.append(C0038c.f384o1, 37);
        f212c.append(C0038c.f323R0, 5);
        f212c.append(C0038c.f351d1, 64);
        f212c.append(C0038c.f375l1, 64);
        f212c.append(C0038c.f360g1, 64);
        f212c.append(C0038c.f311L0, 64);
        f212c.append(C0038c.f307J0, 64);
        f212c.append(C0038c.f392r0, 24);
        f212c.append(C0038c.f398t0, 28);
        f212c.append(C0038c.f299F0, 31);
        f212c.append(C0038c.f301G0, 8);
        f212c.append(C0038c.f395s0, 34);
        f212c.append(C0038c.f401u0, 2);
        f212c.append(C0038c.f386p0, 23);
        f212c.append(C0038c.f389q0, 21);
        f212c.append(C0038c.f383o0, 22);
        f212c.append(C0038c.f404v0, 43);
        f212c.append(C0038c.f305I0, 44);
        f212c.append(C0038c.f295D0, 45);
        f212c.append(C0038c.f297E0, 46);
        f212c.append(C0038c.f293C0, 60);
        f212c.append(C0038c.f287A0, 47);
        f212c.append(C0038c.f290B0, 48);
        f212c.append(C0038c.f407w0, 49);
        f212c.append(C0038c.f410x0, 50);
        f212c.append(C0038c.f413y0, 51);
        f212c.append(C0038c.f416z0, 52);
        f212c.append(C0038c.f303H0, 53);
        f212c.append(C0038c.f393r1, 54);
        f212c.append(C0038c.f335X0, 55);
        f212c.append(C0038c.f396s1, 56);
        f212c.append(C0038c.f337Y0, 57);
        f212c.append(C0038c.f399t1, 58);
        f212c.append(C0038c.f339Z0, 59);
        f212c.append(C0038c.f317O0, 61);
        f212c.append(C0038c.f321Q0, 62);
        f212c.append(C0038c.f319P0, 63);
        f212c.append(C0038c.f380n0, 38);
    }

    /* renamed from: c */
    private C0036b m71c(Context context, AttributeSet attributeSet) {
        C0036b bVar = new C0036b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0038c.f374l0);
        m73f(bVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    /* renamed from: e */
    private static int m72e(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: f */
    private void m73f(C0036b bVar, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f212c.get(index);
            switch (i2) {
                case 1:
                    bVar.f270p = m72e(typedArray, index, bVar.f270p);
                    break;
                case 2:
                    bVar.f220G = typedArray.getDimensionPixelSize(index, bVar.f220G);
                    break;
                case 3:
                    bVar.f268o = m72e(typedArray, index, bVar.f268o);
                    break;
                case 4:
                    bVar.f266n = m72e(typedArray, index, bVar.f266n);
                    break;
                case 5:
                    bVar.f282w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.f214A = typedArray.getDimensionPixelOffset(index, bVar.f214A);
                    break;
                case 7:
                    bVar.f215B = typedArray.getDimensionPixelOffset(index, bVar.f215B);
                    break;
                case 8:
                    bVar.f221H = typedArray.getDimensionPixelSize(index, bVar.f221H);
                    break;
                case 9:
                    bVar.f278t = m72e(typedArray, index, bVar.f278t);
                    break;
                case 10:
                    bVar.f276s = m72e(typedArray, index, bVar.f276s);
                    break;
                case 11:
                    bVar.f227N = typedArray.getDimensionPixelSize(index, bVar.f227N);
                    break;
                case 12:
                    bVar.f228O = typedArray.getDimensionPixelSize(index, bVar.f228O);
                    break;
                case 13:
                    bVar.f224K = typedArray.getDimensionPixelSize(index, bVar.f224K);
                    break;
                case 14:
                    bVar.f226M = typedArray.getDimensionPixelSize(index, bVar.f226M);
                    break;
                case 15:
                    bVar.f229P = typedArray.getDimensionPixelSize(index, bVar.f229P);
                    break;
                case 16:
                    bVar.f225L = typedArray.getDimensionPixelSize(index, bVar.f225L);
                    break;
                case 17:
                    bVar.f248e = typedArray.getDimensionPixelOffset(index, bVar.f248e);
                    break;
                case 18:
                    bVar.f250f = typedArray.getDimensionPixelOffset(index, bVar.f250f);
                    break;
                case 19:
                    bVar.f252g = typedArray.getFloat(index, bVar.f252g);
                    break;
                case 20:
                    bVar.f280u = typedArray.getFloat(index, bVar.f280u);
                    break;
                case 21:
                    bVar.f244c = typedArray.getLayoutDimension(index, bVar.f244c);
                    break;
                case 22:
                    int i3 = typedArray.getInt(index, bVar.f223J);
                    bVar.f223J = i3;
                    bVar.f223J = f211b[i3];
                    break;
                case 23:
                    bVar.f242b = typedArray.getLayoutDimension(index, bVar.f242b);
                    break;
                case 24:
                    bVar.f217D = typedArray.getDimensionPixelSize(index, bVar.f217D);
                    break;
                case 25:
                    bVar.f254h = m72e(typedArray, index, bVar.f254h);
                    break;
                case 26:
                    bVar.f256i = m72e(typedArray, index, bVar.f256i);
                    break;
                case 27:
                    bVar.f216C = typedArray.getInt(index, bVar.f216C);
                    break;
                case 28:
                    bVar.f218E = typedArray.getDimensionPixelSize(index, bVar.f218E);
                    break;
                case 29:
                    bVar.f258j = m72e(typedArray, index, bVar.f258j);
                    break;
                case 30:
                    bVar.f260k = m72e(typedArray, index, bVar.f260k);
                    break;
                case 31:
                    bVar.f222I = typedArray.getDimensionPixelSize(index, bVar.f222I);
                    break;
                case 32:
                    bVar.f272q = m72e(typedArray, index, bVar.f272q);
                    break;
                case 33:
                    bVar.f274r = m72e(typedArray, index, bVar.f274r);
                    break;
                case 34:
                    bVar.f219F = typedArray.getDimensionPixelSize(index, bVar.f219F);
                    break;
                case 35:
                    bVar.f264m = m72e(typedArray, index, bVar.f264m);
                    break;
                case 36:
                    bVar.f262l = m72e(typedArray, index, bVar.f262l);
                    break;
                case 37:
                    bVar.f281v = typedArray.getFloat(index, bVar.f281v);
                    break;
                case 38:
                    bVar.f246d = typedArray.getResourceId(index, bVar.f246d);
                    break;
                case 39:
                    bVar.f231R = typedArray.getFloat(index, bVar.f231R);
                    break;
                case 40:
                    bVar.f230Q = typedArray.getFloat(index, bVar.f230Q);
                    break;
                case 41:
                    bVar.f232S = typedArray.getInt(index, bVar.f232S);
                    break;
                case 42:
                    bVar.f233T = typedArray.getInt(index, bVar.f233T);
                    break;
                case 43:
                    bVar.f234U = typedArray.getFloat(index, bVar.f234U);
                    break;
                case 44:
                    bVar.f235V = true;
                    bVar.f236W = typedArray.getDimension(index, bVar.f236W);
                    break;
                case 45:
                    bVar.f238Y = typedArray.getFloat(index, bVar.f238Y);
                    break;
                case 46:
                    bVar.f239Z = typedArray.getFloat(index, bVar.f239Z);
                    break;
                case 47:
                    bVar.f241a0 = typedArray.getFloat(index, bVar.f241a0);
                    break;
                case 48:
                    bVar.f243b0 = typedArray.getFloat(index, bVar.f243b0);
                    break;
                case 49:
                    bVar.f245c0 = typedArray.getFloat(index, bVar.f245c0);
                    break;
                case 50:
                    bVar.f247d0 = typedArray.getFloat(index, bVar.f247d0);
                    break;
                case 51:
                    bVar.f249e0 = typedArray.getDimension(index, bVar.f249e0);
                    break;
                case 52:
                    bVar.f251f0 = typedArray.getDimension(index, bVar.f251f0);
                    break;
                case 53:
                    bVar.f253g0 = typedArray.getDimension(index, bVar.f253g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            bVar.f237X = typedArray.getFloat(index, bVar.f237X);
                            break;
                        case 61:
                            bVar.f283x = m72e(typedArray, index, bVar.f283x);
                            break;
                        case 62:
                            bVar.f284y = typedArray.getDimensionPixelSize(index, bVar.f284y);
                            break;
                        case 63:
                            bVar.f285z = typedArray.getFloat(index, bVar.f285z);
                            break;
                        case 64:
                            sb = new StringBuilder();
                            str = "unused attribute 0x";
                            sb.append(str);
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f212c.get(index));
                            Log.w("ConstraintSet", sb.toString());
                            break;
                        default:
                            sb = new StringBuilder();
                            str = "Unknown attribute 0x";
                            sb.append(str);
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f212c.get(index));
                            Log.w("ConstraintSet", sb.toString());
                            break;
                    }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f213a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f213a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0036b bVar = this.f213a.get(Integer.valueOf(id));
                    int i2 = bVar.f277s0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setReferencedIds(bVar.f279t0);
                        barrier.setType(bVar.f275r0);
                        bVar.mo103c(constraintLayout.generateDefaultLayoutParams());
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    bVar.mo103c(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(bVar.f223J);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 17) {
                        childAt.setAlpha(bVar.f234U);
                        childAt.setRotation(bVar.f237X);
                        childAt.setRotationX(bVar.f238Y);
                        childAt.setRotationY(bVar.f239Z);
                        childAt.setScaleX(bVar.f241a0);
                        childAt.setScaleY(bVar.f243b0);
                        if (!Float.isNaN(bVar.f245c0)) {
                            childAt.setPivotX(bVar.f245c0);
                        }
                        if (!Float.isNaN(bVar.f247d0)) {
                            childAt.setPivotY(bVar.f247d0);
                        }
                        childAt.setTranslationX(bVar.f249e0);
                        childAt.setTranslationY(bVar.f251f0);
                        if (i3 >= 21) {
                            childAt.setTranslationZ(bVar.f253g0);
                            if (bVar.f235V) {
                                childAt.setElevation(bVar.f236W);
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0036b bVar2 = this.f213a.get(num);
            int i4 = bVar2.f277s0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                barrier2.setReferencedIds(bVar2.f279t0);
                barrier2.setType(bVar2.f275r0);
                ConstraintLayout.LayoutParams a = constraintLayout.generateDefaultLayoutParams();
                bVar2.mo103c(a);
                constraintLayout.addView(barrier2, a);
            }
            if (bVar2.f240a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams a2 = constraintLayout.generateDefaultLayoutParams();
                bVar2.mo103c(a2);
                constraintLayout.addView(guideline, a2);
            }
        }
    }

    /* renamed from: b */
    public void mo101b(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f213a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f213a.containsKey(Integer.valueOf(id))) {
                    this.f213a.put(Integer.valueOf(id), new C0036b());
                }
                C0036b bVar = this.f213a.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    bVar.m81g((ConstraintHelper) childAt, id, layoutParams);
                }
                bVar.m80f(id, layoutParams);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: d */
    public void mo102d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0036b c = m71c(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c.f240a = true;
                    }
                    this.f213a.put(Integer.valueOf(c.f246d), c);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
