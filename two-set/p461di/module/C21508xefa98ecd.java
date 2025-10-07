package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.CreatePartyFragmentModule_ProvideCreatePartyMainAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21508xefa98ecd implements InterfaceC30583e<CreatePartyMainAdapter.Factory> {
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<IneligibleGuestAdapter.Factory> ineligibleGuestAdapterProvider;
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final CreatePartyFragmentModule module;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<SelectLinkedGuestAdapter.Factory> selectLinkedGuestAdapterProvider;

    public C21508xefa98ecd(CreatePartyFragmentModule createPartyFragmentModule, Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2, Provider<FacilityUtils> provider3, Provider<SelectLinkedGuestAdapter.Factory> provider4, Provider<IneligibleGuestAdapter.Factory> provider5) {
        this.module = createPartyFragmentModule;
        this.linkedGuestUtilsProvider = provider;
        this.parkAppConfigurationProvider = provider2;
        this.facilityUtilsProvider = provider3;
        this.selectLinkedGuestAdapterProvider = provider4;
        this.ineligibleGuestAdapterProvider = provider5;
    }

    public static C21508xefa98ecd create(CreatePartyFragmentModule createPartyFragmentModule, Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2, Provider<FacilityUtils> provider3, Provider<SelectLinkedGuestAdapter.Factory> provider4, Provider<IneligibleGuestAdapter.Factory> provider5) {
        return new C21508xefa98ecd(createPartyFragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static CreatePartyMainAdapter.Factory provideCreatePartyMainAdapterFactory$virtual_queue_lib_release(CreatePartyFragmentModule createPartyFragmentModule, LinkedGuestUtils linkedGuestUtils, C9314j c9314j, FacilityUtils facilityUtils, SelectLinkedGuestAdapter.Factory factory, IneligibleGuestAdapter.Factory factory2) {
        return (CreatePartyMainAdapter.Factory) C30587i.m94207e(createPartyFragmentModule.provideCreatePartyMainAdapterFactory$virtual_queue_lib_release(linkedGuestUtils, c9314j, facilityUtils, factory, factory2));
    }

    @Override // javax.inject.Provider
    public CreatePartyMainAdapter.Factory get() {
        return provideCreatePartyMainAdapterFactory$virtual_queue_lib_release(this.module, this.linkedGuestUtilsProvider.get(), this.parkAppConfigurationProvider.get(), this.facilityUtilsProvider.get(), this.selectLinkedGuestAdapterProvider.get(), this.ineligibleGuestAdapterProvider.get());
    }
}