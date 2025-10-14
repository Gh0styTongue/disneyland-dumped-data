package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006&"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusItem;", "", "orderItemId", "", "product", "Lcom/disney/wdpro/photopass/services/model/titus/TitusItemProduct;", "productDate", OrionDeepLinkConstants.PAM_PURCHASE_PRICING, "Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;", "guests", "", "Lcom/disney/wdpro/photopass/services/model/titus/TitusGuest;", "entitlements", "Lcom/disney/wdpro/photopass/services/model/titus/TitusEntitlement;", "(Ljava/lang/String;Lcom/disney/wdpro/photopass/services/model/titus/TitusItemProduct;Ljava/lang/String;Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;Ljava/util/List;Ljava/util/List;)V", "getEntitlements", "()Ljava/util/List;", "getGuests", "getOrderItemId", "()Ljava/lang/String;", "getPricing", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;", "getProduct", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusItemProduct;", "getProductDate", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusItem {
    private final List<TitusEntitlement> entitlements;
    private final List<TitusGuest> guests;
    private final String orderItemId;
    private final TitusPricing pricing;
    private final TitusItemProduct product;
    private final String productDate;

    public TitusItem(String orderItemId, TitusItemProduct product, String productDate, TitusPricing pricing, List<TitusGuest> guests, List<TitusEntitlement> list) {
        Intrinsics.checkNotNullParameter(orderItemId, "orderItemId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(productDate, "productDate");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(guests, "guests");
        this.orderItemId = orderItemId;
        this.product = product;
        this.productDate = productDate;
        this.pricing = pricing;
        this.guests = guests;
        this.entitlements = list;
    }

    public static /* synthetic */ TitusItem copy$default(TitusItem titusItem, String str, TitusItemProduct titusItemProduct, String str2, TitusPricing titusPricing, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusItem.orderItemId;
        }
        if ((i10 & 2) != 0) {
            titusItemProduct = titusItem.product;
        }
        if ((i10 & 4) != 0) {
            str2 = titusItem.productDate;
        }
        if ((i10 & 8) != 0) {
            titusPricing = titusItem.pricing;
        }
        if ((i10 & 16) != 0) {
            list = titusItem.guests;
        }
        if ((i10 & 32) != 0) {
            list2 = titusItem.entitlements;
        }
        List list3 = list;
        List list4 = list2;
        return titusItem.copy(str, titusItemProduct, str2, titusPricing, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderItemId() {
        return this.orderItemId;
    }

    /* renamed from: component2, reason: from getter */
    public final TitusItemProduct getProduct() {
        return this.product;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProductDate() {
        return this.productDate;
    }

    /* renamed from: component4, reason: from getter */
    public final TitusPricing getPricing() {
        return this.pricing;
    }

    public final List<TitusGuest> component5() {
        return this.guests;
    }

    public final List<TitusEntitlement> component6() {
        return this.entitlements;
    }

    public final TitusItem copy(String orderItemId, TitusItemProduct product, String productDate, TitusPricing pricing, List<TitusGuest> guests, List<TitusEntitlement> entitlements) {
        Intrinsics.checkNotNullParameter(orderItemId, "orderItemId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(productDate, "productDate");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(guests, "guests");
        return new TitusItem(orderItemId, product, productDate, pricing, guests, entitlements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusItem)) {
            return false;
        }
        TitusItem titusItem = (TitusItem) other;
        return Intrinsics.areEqual(this.orderItemId, titusItem.orderItemId) && Intrinsics.areEqual(this.product, titusItem.product) && Intrinsics.areEqual(this.productDate, titusItem.productDate) && Intrinsics.areEqual(this.pricing, titusItem.pricing) && Intrinsics.areEqual(this.guests, titusItem.guests) && Intrinsics.areEqual(this.entitlements, titusItem.entitlements);
    }

    public final List<TitusEntitlement> getEntitlements() {
        return this.entitlements;
    }

    public final List<TitusGuest> getGuests() {
        return this.guests;
    }

    public final String getOrderItemId() {
        return this.orderItemId;
    }

    public final TitusPricing getPricing() {
        return this.pricing;
    }

    public final TitusItemProduct getProduct() {
        return this.product;
    }

    public final String getProductDate() {
        return this.productDate;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.orderItemId.hashCode() * 31) + this.product.hashCode()) * 31) + this.productDate.hashCode()) * 31) + this.pricing.hashCode()) * 31) + this.guests.hashCode()) * 31;
        List<TitusEntitlement> list = this.entitlements;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TitusItem(orderItemId=" + this.orderItemId + ", product=" + this.product + ", productDate=" + this.productDate + ", pricing=" + this.pricing + ", guests=" + this.guests + ", entitlements=" + this.entitlements + ")";
    }
}