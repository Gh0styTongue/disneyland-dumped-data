package com.disney.wdpro.flutter.park.badging;

import com.disney.wdpro.dash.dao.C9440k;
import com.disney.wdpro.dash.dash_secure.InterfaceC9482l;
import com.disney.wdpro.flutter.park.dao.CBNotificationsDAO;
import com.disney.wdpro.flutter.park.models.MessageStateDTO;
import com.disney.wdpro.flutter.park.models.NotificationDTO;
import com.disney.wdpro.flutter.park.models.NotificationListingDTO;
import com.disney.wdpro.support.badging.InterfaceC20563e;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class NotificationCenterBadgeManagerImpl_Factory implements InterfaceC30583e<NotificationCenterBadgeManagerImpl> {
    private final Provider<InterfaceC20563e> badgeCounterRepositoryProvider;
    private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;
    private final Provider<InterfaceC9482l> dashSecureManagerProvider;
    private final Provider<C9440k<MessageStateDTO>> messageStateDaoProvider;
    private final Provider<CBNotificationsDAO> notificationsDaoProvider;
    private final Provider<C9440k<NotificationDTO>> privateNotificationsDaoProvider;
    private final Provider<C9440k<NotificationListingDTO>> userNotificationsDaoProvider;

    public NotificationCenterBadgeManagerImpl_Factory(Provider<C9440k<NotificationListingDTO>> provider, Provider<CBNotificationsDAO> provider2, Provider<C9440k<NotificationDTO>> provider3, Provider<C9440k<MessageStateDTO>> provider4, Provider<InterfaceC20563e> provider5, Provider<InterfaceC9482l> provider6, Provider<CoroutineDispatcher> provider7) {
        this.userNotificationsDaoProvider = provider;
        this.notificationsDaoProvider = provider2;
        this.privateNotificationsDaoProvider = provider3;
        this.messageStateDaoProvider = provider4;
        this.badgeCounterRepositoryProvider = provider5;
        this.dashSecureManagerProvider = provider6;
        this.coroutineDispatcherProvider = provider7;
    }

    public static NotificationCenterBadgeManagerImpl_Factory create(Provider<C9440k<NotificationListingDTO>> provider, Provider<CBNotificationsDAO> provider2, Provider<C9440k<NotificationDTO>> provider3, Provider<C9440k<MessageStateDTO>> provider4, Provider<InterfaceC20563e> provider5, Provider<InterfaceC9482l> provider6, Provider<CoroutineDispatcher> provider7) {
        return new NotificationCenterBadgeManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static NotificationCenterBadgeManagerImpl newInstance(C9440k<NotificationListingDTO> c9440k, CBNotificationsDAO cBNotificationsDAO, C9440k<NotificationDTO> c9440k2, C9440k<MessageStateDTO> c9440k3, InterfaceC20563e interfaceC20563e, InterfaceC9482l interfaceC9482l, CoroutineDispatcher coroutineDispatcher) {
        return new NotificationCenterBadgeManagerImpl(c9440k, cBNotificationsDAO, c9440k2, c9440k3, interfaceC20563e, interfaceC9482l, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public NotificationCenterBadgeManagerImpl get() {
        return newInstance(this.userNotificationsDaoProvider.get(), this.notificationsDaoProvider.get(), this.privateNotificationsDaoProvider.get(), this.messageStateDaoProvider.get(), this.badgeCounterRepositoryProvider.get(), this.dashSecureManagerProvider.get(), this.coroutineDispatcherProvider.get());
    }
}