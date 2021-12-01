package android.support.p009v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.accessibility.AccessibilityNodeProviderCompatKitKat */
class AccessibilityNodeProviderCompatKitKat {

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.accessibility.AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge */
    public interface AccessibilityNodeInfoBridge {
        Object createAccessibilityNodeInfo(int i);

        List<Object> findAccessibilityNodeInfosByText(String str, int i);

        Object findFocus(int i);

        boolean performAction(int i, int i2, Bundle bundle);
    }

    AccessibilityNodeProviderCompatKitKat() {
    }

    public static Object newAccessibilityNodeProviderBridge(final AccessibilityNodeInfoBridge accessibilityNodeInfoBridge) {
        return new AccessibilityNodeProvider() {
            /* class android.support.p009v4.view.accessibility.AccessibilityNodeProviderCompatKitKat.C04171 */

            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) accessibilityNodeInfoBridge.createAccessibilityNodeInfo(i);
            }

            /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.List<java.lang.Object>, java.util.List<android.view.accessibility.AccessibilityNodeInfo> */
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return accessibilityNodeInfoBridge.findAccessibilityNodeInfosByText(str, i);
            }

            public AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) accessibilityNodeInfoBridge.findFocus(i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return accessibilityNodeInfoBridge.performAction(i, i2, bundle);
            }
        };
    }
}
