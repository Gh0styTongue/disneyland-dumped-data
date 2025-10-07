package com.disney.wdpro.ticket_sales_base_lib.utils;

import com.google.common.base.C22462m;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes18.dex */
public final class DateUtils {
    private static final String GMT_DATE_NO_OFFSET = "yyyy-MM-dd'T'HH:mm:ss";
    private static final int MONTH_BEGINNING = 0;
    private static final int MONTH_END = 11;

    private DateUtils() {
        throw new UnsupportedOperationException();
    }

    public static String getMonthForInt(int i10) {
        C22462m.m68685q(Integer.valueOf(i10), "month == null");
        C22462m.m68673e(i10 >= 0 && i10 <= 11, "invalid month");
        return new DateFormatSymbols().getMonths()[i10];
    }

    public static boolean isRequiredAge(Calendar calendar, int i10) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(calendar.getTimeZone());
        return isRequiredAge(calendar, calendar2, i10);
    }

    public static boolean isValidMonthIndex(int i10) {
        return i10 >= 0 && i10 <= 11;
    }

    public static long subtractDays(Calendar calendar, Calendar calendar2) {
        Calendar calendar3 = (Calendar) calendar2.clone();
        calendar3.set(11, calendar.get(11));
        calendar3.set(12, calendar.get(12));
        calendar3.set(13, calendar.get(13));
        calendar3.set(14, calendar.get(14));
        return TimeUnit.MILLISECONDS.toDays(calendar.getTimeInMillis() - calendar3.getTimeInMillis());
    }

    public static Calendar trimTime(Date date) {
        C22462m.m68684p(date);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        calendar.set(1, calendar2.get(1));
        calendar.set(2, calendar2.get(2));
        calendar.set(5, calendar2.get(5));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static boolean isRequiredAge(Calendar calendar, Calendar calendar2, int i10) {
        int i11 = calendar2.get(1) - calendar.get(1);
        if (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) {
            i11--;
        }
        return i11 >= i10;
    }
}