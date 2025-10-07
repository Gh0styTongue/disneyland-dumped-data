package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCreatePartyYourPartyHeaderBinding implements InterfaceC30606a {
    public final ImageView bottomShadow;
    private final LinearLayout rootView;
    public final LinearLayout sectionHeader;
    public final TextView titleCountText;
    public final TextView titleText;
    public final View topLine;

    private VqCreatePartyYourPartyHeaderBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2, View view) {
        this.rootView = linearLayout;
        this.bottomShadow = imageView;
        this.sectionHeader = linearLayout2;
        this.titleCountText = textView;
        this.titleText = textView2;
        this.topLine = view;
    }

    public static VqCreatePartyYourPartyHeaderBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.bottomShadow;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = C21487R.id.titleCountText;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                i10 = C21487R.id.titleText;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.topLine))) != null) {
                    return new VqCreatePartyYourPartyHeaderBinding(linearLayout, imageView, linearLayout, textView, textView2, viewM94321a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCreatePartyYourPartyHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCreatePartyYourPartyHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_create_party_your_party_header, viewGroup, false);
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