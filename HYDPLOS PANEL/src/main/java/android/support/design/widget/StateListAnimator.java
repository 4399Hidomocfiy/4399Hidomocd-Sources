package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class StateListAnimator {
    private final Animator.AnimatorListener mAnimationListener = new AnimatorListenerAdapter() {
        /* class android.support.design.widget.StateListAnimator.C01201 */

        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.mRunningAnimator == animator) {
                stateListAnimator.mRunningAnimator = null;
            }
        }
    };
    private Tuple mLastMatch = null;
    ValueAnimator mRunningAnimator = null;
    private final ArrayList<Tuple> mTuples = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public static class Tuple {
        final ValueAnimator mAnimator;
        final int[] mSpecs;

        Tuple(int[] iArr, ValueAnimator valueAnimator) {
            this.mSpecs = iArr;
            this.mAnimator = valueAnimator;
        }
    }

    StateListAnimator() {
    }

    private void cancel() {
        ValueAnimator valueAnimator = this.mRunningAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mRunningAnimator = null;
        }
    }

    private void start(Tuple tuple) {
        ValueAnimator valueAnimator = tuple.mAnimator;
        this.mRunningAnimator = valueAnimator;
        valueAnimator.start();
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        Tuple tuple = new Tuple(iArr, valueAnimator);
        valueAnimator.addListener(this.mAnimationListener);
        this.mTuples.add(tuple);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.mRunningAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.mRunningAnimator = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setState(int[] iArr) {
        Tuple tuple;
        int size = this.mTuples.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tuple = null;
                break;
            }
            tuple = this.mTuples.get(i);
            if (StateSet.stateSetMatches(tuple.mSpecs, iArr)) {
                break;
            }
            i++;
        }
        Tuple tuple2 = this.mLastMatch;
        if (tuple != tuple2) {
            if (tuple2 != null) {
                cancel();
            }
            this.mLastMatch = tuple;
            if (tuple != null) {
                start(tuple);
            }
        }
    }
}
