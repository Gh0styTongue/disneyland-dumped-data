package com.disney.wdpro.mblecore.data.manager;

import android.content.Context;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleDataManagerImpl_Factory implements InterfaceC30583e<MbleDataManagerImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<MbleCoreLogger> mbleCoreLoggerProvider;
    private final Provider<MbleCoreToggles> mbleCoreTogglesProvider;

    public MbleDataManagerImpl_Factory(Provider<Context> provider, Provider<MbleCoreToggles> provider2, Provider<MbleCoreLogger> provider3) {
        this.contextProvider = provider;
        this.mbleCoreTogglesProvider = provider2;
        this.mbleCoreLoggerProvider = provider3;
    }

    public static MbleDataManagerImpl_Factory create(Provider<Context> provider, Provider<MbleCoreToggles> provider2, Provider<MbleCoreLogger> provider3) {
        return new MbleDataManagerImpl_Factory(provider, provider2, provider3);
    }

    public static MbleDataManagerImpl newInstance(Context context, MbleCoreToggles mbleCoreToggles, MbleCoreLogger mbleCoreLogger) {
        return new MbleDataManagerImpl(context, mbleCoreToggles, mbleCoreLogger);
    }

    @Override // javax.inject.Provider
    public MbleDataManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.mbleCoreTogglesProvider.get(), this.mbleCoreLoggerProvider.get());
    }
}