package com.disney.wdpro.lambdareportinglib.repository.p143db;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.room.C4989f;
import androidx.room.C4997n;
import androidx.room.C5004u;
import androidx.room.RoomDatabase;
import com.disney.p063id.android.lightbox.LightboxActivity;
import com.disney.wdpro.dash.dao.C9433g0;
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
import p793o9.C30824b;

@Instrumented
/* loaded from: classes29.dex */
public final class AnalyticsDatabase_Impl extends AnalyticsDatabase {
    private volatile InterfaceC13472a _analyticsEventDao;

    @Instrumented
    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.AnalyticsDatabase_Impl$a */
    class C13471a extends C5004u.b {
        C13471a(int i10) {
            super(i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.room.C5004u.b
        public void createAllTables(InterfaceC28557g interfaceC28557g) throws SQLException {
            boolean z10 = interfaceC28557g instanceof SQLiteDatabase;
            if (z10) {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "CREATE TABLE IF NOT EXISTS `analytics` (`eventId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventTime` INTEGER NOT NULL, `batchId` TEXT NOT NULL, `uploadState` TEXT NOT NULL, `payload` TEXT NOT NULL)");
            } else {
                interfaceC28557g.mo27045k0("CREATE TABLE IF NOT EXISTS `analytics` (`eventId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventTime` INTEGER NOT NULL, `batchId` TEXT NOT NULL, `uploadState` TEXT NOT NULL, `payload` TEXT NOT NULL)");
            }
            if (z10) {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            } else {
                interfaceC28557g.mo27045k0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            }
            if (z10) {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5e3a3873f7e2fa5ed27cabafa4c214f1')");
            } else {
                interfaceC28557g.mo27045k0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5e3a3873f7e2fa5ed27cabafa4c214f1')");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.room.C5004u.b
        public void dropAllTables(InterfaceC28557g interfaceC28557g) throws SQLException {
            if (interfaceC28557g instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557g, "DROP TABLE IF EXISTS `analytics`");
            } else {
                interfaceC28557g.mo27045k0("DROP TABLE IF EXISTS `analytics`");
            }
            if (((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.AbstractC4973b) ((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks.get(i10)).m27084b(interfaceC28557g);
                }
            }
        }

        @Override // androidx.room.C5004u.b
        public void onCreate(InterfaceC28557g interfaceC28557g) {
            if (((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.AbstractC4973b) ((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks.get(i10)).m27083a(interfaceC28557g);
                }
            }
        }

        @Override // androidx.room.C5004u.b
        public void onOpen(InterfaceC28557g interfaceC28557g) {
            ((RoomDatabase) AnalyticsDatabase_Impl.this).mDatabase = interfaceC28557g;
            AnalyticsDatabase_Impl.this.internalInitInvalidationTracker(interfaceC28557g);
            if (((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.AbstractC4973b) ((RoomDatabase) AnalyticsDatabase_Impl.this).mCallbacks.get(i10)).mo27085c(interfaceC28557g);
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
            HashMap map = new HashMap(5);
            map.put(LightboxActivity.EVENT_ID_EXTRA, new C28351e.a(LightboxActivity.EVENT_ID_EXTRA, "INTEGER", true, 1, null, 1));
            map.put("eventTime", new C28351e.a("eventTime", "INTEGER", true, 0, null, 1));
            map.put("batchId", new C28351e.a("batchId", "TEXT", true, 0, null, 1));
            map.put("uploadState", new C28351e.a("uploadState", "TEXT", true, 0, null, 1));
            map.put(C30824b.KEY_PAYLOAD, new C28351e.a(C30824b.KEY_PAYLOAD, "TEXT", true, 0, null, 1));
            C28351e c28351e = new C28351e(C9433g0.ANALYTICS_PROPERTY, map, new HashSet(0), new HashSet(0));
            C28351e c28351eM88600a = C28351e.m88600a(interfaceC28557g, C9433g0.ANALYTICS_PROPERTY);
            if (c28351e.equals(c28351eM88600a)) {
                return new C5004u.c(true, null);
            }
            return new C5004u.c(false, "analytics(com.disney.wdpro.lambdareportinglib.repository.db.models.AnalyticEvent).\n Expected:\n" + c28351e + "\n Found:\n" + c28351eM88600a);
        }
    }

    @Override // com.disney.wdpro.lambdareportinglib.repository.p143db.AnalyticsDatabase
    /* renamed from: c */
    public InterfaceC13472a mo55888c() {
        InterfaceC13472a interfaceC13472a;
        if (this._analyticsEventDao != null) {
            return this._analyticsEventDao;
        }
        synchronized (this) {
            try {
                if (this._analyticsEventDao == null) {
                    this._analyticsEventDao = new C13473b(this);
                }
                interfaceC13472a = this._analyticsEventDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC13472a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.room.RoomDatabase
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        InterfaceC28557g interfaceC28557gMo27034T = super.getOpenHelper().mo27034T();
        try {
            super.beginTransaction();
            if (interfaceC28557gMo27034T instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) interfaceC28557gMo27034T, "DELETE FROM `analytics`");
            } else {
                interfaceC28557gMo27034T.mo27045k0("DELETE FROM `analytics`");
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
        return new C4997n(this, new HashMap(0), new HashMap(0), C9433g0.ANALYTICS_PROPERTY);
    }

    @Override // androidx.room.RoomDatabase
    protected InterfaceC28558h createOpenHelper(C4989f c4989f) {
        return c4989f.sqliteOpenHelperFactory.mo27097a(InterfaceC28558h.b.m89079a(c4989f.context).m89083d(c4989f.name).m89082c(new C5004u(c4989f, new C13471a(1), "5e3a3873f7e2fa5ed27cabafa4c214f1", "137174b43448c4be2ed86902dcbe37d0")).m89081b());
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
        map.put(InterfaceC13472a.class, C13473b.m55912k());
        return map;
    }
}