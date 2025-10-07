package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public enum AffiliationType {
    STD_GST("STD_GST", "Standard Guest", null),
    FL_RESIDENT("FL_RESIDENT", "Florida Resident", "FL"),
    SOCAL_RESIDENT("SOCAL_RESIDENT", "Socal Resident", "CA"),
    CAL_RESIDENT("CAL_RESIDENT", "California Resident", "CA");

    private static final String JSON_KEY = "affiliations";
    private static final Map<String, AffiliationType> LOOKUP = Maps.m69381r();
    private static final String REQUEST_KEY = "affiliations";

    /* renamed from: id */
    private final String f43906id;
    private final String name;
    private final String stateOrProvinceCode;

    static {
        Iterator it = EnumSet.allOf(AffiliationType.class).iterator();
        while (it.hasNext()) {
            AffiliationType affiliationType = (AffiliationType) it.next();
            C22462m.m68691w(LOOKUP.put(affiliationType.getId(), affiliationType) == null, "id needs to be unique");
        }
    }

    AffiliationType(String str, String str2, String str3) {
        this.f43906id = str;
        this.name = str2;
        this.stateOrProvinceCode = str3;
    }

    public static AffiliationType findById(String str) {
        return LOOKUP.get(str);
    }

    public static String getJsonKey() {
        return "affiliations";
    }

    public static String getRequestKey() {
        return "affiliations";
    }

    public String getId() {
        return this.f43906id;
    }

    public String getName() {
        return this.name;
    }

    public String getStateOrProvinceCode() {
        return this.stateOrProvinceCode;
    }

    public boolean isRegionSpecificAffiliation() {
        return !C22466q.m68722b(this.stateOrProvinceCode);
    }
}