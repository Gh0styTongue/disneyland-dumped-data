package com.disney.wdpro.geofence.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.disney.wdpro.geofence.GeofenceManager;
import com.disney.wdpro.geofence.handler.GeofenceAction;
import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.geofence.p133di.GeofenceComponentProvider;
import com.disney.wdpro.geofence.service.event.GeofencingEventWrapper;
import com.disney.wdpro.geofence.util.CollectionUtils;
import com.disney.wdpro.geofence.util.GeofenceUtils;
import com.disney.wdpro.geofence.util.LogUtils;
import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes28.dex */
public class GeofenceHandlerIntentService extends JobIntentService {
    private static final int JOB_ID = GeofenceHandlerIntentService.class.getSimpleName().hashCode();

    @Inject
    Set<GeofenceHandler> genericGeofenceHandlers;

    @Inject
    Map<String, GeofenceHandler> geofenceHandlers;

    @Inject
    protected GeofenceManager geofenceManager;

    @Inject
    protected GeofencingEventWrapper geofencingEvent;

    public GeofenceHandlerIntentService() {
    }

    private void checkIsValidOrRemove(Map<String, List<GeofenceWrapper>> map, GeofenceWrapper geofenceWrapper) {
        if (geofenceWrapper.isValid()) {
            return;
        }
        LogUtils.m50245w("Geofence with Id: " + geofenceWrapper.getId() + " is not valid. Removing Geofence...");
        if (map.containsKey(geofenceWrapper.getGroupId())) {
            map.get(geofenceWrapper.getGroupId()).add(geofenceWrapper);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(geofenceWrapper);
        map.put(geofenceWrapper.getGroupId(), arrayList);
    }

    public static void enqueueWork(Context context, Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) GeofenceHandlerIntentService.class, JOB_ID, intent);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.geofenceManager == null) {
            if (!(getApplication() instanceof GeofenceComponentProvider)) {
                throw new ClassCastException("Application must implement GeofenceComponentProvider.");
            }
            ((GeofenceComponentProvider) getApplication()).getGeofenceComponent().inject(this);
        }
    }

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(Intent intent) {
        this.geofencingEvent.init(intent);
        if (this.geofencingEvent.hasError()) {
            LogUtils.m50244e("There was an error reading Geofence information from the given intent. Error code: " + this.geofencingEvent.getErrorCode());
            return;
        }
        int geofenceTransition = this.geofencingEvent.getGeofenceTransition();
        List<Geofence> triggeringGeofences = this.geofencingEvent.getTriggeringGeofences();
        HashMap map = new HashMap();
        for (Geofence geofence : triggeringGeofences) {
            GeofenceWrapper geofenceByInternalId = this.geofenceManager.getGeofenceByInternalId(geofence.getRequestId());
            if (geofenceByInternalId != null) {
                if (geofenceByInternalId.isValid()) {
                    LogUtils.m50243d("Geofence reached with ID = " + geofenceByInternalId.getId());
                    GeofenceAction geofenceAction = new GeofenceAction(geofenceTransition, geofenceByInternalId);
                    this.geofenceHandlers.get(GeofenceUtils.GEOFENCE_CASCADE_HANDLER).onHandleGeofence(geofenceAction);
                    GeofenceHandler geofenceHandler = this.geofenceHandlers.get(geofenceByInternalId.getGroupId());
                    if (geofenceHandler != null) {
                        LogUtils.m50243d("Geofence Handler found for group id: " + geofenceByInternalId.getGroupId());
                        geofenceHandler.onHandleGeofence(geofenceAction);
                        geofenceByInternalId.incrementOccurrences();
                    } else {
                        LogUtils.m50245w("No handler found for group ID: " + geofenceByInternalId.getGroupId() + ". Make sure you are providing the Handler with the proper group id.");
                    }
                    if (CollectionUtils.isNullOrEmpty(this.genericGeofenceHandlers)) {
                        LogUtils.m50243d("No Generic Geofence registered.");
                    } else {
                        Iterator<GeofenceHandler> it = this.genericGeofenceHandlers.iterator();
                        while (it.hasNext()) {
                            it.next().onHandleGeofence(geofenceAction);
                        }
                    }
                }
                checkIsValidOrRemove(map, geofenceByInternalId);
            } else {
                LogUtils.m50245w("Not found GeofenceWrapper by Id: " + geofence.getRequestId() + " probably it was removed as it was not valid anymore.");
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<GeofenceWrapper>> entry : map.entrySet()) {
            this.geofenceManager.removeGeofences(entry.getKey(), entry.getValue(), null);
        }
    }

    public GeofenceHandlerIntentService(Map<String, GeofenceHandler> map, Set<GeofenceHandler> set, GeofenceManager geofenceManager, GeofencingEventWrapper geofencingEventWrapper) {
        this.geofenceHandlers = map;
        this.genericGeofenceHandlers = set;
        this.geofenceManager = geofenceManager;
        this.geofencingEvent = geofencingEventWrapper;
    }
}