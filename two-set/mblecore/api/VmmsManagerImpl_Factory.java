package com.disney.wdpro.mblecore.api;

import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class VmmsManagerImpl_Factory implements InterfaceC30583e<VmmsManagerImpl> {
    private final Provider<VmmsApiClient> vmmsApiClientProvider;

    public VmmsManagerImpl_Factory(Provider<VmmsApiClient> provider) {
        this.vmmsApiClientProvider = provider;
    }

    public static VmmsManagerImpl_Factory create(Provider<VmmsApiClient> provider) {
        return new VmmsManagerImpl_Factory(provider);
    }

    public static VmmsManagerImpl newInstance(VmmsApiClient vmmsApiClient) {
        return new VmmsManagerImpl(vmmsApiClient);
    }

    @Override // javax.inject.Provider
    public VmmsManagerImpl get() {
        return newInstance(this.vmmsApiClientProvider.get());
    }
}