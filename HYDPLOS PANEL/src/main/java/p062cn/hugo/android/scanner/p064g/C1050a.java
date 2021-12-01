package p062cn.hugo.android.scanner.p064g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: cn.hugo.android.scanner.g.a */
public class C1050a {
    /* renamed from: a */
    public static int m2955a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(((float) i3) / ((float) i2));
        int round2 = Math.round(((float) i4) / ((float) i));
        return round < round2 ? round : round2;
    }

    /* renamed from: b */
    public static Bitmap m2956b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m2955a(options, 480, 800);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }
}
