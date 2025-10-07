package com.wdpr.p479ee.p480ra.rahybrid.plugin;

import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.accesscontrol.AccessControlPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.cookie.CookiePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.geolocation.GeoLocationPermissionPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.header.HTTPHeaderPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents.PageEventsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes21.dex */
public class RAPluginFactory {
    public static List<Plugin> makePlugins(List<PluginConfig> list) {
        List listAsList = Arrays.asList(new PluginConfig(CookiePlugin.f71775ID, null), new PluginConfig(WebViewLifecyclePlugin.f71787ID, null), new PluginConfig(PageEventsPlugin.f71778ID, null), new PluginConfig("AnalyticsPlugin", null), new PluginConfig(PrintPlugin.f71779ID, null), new PluginConfig(HTTPHeaderPlugin.f71777ID, null), new PluginConfig(GeoLocationPermissionPlugin.f71776ID, null));
        ArrayList<PluginConfig> arrayList = new ArrayList();
        arrayList.addAll(listAsList);
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList();
        for (PluginConfig pluginConfig : arrayList) {
            String id2 = pluginConfig.getId();
            id2.getClass();
            switch (id2) {
                case "AccessControlPlugin":
                    arrayList2.add(new AccessControlPlugin(pluginConfig));
                    break;
                case "SSOPlugin":
                    arrayList2.add(new SSOPlugin(pluginConfig));
                    break;
                case "PageEventsPlugin":
                    arrayList2.add(new PageEventsPlugin(pluginConfig));
                    break;
                case "WebViewLifecyclePlugin":
                    arrayList2.add(new WebViewLifecyclePlugin(pluginConfig));
                    break;
                case "AnalyticsPlugin":
                    arrayList2.add(new WebAnalyticsPlugin(pluginConfig));
                    break;
                case "GeoLocationPermissionPlugin":
                    arrayList2.add(new GeoLocationPermissionPlugin(pluginConfig));
                    break;
                case "HTTPHeaderPlugin":
                    arrayList2.add(new HTTPHeaderPlugin(pluginConfig, null));
                    break;
                case "PrintPlugin":
                    arrayList2.add(new PrintPlugin(pluginConfig));
                    break;
                case "CookiePlugin":
                    arrayList2.add(new CookiePlugin(pluginConfig, null));
                    break;
            }
        }
        return arrayList2;
    }
}