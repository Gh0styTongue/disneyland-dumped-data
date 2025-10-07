package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqSelectQueueCategoryHeaderBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/sticky_headers/ViewTypeStickyHeaderDelegateAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter$CategoryHeaderViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter$SelectQueueCategoryHeaderViewItem;", "()V", "onBindStickyHeaderViewHolder", "", "holder", "type", "onBindViewHolder", "item", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "CategoryHeaderViewHolder", "SelectQueueCategoryHeaderViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public class SelectQueueCategoryHeaderAdapter extends AccessibleAdapter implements ViewTypeStickyHeaderDelegateAdapter<CategoryHeaderViewHolder, SelectQueueCategoryHeaderViewItem> {
    public static final int $stable = 0;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter$CategoryHeaderViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueCategoryHeaderBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueCategoryHeaderBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueCategoryHeaderBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class CategoryHeaderViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqSelectQueueCategoryHeaderBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public CategoryHeaderViewHolder(VqSelectQueueCategoryHeaderBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqSelectQueueCategoryHeaderBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter$SelectQueueCategoryHeaderViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "viewType", "", "headerString", "", "(ILjava/lang/String;)V", "getHeaderString$virtual_queue_lib_release", "()Ljava/lang/String;", "setHeaderString$virtual_queue_lib_release", "(Ljava/lang/String;)V", "hideHeaderText", "", "getHideHeaderText", "()Z", "setHideHeaderText", "(Z)V", "getViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectQueueCategoryHeaderViewItem extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private String headerString;
        private boolean hideHeaderText;
        private final int viewType;

        public SelectQueueCategoryHeaderViewItem(int i10, String headerString) {
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

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter
    public void onBindStickyHeaderViewHolder(CategoryHeaderViewHolder holder, SelectQueueCategoryHeaderViewItem type) {
        if (holder == null || type == null) {
            return;
        }
        onBindViewHolder(holder, type);
        holder.setAnimate(false);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public CategoryHeaderViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqSelectQueueCategoryHeaderBinding vqSelectQueueCategoryHeaderBindingInflate = VqSelectQueueCategoryHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqSelectQueueCategoryHeaderBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new CategoryHeaderViewHolder(vqSelectQueueCategoryHeaderBindingInflate);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter, com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(CategoryHeaderViewHolder holder, SelectQueueCategoryHeaderViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        VqSelectQueueCategoryHeaderBinding binding = holder.getBinding();
        binding.titleText.setText(item.getHeaderString());
        binding.titleText.setVisibility(item.getHideHeaderText() ? 4 : 0);
        holder.setAnimate(true);
        handleAccessibilityUpdate(item.getHeaderString(), holder, item);
        binding.categoryHeader.setImportantForAccessibility(item.getHideHeaderText() ? 2 : 1);
    }
}