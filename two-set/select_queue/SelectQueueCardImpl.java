package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueDayPhase;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardImpl;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCard;", "()V", "getGeoWarningMessage", "", "vqRegions", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getQueueStatusMessage", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSelectQueueCardImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectQueueCardImpl.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* loaded from: classes20.dex */
public final class SelectQueueCardImpl implements SelectQueueCard {
    public static final int $stable = 0;

    @Inject
    public SelectQueueCardImpl() {
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCard
    public String getGeoWarningMessage(VirtualQueueRegions vqRegions, Queue queue, VirtualQueueThemer vqThemer) {
        VirtualQueueThemer virtualQueueThemer;
        Intrinsics.checkNotNullParameter(vqRegions, "vqRegions");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        if (!vqRegions.getRegionsUnknown()) {
            vqRegions = null;
        }
        if (vqRegions != null) {
            virtualQueueThemer = vqThemer;
            String string$default = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.SelectQueueNoLocationDetail, queue.getContentId(), false, 4, null);
            if (string$default != null) {
                return string$default;
            }
        } else {
            virtualQueueThemer = vqThemer;
        }
        return VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.SelectQueueNotInRegionDetail, queue.getContentId(), false, 4, null);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCard
    public String getQueueStatusMessage(Queue queue, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        return (queue.getIsAcceptingJoins() || queue.getDayPhase() != QueueDayPhase.END_OF_DAY) ? VirtualQueueThemer.getString$default(vqThemer, VQStringType.SelectQueueQueueUnavailableMessage, queue.getContentId(), false, 4, null) : VirtualQueueThemer.getString$default(vqThemer, VQStringType.SelectQueueClosedForTheDay, queue.getContentId(), false, 4, null);
    }
}