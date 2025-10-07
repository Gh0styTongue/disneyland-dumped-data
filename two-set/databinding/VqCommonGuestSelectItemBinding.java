package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonGuestSelectItemBinding implements InterfaceC30606a {
    public final CheckBox guestCheckBox;
    public final ImageView guestIcon;
    public final ConstraintLayout guestItem;
    public final TextView guestName;
    public final TextView guestPeptasiaIcon;
    private final ConstraintLayout rootView;

    private VqCommonGuestSelectItemBinding(ConstraintLayout constraintLayout, CheckBox checkBox, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.guestCheckBox = checkBox;
        this.guestIcon = imageView;
        this.guestItem = constraintLayout2;
        this.guestName = textView;
        this.guestPeptasiaIcon = textView2;
    }

    public static VqCommonGuestSelectItemBinding bind(View view) {
        int i10 = C21487R.id.guestCheckBox;
        CheckBox checkBox = (CheckBox) C30607b.m94321a(view, i10);
        if (checkBox != null) {
            i10 = C21487R.id.guestIcon;
            ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = C21487R.id.guestName;
                TextView textView = (TextView) C30607b.m94321a(view, i10);
                if (textView != null) {
                    i10 = C21487R.id.guestPeptasiaIcon;
                    TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                    if (textView2 != null) {
                        return new VqCommonGuestSelectItemBinding(constraintLayout, checkBox, imageView, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonGuestSelectItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonGuestSelectItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_guest_select_item, viewGroup, false);
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