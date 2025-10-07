package com.disney.wdpro.enchanting_extras_ui.utils;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.disney.wdpro.enchanting_extras_ui.p120ui.Settings.EnchantingExtrasEnvironment;
import com.disney.wdpro.enchanting_extras_ui.utils.HybridUtilities;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(m92037d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJn\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004J\"\u0010.\u001a\u00020/2\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020&Jz\u0010.\u001a\u00020/2\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020&2\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010!2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002010!2\u0006\u0010%\u001a\u00020&J \u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\"0!J\u001c\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0!2\u0006\u0010;\u001a\u00020\u0004J\u0014\u0010<\u001a\u00020\u001d2\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0=R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006>"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/utils/HybridUtilities;", "", "()V", "COMMAND_NAME_DETAIL_PAGE_BACK_BUTTON", "", "COMMAND_NAME_DISMISS_BUTTON", "EEC_AGE_GROUP", "EEC_DEEPLINK", "EEC_DETAIL_PLUGIN", "EEC_END_DATE", "EEC_NAVIGATION_PLUGIN", "EEC_QUANTITIES", "EEC_START_DATE", "EEC_TIME", "EEC_WEB_VIEW_LIFECYCLE_PLUGIN", "HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX", "HYBRID_SSO_CONFIG_KEY_RETURN_URL", "JWT_COOKIE_NAME", "KEY_NAME_DETAIL", "KEY_NAME_DETAIL_PAGE_BACK_BUTTON", "KEY_NAME_DISMISS_BUTTON", "LOADER_NATIVE", "NAVIGATION_ACTION_CLOSE", "REFERRER_DETAIL", "RETURN_URL", "SASPA_PLUGIN", "SSO_PLUGIN", "TIMEOUT_COOKIE_NAME", "clearCookies", "", "cookieManager", "Landroid/webkit/CookieManager;", "createEntryPointsConfig", "", "Lcom/wdpr/ee/ra/rahybrid/model/EntryPointsConfig;", "targetEntryPoint", "urlFriendlyId", "environment", "Lcom/disney/wdpro/enchanting_extras_ui/ui/Settings/EnchantingExtrasEnvironment;", "presentationType", "ageGroup", "quantities", "startDate", "endDate", "time", "deeplink", "createHybridWebConfig", "Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "plugins", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "ageGroups", "createPluginConfig", "findEntryPointsConfig", "entryPointId", "entryPointsConfigs", "isCookieInjected", "", "cookieList", "Ljava/net/HttpCookie;", "cookieName", "removeDuplicateJwtCookies", "", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes25.dex */
public final class HybridUtilities {
    public static final String COMMAND_NAME_DETAIL_PAGE_BACK_BUTTON = "EECNavigationPlugin.detailPageBackButton";
    public static final String COMMAND_NAME_DISMISS_BUTTON = "EECNavigationPlugin.dismissButton";
    public static final String EEC_AGE_GROUP = "&ageGroups=%s";
    public static final String EEC_DEEPLINK = "&deeplink=%s";
    public static final String EEC_DETAIL_PLUGIN = "EECDetailPlugin";
    public static final String EEC_END_DATE = "&endDate=%s";
    public static final String EEC_NAVIGATION_PLUGIN = "EECNavigationPlugin";
    public static final String EEC_QUANTITIES = "&quantities=%s";
    public static final String EEC_START_DATE = "&startDate=%s";
    public static final String EEC_TIME = "&time=%s";
    public static final String EEC_WEB_VIEW_LIFECYCLE_PLUGIN = "EECWebViewLifecyclePlugin";
    private static final String HYBRID_SSO_CONFIG_KEY_LOGIN_URL_REG_EX = "loginUrlRegEx";
    private static final String HYBRID_SSO_CONFIG_KEY_RETURN_URL = "replaceReturnUrlKey";
    public static final HybridUtilities INSTANCE = new HybridUtilities();
    private static final String JWT_COOKIE_NAME = "pep_jwt_token";
    public static final String KEY_NAME_DETAIL = "detail";
    public static final String KEY_NAME_DETAIL_PAGE_BACK_BUTTON = "detailPageBackButton";
    public static final String KEY_NAME_DISMISS_BUTTON = "dismissButton";
    public static final String LOADER_NATIVE = "?loader=native";
    public static final String NAVIGATION_ACTION_CLOSE = "&navigationAction=close";
    public static final String REFERRER_DETAIL = "&referrer=detail";
    public static final String RETURN_URL = "/login/?returnUrl=";
    public static final String SASPA_PLUGIN = "SASpaPlugin";
    public static final String SSO_PLUGIN = "SSOPlugin";
    private static final String TIMEOUT_COOKIE_NAME = "SESSION_TIMEOUT";

    private HybridUtilities() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearCookies$lambda$0(Boolean bool) {
    }

    public final void clearCookies(CookieManager cookieManager) {
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        cookieManager.removeAllCookies(new ValueCallback() { // from class: ra.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                HybridUtilities.clearCookies$lambda$0((Boolean) obj);
            }
        });
        cookieManager.flush();
    }

    public final List<EntryPointsConfig> createEntryPointsConfig(String targetEntryPoint, String urlFriendlyId, EnchantingExtrasEnvironment environment, String presentationType, String ageGroup, String quantities, String startDate, String endDate, String time, String deeplink) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(environment, "environment");
        ArrayList arrayList = new ArrayList();
        EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
        if (targetEntryPoint != null) {
            int iHashCode = targetEntryPoint.hashCode();
            if (iHashCode != 408208100) {
                if (iHashCode != 1193679880) {
                    if (iHashCode == 1829483609 && targetEntryPoint.equals(Constants.PROFILE_PAGE_ENTRYPOINT)) {
                        entryPointsConfig.setStartUrl(environment.getProfilePageUrl());
                    }
                } else if (targetEntryPoint.equals(Constants.CONFIG_PAGE_ENTRYPOINT) && !C22466q.m68722b(urlFriendlyId)) {
                    StringBuilder sb2 = new StringBuilder(environment.getConfigPageUrl());
                    sb2.append(urlFriendlyId);
                    sb2.append("/");
                    sb2.append("?loader=native");
                    String str6 = "";
                    if (ageGroup != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        str = String.format(EEC_AGE_GROUP, Arrays.copyOf(new Object[]{ageGroup}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    if (quantities != null) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        str2 = String.format(EEC_QUANTITIES, Arrays.copyOf(new Object[]{quantities}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    } else {
                        str2 = "";
                    }
                    sb2.append(str2);
                    if (startDate != null) {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        str3 = String.format(EEC_START_DATE, Arrays.copyOf(new Object[]{startDate}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    } else {
                        str3 = "";
                    }
                    sb2.append(str3);
                    if (endDate != null) {
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        str4 = String.format(EEC_END_DATE, Arrays.copyOf(new Object[]{endDate}, 1));
                        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                    } else {
                        str4 = "";
                    }
                    sb2.append(str4);
                    if (time != null) {
                        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                        str5 = String.format(EEC_TIME, Arrays.copyOf(new Object[]{time}, 1));
                        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                    } else {
                        str5 = "";
                    }
                    sb2.append(str5);
                    if (deeplink != null) {
                        StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                        str6 = String.format(EEC_DEEPLINK, Arrays.copyOf(new Object[]{deeplink}, 1));
                        Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                    }
                    sb2.append(str6);
                    sb2.append(REFERRER_DETAIL);
                    if (presentationType != null && Intrinsics.areEqual("foundation", presentationType)) {
                        sb2.append(NAVIGATION_ACTION_CLOSE);
                    }
                    entryPointsConfig.setStartUrl(sb2.toString());
                }
            } else if (targetEntryPoint.equals(Constants.LIST_PAGE_ENTRYPOINT)) {
                entryPointsConfig.setStartUrl(environment.getListPageUrl() + "?loader=native");
            }
        }
        if (!C22466q.m68722b(entryPointsConfig.getStartUrl())) {
            entryPointsConfig.setId(targetEntryPoint);
            arrayList.add(entryPointsConfig);
        }
        return arrayList;
    }

    public final HybridWebConfig createHybridWebConfig(String targetEntryPoint, String urlFriendlyId, EnchantingExtrasEnvironment environment, List<? extends PluginConfig> plugins, String presentationType, String ageGroups, String quantities, String startDate, String endDate, String time, String deeplink) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        HybridWebConfig hybridWebConfig = new HybridWebConfig();
        hybridWebConfig.setEntryPoints(createEntryPointsConfig(targetEntryPoint, urlFriendlyId, environment, presentationType, ageGroups, quantities, startDate, endDate, time, deeplink));
        hybridWebConfig.setPlugins(plugins);
        return hybridWebConfig;
    }

    public final List<PluginConfig> createPluginConfig(EnchantingExtrasEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        arrayListM69268i.add(new PluginConfig("SASpaPlugin", null));
        arrayListM69268i.add(new PluginConfig("EECNavigationPlugin", null));
        arrayListM69268i.add(new PluginConfig("EECDetailPlugin", null));
        arrayListM69268i.add(new PluginConfig("AnalyticsPlugin", null));
        arrayListM69268i.add(new PluginConfig("EECWebViewLifecyclePlugin", null));
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

    public final boolean isCookieInjected(List<HttpCookie> cookieList, String cookieName) {
        Intrinsics.checkNotNullParameter(cookieList, "cookieList");
        Intrinsics.checkNotNullParameter(cookieName, "cookieName");
        Iterator<HttpCookie> it = cookieList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getName(), cookieName)) {
                return true;
            }
        }
        return false;
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

    public final HybridWebConfig createHybridWebConfig(String targetEntryPoint, String urlFriendlyId, EnchantingExtrasEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        HybridWebConfig hybridWebConfig = new HybridWebConfig();
        hybridWebConfig.setEntryPoints(createEntryPointsConfig(targetEntryPoint, urlFriendlyId, environment, null, null, null, null, null, null, null));
        hybridWebConfig.setPlugins(createPluginConfig(environment));
        return hybridWebConfig;
    }
}