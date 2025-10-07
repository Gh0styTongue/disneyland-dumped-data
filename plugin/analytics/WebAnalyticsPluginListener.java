package com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics;

import java.util.Map;

/* loaded from: classes21.dex */
public interface WebAnalyticsPluginListener {
    @Deprecated
    default void onReceivedData(WebAnalyticsPlugin webAnalyticsPlugin, String str) {
    }

    void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map);

    void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map);
}