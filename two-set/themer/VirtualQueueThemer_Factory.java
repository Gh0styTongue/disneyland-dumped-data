package com.disney.wdpro.virtualqueue.themer;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.dash.couchbase.InterfaceC9400d;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueThemer_Factory implements InterfaceC30583e<VirtualQueueThemer> {
    private final Provider<InterfaceC9400d> cbEnvironmentProvider;
    private final Provider<Context> contextProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;

    public VirtualQueueThemer_Factory(Provider<C9314j> provider, Provider<VirtualQueueRepository> provider2, Provider<InterfaceC9400d> provider3, Provider<Context> provider4) {
        this.parkAppConfigurationProvider = provider;
        this.virtualQueueRepositoryProvider = provider2;
        this.cbEnvironmentProvider = provider3;
        this.contextProvider = provider4;
    }

    public static VirtualQueueThemer_Factory create(Provider<C9314j> provider, Provider<VirtualQueueRepository> provider2, Provider<InterfaceC9400d> provider3, Provider<Context> provider4) {
        return new VirtualQueueThemer_Factory(provider, provider2, provider3, provider4);
    }

    public static VirtualQueueThemer newInstance(C9314j c9314j, VirtualQueueRepository virtualQueueRepository, InterfaceC9400d interfaceC9400d, Context context) {
        return new VirtualQueueThemer(c9314j, virtualQueueRepository, interfaceC9400d, context);
    }

    @Override // javax.inject.Provider
    public VirtualQueueThemer get() {
        return newInstance(this.parkAppConfigurationProvider.get(), this.virtualQueueRepositoryProvider.get(), this.cbEnvironmentProvider.get(), this.contextProvider.get());
    }
}