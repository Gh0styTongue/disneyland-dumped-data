package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqActivityMainBinding implements InterfaceC30606a {
    public final FrameLayout fragmentContainer;
    private final RelativeLayout rootView;
    public final SnowballHeader snowballHeader;

    private VqActivityMainBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, SnowballHeader snowballHeader) {
        this.rootView = relativeLayout;
        this.fragmentContainer = frameLayout;
        this.snowballHeader = snowballHeader;
    }

    public static VqActivityMainBinding bind(View view) {
        int i10 = C21487R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
        if (frameLayout != null) {
            i10 = C21487R.id.snowballHeader;
            SnowballHeader snowballHeader = (SnowballHeader) C30607b.m94321a(view, i10);
            if (snowballHeader != null) {
                return new VqActivityMainBinding((RelativeLayout) view, frameLayout, snowballHeader);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_activity_main, viewGroup, false);
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