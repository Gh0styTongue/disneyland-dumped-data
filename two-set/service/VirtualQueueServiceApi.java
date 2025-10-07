package com.disney.wdpro.virtualqueue.service;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.midichlorian.CacheContextModifier;
import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.LeaveQueueData;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsRequestType;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetQueuesResponse;
import com.disney.wdpro.virtualqueue.service.model.LeaveQueueResponse;
import com.disney.wdpro.virtualqueue.service.model.UpdateAnonymousPartySizeResponse;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H&¢\u0006\u0004\b\u0010\u0010\u0005J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H&¢\u0006\u0004\b\u001a\u0010\u0014J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApi;", "Lcom/disney/wdpro/midichlorian/CacheContextModifier;", "Lcom/disney/wdpro/httpclient/x;", "Lcom/disney/wdpro/virtualqueue/service/model/GetQueuesResponse;", "getQueues", "()Lcom/disney/wdpro/httpclient/x;", "", "queueId", "", "applyPlanningPartyFilter", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;", "requestType", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsResponse;", "getLinkedGuests", "(Ljava/lang/String;ZLcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;)Lcom/disney/wdpro/httpclient/x;", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "getPositions", "", "guestIds", "joinQueue", "(Ljava/lang/String;Ljava/util/List;)Lcom/disney/wdpro/httpclient/x;", "", RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, "joinAnonymousQueue", "(Ljava/lang/String;I)Lcom/disney/wdpro/httpclient/x;", "Lcom/disney/wdpro/virtualqueue/service/model/LeaveQueueResponse;", LeaveQueueData.KEY, "Lcom/disney/wdpro/virtualqueue/service/model/UpdateAnonymousPartySizeResponse;", "updateAnonymousPartySize", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface VirtualQueueServiceApi extends CacheContextModifier<VirtualQueueServiceApi> {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ C13352x getLinkedGuests$default(VirtualQueueServiceApi virtualQueueServiceApi, String str, boolean z10, GetLinkedGuestsRequestType getLinkedGuestsRequestType, int i10, Object obj) throws IOException {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLinkedGuests");
            }
            if ((i10 & 4) != 0) {
                getLinkedGuestsRequestType = GetLinkedGuestsRequestType.DEFAULT;
            }
            return virtualQueueServiceApi.getLinkedGuests(str, z10, getLinkedGuestsRequestType);
        }
    }

    C13352x<GetLinkedGuestsResponse> getLinkedGuests(String queueId, boolean applyPlanningPartyFilter, GetLinkedGuestsRequestType requestType) throws IOException;

    C13352x<GetPositionsResponse> getPositions() throws IOException;

    C13352x<GetQueuesResponse> getQueues() throws IOException;

    C13352x<GetPositionsResponse> joinAnonymousQueue(String queueId, int anonymousPartySize) throws IOException;

    C13352x<GetPositionsResponse> joinQueue(String queueId, List<String> guestIds) throws IOException;

    C13352x<LeaveQueueResponse> leaveQueue(String queueId, List<String> guestIds) throws IOException;

    C13352x<UpdateAnonymousPartySizeResponse> updateAnonymousPartySize(String queueId, int anonymousPartySize) throws IOException;
}