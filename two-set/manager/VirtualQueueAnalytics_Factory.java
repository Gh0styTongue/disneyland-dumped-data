package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueAnalytics_Factory implements InterfaceC30583e<VirtualQueueAnalytics> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueAnalytics_Factory(Provider<InterfaceC8679k> provider, Provider<C9314j> provider2, Provider<VirtualQueueThemer> provider3, Provider<FacilityUtils> provider4) {
        this.analyticsHelperProvider = provider;
        this.parkAppConfigurationProvider = provider2;
        this.vqThemerProvider = provider3;
        this.facilityUtilsProvider = provider4;
    }

    public static VirtualQueueAnalytics_Factory create(Provider<InterfaceC8679k> provider, Provider<C9314j> provider2, Provider<VirtualQueueThemer> provider3, Provider<FacilityUtils> provider4) {
        return new VirtualQueueAnalytics_Factory(provider, provider2, provider3, provider4);
    }

    public static VirtualQueueAnalytics newInstance(InterfaceC8679k interfaceC8679k, C9314j c9314j, VirtualQueueThemer virtualQueueThemer, FacilityUtils facilityUtils) {
        return new VirtualQueueAnalytics(interfaceC8679k, c9314j, virtualQueueThemer, facilityUtils);
    }

    @Override // javax.inject.Provider
    public VirtualQueueAnalytics get() {
        return newInstance(this.analyticsHelperProvider.get(), this.parkAppConfigurationProvider.get(), this.vqThemerProvider.get(), this.facilityUtilsProvider.get());
    }
}