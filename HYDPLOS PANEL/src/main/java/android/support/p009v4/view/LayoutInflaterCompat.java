package android.support.p009v4.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.LayoutInflaterCompat */
public final class LayoutInflaterCompat {
    static final LayoutInflaterCompatBaseImpl IMPL = (Build.VERSION.SDK_INT >= 21 ? new LayoutInflaterCompatApi21Impl() : new LayoutInflaterCompatBaseImpl());
    private static final String TAG = "LayoutInflaterCompatHC";
    private static boolean sCheckedField;
    private static Field sLayoutInflaterFactory2Field;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.LayoutInflaterCompat$Factory2Wrapper */
    public static class Factory2Wrapper implements LayoutInflater.Factory2 {
        final LayoutInflaterFactory mDelegateFactory;

        Factory2Wrapper(LayoutInflaterFactory layoutInflaterFactory) {
            this.mDelegateFactory = layoutInflaterFactory;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mDelegateFactory.onCreateView(view, str, context, attributeSet);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.mDelegateFactory.onCreateView(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.mDelegateFactory + "}";
        }
    }

    /* renamed from: android.support.v4.view.LayoutInflaterCompat$LayoutInflaterCompatApi21Impl */
    static class LayoutInflaterCompatApi21Impl extends LayoutInflaterCompatBaseImpl {
        LayoutInflaterCompatApi21Impl() {
        }

        @Override // android.support.p009v4.view.LayoutInflaterCompat.LayoutInflaterCompatBaseImpl
        public void setFactory(LayoutInflater layoutInflater, LayoutInflaterFactory layoutInflaterFactory) {
            layoutInflater.setFactory2(layoutInflaterFactory != null ? new Factory2Wrapper(layoutInflaterFactory) : null);
        }

        @Override // android.support.p009v4.view.LayoutInflaterCompat.LayoutInflaterCompatBaseImpl
        public void setFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.LayoutInflaterCompat$LayoutInflaterCompatBaseImpl */
    public static class LayoutInflaterCompatBaseImpl {
        LayoutInflaterCompatBaseImpl() {
        }

        public LayoutInflaterFactory getFactory(LayoutInflater layoutInflater) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2Wrapper) {
                return ((Factory2Wrapper) factory).mDelegateFactory;
            }
            return null;
        }

        public void setFactory(LayoutInflater layoutInflater, LayoutInflaterFactory layoutInflaterFactory) {
            setFactory2(layoutInflater, layoutInflaterFactory != null ? new Factory2Wrapper(layoutInflaterFactory) : null);
        }

        public void setFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                LayoutInflaterCompat.forceSetFactory2(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                LayoutInflaterCompat.forceSetFactory2(layoutInflater, factory2);
            }
        }
    }

    private LayoutInflaterCompat() {
    }

    static void forceSetFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!sCheckedField) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                sLayoutInflaterFactory2Field = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(TAG, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            sCheckedField = true;
        }
        Field field = sLayoutInflaterFactory2Field;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(TAG, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    @Deprecated
    public static LayoutInflaterFactory getFactory(LayoutInflater layoutInflater) {
        return IMPL.getFactory(layoutInflater);
    }

    @Deprecated
    public static void setFactory(LayoutInflater layoutInflater, LayoutInflaterFactory layoutInflaterFactory) {
        IMPL.setFactory(layoutInflater, layoutInflaterFactory);
    }

    public static void setFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        IMPL.setFactory2(layoutInflater, factory2);
    }
}
