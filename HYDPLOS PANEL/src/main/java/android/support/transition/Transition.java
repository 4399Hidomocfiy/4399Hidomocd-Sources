package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.util.ArrayMap;
import android.support.p009v4.util.LongSparseArray;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private static final PathMotion STRAIGHT_PATH_MOTION = new C0181a();
    private static ThreadLocal<ArrayMap<Animator, C0184d>> sRunningAnimators = new ThreadLocal<>();
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    boolean mCanRemoveViews = false;
    private ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    long mDuration = -1;
    private C0224i0 mEndValues = new C0224i0();
    private ArrayList<C0221h0> mEndValuesList;
    private boolean mEnded = false;
    private AbstractC0186f mEpicenterCallback;
    private TimeInterpolator mInterpolator = null;
    private ArrayList<AbstractC0187g> mListeners = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    private String mName = getClass().getName();
    private ArrayMap<String, String> mNameOverrides;
    private int mNumInstances = 0;
    TransitionSet mParent = null;
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;
    private boolean mPaused = false;
    AbstractC0212f0 mPropagation;
    private ViewGroup mSceneRoot = null;
    private long mStartDelay = -1;
    private C0224i0 mStartValues = new C0224i0();
    private ArrayList<C0221h0> mStartValuesList;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class> mTargetTypeChildExcludes = null;
    private ArrayList<Class> mTargetTypeExcludes = null;
    private ArrayList<Class> mTargetTypes = null;
    ArrayList<View> mTargets = new ArrayList<>();

    /* renamed from: android.support.transition.Transition$a */
    static class C0181a extends PathMotion {
        C0181a() {
        }

        @Override // android.support.transition.PathMotion
        /* renamed from: a */
        public Path mo1350a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.transition.Transition$b */
    public class C0182b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ArrayMap f846a;

        C0182b(ArrayMap arrayMap) {
            this.f846a = arrayMap;
        }

        public void onAnimationEnd(Animator animator) {
            this.f846a.remove(animator);
            Transition.this.mCurrentAnimators.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.mCurrentAnimators.add(animator);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.transition.Transition$c */
    public class C0183c extends AnimatorListenerAdapter {
        C0183c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.end();
            animator.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.Transition$d */
    public static class C0184d {

        /* renamed from: a */
        View f849a;

        /* renamed from: b */
        String f850b;

        /* renamed from: c */
        C0221h0 f851c;

        /* renamed from: d */
        AbstractC0210e1 f852d;

        /* renamed from: e */
        Transition f853e;

        C0184d(View view, String str, Transition transition, AbstractC0210e1 e1Var, C0221h0 h0Var) {
            this.f849a = view;
            this.f850b = str;
            this.f851c = h0Var;
            this.f852d = e1Var;
            this.f853e = transition;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.Transition$e */
    public static class C0185e {
        /* renamed from: a */
        static <T> ArrayList<T> m503a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* renamed from: b */
        static <T> ArrayList<T> m504b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: android.support.transition.Transition$f */
    public static abstract class AbstractC0186f {
        /* renamed from: a */
        public abstract Rect mo1483a(Transition transition);
    }

    /* renamed from: android.support.transition.Transition$g */
    public interface AbstractC0187g {
        /* renamed from: a */
        void mo1383a(Transition transition);

        /* renamed from: b */
        void mo1384b(Transition transition);

        /* renamed from: c */
        void mo1385c(Transition transition);

        /* renamed from: d */
        void mo1484d(Transition transition);

        /* renamed from: e */
        void mo1386e(Transition transition);
    }

    public Transition() {
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f882a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = (long) TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = (long) TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(parseMatchOrder(namedString));
        }
        obtainStyledAttributes.recycle();
    }

    private void addUnmatched(ArrayMap<View, C0221h0> arrayMap, ArrayMap<View, C0221h0> arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            C0221h0 valueAt = arrayMap.valueAt(i);
            if (isValidTarget(valueAt.f923b)) {
                this.mStartValuesList.add(valueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            C0221h0 valueAt2 = arrayMap2.valueAt(i2);
            if (isValidTarget(valueAt2.f923b)) {
                this.mEndValuesList.add(valueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(C0224i0 i0Var, View view, C0221h0 h0Var) {
        i0Var.f925a.put(view, h0Var);
        int id = view.getId();
        if (id >= 0) {
            if (i0Var.f926b.indexOfKey(id) >= 0) {
                i0Var.f926b.put(id, null);
            } else {
                i0Var.f926b.put(id, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (i0Var.f928d.containsKey(transitionName)) {
                i0Var.f928d.put(transitionName, null);
            } else {
                i0Var.f928d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (i0Var.f927c.indexOfKey(itemIdAtPosition) >= 0) {
                    View view2 = i0Var.f927c.get(itemIdAtPosition);
                    if (view2 != null) {
                        ViewCompat.setHasTransientState(view2, false);
                        i0Var.f927c.put(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.setHasTransientState(view, true);
                i0Var.f927c.put(itemIdAtPosition, view);
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.mTargetIdExcludes;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.mTargetExcludes;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.mTargetTypeExcludes;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C0221h0 h0Var = new C0221h0();
                        h0Var.f923b = view;
                        if (z) {
                            captureStartValues(h0Var);
                        } else {
                            captureEndValues(h0Var);
                        }
                        h0Var.f924c.add(this);
                        capturePropagationValues(h0Var);
                        addViewValues(z ? this.mStartValues : this.mEndValues, view, h0Var);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.mTargetTypeChildExcludes;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    captureHierarchy(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        Integer valueOf = Integer.valueOf(i);
        return z ? C0185e.m503a(arrayList, valueOf) : C0185e.m504b(arrayList, valueOf);
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? C0185e.m503a(arrayList, t) : C0185e.m504b(arrayList, t) : arrayList;
    }

    private ArrayList<Class> excludeType(ArrayList<Class> arrayList, Class cls, boolean z) {
        return cls != null ? z ? C0185e.m503a(arrayList, cls) : C0185e.m504b(arrayList, cls) : arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? C0185e.m503a(arrayList, view) : C0185e.m504b(arrayList, view) : arrayList;
    }

    private static ArrayMap<Animator, C0184d> getRunningAnimators() {
        ArrayMap<Animator, C0184d> arrayMap = sRunningAnimators.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, C0184d> arrayMap2 = new ArrayMap<>();
        sRunningAnimators.set(arrayMap2);
        return arrayMap2;
    }

    private static boolean isValidMatch(int i) {
        return i >= 1 && i <= 4;
    }

    private static boolean isValueChanged(C0221h0 h0Var, C0221h0 h0Var2, String str) {
        Object obj = h0Var.f922a.get(str);
        Object obj2 = h0Var2.f922a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void matchIds(ArrayMap<View, C0221h0> arrayMap, ArrayMap<View, C0221h0> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C0221h0 h0Var = arrayMap.get(valueAt);
                C0221h0 h0Var2 = arrayMap2.get(view);
                if (!(h0Var == null || h0Var2 == null)) {
                    this.mStartValuesList.add(h0Var);
                    this.mEndValuesList.add(h0Var2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchInstances(ArrayMap<View, C0221h0> arrayMap, ArrayMap<View, C0221h0> arrayMap2) {
        C0221h0 remove;
        View view;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View keyAt = arrayMap.keyAt(size);
            if (!(keyAt == null || !isValidTarget(keyAt) || (remove = arrayMap2.remove(keyAt)) == null || (view = remove.f923b) == null || !isValidTarget(view))) {
                this.mStartValuesList.add(arrayMap.removeAt(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(ArrayMap<View, C0221h0> arrayMap, ArrayMap<View, C0221h0> arrayMap2, LongSparseArray<View> longSparseArray, LongSparseArray<View> longSparseArray2) {
        View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = longSparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = longSparseArray2.get(longSparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C0221h0 h0Var = arrayMap.get(valueAt);
                C0221h0 h0Var2 = arrayMap2.get(view);
                if (!(h0Var == null || h0Var2 == null)) {
                    this.mStartValuesList.add(h0Var);
                    this.mEndValuesList.add(h0Var2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchNames(ArrayMap<View, C0221h0> arrayMap, ArrayMap<View, C0221h0> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        View view;
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View valueAt = arrayMap3.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i))) != null && isValidTarget(view)) {
                C0221h0 h0Var = arrayMap.get(valueAt);
                C0221h0 h0Var2 = arrayMap2.get(view);
                if (!(h0Var == null || h0Var2 == null)) {
                    this.mStartValuesList.add(h0Var);
                    this.mEndValuesList.add(h0Var2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(C0224i0 i0Var, C0224i0 i0Var2) {
        ArrayMap<View, C0221h0> arrayMap = new ArrayMap<>(i0Var.f925a);
        ArrayMap<View, C0221h0> arrayMap2 = new ArrayMap<>(i0Var2.f925a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    matchInstances(arrayMap, arrayMap2);
                } else if (i2 == 2) {
                    matchNames(arrayMap, arrayMap2, i0Var.f928d, i0Var2.f928d);
                } else if (i2 == 3) {
                    matchIds(arrayMap, arrayMap2, i0Var.f926b, i0Var2.f926b);
                } else if (i2 == 4) {
                    matchItemIds(arrayMap, arrayMap2, i0Var.f927c, i0Var2.f927c);
                }
                i++;
            } else {
                addUnmatched(arrayMap, arrayMap2);
                return;
            }
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (MATCH_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if (MATCH_NAME_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, ArrayMap<Animator, C0184d> arrayMap) {
        if (animator != null) {
            animator.addListener(new C0182b(arrayMap));
            animate(animator);
        }
    }

    public Transition addListener(AbstractC0187g gVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(gVar);
        return this;
    }

    public Transition addTarget(int i) {
        if (i > 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public Transition addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public Transition addTarget(Class cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public Transition addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    /* access modifiers changed from: protected */
    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C0183c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<AbstractC0187g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((AbstractC0187g) arrayList2.get(i)).mo1385c(this);
            }
        }
    }

    public abstract void captureEndValues(C0221h0 h0Var);

    /* access modifiers changed from: package-private */
    public void capturePropagationValues(C0221h0 h0Var) {
        String[] b;
        if (this.mPropagation != null && !h0Var.f922a.isEmpty() && (b = this.mPropagation.mo1529b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!h0Var.f922a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.mPropagation.mo1528a(h0Var);
            }
        }
    }

    public abstract void captureStartValues(C0221h0 h0Var);

    /* access modifiers changed from: package-private */
    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayMap<String, String> arrayMap;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    C0221h0 h0Var = new C0221h0();
                    h0Var.f923b = findViewById;
                    if (z) {
                        captureStartValues(h0Var);
                    } else {
                        captureEndValues(h0Var);
                    }
                    h0Var.f924c.add(this);
                    capturePropagationValues(h0Var);
                    addViewValues(z ? this.mStartValues : this.mEndValues, findViewById, h0Var);
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                C0221h0 h0Var2 = new C0221h0();
                h0Var2.f923b = view;
                if (z) {
                    captureStartValues(h0Var2);
                } else {
                    captureEndValues(h0Var2);
                }
                h0Var2.f924c.add(this);
                capturePropagationValues(h0Var2);
                addViewValues(z ? this.mStartValues : this.mEndValues, view, h0Var2);
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (!(z || (arrayMap = this.mNameOverrides) == null)) {
            int size = arrayMap.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.mStartValues.f928d.remove(this.mNameOverrides.keyAt(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.mStartValues.f928d.put(this.mNameOverrides.valueAt(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearValues(boolean z) {
        C0224i0 i0Var;
        if (z) {
            this.mStartValues.f925a.clear();
            this.mStartValues.f926b.clear();
            i0Var = this.mStartValues;
        } else {
            this.mEndValues.f925a.clear();
            this.mEndValues.f926b.clear();
            i0Var = this.mEndValues;
        }
        i0Var.f927c.clear();
    }

    @Override // java.lang.Object
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new C0224i0();
            transition.mEndValues = new C0224i0();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, C0221h0 h0Var, C0221h0 h0Var2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void createAnimators(ViewGroup viewGroup, C0224i0 i0Var, C0224i0 i0Var2, ArrayList<C0221h0> arrayList, ArrayList<C0221h0> arrayList2) {
        int i;
        int i2;
        Animator createAnimator;
        View view;
        Animator animator;
        C0221h0 h0Var;
        C0221h0 h0Var2;
        Animator animator2;
        ArrayMap<Animator, C0184d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0221h0 h0Var3 = arrayList.get(i3);
            C0221h0 h0Var4 = arrayList2.get(i3);
            if (h0Var3 != null && !h0Var3.f924c.contains(this)) {
                h0Var3 = null;
            }
            if (h0Var4 != null && !h0Var4.f924c.contains(this)) {
                h0Var4 = null;
            }
            if (!(h0Var3 == null && h0Var4 == null)) {
                if ((h0Var3 == null || h0Var4 == null || isTransitionRequired(h0Var3, h0Var4)) && (createAnimator = createAnimator(viewGroup, h0Var3, h0Var4)) != null) {
                    if (h0Var4 != null) {
                        view = h0Var4.f923b;
                        String[] transitionProperties = getTransitionProperties();
                        if (view == null || transitionProperties == null || transitionProperties.length <= 0) {
                            i2 = size;
                            i = i3;
                            animator2 = createAnimator;
                            h0Var2 = null;
                        } else {
                            h0Var2 = new C0221h0();
                            h0Var2.f923b = view;
                            i2 = size;
                            C0221h0 h0Var5 = i0Var2.f925a.get(view);
                            if (h0Var5 != null) {
                                int i4 = 0;
                                while (i4 < transitionProperties.length) {
                                    h0Var2.f922a.put(transitionProperties[i4], h0Var5.f922a.get(transitionProperties[i4]));
                                    i4++;
                                    i3 = i3;
                                    h0Var5 = h0Var5;
                                }
                            }
                            i = i3;
                            int size2 = runningAnimators.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = createAnimator;
                                    break;
                                }
                                C0184d dVar = runningAnimators.get(runningAnimators.keyAt(i5));
                                if (dVar.f851c != null && dVar.f849a == view && dVar.f850b.equals(getName()) && dVar.f851c.equals(h0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        }
                        animator = animator2;
                        h0Var = h0Var2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = h0Var3.f923b;
                        animator = createAnimator;
                        h0Var = null;
                    }
                    if (animator != null) {
                        AbstractC0212f0 f0Var = this.mPropagation;
                        if (f0Var != null) {
                            long c = f0Var.mo1526c(viewGroup, this, h0Var3, h0Var4);
                            sparseIntArray.put(this.mAnimators.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        runningAnimators.put(animator, new C0184d(view, getName(), this, C0254u0.m685e(viewGroup), h0Var));
                        this.mAnimators.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            ArrayList<AbstractC0187g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0187g) arrayList2.get(i2)).mo1384b(this);
                }
            }
            for (int i3 = 0; i3 < this.mStartValues.f927c.size(); i3++) {
                View valueAt = this.mStartValues.f927c.valueAt(i3);
                if (valueAt != null) {
                    ViewCompat.setHasTransientState(valueAt, false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.f927c.size(); i4++) {
                View valueAt2 = this.mEndValues.f927c.valueAt(i4);
                if (valueAt2 != null) {
                    ViewCompat.setHasTransientState(valueAt2, false);
                }
            }
            this.mEnded = true;
        }
    }

    public Transition excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    public Transition excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public Transition excludeChildren(Class cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    public Transition excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public Transition excludeTarget(View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    public Transition excludeTarget(Class cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public Transition excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void forceToEnd(ViewGroup viewGroup) {
        ArrayMap<Animator, C0184d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup != null) {
            AbstractC0210e1 e = C0254u0.m685e(viewGroup);
            for (int i = size - 1; i >= 0; i--) {
                C0184d valueAt = runningAnimators.valueAt(i);
                if (!(valueAt.f849a == null || e == null || !e.equals(valueAt.f852d))) {
                    runningAnimators.keyAt(i).end();
                }
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        AbstractC0186f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.mo1483a(this);
    }

    public AbstractC0186f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* access modifiers changed from: package-private */
    public C0221h0 getMatchedTransitionValues(View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z);
        }
        ArrayList<C0221h0> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0221h0 h0Var = arrayList.get(i2);
            if (h0Var == null) {
                return null;
            }
            if (h0Var.f923b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.mEndValuesList : this.mStartValuesList).get(i);
    }

    public String getName() {
        return this.mName;
    }

    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    public AbstractC0212f0 getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public C0221h0 getTransitionValues(View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).f925a.get(view);
    }

    public boolean isTransitionRequired(C0221h0 h0Var, C0221h0 h0Var2) {
        if (h0Var == null || h0Var2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties != null) {
            for (String str : transitionProperties) {
                if (!isValueChanged(h0Var, h0Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : h0Var.f922a.keySet()) {
            if (isValueChanged(h0Var, h0Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isValidTarget(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.mTargetNameExcludes == null || ViewCompat.getTransitionName(view) == null || !this.mTargetNameExcludes.contains(ViewCompat.getTransitionName(view)))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (!this.mEnded) {
            ArrayMap<Animator, C0184d> runningAnimators = getRunningAnimators();
            int size = runningAnimators.size();
            AbstractC0210e1 e = C0254u0.m685e(view);
            for (int i = size - 1; i >= 0; i--) {
                C0184d valueAt = runningAnimators.valueAt(i);
                if (valueAt.f849a != null && e.equals(valueAt.f852d)) {
                    C0193a.m550b(runningAnimators.keyAt(i));
                }
            }
            ArrayList<AbstractC0187g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((AbstractC0187g) arrayList2.get(i2)).mo1383a(this);
                }
            }
            this.mPaused = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void playTransition(ViewGroup viewGroup) {
        C0184d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        ArrayMap<Animator, C0184d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        AbstractC0210e1 e = C0254u0.m685e(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator keyAt = runningAnimators.keyAt(i);
            if (!(keyAt == null || (dVar = runningAnimators.get(keyAt)) == null || dVar.f849a == null || !e.equals(dVar.f852d))) {
                C0221h0 h0Var = dVar.f851c;
                View view = dVar.f849a;
                C0221h0 transitionValues = getTransitionValues(view, true);
                C0221h0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (!(transitionValues == null && matchedTransitionValues == null) && dVar.f853e.isTransitionRequired(h0Var, matchedTransitionValues)) {
                    if (keyAt.isRunning() || keyAt.isStarted()) {
                        keyAt.cancel();
                    } else {
                        runningAnimators.remove(keyAt);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public Transition removeListener(AbstractC0187g gVar) {
        ArrayList<AbstractC0187g> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public Transition removeTarget(int i) {
        if (i > 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public Transition removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public Transition removeTarget(Class cls) {
        ArrayList<Class> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public Transition removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                ArrayMap<Animator, C0184d> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                AbstractC0210e1 e = C0254u0.m685e(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0184d valueAt = runningAnimators.valueAt(i);
                    if (valueAt.f849a != null && e.equals(valueAt.f852d)) {
                        C0193a.m551c(runningAnimators.keyAt(i));
                    }
                }
                ArrayList<AbstractC0187g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((AbstractC0187g) arrayList2.get(i2)).mo1386e(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    /* access modifiers changed from: protected */
    public void runAnimators() {
        start();
        ArrayMap<Animator, C0184d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    /* access modifiers changed from: package-private */
    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(AbstractC0186f fVar) {
    }

    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (alreadyContains(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(PathMotion pathMotion) {
        if (pathMotion == null) {
            pathMotion = STRAIGHT_PATH_MOTION;
        }
        this.mPathMotion = pathMotion;
    }

    public void setPropagation(AbstractC0212f0 f0Var) {
        this.mPropagation = f0Var;
    }

    /* access modifiers changed from: package-private */
    public Transition setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    public Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    /* access modifiers changed from: protected */
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<AbstractC0187g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0187g) arrayList2.get(i)).mo1484d(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    /* access modifiers changed from: package-private */
    public String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.mTargetIds.size() > 0) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargetIds.get(i);
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargets.get(i2);
            }
        }
        return str3 + ")";
    }
}
