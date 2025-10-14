package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/DPLConsentEntitlements;", "", "hasArPlusEntitlement", "", "hasArPlusConsent", "arAffiliations", "", "Lcom/disney/wdpro/photopass/services/model/ARAffilliation;", "(ZZLjava/util/List;)V", "getArAffiliations", "()Ljava/util/List;", "getHasArPlusConsent", "()Z", "getHasArPlusEntitlement", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DPLConsentEntitlements {
    private final List<ARAffilliation> arAffiliations;
    private final boolean hasArPlusConsent;
    private final boolean hasArPlusEntitlement;

    public DPLConsentEntitlements(boolean z10, boolean z11, List<ARAffilliation> arAffiliations) {
        Intrinsics.checkNotNullParameter(arAffiliations, "arAffiliations");
        this.hasArPlusEntitlement = z10;
        this.hasArPlusConsent = z11;
        this.arAffiliations = arAffiliations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DPLConsentEntitlements copy$default(DPLConsentEntitlements dPLConsentEntitlements, boolean z10, boolean z11, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dPLConsentEntitlements.hasArPlusEntitlement;
        }
        if ((i10 & 2) != 0) {
            z11 = dPLConsentEntitlements.hasArPlusConsent;
        }
        if ((i10 & 4) != 0) {
            list = dPLConsentEntitlements.arAffiliations;
        }
        return dPLConsentEntitlements.copy(z10, z11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasArPlusEntitlement() {
        return this.hasArPlusEntitlement;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasArPlusConsent() {
        return this.hasArPlusConsent;
    }

    public final List<ARAffilliation> component3() {
        return this.arAffiliations;
    }

    public final DPLConsentEntitlements copy(boolean hasArPlusEntitlement, boolean hasArPlusConsent, List<ARAffilliation> arAffiliations) {
        Intrinsics.checkNotNullParameter(arAffiliations, "arAffiliations");
        return new DPLConsentEntitlements(hasArPlusEntitlement, hasArPlusConsent, arAffiliations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DPLConsentEntitlements)) {
            return false;
        }
        DPLConsentEntitlements dPLConsentEntitlements = (DPLConsentEntitlements) other;
        return this.hasArPlusEntitlement == dPLConsentEntitlements.hasArPlusEntitlement && this.hasArPlusConsent == dPLConsentEntitlements.hasArPlusConsent && Intrinsics.areEqual(this.arAffiliations, dPLConsentEntitlements.arAffiliations);
    }

    public final List<ARAffilliation> getArAffiliations() {
        return this.arAffiliations;
    }

    public final boolean getHasArPlusConsent() {
        return this.hasArPlusConsent;
    }

    public final boolean getHasArPlusEntitlement() {
        return this.hasArPlusEntitlement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.hasArPlusEntitlement;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.hasArPlusConsent;
        return ((i10 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.arAffiliations.hashCode();
    }

    public String toString() {
        return "DPLConsentEntitlements(hasArPlusEntitlement=" + this.hasArPlusEntitlement + ", hasArPlusConsent=" + this.hasArPlusConsent + ", arAffiliations=" + this.arAffiliations + ")";
    }
}