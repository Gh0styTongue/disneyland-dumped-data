package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonBarcodePeekviewBinding implements InterfaceC30606a {
    public final ImageView barcodeImageView;
    public final TextView guestNameTextView;
    public final TextView instructionalTextView;
    private final ConstraintLayout rootView;

    private VqCommonBarcodePeekviewBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.barcodeImageView = imageView;
        this.guestNameTextView = textView;
        this.instructionalTextView = textView2;
    }

    public static VqCommonBarcodePeekviewBinding bind(View view) {
        int i10 = C21487R.id.barcodeImageView;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null) {
            i10 = C21487R.id.guestNameTextView;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                i10 = C21487R.id.instructionalTextView;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    return new VqCommonBarcodePeekviewBinding((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonBarcodePeekviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonBarcodePeekviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_barcode_peekview, viewGroup, false);
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