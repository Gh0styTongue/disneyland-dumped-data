package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.view.View;
import com.disney.wdpro.virtualqueue.service.model.Queue;

/* renamed from: com.disney.wdpro.virtualqueue.ui.my_queues.d */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21682d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ PositionAdapter f45282b;

    /* renamed from: c */
    public final /* synthetic */ Queue f45283c;

    public /* synthetic */ ViewOnClickListenerC21682d(PositionAdapter positionAdapter, Queue queue) {
        this = positionAdapter;
        queue = queue;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PositionAdapter.setupCTAButtons$lambda$6(item, this, queue, view);
    }
}