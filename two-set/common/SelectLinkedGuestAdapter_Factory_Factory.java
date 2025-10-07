package com.disney.wdpro.virtualqueue.p462ui.common;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class SelectLinkedGuestAdapter_Factory_Factory implements InterfaceC30583e<SelectLinkedGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public SelectLinkedGuestAdapter_Factory_Factory(Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        this.parkAppConfigurationProvider = provider;
        this.linkedGuestUtilsProvider = provider2;
    }

    public static SelectLinkedGuestAdapter_Factory_Factory create(Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        return new SelectLinkedGuestAdapter_Factory_Factory(provider, provider2);
    }

    public static SelectLinkedGuestAdapter.Factory newInstance(C9314j c9314j, LinkedGuestUtils linkedGuestUtils) {
        return new SelectLinkedGuestAdapter.Factory(c9314j, linkedGuestUtils);
    }

    @Override // javax.inject.Provider
    public SelectLinkedGuestAdapter.Factory get() {
        return newInstance(this.parkAppConfigurationProvider.get(), this.linkedGuestUtilsProvider.get());
    }
}