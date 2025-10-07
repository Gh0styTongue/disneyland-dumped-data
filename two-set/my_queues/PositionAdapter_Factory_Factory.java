package com.disney.wdpro.virtualqueue.p462ui.my_queues;

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
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class PositionAdapter_Factory_Factory implements InterfaceC30583e<PositionAdapter.Factory> {
    private final Provider<DeepLinkConfig> deepLinkConfigProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PartyListAdapter.Factory> partyListAdapterFactoryProvider;
    private final Provider<PicassoUtils> picassoUtilsProvider;
    private final Provider<Point> screenSizeProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public PositionAdapter_Factory_Factory(Provider<PicassoUtils> provider, Provider<VirtualQueueAnalytics> provider2, Provider<C9314j> provider3, Provider<FacilityUtils> provider4, Provider<Point> provider5, Provider<VirtualQueueThemer> provider6, Provider<DeepLinkConfig> provider7, Provider<PartyListAdapter.Factory> provider8) {
        this.picassoUtilsProvider = provider;
        this.virtualQueueAnalyticsProvider = provider2;
        this.parkAppConfigurationProvider = provider3;
        this.facilityUtilsProvider = provider4;
        this.screenSizeProvider = provider5;
        this.vqThemerProvider = provider6;
        this.deepLinkConfigProvider = provider7;
        this.partyListAdapterFactoryProvider = provider8;
    }

    public static PositionAdapter_Factory_Factory create(Provider<PicassoUtils> provider, Provider<VirtualQueueAnalytics> provider2, Provider<C9314j> provider3, Provider<FacilityUtils> provider4, Provider<Point> provider5, Provider<VirtualQueueThemer> provider6, Provider<DeepLinkConfig> provider7, Provider<PartyListAdapter.Factory> provider8) {
        return new PositionAdapter_Factory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static PositionAdapter.Factory newInstance(PicassoUtils picassoUtils, VirtualQueueAnalytics virtualQueueAnalytics, C9314j c9314j, FacilityUtils facilityUtils, Point point, VirtualQueueThemer virtualQueueThemer, DeepLinkConfig deepLinkConfig, PartyListAdapter.Factory factory) {
        return new PositionAdapter.Factory(picassoUtils, virtualQueueAnalytics, c9314j, facilityUtils, point, virtualQueueThemer, deepLinkConfig, factory);
    }

    @Override // javax.inject.Provider
    public PositionAdapter.Factory get() {
        return newInstance(this.picassoUtilsProvider.get(), this.virtualQueueAnalyticsProvider.get(), this.parkAppConfigurationProvider.get(), this.facilityUtilsProvider.get(), this.screenSizeProvider.get(), this.vqThemerProvider.get(), this.deepLinkConfigProvider.get(), this.partyListAdapterFactoryProvider.get());
    }
}