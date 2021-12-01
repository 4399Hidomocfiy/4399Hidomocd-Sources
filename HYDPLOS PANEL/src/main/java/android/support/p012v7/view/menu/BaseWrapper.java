package android.support.p012v7.view.menu;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.BaseWrapper */
public class BaseWrapper<T> {
    final T mWrappedObject;

    BaseWrapper(T t) {
        if (t != null) {
            this.mWrappedObject = t;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public T getWrappedObject() {
        return this.mWrappedObject;
    }
}
