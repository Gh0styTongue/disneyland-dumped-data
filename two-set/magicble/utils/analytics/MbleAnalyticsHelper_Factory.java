package com.disney.wdpro.magicble.utils.analytics;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleAnalyticsHelper_Factory implements InterfaceC30583e<MbleAnalyticsHelper> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<BluetoothManager> bluetoothManagerProvider;
    private final Provider<Context> contextProvider;

    public MbleAnalyticsHelper_Factory(Provider<Context> provider, Provider<InterfaceC8679k> provider2, Provider<BluetoothManager> provider3, Provider<AuthenticationManager> provider4) {
        this.contextProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.bluetoothManagerProvider = provider3;
        this.authenticationManagerProvider = provider4;
    }

    public static MbleAnalyticsHelper_Factory create(Provider<Context> provider, Provider<InterfaceC8679k> provider2, Provider<BluetoothManager> provider3, Provider<AuthenticationManager> provider4) {
        return new MbleAnalyticsHelper_Factory(provider, provider2, provider3, provider4);
    }

    public static MbleAnalyticsHelper newInstance(Context context, InterfaceC8679k interfaceC8679k, BluetoothManager bluetoothManager, AuthenticationManager authenticationManager) {
        return new MbleAnalyticsHelper(context, interfaceC8679k, bluetoothManager, authenticationManager);
    }

    @Override // javax.inject.Provider
    public MbleAnalyticsHelper get() {
        return newInstance(this.contextProvider.get(), this.analyticsHelperProvider.get(), this.bluetoothManagerProvider.get(), this.authenticationManagerProvider.get());
    }
}