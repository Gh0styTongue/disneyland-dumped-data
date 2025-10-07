package com.disney.wdpro.virtualqueue.core.p461di.module;

import android.graphics.Point;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.deeplink.DeepLinkConfig;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.VirtualQueueConfirmationFragmentModule_ProvidesPositionAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21540x6e0bdc45 implements InterfaceC30583e<PositionAdapter.Factory> {
    private final Provider<DeepLinkConfig> deepLinkConfigProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final VirtualQueueConfirmationFragmentModule module;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PartyListAdapter.Factory> partyListAdapterFactoryProvider;
    private final Provider<PicassoUtils> picassoUtilsProvider;
    private final Provider<Point> screenSizeProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public C21540x6e0bdc45(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<PicassoUtils> provider, Provider<VirtualQueueAnalytics> provider2, Provider<C9314j> provider3, Provider<FacilityUtils> provider4, Provider<Point> provider5, Provider<VirtualQueueThemer> provider6, Provider<DeepLinkConfig> provider7, Provider<PartyListAdapter.Factory> provider8) {
        this.module = virtualQueueConfirmationFragmentModule;
        this.picassoUtilsProvider = provider;
        this.virtualQueueAnalyticsProvider = provider2;
        this.parkAppConfigurationProvider = provider3;
        this.facilityUtilsProvider = provider4;
        this.screenSizeProvider = provider5;
        this.vqThemerProvider = provider6;
        this.deepLinkConfigProvider = provider7;
        this.partyListAdapterFactoryProvider = provider8;
    }

    public static C21540x6e0bdc45 create(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<PicassoUtils> provider, Provider<VirtualQueueAnalytics> provider2, Provider<C9314j> provider3, Provider<FacilityUtils> provider4, Provider<Point> provider5, Provider<VirtualQueueThemer> provider6, Provider<DeepLinkConfig> provider7, Provider<PartyListAdapter.Factory> provider8) {
        return new C21540x6e0bdc45(virtualQueueConfirmationFragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static PositionAdapter.Factory providesPositionAdapterFactory$virtual_queue_lib_release(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, PicassoUtils picassoUtils, VirtualQueueAnalytics virtualQueueAnalytics, C9314j c9314j, FacilityUtils facilityUtils, Point point, VirtualQueueThemer virtualQueueThemer, DeepLinkConfig deepLinkConfig, PartyListAdapter.Factory factory) {
        return (PositionAdapter.Factory) C30587i.m94207e(virtualQueueConfirmationFragmentModule.providesPositionAdapterFactory$virtual_queue_lib_release(picassoUtils, virtualQueueAnalytics, c9314j, facilityUtils, point, virtualQueueThemer, deepLinkConfig, factory));
    }

    @Override // javax.inject.Provider
    public PositionAdapter.Factory get() {
        return providesPositionAdapterFactory$virtual_queue_lib_release(this.module, this.picassoUtilsProvider.get(), this.virtualQueueAnalyticsProvider.get(), this.parkAppConfigurationProvider.get(), this.facilityUtilsProvider.get(), this.screenSizeProvider.get(), this.vqThemerProvider.get(), this.deepLinkConfigProvider.get(), this.partyListAdapterFactoryProvider.get());
    }
}