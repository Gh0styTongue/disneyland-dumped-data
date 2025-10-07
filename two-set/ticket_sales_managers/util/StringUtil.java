package com.disney.wdpro.ticket_sales_managers.util;

import android.text.SpannableStringBuilder;

/* loaded from: classes19.dex */
public final class StringUtil {
    private StringUtil() {
    }

    public static String createBulletedList(String[] strArr, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String str2 : strArr) {
            spannableStringBuilder.append((CharSequence) str).append((CharSequence) "  ").append((CharSequence) str2);
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) "\n");
        }
        return spannableStringBuilder.toString();
    }

    public static String createList(String[] strArr, String str, String str2, String str3, String str4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String str5 : strArr) {
            if (str5.contains(str4)) {
                spannableStringBuilder.append((CharSequence) (str2 + str3 + str5.replace(str4, "")));
            } else {
                spannableStringBuilder.append((CharSequence) str5);
                spannableStringBuilder.append((CharSequence) str);
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder.toString();
    }
}