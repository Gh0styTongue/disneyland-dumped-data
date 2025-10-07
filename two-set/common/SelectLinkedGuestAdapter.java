package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.databinding.VqCommonGuestSelectItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuestType;
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

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0005\u001f !\"#B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006$"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$LinkedGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$LinkedGuestViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$LinkedGuestViewHolder;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;)V", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Companion", "Factory", "LinkedGuestViewHolder", "SelectLinkedGuestActions", "SelectLinkedGuestViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SelectLinkedGuestAdapter extends AccessibleAdapter implements InterfaceC9229c<LinkedGuestViewHolder, SelectLinkedGuestViewItem> {
    public static final int VIEW_TYPE = 10001;
    private final SelectLinkedGuestActions actions;
    private final Context context;
    private final LinkedGuestUtils linkedGuestUtils;
    private final C9314j parkAppConfiguration;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "<init>", "(Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)V", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter;", "create", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final LinkedGuestUtils linkedGuestUtils;
        private final C9314j parkAppConfiguration;

        @Inject
        public Factory(C9314j parkAppConfiguration, LinkedGuestUtils linkedGuestUtils) {
            Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
            Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
            this.parkAppConfiguration = parkAppConfiguration;
            this.linkedGuestUtils = linkedGuestUtils;
        }

        public final SelectLinkedGuestAdapter create(Context context, SelectLinkedGuestActions actions, VirtualQueueThemer vqThemer) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            return new SelectLinkedGuestAdapter(context, actions, vqThemer, this.parkAppConfiguration, this.linkedGuestUtils);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$LinkedGuestViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonGuestSelectItemBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonGuestSelectItemBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonGuestSelectItemBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class LinkedGuestViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonGuestSelectItemBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public LinkedGuestViewHolder(VqCommonGuestSelectItemBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonGuestSelectItemBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;", "", "guestSelectionUpdated", "", "item", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;", "hasReachedMaxParty", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface SelectLinkedGuestActions {
        void guestSelectionUpdated(SelectLinkedGuestViewItem item);

        boolean hasReachedMaxParty();
    }

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR$\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006 "}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "guest", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", RecommenderThemerConstants.INDEX, "", "sectionTotal", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;II)V", "getGuest", "()Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "setGuest", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;)V", "getIndex", "()I", "setIndex", "(I)V", "preventChanges", "", "getPreventChanges$annotations", "()V", "getPreventChanges", "()Z", "setPreventChanges", "(Z)V", "getSectionTotal", "setSectionTotal", "value", MAAccessibilityConstants.SELECTED, "getSelected", "setSelected", "getViewType", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectLinkedGuestViewItem extends AccessibleRecyclerViewItem {
        private LinkedGuest guest;
        private int index;
        private boolean preventChanges;
        private int sectionTotal;
        private boolean selected;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem$Companion;", "", "()V", "sortComparator", "Ljava/util/Comparator;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;", "Lkotlin/Comparator;", "getSortComparator", "()Ljava/util/Comparator;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int _get_sortComparator_$lambda$0(SelectLinkedGuestViewItem selectLinkedGuestViewItem, SelectLinkedGuestViewItem selectLinkedGuestViewItem2) {
                return LinkedGuestUtils.INSTANCE.getSortComparator().compare(selectLinkedGuestViewItem.getGuest(), selectLinkedGuestViewItem2.getGuest());
            }

            public final Comparator<SelectLinkedGuestViewItem> getSortComparator() {
                return new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.common.k
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return SelectLinkedGuestAdapter.SelectLinkedGuestViewItem.Companion._get_sortComparator_$lambda$0((SelectLinkedGuestAdapter.SelectLinkedGuestViewItem) obj, (SelectLinkedGuestAdapter.SelectLinkedGuestViewItem) obj2);
                    }
                };
            }

            private Companion() {
            }
        }

        public SelectLinkedGuestViewItem(LinkedGuest guest, int i10, int i11) {
            Intrinsics.checkNotNullParameter(guest, "guest");
            this.guest = guest;
            this.index = i10;
            this.sectionTotal = i11;
            this.selected = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _set_selected_$lambda$0(SelectLinkedGuestViewItem this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.preventChanges = false;
        }

        public static /* synthetic */ void getPreventChanges$annotations() {
        }

        public final LinkedGuest getGuest() {
            return this.guest;
        }

        public final int getIndex() {
            return this.index;
        }

        public final boolean getPreventChanges() {
            return this.preventChanges;
        }

        public final int getSectionTotal() {
            return this.sectionTotal;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10001;
        }

        public final void setGuest(LinkedGuest linkedGuest) {
            Intrinsics.checkNotNullParameter(linkedGuest, "<set-?>");
            this.guest = linkedGuest;
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }

        public final void setPreventChanges(boolean z10) {
            this.preventChanges = z10;
        }

        public final void setSectionTotal(int i10) {
            this.sectionTotal = i10;
        }

        public final void setSelected(boolean z10) {
            if (this.preventChanges || this.selected == z10) {
                return;
            }
            this.selected = z10;
            this.preventChanges = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.ui.common.j
                @Override // java.lang.Runnable
                public final void run() {
                    SelectLinkedGuestAdapter.SelectLinkedGuestViewItem._set_selected_$lambda$0(this.f45273a);
                }
            }, 300L);
        }
    }

    public SelectLinkedGuestAdapter(Context context, SelectLinkedGuestActions actions, VirtualQueueThemer vqThemer, C9314j parkAppConfiguration, LinkedGuestUtils linkedGuestUtils) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        this.context = context;
        this.actions = actions;
        this.vqThemer = vqThemer;
        this.parkAppConfiguration = parkAppConfiguration;
        this.linkedGuestUtils = linkedGuestUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(SelectLinkedGuestAdapter this$0, SelectLinkedGuestViewItem item, VqCommonGuestSelectItemBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        if (this$0.actions.hasReachedMaxParty() && !item.getSelected()) {
            this_with.guestCheckBox.setEnabled(false);
        } else {
            if (item.getPreventChanges()) {
                return;
            }
            this_with.guestCheckBox.setChecked(!r4.isChecked());
            item.setSelected(this_with.guestCheckBox.isChecked());
            this$0.actions.guestSelectionUpdated(item);
        }
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public LinkedGuestViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonGuestSelectItemBinding vqCommonGuestSelectItemBindingInflate = VqCommonGuestSelectItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonGuestSelectItemBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new LinkedGuestViewHolder(vqCommonGuestSelectItemBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(LinkedGuestViewHolder holder, final SelectLinkedGuestViewItem item) {
        String strAccessibilityName;
        String string$default;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final VqCommonGuestSelectItemBinding binding = holder.getBinding();
        binding.guestName.setText(this.linkedGuestUtils.displayNameFull(item.getGuest(), this.vqThemer));
        binding.guestCheckBox.setButtonDrawable(C21487R.drawable.vq_checkbox);
        binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectLinkedGuestAdapter.onBindViewHolder$lambda$1$lambda$0(this.f45270a, item, binding, view);
            }
        });
        binding.guestCheckBox.setEnabled(!this.actions.hasReachedMaxParty() || item.getSelected());
        if (Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "DLR")) {
            if (item.getGuest().getType() == LinkedGuestType.TICKET) {
                strAccessibilityName = this.context.getString(C21487R.string.vq_accessibility_txt_common_ticket_for_guest, VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.TicketFor, null, false, 6, null), this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer));
            } else {
                strAccessibilityName = this.context.getString(C21487R.string.vq_accessibility_txt_common_pass_for_guest, VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PassFor, null, false, 6, null), this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer));
            }
        } else {
            strAccessibilityName = this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer);
        }
        Intrinsics.checkNotNullExpressionValue(strAccessibilityName, "if (parkAppConfiguration…, vqThemer)\n            }");
        if (item.getSelected()) {
            string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyGuestCheckedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", strAccessibilityName), TuplesKt.m92045to(RecommenderThemerConstants.INSTANCE, Integer.valueOf(item.getIndex())), TuplesKt.m92045to("total", Integer.valueOf(item.getSectionTotal()))), null, false, 12, null);
        } else {
            string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyGuestUncheckedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", strAccessibilityName), TuplesKt.m92045to(RecommenderThemerConstants.INSTANCE, Integer.valueOf(item.getIndex())), TuplesKt.m92045to("total", Integer.valueOf(item.getSectionTotal()))), null, false, 12, null);
        }
        handleAccessibilityUpdate(string$default, holder, item);
        binding.guestCheckBox.setChecked(item.getSelected());
        LinkedGuestUtils linkedGuestUtils = this.linkedGuestUtils;
        LinkedGuest guest = item.getGuest();
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        LinkedGuestUtils.setGuestImage$default(linkedGuestUtils, guest, view, this.vqThemer, false, 8, null);
    }
}