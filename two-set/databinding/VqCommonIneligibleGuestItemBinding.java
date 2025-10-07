package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonIneligibleGuestItemBinding implements InterfaceC30606a {
    public final TextView guestConflict;
    public final ImageView guestIcon;
    public final ConstraintLayout guestItem;
    public final TextView guestName;
    public final LinearLayout guestNameContainer;
    public final TextView guestPeptasiaIcon;
    private final ConstraintLayout rootView;

    private VqCommonIneligibleGuestItemBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView2, LinearLayout linearLayout, TextView textView3) {
        this.rootView = constraintLayout;
        this.guestConflict = textView;
        this.guestIcon = imageView;
        this.guestItem = constraintLayout2;
        this.guestName = textView2;
        this.guestNameContainer = linearLayout;
        this.guestPeptasiaIcon = textView3;
    }

    public static VqCommonIneligibleGuestItemBinding bind(View view) {
        int i10 = C21487R.id.guestConflict;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.guestIcon;
            ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = C21487R.id.guestName;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    i10 = C21487R.id.guestNameContainer;
                    LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                    if (linearLayout != null) {
                        i10 = C21487R.id.guestPeptasiaIcon;
                        TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                        if (textView3 != null) {
                            return new VqCommonIneligibleGuestItemBinding(constraintLayout, textView, imageView, constraintLayout, textView2, linearLayout, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonIneligibleGuestItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonIneligibleGuestItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_ineligible_guest_item, viewGroup, false);
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