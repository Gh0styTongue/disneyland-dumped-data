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

@Instrumented
/* loaded from: classes17.dex */
public final class CaptureFragmentHandler extends Handler {
    private static final String TAG = "CaptureFragmentHandler";
    private final CameraManager cameraManager;
    private final Controller captureFragment;
    private final DecodeThread decodeThread;
    private final ErrorHandler errorHandler;
    private State state = State.NOT_STARTED;

    private enum State {
        NOT_STARTED,
        PREVIEW,
        PAUSED,
        SUCCESS,
        DONE
    }

    CaptureFragmentHandler(Controller controller, ErrorHandler errorHandler, Map<DecodeHintType, ?> map, CameraManager cameraManager) {
        this.captureFragment = controller;
        this.errorHandler = errorHandler;
        this.decodeThread = new DecodeThread(controller, map);
        this.cameraManager = cameraManager;
    }

    private synchronized void pauseDecoding() {
        try {
            State state = this.state;
            if (state == State.PREVIEW || state == State.SUCCESS) {
                this.state = State.PAUSED;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void restartPreviewAndDecode() {
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

    private synchronized void resumePreviewAndDecoding() {
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
        float f10;
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
        Bitmap bitmapCopy = null;
        if (i10 == C28456c.decode_succeeded) {
            this.state = State.SUCCESS;
            Bundle data = message.getData();
            if (data != null) {
                byte[] byteArray = data.getByteArray("barcode_bitmap");
                bitmapCopy = byteArray != null ? BitmapFactoryInstrumentation.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
                f10 = data.getFloat(DecodeThread.BARCODE_SCALED_FACTOR);
            } else {
                f10 = 1.0f;
            }
            this.captureFragment.handleDecode((C23765k) message.obj, bitmapCopy, f10);
            return;
        }
        if (i10 == C28456c.decode_failed && this.state != State.PAUSED) {
            this.state = State.PREVIEW;
            this.cameraManager.requestPreviewFrame(this.decodeThread.getHandler(), C28456c.decode);
        } else if (i10 == C28456c.bug) {
            Bundle data2 = message.getData();
            Throwable th2 = data2 != null ? (Throwable) data2.getSerializable(Constants.EXCEPTION) : null;
            if (th2 == null) {
                th2 = new Throwable("Unknown Error!");
            }
            this.errorHandler.reportUnknownError(th2);
        }
    }

    public void quitSynchronously() {
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