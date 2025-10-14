package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.commons.deeplink.DeepLinkMagicAccess;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.opp.dine.data.services.util.ServicesConstants;
import com.disney.wdpro.park.util.AbstractC18394i;
import com.disney.wdpro.sag.deeplink.ScanAndGoDeepLinks;
import com.disney.wdpro.secommerce.api.lexvas.SpecialEventsApiClientImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m92037d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\bD\b\u0086\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0002\u0010!J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0013HÆ\u0003J\t\u0010G\u001a\u00020\u0013HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\t\u0010I\u001a\u00020\u0017HÆ\u0003J\t\u0010J\u001a\u00020\u0017HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u009b\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u0003HÆ\u0001J\u0013\u0010[\u001a\u00020\u00172\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u0010HÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\u0019\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b@\u00105¨\u0006_"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTD;", "", "productInstanceId", "", "productId", "names", "Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNames;", "destinationId", "storeId", "discountGroupId", ServicesConstants.PRODUCT_TYPE, "sourceSystem", ScanAndGoDeepLinks.DEEP_LINK_SKU_PARAM_KEY, ServicesConstants.CATEGORY_ID, "ageGroup", "numDays", "", "currency", "subtotal", "", "tax", "total", SpecialEventsApiClientImpl.PARAM_RENEWAL, "", AbstractC18394i.UPGRADE, "subTotalPricePerDay", ServicesConstants.PRODUCT_ADD_ONS, "", DeepLinkMagicAccess.ENTITLEMENT_IDS_KEY, "policyIds", "deliveryOptions", "sellableStartDateTime", "sellableEndDateTime", "(Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNames;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DDDZZDLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAddOns", "()Ljava/util/List;", "getAgeGroup", "()Ljava/lang/String;", "getCategoryId", "getCurrency", "getDeliveryOptions", "getDestinationId", "getDiscountGroupId", "getEntitlementIds", "getNames", "()Lcom/disney/wdpro/photopass/services/model/LexVASDiscountGroupSTDNames;", "getNumDays", "()I", "getPolicyIds", "getProductId", "getProductInstanceId", "getProductType", "getRenewal", "()Z", "getSellableEndDateTime", "getSellableStartDateTime", "getSku", "getSourceSystem", "getStoreId", "getSubTotalPricePerDay", "()D", "getSubtotal", "getTax", "getTotal", "getUpgrade", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASDiscountGroupSTD {
    private final List<String> addOns;
    private final String ageGroup;
    private final String categoryId;
    private final String currency;
    private final List<String> deliveryOptions;
    private final String destinationId;
    private final String discountGroupId;
    private final List<String> entitlementIds;
    private final LexVASDiscountGroupSTDNames names;
    private final int numDays;
    private final List<String> policyIds;
    private final String productId;
    private final String productInstanceId;
    private final String productType;
    private final boolean renewal;
    private final String sellableEndDateTime;
    private final String sellableStartDateTime;
    private final String sku;
    private final String sourceSystem;
    private final String storeId;
    private final double subTotalPricePerDay;
    private final double subtotal;
    private final double tax;
    private final double total;
    private final boolean upgrade;

    public LexVASDiscountGroupSTD(String productInstanceId, String productId, LexVASDiscountGroupSTDNames names, String destinationId, String storeId, String discountGroupId, String productType, String sourceSystem, String sku, String categoryId, String ageGroup, int i10, String currency, double d10, double d11, double d12, boolean z10, boolean z11, double d13, List<String> addOns, List<String> entitlementIds, List<String> policyIds, List<String> deliveryOptions, String sellableStartDateTime, String sellableEndDateTime) {
        Intrinsics.checkNotNullParameter(productInstanceId, "productInstanceId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(discountGroupId, "discountGroupId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(sourceSystem, "sourceSystem");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(ageGroup, "ageGroup");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(addOns, "addOns");
        Intrinsics.checkNotNullParameter(entitlementIds, "entitlementIds");
        Intrinsics.checkNotNullParameter(policyIds, "policyIds");
        Intrinsics.checkNotNullParameter(deliveryOptions, "deliveryOptions");
        Intrinsics.checkNotNullParameter(sellableStartDateTime, "sellableStartDateTime");
        Intrinsics.checkNotNullParameter(sellableEndDateTime, "sellableEndDateTime");
        this.productInstanceId = productInstanceId;
        this.productId = productId;
        this.names = names;
        this.destinationId = destinationId;
        this.storeId = storeId;
        this.discountGroupId = discountGroupId;
        this.productType = productType;
        this.sourceSystem = sourceSystem;
        this.sku = sku;
        this.categoryId = categoryId;
        this.ageGroup = ageGroup;
        this.numDays = i10;
        this.currency = currency;
        this.subtotal = d10;
        this.tax = d11;
        this.total = d12;
        this.renewal = z10;
        this.upgrade = z11;
        this.subTotalPricePerDay = d13;
        this.addOns = addOns;
        this.entitlementIds = entitlementIds;
        this.policyIds = policyIds;
        this.deliveryOptions = deliveryOptions;
        this.sellableStartDateTime = sellableStartDateTime;
        this.sellableEndDateTime = sellableEndDateTime;
    }

    public static /* synthetic */ LexVASDiscountGroupSTD copy$default(LexVASDiscountGroupSTD lexVASDiscountGroupSTD, String str, String str2, LexVASDiscountGroupSTDNames lexVASDiscountGroupSTDNames, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, String str11, double d10, double d11, double d12, boolean z10, boolean z11, double d13, List list, List list2, List list3, List list4, String str12, String str13, int i11, Object obj) {
        String str14;
        String str15;
        String str16 = (i11 & 1) != 0 ? lexVASDiscountGroupSTD.productInstanceId : str;
        String str17 = (i11 & 2) != 0 ? lexVASDiscountGroupSTD.productId : str2;
        LexVASDiscountGroupSTDNames lexVASDiscountGroupSTDNames2 = (i11 & 4) != 0 ? lexVASDiscountGroupSTD.names : lexVASDiscountGroupSTDNames;
        String str18 = (i11 & 8) != 0 ? lexVASDiscountGroupSTD.destinationId : str3;
        String str19 = (i11 & 16) != 0 ? lexVASDiscountGroupSTD.storeId : str4;
        String str20 = (i11 & 32) != 0 ? lexVASDiscountGroupSTD.discountGroupId : str5;
        String str21 = (i11 & 64) != 0 ? lexVASDiscountGroupSTD.productType : str6;
        String str22 = (i11 & 128) != 0 ? lexVASDiscountGroupSTD.sourceSystem : str7;
        String str23 = (i11 & 256) != 0 ? lexVASDiscountGroupSTD.sku : str8;
        String str24 = (i11 & 512) != 0 ? lexVASDiscountGroupSTD.categoryId : str9;
        String str25 = (i11 & 1024) != 0 ? lexVASDiscountGroupSTD.ageGroup : str10;
        int i12 = (i11 & 2048) != 0 ? lexVASDiscountGroupSTD.numDays : i10;
        String str26 = (i11 & 4096) != 0 ? lexVASDiscountGroupSTD.currency : str11;
        String str27 = str16;
        String str28 = str17;
        double d14 = (i11 & 8192) != 0 ? lexVASDiscountGroupSTD.subtotal : d10;
        double d15 = (i11 & 16384) != 0 ? lexVASDiscountGroupSTD.tax : d11;
        double d16 = (i11 & 32768) != 0 ? lexVASDiscountGroupSTD.total : d12;
        boolean z12 = (i11 & 65536) != 0 ? lexVASDiscountGroupSTD.renewal : z10;
        boolean z13 = (i11 & PKIFailureInfo.unsupportedVersion) != 0 ? lexVASDiscountGroupSTD.upgrade : z11;
        double d17 = d16;
        double d18 = (i11 & PKIFailureInfo.transactionIdInUse) != 0 ? lexVASDiscountGroupSTD.subTotalPricePerDay : d13;
        List list5 = (i11 & 524288) != 0 ? lexVASDiscountGroupSTD.addOns : list;
        List list6 = (i11 & 1048576) != 0 ? lexVASDiscountGroupSTD.entitlementIds : list2;
        List list7 = list5;
        List list8 = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? lexVASDiscountGroupSTD.policyIds : list3;
        List list9 = (i11 & 4194304) != 0 ? lexVASDiscountGroupSTD.deliveryOptions : list4;
        String str29 = (i11 & 8388608) != 0 ? lexVASDiscountGroupSTD.sellableStartDateTime : str12;
        if ((i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            str15 = str29;
            str14 = lexVASDiscountGroupSTD.sellableEndDateTime;
        } else {
            str14 = str13;
            str15 = str29;
        }
        return lexVASDiscountGroupSTD.copy(str27, str28, lexVASDiscountGroupSTDNames2, str18, str19, str20, str21, str22, str23, str24, str25, i12, str26, d14, d15, d17, z12, z13, d18, list7, list6, list8, list9, str15, str14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductInstanceId() {
        return this.productInstanceId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAgeGroup() {
        return this.ageGroup;
    }

    /* renamed from: component12, reason: from getter */
    public final int getNumDays() {
        return this.numDays;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component14, reason: from getter */
    public final double getSubtotal() {
        return this.subtotal;
    }

    /* renamed from: component15, reason: from getter */
    public final double getTax() {
        return this.tax;
    }

    /* renamed from: component16, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getRenewal() {
        return this.renewal;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getUpgrade() {
        return this.upgrade;
    }

    /* renamed from: component19, reason: from getter */
    public final double getSubTotalPricePerDay() {
        return this.subTotalPricePerDay;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final List<String> component20() {
        return this.addOns;
    }

    public final List<String> component21() {
        return this.entitlementIds;
    }

    public final List<String> component22() {
        return this.policyIds;
    }

    public final List<String> component23() {
        return this.deliveryOptions;
    }

    /* renamed from: component24, reason: from getter */
    public final String getSellableStartDateTime() {
        return this.sellableStartDateTime;
    }

    /* renamed from: component25, reason: from getter */
    public final String getSellableEndDateTime() {
        return this.sellableEndDateTime;
    }

    /* renamed from: component3, reason: from getter */
    public final LexVASDiscountGroupSTDNames getNames() {
        return this.names;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDiscountGroupId() {
        return this.discountGroupId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSourceSystem() {
        return this.sourceSystem;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    public final LexVASDiscountGroupSTD copy(String productInstanceId, String productId, LexVASDiscountGroupSTDNames names, String destinationId, String storeId, String discountGroupId, String productType, String sourceSystem, String sku, String categoryId, String ageGroup, int numDays, String currency, double subtotal, double tax, double total, boolean renewal, boolean upgrade, double subTotalPricePerDay, List<String> addOns, List<String> entitlementIds, List<String> policyIds, List<String> deliveryOptions, String sellableStartDateTime, String sellableEndDateTime) {
        Intrinsics.checkNotNullParameter(productInstanceId, "productInstanceId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(discountGroupId, "discountGroupId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(sourceSystem, "sourceSystem");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(ageGroup, "ageGroup");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(addOns, "addOns");
        Intrinsics.checkNotNullParameter(entitlementIds, "entitlementIds");
        Intrinsics.checkNotNullParameter(policyIds, "policyIds");
        Intrinsics.checkNotNullParameter(deliveryOptions, "deliveryOptions");
        Intrinsics.checkNotNullParameter(sellableStartDateTime, "sellableStartDateTime");
        Intrinsics.checkNotNullParameter(sellableEndDateTime, "sellableEndDateTime");
        return new LexVASDiscountGroupSTD(productInstanceId, productId, names, destinationId, storeId, discountGroupId, productType, sourceSystem, sku, categoryId, ageGroup, numDays, currency, subtotal, tax, total, renewal, upgrade, subTotalPricePerDay, addOns, entitlementIds, policyIds, deliveryOptions, sellableStartDateTime, sellableEndDateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexVASDiscountGroupSTD)) {
            return false;
        }
        LexVASDiscountGroupSTD lexVASDiscountGroupSTD = (LexVASDiscountGroupSTD) other;
        return Intrinsics.areEqual(this.productInstanceId, lexVASDiscountGroupSTD.productInstanceId) && Intrinsics.areEqual(this.productId, lexVASDiscountGroupSTD.productId) && Intrinsics.areEqual(this.names, lexVASDiscountGroupSTD.names) && Intrinsics.areEqual(this.destinationId, lexVASDiscountGroupSTD.destinationId) && Intrinsics.areEqual(this.storeId, lexVASDiscountGroupSTD.storeId) && Intrinsics.areEqual(this.discountGroupId, lexVASDiscountGroupSTD.discountGroupId) && Intrinsics.areEqual(this.productType, lexVASDiscountGroupSTD.productType) && Intrinsics.areEqual(this.sourceSystem, lexVASDiscountGroupSTD.sourceSystem) && Intrinsics.areEqual(this.sku, lexVASDiscountGroupSTD.sku) && Intrinsics.areEqual(this.categoryId, lexVASDiscountGroupSTD.categoryId) && Intrinsics.areEqual(this.ageGroup, lexVASDiscountGroupSTD.ageGroup) && this.numDays == lexVASDiscountGroupSTD.numDays && Intrinsics.areEqual(this.currency, lexVASDiscountGroupSTD.currency) && Double.compare(this.subtotal, lexVASDiscountGroupSTD.subtotal) == 0 && Double.compare(this.tax, lexVASDiscountGroupSTD.tax) == 0 && Double.compare(this.total, lexVASDiscountGroupSTD.total) == 0 && this.renewal == lexVASDiscountGroupSTD.renewal && this.upgrade == lexVASDiscountGroupSTD.upgrade && Double.compare(this.subTotalPricePerDay, lexVASDiscountGroupSTD.subTotalPricePerDay) == 0 && Intrinsics.areEqual(this.addOns, lexVASDiscountGroupSTD.addOns) && Intrinsics.areEqual(this.entitlementIds, lexVASDiscountGroupSTD.entitlementIds) && Intrinsics.areEqual(this.policyIds, lexVASDiscountGroupSTD.policyIds) && Intrinsics.areEqual(this.deliveryOptions, lexVASDiscountGroupSTD.deliveryOptions) && Intrinsics.areEqual(this.sellableStartDateTime, lexVASDiscountGroupSTD.sellableStartDateTime) && Intrinsics.areEqual(this.sellableEndDateTime, lexVASDiscountGroupSTD.sellableEndDateTime);
    }

    public final List<String> getAddOns() {
        return this.addOns;
    }

    public final String getAgeGroup() {
        return this.ageGroup;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<String> getDeliveryOptions() {
        return this.deliveryOptions;
    }

    public final String getDestinationId() {
        return this.destinationId;
    }

    public final String getDiscountGroupId() {
        return this.discountGroupId;
    }

    public final List<String> getEntitlementIds() {
        return this.entitlementIds;
    }

    public final LexVASDiscountGroupSTDNames getNames() {
        return this.names;
    }

    public final int getNumDays() {
        return this.numDays;
    }

    public final List<String> getPolicyIds() {
        return this.policyIds;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductInstanceId() {
        return this.productInstanceId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final boolean getRenewal() {
        return this.renewal;
    }

    public final String getSellableEndDateTime() {
        return this.sellableEndDateTime;
    }

    public final String getSellableStartDateTime() {
        return this.sellableStartDateTime;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getSourceSystem() {
        return this.sourceSystem;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public final double getSubTotalPricePerDay() {
        return this.subTotalPricePerDay;
    }

    public final double getSubtotal() {
        return this.subtotal;
    }

    public final double getTax() {
        return this.tax;
    }

    public final double getTotal() {
        return this.total;
    }

    public final boolean getUpgrade() {
        return this.upgrade;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.productInstanceId.hashCode() * 31) + this.productId.hashCode()) * 31) + this.names.hashCode()) * 31) + this.destinationId.hashCode()) * 31) + this.storeId.hashCode()) * 31) + this.discountGroupId.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.sourceSystem.hashCode()) * 31) + this.sku.hashCode()) * 31) + this.categoryId.hashCode()) * 31) + this.ageGroup.hashCode()) * 31) + Integer.hashCode(this.numDays)) * 31) + this.currency.hashCode()) * 31) + Double.hashCode(this.subtotal)) * 31) + Double.hashCode(this.tax)) * 31) + Double.hashCode(this.total)) * 31;
        boolean z10 = this.renewal;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.upgrade;
        return ((((((((((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Double.hashCode(this.subTotalPricePerDay)) * 31) + this.addOns.hashCode()) * 31) + this.entitlementIds.hashCode()) * 31) + this.policyIds.hashCode()) * 31) + this.deliveryOptions.hashCode()) * 31) + this.sellableStartDateTime.hashCode()) * 31) + this.sellableEndDateTime.hashCode();
    }

    public String toString() {
        return "LexVASDiscountGroupSTD(productInstanceId=" + this.productInstanceId + ", productId=" + this.productId + ", names=" + this.names + ", destinationId=" + this.destinationId + ", storeId=" + this.storeId + ", discountGroupId=" + this.discountGroupId + ", productType=" + this.productType + ", sourceSystem=" + this.sourceSystem + ", sku=" + this.sku + ", categoryId=" + this.categoryId + ", ageGroup=" + this.ageGroup + ", numDays=" + this.numDays + ", currency=" + this.currency + ", subtotal=" + this.subtotal + ", tax=" + this.tax + ", total=" + this.total + ", renewal=" + this.renewal + ", upgrade=" + this.upgrade + ", subTotalPricePerDay=" + this.subTotalPricePerDay + ", addOns=" + this.addOns + ", entitlementIds=" + this.entitlementIds + ", policyIds=" + this.policyIds + ", deliveryOptions=" + this.deliveryOptions + ", sellableStartDateTime=" + this.sellableStartDateTime + ", sellableEndDateTime=" + this.sellableEndDateTime + ")";
    }
}