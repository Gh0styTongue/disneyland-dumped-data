package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonLoadingBinding implements InterfaceC30606a {
    public final LottieAnimationView fullLoaderAnimationView;
    public final TextView fullLoaderText;
    public final LinearLayout loader;
    public final FrameLayout loaderContainer;
    private final FrameLayout rootView;

    private VqCommonLoadingBinding(FrameLayout frameLayout, LottieAnimationView lottieAnimationView, TextView textView, LinearLayout linearLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.fullLoaderAnimationView = lottieAnimationView;
        this.fullLoaderText = textView;
        this.loader = linearLayout;
        this.loaderContainer = frameLayout2;
    }

    public static VqCommonLoadingBinding bind(View view) {
        int i10 = C21487R.id.fullLoaderAnimationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C30607b.m94321a(view, i10);
        if (lottieAnimationView != null) {
            i10 = C21487R.id.fullLoaderText;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                i10 = C21487R.id.loader;
                LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                if (linearLayout != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    return new VqCommonLoadingBinding(frameLayout, lottieAnimationView, textView, linearLayout, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_loading, viewGroup, false);
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