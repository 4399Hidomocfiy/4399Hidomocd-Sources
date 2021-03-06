package android.support.p012v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p009v4.app.DialogFragment;

/* renamed from: android.support.v7.app.AppCompatDialogFragment */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // android.support.p009v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new AppCompatDialog(getContext(), getTheme());
    }

    @Override // android.support.p009v4.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof AppCompatDialog) {
            AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            appCompatDialog.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
