package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public enum AddOnOption {
    PARK_HOPPER("park-hopper", "Park Hopper"),
    PARK_HOPPER_PLUS("park-hopper-plus", "Park Hopper Plus"),
    MAX_PASS("maxpass", "Max Pass"),
    WATER_PARKS_FUN_MORE("water-parks-fun-more", "Water Parks Fun More");

    private static final String JSON_KEY = "addOns";
    private static final Map<String, AddOnOption> LOOKUP = Maps.m69381r();

    /* renamed from: id */
    private final String f43905id;
    private final String name;

    static {
        Iterator it = EnumSet.allOf(AddOnOption.class).iterator();
        while (it.hasNext()) {
            AddOnOption addOnOption = (AddOnOption) it.next();
            C22462m.m68691w(LOOKUP.put(addOnOption.getId(), addOnOption) == null, "id needs to be unique");
        }
    }

    AddOnOption(String str, String str2) {
        this.f43905id = str;
        this.name = str2;
    }

    public static AddOnOption findById(String str) {
        return LOOKUP.get(str);
    }

    public static String getJsonKey() {
        return "addOns";
    }

    public String getId() {
        return this.f43905id;
    }

    public String getName() {
        return this.name;
    }
}