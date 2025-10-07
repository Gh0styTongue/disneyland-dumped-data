package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.AnnualPassOrderItemComponent;
import java.util.Map;

/* loaded from: classes18.dex */
public interface ApOrderItemComponent extends OrderItemComponent {
    Price getDeposit();

    Price getPricePerMonth();

    Map<String, AnnualPassOrderItemComponent.AnnualPassItem.TicketUpgradeData> getTicketUpgradeDataMap();

    Pricing getUnitPrice();

    boolean isPaymentPlan();
}