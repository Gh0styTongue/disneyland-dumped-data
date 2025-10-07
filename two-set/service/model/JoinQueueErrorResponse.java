package com.disney.wdpro.virtualqueue.service.model;

import com.disney.wdpro.httpclient.C13323a0;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038F¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;", "Lcom/disney/wdpro/httpclient/a0;", "Ljava/io/Serializable;", "Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponseStatus;", "responseStatus", "", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "conflicts", "", "invalidGuestIds", "notInParkGuestIds", "alreadyInQueueGuestIds", "notLinkedGuestIds", "", "", "errorData", "httpStatus", "<init>", "(Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponseStatus;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;I)V", "Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponseStatus;", "getResponseStatus", "()Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponseStatus;", "Ljava/util/List;", "getConflicts", "()Ljava/util/List;", "getInvalidGuestIds", "getNotInParkGuestIds", "getAlreadyInQueueGuestIds", "getNotLinkedGuestIds", "Ljava/util/Map;", "getErrorData", "()Ljava/util/Map;", "I", "getHttpStatus", "()I", "setHttpStatus", "(I)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class JoinQueueErrorResponse extends C13323a0 implements Serializable {
    public static final int $stable = 8;
    private final List<String> alreadyInQueueGuestIds;
    private final List<Conflict> conflicts;
    private final Map<String, Integer> errorData;
    private int httpStatus;
    private final List<String> invalidGuestIds;
    private final List<String> notInParkGuestIds;
    private final List<String> notLinkedGuestIds;
    private final JoinQueueErrorResponseStatus responseStatus;

    public JoinQueueErrorResponse() {
        this(null, null, null, null, null, null, null, 0, 255, null);
    }

    public final List<String> getAlreadyInQueueGuestIds() {
        List<String> list = this.alreadyInQueueGuestIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Conflict> getConflicts() {
        List<Conflict> list = this.conflicts;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final Map<String, Integer> getErrorData() {
        Map<String, Integer> map = this.errorData;
        return map == null ? MapsKt.emptyMap() : map;
    }

    public final int getHttpStatus() {
        return this.httpStatus;
    }

    public final List<String> getInvalidGuestIds() {
        List<String> list = this.invalidGuestIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<String> getNotInParkGuestIds() {
        List<String> list = this.notInParkGuestIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<String> getNotLinkedGuestIds() {
        List<String> list = this.notLinkedGuestIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final JoinQueueErrorResponseStatus getResponseStatus() {
        JoinQueueErrorResponseStatus joinQueueErrorResponseStatus = this.responseStatus;
        return joinQueueErrorResponseStatus == null ? JoinQueueErrorResponseStatus.INVALID_QUEUE : joinQueueErrorResponseStatus;
    }

    public final void setHttpStatus(int i10) {
        this.httpStatus = i10;
    }

    public /* synthetic */ JoinQueueErrorResponse(JoinQueueErrorResponseStatus joinQueueErrorResponseStatus, List list, List list2, List list3, List list4, List list5, Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? JoinQueueErrorResponseStatus.INVALID_QUEUE : joinQueueErrorResponseStatus, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 8) != 0 ? CollectionsKt.emptyList() : list3, (i11 & 16) != 0 ? CollectionsKt.emptyList() : list4, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list5, (i11 & 64) != 0 ? MapsKt.emptyMap() : map, (i11 & 128) != 0 ? 0 : i10);
    }

    public JoinQueueErrorResponse(JoinQueueErrorResponseStatus responseStatus, List<Conflict> conflicts, List<String> invalidGuestIds, List<String> notInParkGuestIds, List<String> alreadyInQueueGuestIds, List<String> notLinkedGuestIds, Map<String, Integer> errorData, int i10) {
        Intrinsics.checkNotNullParameter(responseStatus, "responseStatus");
        Intrinsics.checkNotNullParameter(conflicts, "conflicts");
        Intrinsics.checkNotNullParameter(invalidGuestIds, "invalidGuestIds");
        Intrinsics.checkNotNullParameter(notInParkGuestIds, "notInParkGuestIds");
        Intrinsics.checkNotNullParameter(alreadyInQueueGuestIds, "alreadyInQueueGuestIds");
        Intrinsics.checkNotNullParameter(notLinkedGuestIds, "notLinkedGuestIds");
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        this.responseStatus = responseStatus;
        this.conflicts = conflicts;
        this.invalidGuestIds = invalidGuestIds;
        this.notInParkGuestIds = notInParkGuestIds;
        this.alreadyInQueueGuestIds = alreadyInQueueGuestIds;
        this.notLinkedGuestIds = notLinkedGuestIds;
        this.errorData = errorData;
        this.httpStatus = i10;
    }
}