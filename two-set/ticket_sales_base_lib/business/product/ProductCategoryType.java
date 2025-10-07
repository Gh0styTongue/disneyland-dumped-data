package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsConstants;
import com.disney.wdpro.ticketsandpasses.linking.EntitlementLinkingConstants;
import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public enum ProductCategoryType {
    THEME_PARK_GENERAL_ADMISSIONS("ThemePark", "Theme Parks", "TktSales"),
    MEMORY_MAKER(EntitlementLinkingConstants.CATEGORY_MEMORY_MAKER, PhotoPassAnalyticsConstants.PHOTO_PASS_VALUE_EXPERIENCE, EntitlementLinkingConstants.CATEGORY_MEMORY_MAKER),
    PHOTO_PASS("PhotoPass", "Photo Pass", "PhotoPass"),
    MAX_PASS("MaxPass", "Max Pass", TicketSalesAnalyticsConstants.STANDALONE_FP_SALES_FLOW),
    ANNUAL_PASS_RENEWALS("AnnualPassRenewal", "Annual Pass Renewals Category", CheckoutConstants.AP_RENEWAL_LINK_CATEGORY),
    ANNUAL_PASS_UPGRADE("AnnualPass", "AnnualPass Category", CheckoutConstants.AP_UPGRADE_LINK_CATEGORY),
    ANNUAL_PASS_SALES("AnnualPass", "AnnualPass Category", "APSales");

    private static final String JSON_KEY = "category";
    private static final Map<String, ProductCategoryType> LOOKUP = Maps.m69381r();
    private static final String REQUEST_KEY = "category";
    private String analyticsLinkCategory;

    /* renamed from: id */
    private String f43912id;
    private String name;

    static {
        Iterator it = EnumSet.allOf(ProductCategoryType.class).iterator();
        while (it.hasNext()) {
            ProductCategoryType productCategoryType = (ProductCategoryType) it.next();
            if (LOOKUP.put(productCategoryType.getId(), productCategoryType) != null) {
                C22462m.m68691w(productCategoryType == ANNUAL_PASS_SALES || productCategoryType == ANNUAL_PASS_UPGRADE, "A previous productCategoryType is associated with product id[" + productCategoryType.getId() + "]. This is acceptable for only. Annual pass upgrades and Annual pass salesproducts.");
            }
        }
    }

    ProductCategoryType(String str, String str2, String str3) {
        this.f43912id = str;
        this.name = str2;
        this.analyticsLinkCategory = str3;
    }

    public static ProductCategoryType findById(String str) {
        return LOOKUP.get(str);
    }

    public static String getJsonKey() {
        return "category";
    }

    public static String getRequestKey() {
        return "category";
    }

    public String getAnalyticsLinkCategory() {
        return this.analyticsLinkCategory;
    }

    public String getId() {
        return this.f43912id;
    }

    public String getName() {
        return this.name;
    }
}