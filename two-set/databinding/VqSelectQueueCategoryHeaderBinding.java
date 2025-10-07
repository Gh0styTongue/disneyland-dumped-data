package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqSelectQueueCategoryHeaderBinding implements InterfaceC30606a {
    public final View bottomLine;
    public final LinearLayout categoryHeader;
    private final LinearLayout rootView;
    public final TextView titleText;

    private VqSelectQueueCategoryHeaderBinding(LinearLayout linearLayout, View view, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.bottomLine = view;
        this.categoryHeader = linearLayout2;
        this.titleText = textView;
    }

    public static VqSelectQueueCategoryHeaderBinding bind(View view) {
        int i10 = C21487R.id.bottomLine;
        View viewM94321a = C30607b.m94321a(view, i10);
        if (viewM94321a != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i11 = C21487R.id.titleText;
            TextView textView = (TextView) C30607b.m94321a(view, i11);
            if (textView != null) {
                return new VqSelectQueueCategoryHeaderBinding(linearLayout, viewM94321a, linearLayout, textView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqSelectQueueCategoryHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqSelectQueueCategoryHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_select_queue_category_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p763n4.InterfaceC30606a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}