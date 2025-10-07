package com.disney.wdpro.virtualqueue.p462ui.common;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.databinding.VqCommonSelectAllBinding;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0004\u0016\u0017\u0018\u0019B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewHolder;Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewType;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "SelectAllActions", "SelectAllViewHolder", "SelectAllViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SelectAllAdapter extends AccessibleAdapter implements InterfaceC9229c<SelectAllViewHolder, SelectAllViewType> {
    public static final int VIEW_TYPE = 10002;
    private final SelectAllActions actions;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllActions;", "", "actionType", "Lcom/disney/wdpro/virtualqueue/ui/common/QueueAction;", "hasReachedMaxParty", "", "onSelectAllStateChange", "", MAAccessibilityConstants.SELECTED, "shouldEnableSelectAll", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface SelectAllActions {

        @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class DefaultImpls {
            public static boolean shouldEnableSelectAll(SelectAllActions selectAllActions) {
                return false;
            }
        }

        QueueAction actionType();

        boolean hasReachedMaxParty();

        void onSelectAllStateChange(boolean selected);

        boolean shouldEnableSelectAll();
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$CreatePartyViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonSelectAllBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonSelectAllBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonSelectAllBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectAllViewHolder extends CreatePartyMainAdapter.CreatePartyViewHolder {
        public static final int $stable = 8;
        private final VqCommonSelectAllBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public SelectAllViewHolder(VqCommonSelectAllBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonSelectAllBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "()V", "lastClickTime", "", "getLastClickTime", "()J", "setLastClickTime", "(J)V", MAAccessibilityConstants.SELECTED, "", "getSelected", "()Z", "setSelected", "(Z)V", "showTopLine", "getShowTopLine", "setShowTopLine", "getViewType", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectAllViewType extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private long lastClickTime;
        private boolean selected = true;
        private boolean showTopLine;

        public final long getLastClickTime() {
            return this.lastClickTime;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final boolean getShowTopLine() {
            return this.showTopLine;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10002;
        }

        public final void setLastClickTime(long j10) {
            this.lastClickTime = j10;
        }

        public final void setSelected(boolean z10) {
            this.selected = z10;
        }

        public final void setShowTopLine(boolean z10) {
            this.showTopLine = z10;
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QueueAction.values().length];
            try {
                iArr[QueueAction.JOIN_QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QueueAction.LEAVE_QUEUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SelectAllAdapter(SelectAllActions actions, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.actions = actions;
        this.vqThemer = vqThemer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(SelectAllViewType item, VqCommonSelectAllBinding this_with, SelectAllAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (SystemClock.elapsedRealtime() - item.getLastClickTime() < 300) {
            return;
        }
        item.setLastClickTime(SystemClock.elapsedRealtime());
        if (this_with.checkBox.isEnabled()) {
            if (this$0.actions.hasReachedMaxParty() && !this_with.checkBox.isChecked()) {
                this_with.checkBox.setEnabled(false);
                return;
            }
            this_with.checkBox.setEnabled(true);
            CheckBox checkBox = this_with.checkBox;
            checkBox.setChecked(true ^ checkBox.isChecked());
            this$0.actions.onSelectAllStateChange(this_with.checkBox.isChecked());
            item.setSelected(this_with.checkBox.isChecked());
        }
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public SelectAllViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonSelectAllBinding vqCommonSelectAllBindingInflate = VqCommonSelectAllBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonSelectAllBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SelectAllViewHolder(vqCommonSelectAllBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(SelectAllViewHolder holder, final SelectAllViewType item) {
        String string$default;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final VqCommonSelectAllBinding binding = holder.getBinding();
        binding.textView.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonSelectAll, null, false, 6, null));
        binding.checkBox.setButtonDrawable(C21487R.drawable.vq_checkbox);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectAllAdapter.onBindViewHolder$lambda$1$lambda$0(item, binding, this, view);
            }
        });
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.actions.actionType().ordinal()];
        if (i10 == 1) {
            binding.checkBox.setEnabled(this.actions.shouldEnableSelectAll());
        } else if (i10 == 2) {
            binding.checkBox.setEnabled(true);
        }
        binding.checkBox.setChecked(item.getSelected());
        binding.topLine.setVisibility(item.getShowTopLine() ? 0 : 8);
        if (item.getSelected()) {
            string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonCheckedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", binding.textView.getText())), null, false, 12, null);
        } else {
            string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonUncheckedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", binding.textView.getText())), null, false, 12, null);
        }
        if (!binding.checkBox.isEnabled()) {
            string$default = string$default + ", " + VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonVirtualQueueDimmedCheckboxAccessibility, null, false, 6, null);
        }
        handleAccessibilityUpdate(string$default, holder, item);
    }
}