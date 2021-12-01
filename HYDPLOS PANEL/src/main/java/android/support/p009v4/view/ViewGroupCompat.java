package android.support.p009v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.ViewGroupCompat */
public final class ViewGroupCompat {
    static final ViewGroupCompatBaseImpl IMPL;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    /* renamed from: android.support.v4.view.ViewGroupCompat$ViewGroupCompatApi18Impl */
    static class ViewGroupCompatApi18Impl extends ViewGroupCompatBaseImpl {
        ViewGroupCompatApi18Impl() {
        }

        @Override // android.support.p009v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public int getLayoutMode(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @Override // android.support.p009v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public void setLayoutMode(ViewGroup viewGroup, int i) {
            viewGroup.setLayoutMode(i);
        }
    }

    /* renamed from: android.support.v4.view.ViewGroupCompat$ViewGroupCompatApi21Impl */
    static class ViewGroupCompatApi21Impl extends ViewGroupCompatApi18Impl {
        ViewGroupCompatApi21Impl() {
        }

        @Override // android.support.p009v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public int getNestedScrollAxes(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @Override // android.support.p009v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public boolean isTransitionGroup(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @Override // android.support.p009v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public void setTransitionGroup(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: android.support.v4.view.ViewGroupCompat$ViewGroupCompatBaseImpl */
    static class ViewGroupCompatBaseImpl {
        ViewGroupCompatBaseImpl() {
        }

        public int getLayoutMode(ViewGroup viewGroup) {
            return 0;
        }

        public int getNestedScrollAxes(ViewGroup viewGroup) {
            if (viewGroup instanceof NestedScrollingParent) {
                return ((NestedScrollingParent) viewGroup).getNestedScrollAxes();
            }
            return 0;
        }

        public boolean isTransitionGroup(ViewGroup viewGroup) {
            return false;
        }

        public void setLayoutMode(ViewGroup viewGroup, int i) {
        }

        public void setTransitionGroup(ViewGroup viewGroup, boolean z) {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 21 ? new ViewGroupCompatApi21Impl() : i >= 18 ? new ViewGroupCompatApi18Impl() : new ViewGroupCompatBaseImpl();
    }

    private ViewGroupCompat() {
    }

    public static int getLayoutMode(ViewGroup viewGroup) {
        return IMPL.getLayoutMode(viewGroup);
    }

    public static int getNestedScrollAxes(ViewGroup viewGroup) {
        return IMPL.getNestedScrollAxes(viewGroup);
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return IMPL.isTransitionGroup(viewGroup);
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void setLayoutMode(ViewGroup viewGroup, int i) {
        IMPL.setLayoutMode(viewGroup, i);
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static void setTransitionGroup(ViewGroup viewGroup, boolean z) {
        IMPL.setTransitionGroup(viewGroup, z);
    }
}
