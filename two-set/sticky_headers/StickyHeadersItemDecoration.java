package com.disney.wdpro.virtualqueue.p462ui.sticky_headers;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.support.sticky_header.C20908c;
import com.disney.wdpro.support.sticky_header.InterfaceC20917l;

/* loaded from: classes20.dex */
public class StickyHeadersItemDecoration extends RecyclerView.AbstractC4911n {
    private final InterfaceC20917l mAdapter;
    private final HeaderPositionCalculator mHeaderPositionCalculator;
    private final C20908c mHeaderProvider;
    private final HeaderRenderer mRenderer;

    public StickyHeadersItemDecoration(InterfaceC20917l interfaceC20917l) {
        this(interfaceC20917l, new DimensionCalculator());
    }

    public void invalidateHeaders() {
        this.mHeaderProvider.m63104b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4911n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C4894a0 c4894a0) {
        View viewM63103a;
        super.onDrawOver(canvas, recyclerView, c4894a0);
        if (recyclerView.getChildCount() <= 0 || this.mAdapter.getItemCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && this.mHeaderPositionCalculator.hasStickyHeader(recyclerView, childAt, childAdapterPosition) && (viewM63103a = this.mHeaderProvider.m63103a(recyclerView, childAdapterPosition)) != null) {
                this.mRenderer.drawHeader(recyclerView, canvas, viewM63103a, this.mHeaderPositionCalculator.getHeaderBounds(recyclerView, viewM63103a, childAt, childAdapterPosition));
            }
        }
    }

    public void setTopView(View view) {
        this.mHeaderPositionCalculator.setTopView(view);
    }

    public void setTopViewOffset(int i10) {
        this.mHeaderPositionCalculator.setTopViewOffset(i10);
    }

    private StickyHeadersItemDecoration(InterfaceC20917l interfaceC20917l, DimensionCalculator dimensionCalculator) {
        this(interfaceC20917l, dimensionCalculator, new HeaderRenderer(dimensionCalculator), new C20908c(interfaceC20917l));
    }

    private StickyHeadersItemDecoration(InterfaceC20917l interfaceC20917l, DimensionCalculator dimensionCalculator, HeaderRenderer headerRenderer, C20908c c20908c) {
        this(interfaceC20917l, headerRenderer, c20908c, new HeaderPositionCalculator(interfaceC20917l, c20908c, dimensionCalculator));
    }

    private StickyHeadersItemDecoration(InterfaceC20917l interfaceC20917l, HeaderRenderer headerRenderer, C20908c c20908c, HeaderPositionCalculator headerPositionCalculator) {
        this.mAdapter = interfaceC20917l;
        this.mHeaderProvider = c20908c;
        this.mRenderer = headerRenderer;
        this.mHeaderPositionCalculator = headerPositionCalculator;
    }
}