package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCreatePartyAddGuestBinding implements InterfaceC30606a {
    public final Button addGuest;
    public final View addGuestTopLine;
    private final ConstraintLayout rootView;

    private VqCreatePartyAddGuestBinding(ConstraintLayout constraintLayout, Button button, View view) {
        this.rootView = constraintLayout;
        this.addGuest = button;
        this.addGuestTopLine = view;
    }

    public static VqCreatePartyAddGuestBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.addGuest;
        Button button = (Button) C30607b.m94321a(view, i10);
        if (button == null || (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.addGuestTopLine))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new VqCreatePartyAddGuestBinding((ConstraintLayout) view, button, viewM94321a);
    }

    public static VqCreatePartyAddGuestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCreatePartyAddGuestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_create_party_add_guest, viewGroup, false);
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