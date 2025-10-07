package com.disney.wdpro.flutter.park.dao;

import com.disney.wdpro.dash.couchbase.CouchBaseChannel;
import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.flutter.park.models.NotificationDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p559fa.InterfaceC27942e;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/dao/CBNotificationsDAO;", "", "Lcom/disney/wdpro/dash/couchbase/Database;", "database", "Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;", "channel", "<init>", "(Lcom/disney/wdpro/dash/couchbase/Database;Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;)V", "", "notificationId", "Lfa/e;", "Lcom/disney/wdpro/flutter/park/models/NotificationDTO;", "getNotification", "(Ljava/lang/String;)Lfa/e;", "Lcom/disney/wdpro/dash/couchbase/Database;", "Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class CBNotificationsDAO {
    private final CouchBaseChannel channel;
    private final Database database;

    public CBNotificationsDAO(Database database, CouchBaseChannel channel) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.database = database;
        this.channel = channel;
    }

    public final InterfaceC27942e<NotificationDTO> getNotification(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Database database = this.database;
        InterfaceC27942e<NotificationDTO> interfaceC27942eM39274C = database.m39274C(database.m39275D(notificationId, this.channel), NotificationDTO.class, null);
        if (interfaceC27942eM39274C == null) {
            return null;
        }
        return interfaceC27942eM39274C;
    }
}