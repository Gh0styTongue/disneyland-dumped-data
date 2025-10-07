package com.disney.wdpro.flutter.commons;

import android.content.Context;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class FlutterParkEngineManager_Factory implements InterfaceC30583e<FlutterParkEngineManager> {
    private final Provider<Context> contextProvider;

    public FlutterParkEngineManager_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static FlutterParkEngineManager_Factory create(Provider<Context> provider) {
        return new FlutterParkEngineManager_Factory(provider);
    }

    public static FlutterParkEngineManager newInstance(Context context) {
        return new FlutterParkEngineManager(context);
    }

    @Override // javax.inject.Provider
    public FlutterParkEngineManager get() {
        return newInstance(this.contextProvider.get());
    }
}