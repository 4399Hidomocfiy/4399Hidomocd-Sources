package android.support.p009v4.widget;

import android.os.Build;
import android.support.p009v4.view.GravityCompat;
import android.support.p009v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.PopupWindowCompat */
public final class PopupWindowCompat {
    static final PopupWindowCompatBaseImpl IMPL;

    /* renamed from: android.support.v4.widget.PopupWindowCompat$PopupWindowCompatApi19Impl */
    static class PopupWindowCompatApi19Impl extends PopupWindowCompatBaseImpl {
        PopupWindowCompatApi19Impl() {
        }

        @Override // android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatBaseImpl
        public void showAsDropDown(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.PopupWindowCompat$PopupWindowCompatApi21Impl */
    static class PopupWindowCompatApi21Impl extends PopupWindowCompatApi19Impl {
        private static final String TAG = "PopupWindowCompatApi21";
        private static Field sOverlapAnchorField;

        static {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                sOverlapAnchorField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        PopupWindowCompatApi21Impl() {
        }

        @Override // android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatBaseImpl
        public boolean getOverlapAnchor(PopupWindow popupWindow) {
            Field field = sOverlapAnchorField;
            if (field == null) {
                return false;
            }
            try {
                return ((Boolean) field.get(popupWindow)).booleanValue();
            } catch (IllegalAccessException e) {
                Log.i(TAG, "Could not get overlap anchor field in PopupWindow", e);
                return false;
            }
        }

        @Override // android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatBaseImpl
        public void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
            Field field = sOverlapAnchorField;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    Log.i(TAG, "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* renamed from: android.support.v4.widget.PopupWindowCompat$PopupWindowCompatApi23Impl */
    static class PopupWindowCompatApi23Impl extends PopupWindowCompatApi21Impl {
        PopupWindowCompatApi23Impl() {
        }

        @Override // android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatBaseImpl, android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatApi21Impl
        public boolean getOverlapAnchor(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @Override // android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatBaseImpl
        public int getWindowLayoutType(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @Override // android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatBaseImpl, android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatApi21Impl
        public void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @Override // android.support.p009v4.widget.PopupWindowCompat.PopupWindowCompatBaseImpl
        public void setWindowLayoutType(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: android.support.v4.widget.PopupWindowCompat$PopupWindowCompatBaseImpl */
    static class PopupWindowCompatBaseImpl {
        private static Method sGetWindowLayoutTypeMethod;
        private static boolean sGetWindowLayoutTypeMethodAttempted;
        private static Method sSetWindowLayoutTypeMethod;
        private static boolean sSetWindowLayoutTypeMethodAttempted;

        PopupWindowCompatBaseImpl() {
        }

        public boolean getOverlapAnchor(PopupWindow popupWindow) {
            return false;
        }

        public int getWindowLayoutType(PopupWindow popupWindow) {
            if (!sGetWindowLayoutTypeMethodAttempted) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                    sGetWindowLayoutTypeMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                }
                sGetWindowLayoutTypeMethodAttempted = true;
            }
            Method method = sGetWindowLayoutTypeMethod;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(popupWindow, new Object[0])).intValue();
                } catch (Exception unused2) {
                }
            }
            return 0;
        }

        public void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
        }

        public void setWindowLayoutType(PopupWindow popupWindow, int i) {
            if (!sSetWindowLayoutTypeMethodAttempted) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    sSetWindowLayoutTypeMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                }
                sSetWindowLayoutTypeMethodAttempted = true;
            }
            Method method = sSetWindowLayoutTypeMethod;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Integer.valueOf(i));
                } catch (Exception unused2) {
                }
            }
        }

        public void showAsDropDown(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((GravityCompat.getAbsoluteGravity(i3, ViewCompat.getLayoutDirection(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 23 ? new PopupWindowCompatApi23Impl() : i >= 21 ? new PopupWindowCompatApi21Impl() : i >= 19 ? new PopupWindowCompatApi19Impl() : new PopupWindowCompatBaseImpl();
    }

    private PopupWindowCompat() {
    }

    public static boolean getOverlapAnchor(PopupWindow popupWindow) {
        return IMPL.getOverlapAnchor(popupWindow);
    }

    public static int getWindowLayoutType(PopupWindow popupWindow) {
        return IMPL.getWindowLayoutType(popupWindow);
    }

    public static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
        IMPL.setOverlapAnchor(popupWindow, z);
    }

    public static void setWindowLayoutType(PopupWindow popupWindow, int i) {
        IMPL.setWindowLayoutType(popupWindow, i);
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        IMPL.showAsDropDown(popupWindow, view, i, i2, i3);
    }
}
