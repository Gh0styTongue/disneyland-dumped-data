package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006'"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/Entitlement;", "Ljava/io/Serializable;", "entitlementId", "", "entitlementType", "purchaseDateTime", "Ljava/util/Date;", "captureDate", "startDateTime", "endDateTime", "guestTypeOnEntitlement", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "getCaptureDate", "()Ljava/util/Date;", "getEndDateTime", "getEntitlementId", "()Ljava/lang/String;", "getEntitlementType", "getGuestTypeOnEntitlement", "getPurchaseDateTime", "getStartDateTime", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Entitlement implements Serializable {
    private final Date captureDate;
    private final Date endDateTime;
    private final String entitlementId;
    private final String entitlementType;
    private final String guestTypeOnEntitlement;
    private final Date purchaseDateTime;
    private final Date startDateTime;
    private final String status;

    public Entitlement(String entitlementId, String entitlementType, Date purchaseDateTime, Date date, Date date2, Date date3, String guestTypeOnEntitlement, String status) {
        Intrinsics.checkNotNullParameter(entitlementId, "entitlementId");
        Intrinsics.checkNotNullParameter(entitlementType, "entitlementType");
        Intrinsics.checkNotNullParameter(purchaseDateTime, "purchaseDateTime");
        Intrinsics.checkNotNullParameter(guestTypeOnEntitlement, "guestTypeOnEntitlement");
        Intrinsics.checkNotNullParameter(status, "status");
        this.entitlementId = entitlementId;
        this.entitlementType = entitlementType;
        this.purchaseDateTime = purchaseDateTime;
        this.captureDate = date;
        this.startDateTime = date2;
        this.endDateTime = date3;
        this.guestTypeOnEntitlement = guestTypeOnEntitlement;
        this.status = status;
    }

    public static /* synthetic */ Entitlement copy$default(Entitlement entitlement, String str, String str2, Date date, Date date2, Date date3, Date date4, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entitlement.entitlementId;
        }
        if ((i10 & 2) != 0) {
            str2 = entitlement.entitlementType;
        }
        if ((i10 & 4) != 0) {
            date = entitlement.purchaseDateTime;
        }
        if ((i10 & 8) != 0) {
            date2 = entitlement.captureDate;
        }
        if ((i10 & 16) != 0) {
            date3 = entitlement.startDateTime;
        }
        if ((i10 & 32) != 0) {
            date4 = entitlement.endDateTime;
        }
        if ((i10 & 64) != 0) {
            str3 = entitlement.guestTypeOnEntitlement;
        }
        if ((i10 & 128) != 0) {
            str4 = entitlement.status;
        }
        String str5 = str3;
        String str6 = str4;
        Date date5 = date3;
        Date date6 = date4;
        return entitlement.copy(str, str2, date, date2, date5, date6, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntitlementId() {
        return this.entitlementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntitlementType() {
        return this.entitlementType;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getPurchaseDateTime() {
        return this.purchaseDateTime;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getCaptureDate() {
        return this.captureDate;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getStartDateTime() {
        return this.startDateTime;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getEndDateTime() {
        return this.endDateTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGuestTypeOnEntitlement() {
        return this.guestTypeOnEntitlement;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final Entitlement copy(String entitlementId, String entitlementType, Date purchaseDateTime, Date captureDate, Date startDateTime, Date endDateTime, String guestTypeOnEntitlement, String status) {
        Intrinsics.checkNotNullParameter(entitlementId, "entitlementId");
        Intrinsics.checkNotNullParameter(entitlementType, "entitlementType");
        Intrinsics.checkNotNullParameter(purchaseDateTime, "purchaseDateTime");
        Intrinsics.checkNotNullParameter(guestTypeOnEntitlement, "guestTypeOnEntitlement");
        Intrinsics.checkNotNullParameter(status, "status");
        return new Entitlement(entitlementId, entitlementType, purchaseDateTime, captureDate, startDateTime, endDateTime, guestTypeOnEntitlement, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entitlement)) {
            return false;
        }
        Entitlement entitlement = (Entitlement) other;
        return Intrinsics.areEqual(this.entitlementId, entitlement.entitlementId) && Intrinsics.areEqual(this.entitlementType, entitlement.entitlementType) && Intrinsics.areEqual(this.purchaseDateTime, entitlement.purchaseDateTime) && Intrinsics.areEqual(this.captureDate, entitlement.captureDate) && Intrinsics.areEqual(this.startDateTime, entitlement.startDateTime) && Intrinsics.areEqual(this.endDateTime, entitlement.endDateTime) && Intrinsics.areEqual(this.guestTypeOnEntitlement, entitlement.guestTypeOnEntitlement) && Intrinsics.areEqual(this.status, entitlement.status);
    }

    public final Date getCaptureDate() {
        return this.captureDate;
    }

    public final Date getEndDateTime() {
        return this.endDateTime;
    }

    public final String getEntitlementId() {
        return this.entitlementId;
    }

    public final String getEntitlementType() {
        return this.entitlementType;
    }

    public final String getGuestTypeOnEntitlement() {
        return this.guestTypeOnEntitlement;
    }

    public final Date getPurchaseDateTime() {
        return this.purchaseDateTime;
    }

    public final Date getStartDateTime() {
        return this.startDateTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((this.entitlementId.hashCode() * 31) + this.entitlementType.hashCode()) * 31) + this.purchaseDateTime.hashCode()) * 31;
        Date date = this.captureDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.startDateTime;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.endDateTime;
        return ((((iHashCode3 + (date3 != null ? date3.hashCode() : 0)) * 31) + this.guestTypeOnEntitlement.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "Entitlement(entitlementId=" + this.entitlementId + ", entitlementType=" + this.entitlementType + ", purchaseDateTime=" + this.purchaseDateTime + ", captureDate=" + this.captureDate + ", startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ", guestTypeOnEntitlement=" + this.guestTypeOnEntitlement + ", status=" + this.status + ")";
    }
}