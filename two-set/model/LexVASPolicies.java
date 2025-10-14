package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASPolicies;", "", "disneyMemoryProductMobilePolicy", "Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesOneHundredConditions;", "onlineTicketTermsAndConditionsMuralOfMemoriesMobile", "Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditions;", "(Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesOneHundredConditions;Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditions;)V", "getDisneyMemoryProductMobilePolicy", "()Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesOneHundredConditions;", "getOnlineTicketTermsAndConditionsMuralOfMemoriesMobile", "()Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditions;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASPolicies {

    @SerializedName("100-disney-memory-product-mobile")
    private final LexVASPoliciesOneHundredConditions disneyMemoryProductMobilePolicy;

    @SerializedName(CheckoutConstants.ONLINE_TICKET_TC_MURAL_OF_MEMORIES_ID)
    private final LexVASPoliciesConditions onlineTicketTermsAndConditionsMuralOfMemoriesMobile;

    public LexVASPolicies(LexVASPoliciesOneHundredConditions disneyMemoryProductMobilePolicy, LexVASPoliciesConditions onlineTicketTermsAndConditionsMuralOfMemoriesMobile) {
        Intrinsics.checkNotNullParameter(disneyMemoryProductMobilePolicy, "disneyMemoryProductMobilePolicy");
        Intrinsics.checkNotNullParameter(onlineTicketTermsAndConditionsMuralOfMemoriesMobile, "onlineTicketTermsAndConditionsMuralOfMemoriesMobile");
        this.disneyMemoryProductMobilePolicy = disneyMemoryProductMobilePolicy;
        this.onlineTicketTermsAndConditionsMuralOfMemoriesMobile = onlineTicketTermsAndConditionsMuralOfMemoriesMobile;
    }

    public static /* synthetic */ LexVASPolicies copy$default(LexVASPolicies lexVASPolicies, LexVASPoliciesOneHundredConditions lexVASPoliciesOneHundredConditions, LexVASPoliciesConditions lexVASPoliciesConditions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lexVASPoliciesOneHundredConditions = lexVASPolicies.disneyMemoryProductMobilePolicy;
        }
        if ((i10 & 2) != 0) {
            lexVASPoliciesConditions = lexVASPolicies.onlineTicketTermsAndConditionsMuralOfMemoriesMobile;
        }
        return lexVASPolicies.copy(lexVASPoliciesOneHundredConditions, lexVASPoliciesConditions);
    }

    /* renamed from: component1, reason: from getter */
    public final LexVASPoliciesOneHundredConditions getDisneyMemoryProductMobilePolicy() {
        return this.disneyMemoryProductMobilePolicy;
    }

    /* renamed from: component2, reason: from getter */
    public final LexVASPoliciesConditions getOnlineTicketTermsAndConditionsMuralOfMemoriesMobile() {
        return this.onlineTicketTermsAndConditionsMuralOfMemoriesMobile;
    }

    public final LexVASPolicies copy(LexVASPoliciesOneHundredConditions disneyMemoryProductMobilePolicy, LexVASPoliciesConditions onlineTicketTermsAndConditionsMuralOfMemoriesMobile) {
        Intrinsics.checkNotNullParameter(disneyMemoryProductMobilePolicy, "disneyMemoryProductMobilePolicy");
        Intrinsics.checkNotNullParameter(onlineTicketTermsAndConditionsMuralOfMemoriesMobile, "onlineTicketTermsAndConditionsMuralOfMemoriesMobile");
        return new LexVASPolicies(disneyMemoryProductMobilePolicy, onlineTicketTermsAndConditionsMuralOfMemoriesMobile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexVASPolicies)) {
            return false;
        }
        LexVASPolicies lexVASPolicies = (LexVASPolicies) other;
        return Intrinsics.areEqual(this.disneyMemoryProductMobilePolicy, lexVASPolicies.disneyMemoryProductMobilePolicy) && Intrinsics.areEqual(this.onlineTicketTermsAndConditionsMuralOfMemoriesMobile, lexVASPolicies.onlineTicketTermsAndConditionsMuralOfMemoriesMobile);
    }

    public final LexVASPoliciesOneHundredConditions getDisneyMemoryProductMobilePolicy() {
        return this.disneyMemoryProductMobilePolicy;
    }

    public final LexVASPoliciesConditions getOnlineTicketTermsAndConditionsMuralOfMemoriesMobile() {
        return this.onlineTicketTermsAndConditionsMuralOfMemoriesMobile;
    }

    public int hashCode() {
        return (this.disneyMemoryProductMobilePolicy.hashCode() * 31) + this.onlineTicketTermsAndConditionsMuralOfMemoriesMobile.hashCode();
    }

    public String toString() {
        return "LexVASPolicies(disneyMemoryProductMobilePolicy=" + this.disneyMemoryProductMobilePolicy + ", onlineTicketTermsAndConditionsMuralOfMemoriesMobile=" + this.onlineTicketTermsAndConditionsMuralOfMemoriesMobile + ")";
    }
}