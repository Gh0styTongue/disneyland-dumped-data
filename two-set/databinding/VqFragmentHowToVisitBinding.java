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
public final class VqFragmentHowToVisitBinding implements InterfaceC30606a {
    public final TextView bullet1Icon;
    public final TextView bullet2Icon;
    public final Button continueButton;
    public final TextView disclaimerText;
    public final ImageView heroImage;
    public final TextView heroPlaceholder;
    public final TextView joinBullet;
    public final LinearLayout joinWrapper;
    public final TextView notificationBullet;
    public final TextView notificationIcon;
    public final LinearLayout notificationWrapper;
    private final ConstraintLayout rootView;
    public final TextView scanText;
    public final LinearLayout scanWrapper;
    public final TextView title;
    public final View vqChoosePartyLine;
    public final LinearLayout vqHowToVisitContainer;
    public final FrameLayout vqHowToVisitContinueContainer;

    private VqFragmentHowToVisitBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Button button, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, LinearLayout linearLayout, TextView textView6, TextView textView7, LinearLayout linearLayout2, TextView textView8, LinearLayout linearLayout3, TextView textView9, View view, LinearLayout linearLayout4, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.bullet1Icon = textView;
        this.bullet2Icon = textView2;
        this.continueButton = button;
        this.disclaimerText = textView3;
        this.heroImage = imageView;
        this.heroPlaceholder = textView4;
        this.joinBullet = textView5;
        this.joinWrapper = linearLayout;
        this.notificationBullet = textView6;
        this.notificationIcon = textView7;
        this.notificationWrapper = linearLayout2;
        this.scanText = textView8;
        this.scanWrapper = linearLayout3;
        this.title = textView9;
        this.vqChoosePartyLine = view;
        this.vqHowToVisitContainer = linearLayout4;
        this.vqHowToVisitContinueContainer = frameLayout;
    }

    public static VqFragmentHowToVisitBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.bullet1Icon;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.bullet2Icon;
            TextView textView2 = (TextView) C30607b.m94321a(view, i10);
            if (textView2 != null) {
                i10 = C21487R.id.continueButton;
                Button button = (Button) C30607b.m94321a(view, i10);
                if (button != null) {
                    i10 = C21487R.id.disclaimerText;
                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                    if (textView3 != null) {
                        i10 = C21487R.id.heroImage;
                        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
                        if (imageView != null) {
                            i10 = C21487R.id.heroPlaceholder;
                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                            if (textView4 != null) {
                                i10 = C21487R.id.joinBullet;
                                TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                if (textView5 != null) {
                                    i10 = C21487R.id.joinWrapper;
                                    LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                                    if (linearLayout != null) {
                                        i10 = C21487R.id.notificationBullet;
                                        TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                        if (textView6 != null) {
                                            i10 = C21487R.id.notificationIcon;
                                            TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                            if (textView7 != null) {
                                                i10 = C21487R.id.notificationWrapper;
                                                LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                                                if (linearLayout2 != null) {
                                                    i10 = C21487R.id.scanText;
                                                    TextView textView8 = (TextView) C30607b.m94321a(view, i10);
                                                    if (textView8 != null) {
                                                        i10 = C21487R.id.scanWrapper;
                                                        LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                                        if (linearLayout3 != null) {
                                                            i10 = C21487R.id.title;
                                                            TextView textView9 = (TextView) C30607b.m94321a(view, i10);
                                                            if (textView9 != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.vq_choose_party_line))) != null) {
                                                                i10 = C21487R.id.vq_how_to_visit_container;
                                                                LinearLayout linearLayout4 = (LinearLayout) C30607b.m94321a(view, i10);
                                                                if (linearLayout4 != null) {
                                                                    i10 = C21487R.id.vq_how_to_visit_continue_container;
                                                                    FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
                                                                    if (frameLayout != null) {
                                                                        return new VqFragmentHowToVisitBinding((ConstraintLayout) view, textView, textView2, button, textView3, imageView, textView4, textView5, linearLayout, textView6, textView7, linearLayout2, textView8, linearLayout3, textView9, viewM94321a, linearLayout4, frameLayout);
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

    public static VqFragmentHowToVisitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentHowToVisitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_how_to_visit, viewGroup, false);
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