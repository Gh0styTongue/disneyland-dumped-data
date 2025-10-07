package com.disney.wdpro.virtualqueue.p462ui.redeem;

import android.content.Context;
import android.view.ViewGroup;
import androidx.collection.C1176t0;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueDestinationProvider;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeAdapter;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;", "virtualQueueDestinationProvider", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$Factory;", "barcodeAdapterFactory", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$Factory;)V", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "", "setGuests", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Position;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "holder", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewType;", "barcodeItems", "Ljava/util/List;", "Landroidx/collection/t0;", "", "delegateAdapters", "Landroidx/collection/t0;", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nRedeemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedeemAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1549#2:72\n1620#2,3:73\n*S KotlinDebug\n*F\n+ 1 RedeemAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter\n*L\n35#1:72\n35#1:73,3\n*E\n"})
/* loaded from: classes20.dex */
public final class RedeemAdapter extends RecyclerView.Adapter<AnimateRecyclerViewHolder> {
    public static final int $stable = 8;
    private List<BarcodeAdapter.BarcodeViewType> barcodeItems;
    private final Context context;
    private final C1176t0<Object> delegateAdapters;

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter$Factory;", "", "barcodeAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$Factory;", "(Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$Factory;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter;", "context", "Landroid/content/Context;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtualQueueDestinationProvider", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final BarcodeAdapter.Factory barcodeAdapterFactory;

        @Inject
        public Factory(BarcodeAdapter.Factory barcodeAdapterFactory) {
            Intrinsics.checkNotNullParameter(barcodeAdapterFactory, "barcodeAdapterFactory");
            this.barcodeAdapterFactory = barcodeAdapterFactory;
        }

        public final RedeemAdapter create(Context context, VirtualQueueThemer vqThemer, VirtualQueueDestinationProvider virtualQueueDestinationProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(virtualQueueDestinationProvider, "virtualQueueDestinationProvider");
            return new RedeemAdapter(context, vqThemer, virtualQueueDestinationProvider, this.barcodeAdapterFactory);
        }
    }

    public RedeemAdapter(Context context, VirtualQueueThemer vqThemer, VirtualQueueDestinationProvider virtualQueueDestinationProvider, BarcodeAdapter.Factory barcodeAdapterFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(virtualQueueDestinationProvider, "virtualQueueDestinationProvider");
        Intrinsics.checkNotNullParameter(barcodeAdapterFactory, "barcodeAdapterFactory");
        this.context = context;
        this.barcodeItems = CollectionsKt.emptyList();
        C1176t0<Object> c1176t0 = new C1176t0<>(0, 1, null);
        this.delegateAdapters = c1176t0;
        c1176t0.m5321k(12000, barcodeAdapterFactory.create(context, vqThemer, virtualQueueDestinationProvider));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.barcodeItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.barcodeItems.get(position).getViewType();
    }

    public final void setGuests(List<LinkedGuest> guests, Position position, Queue queue) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(queue, "queue");
        List<LinkedGuest> list = guests;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new BarcodeAdapter.BarcodeViewType((LinkedGuest) it.next(), position, queue, this.context, guests.size()));
        }
        this.barcodeItems = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BarcodeAdapter.BarcodeViewType barcodeViewType = this.barcodeItems.get(position);
        Object objM5316e = this.delegateAdapters.m5316e(barcodeViewType.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((InterfaceC9229c) objM5316e).onBindViewHolder(holder, barcodeViewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AnimateRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object objM5316e = this.delegateAdapters.m5316e(viewType);
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        RecyclerView.AbstractC4902e0 abstractC4902e0OnCreateViewHolder = ((InterfaceC9229c) objM5316e).onCreateViewHolder(parent);
        Intrinsics.checkNotNullExpressionValue(abstractC4902e0OnCreateViewHolder, "adapter.onCreateViewHolder(parent)");
        return (AnimateRecyclerViewHolder) abstractC4902e0OnCreateViewHolder;
    }
}