package com.disney.wdpro.virtualqueue.p462ui.create_party;

import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.databinding.VqCommonSectionHeaderBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.SectionHeaderAdapter;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/MaxPartyAlertAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter;", "actions", "Lcom/disney/wdpro/virtualqueue/ui/create_party/MaxPartyAlertAdapter$MaxPartyAlertActions;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "(Lcom/disney/wdpro/virtualqueue/ui/create_party/MaxPartyAlertAdapter$MaxPartyAlertActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "onBindViewHolder", "", "holder", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "item", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "MaxPartyAlertActions", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class MaxPartyAlertAdapter extends SectionHeaderAdapter {
    public static final int $stable = 8;
    private final MaxPartyAlertActions actions;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/MaxPartyAlertAdapter$MaxPartyAlertActions;", "", "getMaxPartySize", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface MaxPartyAlertActions {
        int getMaxPartySize();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxPartyAlertAdapter(MaxPartyAlertActions actions, VirtualQueueThemer vqThemer) {
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
        super.onBindViewHolder(holder, item);
        if ((holder instanceof SectionHeaderAdapter.SectionHeaderViewHolder ? (SectionHeaderAdapter.SectionHeaderViewHolder) holder : null) != null) {
            VqCommonSectionHeaderBinding binding = ((SectionHeaderAdapter.SectionHeaderViewHolder) holder).getBinding();
            binding.maxPartyWarningContainer.setVisibility(0);
            binding.topLine.setVisibility(8);
            binding.titleText.setVisibility(8);
            int maxPartySize = this.actions.getMaxPartySize();
            binding.maxPartyWarningIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.CreatePartyMaxPartyIcon, null, 2, null));
            String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyMaxPartySizeExceededMessage, MapsKt.mapOf(TuplesKt.m92045to("maxPartySize", Integer.valueOf(maxPartySize))), null, false, 12, null);
            String string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, string$default)), null, false, 12, null);
            binding.maxPartyWarningText.setText(string$default);
            handleAccessibilityUpdate(string$default2, holder, item);
        }
    }
}