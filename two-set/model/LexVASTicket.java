package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J_\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006*"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASTicket;", "", "discountGroups", "Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroup;", "policies", "Lcom/disney/wdpro/photopass/services/model/LexVASPolicies;", "availableNumDays", "", "", "storeId", "", "destinationId", "category", "isTieredTicketsEnabled", "", "responseDateTime", "(Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroup;Lcom/disney/wdpro/photopass/services/model/LexVASPolicies;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvailableNumDays", "()Ljava/util/List;", "getCategory", "()Ljava/lang/String;", "getDestinationId", "getDiscountGroups", "()Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroup;", "()Z", "getPolicies", "()Lcom/disney/wdpro/photopass/services/model/LexVASPolicies;", "getResponseDateTime", "getStoreId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASTicket {
    private final List<Integer> availableNumDays;
    private final String category;
    private final String destinationId;
    private final LexVASDiscountGroup discountGroups;
    private final boolean isTieredTicketsEnabled;
    private final LexVASPolicies policies;
    private final String responseDateTime;
    private final String storeId;

    public LexVASTicket(LexVASDiscountGroup discountGroups, LexVASPolicies policies, List<Integer> availableNumDays, String storeId, String destinationId, String category, boolean z10, String responseDateTime) {
        Intrinsics.checkNotNullParameter(discountGroups, "discountGroups");
        Intrinsics.checkNotNullParameter(policies, "policies");
        Intrinsics.checkNotNullParameter(availableNumDays, "availableNumDays");
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        this.discountGroups = discountGroups;
        this.policies = policies;
        this.availableNumDays = availableNumDays;
        this.storeId = storeId;
        this.destinationId = destinationId;
        this.category = category;
        this.isTieredTicketsEnabled = z10;
        this.responseDateTime = responseDateTime;
    }

    public static /* synthetic */ LexVASTicket copy$default(LexVASTicket lexVASTicket, LexVASDiscountGroup lexVASDiscountGroup, LexVASPolicies lexVASPolicies, List list, String str, String str2, String str3, boolean z10, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lexVASDiscountGroup = lexVASTicket.discountGroups;
        }
        if ((i10 & 2) != 0) {
            lexVASPolicies = lexVASTicket.policies;
        }
        if ((i10 & 4) != 0) {
            list = lexVASTicket.availableNumDays;
        }
        if ((i10 & 8) != 0) {
            str = lexVASTicket.storeId;
        }
        if ((i10 & 16) != 0) {
            str2 = lexVASTicket.destinationId;
        }
        if ((i10 & 32) != 0) {
            str3 = lexVASTicket.category;
        }
        if ((i10 & 64) != 0) {
            z10 = lexVASTicket.isTieredTicketsEnabled;
        }
        if ((i10 & 128) != 0) {
            str4 = lexVASTicket.responseDateTime;
        }
        boolean z11 = z10;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        return lexVASTicket.copy(lexVASDiscountGroup, lexVASPolicies, list, str, str6, str7, z11, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final LexVASDiscountGroup getDiscountGroups() {
        return this.discountGroups;
    }

    /* renamed from: component2, reason: from getter */
    public final LexVASPolicies getPolicies() {
        return this.policies;
    }

    public final List<Integer> component3() {
        return this.availableNumDays;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsTieredTicketsEnabled() {
        return this.isTieredTicketsEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    public final LexVASTicket copy(LexVASDiscountGroup discountGroups, LexVASPolicies policies, List<Integer> availableNumDays, String storeId, String destinationId, String category, boolean isTieredTicketsEnabled, String responseDateTime) {
        Intrinsics.checkNotNullParameter(discountGroups, "discountGroups");
        Intrinsics.checkNotNullParameter(policies, "policies");
        Intrinsics.checkNotNullParameter(availableNumDays, "availableNumDays");
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        return new LexVASTicket(discountGroups, policies, availableNumDays, storeId, destinationId, category, isTieredTicketsEnabled, responseDateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexVASTicket)) {
            return false;
        }
        LexVASTicket lexVASTicket = (LexVASTicket) other;
        return Intrinsics.areEqual(this.discountGroups, lexVASTicket.discountGroups) && Intrinsics.areEqual(this.policies, lexVASTicket.policies) && Intrinsics.areEqual(this.availableNumDays, lexVASTicket.availableNumDays) && Intrinsics.areEqual(this.storeId, lexVASTicket.storeId) && Intrinsics.areEqual(this.destinationId, lexVASTicket.destinationId) && Intrinsics.areEqual(this.category, lexVASTicket.category) && this.isTieredTicketsEnabled == lexVASTicket.isTieredTicketsEnabled && Intrinsics.areEqual(this.responseDateTime, lexVASTicket.responseDateTime);
    }

    public final List<Integer> getAvailableNumDays() {
        return this.availableNumDays;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDestinationId() {
        return this.destinationId;
    }

    public final LexVASDiscountGroup getDiscountGroups() {
        return this.discountGroups;
    }

    public final LexVASPolicies getPolicies() {
        return this.policies;
    }

    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((this.discountGroups.hashCode() * 31) + this.policies.hashCode()) * 31) + this.availableNumDays.hashCode()) * 31) + this.storeId.hashCode()) * 31) + this.destinationId.hashCode()) * 31) + this.category.hashCode()) * 31;
        boolean z10 = this.isTieredTicketsEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((iHashCode + i10) * 31) + this.responseDateTime.hashCode();
    }

    public final boolean isTieredTicketsEnabled() {
        return this.isTieredTicketsEnabled;
    }

    public String toString() {
        return "LexVASTicket(discountGroups=" + this.discountGroups + ", policies=" + this.policies + ", availableNumDays=" + this.availableNumDays + ", storeId=" + this.storeId + ", destinationId=" + this.destinationId + ", category=" + this.category + ", isTieredTicketsEnabled=" + this.isTieredTicketsEnabled + ", responseDateTime=" + this.responseDateTime + ")";
    }
}