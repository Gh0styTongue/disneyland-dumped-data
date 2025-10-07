package com.wdpr.p479ee.p480ra.rahybrid.util;

import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.CookieInjectable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.HTTPHeaderInjectable;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* loaded from: classes21.dex */
public class CookiesAndHeadersUtil {
    private static final String TAG = "CookiesAndHeadersUtil";

    public static String buildCookieString(HttpCookie httpCookie) {
        String str = httpCookie.getName() + "=" + httpCookie.getValue() + "; path=" + httpCookie.getPath() + "; domain=" + httpCookie.getDomain();
        if (!httpCookie.getSecure()) {
            return str;
        }
        return str + "; secure";
    }

    public static List<Cookie> convertHTTPCookieToOKHTTPCookie(HttpUrl httpUrl, List<HttpCookie> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<HttpCookie> it = list.iterator();
        while (it.hasNext()) {
            String strBuildCookieString = buildCookieString(it.next());
            Cookie cookie = Cookie.parse(httpUrl, strBuildCookieString);
            if (cookie != null) {
                arrayList.add(cookie);
            } else {
                RAHybridLog.m85716w(TAG, String.format("convertHTTPCookieToOKHTTPCookie(): Error parsing %s to new okHttpCookie", strBuildCookieString));
            }
        }
        return arrayList;
    }

    public static List<HttpCookie> gatherCookies(PluginStore pluginStore) {
        List<HttpCookie> cookies;
        ArrayList arrayList = new ArrayList();
        for (Object obj : pluginStore.getPlugins()) {
            if ((obj instanceof CookieInjectable) && (cookies = ((CookieInjectable) obj).getCookies()) != null && cookies.size() > 0) {
                for (HttpCookie httpCookie : cookies) {
                    if (httpCookie != null && !arrayList.contains(httpCookie)) {
                        arrayList.add(httpCookie);
                    }
                }
            }
        }
        return arrayList;
    }

    public static Map<String, String> gatherHTTPHeaders(PluginStore pluginStore) {
        Map<String, String> hTTPHeaders;
        HashMap map = new HashMap();
        for (Object obj : pluginStore.getPlugins()) {
            if ((obj instanceof HTTPHeaderInjectable) && (hTTPHeaders = ((HTTPHeaderInjectable) obj).getHTTPHeaders()) != null && hTTPHeaders.size() > 0) {
                map.putAll(hTTPHeaders);
            }
        }
        return map;
    }
}