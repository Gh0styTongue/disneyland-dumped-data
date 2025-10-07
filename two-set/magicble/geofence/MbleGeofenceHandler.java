package com.disney.wdpro.magicble.geofence;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.geofence.handler.GeofenceAction;
import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m92038d2 = {"Lcom/disney/wdpro/magicble/geofence/MbleGeofenceHandler;", "Lcom/disney/wdpro/geofence/handler/GeofenceHandler;", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "mbleSecretConfig", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "mbleCoreManager", "Lcom/google/gson/Gson;", "gson", "Lcom/disney/wdpro/commons/r;", "time", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "mbleLocalStorageManager", "<init>", "(Lcom/disney/wdpro/commons/config/i;Landroid/content/Context;Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;Lcom/google/gson/Gson;Lcom/disney/wdpro/commons/r;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;)V", "Lcom/disney/wdpro/geofence/handler/GeofenceAction;", "geofenceAction", "", "onHandleGeofence", "(Lcom/disney/wdpro/geofence/handler/GeofenceAction;)V", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic", "()Lcom/disney/wdpro/commons/config/i;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "getMbleSecretConfig", "()Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "getMbleCoreManager", "()Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "Lcom/disney/wdpro/commons/r;", "getTime", "()Lcom/disney/wdpro/commons/r;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "getAuthenticationManager", "()Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "getMbleLocalStorageManager", "()Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleGeofenceHandler implements GeofenceHandler {
    private final AuthenticationManager authenticationManager;
    private final Context context;
    private final Gson gson;
    private final MbleCoreManager mbleCoreManager;
    private final MbleLocalStorageManager mbleLocalStorageManager;
    private final MbleSecretConfig mbleSecretConfig;
    private final C9350r time;
    private final C9248i vendomatic;

    @Inject
    public MbleGeofenceHandler(C9248i vendomatic, Context context, MbleSecretConfig mbleSecretConfig, MbleCoreManager mbleCoreManager, Gson gson, C9350r time, AuthenticationManager authenticationManager, MbleLocalStorageManager mbleLocalStorageManager) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mbleSecretConfig, "mbleSecretConfig");
        Intrinsics.checkNotNullParameter(mbleCoreManager, "mbleCoreManager");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "mbleLocalStorageManager");
        this.vendomatic = vendomatic;
        this.context = context;
        this.mbleSecretConfig = mbleSecretConfig;
        this.mbleCoreManager = mbleCoreManager;
        this.gson = gson;
        this.time = time;
        this.authenticationManager = authenticationManager;
        this.mbleLocalStorageManager = mbleLocalStorageManager;
    }

    public final AuthenticationManager getAuthenticationManager() {
        return this.authenticationManager;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public final MbleCoreManager getMbleCoreManager() {
        return this.mbleCoreManager;
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
        mbleUtils.showLog("MbleGeofenceHandler onHandleGeofence " + geofenceAction.getTransition());
        if ((geofenceAction.getTransition() == 1 || geofenceAction.getTransition() == 4) && !mbleUtils.isAdvertisingDisabledInCastArea(this.vendomatic, this.gson, this.time, this.mbleLocalStorageManager)) {
            if (mbleUtils.isUserOptIn(this.context, this.authenticationManager)) {
                this.mbleCoreManager.startAdvertising(2);
            }
        } else if (geofenceAction.getTransition() == 2) {
            this.mbleCoreManager.stopAdvertising(2);
        }
    }
}