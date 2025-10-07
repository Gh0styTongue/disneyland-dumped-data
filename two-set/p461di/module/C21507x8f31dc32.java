package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.ConflictFragmentModule_ProvideConflictGuestAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21507x8f31dc32 implements InterfaceC30583e<ConflictGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final ConflictFragmentModule module;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public C21507x8f31dc32(ConflictFragmentModule conflictFragmentModule, Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2) {
        this.module = conflictFragmentModule;
        this.linkedGuestUtilsProvider = provider;
        this.parkAppConfigurationProvider = provider2;
    }

    public static C21507x8f31dc32 create(ConflictFragmentModule conflictFragmentModule, Provider<LinkedGuestUtils> provider, Provider<C9314j> provider2) {
        return new C21507x8f31dc32(conflictFragmentModule, provider, provider2);
    }

    public static ConflictGuestAdapter.Factory provideConflictGuestAdapterFactory$virtual_queue_lib_release(ConflictFragmentModule conflictFragmentModule, LinkedGuestUtils linkedGuestUtils, C9314j c9314j) {
        return (ConflictGuestAdapter.Factory) C30587i.m94207e(conflictFragmentModule.provideConflictGuestAdapterFactory$virtual_queue_lib_release(linkedGuestUtils, c9314j));
    }

    @Override // javax.inject.Provider
    public ConflictGuestAdapter.Factory get() {
        return provideConflictGuestAdapterFactory$virtual_queue_lib_release(this.module, this.linkedGuestUtilsProvider.get(), this.parkAppConfigurationProvider.get());
    }
}