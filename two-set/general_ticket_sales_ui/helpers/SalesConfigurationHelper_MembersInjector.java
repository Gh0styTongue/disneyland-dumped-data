package com.disney.wdpro.general_ticket_sales_ui.helpers;

import com.disney.wdpro.commons.config.C9248i;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class SalesConfigurationHelper_MembersInjector implements MembersInjector<SalesConfigurationHelper> {
    private final Provider<C9248i> vendomaticProvider;

    public SalesConfigurationHelper_MembersInjector(Provider<C9248i> provider) {
        this.vendomaticProvider = provider;
    }

    public static MembersInjector<SalesConfigurationHelper> create(Provider<C9248i> provider) {
        return new SalesConfigurationHelper_MembersInjector(provider);
    }

    public static void injectVendomatic(SalesConfigurationHelper salesConfigurationHelper, C9248i c9248i) {
        salesConfigurationHelper.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SalesConfigurationHelper salesConfigurationHelper) {
        injectVendomatic(salesConfigurationHelper, this.vendomaticProvider.get());
    }
}