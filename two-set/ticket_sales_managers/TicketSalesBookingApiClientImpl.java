package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.utils.C9367d;
import com.disney.wdpro.httpclient.AbstractC13329b0;
import com.disney.wdpro.httpclient.C13323a0;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.service.model.payment.CardPaymentMethod;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesEnvironment;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserData;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentCard;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.httpclient.ConversationIdInterceptor;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.utils.ServiceDateFormatter;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiCreateOrderRequest;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiExpressCheckoutRequest;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiSession;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.CancelOrderEvent;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.TicketSalesHttpHeader;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ContractResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.ApUpgradesGuestEntry;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.GeneralAdmissionGuestEntry;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.utils.NewRelicConstants;
import com.disney.wdpro.ticket_sales_booking_lib.business.utils.ResponseUtils;
import com.google.common.base.C22466q;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public class TicketSalesBookingApiClientImpl implements BookingApiClient {
    private InterfaceC8682n crashHelper;
    private final ServiceDateFormatter dateFormatter;
    private final C13345q httpApiClient;
    private final C9314j parkAppConfiguration;
    private final TicketSalesEnvironment ticketSalesEnvironment;
    private final TicketSalesHttpHeader ticketSalesHttpHeader;

    /* renamed from: com.disney.wdpro.ticket_sales_managers.TicketSalesBookingApiClientImpl$1 */
    static /* synthetic */ class C211681 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$product$ProductCategoryType */
        static final /* synthetic */ int[] f44160x3a53626;

        static {
            int[] iArr = new int[ProductCategoryType.values().length];
            f44160x3a53626 = iArr;
            try {
                iArr[ProductCategoryType.ANNUAL_PASS_RENEWALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44160x3a53626[ProductCategoryType.ANNUAL_PASS_UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44160x3a53626[ProductCategoryType.MAX_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44160x3a53626[ProductCategoryType.ANNUAL_PASS_SALES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public TicketSalesBookingApiClientImpl(C13345q c13345q, TicketSalesEnvironment ticketSalesEnvironment, C9314j c9314j, TicketSalesHttpHeader ticketSalesHttpHeader, InterfaceC8682n interfaceC8682n) {
        this(c13345q, ticketSalesEnvironment, new ServiceDateFormatter(new C9350r(TimeZone.getTimeZone("Zulu"), Locale.US)), c9314j, ticketSalesHttpHeader, interfaceC8682n);
    }

    private void addFlatTickets(BookingApiCreateOrderRequest.Builder builder, TicketOrderForm ticketOrderForm) {
        int ticketCount = ticketOrderForm.getTicketCount();
        for (int i10 = 0; i10 < ticketCount; i10++) {
            TicketItem ticket = ticketOrderForm.getTicket(i10);
            builder.addTicketProduct(ticket.getProductInstanceId(), 1, ticket.getDtiStoreId(), ticket.getCategoryId(), ticket.getMediaId(), ticket.getEntitlementId(), ticket.getAvatarImageUrl(), ticket.getGuestId(), ticket.getGuestIdType());
        }
    }

    private void addTicketsGroupByProductInstanceIds(BookingApiCreateOrderRequest.Builder builder, TicketOrderForm ticketOrderForm) {
        ArrayListMultimap arrayListMultimapCreate = ArrayListMultimap.create();
        int ticketCount = ticketOrderForm.getTicketCount();
        for (int i10 = 0; i10 < ticketCount; i10++) {
            TicketItem ticket = ticketOrderForm.getTicket(i10);
            arrayListMultimapCreate.put(ticket.getProductInstanceId(), ticket);
        }
        for (K k10 : arrayListMultimapCreate.keySet()) {
            ArrayList arrayListM69269j = Lists.m69269j(arrayListMultimapCreate.get((ArrayListMultimap) k10));
            TicketItem ticketItem = (TicketItem) arrayListM69269j.get(0);
            builder.addTicketProduct(k10, arrayListM69269j.size(), ticketItem.getDtiStoreId(), ticketItem.getCategoryId(), ticketItem.getMediaId());
        }
    }

    private BookingApiExpressCheckoutRequest getBookingApiExpressCheckoutRequest(TicketOrderForm ticketOrderForm, BookingApiSession bookingApiSession, String str, ProductCategoryDetails productCategoryDetails) {
        PaymentCard paymentCard;
        BookingApiExpressCheckoutRequest.Builder builder = BookingApiExpressCheckoutRequest.builder();
        ImmutableSet<UserDataContainer> usersWithAssignedTickets = ticketOrderForm.getUsersWithAssignedTickets();
        UserData userDataFromContainer = ticketOrderForm.getPurchaser().get().getUserDataFromContainer();
        String str2 = userDataFromContainer.getSwid().get();
        PersonName name = userDataFromContainer.getName();
        AbstractC22726b3<UserDataContainer> it = usersWithAssignedTickets.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            UserDataContainer next = it.next();
            UserData userDataFromContainer2 = next.getUserDataFromContainer();
            ArrayList arrayListM69268i = Lists.m69268i();
            boolean zEquals = userDataFromContainer2.getSwid().isPresent() ? userDataFromContainer2.getSwid().get().equals(str2) : false;
            AbstractC22726b3<TicketItem> it2 = ticketOrderForm.getTicketsAssignedToUser(next).iterator();
            while (it2.hasNext()) {
                arrayListM69268i.add(bookingApiSession.getRemoteOrderItemIdForLocalTicketItem(it2.next()));
            }
            builder.addGuest(getGuestEntry(userDataFromContainer2, zEquals, Integer.toString(i10), arrayListM69268i, next.getPersonName().getGuestName().orNull(), productCategoryDetails));
            i10++;
        }
        builder.setPurchaserName(name);
        Price total = bookingApiSession.getCreateOrderResponse().isGuestOnMonthlyPaymentPlan() ? bookingApiSession.getCreateOrderResponse().getTotalDepositDue().get().getTotal() : bookingApiSession.getCreateOrderResponse().getPricing().getTotal();
        String strOrNull = userDataFromContainer.getEmail().orNull();
        String bookingTermsAndConditionsId = bookingApiSession.getBookingTermsAndConditionsId();
        if (C22466q.m68722b(bookingTermsAndConditionsId)) {
            throw new IllegalStateException("Booking Terms and Conditions Id is required to process order but is missing.");
        }
        Phone paymentBillingPhone = ticketOrderForm.getPaymentBillingPhone();
        CardPaymentMethod cardPaymentMethod = null;
        if (ticketOrderForm.getPaymentCard().isPresent()) {
            paymentCard = ticketOrderForm.getPaymentCard().get();
        } else if (ticketOrderForm.getCardPaymentMethod().isPresent()) {
            cardPaymentMethod = ticketOrderForm.getCardPaymentMethod().get();
            paymentCard = null;
        } else {
            paymentCard = null;
        }
        builder.addPayment(paymentCard, cardPaymentMethod, strOrNull, total, paymentBillingPhone, ticketOrderForm.isCreditCardScanned()).addEmail(strOrNull, strOrNull).setBookingTermsAndConditions(bookingTermsAndConditionsId).setGeoLocationCountry(str);
        return builder.build();
    }

    private IGuestEntry getGuestEntry(UserData userData, boolean z10, String str, List<String> list, String str2, ProductCategoryDetails productCategoryDetails) {
        int i10 = C211681.f44160x3a53626[productCategoryDetails.getProductCategoryType().ordinal()];
        return (i10 == 2 || i10 == 4) ? new ApUpgradesGuestEntry(userData, z10, str, list) : new GeneralAdmissionGuestEntry(userData, z10, str, list, str2);
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient
    public CancelOrderEvent cancelOrder(String str, Calendar calendar, BookingApiSession bookingApiSession) throws IOException {
        String orderId = bookingApiSession.getOrderId();
        String zuluDateStringForServiceRequest = this.dateFormatter.getZuluDateStringForServiceRequest(calendar);
        HttpApiClient.C13320c c13320cM55516d = this.httpApiClient.m55667b(this.ticketSalesEnvironment.getTicketSalesCancelOrderUrl(), Void.class).m55672b().m55530t("User-Agent", this.ticketSalesHttpHeader.getHttpHeader()).m55534x(new ConversationIdInterceptor(str)).m55518f(orderId).m55516d();
        if (!C22466q.m68722b(zuluDateStringForServiceRequest)) {
            c13320cM55516d.m55530t("X-Disney-Internal-SystemDateOverride", zuluDateStringForServiceRequest);
        }
        AbstractC13329b0 abstractC13329b0M55601g = AbstractC13329b0.m55583s(this.ticketSalesEnvironment.getTicketSalesCancelOrderUrl()).mo55584a().m55596a(orderId).m55601g();
        HashMap map = new HashMap();
        map.put("flow", "Checkout");
        map.put("endpoint", abstractC13329b0M55601g.toString());
        this.crashHelper.trackTimedActionStart(NewRelicConstants.ANALYTICS_DELETE_BOOKING_SERVICE_ORDER, map);
        C13352x c13352xM55521i = null;
        try {
            c13352xM55521i = c13320cM55516d.m55521i();
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        int statusCode = ResponseUtils.getStatusCode(c13352xM55521i, e);
        List conversationIdHeader = ResponseUtils.getConversationIdHeader(c13352xM55521i, e);
        map.put("statusCode", Integer.valueOf(statusCode));
        if (!C9367d.m39170a(conversationIdHeader)) {
            map.put("conversationId", conversationIdHeader.get(0));
        }
        this.crashHelper.trackTimedActionUpdate(NewRelicConstants.ANALYTICS_DELETE_BOOKING_SERVICE_ORDER, map);
        if (e == null) {
            return new CancelOrderEvent();
        }
        throw e;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient
    public TicketOrderResponse createOrderWithProducts(TicketOrderForm ticketOrderForm, ProductCategoryDetails productCategoryDetails) throws JsonParseException, IOException, IllegalArgumentException, NullPointerException {
        BookingApiCreateOrderRequest.Builder builder = BookingApiCreateOrderRequest.builder();
        int i10 = C211681.f44160x3a53626[productCategoryDetails.getProductCategoryType().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            addFlatTickets(builder, ticketOrderForm);
        } else {
            addTicketsGroupByProductInstanceIds(builder, ticketOrderForm);
        }
        String sessionId = ticketOrderForm.getSessionId();
        Calendar calendarOrNull = ticketOrderForm.getSellableOnDate().orNull();
        String zuluDateStringForServiceRequest = this.dateFormatter.getZuluDateStringForServiceRequest(calendarOrNull);
        builder.setDestinationId(ticketOrderForm.getDestinationId()).setWebStoreId(ticketOrderForm.getWebStoreId().getId()).setPurchaserSwid(ticketOrderForm.getPurchaserSwid()).setIsGuestOnPaymentPlan(ticketOrderForm.isGuestOnPaymentPlan());
        BookingApiCreateOrderRequest bookingApiCreateOrderRequestBuild = builder.build();
        String ticketSalesCreateOrderUrl = this.ticketSalesEnvironment.getTicketSalesCreateOrderUrl();
        HttpApiClient.C13320c c13320cM55535y = this.httpApiClient.m55669d(ticketSalesCreateOrderUrl, TicketOrderResponse.class).m55672b().m55523m().m55526p(bookingApiCreateOrderRequestBuild).m55530t("User-Agent", this.ticketSalesHttpHeader.getHttpHeader()).m55534x(new ConversationIdInterceptor(sessionId)).m55528r(C13323a0.class).m55535y(TicketOrderResponse.getDecoder(sessionId, calendarOrNull, ticketOrderForm.getProductCategoryType()));
        if (!C22466q.m68722b(zuluDateStringForServiceRequest)) {
            c13320cM55535y.m55530t("X-Disney-Internal-SystemDateOverride", zuluDateStringForServiceRequest);
        }
        AbstractC13329b0 abstractC13329b0M55601g = AbstractC13329b0.m55583s(ticketSalesCreateOrderUrl).mo55584a().m55601g();
        HashMap map = new HashMap();
        map.put("flow", "Checkout");
        map.put("endpoint", abstractC13329b0M55601g.toString());
        this.crashHelper.trackTimedActionStart("BookingServiceOrders", map);
        C13352x c13352xM55521i = null;
        try {
            c13352xM55521i = c13320cM55535y.m55521i();
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        int statusCode = ResponseUtils.getStatusCode(c13352xM55521i, e);
        List conversationIdHeader = ResponseUtils.getConversationIdHeader(c13352xM55521i, e);
        map.put("statusCode", Integer.valueOf(statusCode));
        if (!C9367d.m39170a(conversationIdHeader)) {
            map.put("conversationId", conversationIdHeader.get(0));
        }
        this.crashHelper.trackTimedActionUpdate("BookingServiceOrders", map);
        if (e != null) {
            throw e;
        }
        TicketOrderResponse ticketOrderResponse = (TicketOrderResponse) c13352xM55521i.m55683c();
        if (ticketOrderResponse != null) {
            return ticketOrderResponse;
        }
        throw new IOException(String.format("HTTP response has status %s but body is empty", Integer.valueOf(c13352xM55521i.m55684d())));
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient
    public TicketOrderResponse expressCheckout(TicketOrderForm ticketOrderForm, BookingApiSession bookingApiSession, String str, ProductCategoryDetails productCategoryDetails) throws JsonParseException, IOException {
        BookingApiExpressCheckoutRequest bookingApiExpressCheckoutRequest = getBookingApiExpressCheckoutRequest(ticketOrderForm, bookingApiSession, str, productCategoryDetails);
        String str2 = String.format(this.ticketSalesEnvironment.getTicketSalesExpressCheckoutUrl(), bookingApiSession.getOrderId());
        String sessionId = ticketOrderForm.getSessionId();
        Calendar calendarOrNull = ticketOrderForm.getSellableOnDate().orNull();
        String zuluDateStringForServiceRequest = this.dateFormatter.getZuluDateStringForServiceRequest(calendarOrNull);
        HttpApiClient.C13320c c13320cM55535y = this.httpApiClient.m55669d(str2, TicketOrderResponse.class).m55672b().m55523m().m55526p(bookingApiExpressCheckoutRequest).m55530t("User-Agent", this.ticketSalesHttpHeader.getHttpHeader()).m55534x(new ConversationIdInterceptor(sessionId)).m55533w(BookingApiExpressCheckoutRequest.getEncoder()).m55535y(TicketOrderResponse.getDecoder(sessionId, calendarOrNull, ticketOrderForm.getProductCategoryType()));
        if (!C22466q.m68722b(zuluDateStringForServiceRequest)) {
            c13320cM55535y.m55530t("X-Disney-Internal-SystemDateOverride", zuluDateStringForServiceRequest);
        }
        AbstractC13329b0 abstractC13329b0M55601g = AbstractC13329b0.m55583s(str2).mo55584a().m55601g();
        HashMap map = new HashMap();
        map.put("flow", "Checkout");
        map.put("endpoint", abstractC13329b0M55601g.toString());
        this.crashHelper.trackTimedActionStart("BookingServiceUpdateAndSubmit", map);
        C13352x c13352xM55521i = null;
        try {
            c13352xM55521i = c13320cM55535y.m55521i();
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        int statusCode = ResponseUtils.getStatusCode(c13352xM55521i, e);
        List conversationIdHeader = ResponseUtils.getConversationIdHeader(c13352xM55521i, e);
        map.put("statusCode", Integer.valueOf(statusCode));
        if (!C9367d.m39170a(conversationIdHeader)) {
            map.put("conversationId", conversationIdHeader.get(0));
        }
        this.crashHelper.trackTimedActionUpdate("BookingServiceUpdateAndSubmit", map);
        if (e != null) {
            throw e;
        }
        TicketOrderResponse ticketOrderResponse = (TicketOrderResponse) c13352xM55521i.m55683c();
        if (ticketOrderResponse != null) {
            return ticketOrderResponse;
        }
        throw new IOException(String.format("HTTP response has status %s but body is empty", Integer.valueOf(c13352xM55521i.m55684d())));
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient
    public ContractResponse fetchContract(TicketOrderForm ticketOrderForm, BookingApiSession bookingApiSession, String str, String str2, ProductCategoryDetails productCategoryDetails) throws JsonParseException, IOException {
        BookingApiExpressCheckoutRequest bookingApiExpressCheckoutRequest = getBookingApiExpressCheckoutRequest(ticketOrderForm, bookingApiSession, str, productCategoryDetails);
        String orderId = bookingApiSession.getOrderId();
        String sessionId = ticketOrderForm.getSessionId();
        String str3 = String.format(this.ticketSalesEnvironment.getTicketSalesMonthlyContractUrl(), orderId);
        HttpApiClient.C13320c c13320cM55535y = this.httpApiClient.m55669d(str3, ContractResponse.class).m55672b().m55530t("Accept", "application/json").m55523m().m55526p(bookingApiExpressCheckoutRequest).m55530t("User-Agent", this.ticketSalesHttpHeader.getHttpHeader()).m55534x(new ConversationIdInterceptor(sessionId)).m55535y(new InterfaceC13334f.a());
        if (!C22466q.m68722b(str2)) {
            c13320cM55535y.m55530t("X-Disney-Internal-SystemDateOverride", str2);
        }
        AbstractC13329b0 abstractC13329b0M55601g = AbstractC13329b0.m55583s(str3).mo55584a().m55601g();
        HashMap map = new HashMap();
        map.put("flow", "Checkout");
        map.put("endpoint", abstractC13329b0M55601g.toString());
        this.crashHelper.trackTimedActionStart("ViewAndSignAgreementContactPreview", map);
        C13352x c13352xM55521i = null;
        try {
            c13352xM55521i = c13320cM55535y.m55521i();
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        int statusCode = ResponseUtils.getStatusCode(c13352xM55521i, e);
        List conversationIdHeader = ResponseUtils.getConversationIdHeader(c13352xM55521i, e);
        map.put("statusCode", Integer.valueOf(statusCode));
        if (!C9367d.m39170a(conversationIdHeader)) {
            map.put("conversationId", conversationIdHeader.get(0));
        }
        this.crashHelper.trackTimedActionUpdate("ViewAndSignAgreementContactPreview", map);
        if (e == null) {
            return (ContractResponse) c13352xM55521i.m55683c();
        }
        throw e;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient
    public TicketOrderResponse fetchOrder(String str, String str2, boolean z10, Calendar calendar, ProductCategoryType productCategoryType) throws IOException {
        String ticketSalesCreateOrderUrl = this.ticketSalesEnvironment.getTicketSalesCreateOrderUrl();
        String zuluDateStringForServiceRequest = this.dateFormatter.getZuluDateStringForServiceRequest(calendar);
        HttpApiClient.C13320c c13320cM55535y = this.httpApiClient.m55668c(ticketSalesCreateOrderUrl, TicketOrderResponse.class).m55672b().m55518f(str2).m55523m().m55530t("User-Agent", this.ticketSalesHttpHeader.getHttpHeader()).m55534x(new ConversationIdInterceptor(str)).m55535y(TicketOrderResponse.getDecoder(str, calendar, productCategoryType));
        if (!C22466q.m68722b(zuluDateStringForServiceRequest)) {
            c13320cM55535y.m55530t("X-Disney-Internal-SystemDateOverride", zuluDateStringForServiceRequest);
        }
        return (TicketOrderResponse) c13320cM55535y.m55521i().m55683c();
    }

    TicketSalesBookingApiClientImpl(C13345q c13345q, TicketSalesEnvironment ticketSalesEnvironment, ServiceDateFormatter serviceDateFormatter, C9314j c9314j, TicketSalesHttpHeader ticketSalesHttpHeader, InterfaceC8682n interfaceC8682n) {
        this.httpApiClient = c13345q;
        this.ticketSalesEnvironment = ticketSalesEnvironment;
        this.dateFormatter = serviceDateFormatter;
        this.parkAppConfiguration = c9314j;
        this.ticketSalesHttpHeader = ticketSalesHttpHeader;
        this.crashHelper = interfaceC8682n;
    }
}