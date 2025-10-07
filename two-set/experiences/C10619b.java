package com.disney.wdpro.experiences;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.experiences.plugins.C10633h;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.lightbox.LightBoxSessionManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* renamed from: com.disney.wdpro.experiences.b */
/* loaded from: classes27.dex */
public final class C10619b implements MembersInjector<HybridExperiencesActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<LightBoxSessionManager> lightBoxSessionManagerProvider;
    private final Provider<C10633h> loggerProvider;
    private final Provider<C8667g.b> navigationListenerProvider;

    /* renamed from: a */
    public static void m45807a(HybridExperiencesActivity hybridExperiencesActivity, AuthenticationManager authenticationManager) {
        hybridExperiencesActivity.authManager = authenticationManager;
    }

    /* renamed from: b */
    public static void m45808b(HybridExperiencesActivity hybridExperiencesActivity, LightBoxSessionManager lightBoxSessionManager) {
        hybridExperiencesActivity.lightBoxSessionManager = lightBoxSessionManager;
    }

    /* renamed from: c */
    public static void m45809c(HybridExperiencesActivity hybridExperiencesActivity, C10633h c10633h) {
        hybridExperiencesActivity.logger = c10633h;
    }

    @Override // dagger.MembersInjector
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(HybridExperiencesActivity hybridExperiencesActivity) {
        C9251d.m38816e(hybridExperiencesActivity, this.busProvider.get());
        C9251d.m38815d(hybridExperiencesActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(hybridExperiencesActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(hybridExperiencesActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(hybridExperiencesActivity, this.crashHelperProvider.get());
        C9251d.m38812a(hybridExperiencesActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(hybridExperiencesActivity, this.androidInjectorProvider.get());
        m45807a(hybridExperiencesActivity, this.authManagerProvider.get());
        m45808b(hybridExperiencesActivity, this.lightBoxSessionManagerProvider.get());
        m45809c(hybridExperiencesActivity, this.loggerProvider.get());
    }
}