package com.disney.wdpro.ticket_sales_base_lib.business.httpclient;

import com.disney.wdpro.httpclient.InterfaceC13351w;
import com.disney.wdpro.httpclient.Request;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.google.common.base.C22466q;

/* loaded from: classes18.dex */
public class AppIdentifierInterceptor implements InterfaceC13351w {
    private static final String APP_VERSION_HEADER_KEY = "appVersion";
    private static final String WDW_STRING = "WDW-MDX-ANDROID-%s";
    private String appIdentifier;

    public AppIdentifierInterceptor(String str, WebStoreId webStoreId) {
        this.appIdentifier = null;
        if (!WebStoreId.WDW_MOBILE.equals(webStoreId) || C22466q.m68722b(str)) {
            return;
        }
        this.appIdentifier = String.format(WDW_STRING, str);
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13351w
    public void intercept(Request<?> request) {
        if (C22466q.m68722b(this.appIdentifier)) {
            return;
        }
        request.m55548k("appVersion", this.appIdentifier);
    }
}