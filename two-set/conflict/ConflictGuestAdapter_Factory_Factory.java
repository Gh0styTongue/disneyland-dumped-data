package com.disney.wdpro.virtualqueue.p462ui.conflict;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class ConflictGuestAdapter_Factory_Factory implements InterfaceC30583e<ConflictGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public ConflictGuestAdapter_Factory_Factory(Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2) {
        this.linkedGuestUtilsProvider = provider;
        this.parkAppConfigurationProvider = provider2;
    }

    public static ConflictGuestAdapter_Factory_Factory create(Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2) {
        return new ConflictGuestAdapter_Factory_Factory(provider, provider2);
    }

    public static ConflictGuestAdapter.Factory newInstance(LinkedGuestUtils linkedGuestUtils, C9314j c9314j) {
        return new ConflictGuestAdapter.Factory(linkedGuestUtils, c9314j);
    }

    @Override // javax.inject.Provider
    public ConflictGuestAdapter.Factory get() {
        return newInstance(this.linkedGuestUtilsProvider.get(), this.parkAppConfigurationProvider.get());
    }
}