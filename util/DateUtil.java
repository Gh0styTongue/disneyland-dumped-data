package com.wdpr.p479ee.p480ra.rahybrid.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes21.dex */
public class DateUtil {
    public static final String ISO_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm'Z'";
    public static final int TWENTY_FOUR_HRS_IN_MILLIS = 86400000;

    public static String getDateAsISOFormat(Date date) {
        if (date == null) {
            date = new Date();
        }
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_FORMAT_STRING, Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }
}