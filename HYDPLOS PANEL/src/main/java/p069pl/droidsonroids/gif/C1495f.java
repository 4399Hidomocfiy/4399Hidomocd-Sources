package p069pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import bsh.org.objectweb.asm.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.f */
public final class C1495f {

    /* renamed from: a */
    static final List<String> f3680a = Arrays.asList("raw", "drawable", "mipmap");

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.f$a */
    public static class C1496a extends C1497b {

        /* renamed from: c */
        final int f3681c;

        /* renamed from: d */
        final int f3682d;

        C1496a() {
            this.f3681c = 0;
            this.f3682d = 0;
        }

        C1496a(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
            super(imageView, attributeSet, i, i2);
            this.f3681c = m4189a(imageView, attributeSet, true);
            this.f3682d = m4189a(imageView, attributeSet, false);
        }

        /* renamed from: a */
        private static int m4189a(ImageView imageView, AttributeSet attributeSet, boolean z) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (!C1495f.f3680a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) || C1495f.m4188e(imageView, z, attributeResourceValue)) {
                    return 0;
                }
                return attributeResourceValue;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.f$b */
    public static class C1497b {

        /* renamed from: a */
        boolean f3683a;

        /* renamed from: b */
        final int f3684b;

        C1497b() {
            this.f3683a = false;
            this.f3684b = -1;
        }

        C1497b(View view, AttributeSet attributeSet, int i, int i2) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C1505k.f3695d, i, i2);
            this.f3683a = obtainStyledAttributes.getBoolean(C1505k.f3696e, false);
            this.f3684b = obtainStyledAttributes.getInt(C1505k.f3697f, -1);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    static void m4184a(int i, Drawable drawable) {
        if (drawable instanceof C1488c) {
            ((C1488c) drawable).mo12594h(i);
        }
    }

    /* renamed from: b */
    static float m4185b(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = Constants.IF_ICMPNE;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        if (i2 <= 0 || i3 <= 0) {
            return 1.0f;
        }
        return ((float) i3) / ((float) i2);
    }

    /* renamed from: c */
    static C1496a m4186c(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new C1496a();
        }
        C1496a aVar = new C1496a(imageView, attributeSet, i, i2);
        int i3 = aVar.f3684b;
        if (i3 >= 0) {
            m4184a(i3, imageView.getDrawable());
            m4184a(i3, imageView.getBackground());
        }
        return aVar;
    }

    /* renamed from: d */
    static boolean m4187d(ImageView imageView, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            imageView.setImageDrawable(new C1488c(imageView.getContext().getContentResolver(), uri));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: e */
    static boolean m4188e(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources == null) {
            return false;
        }
        try {
            C1488c cVar = new C1488c(resources, i);
            if (z) {
                imageView.setImageDrawable(cVar);
                return true;
            } else if (Build.VERSION.SDK_INT >= 16) {
                imageView.setBackground(cVar);
                return true;
            } else {
                imageView.setBackgroundDrawable(cVar);
                return true;
            }
        } catch (Resources.NotFoundException | IOException unused) {
            return false;
        }
    }
}
