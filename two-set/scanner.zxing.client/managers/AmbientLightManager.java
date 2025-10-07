package com.disney.wdpro.scanner.zxing.client.managers;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.disney.wdpro.scanner.zxing.client.camera.CameraManager;
import com.disney.wdpro.scanner.zxing.client.camera.FrontLightMode;

/* loaded from: classes17.dex */
public final class AmbientLightManager implements SensorEventListener {
    private static final float BRIGHT_ENOUGH_LUX = 50.0f;
    private static final float TOO_DARK_LUX = 25.0f;
    private CameraManager cameraManager;
    private final Context context;
    private Sensor lightSensor;
    private Bundle prefs;

    public AmbientLightManager(Context context, Bundle bundle) {
        this.context = context;
        this.prefs = bundle;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        CameraManager cameraManager = this.cameraManager;
        if (cameraManager != null) {
            if (f10 <= TOO_DARK_LUX) {
                cameraManager.setTorch(true);
            } else if (f10 >= BRIGHT_ENOUGH_LUX) {
                cameraManager.setTorch(false);
            }
        }
    }

    public void start(CameraManager cameraManager) {
        this.cameraManager = cameraManager;
        if (FrontLightMode.readPref(this.prefs) == FrontLightMode.AUTO) {
            SensorManager sensorManager = (SensorManager) this.context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.lightSensor = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void stop() {
        if (this.lightSensor != null) {
            ((SensorManager) this.context.getSystemService("sensor")).unregisterListener(this);
            this.cameraManager = null;
            this.lightSensor = null;
        }
    }
}