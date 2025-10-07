package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.PositionActions;
import com.disney.wdpro.virtualqueue.databinding.VqCommonPushAlertBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0018\u0019\u001aB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewItem;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "actions", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewHolder;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewItem;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "PushAlertViewHolder", "PushAlertViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class PushAlertAdapter implements InterfaceC9229c<PushAlertViewHolder, PushAlertViewItem> {
    public static final int VIEW_TYPE = 10003;
    private final PositionActions actions;
    private final Context context;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonPushAlertBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonPushAlertBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonPushAlertBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class PushAlertViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonPushAlertBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public PushAlertViewHolder(VqCommonPushAlertBinding binding) {
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

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)V", "", "getViewType", "()I", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "getVqPageType", "()Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class PushAlertViewItem implements InterfaceC9233g {
        public static final int $stable = 0;
        private final VQPageType vqPageType;

        public PushAlertViewItem(VQPageType vqPageType) {
            Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
            this.vqPageType = vqPageType;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10003;
        }

        public final VQPageType getVqPageType() {
            return this.vqPageType;
        }
    }

    public PushAlertAdapter(PositionActions actions, Context context, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.actions = actions;
        this.context = context;
        this.vqThemer = vqThemer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(PushAlertAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.actions.requestEnablePushNotifications();
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public PushAlertViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonPushAlertBinding vqCommonPushAlertBindingInflate = VqCommonPushAlertBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonPushAlertBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new PushAlertViewHolder(vqCommonPushAlertBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(PushAlertViewHolder holder, PushAlertViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.MyLinesNotificationCta, null, false, 6, null);
        String string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.MyLinesNotificationDetail, null, false, 6, null);
        VqCommonPushAlertBinding binding = holder.getBinding();
        binding.alertCta.setText(string$default);
        binding.alertCta.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PushAlertAdapter.onBindViewHolder$lambda$1$lambda$0(this.f45297a, view);
            }
        });
        binding.alertDetail.setText(string$default2);
        binding.alertIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.MyLinesNotificationIcon, null, 2, null));
        binding.vqPushAlertContainer.setContentDescription(string$default2 + " " + string$default);
    }
}