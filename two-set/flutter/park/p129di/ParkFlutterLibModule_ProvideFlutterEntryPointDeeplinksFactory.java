package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class ParkFlutterLibModule_ProvideFlutterEntryPointDeeplinksFactory implements InterfaceC30583e<InterfaceC9289f> {
    private final ParkFlutterLibModule module;
    private final Provider<ParkFlutterLibDeeplinkProvider> providerProvider;

    public ParkFlutterLibModule_ProvideFlutterEntryPointDeeplinksFactory(ParkFlutterLibModule parkFlutterLibModule, Provider<ParkFlutterLibDeeplinkProvider> provider) {
        this.module = parkFlutterLibModule;
        this.providerProvider = provider;
    }

    public static ParkFlutterLibModule_ProvideFlutterEntryPointDeeplinksFactory create(ParkFlutterLibModule parkFlutterLibModule, Provider<ParkFlutterLibDeeplinkProvider> provider) {
        return new ParkFlutterLibModule_ProvideFlutterEntryPointDeeplinksFactory(parkFlutterLibModule, provider);
    }

    public static InterfaceC9289f provideFlutterEntryPointDeeplinks(ParkFlutterLibModule parkFlutterLibModule, ParkFlutterLibDeeplinkProvider parkFlutterLibDeeplinkProvider) {
        return (InterfaceC9289f) C30587i.m94207e(parkFlutterLibModule.provideFlutterEntryPointDeeplinks(parkFlutterLibDeeplinkProvider));
    }

    @Override // javax.inject.Provider
    public InterfaceC9289f get() {
        return provideFlutterEntryPointDeeplinks(this.module, this.providerProvider.get());
    }
}