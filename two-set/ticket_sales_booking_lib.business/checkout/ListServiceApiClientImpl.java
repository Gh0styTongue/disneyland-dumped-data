package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.utils.C9367d;
import com.disney.wdpro.httpclient.AbstractC13329b0;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.ticket_sales_booking_lib.business.utils.ResponseUtils;
import com.google.common.base.C22466q;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes18.dex */
public class ListServiceApiClientImpl implements ListServiceApiClient {
    private InterfaceC8682n crashHelper;
    private final C13345q httpApiClient;
    private final ServiceBaseUrlApiClient serviceBaseUrlApiClient;

    public static class DirtyWordCheckRequest {
        private final String text;

        public DirtyWordCheckRequest(String str) {
            this.text = str;
        }
    }

    public static class DirtyWordCheckResponse {
        private boolean dirtyWordFound;
    }

    @Inject
    public ListServiceApiClientImpl(C13345q c13345q, ServiceBaseUrlApiClient serviceBaseUrlApiClient, InterfaceC8682n interfaceC8682n) {
        this.httpApiClient = c13345q;
        this.serviceBaseUrlApiClient = serviceBaseUrlApiClient;
        this.crashHelper = interfaceC8682n;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClient
    public boolean isDirtyWordFoundInText(String str) throws IOException {
        if (C22466q.m68722b(str)) {
            return false;
        }
        try {
            String serviceBaseUrl = this.serviceBaseUrlApiClient.getServiceBaseUrl();
            HttpApiClient.C13320c c13320cM55535y = this.httpApiClient.m55668c(serviceBaseUrl, DirtyWordCheckResponse.class).m55674d().m55516d().m55518f("lists-service/dirty-words/default/check").m55531u("text", str).m55523m().m55535y(new InterfaceC13334f.a());
            AbstractC13329b0 abstractC13329b0M55601g = AbstractC13329b0.m55583s(serviceBaseUrl).mo55584a().m55596a("lists-service/dirty-words/default/check").m55598c("text", str).m55601g();
            HashMap map = new HashMap();
            map.put("flow", "Checkout");
            map.put("endpoint", abstractC13329b0M55601g.toString());
            this.crashHelper.trackTimedActionStart("DirtyWordCheck", map);
            C13352x c13352xM55521i = null;
            try {
                e = null;
                c13352xM55521i = c13320cM55535y.m55521i();
            } catch (IOException e10) {
                e = e10;
            }
            int statusCode = ResponseUtils.getStatusCode(c13352xM55521i, e);
            List conversationIdHeader = ResponseUtils.getConversationIdHeader(c13352xM55521i, e);
            map.put("statusCode", Integer.valueOf(statusCode));
            if (!C9367d.m39170a(conversationIdHeader)) {
                map.put("conversationId", conversationIdHeader.get(0));
            }
            this.crashHelper.trackTimedActionUpdate("DirtyWordCheck", map);
            if (e != null) {
                throw e;
            }
            DirtyWordCheckResponse dirtyWordCheckResponse = (DirtyWordCheckResponse) c13352xM55521i.m55683c();
            if (dirtyWordCheckResponse != null) {
                return dirtyWordCheckResponse.dirtyWordFound;
            }
            throw new IOException(String.format("HTTP response has status %s but body is empty", Integer.valueOf(c13352xM55521i.m55684d())));
        } catch (Exception unused) {
            return false;
        }
    }
}