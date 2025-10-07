package com.disney.wdpro.mblecore.events;

import com.squareup.otto.StickyEventBus;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleEventPosterImpl_Factory implements InterfaceC30583e<MbleEventPosterImpl> {
    private final Provider<StickyEventBus> busProvider;

    public MbleEventPosterImpl_Factory(Provider<StickyEventBus> provider) {
        this.busProvider = provider;
    }

    public static MbleEventPosterImpl_Factory create(Provider<StickyEventBus> provider) {
        return new MbleEventPosterImpl_Factory(provider);
    }

    public static MbleEventPosterImpl newInstance(StickyEventBus stickyEventBus) {
        return new MbleEventPosterImpl(stickyEventBus);
    }

    @Override // javax.inject.Provider
    public MbleEventPosterImpl get() {
        return newInstance(this.busProvider.get());
    }
}