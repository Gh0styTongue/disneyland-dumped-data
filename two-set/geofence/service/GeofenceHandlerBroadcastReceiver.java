package com.disney.wdpro.geofence.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.geofence.util.LogUtils;

/* loaded from: classes28.dex */
public class GeofenceHandlerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtils.m50243d("Received with intent = " + intent.toString());
        GeofenceHandlerIntentService.enqueueWork(context, intent);
    }
}