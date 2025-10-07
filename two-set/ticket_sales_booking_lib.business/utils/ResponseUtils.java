package com.disney.wdpro.ticket_sales_booking_lib.business.utils;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes18.dex */
public class ResponseUtils {
    private static final int DEFAULT_STATUS_CODE = 0;

    private ResponseUtils() {
        throw new UnsupportedOperationException("Not instantiable class.");
    }

    public static List getConversationIdHeader(C13352x c13352x, IOException iOException) {
        Map<String, List<String>> headers;
        if (c13352x != null) {
            return c13352x.m55681a("X-Conversation-Id");
        }
        if (!(iOException instanceof UnSuccessStatusException) || (headers = ((UnSuccessStatusException) iOException).getHeaders()) == null) {
            return null;
        }
        return headers.get("X-Conversation-Id");
    }

    public static int getStatusCode(C13352x c13352x, IOException iOException) {
        if (c13352x != null) {
            return c13352x.m55684d();
        }
        if (iOException instanceof UnSuccessStatusException) {
            return ((UnSuccessStatusException) iOException).getStatusCode();
        }
        return 0;
    }
}