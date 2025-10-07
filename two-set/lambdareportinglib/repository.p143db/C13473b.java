package com.disney.wdpro.lambdareportinglib.repository.p143db;

import android.database.Cursor;
import androidx.room.AbstractC4991h;
import androidx.room.AbstractC4992i;
import androidx.room.C5005v;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.disney.p063id.android.lightbox.LightboxActivity;
import com.disney.wdpro.eservices_ui.commons.domain.AccessManager;
import com.disney.wdpro.lambdareportinglib.repository.p143db.models.UploadState;
import dk.AnalyticEvent;
import dk.AnalyticEventBatchUpdate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p602h4.C28347a;
import p602h4.C28348b;
import p633i4.InterfaceC28561k;
import p793o9.C30824b;

/* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b */
/* loaded from: classes29.dex */
public final class C13473b implements InterfaceC13472a {
    private final RoomDatabase __db;
    private final AbstractC4992i<AnalyticEvent> __insertionAdapterOfAnalyticEvent;
    private final SharedSQLiteStatement __preparedStmtOfDeleteBatch;
    private final SharedSQLiteStatement __preparedStmtOfDeleteEvent;
    private final SharedSQLiteStatement __preparedStmtOfUpdateBatchUploadState;
    private final SharedSQLiteStatement __preparedStmtOfUpdateEventUploadState;
    private final AbstractC4991h<AnalyticEventBatchUpdate> __updateAdapterOfAnalyticEventBatchUpdateAsAnalyticEvent;

    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b$a */
    class a extends AbstractC4992i<AnalyticEvent> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.AbstractC4992i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC28561k interfaceC28561k, AnalyticEvent analyticEvent) {
            interfaceC28561k.mo27058O(1, analyticEvent.getEventId());
            interfaceC28561k.mo27058O(2, analyticEvent.getEventTime());
            if (analyticEvent.getBatchId() == null) {
                interfaceC28561k.mo27060b0(3);
            } else {
                interfaceC28561k.mo27056K(3, analyticEvent.getBatchId());
            }
            if (analyticEvent.getUploadState() == null) {
                interfaceC28561k.mo27060b0(4);
            } else {
                interfaceC28561k.mo27056K(4, C13473b.this.m55910i(analyticEvent.getUploadState()));
            }
            if (analyticEvent.getPayload() == null) {
                interfaceC28561k.mo27060b0(5);
            } else {
                interfaceC28561k.mo27056K(5, analyticEvent.getPayload());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `analytics` (`eventId`,`eventTime`,`batchId`,`uploadState`,`payload`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b$b */
    class b extends AbstractC4991h<AnalyticEventBatchUpdate> {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.AbstractC4991h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC28561k interfaceC28561k, AnalyticEventBatchUpdate analyticEventBatchUpdate) {
            interfaceC28561k.mo27058O(1, analyticEventBatchUpdate.getEventId());
            if (analyticEventBatchUpdate.getBatchId() == null) {
                interfaceC28561k.mo27060b0(2);
            } else {
                interfaceC28561k.mo27056K(2, analyticEventBatchUpdate.getBatchId());
            }
            if (analyticEventBatchUpdate.getUploadState() == null) {
                interfaceC28561k.mo27060b0(3);
            } else {
                interfaceC28561k.mo27056K(3, C13473b.this.m55910i(analyticEventBatchUpdate.getUploadState()));
            }
            interfaceC28561k.mo27058O(4, analyticEventBatchUpdate.getEventId());
        }

        @Override // androidx.room.AbstractC4991h, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `analytics` SET `eventId` = ?,`batchId` = ?,`uploadState` = ? WHERE `eventId` = ?";
        }
    }

    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b$c */
    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM analytics WHERE eventId = ?";
        }
    }

    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b$d */
    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE analytics SET uploadState =? WHERE eventId =?";
        }
    }

    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b$e */
    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM analytics WHERE batchId = ?";
        }
    }

    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b$f */
    class f extends SharedSQLiteStatement {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE analytics SET uploadState = ? WHERE batchId =?";
        }
    }

    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.b$g */
    static /* synthetic */ class g {

        /* renamed from: $SwitchMap$com$disney$wdpro$lambdareportinglib$repository$db$models$UploadState */
        static final /* synthetic */ int[] f33687x9117c637;

        static {
            int[] iArr = new int[UploadState.values().length];
            f33687x9117c637 = iArr;
            try {
                iArr[UploadState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33687x9117c637[UploadState.SERVICE_BAD_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33687x9117c637[UploadState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C13473b(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfAnalyticEvent = new a(roomDatabase);
        this.__updateAdapterOfAnalyticEventBatchUpdateAsAnalyticEvent = new b(roomDatabase);
        this.__preparedStmtOfDeleteEvent = new c(roomDatabase);
        this.__preparedStmtOfUpdateEventUploadState = new d(roomDatabase);
        this.__preparedStmtOfDeleteBatch = new e(roomDatabase);
        this.__preparedStmtOfUpdateBatchUploadState = new f(roomDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public String m55910i(UploadState uploadState) {
        if (uploadState == null) {
            return null;
        }
        int i10 = g.f33687x9117c637[uploadState.ordinal()];
        if (i10 == 1) {
            return AccessManager.OLCI_STATUS_PENDING;
        }
        if (i10 == 2) {
            return "SERVICE_BAD_REQUEST";
        }
        if (i10 == 3) {
            return "FAILED";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + uploadState);
    }

    /* renamed from: j */
    private UploadState m55911j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "SERVICE_BAD_REQUEST":
                return UploadState.SERVICE_BAD_REQUEST;
            case "PENDING":
                return UploadState.PENDING;
            case "FAILED":
                return UploadState.FAILED;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    /* renamed from: k */
    public static List<Class<?>> m55912k() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.InterfaceC13472a
    /* renamed from: a */
    public long mo55902a(AnalyticEvent analyticEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfAnalyticEvent.insertAndReturnId(analyticEvent);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.InterfaceC13472a
    /* renamed from: b */
    public List<AnalyticEvent> mo55903b(String str) {
        C5005v c5005vM27197a = C5005v.m27197a("SELECT * FROM analytics WHERE batchId = ?", 1);
        if (str == null) {
            c5005vM27197a.mo27060b0(1);
        } else {
            c5005vM27197a.mo27056K(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorM88595c = C28348b.m88595c(this.__db, c5005vM27197a, false, null);
        try {
            int iM88592d = C28347a.m88592d(cursorM88595c, LightboxActivity.EVENT_ID_EXTRA);
            int iM88592d2 = C28347a.m88592d(cursorM88595c, "eventTime");
            int iM88592d3 = C28347a.m88592d(cursorM88595c, "batchId");
            int iM88592d4 = C28347a.m88592d(cursorM88595c, "uploadState");
            int iM88592d5 = C28347a.m88592d(cursorM88595c, C30824b.KEY_PAYLOAD);
            ArrayList arrayList = new ArrayList(cursorM88595c.getCount());
            while (cursorM88595c.moveToNext()) {
                arrayList.add(new AnalyticEvent(cursorM88595c.getLong(iM88592d), cursorM88595c.getLong(iM88592d2), cursorM88595c.isNull(iM88592d3) ? null : cursorM88595c.getString(iM88592d3), m55911j(cursorM88595c.getString(iM88592d4)), cursorM88595c.isNull(iM88592d5) ? null : cursorM88595c.getString(iM88592d5)));
            }
            return arrayList;
        } finally {
            cursorM88595c.close();
            c5005vM27197a.release();
        }
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.InterfaceC13472a
    /* renamed from: c */
    public void mo55904c(long j10, UploadState uploadState) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC28561k interfaceC28561kAcquire = this.__preparedStmtOfUpdateEventUploadState.acquire();
        if (uploadState == null) {
            interfaceC28561kAcquire.mo27060b0(1);
        } else {
            interfaceC28561kAcquire.mo27056K(1, m55910i(uploadState));
        }
        interfaceC28561kAcquire.mo27058O(2, j10);
        this.__db.beginTransaction();
        try {
            interfaceC28561kAcquire.mo27062t();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateEventUploadState.release(interfaceC28561kAcquire);
        }
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.InterfaceC13472a
    /* renamed from: d */
    public void mo55905d(String str, UploadState uploadState) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC28561k interfaceC28561kAcquire = this.__preparedStmtOfUpdateBatchUploadState.acquire();
        if (uploadState == null) {
            interfaceC28561kAcquire.mo27060b0(1);
        } else {
            interfaceC28561kAcquire.mo27056K(1, m55910i(uploadState));
        }
        if (str == null) {
            interfaceC28561kAcquire.mo27060b0(2);
        } else {
            interfaceC28561kAcquire.mo27056K(2, str);
        }
        this.__db.beginTransaction();
        try {
            interfaceC28561kAcquire.mo27062t();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateBatchUploadState.release(interfaceC28561kAcquire);
        }
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.InterfaceC13472a
    /* renamed from: e */
    public void mo55906e(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC28561k interfaceC28561kAcquire = this.__preparedStmtOfDeleteBatch.acquire();
        if (str == null) {
            interfaceC28561kAcquire.mo27060b0(1);
        } else {
            interfaceC28561kAcquire.mo27056K(1, str);
        }
        this.__db.beginTransaction();
        try {
            interfaceC28561kAcquire.mo27062t();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteBatch.release(interfaceC28561kAcquire);
        }
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.InterfaceC13472a
    /* renamed from: f */
    public void mo55907f(List<AnalyticEventBatchUpdate> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfAnalyticEventBatchUpdateAsAnalyticEvent.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.InterfaceC13472a
    /* renamed from: g */
    public void mo55908g(long j10) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC28561k interfaceC28561kAcquire = this.__preparedStmtOfDeleteEvent.acquire();
        interfaceC28561kAcquire.mo27058O(1, j10);
        this.__db.beginTransaction();
        try {
            interfaceC28561kAcquire.mo27062t();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteEvent.release(interfaceC28561kAcquire);
        }
    }
}