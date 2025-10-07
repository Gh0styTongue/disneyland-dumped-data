package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import javax.inject.Provider;
import mx.InterfaceC30583e;
import p499db.InterfaceC27160n;

/* loaded from: classes20.dex */
public final class FacilityUtils_Factory implements InterfaceC30583e<FacilityUtils> {
    private final Provider<Context> contextProvider;
    private final Provider<InterfaceC27160n> facilityRepositoryProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public FacilityUtils_Factory(Provider<Context> provider, Provider<C9314j> provider2, Provider<InterfaceC27160n> provider3) {
        this.contextProvider = provider;
        this.parkAppConfigurationProvider = provider2;
        this.facilityRepositoryProvider = provider3;
    }

    public static FacilityUtils_Factory create(Provider<Context> provider, Provider<C9314j> provider2, Provider<InterfaceC27160n> provider3) {
        return new FacilityUtils_Factory(provider, provider2, provider3);
    }

    public static FacilityUtils newInstance(Context context, C9314j c9314j, InterfaceC27160n interfaceC27160n) {
        return new FacilityUtils(context, c9314j, interfaceC27160n);
    }

    @Override // javax.inject.Provider
    public FacilityUtils get() {
        return newInstance(this.contextProvider.get(), this.parkAppConfigurationProvider.get(), this.facilityRepositoryProvider.get());
    }
}