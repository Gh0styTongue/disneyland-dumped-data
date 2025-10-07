package com.disney.wdpro.scanner.zxing.client.interfaces;

/* loaded from: classes17.dex */
public interface ErrorHandler {
    void reportCameraHardwareError(Throwable th2);

    void reportTimeOut();

    void reportUnknownError(Throwable th2);
}