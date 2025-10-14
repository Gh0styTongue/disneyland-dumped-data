package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptions;", "", "onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA", "Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptionsTerms;", "(Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptionsTerms;)V", "getOnlineTicketTermsAndConditionsMuralOfMemoriesMobileTA", "()Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptionsTerms;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASPoliciesConditionsDescriptions {

    @SerializedName("online-ticket-terms-and-conditions-mural-of-memories-mobile-TA")
    private final LexVASPoliciesConditionsDescriptionsTerms onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA;

    public LexVASPoliciesConditionsDescriptions(LexVASPoliciesConditionsDescriptionsTerms onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA) {
        Intrinsics.checkNotNullParameter(onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA, "onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA");
        this.onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA = onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA;
    }

    public static /* synthetic */ LexVASPoliciesConditionsDescriptions copy$default(LexVASPoliciesConditionsDescriptions lexVASPoliciesConditionsDescriptions, LexVASPoliciesConditionsDescriptionsTerms lexVASPoliciesConditionsDescriptionsTerms, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lexVASPoliciesConditionsDescriptionsTerms = lexVASPoliciesConditionsDescriptions.onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA;
        }
        return lexVASPoliciesConditionsDescriptions.copy(lexVASPoliciesConditionsDescriptionsTerms);
    }

    /* renamed from: component1, reason: from getter */
    public final LexVASPoliciesConditionsDescriptionsTerms getOnlineTicketTermsAndConditionsMuralOfMemoriesMobileTA() {
        return this.onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA;
    }

    public final LexVASPoliciesConditionsDescriptions copy(LexVASPoliciesConditionsDescriptionsTerms onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA) {
        Intrinsics.checkNotNullParameter(onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA, "onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA");
        return new LexVASPoliciesConditionsDescriptions(onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LexVASPoliciesConditionsDescriptions) && Intrinsics.areEqual(this.onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA, ((LexVASPoliciesConditionsDescriptions) other).onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA);
    }

    public final LexVASPoliciesConditionsDescriptionsTerms getOnlineTicketTermsAndConditionsMuralOfMemoriesMobileTA() {
        return this.onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA;
    }

    public int hashCode() {
        return this.onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA.hashCode();
    }

    public String toString() {
        return "LexVASPoliciesConditionsDescriptions(onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA=" + this.onlineTicketTermsAndConditionsMuralOfMemoriesMobileTA + ")";
    }
}