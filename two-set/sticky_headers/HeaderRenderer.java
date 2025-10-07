package com.disney.wdpro.virtualqueue.p462ui.sticky_headers;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes20.dex */
public class HeaderRenderer {
    private final DimensionCalculator mDimensionCalculator;

    public HeaderRenderer(DimensionCalculator dimensionCalculator) {
        this.mDimensionCalculator = dimensionCalculator;
    }

    private Rect getClipRectForHeader(RecyclerView recyclerView, View view) {
        return new Rect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.mDimensionCalculator.getMargins(view).right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
    }

    public void drawHeader(RecyclerView recyclerView, Canvas canvas, View view, Rect rect) {
        canvas.save();
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            canvas.clipRect(getClipRectForHeader(recyclerView, view));
        }
        canvas.translate(rect.left, rect.top);
        view.draw(canvas);
        canvas.restore();
    }

    public void drawStack(Canvas canvas, View view, Rect rect, float f10) {
        canvas.save();
        canvas.translate(rect.left, rect.top);
        canvas.rotate(f10, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        view.draw(canvas);
        canvas.restore();
    }
}