package com.disney.wdpro.mblecore.manager;

import android.content.Context;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import com.disney.wdpro.mblecore.data.MbleTokenManager;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.events.MbleEventPoster;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleAdvertisingManagerImpl_Factory implements InterfaceC30583e<MbleAdvertisingManagerImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<MbleCoreLogger> mbleCoreLoggerProvider;
    private final Provider<MbleCoreToggles> mbleCoreTogglesProvider;
    private final Provider<MbleDataManager> mbleDataManagerProvider;
    private final Provider<MbleEventPoster> mbleEventPosterProvider;
    private final Provider<MbleTokenManager> mbleTokenManagerProvider;
    private final Provider<MbleUserInfo> mbleUserInfoProvider;

    public MbleAdvertisingManagerImpl_Factory(Provider<Context> provider, Provider<MbleDataManager> provider2, Provider<MbleTokenManager> provider3, Provider<MbleUserInfo> provider4, Provider<MbleCoreToggles> provider5, Provider<MbleEventPoster> provider6, Provider<MbleCoreLogger> provider7) {
        this.contextProvider = provider;
        this.mbleDataManagerProvider = provider2;
        this.mbleTokenManagerProvider = provider3;
        this.mbleUserInfoProvider = provider4;
        this.mbleCoreTogglesProvider = provider5;
        this.mbleEventPosterProvider = provider6;
        this.mbleCoreLoggerProvider = provider7;
    }

    public static MbleAdvertisingManagerImpl_Factory create(Provider<Context> provider, Provider<MbleDataManager> provider2, Provider<MbleTokenManager> provider3, Provider<MbleUserInfo> provider4, Provider<MbleCoreToggles> provider5, Provider<MbleEventPoster> provider6, Provider<MbleCoreLogger> provider7) {
        return new MbleAdvertisingManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MbleAdvertisingManagerImpl newInstance(Context context, MbleDataManager mbleDataManager, MbleTokenManager mbleTokenManager, MbleUserInfo mbleUserInfo, MbleCoreToggles mbleCoreToggles, MbleEventPoster mbleEventPoster, MbleCoreLogger mbleCoreLogger) {
        return new MbleAdvertisingManagerImpl(context, mbleDataManager, mbleTokenManager, mbleUserInfo, mbleCoreToggles, mbleEventPoster, mbleCoreLogger);
    }

    @Override // javax.inject.Provider
    public MbleAdvertisingManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.mbleDataManagerProvider.get(), this.mbleTokenManagerProvider.get(), this.mbleUserInfoProvider.get(), this.mbleCoreTogglesProvider.get(), this.mbleEventPosterProvider.get(), this.mbleCoreLoggerProvider.get());
    }
}