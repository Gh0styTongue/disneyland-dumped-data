package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.support.ftue.C20751b;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.databinding.VqSelectQueueItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VQAlertType;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.state.NonOperationalDayPhase;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.state.QueueStateContainer;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.state.SelectQueueStateContext;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueDayPhase;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQImageUrlType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.looksery.sdk.listener.AnalyticsListener;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p860q1.C31640h;

@Metadata(m92037d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00043456BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00102¨\u00067"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewItem;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "vqRegions", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;", "selectQueueStateContext", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCard;", "selectQueueCardImpl", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "queueStateManagement", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCard;Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueItemBinding;", "binding", "", VirtualQueueConstants.CONTENT_ID, "", "showPausedStateContainer", "(Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueItemBinding;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;", "holder", "item", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewItem;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCard;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "Companion", "Factory", "SelectQueueCardViewHolder", "SelectQueueCardViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSelectQueueCardAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectQueueCardAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,533:1\n1#2:534\n*E\n"})
/* loaded from: classes20.dex */
public final class SelectQueueCardAdapter implements InterfaceC9229c<SelectQueueCardViewHolder, SelectQueueCardViewItem> {
    public static final int NO_GROUP_NUMBER_PROVIDED = -1;
    public static final int VIEW_TYPE = 13000;
    private final SelectQueueActions actions;
    private final Context context;
    private final FacilityUtils facilityUtils;
    private final PicassoUtils picassoUtils;
    private final QueueStateManagement queueStateManagement;
    private final SelectQueueCard selectQueueCardImpl;
    private final SelectQueueStateContext selectQueueStateContext;
    private final VirtualQueueAnalytics vqAnalytics;
    private final VirtualQueueRegions vqRegions;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JF\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$Factory;", "", "selectQueueCardImpl", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCard;", "queueStateManagement", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCard;Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "vqRegions", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "context", "Landroid/content/Context;", "selectQueueStateContext", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 0;
        private final QueueStateManagement queueStateManagement;
        private final SelectQueueCard selectQueueCardImpl;

        @Inject
        public Factory(SelectQueueCard selectQueueCardImpl, QueueStateManagement queueStateManagement) {
            Intrinsics.checkNotNullParameter(selectQueueCardImpl, "selectQueueCardImpl");
            Intrinsics.checkNotNullParameter(queueStateManagement, "queueStateManagement");
            this.selectQueueCardImpl = selectQueueCardImpl;
            this.queueStateManagement = queueStateManagement;
        }

        public final SelectQueueCardAdapter create(SelectQueueActions actions, VirtualQueueThemer vqThemer, PicassoUtils picassoUtils, FacilityUtils facilityUtils, VirtualQueueAnalytics vqAnalytics, VirtualQueueRegions vqRegions, Context context, SelectQueueStateContext selectQueueStateContext) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
            Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
            Intrinsics.checkNotNullParameter(vqAnalytics, "vqAnalytics");
            Intrinsics.checkNotNullParameter(vqRegions, "vqRegions");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(selectQueueStateContext, "selectQueueStateContext");
            return new SelectQueueCardAdapter(actions, vqThemer, picassoUtils, facilityUtils, vqAnalytics, vqRegions, context, selectQueueStateContext, this.selectQueueCardImpl, this.queueStateManagement);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueItemBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueItemBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueItemBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectQueueCardViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqSelectQueueItemBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public SelectQueueCardViewHolder(VqSelectQueueItemBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqSelectQueueItemBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "<init>", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "", "getViewType", "()I", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "getQueue", "()Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SelectQueueCardViewItem implements InterfaceC9233g {
        public static final int $stable = 8;
        private final Queue queue;

        public SelectQueueCardViewItem(Queue queue) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            this.queue = queue;
        }

        public final Queue getQueue() {
            return this.queue;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 13000;
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QueueGuestIdMode.values().length];
            try {
                iArr[QueueGuestIdMode.IDENTIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SelectQueueCardAdapter(SelectQueueActions actions, VirtualQueueThemer vqThemer, PicassoUtils picassoUtils, FacilityUtils facilityUtils, VirtualQueueAnalytics vqAnalytics, VirtualQueueRegions vqRegions, Context context, SelectQueueStateContext selectQueueStateContext, SelectQueueCard selectQueueCardImpl, QueueStateManagement queueStateManagement) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(vqAnalytics, "vqAnalytics");
        Intrinsics.checkNotNullParameter(vqRegions, "vqRegions");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selectQueueStateContext, "selectQueueStateContext");
        Intrinsics.checkNotNullParameter(selectQueueCardImpl, "selectQueueCardImpl");
        Intrinsics.checkNotNullParameter(queueStateManagement, "queueStateManagement");
        this.actions = actions;
        this.vqThemer = vqThemer;
        this.picassoUtils = picassoUtils;
        this.facilityUtils = facilityUtils;
        this.vqAnalytics = vqAnalytics;
        this.vqRegions = vqRegions;
        this.context = context;
        this.selectQueueStateContext = selectQueueStateContext;
        this.selectQueueCardImpl = selectQueueCardImpl;
        this.queueStateManagement = queueStateManagement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$12$lambda$10(Queue queue, SelectQueueCardAdapter this$0, String facilityId, View view) {
        Intrinsics.checkNotNullParameter(queue, "$queue");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(facilityId, "$facilityId");
        if (WhenMappings.$EnumSwitchMapping$0[queue.getGuestIdMode().ordinal()] != 1) {
            this$0.actions.showCreateParty(true, true, queue, facilityId);
        } else if (queue.getIsPlanningPartyPreselectionEnabled()) {
            this$0.actions.showReviewDetails(queue, facilityId);
        } else {
            this$0.actions.showCreateParty(false, true, queue, facilityId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$12$lambda$11(SelectQueueCardAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.actions.showRequestEnableLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$7$lambda$5(SelectQueueCardAdapter this$0, Queue queue, String park, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queue, "$queue");
        Intrinsics.checkNotNullParameter(park, "$park");
        this$0.actions.showHyperlink(VirtualQueueThemer.getString$default(this$0.vqThemer, VQStringType.NonAttractionInfoLinkUrl, queue.getContentId(), false, 4, null), queue, park);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$7$lambda$6(SelectQueueCardAdapter this$0, Queue queue, String park, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queue, "$queue");
        Intrinsics.checkNotNullParameter(park, "$park");
        this$0.actions.showHyperlink(VirtualQueueThemer.getString$default(this$0.vqThemer, VQStringType.NonAttractionInfoLinkUrl, queue.getContentId(), false, 4, null), queue, park);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void showPausedStateContainer(com.disney.wdpro.virtualqueue.databinding.VqSelectQueueItemBinding r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer r3 = r0.vqThemer
            com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions r4 = r0.vqRegions
            boolean r4 = r4.getRegionsUnknown()
            r9 = 0
            if (r4 == 0) goto L16
            r4 = r3
            goto L17
        L16:
            r4 = r9
        L17:
            if (r4 == 0) goto L26
            com.disney.wdpro.virtualqueue.themer.VQStringType r4 = com.disney.wdpro.virtualqueue.themer.VQStringType.SelectQueueEnableLocationDetail
            r7 = 4
            r8 = 0
            r6 = 0
            r5 = r19
            java.lang.String r4 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getString$default(r3, r4, r5, r6, r7, r8)
            if (r4 != 0) goto L31
        L26:
            com.disney.wdpro.virtualqueue.themer.VQStringType r4 = com.disney.wdpro.virtualqueue.themer.VQStringType.SelectQueueNotInRegionDetail
            r7 = 4
            r8 = 0
            r6 = 0
            r5 = r19
            java.lang.String r4 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getString$default(r3, r4, r5, r6, r7, r8)
        L31:
            r2.element = r4
            android.widget.TextView r3 = r1.pauseIcon
            com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer r4 = r0.vqThemer
            com.disney.wdpro.virtualqueue.themer.VQIconType r5 = com.disney.wdpro.virtualqueue.themer.VQIconType.SelectQueueEnableLocationIcon
            r6 = 2
            android.text.Spanned r4 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getPeptasiaIcon$default(r4, r5, r9, r6, r9)
            r3.setText(r4)
            android.widget.TextView r3 = r1.pausedMessage
            T r2 = r2.element
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.pausedStateContainer
            com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer r10 = r0.vqThemer
            com.disney.wdpro.virtualqueue.themer.VQStringType r11 = com.disney.wdpro.virtualqueue.themer.VQStringType.SelectQueueImportantAccessibility
            android.widget.TextView r0 = r1.pausedMessage
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "alertMessage"
            kotlin.Pair r0 = kotlin.TuplesKt.m92045to(r1, r0)
            java.util.Map r12 = kotlin.collections.MapsKt.mapOf(r0)
            r15 = 8
            r16 = 0
            r14 = 0
            r13 = r19
            java.lang.String r0 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getString$default(r10, r11, r12, r13, r14, r15, r16)
            r2.setContentDescription(r0)
            r0 = 0
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter.showPausedStateContainer(com.disney.wdpro.virtualqueue.databinding.VqSelectQueueItemBinding, java.lang.String):void");
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public SelectQueueCardViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqSelectQueueItemBinding vqSelectQueueItemBindingInflate = VqSelectQueueItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqSelectQueueItemBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SelectQueueCardViewHolder(vqSelectQueueItemBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(SelectQueueCardViewHolder holder, SelectQueueCardViewItem item) throws Resources.NotFoundException {
        int i10;
        int i11;
        int i12;
        int i13;
        String string$default;
        String string$default2;
        String string$default3;
        String string$default4;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final Queue queue = item.getQueue();
        String imageUrl = this.vqThemer.getImageUrl(VQImageUrlType.SelectQueueThumbUrl, queue.getContentId());
        Facility facility = this.facilityUtils.getFacility(queue.getExternalDefinitionId());
        String listImageUrl = facility != null ? facility.getListImageUrl() : null;
        if (listImageUrl == null) {
            listImageUrl = "";
        }
        String str = listImageUrl;
        Spanned peptasiaIcon = this.vqThemer.getPeptasiaIcon(VQIconType.SelectQueueThumbIcon, queue.getContentId());
        if (!queue.getIsAcceptingJoins() && !queue.getIsAcceptingPartyCreation() && queue.getDayPhase() == QueueDayPhase.NON_OPERATIONAL) {
            NonOperationalDayPhase nonOperationalDayPhase = new NonOperationalDayPhase();
            nonOperationalDayPhase.setSelectQueueState(this.selectQueueStateContext);
            nonOperationalDayPhase.setupNonOperationLayout(new QueueStateContainer(holder, queue, this.vqAnalytics, facility, this.vqThemer, this.facilityUtils, this.picassoUtils, this.actions, this.context));
            return;
        }
        VqSelectQueueItemBinding binding = holder.getBinding();
        binding.queueName.setText(queue.getName());
        if (imageUrl.length() > 0) {
            PicassoUtils picassoUtils = this.picassoUtils;
            ImageView queueImage = binding.queueImage;
            Intrinsics.checkNotNullExpressionValue(queueImage, "queueImage");
            PicassoUtils.loadImage$default(picassoUtils, imageUrl, queueImage, new PicassoUtils.CircleTransform(), binding.queueImagePlaceHolder, null, 16, null);
            binding.queueImage.setVisibility(0);
            binding.queueIcon.setVisibility(8);
            i10 = 0;
            i11 = 8;
        } else {
            i10 = 0;
            if (str.length() > 0) {
                PicassoUtils picassoUtils2 = this.picassoUtils;
                ImageView queueImage2 = binding.queueImage;
                Intrinsics.checkNotNullExpressionValue(queueImage2, "queueImage");
                PicassoUtils.loadImage$default(picassoUtils2, str, queueImage2, new PicassoUtils.CircleTransform(), binding.queueImagePlaceHolder, null, 16, null);
                binding.queueImage.setVisibility(0);
                binding.queueIcon.setVisibility(8);
                i11 = 8;
            } else {
                i11 = 8;
                if (peptasiaIcon.length() > 0) {
                    binding.queueIcon.setText(peptasiaIcon);
                    binding.queueImage.setVisibility(8);
                    binding.queueIcon.setVisibility(0);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        final String string$default5 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionPark, queue.getContentId(), false, 4, null);
        String string$default6 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionLocatedAt, queue.getContentId(), false, 4, null);
        String string$default7 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionSubpark, queue.getContentId(), false, 4, null);
        VqSelectQueueItemBinding binding2 = holder.getBinding();
        if (StringsKt.isBlank(string$default7)) {
            binding2.subParkContainter.setVisibility(i11);
        } else {
            binding2.subParkContainter.setVisibility(i10);
            binding2.locatedAtText.setText(string$default6);
            binding2.queueSubPark.setText(string$default7);
        }
        String string$default8 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionHeight, queue.getContentId(), false, 4, null);
        if (Intrinsics.areEqual(string$default8, VirtualQueueConstants.NO_HEIGHT)) {
            binding2.heightRestrictions.setVisibility(i11);
        } else if (string$default8.length() > 0) {
            binding2.heightRestrictions.setText(string$default8);
        } else {
            binding2.heightRestrictions.setContentDescription(SelectQueueUtils.INSTANCE.setupHeightRestrictions(facility, queue, holder, this.vqThemer));
        }
        int currentArrivingGroupStart = queue.getCurrentArrivingGroupStart();
        int currentArrivingGroupEnd = queue.getCurrentArrivingGroupEnd();
        VqSelectQueueItemBinding binding3 = holder.getBinding();
        if (currentArrivingGroupStart != -1 && currentArrivingGroupEnd != -1 && queue.getDayPhase() == QueueDayPhase.IN_USE) {
            int i14 = (currentArrivingGroupStart == 0 && currentArrivingGroupEnd == 0) ? 1 : i10;
            int i15 = (i14 != 0 || currentArrivingGroupStart == currentArrivingGroupEnd) ? i10 : 1;
            boolean showDowntimeAlert = queue.getShowDowntimeAlert();
            if (i14 != 0 || showDowntimeAlert || i15 != 0) {
                string$default3 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueAdmittingGroups, queue.getContentId(), false, 4, null);
            } else {
                string$default3 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueAdmittingGroup, queue.getContentId(), false, 4, null);
            }
            binding3.nowBoardingLabel.setText(string$default3);
            if (showDowntimeAlert) {
                string$default4 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueDowntimeBoarding, queue.getContentId(), false, 4, null);
            } else if (i14 != 0) {
                string$default4 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueAdmittingGroupBlank, queue.getContentId(), false, 4, null);
            } else if (i15 != 0) {
                string$default4 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueAdmittingGroupRange, MapsKt.mapOf(TuplesKt.m92045to("number1", queue.getCurrentArrivingGroupStartDisplayName()), TuplesKt.m92045to("number2", queue.getCurrentArrivingGroupEndDisplayName())), queue.getContentId(), false, 8, null);
            } else {
                string$default4 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueAdmittingGroupSingle, MapsKt.mapOf(TuplesKt.m92045to("number1", queue.getCurrentArrivingGroupStartDisplayName())), queue.getContentId(), false, 8, null);
            }
            binding3.nowBoarding.setText(string$default4);
            binding3.nowBoardingLabel.setVisibility(i10);
            binding3.nowBoarding.setVisibility(i10);
            binding3.nowBoardingContainter.setVisibility(i10);
        } else {
            binding3.nowBoardingLabel.setVisibility(i11);
            binding3.nowBoarding.setVisibility(i11);
        }
        int waitTimeMin = queue.getWaitTimeMin();
        int waitTimeMax = queue.getWaitTimeMax();
        VqSelectQueueItemBinding binding4 = holder.getBinding();
        if (waitTimeMin != 0 && waitTimeMax != 0 && queue.getIsAcceptingJoins()) {
            binding4.estimatedWaitContainter.setVisibility(i10);
            binding4.estimatedWaitLabel.setVisibility(i10);
            binding4.estimatedWait.setVisibility(i10);
            binding4.estimatedWaitLabel.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueProjectedWait, queue.getContentId(), false, 4, null));
            if (waitTimeMin == waitTimeMax) {
                string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueProjectedWaitSingle, MapsKt.mapOf(TuplesKt.m92045to("time", String.valueOf(waitTimeMin))), queue.getContentId(), false, 8, null);
            } else {
                string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueProjectedWaitRange, MapsKt.mapOf(TuplesKt.m92045to("minTime", String.valueOf(waitTimeMin)), TuplesKt.m92045to(AnalyticsListener.ANALYTICS_MAX_TIME_KEY, String.valueOf(waitTimeMax))), queue.getContentId(), false, 8, null);
            }
            binding4.estimatedWait.setText(string$default2);
        } else {
            binding4.estimatedWaitLabel.setVisibility(i11);
            binding4.estimatedWait.setVisibility(i11);
        }
        final String externalDefinitionId = queue.getExternalDefinitionId();
        VqSelectQueueItemBinding binding5 = holder.getBinding();
        if (!StringsKt.isBlank(queue.getNextScheduledOpenTime()) && !queue.getIsAcceptingJoins()) {
            String displayableTime = this.facilityUtils.formatDisplayableTime(queue.getNextScheduledOpenTime());
            String string$default9 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueNextQueueOpens, queue.getContentId(), false, 4, null);
            binding5.nextQueueOpenContainter.setVisibility(i10);
            binding5.nextQueueOpenTimeLabel.setText(string$default9);
            binding5.nextQueueOpenTime.setText(displayableTime);
            this.vqAnalytics.trackSelectQueuesAlerts(queue, externalDefinitionId, displayableTime, VQAlertType.PAUSED);
        } else {
            binding5.nextQueueOpenContainter.setVisibility(i11);
        }
        VqSelectQueueItemBinding binding6 = holder.getBinding();
        String string$default10 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionInfoLinkText, queue.getContentId(), false, 4, null);
        Spanned peptasiaIcon$default = VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.CommonChevronIcon, null, 2, null);
        Typeface typefaceM97205h = C31640h.m97205h(this.context, C21487R.font.peptasia);
        Typeface typefaceM97205h2 = C31640h.m97205h(this.context, C21487R.font.twdc_font_heavy);
        if (typefaceM97205h != null && typefaceM97205h2 != null) {
            i12 = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(string$default10, new C20751b(typefaceM97205h2), 33).append((CharSequence) " ").append(peptasiaIcon$default, new C20751b(typefaceM97205h), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.context.getResources().getDimensionPixelSize(C21487R.dimen.vq_peptasia_11)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
            binding6.hyperlink.setText(spannableStringBuilder);
        } else {
            i12 = 1;
            binding6.hyperlink.setText(string$default10);
        }
        if (StringsKt.isBlank(string$default10)) {
            binding6.hyperlink.setVisibility(i11);
        }
        if (!queue.getIsAcceptingJoins() && !queue.getIsAcceptingPartyCreation()) {
            binding6.joinButton.setVisibility(i11);
            binding6.shareLocationButton.setVisibility(i11);
            if (!StringsKt.isBlank(string$default10)) {
                binding6.hyperlink.setVisibility(i10);
                binding6.hyperlink.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SelectQueueCardAdapter.onBindViewHolder$lambda$7$lambda$6(this.f45301a, queue, string$default5, view);
                    }
                });
            }
            if (this.queueStateManagement.isQueueOnPause(queue)) {
                binding6.pauseIcon.setText(this.vqThemer.getPeptasiaIcon(VQIconType.SelectQueueUnavailableIcon, queue.getContentId()));
                String queueStatusMessage = this.selectQueueCardImpl.getQueueStatusMessage(queue, this.vqThemer);
                binding6.pausedMessage.setText(queueStatusMessage);
                binding6.pausedStateContainer.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, binding6.pausedMessage.getText().toString())), queue.getContentId(), false, 8, null));
                binding6.pausedStateContainer.setVisibility(i10);
                this.vqAnalytics.trackSelectQueuesAlerts(queue, externalDefinitionId, queueStatusMessage, VQAlertType.PAUSED);
            } else {
                binding6.pausedStateContainer.setVisibility(i11);
            }
            if (queue.getDayPhase() != QueueDayPhase.END_OF_DAY) {
                if (!queue.getRequiredCurrentGeoRegionIds().isEmpty() && CollectionsKt.intersect(queue.getRequiredCurrentGeoRegionIds(), CollectionsKt.toSet(this.vqRegions.getRegions())).isEmpty()) {
                    if (this.vqRegions.isLocationEnabled() && this.vqRegions.isLocationPermissionGranted()) {
                        binding6.shareLocationButton.setVisibility(i11);
                        binding6.pauseIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.SelectQueueNotInRegionIcon, null, 2, null));
                        if (this.vqRegions.getRegionsUnknown()) {
                            string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueNoLocationDetail, queue.getContentId(), false, 4, null);
                        } else {
                            string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueNotInRegionDetail, queue.getContentId(), false, 4, null);
                        }
                        binding6.pausedMessage.setText(string$default);
                        binding6.pausedStateContainer.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, binding6.pausedMessage.getText().toString())), queue.getContentId(), false, 8, null));
                        binding6.pausedStateContainer.setVisibility(i10);
                    } else {
                        binding6.shareLocationButton.setVisibility(i10);
                        binding6.shareLocationButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueEnableLocationCta, queue.getContentId(), false, 4, null));
                        binding6.pauseIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.SelectQueueEnableLocationIcon, null, 2, null));
                        String string$default11 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueEnableLocationDetail, queue.getContentId(), false, 4, null);
                        binding6.pausedMessage.setText(string$default11);
                        binding6.pausedStateContainer.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, binding6.pausedMessage.getText().toString())), queue.getContentId(), false, 8, null));
                        binding6.pausedStateContainer.setVisibility(i10);
                        this.vqAnalytics.trackSelectQueuesAlerts(queue, externalDefinitionId, string$default11, VQAlertType.SHARELOCATION);
                        i13 = i10;
                    }
                } else {
                    binding6.shareLocationButton.setVisibility(i11);
                }
            } else {
                binding6.shareLocationButton.setVisibility(i11);
                binding6.pauseIcon.setText(this.vqThemer.getPeptasiaIcon(VQIconType.SelectQueueUnavailableIcon, queue.getContentId()));
                String queueStatusMessage2 = this.selectQueueCardImpl.getQueueStatusMessage(queue, this.vqThemer);
                binding6.pausedMessage.setText(queueStatusMessage2);
                binding6.pausedStateContainer.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, binding6.pausedMessage.getText().toString())), queue.getContentId(), false, 8, null));
                binding6.pausedStateContainer.setVisibility(i10);
                this.vqAnalytics.trackSelectQueuesAlerts(queue, externalDefinitionId, queueStatusMessage2, VQAlertType.PAUSED);
            }
            i13 = i12;
        } else {
            if (queue.getIsAcceptingJoins()) {
                String string$default12 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueJoinCta, queue.getContentId(), false, 4, null);
                binding6.joinButton.setText(string$default12);
                binding6.joinButton.setContentDescription(string$default12 + " " + queue.getName());
            } else {
                String string$default13 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueuePartyCreationCta, queue.getContentId(), false, 4, null);
                binding6.joinButton.setText(string$default13);
                binding6.joinButton.setContentDescription(string$default13 + " " + queue.getName());
            }
            binding6.joinButton.setVisibility(i10);
            binding6.pausedStateContainer.setVisibility(i11);
            if (!StringsKt.isBlank(string$default10)) {
                binding6.hyperlink.setVisibility(i10);
                binding6.hyperlink.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SelectQueueCardAdapter.onBindViewHolder$lambda$7$lambda$5(this.f45298a, queue, string$default5, view);
                    }
                });
            }
            if (queue.getRequiredCurrentGeoRegionIds().isEmpty() || !CollectionsKt.intersect(queue.getRequiredCurrentGeoRegionIds(), CollectionsKt.toSet(this.vqRegions.getRegions())).isEmpty()) {
                binding6.joinButton.setVisibility(i10);
                binding6.shareLocationButton.setVisibility(i11);
            } else if (this.vqRegions.isLocationEnabled() && this.vqRegions.isLocationPermissionGranted()) {
                binding6.joinButton.setVisibility(i11);
                binding6.shareLocationButton.setVisibility(i11);
                binding6.pauseIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.SelectQueueNotInRegionIcon, null, 2, null));
                String geoWarningMessage = this.selectQueueCardImpl.getGeoWarningMessage(this.vqRegions, queue, this.vqThemer);
                binding6.pausedMessage.setText(geoWarningMessage);
                binding6.pausedStateContainer.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, binding6.pausedMessage.getText().toString())), queue.getContentId(), false, 8, null));
                binding6.pausedStateContainer.setVisibility(i10);
                this.vqAnalytics.trackSelectQueuesAlerts(queue, externalDefinitionId, geoWarningMessage, VQAlertType.NOTINLOCATION);
            } else {
                binding6.joinButton.setVisibility(i11);
                binding6.shareLocationButton.setVisibility(i10);
                binding6.shareLocationButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueEnableLocationCta, null, false, 6, null));
                binding6.pauseIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.SelectQueueEnableLocationIcon, null, 2, null));
                String string$default14 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueEnableLocationDetail, null, false, 6, null);
                binding6.pausedMessage.setText(string$default14);
                binding6.pausedStateContainer.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, binding6.pausedMessage.getText().toString())), queue.getContentId(), false, 8, null));
                binding6.pausedStateContainer.setVisibility(i10);
                this.vqAnalytics.trackSelectQueuesAlerts(queue, externalDefinitionId, string$default14, VQAlertType.SHARELOCATION);
                i13 = i10;
            }
            i13 = i12;
        }
        VqSelectQueueItemBinding binding7 = holder.getBinding();
        if (i13 == 0) {
            binding7.howToEnter.setVisibility(i11);
            Button button = binding7.shareLocationButton;
            button.setVisibility(i10);
            button.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueEnableLocationCta, null, false, 6, null));
            showPausedStateContainer(binding7, queue.getContentId());
        } else if (!StringsKt.isBlank(queue.getHowToEnterMessage())) {
            String string$default15 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueHowToEnterTitle, queue.getContentId(), false, 4, null);
            binding7.howToEnter.setVisibility(i10);
            binding7.howToEnterTitle.setText(string$default15);
            binding7.howToEnterDetail.setText(queue.getHowToEnterMessage());
            binding7.howToEnter.setContentDescription(string$default15 + " " + queue.getHowToEnterMessage());
        } else {
            binding7.howToEnter.setVisibility(i11);
        }
        binding7.joinButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectQueueCardAdapter.onBindViewHolder$lambda$12$lambda$10(queue, this, externalDefinitionId, view);
            }
        });
        binding7.shareLocationButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectQueueCardAdapter.onBindViewHolder$lambda$12$lambda$11(this.f45307a, view);
            }
        });
    }
}