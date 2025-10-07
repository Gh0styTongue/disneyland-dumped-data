package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.View;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueParkButton;

/* renamed from: com.disney.wdpro.virtualqueue.core.fragments.m */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21611m implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SelectQueueParkButton f45240b;

    public /* synthetic */ ViewOnClickListenerC21611m(SelectQueueParkButton selectQueueParkButton) {
        selectQueueParkButton = selectQueueParkButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectQueueFragment.setupParkSelection$lambda$2(this.f45239a, selectQueueParkButton, view);
    }
}