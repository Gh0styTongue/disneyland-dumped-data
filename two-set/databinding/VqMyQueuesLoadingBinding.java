package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqMyQueuesLoadingBinding implements InterfaceC30606a {
    private final FrameLayout rootView;

    private VqMyQueuesLoadingBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static VqMyQueuesLoadingBinding bind(View view) {
        if (view != null) {
            return new VqMyQueuesLoadingBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static VqMyQueuesLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqMyQueuesLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_my_queues_loading, viewGroup, false);
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