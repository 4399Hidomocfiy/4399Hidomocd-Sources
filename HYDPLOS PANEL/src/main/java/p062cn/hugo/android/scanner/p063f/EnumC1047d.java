package p062cn.hugo.android.scanner.p063f;

import android.content.SharedPreferences;

/* renamed from: cn.hugo.android.scanner.f.d */
public enum EnumC1047d {
    ON,
    AUTO,
    OFF;

    /* renamed from: a */
    private static EnumC1047d m2951a(String str) {
        return str == null ? OFF : valueOf(str);
    }

    /* renamed from: b */
    public static EnumC1047d m2952b(SharedPreferences sharedPreferences) {
        return m2951a(sharedPreferences.getString("preferences_front_light_mode", null));
    }
}
