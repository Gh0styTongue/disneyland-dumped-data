package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.events.MbleEventPoster;
import com.disney.wdpro.mblecore.events.MbleEventPosterImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvidesMbleEventPosterFactory implements InterfaceC30583e<MbleEventPoster> {
    private final Provider<MbleEventPosterImpl> implProvider;
    private final MbleCoreModule module;

    public MbleCoreModule_ProvidesMbleEventPosterFactory(MbleCoreModule mbleCoreModule, Provider<MbleEventPosterImpl> provider) {
        this.module = mbleCoreModule;
        this.implProvider = provider;
    }

    public static MbleCoreModule_ProvidesMbleEventPosterFactory create(MbleCoreModule mbleCoreModule, Provider<MbleEventPosterImpl> provider) {
        return new MbleCoreModule_ProvidesMbleEventPosterFactory(mbleCoreModule, provider);
    }

    public static MbleEventPoster providesMbleEventPoster(MbleCoreModule mbleCoreModule, MbleEventPosterImpl mbleEventPosterImpl) {
        return (MbleEventPoster) C30587i.m94207e(mbleCoreModule.providesMbleEventPoster(mbleEventPosterImpl));
    }

    @Override // javax.inject.Provider
    public MbleEventPoster get() {
        return providesMbleEventPoster(this.module, this.implProvider.get());
    }
}