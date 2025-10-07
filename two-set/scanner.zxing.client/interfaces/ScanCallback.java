package com.disney.wdpro.scanner.zxing.client.interfaces;

import android.graphics.Bitmap;
import com.google.zxing.C23765k;

/* loaded from: classes17.dex */
public interface ScanCallback {
    void onScanError(Throwable th2);

    void onScanSuccess(C23765k c23765k, Bitmap bitmap);

    void onScanTimeOut();
}