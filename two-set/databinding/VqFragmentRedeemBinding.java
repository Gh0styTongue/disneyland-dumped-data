package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFragmentRedeemBinding implements InterfaceC30606a {
    public final Button doneButton;
    public final LinearLayout doneContainer;
    public final LinearLayout errorContainer;
    public final TextView errorDetail;
    public final TextView errorTitle;
    public final LottieAnimationView fullLoaderAnimationView;
    public final LinearLayout fullLoaderContainer;
    public final TextView fullLoaderText;
    public final ConstraintLayout redeemContainer;
    private final ConstraintLayout rootView;
    public final ScrollView scroller;
    public final ConstraintLayout ticketContainer;
    public final TextView ticketCountIndicator;
    public final RecyclerView ticketRecycler;

    private VqFragmentRedeemBinding(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, LottieAnimationView lottieAnimationView, LinearLayout linearLayout3, TextView textView3, ConstraintLayout constraintLayout2, ScrollView scrollView, ConstraintLayout constraintLayout3, TextView textView4, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.doneButton = button;
        this.doneContainer = linearLayout;
        this.errorContainer = linearLayout2;
        this.errorDetail = textView;
        this.errorTitle = textView2;
        this.fullLoaderAnimationView = lottieAnimationView;
        this.fullLoaderContainer = linearLayout3;
        this.fullLoaderText = textView3;
        this.redeemContainer = constraintLayout2;
        this.scroller = scrollView;
        this.ticketContainer = constraintLayout3;
        this.ticketCountIndicator = textView4;
        this.ticketRecycler = recyclerView;
    }

    public static VqFragmentRedeemBinding bind(View view) {
        int i10 = C21487R.id.doneButton;
        Button button = (Button) C30607b.m94321a(view, i10);
        if (button != null) {
            i10 = C21487R.id.doneContainer;
            LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
            if (linearLayout != null) {
                i10 = C21487R.id.errorContainer;
                LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                if (linearLayout2 != null) {
                    i10 = C21487R.id.errorDetail;
                    TextView textView = (TextView) C30607b.m94321a(view, i10);
                    if (textView != null) {
                        i10 = C21487R.id.errorTitle;
                        TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                        if (textView2 != null) {
                            i10 = C21487R.id.fullLoaderAnimationView;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C30607b.m94321a(view, i10);
                            if (lottieAnimationView != null) {
                                i10 = C21487R.id.fullLoaderContainer;
                                LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                if (linearLayout3 != null) {
                                    i10 = C21487R.id.fullLoaderText;
                                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                                    if (textView3 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i10 = C21487R.id.scroller;
                                        ScrollView scrollView = (ScrollView) C30607b.m94321a(view, i10);
                                        if (scrollView != null) {
                                            i10 = C21487R.id.ticketContainer;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                            if (constraintLayout2 != null) {
                                                i10 = C21487R.id.ticketCountIndicator;
                                                TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                                                if (textView4 != null) {
                                                    i10 = C21487R.id.ticketRecycler;
                                                    RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                                                    if (recyclerView != null) {
                                                        return new VqFragmentRedeemBinding(constraintLayout, button, linearLayout, linearLayout2, textView, textView2, lottieAnimationView, linearLayout3, textView3, constraintLayout, scrollView, constraintLayout2, textView4, recyclerView);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentRedeemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentRedeemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_redeem, viewGroup, false);
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