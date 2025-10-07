package com.disney.wdpro.mblecore.services;

import android.content.Context;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.manager.MbleAdvertisingManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MbleAdvertisingScheduler_MembersInjector implements MembersInjector<MbleAdvertisingScheduler> {
    private final Provider<Context> contextProvider;
    private final Provider<MbleAdvertisingManager> mbleAdvertisingManagerProvider;
    private final Provider<MbleCoreLogger> mbleCoreLoggerProvider;

    public MbleAdvertisingScheduler_MembersInjector(Provider<MbleAdvertisingManager> provider, Provider<MbleCoreLogger> provider2, Provider<Context> provider3) {
        this.mbleAdvertisingManagerProvider = provider;
        this.mbleCoreLoggerProvider = provider2;
        this.contextProvider = provider3;
    }

    public static MembersInjector<MbleAdvertisingScheduler> create(Provider<MbleAdvertisingManager> provider, Provider<MbleCoreLogger> provider2, Provider<Context> provider3) {
        return new MbleAdvertisingScheduler_MembersInjector(provider, provider2, provider3);
    }

    public static void injectContext(MbleAdvertisingScheduler mbleAdvertisingScheduler, Context context) {
        mbleAdvertisingScheduler.context = context;
    }

    public static void injectMbleAdvertisingManager(MbleAdvertisingScheduler mbleAdvertisingScheduler, MbleAdvertisingManager mbleAdvertisingManager) {
        mbleAdvertisingScheduler.mbleAdvertisingManager = mbleAdvertisingManager;
    }

    public static void injectMbleCoreLogger(MbleAdvertisingScheduler mbleAdvertisingScheduler, MbleCoreLogger mbleCoreLogger) {
        mbleAdvertisingScheduler.mbleCoreLogger = mbleCoreLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MbleAdvertisingScheduler mbleAdvertisingScheduler) {
        injectMbleAdvertisingManager(mbleAdvertisingScheduler, this.mbleAdvertisingManagerProvider.get());
        injectMbleCoreLogger(mbleAdvertisingScheduler, this.mbleCoreLoggerProvider.get());
        injectContext(mbleAdvertisingScheduler, this.contextProvider.get());
    }
}