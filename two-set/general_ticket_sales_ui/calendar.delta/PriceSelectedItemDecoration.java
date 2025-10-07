package com.disney.wdpro.general_ticket_sales_ui.calendar.delta;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C3296a;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;

/* loaded from: classes28.dex */
public class PriceSelectedItemDecoration extends RecyclerView.AbstractC4911n {
    private Drawable backgroundDrawable;
    private int overflowBorderSize;

    public PriceSelectedItemDecoration(Context context) {
        this.backgroundDrawable = C3296a.getDrawable(context, C11971R.drawable.delta_calendar_selected).mutate();
        this.overflowBorderSize = context.getResources().getDimensionPixelSize(C11971R.dimen.calendar_month_selected_cell_overflow);
    }

    private void drawSelectedBackground(Canvas canvas, RecyclerView recyclerView) {
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt.isSelected() && childAt.getVisibility() == 0) {
                this.backgroundDrawable.setBounds(childAt.getLeft() - this.overflowBorderSize, childAt.getTop() - this.overflowBorderSize, childAt.getLeft(), childAt.getBottom() + this.overflowBorderSize);
                this.backgroundDrawable.draw(canvas);
                this.backgroundDrawable.setBounds(childAt.getLeft() - this.overflowBorderSize, childAt.getTop() - this.overflowBorderSize, childAt.getRight() + this.overflowBorderSize, childAt.getTop());
                this.backgroundDrawable.draw(canvas);
                this.backgroundDrawable.setBounds(childAt.getRight(), childAt.getTop() - this.overflowBorderSize, childAt.getRight() + this.overflowBorderSize, childAt.getBottom() + this.overflowBorderSize);
                this.backgroundDrawable.draw(canvas);
                this.backgroundDrawable.setBounds(childAt.getLeft() - this.overflowBorderSize, childAt.getBottom(), childAt.getRight() + this.overflowBorderSize, childAt.getBottom() + this.overflowBorderSize);
                this.backgroundDrawable.draw(canvas);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4911n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C4894a0 c4894a0) {
        drawSelectedBackground(canvas, recyclerView);
    }
}