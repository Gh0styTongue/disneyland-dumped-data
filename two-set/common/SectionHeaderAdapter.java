package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqCommonSectionHeaderBinding;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0003\u0013\u0014\u0015B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/sticky_headers/ViewTypeStickyHeaderDelegateAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "actions", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderActions;", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderActions;)V", "onBindStickyHeaderViewHolder", "", "holder", "type", "onBindViewHolder", "item", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "SectionHeaderActions", "SectionHeaderViewHolder", "SectionHeaderViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public class SectionHeaderAdapter extends AccessibleAdapter implements ViewTypeStickyHeaderDelegateAdapter<AnimateRecyclerViewHolder, SectionHeaderViewItem> {
    public static final int $stable = 8;
    private final SectionHeaderActions actions;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderActions;", "", "isGuestSelected", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface SectionHeaderActions {
        boolean isGuestSelected();
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonSectionHeaderBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonSectionHeaderBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonSectionHeaderBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SectionHeaderViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonSectionHeaderBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public SectionHeaderViewHolder(VqCommonSectionHeaderBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonSectionHeaderBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "viewType", "", "headerString", "", "(ILjava/lang/String;)V", "getHeaderString$virtual_queue_lib_release", "()Ljava/lang/String;", "setHeaderString$virtual_queue_lib_release", "(Ljava/lang/String;)V", "hideHeaderText", "", "getHideHeaderText", "()Z", "setHideHeaderText", "(Z)V", "getViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SectionHeaderViewItem extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private String headerString;
        private boolean hideHeaderText;
        private final int viewType;

        public SectionHeaderViewItem(int i10, String headerString) {
            Intrinsics.checkNotNullParameter(headerString, "headerString");
            this.viewType = i10;
            this.headerString = headerString;
        }

        /* renamed from: getHeaderString$virtual_queue_lib_release, reason: from getter */
        public final String getHeaderString() {
            return this.headerString;
        }

        public final boolean getHideHeaderText() {
            return this.hideHeaderText;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return this.viewType;
        }

        public final void setHeaderString$virtual_queue_lib_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.headerString = str;
        }

        public final void setHideHeaderText(boolean z10) {
            this.hideHeaderText = z10;
        }
    }

    public /* synthetic */ SectionHeaderAdapter(VirtualQueueThemer virtualQueueThemer, SectionHeaderActions sectionHeaderActions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(virtualQueueThemer, (i10 & 2) != 0 ? null : sectionHeaderActions);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    public SectionHeaderAdapter(VirtualQueueThemer vqThemer, SectionHeaderActions sectionHeaderActions) {
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.vqThemer = vqThemer;
        this.actions = sectionHeaderActions;
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter
    public void onBindStickyHeaderViewHolder(AnimateRecyclerViewHolder holder, SectionHeaderViewItem type) {
        if (type != null) {
            if ((holder instanceof SectionHeaderViewHolder ? (SectionHeaderViewHolder) holder : null) != null) {
                onBindViewHolder(holder, type);
                SectionHeaderViewHolder sectionHeaderViewHolder = (SectionHeaderViewHolder) holder;
                VqCommonSectionHeaderBinding binding = sectionHeaderViewHolder.getBinding();
                binding.topLine.setVisibility(8);
                if (!type.getHideHeaderText()) {
                    binding.bottomShadow.setVisibility(0);
                }
                sectionHeaderViewHolder.setAnimate(false);
            }
        }
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public AnimateRecyclerViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonSectionHeaderBinding vqCommonSectionHeaderBindingInflate = VqCommonSectionHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonSectionHeaderBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SectionHeaderViewHolder(vqCommonSectionHeaderBindingInflate);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, SectionHeaderViewItem item) {
        String headerString;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if ((holder instanceof SectionHeaderViewHolder ? (SectionHeaderViewHolder) holder : null) != null) {
            handleAccessibilityUpdate(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonHeadingAccessibility, MapsKt.mapOf(TuplesKt.m92045to("headerTitle", item.getHeaderString())), null, false, 12, null), holder, item);
            VqCommonSectionHeaderBinding binding = ((SectionHeaderViewHolder) holder).getBinding();
            TextView textView = binding.titleText;
            SectionHeaderActions sectionHeaderActions = this.actions;
            if (sectionHeaderActions != null && !sectionHeaderActions.isGuestSelected() && item.getViewType() == 10033) {
                headerString = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.AlternateNotInPartyHeader, null, false, 6, null);
            } else {
                headerString = item.getHeaderString();
            }
            textView.setText(headerString);
            binding.titleText.setVisibility(item.getHideHeaderText() ? 8 : 0);
            binding.topLine.setVisibility(0);
            binding.bottomShadow.setVisibility(8);
            holder.setAnimate(true);
            binding.sectionHeader.setImportantForAccessibility(item.getHideHeaderText() ? 2 : 1);
        }
    }
}