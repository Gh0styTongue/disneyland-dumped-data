package com.disney.wdpro.magicble.beacon.helper;

import com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleBeaconAdvertisingHelper_Factory implements InterfaceC30583e<MbleBeaconAdvertisingHelper> {
    private final Provider<MbleCoreManager> mbleCoreManagerProvider;
    private final Provider<MbleLocalStorageManager> mbleLocalStorageManagerProvider;
    private final Provider<MbleVendoConfigProvider> vendoConfigProvider;

    public MbleBeaconAdvertisingHelper_Factory(Provider<MbleVendoConfigProvider> provider, Provider<MbleLocalStorageManager> provider2, Provider<MbleCoreManager> provider3) {
        this.vendoConfigProvider = provider;
        this.mbleLocalStorageManagerProvider = provider2;
        this.mbleCoreManagerProvider = provider3;
    }

    public static MbleBeaconAdvertisingHelper_Factory create(Provider<MbleVendoConfigProvider> provider, Provider<MbleLocalStorageManager> provider2, Provider<MbleCoreManager> provider3) {
        return new MbleBeaconAdvertisingHelper_Factory(provider, provider2, provider3);
    }

    public static MbleBeaconAdvertisingHelper newInstance(MbleVendoConfigProvider mbleVendoConfigProvider, MbleLocalStorageManager mbleLocalStorageManager, MbleCoreManager mbleCoreManager) {
        return new MbleBeaconAdvertisingHelper(mbleVendoConfigProvider, mbleLocalStorageManager, mbleCoreManager);
    }

    @Override // javax.inject.Provider
    public MbleBeaconAdvertisingHelper get() {
        return newInstance(this.vendoConfigProvider.get(), this.mbleLocalStorageManagerProvider.get(), this.mbleCoreManagerProvider.get());
    }
}