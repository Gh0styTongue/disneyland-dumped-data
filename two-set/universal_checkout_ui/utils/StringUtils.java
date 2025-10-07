package com.disney.wdpro.universal_checkout_ui.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes20.dex */
public class StringUtils {
    private StringUtils() {
        throw new UnsupportedOperationException();
    }

    public static String getHostAndFirstPath(String str) {
        Matcher matcher = Pattern.compile("^(.*)?://([^/]+)/([^/?]+).*$").matcher(str);
        if (!matcher.find()) {
            return str;
        }
        return matcher.group(2) + "/" + matcher.group(3);
    }

    public static String getStringWithoutLastCharacter(String str, String str2) {
        if (str == null) {
            return null;
        }
        return str.endsWith(str2) ? str.substring(0, str.length() - 1) : str;
    }

    public static boolean isDeepLinkValid(String str) {
        return Pattern.compile(com.disney.wdpro.ticketsandpasses.linking.utils.StringUtils.DEEP_LINK_REGEX).matcher(str).find();
    }
}