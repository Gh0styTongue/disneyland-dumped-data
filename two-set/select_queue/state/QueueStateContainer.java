package com.disney.wdpro.virtualqueue.p462ui.select_queue.state;

import android.content.Context;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.facilityui.fragments.detail.FinderDetailFragment;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0013HÆ\u0003Je\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/QueueStateContainer;", "", "holder", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", FinderDetailFragment.FACILITY_PARAM, "Lcom/disney/wdpro/facility/model/Facility;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "context", "Landroid/content/Context;", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/facility/model/Facility;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;Landroid/content/Context;)V", "getActions", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "getContext", "()Landroid/content/Context;", "getFacility", "()Lcom/disney/wdpro/facility/model/Facility;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getHolder", "()Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;", "getPicassoUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "getQueue", "()Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "getVqAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class QueueStateContainer {
    public static final int $stable = 8;
    private final SelectQueueActions actions;
    private final Context context;
    private final Facility facility;
    private final FacilityUtils facilityUtils;
    private final SelectQueueCardAdapter.SelectQueueCardViewHolder holder;
    private final PicassoUtils picassoUtils;
    private final Queue queue;
    private final VirtualQueueAnalytics vqAnalytics;
    private final VirtualQueueThemer vqThemer;

    public QueueStateContainer(SelectQueueCardAdapter.SelectQueueCardViewHolder holder, Queue queue, VirtualQueueAnalytics vqAnalytics, Facility facility, VirtualQueueThemer vqThemer, FacilityUtils facilityUtils, PicassoUtils picassoUtils, SelectQueueActions actions, Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(vqAnalytics, "vqAnalytics");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(context, "context");
        this.holder = holder;
        this.queue = queue;
        this.vqAnalytics = vqAnalytics;
        this.facility = facility;
        this.vqThemer = vqThemer;
        this.facilityUtils = facilityUtils;
        this.picassoUtils = picassoUtils;
        this.actions = actions;
        this.context = context;
    }

    public static /* synthetic */ QueueStateContainer copy$default(QueueStateContainer queueStateContainer, SelectQueueCardAdapter.SelectQueueCardViewHolder selectQueueCardViewHolder, Queue queue, VirtualQueueAnalytics virtualQueueAnalytics, Facility facility, VirtualQueueThemer virtualQueueThemer, FacilityUtils facilityUtils, PicassoUtils picassoUtils, SelectQueueActions selectQueueActions, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            selectQueueCardViewHolder = queueStateContainer.holder;
        }
        if ((i10 & 2) != 0) {
            queue = queueStateContainer.queue;
        }
        if ((i10 & 4) != 0) {
            virtualQueueAnalytics = queueStateContainer.vqAnalytics;
        }
        if ((i10 & 8) != 0) {
            facility = queueStateContainer.facility;
        }
        if ((i10 & 16) != 0) {
            virtualQueueThemer = queueStateContainer.vqThemer;
        }
        if ((i10 & 32) != 0) {
            facilityUtils = queueStateContainer.facilityUtils;
        }
        if ((i10 & 64) != 0) {
            picassoUtils = queueStateContainer.picassoUtils;
        }
        if ((i10 & 128) != 0) {
            selectQueueActions = queueStateContainer.actions;
        }
        if ((i10 & 256) != 0) {
            context = queueStateContainer.context;
        }
        SelectQueueActions selectQueueActions2 = selectQueueActions;
        Context context2 = context;
        FacilityUtils facilityUtils2 = facilityUtils;
        PicassoUtils picassoUtils2 = picassoUtils;
        VirtualQueueThemer virtualQueueThemer2 = virtualQueueThemer;
        VirtualQueueAnalytics virtualQueueAnalytics2 = virtualQueueAnalytics;
        return queueStateContainer.copy(selectQueueCardViewHolder, queue, virtualQueueAnalytics2, facility, virtualQueueThemer2, facilityUtils2, picassoUtils2, selectQueueActions2, context2);
    }

    /* renamed from: component1, reason: from getter */
    public final SelectQueueCardAdapter.SelectQueueCardViewHolder getHolder() {
        return this.holder;
    }

    /* renamed from: component2, reason: from getter */
    public final Queue getQueue() {
        return this.queue;
    }

    /* renamed from: component3, reason: from getter */
    public final VirtualQueueAnalytics getVqAnalytics() {
        return this.vqAnalytics;
    }

    /* renamed from: component4, reason: from getter */
    public final Facility getFacility() {
        return this.facility;
    }

    /* renamed from: component5, reason: from getter */
    public final VirtualQueueThemer getVqThemer() {
        return this.vqThemer;
    }

    /* renamed from: component6, reason: from getter */
    public final FacilityUtils getFacilityUtils() {
        return this.facilityUtils;
    }

    /* renamed from: component7, reason: from getter */
    public final PicassoUtils getPicassoUtils() {
        return this.picassoUtils;
    }

    /* renamed from: component8, reason: from getter */
    public final SelectQueueActions getActions() {
        return this.actions;
    }

    /* renamed from: component9, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final QueueStateContainer copy(SelectQueueCardAdapter.SelectQueueCardViewHolder holder, Queue queue, VirtualQueueAnalytics vqAnalytics, Facility facility, VirtualQueueThemer vqThemer, FacilityUtils facilityUtils, PicassoUtils picassoUtils, SelectQueueActions actions, Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(vqAnalytics, "vqAnalytics");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(context, "context");
        return new QueueStateContainer(holder, queue, vqAnalytics, facility, vqThemer, facilityUtils, picassoUtils, actions, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueueStateContainer)) {
            return false;
        }
        QueueStateContainer queueStateContainer = (QueueStateContainer) other;
        return Intrinsics.areEqual(this.holder, queueStateContainer.holder) && Intrinsics.areEqual(this.queue, queueStateContainer.queue) && Intrinsics.areEqual(this.vqAnalytics, queueStateContainer.vqAnalytics) && Intrinsics.areEqual(this.facility, queueStateContainer.facility) && Intrinsics.areEqual(this.vqThemer, queueStateContainer.vqThemer) && Intrinsics.areEqual(this.facilityUtils, queueStateContainer.facilityUtils) && Intrinsics.areEqual(this.picassoUtils, queueStateContainer.picassoUtils) && Intrinsics.areEqual(this.actions, queueStateContainer.actions) && Intrinsics.areEqual(this.context, queueStateContainer.context);
    }

    public final SelectQueueActions getActions() {
        return this.actions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Facility getFacility() {
        return this.facility;
    }

    public final FacilityUtils getFacilityUtils() {
        return this.facilityUtils;
    }

    public final SelectQueueCardAdapter.SelectQueueCardViewHolder getHolder() {
        return this.holder;
    }

    public final PicassoUtils getPicassoUtils() {
        return this.picassoUtils;
    }

    public final Queue getQueue() {
        return this.queue;
    }

    public final VirtualQueueAnalytics getVqAnalytics() {
        return this.vqAnalytics;
    }

    public final VirtualQueueThemer getVqThemer() {
        return this.vqThemer;
    }

    public int hashCode() {
        int iHashCode = ((((this.holder.hashCode() * 31) + this.queue.hashCode()) * 31) + this.vqAnalytics.hashCode()) * 31;
        Facility facility = this.facility;
        return ((((((((((iHashCode + (facility == null ? 0 : facility.hashCode())) * 31) + this.vqThemer.hashCode()) * 31) + this.facilityUtils.hashCode()) * 31) + this.picassoUtils.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "QueueStateContainer(holder=" + this.holder + ", queue=" + this.queue + ", vqAnalytics=" + this.vqAnalytics + ", facility=" + this.facility + ", vqThemer=" + this.vqThemer + ", facilityUtils=" + this.facilityUtils + ", picassoUtils=" + this.picassoUtils + ", actions=" + this.actions + ", context=" + this.context + ")";
    }
}