package com.disney.wdpro.mblecore.data.storage;

import android.database.Cursor;
import androidx.room.AbstractC4991h;
import androidx.room.AbstractC4992i;
import androidx.room.C5005v;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p602h4.C28347a;
import p602h4.C28348b;
import p633i4.InterfaceC28561k;

/* loaded from: classes2.dex */
public final class TokenDao_Impl implements TokenDao {
    private final RoomDatabase __db;
    private final AbstractC4991h<MbleTokenEntity> __deletionAdapterOfMbleTokenEntity;
    private final AbstractC4992i<MbleTokenEntity> __insertionAdapterOfMbleTokenEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final AbstractC4991h<MbleTokenEntity> __updateAdapterOfMbleTokenEntity;

    public TokenDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfMbleTokenEntity = new AbstractC4992i<MbleTokenEntity>(roomDatabase) { // from class: com.disney.wdpro.mblecore.data.storage.TokenDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `MbleTokenEntity` (`token_id`,`is_used`,`expirationTTL`,`dropTTL`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.AbstractC4992i
            public void bind(InterfaceC28561k interfaceC28561k, MbleTokenEntity mbleTokenEntity) {
                if (mbleTokenEntity.getToken() == null) {
                    interfaceC28561k.mo27060b0(1);
                } else {
                    interfaceC28561k.mo27056K(1, mbleTokenEntity.getToken());
                }
                interfaceC28561k.mo27058O(2, mbleTokenEntity.isUsed() ? 1L : 0L);
                interfaceC28561k.mo27058O(3, mbleTokenEntity.getExpirationTTL());
                interfaceC28561k.mo27058O(4, mbleTokenEntity.getDropTTL());
            }
        };
        this.__deletionAdapterOfMbleTokenEntity = new AbstractC4991h<MbleTokenEntity>(roomDatabase) { // from class: com.disney.wdpro.mblecore.data.storage.TokenDao_Impl.2
            @Override // androidx.room.AbstractC4991h, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `MbleTokenEntity` WHERE `token_id` = ?";
            }

            @Override // androidx.room.AbstractC4991h
            public void bind(InterfaceC28561k interfaceC28561k, MbleTokenEntity mbleTokenEntity) {
                if (mbleTokenEntity.getToken() == null) {
                    interfaceC28561k.mo27060b0(1);
                } else {
                    interfaceC28561k.mo27056K(1, mbleTokenEntity.getToken());
                }
            }
        };
        this.__updateAdapterOfMbleTokenEntity = new AbstractC4991h<MbleTokenEntity>(roomDatabase) { // from class: com.disney.wdpro.mblecore.data.storage.TokenDao_Impl.3
            @Override // androidx.room.AbstractC4991h, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `MbleTokenEntity` SET `token_id` = ?,`is_used` = ?,`expirationTTL` = ?,`dropTTL` = ? WHERE `token_id` = ?";
            }

            @Override // androidx.room.AbstractC4991h
            public void bind(InterfaceC28561k interfaceC28561k, MbleTokenEntity mbleTokenEntity) {
                if (mbleTokenEntity.getToken() == null) {
                    interfaceC28561k.mo27060b0(1);
                } else {
                    interfaceC28561k.mo27056K(1, mbleTokenEntity.getToken());
                }
                interfaceC28561k.mo27058O(2, mbleTokenEntity.isUsed() ? 1L : 0L);
                interfaceC28561k.mo27058O(3, mbleTokenEntity.getExpirationTTL());
                interfaceC28561k.mo27058O(4, mbleTokenEntity.getDropTTL());
                if (mbleTokenEntity.getToken() == null) {
                    interfaceC28561k.mo27060b0(5);
                } else {
                    interfaceC28561k.mo27056K(5, mbleTokenEntity.getToken());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.disney.wdpro.mblecore.data.storage.TokenDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM MbleTokenEntity";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public void deleteAll(MbleTokenEntity... mbleTokenEntityArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMbleTokenEntity.handleMultiple(mbleTokenEntityArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public void deleteOne(MbleTokenEntity mbleTokenEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMbleTokenEntity.handle(mbleTokenEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public List<MbleTokenEntity> getAll() {
        C5005v c5005vM27197a = C5005v.m27197a("SELECT * FROM MbleTokenEntity", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorM88595c = C28348b.m88595c(this.__db, c5005vM27197a, false, null);
        try {
            int iM88592d = C28347a.m88592d(cursorM88595c, "token_id");
            int iM88592d2 = C28347a.m88592d(cursorM88595c, "is_used");
            int iM88592d3 = C28347a.m88592d(cursorM88595c, "expirationTTL");
            int iM88592d4 = C28347a.m88592d(cursorM88595c, "dropTTL");
            ArrayList arrayList = new ArrayList(cursorM88595c.getCount());
            while (cursorM88595c.moveToNext()) {
                arrayList.add(new MbleTokenEntity(cursorM88595c.isNull(iM88592d) ? null : cursorM88595c.getString(iM88592d), cursorM88595c.getInt(iM88592d2) != 0, cursorM88595c.getLong(iM88592d3), cursorM88595c.getLong(iM88592d4)));
            }
            return arrayList;
        } finally {
            cursorM88595c.close();
            c5005vM27197a.release();
        }
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public void insertAll(List<MbleTokenEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMbleTokenEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public List<MbleTokenEntity> loadAllUnusedIds() {
        C5005v c5005vM27197a = C5005v.m27197a("SELECT * FROM MbleTokenEntity WHERE is_used = 0", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorM88595c = C28348b.m88595c(this.__db, c5005vM27197a, false, null);
        try {
            int iM88592d = C28347a.m88592d(cursorM88595c, "token_id");
            int iM88592d2 = C28347a.m88592d(cursorM88595c, "is_used");
            int iM88592d3 = C28347a.m88592d(cursorM88595c, "expirationTTL");
            int iM88592d4 = C28347a.m88592d(cursorM88595c, "dropTTL");
            ArrayList arrayList = new ArrayList(cursorM88595c.getCount());
            while (cursorM88595c.moveToNext()) {
                arrayList.add(new MbleTokenEntity(cursorM88595c.isNull(iM88592d) ? null : cursorM88595c.getString(iM88592d), cursorM88595c.getInt(iM88592d2) != 0, cursorM88595c.getLong(iM88592d3), cursorM88595c.getLong(iM88592d4)));
            }
            return arrayList;
        } finally {
            cursorM88595c.close();
            c5005vM27197a.release();
        }
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public void update(MbleTokenEntity mbleTokenEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfMbleTokenEntity.handle(mbleTokenEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public void updateAll(List<MbleTokenEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfMbleTokenEntity.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC28561k interfaceC28561kAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            interfaceC28561kAcquire.mo27062t();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(interfaceC28561kAcquire);
        }
    }
}