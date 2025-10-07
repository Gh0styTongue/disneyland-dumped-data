package com.disney.wdpro.flutter.park.p129di;

import android.content.Context;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class ParkFlutterLibDeeplinkProvider_Factory implements InterfaceC30583e<ParkFlutterLibDeeplinkProvider> {
    private final Provider<Context> contextProvider;

    public ParkFlutterLibDeeplinkProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ParkFlutterLibDeeplinkProvider_Factory create(Provider<Context> provider) {
        return new ParkFlutterLibDeeplinkProvider_Factory(provider);
    }

    public static ParkFlutterLibDeeplinkProvider newInstance(Context context) {
        return new ParkFlutterLibDeeplinkProvider(context);
    }

    @Override // javax.inject.Provider
    public ParkFlutterLibDeeplinkProvider get() {
        return newInstance(this.contextProvider.get());
    }
}