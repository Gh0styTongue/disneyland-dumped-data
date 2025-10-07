package com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model;

import com.disney.wdpro.ticket_sales_base_lib.business.product.AddOnOption;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes18.dex */
public class ProductInstanceKey implements Serializable {
    private static final long serialVersionUID = 1;
    private final Set<AddOnOption> addOnOptions;
    private final AgeGroup ageGroup;
    private final String discountGroupType;
    private final int numberOfDays;
    private final String ticketProductType;
    private final String tier;

    public ProductInstanceKey(String str, String str2, AgeGroup ageGroup, int i10, Set<AddOnOption> set, String str3) {
        C22462m.m68684p(set);
        this.ticketProductType = str;
        this.discountGroupType = str2;
        this.ageGroup = ageGroup;
        this.numberOfDays = i10;
        this.addOnOptions = set;
        this.tier = str3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ProductInstanceKey) {
            ProductInstanceKey productInstanceKey = (ProductInstanceKey) obj;
            if (C22459j.m68660a(this.discountGroupType, productInstanceKey.discountGroupType) && C22459j.m68660a(this.ageGroup, productInstanceKey.ageGroup) && C22459j.m68660a(Integer.valueOf(this.numberOfDays), Integer.valueOf(productInstanceKey.numberOfDays)) && C22459j.m68660a(this.ticketProductType, productInstanceKey.ticketProductType) && C22459j.m68660a(this.addOnOptions, productInstanceKey.addOnOptions) && C22459j.m68660a(this.tier, productInstanceKey.tier)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C22459j.m68661b(this.discountGroupType, this.ageGroup, Integer.valueOf(this.numberOfDays), this.ticketProductType, this.tier);
    }

    public String toString() {
        return String.format("[DG[%s],AG[%s],%dD,P[%s],AO[%s],T[%s]", this.discountGroupType, this.ageGroup, Integer.valueOf(this.numberOfDays), this.ticketProductType, this.addOnOptions, this.tier);
    }
}