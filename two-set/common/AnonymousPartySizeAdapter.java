package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.databinding.VqCommonAnonymousPartySizeBinding;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 \u00172\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0004\u0018\u0019\u001a\u0017B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "holder", "item", "", "setAccessibilityContentForButtons", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewHolder;Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewHolder;", "onBindViewHolder", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "AnonymousPartySizeActions", "AnonymousPartySizeViewHolder", "AnonymousPartySizeViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public class AnonymousPartySizeAdapter extends AccessibleAdapter implements InterfaceC9229c<AnonymousPartySizeViewHolder, AnonymousPartySizeViewItem> {
    public static final String PARTY_SIZE = "partySize";
    public static final int VIEW_TYPE = 10006;
    private final AnonymousPartySizeActions actions;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeActions;", "", "updateClosedQueueMessage", "", "minus", "Landroid/widget/TextView;", "plus", "warningLayout", "Landroid/widget/LinearLayout;", "updatePartySize", "partySize", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface AnonymousPartySizeActions {
        void updateClosedQueueMessage(TextView minus, TextView plus, LinearLayout warningLayout);

        void updatePartySize(int partySize);
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonAnonymousPartySizeBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonAnonymousPartySizeBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonAnonymousPartySizeBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class AnonymousPartySizeViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCommonAnonymousPartySizeBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public AnonymousPartySizeViewHolder(VqCommonAnonymousPartySizeBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonAnonymousPartySizeBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "viewType", "", "minPartySize", "initialPartySize", "instructionText", "", "promptText", "(IIILjava/lang/String;Ljava/lang/String;)V", "getInstructionText", "()Ljava/lang/String;", "maxPartySize", "getMaxPartySize", "()I", "setMaxPartySize", "(I)V", "getMinPartySize", "partySize", "getPartySize", "setPartySize", "getPromptText", "queueName", "getQueueName", "setQueueName", "(Ljava/lang/String;)V", "warningText", "getWarningText", "setWarningText", "getViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class AnonymousPartySizeViewItem extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private final String instructionText;
        private int maxPartySize;
        private final int minPartySize;
        private int partySize;
        private final String promptText;
        private String queueName;
        private final int viewType;
        private String warningText;

        public AnonymousPartySizeViewItem(int i10, int i11, int i12, String instructionText, String promptText) {
            Intrinsics.checkNotNullParameter(instructionText, "instructionText");
            Intrinsics.checkNotNullParameter(promptText, "promptText");
            this.viewType = i10;
            this.minPartySize = i11;
            this.instructionText = instructionText;
            this.promptText = promptText;
            this.partySize = i12;
            this.warningText = "";
            this.queueName = "";
        }

        public final String getInstructionText() {
            return this.instructionText;
        }

        public final int getMaxPartySize() {
            return this.maxPartySize;
        }

        public final int getMinPartySize() {
            return this.minPartySize;
        }

        public final int getPartySize() {
            return this.partySize;
        }

        public final String getPromptText() {
            return this.promptText;
        }

        public final String getQueueName() {
            return this.queueName;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return this.viewType;
        }

        public final String getWarningText() {
            return this.warningText;
        }

        public final void setMaxPartySize(int i10) {
            this.maxPartySize = i10;
        }

        public final void setPartySize(int i10) {
            this.partySize = i10;
        }

        public final void setQueueName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.queueName = str;
        }

        public final void setWarningText(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.warningText = str;
        }
    }

    public AnonymousPartySizeAdapter(AnonymousPartySizeActions actions, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.actions = actions;
        this.vqThemer = vqThemer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2$lambda$0(AnonymousPartySizeViewItem item, AnonymousPartySizeAdapter this$0, VqCommonAnonymousPartySizeBinding this_with, AnonymousPartySizeViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (item.getPartySize() < item.getMaxPartySize()) {
            item.setPartySize(item.getPartySize() + 1);
            this$0.actions.updatePartySize(item.getPartySize());
            this_with.totalGuestsMinusIcon.setEnabled(true);
            this_with.totalGuestsText.setText(String.valueOf(item.getPartySize()));
            this$0.setAccessibilityContentForButtons(holder, item);
            if (item.getPartySize() == item.getMaxPartySize()) {
                this_with.totalGuestsPlusIcon.setEnabled(false);
                if (StringsKt.isBlank(item.getWarningText())) {
                    return;
                }
                this_with.totalGuestsWarningContainer.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2$lambda$1(AnonymousPartySizeViewItem item, AnonymousPartySizeAdapter this$0, VqCommonAnonymousPartySizeBinding this_with, AnonymousPartySizeViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (item.getPartySize() > item.getMinPartySize()) {
            item.setPartySize(item.getPartySize() - 1);
            this$0.actions.updatePartySize(item.getPartySize());
            this_with.totalGuestsWarningContainer.setVisibility(8);
            this_with.totalGuestsPlusIcon.setEnabled(true);
            this_with.totalGuestsText.setText(String.valueOf(item.getPartySize()));
            this$0.setAccessibilityContentForButtons(holder, item);
            if (item.getPartySize() == item.getMinPartySize()) {
                this_with.totalGuestsMinusIcon.setEnabled(false);
            }
            if (item.getPartySize() >= item.getMaxPartySize()) {
                this_with.totalGuestsPlusIcon.setEnabled(false);
                if (StringsKt.isBlank(item.getWarningText())) {
                    return;
                }
                this_with.totalGuestsWarningContainer.setVisibility(0);
            }
        }
    }

    private final void setAccessibilityContentForButtons(AnonymousPartySizeViewHolder holder, AnonymousPartySizeViewItem item) {
        VqCommonAnonymousPartySizeBinding binding = holder.getBinding();
        binding.totalGuestsPlusIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyIncreaseGuest, MapsKt.mapOf(TuplesKt.m92045to("partySize", String.valueOf(item.getPartySize()))), null, false, 12, null));
        binding.totalGuestsMinusIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyDecreaseGuest, MapsKt.mapOf(TuplesKt.m92045to("partySize", String.valueOf(item.getPartySize()))), null, false, 12, null));
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public AnonymousPartySizeViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCommonAnonymousPartySizeBinding vqCommonAnonymousPartySizeBindingInflate = VqCommonAnonymousPartySizeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCommonAnonymousPartySizeBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new AnonymousPartySizeViewHolder(vqCommonAnonymousPartySizeBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(final AnonymousPartySizeViewHolder holder, final AnonymousPartySizeViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final VqCommonAnonymousPartySizeBinding binding = holder.getBinding();
        binding.txtAnonQueueName.setVisibility(!StringsKt.isBlank(item.getQueueName()) ? 0 : 8);
        binding.txtAnonQueueName.setText(item.getQueueName());
        binding.instructionalText.setText(item.getInstructionText());
        binding.totalGuestsHeader.setText(item.getPromptText());
        binding.totalGuestsPlusIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.CommonPlusIcon, null, 2, null));
        binding.totalGuestsMinusIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.CommonMinusIcon, null, 2, null));
        binding.totalGuestsText.setText(String.valueOf(item.getPartySize()));
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m92045to("partySize", String.valueOf(item.getPartySize())));
        binding.totalGuestsMinusIcon.setEnabled(item.getPartySize() > item.getMinPartySize());
        binding.totalGuestsMinusIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyDecreaseGuest, mapMapOf, null, false, 12, null));
        binding.totalGuestsPlusIcon.setEnabled(item.getPartySize() < item.getMaxPartySize());
        binding.totalGuestsPlusIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyIncreaseGuest, mapMapOf, null, false, 12, null));
        binding.totalGuestsWarningIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.CommonWarningIcon, null, 2, null));
        binding.totalGuestsWarningIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, item.getWarningText())), null, false, 12, null));
        binding.totalGuestsWarningText.setText(item.getWarningText());
        if (item.getPartySize() >= item.getMaxPartySize() && !StringsKt.isBlank(item.getWarningText())) {
            binding.totalGuestsWarningContainer.setVisibility(0);
        } else {
            binding.totalGuestsWarningContainer.setVisibility(8);
        }
        binding.totalGuestsPlusIcon.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnonymousPartySizeAdapter.onBindViewHolder$lambda$2$lambda$0(item, this, binding, holder, view);
            }
        });
        binding.totalGuestsMinusIcon.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.common.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnonymousPartySizeAdapter.onBindViewHolder$lambda$2$lambda$1(item, this, binding, holder, view);
            }
        });
        this.actions.updatePartySize(item.getPartySize());
        AnonymousPartySizeActions anonymousPartySizeActions = this.actions;
        VqCommonAnonymousPartySizeBinding binding2 = holder.getBinding();
        TextView textView = binding2 != null ? binding2.totalGuestsMinusIcon : null;
        Intrinsics.checkNotNull(textView);
        VqCommonAnonymousPartySizeBinding binding3 = holder.getBinding();
        TextView textView2 = binding3 != null ? binding3.totalGuestsPlusIcon : null;
        Intrinsics.checkNotNull(textView2);
        VqCommonAnonymousPartySizeBinding binding4 = holder.getBinding();
        LinearLayout linearLayout = binding4 != null ? binding4.totalGuestsWarningContainer : null;
        Intrinsics.checkNotNull(linearLayout);
        anonymousPartySizeActions.updateClosedQueueMessage(textView, textView2, linearLayout);
    }
}