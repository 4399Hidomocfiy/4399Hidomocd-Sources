package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;

public class Placeholder extends View {

    /* renamed from: a */
    private int f208a = -1;

    /* renamed from: b */
    private View f209b = null;

    /* renamed from: c */
    private int f210c = 4;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m68a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m68a(attributeSet);
    }

    /* renamed from: a */
    private void m68a(AttributeSet attributeSet) {
        super.setVisibility(this.f210c);
        this.f208a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0038c.f365i0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0038c.f368j0) {
                    this.f208a = obtainStyledAttributes.getResourceId(index, this.f208a);
                } else if (index == C0038c.f371k0) {
                    this.f210c = obtainStyledAttributes.getInt(index, this.f210c);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo93b(ConstraintLayout constraintLayout) {
        if (this.f209b != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f209b.getLayoutParams();
            layoutParams2.f176k0.mo249o0(0);
            layoutParams.f176k0.mo251p0(layoutParams2.f176k0.mo201A());
            layoutParams.f176k0.mo218T(layoutParams2.f176k0.mo250p());
            layoutParams2.f176k0.mo249o0(8);
        }
    }

    /* renamed from: c */
    public void mo94c(ConstraintLayout constraintLayout) {
        if (this.f208a == -1 && !isInEditMode()) {
            setVisibility(this.f210c);
        }
        View findViewById = constraintLayout.findViewById(this.f208a);
        this.f209b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f154Z = true;
            this.f209b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f209b;
    }

    public int getEmptyVisibility() {
        return this.f210c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f208a != i) {
            View view = this.f209b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f209b.getLayoutParams()).f154Z = false;
                this.f209b = null;
            }
            this.f208a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f210c = i;
    }
}
