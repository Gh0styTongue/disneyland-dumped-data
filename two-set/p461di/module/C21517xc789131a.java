package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueMainAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.HubLandingFragmentModule_ProvideSelectQueueMainAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21517xc789131a implements InterfaceC30583e<SelectQueueMainAdapter.Factory> {
    private final HubLandingFragmentModule module;
    private final Provider<VirtualQueueSecretTapAdapter.Factory> secretTapAdapterFactoryProvider;
    private final Provider<SelectQueueCardAdapter.Factory> selectQueueCardAdapterFactoryProvider;

    public C21517xc789131a(HubLandingFragmentModule hubLandingFragmentModule, Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<SelectQueueCardAdapter.Factory> provider2) {
        this.module = hubLandingFragmentModule;
        this.secretTapAdapterFactoryProvider = provider;
        this.selectQueueCardAdapterFactoryProvider = provider2;
    }

    public static C21517xc789131a create(HubLandingFragmentModule hubLandingFragmentModule, Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<SelectQueueCardAdapter.Factory> provider2) {
        return new C21517xc789131a(hubLandingFragmentModule, provider, provider2);
    }

    public static SelectQueueMainAdapter.Factory provideSelectQueueMainAdapterFactory$virtual_queue_lib_release(HubLandingFragmentModule hubLandingFragmentModule, VirtualQueueSecretTapAdapter.Factory factory, SelectQueueCardAdapter.Factory factory2) {
        return (SelectQueueMainAdapter.Factory) C30587i.m94207e(hubLandingFragmentModule.provideSelectQueueMainAdapterFactory$virtual_queue_lib_release(factory, factory2));
    }

    @Override // javax.inject.Provider
    public SelectQueueMainAdapter.Factory get() {
        return provideSelectQueueMainAdapterFactory$virtual_queue_lib_release(this.module, this.secretTapAdapterFactoryProvider.get(), this.selectQueueCardAdapterFactoryProvider.get());
    }
}