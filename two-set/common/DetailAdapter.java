package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqCommonDetailBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewHolder;Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;)V", "DetailViewHolder", "DetailViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class DetailAdapter extends AccessibleAdapter implements InterfaceC9229c<DetailViewHolder, DetailViewItem> {
    public static final int $stable = 0;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonDetailBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonDetailBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonDetailBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DetailViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonDetailBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public DetailViewHolder(VqCommonDetailBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonDetailBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "viewType", "", "titleString", "", "detailString", "titleAccessibilityString", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailString", "()Ljava/lang/String;", "showTopLine", "", "getShowTopLine", "()Z", "setShowTopLine", "(Z)V", "getTitleAccessibilityString", "getTitleString", "setTitleString", "(Ljava/lang/String;)V", "getViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DetailViewItem extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private final String detailString;
        private boolean showTopLine;
        private final String titleAccessibilityString;
        private String titleString;
        private final int viewType;

        public /* synthetic */ DetailViewItem(int i10, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3);
        }

        public final String getDetailString() {
            return this.detailString;
        }

        public final boolean getShowTopLine() {
            return this.showTopLine;
        }

        public final String getTitleAccessibilityString() {
            return this.titleAccessibilityString;
        }

        public final String getTitleString() {
            return this.titleString;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return this.viewType;
        }

        public final void setShowTopLine(boolean z10) {
            this.showTopLine = z10;
        }

        public final void setTitleString(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.titleString = str;
        }

        public DetailViewItem(int i10, String titleString, String detailString, String titleAccessibilityString) {
            Intrinsics.checkNotNullParameter(titleString, "titleString");
            Intrinsics.checkNotNullParameter(detailString, "detailString");
            Intrinsics.checkNotNullParameter(titleAccessibilityString, "titleAccessibilityString");
            this.viewType = i10;
            this.titleString = titleString;
            this.detailString = detailString;
            this.titleAccessibilityString = titleAccessibilityString;
        }
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public DetailViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonDetailBinding vqCommonDetailBindingInflate = VqCommonDetailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonDetailBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new DetailViewHolder(vqCommonDetailBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(DetailViewHolder holder, DetailViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        handleAccessibilityUpdate(item.getTitleAccessibilityString(), holder, item);
        VqCommonDetailBinding binding = holder.getBinding();
        binding.vqConflictHeaderText.setVisibility(!StringsKt.isBlank(item.getTitleString()) ? 0 : 8);
        binding.vqConflictHeaderText.setText(item.getTitleString());
        binding.vqConflictDetailText.setVisibility(!StringsKt.isBlank(item.getDetailString()) ? 0 : 8);
        binding.vqConflictDetailText.setText(item.getDetailString());
        binding.vqConflictHeaderTopLine.setVisibility(item.getShowTopLine() ? 0 : 8);
    }
}