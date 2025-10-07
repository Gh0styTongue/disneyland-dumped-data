package com.disney.wdpro.virtualqueue.service.model;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u00020\u00038F¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u00020\n8F¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/GetQueuesResponse;", "Ljava/io/Serializable;", "responseStatus", "Lcom/disney/wdpro/virtualqueue/service/model/QueueStatus;", "queues", "", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "hubs", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "showCastAssistanceCode", "", "(Lcom/disney/wdpro/virtualqueue/service/model/QueueStatus;Ljava/util/List;Ljava/util/List;Z)V", "getHubs", "()Ljava/util/List;", "getQueues", "getResponseStatus", "()Lcom/disney/wdpro/virtualqueue/service/model/QueueStatus;", "getShowCastAssistanceCode", "()Z", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class GetQueuesResponse implements Serializable {
    public static final int $stable = 8;
    private final List<Hub> hubs;
    private final List<Queue> queues;
    private final QueueStatus responseStatus;
    private final boolean showCastAssistanceCode;

    public GetQueuesResponse() {
        this(null, null, null, false, 15, null);
    }

    public final List<Hub> getHubs() {
        List<Hub> list = this.hubs;
        if (list != null) {
            return list;
        }
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        return arrayListM69268i;
    }

    public final List<Queue> getQueues() {
        List<Queue> list = this.queues;
        if (list != null) {
            return list;
        }
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        return arrayListM69268i;
    }

    public final QueueStatus getResponseStatus() {
        QueueStatus queueStatus = this.responseStatus;
        return queueStatus == null ? QueueStatus.OK : queueStatus;
    }

    public final boolean getShowCastAssistanceCode() {
        return this.showCastAssistanceCode;
    }

    public GetQueuesResponse(QueueStatus responseStatus, List<Queue> queues, List<Hub> hubs, boolean z10) {
        Intrinsics.checkNotNullParameter(responseStatus, "responseStatus");
        Intrinsics.checkNotNullParameter(queues, "queues");
        Intrinsics.checkNotNullParameter(hubs, "hubs");
        this.responseStatus = responseStatus;
        this.queues = queues;
        this.hubs = hubs;
        this.showCastAssistanceCode = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetQueuesResponse(QueueStatus queueStatus, List list, List list2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        queueStatus = (i10 & 1) != 0 ? QueueStatus.OK : queueStatus;
        if ((i10 & 2) != 0) {
            list = Lists.m69268i();
            Intrinsics.checkNotNullExpressionValue(list, "newArrayList()");
        }
        if ((i10 & 4) != 0) {
            list2 = Lists.m69268i();
            Intrinsics.checkNotNullExpressionValue(list2, "newArrayList()");
        }
        this(queueStatus, list, list2, (i10 & 8) != 0 ? false : z10);
    }
}