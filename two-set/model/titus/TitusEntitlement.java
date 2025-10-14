package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.hawkeye.p136ui.navigation.HawkeyeDeepLinks;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusEntitlement;", "", HawkeyeDeepLinks.GUEST_ID, "", "entitlementType", "entitlementId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEntitlementId", "()Ljava/lang/String;", "getEntitlementType", "getGuestId", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusEntitlement {
    private final String entitlementId;
    private final String entitlementType;
    private final String guestId;

    public TitusEntitlement(String guestId, String entitlementType, String entitlementId) {
        Intrinsics.checkNotNullParameter(guestId, "guestId");
        Intrinsics.checkNotNullParameter(entitlementType, "entitlementType");
        Intrinsics.checkNotNullParameter(entitlementId, "entitlementId");
        this.guestId = guestId;
        this.entitlementType = entitlementType;
        this.entitlementId = entitlementId;
    }

    public static /* synthetic */ TitusEntitlement copy$default(TitusEntitlement titusEntitlement, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusEntitlement.guestId;
        }
        if ((i10 & 2) != 0) {
            str2 = titusEntitlement.entitlementType;
        }
        if ((i10 & 4) != 0) {
            str3 = titusEntitlement.entitlementId;
        }
        return titusEntitlement.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuestId() {
        return this.guestId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntitlementType() {
        return this.entitlementType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntitlementId() {
        return this.entitlementId;
    }

    public final TitusEntitlement copy(String guestId, String entitlementType, String entitlementId) {
        Intrinsics.checkNotNullParameter(guestId, "guestId");
        Intrinsics.checkNotNullParameter(entitlementType, "entitlementType");
        Intrinsics.checkNotNullParameter(entitlementId, "entitlementId");
        return new TitusEntitlement(guestId, entitlementType, entitlementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusEntitlement)) {
            return false;
        }
        TitusEntitlement titusEntitlement = (TitusEntitlement) other;
        return Intrinsics.areEqual(this.guestId, titusEntitlement.guestId) && Intrinsics.areEqual(this.entitlementType, titusEntitlement.entitlementType) && Intrinsics.areEqual(this.entitlementId, titusEntitlement.entitlementId);
    }

    public final String getEntitlementId() {
        return this.entitlementId;
    }

    public final String getEntitlementType() {
        return this.entitlementType;
    }

    public final String getGuestId() {
        return this.guestId;
    }

    public int hashCode() {
        return (((this.guestId.hashCode() * 31) + this.entitlementType.hashCode()) * 31) + this.entitlementId.hashCode();
    }

    public String toString() {
        return "TitusEntitlement(guestId=" + this.guestId + ", entitlementType=" + this.entitlementType + ", entitlementId=" + this.entitlementId + ")";
    }
}