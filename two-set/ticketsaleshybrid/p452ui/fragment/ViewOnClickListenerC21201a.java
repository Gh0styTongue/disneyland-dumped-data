package com.disney.wdpro.ticketsaleshybrid.p452ui.fragment;

import android.view.View;

/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.fragment.a */
/* loaded from: classes19.dex */
public final /* synthetic */ class ViewOnClickListenerC21201a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String f44276a;

    /* renamed from: b */
    public final /* synthetic */ DownScreenFragment f44277b;

    public /* synthetic */ ViewOnClickListenerC21201a(String str, DownScreenFragment downScreenFragment) {
        dfmTicketModsText4 = str;
        this = downScreenFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DownScreenFragment.onCreateView$lambda$1(dfmTicketModsText4, this, view);
    }
}