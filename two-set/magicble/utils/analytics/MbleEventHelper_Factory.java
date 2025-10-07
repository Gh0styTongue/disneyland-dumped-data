package com.disney.wdpro.magicble.utils.analytics;

import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.HttpApiClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleEventHelper_Factory implements InterfaceC30583e<MbleEventHelper> {
    private final Provider<Context> contextProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<HttpApiClient> httpApiClientProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleEventHelper_Factory(Provider<InterfaceC8682n> provider, Provider<Context> provider2, Provider<C9248i> provider3, Provider<HttpApiClient> provider4) {
        this.crashHelperProvider = provider;
        this.contextProvider = provider2;
        this.vendomaticProvider = provider3;
        this.httpApiClientProvider = provider4;
    }

    public static MbleEventHelper_Factory create(Provider<InterfaceC8682n> provider, Provider<Context> provider2, Provider<C9248i> provider3, Provider<HttpApiClient> provider4) {
        return new MbleEventHelper_Factory(provider, provider2, provider3, provider4);
    }

    public static MbleEventHelper newInstance(InterfaceC8682n interfaceC8682n, Context context, C9248i c9248i, HttpApiClient httpApiClient) {
        return new MbleEventHelper(interfaceC8682n, context, c9248i, httpApiClient);
    }

    @Override // javax.inject.Provider
    public MbleEventHelper get() {
        return newInstance(this.crashHelperProvider.get(), this.contextProvider.get(), this.vendomaticProvider.get(), this.httpApiClientProvider.get());
    }
}