package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class PicassoUtils_Factory implements InterfaceC30583e<PicassoUtils> {
    private final Provider<Context> contextProvider;

    public PicassoUtils_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static PicassoUtils_Factory create(Provider<Context> provider) {
        return new PicassoUtils_Factory(provider);
    }

    public static PicassoUtils newInstance(Context context) {
        return new PicassoUtils(context);
    }

    @Override // javax.inject.Provider
    public PicassoUtils get() {
        return newInstance(this.contextProvider.get());
    }
}