package com.disney.wdpro.ticket_sales_base_lib.business;

import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.google.common.base.Optional;
import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes18.dex */
public class TicketSalesParamsImpl implements TicketSalesParams {
    private static final long serialVersionUID = 1;
    private final AffiliationType affiliationType;
    private final DestinationId destinationId;
    private final String discountGroupType;
    private final boolean isNewRelicAnalyticsTrackerEnabled;
    private final ProductCategoryDetails productCategoryDetails;
    private final Calendar sellableOnDate;
    private final HashMap<SupportedPaymentType, Class<?>> supportedPaymentTypeMap;
    private final WebStoreId webStoreId;

    public TicketSalesParamsImpl(ProductCategoryDetails productCategoryDetails, WebStoreId webStoreId, AffiliationType affiliationType, String str, String str2, Calendar calendar, HashMap<SupportedPaymentType, Class<?>> map, boolean z10) {
        this.productCategoryDetails = productCategoryDetails;
        this.webStoreId = webStoreId;
        this.affiliationType = affiliationType;
        this.destinationId = new DestinationId(str);
        this.discountGroupType = str2;
        this.sellableOnDate = calendar;
        this.supportedPaymentTypeMap = map;
        this.isNewRelicAnalyticsTrackerEnabled = z10;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public AffiliationType getAffiliationType() {
        return this.affiliationType;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public DestinationId getDestinationId() {
        return this.destinationId;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public String getDiscountGroupType() {
        return this.discountGroupType;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public ProductCategoryDetails getProductCategoryDetails() {
        return this.productCategoryDetails;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public Optional<Calendar> getSellableOnDate() {
        return Optional.fromNullable(this.sellableOnDate);
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public HashMap<SupportedPaymentType, Class<?>> getSupportedPaymentTypes() {
        return this.supportedPaymentTypeMap;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public WebStoreId getWebStoreId() {
        return this.webStoreId;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams
    public boolean isNewRelicAnalyticsTrackerEnabled() {
        return this.isNewRelicAnalyticsTrackerEnabled;
    }
}