package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqSelectQueueDisclaimerBinding implements InterfaceC30606a {
    public final TextView disclaimerText;
    private final FrameLayout rootView;

    private VqSelectQueueDisclaimerBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.disclaimerText = textView;
    }

    public static VqSelectQueueDisclaimerBinding bind(View view) {
        int i10 = C21487R.id.disclaimerText;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            return new VqSelectQueueDisclaimerBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqSelectQueueDisclaimerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqSelectQueueDisclaimerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_select_queue_disclaimer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p763n4.InterfaceC30606a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}