package android.support.p009v4.app;

import android.app.Activity;
import android.arch.lifecycle.AbstractC0022a;
import android.arch.lifecycle.AbstractC0025b;
import android.arch.lifecycle.C0026c;
import android.arch.lifecycle.FragmentC0031f;
import android.os.Bundle;
import android.support.p009v4.util.SimpleArrayMap;

/* renamed from: android.support.v4.app.SupportActivity */
public class SupportActivity extends Activity implements AbstractC0025b {
    private SimpleArrayMap<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new SimpleArrayMap<>();
    private C0026c mLifecycleRegistry = new C0026c(this);

    /* renamed from: android.support.v4.app.SupportActivity$ExtraData */
    public static class ExtraData {
    }

    public <T extends ExtraData> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    @Override // android.arch.lifecycle.AbstractC0025b
    public AbstractC0022a getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0031f.m36e(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo22g(AbstractC0022a.EnumC0024b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: android.support.v4.util.SimpleArrayMap<java.lang.Class<? extends android.support.v4.app.SupportActivity$ExtraData>, android.support.v4.app.SupportActivity$ExtraData> */
    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }
}
