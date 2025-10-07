package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqSelectQueueDisclaimerBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u0013\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewItem;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewHolder;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewItem;)V", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "SelectQueueDisclaimerViewHolder", "SelectQueueDisclaimerViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SelectQueueDisclaimerAdapter implements InterfaceC9229c<SelectQueueDisclaimerViewHolder, SelectQueueDisclaimerViewItem> {
    public static final int VIEW_TYPE = 13003;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueDisclaimerBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueDisclaimerBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueDisclaimerBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectQueueDisclaimerViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqSelectQueueDisclaimerBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public SelectQueueDisclaimerViewHolder(VqSelectQueueDisclaimerBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            FrameLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqSelectQueueDisclaimerBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getViewType", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectQueueDisclaimerViewItem implements InterfaceC9233g {
        public static final int $stable = 8;
        private final Context context;

        public SelectQueueDisclaimerViewItem(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        public final Context getContext() {
            return this.context;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 13003;
        }
    }

    public SelectQueueDisclaimerAdapter(VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.vqThemer = vqThemer;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public SelectQueueDisclaimerViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqSelectQueueDisclaimerBinding vqSelectQueueDisclaimerBindingInflate = VqSelectQueueDisclaimerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqSelectQueueDisclaimerBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SelectQueueDisclaimerViewHolder(vqSelectQueueDisclaimerBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(SelectQueueDisclaimerViewHolder holder, SelectQueueDisclaimerViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getBinding().disclaimerText.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.HowToVisitDisclaimer, null, false, 6, null));
    }
}