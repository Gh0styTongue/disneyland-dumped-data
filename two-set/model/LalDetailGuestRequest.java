package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalDetailGuestRequest;", "", "guestLegacyId", "", "(Ljava/lang/String;)V", "getGuestLegacyId", "()Ljava/lang/String;", "setGuestLegacyId", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalDetailGuestRequest {
    private String guestLegacyId;

    public LalDetailGuestRequest(String guestLegacyId) {
        Intrinsics.checkNotNullParameter(guestLegacyId, "guestLegacyId");
        this.guestLegacyId = guestLegacyId;
    }

    public static /* synthetic */ LalDetailGuestRequest copy$default(LalDetailGuestRequest lalDetailGuestRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lalDetailGuestRequest.guestLegacyId;
        }
        return lalDetailGuestRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuestLegacyId() {
        return this.guestLegacyId;
    }

    public final LalDetailGuestRequest copy(String guestLegacyId) {
        Intrinsics.checkNotNullParameter(guestLegacyId, "guestLegacyId");
        return new LalDetailGuestRequest(guestLegacyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LalDetailGuestRequest) && Intrinsics.areEqual(this.guestLegacyId, ((LalDetailGuestRequest) other).guestLegacyId);
    }

    public final String getGuestLegacyId() {
        return this.guestLegacyId;
    }

    public int hashCode() {
        return this.guestLegacyId.hashCode();
    }

    public final void setGuestLegacyId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.guestLegacyId = str;
    }

    public String toString() {
        return "LalDetailGuestRequest(guestLegacyId=" + this.guestLegacyId + ")";
    }
}