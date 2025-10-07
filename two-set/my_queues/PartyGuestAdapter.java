package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.databinding.VqMyQueuesPartyGuestBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001e\u001f !B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewType;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewHolder;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewType;)V", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Companion", "Factory", "PartyGuestViewHolder", "PartyGuestViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPartyGuestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyGuestAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
/* loaded from: classes20.dex */
public final class PartyGuestAdapter implements InterfaceC9229c<PartyGuestViewHolder, PartyGuestViewType> {
    public static final int FULL_NAME_LENGTH = 10;
    public static final int VIEW_TYPE = 11001;
    private final Context context;
    private LinkedGuestUtils linkedGuestUtils;
    private C9314j parkAppConfiguration;
    private final VQPageType vqPageType;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;", "", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "<init>", "(Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)V", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter;", "create", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private LinkedGuestUtils linkedGuestUtils;
        private final C9314j parkAppConfiguration;

        @Inject
        public Factory(C9314j parkAppConfiguration, LinkedGuestUtils linkedGuestUtils) {
            Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
            Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
            this.parkAppConfiguration = parkAppConfiguration;
            this.linkedGuestUtils = linkedGuestUtils;
        }

        public final PartyGuestAdapter create(Context context, VirtualQueueThemer vqThemer, VQPageType vqPageType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
            return new PartyGuestAdapter(context, vqThemer, vqPageType, this.parkAppConfiguration, this.linkedGuestUtils);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesPartyGuestBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesPartyGuestBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesPartyGuestBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class PartyGuestViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqMyQueuesPartyGuestBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public PartyGuestViewHolder(VqMyQueuesPartyGuestBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqMyQueuesPartyGuestBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$PartyGuestViewType;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guest", "", "numberOfItems", "<init>", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;I)V", "getViewType", "()I", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "getGuest", "()Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "I", "getNumberOfItems", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class PartyGuestViewType implements InterfaceC9233g {
        public static final int $stable = 8;
        private final LinkedGuest guest;
        private final int numberOfItems;

        public PartyGuestViewType(LinkedGuest guest, int i10) {
            Intrinsics.checkNotNullParameter(guest, "guest");
            this.guest = guest;
            this.numberOfItems = i10;
        }

        public final LinkedGuest getGuest() {
            return this.guest;
        }

        public final int getNumberOfItems() {
            return this.numberOfItems;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 11001;
        }
    }

    @Inject
    public PartyGuestAdapter(Context context, VirtualQueueThemer vqThemer, VQPageType vqPageType, C9314j parkAppConfiguration, LinkedGuestUtils linkedGuestUtils) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        this.context = context;
        this.vqThemer = vqThemer;
        this.vqPageType = vqPageType;
        this.parkAppConfiguration = parkAppConfiguration;
        this.linkedGuestUtils = linkedGuestUtils;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public PartyGuestViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqMyQueuesPartyGuestBinding vqMyQueuesPartyGuestBindingInflate = VqMyQueuesPartyGuestBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqMyQueuesPartyGuestBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new PartyGuestViewHolder(vqMyQueuesPartyGuestBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(PartyGuestViewHolder holder, PartyGuestViewType item) throws Resources.NotFoundException {
        int i10;
        String strDisplayName;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int dimensionPixelSize = this.context.getResources().getDimensionPixelSize(C21487R.dimen.margin_normal);
        Resources resources = this.context.getResources();
        if (Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "WDW") && this.vqPageType != VQPageType.REVIEWDETAILS) {
            i10 = C21487R.dimen.margin_xxlarge;
        } else {
            i10 = C21487R.dimen.margin_normal;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i10);
        int i11 = holder.getAdapterPosition() == 0 ? dimensionPixelSize2 : dimensionPixelSize;
        if (holder.getAdapterPosition() == item.getNumberOfItems() - 1) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        holder.itemView.setPadding(i11, 0, dimensionPixelSize, 0);
        holder.itemView.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionGuestAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer)), TuplesKt.m92045to("current", Integer.valueOf(holder.getAdapterPosition() + 1)), TuplesKt.m92045to("total", Integer.valueOf(item.getNumberOfItems()))), null, false, 12, null));
        LinkedGuestUtils linkedGuestUtils = this.linkedGuestUtils;
        LinkedGuest guest = item.getGuest();
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        LinkedGuestUtils.setGuestImage$default(linkedGuestUtils, guest, view, this.vqThemer, false, 8, null);
        VqMyQueuesPartyGuestBinding binding = holder.getBinding();
        Unit unit = null;
        if ((item.getGuest().getIsPrimaryGuest() ? binding : null) != null) {
            binding.guestName.setMaxLines(10);
            strDisplayName = this.linkedGuestUtils.displayNameFull(item.getGuest(), this.vqThemer);
            unit = Unit.INSTANCE;
        } else {
            strDisplayName = "";
        }
        if (unit == null) {
            strDisplayName = this.linkedGuestUtils.displayName(item.getGuest());
        }
        binding.guestName.setText(strDisplayName);
        String strM38908h = this.parkAppConfiguration.m38908h();
        if (Intrinsics.areEqual(strM38908h, "WDW")) {
            binding.guestId.setVisibility(8);
        } else if (Intrinsics.areEqual(strM38908h, "DLR")) {
            binding.guestId.setText(item.getGuest().guestIdLast4());
        }
    }
}