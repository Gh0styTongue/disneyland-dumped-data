package com.disney.wdpro.virtualqueue.p462ui.conflict;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.databinding.VqConflictGuestBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0004\u001f !\"B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/commons/j;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewHolder;Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;)V", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Lcom/disney/wdpro/commons/j;", "ConflictGuestActions", "ConflictGuestViewHolder", "ConflictGuestViewItem", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class ConflictGuestAdapter extends AccessibleAdapter implements InterfaceC9229c<ConflictGuestViewHolder, ConflictGuestViewItem> {
    public static final int $stable = 8;
    private final ConflictGuestActions actions;
    private final Context context;
    private final LinkedGuestUtils linkedGuestUtils;
    private final C9314j parkAppConfiguration;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestActions;", "", "isAccessibilityEnabled", "", "removeGuestFromParty", "", "guestViewItem", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface ConflictGuestActions {
        boolean isAccessibilityEnabled();

        void removeGuestFromParty(ConflictGuestViewItem guestViewItem);
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqConflictGuestBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqConflictGuestBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqConflictGuestBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class ConflictGuestViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqConflictGuestBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public ConflictGuestViewHolder(VqConflictGuestBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqConflictGuestBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "guest", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "getGuest", "()Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "setGuest", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;)V", "isInConflict", "", "()Z", "setInConflict", "(Z)V", "getQueue", "()Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "getViewType", "", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class ConflictGuestViewItem extends AccessibleRecyclerViewItem {
        public static final int VIEW_TYPE = 10014;
        private LinkedGuest guest;
        private boolean isInConflict;
        private final Queue queue;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem$Companion;", "", "()V", "VIEW_TYPE", "", "sortComparator", "Ljava/util/Comparator;", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;", "Lkotlin/Comparator;", "getSortComparator", "()Ljava/util/Comparator;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int _get_sortComparator_$lambda$0(ConflictGuestViewItem conflictGuestViewItem, ConflictGuestViewItem conflictGuestViewItem2) {
                return LinkedGuestUtils.INSTANCE.getSortComparator().compare(conflictGuestViewItem.getGuest(), conflictGuestViewItem2.getGuest());
            }

            public final Comparator<ConflictGuestViewItem> getSortComparator() {
                return new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.conflict.c
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ConflictGuestAdapter.ConflictGuestViewItem.Companion._get_sortComparator_$lambda$0((ConflictGuestAdapter.ConflictGuestViewItem) obj, (ConflictGuestAdapter.ConflictGuestViewItem) obj2);
                    }
                };
            }

            private Companion() {
            }
        }

        public ConflictGuestViewItem(LinkedGuest guest, Queue queue) {
            Intrinsics.checkNotNullParameter(guest, "guest");
            Intrinsics.checkNotNullParameter(queue, "queue");
            this.guest = guest;
            this.queue = queue;
        }

        public final LinkedGuest getGuest() {
            return this.guest;
        }

        public final Queue getQueue() {
            return this.queue;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10014;
        }

        /* renamed from: isInConflict, reason: from getter */
        public final boolean getIsInConflict() {
            return this.isInConflict;
        }

        public final void setGuest(LinkedGuest linkedGuest) {
            Intrinsics.checkNotNullParameter(linkedGuest, "<set-?>");
            this.guest = linkedGuest;
        }

        public final void setInConflict(boolean z10) {
            this.isInConflict = z10;
        }
    }

    @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/commons/j;)V", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter;", "create", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Lcom/disney/wdpro/commons/j;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final LinkedGuestUtils linkedGuestUtils;
        private final C9314j parkAppConfiguration;

        @Inject
        public Factory(LinkedGuestUtils linkedGuestUtils, C9314j parkAppConfiguration) {
            Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
            Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
            this.linkedGuestUtils = linkedGuestUtils;
            this.parkAppConfiguration = parkAppConfiguration;
        }

        public final ConflictGuestAdapter create(Context context, ConflictGuestActions actions, VirtualQueueThemer vqThemer) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            return new ConflictGuestAdapter(context, actions, vqThemer, this.linkedGuestUtils, this.parkAppConfiguration);
        }
    }

    public ConflictGuestAdapter(Context context, ConflictGuestActions actions, VirtualQueueThemer vqThemer, LinkedGuestUtils linkedGuestUtils, C9314j parkAppConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        this.context = context;
        this.actions = actions;
        this.vqThemer = vqThemer;
        this.linkedGuestUtils = linkedGuestUtils;
        this.parkAppConfiguration = parkAppConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2$lambda$0(ConflictGuestAdapter this$0, ConflictGuestViewItem item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.actions.removeGuestFromParty(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2$lambda$1(ConflictGuestAdapter this$0, VqConflictGuestBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        if (this$0.actions.isAccessibilityEnabled()) {
            this_with.removeButton.callOnClick();
        }
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public ConflictGuestViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqConflictGuestBinding vqConflictGuestBindingInflate = VqConflictGuestBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqConflictGuestBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ConflictGuestViewHolder(vqConflictGuestBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(ConflictGuestViewHolder holder, final ConflictGuestViewItem item) {
        String strDisplayNameFull;
        String strAccessibilityName;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final VqConflictGuestBinding binding = holder.getBinding();
        boolean z10 = item.getQueue().getGuestIdMode() == QueueGuestIdMode.ANONYMOUS;
        TextView textView = binding.guestName;
        if (z10) {
            strDisplayNameFull = this.linkedGuestUtils.displayName(item.getGuest());
        } else {
            strDisplayNameFull = this.linkedGuestUtils.displayNameFull(item.getGuest(), this.vqThemer);
        }
        textView.setText(strDisplayNameFull);
        LinkedGuestUtils linkedGuestUtils = this.linkedGuestUtils;
        LinkedGuest guest = item.getGuest();
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        linkedGuestUtils.setGuestImage(guest, view, this.vqThemer, z10);
        binding.removeButton.setVisibility((item.getIsInConflict() && item.getQueue().getGuestIdMode() == QueueGuestIdMode.IDENTIFIED) ? 0 : 8);
        if (Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "WDW")) {
            binding.guestIconCheckmark.setVisibility(item.getIsInConflict() ? 8 : 0);
        }
        binding.removeButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NsfRemoveCta, null, false, 6, null));
        binding.removeButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.conflict.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConflictGuestAdapter.onBindViewHolder$lambda$2$lambda$0(this.f45274a, item, view2);
            }
        });
        if (item.getIsInConflict()) {
            strAccessibilityName = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NsfRemoveCtaAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer))), null, false, 12, null);
        } else {
            strAccessibilityName = this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer);
        }
        handleAccessibilityUpdate(strAccessibilityName, holder, item);
        if (item.getIsInConflict()) {
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.conflict.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ConflictGuestAdapter.onBindViewHolder$lambda$2$lambda$1(this.f45276a, binding, view2);
                }
            });
        } else {
            binding.getRoot().setClickable(false);
        }
    }
}