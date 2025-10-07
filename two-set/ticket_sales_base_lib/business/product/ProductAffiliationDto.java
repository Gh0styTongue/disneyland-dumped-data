package com.disney.wdpro.ticket_sales_base_lib.business.product;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class ProductAffiliationDto {
    private String name;
    private List<String> offers;

    public String getName() {
        return this.name;
    }

    public List<String> getOfferIds() {
        return this.offers;
    }
}