package android.support.p012v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.p009v4.content.ContextCompat;
import android.support.p009v4.graphics.ColorUtils;
import android.support.p009v4.graphics.drawable.DrawableCompat;
import android.support.p009v4.util.ArrayMap;
import android.support.p009v4.util.LongSparseArray;
import android.support.p009v4.util.LruCache;
import android.support.p009v4.util.SparseArrayCompat;
import android.support.p012v7.appcompat.C0467R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.widget.AppCompatDrawableManager */
public final class AppCompatDrawableManager {
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {C0467R.C0468drawable.abc_popup_background_mtrl_mult, C0467R.C0468drawable.abc_cab_background_internal_bg, C0467R.C0468drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {C0467R.C0468drawable.abc_textfield_activated_mtrl_alpha, C0467R.C0468drawable.abc_textfield_search_activated_mtrl_alpha, C0467R.C0468drawable.abc_cab_background_top_mtrl_alpha, C0467R.C0468drawable.abc_text_cursor_material, C0467R.C0468drawable.abc_text_select_handle_left_mtrl_dark, C0467R.C0468drawable.abc_text_select_handle_middle_mtrl_dark, C0467R.C0468drawable.abc_text_select_handle_right_mtrl_dark, C0467R.C0468drawable.abc_text_select_handle_left_mtrl_light, C0467R.C0468drawable.abc_text_select_handle_middle_mtrl_light, C0467R.C0468drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {C0467R.C0468drawable.abc_textfield_search_default_mtrl_alpha, C0467R.C0468drawable.abc_textfield_default_mtrl_alpha, C0467R.C0468drawable.abc_ab_share_pack_mtrl_alpha};
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "AppCompatDrawableManager";
    private static final int[] TINT_CHECKABLE_BUTTON_LIST = {C0467R.C0468drawable.abc_btn_check_material, C0467R.C0468drawable.abc_btn_radio_material};
    private static final int[] TINT_COLOR_CONTROL_NORMAL = {C0467R.C0468drawable.abc_ic_commit_search_api_mtrl_alpha, C0467R.C0468drawable.abc_seekbar_tick_mark_material, C0467R.C0468drawable.abc_ic_menu_share_mtrl_alpha, C0467R.C0468drawable.abc_ic_menu_copy_mtrl_am_alpha, C0467R.C0468drawable.abc_ic_menu_cut_mtrl_alpha, C0467R.C0468drawable.abc_ic_menu_selectall_mtrl_alpha, C0467R.C0468drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = {C0467R.C0468drawable.abc_tab_indicator_material, C0467R.C0468drawable.abc_textfield_search_material};
    private ArrayMap<String, InflateDelegate> mDelegates;
    private final Object mDrawableCacheLock = new Object();
    private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private SparseArrayCompat<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.AppCompatDrawableManager$AvdcInflateDelegate */
    public static class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        @Override // android.support.p012v7.widget.AppCompatDrawableManager.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.m344a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.AppCompatDrawableManager$ColorFilterLruCache */
    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter get(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter put(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.AppCompatDrawableManager$InflateDelegate */
    public interface InflateDelegate {
        Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.AppCompatDrawableManager$VdcInflateDelegate */
    public static class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        @Override // android.support.p012v7.widget.AppCompatDrawableManager.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return VectorDrawableCompat.m352c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void addDelegate(String str, InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new ArrayMap<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private boolean addDrawableToCache(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.mDrawableCacheLock) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                this.mDrawableCaches.put(context, longSparseArray);
            }
            longSparseArray.put(j, new WeakReference<>(constantState));
        }
        return true;
    }

    private void addTintListToCache(Context context, int i, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.mTintLists.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat<>();
            this.mTintLists.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i, colorStateList);
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void checkVectorDrawableSetup(Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable drawable = getDrawable(context, C0467R.C0468drawable.abc_vector_test);
            if (drawable == null || !isVectorDrawable(drawable)) {
                this.mHasCheckedVectorDrawableSetup = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private ColorStateList createBorderlessButtonColorStateList(Context context) {
        return createButtonColorStateList(context, 0);
    }

    private ColorStateList createButtonColorStateList(Context context, int i) {
        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlHighlight);
        int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, C0467R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{disabledThemeAttrColor, ColorUtils.compositeColors(themeAttrColor, i), ColorUtils.compositeColors(themeAttrColor, i), i});
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList createColoredButtonColorStateList(Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorAccent));
    }

    private ColorStateList createDefaultButtonColorStateList(Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorButtonNormal));
    }

    private Drawable createDrawableIfNeeded(Context context, int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (i == C0467R.C0468drawable.abc_cab_background_top_material) {
            cachedDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, C0467R.C0468drawable.abc_cab_background_internal_bg), getDrawable(context, C0467R.C0468drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (cachedDrawable != null) {
            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, cachedDrawable);
        }
        return cachedDrawable;
    }

    private ColorStateList createSwitchThumbColorStateList(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        int i = C0467R.attr.colorSwitchThumbNormal;
        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i);
        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = ThemeUtils.getThemeAttrColor(context, i);
        } else {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static AppCompatDrawableManager get() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            installDefaultInflateDelegates(appCompatDrawableManager);
        }
        return INSTANCE;
    }

    private Drawable getCachedDrawable(Context context, long j) {
        synchronized (this.mDrawableCacheLock) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j);
            if (weakReference != null) {
                Drawable.ConstantState constantState = weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                longSparseArray.delete(j);
            }
            return null;
        }
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
        PorterDuffColorFilter porterDuffColorFilter = colorFilterLruCache.get(i, mode);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        colorFilterLruCache.put(i, mode, porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    private ColorStateList getTintListFromCache(Context context, int i) {
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.get(i);
    }

    static PorterDuff.Mode getTintMode(int i) {
        if (i == C0467R.C0468drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    private static void installDefaultInflateDelegates(AppCompatDrawableManager appCompatDrawableManager) {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            appCompatDrawableManager.addDelegate("vector", new VdcInflateDelegate());
            if (i >= 11) {
                appCompatDrawableManager.addDelegate("animated-vector", new AvdcInflateDelegate());
            }
        }
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable loadDrawableFromDelegates(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p012v7.widget.AppCompatDrawableManager.loadDrawableFromDelegates(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private void removeDelegate(String str, InflateDelegate inflateDelegate) {
        ArrayMap<String, InflateDelegate> arrayMap = this.mDelegates;
        if (arrayMap != null && arrayMap.get(str) == inflateDelegate) {
            this.mDelegates.remove(str);
        }
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode));
    }

    private Drawable tintDrawable(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable wrap = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(wrap, tintList);
            PorterDuff.Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return wrap;
            }
            DrawableCompat.setTintMode(wrap, tintMode);
            return wrap;
        } else if (i == C0467R.C0468drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
            int i2 = C0467R.attr.colorControlNormal;
            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, i2);
            PorterDuff.Mode mode = DEFAULT_MODE;
            setPorterDuffColorFilter(findDrawableByLayerId, themeAttrColor, mode);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, i2), mode);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlActivated), mode);
            return drawable;
        } else if (i == C0467R.C0468drawable.abc_ratingbar_material || i == C0467R.C0468drawable.abc_ratingbar_indicator_material || i == C0467R.C0468drawable.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
            int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, C0467R.attr.colorControlNormal);
            PorterDuff.Mode mode2 = DEFAULT_MODE;
            setPorterDuffColorFilter(findDrawableByLayerId2, disabledThemeAttrColor, mode2);
            Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
            int i3 = C0467R.attr.colorControlActivated;
            setPorterDuffColorFilter(findDrawableByLayerId3, ThemeUtils.getThemeAttrColor(context, i3), mode2);
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, i3), mode2);
            return drawable;
        } else if (tintDrawableUsingColorFilter(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        if (!DrawableUtils.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            boolean z = tintInfo.mHasTintList;
            if (z || tintInfo.mHasTintMode) {
                drawable.setColorFilter(createTintFilter(z ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d(TAG, "Mutated drawable is not the same instance as the input.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean tintDrawableUsingColorFilter(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = android.support.p012v7.widget.AppCompatDrawableManager.DEFAULT_MODE
            int[] r1 = android.support.p012v7.widget.AppCompatDrawableManager.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
            boolean r1 = arrayContains(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = android.support.p012v7.appcompat.C0467R.attr.colorControlNormal
        L_0x0012:
            r7 = -1
        L_0x0013:
            r1 = 1
            goto L_0x0042
        L_0x0015:
            int[] r1 = android.support.p012v7.widget.AppCompatDrawableManager.COLORFILTER_COLOR_CONTROL_ACTIVATED
            boolean r1 = arrayContains(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = android.support.p012v7.appcompat.C0467R.attr.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = android.support.p012v7.widget.AppCompatDrawableManager.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
            boolean r1 = arrayContains(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = android.support.p012v7.appcompat.C0467R.C0468drawable.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L_0x0013
        L_0x003a:
            int r1 = android.support.p012v7.appcompat.C0467R.C0468drawable.abc_dialog_material_background
            if (r7 != r1) goto L_0x003f
            goto L_0x0012
        L_0x003f:
            r7 = -1
            r1 = 0
            r2 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x005f
            boolean r1 = android.support.p012v7.widget.DrawableUtils.canSafelyMutateDrawable(r8)
            if (r1 == 0) goto L_0x004e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004e:
            int r6 = android.support.p012v7.widget.ThemeUtils.getThemeAttrColor(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = getPorterDuffColorFilter(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L_0x005e
            r8.setAlpha(r7)
        L_0x005e:
            return r5
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p012v7.widget.AppCompatDrawableManager.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public Drawable getDrawable(Context context, int i) {
        return getDrawable(context, i, false);
    }

    /* access modifiers changed from: package-private */
    public Drawable getDrawable(Context context, int i, boolean z) {
        checkVectorDrawableSetup(context);
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = ContextCompat.getDrawable(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList getTintList(android.content.Context r3, int r4) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p012v7.widget.AppCompatDrawableManager.getTintList(android.content.Context, int):android.content.res.ColorStateList");
    }

    public void onConfigurationChanged(Context context) {
        synchronized (this.mDrawableCacheLock) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.superGetDrawable(i);
        }
        if (loadDrawableFromDelegates != null) {
            return tintDrawable(context, i, false, loadDrawableFromDelegates);
        }
        return null;
    }
}
