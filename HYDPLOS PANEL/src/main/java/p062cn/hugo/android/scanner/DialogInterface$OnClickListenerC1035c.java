package p062cn.hugo.android.scanner;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: cn.hugo.android.scanner.c */
public final class DialogInterface$OnClickListenerC1035c implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final Activity f2270a;

    public DialogInterface$OnClickListenerC1035c(Activity activity) {
        this.f2270a = activity;
    }

    /* renamed from: a */
    private void m2913a() {
        this.f2270a.finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        m2913a();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        m2913a();
    }
}
