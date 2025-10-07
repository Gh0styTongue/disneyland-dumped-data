package com.disney.wdpro.mblecore.data;

import android.content.Context;
import com.disney.wdpro.mblecore.api.VmmsManager;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleTokenManagerImpl_Factory implements InterfaceC30583e<MbleTokenManagerImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<MbleCoreLogger> mbleCoreLoggerProvider;
    private final Provider<MbleDataManager> mbleDataManagerProvider;
    private final Provider<VmmsManager> vmmsManagerProvider;

    public MbleTokenManagerImpl_Factory(Provider<Context> provider, Provider<VmmsManager> provider2, Provider<MbleDataManager> provider3, Provider<MbleCoreLogger> provider4) {
        this.contextProvider = provider;
        this.vmmsManagerProvider = provider2;
        this.mbleDataManagerProvider = provider3;
        this.mbleCoreLoggerProvider = provider4;
    }

    public static MbleTokenManagerImpl_Factory create(Provider<Context> provider, Provider<VmmsManager> provider2, Provider<MbleDataManager> provider3, Provider<MbleCoreLogger> provider4) {
        return new MbleTokenManagerImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static MbleTokenManagerImpl newInstance(Context context, VmmsManager vmmsManager, MbleDataManager mbleDataManager, MbleCoreLogger mbleCoreLogger) {
        return new MbleTokenManagerImpl(context, vmmsManager, mbleDataManager, mbleCoreLogger);
    }

    @Override // javax.inject.Provider
    public MbleTokenManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.vmmsManagerProvider.get(), this.mbleDataManagerProvider.get(), this.mbleCoreLoggerProvider.get());
    }
}