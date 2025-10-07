package com.disney.wdpro.universal_checkout_ui.p459ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.monitor.C9340o;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.httpclient.authentication.model.AccessTokenStatus;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.ProfileNavEntriesBuilderProvider;
import com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.profile_ui.p421ui.activities.ResidencyVerificationActivity;
import com.disney.wdpro.profile_ui.utils.ResidencyVerificationResponse;
import com.disney.wdpro.service.model.Affiliations;
import com.disney.wdpro.universal_checkout_ui.C21435R;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsConfiguration;
import com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsHelper;
import com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsManager;
import com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsManagerImpl;
import com.disney.wdpro.universal_checkout_ui.models.TicketOrder;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.UniversalCheckoutActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.custom_views.SnowballHeader;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.p459ui.p460di.UniversalCheckoutComponentProvider;
import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper;
import com.google.common.base.C22466q;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.squareup.otto.Subscribe;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

@Instrumented
/* loaded from: classes20.dex */
public class UniversalCheckoutFragment extends BaseFragment implements UniversalCheckoutHelper.UniversalCheckoutHelperListener {
    private static final String ARG_UC_ANALYTICS_CONFIGURATION = "ARG_UC_ANALYTICS_CONFIGURATION";
    private static final String ARG_UC_CONFIGURATION = "ARG_UC_CONFIGURATION";
    private static final String ARG_UC_CUSTOM_HELP_PHONE_NUMBER_TYPE = "ARG_UC_CUSTOM_HELP_PHONE_NUMBER_TYPE";
    private static final String ARG_UC_SYSTEM_TIME = "ARG_UC_SYSTEM_TIME";
    private UniversalCheckoutAnalyticsConfiguration analyticsConfiguration;
    private HybridCoordinator coordinator;
    private String customHelpPhoneNumberType;

    @Inject
    protected UniversalCheckoutEnvironment environment;
    private boolean hasCheckedResidencyValidation;
    private boolean isFirstLoad = true;
    private List<TicketOrder.Item> items;
    private boolean loadCheckoutAfterResidencyCheck;
    private LinearLayout loader;
    private SnowballHeader parkHeader;

    @Inject
    protected ProfileConfiguration profileConfiguration;

    @Inject
    protected ProfileManager profileManager;
    protected ProfileNavEntriesBuilderProvider profileNavEntriesBuilderProvider;

    @Inject
    protected C9340o reachabilityMonitor;
    private String startUrl;
    private Calendar systemTime;
    private TicketOrder ticketOrder;
    private String ucConfiguration;
    protected UniversalCheckoutAnalyticsManager universalCheckoutAnalyticsManager;

    @Inject
    protected UniversalCheckoutConfiguration universalCheckoutConfiguration;

    @Inject
    protected UniversalCheckoutDataManager universalCheckoutDataManager;
    private UniversalCheckoutHelper universalCheckoutHelper;
    private boolean userNeedsFlValidation;

    @Inject
    protected C9248i vendomatic;
    private WebView webView;

    private void addRequestTypeElement() {
        try {
            fillTicketOrder();
            if (this.ticketOrder != null) {
                Gson gson = new Gson();
                JsonObject asJsonObject = gson.toJsonTree(this.ticketOrder).getAsJsonObject();
                asJsonObject.addProperty("requestType", "native-items");
                this.ucConfiguration = URLEncoder.encode(GsonInstrumentation.toJson(gson, (JsonElement) asJsonObject), "UTF-8").replace("+", "%20");
                this.ticketOrder = null;
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    private void checkResidencyValidation() {
        if (this.hasCheckedResidencyValidation || !this.vendomatic.m38785q1()) {
            this.loadCheckoutAfterResidencyCheck = true;
        } else {
            this.universalCheckoutDataManager.getUserAffiliations();
        }
    }

    private void fillTicketOrder() throws UnsupportedEncodingException {
        if (C22466q.m68722b(this.ucConfiguration)) {
            return;
        }
        try {
            this.ticketOrder = (TicketOrder) GsonInstrumentation.fromJson(new Gson(), URLDecoder.decode(this.ucConfiguration.replace("%20", "+"), "UTF-8"), TicketOrder.class);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    private boolean isFloridaTicket() throws UnsupportedEncodingException {
        fillTicketOrder();
        TicketOrder ticketOrder = this.ticketOrder;
        if (ticketOrder != null && !"MOD".equals(ticketOrder.getOrderType()) && !"UPGRADE".equals(this.ticketOrder.getOrderType()) && this.ticketOrder.getItems() != null) {
            for (TicketOrder.Item item : this.ticketOrder.getItems()) {
                if (!C22466q.m68722b(item.getConfiguration().getTicketAffiliation()) && Affiliations.Affiliation.AffiliationType.FL_RESIDENT.name().equals(item.getConfiguration().getTicketAffiliation())) {
                    removeTicketAffiliationElement();
                    return true;
                }
            }
        }
        removeTicketAffiliationElement();
        return false;
    }

    private boolean isOrionFlow() throws UnsupportedEncodingException {
        fillTicketOrder();
        TicketOrder ticketOrder = this.ticketOrder;
        if (ticketOrder == null || ticketOrder.getOrderConfiguration() == null) {
            return false;
        }
        return (this.ticketOrder.getOrderConfiguration().getGp() == null && this.ticketOrder.getOrderConfiguration().getEa() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFetchJwtToken$0(Boolean bool) {
        this.universalCheckoutHelper.onReadyForSSO();
    }

    private void loadCheckout() {
        if (this.webView == null) {
            if (this.loadCheckoutAfterResidencyCheck) {
                if (isOrionFlow()) {
                    removeItemsElement();
                    addRequestTypeElement();
                }
                initWebHybrid();
            }
            this.webView = this.coordinator.getHybridFragment().webView;
            if (C9384u.INSTANCE.m39212a()) {
                this.profileManager.fetchUserAccessInfo();
                return;
            }
            UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
            if (universalCheckoutHelper != null) {
                universalCheckoutHelper.onFinishLoadingScreen(null, false);
                this.universalCheckoutHelper.onDisabledWebView();
            }
        }
    }

    private void navigateToLogin() {
        navigate(null, this.profileNavEntriesBuilderProvider.getNavigationEntryForSecondarySignIn(getActivity()).withCallbacks(new LightBoxCallbacks() { // from class: com.disney.wdpro.universal_checkout_ui.ui.fragments.UniversalCheckoutFragment.2
            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onCancel() {
                UniversalCheckoutFragment.this.finish();
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

    private boolean needsFLValidation(EnumSet<Affiliations.Affiliation.AffiliationType> enumSet) {
        this.userNeedsFlValidation = userNeedsFLResident(enumSet);
        return this.vendomatic.m38785q1() && isFloridaTicket() && this.userNeedsFlValidation;
    }

    public static final UniversalCheckoutFragment newInstance(String str, Calendar calendar, UniversalCheckoutAnalyticsConfiguration universalCheckoutAnalyticsConfiguration, String str2) {
        UniversalCheckoutFragment universalCheckoutFragment = new UniversalCheckoutFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_UC_CONFIGURATION, str);
        bundle.putSerializable(ARG_UC_SYSTEM_TIME, calendar);
        bundle.putSerializable(ARG_UC_ANALYTICS_CONFIGURATION, universalCheckoutAnalyticsConfiguration);
        bundle.putString(ARG_UC_CUSTOM_HELP_PHONE_NUMBER_TYPE, str2);
        universalCheckoutFragment.setArguments(bundle);
        return universalCheckoutFragment;
    }

    private void removeItemsElement() {
        try {
            fillTicketOrder();
            if (this.ticketOrder != null) {
                Gson gson = new Gson();
                JsonObject asJsonObject = gson.toJsonTree(this.ticketOrder).getAsJsonObject();
                this.items = (List) GsonInstrumentation.fromJson(gson, asJsonObject.getAsJsonArray("items"), new TypeToken<List<TicketOrder.Item>>() { // from class: com.disney.wdpro.universal_checkout_ui.ui.fragments.UniversalCheckoutFragment.1
                }.getType());
                asJsonObject.remove("items");
                this.ucConfiguration = URLEncoder.encode(GsonInstrumentation.toJson(gson, (JsonElement) asJsonObject), "UTF-8").replace("+", "%20");
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    private void removeTicketAffiliationElement() {
        try {
            fillTicketOrder();
            if (this.ticketOrder != null) {
                Gson gson = new Gson();
                JsonObject asJsonObject = gson.toJsonTree(this.ticketOrder).getAsJsonObject();
                JsonArray asJsonArray = asJsonObject.getAsJsonArray("items");
                if (asJsonArray != null) {
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        JsonObject asJsonObject2 = it.next().getAsJsonObject();
                        if (asJsonObject2.has("configuration")) {
                            asJsonObject2.get("configuration").getAsJsonObject().remove("ticketAffiliation");
                        }
                    }
                }
                this.ucConfiguration = URLEncoder.encode(GsonInstrumentation.toJson(gson, (JsonElement) asJsonObject), "UTF-8").replace("+", "%20");
                this.ticketOrder = null;
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    private boolean userNeedsFLResident(EnumSet<Affiliations.Affiliation.AffiliationType> enumSet) {
        Iterator<Affiliations.Affiliation.AffiliationType> it = enumSet.iterator();
        while (it.hasNext()) {
            Affiliations.Affiliation.AffiliationType next = it.next();
            if (next.equals(Affiliations.Affiliation.AffiliationType.RESIDENCY) && next.getSubtypes().contains(Affiliations.Affiliation.AffiliationSubtype.FLORIDA)) {
                return false;
            }
        }
        return true;
    }

    public boolean canWebViewGoBack() {
        WebView webView = this.webView;
        return (webView == null || webView.getUrl() == null || this.webView.getUrl().contains(this.startUrl) || !this.webView.canGoBack()) ? false : true;
    }

    public void dismiss() {
        this.universalCheckoutHelper.dismiss();
        this.universalCheckoutHelper.setConfirmationLoaded(false);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void finish() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return InterfaceC8679k.IGNORE;
    }

    @Subscribe
    public void handleUserAffiliationsResponse(UniversalCheckoutDataManager.UserAffiliationsResponseEvent userAffiliationsResponseEvent) {
        if (userAffiliationsResponseEvent.isSuccess()) {
            this.hasCheckedResidencyValidation = true;
            if (needsFLValidation(userAffiliationsResponseEvent.getPayload())) {
                this.universalCheckoutDataManager.setJwt(null);
                this.universalCheckoutAnalyticsManager.trackStartIdMeFlow();
                this.childNavigator.m37382o(this.profileNavEntriesBuilderProvider.getResidencyVerificationNavigationEntry(getContext()));
                return;
            }
        }
        removeTicketAffiliationElement();
        this.loadCheckoutAfterResidencyCheck = true;
        loadCheckout();
        this.loadCheckoutAfterResidencyCheck = false;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void initWebHybrid() {
        if (C9384u.INSTANCE.m39212a()) {
            HybridUtilities.clearCookies(CookieManager.getInstance());
        }
        this.universalCheckoutHelper.initWebHybrid(this.ucConfiguration, this.systemTime);
        this.universalCheckoutHelper.setUniversalCheckoutHelperListener(this);
        HybridCoordinator coordinator = this.universalCheckoutHelper.getCoordinator();
        this.coordinator = coordinator;
        PrintPlugin printPlugin = (PrintPlugin) coordinator.getPlugin(PrintPlugin.f71779ID);
        if (printPlugin != null) {
            printPlugin.setPrintContext(((UniversalCheckoutActivity) requireActivity()).getOriginalContext());
        }
        this.startUrl = this.universalCheckoutHelper.getConfig().getEntryPoints().get(0).getStartUrl();
        this.childNavigator.m37387v(this.coordinator.getHybridFragment()).m37332j(C21435R.id.hybridfragment).m37330h().navigate();
    }

    public boolean isConfirmationLoaded() {
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            return universalCheckoutHelper.isConfirmationLoaded();
        }
        return false;
    }

    public boolean isModalOpened() {
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            return universalCheckoutHelper.isModalOpened();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.profileNavEntriesBuilderProvider = this.profileConfiguration.getProfileNavEntriesBuilderProvider();
        this.universalCheckoutAnalyticsManager = new UniversalCheckoutAnalyticsManagerImpl(new UniversalCheckoutAnalyticsHelper(this.analyticsHelper, this.analyticsConfiguration));
        if (C22466q.m68722b(this.customHelpPhoneNumberType) || !this.customHelpPhoneNumberType.equals(Constants.USE_ORION_HELP_PHONE_NUMBER)) {
            this.universalCheckoutHelper = new UniversalCheckoutHelper(getActivity(), this.environment, this.childNavigator, this.analyticsHelper, this.authenticationManager, true, this.profileManager, this.universalCheckoutDataManager, this.universalCheckoutConfiguration, this.vendomatic);
        } else {
            this.universalCheckoutHelper = new UniversalCheckoutHelper(getActivity(), this.environment, this.childNavigator, this.analyticsHelper, this.authenticationManager, true, this.profileManager, this.universalCheckoutDataManager, this.universalCheckoutConfiguration, this.vendomatic, this.universalCheckoutConfiguration.getDestinationCode() == "WDW" ? getString(C21435R.string.wdw_orion_help_desk_dial_phone_number) : getString(C21435R.string.dlr_orion_help_desk_dial_phone_number));
        }
        this.reachabilityMonitor.m39029o();
        this.universalCheckoutDataManager.setLowTrustAllowed(isOrionFlow());
        checkResidencyValidation();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1822) {
            if (i11 != -1 || !intent.hasExtra(ResidencyVerificationActivity.RESIDENCY_VERIFICATION_RESPONSE)) {
                onBackPressed();
                return;
            }
            this.universalCheckoutAnalyticsManager.trackIdMeFinishResult(((ResidencyVerificationResponse) intent.getSerializableExtra(ResidencyVerificationActivity.RESIDENCY_VERIFICATION_RESPONSE)).getStatus());
            this.loadCheckoutAfterResidencyCheck = true;
        }
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((UniversalCheckoutComponentProvider) getActivity().getApplication()).getUniversalCheckoutComponent().inject(this);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void onBackPressed() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.ucConfiguration = getArguments().getString(ARG_UC_CONFIGURATION);
            this.systemTime = (Calendar) getArguments().getSerializable(ARG_UC_SYSTEM_TIME);
            this.analyticsConfiguration = (UniversalCheckoutAnalyticsConfiguration) getArguments().getSerializable(ARG_UC_ANALYTICS_CONFIGURATION);
            this.customHelpPhoneNumberType = getArguments().getString(ARG_UC_CUSTOM_HELP_PHONE_NUMBER_TYPE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C21435R.layout.universal_checkout_fragment, viewGroup, false);
        this.loader = (LinearLayout) viewInflate.findViewById(C21435R.id.loader);
        this.parkHeader = (SnowballHeader) viewInflate.findViewById(C21435R.id.park_header);
        if (this.universalCheckoutConfiguration.getDestinationCode().equals("DLR")) {
            this.parkHeader.setHeaderLogoImage(C21435R.drawable.dlr_logo);
            return viewInflate;
        }
        this.parkHeader.setHeaderLogoAnim(C21435R.raw.wdw_park_header_logo);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (C9384u.INSTANCE.m39212a()) {
            HybridUtilities.clearCookies(CookieManager.getInstance());
        }
        super.onDestroy();
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Subscribe
    public void onFetchJwtToken(UniversalCheckoutDataManager.JwtTokenResponseEvent jwtTokenResponseEvent) {
        this.universalCheckoutDataManager.setJwt(jwtTokenResponseEvent.getJwtToken());
        if (!this.isFirstLoad) {
            this.universalCheckoutHelper.onReadyForSSO();
            return;
        }
        this.isFirstLoad = false;
        if (C9384u.INSTANCE.m39212a()) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: com.disney.wdpro.universal_checkout_ui.ui.fragments.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    this.f45083a.lambda$onFetchJwtToken$0((Boolean) obj);
                }
            });
        } else {
            this.universalCheckoutHelper.onReadyForSSO();
        }
    }

    @Subscribe
    public void onFetchUserAccessEvent(ProfileManager.FetchUserAccessEvent fetchUserAccessEvent) {
        if (this.universalCheckoutDataManager.isLowTrustAllowed()) {
            UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
            if (universalCheckoutHelper != null) {
                universalCheckoutHelper.lambda$requestTokenForSSO$0();
                return;
            }
            return;
        }
        if (!fetchUserAccessEvent.isSuccess()) {
            this.universalCheckoutDataManager.setJwt(null);
            navigateToLogin();
            return;
        }
        String swid = fetchUserAccessEvent.getSwid();
        String accessToken = fetchUserAccessEvent.getAccessToken();
        AccessTokenStatus accessTokenStatus = fetchUserAccessEvent.getAccessTokenStatus();
        if (accessTokenStatus == null || !accessTokenStatus.isHighTrust()) {
            this.universalCheckoutDataManager.setJwt(null);
            navigateToLogin();
        } else if (C22466q.m68722b(swid) || C22466q.m68722b(accessToken)) {
            this.universalCheckoutDataManager.setJwt(null);
            navigateToLogin();
        } else {
            UniversalCheckoutHelper universalCheckoutHelper2 = this.universalCheckoutHelper;
            if (universalCheckoutHelper2 != null) {
                universalCheckoutHelper2.lambda$requestTokenForSSO$0();
            }
        }
    }

    @Subscribe
    public void onLoginEvent(ProfileManager.LoginDataEvent loginDataEvent) {
        if (loginDataEvent.isSuccess()) {
            this.universalCheckoutDataManager.setJwt(null);
            if (this.universalCheckoutHelper != null) {
                this.profileManager.fetchUserAccessInfo();
                return;
            }
            return;
        }
        this.loader.setVisibility(8);
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            universalCheckoutHelper.showErrorBanner(true);
        }
    }

    @Subscribe
    public void onNetworkReachabilityEvent(C9340o.c cVar) {
        if (cVar.m39032b()) {
            return;
        }
        this.universalCheckoutHelper.showConnectivityErrorBanner();
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.reachabilityMonitor.m39030p();
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void onReadyForRequestItems() {
        if (this.items != null) {
            this.universalCheckoutHelper.sendRequestItems(GsonInstrumentation.toJson(new Gson(), this.items));
        }
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.coordinator != null) {
            this.universalCheckoutHelper.updateScreenFlag();
        }
        if (this.loadCheckoutAfterResidencyCheck) {
            loadCheckout();
            this.loadCheckoutAfterResidencyCheck = false;
        }
    }

    public void sendBackButtonEvent() {
        HybridCoordinator hybridCoordinator = this.coordinator;
        if (hybridCoordinator == null || hybridCoordinator.getHybridFragment() == null) {
            return;
        }
        this.coordinator.getHybridFragment().sendBackButtonEvent();
    }

    public void sendMessageToShowDismissModal() {
        this.universalCheckoutHelper.sendMessageToShowDismissModal();
    }

    public boolean shouldShowDismissModal() {
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            return universalCheckoutHelper.shouldShowDismissModal();
        }
        return false;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void updateWebViewUI(String str, boolean z10, int i10, boolean z11) {
        if (z10) {
            this.loader.setVisibility(0);
            this.parkHeader.setVisibility(0);
        } else {
            this.loader.setVisibility(8);
            this.parkHeader.setVisibility(8);
        }
    }

    public void webViewGoBack() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goBack();
        }
    }
}