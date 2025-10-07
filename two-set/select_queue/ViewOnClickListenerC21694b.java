package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.view.View;
import com.disney.wdpro.virtualqueue.service.model.Queue;

/* renamed from: com.disney.wdpro.virtualqueue.ui.select_queue.b */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21694b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Queue f45302b;

    /* renamed from: c */
    public final /* synthetic */ String f45303c;

    public /* synthetic */ ViewOnClickListenerC21694b(Queue queue, String str) {
        queue = queue;
        string$default5 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectQueueCardAdapter.onBindViewHolder$lambda$7$lambda$6(this.f45301a, queue, string$default5, view);
    }
}