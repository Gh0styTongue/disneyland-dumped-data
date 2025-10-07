package com.disney.wdpro.general_ticket_sales_ui.activities;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity_MembersInjector;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.bookingservices.model.CommerceCheckoutEnvironment;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.support.activities.C20530d;
import com.disney.wdpro.ticket_sales_managers.util.CommerceCheckoutMaxPassIntentProvider;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.settings.UnifiedCheckoutSecretConfig;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* loaded from: classes28.dex */
public final class GeneralTicketSalesActivity_MembersInjector implements MembersInjector<GeneralTicketSalesActivity> {
    private final Provider<InterfaceC8669a> abTestingHelperProvider;
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<CommerceCheckoutEnvironment> commerceCheckoutEnvironmentProvider;
    private final Provider<CommerceCheckoutMaxPassIntentProvider> commerceCheckoutMaxPassIntentProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<ProfileConfiguration> profileConfigurationProvider;
    private final Provider<ProfileManager> profileManagerProvider;
    private final Provider<ResidentOfferManager> residentOfferManagerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<UnifiedCheckoutSecretConfig> unifiedCheckoutSecretConfigProvider;
    private final Provider<UniversalCheckoutConfiguration> universalCheckoutConfigurationProvider;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public GeneralTicketSalesActivity_MembersInjector(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<C9314j> provider9, Provider<C9248i> provider10, Provider<UniversalCheckoutConfiguration> provider11, Provider<UnifiedCheckoutSecretConfig> provider12, Provider<UniversalCheckoutDataManager> provider13, Provider<ProfileConfiguration> provider14, Provider<InterfaceC8669a> provider15, Provider<ProfileManager> provider16, Provider<ResidentOfferManager> provider17, Provider<CommerceCheckoutMaxPassIntentProvider> provider18, Provider<CommerceCheckoutEnvironment> provider19) {
        this.busProvider = provider;
        this.authenticationManagerProvider = provider2;
        this.navigationListenerProvider = provider3;
        this.analyticsHelperProvider = provider4;
        this.crashHelperProvider = provider5;
        this.adobeNotificationTrackingHelperProvider = provider6;
        this.androidInjectorProvider = provider7;
        this.timeProvider = provider8;
        this.parkAppConfigurationProvider = provider9;
        this.vendomaticProvider = provider10;
        this.universalCheckoutConfigurationProvider = provider11;
        this.unifiedCheckoutSecretConfigProvider = provider12;
        this.universalCheckoutDataManagerProvider = provider13;
        this.profileConfigurationProvider = provider14;
        this.abTestingHelperProvider = provider15;
        this.profileManagerProvider = provider16;
        this.residentOfferManagerProvider = provider17;
        this.commerceCheckoutMaxPassIntentProvider = provider18;
        this.commerceCheckoutEnvironmentProvider = provider19;
    }

    public static MembersInjector<GeneralTicketSalesActivity> create(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<C9314j> provider9, Provider<C9248i> provider10, Provider<UniversalCheckoutConfiguration> provider11, Provider<UnifiedCheckoutSecretConfig> provider12, Provider<UniversalCheckoutDataManager> provider13, Provider<ProfileConfiguration> provider14, Provider<InterfaceC8669a> provider15, Provider<ProfileManager> provider16, Provider<ResidentOfferManager> provider17, Provider<CommerceCheckoutMaxPassIntentProvider> provider18, Provider<CommerceCheckoutEnvironment> provider19) {
        return new GeneralTicketSalesActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static void injectCommerceCheckoutEnvironment(GeneralTicketSalesActivity generalTicketSalesActivity, CommerceCheckoutEnvironment commerceCheckoutEnvironment) {
        generalTicketSalesActivity.commerceCheckoutEnvironment = commerceCheckoutEnvironment;
    }

    public static void injectCommerceCheckoutMaxPassIntentProvider(GeneralTicketSalesActivity generalTicketSalesActivity, CommerceCheckoutMaxPassIntentProvider commerceCheckoutMaxPassIntentProvider) {
        generalTicketSalesActivity.commerceCheckoutMaxPassIntentProvider = commerceCheckoutMaxPassIntentProvider;
    }

    public static void injectResidentOfferManager(GeneralTicketSalesActivity generalTicketSalesActivity, ResidentOfferManager residentOfferManager) {
        generalTicketSalesActivity.residentOfferManager = residentOfferManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GeneralTicketSalesActivity generalTicketSalesActivity) {
        C9251d.m38816e(generalTicketSalesActivity, this.busProvider.get());
        C9251d.m38815d(generalTicketSalesActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(generalTicketSalesActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(generalTicketSalesActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(generalTicketSalesActivity, this.crashHelperProvider.get());
        C9251d.m38812a(generalTicketSalesActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(generalTicketSalesActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(generalTicketSalesActivity, this.timeProvider.get());
        SalesActivity_MembersInjector.injectParkAppConfiguration(generalTicketSalesActivity, this.parkAppConfigurationProvider.get());
        SalesActivity_MembersInjector.injectVendomatic(generalTicketSalesActivity, this.vendomaticProvider.get());
        SalesActivity_MembersInjector.injectUniversalCheckoutConfiguration(generalTicketSalesActivity, this.universalCheckoutConfigurationProvider.get());
        SalesActivity_MembersInjector.injectUnifiedCheckoutSecretConfig(generalTicketSalesActivity, this.unifiedCheckoutSecretConfigProvider.get());
        SalesActivity_MembersInjector.injectUniversalCheckoutDataManager(generalTicketSalesActivity, this.universalCheckoutDataManagerProvider.get());
        SalesActivity_MembersInjector.injectProfileConfiguration(generalTicketSalesActivity, this.profileConfigurationProvider.get());
        SalesActivity_MembersInjector.injectAbTestingHelper(generalTicketSalesActivity, this.abTestingHelperProvider.get());
        SalesActivity_MembersInjector.injectProfileManager(generalTicketSalesActivity, this.profileManagerProvider.get());
        injectResidentOfferManager(generalTicketSalesActivity, this.residentOfferManagerProvider.get());
        injectCommerceCheckoutMaxPassIntentProvider(generalTicketSalesActivity, this.commerceCheckoutMaxPassIntentProvider.get());
        injectCommerceCheckoutEnvironment(generalTicketSalesActivity, this.commerceCheckoutEnvironmentProvider.get());
    }
}