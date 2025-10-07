package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.interfaces.PositionActions;
import com.disney.wdpro.virtualqueue.databinding.VqMyQueuesEmptyBinding;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p860q1.C31640h;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0018\u0019\u001aB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewType;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "actions", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewHolder;Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewType;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "EmptyListViewHolder", "EmptyListViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class EmptyListAdapter implements InterfaceC9229c<EmptyListViewHolder, EmptyListViewType> {
    public static final int VIEW_TYPE = 10031;
    private final PositionActions actions;
    private final Context context;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$CreatePartyViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesEmptyBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesEmptyBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesEmptyBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class EmptyListViewHolder extends CreatePartyMainAdapter.CreatePartyViewHolder {
        public static final int $stable = 8;
        private final VqMyQueuesEmptyBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public EmptyListViewHolder(VqMyQueuesEmptyBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqMyQueuesEmptyBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewType;", "Lcom/disney/wdpro/commons/adapter/g;", "Landroid/content/Context;", "context", "", "isMyQueuesPage", "<init>", "(Landroid/content/Context;Z)V", "", "getViewType", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Z", "()Z", "enableButton", "getEnableButton", "setEnableButton", "(Z)V", "hideButton", "getHideButton", "setHideButton", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class EmptyListViewType implements InterfaceC9233g {
        public static final int $stable = 8;
        private final Context context;
        private boolean enableButton;
        private boolean hideButton;
        private final boolean isMyQueuesPage;

        public EmptyListViewType(Context context, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.isMyQueuesPage = z10;
            this.enableButton = true;
        }

        public final Context getContext() {
            return this.context;
        }

        public final boolean getEnableButton() {
            return this.enableButton;
        }

        public final boolean getHideButton() {
            return this.hideButton;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10031;
        }

        /* renamed from: isMyQueuesPage, reason: from getter */
        public final boolean getIsMyQueuesPage() {
            return this.isMyQueuesPage;
        }

        public final void setEnableButton(boolean z10) {
            this.enableButton = z10;
        }

        public final void setHideButton(boolean z10) {
            this.hideButton = z10;
        }
    }

    public EmptyListAdapter(PositionActions actions, Context context, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.actions = actions;
        this.context = context;
        this.vqThemer = vqThemer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(EmptyListAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.actions.startJoinFlow(true);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public EmptyListViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqMyQueuesEmptyBinding vqMyQueuesEmptyBindingInflate = VqMyQueuesEmptyBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqMyQueuesEmptyBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new EmptyListViewHolder(vqMyQueuesEmptyBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(EmptyListViewHolder holder, EmptyListViewType item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        VqMyQueuesEmptyBinding binding = holder.getBinding();
        binding.emptyDetail.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.MyLinesEmptyDetail, null, false, 6, null));
        binding.joinButton.setBackgroundResource(C21487R.drawable.btn_hyperion_medium_secondary_selector);
        binding.joinButton.setTextColor(C31640h.m97202e(holder.itemView.getResources(), C21487R.color.btn_hyperion_secondary_text_color_selector, null));
        binding.joinButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmptyListAdapter.onBindViewHolder$lambda$1$lambda$0(this.f45279a, view);
            }
        });
        binding.joinButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.MyLinesEmptyCta, null, false, 6, null));
        binding.joinButton.setEnabled(item.getEnableButton());
        binding.joinButton.setVisibility(item.getHideButton() ? 8 : 0);
        binding.bottomShadow.setVisibility((item.getHideButton() || !item.getIsMyQueuesPage()) ? 8 : 0);
    }
}