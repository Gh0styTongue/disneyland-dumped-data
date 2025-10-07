package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClientImpl;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ServiceBaseUrlApiClient;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManagerImpl;
import com.disney.wdpro.ticket_sales_managers.MaxPassManager;
import com.disney.wdpro.ticket_sales_managers.MaxPassManagerImpl;
import com.disney.wdpro.ticket_sales_managers.TicketSalesBookingApiClientImpl;
import com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager;
import com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManagerImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import p1138z9.InterfaceC33948a;

@Module(includes = {TicketSalesManagersBindingModule.class})
/* loaded from: classes19.dex */
public class TicketSalesManagersModule {
    @Provides
    @Singleton
    BookingApiClient provideBookingApiClient(ProxyFactory proxyFactory, TicketSalesBookingApiClientImpl ticketSalesBookingApiClientImpl) {
        return (BookingApiClient) proxyFactory.createProxy(ticketSalesBookingApiClientImpl);
    }

    @Provides
    @Singleton
    GeneralTicketSalesCheckoutManager provideGeneralTicketSalesCheckoutManager(ProxyFactory proxyFactory, GeneralTicketSalesCheckoutManagerImpl generalTicketSalesCheckoutManagerImpl) {
        return (GeneralTicketSalesCheckoutManager) proxyFactory.createProxy(generalTicketSalesCheckoutManagerImpl);
    }

    @Provides
    @Singleton
    ListServiceApiClient provideListServiceApiClient(ProxyFactory proxyFactory, ListServiceApiClientImpl listServiceApiClientImpl) {
        return (ListServiceApiClient) proxyFactory.createProxy(listServiceApiClientImpl);
    }

    @Provides
    @Singleton
    MaxPassManager provideMaxPassManager(ProxyFactory proxyFactory, MaxPassManagerImpl maxPassManagerImpl) {
        return (MaxPassManager) proxyFactory.createProxy(maxPassManagerImpl);
    }

    @Provides
    @Singleton
    ServiceBaseUrlApiClient provideServiceBaseUrlApiClient(InterfaceC33948a interfaceC33948a) {
        return new ServiceBaseUrlApiClient(interfaceC33948a.getServiceBaseUrl());
    }

    @Provides
    @Singleton
    TicketSalesFragmentDataManager provideTicketSalesFragmentManager(ProxyFactory proxyFactory, TicketSalesFragmentDataManagerImpl ticketSalesFragmentDataManagerImpl) {
        return (TicketSalesFragmentDataManager) proxyFactory.createProxy(ticketSalesFragmentDataManagerImpl);
    }
}