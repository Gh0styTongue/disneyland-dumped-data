package com.disney.wdpro.universal_checkout_ui.utils;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.braintreepayments.popupbridge.PopupBridge;
import com.disney.p063id.android.OneID;
import com.disney.p063id.android.OneIDCallback;
import com.disney.p063id.android.TokenCallbackData;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.deeplink.DeepLinkAnnualPasses;
import com.disney.wdpro.commons.deeplink.DeepLinkMagicAccess;
import com.disney.wdpro.commons.deeplink.DeepLinkPhotoPass;
import com.disney.wdpro.commons.deeplink.DeepLinkTicketSales;
import com.disney.wdpro.commons.utils.C9367d;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks;
import com.disney.wdpro.profile_ui.lightbox.LightBoxNavigationEntry;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.support.C20856k;
import com.disney.wdpro.support.util.SystemWebViewDisabledDialogFragment;
import com.disney.wdpro.universal_checkout_ui.C21435R;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.error.UniversalCheckoutErrorBannerHelper;
import com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie;
import com.disney.wdpro.universal_checkout_ui.models.TicketOrder;
import com.disney.wdpro.universal_checkout_ui.models.UCAppConfig;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.ChaseActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.DVICActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.UniversalCheckoutActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.p459ui.plugins.DVICNavigationPlugin;
import com.disney.wdpro.universal_checkout_ui.p459ui.plugins.NativeBridgeNotificationPlugin;
import com.disney.wdpro.universal_checkout_ui.p459ui.plugins.UCNavigationPlugin;
import com.disney.wdpro.universal_checkout_ui.p459ui.plugins.UCUrlManagerPlugin;
import com.disney.wdpro.universal_checkout_ui.p459ui.plugins.UCWebViewLifecyclePlugin;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.accesscontrol.AccessControlPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.header.HTTPHeaderPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.net.HttpCookie;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

@Instrumented
/* loaded from: classes20.dex */
public class UniversalCheckoutHelper implements UCNavigationPlugin.UCNavigationPluginListener, SSOPlugin.RequestTokenForSSOListener, UCUrlManagerPlugin.UCUrlManagerPluginListener, UCWebViewLifecyclePlugin.UCWebViewLifecyclePluginListener, WebAnalyticsPluginListener, SSOPlugin.SSOTokenUpdateListener, NativeBridgeNotificationPlugin.NativeBridgeNotificationPluginListener, DVICNavigationPlugin.DVICNavigationPluginListener, SSOPlugin.GetOneIDAccessTokenForSSOListener {
    private static final String CONVERSATION_ID_COOKIE = "clientConvId";
    private static final String CONVERSATION_UUID_COOKIE = "Conversation_UUID";
    private static final String DATE_TIME_ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final String HYBRID_EMBEDDED_HEADER = "X-Disney-Hybrid-Embedded";
    public static final String JWT_COOKIE_NAME = "pep_jwt_token";
    private static final String MAGIC_ACCESS_DISPLAY_DATE_PARAMETER = "displayDate";
    private static final String MY_GENIE_DAY_TAB = "day";
    private static final String MY_PLANS_URL_START_DATE_PARAMETER = "startDate";
    private static final String OVERRIDE_UC_PAYMENT_SHEET = "x-disney-internal-uc-override-paymentsheet";
    private static final String PAYMENT_SHEET_HEADER = "X-Disney-PaySheet-InsecureLoading";
    private static final String REMEMBER_ME_COOKIE = "rememberme";
    private static final String SET_SYSTEM_TIME_COOKIE = "setSystemTime";
    private static final String TAG = "UniversalCheckoutHelper";
    public static final String TIMEOUT_COOKIE_NAME = "SESSION_TIMEOUT";
    private static final int TIMEOUT_INTERVAL = 1800;
    private static final String UC_CONFIGURATION_COOKIE = "ucConfiguration";
    private static final String X_CONVERSATION_ID = "X-Conversation-Id";
    private static final String X_CORRELATION_ID = "X-Correlation-Id";
    private static final String X_DISNEY_INTERNAL_CLIENT_CONV_ID = "X-Disney-Internal-Client-Conv-Id";
    protected FragmentActivity activity;
    private InterfaceC8679k analyticsHelper;
    private AuthenticationManager authenticationManager;
    private HybridWebConfig config;
    private String conversationUuid;
    protected HybridCoordinator coordinator;
    private String correlationUuid;
    private SimpleDateFormat dateFormat;
    private DVICNativeInterstitialListener dvicNativeInterstitialListener;
    private String entryPointId;
    private UniversalCheckoutEnvironment environment;
    private boolean isConfirmationLoaded;
    private boolean isModalOpened;
    private boolean isUCEnabled;
    private C8667g navigator;
    protected List<Class<? extends Plugin>> pluginClasses;
    protected List<PluginConfig> plugins;
    private ProfileManager profileManager;
    protected SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener;
    protected boolean shouldGoBack;
    private boolean shouldShowDismissModal;
    private UCNavigationPlugin ucNavigationPlugin;
    private UniversalCheckoutConfiguration universalCheckoutConfiguration;
    private UniversalCheckoutDataManager universalCheckoutDataManager;
    private UniversalCheckoutErrorBannerHelper universalCheckoutErrorBannerHelper;
    private UniversalCheckoutHelperListener universalCheckoutHelperListener;
    private UniversalCheckoutNotificationListener universalCheckoutNotificationListener;
    private C9248i vendomatic;
    protected WebView webView;

    public interface DVICNativeInterstitialListener {
        void onShowDialog(CharSequence charSequence, String str);
    }

    public interface UniversalCheckoutHelperListener {
        void finish();

        void initWebHybrid();

        void onBackPressed();

        void onReadyForRequestItems();

        void updateWebViewUI(String str, boolean z10, int i10, boolean z11);
    }

    public interface UniversalCheckoutNotificationListener {
        void isModalOpen(boolean z10);
    }

    public UniversalCheckoutHelper(FragmentActivity fragmentActivity, UniversalCheckoutEnvironment universalCheckoutEnvironment, C8667g c8667g, InterfaceC8679k interfaceC8679k, AuthenticationManager authenticationManager, boolean z10, ProfileManager profileManager, UniversalCheckoutDataManager universalCheckoutDataManager, UniversalCheckoutConfiguration universalCheckoutConfiguration, C9248i c9248i, String str) {
        this.activity = fragmentActivity;
        this.environment = universalCheckoutEnvironment;
        this.navigator = c8667g;
        this.analyticsHelper = interfaceC8679k;
        this.authenticationManager = authenticationManager;
        this.isUCEnabled = z10;
        this.profileManager = profileManager;
        this.universalCheckoutDataManager = universalCheckoutDataManager;
        this.universalCheckoutConfiguration = universalCheckoutConfiguration;
        this.vendomatic = c9248i;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
        if (C22466q.m68722b(this.conversationUuid)) {
            this.conversationUuid = UUID.randomUUID().toString();
        }
        if (C22466q.m68722b(this.correlationUuid)) {
            this.correlationUuid = UUID.randomUUID().toString();
        }
        if (!(fragmentActivity instanceof DVICActivity) && !(fragmentActivity instanceof ChaseActivity)) {
            universalCheckoutDataManager.setMainActivity(fragmentActivity);
        }
        this.universalCheckoutErrorBannerHelper = new UniversalCheckoutErrorBannerHelper(fragmentActivity, universalCheckoutConfiguration, C22466q.m68722b(str) ? universalCheckoutConfiguration.getHelpDeskPhoneNumber() : str);
    }

    private String customPaymentSheetOverride() {
        String stringWithoutLastCharacter = StringUtils.getStringWithoutLastCharacter(this.environment.getWebBaseUrl(), "/");
        return new UCAppConfig(stringWithoutLastCharacter + "/ps/wdpr-payment-sheet.js?proxy=" + stringWithoutLastCharacter + "/ps", this.environment.getPaymentsEnv().toLowerCase(), Constants.DOMAIN_OVERRIDE_URL).toString();
    }

    private void dismissChaseAndDVICpages() {
        this.activity.setResult(ChaseActivity.DISMISS_DVIC_RESULT_CODE);
        this.activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyErrorToSSOTokenUpdateListeners$5(String str) {
        onTokenUpdateFailure(this.coordinator.getSSOPlugin(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifySuccessToSSOTokenUpdateListeners$4(String str) {
        this.coordinator.load(str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDisabledWebView$2() {
        this.activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCookiesIfJWTNotNullAndNotifySuccess$3(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, TIMEOUT_INTERVAL);
            String str3 = this.dateFormat.format(calendar.getTime());
            ArrayList arrayList = new ArrayList();
            arrayList.add(new HttpCookie("pep_jwt_token", str));
            arrayList.add(new HttpCookie("SESSION_TIMEOUT", str3));
            setCookiesForSSO(arrayList);
        }
        notifySuccessToSSOTokenUpdateListeners(str2);
    }

    private void navigateToApSales() {
        try {
            String str = "%s" + DeepLinkAnnualPasses.BUY.getLink();
            "WDW".equals(this.universalCheckoutConfiguration.getDestinationCode());
            this.navigator.m37382o(new C8663c.b(String.format(str, Constants.WDW_DEEP_LINK_BASE_URL)).build());
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void navigateToBrowser(String str) {
        try {
            this.navigator.m37382o(new C8666f.b(new Intent("android.intent.action.VIEW", Uri.parse(str))).build());
            if (this.isConfirmationLoaded) {
                if (str.startsWith(Constants.DLR_DEEP_LINK_BASE_URL) || str.startsWith(Constants.WDW_DEEP_LINK_BASE_URL)) {
                    dismiss();
                }
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void navigateToCompletionDeepLink(String str) {
        try {
            this.navigator.m37382o(new C8663c.b(str).m37293g().build());
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void navigateToDVICScreen(String str) {
        ((UCUrlManagerPlugin) this.coordinator.getPlugin("UCUrlManagerPlugin")).setDVICScreenActive(true);
        this.navigator.m37388w(DVICActivity.createIntent(this.activity, str)).m37364r(ScreenType.STACK).navigate();
    }

    private void navigateToDownScreen() {
        this.navigator.m37388w(UniversalCheckoutActivity.createIntent(this.activity, null, null, null, false)).navigate();
    }

    private void navigateToLinking() {
        try {
            String str = "%s" + DeepLinkAnnualPasses.LINKING.getLink();
            "WDW".equals(this.universalCheckoutConfiguration.getDestinationCode());
            this.navigator.m37382o(new C8663c.b(String.format(str, Constants.WDW_DEEP_LINK_BASE_URL)).build());
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void navigateToMyPlans(String str) {
        try {
            C8663c.b bVar = new C8663c.b();
            Bundle bundle = new Bundle();
            bundle.putSerializable(C8666f.EXTRA_SCREEN_TYPE, ScreenType.FOUNDATION);
            bVar.m37291e(DeepLinkMagicAccess.MY_GENIE_DAY.getLink());
            bVar.m37290d("tab", "day");
            String queryParameter = Uri.parse(str).getQueryParameter("startDate");
            if (!C22466q.m68722b(queryParameter)) {
                bVar.m37290d("displayDate", queryParameter);
            }
            bVar.m37296j(bundle);
            this.navigator.m37382o(bVar.build());
            dismiss();
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void navigateToPhoneDialer(String str) {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity == null || fragmentActivity.getPackageManager() == null || !this.activity.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            FragmentActivity fragmentActivity2 = this.activity;
            Toast.makeText(fragmentActivity2, fragmentActivity2.getString(C20856k.common_not_supported), 1).show();
            return;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(str.replace("\\\"", "")));
        try {
            this.activity.startActivity(intent);
        } catch (Exception unused) {
            FragmentActivity fragmentActivity3 = this.activity;
            Toast.makeText(fragmentActivity3, fragmentActivity3.getString(C20856k.common_not_supported), 1).show();
        }
    }

    private void navigateToPhotoPassList(String str) {
        try {
            C8663c.b bVar = new C8663c.b();
            Bundle bundle = new Bundle();
            bundle.putSerializable(C8666f.EXTRA_SCREEN_TYPE, ScreenType.STACK);
            bVar.m37291e(DeepLinkPhotoPass.GALLERY.getLink());
            bVar.m37296j(bundle);
            this.navigator.m37382o(bVar.build());
            dismiss();
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void navigateToTicketsAndPasses(String str) {
        try {
            C8663c.b bVar = new C8663c.b();
            Bundle bundle = new Bundle();
            bundle.putSerializable(C8666f.EXTRA_SCREEN_TYPE, ScreenType.STACK);
            bVar.m37291e(DeepLinkTicketSales.MY_TICKETS.getLink());
            bVar.m37296j(bundle);
            this.navigator.m37382o(bVar.build());
            dismiss();
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void notifyErrorToSSOTokenUpdateListeners(final String str) {
        if (this.coordinator != null) {
            runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.utils.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45109a.lambda$notifyErrorToSSOTokenUpdateListeners$5(str);
                }
            });
        }
    }

    private void notifySuccessToSSOTokenUpdateListeners(final String str) {
        if (this.coordinator != null) {
            if ((HybridUtilities.findEntryPointsConfig(str, this.config.getEntryPoints()) == null || (!C9367d.m39170a(this.config.getEntryPoints()) && !C22466q.m68722b(this.config.getEntryPoints().get(0).getStartUrl()) && this.config.getEntryPoints().get(0).getStartUrl().contains(Constants.EMBEDDED_CHECKOUT_BOOKING_URL))) && "checkout-landing-page".equals(str) && this.coordinator.getSSOPlugin() != null) {
                EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
                if (this.vendomatic.m38686G1()) {
                    entryPointsConfig.setStartUrl("https://embedded.disney.go.com/");
                } else {
                    entryPointsConfig.setStartUrl(this.environment.getCheckoutLandingPageUrl());
                }
                entryPointsConfig.setReloadStartUrlOnTokenUpdate(false);
                entryPointsConfig.setWebViewFinishTimeoutInSec(30);
                entryPointsConfig.setReadyMessageTimeoutInSec(35);
                entryPointsConfig.setId("checkout-landing-page");
                this.config.setEntryPoints(Arrays.asList(entryPointsConfig));
                this.coordinator.getSSOPlugin().setEntryPointsConfig(entryPointsConfig);
            }
            initPopUpBridgeForPayPal();
            runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.utils.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45111a.lambda$notifySuccessToSSOTokenUpdateListeners$4(str);
                }
            });
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    private List<HttpCookie> setCookies(String str, String str2, Calendar calendar, String str3) {
        List<HttpCookie> arrayList = (List) GsonInstrumentation.fromJson(new Gson(), str2, new TypeToken<List<HttpCookie>>() { // from class: com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.1
        }.getType());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (str != null) {
            arrayList.add(new HttpCookie(UC_CONFIGURATION_COOKIE, str));
        }
        if (calendar != null) {
            arrayList.add(new HttpCookie(SET_SYSTEM_TIME_COOKIE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(calendar.getTime())));
        }
        if (str3 != null) {
            arrayList.add(new HttpCookie(REMEMBER_ME_COOKIE, str3));
        }
        if (!C22466q.m68722b(this.universalCheckoutConfiguration.getConversationId())) {
            arrayList.add(new HttpCookie(CONVERSATION_ID_COOKIE, this.universalCheckoutConfiguration.getConversationId()));
        }
        if ("checkout-landing-page".equals(this.entryPointId) && this.vendomatic.m38686G1() && !C22466q.m68722b(this.conversationUuid) && !this.universalCheckoutDataManager.isContentBundleSyncing()) {
            String strReplace = StringUtils.getStringWithoutLastCharacter(this.environment.getWebBaseUrl(), "/").replace(Constants.HTTPS, "").replace(Constants.HTTP, "");
            HttpCookie httpCookie = new HttpCookie(CONVERSATION_UUID_COOKIE, this.conversationUuid);
            httpCookie.setDomain(strReplace);
            arrayList.add(httpCookie);
        }
        return arrayList;
    }

    private void setCookiesForSSO(List<HttpCookie> list) {
        HybridCoordinator hybridCoordinator = this.coordinator;
        if (hybridCoordinator == null || hybridCoordinator.getCookiePlugin() == null || this.coordinator.getSSOPlugin() == null) {
            return;
        }
        List<HttpCookie> cookies = this.coordinator.getCookiePlugin().getCookies();
        if (cookies == null) {
            cookies = Lists.m69268i();
        }
        if (cookies != null) {
            HybridUtilities.removeDuplicateJwtCookies(cookies);
            cookies.addAll(list);
            this.coordinator.getSSOPlugin().setCookies(cookies);
        }
    }

    private Map<String, String> setHeaders(C9248i c9248i) {
        if (C22466q.m68722b(this.universalCheckoutConfiguration.getConversationId())) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(X_DISNEY_INTERNAL_CLIENT_CONV_ID, this.universalCheckoutConfiguration.getConversationId());
        if ("checkout-landing-page".equals(this.entryPointId) && c9248i.m38686G1() && !this.universalCheckoutDataManager.isContentBundleSyncing()) {
            map.put("X-Conversation-Id", this.conversationUuid);
            map.put("X-Correlation-Id", this.correlationUuid);
            map.put(HYBRID_EMBEDDED_HEADER, "true");
            map.put(OVERRIDE_UC_PAYMENT_SHEET, customPaymentSheetOverride());
        }
        return map;
    }

    public void addPluginClasses(List<Class<? extends Plugin>> list) {
        this.pluginClasses = list;
        if (list == null) {
            this.pluginClasses = new ArrayList();
        }
        this.pluginClasses.add(UCNavigationPlugin.class);
        this.pluginClasses.add(UCUrlManagerPlugin.class);
        this.pluginClasses.add(UCWebViewLifecyclePlugin.class);
        this.pluginClasses.add(NativeBridgeNotificationPlugin.class);
        this.pluginClasses.add(DVICNavigationPlugin.class);
        this.pluginClasses.add(HTTPHeaderPlugin.class);
        this.pluginClasses.add(PrintPlugin.class);
        if (!this.pluginClasses.contains(SSOPlugin.class)) {
            this.pluginClasses.add(SSOPlugin.class);
        }
        if (this.pluginClasses.contains(WebAnalyticsPlugin.class)) {
            return;
        }
        this.pluginClasses.add(WebAnalyticsPlugin.class);
    }

    public void addPluginConfigs(List<PluginConfig> list) {
        this.plugins = list;
        if (list == null) {
            this.plugins = new ArrayList();
        }
        this.plugins.addAll(HybridUtilities.createPluginConfig(this.environment, list, this.vendomatic, this.entryPointId, this.universalCheckoutDataManager.isContentBundleSyncing()));
    }

    public void createConfigAndCoordinator(String str, String str2) {
        createConfigAndCoordinator(str, null, str2, null, null);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCNavigationPlugin.UCNavigationPluginListener
    public void dismiss() {
        this.universalCheckoutDataManager.invalidateItineraryServicesCache();
        if (this.isConfirmationLoaded) {
            String completionDeepLink = this.universalCheckoutDataManager.getCompletionDeepLink();
            if (!C22466q.m68722b(completionDeepLink) && StringUtils.isDeepLinkValid(completionDeepLink) && completionDeepLink.contains(DeepLinkMagicAccess.MY_GENIE_DAY.getLink())) {
                navigateToCompletionDeepLink(completionDeepLink);
                this.universalCheckoutDataManager.setCompletionDeepLink(null);
                return;
            }
            this.activity.setResult(3);
        }
        UniversalCheckoutHelperListener universalCheckoutHelperListener = this.universalCheckoutHelperListener;
        if (universalCheckoutHelperListener != null) {
            universalCheckoutHelperListener.finish();
        } else {
            this.activity.finish();
        }
    }

    /* renamed from: fetchJwtToken, reason: merged with bridge method [inline-methods] */
    public void lambda$requestTokenForSSO$0() {
        String str = TAG;
        RAHybridLog.m85711d(str, "fetchJwtToken");
        RAHybridLog.m85711d(str, "fetchJwtToken: isUserLoggedIn: " + isUserLoggedIn());
        RAHybridLog.m85711d(str, "fetchJwtToken: requestTokenReadyForSSOListener: " + this.requestTokenReadyForSSOListener);
        this.universalCheckoutDataManager.fetchJwtToken();
    }

    public HybridWebConfig getConfig() {
        return this.config;
    }

    public HybridCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.GetOneIDAccessTokenForSSOListener
    public void getOneIDAccessTokenForSSO(final SSOPlugin.GetOneIDAccessTokenReadyForSSOListener getOneIDAccessTokenReadyForSSOListener) {
        if (!OneID.shared().isLoggedIn()) {
            getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(null, null);
            return;
        }
        final String json = GsonInstrumentation.toJson(new Gson(), OneID.shared().getGuest());
        OneID.shared().getToken(new OneIDCallback<TokenCallbackData>() { // from class: com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.4
            @Override // com.disney.p063id.android.OneIDCallback
            public void onFailure(TokenCallbackData tokenCallbackData) {
                RAHybridLog.m85711d(UniversalCheckoutHelper.TAG, "getOneIDAccessTokenForSSO failed");
                getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(null, null);
            }

            @Override // com.disney.p063id.android.OneIDCallback
            public void onSuccess(TokenCallbackData tokenCallbackData) {
                getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(tokenCallbackData.getToken().getAccessToken(), json);
            }
        });
    }

    public SSOPlugin.RequestTokenReadyForSSOListener getRequestTokenReadyForSSOListener() {
        return this.requestTokenReadyForSSOListener;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void hideLoader() {
        onFinishLoadingScreen(null, false);
    }

    public void initPopUpBridgeForPayPal() {
        try {
            WebView webView = this.coordinator.getHybridFragment().getWebView();
            this.webView = webView;
            if (webView != null) {
                PopupBridge.newInstance(this.activity, webView);
                if (C9384u.INSTANCE.m39212a()) {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public void initWebHybrid(String str) {
        initWebHybrid("checkout-landing-page", null, str, null, null);
    }

    public boolean isConfirmationLoaded() {
        return this.isConfirmationLoaded;
    }

    public boolean isModalOpened() {
        return this.isModalOpened;
    }

    public boolean isUserLoggedIn() {
        return this.authenticationManager.isUserAuthenticated() && !C22466q.m68722b(this.authenticationManager.getUserSwid());
    }

    public void loadCheckoutPageByEntryPointId() {
        this.coordinator.load("checkout-landing-page", Collections.EMPTY_MAP);
    }

    public void loadPageByEntryPointId(String str) {
        this.coordinator.load(str, Collections.EMPTY_MAP);
    }

    public void loadPageByUrl(String str) {
        if (this.webView == null) {
            this.webView = this.coordinator.getHybridFragment().getWebView();
        }
        if (this.webView == null || C22466q.m68722b(str)) {
            return;
        }
        this.webView.loadUrl(str);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCNavigationPlugin.UCNavigationPluginListener, com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void navigateBack() {
        UniversalCheckoutHelperListener universalCheckoutHelperListener = this.universalCheckoutHelperListener;
        if (universalCheckoutHelperListener != null) {
            universalCheckoutHelperListener.onBackPressed();
        } else {
            this.activity.onBackPressed();
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void navigateToChaseScreen(String str) {
        ((UCUrlManagerPlugin) this.coordinator.getPlugin("UCUrlManagerPlugin")).setChaseScreenActive(true);
        this.navigator.m37388w(ChaseActivity.createIntent(this.activity, str)).m37363q(10000).m37364r(ScreenType.STACK).navigate();
    }

    /* renamed from: navigateToLogin, reason: merged with bridge method [inline-methods] */
    public void lambda$requestTokenForSSO$1() {
        this.navigator.m37382o(LightBoxNavigationEntry.getBuilderForSecondarySignIn(this).withCallbacks(new LightBoxCallbacks() { // from class: com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.3
            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onCancel() {
                FragmentActivity fragmentActivity = UniversalCheckoutHelper.this.activity;
                if (fragmentActivity == null) {
                    return true;
                }
                fragmentActivity.finish();
                return true;
            }

            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onError() {
                return false;
            }

            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onSuccess() {
                return false;
            }
        }).build());
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void navigateToLoginNoRefresh() {
        this.navigator.m37382o(LightBoxNavigationEntry.getBuilderForSecondarySignIn(this).withCallbacks(new LightBoxCallbacks() { // from class: com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.2
            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onCancel() {
                return false;
            }

            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onError() {
                return false;
            }

            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onSuccess() {
                UniversalCheckoutHelper.this.universalCheckoutDataManager.setHasRequestedForSecondaryLogin(true);
                return false;
            }
        }).build());
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void navigateToNewLogin() {
        this.navigator.m37382o(LightBoxNavigationEntry.getBuilderForSignIn(this).build());
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCNavigationPlugin.UCNavigationPluginListener
    public void onConfirmationLoaded() {
        this.isConfirmationLoaded = true;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCWebViewLifecyclePlugin.UCWebViewLifecyclePluginListener
    public void onDisabledWebView() {
        SystemWebViewDisabledDialogFragment systemWebViewDisabledDialogFragmentM63131a = SystemWebViewDisabledDialogFragment.INSTANCE.m63131a(this.activity.getString(C21435R.string.system_web_view_disabled_message));
        systemWebViewDisabledDialogFragmentM63131a.m63130v0(new SystemWebViewDisabledDialogFragment.InterfaceC20921a() { // from class: com.disney.wdpro.universal_checkout_ui.utils.b
            @Override // com.disney.wdpro.support.util.SystemWebViewDisabledDialogFragment.InterfaceC20921a
            public final void onCloseDialog() {
                this.f45103a.lambda$onDisabledWebView$2();
            }
        });
        systemWebViewDisabledDialogFragmentM63131a.show(this.activity.getSupportFragmentManager(), (String) null);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCWebViewLifecyclePlugin.UCWebViewLifecyclePluginListener
    public void onFinishLoadingScreen(String str, boolean z10) {
        UniversalCheckoutHelperListener universalCheckoutHelperListener = this.universalCheckoutHelperListener;
        if (universalCheckoutHelperListener != null) {
            universalCheckoutHelperListener.updateWebViewUI(str, false, 0, z10);
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCUrlManagerPlugin.UCUrlManagerPluginListener
    public void onInterceptUrl(String str) {
        RAHybridLog.m85711d(TAG, "onInterceptUrl() URL : " + str);
        if (this.shouldGoBack) {
            navigateBack();
            this.shouldGoBack = false;
        }
        StringUtils.getStringWithoutLastCharacter(this.environment.getCheckoutLandingPageUrl(), "/");
        String stringWithoutLastCharacter = StringUtils.getStringWithoutLastCharacter(this.environment.getWebBaseUrl(), "/");
        String stringWithoutLastCharacter2 = StringUtils.getStringWithoutLastCharacter(str, "/");
        UCUrlManagerPlugin uCUrlManagerPlugin = (UCUrlManagerPlugin) this.coordinator.getPlugin("UCUrlManagerPlugin");
        boolean z10 = (uCUrlManagerPlugin.isDVICScreenActive() || uCUrlManagerPlugin.isChaseScreenActive()) ? false : true;
        boolean z11 = this.activity instanceof UniversalCheckoutActivity;
        boolean z12 = !this.isUCEnabled && (stringWithoutLastCharacter2.contains(Constants.SECURE_CHECKOUT) || stringWithoutLastCharacter2.contains("checkout-booking") || stringWithoutLastCharacter2.contains(HybridUtilities.BUNDLE_HOST_NAME));
        boolean z13 = z10 && !stringWithoutLastCharacter2.contains(Constants.DINING_PLANS_LINK) && stringWithoutLastCharacter2.contains(Constants.MY_PLANS_LINK);
        boolean z14 = z10 && stringWithoutLastCharacter2.contains(Constants.TICKETS_AND_PASSES_LINK);
        boolean z15 = z10 && stringWithoutLastCharacter2.contains(Constants.PHOTOPASS_LIST_LINK);
        boolean zEndsWith = stringWithoutLastCharacter2.endsWith(Constants.AP_SALES_URL);
        boolean z16 = stringWithoutLastCharacter2.contains(Constants.WDW_LINK_TNP_URL) || stringWithoutLastCharacter2.contains(Constants.DLR_LINK_TNP_URL);
        boolean z17 = z10 && (stringWithoutLastCharacter2.contains(TicketOrder.DEFAULT_RETURN_URL) || stringWithoutLastCharacter2.equalsIgnoreCase(stringWithoutLastCharacter));
        boolean z18 = z16;
        boolean z19 = z10 && stringWithoutLastCharacter2.contains(Constants.VISA_CARD_PATH);
        boolean z20 = uCUrlManagerPlugin.isDVICScreenActive() && stringWithoutLastCharacter2.equalsIgnoreCase(stringWithoutLastCharacter);
        boolean z21 = uCUrlManagerPlugin.isChaseScreenActive() && (stringWithoutLastCharacter2.contains(Constants.SECURE_CHECKOUT) || stringWithoutLastCharacter2.contains("checkout-booking") || stringWithoutLastCharacter2.contains(HybridUtilities.BUNDLE_HOST_NAME) || stringWithoutLastCharacter2.equalsIgnoreCase(stringWithoutLastCharacter));
        boolean z22 = z11 && stringWithoutLastCharacter2.contains(Constants.ERROR_CODE_PARAM);
        boolean z23 = z10 && stringWithoutLastCharacter2.contains(Constants.TICKET_SALES_URL);
        boolean z24 = z10 && stringWithoutLastCharacter2.contains(Constants.MODS_URL);
        boolean z25 = z10 && stringWithoutLastCharacter2.contains(Constants.MODS_HUB_URL);
        boolean z26 = z10 && stringWithoutLastCharacter2.contains("tel:");
        if (z12) {
            navigateToDownScreen();
            return;
        }
        if (z13) {
            navigateToMyPlans(stringWithoutLastCharacter2);
            return;
        }
        if (z14) {
            navigateToTicketsAndPasses(stringWithoutLastCharacter2);
            return;
        }
        if (z15) {
            navigateToPhotoPassList(stringWithoutLastCharacter2);
            return;
        }
        if (zEndsWith) {
            navigateToApSales();
            return;
        }
        if (z18) {
            navigateToLinking();
            return;
        }
        if (z26) {
            navigateToPhoneDialer(stringWithoutLastCharacter2);
            return;
        }
        if (z23) {
            this.activity.setResult(4);
            UniversalCheckoutHelperListener universalCheckoutHelperListener = this.universalCheckoutHelperListener;
            if (universalCheckoutHelperListener != null) {
                universalCheckoutHelperListener.finish();
                return;
            } else {
                this.activity.finish();
                return;
            }
        }
        if (z24) {
            this.activity.setResult(5);
            UniversalCheckoutHelperListener universalCheckoutHelperListener2 = this.universalCheckoutHelperListener;
            if (universalCheckoutHelperListener2 != null) {
                universalCheckoutHelperListener2.finish();
                return;
            } else {
                this.activity.finish();
                return;
            }
        }
        if (z25) {
            this.activity.setResult(6);
            UniversalCheckoutHelperListener universalCheckoutHelperListener3 = this.universalCheckoutHelperListener;
            if (universalCheckoutHelperListener3 != null) {
                universalCheckoutHelperListener3.finish();
                return;
            } else {
                this.activity.finish();
                return;
            }
        }
        if (z22) {
            if (stringWithoutLastCharacter2.contains(Constants.ERROR_CODE_UNDERAGE)) {
                this.activity.setResult(2);
            } else {
                this.activity.setResult(1);
            }
            UniversalCheckoutHelperListener universalCheckoutHelperListener4 = this.universalCheckoutHelperListener;
            if (universalCheckoutHelperListener4 != null) {
                universalCheckoutHelperListener4.finish();
                return;
            } else {
                this.activity.finish();
                return;
            }
        }
        if (z19) {
            navigateToDVICScreen(stringWithoutLastCharacter2);
            return;
        }
        if (z17) {
            navigateBack();
            return;
        }
        if (z20) {
            this.universalCheckoutDataManager.setReloadUC(true);
            this.activity.finish();
        } else if (!z21) {
            navigateToBrowser(stringWithoutLastCharacter2);
        } else {
            this.universalCheckoutDataManager.setReloadUC(true);
            dismissChaseAndDVICpages();
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCWebViewLifecyclePlugin.UCWebViewLifecyclePluginListener
    public void onInterceptUrlStart() {
        this.shouldGoBack = true;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCWebViewLifecyclePlugin.UCWebViewLifecyclePluginListener
    public void onLoadingInProgressScreen(String str, int i10) {
        UniversalCheckoutHelperListener universalCheckoutHelperListener = this.universalCheckoutHelperListener;
        if (universalCheckoutHelperListener != null) {
            universalCheckoutHelperListener.updateWebViewUI(str, true, i10, false);
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCNavigationPlugin.UCNavigationPluginListener
    public void onReadyForRequestItems() {
        this.universalCheckoutHelperListener.onReadyForRequestItems();
    }

    public void onReadyForSSO() {
        setCookiesIfJWTNotNullAndNotifySuccess(this.universalCheckoutDataManager.getJwt(), this.entryPointId);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            entry.setValue(String.valueOf(entry.getValue()));
        }
        this.analyticsHelper.mo37405b(str, (HashMap) map);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            entry.setValue(String.valueOf(entry.getValue()));
        }
        this.analyticsHelper.mo37406c(str, getClass().getSimpleName(), (HashMap) map);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCWebViewLifecyclePlugin.UCWebViewLifecyclePluginListener
    public void onStartLoadingScreen(String str) {
        UniversalCheckoutHelperListener universalCheckoutHelperListener = this.universalCheckoutHelperListener;
        if (universalCheckoutHelperListener != null) {
            universalCheckoutHelperListener.updateWebViewUI(str, true, 0, false);
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCWebViewLifecyclePlugin.UCWebViewLifecyclePluginListener
    public void onTimeoutCalled() {
        showErrorBanner(false);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateFailure(SSOPlugin sSOPlugin, String str) {
        RAHybridLog.m85711d(TAG, "onTokenUpdateFailure(): " + str);
        onFinishLoadingScreen(null, false);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateReady(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
        String str = TAG;
        RAHybridLog.m85711d(str, "onTokenUpdateReady() startUrl : " + entryPointsConfig.getStartUrl());
        RAHybridLog.m85711d(str, "Called when url redirects to /login/?returnUrl=");
        this.universalCheckoutDataManager.setJwt(null);
        if (!isUserLoggedIn() || OneID.shared().isLowTrust()) {
            lambda$requestTokenForSSO$1();
        } else {
            this.profileManager.fetchUserAccessInfo();
        }
        initPopUpBridgeForPayPal();
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateSuccess(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
        RAHybridLog.m85711d(TAG, "onTokenUpdateSuccess(): Successfully fetched token and request to load : " + entryPointsConfig.getStartUrl());
        initPopUpBridgeForPayPal();
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCNavigationPlugin.UCNavigationPluginListener
    public void paymentSheetFinish() {
    }

    public void reloadPage() {
        if (this.webView == null) {
            this.webView = this.coordinator.getHybridFragment().getWebView();
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.reload();
        }
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenForSSOListener
    public void requestTokenForSSO(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        RAHybridLog.m85711d(TAG, "Called tokenForSSO");
        this.requestTokenReadyForSSOListener = requestTokenReadyForSSOListener;
        if (!isUserLoggedIn() || OneID.shared().isLowTrust()) {
            runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.utils.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45108a.lambda$requestTokenForSSO$1();
                }
            });
        } else {
            runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.utils.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45107a.lambda$requestTokenForSSO$0();
                }
            });
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void sendCancelButtonEvent() {
        DVICNavigationPlugin dVICNavigationPlugin = (DVICNavigationPlugin) this.coordinator.getPlugin("DVICNavigationPlugin");
        if (dVICNavigationPlugin != null) {
            dVICNavigationPlugin.sendMessageToDvic(HybridUtilities.COMMAND_NAME_CANCEL_BUTTON_CLICKED, null);
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void sendContinueButtonEvent() {
        DVICNavigationPlugin dVICNavigationPlugin = (DVICNavigationPlugin) this.coordinator.getPlugin("DVICNavigationPlugin");
        if (dVICNavigationPlugin != null) {
            dVICNavigationPlugin.sendMessageToDvic(HybridUtilities.COMMAND_NAME_CONTINUE_BUTTON_CLICKED, null);
        }
    }

    public void sendMessageToShowDismissModal() {
        UCNavigationPlugin uCNavigationPlugin = this.ucNavigationPlugin;
        if (uCNavigationPlugin != null) {
            uCNavigationPlugin.sendMessageToShowDismissModal();
        }
    }

    public void sendRequestItems(String str) {
        UCNavigationPlugin uCNavigationPlugin = this.ucNavigationPlugin;
        if (uCNavigationPlugin != null) {
            uCNavigationPlugin.sendRequestItems(str);
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void sendSecondaryLoginResult(RememberMeCookie rememberMeCookie) {
        DVICNavigationPlugin dVICNavigationPlugin = (DVICNavigationPlugin) this.coordinator.getPlugin("DVICNavigationPlugin");
        if (dVICNavigationPlugin != null) {
            dVICNavigationPlugin.sendMessageToDvic(HybridUtilities.KEY_NAME_SECONDARY_LOGIN_RESULT, new String[]{"{\"rememberme\": " + rememberMeCookie.toString() + "}"});
        }
    }

    public void setConfirmationLoaded(boolean z10) {
        this.isConfirmationLoaded = z10;
    }

    public void setCookiesIfJWTNotNullAndNotifySuccess(final String str, final String str2) {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f45104a.lambda$setCookiesIfJWTNotNullAndNotifySuccess$3(str, str2);
            }
        });
    }

    public void setDVICNativeInterstitialListener(DVICNativeInterstitialListener dVICNativeInterstitialListener) {
        this.dvicNativeInterstitialListener = dVICNativeInterstitialListener;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.NativeBridgeNotificationPlugin.NativeBridgeNotificationPluginListener
    public void setModalOpened(boolean z10) {
        this.isModalOpened = z10;
        UniversalCheckoutNotificationListener universalCheckoutNotificationListener = this.universalCheckoutNotificationListener;
        if (universalCheckoutNotificationListener != null) {
            universalCheckoutNotificationListener.isModalOpen(z10);
        }
    }

    public void setPluginListeners(HybridCoordinator hybridCoordinator, HybridWebConfig hybridWebConfig, String str, C9248i c9248i) {
        this.coordinator = hybridCoordinator;
        this.config = hybridWebConfig;
        this.entryPointId = str;
        UCNavigationPlugin uCNavigationPlugin = (UCNavigationPlugin) hybridCoordinator.getPlugin("UCNavigationPlugin");
        this.ucNavigationPlugin = uCNavigationPlugin;
        uCNavigationPlugin.setListener(this);
        ((UCUrlManagerPlugin) hybridCoordinator.getPlugin("UCUrlManagerPlugin")).init(this, this.isUCEnabled, this.environment.getCheckoutLandingPageUrl(), this.activity instanceof UniversalCheckoutActivity, this.environment.getWebBaseUrl(), HybridUtilities.findStartUrl(str, hybridWebConfig.getEntryPoints()));
        ((UCWebViewLifecyclePlugin) hybridCoordinator.getPlugin("UCWebViewLifecyclePlugin")).init(this, this.isUCEnabled);
        ((NativeBridgeNotificationPlugin) hybridCoordinator.getPlugin("nativeBridgeNotification")).setListener(this);
        ((DVICNavigationPlugin) hybridCoordinator.getPlugin("DVICNavigationPlugin")).setListener(this);
        if ("checkout-landing-page".equals(str) || Constants.DVIC_LANDING_PAGE_ENTRYPOINT.equals(str) || Constants.CHASE_LANDING_PAGE_ENTRYPOINT.equals(str)) {
            SSOPlugin sSOPlugin = hybridCoordinator.getSSOPlugin();
            if (hybridWebConfig.getEntryPoints() != null) {
                sSOPlugin.setEntryPointsConfig(HybridUtilities.findEntryPointsConfig(str, hybridWebConfig.getEntryPoints()));
            }
            sSOPlugin.setRequestTokenForSSOListener(this);
            sSOPlugin.setGetOneIdAccessTokenForSSOListener(this);
            sSOPlugin.addSSOTokenUpdateListener(this);
            sSOPlugin.setHTTPHeaders(setHeaders(c9248i));
            hybridCoordinator.getWebAnalyticsPlugin().setWebAnalyticsPluginListener(this);
        }
    }

    public void setRequestTokenReadyForSSOListener(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        this.requestTokenReadyForSSOListener = requestTokenReadyForSSOListener;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.UCNavigationPlugin.UCNavigationPluginListener
    public void setShouldShowDismissModal() {
        this.shouldShowDismissModal = true;
    }

    public void setUniversalCheckoutHelperListener(UniversalCheckoutHelperListener universalCheckoutHelperListener) {
        this.universalCheckoutHelperListener = universalCheckoutHelperListener;
    }

    public void setUniversalCheckoutNotificationListener(UniversalCheckoutNotificationListener universalCheckoutNotificationListener) {
        this.universalCheckoutNotificationListener = universalCheckoutNotificationListener;
    }

    public boolean shouldShowDismissModal() {
        return this.shouldShowDismissModal;
    }

    public void showConnectivityErrorBanner() {
        this.universalCheckoutErrorBannerHelper.showConnectivityErrorBanner();
    }

    @Override // com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.DVICNavigationPluginListener
    public void showDialog(CharSequence charSequence, String str) {
        DVICNativeInterstitialListener dVICNativeInterstitialListener = this.dvicNativeInterstitialListener;
        if (dVICNativeInterstitialListener != null) {
            dVICNativeInterstitialListener.onShowDialog(charSequence, str);
        }
    }

    public void showErrorBanner(boolean z10) {
        try {
            UniversalCheckoutErrorBannerHelper universalCheckoutErrorBannerHelper = this.universalCheckoutErrorBannerHelper;
            if (universalCheckoutErrorBannerHelper != null) {
                if (z10) {
                    universalCheckoutErrorBannerHelper.showErrorBannerExitUC();
                } else {
                    universalCheckoutErrorBannerHelper.showCreateOrderErrorBanner();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void updateScreenFlag() {
        HybridCoordinator hybridCoordinator = this.coordinator;
        if (hybridCoordinator == null) {
            return;
        }
        UCUrlManagerPlugin uCUrlManagerPlugin = (UCUrlManagerPlugin) hybridCoordinator.getPlugin("UCUrlManagerPlugin");
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity instanceof DVICActivity) {
            uCUrlManagerPlugin.setDVICScreenActive(true);
            uCUrlManagerPlugin.setChaseScreenActive(false);
            return;
        }
        if (fragmentActivity instanceof ChaseActivity) {
            uCUrlManagerPlugin.setDVICScreenActive(false);
            uCUrlManagerPlugin.setChaseScreenActive(true);
            return;
        }
        if (this.universalCheckoutDataManager.isReloadUC()) {
            if (this.activity instanceof UniversalCheckoutActivity) {
                UniversalCheckoutHelperListener universalCheckoutHelperListener = this.universalCheckoutHelperListener;
                if (universalCheckoutHelperListener != null) {
                    universalCheckoutHelperListener.updateWebViewUI(this.environment.getCheckoutLandingPageUrl(), true, 0, false);
                    this.universalCheckoutHelperListener.initWebHybrid();
                }
                if (!this.authenticationManager.isUserAuthenticated() || C22466q.m68722b(this.authenticationManager.getUserSwid())) {
                    lambda$requestTokenForSSO$1();
                } else {
                    this.profileManager.fetchUserAccessInfo();
                }
            } else {
                reloadPage();
            }
        }
        this.universalCheckoutDataManager.setReloadUC(false);
        uCUrlManagerPlugin.setDVICScreenActive(false);
        uCUrlManagerPlugin.setChaseScreenActive(false);
    }

    public void createConfigAndCoordinator(String str, String str2, String str3) {
        createConfigAndCoordinator(str, null, str2, null, str3);
    }

    public void initWebHybrid(String str, Calendar calendar) {
        initWebHybrid("checkout-landing-page", null, str, calendar, null);
    }

    public void createConfigAndCoordinator(String str, String str2, String str3, Calendar calendar, String str4) {
        this.entryPointId = str;
        HybridWebConfig hybridWebConfigCreateHybridWebConfig = HybridUtilities.createHybridWebConfig(str, this.environment, isUserLoggedIn(), null, str2, this.vendomatic, this.universalCheckoutDataManager.isContentBundleSyncing());
        this.config = hybridWebConfigCreateHybridWebConfig;
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(this.activity, hybridWebConfigCreateHybridWebConfig, this.pluginClasses, setCookies(str3, null, calendar, str4), setHeaders(this.vendomatic));
        this.coordinator = hybridCoordinatorMakeCoordinator;
        AccessControlPlugin accessControlPlugin = hybridCoordinatorMakeCoordinator.getAccessControlPlugin();
        if (accessControlPlugin != null) {
            accessControlPlugin.setActivity(this.activity);
        }
    }

    public void initWebHybrid(String str, String str2, String str3) {
        initWebHybrid(str, str2, null, null, str3);
    }

    public void initWebHybrid(String str, String str2, String str3, Calendar calendar, String str4) {
        addPluginClasses(this.pluginClasses);
        createConfigAndCoordinator(str, str2, str3, calendar, str4);
        setPluginListeners(this.coordinator, this.config, str, this.vendomatic);
        this.webView = this.coordinator.getHybridFragment().getWebView();
    }

    public UniversalCheckoutHelper(FragmentActivity fragmentActivity, UniversalCheckoutEnvironment universalCheckoutEnvironment, C8667g c8667g, InterfaceC8679k interfaceC8679k, AuthenticationManager authenticationManager, boolean z10, ProfileManager profileManager, UniversalCheckoutDataManager universalCheckoutDataManager, UniversalCheckoutConfiguration universalCheckoutConfiguration, C9248i c9248i) {
        this(fragmentActivity, universalCheckoutEnvironment, c8667g, interfaceC8679k, authenticationManager, z10, profileManager, universalCheckoutDataManager, universalCheckoutConfiguration, c9248i, null);
    }
}