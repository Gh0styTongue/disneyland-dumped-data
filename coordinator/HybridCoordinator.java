package com.wdpr.p479ee.p480ra.rahybrid.coordinator;

import com.wdpr.p479ee.p480ra.rahybrid.CustomWebViewClient;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridFragment;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.accesscontrol.AccessControlPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.cookie.CookiePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.geolocation.GeoLocationPermissionPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents.PageEventsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;
import com.wdpr.p479ee.p480ra.rahybrid.util.CookiesAndHeadersUtil;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import com.wdpr.p479ee.p480ra.rahybrid.util.UriUtil;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public class HybridCoordinator {
    public static final String TAG = "HybridCoordinator";
    private HybridWebConfig config;
    private EntryPointsConfig currentEntryPointConfig;
    private HybridFragment hybridFragment;
    private PluginStore pluginStore;

    public HybridCoordinator(HybridFragment hybridFragment, PluginStore pluginStore, HybridWebConfig hybridWebConfig) {
        this.hybridFragment = hybridFragment;
        this.pluginStore = pluginStore;
        this.config = hybridWebConfig;
    }

    private void loadUrl(EntryPointsConfig entryPointsConfig) {
        boolean zShouldRequireSSO = entryPointsConfig.shouldRequireSSO();
        final boolean zShouldReloadStartUrlOnTokenUpdate = entryPointsConfig.shouldReloadStartUrlOnTokenUpdate();
        SSOPlugin sSOPlugin = getSSOPlugin();
        if (sSOPlugin != null) {
            sSOPlugin.setEntryPointsConfig(entryPointsConfig);
        }
        if (zShouldRequireSSO && sSOPlugin != null && sSOPlugin.getJwt() == null) {
            RAHybridLog.m85711d(TAG, "Request token from SSOPlugin");
            sSOPlugin.addSSOTokenUpdateListener(new SSOPlugin.SSOTokenUpdateListener() { // from class: com.wdpr.ee.ra.rahybrid.coordinator.HybridCoordinator.1
                @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
                public void onTokenUpdateFailure(SSOPlugin sSOPlugin2, String str) {
                    RAHybridLog.m85712e(HybridCoordinator.TAG, "onTokenUpdateFailure() requiresSSO : " + str);
                }

                @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
                public void onTokenUpdateReady(SSOPlugin sSOPlugin2, EntryPointsConfig entryPointsConfig2) {
                    RAHybridLog.m85711d(HybridCoordinator.TAG, "onTokenUpdateReady() requiresSSO startUri : " + entryPointsConfig2.getStartUrl());
                }

                @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
                public void onTokenUpdateSuccess(SSOPlugin sSOPlugin2, EntryPointsConfig entryPointsConfig2) {
                    if (HybridCoordinator.this.hybridFragment.getInteractor() != null && HybridCoordinator.this.hybridFragment.getInteractor().getNavigationInteractor() != null && HybridCoordinator.this.hybridFragment.getInteractor().getNavigationInteractor().getWebViewBridge() != null) {
                        ((CustomWebViewClient) HybridCoordinator.this.hybridFragment.getInteractor().getNavigationInteractor().getWebViewBridge().getWebViewClient()).setEntryPointsConfig(entryPointsConfig2);
                    }
                    List<HttpCookie> listGatherCookies = CookiesAndHeadersUtil.gatherCookies(HybridCoordinator.this.pluginStore);
                    Map<String, String> mapGatherHTTPHeaders = CookiesAndHeadersUtil.gatherHTTPHeaders(HybridCoordinator.this.pluginStore);
                    if (zShouldReloadStartUrlOnTokenUpdate) {
                        RAHybridLog.m85711d(HybridCoordinator.TAG, "onTokenUpdateSuccess() requiresSSO : Loading cookies and Redirecting to " + entryPointsConfig2.getStartUrl());
                        HybridCoordinator.this.hybridFragment.loadUrl(entryPointsConfig2, listGatherCookies, mapGatherHTTPHeaders);
                        return;
                    }
                    RAHybridLog.m85711d(HybridCoordinator.TAG, "onTokenUpdateSuccess() requiresSSO : Loading cookies for " + entryPointsConfig2.getStartUrl());
                    HybridCoordinator.this.hybridFragment.loadCookies(entryPointsConfig2, listGatherCookies);
                }
            });
            sSOPlugin.requestToken();
            return;
        }
        RAHybridLog.m85711d(TAG, "loadUrl() entryPointsConfig : " + entryPointsConfig.toString());
        if (this.hybridFragment.getInteractor() != null && this.hybridFragment.getInteractor().getNavigationInteractor() != null && this.hybridFragment.getInteractor().getNavigationInteractor().getWebViewBridge() != null) {
            ((CustomWebViewClient) this.hybridFragment.getInteractor().getNavigationInteractor().getWebViewBridge().getWebViewClient()).setEntryPointsConfig(entryPointsConfig);
        }
        this.hybridFragment.loadUrl(entryPointsConfig, CookiesAndHeadersUtil.gatherCookies(this.pluginStore), CookiesAndHeadersUtil.gatherHTTPHeaders(this.pluginStore));
    }

    public AccessControlPlugin getAccessControlPlugin() {
        return (AccessControlPlugin) getPlugin(AccessControlPlugin.f71773ID);
    }

    public CookiePlugin getCookiePlugin() {
        return (CookiePlugin) getPlugin(CookiePlugin.f71775ID);
    }

    public EntryPointsConfig getCurrentEntryPointConfig() {
        if (this.currentEntryPointConfig == null) {
            EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
            this.currentEntryPointConfig = entryPointsConfig;
            entryPointsConfig.setStartUrl("");
        }
        return this.currentEntryPointConfig;
    }

    public GeoLocationPermissionPlugin getGeoLocationPermissionPlugin() {
        return (GeoLocationPermissionPlugin) getPlugin(GeoLocationPermissionPlugin.f71776ID);
    }

    public HybridFragment getHybridFragment() {
        return this.hybridFragment;
    }

    public PageEventsPlugin getPageEventsPlugin() {
        return (PageEventsPlugin) getPlugin(PageEventsPlugin.f71778ID);
    }

    public Plugin getPlugin(String str) {
        return this.pluginStore.getPlugin(str);
    }

    public SSOPlugin getSSOPlugin() {
        return (SSOPlugin) getPlugin("SSOPlugin");
    }

    public WebAnalyticsPlugin getWebAnalyticsPlugin() {
        return (WebAnalyticsPlugin) getPlugin("AnalyticsPlugin");
    }

    public WebViewLifecyclePlugin getWebViewLifecyclePlugin() {
        return (WebViewLifecyclePlugin) getPlugin(WebViewLifecyclePlugin.f71787ID);
    }

    public void load(String str, Map<String, String> map) {
        Iterator<EntryPointsConfig> it = this.config.getEntryPoints().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EntryPointsConfig next = it.next();
            if (next.getId().equals(str)) {
                this.currentEntryPointConfig = next;
                break;
            }
        }
        EntryPointsConfig entryPointsConfig = this.currentEntryPointConfig;
        if (entryPointsConfig != null) {
            this.currentEntryPointConfig.setStartUrl(UriUtil.replaceTokensFromUrl(entryPointsConfig.getStartUrl(), map).toString());
            loadUrl(this.currentEntryPointConfig);
        }
    }

    public void setHybridFragment(HybridFragment hybridFragment) {
        this.hybridFragment = hybridFragment;
    }
}