package com.disney.wdpro.magicble.utils.analytics;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.config.C9248i;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleCrashHelper_Factory implements InterfaceC30583e<MbleCrashHelper> {
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleCrashHelper_Factory(Provider<InterfaceC8682n> provider, Provider<C9248i> provider2) {
        this.crashHelperProvider = provider;
        this.vendomaticProvider = provider2;
    }

    public static MbleCrashHelper_Factory create(Provider<InterfaceC8682n> provider, Provider<C9248i> provider2) {
        return new MbleCrashHelper_Factory(provider, provider2);
    }

    public static MbleCrashHelper newInstance(InterfaceC8682n interfaceC8682n, C9248i c9248i) {
        return new MbleCrashHelper(interfaceC8682n, c9248i);
    }

    @Override // javax.inject.Provider
    public MbleCrashHelper get() {
        return newInstance(this.crashHelperProvider.get(), this.vendomaticProvider.get());
    }
}