package com.disney.wdpro.ticket_sales_base_lib.business;

import com.disney.wdpro.recommender.core.RecommenderConstants;
import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import com.onetrust.otpublishers.headless.Public.OTCCPAGeolocationConstants;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public enum WebStoreId {
    WDW_MOBILE("wdw_mobile", OTCCPAGeolocationConstants.f54768US),
    DLR_MOBILE(RecommenderConstants.SITE_ID_DLR, OTCCPAGeolocationConstants.f54768US);

    private static final Map<String, WebStoreId> LOOKUP = Maps.m69381r();
    private static final String REQUEST_KEY = "storeId";
    private final String region;
    private final String webStoreId;

    static {
        Iterator it = EnumSet.allOf(WebStoreId.class).iterator();
        while (it.hasNext()) {
            WebStoreId webStoreId = (WebStoreId) it.next();
            C22462m.m68691w(LOOKUP.put(webStoreId.getId(), webStoreId) == null, "webstore id needs to be unique");
        }
    }

    WebStoreId(String str, String str2) {
        this.webStoreId = str;
        this.region = str2;
    }

    public static WebStoreId findById(String str) {
        WebStoreId webStoreId = LOOKUP.get(str);
        if (webStoreId == null) {
            return null;
        }
        return webStoreId;
    }

    public static String getRequestKey() {
        return "storeId";
    }

    public static boolean isDLR(WebStoreId webStoreId) {
        return webStoreId == DLR_MOBILE;
    }

    public static boolean isWDW(WebStoreId webStoreId) {
        return webStoreId == WDW_MOBILE;
    }

    public String getId() {
        return this.webStoreId;
    }

    public String getRegion() {
        return this.region;
    }
}