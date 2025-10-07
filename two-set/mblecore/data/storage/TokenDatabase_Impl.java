package com.disney.wdpro.mblecore.data.storage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.room.C4989f;
import androidx.room.C4997n;
import androidx.room.C5004u;
import androidx.room.RoomDatabase;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p584g4.AbstractC28096b;
import p584g4.InterfaceC28095a;
import p602h4.C28348b;
import p602h4.C28351e;
import p633i4.InterfaceC28557g;
import p633i4.InterfaceC28558h;

@Instrumented
/* loaded from: classes2.dex */
public final class TokenDatabase_Impl extends TokenDatabase {
    private volatile TokenDao _tokenDao;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.room.RoomDatabase
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        InterfaceC28557g interfaceC28557gMo27034T = super.getOpenHelper().mo27034T();
        try {
            super.beginTransaction();
            if (interfaceC28557gMo27034T instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557gMo27034T, "DELETE FROM `MbleTokenEntity`");
            } else {
                interfaceC28557gMo27034T.mo27045k0("DELETE FROM `MbleTokenEntity`");
            }
            super.setTransactionSuccessful();
            super.endTransaction();
            interfaceC28557gMo27034T.mo27041a1("PRAGMA wal_checkpoint(FULL)").close();
            if (interfaceC28557gMo27034T.mo27043d1()) {
                return;
            }
            if (interfaceC28557gMo27034T instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557gMo27034T, "VACUUM");
            } else {
                interfaceC28557gMo27034T.mo27045k0("VACUUM");
            }
        } catch (Throwable th2) {
            super.endTransaction();
            interfaceC28557gMo27034T.mo27041a1("PRAGMA wal_checkpoint(FULL)").close();
            if (!interfaceC28557gMo27034T.mo27043d1()) {
                if (interfaceC28557gMo27034T instanceof SQLiteDatabase) {
                    SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557gMo27034T, "VACUUM");
                } else {
                    interfaceC28557gMo27034T.mo27045k0("VACUUM");
                }
            }
            throw th2;
        }
    }

    @Override // androidx.room.RoomDatabase
    protected C4997n createInvalidationTracker() {
        return new C4997n(this, new HashMap(0), new HashMap(0), "MbleTokenEntity");
    }

    @Override // androidx.room.RoomDatabase
    protected InterfaceC28558h createOpenHelper(C4989f c4989f) {
        return c4989f.sqliteOpenHelperFactory.mo27097a(InterfaceC28558h.b.m89079a(c4989f.context).m89083d(c4989f.name).m89082c(new C5004u(c4989f, new C5004u.b(2) { // from class: com.disney.wdpro.mblecore.data.storage.TokenDatabase_Impl.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.room.C5004u.b
            public void createAllTables(InterfaceC28557g interfaceC28557g) throws SQLException {
                boolean z10 = interfaceC28557g instanceof SQLiteDatabase;
                if (z10) {
                    SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "CREATE TABLE IF NOT EXISTS `MbleTokenEntity` (`token_id` TEXT NOT NULL, `is_used` INTEGER NOT NULL, `expirationTTL` INTEGER NOT NULL, `dropTTL` INTEGER NOT NULL, PRIMARY KEY(`token_id`))");
                } else {
                    interfaceC28557g.mo27045k0("CREATE TABLE IF NOT EXISTS `MbleTokenEntity` (`token_id` TEXT NOT NULL, `is_used` INTEGER NOT NULL, `expirationTTL` INTEGER NOT NULL, `dropTTL` INTEGER NOT NULL, PRIMARY KEY(`token_id`))");
                }
                if (z10) {
                    SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                } else {
                    interfaceC28557g.mo27045k0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                }
                if (z10) {
                    SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c82a4dec98caa2740b394ff4a255ed36')");
                } else {
                    interfaceC28557g.mo27045k0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c82a4dec98caa2740b394ff4a255ed36')");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.room.C5004u.b
            public void dropAllTables(InterfaceC28557g interfaceC28557g) throws SQLException {
                if (interfaceC28557g instanceof SQLiteDatabase) {
                    SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "DROP TABLE IF EXISTS `MbleTokenEntity`");
                } else {
                    interfaceC28557g.mo27045k0("DROP TABLE IF EXISTS `MbleTokenEntity`");
                }
                if (((RoomDatabase) TokenDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) TokenDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((RoomDatabase.AbstractC4973b) ((RoomDatabase) TokenDatabase_Impl.this).mCallbacks.get(i10)).m27084b(interfaceC28557g);
                    }
                }
            }

            @Override // androidx.room.C5004u.b
            public void onCreate(InterfaceC28557g interfaceC28557g) {
                if (((RoomDatabase) TokenDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) TokenDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((RoomDatabase.AbstractC4973b) ((RoomDatabase) TokenDatabase_Impl.this).mCallbacks.get(i10)).m27083a(interfaceC28557g);
                    }
                }
            }

            @Override // androidx.room.C5004u.b
            public void onOpen(InterfaceC28557g interfaceC28557g) {
                ((RoomDatabase) TokenDatabase_Impl.this).mDatabase = interfaceC28557g;
                TokenDatabase_Impl.this.internalInitInvalidationTracker(interfaceC28557g);
                if (((RoomDatabase) TokenDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) TokenDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((RoomDatabase.AbstractC4973b) ((RoomDatabase) TokenDatabase_Impl.this).mCallbacks.get(i10)).mo27085c(interfaceC28557g);
                    }
                }
            }

            @Override // androidx.room.C5004u.b
            public void onPostMigrate(InterfaceC28557g interfaceC28557g) {
            }

            @Override // androidx.room.C5004u.b
            public void onPreMigrate(InterfaceC28557g interfaceC28557g) throws SQLException {
                C28348b.m88594b(interfaceC28557g);
            }

            @Override // androidx.room.C5004u.b
            public C5004u.c onValidateSchema(InterfaceC28557g interfaceC28557g) {
                HashMap map = new HashMap(4);
                map.put("token_id", new C28351e.a("token_id", "TEXT", true, 1, null, 1));
                map.put("is_used", new C28351e.a("is_used", "INTEGER", true, 0, null, 1));
                map.put("expirationTTL", new C28351e.a("expirationTTL", "INTEGER", true, 0, null, 1));
                map.put("dropTTL", new C28351e.a("dropTTL", "INTEGER", true, 0, null, 1));
                C28351e c28351e = new C28351e("MbleTokenEntity", map, new HashSet(0), new HashSet(0));
                C28351e c28351eM88600a = C28351e.m88600a(interfaceC28557g, "MbleTokenEntity");
                if (c28351e.equals(c28351eM88600a)) {
                    return new C5004u.c(true, null);
                }
                return new C5004u.c(false, "MbleTokenEntity(com.disney.wdpro.mblecore.data.storage.MbleTokenEntity).\n Expected:\n" + c28351e + "\n Found:\n" + c28351eM88600a);
            }
        }, "c82a4dec98caa2740b394ff4a255ed36", "f1ef6cde31d30d848bc855a4903800c4")).m89081b());
    }

    @Override // androidx.room.RoomDatabase
    public List<AbstractC28096b> getAutoMigrations(Map<Class<? extends InterfaceC28095a>, InterfaceC28095a> map) {
        return Arrays.asList(new AbstractC28096b[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends InterfaceC28095a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(TokenDao.class, TokenDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.disney.wdpro.mblecore.data.storage.TokenDatabase
    public TokenDao tokenDao() {
        TokenDao tokenDao;
        if (this._tokenDao != null) {
            return this._tokenDao;
        }
        synchronized (this) {
            try {
                if (this._tokenDao == null) {
                    this._tokenDao = new TokenDao_Impl(this);
                }
                tokenDao = this._tokenDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tokenDao;
    }
}