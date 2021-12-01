package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.graphics.drawable.DrawableCompat;
import android.support.p009v4.util.ArrayMap;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class AnimatedVectorDrawableCompat extends AbstractC0148f implements Animatable {

    /* renamed from: b */
    private C0132b f660b;

    /* renamed from: c */
    private Context f661c;

    /* renamed from: d */
    private ArgbEvaluator f662d;

    /* renamed from: e */
    final Drawable.Callback f663e;

    /* renamed from: android.support.graphics.drawable.AnimatedVectorDrawableCompat$a */
    class C0131a implements Drawable.Callback {
        C0131a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.AnimatedVectorDrawableCompat$b */
    public static class C0132b extends Drawable.ConstantState {

        /* renamed from: a */
        int f665a;

        /* renamed from: b */
        VectorDrawableCompat f666b;

        /* renamed from: c */
        AnimatorSet f667c;

        /* renamed from: d */
        private ArrayList<Animator> f668d;

        /* renamed from: e */
        ArrayMap<Animator, String> f669e;

        public C0132b(Context context, C0132b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f665a = bVar.f665a;
                VectorDrawableCompat vectorDrawableCompat = bVar.f666b;
                if (vectorDrawableCompat != null) {
                    Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    this.f666b = (VectorDrawableCompat) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    VectorDrawableCompat vectorDrawableCompat2 = (VectorDrawableCompat) this.f666b.mutate();
                    this.f666b = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.f666b.setBounds(bVar.f666b.getBounds());
                    this.f666b.mo1254h(false);
                }
                ArrayList<Animator> arrayList = bVar.f668d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f668d = new ArrayList<>(size);
                    this.f669e = new ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f668d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f669e.get(animator);
                        clone.setTarget(this.f666b.mo1246d(str));
                        this.f668d.add(clone);
                        this.f669e.put(clone, str);
                    }
                    mo1236c();
                }
            }
        }

        /* renamed from: c */
        public void mo1236c() {
            if (this.f667c == null) {
                this.f667c = new AnimatorSet();
            }
            this.f667c.playTogether(this.f668d);
        }

        public int getChangingConfigurations() {
            return this.f665a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: android.support.graphics.drawable.AnimatedVectorDrawableCompat$c */
    private static class C0133c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f670a;

        public C0133c(Drawable.ConstantState constantState) {
            this.f670a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f670a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f670a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f670a.newDrawable();
            animatedVectorDrawableCompat.f754a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f663e);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f670a.newDrawable(resources);
            animatedVectorDrawableCompat.f754a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f663e);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f670a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f754a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f663e);
            return animatedVectorDrawableCompat;
        }
    }

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, null, null);
    }

    private AnimatedVectorDrawableCompat(Context context, C0132b bVar, Resources resources) {
        this.f662d = null;
        C0131a aVar = new C0131a();
        this.f663e = aVar;
        this.f661c = context;
        if (bVar != null) {
            this.f660b = bVar;
        } else {
            this.f660b = new C0132b(context, bVar, aVar, resources);
        }
    }

    /* renamed from: a */
    public static AnimatedVectorDrawableCompat m344a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    /* renamed from: b */
    private void m345b(String str, Animator animator) {
        animator.setTarget(this.f660b.f666b.mo1246d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m346c(animator);
        }
        if (this.f660b.f668d == null) {
            this.f660b.f668d = new ArrayList();
            this.f660b.f669e = new ArrayMap<>();
        }
        this.f660b.f668d.add(animator);
        this.f660b.f669e.put(animator, str);
    }

    /* renamed from: c */
    private void m346c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m346c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f662d == null) {
                    this.f662d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f662d);
            }
        }
    }

    @Override // android.support.graphics.drawable.AbstractC0148f
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.applyTheme(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            return DrawableCompat.canApplyTheme(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f660b.f666b.draw(canvas);
        if (this.f660b.f667c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f754a;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f660b.f666b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f660b.f665a;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f754a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0133c(this.f754a.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f660b.f666b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f660b.f666b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.getOpacity() : this.f660b.f666b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0141a.f742e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat b = VectorDrawableCompat.m351b(resources, resourceId, theme);
                        b.mo1254h(false);
                        b.setCallback(this.f663e);
                        VectorDrawableCompat vectorDrawableCompat = this.f660b.f666b;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback(null);
                        }
                        this.f660b.f666b = b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0141a.f743f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f661c;
                        if (context != null) {
                            m345b(string, C0143c.m401i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f660b.mo1236c();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f754a;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f660b.f666b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f754a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f660b.f667c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.isStateful() : this.f660b.f666b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f660b.f666b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.graphics.drawable.AbstractC0148f
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.setLevel(i) : this.f660b.f666b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.setState(iArr) : this.f660b.f666b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f660b.f666b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f660b.f666b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f660b.f666b.setColorFilter(colorFilter);
        }
    }

    @Override // android.support.p009v4.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            this.f660b.f666b.setTint(i);
        }
    }

    @Override // android.support.p009v4.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        } else {
            this.f660b.f666b.setTintList(colorStateList);
        }
    }

    @Override // android.support.p009v4.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        } else {
            this.f660b.f666b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f660b.f666b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f660b.f667c.isStarted()) {
            this.f660b.f667c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f660b.f667c.end();
        }
    }
}
