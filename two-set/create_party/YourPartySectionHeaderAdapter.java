package com.disney.wdpro.virtualqueue.p462ui.create_party;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqCreatePartyYourPartyHeaderBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.SectionHeaderAdapter;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/YourPartySectionHeaderAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter;", "actions", "Lcom/disney/wdpro/virtualqueue/ui/create_party/YourPartySectionHeaderAdapter$YourPartyActions;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "(Lcom/disney/wdpro/virtualqueue/ui/create_party/YourPartySectionHeaderAdapter$YourPartyActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "onBindViewHolder", "", "holder", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "item", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "onCreateViewHolder", "Lcom/disney/wdpro/virtualqueue/ui/create_party/YourPartySectionHeaderAdapter$YourPartySectionHeaderViewHolder;", "parent", "Landroid/view/ViewGroup;", "YourPartyActions", "YourPartySectionHeaderViewHolder", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class YourPartySectionHeaderAdapter extends SectionHeaderAdapter {
    public static final int $stable = 8;
    private final YourPartyActions actions;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/YourPartySectionHeaderAdapter$YourPartyActions;", "", "getYourPartySize", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface YourPartyActions {
        int getYourPartySize();
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/YourPartySectionHeaderAdapter$YourPartySectionHeaderViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyYourPartyHeaderBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyYourPartyHeaderBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyYourPartyHeaderBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class YourPartySectionHeaderViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCreatePartyYourPartyHeaderBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public YourPartySectionHeaderViewHolder(VqCreatePartyYourPartyHeaderBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCreatePartyYourPartyHeaderBinding getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourPartySectionHeaderAdapter(YourPartyActions actions, VirtualQueueThemer vqThemer) {
        super(vqThemer, null, 2, null);
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.actions = actions;
        this.vqThemer = vqThemer;
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.common.SectionHeaderAdapter, com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.common.SectionHeaderAdapter, com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, SectionHeaderAdapter.SectionHeaderViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if ((holder instanceof YourPartySectionHeaderViewHolder ? (YourPartySectionHeaderViewHolder) holder : null) != null) {
            VqCreatePartyYourPartyHeaderBinding binding = ((YourPartySectionHeaderViewHolder) holder).getBinding();
            int yourPartySize = this.actions.getYourPartySize();
            binding.titleText.setText(item.getHeaderString());
            binding.titleText.setVisibility(item.getHideHeaderText() ? 8 : 0);
            Map mapMapOf = MapsKt.mapOf(TuplesKt.m92045to("partySize", String.valueOf(yourPartySize)));
            binding.titleCountText.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyYourPartySizeHeader, mapMapOf, null, false, 12, null));
            binding.topLine.setVisibility(0);
            binding.bottomShadow.setVisibility(8);
            holder.setAnimate(true);
            handleAccessibilityUpdate(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonHeadingAccessibility, MapsKt.mapOf(TuplesKt.m92045to("headerTitle", VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyYourPartyHeaderAccessibility, mapMapOf, null, false, 12, null))), null, false, 12, null), holder, item);
            binding.sectionHeader.setImportantForAccessibility(item.getHideHeaderText() ? 2 : 1);
        }
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.common.SectionHeaderAdapter, com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public YourPartySectionHeaderViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCreatePartyYourPartyHeaderBinding vqCreatePartyYourPartyHeaderBindingInflate = VqCreatePartyYourPartyHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCreatePartyYourPartyHeaderBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new YourPartySectionHeaderViewHolder(vqCreatePartyYourPartyHeaderBindingInflate);
    }
}