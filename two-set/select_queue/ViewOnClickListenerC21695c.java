package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.view.View;

/* renamed from: com.disney.wdpro.virtualqueue.ui.select_queue.c */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21695c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SelectQueueCardAdapter f45305b;

    /* renamed from: c */
    public final /* synthetic */ String f45306c;

    public /* synthetic */ ViewOnClickListenerC21695c(SelectQueueCardAdapter selectQueueCardAdapter, String str) {
        this = selectQueueCardAdapter;
        externalDefinitionId = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectQueueCardAdapter.onBindViewHolder$lambda$12$lambda$10(queue, this, externalDefinitionId, view);
    }
}