package com.disney.wdpro.ticket_sales_base_lib.business.checkout;

import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public enum VisitDayName {
    GOOD_TO_GO("goodToGo"),
    BLOCKED_OUT("blockedOut");

    private static final Map<String, VisitDayName> LOOKUP = Maps.m69381r();

    /* renamed from: id */
    private final String f43902id;

    static {
        Iterator it = EnumSet.allOf(VisitDayName.class).iterator();
        while (it.hasNext()) {
            VisitDayName visitDayName = (VisitDayName) it.next();
            C22462m.m68691w(LOOKUP.put(visitDayName.getId(), visitDayName) == null, "id needs to be unique");
        }
    }

    VisitDayName(String str) {
        this.f43902id = str;
    }

    public static VisitDayName findById(String str) {
        return LOOKUP.get(str);
    }

    public String getId() {
        return this.f43902id;
    }
}