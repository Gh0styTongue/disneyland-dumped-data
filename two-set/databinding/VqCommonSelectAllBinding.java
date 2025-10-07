package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonSelectAllBinding implements InterfaceC30606a {
    public final CheckBox checkBox;
    private final LinearLayout rootView;
    public final LinearLayout selectAllItem;
    public final TextView textView;
    public final View topLine;

    private VqCommonSelectAllBinding(LinearLayout linearLayout, CheckBox checkBox, LinearLayout linearLayout2, TextView textView, View view) {
        this.rootView = linearLayout;
        this.checkBox = checkBox;
        this.selectAllItem = linearLayout2;
        this.textView = textView;
        this.topLine = view;
    }

    public static VqCommonSelectAllBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.checkBox;
        CheckBox checkBox = (CheckBox) C30607b.m94321a(view, i10);
        if (checkBox != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = C21487R.id.textView;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.topLine))) != null) {
                return new VqCommonSelectAllBinding(linearLayout, checkBox, linearLayout, textView, viewM94321a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonSelectAllBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonSelectAllBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_select_all, viewGroup, false);
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