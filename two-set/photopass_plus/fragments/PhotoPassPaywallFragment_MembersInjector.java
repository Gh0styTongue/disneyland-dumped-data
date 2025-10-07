package com.disney.wdpro.photopass_plus.fragments;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment_MembersInjector;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.photopass.services.dto.CBPhotopassProductsScreen;
import com.disney.wdpro.photopass.services.p397cb.CBPhotoPassDocumentRepository;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment_MembersInjector;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes15.dex */
public final class PhotoPassPaywallFragment_MembersInjector implements MembersInjector<PhotoPassPaywallFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<CBPhotoPassDocumentRepository<CBPhotopassProductsScreen>> photoPassDAOProvider;
    private final Provider<ResidentOfferManager> residentOfferManagerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9350r> timeProvider2;
    private final Provider<C9248i> vendomaticProvider;

    public PhotoPassPaywallFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9350r> provider8, Provider<C9350r> provider9, Provider<C9248i> provider10, Provider<CBPhotoPassDocumentRepository<CBPhotopassProductsScreen>> provider11) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.residentOfferManagerProvider = provider7;
        this.timeProvider = provider8;
        this.timeProvider2 = provider9;
        this.vendomaticProvider = provider10;
        this.photoPassDAOProvider = provider11;
    }

    public static MembersInjector<PhotoPassPaywallFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9350r> provider8, Provider<C9350r> provider9, Provider<C9248i> provider10, Provider<CBPhotoPassDocumentRepository<CBPhotopassProductsScreen>> provider11) {
        return new PhotoPassPaywallFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectPhotoPassDAO(PhotoPassPaywallFragment photoPassPaywallFragment, CBPhotoPassDocumentRepository<CBPhotopassProductsScreen> cBPhotoPassDocumentRepository) {
        photoPassPaywallFragment.photoPassDAO = cBPhotoPassDocumentRepository;
    }

    public static void injectVendomatic(PhotoPassPaywallFragment photoPassPaywallFragment, C9248i c9248i) {
        photoPassPaywallFragment.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PhotoPassPaywallFragment photoPassPaywallFragment) {
        C9308e.m38895d(photoPassPaywallFragment, this.busProvider.get());
        C9308e.m38892a(photoPassPaywallFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(photoPassPaywallFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(photoPassPaywallFragment, this.crashHelperProvider.get());
        C9308e.m38897g(photoPassPaywallFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(photoPassPaywallFragment, this.androidInjectorProvider.get());
        BaseSelectionFragment_MembersInjector.injectResidentOfferManager(photoPassPaywallFragment, this.residentOfferManagerProvider.get());
        BaseSelectionFragment_MembersInjector.injectTime(photoPassPaywallFragment, this.timeProvider.get());
        BaseSelectionVASFragment_MembersInjector.injectTime(photoPassPaywallFragment, this.timeProvider2.get());
        injectVendomatic(photoPassPaywallFragment, this.vendomaticProvider.get());
        injectPhotoPassDAO(photoPassPaywallFragment, this.photoPassDAOProvider.get());
    }
}