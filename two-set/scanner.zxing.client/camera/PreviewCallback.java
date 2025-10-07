package com.disney.wdpro.scanner.zxing.client.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* loaded from: classes17.dex */
final class PreviewCallback implements Camera.PreviewCallback {
    private static final String TAG = "PreviewCallback";
    private final CameraConfigurationManager configManager;
    private Handler previewHandler;
    private int previewMessage;
    private boolean toInvert;

    PreviewCallback(CameraConfigurationManager cameraConfigurationManager) {
        this.configManager = cameraConfigurationManager;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean z10 = this.toInvert;
        this.toInvert = !z10;
        if (!z10) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) (255 - bArr[i10]);
            }
        }
        Point cameraResolution = this.configManager.getCameraResolution();
        Handler handler = this.previewHandler;
        if (cameraResolution == null || handler == null) {
            LogInstrumentation.m79024d(TAG, "Got preview callback, but no handler or resolution available");
        } else {
            handler.obtainMessage(this.previewMessage, cameraResolution.x, cameraResolution.y, bArr).sendToTarget();
            this.previewHandler = null;
        }
    }

    void setHandler(Handler handler, int i10) {
        this.previewHandler = handler;
        this.previewMessage = i10;
    }
}