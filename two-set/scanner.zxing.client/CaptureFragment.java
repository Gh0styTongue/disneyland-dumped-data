package com.disney.wdpro.scanner.zxing.client;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.disney.wdpro.scanner.zxing.client.camera.CameraManager;
import com.disney.wdpro.scanner.zxing.client.camera.FrontLightMode;
import com.disney.wdpro.scanner.zxing.client.interfaces.Controller;
import com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanCallback;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand;
import com.disney.wdpro.scanner.zxing.client.managers.AmbientLightManager;
import com.disney.wdpro.scanner.zxing.client.managers.BeepManager;
import com.disney.wdpro.scanner.zxing.client.managers.ScanAreaManagerImpl;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C23765k;
import com.google.zxing.C23766l;
import com.google.zxing.DecodeHintType;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import hr.C28454a;
import hr.C28456c;
import hr.C28457d;
import hr.C28459f;
import java.io.IOException;
import java.util.Map;

@Instrumented
/* loaded from: classes17.dex */
public final class CaptureFragment extends Fragment implements TextureView.SurfaceTextureListener, Controller, ScanCommand, TraceFieldInterface {
    private static final String TAG = "CaptureFragment";
    public Trace _nr_trace;
    private AmbientLightManager ambientLightManager;
    private ImageView barcodeScanAreaView;
    private BeepManager beepManager;
    private CameraManager cameraManager;
    Map<DecodeHintType, ?> decodeHints;
    private final ErrorHandler errorHandler = new ErrorHandler() { // from class: com.disney.wdpro.scanner.zxing.client.CaptureFragment.1
        @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler
        public void reportCameraHardwareError(Throwable th2) {
            CaptureFragment.this.reportCameraHardwareError(th2);
        }

        @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler
        public void reportTimeOut() {
            CaptureFragment.this.reportTimeOut();
        }

        @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler
        public void reportUnknownError(Throwable th2) {
            CaptureFragment.this.reportUnknownError(th2);
        }
    };
    private boolean flashOff;
    private CaptureFragmentHandler handler;
    private boolean hasSurface;
    private InactivityTimer inactivityTimer;
    private boolean isTorchControlManual;
    private int previewHeight;
    private int previewWidth;
    private ScanAreaManager scanAreaManager;
    private ScanCallback scanCallback;
    private ImageButton scannerTorchIcon;
    private TextureView textureView;
    private String torchIconOffDescription;
    private String torchIconOnDescription;

    @Deprecated
    public CaptureFragment() {
    }

    private void adjustScanAreaViewSize(Rect rect) {
        int iWidth = rect.width();
        ViewGroup.LayoutParams layoutParams = this.barcodeScanAreaView.getLayoutParams();
        if (layoutParams.width != iWidth) {
            layoutParams.width = iWidth;
            this.barcodeScanAreaView.requestLayout();
        }
    }

    private static void drawLine(Canvas canvas, Paint paint, C23766l c23766l, C23766l c23766l2, float f10) {
        if (c23766l == null || c23766l2 == null) {
            return;
        }
        canvas.drawLine(f10 * c23766l.m75225c(), f10 * c23766l.m75226d(), f10 * c23766l2.m75225c(), f10 * c23766l2.m75226d(), paint);
    }

    private void drawResultPoints(Bitmap bitmap, float f10, C23765k c23765k) {
        C23766l[] c23766lArrM75217e = c23765k.m75217e();
        if (c23766lArrM75217e == null || c23766lArrM75217e.length <= 0) {
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(C28454a.result_points));
        if (c23766lArrM75217e.length == 2) {
            paint.setStrokeWidth(4.0f);
            drawLine(canvas, paint, c23766lArrM75217e[0], c23766lArrM75217e[1], f10);
            return;
        }
        if (c23766lArrM75217e.length == 4 && (c23765k.m75214b() == BarcodeFormat.UPC_A || c23765k.m75214b() == BarcodeFormat.EAN_13)) {
            drawLine(canvas, paint, c23766lArrM75217e[0], c23766lArrM75217e[1], f10);
            drawLine(canvas, paint, c23766lArrM75217e[2], c23766lArrM75217e[3], f10);
            return;
        }
        paint.setStrokeWidth(10.0f);
        for (C23766l c23766l : c23766lArrM75217e) {
            if (c23766l != null) {
                canvas.drawPoint(c23766l.m75225c() * f10, c23766l.m75226d() * f10, paint);
            }
        }
    }

    private void exit() {
        stopAndReleaseResources();
        ScanCallback scanCallback = this.scanCallback;
        if (scanCallback != null) {
            scanCallback.onScanError(new Throwable("Unknown Error!"));
        }
    }

    private void initCamera(TextureView textureView, int i10, int i11) {
        if (textureView == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.cameraManager.isOpen()) {
            LogInstrumentation.m79032w(TAG, "initCamera() while already open -- late SurfaceView callback?");
            return;
        }
        try {
            this.cameraManager.openAndAdjustSetting(getActivity(), textureView, i10, i11);
            if (this.handler == null) {
                this.handler = new CaptureFragmentHandler(this, this.errorHandler, this.decodeHints, this.cameraManager);
            }
        } catch (IOException e10) {
            reportCameraHardwareError(e10);
        } catch (RuntimeException e11) {
            LogInstrumentation.m79033w(TAG, "Unexpected error initializing camera", e11);
            reportUnknownError(e11);
        }
    }

    private void initScanner() throws IllegalArgumentException {
        adjustScanAreaViewSize(this.scanAreaManager.setAndGetScanAreaRect(new Point(this.previewWidth, this.previewHeight)));
        initCamera(this.textureView, this.previewWidth, this.previewHeight);
        if (this.cameraManager.hasFlash()) {
            updateTorch();
        } else {
            this.scannerTorchIcon.setVisibility(8);
            this.isTorchControlManual = false;
        }
        Matrix previewCropMatrix = this.cameraManager.getPreviewCropMatrix(this.previewWidth, this.previewHeight);
        if (previewCropMatrix != null) {
            this.textureView.setTransform(previewCropMatrix);
        }
        resumeDecoding();
    }

    public static CaptureFragment newInstance() {
        CaptureFragment captureFragment = new CaptureFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(Constants.KEY_PLAY_BEEP, true);
        bundle.putBoolean(Constants.KEY_AUTO_FOCUS, true);
        bundle.putBoolean(Constants.KEY_DISABLE_CONTINUOUS_FOCUS, true);
        bundle.putInt(Constants.KEY_TIME_OUT_SECOND, 90);
        captureFragment.setArguments(bundle);
        return captureFragment;
    }

    private void stopAndReleaseResources() {
        LogInstrumentation.m79028i(TAG, "*** INFO *** stopAndReleaseResources()");
        if (this.isTorchControlManual) {
            this.flashOff = false;
        }
        CaptureFragmentHandler captureFragmentHandler = this.handler;
        if (captureFragmentHandler != null) {
            captureFragmentHandler.quitSynchronously();
            this.handler = null;
        }
        this.inactivityTimer.onPause();
        this.ambientLightManager.stop();
        this.beepManager.close();
        this.cameraManager.closeDriver();
    }

    private void stopPreview() {
        if (!this.hasSurface) {
            this.textureView.setSurfaceTextureListener(null);
        }
        stopAndReleaseResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTorch() {
        if (this.isTorchControlManual) {
            this.scannerTorchIcon.setContentDescription(this.flashOff ? this.torchIconOffDescription : this.torchIconOnDescription);
            this.scannerTorchIcon.setSelected(this.flashOff);
            this.cameraManager.setTorch(this.flashOff);
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.Controller
    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.Controller
    public Handler getHandler() {
        return this.handler;
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.Controller
    public void handleDecode(C23765k c23765k, Bitmap bitmap, float f10) {
        ScanCallback scanCallback;
        this.inactivityTimer.onPause();
        this.ambientLightManager.stop();
        boolean z10 = bitmap != null;
        if (z10) {
            this.beepManager.playBeepSoundAndVibrate();
            drawResultPoints(bitmap, f10, c23765k);
        }
        if (!z10 || (scanCallback = this.scanCallback) == null) {
            return;
        }
        scanCallback.onScanSuccess(c23765k, bitmap);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            TraceMachine.enterMethod(this._nr_trace, "CaptureFragment#onCreateView", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "CaptureFragment#onCreateView", null);
        }
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        FragmentActivity activity = getActivity();
        activity.getWindow().addFlags(128);
        View viewInflate = layoutInflater.inflate(C28457d.capture, viewGroup, false);
        this.textureView = (TextureView) viewInflate.findViewById(C28456c.preview_view);
        this.barcodeScanAreaView = (ImageView) viewInflate.findViewById(C28456c.scanner_background_image);
        this.scannerTorchIcon = (ImageButton) viewInflate.findViewById(C28456c.scanner_torch);
        this.hasSurface = false;
        this.inactivityTimer = new InactivityTimer(this.errorHandler, arguments.getInt(Constants.KEY_TIME_OUT_SECOND, 90));
        this.beepManager = new BeepManager(activity, arguments);
        this.ambientLightManager = new AmbientLightManager(activity, arguments);
        this.isTorchControlManual = FrontLightMode.MANUAL == FrontLightMode.readPref(arguments);
        this.torchIconOnDescription = arguments.getString(Constants.FLASH_ON_DESCRIPTION, getString(C28459f.turn_on_flash));
        this.torchIconOffDescription = arguments.getString(Constants.FLASH_OFF_DESCRIPTION, getString(C28459f.turn_off_flash));
        if (this.isTorchControlManual) {
            this.scannerTorchIcon.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.scanner.zxing.client.CaptureFragment.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CaptureFragment.this.flashOff = !r2.flashOff;
                    CaptureFragment.this.updateTorch();
                }
            });
        } else {
            this.scannerTorchIcon.setVisibility(8);
        }
        if (this.scanAreaManager == null) {
            this.scanAreaManager = new ScanAreaManagerImpl();
        }
        this.cameraManager = new CameraManager(this.scanAreaManager, arguments);
        if (this.scanAreaManager.showScanAreaOverlay()) {
            this.barcodeScanAreaView.setVisibility(0);
            this.barcodeScanAreaView.setImageResource(this.scanAreaManager.getScanAreaBackgroundDrawable());
        } else {
            this.barcodeScanAreaView.setVisibility(8);
        }
        TraceMachine.exitMethod();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.inactivityTimer.shutdown();
        this.barcodeScanAreaView.setImageDrawable(null);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LogInstrumentation.m79028i(TAG, "*** INFO *** onPause()");
        stopPreview();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        LogInstrumentation.m79028i(TAG, "*** INFO *** onResume()");
        super.onResume();
        if (this.hasSurface) {
            try {
                initScanner();
            } catch (IllegalArgumentException unused) {
                exit();
                return;
            }
        } else {
            this.textureView.setSurfaceTextureListener(this);
        }
        this.beepManager.updatePrefs();
        this.ambientLightManager.start(this.cameraManager);
        this.inactivityTimer.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture == null) {
            LogInstrumentation.m79026e(TAG, "*** WARNING *** onSurfaceTextureAvailable() gave us a null surface!");
        }
        LogInstrumentation.m79028i(TAG, "*** INFO *** onSurfaceTextureAvailable(" + i10 + "," + i11 + ")");
        if (this.hasSurface) {
            return;
        }
        this.hasSurface = true;
        this.previewHeight = i11;
        this.previewWidth = i10;
        try {
            initScanner();
        } catch (IllegalArgumentException unused) {
            exit();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LogInstrumentation.m79028i(TAG, "*** INFO *** onSurfaceTextureDestroyed()");
        stopPreview();
        this.hasSurface = false;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        LogInstrumentation.m79028i(TAG, "*** INFO *** onSurfaceTextureSizeChanged(" + i10 + "," + i11 + ")");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void pauseDecoding() {
        this.inactivityTimer.onPause();
        this.ambientLightManager.stop();
        CaptureFragmentHandler captureFragmentHandler = this.handler;
        if (captureFragmentHandler != null) {
            captureFragmentHandler.sendEmptyMessage(C28456c.pause_preview);
        }
    }

    void reportCameraHardwareError(Throwable th2) {
        if (this.scanCallback != null) {
            LogInstrumentation.m79026e(TAG, "*** ERROR ***  The camera hardware failed to open!");
            pauseDecoding();
            this.scanCallback.onScanError(th2);
        }
    }

    void reportTimeOut() {
        if (this.scanCallback != null) {
            LogInstrumentation.m79028i(TAG, "*** INFO ***  Scanner timed out without detecting a valid barcode!");
            pauseDecoding();
            this.scanCallback.onScanTimeOut();
        }
    }

    void reportUnknownError(Throwable th2) {
        if (this.scanCallback != null) {
            LogInstrumentation.m79026e(TAG, "*** ERROR ***  The camera failed to complete an operation!");
            pauseDecoding();
            this.scanCallback.onScanError(th2);
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void restartPreviewAfterDelay(long j10) {
        this.inactivityTimer.onResume();
        this.ambientLightManager.start(this.cameraManager);
        CaptureFragmentHandler captureFragmentHandler = this.handler;
        if (captureFragmentHandler != null) {
            captureFragmentHandler.sendEmptyMessageDelayed(C28456c.restart_preview, j10);
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void resumeDecoding() {
        this.inactivityTimer.onResume();
        this.ambientLightManager.start(this.cameraManager);
        CaptureFragmentHandler captureFragmentHandler = this.handler;
        if (captureFragmentHandler != null) {
            captureFragmentHandler.sendEmptyMessage(C28456c.resume_preview);
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void setScanAreaManager(ScanAreaManager scanAreaManager) {
        this.scanAreaManager = scanAreaManager;
    }

    public void setScanCallback(ScanCallback scanCallback) {
        this.scanCallback = scanCallback;
    }

    public void setTorchIconContentDescription(int i10, int i11) {
        setTorchIconContentDescription(getString(i10), getString(i11));
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void turnTorchOn(boolean z10) {
        if (!this.isTorchControlManual || this.scannerTorchIcon == null) {
            return;
        }
        this.flashOff = z10;
        updateTorch();
    }

    public void setTorchIconContentDescription(String str, String str2) {
        this.torchIconOnDescription = str;
        this.torchIconOffDescription = str2;
    }
}