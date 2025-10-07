package com.disney.wdpro.virtualqueue.p462ui.create_party;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqCreatePartyQueueNameBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00132\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0003\u0013\u0014\u0015B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewItem;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewHolder;Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewItem;)V", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "QueueNameViewHolder", "QueueNameViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public class QueueNameAdapter extends AccessibleAdapter implements InterfaceC9229c<QueueNameViewHolder, QueueNameViewItem> {
    public static final int VIEW_TYPE = 10034;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyQueueNameBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyQueueNameBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCreatePartyQueueNameBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class QueueNameViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqCreatePartyQueueNameBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public QueueNameViewHolder(VqCreatePartyQueueNameBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCreatePartyQueueNameBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\n¨\u0006'"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "viewType", "", "(I)V", "heightRestrictions", "", "getHeightRestrictions", "()Ljava/lang/String;", "setHeightRestrictions", "(Ljava/lang/String;)V", "howToEnterDescription", "getHowToEnterDescription", "setHowToEnterDescription", "howToEnterHeader", "getHowToEnterHeader", "setHowToEnterHeader", "queueName", "getQueueName", "setQueueName", "showDivider", "", "getShowDivider", "()Z", "setShowDivider", "(Z)V", "validOnDate", "getValidOnDate", "setValidOnDate", "vqParkLocatedAt", "getVqParkLocatedAt", "setVqParkLocatedAt", "vqParkName", "getVqParkName", "setVqParkName", "vqSubParkName", "getVqSubParkName", "setVqSubParkName", "getViewType", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class QueueNameViewItem extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private final int viewType;
        private String queueName = "";
        private String heightRestrictions = "";
        private String vqParkName = "";
        private String vqParkLocatedAt = "";
        private String vqSubParkName = "";
        private String validOnDate = "";
        private String howToEnterHeader = "";
        private String howToEnterDescription = "";
        private boolean showDivider = true;

        public QueueNameViewItem(int i10) {
            this.viewType = i10;
        }

        public final String getHeightRestrictions() {
            return this.heightRestrictions;
        }

        public final String getHowToEnterDescription() {
            return this.howToEnterDescription;
        }

        public final String getHowToEnterHeader() {
            return this.howToEnterHeader;
        }

        public final String getQueueName() {
            return this.queueName;
        }

        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final String getValidOnDate() {
            return this.validOnDate;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return this.viewType;
        }

        public final String getVqParkLocatedAt() {
            return this.vqParkLocatedAt;
        }

        public final String getVqParkName() {
            return this.vqParkName;
        }

        public final String getVqSubParkName() {
            return this.vqSubParkName;
        }

        public final void setHeightRestrictions(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.heightRestrictions = str;
        }

        public final void setHowToEnterDescription(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.howToEnterDescription = str;
        }

        public final void setHowToEnterHeader(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.howToEnterHeader = str;
        }

        public final void setQueueName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.queueName = str;
        }

        public final void setShowDivider(boolean z10) {
            this.showDivider = z10;
        }

        public final void setValidOnDate(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.validOnDate = str;
        }

        public final void setVqParkLocatedAt(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.vqParkLocatedAt = str;
        }

        public final void setVqParkName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.vqParkName = str;
        }

        public final void setVqSubParkName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.vqSubParkName = str;
        }
    }

    public QueueNameAdapter(VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.vqThemer = vqThemer;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public QueueNameViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqCreatePartyQueueNameBinding vqCreatePartyQueueNameBindingInflate = VqCreatePartyQueueNameBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqCreatePartyQueueNameBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new QueueNameViewHolder(vqCreatePartyQueueNameBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(QueueNameViewHolder holder, QueueNameViewItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        VqCreatePartyQueueNameBinding binding = holder.getBinding();
        binding.virtualQ.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.ReviewDetailsVQHeaderTitle, null, false, 6, null));
        binding.queueName.setText(item.getQueueName());
        if (StringsKt.isBlank(item.getVqParkName())) {
            binding.queueParkTextView.setVisibility(8);
        } else {
            binding.queueParkTextView.setVisibility(0);
            binding.queueParkTextView.setText(item.getVqParkName());
        }
        if (StringsKt.isBlank(item.getVqSubParkName())) {
            binding.subParkContainer.setVisibility(8);
        } else {
            binding.subParkContainer.setVisibility(0);
            binding.queueSubParkTextView.setText(item.getVqSubParkName());
        }
        binding.locatedAtTextView.setText(item.getVqParkLocatedAt());
        binding.validOnText.setText(item.getValidOnDate());
        if (!StringsKt.isBlank(item.getHeightRestrictions())) {
            binding.heightRestrictions.setVisibility(0);
            binding.heightRestrictions.setText(item.getHeightRestrictions());
            binding.heightRestrictions.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyGuestMustBeAccessibility, MapsKt.mapOf(TuplesKt.m92045to("heightRestriction", StringsKt.replace$default(item.getHeightRestrictions(), VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueInchesToReplaceAccessibility, null, false, 6, null), VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueInchesAccessibility, null, false, 6, null), false, 4, (Object) null))), null, false, 12, null));
        } else {
            binding.heightRestrictions.setVisibility(8);
        }
        if (!StringsKt.isBlank(item.getHowToEnterDescription())) {
            binding.howToEnter.setVisibility(0);
            binding.howToEnterTitle.setText(item.getHowToEnterHeader());
            binding.howToEnterDetail.setText(item.getHowToEnterDescription());
            binding.howToEnter.setContentDescription(item.getHowToEnterHeader() + " " + item.getHowToEnterDescription());
        } else {
            binding.howToEnter.setVisibility(8);
        }
        binding.queueName.setContentDescription(item.getQueueName());
        binding.bottomDivider.setVisibility(item.getShowDivider() ? 0 : 8);
    }
}