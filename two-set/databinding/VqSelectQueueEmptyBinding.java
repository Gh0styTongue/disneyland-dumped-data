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
public final class VqSelectQueueEmptyBinding implements InterfaceC30606a {
    private final LinearLayout rootView;
    public final TextView selectQueueEmptyDetail;

    private VqSelectQueueEmptyBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.selectQueueEmptyDetail = textView;
    }

    public static VqSelectQueueEmptyBinding bind(View view) {
        int i10 = C21487R.id.selectQueueEmptyDetail;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            return new VqSelectQueueEmptyBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqSelectQueueEmptyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqSelectQueueEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_select_queue_empty, viewGroup, false);
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