package com.disney.wdpro.virtualqueue.core.p461di;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvidePerformanceTracking$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21492x6aca2f9f implements InterfaceC30583e<PerformanceTracking> {
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final VQCommonModules module;

    public C21492x6aca2f9f(VQCommonModules vQCommonModules, Provider<InterfaceC8682n> provider) {
        this.module = vQCommonModules;
        this.crashHelperProvider = provider;
    }

    public static C21492x6aca2f9f create(VQCommonModules vQCommonModules, Provider<InterfaceC8682n> provider) {
        return new C21492x6aca2f9f(vQCommonModules, provider);
    }

    public static PerformanceTracking providePerformanceTracking$virtual_queue_lib_release(VQCommonModules vQCommonModules, InterfaceC8682n interfaceC8682n) {
        return (PerformanceTracking) C30587i.m94207e(vQCommonModules.providePerformanceTracking$virtual_queue_lib_release(interfaceC8682n));
    }

    @Override // javax.inject.Provider
    public PerformanceTracking get() {
        return providePerformanceTracking$virtual_queue_lib_release(this.module, this.crashHelperProvider.get());
    }
}