package com.disney.wdpro.ticket_sales_managers.models;

import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import java.util.List;

/* loaded from: classes19.dex */
public class MaxPassProduct {
    private final String categoryId;
    private final String discountGroupId;
    private final List<Policy> policyList;
    private final String productId;
    private final String productInstanceId;
    private final String productSKU;

    public MaxPassProduct(String str, String str2, String str3, String str4, String str5, List<Policy> list) {
        this.productInstanceId = str;
        this.productSKU = str2;
        this.productId = str3;
        this.discountGroupId = str4;
        this.categoryId = str5;
        this.policyList = list;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getDiscountGroupId() {
        return this.discountGroupId;
    }

    public List<Policy> getPolicyList() {
        return this.policyList;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public String getProductSKU() {
        return this.productSKU;
    }
}