package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
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
public final class VqFragmentConfirmationBinding implements InterfaceC30606a {
    public final TextView bullet1;
    public final LinearLayout bullet1Container;
    public final TextView bullet1Icon;
    public final TextView bullet2;
    public final LinearLayout bullet2Container;
    public final TextView bullet2Icon;
    public final ScrollView confirmationScrollview;
    public final LottieAnimationView fullLoaderAnimationView;
    public final LinearLayout fullLoaderContainer;
    public final TextView fullLoaderText;
    public final RecyclerView queueList;
    private final ConstraintLayout rootView;
    public final Button viewLines;
    public final ConstraintLayout vqConfirmationContainer;
    public final LinearLayout vqConfirmationDetails;
    public final FrameLayout vqConfirmationDetailsContinue;
    public final LinearLayout vqConfirmationScrollContainer;
    public final TextView whatsNext;

    private VqFragmentConfirmationBinding(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, LinearLayout linearLayout2, TextView textView4, ScrollView scrollView, LottieAnimationView lottieAnimationView, LinearLayout linearLayout3, TextView textView5, RecyclerView recyclerView, Button button, ConstraintLayout constraintLayout2, LinearLayout linearLayout4, FrameLayout frameLayout, LinearLayout linearLayout5, TextView textView6) {
        this.rootView = constraintLayout;
        this.bullet1 = textView;
        this.bullet1Container = linearLayout;
        this.bullet1Icon = textView2;
        this.bullet2 = textView3;
        this.bullet2Container = linearLayout2;
        this.bullet2Icon = textView4;
        this.confirmationScrollview = scrollView;
        this.fullLoaderAnimationView = lottieAnimationView;
        this.fullLoaderContainer = linearLayout3;
        this.fullLoaderText = textView5;
        this.queueList = recyclerView;
        this.viewLines = button;
        this.vqConfirmationContainer = constraintLayout2;
        this.vqConfirmationDetails = linearLayout4;
        this.vqConfirmationDetailsContinue = frameLayout;
        this.vqConfirmationScrollContainer = linearLayout5;
        this.whatsNext = textView6;
    }

    public static VqFragmentConfirmationBinding bind(View view) {
        int i10 = C21487R.id.bullet1;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.bullet1Container;
            LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
            if (linearLayout != null) {
                i10 = C21487R.id.bullet1Icon;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    i10 = C21487R.id.bullet2;
                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                    if (textView3 != null) {
                        i10 = C21487R.id.bullet2Container;
                        LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = C21487R.id.bullet2Icon;
                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                            if (textView4 != null) {
                                i10 = C21487R.id.confirmationScrollview;
                                ScrollView scrollView = (ScrollView) C30607b.m94321a(view, i10);
                                if (scrollView != null) {
                                    i10 = C21487R.id.fullLoaderAnimationView;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) C30607b.m94321a(view, i10);
                                    if (lottieAnimationView != null) {
                                        i10 = C21487R.id.fullLoaderContainer;
                                        LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                        if (linearLayout3 != null) {
                                            i10 = C21487R.id.fullLoaderText;
                                            TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                            if (textView5 != null) {
                                                i10 = C21487R.id.queueList;
                                                RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                                                if (recyclerView != null) {
                                                    i10 = C21487R.id.viewLines;
                                                    Button button = (Button) C30607b.m94321a(view, i10);
                                                    if (button != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                        i10 = C21487R.id.vq_confirmation_details;
                                                        LinearLayout linearLayout4 = (LinearLayout) C30607b.m94321a(view, i10);
                                                        if (linearLayout4 != null) {
                                                            i10 = C21487R.id.vq_confirmation_details_continue;
                                                            FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
                                                            if (frameLayout != null) {
                                                                i10 = C21487R.id.vq_confirmation_scroll_container;
                                                                LinearLayout linearLayout5 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                if (linearLayout5 != null) {
                                                                    i10 = C21487R.id.whatsNext;
                                                                    TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                                                    if (textView6 != null) {
                                                                        return new VqFragmentConfirmationBinding(constraintLayout, textView, linearLayout, textView2, textView3, linearLayout2, textView4, scrollView, lottieAnimationView, linearLayout3, textView5, recyclerView, button, constraintLayout, linearLayout4, frameLayout, linearLayout5, textView6);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_confirmation, viewGroup, false);
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