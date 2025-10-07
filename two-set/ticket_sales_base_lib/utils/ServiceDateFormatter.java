package com.disney.wdpro.ticket_sales_base_lib.utils;

import com.disney.wdpro.commons.C9350r;
import com.google.common.base.C22462m;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: classes18.dex */
public class ServiceDateFormatter {
    private final C9350r serviceTime;

    public ServiceDateFormatter(C9350r c9350r) {
        this.serviceTime = (C9350r) C22462m.m68685q(c9350r, "serviceTime == null");
    }

    public String getServiceDateStringForServiceRequest(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormatM39105x = this.serviceTime.m39105x();
        simpleDateFormatM39105x.setTimeZone(calendar.getTimeZone());
        return simpleDateFormatM39105x.format(calendar.getTime());
    }

    public String getZuluDateStringForServiceRequest(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormatM39077F = this.serviceTime.m39077F();
        simpleDateFormatM39077F.setTimeZone(calendar.getTimeZone());
        return simpleDateFormatM39077F.format(calendar.getTime());
    }
}