package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesFragmentDataEvent;
import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesHeroImageEvent;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSelectionCalendarLegend;
import com.disney.wdpro.midichlorian.CacheContextModifier;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesFragmentDataRequestParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketsCalendar;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PricePerDay;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierName;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierNameDescription;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketDay;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* loaded from: classes19.dex */
public interface TicketSalesFragmentDataManager extends CacheContextModifier<TicketSalesFragmentDataManager> {
    List<Optional<SelectedTicketProducts>> getAllSelectedTicketProducts(TicketProductParameters ticketProductParameters, TicketProductServiceResponse ticketProductServiceResponse);

    ImmutableMap<String, TicketTierCalendarResourceBundle> getAvailableTicketTierCalendarResources(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay);

    ImmutableMap<String, TicketTierNameDescription> getAvailableTicketTierDeltaData(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay);

    ImmutableMap<TicketTierName, TicketSelectionCalendarLegend> getAvailableTicketTierLegendData(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay);

    Optional<TieredTicketsCalendar> getCalendarForDay(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay);

    ImmutableList<TicketDay> getNumberOfSupportedDays(TicketProductServiceResponse ticketProductServiceResponse);

    @Deprecated
    PricePerDay getPricePerDay(TicketProductParameters ticketProductParameters, TicketProductServiceResponse ticketProductServiceResponse);

    String getProductIdByTier(TicketProductServiceResponse ticketProductServiceResponse, String str);

    Optional<SelectedTicketProducts> getSelectedTicketProducts(TicketProductParameters ticketProductParameters, TicketProductServiceResponse ticketProductServiceResponse);

    ImmutableMap<Integer, String> getTierNameByPriority(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay);

    boolean isTieredDay(int i10, TicketProductServiceResponse ticketProductServiceResponse);

    boolean isTieredTicketsEnabled(TicketProductServiceResponse ticketProductServiceResponse);

    @UIEvent
    TicketSalesFragmentDataEvent loadTicketSalesFragmentData(TicketSalesFragmentDataRequestParameters ticketSalesFragmentDataRequestParameters);

    @UIEvent
    TicketSalesHeroImageEvent loadTicketSalesHeroImageUrlEvent();
}