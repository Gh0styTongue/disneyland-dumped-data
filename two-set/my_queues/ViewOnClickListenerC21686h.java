package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.view.View;
import com.disney.wdpro.virtualqueue.service.model.Queue;

/* renamed from: com.disney.wdpro.virtualqueue.ui.my_queues.h */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21686h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ PositionAdapter f45295b;

    /* renamed from: c */
    public final /* synthetic */ Queue f45296c;

    public /* synthetic */ ViewOnClickListenerC21686h(PositionAdapter positionAdapter, Queue queue) {
        this = positionAdapter;
        queueById = queue;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PositionAdapter.onBindViewHolder$lambda$2(item, this, queueById, view);
    }
}