package com.disney.wdpro.ticket_sales_managers;

import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketOrderFormImpl;
import com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketSalesCheckoutManagerImpl;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.ticket_sales_base_lib.FetchFPTicketEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.DataStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.DeliveryOption;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductType;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiSession;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.DirtyWordFoundException;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.ProductAssemblerApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketAssemblerResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.utils.NewRelicConstants;
import com.google.common.base.C22456g;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public class GeneralTicketSalesCheckoutManagerImpl extends TicketSalesCheckoutManagerImpl implements GeneralTicketSalesCheckoutManager {
    private static final int MAX_POLLING_ATTEMPTS = 8;
    private static final int WAIT_TIME = 4;
    protected final Context appContext;
    private final InterfaceC8682n crashHelper;
    protected final Creator creator;
    private final ListServiceApiClient listServiceApiClient;
    private final ProductAssemblerApiClient productAssemblerApiClient;
    protected final BookingApiSessionStore sessionStore;
    protected final C9248i vendomatic;

    public static class Creator {
        private final BookingApiClient bookingApiClient;

        @Inject
        public Creator(BookingApiClient bookingApiClient) {
            this.bookingApiClient = bookingApiClient;
        }

        public BookingApiClient getBookingApiClient() {
            return this.bookingApiClient;
        }

        public CreateTicketOrderEvent newCreateTicketOrderEvent(TicketOrderForm ticketOrderForm, DataStatus dataStatus) {
            return new CreateTicketOrderEvent(ticketOrderForm, dataStatus);
        }

        public PurchaseTicketOrderEvent newPurchaseTicketOrderEvent(TicketOrderForm ticketOrderForm, DataStatus dataStatus) {
            return new PurchaseTicketOrderEvent(ticketOrderForm, dataStatus);
        }
    }

    @Inject
    public GeneralTicketSalesCheckoutManagerImpl(Context context, Creator creator, BookingApiSessionStore bookingApiSessionStore, InterfaceC8682n interfaceC8682n, ProductAssemblerApiClient productAssemblerApiClient, ListServiceApiClient listServiceApiClient, C9248i c9248i) {
        this.appContext = context;
        this.creator = creator;
        this.sessionStore = bookingApiSessionStore;
        this.crashHelper = interfaceC8682n;
        this.productAssemblerApiClient = productAssemblerApiClient;
        this.listServiceApiClient = listServiceApiClient;
        this.vendomatic = c9248i;
    }

    private void createAndSaveOrderResponse(TicketOrderForm ticketOrderForm, ProductCategoryDetails productCategoryDetails) throws JsonParseException, IOException {
        TicketOrderResponse ticketOrderResponseCreateOrderWithProducts = this.creator.getBookingApiClient().createOrderWithProducts(ticketOrderForm, productCategoryDetails);
        this.crashHelper.trackTimedActionEnd("LoadTimeCommerce", "BookingServiceOrders");
        if (ticketOrderResponseCreateOrderWithProducts == null) {
            throw new JsonParseException("Failed to parse response from server: createOrderResponse");
        }
        BookingApiSession bookingApiSession = new BookingApiSession(ticketOrderResponseCreateOrderWithProducts, ticketOrderForm);
        bookingApiSession.setCurrentBookingStatus(ticketOrderResponseCreateOrderWithProducts.getBookingStatus());
        if (!bookingApiSession.mapOrderItemsToLocalTickets(ticketOrderForm)) {
            throw new JsonParseException("Order did not return the expected tickets");
        }
        this.sessionStore.writeApiSession(bookingApiSession.getFormId(), bookingApiSession);
    }

    private String createGuestFirstNames(TicketOrderForm ticketOrderForm) {
        ImmutableSet<UserDataContainer> usersWithAssignedTickets = ticketOrderForm.getUsersWithAssignedTickets();
        ArrayList arrayListM69268i = Lists.m69268i();
        AbstractC22726b3<UserDataContainer> it = usersWithAssignedTickets.iterator();
        while (it.hasNext()) {
            UserDataContainer next = it.next();
            String strOrNull = next.getPersonName().getGuestName().orNull();
            if (!C22466q.m68722b(strOrNull)) {
                arrayListM69268i.add(strOrNull);
            }
            Optional<String> firstName = next.getPersonName().getFirstName();
            if (firstName.isPresent()) {
                arrayListM69268i.add(firstName.get());
            }
        }
        return C22456g.m68633k(",").m68637f(arrayListM69268i);
    }

    private String createGuestLastNames(TicketOrderForm ticketOrderForm) {
        ImmutableSet<UserDataContainer> usersWithAssignedTickets = ticketOrderForm.getUsersWithAssignedTickets();
        ArrayList arrayListM69268i = Lists.m69268i();
        AbstractC22726b3<UserDataContainer> it = usersWithAssignedTickets.iterator();
        while (it.hasNext()) {
            UserDataContainer next = it.next();
            String strOrNull = next.getPersonName().getGuestName().orNull();
            if (!C22466q.m68722b(strOrNull)) {
                arrayListM69268i.add(strOrNull);
            }
            Optional<String> lastName = next.getPersonName().getLastName();
            if (lastName.isPresent()) {
                arrayListM69268i.add(lastName.get());
            }
        }
        return C22456g.m68633k(",").m68637f(arrayListM69268i);
    }

    private SelectedTicketProducts fetchFPSelectedTickets(String str, ProductCategoryDetails productCategoryDetails, DestinationId destinationId, Calendar calendar, int i10, WebStoreId webStoreId, AffiliationType affiliationType, String str2) throws JsonParseException, IOException, IllegalArgumentException, NullPointerException {
        TicketAssemblerResponse ticketProducts = this.productAssemblerApiClient.getTicketProducts(productCategoryDetails.getProductCategoryType(), destinationId, webStoreId, Lists.m69271l(affiliationType.getId()), str, calendar, this.vendomatic.m38675C0(), this.vendomatic.m38788r1());
        return new TicketProductServiceResponseImpl(ticketProducts).getSelectedTicketProducts(TicketProductParameters.builder().setTicketProductType(new TicketProductType(productCategoryDetails.getProductIds().iterator().next())).setDiscountGroupType(str2).setNumberOfDays(1).setNumAllAgesTickets(i10).build());
    }

    private TicketOrderForm populateOrderBuilderForUpgrades(TicketOrderFormImpl ticketOrderFormImpl, SelectedTicketProducts selectedTicketProducts, List<TicketUpgradeEntitlement> list) {
        TicketOrderFormImpl.Builder builderWithOldTicketOrderForm = new TicketOrderFormImpl.Builder(selectedTicketProducts.getWebStoreId(), selectedTicketProducts.getProductCategoryType()).withOldTicketOrderForm(ticketOrderFormImpl);
        builderWithOldTicketOrderForm.setTicketDisplayName(selectedTicketProducts.getTicketDisplayNames().orNull());
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<TicketUpgradeEntitlement> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TicketItem.TicketItemBuilder().withProductInstanceId(selectedTicketProducts.getAllAgesProductInstanceId().get()).withCategoryId(selectedTicketProducts.getAllAgesCategoryId().get()).withDtiStoreId(selectedTicketProducts.getDtiStoreId()).withEntitlementId(it.next().getEntitlementId()).build());
            }
            builderWithOldTicketOrderForm.addTickets(arrayList);
        }
        return builderWithOldTicketOrderForm.build();
    }

    private TicketOrderResponse tryPollingAfterTimeout(String str, String str2, Calendar calendar, ProductCategoryType productCategoryType) throws InterruptedException {
        String str3;
        String str4;
        Calendar calendar2;
        ProductCategoryType productCategoryType2;
        BookingApiClient bookingApiClient = this.creator.getBookingApiClient();
        TicketOrderResponse ticketOrderResponse = null;
        int i10 = 0;
        while (i10 < 8 && ticketOrderResponse == null) {
            try {
                TimeUnit.SECONDS.sleep(4L);
                str3 = str;
                str4 = str2;
                calendar2 = calendar;
                productCategoryType2 = productCategoryType;
            } catch (IOException e10) {
                e = e10;
                str3 = str;
                str4 = str2;
                calendar2 = calendar;
                productCategoryType2 = productCategoryType;
            } catch (InterruptedException e11) {
                e = e11;
                str3 = str;
                str4 = str2;
                calendar2 = calendar;
                productCategoryType2 = productCategoryType;
            } catch (Exception e12) {
                e = e12;
                str3 = str;
                str4 = str2;
                calendar2 = calendar;
                productCategoryType2 = productCategoryType;
            }
            try {
                TicketOrderResponse ticketOrderResponseFetchOrder = bookingApiClient.fetchOrder(str3, str4, false, calendar2, productCategoryType2);
                if (ticketOrderResponseFetchOrder != null && ticketOrderResponseFetchOrder.getBookingStatus() != BookingStatus.IN_PROGRESS) {
                    ticketOrderResponse = ticketOrderResponseFetchOrder;
                }
            } catch (IOException e13) {
                e = e13;
                this.crashHelper.logHandledException(e);
                i10++;
                str = str3;
                str2 = str4;
                calendar = calendar2;
                productCategoryType = productCategoryType2;
            } catch (InterruptedException e14) {
                e = e14;
                this.crashHelper.logHandledException(e);
                i10++;
                str = str3;
                str2 = str4;
                calendar = calendar2;
                productCategoryType = productCategoryType2;
            } catch (Exception e15) {
                e = e15;
                this.crashHelper.logHandledException(e);
                i10++;
                str = str3;
                str2 = str4;
                calendar = calendar2;
                productCategoryType = productCategoryType2;
            }
            i10++;
            str = str3;
            str2 = str4;
            calendar = calendar2;
            productCategoryType = productCategoryType2;
        }
        return ticketOrderResponse;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    public boolean cancelOldOrders(String str, Calendar calendar) {
        try {
            Iterator<String> it = this.sessionStore.getAllIds().iterator();
            while (it.hasNext()) {
                BookingApiSession apiSession = this.sessionStore.readApiSession(it.next());
                if (str != null && apiSession != null) {
                    try {
                        this.creator.getBookingApiClient().cancelOrder(str, calendar, apiSession);
                        this.crashHelper.trackTimedActionEnd("LoadTimeCommerce", NewRelicConstants.ANALYTICS_DELETE_BOOKING_SERVICE_ORDER);
                    } catch (IOException e10) {
                        this.crashHelper.logHandledException(e10);
                    }
                }
            }
        } catch (Exception e11) {
            this.crashHelper.logHandledException(e11);
        }
        this.sessionStore.clear();
        return true;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    @UIEvent
    public synchronized CreateTicketOrderEvent createTicketOrder(TicketOrderForm ticketOrderForm, ProductCategoryDetails productCategoryDetails) {
        CreateTicketOrderEvent createTicketOrderEventNewCreateTicketOrderEvent;
        createTicketOrderEventNewCreateTicketOrderEvent = this.creator.newCreateTicketOrderEvent(ticketOrderForm, DataStatus.FAIL);
        try {
            C22462m.m68685q(ticketOrderForm, "order must not be null");
            C22462m.m68673e(ticketOrderForm instanceof TicketOrderFormImpl, "Unexpected order type");
            try {
                try {
                    createAndSaveOrderResponse(ticketOrderForm, productCategoryDetails);
                    createTicketOrderEventNewCreateTicketOrderEvent.setResult((CreateTicketOrderEvent) DataStatus.SUCCESS);
                } catch (JsonParseException e10) {
                    this.crashHelper.logHandledException(e10);
                    createTicketOrderEventNewCreateTicketOrderEvent.setException(e10);
                } catch (IOException e11) {
                    this.crashHelper.logHandledException(e11);
                    createTicketOrderEventNewCreateTicketOrderEvent.setException(e11);
                }
            } catch (UnSuccessStatusException e12) {
                this.crashHelper.logHandledException(e12);
                createTicketOrderEventNewCreateTicketOrderEvent.setException(e12);
            } catch (Exception e13) {
                this.crashHelper.logHandledException(e13);
                createTicketOrderEventNewCreateTicketOrderEvent.setException(e13);
            }
        } catch (RuntimeException e14) {
            this.crashHelper.logHandledException(e14);
            createTicketOrderEventNewCreateTicketOrderEvent.setException(e14);
            return createTicketOrderEventNewCreateTicketOrderEvent;
        }
        return createTicketOrderEventNewCreateTicketOrderEvent;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    @UIEvent
    public synchronized FetchFPTicketEvent fetchFPTicketsAndCreateUpgradeTicketOrder(TicketOrderForm ticketOrderForm, String str, DestinationId destinationId, WebStoreId webStoreId, AffiliationType affiliationType, String str2, ProductCategoryDetails productCategoryDetails, List<TicketUpgradeEntitlement> list, Calendar calendar) {
        FetchFPTicketEvent fetchFPTicketEvent;
        try {
            try {
                C22462m.m68685q(ticketOrderForm, "order must not be null");
                C22462m.m68673e(ticketOrderForm instanceof TicketOrderFormImpl, "Unexpected order type");
                SelectedTicketProducts selectedTicketProductsFetchFPSelectedTickets = fetchFPSelectedTickets(str, productCategoryDetails, destinationId, calendar, list.size(), webStoreId, affiliationType, str2);
                TicketOrderForm ticketOrderFormPopulateOrderBuilderForUpgrades = populateOrderBuilderForUpgrades((TicketOrderFormImpl) ticketOrderForm, selectedTicketProductsFetchFPSelectedTickets, list);
                createAndSaveOrderResponse(ticketOrderFormPopulateOrderBuilderForUpgrades, productCategoryDetails);
                fetchFPTicketEvent = new FetchFPTicketEvent(selectedTicketProductsFetchFPSelectedTickets, ticketOrderFormPopulateOrderBuilderForUpgrades);
            } catch (JsonParseException e10) {
                fetchFPTicketEvent = new FetchFPTicketEvent(null, null);
                fetchFPTicketEvent.setException(e10);
            } catch (Exception e11) {
                fetchFPTicketEvent = new FetchFPTicketEvent(null, null);
                fetchFPTicketEvent.setException(e11);
            }
        } catch (IOException e12) {
            fetchFPTicketEvent = new FetchFPTicketEvent(null, null);
            fetchFPTicketEvent.setException(e12);
        }
        return fetchFPTicketEvent;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    public Optional<String> getCalendarIds(Long l10) {
        C22462m.m68685q(l10, "ticketOrderFormId == null");
        BookingApiSession apiSession = this.sessionStore.readApiSession(l10.longValue());
        if (apiSession != null) {
            return apiSession.getCalendarIds();
        }
        throw new IllegalArgumentException("BookingApiSession was not found");
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    public BookingStatus getCurrentBookingStatus(TicketOrderForm ticketOrderForm) throws IllegalArgumentException {
        C22462m.m68685q(ticketOrderForm, "TicketOrderForm == null");
        BookingApiSession apiSession = this.sessionStore.readApiSession(ticketOrderForm.getFormId());
        if (apiSession != null) {
            return apiSession.getCurrentBookingStatus();
        }
        throw new IllegalArgumentException("Order was not found.");
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketSalesCheckoutManagerImpl, com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketSalesCheckoutManager
    public String getOrderId(Long l10) throws IllegalArgumentException {
        C22462m.m68685q(l10, "ticketOrderFormId == null");
        BookingApiSession apiSession = this.sessionStore.readApiSession(l10.longValue());
        if (apiSession != null) {
            return apiSession.getOrderId();
        }
        throw new IllegalArgumentException("BookingApiSession was not found");
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    public PurchaseConfirmation getPurchaseConfirmation(Long l10) throws IllegalArgumentException {
        C22462m.m68685q(l10, "ticketOrderFormId == null");
        BookingApiSession apiSession = this.sessionStore.readApiSession(l10.longValue());
        if (apiSession == null) {
            throw new IllegalArgumentException("Order was not found");
        }
        TicketOrderResponse purchaseTicketOrderResponse = apiSession.getPurchaseTicketOrderResponse();
        Price total = purchaseTicketOrderResponse.getPricing().getTotal();
        Calendar calendar = purchaseTicketOrderResponse.getBookingDate().isPresent() ? purchaseTicketOrderResponse.getBookingDate().get() : Calendar.getInstance();
        BookingStatus currentBookingStatus = apiSession.getCurrentBookingStatus();
        String orderId = apiSession.getOrderId();
        PurchaseConfirmation.Builder builder = new PurchaseConfirmation.Builder();
        builder.setSelectedDeliveryOption(getSelectedDeliveryOption(l10).orNull()).setOrderId(orderId).setPaymentCard(purchaseTicketOrderResponse.getPaymentUsed().orNull()).setAmountPaid(total).setBookingDate(calendar).setBookingStatus(currentBookingStatus).setTicketEntitlements(purchaseTicketOrderResponse.getTicketEntitlements().orNull()).setConfirmationEmail(purchaseTicketOrderResponse.getConfirmationEmail()).setTieredTicketCalendarMap(purchaseTicketOrderResponse.getCalendars().orNull()).setCalendarNamesMap(purchaseTicketOrderResponse.getCalendarNames().orNull()).setOrderItems(purchaseTicketOrderResponse.getOrderItems()).setConfirmationPolicy(purchaseTicketOrderResponse.getConfirmationPolicies().orNull()).setMonthlyPrice(purchaseTicketOrderResponse.isGuestOnMonthlyPaymentPlan() ? purchaseTicketOrderResponse.getMonthlyPaymentAmount().get().getPrice() : null);
        return builder.build();
    }

    public Optional<DeliveryOption> getSelectedDeliveryOption(Long l10) throws IllegalArgumentException {
        C22462m.m68685q(l10, "ticketOrderFormId == null");
        BookingApiSession apiSession = this.sessionStore.readApiSession(l10.longValue());
        if (apiSession == null || !(apiSession.getCurrentBookingStatus() == BookingStatus.BOOKED || apiSession.getCurrentBookingStatus() == BookingStatus.PENDED)) {
            throw new IllegalArgumentException("Order was not found or Booking status was neither booked nor pended");
        }
        return Optional.fromNullable(apiSession.getSelectedDeliveryOption());
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    @UIEvent
    public synchronized PurchaseTicketOrderEvent purchaseTicketOrder(TicketOrderForm ticketOrderForm, HashMap<SupportedPaymentType, Class<?>> map, ProductCategoryDetails productCategoryDetails) {
        boolean zIsDirtyWordFoundInText;
        boolean zIsDirtyWordFoundInText2;
        try {
            C22462m.m68685q(ticketOrderForm, "order must not be null");
            C22462m.m68673e(ticketOrderForm instanceof TicketOrderFormImpl, "Unexpected order type");
            Set<TicketOrderForm.ValidationReasons> setValidateForPurchase = ticketOrderForm.validateForPurchase(map.keySet());
            C22462m.m68673e(setValidateForPurchase.isEmpty(), "Validation Error(s): " + setValidateForPurchase.toString());
            BookingApiSession apiSession = this.sessionStore.readApiSession(ticketOrderForm.getFormId());
            PurchaseTicketOrderEvent purchaseTicketOrderEventNewPurchaseTicketOrderEvent = this.creator.newPurchaseTicketOrderEvent(ticketOrderForm, DataStatus.FAIL);
            BookingApiClient bookingApiClient = this.creator.getBookingApiClient();
            String iSO3Country = "";
            try {
                iSO3Country = this.appContext.getResources().getConfiguration().locale.getISO3Country();
            } catch (Exception unused) {
            }
            try {
                try {
                    try {
                        zIsDirtyWordFoundInText = this.listServiceApiClient.isDirtyWordFoundInText(createGuestFirstNames(ticketOrderForm));
                        zIsDirtyWordFoundInText2 = this.listServiceApiClient.isDirtyWordFoundInText(createGuestLastNames(ticketOrderForm));
                        this.crashHelper.trackTimedActionEnd("LoadTimeCommerce", "DirtyWordCheck");
                    } catch (DirtyWordFoundException e10) {
                        this.crashHelper.logHandledException(e10);
                        purchaseTicketOrderEventNewPurchaseTicketOrderEvent.setException(e10);
                    } catch (SocketTimeoutException e11) {
                        this.crashHelper.logHandledException(e11);
                        ticketOrderResponseTryPollingAfterTimeout = tryPollingAfterTimeout(ticketOrderForm.getSessionId(), apiSession.getOrderId(), ticketOrderForm.getSellableOnDate().orNull(), ticketOrderForm.getProductCategoryType());
                        if (ticketOrderResponseTryPollingAfterTimeout == null) {
                            purchaseTicketOrderEventNewPurchaseTicketOrderEvent.setException(e11);
                        }
                    }
                } catch (UnSuccessStatusException e12) {
                    this.crashHelper.logHandledException(e12);
                    ticketOrderResponseTryPollingAfterTimeout = e12.getStatusCode() == 409 ? tryPollingAfterTimeout(ticketOrderForm.getSessionId(), apiSession.getOrderId(), ticketOrderForm.getSellableOnDate().orNull(), ticketOrderForm.getProductCategoryType()) : null;
                    if (ticketOrderResponseTryPollingAfterTimeout == null) {
                        purchaseTicketOrderEventNewPurchaseTicketOrderEvent.setException(e12);
                    }
                } catch (IOException e13) {
                    this.crashHelper.logHandledException(e13);
                    purchaseTicketOrderEventNewPurchaseTicketOrderEvent.setException(e13);
                }
            } catch (JsonParseException e14) {
                this.crashHelper.logHandledException(e14);
                purchaseTicketOrderEventNewPurchaseTicketOrderEvent.setException(e14);
            } catch (Exception e15) {
                this.crashHelper.logHandledException(e15);
                purchaseTicketOrderEventNewPurchaseTicketOrderEvent.setException(e15);
            }
            if (zIsDirtyWordFoundInText2) {
                throw new DirtyWordFoundException(this.appContext.getString(C21167R.string.dirty_word_found_in_last_name));
            }
            if (zIsDirtyWordFoundInText) {
                throw new DirtyWordFoundException(this.appContext.getString(C21167R.string.dirty_word_found_in_first_name));
            }
            ticketOrderResponseTryPollingAfterTimeout = bookingApiClient.expressCheckout(ticketOrderForm, apiSession, iSO3Country, productCategoryDetails);
            this.crashHelper.trackTimedActionEnd("LoadTimeCommerce", "BookingServiceUpdateAndSubmit");
            if (ticketOrderResponseTryPollingAfterTimeout == null) {
                return purchaseTicketOrderEventNewPurchaseTicketOrderEvent;
            }
            apiSession.setPurchaseTicketOrderResponse(ticketOrderResponseTryPollingAfterTimeout);
            apiSession.setCurrentBookingStatus(ticketOrderResponseTryPollingAfterTimeout.getBookingStatus());
            this.sessionStore.writeApiSession(apiSession.getFormId(), apiSession);
            purchaseTicketOrderEventNewPurchaseTicketOrderEvent.setResult((PurchaseTicketOrderEvent) DataStatus.SUCCESS);
            return purchaseTicketOrderEventNewPurchaseTicketOrderEvent;
        } catch (RuntimeException e16) {
            this.crashHelper.logHandledException(e16);
            PurchaseTicketOrderEvent purchaseTicketOrderEventNewPurchaseTicketOrderEvent2 = this.creator.newPurchaseTicketOrderEvent(null, DataStatus.FAIL);
            purchaseTicketOrderEventNewPurchaseTicketOrderEvent2.setException(e16);
            return purchaseTicketOrderEventNewPurchaseTicketOrderEvent2;
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager
    public void removeSessionFromStorage(long j10) {
        this.sessionStore.deleteAPISession(j10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public GeneralTicketSalesCheckoutManager noCache() {
        throw new UnsupportedOperationException("Should be handled by proxy");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public GeneralTicketSalesCheckoutManager preload() {
        throw new UnsupportedOperationException("Should be handled by proxy");
    }
}