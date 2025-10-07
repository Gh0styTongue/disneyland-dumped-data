package com.disney.wdpro.ticket_sales_managers.models;

import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes19.dex */
public class MaxPassProductGroup {
    private final String currency;
    private final String destinationId;
    private final List<MaxPassProduct> maxPassProductList;
    private final BigDecimal pricePerItem;
    private final String storeId;
    private final String subTitleHtml;
    private final String titleHtml;

    public MaxPassProductGroup(List<MaxPassProduct> list, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5) {
        this.maxPassProductList = list;
        this.destinationId = str;
        this.storeId = str2;
        this.titleHtml = str3;
        this.subTitleHtml = str4;
        this.pricePerItem = bigDecimal;
        this.currency = str5;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDestinationId() {
        return this.destinationId;
    }

    public List<MaxPassProduct> getMaxPassProductList() {
        return this.maxPassProductList;
    }

    public BigDecimal getPricePerItem() {
        return this.pricePerItem;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public String getSubTitleHtml() {
        return this.subTitleHtml;
    }

    public String getTitleHtml() {
        return this.titleHtml;
    }
}