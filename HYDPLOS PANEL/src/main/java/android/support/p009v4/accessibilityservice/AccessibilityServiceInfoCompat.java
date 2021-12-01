package android.support.p009v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;

/* renamed from: android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat */
public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    @Deprecated
    public static final int DEFAULT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
    private static final AccessibilityServiceInfoBaseImpl IMPL;

    /* renamed from: android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi16Impl */
    static class AccessibilityServiceInfoApi16Impl extends AccessibilityServiceInfoBaseImpl {
        AccessibilityServiceInfoApi16Impl() {
        }

        @Override // android.support.p009v4.accessibilityservice.AccessibilityServiceInfoCompat.AccessibilityServiceInfoBaseImpl
        public String loadDescription(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
            return accessibilityServiceInfo.loadDescription(packageManager);
        }
    }

    /* renamed from: android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi18Impl */
    static class AccessibilityServiceInfoApi18Impl extends AccessibilityServiceInfoApi16Impl {
        AccessibilityServiceInfoApi18Impl() {
        }

        @Override // android.support.p009v4.accessibilityservice.AccessibilityServiceInfoCompat.AccessibilityServiceInfoBaseImpl
        public int getCapabilities(AccessibilityServiceInfo accessibilityServiceInfo) {
            return accessibilityServiceInfo.getCapabilities();
        }
    }

    /* renamed from: android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl */
    static class AccessibilityServiceInfoBaseImpl {
        AccessibilityServiceInfoBaseImpl() {
        }

        public int getCapabilities(AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompat.getCanRetrieveWindowContent(accessibilityServiceInfo) ? 1 : 0;
        }

        public String loadDescription(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
            return null;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 18 ? new AccessibilityServiceInfoApi18Impl() : i >= 16 ? new AccessibilityServiceInfoApi16Impl() : new AccessibilityServiceInfoBaseImpl();
    }

    private AccessibilityServiceInfoCompat() {
    }

    public static String capabilityToString(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    public static String feedbackTypeToString(int i) {
        StringBuilder sb = new StringBuilder();
        String str = "[";
        while (true) {
            sb.append(str);
            while (i > 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
                i &= numberOfTrailingZeros ^ -1;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                if (numberOfTrailingZeros == 1) {
                    str = "FEEDBACK_SPOKEN";
                } else if (numberOfTrailingZeros == 2) {
                    str = "FEEDBACK_HAPTIC";
                } else if (numberOfTrailingZeros == 4) {
                    str = "FEEDBACK_AUDIBLE";
                } else if (numberOfTrailingZeros == 8) {
                    str = "FEEDBACK_VISUAL";
                } else if (numberOfTrailingZeros == 16) {
                    str = "FEEDBACK_GENERIC";
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static String flagToString(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    @Deprecated
    public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCanRetrieveWindowContent();
    }

    public static int getCapabilities(AccessibilityServiceInfo accessibilityServiceInfo) {
        return IMPL.getCapabilities(accessibilityServiceInfo);
    }

    @Deprecated
    public static String getDescription(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getDescription();
    }

    @Deprecated
    public static String getId(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getId();
    }

    @Deprecated
    public static ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getResolveInfo();
    }

    @Deprecated
    public static String getSettingsActivityName(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getSettingsActivityName();
    }

    public static String loadDescription(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
        return IMPL.loadDescription(accessibilityServiceInfo, packageManager);
    }
}
