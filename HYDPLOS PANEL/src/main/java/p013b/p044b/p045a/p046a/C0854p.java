package p013b.p044b.p045a.p046a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: b.b.a.a.p */
public class C0854p {
    /* renamed from: a */
    public static boolean m1984a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            sQLiteDatabase.execSQL("INSERT INTO " + str + " (" + str2 + ") VALUES (" + str3 + ")");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m1985b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE " + str + " (" + str2 + ")");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m1986c(Context context, String str, boolean z) {
        if (z) {
            return context.deleteDatabase(str);
        }
        boolean delete = new File(str).delete();
        new File(str + "-journal").delete();
        return delete;
    }

    /* renamed from: d */
    public static boolean m1987d(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3;
        if (str2 != null) {
            try {
                str3 = "DELETE FROM " + str + " WHERE " + str2;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            str3 = "DELETE FROM " + str;
        }
        sQLiteDatabase.execSQL(str3);
        return true;
    }

    /* renamed from: e */
    public static boolean m1988e(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE " + str);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m1989f(Context context, String str, boolean z) {
        if (z) {
            str = "/data/data/" + context.getPackageName() + "/databases/" + str;
        }
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(str, null, 1);
            if (openDatabase != null) {
                openDatabase.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public static SQLiteDatabase m1990g(Context context, String str, boolean z) {
        if (z) {
            try {
                return context.openOrCreateDatabase(str, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            C0835f.m1845b(str, false);
            return SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null);
        }
    }

    /* renamed from: h */
    public static Cursor m1991h(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (str3 != null) {
            try {
                return sQLiteDatabase.rawQuery("SELECT " + str + " from " + str2 + " WHERE " + str3, null);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return sQLiteDatabase.rawQuery("SELECT " + str + " from " + str2, null);
        }
    }

    /* renamed from: i */
    public static boolean m1992i(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT count(name) as c FROM sqlite_master where type='table' and name='" + str + "'", null);
            return rawQuery.moveToNext() && rawQuery.getInt(0) > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public static boolean m1993j(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        String str4;
        if (str3 != null) {
            try {
                str4 = "UPDATE " + str + " SET " + str2 + "  WHERE " + str3;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            str4 = "UPDATE " + str + " SET " + str2;
        }
        sQLiteDatabase.execSQL(str4);
        return true;
    }
}
