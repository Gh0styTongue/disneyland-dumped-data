package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.analytics.InterfaceC8682n;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class PerformanceTracking_Factory implements InterfaceC30583e<PerformanceTracking> {
    private final Provider<InterfaceC8682n> crashHelperProvider;

    public PerformanceTracking_Factory(Provider<InterfaceC8682n> provider) {
        this.crashHelperProvider = provider;
    }

    public static PerformanceTracking_Factory create(Provider<InterfaceC8682n> provider) {
        return new PerformanceTracking_Factory(provider);
    }

    public static PerformanceTracking newInstance(InterfaceC8682n interfaceC8682n) {
        return new PerformanceTracking(interfaceC8682n);
    }

    @Override // javax.inject.Provider
    public PerformanceTracking get() {
        return newInstance(this.crashHelperProvider.get());
    }
}