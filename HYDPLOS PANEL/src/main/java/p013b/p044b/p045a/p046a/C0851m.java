package p013b.p044b.p045a.p046a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.p009v4.app.ActivityCompat;
import android.support.p009v4.content.ContextCompat;
import android.support.p009v4.content.FileProvider;
import java.io.File;
import java.util.ArrayList;

/* renamed from: b.b.a.a.m */
public class C0851m {
    /* renamed from: a */
    public static void m1975a(Context context, Intent intent, File file, String str) {
        Uri uri;
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setFlags(1);
            uri = FileProvider.getUriForFile(context, String.format("%s.myFileProvider", context.getPackageName()), file);
        } else {
            intent.addFlags(268435456);
            uri = Uri.fromFile(file);
        }
        intent.setDataAndType(uri, str);
    }

    /* renamed from: b */
    public static Uri m1976b(Context context, File file) {
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, String.format("%s.myFileProvider", context.getPackageName()), file);
    }

    /* renamed from: c */
    public static Uri m1977c(Context context, String str) {
        String lowerCase = str.toLowerCase();
        if ((lowerCase.startsWith("file://") || lowerCase.startsWith("/")) && Build.VERSION.SDK_INT >= 24) {
            try {
                return FileProvider.getUriForFile(context, String.format("%s.myFileProvider", context.getPackageName()), new File(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Uri.parse(str);
    }

    /* renamed from: d */
    public static boolean m1978d(Activity activity, String[] strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(activity, str) != 0 || ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        ActivityCompat.requestPermissions(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 60542);
        return true;
    }
}
