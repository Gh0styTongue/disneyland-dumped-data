package com.disney.wdpro.virtualqueue.p462ui.sticky_headers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes20.dex */
public class DimensionCalculator {
    private Rect getMarginRect(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    public Rect getMargins(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? getMarginRect((ViewGroup.MarginLayoutParams) layoutParams) : new Rect();
    }
}