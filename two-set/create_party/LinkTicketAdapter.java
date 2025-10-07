package com.disney.wdpro.virtualqueue.p462ui.create_party;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqCreatePartyAddGuestBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.LinkTicketAdapter;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0015\u0016\u0017\u0018B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewType;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewHolder;Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewType;)V", "Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "LinkTicketActions", "LinkTicketViewHolder", "LinkTicketViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LinkTicketAdapter implements InterfaceC9229c<LinkTicketViewHolder, LinkTicketViewType> {
    public static final int VIEW_TYPE = 10032;
    private final LinkTicketActions actions;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketActions;", "", "onLinkTicketClicked", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface LinkTicketActions {
        void onLinkTicketClicked();
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$CreatePartyViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyAddGuestBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyAddGuestBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyAddGuestBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class LinkTicketViewHolder extends CreatePartyMainAdapter.CreatePartyViewHolder {
        public static final int $stable = 8;
        private final VqCreatePartyAddGuestBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public LinkTicketViewHolder(VqCreatePartyAddGuestBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCreatePartyAddGuestBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "()V", "showDivider", "", "getShowDivider", "()Z", "setShowDivider", "(Z)V", "getViewType", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class LinkTicketViewType extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private boolean showDivider;

        public final boolean getShowDivider() {
            return this.showDivider;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10032;
        }

        public final void setShowDivider(boolean z10) {
            this.showDivider = z10;
        }
    }

    public LinkTicketAdapter(LinkTicketActions actions, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.actions = actions;
        this.vqThemer = vqThemer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(LinkTicketAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.actions.onLinkTicketClicked();
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public LinkTicketViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCreatePartyAddGuestBinding vqCreatePartyAddGuestBindingInflate = VqCreatePartyAddGuestBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCreatePartyAddGuestBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new LinkTicketViewHolder(vqCreatePartyAddGuestBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(LinkTicketViewHolder holder, LinkTicketViewType item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        VqCreatePartyAddGuestBinding binding = holder.getBinding();
        binding.addGuest.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyLinkTicketCta, null, false, 6, null));
        binding.addGuest.setOnClickListener(new View.OnClickListener() { // from class: so.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkTicketAdapter.onBindViewHolder$lambda$1$lambda$0(this.f81611a, view);
            }
        });
        binding.addGuestTopLine.setVisibility(item.getShowDivider() ? 0 : 8);
    }
}