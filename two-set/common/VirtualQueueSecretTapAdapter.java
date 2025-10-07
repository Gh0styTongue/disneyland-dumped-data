package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.databinding.VqCommonVirtualQueueTapBinding;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001b\u001c\u001d\u001eB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewItem;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "actions", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewHolder;Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewItem;)V", "Landroidx/fragment/app/Fragment;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "Companion", "Factory", "VirtualQueueSecretTapViewHolder", "VirtualQueueSecretTapViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueSecretTapAdapter implements InterfaceC9229c<VirtualQueueSecretTapViewHolder, VirtualQueueSecretTapViewItem> {
    public static final int VIEW_TYPE = 10007;
    private final PeekViewActions actions;
    private final Fragment fragment;
    private final VirtualQueueAnalytics virtualQueueAnalytics;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;)V", "getActions", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "create", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final PeekViewActions actions;
        private final VirtualQueueAnalytics virtualQueueAnalytics;
        private final VirtualQueueThemer vqThemer;

        @Inject
        public Factory(VirtualQueueThemer vqThemer, VirtualQueueAnalytics virtualQueueAnalytics, PeekViewActions actions) {
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.vqThemer = vqThemer;
            this.virtualQueueAnalytics = virtualQueueAnalytics;
            this.actions = actions;
        }

        public final VirtualQueueSecretTapAdapter create(Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return new VirtualQueueSecretTapAdapter(fragment, this.vqThemer, this.virtualQueueAnalytics, this.actions);
        }

        public final PeekViewActions getActions() {
            return this.actions;
        }

        public final VirtualQueueAnalytics getVirtualQueueAnalytics() {
            return this.virtualQueueAnalytics;
        }

        public final VirtualQueueThemer getVqThemer() {
            return this.vqThemer;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonVirtualQueueTapBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonVirtualQueueTapBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonVirtualQueueTapBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class VirtualQueueSecretTapViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonVirtualQueueTapBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public VirtualQueueSecretTapViewHolder(VqCommonVirtualQueueTapBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonVirtualQueueTapBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "<init>", "()V", "", "getViewType", "()I", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class VirtualQueueSecretTapViewItem implements InterfaceC9233g {
        public static final int $stable = 0;

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10007;
        }
    }

    public VirtualQueueSecretTapAdapter(Fragment fragment, VirtualQueueThemer vqThemer, VirtualQueueAnalytics virtualQueueAnalytics, PeekViewActions actions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.fragment = fragment;
        this.vqThemer = vqThemer;
        this.virtualQueueAnalytics = virtualQueueAnalytics;
        this.actions = actions;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public VirtualQueueSecretTapViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonVirtualQueueTapBinding vqCommonVirtualQueueTapBindingInflate = VqCommonVirtualQueueTapBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonVirtualQueueTapBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new VirtualQueueSecretTapViewHolder(vqCommonVirtualQueueTapBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(VirtualQueueSecretTapViewHolder holder, VirtualQueueSecretTapViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        VqCommonVirtualQueueTapBinding binding = holder.getBinding();
        binding.virtualQueueTapIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.HowToVisitPlaceholderIcon, null, 2, null));
        binding.virtualQueueTapIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonVirtualQueueAccessibility, null, false, 6, null));
        TextView virtualQueueTapIcon = binding.virtualQueueTapIcon;
        Intrinsics.checkNotNullExpressionValue(virtualQueueTapIcon, "virtualQueueTapIcon");
        CommonExtensionsKt.setOnDebouncedClickListener$default(virtualQueueTapIcon, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.ui.common.VirtualQueueSecretTapAdapter$onBindViewHolder$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.actions.triggerPeekView(this.this$0.fragment);
            }
        }, 1, null);
    }
}