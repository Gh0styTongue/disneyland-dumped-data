package com.disney.wdpro.magicble.geofence;

import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.geofence.handler.GeofenceAction;
import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.magicble.Constants;
import com.disney.wdpro.magicble.common.MbleGeofence;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m92038d2 = {"Lcom/disney/wdpro/magicble/geofence/MbleGenericGeofenceHandler;", "Lcom/disney/wdpro/geofence/handler/GeofenceHandler;", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "mbleCoreManager", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "mbleSecretConfig", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "mbleGeofenceManager", "Lcom/google/gson/Gson;", "gson", "Lcom/disney/wdpro/commons/r;", "time", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "mbleLocalStorageManager", "<init>", "(Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;Lcom/google/gson/Gson;Lcom/disney/wdpro/commons/r;Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;)V", "Lcom/disney/wdpro/geofence/handler/GeofenceAction;", "geofenceAction", "", "onHandleGeofence", "(Lcom/disney/wdpro/geofence/handler/GeofenceAction;)V", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "getMbleCoreManager", "()Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic", "()Lcom/disney/wdpro/commons/config/i;", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "getMbleSecretConfig", "()Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "getMbleGeofenceManager", "()Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "Lcom/disney/wdpro/commons/r;", "getTime", "()Lcom/disney/wdpro/commons/r;", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "getMbleLocalStorageManager", "()Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleGenericGeofenceHandler implements GeofenceHandler {
    private final Gson gson;
    private final MbleCoreManager mbleCoreManager;
    private final MbleGeofenceManager mbleGeofenceManager;
    private final MbleLocalStorageManager mbleLocalStorageManager;
    private final MbleSecretConfig mbleSecretConfig;
    private final C9350r time;
    private final C9248i vendomatic;

    @Inject
    public MbleGenericGeofenceHandler(MbleCoreManager mbleCoreManager, C9248i vendomatic, MbleSecretConfig mbleSecretConfig, MbleGeofenceManager mbleGeofenceManager, Gson gson, C9350r time, MbleLocalStorageManager mbleLocalStorageManager) {
        Intrinsics.checkNotNullParameter(mbleCoreManager, "mbleCoreManager");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(mbleSecretConfig, "mbleSecretConfig");
        Intrinsics.checkNotNullParameter(mbleGeofenceManager, "mbleGeofenceManager");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "mbleLocalStorageManager");
        this.mbleCoreManager = mbleCoreManager;
        this.vendomatic = vendomatic;
        this.mbleSecretConfig = mbleSecretConfig;
        this.mbleGeofenceManager = mbleGeofenceManager;
        this.gson = gson;
        this.time = time;
        this.mbleLocalStorageManager = mbleLocalStorageManager;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public final MbleCoreManager getMbleCoreManager() {
        return this.mbleCoreManager;
    }

    public final MbleGeofenceManager getMbleGeofenceManager() {
        return this.mbleGeofenceManager;
    }

    public final MbleLocalStorageManager getMbleLocalStorageManager() {
        return this.mbleLocalStorageManager;
    }

    public final MbleSecretConfig getMbleSecretConfig() {
        return this.mbleSecretConfig;
    }

    public final C9350r getTime() {
        return this.time;
    }

    public final C9248i getVendomatic() {
        return this.vendomatic;
    }

    @Override // com.disney.wdpro.geofence.handler.GeofenceHandler
    public void onHandleGeofence(GeofenceAction geofenceAction) {
        Intrinsics.checkNotNullParameter(geofenceAction, "geofenceAction");
        MbleUtils mbleUtils = MbleUtils.INSTANCE;
        if (mbleUtils.isAdvertiseOutsideGeofenceEnabled(this.vendomatic, this.mbleSecretConfig)) {
            return;
        }
        GeofenceWrapper geofence = geofenceAction.getGeofence();
        mbleUtils.showLog("MbleGenericGeofenceHandler onHandleGeofence " + geofenceAction.getTransition() + " group : " + geofence.getGroupId());
        if (!geofence.getGroupId().equals(Constants.MBLE_GEOFENCE_GROUP_ID) && geofenceAction.getTransition() == 1) {
            String id2 = geofence.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "geofenceWrapper.id");
            if (!mbleUtils.isGeofenceAreaWithinGeofence(new MbleGeofence(id2, geofence.getLat(), geofence.getLng(), geofence.getRadius()), this.mbleGeofenceManager.getGeofenceRegions()) || mbleUtils.isAdvertisingDisabledInCastArea(this.vendomatic, this.gson, this.time, this.mbleLocalStorageManager)) {
                return;
            }
            this.mbleCoreManager.startAdvertising(2);
        }
    }
}