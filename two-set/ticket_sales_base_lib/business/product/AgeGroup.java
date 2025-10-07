package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public enum AgeGroup {
    CHILD("child", 3, 9),
    ADULT("adult", 10, Integer.MAX_VALUE),
    SENIOR("senior", 65, Integer.MAX_VALUE),
    ALL_AGES("allAges", 3, Integer.MAX_VALUE);

    private static final String JSON_KEY = "ageGroup";
    private static final Map<String, AgeGroup> LOOKUP = Maps.m69381r();
    private final String category;
    private final Integer maxAge;
    private final Integer minAge;

    static {
        Iterator it = EnumSet.allOf(AgeGroup.class).iterator();
        while (it.hasNext()) {
            AgeGroup ageGroup = (AgeGroup) it.next();
            C22462m.m68691w(LOOKUP.put(ageGroup.getCategory(), ageGroup) == null, "ageGroup category needs to be unique");
        }
    }

    AgeGroup(String str, int i10, int i11) {
        this.category = str;
        this.minAge = Integer.valueOf(i10);
        this.maxAge = Integer.valueOf(i11);
    }

    public static AgeGroup findByCategory(String str) {
        return LOOKUP.get(str);
    }

    public static String getJsonKey() {
        return JSON_KEY;
    }

    public String getCategory() {
        return this.category;
    }

    public Integer getMaxAge() {
        return this.maxAge;
    }

    public Integer getMinAge() {
        return this.minAge;
    }
}