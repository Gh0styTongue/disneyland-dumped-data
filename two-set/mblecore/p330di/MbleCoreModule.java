package com.disney.wdpro.mblecore.p330di;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.disney.wdpro.mblecore.api.UrlBuilder;
import com.disney.wdpro.mblecore.api.UrlBuilderImpl;
import com.disney.wdpro.mblecore.api.VmmsApiClient;
import com.disney.wdpro.mblecore.api.VmmsApiClientImpl;
import com.disney.wdpro.mblecore.api.VmmsManager;
import com.disney.wdpro.mblecore.api.VmmsManagerImpl;
import com.disney.wdpro.mblecore.common.MbleCoreEnvironment;
import com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import com.disney.wdpro.mblecore.data.MbleTokenManager;
import com.disney.wdpro.mblecore.data.MbleTokenManagerImpl;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl;
import com.disney.wdpro.mblecore.events.MbleEventPoster;
import com.disney.wdpro.mblecore.events.MbleEventPosterImpl;
import com.disney.wdpro.mblecore.manager.MbleAdvertisingManager;
import com.disney.wdpro.mblecore.manager.MbleAdvertisingManagerImpl;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.disney.wdpro.mblecore.manager.MbleCoreManagerImpl;
import com.disney.wdpro.midichlorian.ProxyFactory;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001bH\u0007J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\u001d\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020#H\u0001¢\u0006\u0002\b$J\u0015\u0010%\u001a\u00020&2\u0006\u0010\r\u001a\u00020'H\u0001¢\u0006\u0002\b(J\u0010\u0010)\u001a\u00020*2\u0006\u0010\r\u001a\u00020+H\u0007J\u001d\u0010,\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020.H\u0001¢\u0006\u0002\b/¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/di/MbleCoreModule;", "", "()V", "provideMbleCoreLogger", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "mbleFeatureConfig", "Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig;", "provideMbleCoreToggles", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "provideMbleDataManagerImpl", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "proxyFactory", "Lcom/disney/wdpro/midichlorian/ProxyFactory;", "impl", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManagerImpl;", "provideMbleEnvironment", "Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "provideMbleUserInfo", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "provideUrlBuilder", "Lcom/disney/wdpro/mblecore/api/UrlBuilder;", "Lcom/disney/wdpro/mblecore/api/UrlBuilderImpl;", "provideVmmsApiClient", "Lcom/disney/wdpro/mblecore/api/VmmsApiClient;", "Lcom/disney/wdpro/mblecore/api/VmmsApiClientImpl;", "provideVmmsManager", "Lcom/disney/wdpro/mblecore/api/VmmsManager;", "Lcom/disney/wdpro/mblecore/api/VmmsManagerImpl;", "providesBluetoothManager", "Landroid/bluetooth/BluetoothManager;", "context", "Landroid/content/Context;", "providesBluetoothManager$magic_ble_core_lib_release", "providesMbleAdvertisingManager", "Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;", "Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManagerImpl;", "providesMbleAdvertisingManager$magic_ble_core_lib_release", "providesMbleCoreManager", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManagerImpl;", "providesMbleCoreManager$magic_ble_core_lib_release", "providesMbleEventPoster", "Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "Lcom/disney/wdpro/mblecore/events/MbleEventPosterImpl;", "providesMbleTokenManager", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "Lcom/disney/wdpro/mblecore/data/MbleTokenManagerImpl;", "providesMbleTokenManager$magic_ble_core_lib_release", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes2.dex */
public final class MbleCoreModule {
    @Provides
    @Singleton
    public final MbleCoreLogger provideMbleCoreLogger(MbleCoreFeatureConfig mbleFeatureConfig) {
        Intrinsics.checkNotNullParameter(mbleFeatureConfig, "mbleFeatureConfig");
        return mbleFeatureConfig.getMbleCoreLogger();
    }

    @Provides
    @Singleton
    public final MbleCoreToggles provideMbleCoreToggles(MbleCoreFeatureConfig mbleFeatureConfig) {
        Intrinsics.checkNotNullParameter(mbleFeatureConfig, "mbleFeatureConfig");
        return mbleFeatureConfig.getMbleCoreToggles();
    }

    @Provides
    @Singleton
    public final MbleDataManager provideMbleDataManagerImpl(ProxyFactory proxyFactory, MbleDataManagerImpl impl) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Object objCreateProxy = proxyFactory.createProxy(impl);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(impl)");
        return (MbleDataManager) objCreateProxy;
    }

    @Provides
    @Singleton
    public final MbleCoreEnvironment provideMbleEnvironment(MbleCoreFeatureConfig mbleFeatureConfig) {
        Intrinsics.checkNotNullParameter(mbleFeatureConfig, "mbleFeatureConfig");
        return mbleFeatureConfig.getMbleEnvironment();
    }

    @Provides
    @Singleton
    public final MbleUserInfo provideMbleUserInfo(MbleCoreFeatureConfig mbleFeatureConfig) {
        Intrinsics.checkNotNullParameter(mbleFeatureConfig, "mbleFeatureConfig");
        return mbleFeatureConfig.getMbleUserInfo();
    }

    @Provides
    @Singleton
    public final UrlBuilder provideUrlBuilder(UrlBuilderImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    @Singleton
    public final VmmsApiClient provideVmmsApiClient(VmmsApiClientImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    @Singleton
    public final VmmsManager provideVmmsManager(ProxyFactory proxyFactory, VmmsManagerImpl impl) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Object objCreateProxy = proxyFactory.createProxy(impl);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(impl)");
        return (VmmsManager) objCreateProxy;
    }

    @Provides
    @Singleton
    public final BluetoothManager providesBluetoothManager$magic_ble_core_lib_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("bluetooth");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return (BluetoothManager) systemService;
    }

    @Provides
    @Singleton
    public final MbleAdvertisingManager providesMbleAdvertisingManager$magic_ble_core_lib_release(ProxyFactory proxyFactory, MbleAdvertisingManagerImpl impl) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Object objCreateProxy = proxyFactory.createProxy(impl);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(impl)");
        return (MbleAdvertisingManager) objCreateProxy;
    }

    @Provides
    @Singleton
    public final MbleCoreManager providesMbleCoreManager$magic_ble_core_lib_release(MbleCoreManagerImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    @Singleton
    public final MbleEventPoster providesMbleEventPoster(MbleEventPosterImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    @Singleton
    public final MbleTokenManager providesMbleTokenManager$magic_ble_core_lib_release(ProxyFactory proxyFactory, MbleTokenManagerImpl impl) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Object objCreateProxy = proxyFactory.createProxy(impl);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(impl)");
        return (MbleTokenManager) objCreateProxy;
    }
}