package com.disney.wdpro.virtualqueue.service.model;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0018R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0002\u001a\u00020\u00038F¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u00020\f8F¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "Ljava/io/Serializable;", "responseStatus", "Lcom/disney/wdpro/virtualqueue/service/model/PositionsResponseStatus;", "queues", "", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "guests", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "positions", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "showCastAssistanceCode", "", "(Lcom/disney/wdpro/virtualqueue/service/model/PositionsResponseStatus;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getGuests", "()Ljava/util/List;", "getPositions", "getQueues", "getResponseStatus", "()Lcom/disney/wdpro/virtualqueue/service/model/PositionsResponseStatus;", "getShowCastAssistanceCode", "()Z", "getQueueById", "queueId", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class GetPositionsResponse implements Serializable {
    public static final int $stable = 8;
    private final List<LinkedGuest> guests;
    private final List<Position> positions;
    private final List<Queue> queues;
    private final PositionsResponseStatus responseStatus;
    private final boolean showCastAssistanceCode;

    public GetPositionsResponse() {
        this(null, null, null, null, false, 31, null);
    }

    public final List<LinkedGuest> getGuests() {
        List<LinkedGuest> list = this.guests;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Position> getPositions() {
        List<Position> list = this.positions;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final Queue getQueueById(String queueId) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        for (Queue queue : getQueues()) {
            if (Intrinsics.areEqual(queue.getQueueId(), queueId)) {
                return queue;
            }
        }
        return null;
    }

    public final List<Queue> getQueues() {
        List<Queue> list = this.queues;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final PositionsResponseStatus getResponseStatus() {
        PositionsResponseStatus positionsResponseStatus = this.responseStatus;
        return positionsResponseStatus == null ? PositionsResponseStatus.INVALID_GUEST : positionsResponseStatus;
    }

    public final boolean getShowCastAssistanceCode() {
        return this.showCastAssistanceCode;
    }

    public GetPositionsResponse(PositionsResponseStatus responseStatus, List<Queue> queues, List<LinkedGuest> guests, List<Position> positions, boolean z10) {
        Intrinsics.checkNotNullParameter(responseStatus, "responseStatus");
        Intrinsics.checkNotNullParameter(queues, "queues");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.responseStatus = responseStatus;
        this.guests = guests;
        this.queues = queues;
        this.positions = positions;
        this.showCastAssistanceCode = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetPositionsResponse(PositionsResponseStatus positionsResponseStatus, List list, List list2, List list3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        positionsResponseStatus = (i10 & 1) != 0 ? PositionsResponseStatus.OK : positionsResponseStatus;
        if ((i10 & 2) != 0) {
            list = Lists.m69268i();
            Intrinsics.checkNotNullExpressionValue(list, "newArrayList()");
        }
        if ((i10 & 4) != 0) {
            list2 = Lists.m69268i();
            Intrinsics.checkNotNullExpressionValue(list2, "newArrayList()");
        }
        if ((i10 & 8) != 0) {
            list3 = Lists.m69268i();
            Intrinsics.checkNotNullExpressionValue(list3, "newArrayList()");
        }
        boolean z11 = (i10 & 16) != 0 ? false : z10;
        this(positionsResponseStatus, list, list2, list3, z11);
    }
}