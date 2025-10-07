package com.disney.wdpro.virtualqueue.core;

import com.disney.wdpro.commons.C9314j;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueDestinationProviderImpl_Factory implements InterfaceC30583e<VirtualQueueDestinationProviderImpl> {
    private final Provider<C9314j> parkAppConfigurationProvider;

    public VirtualQueueDestinationProviderImpl_Factory(Provider<C9314j> provider) {
        this.parkAppConfigurationProvider = provider;
    }

    public static VirtualQueueDestinationProviderImpl_Factory create(Provider<C9314j> provider) {
        return new VirtualQueueDestinationProviderImpl_Factory(provider);
    }

    public static VirtualQueueDestinationProviderImpl newInstance(C9314j c9314j) {
        return new VirtualQueueDestinationProviderImpl(c9314j);
    }

    @Override // javax.inject.Provider
    public VirtualQueueDestinationProviderImpl get() {
        return newInstance(this.parkAppConfigurationProvider.get());
    }
}