package android.support.p009v4.media;

import android.media.VolumeProvider;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.VolumeProviderCompatApi21 */
public class VolumeProviderCompatApi21 {

    /* renamed from: android.support.v4.media.VolumeProviderCompatApi21$Delegate */
    public interface Delegate {
        void onAdjustVolume(int i);

        void onSetVolumeTo(int i);
    }

    VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i, int i2, int i3, final Delegate delegate) {
        return new VolumeProvider(i, i2, i3) {
            /* class android.support.p009v4.media.VolumeProviderCompatApi21.C03561 */

            public void onAdjustVolume(int i) {
                delegate.onAdjustVolume(i);
            }

            public void onSetVolumeTo(int i) {
                delegate.onSetVolumeTo(i);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
