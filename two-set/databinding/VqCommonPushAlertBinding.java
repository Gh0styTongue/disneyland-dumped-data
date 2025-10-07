package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCommonPushAlertBinding implements InterfaceC30606a {
    public final Button alertCta;
    public final TextView alertDetail;
    public final TextView alertIcon;
    private final ConstraintLayout rootView;
    public final ConstraintLayout vqPushAlertContainer;

    private VqCommonPushAlertBinding(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.alertCta = button;
        this.alertDetail = textView;
        this.alertIcon = textView2;
        this.vqPushAlertContainer = constraintLayout2;
    }

    public static VqCommonPushAlertBinding bind(View view) {
        int i10 = C21487R.id.alertCta;
        Button button = (Button) C30607b.m94321a(view, i10);
        if (button != null) {
            i10 = C21487R.id.alertDetail;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                i10 = C21487R.id.alertIcon;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new VqCommonPushAlertBinding(constraintLayout, button, textView, textView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqCommonPushAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonPushAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_push_alert, viewGroup, false);
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