package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonVirtualQueueTapBinding implements InterfaceC30606a {
    private final ConstraintLayout rootView;
    public final ConstraintLayout virtualQueueTapContainer;
    public final TextView virtualQueueTapIcon;

    private VqCommonVirtualQueueTapBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.virtualQueueTapContainer = constraintLayout2;
        this.virtualQueueTapIcon = textView;
    }

    public static VqCommonVirtualQueueTapBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = C21487R.id.virtualQueueTapIcon;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            return new VqCommonVirtualQueueTapBinding(constraintLayout, constraintLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonVirtualQueueTapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonVirtualQueueTapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_virtual_queue_tap, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p763n4.InterfaceC30606a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}