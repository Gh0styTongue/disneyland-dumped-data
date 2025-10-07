package com.disney.wdpro.scanner.zxing.client.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.TextureView;
import com.disney.wdpro.scanner.zxing.client.camera.open.OpenCameraInterface;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager;
import com.google.zxing.C23762h;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.io.IOException;
import java.util.List;

@Instrumented
/* loaded from: classes17.dex */
public final class CameraManager {
    private static final String TAG = "CameraManager";
    private AutoFocusManager autoFocusManager;
    private Camera camera;
    private final CameraConfigurationManager configManager;
    private Rect framingRect;
    private Rect framingRectInPreview;
    private Bundle prefs;
    private final PreviewCallback previewCallback;
    private boolean previewing;
    private int requestedCameraId = -1;
    private final ScanAreaManager scanAreaManager;

    private static class Scale {

        /* renamed from: x */
        float f43193x;

        /* renamed from: y */
        float f43194y;

        private Scale(float f10, float f11) {
            this.f43193x = f10;
            this.f43194y = f11;
        }
    }

    public CameraManager(ScanAreaManager scanAreaManager, Bundle bundle) {
        this.scanAreaManager = scanAreaManager;
        this.prefs = bundle;
        CameraConfigurationManager cameraConfigurationManager = new CameraConfigurationManager(bundle);
        this.configManager = cameraConfigurationManager;
        this.previewCallback = new PreviewCallback(cameraConfigurationManager);
    }

    private Scale getPreviewScale() {
        Point cameraResolution = this.configManager.getCameraResolution();
        Point previewContainerResolution = this.configManager.getPreviewContainerResolution();
        if (cameraResolution == null || previewContainerResolution == null) {
            return null;
        }
        int screenOrientation = this.configManager.getScreenOrientation();
        if (screenOrientation != 0) {
            if (screenOrientation != 1) {
                if (screenOrientation != 8) {
                    if (screenOrientation != 9) {
                        LogInstrumentation.m79026e(TAG, "Unknown screen orientation. Defaulting to portrait.");
                        return new Scale(cameraResolution.y / previewContainerResolution.x, cameraResolution.x / previewContainerResolution.y);
                    }
                }
            }
            return new Scale(cameraResolution.y / previewContainerResolution.x, cameraResolution.x / previewContainerResolution.y);
        }
        return new Scale(cameraResolution.x / previewContainerResolution.x, cameraResolution.y / previewContainerResolution.y);
    }

    public static boolean isRearCameraPresent() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
            Camera.getCameraInfo(i10, cameraInfo);
            if (cameraInfo.facing == 0) {
                LogInstrumentation.m79028i(TAG, "This Phone has a Rear Camera.");
                return true;
            }
        }
        return false;
    }

    private byte[] rotate90ClockWise(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                bArr2[(((i13 * i11) + i11) - i12) - 1] = bArr[(i12 * i10) + i13];
            }
        }
        return bArr2;
    }

    private Rect rotate90ReverseClockWise(Rect rect, int i10, int i11) {
        int iHeight = rect.height();
        int iWidth = rect.width();
        int i12 = rect.top;
        int i13 = i10 - rect.right;
        return new Rect(i12, i13, iHeight + i12, iWidth + i13);
    }

    public C23762h buildLuminanceSource(byte[] bArr, int i10, int i11) {
        byte[] bArrRotate90ClockWise;
        int i12;
        int i13;
        Rect framingRectInPreview = getFramingRectInPreview();
        if (framingRectInPreview == null) {
            return null;
        }
        int screenOrientation = this.configManager.getScreenOrientation();
        if (screenOrientation == 0 || screenOrientation == 8) {
            bArrRotate90ClockWise = bArr;
            i12 = i10;
            i13 = i11;
        } else if (this.scanAreaManager.isScanAreaOrientationAware()) {
            bArrRotate90ClockWise = rotate90ClockWise(bArr, i10, i11);
            i13 = i10;
            i12 = i11;
        } else {
            framingRectInPreview = rotate90ReverseClockWise(framingRectInPreview, i11, i10);
            bArrRotate90ClockWise = bArr;
            i12 = i10;
            i13 = i11;
        }
        return new C23762h(bArrRotate90ClockWise, i12, i13, framingRectInPreview.left, framingRectInPreview.top, framingRectInPreview.width(), framingRectInPreview.height(), false);
    }

    public synchronized void closeDriver() {
        Camera camera = this.camera;
        if (camera != null) {
            camera.release();
            this.camera = null;
            this.framingRect = null;
            this.framingRectInPreview = null;
        }
    }

    public synchronized Rect getFramingRect() {
        try {
            if (this.framingRect == null) {
                if (this.camera == null) {
                    return null;
                }
                this.framingRect = this.scanAreaManager.setAndGetScanAreaRect(this.configManager.getPreviewContainerResolution());
            }
            return this.framingRect;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Rect getFramingRectInPreview() {
        try {
            if (this.framingRectInPreview == null) {
                Rect framingRect = getFramingRect();
                if (framingRect == null) {
                    return null;
                }
                Rect rect = new Rect(framingRect);
                Scale previewScale = getPreviewScale();
                if (previewScale == null) {
                    return null;
                }
                float f10 = rect.left;
                float f11 = previewScale.f43193x;
                rect.left = (int) (f10 * f11);
                rect.right = (int) (rect.right * f11);
                float f12 = rect.top;
                float f13 = previewScale.f43194y;
                rect.top = (int) (f12 * f13);
                rect.bottom = (int) (rect.bottom * f13);
                this.framingRectInPreview = rect;
            }
            return this.framingRectInPreview;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Matrix getPreviewCropMatrix(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        float f11;
        Camera camera = this.camera;
        if (camera == null) {
            return null;
        }
        this.configManager.adjustCameraResolution(camera, i10, i11);
        LogInstrumentation.m79028i(TAG, String.format("adjustCameraResolution(w, h) = (%d, %d)", Integer.valueOf(i10), Integer.valueOf(i11)));
        Camera.Size previewSize = this.camera.getParameters().getPreviewSize();
        int screenOrientation = this.configManager.getScreenOrientation();
        if (screenOrientation == 1 || screenOrientation == 9) {
            i12 = previewSize.height;
            i13 = previewSize.width;
        } else {
            i12 = previewSize.width;
            i13 = previewSize.height;
        }
        float f12 = i10;
        float f13 = i11;
        float f14 = f12 / f13;
        float f15 = i12 / i13;
        float f16 = 0.0f;
        float f17 = 1.0f;
        if (f14 > f15) {
            f11 = f14 / f15;
            f10 = (f13 - (f13 * f11)) / 2.0f;
        } else {
            float f18 = f15 / f14;
            f10 = 0.0f;
            f11 = 1.0f;
            f17 = f18;
            f16 = (f12 - (f12 * f18)) / 2.0f;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f17, f11);
        matrix.postTranslate(f16, f10);
        return matrix;
    }

    public boolean hasFlash() {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        Camera camera = this.camera;
        if (camera == null) {
            return false;
        }
        try {
            parameters = camera.getParameters();
        } catch (RuntimeException unused) {
        }
        return (parameters.getFlashMode() == null || (supportedFlashModes = parameters.getSupportedFlashModes()) == null || supportedFlashModes.isEmpty() || (supportedFlashModes.size() == 1 && supportedFlashModes.get(0).equals("off"))) ? false : true;
    }

    public synchronized boolean isOpen() {
        return this.camera != null;
    }

    public synchronized void openAndAdjustSetting(Context context, TextureView textureView, int i10, int i11) throws IOException {
        try {
            Camera camera = this.camera;
            if (camera == null) {
                Pair<Camera, Integer> pairOpen = OpenCameraInterface.open(this.requestedCameraId);
                Camera camera2 = (Camera) pairOpen.first;
                this.requestedCameraId = ((Integer) pairOpen.second).intValue();
                if (camera2 == null) {
                    throw new IOException();
                }
                this.camera = camera2;
                camera = camera2;
            }
            camera.setPreviewTexture(textureView.getSurfaceTexture());
            String strFlatten = null;
            try {
                this.configManager.updateCameraOrientation(context, camera, this.requestedCameraId);
                Camera.Parameters parameters = camera.getParameters();
                if (parameters != null) {
                    strFlatten = parameters.flatten();
                }
                this.configManager.setDesiredCameraParameters(camera, false);
            } catch (RuntimeException unused) {
                String str = TAG;
                LogInstrumentation.m79032w(str, "Camera rejected parameters. Setting only minimal safe-mode parameters.");
                LogInstrumentation.m79028i(str, "Resetting to saved camera params: " + strFlatten);
                if (strFlatten != null) {
                    try {
                        Camera.Parameters parameters2 = camera.getParameters();
                        parameters2.unflatten(strFlatten);
                        camera.setParameters(parameters2);
                        this.configManager.setDesiredCameraParameters(camera, true);
                    } catch (RuntimeException unused2) {
                        LogInstrumentation.m79032w(TAG, "Camera rejected even safe-mode parameters! No configuration");
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void requestPreviewFrame(Handler handler, int i10) {
        Camera camera = this.camera;
        if (camera != null && this.previewing) {
            this.previewCallback.setHandler(handler, i10);
            camera.setOneShotPreviewCallback(this.previewCallback);
        }
    }

    public synchronized void setManualCameraId(int i10) {
        this.requestedCameraId = i10;
    }

    public synchronized void setTorch(boolean z10) {
        Camera camera;
        if (z10 != this.configManager.getTorchState(this.camera) && (camera = this.camera) != null) {
            this.configManager.setTorch(camera, z10);
        }
    }

    public synchronized void startPreview() {
        Camera camera = this.camera;
        if (camera != null && !this.previewing) {
            camera.startPreview();
            this.previewing = true;
            this.autoFocusManager = new AutoFocusManager(this.camera, this.prefs);
        }
    }

    public synchronized void stopPreview() {
        try {
            AutoFocusManager autoFocusManager = this.autoFocusManager;
            if (autoFocusManager != null) {
                autoFocusManager.stop();
                this.autoFocusManager = null;
            }
            Camera camera = this.camera;
            if (camera != null && this.previewing) {
                try {
                    camera.stopPreview();
                    this.previewCallback.setHandler(null, 0);
                    this.previewing = false;
                } catch (Throwable th2) {
                    this.previewCallback.setHandler(null, 0);
                    this.previewing = false;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}