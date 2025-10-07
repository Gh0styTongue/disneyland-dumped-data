package com.disney.wdpro.virtualqueue.service.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u00038F¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "Ljava/io/Serializable;", "conflictType", "", "guestIds", "", "(Ljava/lang/String;Ljava/util/List;)V", "getConflictType", "()Ljava/lang/String;", "getGuestIds", "()Ljava/util/List;", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class Conflict implements Serializable {
    public static final String UNKNOWN_CONFLICT_TYPE = "UNKNOWN";
    private final String conflictType;
    private final List<String> guestIds;
    public static final int $stable = 8;

    public Conflict() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getConflictType() {
        String str = this.conflictType;
        return str == null ? "UNKNOWN" : str;
    }

    public final List<String> getGuestIds() {
        List<String> list = this.guestIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public Conflict(String conflictType, List<String> guestIds) {
        Intrinsics.checkNotNullParameter(conflictType, "conflictType");
        Intrinsics.checkNotNullParameter(guestIds, "guestIds");
        this.conflictType = conflictType;
        this.guestIds = guestIds;
    }

    public /* synthetic */ Conflict(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "UNKNOWN" : str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}