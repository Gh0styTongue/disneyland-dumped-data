package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFragmentBaseBinding implements InterfaceC30606a {
    private final RelativeLayout rootView;
    public final RelativeLayout vqBaseContainer;

    private VqFragmentBaseBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.vqBaseContainer = relativeLayout2;
    }

    public static VqFragmentBaseBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new VqFragmentBaseBinding(relativeLayout, relativeLayout);
    }

    public static VqFragmentBaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentBaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_base, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p763n4.InterfaceC30606a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}