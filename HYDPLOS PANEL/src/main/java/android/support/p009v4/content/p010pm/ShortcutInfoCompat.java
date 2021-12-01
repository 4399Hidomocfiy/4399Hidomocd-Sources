package android.support.p009v4.content.p010pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.support.p009v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: android.support.v4.content.pm.ShortcutInfoCompat */
public class ShortcutInfoCompat {
    private ComponentName mActivity;
    private Context mContext;
    private CharSequence mDisabledMessage;
    private IconCompat mIcon;
    private String mId;
    private Intent[] mIntents;
    private CharSequence mLabel;
    private CharSequence mLongLabel;

    /* renamed from: android.support.v4.content.pm.ShortcutInfoCompat$Builder */
    public static class Builder {
        private final ShortcutInfoCompat mInfo;

        public Builder(Context context, String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = str;
        }

        public ShortcutInfoCompat build() {
            if (TextUtils.isEmpty(this.mInfo.mLabel)) {
                throw new IllegalArgumentException("Shortcut much have a non-empty label");
            } else if (this.mInfo.mIntents != null && this.mInfo.mIntents.length != 0) {
                return this.mInfo;
            } else {
                throw new IllegalArgumentException("Shortcut much have an intent");
            }
        }

        public Builder setActivity(ComponentName componentName) {
            this.mInfo.mActivity = componentName;
            return this;
        }

        public Builder setDisabledMessage(CharSequence charSequence) {
            this.mInfo.mDisabledMessage = charSequence;
            return this;
        }

        public Builder setIcon(int i) {
            return setIcon(IconCompat.createWithResource(this.mInfo.mContext, i));
        }

        public Builder setIcon(Bitmap bitmap) {
            return setIcon(IconCompat.createWithBitmap(bitmap));
        }

        public Builder setIcon(IconCompat iconCompat) {
            this.mInfo.mIcon = iconCompat;
            return this;
        }

        public Builder setIntent(Intent intent) {
            return setIntents(new Intent[]{intent});
        }

        public Builder setIntents(Intent[] intentArr) {
            this.mInfo.mIntents = intentArr;
            return this;
        }

        public Builder setLongLabel(CharSequence charSequence) {
            this.mInfo.mLongLabel = charSequence;
            return this;
        }

        public Builder setShortLabel(CharSequence charSequence) {
            this.mInfo.mLabel = charSequence;
            return this;
        }
    }

    private ShortcutInfoCompat() {
    }

    /* access modifiers changed from: package-private */
    public Intent addToIntent(Intent intent) {
        Intent[] intentArr = this.mIntents;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            iconCompat.addToShortcutIntent(intent);
        }
        return intent;
    }

    public ComponentName getActivity() {
        return this.mActivity;
    }

    public CharSequence getDisabledMessage() {
        return this.mDisabledMessage;
    }

    public String getId() {
        return this.mId;
    }

    public Intent getIntent() {
        Intent[] intentArr = this.mIntents;
        return intentArr[intentArr.length - 1];
    }

    public Intent[] getIntents() {
        Intent[] intentArr = this.mIntents;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public CharSequence getLongLabel() {
        return this.mLongLabel;
    }

    public CharSequence getShortLabel() {
        return this.mLabel;
    }

    /* access modifiers changed from: package-private */
    public ShortcutInfo toShortcutInfo() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon());
        }
        if (!TextUtils.isEmpty(this.mLongLabel)) {
            intents.setLongLabel(this.mLongLabel);
        }
        if (!TextUtils.isEmpty(this.mDisabledMessage)) {
            intents.setDisabledMessage(this.mDisabledMessage);
        }
        ComponentName componentName = this.mActivity;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        return intents.build();
    }
}
