package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectHubActions;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.databinding.VqSelectHubItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.service.model.Hub;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQImageUrlType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003!\"#B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006$"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter$SelectHubCardViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter$SelectHubCardViewItem;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Landroid/content/Context;", "context", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter$SelectHubCardViewHolder;", "holder", "item", "", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter$SelectHubCardViewHolder;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter$SelectHubCardViewItem;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "Landroid/content/Context;", "Companion", "SelectHubCardViewHolder", "SelectHubCardViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSelectHubCardAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectHubCardAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: classes20.dex */
public final class SelectHubCardAdapter implements InterfaceC9229c<SelectHubCardViewHolder, SelectHubCardViewItem> {
    public static final int VIEW_TYPE = 13004;
    private final SelectHubActions actions;
    private final Context context;
    private final FacilityUtils facilityUtils;
    private final PicassoUtils picassoUtils;
    private final VirtualQueueAnalytics vqAnalytics;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter$SelectHubCardViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqSelectHubItemBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqSelectHubItemBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqSelectHubItemBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectHubCardViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqSelectHubItemBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public SelectHubCardViewHolder(VqSelectHubItemBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqSelectHubItemBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubCardAdapter$SelectHubCardViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "hub", "<init>", "(Lcom/disney/wdpro/virtualqueue/service/model/Hub;)V", "", "getViewType", "()I", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "getHub", "()Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectHubCardViewItem implements InterfaceC9233g {
        public static final int $stable = 8;
        private final Hub hub;

        public SelectHubCardViewItem(Hub hub) {
            Intrinsics.checkNotNullParameter(hub, "hub");
            this.hub = hub;
        }

        public final Hub getHub() {
            return this.hub;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 13004;
        }
    }

    public SelectHubCardAdapter(SelectHubActions actions, VirtualQueueThemer vqThemer, VirtualQueueAnalytics vqAnalytics, PicassoUtils picassoUtils, FacilityUtils facilityUtils, Context context) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(vqAnalytics, "vqAnalytics");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(context, "context");
        this.actions = actions;
        this.vqThemer = vqThemer;
        this.vqAnalytics = vqAnalytics;
        this.picassoUtils = picassoUtils;
        this.facilityUtils = facilityUtils;
        this.context = context;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public SelectHubCardViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqSelectHubItemBinding vqSelectHubItemBindingInflate = VqSelectHubItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqSelectHubItemBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SelectHubCardViewHolder(vqSelectHubItemBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(SelectHubCardViewHolder holder, SelectHubCardViewItem item) {
        String string$default;
        int i10;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final Hub hub = item.getHub();
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        VQImageUrlType vQImageUrlType = VQImageUrlType.HubThumbUrlData;
        String contentId = hub.getContentId();
        if (contentId == null) {
            contentId = "";
        }
        String imageUrl = virtualQueueThemer.getImageUrl(vQImageUrlType, contentId);
        Facility facility = this.facilityUtils.getFacility(hub.getExternalDefinitionId());
        String listImageUrl = facility != null ? facility.getListImageUrl() : null;
        String str = listImageUrl == null ? "" : listImageUrl;
        VirtualQueueThemer virtualQueueThemer2 = this.vqThemer;
        VQIconType vQIconType = VQIconType.SelectQueueThumbIcon;
        String contentId2 = hub.getContentId();
        if (contentId2 == null) {
            contentId2 = "";
        }
        Spanned peptasiaIcon = virtualQueueThemer2.getPeptasiaIcon(vQIconType, contentId2);
        VqSelectHubItemBinding binding = holder.getBinding();
        binding.hubName.setText(hub.getName());
        String description = hub.getDescription();
        if (description != null && description.length() != 0) {
            string$default = hub.getDescription();
        } else {
            VirtualQueueThemer virtualQueueThemer3 = this.vqThemer;
            VQStringType vQStringType = VQStringType.HubDescription;
            String contentId3 = hub.getContentId();
            string$default = VirtualQueueThemer.getString$default(virtualQueueThemer3, vQStringType, contentId3 == null ? "" : contentId3, false, 4, null);
        }
        VqSelectHubItemBinding vqSelectHubItemBinding = string$default.length() == 0 ? binding : null;
        if (vqSelectHubItemBinding != null) {
            vqSelectHubItemBinding.hubDescription.setVisibility(8);
        } else {
            binding.hubDescription.setVisibility(0);
            binding.hubDescription.setText(string$default);
            Unit unit = Unit.INSTANCE;
        }
        VirtualQueueThemer virtualQueueThemer4 = this.vqThemer;
        VQStringType vQStringType2 = VQStringType.HubSubPark;
        String contentId4 = hub.getContentId();
        final String string$default2 = VirtualQueueThemer.getString$default(virtualQueueThemer4, vQStringType2, contentId4 == null ? "" : contentId4, false, 4, null);
        if (!StringsKt.isBlank(string$default2)) {
            binding.locatedAtLabel.setVisibility(0);
            TextView textView = binding.locatedAtLabel;
            VirtualQueueThemer virtualQueueThemer5 = this.vqThemer;
            VQStringType vQStringType3 = VQStringType.HubLocatedAt;
            String contentId5 = hub.getContentId();
            textView.setText(VirtualQueueThemer.getString$default(virtualQueueThemer5, vQStringType3, contentId5 == null ? "" : contentId5, false, 4, null));
            binding.locatedAtLabelValue.setVisibility(0);
            binding.locatedAtLabelValue.setText(string$default2);
        } else {
            binding.locatedAtLabel.setVisibility(8);
            binding.locatedAtLabelValue.setVisibility(8);
        }
        if (imageUrl.length() > 0) {
            PicassoUtils picassoUtils = this.picassoUtils;
            ImageView hubImage = binding.hubImage;
            Intrinsics.checkNotNullExpressionValue(hubImage, "hubImage");
            PicassoUtils.loadImage$default(picassoUtils, imageUrl, hubImage, new PicassoUtils.CircleTransform(), binding.hubImagePlaceHolder, null, 16, null);
            binding.hubImage.setVisibility(0);
            binding.hubIcon.setVisibility(8);
            i10 = 0;
        } else {
            i10 = 0;
            if (str.length() > 0) {
                PicassoUtils picassoUtils2 = this.picassoUtils;
                ImageView hubImage2 = binding.hubImage;
                Intrinsics.checkNotNullExpressionValue(hubImage2, "hubImage");
                PicassoUtils.loadImage$default(picassoUtils2, str, hubImage2, new PicassoUtils.CircleTransform(), binding.hubImagePlaceHolder, null, 16, null);
                binding.hubImage.setVisibility(0);
                binding.hubIcon.setVisibility(8);
            } else if (peptasiaIcon.length() > 0) {
                binding.hubIcon.setText(peptasiaIcon);
                binding.hubImage.setVisibility(8);
                binding.hubIcon.setVisibility(0);
            }
        }
        Button button = binding.joinButton;
        VirtualQueueThemer virtualQueueThemer6 = this.vqThemer;
        VQStringType vQStringType4 = VQStringType.HubMainCta;
        String contentId6 = hub.getContentId();
        if (contentId6 == null) {
            contentId6 = "";
        }
        button.setText(VirtualQueueThemer.getString$default(virtualQueueThemer6, vQStringType4, contentId6, false, 4, null));
        Button joinButton = binding.joinButton;
        Intrinsics.checkNotNullExpressionValue(joinButton, "joinButton");
        CommonExtensionsKt.setOnDebouncedClickListener$default(joinButton, i10, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.SelectHubCardAdapter$onBindViewHolder$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                this.this$0.actions.showHubQueues(hub);
                this.this$0.vqAnalytics.trackSelectHubAction(hub, string$default2);
            }
        }, 1, null);
    }
}