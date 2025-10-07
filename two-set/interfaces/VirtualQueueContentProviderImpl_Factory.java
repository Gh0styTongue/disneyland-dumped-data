package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueContentProviderImpl_Factory implements InterfaceC30583e<VirtualQueueContentProviderImpl> {
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueContentProviderImpl_Factory(Provider<VirtualQueueThemer> provider) {
        this.vqThemerProvider = provider;
    }

    public static VirtualQueueContentProviderImpl_Factory create(Provider<VirtualQueueThemer> provider) {
        return new VirtualQueueContentProviderImpl_Factory(provider);
    }

    public static VirtualQueueContentProviderImpl newInstance(VirtualQueueThemer virtualQueueThemer) {
        return new VirtualQueueContentProviderImpl(virtualQueueThemer);
    }

    @Override // javax.inject.Provider
    public VirtualQueueContentProviderImpl get() {
        return newInstance(this.vqThemerProvider.get());
    }
}