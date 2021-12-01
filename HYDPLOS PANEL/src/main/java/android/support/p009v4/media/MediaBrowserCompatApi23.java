package android.support.p009v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;

/* renamed from: android.support.v4.media.MediaBrowserCompatApi23 */
class MediaBrowserCompatApi23 {

    /* renamed from: android.support.v4.media.MediaBrowserCompatApi23$ItemCallback */
    interface ItemCallback {
        void onError(String str);

        void onItemLoaded(Parcel parcel);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompatApi23$ItemCallbackProxy */
    static class ItemCallbackProxy<T extends ItemCallback> extends MediaBrowser.ItemCallback {
        protected final T mItemCallback;

        public ItemCallbackProxy(T t) {
            this.mItemCallback = t;
        }

        public void onError(String str) {
            this.mItemCallback.onError(str);
        }

        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            T t;
            Parcel parcel;
            if (mediaItem == null) {
                t = this.mItemCallback;
                parcel = null;
            } else {
                parcel = Parcel.obtain();
                mediaItem.writeToParcel(parcel, 0);
                t = this.mItemCallback;
            }
            t.onItemLoaded(parcel);
        }
    }

    MediaBrowserCompatApi23() {
    }

    public static Object createItemCallback(ItemCallback itemCallback) {
        return new ItemCallbackProxy(itemCallback);
    }

    public static void getItem(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}