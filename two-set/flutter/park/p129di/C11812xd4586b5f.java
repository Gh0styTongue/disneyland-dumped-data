package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManager;
import com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.flutter.park.di.ParkFlutterLibModule_ProvideNotificationCenterBadgeManagerFactory */
/* loaded from: classes28.dex */
public final class C11812xd4586b5f implements InterfaceC30583e<NotificationCenterBadgeManager> {
    private final ParkFlutterLibModule module;
    private final Provider<NotificationCenterBadgeManagerImpl> notificationCenterBadgeManagerProvider;

    public C11812xd4586b5f(ParkFlutterLibModule parkFlutterLibModule, Provider<NotificationCenterBadgeManagerImpl> provider) {
        this.module = parkFlutterLibModule;
        this.notificationCenterBadgeManagerProvider = provider;
    }

    public static C11812xd4586b5f create(ParkFlutterLibModule parkFlutterLibModule, Provider<NotificationCenterBadgeManagerImpl> provider) {
        return new C11812xd4586b5f(parkFlutterLibModule, provider);
    }

    public static NotificationCenterBadgeManager provideNotificationCenterBadgeManager(ParkFlutterLibModule parkFlutterLibModule, NotificationCenterBadgeManagerImpl notificationCenterBadgeManagerImpl) {
        return (NotificationCenterBadgeManager) C30587i.m94207e(parkFlutterLibModule.provideNotificationCenterBadgeManager(notificationCenterBadgeManagerImpl));
    }

    @Override // javax.inject.Provider
    public NotificationCenterBadgeManager get() {
        return provideNotificationCenterBadgeManager(this.module, this.notificationCenterBadgeManagerProvider.get());
    }
}