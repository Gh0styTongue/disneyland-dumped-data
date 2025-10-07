package com.disney.wdpro.geofence.util;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes28.dex */
public class CollectionUtils {
    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNullOrEmpty(Map map) {
        return map == null || map.isEmpty();
    }
}