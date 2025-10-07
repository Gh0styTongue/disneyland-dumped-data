package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.view.View;
import com.disney.wdpro.virtualqueue.service.model.Queue;

/* renamed from: com.disney.wdpro.virtualqueue.ui.select_queue.a */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21693a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Queue f45299b;

    /* renamed from: c */
    public final /* synthetic */ String f45300c;

    public /* synthetic */ ViewOnClickListenerC21693a(Queue queue, String str) {
        queue = queue;
        string$default5 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectQueueCardAdapter.onBindViewHolder$lambda$7$lambda$5(this.f45298a, queue, string$default5, view);
    }
}