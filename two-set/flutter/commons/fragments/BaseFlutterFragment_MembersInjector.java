package com.disney.wdpro.flutter.commons.fragments;

import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.flutter.commons.FlutterParkEngineManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class BaseFlutterFragment_MembersInjector implements MembersInjector<BaseFlutterFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<FlutterParkEngineManager> flutterEngineManagerProvider;

    public BaseFlutterFragment_MembersInjector(Provider<InterfaceC8679k> provider, Provider<FlutterParkEngineManager> provider2) {
        this.analyticsHelperProvider = provider;
        this.flutterEngineManagerProvider = provider2;
    }

    public static MembersInjector<BaseFlutterFragment> create(Provider<InterfaceC8679k> provider, Provider<FlutterParkEngineManager> provider2) {
        return new BaseFlutterFragment_MembersInjector(provider, provider2);
    }

    public static void injectAnalyticsHelper(BaseFlutterFragment baseFlutterFragment, InterfaceC8679k interfaceC8679k) {
        baseFlutterFragment.analyticsHelper = interfaceC8679k;
    }

    public static void injectFlutterEngineManager(BaseFlutterFragment baseFlutterFragment, FlutterParkEngineManager flutterParkEngineManager) {
        baseFlutterFragment.flutterEngineManager = flutterParkEngineManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseFlutterFragment baseFlutterFragment) {
        injectAnalyticsHelper(baseFlutterFragment, this.analyticsHelperProvider.get());
        injectFlutterEngineManager(baseFlutterFragment, this.flutterEngineManagerProvider.get());
    }
}