package com.disney.wdpro.magicble.p329di;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.httpclient.C13330c;
import com.disney.wdpro.httpclient.InterfaceC13343o;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor;
import com.disney.wdpro.locationservices.ma_beacons.p146di.services.MaBeaconServicesModule;
import com.disney.wdpro.magicble.beacon.MbleBeaconManager;
import com.disney.wdpro.magicble.beacon.MbleBeaconManagerImpl;
import com.disney.wdpro.magicble.beacon.MbleBeaconNotifierImpl;
import com.disney.wdpro.magicble.common.MbleFeatureConfig;
import com.disney.wdpro.magicble.common.vendo.MbleDefaultVendoConfigProvider;
import com.disney.wdpro.magicble.common.vendo.MbleVendoBeaconConfig;
import com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider;
import com.disney.wdpro.magicble.geofence.MbleGenericGeofenceHandler;
import com.disney.wdpro.magicble.geofence.MbleGeofenceHandler;
import com.disney.wdpro.magicble.geofence.MbleGeofenceManager;
import com.disney.wdpro.magicble.geofence.MbleGeofenceManagerImpl;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManagerImpl;
import com.disney.wdpro.magicble.manager.MbleManager;
import com.disney.wdpro.magicble.manager.MbleManagerImpl;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import com.disney.wdpro.midichlorian.ProxyFactory;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%JG\u00104\u001a\u0002032\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b7\u00108¨\u00069"}, m92038d2 = {"Lcom/disney/wdpro/magicble/di/MbleModule;", "", "<init>", "()V", "Lcom/disney/wdpro/magicble/beacon/MbleBeaconManagerImpl;", "impl", "Lcom/disney/wdpro/magicble/beacon/MbleBeaconManager;", "provideMbleBeaconManager", "(Lcom/disney/wdpro/magicble/beacon/MbleBeaconManagerImpl;)Lcom/disney/wdpro/magicble/beacon/MbleBeaconManager;", "Lcom/disney/wdpro/magicble/beacon/MbleBeaconNotifierImpl;", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconMonitor$BeaconMonitorNotifier;", "provideMbleBeaconNotifier$magic_ble_lib_release", "(Lcom/disney/wdpro/magicble/beacon/MbleBeaconNotifierImpl;)Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconMonitor$BeaconMonitorNotifier;", "provideMbleBeaconNotifier", "Lcom/disney/wdpro/magicble/manager/MbleManagerImpl;", "Lcom/disney/wdpro/magicble/manager/MbleManager;", "providesMbleManager$magic_ble_lib_release", "(Lcom/disney/wdpro/magicble/manager/MbleManagerImpl;)Lcom/disney/wdpro/magicble/manager/MbleManager;", "providesMbleManager", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManagerImpl;", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "providesMbleGeofenceManager$magic_ble_lib_release", "(Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManagerImpl;)Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "providesMbleGeofenceManager", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceHandler;", "handler", "Lcom/disney/wdpro/geofence/handler/GeofenceHandler;", "provideMbleGeofenceHandler", "(Lcom/disney/wdpro/magicble/geofence/MbleGeofenceHandler;)Lcom/disney/wdpro/geofence/handler/GeofenceHandler;", "Lcom/disney/wdpro/magicble/geofence/MbleGenericGeofenceHandler;", "provideMbleGenericGeofenceHandler", "(Lcom/disney/wdpro/magicble/geofence/MbleGenericGeofenceHandler;)Lcom/disney/wdpro/geofence/handler/GeofenceHandler;", "Lcom/disney/wdpro/midichlorian/ProxyFactory;", "proxyFactory", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManagerImpl;", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "provideMbleLocalStorageManager", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManagerImpl;)Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/google/gson/Gson;", "gson", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/r;", "time", "mbleLocalStorageManager", "Lcom/disney/wdpro/magicble/common/MbleFeatureConfig;", "mbleFeatureConfig", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig;", "provideMbleFeatureConfig", "(Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lcom/google/gson/Gson;Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/commons/r;Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;Lcom/disney/wdpro/magicble/common/MbleFeatureConfig;Landroid/content/Context;)Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig;", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoConfigProvider;", "provideMbleVendoConfigProvider", "(Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;)Lcom/disney/wdpro/magicble/common/vendo/MbleVendoConfigProvider;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module(includes = {MbleLocationRegionsModule.class, MaBeaconServicesModule.class})
/* loaded from: classes13.dex */
public final class MbleModule {
    @Provides
    @Singleton
    public final MbleBeaconManager provideMbleBeaconManager(MbleBeaconManagerImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    @Singleton
    public final MaBeaconMonitor.BeaconMonitorNotifier provideMbleBeaconNotifier$magic_ble_lib_release(MbleBeaconNotifierImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    @Singleton
    public final MbleCoreFeatureConfig provideMbleFeatureConfig(final AuthenticationManager authenticationManager, final Gson gson, final C9248i vendomatic, C9350r time, MbleLocalStorageManager mbleLocalStorageManager, MbleFeatureConfig mbleFeatureConfig, Context context) {
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "mbleLocalStorageManager");
        Intrinsics.checkNotNullParameter(mbleFeatureConfig, "mbleFeatureConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        MbleUserInfo mbleUserInfo = new MbleUserInfo() { // from class: com.disney.wdpro.magicble.di.MbleModule$provideMbleFeatureConfig$userInfo$1
            @Override // com.disney.wdpro.mblecore.common.MbleUserInfo
            public InterfaceC13343o getMbleAuthInterceptor() {
                AuthenticationManager authenticationManager2 = authenticationManager;
                return new C13330c(authenticationManager2, "com.disney.android.guest", authenticationManager2.getUserSwid());
            }

            @Override // com.disney.wdpro.mblecore.common.MbleUserInfo
            public String getUserSwid() {
                return authenticationManager.getUserSwid();
            }
        };
        MbleCoreToggles mbleCoreToggles = new MbleCoreToggles() { // from class: com.disney.wdpro.magicble.di.MbleModule$provideMbleFeatureConfig$mbleCoreToggles$1
            @Override // com.disney.wdpro.mblecore.common.MbleCoreToggles
            public int getRefreshTokenListTimePeriodHours() {
                Integer numM38765k = vendomatic.m38765k();
                if (numM38765k == null) {
                    return 0;
                }
                return numM38765k.intValue();
            }

            @Override // com.disney.wdpro.mblecore.common.MbleCoreToggles
            public int getUpdateTokenTimePeriodMins() {
                MbleVendoBeaconConfig mbleVendoConfig = MbleUtils.INSTANCE.parseMbleVendoConfig(vendomatic, gson);
                if (mbleVendoConfig != null) {
                    return mbleVendoConfig.getUpdateTokenTimePeriodMins();
                }
                return 0;
            }
        };
        return new MbleCoreFeatureConfig.Builder().setMbleEnvironment(mbleFeatureConfig.getMbleCoreEnvironment()).setMbleUserInfo(mbleUserInfo).setMbleCoreToggles(mbleCoreToggles).setMbleCoreLogger(new MbleCoreLogger() { // from class: com.disney.wdpro.magicble.di.MbleModule$provideMbleFeatureConfig$mbleCoreLogger$1
            @Override // com.disney.wdpro.mblecore.common.MbleCoreLogger
            public void logD(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }).build();
    }

    @Provides
    public final GeofenceHandler provideMbleGenericGeofenceHandler(MbleGenericGeofenceHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return handler;
    }

    @Provides
    public final GeofenceHandler provideMbleGeofenceHandler(MbleGeofenceHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return handler;
    }

    @Provides
    @Singleton
    public final MbleLocalStorageManager provideMbleLocalStorageManager(ProxyFactory proxyFactory, MbleLocalStorageManagerImpl impl) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Object objCreateProxy = proxyFactory.createProxy(impl);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(impl)");
        return (MbleLocalStorageManager) objCreateProxy;
    }

    @Provides
    @Singleton
    public final MbleVendoConfigProvider provideMbleVendoConfigProvider(C9248i vendomatic, Gson gson) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new MbleDefaultVendoConfigProvider(vendomatic, gson);
    }

    @Provides
    @Singleton
    public final MbleGeofenceManager providesMbleGeofenceManager$magic_ble_lib_release(MbleGeofenceManagerImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    @Provides
    @Singleton
    public final MbleManager providesMbleManager$magic_ble_lib_release(MbleManagerImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }
}