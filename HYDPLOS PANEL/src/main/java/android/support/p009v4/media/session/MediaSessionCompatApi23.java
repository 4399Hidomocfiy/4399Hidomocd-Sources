package android.support.p009v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.p009v4.media.session.MediaSessionCompatApi21;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.session.MediaSessionCompatApi23 */
public class MediaSessionCompatApi23 {

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi23$Callback */
    public interface Callback extends MediaSessionCompatApi21.Callback {
        void onPlayFromUri(Uri uri, Bundle bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi23$CallbackProxy */
    public static class CallbackProxy<T extends Callback> extends MediaSessionCompatApi21.CallbackProxy<T> {
        public CallbackProxy(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            ((Callback) this.mCallback).onPlayFromUri(uri, bundle);
        }
    }

    MediaSessionCompatApi23() {
    }

    public static Object createCallback(Callback callback) {
        return new CallbackProxy(callback);
    }
}
