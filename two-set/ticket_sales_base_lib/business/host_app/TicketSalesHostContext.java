package com.disney.wdpro.ticket_sales_base_lib.business.host_app;

import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;

/* loaded from: classes18.dex */
public interface TicketSalesHostContext {
    String getAPRenewalsHelpDeskPhoneNumber();

    int getButtonTextResourceIdForMobileWebUrl(ProductCategoryType productCategoryType);

    GuestGroup getGuestGroup();

    String getHelpDeskPhoneNumber(ProductCategoryType productCategoryType);

    String getMobileWebTicketsUrl(ProductCategoryType productCategoryType);
}