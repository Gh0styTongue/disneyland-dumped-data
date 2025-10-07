package com.wdpr.p479ee.p480ra.rahybrid.util;

import com.wdpr.p479ee.p480ra.rahybrid.WhiteList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes21.dex */
public class URLMatchingUtil {
    public static boolean urlGivenMatchesWhiteList(String str, List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        WhiteList whiteList = new WhiteList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            whiteList.addWhiteListEntry(it.next());
        }
        return whiteList.isUrlWhiteListed(str);
    }
}