package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.disney.wdpro.mblecore.manager.MbleCoreManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.mblecore.di.MbleCoreModule_ProvidesMbleCoreManager$magic_ble_core_lib_releaseFactory */
/* loaded from: classes2.dex */
public final class C16284x734b5ab implements InterfaceC30583e<MbleCoreManager> {
    private final Provider<MbleCoreManagerImpl> implProvider;
    private final MbleCoreModule module;

    public C16284x734b5ab(MbleCoreModule mbleCoreModule, Provider<MbleCoreManagerImpl> provider) {
        this.module = mbleCoreModule;
        this.implProvider = provider;
    }

    public static C16284x734b5ab create(MbleCoreModule mbleCoreModule, Provider<MbleCoreManagerImpl> provider) {
        return new C16284x734b5ab(mbleCoreModule, provider);
    }

    public static MbleCoreManager providesMbleCoreManager$magic_ble_core_lib_release(MbleCoreModule mbleCoreModule, MbleCoreManagerImpl mbleCoreManagerImpl) {
        return (MbleCoreManager) C30587i.m94207e(mbleCoreModule.providesMbleCoreManager$magic_ble_core_lib_release(mbleCoreManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleCoreManager get() {
        return providesMbleCoreManager$magic_ble_core_lib_release(this.module, this.implProvider.get());
    }
}