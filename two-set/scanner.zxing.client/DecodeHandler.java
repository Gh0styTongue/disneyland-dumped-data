package com.disney.wdpro.scanner.zxing.client;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.disney.wdpro.scanner.zxing.client.interfaces.Controller;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import com.google.zxing.C23734b;
import com.google.zxing.C23760f;
import com.google.zxing.C23762h;
import com.google.zxing.C23765k;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ReaderException;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import hr.C28456c;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import kr.C30250l;

@Instrumented
/* loaded from: classes17.dex */
final class DecodeHandler extends Handler {
    private static final String TAG = "DecodeHandler";
    private final Controller captureFragment;
    private int frameIndex;
    private final C23760f multiFormatReader;
    private boolean running = true;
    private final int FRAME_PROCESSING_RATE = 2;

    DecodeHandler(Controller controller, Map<DecodeHintType, Object> map) {
        C23760f c23760f = new C23760f();
        this.multiFormatReader = c23760f;
        c23760f.m75207e(map);
        this.captureFragment = controller;
    }

    private static void bundleThumbnail(C23762h c23762h, Bundle bundle) {
        int[] iArrM75212c = c23762h.m75212c();
        int iM75211b = c23762h.m75211b();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArrM75212c, 0, iM75211b, iM75211b, c23762h.m75210a(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat(DecodeThread.BARCODE_SCALED_FACTOR, iM75211b / c23762h.getWidth());
    }

    private void decode(byte[] bArr, int i10, int i11) {
        C23765k c23765kM75206d;
        Handler handler = this.captureFragment.getHandler();
        if (this.frameIndex != 2) {
            if (handler != null) {
                Message.obtain(handler, C28456c.decode_failed).sendToTarget();
            }
            this.frameIndex++;
            return;
        }
        this.frameIndex = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C23762h c23762hBuildLuminanceSource = this.captureFragment.getCameraManager().buildLuminanceSource(bArr, i10, i11);
            if (c23762hBuildLuminanceSource != null) {
                try {
                    c23765kM75206d = this.multiFormatReader.m75206d(new C23734b(new C30250l(c23762hBuildLuminanceSource)));
                    this.multiFormatReader.reset();
                } catch (ReaderException unused) {
                    this.multiFormatReader.reset();
                } catch (Throwable th2) {
                    this.multiFormatReader.reset();
                    throw th2;
                }
            } else {
                c23765kM75206d = null;
            }
            if (c23765kM75206d == null) {
                if (handler != null) {
                    Message.obtain(handler, C28456c.decode_failed).sendToTarget();
                    return;
                }
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            LogInstrumentation.m79024d(TAG, "Found barcode in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
            if (handler != null) {
                Message messageObtain = Message.obtain(handler, C28456c.decode_succeeded, c23765kM75206d);
                Bundle bundle = new Bundle();
                bundleThumbnail(c23762hBuildLuminanceSource, bundle);
                messageObtain.setData(bundle);
                messageObtain.sendToTarget();
            }
        } catch (Exception e10) {
            LogInstrumentation.m79027e(TAG, "Unknown error! this may be a bug: %s", e10);
            exit(e10);
        }
    }

    private void exit(Throwable th2) {
        Handler handler = this.captureFragment.getHandler();
        if (handler != null) {
            Message messageObtain = Message.obtain(handler, C28456c.bug);
            Bundle bundle = new Bundle();
            bundle.putSerializable(Constants.EXCEPTION, th2);
            messageObtain.setData(bundle);
            messageObtain.sendToTarget();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.running) {
            int i10 = message.what;
            if (i10 == C28456c.decode) {
                decode((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i10 == C28456c.quit) {
                this.running = false;
                Looper.myLooper().quit();
            }
        }
    }
}