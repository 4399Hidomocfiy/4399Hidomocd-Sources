package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.constraint.p007d.C0045f;
import android.support.constraint.p007d.p008j.C0058e;
import android.support.constraint.p007d.p008j.C0061f;
import android.support.constraint.p007d.p008j.C0062g;
import android.support.p009v4.internal.view.SupportMenu;
import android.support.p012v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f109a = new SparseArray<>();

    /* renamed from: b */
    private ArrayList<ConstraintHelper> f110b = new ArrayList<>(4);

    /* renamed from: c */
    private final ArrayList<C0058e> f111c = new ArrayList<>(100);

    /* renamed from: d */
    C0061f f112d = new C0061f();

    /* renamed from: e */
    private int f113e = 0;

    /* renamed from: f */
    private int f114f = 0;

    /* renamed from: g */
    private int f115g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: h */
    private int f116h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: i */
    private boolean f117i = true;

    /* renamed from: j */
    private int f118j = 3;

    /* renamed from: k */
    private C0034a f119k = null;

    /* renamed from: l */
    private int f120l = -1;

    /* renamed from: m */
    private HashMap<String, Integer> f121m = new HashMap<>();

    /* renamed from: n */
    private int f122n = -1;

    /* renamed from: o */
    private int f123o = -1;

    /* renamed from: p */
    int f124p = -1;

    /* renamed from: q */
    int f125q = -1;

    /* renamed from: r */
    int f126r = 0;

    /* renamed from: s */
    int f127s = 0;

    /* renamed from: t */
    private C0045f f128t;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f129A = 0.5f;

        /* renamed from: B */
        public String f130B = null;

        /* renamed from: C */
        int f131C = 1;

        /* renamed from: D */
        public float f132D = -1.0f;

        /* renamed from: E */
        public float f133E = -1.0f;

        /* renamed from: F */
        public int f134F = 0;

        /* renamed from: G */
        public int f135G = 0;

        /* renamed from: H */
        public int f136H = 0;

        /* renamed from: I */
        public int f137I = 0;

        /* renamed from: J */
        public int f138J = 0;

        /* renamed from: K */
        public int f139K = 0;

        /* renamed from: L */
        public int f140L = 0;

        /* renamed from: M */
        public int f141M = 0;

        /* renamed from: N */
        public float f142N = 1.0f;

        /* renamed from: O */
        public float f143O = 1.0f;

        /* renamed from: P */
        public int f144P = -1;

        /* renamed from: Q */
        public int f145Q = -1;

        /* renamed from: R */
        public int f146R = -1;

        /* renamed from: S */
        public boolean f147S = false;

        /* renamed from: T */
        public boolean f148T = false;

        /* renamed from: U */
        boolean f149U = true;

        /* renamed from: V */
        boolean f150V = true;

        /* renamed from: W */
        boolean f151W = false;

        /* renamed from: X */
        boolean f152X = false;

        /* renamed from: Y */
        boolean f153Y = false;

        /* renamed from: Z */
        boolean f154Z = false;

        /* renamed from: a */
        public int f155a = -1;

        /* renamed from: a0 */
        int f156a0 = -1;

        /* renamed from: b */
        public int f157b = -1;

        /* renamed from: b0 */
        int f158b0 = -1;

        /* renamed from: c */
        public float f159c = -1.0f;

        /* renamed from: c0 */
        int f160c0 = -1;

        /* renamed from: d */
        public int f161d = -1;

        /* renamed from: d0 */
        int f162d0 = -1;

        /* renamed from: e */
        public int f163e = -1;

        /* renamed from: e0 */
        int f164e0 = -1;

        /* renamed from: f */
        public int f165f = -1;

        /* renamed from: f0 */
        int f166f0 = -1;

        /* renamed from: g */
        public int f167g = -1;

        /* renamed from: g0 */
        float f168g0 = 0.5f;

        /* renamed from: h */
        public int f169h = -1;

        /* renamed from: h0 */
        int f170h0;

        /* renamed from: i */
        public int f171i = -1;

        /* renamed from: i0 */
        int f172i0;

        /* renamed from: j */
        public int f173j = -1;

        /* renamed from: j0 */
        float f174j0;

        /* renamed from: k */
        public int f175k = -1;

        /* renamed from: k0 */
        C0058e f176k0 = new C0058e();

        /* renamed from: l */
        public int f177l = -1;

        /* renamed from: l0 */
        public boolean f178l0 = false;

        /* renamed from: m */
        public int f179m = -1;

        /* renamed from: n */
        public int f180n = 0;

        /* renamed from: o */
        public float f181o = 0.0f;

        /* renamed from: p */
        public int f182p = -1;

        /* renamed from: q */
        public int f183q = -1;

        /* renamed from: r */
        public int f184r = -1;

        /* renamed from: s */
        public int f185s = -1;

        /* renamed from: t */
        public int f186t = -1;

        /* renamed from: u */
        public int f187u = -1;

        /* renamed from: v */
        public int f188v = -1;

        /* renamed from: w */
        public int f189w = -1;

        /* renamed from: x */
        public int f190x = -1;

        /* renamed from: y */
        public int f191y = -1;

        /* renamed from: z */
        public float f192z = 0.5f;

        /* renamed from: android.support.constraint.ConstraintLayout$LayoutParams$a */
        private static class C0033a {

            /* renamed from: a */
            public static final SparseIntArray f193a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f193a = sparseIntArray;
                sparseIntArray.append(C0038c.f304I, 8);
                sparseIntArray.append(C0038c.f306J, 9);
                sparseIntArray.append(C0038c.f310L, 10);
                sparseIntArray.append(C0038c.f312M, 11);
                sparseIntArray.append(C0038c.f322R, 12);
                sparseIntArray.append(C0038c.f320Q, 13);
                sparseIntArray.append(C0038c.f388q, 14);
                sparseIntArray.append(C0038c.f385p, 15);
                sparseIntArray.append(C0038c.f379n, 16);
                sparseIntArray.append(C0038c.f391r, 2);
                sparseIntArray.append(C0038c.f397t, 3);
                sparseIntArray.append(C0038c.f394s, 4);
                sparseIntArray.append(C0038c.f338Z, 49);
                sparseIntArray.append(C0038c.f341a0, 50);
                sparseIntArray.append(C0038c.f409x, 5);
                sparseIntArray.append(C0038c.f412y, 6);
                sparseIntArray.append(C0038c.f415z, 7);
                sparseIntArray.append(C0038c.f343b, 1);
                sparseIntArray.append(C0038c.f314N, 17);
                sparseIntArray.append(C0038c.f316O, 18);
                sparseIntArray.append(C0038c.f406w, 19);
                sparseIntArray.append(C0038c.f403v, 20);
                sparseIntArray.append(C0038c.f350d0, 21);
                sparseIntArray.append(C0038c.f359g0, 22);
                sparseIntArray.append(C0038c.f353e0, 23);
                sparseIntArray.append(C0038c.f344b0, 24);
                sparseIntArray.append(C0038c.f356f0, 25);
                sparseIntArray.append(C0038c.f347c0, 26);
                sparseIntArray.append(C0038c.f296E, 29);
                sparseIntArray.append(C0038c.f324S, 30);
                sparseIntArray.append(C0038c.f400u, 44);
                sparseIntArray.append(C0038c.f300G, 45);
                sparseIntArray.append(C0038c.f328U, 46);
                sparseIntArray.append(C0038c.f298F, 47);
                sparseIntArray.append(C0038c.f326T, 48);
                sparseIntArray.append(C0038c.f373l, 27);
                sparseIntArray.append(C0038c.f370k, 28);
                sparseIntArray.append(C0038c.f330V, 31);
                sparseIntArray.append(C0038c.f286A, 32);
                sparseIntArray.append(C0038c.f334X, 33);
                sparseIntArray.append(C0038c.f332W, 34);
                sparseIntArray.append(C0038c.f336Y, 35);
                sparseIntArray.append(C0038c.f292C, 36);
                sparseIntArray.append(C0038c.f289B, 37);
                sparseIntArray.append(C0038c.f294D, 38);
                sparseIntArray.append(C0038c.f302H, 39);
                sparseIntArray.append(C0038c.f318P, 40);
                sparseIntArray.append(C0038c.f308K, 41);
                sparseIntArray.append(C0038c.f382o, 42);
                sparseIntArray.append(C0038c.f376m, 43);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0038c.f340a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0033a.f193a.get(index);
                switch (i3) {
                    case 1:
                        this.f146R = obtainStyledAttributes.getInt(index, this.f146R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f179m);
                        this.f179m = resourceId;
                        if (resourceId == -1) {
                            this.f179m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f180n = obtainStyledAttributes.getDimensionPixelSize(index, this.f180n);
                        continue;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f181o) % 360.0f;
                        this.f181o = f;
                        if (f < 0.0f) {
                            this.f181o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f155a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f155a);
                        continue;
                    case 6:
                        this.f157b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f157b);
                        continue;
                    case 7:
                        this.f159c = obtainStyledAttributes.getFloat(index, this.f159c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f161d);
                        this.f161d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f161d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f163e);
                        this.f163e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f163e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f165f);
                        this.f165f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f165f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f167g);
                        this.f167g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f167g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f169h);
                        this.f169h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f169h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f171i);
                        this.f171i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f171i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f173j);
                        this.f173j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f173j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f175k);
                        this.f175k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f175k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f177l);
                        this.f177l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f177l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f182p);
                        this.f182p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f182p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f183q);
                        this.f183q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f183q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f184r);
                        this.f184r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f184r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f185s);
                        this.f185s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f185s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f186t = obtainStyledAttributes.getDimensionPixelSize(index, this.f186t);
                        continue;
                    case 22:
                        this.f187u = obtainStyledAttributes.getDimensionPixelSize(index, this.f187u);
                        continue;
                    case 23:
                        this.f188v = obtainStyledAttributes.getDimensionPixelSize(index, this.f188v);
                        continue;
                    case 24:
                        this.f189w = obtainStyledAttributes.getDimensionPixelSize(index, this.f189w);
                        continue;
                    case 25:
                        this.f190x = obtainStyledAttributes.getDimensionPixelSize(index, this.f190x);
                        continue;
                    case 26:
                        this.f191y = obtainStyledAttributes.getDimensionPixelSize(index, this.f191y);
                        continue;
                    case 27:
                        this.f147S = obtainStyledAttributes.getBoolean(index, this.f147S);
                        continue;
                    case 28:
                        this.f148T = obtainStyledAttributes.getBoolean(index, this.f148T);
                        continue;
                    case 29:
                        this.f192z = obtainStyledAttributes.getFloat(index, this.f192z);
                        continue;
                    case 30:
                        this.f129A = obtainStyledAttributes.getFloat(index, this.f129A);
                        continue;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f136H = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f137I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.f138J = obtainStyledAttributes.getDimensionPixelSize(index, this.f138J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f138J) == -2) {
                                this.f138J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.f140L = obtainStyledAttributes.getDimensionPixelSize(index, this.f140L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f140L) == -2) {
                                this.f140L = -2;
                            }
                        }
                    case 35:
                        this.f142N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f142N));
                        continue;
                    case 36:
                        try {
                            this.f139K = obtainStyledAttributes.getDimensionPixelSize(index, this.f139K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f139K) == -2) {
                                this.f139K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.f141M = obtainStyledAttributes.getDimensionPixelSize(index, this.f141M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f141M) == -2) {
                                this.f141M = -2;
                            }
                        }
                    case 38:
                        this.f143O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f143O));
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f130B = string;
                                this.f131C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f130B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f130B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f131C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f131C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f130B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f130B.substring(i);
                                        if (substring2.length() > 0) {
                                            Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f130B.substring(i, indexOf2);
                                        String substring4 = this.f130B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f131C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f132D = obtainStyledAttributes.getFloat(index, this.f132D);
                                continue;
                            case 46:
                                this.f133E = obtainStyledAttributes.getFloat(index, this.f133E);
                                continue;
                            case 47:
                                this.f134F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f135G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f144P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f144P);
                                continue;
                            case 50:
                                this.f145Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f145Q);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            mo78a();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo78a() {
            this.f152X = false;
            this.f149U = true;
            this.f150V = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f147S) {
                this.f149U = false;
                this.f136H = 1;
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f148T) {
                this.f150V = false;
                this.f137I = 1;
            }
            if (i == 0 || i == -1) {
                this.f149U = false;
                if (i == 0 && this.f136H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f147S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f150V = false;
                if (i2 == 0 && this.f137I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f148T = true;
                }
            }
            if (this.f159c != -1.0f || this.f155a != -1 || this.f157b != -1) {
                this.f152X = true;
                this.f149U = true;
                this.f150V = true;
                if (!(this.f176k0 instanceof C0062g)) {
                    this.f176k0 = new C0062g();
                }
                ((C0062g) this.f176k0).mo292D0(this.f146R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
            // Method dump skipped, instructions count: 261
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m47g(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47g(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47g(attributeSet);
    }

    /* renamed from: d */
    private final C0058e m46d(int i) {
        if (i == 0) {
            return this.f112d;
        }
        View view = this.f109a.get(i);
        if (view == this) {
            return this.f112d;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f176k0;
    }

    /* renamed from: g */
    private void m47g(AttributeSet attributeSet) {
        this.f112d.mo214P(this);
        this.f109a.put(getId(), this);
        this.f119k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0038c.f340a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0038c.f352e) {
                    this.f113e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f113e);
                } else if (index == C0038c.f355f) {
                    this.f114f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f114f);
                } else if (index == C0038c.f346c) {
                    this.f115g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f115g);
                } else if (index == C0038c.f349d) {
                    this.f116h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f116h);
                } else if (index == C0038c.f362h0) {
                    this.f118j = obtainStyledAttributes.getInt(index, this.f118j);
                } else if (index == C0038c.f364i) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0034a aVar = new C0034a();
                        this.f119k = aVar;
                        aVar.mo102d(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f119k = null;
                    }
                    this.f120l = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f112d.mo285T0(this.f118j);
    }

    /* renamed from: h */
    private void m48h(int i, int i2) {
        boolean z;
        boolean z2;
        int baseline;
        int i3;
        int i4;
        boolean z3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C0058e eVar = layoutParams.f176k0;
                if (!layoutParams.f152X && !layoutParams.f153Y) {
                    eVar.mo249o0(childAt.getVisibility());
                    int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    boolean z4 = layoutParams.f149U;
                    if (z4 || (z3 = layoutParams.f150V) || (!z4 && layoutParams.f136H == 1) || i6 == -1 || (!z3 && (layoutParams.f137I == 1 || i7 == -1))) {
                        if (i6 == 0) {
                            i3 = ViewGroup.getChildMeasureSpec(i, paddingLeft, -2);
                            z2 = true;
                        } else if (i6 == -1) {
                            i3 = ViewGroup.getChildMeasureSpec(i, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i6 == -2;
                            i3 = ViewGroup.getChildMeasureSpec(i, paddingLeft, i6);
                        }
                        if (i7 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
                            z = true;
                        } else if (i7 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -1);
                            z = false;
                        } else {
                            z = i7 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingTop, i7);
                        }
                        childAt.measure(i3, i4);
                        C0045f fVar = this.f128t;
                        if (fVar != null) {
                            fVar.f455a++;
                        }
                        eVar.mo253q0(i6 == -2);
                        eVar.mo219U(i7 == -2);
                        i6 = childAt.getMeasuredWidth();
                        i7 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    eVar.mo251p0(i6);
                    eVar.mo218T(i7);
                    if (z2) {
                        eVar.mo257s0(i6);
                    }
                    if (z) {
                        eVar.mo255r0(i7);
                    }
                    if (layoutParams.f151W && (baseline = childAt.getBaseline()) != -1) {
                        eVar.mo213O(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02bf  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m49i(int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 731
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m49i(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03a9  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50j() {
        /*
        // Method dump skipped, instructions count: 987
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m50j():void");
    }

    /* renamed from: l */
    private void m51l(int i, int i2) {
        C0058e.EnumC0060b bVar;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0058e.EnumC0060b bVar2 = C0058e.EnumC0060b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = C0058e.EnumC0060b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                bVar = bVar2;
            } else {
                i3 = Math.min(this.f115g, size) - paddingLeft;
                bVar = bVar2;
            }
            i3 = 0;
        } else {
            i3 = size;
            bVar = C0058e.EnumC0060b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = C0058e.EnumC0060b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f116h, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            bVar2 = C0058e.EnumC0060b.WRAP_CONTENT;
        }
        this.f112d.mo229e0(0);
        this.f112d.mo228d0(0);
        this.f112d.mo223Y(bVar);
        this.f112d.mo251p0(i3);
        this.f112d.mo243l0(bVar2);
        this.f112d.mo218T(size2);
        this.f112d.mo229e0((this.f113e - getPaddingLeft()) - getPaddingRight());
        this.f112d.mo228d0((this.f114f - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: n */
    private void m52n() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f111c.clear();
            m50j();
        }
    }

    /* renamed from: o */
    private void m53o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).mo93b(this);
            }
        }
        int size = this.f110b.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f110b.get(i2).mo38d(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    public Object mo49c(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f121m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f121m.get(str);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = (float) i2;
                        float f2 = (float) i3;
                        float f3 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public View mo52e(int i) {
        return this.f109a.get(i);
    }

    /* renamed from: f */
    public final C0058e mo53f(View view) {
        if (view == this) {
            return this.f112d;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f176k0;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.f116h;
    }

    public int getMaxWidth() {
        return this.f115g;
    }

    public int getMinHeight() {
        return this.f114f;
    }

    public int getMinWidth() {
        return this.f113e;
    }

    public int getOptimizationLevel() {
        return this.f112d.mo275I0();
    }

    /* renamed from: k */
    public void mo62k(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f121m == null) {
                this.f121m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f121m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo63m(String str) {
        this.f112d.mo272B0();
        C0045f fVar = this.f128t;
        if (fVar != null) {
            fVar.f457c++;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C0058e eVar = layoutParams.f176k0;
            if ((childAt.getVisibility() != 8 || layoutParams.f152X || layoutParams.f153Y || isInEditMode) && !layoutParams.f154Z) {
                int n = eVar.mo246n();
                int o = eVar.mo248o();
                int A = eVar.mo201A() + n;
                int p = eVar.mo250p() + o;
                childAt.layout(n, o, A, p);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(n, o, A, p);
                }
            }
        }
        int size = this.f110b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f110b.get(i6).mo37c(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0243  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 857
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0058e f = mo53f(view);
        if ((view instanceof Guideline) && !(f instanceof C0062g)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C0062g gVar = new C0062g();
            layoutParams.f176k0 = gVar;
            layoutParams.f152X = true;
            gVar.mo292D0(layoutParams.f146R);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo40f();
            ((LayoutParams) view.getLayoutParams()).f153Y = true;
            if (!this.f110b.contains(constraintHelper)) {
                this.f110b.add(constraintHelper);
            }
        }
        this.f109a.put(view.getId(), view);
        this.f117i = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f109a.remove(view.getId());
        C0058e f = mo53f(view);
        this.f112d.mo321C0(f);
        this.f110b.remove(view);
        this.f111c.remove(f);
        this.f117i = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f117i = true;
        this.f122n = -1;
        this.f123o = -1;
        this.f124p = -1;
        this.f125q = -1;
        this.f126r = 0;
        this.f127s = 0;
    }

    public void setConstraintSet(C0034a aVar) {
        this.f119k = aVar;
    }

    public void setId(int i) {
        this.f109a.remove(getId());
        super.setId(i);
        this.f109a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f116h) {
            this.f116h = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f115g) {
            this.f115g = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f114f) {
            this.f114f = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f113e) {
            this.f113e = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f112d.mo285T0(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
