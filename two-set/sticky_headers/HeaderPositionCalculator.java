package com.disney.wdpro.virtualqueue.p462ui.sticky_headers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.support.sticky_header.C20908c;
import com.disney.wdpro.support.sticky_header.InterfaceC20917l;

/* loaded from: classes20.dex */
class HeaderPositionCalculator {
    private final InterfaceC20917l adapter;
    private final DimensionCalculator dimensionCalculator;
    private final C20908c headerProvider;
    private View topView;
    private int topViewOffset;

    public HeaderPositionCalculator(InterfaceC20917l interfaceC20917l, C20908c c20908c, DimensionCalculator dimensionCalculator) {
        this.adapter = interfaceC20917l;
        this.headerProvider = c20908c;
        this.dimensionCalculator = dimensionCalculator;
    }

    private Rect getDefaultHeaderOffset(RecyclerView recyclerView, View view, View view2) {
        Rect margins = this.dimensionCalculator.getMargins(view);
        int left = view2.getLeft() + margins.left;
        int iMax = Math.max((view2.getTop() - view.getHeight()) - margins.bottom, getListTop(recyclerView) + margins.top);
        return new Rect(left, iMax, view.getWidth() + left, view.getHeight() + iMax);
    }

    private View getFirstViewUnObscuredByHeader(RecyclerView recyclerView, View view) {
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (!itemIsObscuredByHeader(recyclerView, childAt, view)) {
                return childAt;
            }
        }
        return null;
    }

    private int getListTop(RecyclerView recyclerView) {
        int height = this.topView != null ? (int) ((r0.getHeight() + this.topView.getY()) - this.topViewOffset) : 0;
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            height += recyclerView.getPaddingTop();
        }
        return Math.max(height, 0);
    }

    private boolean isStickyHeaderBeingPushedOffTheScreen(RecyclerView recyclerView, View view) {
        View firstViewUnObscuredByHeader = getFirstViewUnObscuredByHeader(recyclerView, view);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(firstViewUnObscuredByHeader);
        if (firstViewUnObscuredByHeader != null && childAdapterPosition != -1 && this.adapter.isHeader(childAdapterPosition)) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) firstViewUnObscuredByHeader.getLayoutParams();
            Rect margins = this.dimensionCalculator.getMargins(view);
            if (((view.getBottom() + margins.bottom) + margins.top) - this.adapter.getNextHeaderOffset() > (firstViewUnObscuredByHeader.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - getListTop(recyclerView)) {
                return true;
            }
        }
        return false;
    }

    private boolean itemIsObscuredByHeader(RecyclerView recyclerView, View view, View view2) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect margins = this.dimensionCalculator.getMargins(view2);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        return childAdapterPosition != -1 && this.headerProvider.m63103a(recyclerView, childAdapterPosition) == view2 && view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin <= (view2.getBottom() + margins.bottom) + margins.top;
    }

    private Rect translateHeaderWithNextHeader(RecyclerView recyclerView, Rect rect, View view, View view2) {
        Rect rect2 = new Rect(rect);
        rect2.top -= (((this.dimensionCalculator.getMargins(view).bottom + view.getHeight()) + getListTop(recyclerView)) - view2.getTop()) - this.adapter.getNextHeaderOffset();
        return rect2;
    }

    public Rect getHeaderBounds(RecyclerView recyclerView, View view, View view2, int i10) {
        Rect defaultHeaderOffset = getDefaultHeaderOffset(recyclerView, view, view2);
        if (!isStickyHeaderBeingPushedOffTheScreen(recyclerView, view)) {
            this.headerProvider.m63105c(i10);
            return defaultHeaderOffset;
        }
        View firstViewUnObscuredByHeader = getFirstViewUnObscuredByHeader(recyclerView, view);
        this.headerProvider.m63106d(i10);
        return translateHeaderWithNextHeader(recyclerView, defaultHeaderOffset, view, firstViewUnObscuredByHeader);
    }

    public boolean hasStickyHeader(RecyclerView recyclerView, View view, int i10) {
        int top = view.getTop();
        int bottom = view.getBottom() + this.dimensionCalculator.getMargins(view).bottom;
        int listTop = getListTop(recyclerView);
        return bottom >= listTop && top <= listTop && this.adapter.getHeaderType(i10) >= 0;
    }

    public void setTopView(View view) {
        this.topView = view;
    }

    public void setTopViewOffset(int i10) {
        this.topViewOffset = i10;
    }
}