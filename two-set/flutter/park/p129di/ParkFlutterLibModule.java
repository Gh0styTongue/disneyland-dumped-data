package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import com.disney.wdpro.dash.couchbase.C9403g;
import com.disney.wdpro.dash.couchbase.CouchBaseChannel;
import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.dash.couchbase.InterfaceC9404h;
import com.disney.wdpro.dash.dao.C9440k;
import com.disney.wdpro.dash.dash_secure.DashSecureConfig;
import com.disney.wdpro.dash.util.C9501c;
import com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManager;
import com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl;
import com.disney.wdpro.flutter.park.badging.NotificationCenterDocumentsChangeListener;
import com.disney.wdpro.flutter.park.dao.CBNotificationsDAO;
import com.disney.wdpro.flutter.park.models.MessageStateDTO;
import com.disney.wdpro.flutter.park.models.NotificationDTO;
import com.disney.wdpro.flutter.park.models.NotificationListingDTO;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&¨\u0006("}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/di/ParkFlutterLibModule;", "", "<init>", "()V", "Lcom/disney/wdpro/flutter/park/di/ParkFlutterLibDeeplinkProvider;", "provider", "Lcom/disney/wdpro/commons/deeplink/f;", "provideFlutterEntryPointDeeplinks", "(Lcom/disney/wdpro/flutter/park/di/ParkFlutterLibDeeplinkProvider;)Lcom/disney/wdpro/commons/deeplink/f;", "Lcom/disney/wdpro/flutter/park/badging/NotificationCenterDocumentsChangeListener;", "collectionChangeListener", "Lcom/disney/wdpro/dash/couchbase/h;", "provideNotificationCenterDocumentsChangeListener", "(Lcom/disney/wdpro/flutter/park/badging/NotificationCenterDocumentsChangeListener;)Lcom/disney/wdpro/dash/couchbase/h;", "Lcom/disney/wdpro/dash/couchbase/Database;", "publicDB", "Lcom/disney/wdpro/dash/couchbase/g;", "dbManager", "Lcom/disney/wdpro/dash/dash_secure/f;", "dashSecureConfig", "Lcom/disney/wdpro/dash/util/c;", "cbAuthStorage", "Lcom/disney/wdpro/dash/dao/k;", "Lcom/disney/wdpro/flutter/park/models/NotificationListingDTO;", "provideNotificationListingPrivateDao", "(Lcom/disney/wdpro/dash/couchbase/Database;Lcom/disney/wdpro/dash/couchbase/g;Lcom/disney/wdpro/dash/dash_secure/f;Lcom/disney/wdpro/dash/util/c;)Lcom/disney/wdpro/dash/dao/k;", "Lcom/disney/wdpro/flutter/park/models/NotificationDTO;", "providePrivateNotificationDao", "Lcom/disney/wdpro/flutter/park/models/MessageStateDTO;", "provideMessageStateDao", "finderDB", "Lcom/disney/wdpro/flutter/park/dao/CBNotificationsDAO;", "provideNotificationsDao", "(Lcom/disney/wdpro/dash/couchbase/Database;)Lcom/disney/wdpro/flutter/park/dao/CBNotificationsDAO;", "Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManagerImpl;", "notificationCenterBadgeManager", "Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManager;", "provideNotificationCenterBadgeManager", "(Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManagerImpl;)Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManager;", "Companion", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes28.dex */
public final class ParkFlutterLibModule {
    public static final String EMPTY_VAL = "";
    public static final String NOTIFICATIONS_DOC_ID = "notifications";

    @Provides
    @Singleton
    public final InterfaceC9289f provideFlutterEntryPointDeeplinks(ParkFlutterLibDeeplinkProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    @Provides
    @Singleton
    public final C9440k<MessageStateDTO> provideMessageStateDao(@Named("finderDB") Database publicDB, C9403g dbManager, DashSecureConfig dashSecureConfig, C9501c cbAuthStorage) {
        Intrinsics.checkNotNullParameter(publicDB, "publicDB");
        Intrinsics.checkNotNullParameter(dbManager, "dbManager");
        Intrinsics.checkNotNullParameter(dashSecureConfig, "dashSecureConfig");
        Intrinsics.checkNotNullParameter(cbAuthStorage, "cbAuthStorage");
        CouchBaseChannel couchBaseChannelM39293y = publicDB.m39293y(CouchBaseChannel.BaseChannelName.USERDATA);
        Intrinsics.checkNotNullExpressionValue(couchBaseChannelM39293y, "publicDB.getCBChannelByN…BaseChannelName.USERDATA)");
        return new C9440k<>("", couchBaseChannelM39293y, MessageStateDTO.class, dbManager, dashSecureConfig, null, cbAuthStorage);
    }

    @Provides
    @Singleton
    public final NotificationCenterBadgeManager provideNotificationCenterBadgeManager(NotificationCenterBadgeManagerImpl notificationCenterBadgeManager) {
        Intrinsics.checkNotNullParameter(notificationCenterBadgeManager, "notificationCenterBadgeManager");
        return notificationCenterBadgeManager;
    }

    @Provides
    @Singleton
    public final InterfaceC9404h provideNotificationCenterDocumentsChangeListener(NotificationCenterDocumentsChangeListener collectionChangeListener) {
        Intrinsics.checkNotNullParameter(collectionChangeListener, "collectionChangeListener");
        return collectionChangeListener;
    }

    @Provides
    @Singleton
    public final C9440k<NotificationListingDTO> provideNotificationListingPrivateDao(@Named("finderDB") Database publicDB, C9403g dbManager, DashSecureConfig dashSecureConfig, C9501c cbAuthStorage) {
        Intrinsics.checkNotNullParameter(publicDB, "publicDB");
        Intrinsics.checkNotNullParameter(dbManager, "dbManager");
        Intrinsics.checkNotNullParameter(dashSecureConfig, "dashSecureConfig");
        Intrinsics.checkNotNullParameter(cbAuthStorage, "cbAuthStorage");
        CouchBaseChannel couchBaseChannelM39293y = publicDB.m39293y(CouchBaseChannel.BaseChannelName.DASH_SECURE);
        Intrinsics.checkNotNullExpressionValue(couchBaseChannelM39293y, "publicDB.getCBChannelByN…eChannelName.DASH_SECURE)");
        return new C9440k<>("notifications", couchBaseChannelM39293y, NotificationListingDTO.class, dbManager, dashSecureConfig, null, cbAuthStorage);
    }

    @Provides
    @Singleton
    public final CBNotificationsDAO provideNotificationsDao(@Named("finderDB") Database finderDB) {
        Intrinsics.checkNotNullParameter(finderDB, "finderDB");
        CouchBaseChannel couchBaseChannelM39293y = finderDB.m39293y(CouchBaseChannel.BaseChannelName.NOTIFICATION_CENTER);
        Intrinsics.checkNotNullExpressionValue(couchBaseChannelM39293y, "finderDB.getCBChannelByN…Name.NOTIFICATION_CENTER)");
        return new CBNotificationsDAO(finderDB, couchBaseChannelM39293y);
    }

    @Provides
    @Singleton
    public final C9440k<NotificationDTO> providePrivateNotificationDao(@Named("finderDB") Database publicDB, C9403g dbManager, DashSecureConfig dashSecureConfig, C9501c cbAuthStorage) {
        Intrinsics.checkNotNullParameter(publicDB, "publicDB");
        Intrinsics.checkNotNullParameter(dbManager, "dbManager");
        Intrinsics.checkNotNullParameter(dashSecureConfig, "dashSecureConfig");
        Intrinsics.checkNotNullParameter(cbAuthStorage, "cbAuthStorage");
        CouchBaseChannel couchBaseChannelM39293y = publicDB.m39293y(CouchBaseChannel.BaseChannelName.DASH_SECURE);
        Intrinsics.checkNotNullExpressionValue(couchBaseChannelM39293y, "publicDB.getCBChannelByN…eChannelName.DASH_SECURE)");
        return new C9440k<>("notifications", couchBaseChannelM39293y, NotificationDTO.class, dbManager, dashSecureConfig, null, cbAuthStorage);
    }
}