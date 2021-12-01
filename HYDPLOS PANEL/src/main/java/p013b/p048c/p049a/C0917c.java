package p013b.p048c.p049a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0849k;

/* renamed from: b.c.a.c */
public class C0917c extends View {

    /* renamed from: a */
    private Context f1976a = null;

    public C0917c(Context context) {
        super(context);
        this.f1976a = context;
    }

    /* renamed from: a */
    private Drawable m2471a(Object obj) {
        if (obj instanceof Integer) {
            return new ColorDrawable(Integer.parseInt(String.valueOf(obj)));
        }
        if (obj instanceof Bitmap) {
            return new BitmapDrawable((Bitmap) obj);
        }
        if (obj instanceof GradientDrawable) {
            return (GradientDrawable) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("#")) {
            return new ColorDrawable(Color.parseColor(obj.toString()));
        }
        if (obj2.startsWith("@")) {
            Context context = this.f1976a;
            return new BitmapDrawable(C0849k.m1962b(context, C0835f.m1857n(context, obj2)));
        } else if (obj2.startsWith("%") || obj2.startsWith("$")) {
            return new BitmapDrawable(C0849k.m1963c(C0835f.m1857n(this.f1976a, obj2)));
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public StateListDrawable mo9107b(int i, int i2, int i3) {
        return mo9108c(new ColorDrawable(i), new ColorDrawable(i2), new ColorDrawable(i3));
    }

    /* renamed from: c */
    public StateListDrawable mo9108c(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawable);
        stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawable2);
        stateListDrawable.addState(View.ENABLED_STATE_SET, drawable3);
        stateListDrawable.addState(View.FOCUSED_STATE_SET, drawable2);
        stateListDrawable.addState(View.EMPTY_STATE_SET, drawable3);
        return stateListDrawable;
    }

    /* renamed from: d */
    public StateListDrawable mo9109d(Object obj, Object obj2, Object obj3) {
        Drawable a;
        Drawable a2;
        Drawable a3 = m2471a(obj);
        if (a3 == null || (a = m2471a(obj2)) == null || (a2 = m2471a(obj3)) == null) {
            return null;
        }
        return mo9108c(a3, a, a2);
    }
}
