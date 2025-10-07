package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import com.disney.wdpro.support.widget.ExpandableView;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import com.disney.wdpro.virtualqueue.service.model.Queue;

/* renamed from: com.disney.wdpro.virtualqueue.ui.my_queues.f */
/* loaded from: classes20.dex */
public final /* synthetic */ class C21684f implements ExpandableView.InterfaceC21083b {

    /* renamed from: b */
    public final /* synthetic */ Queue f45288b;

    /* renamed from: c */
    public final /* synthetic */ PositionAdapter.PositionViewItem f45289c;

    /* renamed from: d */
    public final /* synthetic */ PositionAdapter.PositionViewHolder f45290d;

    public /* synthetic */ C21684f(Queue queue, PositionAdapter.PositionViewItem positionViewItem, PositionAdapter.PositionViewHolder positionViewHolder) {
        queue = queue;
        item = positionViewItem;
        holder = positionViewHolder;
    }

    @Override // com.disney.wdpro.support.widget.ExpandableView.InterfaceC21083b
    /* renamed from: a */
    public final void mo37595a(ExpandableView expandableView, boolean z10) {
        PositionAdapter.setupExpandableView$lambda$16(this.f45287a, queue, item, holder, expandableView, z10);
    }
}