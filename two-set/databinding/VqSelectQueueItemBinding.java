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
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqSelectQueueItemBinding implements InterfaceC30606a {
    public final TextView estimatedWait;
    public final LinearLayout estimatedWaitContainter;
    public final TextView estimatedWaitLabel;
    public final TextView heightRestrictions;
    public final LinearLayout howToEnter;
    public final TextView howToEnterDetail;
    public final TextView howToEnterTitle;
    public final Button hyperlink;
    public final Button joinButton;
    public final TextView locatedAtText;
    public final LinearLayout nextQueueOpenContainter;
    public final TextView nextQueueOpenTime;
    public final TextView nextQueueOpenTimeLabel;
    public final TextView nowBoarding;
    public final LinearLayout nowBoardingContainter;
    public final TextView nowBoardingLabel;
    public final TextView pauseIcon;
    public final TextView pausedMessage;
    public final ConstraintLayout pausedStateContainer;
    public final LinearLayout queueContainer;
    public final ConstraintLayout queueDetailsContainer;
    public final TextView queueIcon;
    public final FrameLayout queueIconOrImage;
    public final ImageView queueImage;
    public final ImageView queueImagePlaceHolder;
    public final TextView queueName;
    public final TextView queueSubPark;
    private final LinearLayout rootView;
    public final Button shareLocationButton;
    public final LinearLayout subParkContainter;
    public final View wideDivider;

    private VqSelectQueueItemBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, LinearLayout linearLayout3, TextView textView4, TextView textView5, Button button, Button button2, TextView textView6, LinearLayout linearLayout4, TextView textView7, TextView textView8, TextView textView9, LinearLayout linearLayout5, TextView textView10, TextView textView11, TextView textView12, ConstraintLayout constraintLayout, LinearLayout linearLayout6, ConstraintLayout constraintLayout2, TextView textView13, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, TextView textView14, TextView textView15, Button button3, LinearLayout linearLayout7, View view) {
        this.rootView = linearLayout;
        this.estimatedWait = textView;
        this.estimatedWaitContainter = linearLayout2;
        this.estimatedWaitLabel = textView2;
        this.heightRestrictions = textView3;
        this.howToEnter = linearLayout3;
        this.howToEnterDetail = textView4;
        this.howToEnterTitle = textView5;
        this.hyperlink = button;
        this.joinButton = button2;
        this.locatedAtText = textView6;
        this.nextQueueOpenContainter = linearLayout4;
        this.nextQueueOpenTime = textView7;
        this.nextQueueOpenTimeLabel = textView8;
        this.nowBoarding = textView9;
        this.nowBoardingContainter = linearLayout5;
        this.nowBoardingLabel = textView10;
        this.pauseIcon = textView11;
        this.pausedMessage = textView12;
        this.pausedStateContainer = constraintLayout;
        this.queueContainer = linearLayout6;
        this.queueDetailsContainer = constraintLayout2;
        this.queueIcon = textView13;
        this.queueIconOrImage = frameLayout;
        this.queueImage = imageView;
        this.queueImagePlaceHolder = imageView2;
        this.queueName = textView14;
        this.queueSubPark = textView15;
        this.shareLocationButton = button3;
        this.subParkContainter = linearLayout7;
        this.wideDivider = view;
    }

    public static VqSelectQueueItemBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.estimatedWait;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.estimatedWaitContainter;
            LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
            if (linearLayout != null) {
                i10 = C21487R.id.estimatedWaitLabel;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    i10 = C21487R.id.heightRestrictions;
                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                    if (textView3 != null) {
                        i10 = C21487R.id.howToEnter;
                        LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = C21487R.id.howToEnterDetail;
                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                            if (textView4 != null) {
                                i10 = C21487R.id.howToEnterTitle;
                                TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                if (textView5 != null) {
                                    i10 = C21487R.id.hyperlink;
                                    Button button = (Button) C30607b.m94321a(view, i10);
                                    if (button != null) {
                                        i10 = C21487R.id.joinButton;
                                        Button button2 = (Button) C30607b.m94321a(view, i10);
                                        if (button2 != null) {
                                            i10 = C21487R.id.locatedAtText;
                                            TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                            if (textView6 != null) {
                                                i10 = C21487R.id.nextQueueOpenContainter;
                                                LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                                if (linearLayout3 != null) {
                                                    i10 = C21487R.id.nextQueueOpenTime;
                                                    TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                                    if (textView7 != null) {
                                                        i10 = C21487R.id.nextQueueOpenTimeLabel;
                                                        TextView textView8 = (TextView) C30607b.m94321a(view, i10);
                                                        if (textView8 != null) {
                                                            i10 = C21487R.id.nowBoarding;
                                                            TextView textView9 = (TextView) C30607b.m94321a(view, i10);
                                                            if (textView9 != null) {
                                                                i10 = C21487R.id.nowBoardingContainter;
                                                                LinearLayout linearLayout4 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                if (linearLayout4 != null) {
                                                                    i10 = C21487R.id.nowBoardingLabel;
                                                                    TextView textView10 = (TextView) C30607b.m94321a(view, i10);
                                                                    if (textView10 != null) {
                                                                        i10 = C21487R.id.pauseIcon;
                                                                        TextView textView11 = (TextView) C30607b.m94321a(view, i10);
                                                                        if (textView11 != null) {
                                                                            i10 = C21487R.id.pausedMessage;
                                                                            TextView textView12 = (TextView) C30607b.m94321a(view, i10);
                                                                            if (textView12 != null) {
                                                                                i10 = C21487R.id.pausedStateContainer;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) C30607b.m94321a(view, i10);
                                                                                if (constraintLayout != null) {
                                                                                    i10 = C21487R.id.queueContainer;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                    if (linearLayout5 != null) {
                                                                                        i10 = C21487R.id.queueDetailsContainer;
                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                                                                        if (constraintLayout2 != null) {
                                                                                            i10 = C21487R.id.queueIcon;
                                                                                            TextView textView13 = (TextView) C30607b.m94321a(view, i10);
                                                                                            if (textView13 != null) {
                                                                                                i10 = C21487R.id.queueIconOrImage;
                                                                                                FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
                                                                                                if (frameLayout != null) {
                                                                                                    i10 = C21487R.id.queueImage;
                                                                                                    ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
                                                                                                    if (imageView != null) {
                                                                                                        i10 = C21487R.id.queueImagePlaceHolder;
                                                                                                        ImageView imageView2 = (ImageView) C30607b.m94321a(view, i10);
                                                                                                        if (imageView2 != null) {
                                                                                                            i10 = C21487R.id.queueName;
                                                                                                            TextView textView14 = (TextView) C30607b.m94321a(view, i10);
                                                                                                            if (textView14 != null) {
                                                                                                                i10 = C21487R.id.queueSubPark;
                                                                                                                TextView textView15 = (TextView) C30607b.m94321a(view, i10);
                                                                                                                if (textView15 != null) {
                                                                                                                    i10 = C21487R.id.shareLocationButton;
                                                                                                                    Button button3 = (Button) C30607b.m94321a(view, i10);
                                                                                                                    if (button3 != null) {
                                                                                                                        i10 = C21487R.id.subParkContainter;
                                                                                                                        LinearLayout linearLayout6 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                                                                        if (linearLayout6 != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.wideDivider))) != null) {
                                                                                                                            return new VqSelectQueueItemBinding((LinearLayout) view, textView, linearLayout, textView2, textView3, linearLayout2, textView4, textView5, button, button2, textView6, linearLayout3, textView7, textView8, textView9, linearLayout4, textView10, textView11, textView12, constraintLayout, linearLayout5, constraintLayout2, textView13, frameLayout, imageView, imageView2, textView14, textView15, button3, linearLayout6, viewM94321a);
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

    public static VqSelectQueueItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqSelectQueueItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_select_queue_item, viewGroup, false);
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