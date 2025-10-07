package com.disney.wdpro.geofence.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import com.disney.wdpro.geofence.location.LocationServiceWrapper;
import com.disney.wdpro.geofence.p133di.GeofenceModule;
import com.disney.wdpro.geofence.util.LocationServicesUtils;
import com.disney.wdpro.geofence.util.analytics.GeofenceCrashHelper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* loaded from: classes28.dex */
public class LocationServiceWrapperImpl implements LocationServiceWrapper {
    private final Context context;
    private final GeofenceCrashHelper geofenceCrashHelper;
    private final PendingIntent geofencePendingIntent;
    private final GeofencingClient geofencingClient;

    @Inject
    public LocationServiceWrapperImpl(Context context, @Named(GeofenceModule.GEOFENCING_CLIENT_INJECT_NAME) GeofencingClient geofencingClient, @Named(GeofenceModule.LOCATION_API_GEOFENCE_INTENT_INJECT_NAME) PendingIntent pendingIntent, GeofenceCrashHelper geofenceCrashHelper) {
        this.context = context;
        this.geofencingClient = geofencingClient;
        this.geofencePendingIntent = pendingIntent;
        this.geofenceCrashHelper = geofenceCrashHelper;
    }

    private GeofencingRequest getGeofencingRequest(List<Geofence> list) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.setInitialTrigger(1);
        builder.addGeofences(list);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runCallback(Status status, LocationAction locationAction) {
        LocationServiceWrapper.LocationStatusCallback callback = locationAction.getCallback();
        if (callback != null) {
            if (status.isSuccess()) {
                callback.onSuccess();
            } else {
                this.geofenceCrashHelper.recordGeofencingApiCallbackError(status.getStatusCode());
                callback.onError();
            }
        }
    }

    @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper
    @SuppressLint({"MissingPermission"})
    public void addGeofences(List<Geofence> list, LocationServiceWrapper.LocationStatusCallback locationStatusCallback) {
        if (LocationServicesUtils.isLocationServiceAvailable(this.context)) {
            final LocationAction locationAction = new LocationAction(0, list, locationStatusCallback);
            this.geofenceCrashHelper.recordGeofenceEventFromLocationAction(locationAction);
            this.geofencingClient.addGeofences(getGeofencingRequest(locationAction.getGeofences()), this.geofencePendingIntent).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.disney.wdpro.geofence.location.LocationServiceWrapperImpl.2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(Void r22) {
                    LocationServiceWrapperImpl.this.runCallback(Status.RESULT_SUCCESS, locationAction);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.disney.wdpro.geofence.location.LocationServiceWrapperImpl.1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    LocationServiceWrapperImpl.this.runCallback(new Status(13), locationAction);
                }
            });
        } else if (locationStatusCallback != null) {
            locationStatusCallback.onError();
        }
    }

    @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper
    @SuppressLint({"MissingPermission"})
    public void removeGeofences(List<String> list, LocationServiceWrapper.LocationStatusCallback locationStatusCallback) {
        if (LocationServicesUtils.isLocationServiceAvailable(this.context)) {
            final LocationAction locationAction = new LocationAction(1, locationStatusCallback, list);
            this.geofenceCrashHelper.recordGeofenceEventFromLocationAction(locationAction);
            this.geofencingClient.removeGeofences(locationAction.getIds()).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.disney.wdpro.geofence.location.LocationServiceWrapperImpl.4
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(Void r22) {
                    LocationServiceWrapperImpl.this.runCallback(Status.RESULT_SUCCESS, locationAction);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.disney.wdpro.geofence.location.LocationServiceWrapperImpl.3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    LocationServiceWrapperImpl.this.runCallback(new Status(13), locationAction);
                }
            });
        } else if (locationStatusCallback != null) {
            locationStatusCallback.onError();
        }
    }
}