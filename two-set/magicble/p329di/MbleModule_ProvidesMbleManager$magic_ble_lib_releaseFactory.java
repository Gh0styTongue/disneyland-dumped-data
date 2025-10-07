package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.magicble.manager.MbleManager;
import com.disney.wdpro.magicble.manager.MbleManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleModule_ProvidesMbleManager$magic_ble_lib_releaseFactory implements InterfaceC30583e<MbleManager> {
    private final Provider<MbleManagerImpl> implProvider;
    private final MbleModule module;

    public MbleModule_ProvidesMbleManager$magic_ble_lib_releaseFactory(MbleModule mbleModule, Provider<MbleManagerImpl> provider) {
        this.module = mbleModule;
        this.implProvider = provider;
    }

    public static MbleModule_ProvidesMbleManager$magic_ble_lib_releaseFactory create(MbleModule mbleModule, Provider<MbleManagerImpl> provider) {
        return new MbleModule_ProvidesMbleManager$magic_ble_lib_releaseFactory(mbleModule, provider);
    }

    public static MbleManager providesMbleManager$magic_ble_lib_release(MbleModule mbleModule, MbleManagerImpl mbleManagerImpl) {
        return (MbleManager) C30587i.m94207e(mbleModule.providesMbleManager$magic_ble_lib_release(mbleManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleManager get() {
        return providesMbleManager$magic_ble_lib_release(this.module, this.implProvider.get());
    }
}