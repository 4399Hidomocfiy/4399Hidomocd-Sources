package p062cn.hugo.android.scanner.p065h;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Hashtable;
import java.util.Vector;
import p013b.p014a.p015a.C0663c;
import p013b.p014a.p015a.C0709j;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0784j;

/* renamed from: cn.hugo.android.scanner.h.a */
public class C1052a {

    /* renamed from: a */
    C0709j f2314a = new C0709j();

    public C1052a(Context context) {
        Hashtable hashtable = new Hashtable(2);
        Vector vector = new Vector();
        if (vector.isEmpty()) {
            vector = new Vector();
            vector.addAll(C1056d.f2326b);
            vector.addAll(C1056d.f2327c);
            vector.addAll(C1056d.f2328d);
        }
        hashtable.put(EnumC0704e.POSSIBLE_FORMATS, vector);
        hashtable.put(EnumC0704e.CHARACTER_SET, "utf-8");
        this.f2314a.mo8686e(hashtable);
    }

    /* renamed from: a */
    public C0716p mo10102a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            return this.f2314a.mo8685d(new C0663c(new C0784j(new C1053b(bitmap))));
        } catch (C0712l e) {
            e.printStackTrace();
            return null;
        }
    }
}
