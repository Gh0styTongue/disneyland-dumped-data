package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFoundationBaseBinding implements InterfaceC30606a {
    private final RelativeLayout rootView;
    public final FrameLayout tabContainer;

    private VqFoundationBaseBinding(RelativeLayout relativeLayout, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.tabContainer = frameLayout;
    }

    public static VqFoundationBaseBinding bind(View view) {
        int i10 = C21487R.id.tabContainer;
        FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
        if (frameLayout != null) {
            return new VqFoundationBaseBinding((RelativeLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFoundationBaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFoundationBaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_foundation_base, viewGroup, false);
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