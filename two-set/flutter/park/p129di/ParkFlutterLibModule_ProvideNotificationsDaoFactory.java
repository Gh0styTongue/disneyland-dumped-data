package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.flutter.park.dao.CBNotificationsDAO;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class ParkFlutterLibModule_ProvideNotificationsDaoFactory implements InterfaceC30583e<CBNotificationsDAO> {
    private final Provider<Database> finderDBProvider;
    private final ParkFlutterLibModule module;

    public ParkFlutterLibModule_ProvideNotificationsDaoFactory(ParkFlutterLibModule parkFlutterLibModule, Provider<Database> provider) {
        this.module = parkFlutterLibModule;
        this.finderDBProvider = provider;
    }

    public static ParkFlutterLibModule_ProvideNotificationsDaoFactory create(ParkFlutterLibModule parkFlutterLibModule, Provider<Database> provider) {
        return new ParkFlutterLibModule_ProvideNotificationsDaoFactory(parkFlutterLibModule, provider);
    }

    public static CBNotificationsDAO provideNotificationsDao(ParkFlutterLibModule parkFlutterLibModule, Database database) {
        return (CBNotificationsDAO) C30587i.m94207e(parkFlutterLibModule.provideNotificationsDao(database));
    }

    @Override // javax.inject.Provider
    public CBNotificationsDAO get() {
        return provideNotificationsDao(this.module, this.finderDBProvider.get());
    }
}