package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqSelectQueueEmptyBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000f\u0010\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewItem;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewHolder;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewItem;)V", "Companion", "SelectHubQueueEmptyViewHolder", "SelectHubQueueEmptyViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SelectHubQueueEmptyAdapter implements InterfaceC9229c<SelectHubQueueEmptyViewHolder, SelectHubQueueEmptyViewItem> {
    public static final int $stable = 0;
    public static final int VIEW_TYPE = 13005;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueEmptyBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueEmptyBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueEmptyBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectHubQueueEmptyViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqSelectQueueEmptyBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public SelectHubQueueEmptyViewHolder(VqSelectQueueEmptyBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqSelectQueueEmptyBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "Landroid/content/Context;", "context", "", "noHubQueueErrorMessage", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "getViewType", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getNoHubQueueErrorMessage", "()Ljava/lang/String;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectHubQueueEmptyViewItem implements InterfaceC9233g {
        public static final int $stable = 8;
        private final Context context;
        private final String noHubQueueErrorMessage;

        public SelectHubQueueEmptyViewItem(Context context, String noHubQueueErrorMessage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(noHubQueueErrorMessage, "noHubQueueErrorMessage");
            this.context = context;
            this.noHubQueueErrorMessage = noHubQueueErrorMessage;
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getNoHubQueueErrorMessage() {
            return this.noHubQueueErrorMessage;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 13005;
        }
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public SelectHubQueueEmptyViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqSelectQueueEmptyBinding vqSelectQueueEmptyBindingInflate = VqSelectQueueEmptyBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqSelectQueueEmptyBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SelectHubQueueEmptyViewHolder(vqSelectQueueEmptyBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(SelectHubQueueEmptyViewHolder holder, SelectHubQueueEmptyViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getBinding().selectQueueEmptyDetail.setText(item.getNoHubQueueErrorMessage());
    }
}