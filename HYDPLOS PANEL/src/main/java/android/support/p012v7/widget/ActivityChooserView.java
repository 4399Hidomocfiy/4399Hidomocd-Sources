package android.support.p012v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.ActionProvider;
import android.support.p009v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.view.menu.ShowableListMenu;
import android.support.p012v7.widget.ActivityChooserModel;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    private static final String LOG_TAG = "ActivityChooserView";
    private final LinearLayoutCompat mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    final DataSetObserver mModelDataSetObserver;
    PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActivityChooserView$ActivityChooserViewAdapter */
    public class ActivityChooserViewAdapter extends BaseAdapter {
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount = 4;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;

        ActivityChooserViewAdapter() {
        }

        public int getActivityCount() {
            return this.mDataModel.getActivityCount();
        }

        public int getCount() {
            int activityCount = this.mDataModel.getActivityCount();
            if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                activityCount--;
            }
            int min = Math.min(activityCount, this.mMaxActivityCount);
            return this.mShowFooterView ? min + 1 : min;
        }

        public ActivityChooserModel getDataModel() {
            return this.mDataModel;
        }

        public ResolveInfo getDefaultActivity() {
            return this.mDataModel.getDefaultActivity();
        }

        public int getHistorySize() {
            return this.mDataModel.getHistorySize();
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                    i++;
                }
                return this.mDataModel.getActivity(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.mShowFooterView || i != getCount() - 1) ? 0 : 1;
        }

        public boolean getShowDefaultActivity() {
            return this.mShowDefaultActivity;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != C0467R.C0469id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0467R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C0467R.C0469id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C0467R.C0469id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.mShowDefaultActivity || i != 0 || !this.mHighlightDefaultActivity) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0467R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(C0467R.C0469id.title)).setText(ActivityChooserView.this.getContext().getString(C0467R.string.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        public int measureContentWidth() {
            int i = this.mMaxActivityCount;
            this.mMaxActivityCount = MAX_ACTIVITY_COUNT_UNLIMITED;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.mMaxActivityCount = i;
            return i2;
        }

        public void setDataModel(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel dataModel = ActivityChooserView.this.mAdapter.getDataModel();
            if (dataModel != null && ActivityChooserView.this.isShown()) {
                dataModel.unregisterObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            this.mDataModel = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            notifyDataSetChanged();
        }

        public void setMaxActivityCount(int i) {
            if (this.mMaxActivityCount != i) {
                this.mMaxActivityCount = i;
                notifyDataSetChanged();
            }
        }

        public void setShowDefaultActivity(boolean z, boolean z2) {
            if (this.mShowDefaultActivity != z || this.mHighlightDefaultActivity != z2) {
                this.mShowDefaultActivity = z;
                this.mHighlightDefaultActivity = z2;
                notifyDataSetChanged();
            }
        }

        public void setShowFooterView(boolean z) {
            if (this.mShowFooterView != z) {
                this.mShowFooterView = z;
                notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActivityChooserView$Callbacks */
    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        Callbacks() {
        }

        private void notifyOnDismissListener() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                activityChooserView.dismissPopup();
                Intent chooseActivity = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(ActivityChooserView.this.mAdapter.getDataModel().getActivityIndex(ActivityChooserView.this.mAdapter.getDefaultActivity()));
                if (chooseActivity != null) {
                    chooseActivity.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(chooseActivity);
                }
            } else if (view == activityChooserView.mExpandActivityOverflowButton) {
                activityChooserView.mIsSelectingDefaultActivity = false;
                activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            notifyOnDismissListener();
            ActionProvider actionProvider = ActivityChooserView.this.mProvider;
            if (actionProvider != null) {
                actionProvider.subUiVisibilityChanged(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.dismissPopup();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.mIsSelectingDefaultActivity) {
                    if (!activityChooserView.mAdapter.getShowDefaultActivity()) {
                        i++;
                    }
                    Intent chooseActivity = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(i);
                    if (chooseActivity != null) {
                        chooseActivity.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(chooseActivity);
                    }
                } else if (i > 0) {
                    activityChooserView.mAdapter.getDataModel().setDefaultActivity(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.showPopupUnchecked(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                if (activityChooserView.mAdapter.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.mIsSelectingDefaultActivity = true;
                    activityChooserView2.showPopupUnchecked(activityChooserView2.mInitialActivityCount);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends LinearLayoutCompat {
        private static final int[] TINT_ATTRS = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mModelDataSetObserver = new DataSetObserver() {
            /* class android.support.p012v7.widget.ActivityChooserView.C04981 */

            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mAdapter.notifyDataSetChanged();
            }

            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
            }
        };
        this.mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class android.support.p012v7.widget.ActivityChooserView.ViewTreeObserver$OnGlobalLayoutListenerC04992 */

            public void onGlobalLayout() {
                if (!ActivityChooserView.this.isShowingPopup()) {
                    return;
                }
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                ActionProvider actionProvider = ActivityChooserView.this.mProvider;
                if (actionProvider != null) {
                    actionProvider.subUiVisibilityChanged(true);
                }
            }
        };
        this.mInitialActivityCount = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0467R.styleable.ActivityChooserView, i, 0);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(C0467R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0467R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0467R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        Callbacks callbacks = new Callbacks();
        this.mCallbacks = callbacks;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) findViewById(C0467R.C0469id.activity_chooser_view_content);
        this.mActivityChooserContent = linearLayoutCompat;
        this.mActivityChooserContentBackground = linearLayoutCompat.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C0467R.C0469id.default_activity_button);
        this.mDefaultActivityButton = frameLayout;
        frameLayout.setOnClickListener(callbacks);
        frameLayout.setOnLongClickListener(callbacks);
        int i2 = C0467R.C0469id.image;
        this.mDefaultActivityButtonImage = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C0467R.C0469id.expand_activities_button);
        frameLayout2.setOnClickListener(callbacks);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            /* class android.support.p012v7.widget.ActivityChooserView.C05003 */

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
            }
        });
        frameLayout2.setOnTouchListener(new ForwardingListener(frameLayout2) {
            /* class android.support.p012v7.widget.ActivityChooserView.C05014 */

            @Override // android.support.p012v7.widget.ForwardingListener
            public ShowableListMenu getPopup() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            /* access modifiers changed from: protected */
            @Override // android.support.p012v7.widget.ForwardingListener
            public boolean onForwardingStarted() {
                ActivityChooserView.this.showPopup();
                return true;
            }

            /* access modifiers changed from: protected */
            @Override // android.support.p012v7.widget.ForwardingListener
            public boolean onForwardingStopped() {
                ActivityChooserView.this.dismissPopup();
                return true;
            }
        });
        this.mExpandActivityOverflowButton = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.mExpandActivityOverflowButtonImage = imageView;
        imageView.setImageDrawable(drawable);
        ActivityChooserViewAdapter activityChooserViewAdapter = new ActivityChooserViewAdapter();
        this.mAdapter = activityChooserViewAdapter;
        activityChooserViewAdapter.registerDataSetObserver(new DataSetObserver() {
            /* class android.support.p012v7.widget.ActivityChooserView.C05025 */

            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.updateAppearance();
            }
        });
        Resources resources = context.getResources();
        this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0467R.dimen.abc_config_prefDialogWidth));
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        return true;
    }

    public ActivityChooserModel getDataModel() {
        return this.mAdapter.getDataModel();
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.mListPopupWindow == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.mListPopupWindow = listPopupWindow;
            listPopupWindow.setAdapter(this.mAdapter);
            this.mListPopupWindow.setAnchorView(this);
            this.mListPopupWindow.setModal(true);
            this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
            this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
        }
        return this.mListPopupWindow;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.registerObserver(this.mModelDataSetObserver);
        }
        this.mIsAttachedToWindow = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.unregisterObserver(this.mModelDataSetObserver);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mActivityChooserContent.layout(0, 0, i3 - i, i4 - i2);
        if (!isShowingPopup()) {
            dismissPopup();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(linearLayoutCompat, i, i2);
        setMeasuredDimension(linearLayoutCompat.getMeasuredWidth(), linearLayoutCompat.getMeasuredHeight());
    }

    @Override // android.support.p012v7.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        this.mAdapter.setDataModel(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.mDefaultActionButtonContentDescription = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.mExpandActivityOverflowButtonImage.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.mInitialActivityCount = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setProvider(ActionProvider actionProvider) {
        this.mProvider = actionProvider;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showPopupUnchecked(int r6) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p012v7.widget.ActivityChooserView.showPopupUnchecked(int):void");
    }

    /* access modifiers changed from: package-private */
    public void updateAppearance() {
        Drawable drawable;
        LinearLayoutCompat linearLayoutCompat;
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        } else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        int activityCount = this.mAdapter.getActivityCount();
        int historySize = this.mAdapter.getHistorySize();
        if (activityCount == 1 || (activityCount > 1 && historySize > 0)) {
            this.mDefaultActivityButton.setVisibility(0);
            ResolveInfo defaultActivity = this.mAdapter.getDefaultActivity();
            PackageManager packageManager = getContext().getPackageManager();
            this.mDefaultActivityButtonImage.setImageDrawable(defaultActivity.loadIcon(packageManager));
            if (this.mDefaultActionButtonContentDescription != 0) {
                CharSequence loadLabel = defaultActivity.loadLabel(packageManager);
                this.mDefaultActivityButton.setContentDescription(getContext().getString(this.mDefaultActionButtonContentDescription, loadLabel));
            }
        } else {
            this.mDefaultActivityButton.setVisibility(8);
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            linearLayoutCompat = this.mActivityChooserContent;
            drawable = this.mActivityChooserContentBackground;
        } else {
            linearLayoutCompat = this.mActivityChooserContent;
            drawable = null;
        }
        linearLayoutCompat.setBackgroundDrawable(drawable);
    }
}
