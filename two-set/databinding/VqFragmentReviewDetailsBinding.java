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
public final class VqFragmentReviewDetailsBinding implements InterfaceC30606a {
    public final Button continueButton;
    public final FrameLayout continueContainer;
    public final LottieAnimationView fullLoaderAnimationView;
    public final LinearLayout fullLoaderContainer;
    public final TextView fullLoaderText;
    public final RecyclerView groupList;
    public final FrameLayout groupParent;
    public final TextView heightRestrictions;
    public final LinearLayout howToEnter;
    public final TextView howToEnterDetail;
    public final TextView howToEnterTitle;
    public final RecyclerView ineligibleGroupList;
    public final FrameLayout ineligibleGroupParent;
    public final Button ineligibleHeaderCTAButton;
    public final LinearLayout ineligibleHeaderGroup;
    public final TextView ineligibleHeaderText;
    public final LinearLayout launchingContainer;
    public final TextView launchingMessage;
    public final LottieAnimationView loaderAnimationView;
    public final TextView locatedAtTextView;
    public final LinearLayout partyGroup;
    public final Button partyHeaderCTAButton;
    public final PtrDisneyContainer pullToRefreshContainer;
    public final LinearLayout queueNameContainer;
    public final TextView queueParkTextView;
    public final TextView queueSubParkTextView;
    public final TextView queueTitle;
    public final Button refreshButton;
    public final TextView refreshMessage;
    public final ConstraintLayout reviewContainer;
    public final LinearLayout reviewDetailsScrollContainer;
    public final NestedScrollView reviewDetailsScrollview;
    private final ConstraintLayout rootView;
    public final LinearLayout subParkContainer;
    public final View underHowToEnterLine;
    public final View underYourPartyLine;
    public final ConstraintLayout updateScreenContainer;
    public final TextView updateScreenWarningIcon;
    public final TextView updateScreenWarningText;
    public final TextView updateScreenWarningTitle;
    public final TextView validOnText;
    public final TextView virtualQueueTitle;
    public final TextView yourPartyAlertIcon;
    public final TextView yourPartyAlertText;
    public final TextView yourPartyCountText;
    public final TextView yourPartyHeaderText;
    public final ConstraintLayout yourPartyWarningContainer;

    private VqFragmentReviewDetailsBinding(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, FrameLayout frameLayout2, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, RecyclerView recyclerView2, FrameLayout frameLayout3, Button button2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, TextView textView6, LottieAnimationView lottieAnimationView2, TextView textView7, LinearLayout linearLayout5, Button button3, PtrDisneyContainer ptrDisneyContainer, LinearLayout linearLayout6, TextView textView8, TextView textView9, TextView textView10, Button button4, TextView textView11, ConstraintLayout constraintLayout2, LinearLayout linearLayout7, NestedScrollView nestedScrollView, LinearLayout linearLayout8, View view, View view2, ConstraintLayout constraintLayout3, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, ConstraintLayout constraintLayout4) {
        this.rootView = constraintLayout;
        this.continueButton = button;
        this.continueContainer = frameLayout;
        this.fullLoaderAnimationView = lottieAnimationView;
        this.fullLoaderContainer = linearLayout;
        this.fullLoaderText = textView;
        this.groupList = recyclerView;
        this.groupParent = frameLayout2;
        this.heightRestrictions = textView2;
        this.howToEnter = linearLayout2;
        this.howToEnterDetail = textView3;
        this.howToEnterTitle = textView4;
        this.ineligibleGroupList = recyclerView2;
        this.ineligibleGroupParent = frameLayout3;
        this.ineligibleHeaderCTAButton = button2;
        this.ineligibleHeaderGroup = linearLayout3;
        this.ineligibleHeaderText = textView5;
        this.launchingContainer = linearLayout4;
        this.launchingMessage = textView6;
        this.loaderAnimationView = lottieAnimationView2;
        this.locatedAtTextView = textView7;
        this.partyGroup = linearLayout5;
        this.partyHeaderCTAButton = button3;
        this.pullToRefreshContainer = ptrDisneyContainer;
        this.queueNameContainer = linearLayout6;
        this.queueParkTextView = textView8;
        this.queueSubParkTextView = textView9;
        this.queueTitle = textView10;
        this.refreshButton = button4;
        this.refreshMessage = textView11;
        this.reviewContainer = constraintLayout2;
        this.reviewDetailsScrollContainer = linearLayout7;
        this.reviewDetailsScrollview = nestedScrollView;
        this.subParkContainer = linearLayout8;
        this.underHowToEnterLine = view;
        this.underYourPartyLine = view2;
        this.updateScreenContainer = constraintLayout3;
        this.updateScreenWarningIcon = textView12;
        this.updateScreenWarningText = textView13;
        this.updateScreenWarningTitle = textView14;
        this.validOnText = textView15;
        this.virtualQueueTitle = textView16;
        this.yourPartyAlertIcon = textView17;
        this.yourPartyAlertText = textView18;
        this.yourPartyCountText = textView19;
        this.yourPartyHeaderText = textView20;
        this.yourPartyWarningContainer = constraintLayout4;
    }

    public static VqFragmentReviewDetailsBinding bind(View view) {
        View viewM94321a;
        View viewM94321a2;
        int i10 = C21487R.id.continueButton;
        Button button = (Button) C30607b.m94321a(view, i10);
        if (button != null) {
            i10 = C21487R.id.continueContainer;
            FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
            if (frameLayout != null) {
                i10 = C21487R.id.fullLoaderAnimationView;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) C30607b.m94321a(view, i10);
                if (lottieAnimationView != null) {
                    i10 = C21487R.id.fullLoaderContainer;
                    LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                    if (linearLayout != null) {
                        i10 = C21487R.id.fullLoaderText;
                        TextView textView = (TextView) C30607b.m94321a(view, i10);
                        if (textView != null) {
                            i10 = C21487R.id.groupList;
                            RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                            if (recyclerView != null) {
                                i10 = C21487R.id.groupParent;
                                FrameLayout frameLayout2 = (FrameLayout) C30607b.m94321a(view, i10);
                                if (frameLayout2 != null) {
                                    i10 = C21487R.id.heightRestrictions;
                                    TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                                    if (textView2 != null) {
                                        i10 = C21487R.id.howToEnter;
                                        LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                                        if (linearLayout2 != null) {
                                            i10 = C21487R.id.howToEnterDetail;
                                            TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                                            if (textView3 != null) {
                                                i10 = C21487R.id.howToEnterTitle;
                                                TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                                                if (textView4 != null) {
                                                    i10 = C21487R.id.ineligibleGroupList;
                                                    RecyclerView recyclerView2 = (RecyclerView) C30607b.m94321a(view, i10);
                                                    if (recyclerView2 != null) {
                                                        i10 = C21487R.id.ineligibleGroupParent;
                                                        FrameLayout frameLayout3 = (FrameLayout) C30607b.m94321a(view, i10);
                                                        if (frameLayout3 != null) {
                                                            i10 = C21487R.id.ineligibleHeaderCTAButton;
                                                            Button button2 = (Button) C30607b.m94321a(view, i10);
                                                            if (button2 != null) {
                                                                i10 = C21487R.id.ineligibleHeaderGroup;
                                                                LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                if (linearLayout3 != null) {
                                                                    i10 = C21487R.id.ineligibleHeaderText;
                                                                    TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                                                    if (textView5 != null) {
                                                                        i10 = C21487R.id.launchingContainer;
                                                                        LinearLayout linearLayout4 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                        if (linearLayout4 != null) {
                                                                            i10 = C21487R.id.launchingMessage;
                                                                            TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                                                            if (textView6 != null) {
                                                                                i10 = C21487R.id.loaderAnimationView;
                                                                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) C30607b.m94321a(view, i10);
                                                                                if (lottieAnimationView2 != null) {
                                                                                    i10 = C21487R.id.locatedAtTextView;
                                                                                    TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                                                                    if (textView7 != null) {
                                                                                        i10 = C21487R.id.partyGroup;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                        if (linearLayout5 != null) {
                                                                                            i10 = C21487R.id.partyHeaderCTAButton;
                                                                                            Button button3 = (Button) C30607b.m94321a(view, i10);
                                                                                            if (button3 != null) {
                                                                                                i10 = C21487R.id.pullToRefreshContainer;
                                                                                                PtrDisneyContainer ptrDisneyContainer = (PtrDisneyContainer) C30607b.m94321a(view, i10);
                                                                                                if (ptrDisneyContainer != null) {
                                                                                                    i10 = C21487R.id.queueNameContainer;
                                                                                                    LinearLayout linearLayout6 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                                    if (linearLayout6 != null) {
                                                                                                        i10 = C21487R.id.queueParkTextView;
                                                                                                        TextView textView8 = (TextView) C30607b.m94321a(view, i10);
                                                                                                        if (textView8 != null) {
                                                                                                            i10 = C21487R.id.queueSubParkTextView;
                                                                                                            TextView textView9 = (TextView) C30607b.m94321a(view, i10);
                                                                                                            if (textView9 != null) {
                                                                                                                i10 = C21487R.id.queueTitle;
                                                                                                                TextView textView10 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                if (textView10 != null) {
                                                                                                                    i10 = C21487R.id.refreshButton;
                                                                                                                    Button button4 = (Button) C30607b.m94321a(view, i10);
                                                                                                                    if (button4 != null) {
                                                                                                                        i10 = C21487R.id.refreshMessage;
                                                                                                                        TextView textView11 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                        if (textView11 != null) {
                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                                                            i10 = C21487R.id.reviewDetailsScrollContainer;
                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                i10 = C21487R.id.reviewDetailsScrollview;
                                                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) C30607b.m94321a(view, i10);
                                                                                                                                if (nestedScrollView != null) {
                                                                                                                                    i10 = C21487R.id.subParkContainer;
                                                                                                                                    LinearLayout linearLayout8 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                                                                    if (linearLayout8 != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.underHowToEnterLine))) != null && (viewM94321a2 = C30607b.m94321a(view, (i10 = C21487R.id.underYourPartyLine))) != null) {
                                                                                                                                        i10 = C21487R.id.updateScreenContainer;
                                                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                                                                                                                        if (constraintLayout2 != null) {
                                                                                                                                            i10 = C21487R.id.updateScreenWarningIcon;
                                                                                                                                            TextView textView12 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                            if (textView12 != null) {
                                                                                                                                                i10 = C21487R.id.updateScreenWarningText;
                                                                                                                                                TextView textView13 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                if (textView13 != null) {
                                                                                                                                                    i10 = C21487R.id.updateScreenWarningTitle;
                                                                                                                                                    TextView textView14 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                        i10 = C21487R.id.validOnText;
                                                                                                                                                        TextView textView15 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                            i10 = C21487R.id.virtualQueueTitle;
                                                                                                                                                            TextView textView16 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                i10 = C21487R.id.yourPartyAlertIcon;
                                                                                                                                                                TextView textView17 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                                if (textView17 != null) {
                                                                                                                                                                    i10 = C21487R.id.yourPartyAlertText;
                                                                                                                                                                    TextView textView18 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                        i10 = C21487R.id.yourPartyCountText;
                                                                                                                                                                        TextView textView19 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                                            i10 = C21487R.id.yourPartyHeaderText;
                                                                                                                                                                            TextView textView20 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                                i10 = C21487R.id.yourPartyWarningContainer;
                                                                                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                                                                                                                                                                if (constraintLayout3 != null) {
                                                                                                                                                                                    return new VqFragmentReviewDetailsBinding(constraintLayout, button, frameLayout, lottieAnimationView, linearLayout, textView, recyclerView, frameLayout2, textView2, linearLayout2, textView3, textView4, recyclerView2, frameLayout3, button2, linearLayout3, textView5, linearLayout4, textView6, lottieAnimationView2, textView7, linearLayout5, button3, ptrDisneyContainer, linearLayout6, textView8, textView9, textView10, button4, textView11, constraintLayout, linearLayout7, nestedScrollView, linearLayout8, viewM94321a, viewM94321a2, constraintLayout2, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, constraintLayout3);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentReviewDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentReviewDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_review_details, viewGroup, false);
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