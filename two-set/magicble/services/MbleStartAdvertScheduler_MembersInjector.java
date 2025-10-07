package com.disney.wdpro.magicble.services;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.google.gson.Gson;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes13.dex */
public final class MbleStartAdvertScheduler_MembersInjector implements MembersInjector<MbleStartAdvertScheduler> {
    private final Provider<Context> contextProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<MbleCoreManager> mbleCoreManagerProvider;
    private final Provider<MbleLocalStorageManager> mbleLocalStorageManagerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleStartAdvertScheduler_MembersInjector(Provider<MbleCoreManager> provider, Provider<Gson> provider2, Provider<C9248i> provider3, Provider<MbleLocalStorageManager> provider4, Provider<Context> provider5, Provider<C9350r> provider6) {
        this.mbleCoreManagerProvider = provider;
        this.gsonProvider = provider2;
        this.vendomaticProvider = provider3;
        this.mbleLocalStorageManagerProvider = provider4;
        this.contextProvider = provider5;
        this.timeProvider = provider6;
    }

    public static MembersInjector<MbleStartAdvertScheduler> create(Provider<MbleCoreManager> provider, Provider<Gson> provider2, Provider<C9248i> provider3, Provider<MbleLocalStorageManager> provider4, Provider<Context> provider5, Provider<C9350r> provider6) {
        return new MbleStartAdvertScheduler_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectContext(MbleStartAdvertScheduler mbleStartAdvertScheduler, Context context) {
        mbleStartAdvertScheduler.context = context;
    }

    public static void injectGson(MbleStartAdvertScheduler mbleStartAdvertScheduler, Gson gson) {
        mbleStartAdvertScheduler.gson = gson;
    }

    public static void injectMbleCoreManager(MbleStartAdvertScheduler mbleStartAdvertScheduler, MbleCoreManager mbleCoreManager) {
        mbleStartAdvertScheduler.mbleCoreManager = mbleCoreManager;
    }

    public static void injectMbleLocalStorageManager(MbleStartAdvertScheduler mbleStartAdvertScheduler, MbleLocalStorageManager mbleLocalStorageManager) {
        mbleStartAdvertScheduler.mbleLocalStorageManager = mbleLocalStorageManager;
    }

    public static void injectTime(MbleStartAdvertScheduler mbleStartAdvertScheduler, C9350r c9350r) {
        mbleStartAdvertScheduler.time = c9350r;
    }

    public static void injectVendomatic(MbleStartAdvertScheduler mbleStartAdvertScheduler, C9248i c9248i) {
        mbleStartAdvertScheduler.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MbleStartAdvertScheduler mbleStartAdvertScheduler) {
        injectMbleCoreManager(mbleStartAdvertScheduler, this.mbleCoreManagerProvider.get());
        injectGson(mbleStartAdvertScheduler, this.gsonProvider.get());
        injectVendomatic(mbleStartAdvertScheduler, this.vendomaticProvider.get());
        injectMbleLocalStorageManager(mbleStartAdvertScheduler, this.mbleLocalStorageManagerProvider.get());
        injectContext(mbleStartAdvertScheduler, this.contextProvider.get());
        injectTime(mbleStartAdvertScheduler, this.timeProvider.get());
    }
}