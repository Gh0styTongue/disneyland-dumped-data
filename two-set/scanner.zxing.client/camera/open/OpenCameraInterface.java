package com.disney.wdpro.scanner.zxing.client.camera.open;

import android.hardware.Camera;
import android.util.Pair;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* loaded from: classes17.dex */
public final class OpenCameraInterface {
    public static final int NO_REQUESTED_CAMERA = -1;
    private static final String TAG = "com.disney.wdpro.scanner.zxing.client.camera.open.OpenCameraInterface";

    private OpenCameraInterface() {
    }

    public static Pair<Camera, Integer> open(int i10) {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera cameraOpen = null;
        if (numberOfCameras == 0) {
            LogInstrumentation.m79032w(TAG, "No cameras!");
            return null;
        }
        boolean z10 = i10 >= 0;
        if (!z10) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        if (i10 < numberOfCameras) {
            LogInstrumentation.m79028i(TAG, "Opening camera #" + i10);
            cameraOpen = Camera.open(i10);
        } else if (z10) {
            LogInstrumentation.m79032w(TAG, "Requested camera does not exist: " + i10);
        } else {
            LogInstrumentation.m79028i(TAG, "No camera facing back; returning camera #0");
            cameraOpen = Camera.open(0);
        }
        return new Pair<>(cameraOpen, Integer.valueOf(i10));
    }
}