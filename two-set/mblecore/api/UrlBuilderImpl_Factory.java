package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.mblecore.common.MbleCoreEnvironment;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class UrlBuilderImpl_Factory implements InterfaceC30583e<UrlBuilderImpl> {
    private final Provider<MbleCoreEnvironment> environmentProvider;

    public UrlBuilderImpl_Factory(Provider<MbleCoreEnvironment> provider) {
        this.environmentProvider = provider;
    }

    public static UrlBuilderImpl_Factory create(Provider<MbleCoreEnvironment> provider) {
        return new UrlBuilderImpl_Factory(provider);
    }

    public static UrlBuilderImpl newInstance(MbleCoreEnvironment mbleCoreEnvironment) {
        return new UrlBuilderImpl(mbleCoreEnvironment);
    }

    @Override // javax.inject.Provider
    public UrlBuilderImpl get() {
        return newInstance(this.environmentProvider.get());
    }
}