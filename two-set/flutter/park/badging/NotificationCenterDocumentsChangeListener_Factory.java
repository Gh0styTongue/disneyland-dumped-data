package com.disney.wdpro.flutter.park.badging;

import com.disney.wdpro.dash.util.C9501c;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class NotificationCenterDocumentsChangeListener_Factory implements InterfaceC30583e<NotificationCenterDocumentsChangeListener> {
    private final Provider<C9501c> cbAuthStorageProvider;
    private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;
    private final Provider<NotificationCenterBadgeManager> notificationCenterBadgeManagerProvider;

    public NotificationCenterDocumentsChangeListener_Factory(Provider<NotificationCenterBadgeManager> provider, Provider<C9501c> provider2, Provider<CoroutineDispatcher> provider3) {
        this.notificationCenterBadgeManagerProvider = provider;
        this.cbAuthStorageProvider = provider2;
        this.coroutineDispatcherProvider = provider3;
    }

    public static NotificationCenterDocumentsChangeListener_Factory create(Provider<NotificationCenterBadgeManager> provider, Provider<C9501c> provider2, Provider<CoroutineDispatcher> provider3) {
        return new NotificationCenterDocumentsChangeListener_Factory(provider, provider2, provider3);
    }

    public static NotificationCenterDocumentsChangeListener newInstance(Provider<NotificationCenterBadgeManager> provider, Provider<C9501c> provider2, CoroutineDispatcher coroutineDispatcher) {
        return new NotificationCenterDocumentsChangeListener(provider, provider2, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public NotificationCenterDocumentsChangeListener get() {
        return newInstance(this.notificationCenterBadgeManagerProvider, this.cbAuthStorageProvider, this.coroutineDispatcherProvider.get());
    }
}