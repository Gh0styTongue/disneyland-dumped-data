package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.core.interfaces.PositionActions;
import com.disney.wdpro.virtualqueue.databinding.VqCommonPushAlertBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0016\u0017\u0015B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewItem;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewHolder;Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewItem;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "BluetoothRequestViewHolder", "BluetoothRequestViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class BluetoothRequestAdapter implements InterfaceC9229c<BluetoothRequestViewHolder, BluetoothRequestViewItem> {
    public static final int VIEW_TYPE = 10004;
    private final PositionActions actions;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonPushAlertBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonPushAlertBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonPushAlertBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class BluetoothRequestViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonPushAlertBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public BluetoothRequestViewHolder(VqCommonPushAlertBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonPushAlertBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "<init>", "()V", "", "getViewType", "()I", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class BluetoothRequestViewItem implements InterfaceC9233g {
        public static final int $stable = 0;

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10004;
        }
    }

    public BluetoothRequestAdapter(PositionActions actions, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.actions = actions;
        this.vqThemer = vqThemer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(BluetoothRequestAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.actions.requestEnableBluetooth();
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public BluetoothRequestViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonPushAlertBinding vqCommonPushAlertBindingInflate = VqCommonPushAlertBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonPushAlertBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new BluetoothRequestViewHolder(vqCommonPushAlertBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(BluetoothRequestViewHolder holder, BluetoothRequestViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        VqCommonPushAlertBinding binding = holder.getBinding();
        binding.alertCta.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.MyLinesBluetoothCta, null, false, 6, null));
        binding.alertCta.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BluetoothRequestAdapter.onBindViewHolder$lambda$1$lambda$0(this.f45278a, view);
            }
        });
        binding.alertDetail.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.MyLinesBluetoothDetail, null, false, 6, null));
        binding.alertIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.MyLinesBluetoothIcon, null, 2, null));
    }
}