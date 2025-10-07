package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;
import p499db.InterfaceC27160n;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueMyDayUtils$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21500xd39e3819 implements InterfaceC30583e<FacilityUtils> {
    private final Provider<Context> contextProvider;
    private final Provider<InterfaceC27160n> facilityRepositoryProvider;
    private final VQCommonModules module;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public C21500xd39e3819(VQCommonModules vQCommonModules, Provider<Context> provider, Provider<C9314j> provider2, Provider<InterfaceC27160n> provider3) {
        this.module = vQCommonModules;
        this.contextProvider = provider;
        this.parkAppConfigurationProvider = provider2;
        this.facilityRepositoryProvider = provider3;
    }

    public static C21500xd39e3819 create(VQCommonModules vQCommonModules, Provider<Context> provider, Provider<C9314j> provider2, Provider<InterfaceC27160n> provider3) {
        return new C21500xd39e3819(vQCommonModules, provider, provider2, provider3);
    }

    public static FacilityUtils provideVirtualQueueMyDayUtils$virtual_queue_lib_release(VQCommonModules vQCommonModules, Context context, C9314j c9314j, InterfaceC27160n interfaceC27160n) {
        return (FacilityUtils) C30587i.m94207e(vQCommonModules.provideVirtualQueueMyDayUtils$virtual_queue_lib_release(context, c9314j, interfaceC27160n));
    }

    @Override // javax.inject.Provider
    public FacilityUtils get() {
        return provideVirtualQueueMyDayUtils$virtual_queue_lib_release(this.module, this.contextProvider.get(), this.parkAppConfigurationProvider.get(), this.facilityRepositoryProvider.get());
    }
}