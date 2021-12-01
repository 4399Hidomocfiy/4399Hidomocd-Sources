package android.support.p012v7.widget.helper;

import android.graphics.Canvas;
import android.support.p009v4.view.ViewCompat;
import android.support.p012v7.recyclerview.C0471R;
import android.support.p012v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.helper.ItemTouchUIUtilImpl */
class ItemTouchUIUtilImpl {

    /* renamed from: android.support.v7.widget.helper.ItemTouchUIUtilImpl$Api21Impl */
    static class Api21Impl extends BaseImpl {
        Api21Impl() {
        }

        private float findMaxElevation(RecyclerView recyclerView, View view) {
            int childCount = recyclerView.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float elevation = ViewCompat.getElevation(childAt);
                    if (elevation > f) {
                        f = elevation;
                    }
                }
            }
            return f;
        }

        @Override // android.support.p012v7.widget.helper.ItemTouchUIUtil, android.support.p012v7.widget.helper.ItemTouchUIUtilImpl.BaseImpl
        public void clearView(View view) {
            int i = C0471R.C0473id.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag != null && (tag instanceof Float)) {
                ViewCompat.setElevation(view, ((Float) tag).floatValue());
            }
            view.setTag(i, null);
            super.clearView(view);
        }

        @Override // android.support.p012v7.widget.helper.ItemTouchUIUtil, android.support.p012v7.widget.helper.ItemTouchUIUtilImpl.BaseImpl
        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (z) {
                int i2 = C0471R.C0473id.item_touch_helper_previous_elevation;
                if (view.getTag(i2) == null) {
                    Float valueOf = Float.valueOf(ViewCompat.getElevation(view));
                    ViewCompat.setElevation(view, findMaxElevation(recyclerView, view) + 1.0f);
                    view.setTag(i2, valueOf);
                }
            }
            super.onDraw(canvas, recyclerView, view, f, f2, i, z);
        }
    }

    /* renamed from: android.support.v7.widget.helper.ItemTouchUIUtilImpl$BaseImpl */
    static class BaseImpl implements ItemTouchUIUtil {
        BaseImpl() {
        }

        @Override // android.support.p012v7.widget.helper.ItemTouchUIUtil
        public void clearView(View view) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        @Override // android.support.p012v7.widget.helper.ItemTouchUIUtil
        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        @Override // android.support.p012v7.widget.helper.ItemTouchUIUtil
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        }

        @Override // android.support.p012v7.widget.helper.ItemTouchUIUtil
        public void onSelected(View view) {
        }
    }

    ItemTouchUIUtilImpl() {
    }
}
