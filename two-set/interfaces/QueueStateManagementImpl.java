package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueDayPhase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagementImpl;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "()V", "isQueueInEarlyPartyCreationMode", "", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "isQueueOnPause", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class QueueStateManagementImpl implements QueueStateManagement {
    public static final int $stable = 0;

    @Inject
    public QueueStateManagementImpl() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement
    public boolean isQueueInEarlyPartyCreationMode(Queue queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        return !queue.getIsAcceptingJoins() && queue.getIsAcceptingPartyCreation();
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement
    public boolean isQueueOnPause(Queue queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        return !queue.getIsAcceptingJoins() && queue.getDayPhase() == QueueDayPhase.IN_USE;
    }
}