package com.disney.wdpro.general_ticket_sales_ui.helpers;

import com.disney.wdpro.commons.config.C9248i;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class SalesConfigurationHelper_Factory implements InterfaceC30583e<SalesConfigurationHelper> {
    private final Provider<C9248i> vendomaticProvider;

    public SalesConfigurationHelper_Factory(Provider<C9248i> provider) {
        this.vendomaticProvider = provider;
    }

    public static SalesConfigurationHelper_Factory create(Provider<C9248i> provider) {
        return new SalesConfigurationHelper_Factory(provider);
    }

    public static SalesConfigurationHelper newInstance() {
        return new SalesConfigurationHelper();
    }

    @Override // javax.inject.Provider
    public SalesConfigurationHelper get() {
        SalesConfigurationHelper salesConfigurationHelperNewInstance = newInstance();
        SalesConfigurationHelper_MembersInjector.injectVendomatic(salesConfigurationHelperNewInstance, this.vendomaticProvider.get());
        return salesConfigurationHelperNewInstance;
    }
}