package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "", "isQueueInEarlyPartyCreationMode", "", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "isQueueOnPause", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface QueueStateManagement {
    boolean isQueueInEarlyPartyCreationMode(Queue queue);

    boolean isQueueOnPause(Queue queue);
}