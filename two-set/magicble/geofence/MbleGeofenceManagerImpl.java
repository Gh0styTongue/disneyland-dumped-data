package com.disney.wdpro.magicble.geofence;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.geofence.service.GeofenceIntentService;
import com.disney.wdpro.magicble.Constants;
import com.disney.wdpro.magicble.common.MbleGeofence;
import com.disney.wdpro.magicble.common.vendo.MbleVendoBeaconConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManagerImpl;", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/google/gson/Gson;", "gson", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;)V", "", "Lcom/disney/wdpro/magicble/common/MbleGeofence;", "getGeofenceRegions", "()Ljava/util/List;", "Lcom/disney/wdpro/geofence/model/GeofenceWrapper;", "registerGeofences", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic", "()Lcom/disney/wdpro/commons/config/i;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleGeofenceManagerImpl implements MbleGeofenceManager {
    private final Context context;
    private final Gson gson;
    private final C9248i vendomatic;

    @Inject
    public MbleGeofenceManagerImpl(Context context, C9248i vendomatic, Gson gson) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.context = context;
        this.vendomatic = vendomatic;
        this.gson = gson;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.disney.wdpro.magicble.geofence.MbleGeofenceManager
    public List<MbleGeofence> getGeofenceRegions() {
        MbleVendoBeaconConfig mbleVendoConfig = MbleUtils.INSTANCE.parseMbleVendoConfig(this.vendomatic, this.gson);
        if (mbleVendoConfig != null) {
            return mbleVendoConfig.getGeofences();
        }
        return null;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public final C9248i getVendomatic() {
        return this.vendomatic;
    }

    @Override // com.disney.wdpro.magicble.geofence.MbleGeofenceManager
    public List<GeofenceWrapper> registerGeofences() {
        List<MbleGeofence> geofenceRegions = getGeofenceRegions();
        MbleUtils.INSTANCE.showLog("Init Geofence geofenceRegionList : " + (geofenceRegions != null ? Integer.valueOf(geofenceRegions.size()) : null));
        ArrayList arrayList = new ArrayList();
        if (geofenceRegions != null) {
            for (MbleGeofence mbleGeofence : geofenceRegions) {
                if (mbleGeofence != null) {
                    arrayList.add(new GeofenceWrapper.Builder().setExpiration(C9350r.m39065G(Constants.MBLE_GEOFENCE_DEFAULT_EXPIRATION_IN_HOURS)).setCircularRegion(mbleGeofence.getLat(), mbleGeofence.getLon(), mbleGeofence.getRadius()).setGroupId(Constants.MBLE_GEOFENCE_GROUP_ID).setTransition(7).setLoitering(30000).setId(mbleGeofence.getRegionId()).build());
                }
            }
            if (!arrayList.isEmpty()) {
                GeofenceIntentService.enqueueCreateGeofences(this.context, Constants.MBLE_GEOFENCE_GROUP_ID, arrayList);
            }
        }
        return arrayList;
    }
}