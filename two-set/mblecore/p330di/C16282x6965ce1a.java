package com.disney.wdpro.mblecore.p330di;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.mblecore.di.MbleCoreModule_ProvidesBluetoothManager$magic_ble_core_lib_releaseFactory */
/* loaded from: classes2.dex */
public final class C16282x6965ce1a implements InterfaceC30583e<BluetoothManager> {
    private final Provider<Context> contextProvider;
    private final MbleCoreModule module;

    public C16282x6965ce1a(MbleCoreModule mbleCoreModule, Provider<Context> provider) {
        this.module = mbleCoreModule;
        this.contextProvider = provider;
    }

    public static C16282x6965ce1a create(MbleCoreModule mbleCoreModule, Provider<Context> provider) {
        return new C16282x6965ce1a(mbleCoreModule, provider);
    }

    public static BluetoothManager providesBluetoothManager$magic_ble_core_lib_release(MbleCoreModule mbleCoreModule, Context context) {
        return (BluetoothManager) C30587i.m94207e(mbleCoreModule.providesBluetoothManager$magic_ble_core_lib_release(context));
    }

    @Override // javax.inject.Provider
    public BluetoothManager get() {
        return providesBluetoothManager$magic_ble_core_lib_release(this.module, this.contextProvider.get());
    }
}