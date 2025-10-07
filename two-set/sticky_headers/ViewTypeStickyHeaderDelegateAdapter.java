package com.disney.wdpro.virtualqueue.p462ui.sticky_headers;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC4902e0;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import java.util.List;

/* loaded from: classes20.dex */
public interface ViewTypeStickyHeaderDelegateAdapter<VH extends RecyclerView.AbstractC4902e0, T extends InterfaceC9233g> extends InterfaceC9229c<VH, T> {
    void onBindStickyHeaderViewHolder(VH vh2, T t10);

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g);

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /* bridge */ /* synthetic */ default void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /* synthetic */ RecyclerView.AbstractC4902e0 onCreateViewHolder(ViewGroup viewGroup);
}