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
public final class VqCommonSectionHeaderBinding implements InterfaceC30606a {
    public final ImageView bottomShadow;
    public final LinearLayout maxPartyWarningContainer;
    public final TextView maxPartyWarningIcon;
    public final TextView maxPartyWarningText;
    private final LinearLayout rootView;
    public final LinearLayout sectionHeader;
    public final TextView titleText;
    public final View topLine;

    private VqCommonSectionHeaderBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2, LinearLayout linearLayout3, TextView textView3, View view) {
        this.rootView = linearLayout;
        this.bottomShadow = imageView;
        this.maxPartyWarningContainer = linearLayout2;
        this.maxPartyWarningIcon = textView;
        this.maxPartyWarningText = textView2;
        this.sectionHeader = linearLayout3;
        this.titleText = textView3;
        this.topLine = view;
    }

    public static VqCommonSectionHeaderBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.bottomShadow;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null) {
            i10 = C21487R.id.maxPartyWarningContainer;
            LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
            if (linearLayout != null) {
                i10 = C21487R.id.maxPartyWarningIcon;
                TextView textView = (TextView) C30607b.m94321a(view, i10);
                if (textView != null) {
                    i10 = C21487R.id.maxPartyWarningText;
                    TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                    if (textView2 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i10 = C21487R.id.titleText;
                        TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                        if (textView3 != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.topLine))) != null) {
                            return new VqCommonSectionHeaderBinding(linearLayout2, imageView, linearLayout, textView, textView2, linearLayout2, textView3, viewM94321a);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_section_header, viewGroup, false);
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