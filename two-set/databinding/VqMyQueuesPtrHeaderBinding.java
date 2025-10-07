package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqMyQueuesPtrHeaderBinding implements InterfaceC30606a {
    public final LottieAnimationView loaderAnimationView;
    public final TextView loadingMessage;
    private final LinearLayout rootView;

    private VqMyQueuesPtrHeaderBinding(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, TextView textView) {
        this.rootView = linearLayout;
        this.loaderAnimationView = lottieAnimationView;
        this.loadingMessage = textView;
    }

    public static VqMyQueuesPtrHeaderBinding bind(View view) {
        int i10 = C21487R.id.loaderAnimationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C30607b.m94321a(view, i10);
        if (lottieAnimationView != null) {
            i10 = C21487R.id.loadingMessage;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                return new VqMyQueuesPtrHeaderBinding((LinearLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqMyQueuesPtrHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqMyQueuesPtrHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_my_queues_ptr_header, viewGroup, false);
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