package com.disney.wdpro.virtualqueue.couchbase.dao;

import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.couchbase.dto.QueueDocumentDeserializer;
import com.disney.wdpro.virtualqueue.couchbase.dto.VirtualQueueDocument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p559fa.InterfaceC27942e;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dao/CBVirtualQueueDAO;", "Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;", "database", "Lcom/disney/wdpro/dash/couchbase/Database;", "(Lcom/disney/wdpro/dash/couchbase/Database;)V", "getQueueInfo", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/VirtualQueueDocument;", "id", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class CBVirtualQueueDAO implements VirtualQueueRepository {
    public static final int $stable = 8;
    private final Database database;

    public CBVirtualQueueDAO(Database database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository
    public VirtualQueueDocument getQueueInfo(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        InterfaceC27942e interfaceC27942eM39274C = this.database.m39274C(id2, VirtualQueueDocument.class, new QueueDocumentDeserializer());
        if (interfaceC27942eM39274C.size() > 0) {
            return (VirtualQueueDocument) interfaceC27942eM39274C.get(0);
        }
        return null;
    }
}