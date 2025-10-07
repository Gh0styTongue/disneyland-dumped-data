package com.disney.wdpro.mblecore.services;

import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.disney.wdpro.mblecore.manager.MbleAdvertisingManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MbleAdvertiserService_MembersInjector implements MembersInjector<MbleAdvertiserService> {
    private final Provider<MbleAdvertisingManager> mbleAdvertisingManagerProvider;
    private final Provider<MbleCoreLogger> mbleCoreLoggerProvider;
    private final Provider<MbleCoreToggles> mbleCoreTogglesProvider;

    public MbleAdvertiserService_MembersInjector(Provider<MbleAdvertisingManager> provider, Provider<MbleCoreLogger> provider2, Provider<MbleCoreToggles> provider3) {
        this.mbleAdvertisingManagerProvider = provider;
        this.mbleCoreLoggerProvider = provider2;
        this.mbleCoreTogglesProvider = provider3;
    }

    public static MembersInjector<MbleAdvertiserService> create(Provider<MbleAdvertisingManager> provider, Provider<MbleCoreLogger> provider2, Provider<MbleCoreToggles> provider3) {
        return new MbleAdvertiserService_MembersInjector(provider, provider2, provider3);
    }

    public static void injectMbleAdvertisingManager(MbleAdvertiserService mbleAdvertiserService, MbleAdvertisingManager mbleAdvertisingManager) {
        mbleAdvertiserService.mbleAdvertisingManager = mbleAdvertisingManager;
    }

    public static void injectMbleCoreLogger(MbleAdvertiserService mbleAdvertiserService, MbleCoreLogger mbleCoreLogger) {
        mbleAdvertiserService.mbleCoreLogger = mbleCoreLogger;
    }

    public static void injectMbleCoreToggles(MbleAdvertiserService mbleAdvertiserService, MbleCoreToggles mbleCoreToggles) {
        mbleAdvertiserService.mbleCoreToggles = mbleCoreToggles;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MbleAdvertiserService mbleAdvertiserService) {
        injectMbleAdvertisingManager(mbleAdvertiserService, this.mbleAdvertisingManagerProvider.get());
        injectMbleCoreLogger(mbleAdvertiserService, this.mbleCoreLoggerProvider.get());
        injectMbleCoreToggles(mbleAdvertiserService, this.mbleCoreTogglesProvider.get());
    }
}