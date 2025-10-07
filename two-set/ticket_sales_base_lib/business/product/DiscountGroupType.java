package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public enum DiscountGroupType {
    STD_GST("STD_GST", "Standard Guest"),
    FL_RESIDENT("FL_RESIDENT", "Florida Resident");

    private static final String JSON_KEY = "discountGroups";
    private static final Map<String, DiscountGroupType> LOOKUP = Maps.m69381r();

    /* renamed from: id */
    private final String f43907id;
    private final String name;

    static {
        Iterator it = EnumSet.allOf(DiscountGroupType.class).iterator();
        while (it.hasNext()) {
            DiscountGroupType discountGroupType = (DiscountGroupType) it.next();
            C22462m.m68691w(LOOKUP.put(discountGroupType.getDiscountGroupId(), discountGroupType) == null, "id needs to be unique");
        }
    }

    DiscountGroupType(String str, String str2) {
        this.f43907id = str;
        this.name = str2;
    }

    public static DiscountGroupType findById(String str) {
        return LOOKUP.get(str);
    }

    public static String getJsonKey() {
        return JSON_KEY;
    }

    public String getDiscountGroupId() {
        return this.f43907id;
    }

    public String getName() {
        return this.name;
    }
}