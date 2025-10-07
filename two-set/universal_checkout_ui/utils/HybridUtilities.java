package com.disney.wdpro.universal_checkout_ui.utils;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.google.common.collect.Lists;
import com.wdpr.p479ee.p480ra.rahybrid.model.Bundle;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebContentSyncConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.ProxyConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.WebServerConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.header.HTTPHeaderPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes20.dex */
public class HybridUtilities {
    public static final String BUNDLE_HOST_NAME = "embedded.disney.go.com";
    private static final String BUNDLE_ID = "unified-checkout";
    private static final String BUNDLE_MANIFEST_NAME = "bundle-manifest.json";
    private static final String BUNDLE_PROXY_COM_SHARED = "/com-shared/";
    private static final String BUNDLE_PROXY_RESIZE = "/resize/";
    private static final String BUNDLE_PROXY_UC = "/uc/";
    private static final String BUNDLE_PROXY_UC_API = "/uc/api/";
    public static final String BUNDLE_SCHEME = "https";
    public static final String COMMAND_CLOSE_CLP = "DVICNavigationPlugin.dismissButton";
    public static final String COMMAND_CONFIRMATION_LOADED = "UCNavigationPlugin.ucConfirmationLoaded";
    public static final String COMMAND_NAME_BACK_BUTTON = "UCNavigationPlugin.backButton";
    public static final String COMMAND_NAME_CANCEL_BUTTON_CLICKED = "cancelButtonClicked";
    public static final String COMMAND_NAME_CONTINUE_BUTTON_CLICKED = "continueButtonClicked";
    public static final String COMMAND_NAME_DISMISS_BUTTON = "UCNavigationPlugin.dismissButton";
    public static final String COMMAND_NAME_SHOULD_SHOW_DISMISS_MODAL = "UCNavigationPlugin.shouldShowDismissModal";
    public static final String COMMAND_NAME_WEB_MODAL_CLOSED = "nativeBridgeNotification.webModalClosed";
    public static final String COMMAND_NAME_WEB_MODAL_OPENED = "nativeBridgeNotification.webModalOpened";
    public static final String COMMAND_OPEN_CHASE = "DVICNavigationPlugin.openChase";
    public static final String COMMAND_OPEN_INTERSTITIAL = "DVICNavigationPlugin.openInterstitial";
    public static final String COMMAND_PAYMENT_SHEET_FINISH = "UCNavigationPlugin.paymentSheetFinish";
    public static final String COMMAND_READY_FOR_REQUEST_ITEMS = "UCNavigationPlugin.readyForRequestItems";
    public static final String COMMAND_REQUEST_SECONDARY_LOGIN = "DVICNavigationPlugin.requestSecondaryLogin";
    public static final String COMMAND_SHOW_DVIC_CONTENT = "DVICNavigationPlugin.showDvicContent";
    public static final String COMMAND_SHOW_DVIC_LOGIN = "DVICNavigationPlugin.showLoginModal";
    public static final String DVIC_NAVIGATION_PLUGIN = "DVICNavigationPlugin";
    private static final String HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX = "loginUrlRegEx";
    private static final String HYBRID_SSO_CONFIG_KEY_RETURN_URL = "replaceReturnUrlKey";
    public static final String KEY_CALL_BACK_UC = "callbackUC";
    public static final String KEY_NAME_BACK_BUTTON = "backButton";
    public static final String KEY_NAME_CONFIRMATION_LOADED = "ucConfirmationLoaded";
    public static final String KEY_NAME_DISMISS_BUTTON = "dismissButton";
    public static final String KEY_NAME_OPEN_CHASE = "openChase";
    public static final String KEY_NAME_OPEN_INTERSTITIAL = "openInterstitial";
    public static final String KEY_NAME_PAYMENT_SHEET_FINISH = "paymentSheetFinish";
    public static final String KEY_NAME_READY_FOR_REQUEST_ITEMS = "readyForRequestItems";
    public static final String KEY_NAME_REQUEST_SECONDARY_LOGIN = "requestSecondaryLogin";
    public static final String KEY_NAME_SECONDARY_LOGIN_RESULT = "secondaryLoginResult";
    public static final String KEY_NAME_SHOULD_SHOW_DISMISS_MODAL = "shouldShowDismissModal";
    public static final String KEY_NAME_SHOW_DISMISS_MODAL = "showDismissModal";
    public static final String KEY_NAME_SHOW_DVIC_CONTENT = "showDvicContent";
    public static final String KEY_NAME_SHOW_DVIC_LOGIN = "showLoginModal";
    public static final String KEY_NAME_WEB_MODAL_CLOSED = "webModalClosed";
    public static final String KEY_NAME_WEB_MODAL_OPENED = "webModalOpened";
    public static final String NATIVE_BRIDGE_NOTIFICATION_PLUGIN = "nativeBridgeNotification";
    public static final String PARAM_KEY_CALL_BACK_TYPE = "callbackType";
    public static final String PARAM_KEY_ITEMS = "items";
    public static final String PARAM_VALUE_CHECKOUT_REQUEST_ITEMS = "checkoutRequestItems";
    public static final String PARAM_VALUE_SHOW_DISMISS_MODAL = "showDismissModal";
    public static final int READY_MESSAGE_TIMEOUT_SEC = 35;
    public static final String REQUIRE_PRINT_CONTEXT_NAME = "requirePrintContext";
    public static final String RETURN_URL = "/login/?returnUrl=";
    public static final String SSO_PLUGIN = "SSOPlugin";
    public static final int TIMEOUT_SEC = 30;
    public static final String UCNAVIGATION_PLUGIN = "UCNavigationPlugin";
    public static final String UCURL_MANAGER_PLUGIN = "UCUrlManagerPlugin";
    public static final String UCWEBVIEW_LIFECYCLE_PLUGIN = "UCWebViewLifecyclePlugin";

    /* renamed from: a */
    public static /* synthetic */ void m64822a(Boolean bool) {
    }

    public static void clearCookies(CookieManager cookieManager) {
        cookieManager.removeAllCookies(new ValueCallback() { // from class: com.disney.wdpro.universal_checkout_ui.utils.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                HybridUtilities.m64822a((Boolean) obj);
            }
        });
        cookieManager.flush();
    }

    public static Bundle createBundle(UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        Bundle bundle = new Bundle();
        bundle.setWebServerConfig(createWebServerConfig(universalCheckoutEnvironment.getWebBaseUrl()));
        bundle.setWebContentSyncConfig(createWebContentSyncConfig(universalCheckoutEnvironment.getUnifiedCheckoutRemoteManifestUrl()));
        return bundle;
    }

    public static List<EntryPointsConfig> createEntryPointsConfig(String str, UniversalCheckoutEnvironment universalCheckoutEnvironment, boolean z10, String str2, C9248i c9248i, boolean z11) {
        ArrayList arrayList = new ArrayList();
        EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
        if ("checkout-landing-page".equals(str)) {
            if (!c9248i.m38686G1() || createHybridWebConfigBundle(universalCheckoutEnvironment) == null || z11) {
                entryPointsConfig.setStartUrl(universalCheckoutEnvironment.getCheckoutLandingPageUrl());
            } else {
                entryPointsConfig.setStartUrl("https://embedded.disney.go.com/");
            }
            entryPointsConfig.setReloadStartUrlOnTokenUpdate(false);
            entryPointsConfig.setWebViewFinishTimeoutInSec(30);
            entryPointsConfig.setReadyMessageTimeoutInSec(35);
        } else if (Constants.DVIC_LANDING_PAGE_ENTRYPOINT.equals(str) || Constants.CHASE_LANDING_PAGE_ENTRYPOINT.equals(str)) {
            entryPointsConfig.setStartUrl(str2);
        }
        entryPointsConfig.setId(str);
        arrayList.add(entryPointsConfig);
        return arrayList;
    }

    public static HybridWebConfig createHybridWebConfig(String str, UniversalCheckoutEnvironment universalCheckoutEnvironment, boolean z10, List<PluginConfig> list, String str2, C9248i c9248i, boolean z11) {
        HybridWebConfig hybridWebConfig = new HybridWebConfig();
        hybridWebConfig.setEntryPoints(createEntryPointsConfig(str, universalCheckoutEnvironment, z10, str2, c9248i, z11));
        if (list == null) {
            list = createPluginConfig(universalCheckoutEnvironment, c9248i, str, z11);
        }
        hybridWebConfig.setPlugins(list);
        if ("checkout-landing-page".equals(str) && c9248i.m38686G1() && !z11) {
            hybridWebConfig.setBundle(createBundle(universalCheckoutEnvironment));
            hybridWebConfig.setId(BUNDLE_ID);
        }
        return hybridWebConfig;
    }

    public static HybridWebConfig createHybridWebConfigBundle(UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        HybridWebConfig hybridWebConfig = new HybridWebConfig();
        hybridWebConfig.setBundle(createBundle(universalCheckoutEnvironment));
        hybridWebConfig.setId(BUNDLE_ID);
        return hybridWebConfig;
    }

    public static List<PluginConfig> createPluginConfig(UniversalCheckoutEnvironment universalCheckoutEnvironment, C9248i c9248i, String str, boolean z10) {
        return createPluginConfig(universalCheckoutEnvironment, null, c9248i, str, z10);
    }

    private static List<ProxyConfig> createProxyConfigs(String str) {
        String stringWithoutLastCharacter = StringUtils.getStringWithoutLastCharacter(str, "/");
        ArrayList arrayListM69268i = Lists.m69268i();
        ProxyConfig proxyConfig = new ProxyConfig();
        proxyConfig.setPrefix(BUNDLE_PROXY_UC_API);
        proxyConfig.setUrl(stringWithoutLastCharacter + BUNDLE_PROXY_UC_API);
        arrayListM69268i.add(proxyConfig);
        ProxyConfig proxyConfig2 = new ProxyConfig();
        proxyConfig2.setPrefix(BUNDLE_PROXY_UC);
        proxyConfig2.setUrl(stringWithoutLastCharacter + BUNDLE_PROXY_UC);
        arrayListM69268i.add(proxyConfig2);
        ProxyConfig proxyConfig3 = new ProxyConfig();
        proxyConfig3.setPrefix(BUNDLE_PROXY_COM_SHARED);
        proxyConfig3.setUrl(stringWithoutLastCharacter + BUNDLE_PROXY_COM_SHARED);
        arrayListM69268i.add(proxyConfig3);
        return arrayListM69268i;
    }

    private static HybridWebContentSyncConfig createWebContentSyncConfig(String str) {
        HybridWebContentSyncConfig hybridWebContentSyncConfig = new HybridWebContentSyncConfig();
        hybridWebContentSyncConfig.setRemoteContentUrl(str);
        hybridWebContentSyncConfig.setLocalManifestName(BUNDLE_MANIFEST_NAME);
        return hybridWebContentSyncConfig;
    }

    private static WebServerConfig createWebServerConfig(String str) {
        WebServerConfig webServerConfig = new WebServerConfig();
        webServerConfig.setEnableDeepLinking(Boolean.TRUE);
        webServerConfig.setScheme("https");
        webServerConfig.setHostName(BUNDLE_HOST_NAME);
        webServerConfig.setProxyConfigs(createProxyConfigs(str));
        webServerConfig.setPreloadUrl(str + BUNDLE_PROXY_UC_API + "v1/healthcheck/");
        return webServerConfig;
    }

    public static EntryPointsConfig findEntryPointsConfig(String str, List<EntryPointsConfig> list) {
        for (EntryPointsConfig entryPointsConfig : list) {
            if (str.equals(entryPointsConfig.getId())) {
                return entryPointsConfig;
            }
        }
        return null;
    }

    private static boolean findPluginConfig(String str, List<PluginConfig> list) {
        Iterator<PluginConfig> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String findStartUrl(String str, List<EntryPointsConfig> list) {
        for (EntryPointsConfig entryPointsConfig : list) {
            if (str.equals(entryPointsConfig.getId())) {
                return entryPointsConfig.getStartUrl();
            }
        }
        return "";
    }

    public static boolean isCookieInjected(List<HttpCookie> list, String str) {
        Iterator<HttpCookie> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void removeDuplicateJwtCookies(List<HttpCookie> list) {
        Iterator<HttpCookie> it = list.iterator();
        while (it.hasNext()) {
            HttpCookie next = it.next();
            if (next.getName().equals("pep_jwt_token") || next.getName().equals("SESSION_TIMEOUT")) {
                it.remove();
            }
        }
    }

    public static List<PluginConfig> createPluginConfig(UniversalCheckoutEnvironment universalCheckoutEnvironment, List<PluginConfig> list, C9248i c9248i, String str, boolean z10) {
        ArrayList arrayListM69268i = Lists.m69268i();
        arrayListM69268i.add(new PluginConfig("UCNavigationPlugin", null));
        arrayListM69268i.add(new PluginConfig("UCUrlManagerPlugin", null));
        arrayListM69268i.add(new PluginConfig("UCWebViewLifecyclePlugin", null));
        arrayListM69268i.add(new PluginConfig("nativeBridgeNotification", null));
        arrayListM69268i.add(new PluginConfig("DVICNavigationPlugin", null));
        arrayListM69268i.add(new PluginConfig(HTTPHeaderPlugin.f71777ID, null));
        if (list == null || !findPluginConfig("SSOPlugin", list)) {
            HashMap map = new HashMap();
            if (!"checkout-landing-page".equals(str) || !c9248i.m38686G1() || createHybridWebConfigBundle(universalCheckoutEnvironment) == null || z10) {
                map.put(HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX, universalCheckoutEnvironment.getHybridLoginUrlRegEx());
            } else {
                map.put(HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX, "(^http.?://embedded.disney.go.com/login/(.*))");
            }
            map.put(HYBRID_SSO_CONFIG_KEY_RETURN_URL, "/login/?returnUrl=");
            arrayListM69268i.add(new PluginConfig("SSOPlugin", map));
        }
        if (list == null || !findPluginConfig("AnalyticsPlugin", list)) {
            arrayListM69268i.add(new PluginConfig("AnalyticsPlugin", null));
        }
        HashMap map2 = new HashMap();
        map2.put(REQUIRE_PRINT_CONTEXT_NAME, Boolean.TRUE);
        arrayListM69268i.add(new PluginConfig(PrintPlugin.f71779ID, map2));
        return arrayListM69268i;
    }

    public static HybridWebConfig createHybridWebConfig(String str, UniversalCheckoutEnvironment universalCheckoutEnvironment, boolean z10, C9248i c9248i, boolean z11) {
        return createHybridWebConfig(str, universalCheckoutEnvironment, z10, null, "", c9248i, z11);
    }
}