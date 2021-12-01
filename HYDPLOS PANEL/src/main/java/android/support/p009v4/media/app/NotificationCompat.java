package android.support.p009v4.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p009v4.app.BundleCompat;
import android.support.p009v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.p009v4.app.NotificationCompat;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import p000a.p004b.p006b.C0016a;
import p000a.p004b.p006b.C0017b;
import p000a.p004b.p006b.C0018c;
import p000a.p004b.p006b.C0019d;

/* renamed from: android.support.v4.media.app.NotificationCompat */
public class NotificationCompat {

    /* renamed from: android.support.v4.media.app.NotificationCompat$DecoratedMediaCustomViewStyle */
    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        private void setBackgroundColor(RemoteViews remoteViews) {
            remoteViews.setInt(C0017b.f66e, "setBackgroundColor", this.mBuilder.getColor() != 0 ? this.mBuilder.getColor() : this.mBuilder.mContext.getResources().getColor(C0016a.f61a));
        }

        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle, android.support.p009v4.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                notificationBuilderWithBuilderAccessor.getBuilder().setStyle(fillInMediaStyle(new Notification.DecoratedMediaCustomViewStyle()));
            } else {
                super.apply(notificationBuilderWithBuilderAccessor);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle
        public int getBigContentViewLayoutResource(int i) {
            return i <= 3 ? C0019d.f72e : C0019d.f70c;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle
        public int getContentViewLayoutResource() {
            return this.mBuilder.getContentView() != null ? C0019d.f74g : super.getContentViewLayoutResource();
        }

        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle, android.support.p009v4.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return null;
            }
            RemoteViews bigContentView = this.mBuilder.getBigContentView() != null ? this.mBuilder.getBigContentView() : this.mBuilder.getContentView();
            if (bigContentView == null) {
                return null;
            }
            RemoteViews generateBigContentView = generateBigContentView();
            buildIntoRemoteViews(generateBigContentView, bigContentView);
            if (i >= 21) {
                setBackgroundColor(generateBigContentView);
            }
            return generateBigContentView;
        }

        @Override // android.support.p009v4.media.app.NotificationCompat.MediaStyle, android.support.p009v4.app.NotificationCompat.Style
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return null;
            }
            boolean z = true;
            boolean z2 = this.mBuilder.getContentView() != null;
            if (i >= 21) {
                if (!z2 && this.mBuilder.getBigContentView() == null) {
                    z = false;
                }
                if (z) {
                    RemoteViews generateContentView = generateContentView();
                    if (z2) {
                        buildIntoRemoteViews(generateContentView, this.mBuilder.getContentView());
                    }
                    setBackgroundColor(generateContentView);
                    return generateContentView;
                }
            } else {
                RemoteViews generateContentView2 = generateContentView();
                if (z2) {
                    buildIntoRemoteViews(generateContentView2, this.mBuilder.getContentView());
                    return generateContentView2;
                }
            }
            return null;
        }

        @Override // android.support.p009v4.app.NotificationCompat.Style
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return null;
            }
            RemoteViews headsUpContentView = this.mBuilder.getHeadsUpContentView() != null ? this.mBuilder.getHeadsUpContentView() : this.mBuilder.getContentView();
            if (headsUpContentView == null) {
                return null;
            }
            RemoteViews generateBigContentView = generateBigContentView();
            buildIntoRemoteViews(generateBigContentView, headsUpContentView);
            if (i >= 21) {
                setBackgroundColor(generateBigContentView);
            }
            return generateBigContentView;
        }
    }

    /* renamed from: android.support.v4.media.app.NotificationCompat$MediaStyle */
    public static class MediaStyle extends NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        int[] mActionsToShowInCompact = null;
        PendingIntent mCancelButtonIntent;
        boolean mShowCancelButton;
        MediaSessionCompat.Token mToken;

        public MediaStyle() {
        }

        public MediaStyle(NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        private RemoteViews generateMediaActionButton(NotificationCompat.Action action) {
            boolean z = action.getActionIntent() == null;
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), C0019d.f68a);
            int i = C0017b.f62a;
            remoteViews.setImageViewResource(i, action.getIcon());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i, action.getActionIntent());
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(i, action.getTitle());
            }
            return remoteViews;
        }

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

        @Override // android.support.p009v4.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 21) {
                notificationBuilderWithBuilderAccessor.getBuilder().setStyle(fillInMediaStyle(new Notification.MediaStyle()));
            } else if (this.mShowCancelButton) {
                notificationBuilderWithBuilderAccessor.getBuilder().setOngoing(true);
            }
        }

        /* access modifiers changed from: package-private */
        public Notification.MediaStyle fillInMediaStyle(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.mActionsToShowInCompact;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.mToken;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        /* access modifiers changed from: package-private */
        public RemoteViews generateBigContentView() {
            int min = Math.min(this.mBuilder.mActions.size(), 5);
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, getBigContentViewLayoutResource(min), false);
            applyStandardTemplate.removeAllViews(C0017b.f65d);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    applyStandardTemplate.addView(C0017b.f65d, generateMediaActionButton(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.mShowCancelButton) {
                int i2 = C0017b.f63b;
                applyStandardTemplate.setViewVisibility(i2, 0);
                applyStandardTemplate.setInt(i2, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C0018c.f67a));
                applyStandardTemplate.setOnClickPendingIntent(i2, this.mCancelButtonIntent);
            } else {
                applyStandardTemplate.setViewVisibility(C0017b.f63b, 8);
            }
            return applyStandardTemplate;
        }

        /* access modifiers changed from: package-private */
        public RemoteViews generateContentView() {
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, getContentViewLayoutResource(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.mActionsToShowInCompact;
            int min = iArr == null ? 0 : Math.min(iArr.length, 3);
            applyStandardTemplate.removeAllViews(C0017b.f65d);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    if (i < size) {
                        applyStandardTemplate.addView(C0017b.f65d, generateMediaActionButton(this.mBuilder.mActions.get(this.mActionsToShowInCompact[i])));
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                    }
                }
            }
            if (this.mShowCancelButton) {
                applyStandardTemplate.setViewVisibility(C0017b.f64c, 8);
                int i2 = C0017b.f63b;
                applyStandardTemplate.setViewVisibility(i2, 0);
                applyStandardTemplate.setOnClickPendingIntent(i2, this.mCancelButtonIntent);
                applyStandardTemplate.setInt(i2, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C0018c.f67a));
            } else {
                applyStandardTemplate.setViewVisibility(C0017b.f64c, 0);
                applyStandardTemplate.setViewVisibility(C0017b.f63b, 8);
            }
            return applyStandardTemplate;
        }

        /* access modifiers changed from: package-private */
        public int getBigContentViewLayoutResource(int i) {
            return i <= 3 ? C0019d.f71d : C0019d.f69b;
        }

        /* access modifiers changed from: package-private */
        public int getContentViewLayoutResource() {
            return C0019d.f73f;
        }

        @Override // android.support.p009v4.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return generateBigContentView();
        }

        @Override // android.support.p009v4.app.NotificationCompat.Style
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return generateContentView();
        }

        public MediaStyle setCancelButtonIntent(PendingIntent pendingIntent) {
            this.mCancelButtonIntent = pendingIntent;
            return this;
        }

        public MediaStyle setMediaSession(MediaSessionCompat.Token token) {
            this.mToken = token;
            return this;
        }

        public MediaStyle setShowActionsInCompactView(int... iArr) {
            this.mActionsToShowInCompact = iArr;
            return this;
        }

        public MediaStyle setShowCancelButton(boolean z) {
            if (Build.VERSION.SDK_INT < 21) {
                this.mShowCancelButton = z;
            }
            return this;
        }
    }

    private NotificationCompat() {
    }
}
