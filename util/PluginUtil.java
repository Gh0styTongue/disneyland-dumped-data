package com.wdpr.p479ee.p480ra.rahybrid.util;

import java.util.Map;

/* loaded from: classes21.dex */
public class PluginUtil {
    public static boolean getConfigBoolean(Map<String, Object> map, String str, boolean z10) {
        Object obj = map.get(str);
        return obj != null ? ((Boolean) obj).booleanValue() : z10;
    }

    public static String getConfigString(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}