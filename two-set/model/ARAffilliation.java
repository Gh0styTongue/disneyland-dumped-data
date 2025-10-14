package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassExtensionsUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/ARAffilliation;", "", "affiliation", "", "affiliationId", PhotoPassExtensionsUtils.FILTER_ITEM_OWN_ID, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAffiliation", "()Ljava/lang/String;", "getAffiliationId", "getOwn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/disney/wdpro/photopass/services/model/ARAffilliation;", "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ARAffilliation {
    private final String affiliation;
    private final String affiliationId;
    private final Boolean own;

    public ARAffilliation() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ARAffilliation copy$default(ARAffilliation aRAffilliation, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aRAffilliation.affiliation;
        }
        if ((i10 & 2) != 0) {
            str2 = aRAffilliation.affiliationId;
        }
        if ((i10 & 4) != 0) {
            bool = aRAffilliation.own;
        }
        return aRAffilliation.copy(str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAffiliation() {
        return this.affiliation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAffiliationId() {
        return this.affiliationId;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getOwn() {
        return this.own;
    }

    public final ARAffilliation copy(String affiliation, String affiliationId, Boolean own) {
        return new ARAffilliation(affiliation, affiliationId, own);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ARAffilliation)) {
            return false;
        }
        ARAffilliation aRAffilliation = (ARAffilliation) other;
        return Intrinsics.areEqual(this.affiliation, aRAffilliation.affiliation) && Intrinsics.areEqual(this.affiliationId, aRAffilliation.affiliationId) && Intrinsics.areEqual(this.own, aRAffilliation.own);
    }

    public final String getAffiliation() {
        return this.affiliation;
    }

    public final String getAffiliationId() {
        return this.affiliationId;
    }

    public final Boolean getOwn() {
        return this.own;
    }

    public int hashCode() {
        String str = this.affiliation;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.affiliationId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.own;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ARAffilliation(affiliation=" + this.affiliation + ", affiliationId=" + this.affiliationId + ", own=" + this.own + ")";
    }

    public ARAffilliation(String str, String str2, Boolean bool) {
        this.affiliation = str;
        this.affiliationId = str2;
        this.own = bool;
    }

    public /* synthetic */ ARAffilliation(String str, String str2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool);
    }
}