package com.disney.wdpro.general_ticket_sales_ui.p132ui.utils;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.utils.HybridUtilities;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.cookie.CookiePlugin;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes28.dex */
public class HybridUtilities {
    public static final String COMMAND_NAME_DISMISS_BUTTON = "AvailCalendarNavigationPlugin.dismissButton";
    public static final String ENTRY_POINT_RESERVATION_AVAIL_CALENDAR = "reservationAvailCalendar";
    public static final String KEY_NAME_DISMISS_BUTTON = "dismissButton";
    public static final String PLUGIN_NAME_AVAIL_CALENDAR_NAVIGATION = "AvailCalendarNavigationPlugin";

    private HybridUtilities() {
        throw new UnsupportedOperationException("Not instantiable class.");
    }

    /* renamed from: a */
    public static /* synthetic */ void m50236a(Boolean bool) {
    }

    public static void clearCookies(CookieManager cookieManager) {
        cookieManager.removeAllCookies(new ValueCallback() { // from class: vc.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                HybridUtilities.m50236a((Boolean) obj);
            }
        });
        cookieManager.flush();
    }

    private static List<EntryPointsConfig> createEntryPointsConfig(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
        entryPointsConfig.setId(str);
        if ("reservationAvailCalendar".equals(str)) {
            entryPointsConfig.setStartUrl(str2);
        }
        arrayList.add(entryPointsConfig);
        return arrayList;
    }

    public static HybridWebConfig createHybridWebConfig(String str, String str2) {
        HybridWebConfig hybridWebConfig = new HybridWebConfig();
        hybridWebConfig.setEntryPoints(createEntryPointsConfig(str, str2));
        hybridWebConfig.setPlugins(createPluginConfig());
        return hybridWebConfig;
    }

    private static List<PluginConfig> createPluginConfig() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PluginConfig("AnalyticsPlugin", null));
        arrayList.add(new PluginConfig(CookiePlugin.f71775ID, null));
        arrayList.add(new PluginConfig("AvailCalendarNavigationPlugin", null));
        return arrayList;
    }
}