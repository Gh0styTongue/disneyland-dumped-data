package com.disney.wdpro.scanner.zxing.client;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.disney.wdpro.scanner.zxing.client.interfaces.Controller;
import com.disney.wdpro.scanner.zxing.client.managers.DecodeFormatManager;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@Instrumented
/* loaded from: classes17.dex */
final class DecodeThread extends Thread {
    public static final String BARCODE_BITMAP = "barcode_bitmap";
    public static final String BARCODE_SCALED_FACTOR = "barcode_scaled_factor";
    private final Controller captureFragment;
    private Handler handler;
    private final CountDownLatch handlerInitLatch = new CountDownLatch(1);
    private final Map<DecodeHintType, Object> hints;

    DecodeThread(Controller controller, Map<DecodeHintType, ?> map) {
        this.captureFragment = controller;
        Bundle arguments = controller.getArguments();
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.hints = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(BarcodeFormat.class);
        if (arguments.getBoolean(Constants.KEY_DECODE_1D_PRODUCT, false)) {
            enumSetNoneOf.addAll(DecodeFormatManager.PRODUCT_FORMATS);
        }
        if (arguments.getBoolean(Constants.KEY_DECODE_1D_INDUSTRIAL, false)) {
            enumSetNoneOf.addAll(DecodeFormatManager.INDUSTRIAL_FORMATS);
        }
        if (arguments.getBoolean(Constants.KEY_DECODE_QR, false)) {
            enumSetNoneOf.addAll(DecodeFormatManager.QR_CODE_FORMATS);
        }
        if (arguments.getBoolean(Constants.KEY_DECODE_DATA_MATRIX, false)) {
            enumSetNoneOf.addAll(DecodeFormatManager.DATA_MATRIX_FORMATS);
        }
        if (arguments.getBoolean(Constants.KEY_DECODE_AZTEC, false)) {
            enumSetNoneOf.addAll(DecodeFormatManager.AZTEC_FORMATS);
        }
        if (arguments.getBoolean(Constants.KEY_DECODE_PDF417, true)) {
            enumSetNoneOf.addAll(DecodeFormatManager.PDF417_FORMATS);
        }
        enumMap.put((EnumMap) DecodeHintType.POSSIBLE_FORMATS, (DecodeHintType) enumSetNoneOf);
        String string = arguments.getString(Constants.KEY_CHARACTER_SET);
        if (string != null) {
            enumMap.put((EnumMap) DecodeHintType.CHARACTER_SET, (DecodeHintType) string);
        }
        LogInstrumentation.m79028i("DecodeThread", "Hints: " + enumMap);
    }

    Handler getHandler() throws InterruptedException {
        try {
            this.handlerInitLatch.await();
        } catch (InterruptedException unused) {
        }
        return this.handler;
    }

    Handler getHandlerForQuiting() {
        return this.handler;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.handler = new DecodeHandler(this.captureFragment, this.hints);
        this.handlerInitLatch.countDown();
        Looper.loop();
    }
}