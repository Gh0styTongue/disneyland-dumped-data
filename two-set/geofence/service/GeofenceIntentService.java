package com.disney.wdpro.geofence.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.JobIntentService;
import com.disney.wdpro.geofence.GeofenceManager;
import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.geofence.p133di.GeofenceComponentProvider;
import com.disney.wdpro.geofence.util.LogUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes28.dex */
public class GeofenceIntentService extends JobIntentService {
    private static final String ACTION_TYPE = "ACTION_TYPE";
    private static final String GEOFENCES_CURRENT_ID = "GEOFENCES_CURRENT_ID";
    private static final String GEOFENCES_GROUP_ID_KEY = "GEOFENCES_GROUP_ID_KEY";
    private static final String GEOFENCES_KEY = "GEOFENCES_KEY";
    private static final int JOB_ID = GeofenceIntentService.class.getSimpleName().hashCode();

    @Inject
    protected GeofenceManager geofenceManager;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionTypes {
        public static final int ADD = 0;
        public static final int ON_ENTER = 2;
        public static final int ON_EXIT = 3;
        public static final int REMOVE = 1;
    }

    private void addGeofences(Intent intent, String str) {
        this.geofenceManager.registerGeofences(str, intent.getExtras().getParcelableArrayList(GEOFENCES_KEY), new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.service.GeofenceIntentService.1
            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onError() {
                LogUtils.m50244e("There was an error adding all the geofences.");
            }

            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onSuccess() {
                LogUtils.m50243d("Geofences added all successfully.");
            }
        });
    }

    public static void enqueueCreateGeofences(Context context, String str, List<GeofenceWrapper> list) {
        Intent intent = new Intent(context, (Class<?>) GeofenceIntentService.class);
        intent.putExtra(ACTION_TYPE, 0);
        intent.putExtra(GEOFENCES_GROUP_ID_KEY, str);
        intent.putParcelableArrayListExtra(GEOFENCES_KEY, new ArrayList<>(list));
        enqueueWork(context, intent);
    }

    public static void enqueueOnEnterGeofence(Context context, String str, String str2) {
        enqueueWorkOnActionGeofence(context, str, str2, 2);
    }

    public static void enqueueOnExitGeofence(Context context, String str, String str2) {
        enqueueWorkOnActionGeofence(context, str, str2, 3);
    }

    public static void enqueueRemoveAllGeofencesByGroupId(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GeofenceIntentService.class);
        intent.putExtra(ACTION_TYPE, 1);
        intent.putExtra(GEOFENCES_GROUP_ID_KEY, str);
        enqueueWork(context, intent);
    }

    private static void enqueueWork(Context context, Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) GeofenceIntentService.class, JOB_ID, intent);
    }

    private static void enqueueWorkOnActionGeofence(Context context, String str, String str2, int i10) {
        Intent intent = new Intent(context, (Class<?>) GeofenceIntentService.class);
        intent.putExtra(ACTION_TYPE, i10);
        intent.putExtra(GEOFENCES_GROUP_ID_KEY, str);
        intent.putExtra(GEOFENCES_CURRENT_ID, str2);
        enqueueWork(context, intent);
    }

    private void onEnterGeofence(String str, String str2) {
        this.geofenceManager.cascadeEnterGeofence(str, str2, new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.service.GeofenceIntentService.3
            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onError() {
                LogUtils.m50243d("Cascade on enter was not possible, there was an error.");
            }

            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onSuccess() {
                LogUtils.m50243d("Cascade on enter was succesfully made.");
            }
        });
    }

    private void onExitGeofence(String str, String str2) {
        this.geofenceManager.cascadeExitGeofence(str, str2, new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.service.GeofenceIntentService.4
            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onError() {
                LogUtils.m50243d("Cascade on exit was not possible, there was an error.");
            }

            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onSuccess() {
                LogUtils.m50243d("Cascade on exit was succesfully made.");
            }
        });
    }

    private void removeGeofences(String str) {
        this.geofenceManager.removeRunningGeofencesAndDeleteGroup(str, new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.service.GeofenceIntentService.2
            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onError() {
                LogUtils.m50244e("There was an error removing all the geofences.");
            }

            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onSuccess() {
                LogUtils.m50243d("Geofences removed all successfully.");
            }
        });
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (!(getApplication() instanceof GeofenceComponentProvider)) {
            throw new ClassCastException("Application must implement GeofenceComponentProvider.");
        }
        ((GeofenceComponentProvider) getApplication()).getGeofenceComponent().inject(this);
    }

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            LogUtils.m50244e("No extras Bundle sent to GeofenceIntentService");
            throw new IllegalArgumentException("No extras Bundle sent to GeofenceIntentService");
        }
        String string = extras.getString(GEOFENCES_GROUP_ID_KEY);
        int i10 = extras.getInt(ACTION_TYPE);
        if (i10 == 0) {
            addGeofences(intent, string);
            return;
        }
        if (i10 == 1) {
            removeGeofences(string);
        } else if (i10 == 2) {
            onEnterGeofence(string, extras.getString(GEOFENCES_CURRENT_ID));
        } else {
            if (i10 != 3) {
                return;
            }
            onExitGeofence(string, extras.getString(GEOFENCES_CURRENT_ID));
        }
    }
}