package android.support.p012v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p009v4.app.BundleCompat;
import android.support.p009v4.app.NotificationCompat;
import android.support.p009v4.media.app.NotificationCompat;
import android.support.p009v4.media.session.MediaSessionCompat;

@Deprecated
/* renamed from: android.support.v7.app.NotificationCompat */
public class NotificationCompat extends android.support.p009v4.app.NotificationCompat {

    @Deprecated
    /* renamed from: android.support.v7.app.NotificationCompat$Builder */
    public static class Builder extends NotificationCompat.Builder {
        @Deprecated
        public Builder(Context context) {
            super(context);
        }
    }

    @Deprecated
    /* renamed from: android.support.v7.app.NotificationCompat$DecoratedCustomViewStyle */
    public static class DecoratedCustomViewStyle extends NotificationCompat.DecoratedCustomViewStyle {
    }

    @Deprecated
    /* renamed from: android.support.v7.app.NotificationCompat$DecoratedMediaCustomViewStyle */
    public static class DecoratedMediaCustomViewStyle extends NotificationCompat.DecoratedMediaCustomViewStyle {
    }

    @Deprecated
    /* renamed from: android.support.v7.app.NotificationCompat$MediaStyle */
    public static class MediaStyle extends NotificationCompat.MediaStyle {
        @Deprecated
        public MediaStyle() {
        }

        @Deprecated
        public MediaStyle(NotificationCompat.Builder builder) {
            super(builder);
        }

        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public MediaStyle setCancelButtonIntent(PendingIntent pendingIntent) {
            return (MediaStyle) super.setCancelButtonIntent(pendingIntent);
        }

        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public MediaStyle setMediaSession(MediaSessionCompat.Token token) {
            return (MediaStyle) super.setMediaSession(token);
        }

        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public MediaStyle setShowActionsInCompactView(int... iArr) {
            return (MediaStyle) super.setShowActionsInCompactView(iArr);
        }

        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public MediaStyle setShowCancelButton(boolean z) {
            return (MediaStyle) super.setShowCancelButton(z);
        }
    }

    @Deprecated
    public static MediaSessionCompat.Token getMediaSession(Notification notification) {
        Bundle extras = android.support.p009v4.app.NotificationCompat.getExtras(notification);
        if (extras == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Parcelable parcelable = extras.getParcelable(android.support.p009v4.app.NotificationCompat.EXTRA_MEDIA_SESSION);
            if (parcelable != null) {
                return MediaSessionCompat.Token.fromToken(parcelable);
            }
            return null;
        }
        IBinder binder = BundleCompat.getBinder(extras, android.support.p009v4.app.NotificationCompat.EXTRA_MEDIA_SESSION);
        if (binder == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeStrongBinder(binder);
        obtain.setDataPosition(0);
        MediaSessionCompat.Token createFromParcel = MediaSessionCompat.Token.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
