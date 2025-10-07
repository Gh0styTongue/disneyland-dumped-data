package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22459j;
import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes18.dex */
public class ProductCategoryDetails implements Serializable {
    private static final long serialVersionUID = 1;
    private final ProductCategoryType productCategoryType;
    private final Set<String> productIdsForCategoryType;

    public ProductCategoryDetails(ProductCategoryType productCategoryType, Set<String> set) {
        this.productCategoryType = productCategoryType;
        this.productIdsForCategoryType = set;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ProductCategoryDetails) {
            ProductCategoryDetails productCategoryDetails = (ProductCategoryDetails) obj;
            if (C22459j.m68660a(this.productCategoryType, productCategoryDetails.productCategoryType) && C22459j.m68660a(this.productIdsForCategoryType, productCategoryDetails.productIdsForCategoryType)) {
                return true;
            }
        }
        return false;
    }

    public ProductCategoryType getProductCategoryType() {
        return this.productCategoryType;
    }

    public Set<String> getProductIds() {
        return Collections.unmodifiableSet(this.productIdsForCategoryType);
    }

    public int hashCode() {
        return C22459j.m68661b(this.productCategoryType) + C22459j.m68661b(this.productIdsForCategoryType);
    }

    public String toString() {
        return String.format("Product details %s[%s]", this.productCategoryType, this.productIdsForCategoryType);
    }
}