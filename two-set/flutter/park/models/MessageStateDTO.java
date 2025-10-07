package com.disney.wdpro.flutter.park.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/models/MessageStateDTO;", "", "status", "Lcom/disney/wdpro/flutter/park/models/Status;", "(Lcom/disney/wdpro/flutter/park/models/Status;)V", "getStatus", "()Lcom/disney/wdpro/flutter/park/models/Status;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class MessageStateDTO {
    private final Status status;

    public MessageStateDTO(@JsonProperty("status") Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    public static /* synthetic */ MessageStateDTO copy$default(MessageStateDTO messageStateDTO, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = messageStateDTO.status;
        }
        return messageStateDTO.copy(status);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final MessageStateDTO copy(@JsonProperty("status") Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new MessageStateDTO(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageStateDTO) && Intrinsics.areEqual(this.status, ((MessageStateDTO) other).status);
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "MessageStateDTO(status=" + this.status + ")";
    }
}