package com.wdpr.p479ee.p480ra.rahybrid.util;

import android.net.Uri;
import android.text.TextUtils;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointDetails;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public class UriUtil {
    public static EntryPointsConfig getEntryPointConfigWithUpdatedStartURL(EntryPointDetails entryPointDetails, List<EntryPointsConfig> list) {
        EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
        if (list != null) {
            Iterator<EntryPointsConfig> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EntryPointsConfig next = it.next();
                if (next.getId().equalsIgnoreCase(entryPointDetails.getEntryPointId())) {
                    entryPointsConfig = next;
                    break;
                }
            }
        }
        String startUrl = entryPointsConfig.getStartUrl();
        if (!TextUtils.isEmpty(startUrl) && entryPointDetails.getUrlTokens() != null) {
            startUrl = replaceTokensFromUrl(startUrl, entryPointDetails.getUrlTokens()).toString();
        }
        if (startUrl == null) {
            startUrl = "";
        }
        entryPointsConfig.setStartUrl(startUrl);
        return entryPointsConfig;
    }

    public static Uri replaceTokensFromUrl(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return Uri.parse(str);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str.replaceAll("\\{" + entry.getKey() + "\\}", entry.getValue());
        }
        return Uri.parse(str);
    }
}