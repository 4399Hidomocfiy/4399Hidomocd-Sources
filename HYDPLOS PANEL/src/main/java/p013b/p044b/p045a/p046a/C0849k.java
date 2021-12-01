package p013b.p044b.p045a.p046a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.b.a.a.k */
public class C0849k {
    /* renamed from: a */
    public static Bitmap m1961a(ImageView imageView) {
        return ((BitmapDrawable) imageView.getDrawable()).getBitmap();
    }

    /* renamed from: b */
    public static Bitmap m1962b(Context context, String str) {
        Bitmap bitmap = null;
        try {
            InputStream open = context.getAssets().open(str);
            try {
                bitmap = BitmapFactory.decodeStream(open);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return bitmap;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static Bitmap m1963c(String str) {
        if (str == null || !new File(str).exists()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inJustDecodeBounds = false;
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Bitmap m1964d(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: e */
    public static Bitmap m1965e(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: f */
    public static Bitmap m1966f(Bitmap bitmap, int i) {
        float[] fArr = i != 0 ? i != 1 ? null : new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f} : new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        if (fArr == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: g */
    public static Bitmap m1967g(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: h */
    public static void m1968h(Bitmap bitmap, int i, String str) {
        C0835f.m1845b(str, false);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        bitmap.compress(str.toLowerCase().endsWith(".png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, fileOutputStream);
        try {
            fileOutputStream.flush();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }
}
