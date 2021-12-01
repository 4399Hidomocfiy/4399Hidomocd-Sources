package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.AbstractC0022a;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.f */
public class FragmentC0031f extends Fragment {

    /* renamed from: a */
    private AbstractC0032a f99a;

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.f$a */
    public interface AbstractC0032a {
        /* renamed from: a */
        void mo31a();

        /* renamed from: b */
        void mo32b();

        void onCreate();
    }

    /* renamed from: a */
    private void m32a(AbstractC0022a.EnumC0023a aVar) {
        Activity activity = getActivity();
        if (activity instanceof AbstractC0029d) {
            ((AbstractC0029d) activity).getLifecycle().mo21e(aVar);
        } else if (activity instanceof AbstractC0025b) {
            AbstractC0022a lifecycle = ((AbstractC0025b) activity).getLifecycle();
            if (lifecycle instanceof C0026c) {
                ((C0026c) lifecycle).mo21e(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m33b(AbstractC0032a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: c */
    private void m34c(AbstractC0032a aVar) {
        if (aVar != null) {
            aVar.mo31a();
        }
    }

    /* renamed from: d */
    private void m35d(AbstractC0032a aVar) {
        if (aVar != null) {
            aVar.mo32b();
        }
    }

    /* renamed from: e */
    public static void m36e(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0031f(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m33b(this.f99a);
        m32a(AbstractC0022a.EnumC0023a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m32a(AbstractC0022a.EnumC0023a.ON_DESTROY);
        this.f99a = null;
    }

    public void onPause() {
        super.onPause();
        m32a(AbstractC0022a.EnumC0023a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m34c(this.f99a);
        m32a(AbstractC0022a.EnumC0023a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m35d(this.f99a);
        m32a(AbstractC0022a.EnumC0023a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m32a(AbstractC0022a.EnumC0023a.ON_STOP);
    }
}
