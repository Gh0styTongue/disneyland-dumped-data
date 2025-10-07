package com.disney.wdpro.scanner.zxing.client;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.disney.wdpro.scanner.zxing.client.camera.CameraManager;
import com.disney.wdpro.scanner.zxing.client.interfaces.Controller;
import com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import com.google.zxing.C23765k;
import com.google.zxing.DecodeHintType;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import hr.C28456c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0006\u0010\u0017\u001a\u00020\u0011J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/scanner/zxing/client/CaptureHandler;", "Landroid/os/Handler;", "controller", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/Controller;", "errorHandler", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ErrorHandler;", "baseHints", "", "Lcom/google/zxing/DecodeHintType;", "cameraManager", "Lcom/disney/wdpro/scanner/zxing/client/camera/CameraManager;", "(Lcom/disney/wdpro/scanner/zxing/client/interfaces/Controller;Lcom/disney/wdpro/scanner/zxing/client/interfaces/ErrorHandler;Ljava/util/Map;Lcom/disney/wdpro/scanner/zxing/client/camera/CameraManager;)V", "decodeThread", "Lcom/disney/wdpro/scanner/zxing/client/DecodeThread;", "state", "Lcom/disney/wdpro/scanner/zxing/client/CaptureHandler$State;", "handleDecodeMessage", "", "message", "Landroid/os/Message;", "handleErrorMessage", "handleMessage", "pauseDecoding", "quitSynchronously", "restartPreviewAndDecode", "resumePreviewAndDecoding", "Companion", "State", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes17.dex */
public final class CaptureHandler extends Handler {
    private static final String TAG = CaptureFragmentHandler.class.getSimpleName();
    private final CameraManager cameraManager;
    private final Controller controller;
    private final DecodeThread decodeThread;
    private final ErrorHandler errorHandler;
    private State state;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/scanner/zxing/client/CaptureHandler$State;", "", "(Ljava/lang/String;I)V", "NOT_STARTED", "PREVIEW", "PAUSED", "SUCCESS", "DONE", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private enum State {
        NOT_STARTED,
        PREVIEW,
        PAUSED,
        SUCCESS,
        DONE
    }

    public CaptureHandler(Controller controller, ErrorHandler errorHandler, Map<DecodeHintType, ?> map, CameraManager cameraManager) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        this.controller = controller;
        this.errorHandler = errorHandler;
        this.decodeThread = new DecodeThread(controller, map);
        this.state = State.NOT_STARTED;
        this.cameraManager = cameraManager;
    }

    private final void handleDecodeMessage(Message message) {
        float f10;
        this.state = State.SUCCESS;
        Bundle data = message.getData();
        if (data != null) {
            byte[] byteArray = data.getByteArray("barcode_bitmap");
            bitmapCopy = byteArray != null ? BitmapFactoryInstrumentation.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
            f10 = data.getFloat(DecodeThread.BARCODE_SCALED_FACTOR);
        } else {
            f10 = 1.0f;
        }
        Controller controller = this.controller;
        Object obj = message.obj;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.google.zxing.Result");
        controller.handleDecode((C23765k) obj, bitmapCopy, f10);
    }

    private final void handleErrorMessage(Message message) {
        Bundle data = message.getData();
        Throwable th2 = data != null ? (Throwable) data.getSerializable(Constants.EXCEPTION) : null;
        if (th2 == null) {
            th2 = new Throwable("Unknown Error!");
        }
        this.errorHandler.reportUnknownError(th2);
    }

    private final synchronized void pauseDecoding() {
        try {
            State state = this.state;
            if (state == State.PREVIEW || state == State.SUCCESS) {
                this.state = State.PAUSED;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void restartPreviewAndDecode() {
        try {
            State state = this.state;
            if (state == State.SUCCESS || state == State.PAUSED) {
                this.state = State.PREVIEW;
                this.cameraManager.requestPreviewFrame(this.decodeThread.getHandler(), C28456c.decode);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void resumePreviewAndDecoding() {
        if (this.state == State.NOT_STARTED) {
            this.decodeThread.start();
            try {
                this.cameraManager.startPreview();
            } catch (Exception e10) {
                this.errorHandler.reportCameraHardwareError(e10);
                return;
            }
        }
        this.state = State.SUCCESS;
        restartPreviewAndDecode();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i10 = message.what;
        if (i10 == C28456c.resume_preview) {
            resumePreviewAndDecoding();
            return;
        }
        if (i10 == C28456c.pause_preview) {
            pauseDecoding();
            return;
        }
        if (i10 == C28456c.restart_preview) {
            restartPreviewAndDecode();
            return;
        }
        if (i10 == C28456c.decode_succeeded) {
            handleDecodeMessage(message);
            return;
        }
        if (i10 == C28456c.decode_failed && this.state != State.PAUSED) {
            this.state = State.PREVIEW;
            this.cameraManager.requestPreviewFrame(this.decodeThread.getHandler(), C28456c.decode);
        } else if (i10 == C28456c.bug) {
            handleErrorMessage(message);
        }
    }

    public final void quitSynchronously() {
        this.state = State.DONE;
        try {
            try {
                this.cameraManager.stopPreview();
                Handler handlerForQuiting = this.decodeThread.getHandlerForQuiting();
                if (handlerForQuiting != null) {
                    Message.obtain(handlerForQuiting, C28456c.quit).sendToTarget();
                }
                removeMessages(C28456c.decode_succeeded);
                removeMessages(C28456c.decode_failed);
                removeMessages(C28456c.decode);
                removeMessages(C28456c.resume_preview);
                removeMessages(C28456c.pause_preview);
                removeMessages(C28456c.restart_preview);
            } catch (Exception e10) {
                this.errorHandler.reportCameraHardwareError(e10);
                Handler handlerForQuiting2 = this.decodeThread.getHandlerForQuiting();
                if (handlerForQuiting2 != null) {
                    Message.obtain(handlerForQuiting2, C28456c.quit).sendToTarget();
                }
                removeMessages(C28456c.decode_succeeded);
                removeMessages(C28456c.decode_failed);
                removeMessages(C28456c.decode);
                removeMessages(C28456c.resume_preview);
                removeMessages(C28456c.pause_preview);
                removeMessages(C28456c.restart_preview);
            }
        } catch (Throwable th2) {
            Handler handlerForQuiting3 = this.decodeThread.getHandlerForQuiting();
            if (handlerForQuiting3 != null) {
                Message.obtain(handlerForQuiting3, C28456c.quit).sendToTarget();
            }
            removeMessages(C28456c.decode_succeeded);
            removeMessages(C28456c.decode_failed);
            removeMessages(C28456c.decode);
            removeMessages(C28456c.resume_preview);
            removeMessages(C28456c.pause_preview);
            removeMessages(C28456c.restart_preview);
            throw th2;
        }
    }
}