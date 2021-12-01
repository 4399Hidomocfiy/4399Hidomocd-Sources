package p069pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p069pl.droidsonroids.gif.C1495f;

/* renamed from: pl.droidsonroids.gif.GifImageButton */
public class GifImageButton extends ImageButton {

    /* renamed from: a */
    private boolean f3612a;

    public GifImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4113a(C1495f.m4186c(this, attributeSet, 0, 0));
    }

    public GifImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4113a(C1495f.m4186c(this, attributeSet, i, 0));
    }

    /* renamed from: a */
    private void m4113a(C1495f.C1496a aVar) {
        this.f3612a = aVar.f3683a;
        int i = aVar.f3681c;
        if (i > 0) {
            super.setImageResource(i);
        }
        int i2 = aVar.f3682d;
        if (i2 > 0) {
            super.setBackgroundResource(i2);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        gifViewSavedState.mo12565a(getDrawable(), 0);
        gifViewSavedState.mo12565a(getBackground(), 1);
    }

    public Parcelable onSaveInstanceState() {
        Drawable drawable = null;
        Drawable drawable2 = this.f3612a ? getDrawable() : null;
        if (this.f3612a) {
            drawable = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawable2, drawable);
    }

    public void setBackgroundResource(int i) {
        if (!C1495f.m4188e(this, false, i)) {
            super.setBackgroundResource(i);
        }
    }

    public void setFreezesAnimation(boolean z) {
        this.f3612a = z;
    }

    public void setImageResource(int i) {
        if (!C1495f.m4188e(this, true, i)) {
            super.setImageResource(i);
        }
    }

    public void setImageURI(Uri uri) {
        if (!C1495f.m4187d(this, uri)) {
            super.setImageURI(uri);
        }
    }
}
