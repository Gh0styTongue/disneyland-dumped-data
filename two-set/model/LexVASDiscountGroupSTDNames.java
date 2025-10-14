package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.secommerce.SpecialEventCommerceConstants;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006."}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNames;", "", "wdproMobileName", "Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;", DisplayNameMap.KEY_PRODUCT_CAPTION, DisplayNameMap.KEY_PRODUCT_SUB_CAPTION, SpecialEventCommerceConstants.NAME_KEY_STANDARD_NAME, "wdproName", DisplayNameMap.KEY_PRODUCT_TICKET_BRICK_AGEGROUP_LABEL, "wdproConfigName", "wdproListingName", "wdproUnified", "customerManagedRelationshipUsage", "wdproCartPlusTicketOnly", "(Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;)V", "getCustomerManagedRelationshipUsage", "()Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNamesDesc;", "getStandardName", "getWdproCartPlusTicketOnly", "getWdproConfigName", "getWdproListingName", "getWdproMobileCaption", "getWdproMobileName", "getWdproMobileSubCaption", "getWdproMobileTicketBrickAgeGroupLabel", "getWdproName", "getWdproUnified", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASDiscountGroupSTDNames {

    @SerializedName("Customer Managed Relationship Usage")
    private final LexVASDiscountGroupSTDNamesDesc customerManagedRelationshipUsage;
    private final LexVASDiscountGroupSTDNamesDesc standardName;

    @SerializedName("WDPRO Cart Plus Ticket Only")
    private final LexVASDiscountGroupSTDNamesDesc wdproCartPlusTicketOnly;
    private final LexVASDiscountGroupSTDNamesDesc wdproConfigName;
    private final LexVASDiscountGroupSTDNamesDesc wdproListingName;
    private final LexVASDiscountGroupSTDNamesDesc wdproMobileCaption;
    private final LexVASDiscountGroupSTDNamesDesc wdproMobileName;
    private final LexVASDiscountGroupSTDNamesDesc wdproMobileSubCaption;
    private final LexVASDiscountGroupSTDNamesDesc wdproMobileTicketBrickAgeGroupLabel;
    private final LexVASDiscountGroupSTDNamesDesc wdproName;
    private final LexVASDiscountGroupSTDNamesDesc wdproUnified;

    public LexVASDiscountGroupSTDNames(LexVASDiscountGroupSTDNamesDesc wdproMobileName, LexVASDiscountGroupSTDNamesDesc wdproMobileCaption, LexVASDiscountGroupSTDNamesDesc wdproMobileSubCaption, LexVASDiscountGroupSTDNamesDesc standardName, LexVASDiscountGroupSTDNamesDesc wdproName, LexVASDiscountGroupSTDNamesDesc wdproMobileTicketBrickAgeGroupLabel, LexVASDiscountGroupSTDNamesDesc wdproConfigName, LexVASDiscountGroupSTDNamesDesc wdproListingName, LexVASDiscountGroupSTDNamesDesc wdproUnified, LexVASDiscountGroupSTDNamesDesc customerManagedRelationshipUsage, LexVASDiscountGroupSTDNamesDesc wdproCartPlusTicketOnly) {
        Intrinsics.checkNotNullParameter(wdproMobileName, "wdproMobileName");
        Intrinsics.checkNotNullParameter(wdproMobileCaption, "wdproMobileCaption");
        Intrinsics.checkNotNullParameter(wdproMobileSubCaption, "wdproMobileSubCaption");
        Intrinsics.checkNotNullParameter(standardName, "standardName");
        Intrinsics.checkNotNullParameter(wdproName, "wdproName");
        Intrinsics.checkNotNullParameter(wdproMobileTicketBrickAgeGroupLabel, "wdproMobileTicketBrickAgeGroupLabel");
        Intrinsics.checkNotNullParameter(wdproConfigName, "wdproConfigName");
        Intrinsics.checkNotNullParameter(wdproListingName, "wdproListingName");
        Intrinsics.checkNotNullParameter(wdproUnified, "wdproUnified");
        Intrinsics.checkNotNullParameter(customerManagedRelationshipUsage, "customerManagedRelationshipUsage");
        Intrinsics.checkNotNullParameter(wdproCartPlusTicketOnly, "wdproCartPlusTicketOnly");
        this.wdproMobileName = wdproMobileName;
        this.wdproMobileCaption = wdproMobileCaption;
        this.wdproMobileSubCaption = wdproMobileSubCaption;
        this.standardName = standardName;
        this.wdproName = wdproName;
        this.wdproMobileTicketBrickAgeGroupLabel = wdproMobileTicketBrickAgeGroupLabel;
        this.wdproConfigName = wdproConfigName;
        this.wdproListingName = wdproListingName;
        this.wdproUnified = wdproUnified;
        this.customerManagedRelationshipUsage = customerManagedRelationshipUsage;
        this.wdproCartPlusTicketOnly = wdproCartPlusTicketOnly;
    }

    public static /* synthetic */ LexVASDiscountGroupSTDNames copy$default(LexVASDiscountGroupSTDNames lexVASDiscountGroupSTDNames, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc2, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc3, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc4, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc5, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc6, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc7, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc8, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc9, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc10, LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lexVASDiscountGroupSTDNamesDesc = lexVASDiscountGroupSTDNames.wdproMobileName;
        }
        if ((i10 & 2) != 0) {
            lexVASDiscountGroupSTDNamesDesc2 = lexVASDiscountGroupSTDNames.wdproMobileCaption;
        }
        if ((i10 & 4) != 0) {
            lexVASDiscountGroupSTDNamesDesc3 = lexVASDiscountGroupSTDNames.wdproMobileSubCaption;
        }
        if ((i10 & 8) != 0) {
            lexVASDiscountGroupSTDNamesDesc4 = lexVASDiscountGroupSTDNames.standardName;
        }
        if ((i10 & 16) != 0) {
            lexVASDiscountGroupSTDNamesDesc5 = lexVASDiscountGroupSTDNames.wdproName;
        }
        if ((i10 & 32) != 0) {
            lexVASDiscountGroupSTDNamesDesc6 = lexVASDiscountGroupSTDNames.wdproMobileTicketBrickAgeGroupLabel;
        }
        if ((i10 & 64) != 0) {
            lexVASDiscountGroupSTDNamesDesc7 = lexVASDiscountGroupSTDNames.wdproConfigName;
        }
        if ((i10 & 128) != 0) {
            lexVASDiscountGroupSTDNamesDesc8 = lexVASDiscountGroupSTDNames.wdproListingName;
        }
        if ((i10 & 256) != 0) {
            lexVASDiscountGroupSTDNamesDesc9 = lexVASDiscountGroupSTDNames.wdproUnified;
        }
        if ((i10 & 512) != 0) {
            lexVASDiscountGroupSTDNamesDesc10 = lexVASDiscountGroupSTDNames.customerManagedRelationshipUsage;
        }
        if ((i10 & 1024) != 0) {
            lexVASDiscountGroupSTDNamesDesc11 = lexVASDiscountGroupSTDNames.wdproCartPlusTicketOnly;
        }
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc12 = lexVASDiscountGroupSTDNamesDesc10;
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc13 = lexVASDiscountGroupSTDNamesDesc11;
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc14 = lexVASDiscountGroupSTDNamesDesc8;
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc15 = lexVASDiscountGroupSTDNamesDesc9;
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc16 = lexVASDiscountGroupSTDNamesDesc6;
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc17 = lexVASDiscountGroupSTDNamesDesc7;
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc18 = lexVASDiscountGroupSTDNamesDesc5;
        LexVASDiscountGroupSTDNamesDesc lexVASDiscountGroupSTDNamesDesc19 = lexVASDiscountGroupSTDNamesDesc3;
        return lexVASDiscountGroupSTDNames.copy(lexVASDiscountGroupSTDNamesDesc, lexVASDiscountGroupSTDNamesDesc2, lexVASDiscountGroupSTDNamesDesc19, lexVASDiscountGroupSTDNamesDesc4, lexVASDiscountGroupSTDNamesDesc18, lexVASDiscountGroupSTDNamesDesc16, lexVASDiscountGroupSTDNamesDesc17, lexVASDiscountGroupSTDNamesDesc14, lexVASDiscountGroupSTDNamesDesc15, lexVASDiscountGroupSTDNamesDesc12, lexVASDiscountGroupSTDNamesDesc13);
    }

    /* renamed from: component1, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileName() {
        return this.wdproMobileName;
    }

    /* renamed from: component10, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getCustomerManagedRelationshipUsage() {
        return this.customerManagedRelationshipUsage;
    }

    /* renamed from: component11, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproCartPlusTicketOnly() {
        return this.wdproCartPlusTicketOnly;
    }

    /* renamed from: component2, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileCaption() {
        return this.wdproMobileCaption;
    }

    /* renamed from: component3, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileSubCaption() {
        return this.wdproMobileSubCaption;
    }

    /* renamed from: component4, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getStandardName() {
        return this.standardName;
    }

    /* renamed from: component5, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproName() {
        return this.wdproName;
    }

    /* renamed from: component6, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileTicketBrickAgeGroupLabel() {
        return this.wdproMobileTicketBrickAgeGroupLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproConfigName() {
        return this.wdproConfigName;
    }

    /* renamed from: component8, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproListingName() {
        return this.wdproListingName;
    }

    /* renamed from: component9, reason: from getter */
    public final LexVASDiscountGroupSTDNamesDesc getWdproUnified() {
        return this.wdproUnified;
    }

    public final LexVASDiscountGroupSTDNames copy(LexVASDiscountGroupSTDNamesDesc wdproMobileName, LexVASDiscountGroupSTDNamesDesc wdproMobileCaption, LexVASDiscountGroupSTDNamesDesc wdproMobileSubCaption, LexVASDiscountGroupSTDNamesDesc standardName, LexVASDiscountGroupSTDNamesDesc wdproName, LexVASDiscountGroupSTDNamesDesc wdproMobileTicketBrickAgeGroupLabel, LexVASDiscountGroupSTDNamesDesc wdproConfigName, LexVASDiscountGroupSTDNamesDesc wdproListingName, LexVASDiscountGroupSTDNamesDesc wdproUnified, LexVASDiscountGroupSTDNamesDesc customerManagedRelationshipUsage, LexVASDiscountGroupSTDNamesDesc wdproCartPlusTicketOnly) {
        Intrinsics.checkNotNullParameter(wdproMobileName, "wdproMobileName");
        Intrinsics.checkNotNullParameter(wdproMobileCaption, "wdproMobileCaption");
        Intrinsics.checkNotNullParameter(wdproMobileSubCaption, "wdproMobileSubCaption");
        Intrinsics.checkNotNullParameter(standardName, "standardName");
        Intrinsics.checkNotNullParameter(wdproName, "wdproName");
        Intrinsics.checkNotNullParameter(wdproMobileTicketBrickAgeGroupLabel, "wdproMobileTicketBrickAgeGroupLabel");
        Intrinsics.checkNotNullParameter(wdproConfigName, "wdproConfigName");
        Intrinsics.checkNotNullParameter(wdproListingName, "wdproListingName");
        Intrinsics.checkNotNullParameter(wdproUnified, "wdproUnified");
        Intrinsics.checkNotNullParameter(customerManagedRelationshipUsage, "customerManagedRelationshipUsage");
        Intrinsics.checkNotNullParameter(wdproCartPlusTicketOnly, "wdproCartPlusTicketOnly");
        return new LexVASDiscountGroupSTDNames(wdproMobileName, wdproMobileCaption, wdproMobileSubCaption, standardName, wdproName, wdproMobileTicketBrickAgeGroupLabel, wdproConfigName, wdproListingName, wdproUnified, customerManagedRelationshipUsage, wdproCartPlusTicketOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexVASDiscountGroupSTDNames)) {
            return false;
        }
        LexVASDiscountGroupSTDNames lexVASDiscountGroupSTDNames = (LexVASDiscountGroupSTDNames) other;
        return Intrinsics.areEqual(this.wdproMobileName, lexVASDiscountGroupSTDNames.wdproMobileName) && Intrinsics.areEqual(this.wdproMobileCaption, lexVASDiscountGroupSTDNames.wdproMobileCaption) && Intrinsics.areEqual(this.wdproMobileSubCaption, lexVASDiscountGroupSTDNames.wdproMobileSubCaption) && Intrinsics.areEqual(this.standardName, lexVASDiscountGroupSTDNames.standardName) && Intrinsics.areEqual(this.wdproName, lexVASDiscountGroupSTDNames.wdproName) && Intrinsics.areEqual(this.wdproMobileTicketBrickAgeGroupLabel, lexVASDiscountGroupSTDNames.wdproMobileTicketBrickAgeGroupLabel) && Intrinsics.areEqual(this.wdproConfigName, lexVASDiscountGroupSTDNames.wdproConfigName) && Intrinsics.areEqual(this.wdproListingName, lexVASDiscountGroupSTDNames.wdproListingName) && Intrinsics.areEqual(this.wdproUnified, lexVASDiscountGroupSTDNames.wdproUnified) && Intrinsics.areEqual(this.customerManagedRelationshipUsage, lexVASDiscountGroupSTDNames.customerManagedRelationshipUsage) && Intrinsics.areEqual(this.wdproCartPlusTicketOnly, lexVASDiscountGroupSTDNames.wdproCartPlusTicketOnly);
    }

    public final LexVASDiscountGroupSTDNamesDesc getCustomerManagedRelationshipUsage() {
        return this.customerManagedRelationshipUsage;
    }

    public final LexVASDiscountGroupSTDNamesDesc getStandardName() {
        return this.standardName;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproCartPlusTicketOnly() {
        return this.wdproCartPlusTicketOnly;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproConfigName() {
        return this.wdproConfigName;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproListingName() {
        return this.wdproListingName;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileCaption() {
        return this.wdproMobileCaption;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileName() {
        return this.wdproMobileName;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileSubCaption() {
        return this.wdproMobileSubCaption;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproMobileTicketBrickAgeGroupLabel() {
        return this.wdproMobileTicketBrickAgeGroupLabel;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproName() {
        return this.wdproName;
    }

    public final LexVASDiscountGroupSTDNamesDesc getWdproUnified() {
        return this.wdproUnified;
    }

    public int hashCode() {
        return (((((((((((((((((((this.wdproMobileName.hashCode() * 31) + this.wdproMobileCaption.hashCode()) * 31) + this.wdproMobileSubCaption.hashCode()) * 31) + this.standardName.hashCode()) * 31) + this.wdproName.hashCode()) * 31) + this.wdproMobileTicketBrickAgeGroupLabel.hashCode()) * 31) + this.wdproConfigName.hashCode()) * 31) + this.wdproListingName.hashCode()) * 31) + this.wdproUnified.hashCode()) * 31) + this.customerManagedRelationshipUsage.hashCode()) * 31) + this.wdproCartPlusTicketOnly.hashCode();
    }

    public String toString() {
        return "LexVASDiscountGroupSTDNames(wdproMobileName=" + this.wdproMobileName + ", wdproMobileCaption=" + this.wdproMobileCaption + ", wdproMobileSubCaption=" + this.wdproMobileSubCaption + ", standardName=" + this.standardName + ", wdproName=" + this.wdproName + ", wdproMobileTicketBrickAgeGroupLabel=" + this.wdproMobileTicketBrickAgeGroupLabel + ", wdproConfigName=" + this.wdproConfigName + ", wdproListingName=" + this.wdproListingName + ", wdproUnified=" + this.wdproUnified + ", customerManagedRelationshipUsage=" + this.customerManagedRelationshipUsage + ", wdproCartPlusTicketOnly=" + this.wdproCartPlusTicketOnly + ")";
    }
}