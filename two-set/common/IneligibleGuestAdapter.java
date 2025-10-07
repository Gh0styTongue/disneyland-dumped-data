package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.virtualqueue.databinding.VqCommonIneligibleGuestItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0004\u001b\u001c\u001d\u001eB!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$LinkedGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$IneligibleGuestViewItem;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$LinkedGuestViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$LinkedGuestViewHolder;Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$IneligibleGuestViewItem;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Companion", "Factory", "IneligibleGuestViewItem", "LinkedGuestViewHolder", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class IneligibleGuestAdapter extends AccessibleAdapter implements InterfaceC9229c<LinkedGuestViewHolder, IneligibleGuestViewItem> {
    public static final int VIEW_TYPE = 10036;
    private final Context context;
    private final LinkedGuestUtils linkedGuestUtils;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;", "", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "(Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter;", "context", "Landroid/content/Context;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final LinkedGuestUtils linkedGuestUtils;

        @Inject
        public Factory(LinkedGuestUtils linkedGuestUtils) {
            Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
            this.linkedGuestUtils = linkedGuestUtils;
        }

        public final IneligibleGuestAdapter create(Context context, VirtualQueueThemer vqThemer) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            return new IneligibleGuestAdapter(context, vqThemer, this.linkedGuestUtils);
        }
    }

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0005H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$IneligibleGuestViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "guest", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", RecommenderThemerConstants.INDEX, "", "sectionTotal", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;II)V", "detailString", "", "getDetailString", "()Ljava/lang/String;", "setDetailString", "(Ljava/lang/String;)V", "getGuest", "()Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "setGuest", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;)V", "getIndex", "()I", "setIndex", "(I)V", "getSectionTotal", "setSectionTotal", "getViewType", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class IneligibleGuestViewItem extends AccessibleRecyclerViewItem {
        private String detailString;
        private LinkedGuest guest;
        private int index;
        private int sectionTotal;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$IneligibleGuestViewItem$Companion;", "", "()V", "sortComparator", "Ljava/util/Comparator;", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$IneligibleGuestViewItem;", "Lkotlin/Comparator;", "getSortComparator", "()Ljava/util/Comparator;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int _get_sortComparator_$lambda$0(IneligibleGuestViewItem ineligibleGuestViewItem, IneligibleGuestViewItem ineligibleGuestViewItem2) {
                return LinkedGuestUtils.INSTANCE.getSortComparator().compare(ineligibleGuestViewItem.getGuest(), ineligibleGuestViewItem2.getGuest());
            }

            public final Comparator<IneligibleGuestViewItem> getSortComparator() {
                return new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.common.e
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return IneligibleGuestAdapter.IneligibleGuestViewItem.Companion._get_sortComparator_$lambda$0((IneligibleGuestAdapter.IneligibleGuestViewItem) obj, (IneligibleGuestAdapter.IneligibleGuestViewItem) obj2);
                    }
                };
            }

            private Companion() {
            }
        }

        public IneligibleGuestViewItem(LinkedGuest guest, int i10, int i11) {
            Intrinsics.checkNotNullParameter(guest, "guest");
            this.guest = guest;
            this.index = i10;
            this.sectionTotal = i11;
        }

        public final String getDetailString() {
            return this.detailString;
        }

        public final LinkedGuest getGuest() {
            return this.guest;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getSectionTotal() {
            return this.sectionTotal;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10036;
        }

        public final void setDetailString(String str) {
            this.detailString = str;
        }

        public final void setGuest(LinkedGuest linkedGuest) {
            Intrinsics.checkNotNullParameter(linkedGuest, "<set-?>");
            this.guest = linkedGuest;
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }

        public final void setSectionTotal(int i10) {
            this.sectionTotal = i10;
        }

        public /* synthetic */ IneligibleGuestViewItem(LinkedGuest linkedGuest, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(linkedGuest, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$LinkedGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonIneligibleGuestItemBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonIneligibleGuestItemBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonIneligibleGuestItemBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class LinkedGuestViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonIneligibleGuestItemBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public LinkedGuestViewHolder(VqCommonIneligibleGuestItemBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonIneligibleGuestItemBinding getBinding() {
            return this.binding;
        }
    }

    @Inject
    public IneligibleGuestAdapter(Context context, VirtualQueueThemer vqThemer, LinkedGuestUtils linkedGuestUtils) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        this.context = context;
        this.vqThemer = vqThemer;
        this.linkedGuestUtils = linkedGuestUtils;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public LinkedGuestViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonIneligibleGuestItemBinding vqCommonIneligibleGuestItemBindingInflate = VqCommonIneligibleGuestItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonIneligibleGuestItemBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new LinkedGuestViewHolder(vqCommonIneligibleGuestItemBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(LinkedGuestViewHolder holder, IneligibleGuestViewItem item) {
        Unit unit;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        VqCommonIneligibleGuestItemBinding binding = holder.getBinding();
        binding.guestName.setText(this.linkedGuestUtils.displayNameFull(item.getGuest(), this.vqThemer));
        String detailString = item.getDetailString();
        if (detailString != null) {
            binding.guestConflict.setVisibility(0);
            binding.guestConflict.setText(detailString);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            binding.guestConflict.setVisibility(8);
        }
        String strDisplayNameFull = this.linkedGuestUtils.displayNameFull(item.getGuest(), this.vqThemer);
        String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyGuestIneligibleAccessibility, MapsKt.mapOf(TuplesKt.m92045to(RecommenderThemerConstants.INSTANCE, Integer.valueOf(item.getIndex())), TuplesKt.m92045to("total", Integer.valueOf(item.getSectionTotal()))), null, false, 12, null);
        binding.guestNameContainer.setContentDescription(strDisplayNameFull + item.getDetailString() + string$default);
        LinkedGuestUtils linkedGuestUtils = this.linkedGuestUtils;
        LinkedGuest guest = item.getGuest();
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        LinkedGuestUtils.setGuestImage$default(linkedGuestUtils, guest, view, this.vqThemer, false, 8, null);
    }
}