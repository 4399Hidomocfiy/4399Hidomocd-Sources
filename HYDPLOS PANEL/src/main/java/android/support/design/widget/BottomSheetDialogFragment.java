package android.support.design.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p012v7.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // android.support.p012v7.app.AppCompatDialogFragment, android.support.p009v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }
}
