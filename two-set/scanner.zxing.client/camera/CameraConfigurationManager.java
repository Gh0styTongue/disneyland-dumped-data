package com.disney.wdpro.scanner.zxing.client.camera;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.snap.camerakit.internal.h76;
import com.wdpr.p479ee.p480ra.rahybrid.WebViewBridge;
import ir.C29315a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Instrumented
/* loaded from: classes17.dex */
final class CameraConfigurationManager {
    private static final double MAX_ASPECT_DISTORTION = 0.15d;
    private static final int MIN_PREVIEW_PIXELS = 153600;
    private static final String TAG = "CameraConfiguration";
    private Point cameraResolution;
    private Bundle prefs;
    private Point previewContainerResolution;
    private int screenOrientation;

    CameraConfigurationManager(Bundle bundle) {
        this.prefs = bundle;
    }

    private void doSetTorch(Camera.Parameters parameters, boolean z10, boolean z11) {
        C29315a.m91182i(parameters, z10);
        if (z11 || this.prefs.getBoolean(Constants.KEY_DISABLE_EXPOSURE, true)) {
            return;
        }
        C29315a.m91177d(parameters, z10);
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        double d10;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            LogInstrumentation.m79032w(TAG, "Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList<Camera.Size> arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new Comparator<Camera.Size>() { // from class: com.disney.wdpro.scanner.zxing.client.camera.CameraConfigurationManager.1
            @Override // java.util.Comparator
            public int compare(Camera.Size size, Camera.Size size2) {
                int i10 = size.height * size.width;
                int i11 = size2.height * size2.width;
                if (i11 < i10) {
                    return -1;
                }
                return i11 > i10 ? 1 : 0;
            }
        });
        if (Log.isLoggable(TAG, 4)) {
            StringBuilder sb2 = new StringBuilder();
            for (Camera.Size size : arrayList) {
                sb2.append(size.width);
                sb2.append('x');
                sb2.append(size.height);
                sb2.append(' ');
            }
            LogInstrumentation.m79028i(TAG, "Supported preview sizes: " + ((Object) sb2));
        }
        double d11 = point.x / point.y;
        Iterator it = arrayList.iterator();
        double d12 = Double.MAX_VALUE;
        Camera.Size size2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (size2 != null) {
                    return new Point(size2.width, size2.height);
                }
                if (!arrayList.isEmpty()) {
                    Camera.Size size3 = (Camera.Size) arrayList.get(0);
                    Point point2 = new Point(size3.width, size3.height);
                    LogInstrumentation.m79028i(TAG, "Using largest suitable preview size: " + point2);
                    return point2;
                }
                Camera.Size previewSize2 = parameters.getPreviewSize();
                if (previewSize2 == null) {
                    throw new IllegalStateException("Parameters contained no preview size!");
                }
                Point point3 = new Point(previewSize2.width, previewSize2.height);
                LogInstrumentation.m79028i(TAG, "No suitable preview sizes, using default: " + point3);
                return point3;
            }
            Camera.Size size4 = (Camera.Size) it.next();
            int i10 = size4.width;
            int i11 = size4.height;
            if (i10 * i11 < MIN_PREVIEW_PIXELS) {
                it.remove();
                d10 = d11;
            } else {
                boolean z10 = i10 < i11;
                int i12 = z10 ? i11 : i10;
                int i13 = z10 ? i10 : i11;
                d10 = d11;
                double dAbs = Math.abs((i12 / i13) - d10);
                if (dAbs > MAX_ASPECT_DISTORTION) {
                    it.remove();
                } else {
                    Iterator it2 = it;
                    if (i12 == point.x && i13 == point.y) {
                        Point point4 = new Point(i10, i11);
                        LogInstrumentation.m79028i(TAG, "Found preview size exactly matching screen size: " + point4);
                        return point4;
                    }
                    if (d12 > dAbs) {
                        d12 = dAbs;
                        size2 = size4;
                    }
                    d11 = d10;
                    it = it2;
                }
            }
            d11 = d10;
        }
    }

    private int findScreenOrientation(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(WebViewBridge.JAVASCRIPT_WINDOW_PREFIX)).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && i11 > i10) || ((rotation == 1 || rotation == 3) && i10 > i11)) {
            if (rotation == 0) {
                return 1;
            }
            if (rotation == 1) {
                return 0;
            }
            if (rotation == 2) {
                return 9;
            }
            if (rotation == 3) {
                return 8;
            }
            LogInstrumentation.m79026e(TAG, "Unknown screen orientation. Defaulting to portrait.");
            return 1;
        }
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 1;
        }
        if (rotation == 2) {
            return 8;
        }
        if (rotation == 3) {
            return 9;
        }
        LogInstrumentation.m79026e(TAG, "Unknown screen orientation. Defaulting to Landscape.");
        return 0;
    }

    private static int getScreenRotation(Context context) {
        int rotation = ((WindowManager) context.getSystemService(WebViewBridge.JAVASCRIPT_WINDOW_PREFIX)).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    private void initializeTorch(Camera.Parameters parameters, Bundle bundle, boolean z10) {
        doSetTorch(parameters, FrontLightMode.readPref(bundle) == FrontLightMode.ON, z10);
    }

    public static void setCameraDisplayOrientation(Context context, Camera camera, int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i10, cameraInfo);
        int screenRotation = getScreenRotation(context);
        camera.setDisplayOrientation(cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + screenRotation) % h76.CHEERIOS_FLIGHT_COMPLETE_FIELD_NUMBER)) % h76.CHEERIOS_FLIGHT_COMPLETE_FIELD_NUMBER : ((cameraInfo.orientation - screenRotation) + h76.CHEERIOS_FLIGHT_COMPLETE_FIELD_NUMBER) % h76.CHEERIOS_FLIGHT_COMPLETE_FIELD_NUMBER);
    }

    private static void setCameraRotation(Context context, Camera camera, int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i10, cameraInfo);
        int screenRotation = ((getScreenRotation(context) + 45) / 90) * 90;
        camera.getParameters().setRotation(cameraInfo.facing == 1 ? ((cameraInfo.orientation - screenRotation) + h76.CHEERIOS_FLIGHT_COMPLETE_FIELD_NUMBER) % h76.CHEERIOS_FLIGHT_COMPLETE_FIELD_NUMBER : (cameraInfo.orientation + screenRotation) % h76.CHEERIOS_FLIGHT_COMPLETE_FIELD_NUMBER);
    }

    void adjustCameraResolution(Camera camera, int i10, int i11) {
        Point point;
        Camera.Parameters parameters = camera.getParameters();
        this.previewContainerResolution = new Point(i10, i11);
        int screenOrientation = getScreenOrientation();
        if (screenOrientation == 1 || screenOrientation == 9) {
            Point point2 = this.previewContainerResolution;
            point = new Point(point2.y, point2.x);
        } else {
            point = this.previewContainerResolution;
        }
        this.cameraResolution = findBestPreviewSizeValue(parameters, point);
        LogInstrumentation.m79028i(TAG, "Camera resolution on basis of container w/h: " + this.cameraResolution);
        Point point3 = this.cameraResolution;
        parameters.setPreviewSize(point3.x, point3.y);
        camera.setParameters(parameters);
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point4 = this.cameraResolution;
            if (point4.x == previewSize.width && point4.y == previewSize.height) {
                return;
            }
            LogInstrumentation.m79032w(TAG, "Camera said it supported preview size " + this.cameraResolution.x + 'x' + this.cameraResolution.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height);
            Point point5 = this.cameraResolution;
            point5.x = previewSize.width;
            point5.y = previewSize.height;
        }
    }

    Point getCameraResolution() {
        return this.cameraResolution;
    }

    Point getPreviewContainerResolution() {
        return this.previewContainerResolution;
    }

    public int getScreenOrientation() {
        return this.screenOrientation;
    }

    boolean getTorchState(Camera camera) {
        Camera.Parameters parameters;
        String flashMode;
        if (camera == null || (parameters = camera.getParameters()) == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    void setDesiredCameraParameters(Camera camera, boolean z10) {
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            LogInstrumentation.m79032w(TAG, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        LogInstrumentation.m79028i(TAG, "Initial camera parameters: " + parameters.flatten());
        if (z10) {
            LogInstrumentation.m79032w(TAG, "In camera config safe mode -- most settings will not be honored");
        }
        initializeTorch(parameters, this.prefs, z10);
        C29315a.m91178e(parameters, this.prefs.getBoolean(Constants.KEY_AUTO_FOCUS, true), this.prefs.getBoolean(Constants.KEY_DISABLE_CONTINUOUS_FOCUS, true), z10);
        if (!z10) {
            if (this.prefs.getBoolean(Constants.KEY_INVERT_SCAN, false)) {
                C29315a.m91180g(parameters);
            }
            if (!this.prefs.getBoolean(Constants.KEY_DISABLE_BARCODE_SCENE_MODE, true)) {
                C29315a.m91176c(parameters);
            }
            if (!this.prefs.getBoolean(Constants.KEY_DISABLE_METERING, true)) {
                C29315a.m91183j(parameters);
                C29315a.m91179f(parameters);
                C29315a.m91181h(parameters);
            }
        }
        LogInstrumentation.m79028i(TAG, "Final camera parameters: " + parameters.flatten());
        camera.setParameters(parameters);
    }

    void setTorch(Camera camera, boolean z10) {
        Camera.Parameters parameters = camera.getParameters();
        doSetTorch(parameters, z10, false);
        camera.setParameters(parameters);
    }

    void updateCameraOrientation(Context context, Camera camera, int i10) {
        this.screenOrientation = findScreenOrientation(context);
        setCameraDisplayOrientation(context, camera, i10);
        setCameraRotation(context, camera, i10);
    }
}