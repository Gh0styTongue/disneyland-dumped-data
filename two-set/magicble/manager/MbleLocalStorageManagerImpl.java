package com.disney.wdpro.magicble.manager;

import android.content.Context;
import android.content.SharedPreferences;
import com.disney.wdpro.commons.C9350r;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManagerImpl;", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/commons/r;", "time", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/commons/r;)V", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "", "getCastAreaLastScanTimestamp", "()J", "", "updateCastAreaLastScanTimestamp", "()V", "clearCastAreaLastScanTimestamp", "getFastPingModeLastScanTimestamp", "updateFastPingModeLastScanTimestamp", "clearFastPingModeLastScanTimestamp", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/disney/wdpro/commons/r;", "getTime", "()Lcom/disney/wdpro/commons/r;", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleLocalStorageManagerImpl implements MbleLocalStorageManager {
    private static final String MBLE_SHARED_PREF_FILE = "magic_ble_shared_pref";
    private static final String SHARED_PREF_CAST_AREA_LAST_TIMESTAMP = "SHARED_PREF_CAST_AREA_LAST_TIMESTAMP";
    private static final String SHARED_PREF_FAST_PING_MODE_LAST_TIMESTAMP = "SHARED_PREF_FAST_PING_MODE_LAST_TIMESTAMP";
    private final Context context;
    private final C9350r time;

    @Inject
    public MbleLocalStorageManagerImpl(Context context, C9350r time) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(time, "time");
        this.context = context;
        this.time = time;
    }

    private final SharedPreferences getSharedPref() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(MBLE_SHARED_PREF_FILE, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    @Override // com.disney.wdpro.magicble.manager.MbleLocalStorageManager
    public void clearCastAreaLastScanTimestamp() {
        getSharedPref().edit().remove(SHARED_PREF_CAST_AREA_LAST_TIMESTAMP).apply();
    }

    @Override // com.disney.wdpro.magicble.manager.MbleLocalStorageManager
    public void clearFastPingModeLastScanTimestamp() {
        getSharedPref().edit().remove(SHARED_PREF_FAST_PING_MODE_LAST_TIMESTAMP).apply();
    }

    @Override // com.disney.wdpro.magicble.manager.MbleLocalStorageManager
    public long getCastAreaLastScanTimestamp() {
        return getSharedPref().getLong(SHARED_PREF_CAST_AREA_LAST_TIMESTAMP, 0L);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.disney.wdpro.magicble.manager.MbleLocalStorageManager
    public long getFastPingModeLastScanTimestamp() {
        return getSharedPref().getLong(SHARED_PREF_FAST_PING_MODE_LAST_TIMESTAMP, 0L);
    }

    public final C9350r getTime() {
        return this.time;
    }

    @Override // com.disney.wdpro.magicble.manager.MbleLocalStorageManager
    public void updateCastAreaLastScanTimestamp() {
        getSharedPref().edit().putLong(SHARED_PREF_CAST_AREA_LAST_TIMESTAMP, this.time.m39090h().getTimeInMillis()).apply();
    }

    @Override // com.disney.wdpro.magicble.manager.MbleLocalStorageManager
    public void updateFastPingModeLastScanTimestamp() {
        getSharedPref().edit().putLong(SHARED_PREF_FAST_PING_MODE_LAST_TIMESTAMP, this.time.m39090h().getTimeInMillis()).apply();
    }
}