package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusProduct;", "", "productId", "", "productCode", VirtualQueueConstants.CONTENT_ID, "price", "", "pricePerGuest", "complimentary", "", "suspended", "currency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFZZLjava/lang/String;)V", "getComplimentary", "()Z", "getContentId", "()Ljava/lang/String;", "getCurrency", "getPrice", "()F", "getPricePerGuest", "getProductCode", "getProductId", "getSuspended", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusProduct {
    private final boolean complimentary;
    private final String contentId;
    private final String currency;
    private final float price;
    private final float pricePerGuest;
    private final String productCode;
    private final String productId;
    private final boolean suspended;

    public TitusProduct(String productId, String productCode, String contentId, float f10, float f11, boolean z10, boolean z11, String currency) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.productId = productId;
        this.productCode = productCode;
        this.contentId = contentId;
        this.price = f10;
        this.pricePerGuest = f11;
        this.complimentary = z10;
        this.suspended = z11;
        this.currency = currency;
    }

    public static /* synthetic */ TitusProduct copy$default(TitusProduct titusProduct, String str, String str2, String str3, float f10, float f11, boolean z10, boolean z11, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusProduct.productId;
        }
        if ((i10 & 2) != 0) {
            str2 = titusProduct.productCode;
        }
        if ((i10 & 4) != 0) {
            str3 = titusProduct.contentId;
        }
        if ((i10 & 8) != 0) {
            f10 = titusProduct.price;
        }
        if ((i10 & 16) != 0) {
            f11 = titusProduct.pricePerGuest;
        }
        if ((i10 & 32) != 0) {
            z10 = titusProduct.complimentary;
        }
        if ((i10 & 64) != 0) {
            z11 = titusProduct.suspended;
        }
        if ((i10 & 128) != 0) {
            str4 = titusProduct.currency;
        }
        boolean z12 = z11;
        String str5 = str4;
        float f12 = f11;
        boolean z13 = z10;
        return titusProduct.copy(str, str2, str3, f10, f12, z13, z12, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component4, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final float getPricePerGuest() {
        return this.pricePerGuest;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getComplimentary() {
        return this.complimentary;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSuspended() {
        return this.suspended;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TitusProduct copy(String productId, String productCode, String contentId, float price, float pricePerGuest, boolean complimentary, boolean suspended, String currency) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TitusProduct(productId, productCode, contentId, price, pricePerGuest, complimentary, suspended, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusProduct)) {
            return false;
        }
        TitusProduct titusProduct = (TitusProduct) other;
        return Intrinsics.areEqual(this.productId, titusProduct.productId) && Intrinsics.areEqual(this.productCode, titusProduct.productCode) && Intrinsics.areEqual(this.contentId, titusProduct.contentId) && Float.compare(this.price, titusProduct.price) == 0 && Float.compare(this.pricePerGuest, titusProduct.pricePerGuest) == 0 && this.complimentary == titusProduct.complimentary && this.suspended == titusProduct.suspended && Intrinsics.areEqual(this.currency, titusProduct.currency);
    }

    public final boolean getComplimentary() {
        return this.complimentary;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final float getPrice() {
        return this.price;
    }

    public final float getPricePerGuest() {
        return this.pricePerGuest;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final boolean getSuspended() {
        return this.suspended;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((this.productId.hashCode() * 31) + this.productCode.hashCode()) * 31) + this.contentId.hashCode()) * 31) + Float.hashCode(this.price)) * 31) + Float.hashCode(this.pricePerGuest)) * 31;
        boolean z10 = this.complimentary;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.suspended;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "TitusProduct(productId=" + this.productId + ", productCode=" + this.productCode + ", contentId=" + this.contentId + ", price=" + this.price + ", pricePerGuest=" + this.pricePerGuest + ", complimentary=" + this.complimentary + ", suspended=" + this.suspended + ", currency=" + this.currency + ")";
    }
}