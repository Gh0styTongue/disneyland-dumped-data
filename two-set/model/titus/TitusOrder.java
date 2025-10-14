package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.opp.dine.data.services.util.ServicesConstants;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0012HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019¨\u00065"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusOrder;", "", "orderId", "", "orderCreationTime", "lastUpdatedTime", "status", "salesChannel", "bookingSource", "Lcom/disney/wdpro/photopass/services/model/titus/TitusTypeValue;", "items", "", "Lcom/disney/wdpro/photopass/services/model/titus/TitusItem;", ServicesConstants.PRODUCT_TYPE, "productSubtype", "payments", "Lcom/disney/wdpro/photopass/services/model/titus/TitusPayment;", OrionDeepLinkConstants.PAM_PURCHASE_PRICING, "Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/photopass/services/model/titus/TitusTypeValue;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;)V", "getBookingSource", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusTypeValue;", "getItems", "()Ljava/util/List;", "getLastUpdatedTime", "()Ljava/lang/String;", "getOrderCreationTime", "getOrderId", "getPayments", "getPricing", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;", "getProductSubtype", "getProductType", "getSalesChannel", "getStatus", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusOrder {
    private final TitusTypeValue bookingSource;
    private final List<TitusItem> items;
    private final String lastUpdatedTime;
    private final String orderCreationTime;
    private final String orderId;
    private final List<TitusPayment> payments;
    private final TitusPricing pricing;
    private final String productSubtype;
    private final String productType;
    private final String salesChannel;
    private final String status;

    public TitusOrder(String orderId, String orderCreationTime, String lastUpdatedTime, String status, String salesChannel, TitusTypeValue bookingSource, List<TitusItem> items, String str, String str2, List<TitusPayment> list, TitusPricing pricing) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderCreationTime, "orderCreationTime");
        Intrinsics.checkNotNullParameter(lastUpdatedTime, "lastUpdatedTime");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(salesChannel, "salesChannel");
        Intrinsics.checkNotNullParameter(bookingSource, "bookingSource");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.orderId = orderId;
        this.orderCreationTime = orderCreationTime;
        this.lastUpdatedTime = lastUpdatedTime;
        this.status = status;
        this.salesChannel = salesChannel;
        this.bookingSource = bookingSource;
        this.items = items;
        this.productType = str;
        this.productSubtype = str2;
        this.payments = list;
        this.pricing = pricing;
    }

    public static /* synthetic */ TitusOrder copy$default(TitusOrder titusOrder, String str, String str2, String str3, String str4, String str5, TitusTypeValue titusTypeValue, List list, String str6, String str7, List list2, TitusPricing titusPricing, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusOrder.orderId;
        }
        if ((i10 & 2) != 0) {
            str2 = titusOrder.orderCreationTime;
        }
        if ((i10 & 4) != 0) {
            str3 = titusOrder.lastUpdatedTime;
        }
        if ((i10 & 8) != 0) {
            str4 = titusOrder.status;
        }
        if ((i10 & 16) != 0) {
            str5 = titusOrder.salesChannel;
        }
        if ((i10 & 32) != 0) {
            titusTypeValue = titusOrder.bookingSource;
        }
        if ((i10 & 64) != 0) {
            list = titusOrder.items;
        }
        if ((i10 & 128) != 0) {
            str6 = titusOrder.productType;
        }
        if ((i10 & 256) != 0) {
            str7 = titusOrder.productSubtype;
        }
        if ((i10 & 512) != 0) {
            list2 = titusOrder.payments;
        }
        if ((i10 & 1024) != 0) {
            titusPricing = titusOrder.pricing;
        }
        List list3 = list2;
        TitusPricing titusPricing2 = titusPricing;
        String str8 = str6;
        String str9 = str7;
        TitusTypeValue titusTypeValue2 = titusTypeValue;
        List list4 = list;
        String str10 = str5;
        String str11 = str3;
        return titusOrder.copy(str, str2, str11, str4, str10, titusTypeValue2, list4, str8, str9, list3, titusPricing2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final List<TitusPayment> component10() {
        return this.payments;
    }

    /* renamed from: component11, reason: from getter */
    public final TitusPricing getPricing() {
        return this.pricing;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderCreationTime() {
        return this.orderCreationTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSalesChannel() {
        return this.salesChannel;
    }

    /* renamed from: component6, reason: from getter */
    public final TitusTypeValue getBookingSource() {
        return this.bookingSource;
    }

    public final List<TitusItem> component7() {
        return this.items;
    }

    /* renamed from: component8, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getProductSubtype() {
        return this.productSubtype;
    }

    public final TitusOrder copy(String orderId, String orderCreationTime, String lastUpdatedTime, String status, String salesChannel, TitusTypeValue bookingSource, List<TitusItem> items, String productType, String productSubtype, List<TitusPayment> payments, TitusPricing pricing) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderCreationTime, "orderCreationTime");
        Intrinsics.checkNotNullParameter(lastUpdatedTime, "lastUpdatedTime");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(salesChannel, "salesChannel");
        Intrinsics.checkNotNullParameter(bookingSource, "bookingSource");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        return new TitusOrder(orderId, orderCreationTime, lastUpdatedTime, status, salesChannel, bookingSource, items, productType, productSubtype, payments, pricing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusOrder)) {
            return false;
        }
        TitusOrder titusOrder = (TitusOrder) other;
        return Intrinsics.areEqual(this.orderId, titusOrder.orderId) && Intrinsics.areEqual(this.orderCreationTime, titusOrder.orderCreationTime) && Intrinsics.areEqual(this.lastUpdatedTime, titusOrder.lastUpdatedTime) && Intrinsics.areEqual(this.status, titusOrder.status) && Intrinsics.areEqual(this.salesChannel, titusOrder.salesChannel) && Intrinsics.areEqual(this.bookingSource, titusOrder.bookingSource) && Intrinsics.areEqual(this.items, titusOrder.items) && Intrinsics.areEqual(this.productType, titusOrder.productType) && Intrinsics.areEqual(this.productSubtype, titusOrder.productSubtype) && Intrinsics.areEqual(this.payments, titusOrder.payments) && Intrinsics.areEqual(this.pricing, titusOrder.pricing);
    }

    public final TitusTypeValue getBookingSource() {
        return this.bookingSource;
    }

    public final List<TitusItem> getItems() {
        return this.items;
    }

    public final String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public final String getOrderCreationTime() {
        return this.orderCreationTime;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final List<TitusPayment> getPayments() {
        return this.payments;
    }

    public final TitusPricing getPricing() {
        return this.pricing;
    }

    public final String getProductSubtype() {
        return this.productSubtype;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getSalesChannel() {
        return this.salesChannel;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.orderId.hashCode() * 31) + this.orderCreationTime.hashCode()) * 31) + this.lastUpdatedTime.hashCode()) * 31) + this.status.hashCode()) * 31) + this.salesChannel.hashCode()) * 31) + this.bookingSource.hashCode()) * 31) + this.items.hashCode()) * 31;
        String str = this.productType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productSubtype;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TitusPayment> list = this.payments;
        return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.pricing.hashCode();
    }

    public String toString() {
        return "TitusOrder(orderId=" + this.orderId + ", orderCreationTime=" + this.orderCreationTime + ", lastUpdatedTime=" + this.lastUpdatedTime + ", status=" + this.status + ", salesChannel=" + this.salesChannel + ", bookingSource=" + this.bookingSource + ", items=" + this.items + ", productType=" + this.productType + ", productSubtype=" + this.productSubtype + ", payments=" + this.payments + ", pricing=" + this.pricing + ")";
    }
}