package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.MyQueueFragmentModule_ProvidesPartyGuestAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21523xd6cc34a6 implements InterfaceC30583e<PartyGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final MyQueueFragmentModule module;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public C21523xd6cc34a6(MyQueueFragmentModule myQueueFragmentModule, Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        this.module = myQueueFragmentModule;
        this.parkAppConfigurationProvider = provider;
        this.linkedGuestUtilsProvider = provider2;
    }

    public static C21523xd6cc34a6 create(MyQueueFragmentModule myQueueFragmentModule, Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        return new C21523xd6cc34a6(myQueueFragmentModule, provider, provider2);
    }

    public static PartyGuestAdapter.Factory providesPartyGuestAdapterFactory$virtual_queue_lib_release(MyQueueFragmentModule myQueueFragmentModule, C9314j c9314j, LinkedGuestUtils linkedGuestUtils) {
        return (PartyGuestAdapter.Factory) C30587i.m94207e(myQueueFragmentModule.providesPartyGuestAdapterFactory$virtual_queue_lib_release(c9314j, linkedGuestUtils));
    }

    @Override // javax.inject.Provider
    public PartyGuestAdapter.Factory get() {
        return providesPartyGuestAdapterFactory$virtual_queue_lib_release(this.module, this.parkAppConfigurationProvider.get(), this.linkedGuestUtilsProvider.get());
    }
}