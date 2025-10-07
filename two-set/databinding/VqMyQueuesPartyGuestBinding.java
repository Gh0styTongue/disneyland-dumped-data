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
public final class VqMyQueuesPartyGuestBinding implements InterfaceC30606a {
    public final ImageView guestIcon;
    public final TextView guestId;
    public final TextView guestName;
    public final TextView guestPeptasiaIcon;
    private final LinearLayout rootView;
    public final LinearLayout vqMyQueuesPartyGuestContainer;

    private VqMyQueuesPartyGuestBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.guestIcon = imageView;
        this.guestId = textView;
        this.guestName = textView2;
        this.guestPeptasiaIcon = textView3;
        this.vqMyQueuesPartyGuestContainer = linearLayout2;
    }

    public static VqMyQueuesPartyGuestBinding bind(View view) {
        int i10 = C21487R.id.guestIcon;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null) {
            i10 = C21487R.id.guestId;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                i10 = C21487R.id.guestName;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    i10 = C21487R.id.guestPeptasiaIcon;
                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                    if (textView3 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        return new VqMyQueuesPartyGuestBinding(linearLayout, imageView, textView, textView2, textView3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqMyQueuesPartyGuestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqMyQueuesPartyGuestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_my_queues_party_guest, viewGroup, false);
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