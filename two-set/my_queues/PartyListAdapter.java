package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.content.Context;
import android.view.ViewGroup;
import androidx.collection.C1176t0;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0013\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;", "partyGuestAdapterFactory", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;)V", "", "", "guestIdsInParty", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "allGuests", "", "setParty", "(Ljava/util/List;Ljava/util/List;)V", "guests", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "dataChanged", "()V", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewType;", "partyGuests", "Ljava/util/List;", "Landroidx/collection/t0;", "", "delegateAdapters", "Landroidx/collection/t0;", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPartyListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyListAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n766#2:77\n857#2,2:78\n1549#2:80\n1620#2,3:81\n*S KotlinDebug\n*F\n+ 1 PartyListAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter\n*L\n29#1:77\n29#1:78,2\n35#1:80\n35#1:81,3\n*E\n"})
/* loaded from: classes20.dex */
public final class PartyListAdapter extends RecyclerView.Adapter<AnimateRecyclerViewHolder> {
    public static final int $stable = 8;
    private final C1176t0<Object> delegateAdapters;
    private List<PartyGuestAdapter.PartyGuestViewType> partyGuests;

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "", "partyGuestAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter;", "context", "Landroid/content/Context;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final PartyGuestAdapter.Factory partyGuestAdapterFactory;

        @Inject
        public Factory(PartyGuestAdapter.Factory partyGuestAdapterFactory) {
            Intrinsics.checkNotNullParameter(partyGuestAdapterFactory, "partyGuestAdapterFactory");
            this.partyGuestAdapterFactory = partyGuestAdapterFactory;
        }

        public final PartyListAdapter create(Context context, VirtualQueueThemer vqThemer, VQPageType vqPageType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
            return new PartyListAdapter(context, vqThemer, vqPageType, this.partyGuestAdapterFactory);
        }
    }

    public PartyListAdapter(Context context, VirtualQueueThemer vqThemer, VQPageType vqPageType, PartyGuestAdapter.Factory partyGuestAdapterFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        Intrinsics.checkNotNullParameter(partyGuestAdapterFactory, "partyGuestAdapterFactory");
        this.partyGuests = CollectionsKt.emptyList();
        C1176t0<Object> c1176t0 = new C1176t0<>(0, 1, null);
        this.delegateAdapters = c1176t0;
        c1176t0.m5321k(11001, partyGuestAdapterFactory.create(context, vqThemer, vqPageType));
    }

    public final void dataChanged() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.partyGuests.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.partyGuests.get(position).getViewType();
    }

    public final void setParty(List<String> guestIdsInParty, List<LinkedGuest> allGuests) {
        Intrinsics.checkNotNullParameter(guestIdsInParty, "guestIdsInParty");
        Intrinsics.checkNotNullParameter(allGuests, "allGuests");
        ArrayList arrayList = new ArrayList();
        for (Object obj : allGuests) {
            if (guestIdsInParty.contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        setParty(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PartyGuestAdapter.PartyGuestViewType partyGuestViewType = this.partyGuests.get(position);
        Object objM5316e = this.delegateAdapters.m5316e(partyGuestViewType.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((InterfaceC9229c) objM5316e).onBindViewHolder(holder, partyGuestViewType);
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

    public final void setParty(List<LinkedGuest> guests) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        List listSortedWith = CollectionsKt.sortedWith(guests, LinkedGuestUtils.INSTANCE.getSortComparator());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(new PartyGuestAdapter.PartyGuestViewType((LinkedGuest) it.next(), guests.size()));
        }
        this.partyGuests = arrayList;
        dataChanged();
    }
}