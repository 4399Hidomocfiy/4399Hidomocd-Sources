package android.support.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m423v();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m423v();
    }

    /* renamed from: v */
    private void m423v() {
        mo1498r(1);
        mo1490j(new Fade(2));
        mo1490j(new ChangeBounds());
        mo1490j(new Fade(1));
    }
}
