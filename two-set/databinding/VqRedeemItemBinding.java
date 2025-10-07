package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqRedeemItemBinding implements InterfaceC30606a {
    public final ImageView barcode;
    public final FrameLayout barcodeContainer;
    public final TextView group;
    public final TextView queueTitle;
    public final ConstraintLayout redeemTicketContainer;
    public final TextView returnLabel;
    private final ConstraintLayout rootView;
    public final TextView subparkTextView;
    public final ImageView ticketHeader;
    public final ConstraintLayout ticketHeaderContainer;
    public final ImageView ticketHeaderPlaceholder;
    public final ConstraintLayout ticketHeaderTextContainer;
    public final TextView ticketIdOrPartySize;
    public final ImageView ticketImage;
    public final FrameLayout ticketImageContainer;
    public final TextView ticketImagePlaceholder;
    public final ConstraintLayout ticketInfoContainer;
    public final TextView ticketName;

    private VqRedeemItemBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, ImageView imageView2, ConstraintLayout constraintLayout3, ImageView imageView3, ConstraintLayout constraintLayout4, TextView textView5, ImageView imageView4, FrameLayout frameLayout2, TextView textView6, ConstraintLayout constraintLayout5, TextView textView7) {
        this.rootView = constraintLayout;
        this.barcode = imageView;
        this.barcodeContainer = frameLayout;
        this.group = textView;
        this.queueTitle = textView2;
        this.redeemTicketContainer = constraintLayout2;
        this.returnLabel = textView3;
        this.subparkTextView = textView4;
        this.ticketHeader = imageView2;
        this.ticketHeaderContainer = constraintLayout3;
        this.ticketHeaderPlaceholder = imageView3;
        this.ticketHeaderTextContainer = constraintLayout4;
        this.ticketIdOrPartySize = textView5;
        this.ticketImage = imageView4;
        this.ticketImageContainer = frameLayout2;
        this.ticketImagePlaceholder = textView6;
        this.ticketInfoContainer = constraintLayout5;
        this.ticketName = textView7;
    }

    public static VqRedeemItemBinding bind(View view) {
        int i10 = C21487R.id.barcode;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null) {
            i10 = C21487R.id.barcodeContainer;
            FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
            if (frameLayout != null) {
                i10 = C21487R.id.group;
                TextView textView = (TextView) C30607b.m94321a(view, i10);
                if (textView != null) {
                    i10 = C21487R.id.queueTitle;
                    TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i10 = C21487R.id.returnLabel;
                        TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                        if (textView3 != null) {
                            i10 = C21487R.id.subparkTextView;
                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                            if (textView4 != null) {
                                i10 = C21487R.id.ticketHeader;
                                ImageView imageView2 = (ImageView) C30607b.m94321a(view, i10);
                                if (imageView2 != null) {
                                    i10 = C21487R.id.ticketHeaderContainer;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                    if (constraintLayout2 != null) {
                                        i10 = C21487R.id.ticketHeaderPlaceholder;
                                        ImageView imageView3 = (ImageView) C30607b.m94321a(view, i10);
                                        if (imageView3 != null) {
                                            i10 = C21487R.id.ticketHeaderTextContainer;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                            if (constraintLayout3 != null) {
                                                i10 = C21487R.id.ticketIdOrPartySize;
                                                TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = C21487R.id.ticketImage;
                                                    ImageView imageView4 = (ImageView) C30607b.m94321a(view, i10);
                                                    if (imageView4 != null) {
                                                        i10 = C21487R.id.ticketImageContainer;
                                                        FrameLayout frameLayout2 = (FrameLayout) C30607b.m94321a(view, i10);
                                                        if (frameLayout2 != null) {
                                                            i10 = C21487R.id.ticketImagePlaceholder;
                                                            TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                                            if (textView6 != null) {
                                                                i10 = C21487R.id.ticketInfoContainer;
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) C30607b.m94321a(view, i10);
                                                                if (constraintLayout4 != null) {
                                                                    i10 = C21487R.id.ticketName;
                                                                    TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                                                    if (textView7 != null) {
                                                                        return new VqRedeemItemBinding(constraintLayout, imageView, frameLayout, textView, textView2, constraintLayout, textView3, textView4, imageView2, constraintLayout2, imageView3, constraintLayout3, textView5, imageView4, frameLayout2, textView6, constraintLayout4, textView7);
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

    public static VqRedeemItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqRedeemItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_redeem_item, viewGroup, false);
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