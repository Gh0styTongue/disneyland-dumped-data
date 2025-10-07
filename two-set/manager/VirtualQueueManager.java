package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.virtualqueue.core.manager.event.GetLinkedGuestsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.GetPositionsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.GetQueuesEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.JoinQueueEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.LeaveQueueEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.UpdateAnonymousPartySizeEvent;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.LeaveQueueData;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsRequestType;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m92037d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J'\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J'\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "", "getAllQueues", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetQueuesEvent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLinkedGuests", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetLinkedGuestsEvent;", "queueId", "", "applyPlanningPartyFilter", "", "requestType", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;", "(Ljava/lang/String;ZLcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPositions", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;", "joinAnonymousQueue", "Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;", "guestCount", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinQueue", "guestIds", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LeaveQueueData.KEY, "Lcom/disney/wdpro/virtualqueue/core/manager/event/LeaveQueueEvent;", "updateAnonymousPartySize", "Lcom/disney/wdpro/virtualqueue/core/manager/event/UpdateAnonymousPartySizeEvent;", "partySize", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface VirtualQueueManager {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getLinkedGuests$default(VirtualQueueManager virtualQueueManager, String str, boolean z10, GetLinkedGuestsRequestType getLinkedGuestsRequestType, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLinkedGuests");
            }
            if ((i10 & 4) != 0) {
                getLinkedGuestsRequestType = GetLinkedGuestsRequestType.DEFAULT;
            }
            return virtualQueueManager.getLinkedGuests(str, z10, getLinkedGuestsRequestType, continuation);
        }
    }

    Object getAllQueues(Continuation<? super GetQueuesEvent> continuation);

    Object getLinkedGuests(String str, boolean z10, GetLinkedGuestsRequestType getLinkedGuestsRequestType, Continuation<? super GetLinkedGuestsEvent> continuation);

    Object getPositions(Continuation<? super GetPositionsEvent> continuation);

    Object joinAnonymousQueue(String str, int i10, Continuation<? super JoinQueueEvent> continuation);

    Object joinQueue(String str, List<String> list, Continuation<? super JoinQueueEvent> continuation);

    Object leaveQueue(String str, List<String> list, Continuation<? super LeaveQueueEvent> continuation);

    Object updateAnonymousPartySize(String str, int i10, Continuation<? super UpdateAnonymousPartySizeEvent> continuation);
}