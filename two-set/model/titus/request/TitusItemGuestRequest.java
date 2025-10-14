package com.disney.wdpro.photopass.services.model.titus.request;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/request/TitusItemGuestRequest;", "", "guestIdType", "", "guestIdValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getGuestIdType", "()Ljava/lang/String;", "getGuestIdValue", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusItemGuestRequest {
    private final String guestIdType;
    private final String guestIdValue;

    public TitusItemGuestRequest(String guestIdType, String str) {
        Intrinsics.checkNotNullParameter(guestIdType, "guestIdType");
        this.guestIdType = guestIdType;
        this.guestIdValue = str;
    }

    public static /* synthetic */ TitusItemGuestRequest copy$default(TitusItemGuestRequest titusItemGuestRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusItemGuestRequest.guestIdType;
        }
        if ((i10 & 2) != 0) {
            str2 = titusItemGuestRequest.guestIdValue;
        }
        return titusItemGuestRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuestIdType() {
        return this.guestIdType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGuestIdValue() {
        return this.guestIdValue;
    }

    public final TitusItemGuestRequest copy(String guestIdType, String guestIdValue) {
        Intrinsics.checkNotNullParameter(guestIdType, "guestIdType");
        return new TitusItemGuestRequest(guestIdType, guestIdValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusItemGuestRequest)) {
            return false;
        }
        TitusItemGuestRequest titusItemGuestRequest = (TitusItemGuestRequest) other;
        return Intrinsics.areEqual(this.guestIdType, titusItemGuestRequest.guestIdType) && Intrinsics.areEqual(this.guestIdValue, titusItemGuestRequest.guestIdValue);
    }

    public final String getGuestIdType() {
        return this.guestIdType;
    }

    public final String getGuestIdValue() {
        return this.guestIdValue;
    }

    public int hashCode() {
        int iHashCode = this.guestIdType.hashCode() * 31;
        String str = this.guestIdValue;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TitusItemGuestRequest(guestIdType=" + this.guestIdType + ", guestIdValue=" + this.guestIdValue + ")";
    }
}