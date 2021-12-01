package android.support.p012v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.ActionBarBackgroundDrawableV21 */
public class ActionBarBackgroundDrawableV21 extends ActionBarBackgroundDrawable {
    public ActionBarBackgroundDrawableV21(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.mContainer;
        if (actionBarContainer.mIsSplit) {
            drawable = actionBarContainer.mSplitBackground;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.mBackground;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }
}
