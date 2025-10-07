package com.disney.wdpro.ticket_sales_base_lib.utils;

/* loaded from: classes18.dex */
public final class StringUtils {
    private StringUtils() {
        throw new UnsupportedOperationException();
    }

    public static String separate(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }
}