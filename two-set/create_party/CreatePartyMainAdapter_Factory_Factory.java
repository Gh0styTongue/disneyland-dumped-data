package com.disney.wdpro.virtualqueue.p462ui.create_party;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class CreatePartyMainAdapter_Factory_Factory implements InterfaceC30583e<CreatePartyMainAdapter.Factory> {
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<IneligibleGuestAdapter.Factory> ineligibleGuestAdapterFactoryProvider;
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<SelectLinkedGuestAdapter.Factory> selectLinkedGuestAdapterFactoryProvider;

    public CreatePartyMainAdapter_Factory_Factory(Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2, Provider<FacilityUtils> provider3, Provider<SelectLinkedGuestAdapter.Factory> provider4, Provider<IneligibleGuestAdapter.Factory> provider5) {
        this.linkedGuestUtilsProvider = provider;
        this.parkAppConfigurationProvider = provider2;
        this.facilityUtilsProvider = provider3;
        this.selectLinkedGuestAdapterFactoryProvider = provider4;
        this.ineligibleGuestAdapterFactoryProvider = provider5;
    }

    public static CreatePartyMainAdapter_Factory_Factory create(Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2, Provider<FacilityUtils> provider3, Provider<SelectLinkedGuestAdapter.Factory> provider4, Provider<IneligibleGuestAdapter.Factory> provider5) {
        return new CreatePartyMainAdapter_Factory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static CreatePartyMainAdapter.Factory newInstance(LinkedGuestUtils linkedGuestUtils, C9314j c9314j, FacilityUtils facilityUtils, SelectLinkedGuestAdapter.Factory factory, IneligibleGuestAdapter.Factory factory2) {
        return new CreatePartyMainAdapter.Factory(linkedGuestUtils, c9314j, facilityUtils, factory, factory2);
    }

    @Override // javax.inject.Provider
    public CreatePartyMainAdapter.Factory get() {
        return newInstance(this.linkedGuestUtilsProvider.get(), this.parkAppConfigurationProvider.get(), this.facilityUtilsProvider.get(), this.selectLinkedGuestAdapterFactoryProvider.get(), this.ineligibleGuestAdapterFactoryProvider.get());
    }
}