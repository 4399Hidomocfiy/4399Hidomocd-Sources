package android.support.p012v7.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.TooltipCompat */
public class TooltipCompat {
    private static final ViewCompatImpl IMPL = (Build.VERSION.SDK_INT >= 26 ? new Api26ViewCompatImpl() : new BaseViewCompatImpl());

    @TargetApi(26)
    /* renamed from: android.support.v7.widget.TooltipCompat$Api26ViewCompatImpl */
    private static class Api26ViewCompatImpl implements ViewCompatImpl {
        private Api26ViewCompatImpl() {
        }

        @Override // android.support.p012v7.widget.TooltipCompat.ViewCompatImpl
        public void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: android.support.v7.widget.TooltipCompat$BaseViewCompatImpl */
    private static class BaseViewCompatImpl implements ViewCompatImpl {
        private BaseViewCompatImpl() {
        }

        @Override // android.support.p012v7.widget.TooltipCompat.ViewCompatImpl
        public void setTooltipText(View view, CharSequence charSequence) {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }

    /* renamed from: android.support.v7.widget.TooltipCompat$ViewCompatImpl */
    private interface ViewCompatImpl {
        void setTooltipText(View view, CharSequence charSequence);
    }

    private TooltipCompat() {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        IMPL.setTooltipText(view, charSequence);
    }
}
