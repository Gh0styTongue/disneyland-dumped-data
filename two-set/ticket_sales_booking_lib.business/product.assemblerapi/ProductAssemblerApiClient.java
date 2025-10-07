package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.utils.C9367d;
import com.disney.wdpro.httpclient.AbstractC13329b0;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesEnvironment;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.httpclient.AppIdentifierInterceptor;
import com.disney.wdpro.ticket_sales_base_lib.business.httpclient.ConversationIdInterceptor;
import com.disney.wdpro.ticket_sales_base_lib.business.product.HeroImageResponse;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.utils.ServiceDateFormatter;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.TicketSalesHttpHeader;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.DscribeResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketAssemblerResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.utils.NewRelicConstants;
import com.disney.wdpro.ticket_sales_booking_lib.business.utils.ResponseUtils;
import com.google.common.base.C22456g;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;

/* loaded from: classes18.dex */
public class ProductAssemblerApiClient {
    private static final String DLR_STORE_ID = "dlr";
    private static final String FORMAT_HEADER_X_APP_ID = "%1$s-%2$s";
    private static final String HEADER_X_APP_ID = "x-app-id";
    private static final String HERO_IMAGE_PATH = "heroimages";
    private static final String HTTP_EXCEPTION = "HTTP response has status %s but body is empty";
    private static final String VERSION_PATH = "api/v1";
    private InterfaceC8682n crashHelper;
    private final ServiceDateFormatter dateFormatter;
    private final C13345q httpApiClient;
    private final C9314j parkAppConfiguration;
    private final TicketSalesEnvironment ticketSalesEnvironment;
    private final TicketSalesHttpHeader ticketSalesHttpHeader;
    private C9248i vendomatic;

    @Inject
    public ProductAssemblerApiClient(C13345q c13345q, TicketSalesEnvironment ticketSalesEnvironment, C9314j c9314j, TicketSalesHttpHeader ticketSalesHttpHeader, InterfaceC8682n interfaceC8682n, C9248i c9248i) {
        this(c13345q, ticketSalesEnvironment, new ServiceDateFormatter(new C9350r(TimeZone.getTimeZone("Zulu"), Locale.US)), c9314j, ticketSalesHttpHeader, interfaceC8682n, c9248i);
    }

    public String constructUrlForTicketSalesProduct(ProductCategoryType productCategoryType, DestinationId destinationId, WebStoreId webStoreId, List<String> list, boolean z10, boolean z11) {
        String ticketSalesLexVASExtUrl = this.vendomatic.m38678D0() ? this.ticketSalesEnvironment.getTicketSalesLexVASExtUrl() : this.ticketSalesEnvironment.getTicketSalesLexVASUrl();
        if (!z10) {
            ticketSalesLexVASExtUrl = this.ticketSalesEnvironment.getTicketSalesProductServiceUrl();
        }
        return ticketSalesLexVASExtUrl + "?storeId=" + webStoreId.getId() + "&destinationId=" + destinationId.getId() + "&category=" + productCategoryType.getId() + "&affiliations=" + C22456g.m68633k(",").m68637f(list) + "&requestorId=mobile&showOffers=" + z11;
    }

    public DscribeResponse getImportantOneDayTicketDetails() throws IOException {
        HttpApiClient.C13320c c13320cM55530t = this.httpApiClient.m55668c(this.ticketSalesEnvironment.getTicketSalesCmsUrl(), DscribeResponse.class).m55674d().m55530t("x-app-id", String.format(FORMAT_HEADER_X_APP_ID, this.ticketSalesEnvironment.getAuthzClientId(), this.parkAppConfiguration.m38906f()));
        AbstractC13329b0 abstractC13329b0M55601g = AbstractC13329b0.m55583s(this.ticketSalesEnvironment.getTicketSalesCmsUrl()).mo55584a().m55601g();
        HashMap map = new HashMap();
        map.put("endpoint", abstractC13329b0M55601g.toString());
        map.put("flow", "TicketSales");
        this.crashHelper.trackTimedActionStart(NewRelicConstants.ANALYTICS_FETCH_CMS, map);
        C13352x c13352xM55521i = null;
        try {
            c13352xM55521i = c13320cM55530t.m55521i();
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
        this.crashHelper.trackTimedActionUpdate(NewRelicConstants.ANALYTICS_FETCH_CMS, map);
        if (e != null) {
            throw e;
        }
        if (c13352xM55521i.m55683c() != null) {
            return (DscribeResponse) c13352xM55521i.m55683c();
        }
        throw new IOException(String.format(HTTP_EXCEPTION, Integer.valueOf(c13352xM55521i.m55684d())));
    }

    public TicketAssemblerResponse getTicketProducts(ProductCategoryType productCategoryType, DestinationId destinationId, WebStoreId webStoreId, List<String> list, String str, Calendar calendar, boolean z10, boolean z11) throws IOException {
        C22462m.m68685q(productCategoryType, "ProductCategory is required");
        C22462m.m68685q(webStoreId, "Web StoreId is required");
        C22462m.m68685q(list, "Affiliation is required");
        C22462m.m68685q(destinationId, "destinationId is required");
        String zuluDateStringForServiceRequest = this.dateFormatter.getZuluDateStringForServiceRequest(calendar);
        InterfaceC13334f.a aVar = new InterfaceC13334f.a(TicketAssemblerResponse.getGsonBuilder(webStoreId, str, calendar));
        String strConstructUrlForTicketSalesProduct = constructUrlForTicketSalesProduct(productCategoryType, destinationId, webStoreId, list, z10, z11);
        HttpApiClient.C13320c c13320cM55535y = this.httpApiClient.m55668c(strConstructUrlForTicketSalesProduct, TicketAssemblerResponse.class).m55674d().m55516d().m55534x(new ConversationIdInterceptor(str)).m55530t("User-Agent", this.ticketSalesHttpHeader.getHttpHeader()).m55534x(new AppIdentifierInterceptor(this.parkAppConfiguration.m38906f(), webStoreId)).m55535y(aVar);
        if (!C22466q.m68722b(zuluDateStringForServiceRequest)) {
            c13320cM55535y.m55530t("X-Disney-Internal-SystemDateOverride", zuluDateStringForServiceRequest);
        }
        HashMap map = new HashMap();
        map.put("endpoint", strConstructUrlForTicketSalesProduct);
        map.put("flow", "TicketSales");
        this.crashHelper.trackTimedActionStart("ProductTypes", map);
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
        this.crashHelper.trackTimedActionUpdate("ProductTypes", map);
        if (e != null) {
            throw e;
        }
        TicketAssemblerResponse ticketAssemblerResponse = (TicketAssemblerResponse) c13352xM55521i.m55683c();
        if (ticketAssemblerResponse != null) {
            return ticketAssemblerResponse;
        }
        throw new IOException(String.format(HTTP_EXCEPTION, Integer.valueOf(c13352xM55521i.m55684d())));
    }

    public HeroImageResponse getTicketSalesHeroImage() throws IOException {
        HttpApiClient.C13320c c13320cM55530t = this.httpApiClient.m55668c(this.ticketSalesEnvironment.getTicketCommerceScriptletUrl(), HeroImageResponse.class).m55674d().m55518f(VERSION_PATH).m55518f("dlr").m55518f(HERO_IMAGE_PATH).m55530t("x-app-id", String.format(FORMAT_HEADER_X_APP_ID, this.ticketSalesEnvironment.getAuthzClientId(), this.parkAppConfiguration.m38906f()));
        AbstractC13329b0 abstractC13329b0M55601g = AbstractC13329b0.m55583s(this.ticketSalesEnvironment.getTicketCommerceScriptletUrl()).mo55584a().m55596a(VERSION_PATH).m55596a("dlr").m55596a(HERO_IMAGE_PATH).m55601g();
        HashMap map = new HashMap();
        map.put("endpoint", abstractC13329b0M55601g.toString());
        map.put("flow", "TicketSales");
        this.crashHelper.trackTimedActionStart("HeroImages", map);
        C13352x c13352xM55521i = null;
        try {
            c13352xM55521i = c13320cM55530t.m55521i();
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
        this.crashHelper.trackTimedActionUpdate("HeroImages", map);
        if (e != null) {
            throw e;
        }
        if (c13352xM55521i.m55683c() != null) {
            return (HeroImageResponse) c13352xM55521i.m55683c();
        }
        throw new IOException(String.format(HTTP_EXCEPTION, Integer.valueOf(c13352xM55521i.m55684d())));
    }

    ProductAssemblerApiClient(C13345q c13345q, TicketSalesEnvironment ticketSalesEnvironment, ServiceDateFormatter serviceDateFormatter, C9314j c9314j, TicketSalesHttpHeader ticketSalesHttpHeader, InterfaceC8682n interfaceC8682n, C9248i c9248i) {
        this.httpApiClient = c13345q;
        this.ticketSalesEnvironment = ticketSalesEnvironment;
        this.dateFormatter = serviceDateFormatter;
        this.parkAppConfiguration = c9314j;
        this.ticketSalesHttpHeader = ticketSalesHttpHeader;
        this.crashHelper = interfaceC8682n;
        this.vendomatic = c9248i;
    }
}