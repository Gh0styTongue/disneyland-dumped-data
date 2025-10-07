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
public final class VqSelectQueueParkItemBinding implements InterfaceC30606a {
    public final ConstraintLayout parkButton;
    public final TextView parkIcon;
    public final ImageView parkImageActive;
    public final ImageView parkImageInactive;
    public final TextView parkName;
    public final View parkUnderline;
    private final ConstraintLayout rootView;

    private VqSelectQueueParkItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, View view) {
        this.rootView = constraintLayout;
        this.parkButton = constraintLayout2;
        this.parkIcon = textView;
        this.parkImageActive = imageView;
        this.parkImageInactive = imageView2;
        this.parkName = textView2;
        this.parkUnderline = view;
    }

    public static VqSelectQueueParkItemBinding bind(View view) {
        View viewM94321a;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = C21487R.id.parkIcon;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.parkImageActive;
            ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
            if (imageView != null) {
                i10 = C21487R.id.parkImageInactive;
                ImageView imageView2 = (ImageView) C30607b.m94321a(view, i10);
                if (imageView2 != null) {
                    i10 = C21487R.id.parkName;
                    TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                    if (textView2 != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.parkUnderline))) != null) {
                        return new VqSelectQueueParkItemBinding(constraintLayout, constraintLayout, textView, imageView, imageView2, textView2, viewM94321a);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqSelectQueueParkItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqSelectQueueParkItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_select_queue_park_item, viewGroup, false);
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