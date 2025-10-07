package com.disney.wdpro.virtualqueue.service.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\u0010\rR\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0002\u001a\u00020\u00038F¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsResponse;", "Ljava/io/Serializable;", "responseStatus", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsResponseStatus;", "guests", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "queues", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "conflicts", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "planningPartyGuestIds", "", "(Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsResponseStatus;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getConflicts", "()Ljava/util/List;", "getGuests", "getPlanningPartyGuestIds", "getQueues", "getResponseStatus", "()Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsResponseStatus;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class GetLinkedGuestsResponse implements Serializable {
    public static final int $stable = 8;
    private final List<Conflict> conflicts;
    private final List<LinkedGuest> guests;
    private final List<String> planningPartyGuestIds;
    private final List<Queue> queues;
    private final GetLinkedGuestsResponseStatus responseStatus;

    public GetLinkedGuestsResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public final List<Conflict> getConflicts() {
        List<Conflict> list = this.conflicts;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<LinkedGuest> getGuests() {
        List<LinkedGuest> list = this.guests;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<String> getPlanningPartyGuestIds() {
        List<String> list = this.planningPartyGuestIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Queue> getQueues() {
        List<Queue> list = this.queues;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final GetLinkedGuestsResponseStatus getResponseStatus() {
        GetLinkedGuestsResponseStatus getLinkedGuestsResponseStatus = this.responseStatus;
        return getLinkedGuestsResponseStatus == null ? GetLinkedGuestsResponseStatus.INVALID_GUEST : getLinkedGuestsResponseStatus;
    }

    public GetLinkedGuestsResponse(GetLinkedGuestsResponseStatus responseStatus, List<LinkedGuest> guests, List<Queue> queues, List<Conflict> conflicts, List<String> planningPartyGuestIds) {
        Intrinsics.checkNotNullParameter(responseStatus, "responseStatus");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queues, "queues");
        Intrinsics.checkNotNullParameter(conflicts, "conflicts");
        Intrinsics.checkNotNullParameter(planningPartyGuestIds, "planningPartyGuestIds");
        this.responseStatus = responseStatus;
        this.guests = guests;
        this.queues = queues;
        this.conflicts = conflicts;
        this.planningPartyGuestIds = planningPartyGuestIds;
    }

    public /* synthetic */ GetLinkedGuestsResponse(GetLinkedGuestsResponseStatus getLinkedGuestsResponseStatus, List list, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? GetLinkedGuestsResponseStatus.OK : getLinkedGuestsResponseStatus, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list3, (i10 & 16) != 0 ? CollectionsKt.emptyList() : list4);
    }
}