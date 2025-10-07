package com.disney.wdpro.flutter.park.badging;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManager;", "", "notificationIdsCacheContains", "", "notificationId", "", "reloadUserNotificationIdsCache", "", "updateBadgeDisplay", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public interface NotificationCenterBadgeManager {
    boolean notificationIdsCacheContains(String notificationId);

    void reloadUserNotificationIdsCache();

    void updateBadgeDisplay();
}