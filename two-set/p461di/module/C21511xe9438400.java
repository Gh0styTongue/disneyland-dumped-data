package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.DetailFragmentModule_ProvideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21511xe9438400 implements InterfaceC30583e<VirtualQueueSecretTapAdapter.Factory> {
    private final Provider<PeekViewActions> actionsProvider;
    private final DetailFragmentModule module;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public C21511xe9438400(DetailFragmentModule detailFragmentModule, Provider<VirtualQueueThemer> provider, Provider<VirtualQueueAnalytics> provider2, Provider<PeekViewActions> provider3) {
        this.module = detailFragmentModule;
        this.vqThemerProvider = provider;
        this.virtualQueueAnalyticsProvider = provider2;
        this.actionsProvider = provider3;
    }

    public static C21511xe9438400 create(DetailFragmentModule detailFragmentModule, Provider<VirtualQueueThemer> provider, Provider<VirtualQueueAnalytics> provider2, Provider<PeekViewActions> provider3) {
        return new C21511xe9438400(detailFragmentModule, provider, provider2, provider3);
    }

    /* renamed from: provideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory$virtual_queue_lib_release */
    public static VirtualQueueSecretTapAdapter.Factory m64835x103b78b8(DetailFragmentModule detailFragmentModule, VirtualQueueThemer virtualQueueThemer, VirtualQueueAnalytics virtualQueueAnalytics, PeekViewActions peekViewActions) {
        return (VirtualQueueSecretTapAdapter.Factory) C30587i.m94207e(detailFragmentModule.m64834x103b78b8(virtualQueueThemer, virtualQueueAnalytics, peekViewActions));
    }

    @Override // javax.inject.Provider
    public VirtualQueueSecretTapAdapter.Factory get() {
        return m64835x103b78b8(this.module, this.vqThemerProvider.get(), this.virtualQueueAnalyticsProvider.get(), this.actionsProvider.get());
    }
}