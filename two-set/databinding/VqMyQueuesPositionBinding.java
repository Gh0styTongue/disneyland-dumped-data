package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.support.widget.ExpandableView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqMyQueuesPositionBinding implements InterfaceC30606a {
    public final TextView anonymousGroupText;
    public final View bottomLine;
    public final View bottomSeparator;
    public final ImageView bottomShadow;
    public final TextView disclaimerText;
    public final ExpandableView expandableView;
    public final ConstraintLayout groupContainer;
    public final RecyclerView groupList;
    public final FrameLayout groupParent;
    public final TextView groupStatusAlertIcon;
    public final TextView groupStatusAlertText;
    public final TextView groupStatusText;
    public final TextView groupText;
    public final TextView locatedAtText;
    public final TextView nowBoardingText;
    public final Button positionHyperlink;
    public final Button primaryCTAButton;
    public final LottieAnimationView progressAnimation;
    public final LinearLayout progressAnimationContainer;
    public final LottieAnimationView progressBar;
    public final FrameLayout progressBarContainer;
    public final LinearLayout progressContainer;
    public final TextView progressPlaceholder;
    public final TextView progressText;
    public final ConstraintLayout queueNameContainer;
    public final TextView queuePark;
    public final TextView queueSubPark;
    public final TextView queueTitle;
    public final Button removeGuests;
    private final LinearLayout rootView;
    public final Button secondaryCTAButton;
    public final LinearLayout subParkContainer;
    public final View underYourPartyLine;

    private VqMyQueuesPositionBinding(LinearLayout linearLayout, TextView textView, View view, View view2, ImageView imageView, TextView textView2, ExpandableView expandableView, ConstraintLayout constraintLayout, RecyclerView recyclerView, FrameLayout frameLayout, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, Button button, Button button2, LottieAnimationView lottieAnimationView, LinearLayout linearLayout2, LottieAnimationView lottieAnimationView2, FrameLayout frameLayout2, LinearLayout linearLayout3, TextView textView9, TextView textView10, ConstraintLayout constraintLayout2, TextView textView11, TextView textView12, TextView textView13, Button button3, Button button4, LinearLayout linearLayout4, View view3) {
        this.rootView = linearLayout;
        this.anonymousGroupText = textView;
        this.bottomLine = view;
        this.bottomSeparator = view2;
        this.bottomShadow = imageView;
        this.disclaimerText = textView2;
        this.expandableView = expandableView;
        this.groupContainer = constraintLayout;
        this.groupList = recyclerView;
        this.groupParent = frameLayout;
        this.groupStatusAlertIcon = textView3;
        this.groupStatusAlertText = textView4;
        this.groupStatusText = textView5;
        this.groupText = textView6;
        this.locatedAtText = textView7;
        this.nowBoardingText = textView8;
        this.positionHyperlink = button;
        this.primaryCTAButton = button2;
        this.progressAnimation = lottieAnimationView;
        this.progressAnimationContainer = linearLayout2;
        this.progressBar = lottieAnimationView2;
        this.progressBarContainer = frameLayout2;
        this.progressContainer = linearLayout3;
        this.progressPlaceholder = textView9;
        this.progressText = textView10;
        this.queueNameContainer = constraintLayout2;
        this.queuePark = textView11;
        this.queueSubPark = textView12;
        this.queueTitle = textView13;
        this.removeGuests = button3;
        this.secondaryCTAButton = button4;
        this.subParkContainer = linearLayout4;
        this.underYourPartyLine = view3;
    }

    public static VqMyQueuesPositionBinding bind(View view) {
        View viewM94321a;
        View viewM94321a2;
        View viewM94321a3;
        int i10 = C21487R.id.anonymousGroupText;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.bottomLine))) != null && (viewM94321a2 = C30607b.m94321a(view, (i10 = C21487R.id.bottomSeparator))) != null) {
            i10 = C21487R.id.bottomShadow;
            ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
            if (imageView != null) {
                i10 = C21487R.id.disclaimerText;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    i10 = C21487R.id.expandableView;
                    ExpandableView expandableView = (ExpandableView) C30607b.m94321a(view, i10);
                    if (expandableView != null) {
                        i10 = C21487R.id.groupContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C30607b.m94321a(view, i10);
                        if (constraintLayout != null) {
                            i10 = C21487R.id.groupList;
                            RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                            if (recyclerView != null) {
                                i10 = C21487R.id.groupParent;
                                FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
                                if (frameLayout != null) {
                                    i10 = C21487R.id.groupStatusAlertIcon;
                                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                                    if (textView3 != null) {
                                        i10 = C21487R.id.groupStatusAlertText;
                                        TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                                        if (textView4 != null) {
                                            i10 = C21487R.id.groupStatusText;
                                            TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                            if (textView5 != null) {
                                                i10 = C21487R.id.groupText;
                                                TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                                if (textView6 != null) {
                                                    i10 = C21487R.id.locatedAtText;
                                                    TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                                    if (textView7 != null) {
                                                        i10 = C21487R.id.nowBoardingText;
                                                        TextView textView8 = (TextView) C30607b.m94321a(view, i10);
                                                        if (textView8 != null) {
                                                            i10 = C21487R.id.positionHyperlink;
                                                            Button button = (Button) C30607b.m94321a(view, i10);
                                                            if (button != null) {
                                                                i10 = C21487R.id.primaryCTAButton;
                                                                Button button2 = (Button) C30607b.m94321a(view, i10);
                                                                if (button2 != null) {
                                                                    i10 = C21487R.id.progressAnimation;
                                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) C30607b.m94321a(view, i10);
                                                                    if (lottieAnimationView != null) {
                                                                        i10 = C21487R.id.progressAnimationContainer;
                                                                        LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                                                                        if (linearLayout != null) {
                                                                            i10 = C21487R.id.progressBar;
                                                                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) C30607b.m94321a(view, i10);
                                                                            if (lottieAnimationView2 != null) {
                                                                                i10 = C21487R.id.progressBarContainer;
                                                                                FrameLayout frameLayout2 = (FrameLayout) C30607b.m94321a(view, i10);
                                                                                if (frameLayout2 != null) {
                                                                                    i10 = C21487R.id.progressContainer;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = C21487R.id.progressPlaceholder;
                                                                                        TextView textView9 = (TextView) C30607b.m94321a(view, i10);
                                                                                        if (textView9 != null) {
                                                                                            i10 = C21487R.id.progressText;
                                                                                            TextView textView10 = (TextView) C30607b.m94321a(view, i10);
                                                                                            if (textView10 != null) {
                                                                                                i10 = C21487R.id.queueNameContainer;
                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                                                                                if (constraintLayout2 != null) {
                                                                                                    i10 = C21487R.id.queuePark;
                                                                                                    TextView textView11 = (TextView) C30607b.m94321a(view, i10);
                                                                                                    if (textView11 != null) {
                                                                                                        i10 = C21487R.id.queueSubPark;
                                                                                                        TextView textView12 = (TextView) C30607b.m94321a(view, i10);
                                                                                                        if (textView12 != null) {
                                                                                                            i10 = C21487R.id.queueTitle;
                                                                                                            TextView textView13 = (TextView) C30607b.m94321a(view, i10);
                                                                                                            if (textView13 != null) {
                                                                                                                i10 = C21487R.id.removeGuests;
                                                                                                                Button button3 = (Button) C30607b.m94321a(view, i10);
                                                                                                                if (button3 != null) {
                                                                                                                    i10 = C21487R.id.secondaryCTAButton;
                                                                                                                    Button button4 = (Button) C30607b.m94321a(view, i10);
                                                                                                                    if (button4 != null) {
                                                                                                                        i10 = C21487R.id.subParkContainer;
                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                                                        if (linearLayout3 != null && (viewM94321a3 = C30607b.m94321a(view, (i10 = C21487R.id.underYourPartyLine))) != null) {
                                                                                                                            return new VqMyQueuesPositionBinding((LinearLayout) view, textView, viewM94321a, viewM94321a2, imageView, textView2, expandableView, constraintLayout, recyclerView, frameLayout, textView3, textView4, textView5, textView6, textView7, textView8, button, button2, lottieAnimationView, linearLayout, lottieAnimationView2, frameLayout2, linearLayout2, textView9, textView10, constraintLayout2, textView11, textView12, textView13, button3, button4, linearLayout3, viewM94321a3);
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

    public static VqMyQueuesPositionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqMyQueuesPositionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_my_queues_position, viewGroup, false);
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