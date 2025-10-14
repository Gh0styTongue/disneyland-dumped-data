package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.opp.dine.data.services.util.ServicesConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusItemProduct;", "", "productId", "", "productContentId", ServicesConstants.PRODUCT_TYPE, "productSubtype", "unitPrice", "Lcom/disney/wdpro/photopass/services/model/titus/TitusUnitPrice;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/photopass/services/model/titus/TitusUnitPrice;)V", "getProductContentId", "()Ljava/lang/String;", "getProductId", "getProductSubtype", "getProductType", "getUnitPrice", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusUnitPrice;", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusItemProduct {
    private final String productContentId;
    private final String productId;
    private final String productSubtype;
    private final String productType;
    private final TitusUnitPrice unitPrice;

    public TitusItemProduct(String productId, String productContentId, String str, String str2, TitusUnitPrice unitPrice) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productContentId, "productContentId");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        this.productId = productId;
        this.productContentId = productContentId;
        this.productType = str;
        this.productSubtype = str2;
        this.unitPrice = unitPrice;
    }

    public static /* synthetic */ TitusItemProduct copy$default(TitusItemProduct titusItemProduct, String str, String str2, String str3, String str4, TitusUnitPrice titusUnitPrice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusItemProduct.productId;
        }
        if ((i10 & 2) != 0) {
            str2 = titusItemProduct.productContentId;
        }
        if ((i10 & 4) != 0) {
            str3 = titusItemProduct.productType;
        }
        if ((i10 & 8) != 0) {
            str4 = titusItemProduct.productSubtype;
        }
        if ((i10 & 16) != 0) {
            titusUnitPrice = titusItemProduct.unitPrice;
        }
        TitusUnitPrice titusUnitPrice2 = titusUnitPrice;
        String str5 = str3;
        return titusItemProduct.copy(str, str2, str5, str4, titusUnitPrice2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductContentId() {
        return this.productContentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProductSubtype() {
        return this.productSubtype;
    }

    /* renamed from: component5, reason: from getter */
    public final TitusUnitPrice getUnitPrice() {
        return this.unitPrice;
    }

    public final TitusItemProduct copy(String productId, String productContentId, String productType, String productSubtype, TitusUnitPrice unitPrice) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productContentId, "productContentId");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        return new TitusItemProduct(productId, productContentId, productType, productSubtype, unitPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusItemProduct)) {
            return false;
        }
        TitusItemProduct titusItemProduct = (TitusItemProduct) other;
        return Intrinsics.areEqual(this.productId, titusItemProduct.productId) && Intrinsics.areEqual(this.productContentId, titusItemProduct.productContentId) && Intrinsics.areEqual(this.productType, titusItemProduct.productType) && Intrinsics.areEqual(this.productSubtype, titusItemProduct.productSubtype) && Intrinsics.areEqual(this.unitPrice, titusItemProduct.unitPrice);
    }

    public final String getProductContentId() {
        return this.productContentId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductSubtype() {
        return this.productSubtype;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final TitusUnitPrice getUnitPrice() {
        return this.unitPrice;
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.productContentId.hashCode()) * 31;
        String str = this.productType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productSubtype;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.unitPrice.hashCode();
    }

    public String toString() {
        return "TitusItemProduct(productId=" + this.productId + ", productContentId=" + this.productContentId + ", productType=" + this.productType + ", productSubtype=" + this.productSubtype + ", unitPrice=" + this.unitPrice + ")";
    }
}