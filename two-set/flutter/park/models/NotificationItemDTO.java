package com.disney.wdpro.flutter.park.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/models/NotificationItemDTO;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class NotificationItemDTO {
    private final String id;

    public NotificationItemDTO(String str) {
        this.id = str;
    }

    public static /* synthetic */ NotificationItemDTO copy$default(NotificationItemDTO notificationItemDTO, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationItemDTO.id;
        }
        return notificationItemDTO.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final NotificationItemDTO copy(String id2) {
        return new NotificationItemDTO(id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationItemDTO) && Intrinsics.areEqual(this.id, ((NotificationItemDTO) other).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "NotificationItemDTO(id=" + this.id + ")";
    }
}