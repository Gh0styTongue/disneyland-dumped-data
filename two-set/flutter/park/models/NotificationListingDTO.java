package com.disney.wdpro.flutter.park.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/models/NotificationListingDTO;", "", "list", "", "Lcom/disney/wdpro/flutter/park/models/NotificationItemDTO;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class NotificationListingDTO {
    private final List<NotificationItemDTO> list;

    public NotificationListingDTO(@JsonProperty("list") List<NotificationItemDTO> list) {
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationListingDTO copy$default(NotificationListingDTO notificationListingDTO, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = notificationListingDTO.list;
        }
        return notificationListingDTO.copy(list);
    }

    public final List<NotificationItemDTO> component1() {
        return this.list;
    }

    public final NotificationListingDTO copy(@JsonProperty("list") List<NotificationItemDTO> list) {
        return new NotificationListingDTO(list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationListingDTO) && Intrinsics.areEqual(this.list, ((NotificationListingDTO) other).list);
    }

    public final List<NotificationItemDTO> getList() {
        return this.list;
    }

    public int hashCode() {
        List<NotificationItemDTO> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "NotificationListingDTO(list=" + this.list + ")";
    }
}