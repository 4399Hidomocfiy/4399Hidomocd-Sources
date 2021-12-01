package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;

/* renamed from: android.support.transition.l */
class C0231l implements AbstractC0236n {

    /* renamed from: android.support.transition.l$a */
    class C0232a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ImageView f940a;

        C0232a(C0231l lVar, ImageView imageView) {
            this.f940a = imageView;
        }

        public void onAnimationEnd(Animator animator) {
            ImageView imageView = this.f940a;
            int i = C0263y.f981e;
            ImageView.ScaleType scaleType = (ImageView.ScaleType) imageView.getTag(i);
            this.f940a.setScaleType(scaleType);
            this.f940a.setTag(i, null);
            if (scaleType == ImageView.ScaleType.MATRIX) {
                ImageView imageView2 = this.f940a;
                int i2 = C0263y.f979c;
                imageView2.setImageMatrix((Matrix) imageView2.getTag(i2));
                this.f940a.setTag(i2, null);
            }
            animator.removeListener(this);
        }
    }

    C0231l() {
    }

    @Override // android.support.transition.AbstractC0236n
    /* renamed from: a */
    public void mo1561a(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    @Override // android.support.transition.AbstractC0236n
    /* renamed from: b */
    public void mo1562b(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setTag(C0263y.f981e, scaleType);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            imageView.setTag(C0263y.f979c, imageView.getImageMatrix());
        } else {
            imageView.setScaleType(scaleType2);
        }
        imageView.setImageMatrix(C0238o.f945a);
    }

    @Override // android.support.transition.AbstractC0236n
    /* renamed from: c */
    public void mo1563c(ImageView imageView, Animator animator) {
        animator.addListener(new C0232a(this, imageView));
    }
}
