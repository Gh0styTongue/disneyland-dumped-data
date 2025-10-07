package com.disney.wdpro.virtualqueue.p462ui.common;

import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class IneligibleGuestAdapter_Factory_Factory implements InterfaceC30583e<IneligibleGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;

    public IneligibleGuestAdapter_Factory_Factory(Provider<LinkedGuestUtils> provider) {
        this.linkedGuestUtilsProvider = provider;
    }

    public static IneligibleGuestAdapter_Factory_Factory create(Provider<LinkedGuestUtils> provider) {
        return new IneligibleGuestAdapter_Factory_Factory(provider);
    }

    public static IneligibleGuestAdapter.Factory newInstance(LinkedGuestUtils linkedGuestUtils) {
        return new IneligibleGuestAdapter.Factory(linkedGuestUtils);
    }

    @Override // javax.inject.Provider
    public IneligibleGuestAdapter.Factory get() {
        return newInstance(this.linkedGuestUtilsProvider.get());
    }
}