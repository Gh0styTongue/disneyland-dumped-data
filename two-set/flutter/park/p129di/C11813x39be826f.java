package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.dash.couchbase.InterfaceC9404h;
import com.disney.wdpro.flutter.park.badging.NotificationCenterDocumentsChangeListener;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.flutter.park.di.ParkFlutterLibModule_ProvideNotificationCenterDocumentsChangeListenerFactory */
/* loaded from: classes28.dex */
public final class C11813x39be826f implements InterfaceC30583e<InterfaceC9404h> {
    private final Provider<NotificationCenterDocumentsChangeListener> collectionChangeListenerProvider;
    private final ParkFlutterLibModule module;

    public C11813x39be826f(ParkFlutterLibModule parkFlutterLibModule, Provider<NotificationCenterDocumentsChangeListener> provider) {
        this.module = parkFlutterLibModule;
        this.collectionChangeListenerProvider = provider;
    }

    public static C11813x39be826f create(ParkFlutterLibModule parkFlutterLibModule, Provider<NotificationCenterDocumentsChangeListener> provider) {
        return new C11813x39be826f(parkFlutterLibModule, provider);
    }

    public static InterfaceC9404h provideNotificationCenterDocumentsChangeListener(ParkFlutterLibModule parkFlutterLibModule, NotificationCenterDocumentsChangeListener notificationCenterDocumentsChangeListener) {
        return (InterfaceC9404h) C30587i.m94207e(parkFlutterLibModule.provideNotificationCenterDocumentsChangeListener(notificationCenterDocumentsChangeListener));
    }

    @Override // javax.inject.Provider
    public InterfaceC9404h get() {
        return provideNotificationCenterDocumentsChangeListener(this.module, this.collectionChangeListenerProvider.get());
    }
}