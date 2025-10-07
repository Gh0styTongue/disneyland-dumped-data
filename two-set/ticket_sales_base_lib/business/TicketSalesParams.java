package com.disney.wdpro.ticket_sales_base_lib.business;

import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.google.common.base.Optional;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes18.dex */
public interface TicketSalesParams extends Serializable {
    AffiliationType getAffiliationType();

    DestinationId getDestinationId();

    String getDiscountGroupType();

    ProductCategoryDetails getProductCategoryDetails();

    Optional<Calendar> getSellableOnDate();

    HashMap<SupportedPaymentType, Class<?>> getSupportedPaymentTypes();

    WebStoreId getWebStoreId();

    boolean isNewRelicAnalyticsTrackerEnabled();
}