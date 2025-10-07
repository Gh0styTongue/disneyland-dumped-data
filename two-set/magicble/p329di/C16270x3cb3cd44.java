package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.magicble.di.MbleLocationRegionsModule_ProvideLocationRegionsGuestDataProvider$magic_ble_lib_releaseFactory */
/* loaded from: classes13.dex */
public final class C16270x3cb3cd44 implements InterfaceC30583e<DisneyMagicAccessAuthProvider> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final MbleLocationRegionsModule module;

    public C16270x3cb3cd44(MbleLocationRegionsModule mbleLocationRegionsModule, Provider<AuthenticationManager> provider) {
        this.module = mbleLocationRegionsModule;
        this.authenticationManagerProvider = provider;
    }

    public static C16270x3cb3cd44 create(MbleLocationRegionsModule mbleLocationRegionsModule, Provider<AuthenticationManager> provider) {
        return new C16270x3cb3cd44(mbleLocationRegionsModule, provider);
    }

    public static DisneyMagicAccessAuthProvider provideLocationRegionsGuestDataProvider$magic_ble_lib_release(MbleLocationRegionsModule mbleLocationRegionsModule, AuthenticationManager authenticationManager) {
        return (DisneyMagicAccessAuthProvider) C30587i.m94207e(mbleLocationRegionsModule.provideLocationRegionsGuestDataProvider$magic_ble_lib_release(authenticationManager));
    }

    @Override // javax.inject.Provider
    public DisneyMagicAccessAuthProvider get() {
        return provideLocationRegionsGuestDataProvider$magic_ble_lib_release(this.module, this.authenticationManagerProvider.get());
    }
}