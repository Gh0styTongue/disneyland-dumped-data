package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFragmentCreatePartyBinding implements InterfaceC30606a {
    public final Button continueButton;
    public final FrameLayout continueButtonWrapper;
    public final RecyclerView itemList;
    public final LinearLayout launchingContainer;
    public final TextView launchingMessage;
    public final LottieAnimationView loaderAnimationView;
    public final PtrDisneyContainer pullToRefreshContainer;
    public final Button refreshButton;
    public final TextView refreshMessage;
    public final LinearLayout reviewDetailsScrollContainer;
    public final NestedScrollView reviewDetailsScrollview;
    private final ConstraintLayout rootView;
    public final LinearLayout totalGuestsWarningContainer;
    public final TextView totalGuestsWarningIcon;
    public final TextView totalGuestsWarningText;
    public final ConstraintLayout updateScreenContainer;
    public final TextView updateScreenWarningIcon;
    public final TextView updateScreenWarningText;
    public final TextView updateScreenWarningTitle;
    public final ConstraintLayout vqCreatePartyContainer;

    private VqFragmentCreatePartyBinding(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, LottieAnimationView lottieAnimationView, PtrDisneyContainer ptrDisneyContainer, Button button2, TextView textView2, LinearLayout linearLayout2, NestedScrollView nestedScrollView, LinearLayout linearLayout3, TextView textView3, TextView textView4, ConstraintLayout constraintLayout2, TextView textView5, TextView textView6, TextView textView7, ConstraintLayout constraintLayout3) {
        this.rootView = constraintLayout;
        this.continueButton = button;
        this.continueButtonWrapper = frameLayout;
        this.itemList = recyclerView;
        this.launchingContainer = linearLayout;
        this.launchingMessage = textView;
        this.loaderAnimationView = lottieAnimationView;
        this.pullToRefreshContainer = ptrDisneyContainer;
        this.refreshButton = button2;
        this.refreshMessage = textView2;
        this.reviewDetailsScrollContainer = linearLayout2;
        this.reviewDetailsScrollview = nestedScrollView;
        this.totalGuestsWarningContainer = linearLayout3;
        this.totalGuestsWarningIcon = textView3;
        this.totalGuestsWarningText = textView4;
        this.updateScreenContainer = constraintLayout2;
        this.updateScreenWarningIcon = textView5;
        this.updateScreenWarningText = textView6;
        this.updateScreenWarningTitle = textView7;
        this.vqCreatePartyContainer = constraintLayout3;
    }

    public static VqFragmentCreatePartyBinding bind(View view) {
        int i10 = C21487R.id.continueButton;
        Button button = (Button) C30607b.m94321a(view, i10);
        if (button != null) {
            i10 = C21487R.id.continueButtonWrapper;
            FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
            if (frameLayout != null) {
                i10 = C21487R.id.itemList;
                RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                if (recyclerView != null) {
                    i10 = C21487R.id.launchingContainer;
                    LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                    if (linearLayout != null) {
                        i10 = C21487R.id.launchingMessage;
                        TextView textView = (TextView) C30607b.m94321a(view, i10);
                        if (textView != null) {
                            i10 = C21487R.id.loaderAnimationView;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C30607b.m94321a(view, i10);
                            if (lottieAnimationView != null) {
                                i10 = C21487R.id.pullToRefreshContainer;
                                PtrDisneyContainer ptrDisneyContainer = (PtrDisneyContainer) C30607b.m94321a(view, i10);
                                if (ptrDisneyContainer != null) {
                                    i10 = C21487R.id.refreshButton;
                                    Button button2 = (Button) C30607b.m94321a(view, i10);
                                    if (button2 != null) {
                                        i10 = C21487R.id.refreshMessage;
                                        TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                                        if (textView2 != null) {
                                            i10 = C21487R.id.reviewDetailsScrollContainer;
                                            LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                                            if (linearLayout2 != null) {
                                                i10 = C21487R.id.reviewDetailsScrollview;
                                                NestedScrollView nestedScrollView = (NestedScrollView) C30607b.m94321a(view, i10);
                                                if (nestedScrollView != null) {
                                                    i10 = C21487R.id.totalGuestsWarningContainer;
                                                    LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                                    if (linearLayout3 != null) {
                                                        i10 = C21487R.id.totalGuestsWarningIcon;
                                                        TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                                                        if (textView3 != null) {
                                                            i10 = C21487R.id.totalGuestsWarningText;
                                                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                                                            if (textView4 != null) {
                                                                i10 = C21487R.id.updateScreenContainer;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) C30607b.m94321a(view, i10);
                                                                if (constraintLayout != null) {
                                                                    i10 = C21487R.id.updateScreenWarningIcon;
                                                                    TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                                                    if (textView5 != null) {
                                                                        i10 = C21487R.id.updateScreenWarningText;
                                                                        TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                                                        if (textView6 != null) {
                                                                            i10 = C21487R.id.updateScreenWarningTitle;
                                                                            TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                                                            if (textView7 != null) {
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                                                return new VqFragmentCreatePartyBinding(constraintLayout2, button, frameLayout, recyclerView, linearLayout, textView, lottieAnimationView, ptrDisneyContainer, button2, textView2, linearLayout2, nestedScrollView, linearLayout3, textView3, textView4, constraintLayout, textView5, textView6, textView7, constraintLayout2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentCreatePartyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentCreatePartyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_create_party, viewGroup, false);
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