package android.support.p009v4.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.accessibility.AccessibilityEventCompat */
public final class AccessibilityEventCompat {
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    private static final AccessibilityEventCompatBaseImpl IMPL;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_ENTER = 128;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_EXIT = 256;
    @Deprecated
    public static final int TYPE_VIEW_SCROLLED = 4096;
    @Deprecated
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;
    @Deprecated
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

    /* renamed from: android.support.v4.view.accessibility.AccessibilityEventCompat$AccessibilityEventCompatApi16Impl */
    static class AccessibilityEventCompatApi16Impl extends AccessibilityEventCompatBaseImpl {
        AccessibilityEventCompatApi16Impl() {
        }

        @Override // android.support.p009v4.view.accessibility.AccessibilityEventCompat.AccessibilityEventCompatBaseImpl
        public int getAction(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @Override // android.support.p009v4.view.accessibility.AccessibilityEventCompat.AccessibilityEventCompatBaseImpl
        public int getMovementGranularity(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @Override // android.support.p009v4.view.accessibility.AccessibilityEventCompat.AccessibilityEventCompatBaseImpl
        public void setAction(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setAction(i);
        }

        @Override // android.support.p009v4.view.accessibility.AccessibilityEventCompat.AccessibilityEventCompatBaseImpl
        public void setMovementGranularity(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    /* renamed from: android.support.v4.view.accessibility.AccessibilityEventCompat$AccessibilityEventCompatApi19Impl */
    static class AccessibilityEventCompatApi19Impl extends AccessibilityEventCompatApi16Impl {
        AccessibilityEventCompatApi19Impl() {
        }

        @Override // android.support.p009v4.view.accessibility.AccessibilityEventCompat.AccessibilityEventCompatBaseImpl
        public int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @Override // android.support.p009v4.view.accessibility.AccessibilityEventCompat.AccessibilityEventCompatBaseImpl
        public void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.accessibility.AccessibilityEventCompat$AccessibilityEventCompatBaseImpl */
    public static class AccessibilityEventCompatBaseImpl {
        AccessibilityEventCompatBaseImpl() {
        }

        public int getAction(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        public int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        public int getMovementGranularity(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        public void setAction(AccessibilityEvent accessibilityEvent, int i) {
        }

        public void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        }

        public void setMovementGranularity(AccessibilityEvent accessibilityEvent, int i) {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 19 ? new AccessibilityEventCompatApi19Impl() : i >= 16 ? new AccessibilityEventCompatApi16Impl() : new AccessibilityEventCompatBaseImpl();
    }

    private AccessibilityEventCompat() {
    }

    @Deprecated
    public static void appendRecord(AccessibilityEvent accessibilityEvent, AccessibilityRecordCompat accessibilityRecordCompat) {
        accessibilityEvent.appendRecord((AccessibilityRecord) accessibilityRecordCompat.getImpl());
    }

    @Deprecated
    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityEvent) {
        return new AccessibilityRecordCompat(accessibilityEvent);
    }

    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        return IMPL.getContentChangeTypes(accessibilityEvent);
    }

    @Deprecated
    public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityEvent, int i) {
        return new AccessibilityRecordCompat(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    public static int getRecordCount(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        IMPL.setContentChangeTypes(accessibilityEvent, i);
    }

    public int getAction(AccessibilityEvent accessibilityEvent) {
        return IMPL.getAction(accessibilityEvent);
    }

    public int getMovementGranularity(AccessibilityEvent accessibilityEvent) {
        return IMPL.getMovementGranularity(accessibilityEvent);
    }

    public void setAction(AccessibilityEvent accessibilityEvent, int i) {
        IMPL.setAction(accessibilityEvent, i);
    }

    public void setMovementGranularity(AccessibilityEvent accessibilityEvent, int i) {
        IMPL.setMovementGranularity(accessibilityEvent, i);
    }
}
