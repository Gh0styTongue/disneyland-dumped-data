package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqMyQueuesEmptyBinding implements InterfaceC30606a {
    public final ImageView bottomShadow;
    public final TextView emptyDetail;
    public final Button joinButton;
    private final LinearLayout rootView;

    private VqMyQueuesEmptyBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, Button button) {
        this.rootView = linearLayout;
        this.bottomShadow = imageView;
        this.emptyDetail = textView;
        this.joinButton = button;
    }

    public static VqMyQueuesEmptyBinding bind(View view) {
        int i10 = C21487R.id.bottomShadow;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null) {
            i10 = C21487R.id.emptyDetail;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                i10 = C21487R.id.joinButton;
                Button button = (Button) C30607b.m94321a(view, i10);
                if (button != null) {
                    return new VqMyQueuesEmptyBinding((LinearLayout) view, imageView, textView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqMyQueuesEmptyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqMyQueuesEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_my_queues_empty, viewGroup, false);
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