package com.disney.wdpro.flutter.commons.p128di;

import android.content.Context;
import com.disney.wdpro.flutter.commons.FlutterParkEngineManager;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class FlutterRefCommonsModule_ProvideFlutterParkEngineManagerFactory implements InterfaceC30583e<FlutterParkEngineManager> {
    private final Provider<Context> contextProvider;
    private final FlutterRefCommonsModule module;

    public FlutterRefCommonsModule_ProvideFlutterParkEngineManagerFactory(FlutterRefCommonsModule flutterRefCommonsModule, Provider<Context> provider) {
        this.module = flutterRefCommonsModule;
        this.contextProvider = provider;
    }

    public static FlutterRefCommonsModule_ProvideFlutterParkEngineManagerFactory create(FlutterRefCommonsModule flutterRefCommonsModule, Provider<Context> provider) {
        return new FlutterRefCommonsModule_ProvideFlutterParkEngineManagerFactory(flutterRefCommonsModule, provider);
    }

    public static FlutterParkEngineManager provideFlutterParkEngineManager(FlutterRefCommonsModule flutterRefCommonsModule, Context context) {
        return (FlutterParkEngineManager) C30587i.m94207e(flutterRefCommonsModule.provideFlutterParkEngineManager(context));
    }

    @Override // javax.inject.Provider
    public FlutterParkEngineManager get() {
        return provideFlutterParkEngineManager(this.module, this.contextProvider.get());
    }
}