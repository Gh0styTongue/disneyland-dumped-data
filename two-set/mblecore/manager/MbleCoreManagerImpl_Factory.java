package com.disney.wdpro.mblecore.manager;

import android.content.Context;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import com.disney.wdpro.mblecore.data.MbleTokenManager;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.events.MbleEventPoster;
import com.google.gson.Gson;
import com.squareup.otto.StickyEventBus;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreManagerImpl_Factory implements InterfaceC30583e<MbleCoreManagerImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<MbleCoreLogger> mbleCoreLoggerProvider;
    private final Provider<MbleDataManager> mbleDataManagerProvider;
    private final Provider<MbleEventPoster> mbleEventPosterProvider;
    private final Provider<MbleTokenManager> mbleTokenManagerProvider;
    private final Provider<MbleUserInfo> mbleUserInfoProvider;
    private final Provider<StickyEventBus> stickyEventBusProvider;

    public MbleCoreManagerImpl_Factory(Provider<Context> provider, Provider<StickyEventBus> provider2, Provider<MbleTokenManager> provider3, Provider<Gson> provider4, Provider<MbleDataManager> provider5, Provider<MbleEventPoster> provider6, Provider<MbleUserInfo> provider7, Provider<MbleCoreLogger> provider8) {
        this.contextProvider = provider;
        this.stickyEventBusProvider = provider2;
        this.mbleTokenManagerProvider = provider3;
        this.gsonProvider = provider4;
        this.mbleDataManagerProvider = provider5;
        this.mbleEventPosterProvider = provider6;
        this.mbleUserInfoProvider = provider7;
        this.mbleCoreLoggerProvider = provider8;
    }

    public static MbleCoreManagerImpl_Factory create(Provider<Context> provider, Provider<StickyEventBus> provider2, Provider<MbleTokenManager> provider3, Provider<Gson> provider4, Provider<MbleDataManager> provider5, Provider<MbleEventPoster> provider6, Provider<MbleUserInfo> provider7, Provider<MbleCoreLogger> provider8) {
        return new MbleCoreManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static MbleCoreManagerImpl newInstance(Context context, StickyEventBus stickyEventBus, MbleTokenManager mbleTokenManager, Gson gson, MbleDataManager mbleDataManager, MbleEventPoster mbleEventPoster, MbleUserInfo mbleUserInfo, MbleCoreLogger mbleCoreLogger) {
        return new MbleCoreManagerImpl(context, stickyEventBus, mbleTokenManager, gson, mbleDataManager, mbleEventPoster, mbleUserInfo, mbleCoreLogger);
    }

    @Override // javax.inject.Provider
    public MbleCoreManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.stickyEventBusProvider.get(), this.mbleTokenManagerProvider.get(), this.gsonProvider.get(), this.mbleDataManagerProvider.get(), this.mbleEventPosterProvider.get(), this.mbleUserInfoProvider.get(), this.mbleCoreLoggerProvider.get());
    }
}