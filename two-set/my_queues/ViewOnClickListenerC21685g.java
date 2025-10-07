package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.view.View;
import com.disney.wdpro.virtualqueue.service.model.Queue;

/* renamed from: com.disney.wdpro.virtualqueue.ui.my_queues.g */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21685g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Queue f45292b;

    /* renamed from: c */
    public final /* synthetic */ String f45293c;

    public /* synthetic */ ViewOnClickListenerC21685g(Queue queue, String str) {
        queueById = queue;
        string$default = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PositionAdapter.onBindViewHolder$lambda$0(this.f45291a, queueById, string$default, view);
    }
}