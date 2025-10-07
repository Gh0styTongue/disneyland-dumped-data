package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonDetailBinding implements InterfaceC30606a {
    private final LinearLayout rootView;
    public final TextView vqConflictDetailText;
    public final TextView vqConflictHeaderText;
    public final View vqConflictHeaderTopLine;

    private VqCommonDetailBinding(LinearLayout linearLayout, TextView textView, TextView textView2, View view) {
        this.rootView = linearLayout;
        this.vqConflictDetailText = textView;
        this.vqConflictHeaderText = textView2;
        this.vqConflictHeaderTopLine = view;
    }

    public static VqCommonDetailBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.vq_conflict_detail_text;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.vq_conflict_header_text;
            TextView textView2 = (TextView) C30607b.m94321a(view, i10);
            if (textView2 != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.vq_conflict_header_top_line))) != null) {
                return new VqCommonDetailBinding((LinearLayout) view, textView, textView2, viewM94321a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_detail, viewGroup, false);
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