package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.dash.couchbase.C9403g;
import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.dash.dao.C9440k;
import com.disney.wdpro.dash.dash_secure.DashSecureConfig;
import com.disney.wdpro.dash.util.C9501c;
import com.disney.wdpro.flutter.park.models.NotificationDTO;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class ParkFlutterLibModule_ProvidePrivateNotificationDaoFactory implements InterfaceC30583e<C9440k<NotificationDTO>> {
    private final Provider<C9501c> cbAuthStorageProvider;
    private final Provider<DashSecureConfig> dashSecureConfigProvider;
    private final Provider<C9403g> dbManagerProvider;
    private final ParkFlutterLibModule module;
    private final Provider<Database> publicDBProvider;

    public ParkFlutterLibModule_ProvidePrivateNotificationDaoFactory(ParkFlutterLibModule parkFlutterLibModule, Provider<Database> provider, Provider<C9403g> provider2, Provider<DashSecureConfig> provider3, Provider<C9501c> provider4) {
        this.module = parkFlutterLibModule;
        this.publicDBProvider = provider;
        this.dbManagerProvider = provider2;
        this.dashSecureConfigProvider = provider3;
        this.cbAuthStorageProvider = provider4;
    }

    public static ParkFlutterLibModule_ProvidePrivateNotificationDaoFactory create(ParkFlutterLibModule parkFlutterLibModule, Provider<Database> provider, Provider<C9403g> provider2, Provider<DashSecureConfig> provider3, Provider<C9501c> provider4) {
        return new ParkFlutterLibModule_ProvidePrivateNotificationDaoFactory(parkFlutterLibModule, provider, provider2, provider3, provider4);
    }

    public static C9440k<NotificationDTO> providePrivateNotificationDao(ParkFlutterLibModule parkFlutterLibModule, Database database, C9403g c9403g, DashSecureConfig dashSecureConfig, C9501c c9501c) {
        return (C9440k) C30587i.m94207e(parkFlutterLibModule.providePrivateNotificationDao(database, c9403g, dashSecureConfig, c9501c));
    }

    @Override // javax.inject.Provider
    public C9440k<NotificationDTO> get() {
        return providePrivateNotificationDao(this.module, this.publicDBProvider.get(), this.dbManagerProvider.get(), this.dashSecureConfigProvider.get(), this.cbAuthStorageProvider.get());
    }
}