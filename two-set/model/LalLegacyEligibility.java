package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalLegacyEligibility;", "", "hasActiveLegacy", "", "hasActiveEntitlement", "eligibleCode", "", "eligibleDesc", "(ZZLjava/lang/String;Ljava/lang/String;)V", "getEligibleCode", "()Ljava/lang/String;", "getEligibleDesc", "getHasActiveEntitlement", "()Z", "getHasActiveLegacy", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalLegacyEligibility {
    private final String eligibleCode;
    private final String eligibleDesc;
    private final boolean hasActiveEntitlement;
    private final boolean hasActiveLegacy;

    public LalLegacyEligibility(boolean z10, boolean z11, String eligibleCode, String eligibleDesc) {
        Intrinsics.checkNotNullParameter(eligibleCode, "eligibleCode");
        Intrinsics.checkNotNullParameter(eligibleDesc, "eligibleDesc");
        this.hasActiveLegacy = z10;
        this.hasActiveEntitlement = z11;
        this.eligibleCode = eligibleCode;
        this.eligibleDesc = eligibleDesc;
    }

    public static /* synthetic */ LalLegacyEligibility copy$default(LalLegacyEligibility lalLegacyEligibility, boolean z10, boolean z11, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = lalLegacyEligibility.hasActiveLegacy;
        }
        if ((i10 & 2) != 0) {
            z11 = lalLegacyEligibility.hasActiveEntitlement;
        }
        if ((i10 & 4) != 0) {
            str = lalLegacyEligibility.eligibleCode;
        }
        if ((i10 & 8) != 0) {
            str2 = lalLegacyEligibility.eligibleDesc;
        }
        return lalLegacyEligibility.copy(z10, z11, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasActiveLegacy() {
        return this.hasActiveLegacy;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasActiveEntitlement() {
        return this.hasActiveEntitlement;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEligibleCode() {
        return this.eligibleCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEligibleDesc() {
        return this.eligibleDesc;
    }

    public final LalLegacyEligibility copy(boolean hasActiveLegacy, boolean hasActiveEntitlement, String eligibleCode, String eligibleDesc) {
        Intrinsics.checkNotNullParameter(eligibleCode, "eligibleCode");
        Intrinsics.checkNotNullParameter(eligibleDesc, "eligibleDesc");
        return new LalLegacyEligibility(hasActiveLegacy, hasActiveEntitlement, eligibleCode, eligibleDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LalLegacyEligibility)) {
            return false;
        }
        LalLegacyEligibility lalLegacyEligibility = (LalLegacyEligibility) other;
        return this.hasActiveLegacy == lalLegacyEligibility.hasActiveLegacy && this.hasActiveEntitlement == lalLegacyEligibility.hasActiveEntitlement && Intrinsics.areEqual(this.eligibleCode, lalLegacyEligibility.eligibleCode) && Intrinsics.areEqual(this.eligibleDesc, lalLegacyEligibility.eligibleDesc);
    }

    public final String getEligibleCode() {
        return this.eligibleCode;
    }

    public final String getEligibleDesc() {
        return this.eligibleDesc;
    }

    public final boolean getHasActiveEntitlement() {
        return this.hasActiveEntitlement;
    }

    public final boolean getHasActiveLegacy() {
        return this.hasActiveLegacy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z10 = this.hasActiveLegacy;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.hasActiveEntitlement;
        return ((((i10 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.eligibleCode.hashCode()) * 31) + this.eligibleDesc.hashCode();
    }

    public String toString() {
        return "LalLegacyEligibility(hasActiveLegacy=" + this.hasActiveLegacy + ", hasActiveEntitlement=" + this.hasActiveEntitlement + ", eligibleCode=" + this.eligibleCode + ", eligibleDesc=" + this.eligibleDesc + ")";
    }
}