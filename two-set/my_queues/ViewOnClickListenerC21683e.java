package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.view.View;
import com.disney.wdpro.virtualqueue.service.model.Queue;

/* renamed from: com.disney.wdpro.virtualqueue.ui.my_queues.e */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21683e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ PositionAdapter f45285b;

    /* renamed from: c */
    public final /* synthetic */ Queue f45286c;

    public /* synthetic */ ViewOnClickListenerC21683e(PositionAdapter positionAdapter, Queue queue) {
        this = positionAdapter;
        queue = queue;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PositionAdapter.setupCTAButtons$lambda$8(item, this, queue, view);
    }
}