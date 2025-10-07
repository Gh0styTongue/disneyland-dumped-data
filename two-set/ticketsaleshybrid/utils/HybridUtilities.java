package com.disney.wdpro.ticketsaleshybrid.utils;

import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.couchbase.lite.internal.core.C4Replicator;
import com.disney.wdpro.ticketsaleshybrid.p452ui.Settings.TicketSalesAndroidHybridEnvironment;
import com.disney.wdpro.ticketsaleshybrid.utils.HybridUtilities;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import java.net.HttpCookie;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020$J\u0018\u0010%\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020$J*\u0010%\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020$2\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010 J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010#\u001a\u00020$J \u0010*\u001a\u0004\u0018\u00010!2\b\u0010+\u001a\u0004\u0018\u00010\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020!0 J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0004H\u0002J*\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020&2\u0006\u0010#\u001a\u00020$H\u0002J\u0014\u00104\u001a\u00020\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u00020706J\u000e\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020:J\u001e\u0010;\u001a\u00020\u001c2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002070 2\u0006\u00101\u001a\u000202H\u0002J2\u0010=\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020&2\u0006\u0010#\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000¨\u0006?"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/utils/HybridUtilities;", "", "()V", "CALLBACK_TIX_SALES", "", "COMMAND_NAME_TICKET_MODS_DISMISS_BUTTON", "COMMAND_NAME_TICKET_SALES_DISMISS_BUTTON", "COMMAND_NAME_TICKET_SALES_TRIGGER_NAVIGATION_ANALYTICS", "DATE_TIME_ISO_FORMAT", "HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX", "HYBRID_SSO_CONFIG_KEY_RETURN_URL", "JWT_COOKIE_NAME", "KEY_NAME_DISMISS_BUTTON", "KEY_NAME_TRIGGER_NAVIGATION_ANALYTICS", "LOADER_NATIVE", "LOGGER_PLUGIN", "LOGIN_DID_FAIL", "NATIVE_BACK_BUTTON_EVENT", "RETURN_URL", "SASPA_PLUGIN", "SSO_PLUGIN", "TICKET_MODS_HYBRID_NAVIGATION_PLUGIN", "TICKET_SALES_HYBRID_NAVIGATION_PLUGIN", "TICKET_SALES_HYBRID_WEB_VIEW_LIFECYCLE_PLUGIN", "TIMEOUT_COOKIE_NAME", "TIMEOUT_INTERVAL", "", "clearCookies", "", "cookieManager", "Landroid/webkit/CookieManager;", "createEntryPointsConfig", "", "Lcom/wdpr/ee/ra/rahybrid/model/EntryPointsConfig;", "targetEntryPoint", "environment", "Lcom/disney/wdpro/ticketsaleshybrid/ui/Settings/TicketSalesAndroidHybridEnvironment;", "createHybridWebConfig", "Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "plugins", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "createPluginConfig", "findEntryPointsConfig", "entryPointId", "entryPointsConfigs", "notifyErrorToSSOTokenUpdateListeners", "ssoErrorType", "notifySuccessToSSOTokenUpdateListeners", "entryPoint", "coordinator", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "config", "removeDuplicateJwtCookies", "cookieList", "", "Ljava/net/HttpCookie;", "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "setCookiesForSSO", C4Replicator.REPLICATOR_OPTION_COOKIES, "setCookiesIfJWTNotNullAndNotifySuccess", "jwt", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class HybridUtilities {
    public static final String CALLBACK_TIX_SALES = "callbackTixSales";
    public static final String COMMAND_NAME_TICKET_MODS_DISMISS_BUTTON = "TixModsNavigationPlugin.dismissButton";
    public static final String COMMAND_NAME_TICKET_SALES_DISMISS_BUTTON = "TixSalesNavigationPlugin.dismissButton";
    public static final String COMMAND_NAME_TICKET_SALES_TRIGGER_NAVIGATION_ANALYTICS = "TixSalesNavigationPlugin.triggerNavigationAnalytics";
    private static final String DATE_TIME_ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final String HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX = "loginUrlRegEx";
    private static final String HYBRID_SSO_CONFIG_KEY_RETURN_URL = "replaceReturnUrlKey";
    public static final HybridUtilities INSTANCE = new HybridUtilities();
    private static final String JWT_COOKIE_NAME = "pep_jwt_token";
    public static final String KEY_NAME_DISMISS_BUTTON = "dismissButton";
    public static final String KEY_NAME_TRIGGER_NAVIGATION_ANALYTICS = "triggerNavigationAnalytics";
    public static final String LOADER_NATIVE = "?loader=native";
    public static final String LOGGER_PLUGIN = "LoggerPlugin.log";
    public static final String LOGIN_DID_FAIL = "{\"callbackType\": \"loginDidFail\"}";
    public static final String NATIVE_BACK_BUTTON_EVENT = "{\"callbackType\": \"nativeBackButtonEvent\"}";
    public static final String RETURN_URL = "/login/?returnUrl=";
    public static final String SASPA_PLUGIN = "SASpaPlugin";
    public static final String SSO_PLUGIN = "SSOPlugin";
    public static final String TICKET_MODS_HYBRID_NAVIGATION_PLUGIN = "TixModsNavigationPlugin";
    public static final String TICKET_SALES_HYBRID_NAVIGATION_PLUGIN = "TixSalesNavigationPlugin";
    public static final String TICKET_SALES_HYBRID_WEB_VIEW_LIFECYCLE_PLUGIN = "TicketSalesHybridWebViewLifecyclePlugin";
    private static final String TIMEOUT_COOKIE_NAME = "SESSION_TIMEOUT";
    private static final int TIMEOUT_INTERVAL = 1800;

    private HybridUtilities() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearCookies$lambda$0(Boolean bool) {
    }

    private final void notifyErrorToSSOTokenUpdateListeners(String ssoErrorType) {
        runOnUIThread(new Runnable() { // from class: no.a
            @Override // java.lang.Runnable
            public final void run() {
                HybridUtilities.notifyErrorToSSOTokenUpdateListeners$lambda$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyErrorToSSOTokenUpdateListeners$lambda$3() {
    }

    private final void notifySuccessToSSOTokenUpdateListeners(final String entryPoint, final HybridCoordinator coordinator, final HybridWebConfig config, final TicketSalesAndroidHybridEnvironment environment) {
        runOnUIThread(new Runnable() { // from class: no.c
            @Override // java.lang.Runnable
            public final void run() {
                HybridUtilities.notifySuccessToSSOTokenUpdateListeners$lambda$2(entryPoint, config, environment, coordinator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifySuccessToSSOTokenUpdateListeners$lambda$2(String str, HybridWebConfig config, TicketSalesAndroidHybridEnvironment environment, HybridCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(environment, "$environment");
        Intrinsics.checkNotNullParameter(coordinator, "$coordinator");
        HybridUtilities hybridUtilities = INSTANCE;
        List<EntryPointsConfig> entryPoints = config.getEntryPoints();
        Intrinsics.checkNotNullExpressionValue(entryPoints, "config.entryPoints");
        EntryPointsConfig entryPointsConfigFindEntryPointsConfig = hybridUtilities.findEntryPointsConfig(str, entryPoints);
        if (entryPointsConfigFindEntryPointsConfig == null && Intrinsics.areEqual(Constants.TICKET_SALES_ENTRYPOINT, str)) {
            EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
            entryPointsConfig.setStartUrl(environment.getTicketSalesListPageUrl());
            if (coordinator.getSSOPlugin() != null) {
                coordinator.getSSOPlugin().setEntryPointsConfig(entryPointsConfig);
            }
        } else if (entryPointsConfigFindEntryPointsConfig == null && Intrinsics.areEqual("TixModsNavigationPlugin", str)) {
            EntryPointsConfig entryPointsConfig2 = new EntryPointsConfig();
            entryPointsConfig2.setStartUrl(environment.getTicketModsPageUrl());
            if (coordinator.getSSOPlugin() != null) {
                coordinator.getSSOPlugin().setEntryPointsConfig(entryPointsConfig2);
            }
        }
        coordinator.load(str, null);
    }

    private final void setCookiesForSSO(List<HttpCookie> cookies, HybridCoordinator coordinator) {
        List<HttpCookie> cookies2 = coordinator.getCookiePlugin().getCookies();
        if (cookies2 == null) {
            cookies2 = Lists.m69268i();
        }
        if (cookies2 != null) {
            removeDuplicateJwtCookies(cookies2);
            cookies2.addAll(cookies);
            if (coordinator.getSSOPlugin() != null) {
                coordinator.getSSOPlugin().setCookies(cookies2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCookiesIfJWTNotNullAndNotifySuccess$lambda$1(String str, HybridCoordinator coordinator, String str2, HybridWebConfig config, TicketSalesAndroidHybridEnvironment environment) {
        Intrinsics.checkNotNullParameter(coordinator, "$coordinator");
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(environment, "$environment");
        if (!android.text.TextUtils.isEmpty(str)) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, TIMEOUT_INTERVAL);
            String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(calendar.getTime());
            ArrayList arrayListM69268i = Lists.m69268i();
            Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
            arrayListM69268i.add(new HttpCookie("pep_jwt_token", str));
            arrayListM69268i.add(new HttpCookie("SESSION_TIMEOUT", str3));
            INSTANCE.setCookiesForSSO(arrayListM69268i, coordinator);
        }
        INSTANCE.notifySuccessToSSOTokenUpdateListeners(str2, coordinator, config, environment);
    }

    public final void clearCookies(CookieManager cookieManager) {
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        cookieManager.removeAllCookies(new ValueCallback() { // from class: no.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                HybridUtilities.clearCookies$lambda$0((Boolean) obj);
            }
        });
        cookieManager.flush();
    }

    public final List<EntryPointsConfig> createEntryPointsConfig(String targetEntryPoint, TicketSalesAndroidHybridEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        ArrayList arrayList = new ArrayList();
        EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
        if (Intrinsics.areEqual(targetEntryPoint, Constants.TICKET_SALES_ENTRYPOINT)) {
            entryPointsConfig.setStartUrl(environment.getTicketSalesListPageUrl() + "?loader=native");
        } else if (Intrinsics.areEqual(targetEntryPoint, Constants.TICKET_MODS_ENTRYPOINT)) {
            entryPointsConfig.setStartUrl(environment.getTicketModsPageUrl());
        }
        if (!C22466q.m68722b(entryPointsConfig.getStartUrl())) {
            entryPointsConfig.setId(targetEntryPoint);
            arrayList.add(entryPointsConfig);
        }
        return arrayList;
    }

    public final HybridWebConfig createHybridWebConfig(String targetEntryPoint, TicketSalesAndroidHybridEnvironment environment, List<? extends PluginConfig> plugins) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        HybridWebConfig hybridWebConfig = new HybridWebConfig();
        hybridWebConfig.setEntryPoints(createEntryPointsConfig(targetEntryPoint, environment));
        hybridWebConfig.setPlugins(plugins);
        return hybridWebConfig;
    }

    public final List<PluginConfig> createPluginConfig(TicketSalesAndroidHybridEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        arrayListM69268i.add(new PluginConfig("SASpaPlugin", null));
        arrayListM69268i.add(new PluginConfig("TixSalesNavigationPlugin", null));
        arrayListM69268i.add(new PluginConfig("TixModsNavigationPlugin", null));
        arrayListM69268i.add(new PluginConfig(LOGGER_PLUGIN, null));
        arrayListM69268i.add(new PluginConfig("AnalyticsPlugin", null));
        arrayListM69268i.add(new PluginConfig("TicketSalesHybridWebViewLifecyclePlugin", null));
        HashMap map = new HashMap();
        map.put(HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX, environment.getHybridLoginUrlRegEx());
        map.put(HYBRID_SSO_CONFIG_KEY_RETURN_URL, "/login/?returnUrl=");
        arrayListM69268i.add(new PluginConfig("SSOPlugin", map));
        return arrayListM69268i;
    }

    public final EntryPointsConfig findEntryPointsConfig(String entryPointId, List<? extends EntryPointsConfig> entryPointsConfigs) {
        Intrinsics.checkNotNullParameter(entryPointsConfigs, "entryPointsConfigs");
        for (EntryPointsConfig entryPointsConfig : entryPointsConfigs) {
            if (Intrinsics.areEqual(entryPointId, entryPointsConfig.getId())) {
                return entryPointsConfig;
            }
        }
        return null;
    }

    public final void removeDuplicateJwtCookies(List<HttpCookie> cookieList) {
        Intrinsics.checkNotNullParameter(cookieList, "cookieList");
        Iterator<HttpCookie> it = cookieList.iterator();
        while (it.hasNext()) {
            HttpCookie next = it.next();
            if (Intrinsics.areEqual(next.getName(), "pep_jwt_token") || Intrinsics.areEqual(next.getName(), "SESSION_TIMEOUT")) {
                it.remove();
            }
        }
    }

    public final void runOnUIThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void setCookiesIfJWTNotNullAndNotifySuccess(final String jwt, final HybridCoordinator coordinator, final HybridWebConfig config, final TicketSalesAndroidHybridEnvironment environment, final String entryPoint) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(environment, "environment");
        runOnUIThread(new Runnable() { // from class: no.d
            @Override // java.lang.Runnable
            public final void run() {
                HybridUtilities.setCookiesIfJWTNotNullAndNotifySuccess$lambda$1(jwt, coordinator, entryPoint, config, environment);
            }
        });
    }

    public final HybridWebConfig createHybridWebConfig(String targetEntryPoint, TicketSalesAndroidHybridEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        HybridWebConfig hybridWebConfig = new HybridWebConfig();
        hybridWebConfig.setEntryPoints(createEntryPointsConfig(targetEntryPoint, environment));
        hybridWebConfig.setPlugins(createPluginConfig(environment));
        return hybridWebConfig;
    }
}