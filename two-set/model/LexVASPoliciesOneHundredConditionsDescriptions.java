package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesOneHundredConditionsDescriptions;", "", "disneyMemoryProductMobileDescription", "Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptionsTerms;", "(Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptionsTerms;)V", "getDisneyMemoryProductMobileDescription", "()Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptionsTerms;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASPoliciesOneHundredConditionsDescriptions {

    @SerializedName(CheckoutConstants.PRO_MOBILE_DESCRIPTION)
    private final LexVASPoliciesConditionsDescriptionsTerms disneyMemoryProductMobileDescription;

    public LexVASPoliciesOneHundredConditionsDescriptions(LexVASPoliciesConditionsDescriptionsTerms disneyMemoryProductMobileDescription) {
        Intrinsics.checkNotNullParameter(disneyMemoryProductMobileDescription, "disneyMemoryProductMobileDescription");
        this.disneyMemoryProductMobileDescription = disneyMemoryProductMobileDescription;
    }

    public static /* synthetic */ LexVASPoliciesOneHundredConditionsDescriptions copy$default(LexVASPoliciesOneHundredConditionsDescriptions lexVASPoliciesOneHundredConditionsDescriptions, LexVASPoliciesConditionsDescriptionsTerms lexVASPoliciesConditionsDescriptionsTerms, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lexVASPoliciesConditionsDescriptionsTerms = lexVASPoliciesOneHundredConditionsDescriptions.disneyMemoryProductMobileDescription;
        }
        return lexVASPoliciesOneHundredConditionsDescriptions.copy(lexVASPoliciesConditionsDescriptionsTerms);
    }

    /* renamed from: component1, reason: from getter */
    public final LexVASPoliciesConditionsDescriptionsTerms getDisneyMemoryProductMobileDescription() {
        return this.disneyMemoryProductMobileDescription;
    }

    public final LexVASPoliciesOneHundredConditionsDescriptions copy(LexVASPoliciesConditionsDescriptionsTerms disneyMemoryProductMobileDescription) {
        Intrinsics.checkNotNullParameter(disneyMemoryProductMobileDescription, "disneyMemoryProductMobileDescription");
        return new LexVASPoliciesOneHundredConditionsDescriptions(disneyMemoryProductMobileDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LexVASPoliciesOneHundredConditionsDescriptions) && Intrinsics.areEqual(this.disneyMemoryProductMobileDescription, ((LexVASPoliciesOneHundredConditionsDescriptions) other).disneyMemoryProductMobileDescription);
    }

    public final LexVASPoliciesConditionsDescriptionsTerms getDisneyMemoryProductMobileDescription() {
        return this.disneyMemoryProductMobileDescription;
    }

    public int hashCode() {
        return this.disneyMemoryProductMobileDescription.hashCode();
    }

    public String toString() {
        return "LexVASPoliciesOneHundredConditionsDescriptions(disneyMemoryProductMobileDescription=" + this.disneyMemoryProductMobileDescription + ")";
    }
}