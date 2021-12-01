package p013b.p044b.p045a.p046a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import java.util.Hashtable;
import p013b.p014a.p015a.C0710k;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0721u;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0706g;
import p013b.p014a.p015a.p035x.C0776b;
import p062cn.hugo.android.scanner.CaptureActivity;
import p062cn.hugo.android.scanner.p064g.C1050a;
import p062cn.hugo.android.scanner.p065h.C1052a;

/* renamed from: b.b.a.a.o */
public class C0853o {

    /* renamed from: a */
    private Activity f1772a = null;

    /* renamed from: b */
    private Context f1773b = null;

    public C0853o(Context context, Activity activity) {
        this.f1773b = context;
        this.f1772a = activity;
    }

    /* renamed from: a */
    public void mo8948a() {
        this.f1772a.startActivityForResult(new Intent(this.f1773b, CaptureActivity.class), 1102);
    }

    /* renamed from: b */
    public void mo8949b(int i) {
        this.f1772a.startActivityForResult(new Intent(this.f1773b, CaptureActivity.class), i);
    }

    /* renamed from: c */
    public Bitmap mo8950c(String str, int i) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(EnumC0706g.CHARACTER_SET, "utf-8");
        try {
            C0776b a = new C0710k().mo8483a(str, EnumC0577a.QR_CODE, i, i, hashtable);
            int j = a.mo8799j();
            int g = a.mo8795g();
            int[] iArr = new int[(j * g)];
            for (int i2 = 0; i2 < g; i2++) {
                for (int i3 = 0; i3 < j; i3++) {
                    if (a.mo8791d(i3, i2)) {
                        iArr[(i2 * j) + i3] = -16777216;
                    } else {
                        iArr[(i2 * j) + i3] = -1;
                    }
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(j, g, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, j, 0, 0, j, g);
            return createBitmap;
        } catch (C0721u e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public C0716p mo8951d(Bitmap bitmap) {
        return new C1052a(this.f1773b).mo10102a(bitmap);
    }

    /* renamed from: e */
    public C0716p mo8952e(String str) {
        return new C1052a(this.f1773b).mo10102a(C1050a.m2956b(str));
    }
}
